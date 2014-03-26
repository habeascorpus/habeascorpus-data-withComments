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
rendered	TokenNameIdentifier	 rendered
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
DataBuffer	TokenNameIdentifier	 Data Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
DirectColorModel	TokenNameIdentifier	 Direct Color Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
WritableRaster	TokenNameIdentifier	 Writable Raster
;	TokenNameSEMICOLON	
/** * This class creates a RenderedImage in conformance to the one * defined for the feTurbulence filter of the SVG specification. What * follows is my high-level description of how the noise is generated. * This is not contained in the SVG spec, just the algorithm for * doing it. This is provided in the hope that someone will figure * out a clever way to accelerate parts of the function. * * gradient contains a long list of random unit vectors. For each * point we are to generate noise for we do two things. first we use * the latticeSelector to 'co-mingle' the integer portions of x and y * (this allows us to have a one-dimensional array of gradients that * appears 2 dimensional, by using the co-mingled index). * * We do this for [x,y], [x+1,y], [x,y+1], and [x+1, y+1], this gives * us the four gradient vectors that surround the point (b00, b10, ...) * * Next we construct the four vectors from the grid points (where the * gradient vectors are defined) [these are rx0, rx1, ry0, ry1]. * * We then take the dot product between the gradient vectors and the * grid point vectors (this gives the portion of the grid point vector * that projects along the gradient vector for each grid point). * These four dot projects are then combined with linear interpolation. * The weight factor for the linear combination is the result of applying * the 's' curve function to the fractional part of x and y (rx0, ry0). * The S curve function get's it's name because it looks a bit like as * 'S' from 0->1. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @author <a href="mailto:DeWeese@apache.org">Thomas DeWeese</a> * @version $Id: TurbulencePatternRed.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class creates a RenderedImage in conformance to the one defined for the feTurbulence filter of the SVG specification. What follows is my high-level description of how the noise is generated. This is not contained in the SVG spec, just the algorithm for doing it. This is provided in the hope that someone will figure out a clever way to accelerate parts of the function. * gradient contains a long list of random unit vectors. For each point we are to generate noise for we do two things. first we use the latticeSelector to 'co-mingle' the integer portions of x and y (this allows us to have a one-dimensional array of gradients that appears 2 dimensional, by using the co-mingled index). * We do this for [x,y], [x+1,y], [x,y+1], and [x+1, y+1], this gives us the four gradient vectors that surround the point (b00, b10, ...) * Next we construct the four vectors from the grid points (where the gradient vectors are defined) [these are rx0, rx1, ry0, ry1]. * We then take the dot product between the gradient vectors and the grid point vectors (this gives the portion of the grid point vector that projects along the gradient vector for each grid point). These four dot projects are then combined with linear interpolation. The weight factor for the linear combination is the result of applying the 's' curve function to the fractional part of x and y (rx0, ry0). The S curve function get's it's name because it looks a bit like as 'S' from 0->1. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @author <a href="mailto:DeWeese@apache.org">Thomas DeWeese</a> @version $Id: TurbulencePatternRed.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TurbulencePatternRed	TokenNameIdentifier	 Turbulence Pattern Red
extends	TokenNameextends	
AbstractRed	TokenNameIdentifier	 Abstract Red
{	TokenNameLBRACE	
/** * Inner class to store tile stitching info. * #see */	TokenNameCOMMENT_JAVADOC	 Inner class to store tile stitching info. #see 
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
StitchInfo	TokenNameIdentifier	 Stitch Info
{	TokenNameLBRACE	
/** * Width of the integer lattice tile */	TokenNameCOMMENT_JAVADOC	 Width of the integer lattice tile 
int	TokenNameint	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
/** * Height of the integer lattice tile */	TokenNameCOMMENT_JAVADOC	 Height of the integer lattice tile 
int	TokenNameint	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
/** * Value beyond which values are wrapped on * the x-axis. * @see TurbulencePatternRed#noise2Stitch */	TokenNameCOMMENT_JAVADOC	 Value beyond which values are wrapped on the x-axis. @see TurbulencePatternRed#noise2Stitch 
int	TokenNameint	
wrapX	TokenNameIdentifier	 wrap X
;	TokenNameSEMICOLON	
/** * Value beyond which values are wrapped on * the y-axis. * @see TurbulencePatternRed#noise2Stitch */	TokenNameCOMMENT_JAVADOC	 Value beyond which values are wrapped on the y-axis. @see TurbulencePatternRed#noise2Stitch 
int	TokenNameint	
wrapY	TokenNameIdentifier	 wrap Y
;	TokenNameSEMICOLON	
/** * Default constructor */	TokenNameCOMMENT_JAVADOC	 Default constructor 
StitchInfo	TokenNameIdentifier	 Stitch Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Copy constructor */	TokenNameCOMMENT_JAVADOC	 Copy constructor 
StitchInfo	TokenNameIdentifier	 Stitch Info
(	TokenNameLPAREN	
StitchInfo	TokenNameIdentifier	 Stitch Info
stitchInfo	TokenNameIdentifier	 stitch Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
wrapX	TokenNameIdentifier	 wrap X
=	TokenNameEQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
wrapX	TokenNameIdentifier	 wrap X
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
wrapY	TokenNameIdentifier	 wrap Y
=	TokenNameEQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
wrapY	TokenNameIdentifier	 wrap Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
assign	TokenNameIdentifier	 assign
(	TokenNameLPAREN	
StitchInfo	TokenNameIdentifier	 Stitch Info
stitchInfo	TokenNameIdentifier	 stitch Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
wrapX	TokenNameIdentifier	 wrap X
=	TokenNameEQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
wrapX	TokenNameIdentifier	 wrap X
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
wrapY	TokenNameIdentifier	 wrap Y
=	TokenNameEQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
wrapY	TokenNameIdentifier	 wrap Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Adjustst the StitchInfo for when the frequency has been * doubled. * * width = tileWidth*baseFrequencyX * height = tileHeight*baseFrequencyY * minY = tileY*baseFrequencyY + PerlinN * wrapX = tileX*baseFrequencyX + PerlinN + width * wrapY = tileY*baseFrequencyY + PerlinN + height * */	TokenNameCOMMENT_BLOCK	 Adjustst the StitchInfo for when the frequency has been doubled. * width = tileWidth*baseFrequencyX height = tileHeight*baseFrequencyY minY = tileY*baseFrequencyY + PerlinN wrapX = tileX*baseFrequencyX + PerlinN + width wrapY = tileY*baseFrequencyY + PerlinN + height 
final	TokenNamefinal	
void	TokenNamevoid	
doubleFrequency	TokenNameIdentifier	 double Frequency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
width	TokenNameIdentifier	 width
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
height	TokenNameIdentifier	 height
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
wrapX	TokenNameIdentifier	 wrap X
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
wrapY	TokenNameIdentifier	 wrap Y
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
wrapX	TokenNameIdentifier	 wrap X
-=	TokenNameMINUS_EQUAL	
PerlinN	TokenNameIdentifier	 Perlin N
;	TokenNameSEMICOLON	
wrapY	TokenNameIdentifier	 wrap Y
-=	TokenNameMINUS_EQUAL	
PerlinN	TokenNameIdentifier	 Perlin N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Used when stitching is on */	TokenNameCOMMENT_JAVADOC	 Used when stitching is on 
private	TokenNameprivate	
StitchInfo	TokenNameIdentifier	 Stitch Info
stitchInfo	TokenNameIdentifier	 stitch Info
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Identity transform, default used when null input in the constructor. */	TokenNameCOMMENT_JAVADOC	 Identity transform, default used when null input in the constructor. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
AffineTransform	TokenNameIdentifier	 Affine Transform
IDENTITY	TokenNameIdentifier	 IDENTITY
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * x-axis base frequency for the noise function along the x-axis */	TokenNameCOMMENT_JAVADOC	 x-axis base frequency for the noise function along the x-axis 
private	TokenNameprivate	
double	TokenNamedouble	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
;	TokenNameSEMICOLON	
/** * y-axis base frequency for the noise function along the y-axis */	TokenNameCOMMENT_JAVADOC	 y-axis base frequency for the noise function along the y-axis 
private	TokenNameprivate	
double	TokenNamedouble	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
;	TokenNameSEMICOLON	
/** * Number of octaves in the noise function */	TokenNameCOMMENT_JAVADOC	 Number of octaves in the noise function 
private	TokenNameprivate	
int	TokenNameint	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
/** * Starting number for the pseudo random number generator */	TokenNameCOMMENT_JAVADOC	 Starting number for the pseudo random number generator 
private	TokenNameprivate	
int	TokenNameint	
seed	TokenNameIdentifier	 seed
;	TokenNameSEMICOLON	
/** * Defines the tile for the turbulence function, if non-null turns * on stitching, so frequencies are adjusted to avoid * discontinuities in case frequencies do not match tile * boundaries. */	TokenNameCOMMENT_JAVADOC	 Defines the tile for the turbulence function, if non-null turns on stitching, so frequencies are adjusted to avoid discontinuities in case frequencies do not match tile boundaries. 
private	TokenNameprivate	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
tile	TokenNameIdentifier	 tile
;	TokenNameSEMICOLON	
/** * Defines the tile for the turbulence function */	TokenNameCOMMENT_JAVADOC	 Defines the tile for the turbulence function 
private	TokenNameprivate	
AffineTransform	TokenNameIdentifier	 Affine Transform
txf	TokenNameIdentifier	 txf
;	TokenNameSEMICOLON	
/** * Defines whether the filter performs a fractal noise or a turbulence function */	TokenNameCOMMENT_JAVADOC	 Defines whether the filter performs a fractal noise or a turbulence function 
private	TokenNameprivate	
boolean	TokenNameboolean	
isFractalNoise	TokenNameIdentifier	 is Fractal Noise
;	TokenNameSEMICOLON	
/** * List of channels that the generator produces. */	TokenNameCOMMENT_JAVADOC	 List of channels that the generator produces. 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
channels	TokenNameIdentifier	 channels
;	TokenNameSEMICOLON	
// To avoid doing an inverse transform on each pixel, transform 	TokenNameCOMMENT_LINE	To avoid doing an inverse transform on each pixel, transform 
// the image space unit vectors and process how much of a delta 	TokenNameCOMMENT_LINE	the image space unit vectors and process how much of a delta 
// this is in filter space. 	TokenNameCOMMENT_LINE	this is in filter space. 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tx	TokenNameIdentifier	 tx
=	TokenNameEQUAL	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ty	TokenNameIdentifier	 ty
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Produces results in the range [1, 2**31 - 2]. * Algorithm is: r = (a * r) mod m * where a = 16807 and m = 2**31 - 1 = 2147483647 * See [Park & Miller], CACM vol. 31 no. 10 p. 1195, Oct. 1988 * To test: the algorithm should produce the result 1043618065 * as the 10,000th generated number if the original seed is 1. */	TokenNameCOMMENT_JAVADOC	 Produces results in the range [1, 2**31 - 2]. Algorithm is: r = (a r) mod m where a = 16807 and m = 2**31 - 1 = 2147483647 See [Park & Miller], CACM vol. 31 no. 10 p. 1195, Oct. 1988 To test: the algorithm should produce the result 1043618065 as the 10,000th generated number if the original seed is 1. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RAND_m	TokenNameIdentifier	 RAND m
=	TokenNameEQUAL	
2147483647	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* 2**31 - 1 */	TokenNameCOMMENT_BLOCK	 2**31 - 1 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RAND_a	TokenNameIdentifier	 RAND a
=	TokenNameEQUAL	
16807	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* 7**5; primitive root of m */	TokenNameCOMMENT_BLOCK	 7**5; primitive root of m 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RAND_q	TokenNameIdentifier	 RAND q
=	TokenNameEQUAL	
127773	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* m / a */	TokenNameCOMMENT_BLOCK	 m / a 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RAND_r	TokenNameIdentifier	 RAND r
=	TokenNameEQUAL	
2836	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* m % a */	TokenNameCOMMENT_BLOCK	 m % a 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BSize	TokenNameIdentifier	 B Size
=	TokenNameEQUAL	
0x100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BM	TokenNameIdentifier	 BM
=	TokenNameEQUAL	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
PerlinN	TokenNameIdentifier	 Perlin N
=	TokenNameEQUAL	
0x1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
latticeSelector	TokenNameIdentifier	 lattice Selector
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
BSize	TokenNameIdentifier	 B Size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
gradient	TokenNameIdentifier	 gradient
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
BSize	TokenNameIdentifier	 B Size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
double	TokenNamedouble	
getBaseFrequencyX	TokenNameIdentifier	 get Base Frequency X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getBaseFrequencyY	TokenNameIdentifier	 get Base Frequency Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
)	TokenNameRPAREN	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isFractalNoise	TokenNameIdentifier	 is Fractal Noise
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isFractalNoise	TokenNameIdentifier	 is Fractal Noise
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getChannels	TokenNameIdentifier	 get Channels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
channels	TokenNameIdentifier	 channels
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
this	TokenNamethis	
.	TokenNameDOT	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
channels	TokenNameIdentifier	 channels
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
channels	TokenNameIdentifier	 channels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
channels	TokenNameIdentifier	 channels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
setupSeed	TokenNameIdentifier	 setup Seed
(	TokenNameLPAREN	
int	TokenNameint	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
seed	TokenNameIdentifier	 seed
=	TokenNameEQUAL	
-	TokenNameMINUS	
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
%	TokenNameREMAINDER	
(	TokenNameLPAREN	
RAND_m	TokenNameIdentifier	 RAND m
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
>	TokenNameGREATER	
RAND_m	TokenNameIdentifier	 RAND m
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
seed	TokenNameIdentifier	 seed
=	TokenNameEQUAL	
RAND_m	TokenNameIdentifier	 RAND m
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
seed	TokenNameIdentifier	 seed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
int	TokenNameint	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
RAND_a	TokenNameIdentifier	 RAND a
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
%	TokenNameREMAINDER	
RAND_q	TokenNameIdentifier	 RAND q
)	TokenNameRPAREN	
-	TokenNameMINUS	
RAND_r	TokenNameIdentifier	 RAND r
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
/	TokenNameDIVIDE	
RAND_q	TokenNameIdentifier	 RAND q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
+=	TokenNamePLUS_EQUAL	
RAND_m	TokenNameIdentifier	 RAND m
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
initLattice	TokenNameIdentifier	 init Lattice
(	TokenNameLPAREN	
int	TokenNameint	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
u	TokenNameIdentifier	 u
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
;	TokenNameSEMICOLON	
seed	TokenNameIdentifier	 seed
=	TokenNameEQUAL	
setupSeed	TokenNameIdentifier	 setup Seed
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
BSize	TokenNameIdentifier	 B Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
(	TokenNameLPAREN	
BSize	TokenNameIdentifier	 B Size
+	TokenNamePLUS	
BSize	TokenNameIdentifier	 B Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
BSize	TokenNameIdentifier	 B Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
(	TokenNameLPAREN	
BSize	TokenNameIdentifier	 B Size
+	TokenNamePLUS	
BSize	TokenNameIdentifier	 B Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
BSize	TokenNameIdentifier	 B Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
*	TokenNameMULTIPLY	
u	TokenNameIdentifier	 u
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
k	TokenNameIdentifier	 k
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
k	TokenNameIdentifier	 k
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
BSize	TokenNameIdentifier	 B Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
latticeSelector	TokenNameIdentifier	 lattice Selector
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
latticeSelector	TokenNameIdentifier	 lattice Selector
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
BSize	TokenNameIdentifier	 B Size
;	TokenNameSEMICOLON	
latticeSelector	TokenNameIdentifier	 lattice Selector
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
latticeSelector	TokenNameIdentifier	 lattice Selector
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
latticeSelector	TokenNameIdentifier	 lattice Selector
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
// Now we apply the lattice to the gradient array, this 	TokenNameCOMMENT_LINE	Now we apply the lattice to the gradient array, this 
// lets us avoid one of the lattice lookups. 	TokenNameCOMMENT_LINE	lets us avoid one of the lattice lookups. 
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
s1	TokenNameIdentifier	 s1
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
s1	TokenNameIdentifier	 s1
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
s2	TokenNameIdentifier	 s2
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
s2	TokenNameIdentifier	 s2
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
latticeSelector	TokenNameIdentifier	 lattice Selector
[	TokenNameLBRACKET	
BSize	TokenNameIdentifier	 B Size
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
latticeSelector	TokenNameIdentifier	 lattice Selector
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
BSize	TokenNameIdentifier	 B Size
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
s_curve	TokenNameIdentifier	 s curve
(	TokenNameLPAREN	
final	TokenNamefinal	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
double	TokenNamedouble	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
double	TokenNamedouble	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
-	TokenNameMINUS	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Generate a pixel of noise corresponding to the point vec0,vec1. * See class description for a high level discussion of method. * This handles cases where channels <= 4. * @param noise The place to put the generated noise. * @param vec0 The X coordiate to generate noise for * @param vec1 The Y coordiate to generate noise for */	TokenNameCOMMENT_JAVADOC	 Generate a pixel of noise corresponding to the point vec0,vec1. See class description for a high level discussion of method. This handles cases where channels <= 4. @param noise The place to put the generated noise. @param vec0 The X coordiate to generate noise for @param vec1 The Y coordiate to generate noise for 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
noise2	TokenNameIdentifier	 noise2
(	TokenNameLPAREN	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
double	TokenNamedouble	
vec0	TokenNameIdentifier	 vec0
,	TokenNameCOMMA	
double	TokenNamedouble	
vec1	TokenNameIdentifier	 vec1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
b0	TokenNameIdentifier	 b0
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
rx0	TokenNameIdentifier	 rx0
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
,	TokenNameCOMMA	
ry0	TokenNameIdentifier	 ry0
,	TokenNameCOMMA	
ry1	TokenNameIdentifier	 ry1
,	TokenNameCOMMA	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
sy	TokenNameIdentifier	 sy
;	TokenNameSEMICOLON	
vec0	TokenNameIdentifier	 vec0
+=	TokenNamePLUS_EQUAL	
PerlinN	TokenNameIdentifier	 Perlin N
;	TokenNameSEMICOLON	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
vec0	TokenNameIdentifier	 vec0
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
latticeSelector	TokenNameIdentifier	 lattice Selector
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
latticeSelector	TokenNameIdentifier	 lattice Selector
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
rx0	TokenNameIdentifier	 rx0
=	TokenNameEQUAL	
vec0	TokenNameIdentifier	 vec0
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
vec0	TokenNameIdentifier	 vec0
;	TokenNameSEMICOLON	
rx1	TokenNameIdentifier	 rx1
=	TokenNameEQUAL	
rx0	TokenNameIdentifier	 rx0
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
sx	TokenNameIdentifier	 sx
=	TokenNameEQUAL	
s_curve	TokenNameIdentifier	 s curve
(	TokenNameLPAREN	
rx0	TokenNameIdentifier	 rx0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vec1	TokenNameIdentifier	 vec1
+=	TokenNamePLUS_EQUAL	
PerlinN	TokenNameIdentifier	 Perlin N
;	TokenNameSEMICOLON	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
vec1	TokenNameIdentifier	 vec1
;	TokenNameSEMICOLON	
// The gradient array already has the latticeSelector applied 	TokenNameCOMMENT_LINE	The gradient array already has the latticeSelector applied 
// to it, So we can avoid doing the last lookup. 	TokenNameCOMMENT_LINE	to it, So we can avoid doing the last lookup. 
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ry0	TokenNameIdentifier	 ry0
=	TokenNameEQUAL	
vec1	TokenNameIdentifier	 vec1
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
vec1	TokenNameIdentifier	 vec1
;	TokenNameSEMICOLON	
ry1	TokenNameIdentifier	 ry1
=	TokenNameEQUAL	
ry0	TokenNameIdentifier	 ry0
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
sy	TokenNameIdentifier	 sy
=	TokenNameEQUAL	
s_curve	TokenNameIdentifier	 s curve
(	TokenNameLPAREN	
ry0	TokenNameIdentifier	 ry0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Intentionally use 'fall through' in switch statement. 	TokenNameCOMMENT_LINE	Intentionally use 'fall through' in switch statement. 
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This version of the noise function implements stitching. * If any of the lattice is on the right or bottom edge, the * function uses the the latice on the other side of the * tile, i.e., the left or right edge. * @param noise The place to put the generated noise. * @param vec0 The X coordiate to generate noise for * @param vec1 The Y coordiate to generate noise for * @param stitchInfo The stitching information for the noise function. */	TokenNameCOMMENT_JAVADOC	 This version of the noise function implements stitching. If any of the lattice is on the right or bottom edge, the function uses the the latice on the other side of the tile, i.e., the left or right edge. @param noise The place to put the generated noise. @param vec0 The X coordiate to generate noise for @param vec1 The Y coordiate to generate noise for @param stitchInfo The stitching information for the noise function. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
noise2Stitch	TokenNameIdentifier	 noise2 Stitch
(	TokenNameLPAREN	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
vec0	TokenNameIdentifier	 vec0
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
vec1	TokenNameIdentifier	 vec1
,	TokenNameCOMMA	
final	TokenNamefinal	
StitchInfo	TokenNameIdentifier	 Stitch Info
stitchInfo	TokenNameIdentifier	 stitch Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
b0	TokenNameIdentifier	 b0
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
b00	TokenNameIdentifier	 b00
,	TokenNameCOMMA	
b10	TokenNameIdentifier	 b10
,	TokenNameCOMMA	
b01	TokenNameIdentifier	 b01
,	TokenNameCOMMA	
b11	TokenNameIdentifier	 b11
;	TokenNameSEMICOLON	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
rx0	TokenNameIdentifier	 rx0
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
,	TokenNameCOMMA	
ry0	TokenNameIdentifier	 ry0
,	TokenNameCOMMA	
ry1	TokenNameIdentifier	 ry1
,	TokenNameCOMMA	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
sy	TokenNameIdentifier	 sy
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
vec0	TokenNameIdentifier	 vec0
+	TokenNamePLUS	
PerlinN	TokenNameIdentifier	 Perlin N
;	TokenNameSEMICOLON	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Stitch lattice tile x coordinates 	TokenNameCOMMENT_LINE	Stitch lattice tile x coordinates 
if	TokenNameif	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
>=	TokenNameGREATER_EQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
wrapX	TokenNameIdentifier	 wrap X
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
>=	TokenNameGREATER_EQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
wrapX	TokenNameIdentifier	 wrap X
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b0	TokenNameIdentifier	 b0
-=	TokenNameMINUS_EQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
-=	TokenNameMINUS_EQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
b1	TokenNameIdentifier	 b1
-=	TokenNameMINUS_EQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
latticeSelector	TokenNameIdentifier	 lattice Selector
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
latticeSelector	TokenNameIdentifier	 lattice Selector
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
rx0	TokenNameIdentifier	 rx0
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
rx1	TokenNameIdentifier	 rx1
=	TokenNameEQUAL	
rx0	TokenNameIdentifier	 rx0
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
sx	TokenNameIdentifier	 sx
=	TokenNameEQUAL	
s_curve	TokenNameIdentifier	 s curve
(	TokenNameLPAREN	
rx0	TokenNameIdentifier	 rx0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
vec1	TokenNameIdentifier	 vec1
+	TokenNamePLUS	
PerlinN	TokenNameIdentifier	 Perlin N
;	TokenNameSEMICOLON	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Stitch lattice tile y coordinates 	TokenNameCOMMENT_LINE	Stitch lattice tile y coordinates 
if	TokenNameif	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
>=	TokenNameGREATER_EQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
wrapY	TokenNameIdentifier	 wrap Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
>=	TokenNameGREATER_EQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
wrapY	TokenNameIdentifier	 wrap Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b0	TokenNameIdentifier	 b0
-=	TokenNameMINUS_EQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
-=	TokenNameMINUS_EQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
b1	TokenNameIdentifier	 b1
-=	TokenNameMINUS_EQUAL	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// In this case we still need to keep all four indexes since 	TokenNameCOMMENT_LINE	In this case we still need to keep all four indexes since 
// we may have split y across the stitch boundry, in which 	TokenNameCOMMENT_LINE	we may have split y across the stitch boundry, in which 
// case b0 and b1 do not have a fixed offset from one another. 	TokenNameCOMMENT_LINE	case b0 and b1 do not have a fixed offset from one another. 
// We still avoid a latticeSelector lookup for each index though... 	TokenNameCOMMENT_LINE	We still avoid a latticeSelector lookup for each index though... 
b00	TokenNameIdentifier	 b00
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
b10	TokenNameIdentifier	 b10
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
b01	TokenNameIdentifier	 b01
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
b11	TokenNameIdentifier	 b11
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ry0	TokenNameIdentifier	 ry0
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
ry1	TokenNameIdentifier	 ry1
=	TokenNameEQUAL	
ry0	TokenNameIdentifier	 ry0
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
sy	TokenNameIdentifier	 sy
=	TokenNameEQUAL	
s_curve	TokenNameIdentifier	 s curve
(	TokenNameLPAREN	
ry0	TokenNameIdentifier	 ry0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Intentionally use 'fall through' in switch statement. 	TokenNameCOMMENT_LINE	Intentionally use 'fall through' in switch statement. 
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b00	TokenNameIdentifier	 b00
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b00	TokenNameIdentifier	 b00
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b10	TokenNameIdentifier	 b10
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b10	TokenNameIdentifier	 b10
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b01	TokenNameIdentifier	 b01
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b01	TokenNameIdentifier	 b01
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b11	TokenNameIdentifier	 b11
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b11	TokenNameIdentifier	 b11
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b00	TokenNameIdentifier	 b00
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b00	TokenNameIdentifier	 b00
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b10	TokenNameIdentifier	 b10
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b10	TokenNameIdentifier	 b10
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b01	TokenNameIdentifier	 b01
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b01	TokenNameIdentifier	 b01
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b11	TokenNameIdentifier	 b11
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b11	TokenNameIdentifier	 b11
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b00	TokenNameIdentifier	 b00
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b00	TokenNameIdentifier	 b00
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b10	TokenNameIdentifier	 b10
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b10	TokenNameIdentifier	 b10
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b01	TokenNameIdentifier	 b01
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b01	TokenNameIdentifier	 b01
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b11	TokenNameIdentifier	 b11
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b11	TokenNameIdentifier	 b11
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b00	TokenNameIdentifier	 b00
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b00	TokenNameIdentifier	 b00
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b10	TokenNameIdentifier	 b10
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b10	TokenNameIdentifier	 b10
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b01	TokenNameIdentifier	 b01
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b01	TokenNameIdentifier	 b01
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b11	TokenNameIdentifier	 b11
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b11	TokenNameIdentifier	 b11
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This is the heart of the turbulence calculation. It returns * 'turbFunctionResult', as defined in the spec. This is * special case for 4 bands of output. * * @param pointX x coordinate of the point to process. * @param pointY y coordinate of the point to process. * @param fSum array used to avoid reallocating double array for each pixel * @return The ARGB pixel value. */	TokenNameCOMMENT_JAVADOC	 This is the heart of the turbulence calculation. It returns 'turbFunctionResult', as defined in the spec. This is special case for 4 bands of output. * @param pointX x coordinate of the point to process. @param pointY y coordinate of the point to process. @param fSum array used to avoid reallocating double array for each pixel @return The ARGB pixel value. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
turbulence_4	TokenNameIdentifier	 turbulence 4
(	TokenNameLPAREN	
double	TokenNamedouble	
pointX	TokenNameIdentifier	 point X
,	TokenNameCOMMA	
double	TokenNamedouble	
pointY	TokenNameIdentifier	 point Y
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fSum	TokenNameIdentifier	 f Sum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
ratio	TokenNameIdentifier	 ratio
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
b0	TokenNameIdentifier	 b0
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
,	TokenNameCOMMA	
nOctave	TokenNameIdentifier	 n Octave
;	TokenNameSEMICOLON	
double	TokenNamedouble	
px	TokenNameIdentifier	 px
,	TokenNameCOMMA	
py	TokenNameIdentifier	 py
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
,	TokenNameCOMMA	
ry0	TokenNameIdentifier	 ry0
,	TokenNameCOMMA	
ry1	TokenNameIdentifier	 ry1
,	TokenNameCOMMA	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
sy	TokenNameIdentifier	 sy
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
;	TokenNameSEMICOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
nOctave	TokenNameIdentifier	 n Octave
=	TokenNameEQUAL	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
px	TokenNameIdentifier	 px
=	TokenNameEQUAL	
pointX	TokenNameIdentifier	 point X
+	TokenNamePLUS	
PerlinN	TokenNameIdentifier	 Perlin N
;	TokenNameSEMICOLON	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
px	TokenNameIdentifier	 px
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
latticeSelector	TokenNameIdentifier	 lattice Selector
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
latticeSelector	TokenNameIdentifier	 lattice Selector
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
rx0	TokenNameIdentifier	 rx0
=	TokenNameEQUAL	
px	TokenNameIdentifier	 px
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
px	TokenNameIdentifier	 px
;	TokenNameSEMICOLON	
rx1	TokenNameIdentifier	 rx1
=	TokenNameEQUAL	
rx0	TokenNameIdentifier	 rx0
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
sx	TokenNameIdentifier	 sx
=	TokenNameEQUAL	
s_curve	TokenNameIdentifier	 s curve
(	TokenNameLPAREN	
rx0	TokenNameIdentifier	 rx0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
py	TokenNameIdentifier	 py
=	TokenNameEQUAL	
pointY	TokenNameIdentifier	 point Y
+	TokenNamePLUS	
PerlinN	TokenNameIdentifier	 Perlin N
;	TokenNameSEMICOLON	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
py	TokenNameIdentifier	 py
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ry0	TokenNameIdentifier	 ry0
=	TokenNameEQUAL	
py	TokenNameIdentifier	 py
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
py	TokenNameIdentifier	 py
;	TokenNameSEMICOLON	
ry1	TokenNameIdentifier	 ry1
=	TokenNameEQUAL	
ry0	TokenNameIdentifier	 ry0
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
sy	TokenNameIdentifier	 sy
=	TokenNameEQUAL	
s_curve	TokenNameIdentifier	 s curve
(	TokenNameLPAREN	
ry0	TokenNameIdentifier	 ry0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ratio	TokenNameIdentifier	 ratio
*=	TokenNameMULTIPLY_EQUAL	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0xFF0000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
|=	TokenNameOR_EQUAL	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
j	TokenNameIdentifier	 j
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
|=	TokenNameOR_EQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
else	TokenNameelse	
j	TokenNameIdentifier	 j
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
|=	TokenNameOR_EQUAL	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
j	TokenNameIdentifier	 j
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0xFF000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is the heart of the turbulence calculation. It returns * 'turbFunctionResult', as defined in the spec. * @param rgb array for the four color components * @param pointX x coordinate of the point to process. * @param pointY y coordinate of the point to process. * @param fSum array used to avoid reallocating double array for each pixel * @param noise array used to avoid reallocating double array for * each pixel */	TokenNameCOMMENT_JAVADOC	 This is the heart of the turbulence calculation. It returns 'turbFunctionResult', as defined in the spec. @param rgb array for the four color components @param pointX x coordinate of the point to process. @param pointY y coordinate of the point to process. @param fSum array used to avoid reallocating double array for each pixel @param noise array used to avoid reallocating double array for each pixel 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
turbulence	TokenNameIdentifier	 turbulence
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rgb	TokenNameIdentifier	 rgb
,	TokenNameCOMMA	
double	TokenNamedouble	
pointX	TokenNameIdentifier	 point X
,	TokenNameCOMMA	
double	TokenNamedouble	
pointY	TokenNameIdentifier	 point Y
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fSum	TokenNameIdentifier	 f Sum
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
noise	TokenNameIdentifier	 noise
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
ratio	TokenNameIdentifier	 ratio
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
nOctave	TokenNameIdentifier	 n Octave
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
<	TokenNameLESS	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noise2	TokenNameIdentifier	 noise2
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
pointX	TokenNameIdentifier	 point X
,	TokenNameCOMMA	
pointY	TokenNameIdentifier	 point Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ratio	TokenNameIdentifier	 ratio
*=	TokenNameMULTIPLY_EQUAL	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
nOctave	TokenNameIdentifier	 n Octave
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
<	TokenNameLESS	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noise2	TokenNameIdentifier	 noise2
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
pointX	TokenNameIdentifier	 point X
,	TokenNameCOMMA	
pointY	TokenNameIdentifier	 point Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ratio	TokenNameIdentifier	 ratio
*=	TokenNameMULTIPLY_EQUAL	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
nOctave	TokenNameIdentifier	 n Octave
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
<	TokenNameLESS	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noise2	TokenNameIdentifier	 noise2
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
pointX	TokenNameIdentifier	 point X
,	TokenNameCOMMA	
pointY	TokenNameIdentifier	 point Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ratio	TokenNameIdentifier	 ratio
*=	TokenNameMULTIPLY_EQUAL	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
nOctave	TokenNameIdentifier	 n Octave
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
<	TokenNameLESS	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noise2	TokenNameIdentifier	 noise2
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
pointX	TokenNameIdentifier	 point X
,	TokenNameCOMMA	
pointY	TokenNameIdentifier	 point Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ratio	TokenNameIdentifier	 ratio
*=	TokenNameMULTIPLY_EQUAL	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This is the heart of the turbulence calculation. It returns * 'turbFunctionResult', as defined in the spec. * @param rgb array for the four color components * @param pointX x coordinate of the point to process. * @param pointY y coordinate of the point to process. * @param fSum array used to avoid reallocating double array for each pixel * @param noise array used to avoid reallocating double array for * each pixel * @param stitchInfo The stitching information for the noise function */	TokenNameCOMMENT_JAVADOC	 This is the heart of the turbulence calculation. It returns 'turbFunctionResult', as defined in the spec. @param rgb array for the four color components @param pointX x coordinate of the point to process. @param pointY y coordinate of the point to process. @param fSum array used to avoid reallocating double array for each pixel @param noise array used to avoid reallocating double array for each pixel @param stitchInfo The stitching information for the noise function 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
turbulenceStitch	TokenNameIdentifier	 turbulence Stitch
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rgb	TokenNameIdentifier	 rgb
,	TokenNameCOMMA	
double	TokenNamedouble	
pointX	TokenNameIdentifier	 point X
,	TokenNameCOMMA	
double	TokenNamedouble	
pointY	TokenNameIdentifier	 point Y
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fSum	TokenNameIdentifier	 f Sum
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
StitchInfo	TokenNameIdentifier	 Stitch Info
stitchInfo	TokenNameIdentifier	 stitch Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
ratio	TokenNameIdentifier	 ratio
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
;	TokenNameSEMICOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
nOctave	TokenNameIdentifier	 n Octave
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
<	TokenNameLESS	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noise2Stitch	TokenNameIdentifier	 noise2 Stitch
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
pointX	TokenNameIdentifier	 point X
,	TokenNameCOMMA	
pointY	TokenNameIdentifier	 point Y
,	TokenNameCOMMA	
stitchInfo	TokenNameIdentifier	 stitch Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ratio	TokenNameIdentifier	 ratio
*=	TokenNameMULTIPLY_EQUAL	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
doubleFrequency	TokenNameIdentifier	 double Frequency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
nOctave	TokenNameIdentifier	 n Octave
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
<	TokenNameLESS	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noise2Stitch	TokenNameIdentifier	 noise2 Stitch
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
pointX	TokenNameIdentifier	 point X
,	TokenNameCOMMA	
pointY	TokenNameIdentifier	 point Y
,	TokenNameCOMMA	
stitchInfo	TokenNameIdentifier	 stitch Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ratio	TokenNameIdentifier	 ratio
*=	TokenNameMULTIPLY_EQUAL	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
doubleFrequency	TokenNameIdentifier	 double Frequency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
nOctave	TokenNameIdentifier	 n Octave
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
<	TokenNameLESS	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noise2Stitch	TokenNameIdentifier	 noise2 Stitch
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
pointX	TokenNameIdentifier	 point X
,	TokenNameCOMMA	
pointY	TokenNameIdentifier	 point Y
,	TokenNameCOMMA	
stitchInfo	TokenNameIdentifier	 stitch Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ratio	TokenNameIdentifier	 ratio
*=	TokenNameMULTIPLY_EQUAL	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
doubleFrequency	TokenNameIdentifier	 double Frequency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
nOctave	TokenNameIdentifier	 n Octave
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
<	TokenNameLESS	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noise2Stitch	TokenNameIdentifier	 noise2 Stitch
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
pointX	TokenNameIdentifier	 point X
,	TokenNameCOMMA	
pointY	TokenNameIdentifier	 point Y
,	TokenNameCOMMA	
stitchInfo	TokenNameIdentifier	 stitch Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ratio	TokenNameIdentifier	 ratio
*=	TokenNameMULTIPLY_EQUAL	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
doubleFrequency	TokenNameIdentifier	 double Frequency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This is the heart of the turbulence calculation. It returns * 'turbFunctionResult', as defined in the spec. This handles the * case where we are generating 4 channels of noise. * @param pointX x coordinate of the point to process. * @param pointY y coordinate of the point to process. * @param fSum array used to avoid reallocating double array for each pixel * @return The ARGB pixel */	TokenNameCOMMENT_JAVADOC	 This is the heart of the turbulence calculation. It returns 'turbFunctionResult', as defined in the spec. This handles the case where we are generating 4 channels of noise. @param pointX x coordinate of the point to process. @param pointY y coordinate of the point to process. @param fSum array used to avoid reallocating double array for each pixel @return The ARGB pixel 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
turbulenceFractal_4	TokenNameIdentifier	 turbulence Fractal 4
(	TokenNameLPAREN	
double	TokenNamedouble	
pointX	TokenNameIdentifier	 point X
,	TokenNameCOMMA	
double	TokenNamedouble	
pointY	TokenNameIdentifier	 point Y
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fSum	TokenNameIdentifier	 f Sum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
b0	TokenNameIdentifier	 b0
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
,	TokenNameCOMMA	
nOctave	TokenNameIdentifier	 n Octave
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
double	TokenNamedouble	
px	TokenNameIdentifier	 px
,	TokenNameCOMMA	
py	TokenNameIdentifier	 py
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
,	TokenNameCOMMA	
ry0	TokenNameIdentifier	 ry0
,	TokenNameCOMMA	
ry1	TokenNameIdentifier	 ry1
,	TokenNameCOMMA	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
ratio	TokenNameIdentifier	 ratio
=	TokenNameEQUAL	
127.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
;	TokenNameSEMICOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
127.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
nOctave	TokenNameIdentifier	 n Octave
=	TokenNameEQUAL	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
px	TokenNameIdentifier	 px
=	TokenNameEQUAL	
pointX	TokenNameIdentifier	 point X
+	TokenNamePLUS	
PerlinN	TokenNameIdentifier	 Perlin N
;	TokenNameSEMICOLON	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
px	TokenNameIdentifier	 px
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
latticeSelector	TokenNameIdentifier	 lattice Selector
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
latticeSelector	TokenNameIdentifier	 lattice Selector
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
rx0	TokenNameIdentifier	 rx0
=	TokenNameEQUAL	
px	TokenNameIdentifier	 px
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
px	TokenNameIdentifier	 px
;	TokenNameSEMICOLON	
rx1	TokenNameIdentifier	 rx1
=	TokenNameEQUAL	
rx0	TokenNameIdentifier	 rx0
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
sx	TokenNameIdentifier	 sx
=	TokenNameEQUAL	
s_curve	TokenNameIdentifier	 s curve
(	TokenNameLPAREN	
rx0	TokenNameIdentifier	 rx0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
py	TokenNameIdentifier	 py
=	TokenNameEQUAL	
pointY	TokenNameIdentifier	 point Y
+	TokenNamePLUS	
PerlinN	TokenNameIdentifier	 Perlin N
;	TokenNameSEMICOLON	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
py	TokenNameIdentifier	 py
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
&	TokenNameAND	
BM	TokenNameIdentifier	 BM
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ry0	TokenNameIdentifier	 ry0
=	TokenNameEQUAL	
py	TokenNameIdentifier	 py
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
py	TokenNameIdentifier	 py
;	TokenNameSEMICOLON	
ry1	TokenNameIdentifier	 ry1
=	TokenNameEQUAL	
ry0	TokenNameIdentifier	 ry0
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
sy	TokenNameIdentifier	 sy
=	TokenNameEQUAL	
s_curve	TokenNameIdentifier	 s curve
(	TokenNameLPAREN	
ry0	TokenNameIdentifier	 ry0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
;	TokenNameSEMICOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
;	TokenNameSEMICOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
;	TokenNameSEMICOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry0	TokenNameIdentifier	 ry0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lerp	TokenNameIdentifier	 lerp
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
rx0	TokenNameIdentifier	 rx0
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b0	TokenNameIdentifier	 b0
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ry1	TokenNameIdentifier	 ry1
*	TokenNameMULTIPLY	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
;	TokenNameSEMICOLON	
ratio	TokenNameIdentifier	 ratio
*=	TokenNameMULTIPLY_EQUAL	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0xFF0000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
|=	TokenNameOR_EQUAL	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
j	TokenNameIdentifier	 j
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
|=	TokenNameOR_EQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
else	TokenNameelse	
j	TokenNameIdentifier	 j
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
|=	TokenNameOR_EQUAL	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
j	TokenNameIdentifier	 j
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0xFF000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is the heart of the turbulence calculation. It returns * 'turbFunctionResult', as defined in the spec. * @param rgb array for the four color components * @param pointX x coordinate of the point to process. * @param pointY y coordinate of the point to process. * @param fSum array used to avoid reallocating double array for each pixel * @param noise array used to avoid reallocating double array for * each pixel */	TokenNameCOMMENT_JAVADOC	 This is the heart of the turbulence calculation. It returns 'turbFunctionResult', as defined in the spec. @param rgb array for the four color components @param pointX x coordinate of the point to process. @param pointY y coordinate of the point to process. @param fSum array used to avoid reallocating double array for each pixel @param noise array used to avoid reallocating double array for each pixel 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
turbulenceFractal	TokenNameIdentifier	 turbulence Fractal
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rgb	TokenNameIdentifier	 rgb
,	TokenNameCOMMA	
double	TokenNamedouble	
pointX	TokenNameIdentifier	 point X
,	TokenNameCOMMA	
double	TokenNamedouble	
pointY	TokenNameIdentifier	 point Y
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fSum	TokenNameIdentifier	 f Sum
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
noise	TokenNameIdentifier	 noise
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
ratio	TokenNameIdentifier	 ratio
=	TokenNameEQUAL	
127.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
nOctave	TokenNameIdentifier	 n Octave
;	TokenNameSEMICOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
127.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
nOctave	TokenNameIdentifier	 n Octave
=	TokenNameEQUAL	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noise2	TokenNameIdentifier	 noise2
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
pointX	TokenNameIdentifier	 point X
,	TokenNameCOMMA	
pointY	TokenNameIdentifier	 point Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ratio	TokenNameIdentifier	 ratio
*=	TokenNameMULTIPLY_EQUAL	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This is the heart of the turbulence calculation. It returns * 'turbFunctionResult', as defined in the spec. * @param rgb array for the four color components * @param pointX x coordinate of the point to process. * @param pointY y coordinate of the point to process. * @param fSum array used to avoid reallocating double array for each pixel * @param noise array used to avoid reallocating double array for * each pixel * @param stitchInfo The stitching information for the noise function */	TokenNameCOMMENT_JAVADOC	 This is the heart of the turbulence calculation. It returns 'turbFunctionResult', as defined in the spec. @param rgb array for the four color components @param pointX x coordinate of the point to process. @param pointY y coordinate of the point to process. @param fSum array used to avoid reallocating double array for each pixel @param noise array used to avoid reallocating double array for each pixel @param stitchInfo The stitching information for the noise function 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
turbulenceFractalStitch	TokenNameIdentifier	 turbulence Fractal Stitch
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rgb	TokenNameIdentifier	 rgb
,	TokenNameCOMMA	
double	TokenNamedouble	
pointX	TokenNameIdentifier	 point X
,	TokenNameCOMMA	
double	TokenNamedouble	
pointY	TokenNameIdentifier	 point Y
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fSum	TokenNameIdentifier	 f Sum
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
StitchInfo	TokenNameIdentifier	 Stitch Info
stitchInfo	TokenNameIdentifier	 stitch Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
ratio	TokenNameIdentifier	 ratio
=	TokenNameEQUAL	
127.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
nOctave	TokenNameIdentifier	 n Octave
;	TokenNameSEMICOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
127.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
nOctave	TokenNameIdentifier	 n Octave
=	TokenNameEQUAL	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nOctave	TokenNameIdentifier	 n Octave
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noise2Stitch	TokenNameIdentifier	 noise2 Stitch
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
pointX	TokenNameIdentifier	 point X
,	TokenNameCOMMA	
pointY	TokenNameIdentifier	 point Y
,	TokenNameCOMMA	
stitchInfo	TokenNameIdentifier	 stitch Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ratio	TokenNameIdentifier	 ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ratio	TokenNameIdentifier	 ratio
*=	TokenNameMULTIPLY_EQUAL	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
pointX	TokenNameIdentifier	 point X
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pointY	TokenNameIdentifier	 point Y
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
doubleFrequency	TokenNameIdentifier	 double Frequency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
fSum	TokenNameIdentifier	 f Sum
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Generates a Perlin noise pattern into dest Raster. * @param dest Raster to fill with the pattern. */	TokenNameCOMMENT_JAVADOC	 Generates a Perlin noise pattern into dest Raster. @param dest Raster to fill with the pattern. 
public	TokenNamepublic	
WritableRaster	TokenNameIdentifier	 Writable Raster
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// First, check input arguments 	TokenNameCOMMENT_LINE	First, check input arguments 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Cannot generate a noise pattern into a null raster"	TokenNameStringLiteral	Cannot generate a noise pattern into a null raster
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Access the integer buffer for the destination Raster 	TokenNameCOMMENT_LINE	Access the integer buffer for the destination Raster 
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
dstDB	TokenNameIdentifier	 dst DB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
sppsm	TokenNameIdentifier	 sppsm
;	TokenNameSEMICOLON	
int	TokenNameint	
minX	TokenNameIdentifier	 min X
=	TokenNameEQUAL	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
minY	TokenNameIdentifier	 min Y
=	TokenNameEQUAL	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sppsm	TokenNameIdentifier	 sppsm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dstOff	TokenNameIdentifier	 dst Off
=	TokenNameEQUAL	
dstDB	TokenNameIdentifier	 dst DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
sppsm	TokenNameIdentifier	 sppsm
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
minX	TokenNameIdentifier	 min X
-	TokenNameMINUS	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
minY	TokenNameIdentifier	 min Y
-	TokenNameMINUS	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
destPixels	TokenNameIdentifier	 dest Pixels
=	TokenNameEQUAL	
dstDB	TokenNameIdentifier	 dst DB
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
dstAdjust	TokenNameIdentifier	 dst Adjust
=	TokenNameEQUAL	
sppsm	TokenNameIdentifier	 sppsm
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
// Generate pixel pattern now 	TokenNameCOMMENT_LINE	Generate pixel pattern now 
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
dp	TokenNameIdentifier	 dp
=	TokenNameEQUAL	
dstOff	TokenNameIdentifier	 dst Off
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rgb	TokenNameIdentifier	 rgb
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fSum	TokenNameIdentifier	 f Sum
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
noise	TokenNameIdentifier	 noise
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
tx0	TokenNameIdentifier	 tx0
,	TokenNameCOMMA	
tx1	TokenNameIdentifier	 tx1
,	TokenNameCOMMA	
ty0	TokenNameIdentifier	 ty0
,	TokenNameCOMMA	
ty1	TokenNameIdentifier	 ty1
;	TokenNameSEMICOLON	
tx0	TokenNameIdentifier	 tx0
=	TokenNameEQUAL	
tx	TokenNameIdentifier	 tx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
tx1	TokenNameIdentifier	 tx1
=	TokenNameEQUAL	
tx	TokenNameIdentifier	 tx
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Update for y step, (note we substract all the stuff we 	TokenNameCOMMENT_LINE	Update for y step, (note we substract all the stuff we 
// added while going across the scan line). 	TokenNameCOMMENT_LINE	added while going across the scan line). 
ty0	TokenNameIdentifier	 ty0
=	TokenNameEQUAL	
ty	TokenNameIdentifier	 ty
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
tx0	TokenNameIdentifier	 tx0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ty1	TokenNameIdentifier	 ty1
=	TokenNameEQUAL	
ty	TokenNameIdentifier	 ty
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
tx1	TokenNameIdentifier	 tx1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
{	TokenNameLBRACE	
minX	TokenNameIdentifier	 min X
,	TokenNameCOMMA	
minY	TokenNameIdentifier	 min Y
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
txf	TokenNameIdentifier	 txf
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
point_0	TokenNameIdentifier	 point 0
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
point_1	TokenNameIdentifier	 point 1
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isFractalNoise	TokenNameIdentifier	 is Fractal Noise
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stitchInfo	TokenNameIdentifier	 stitch Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dp	TokenNameIdentifier	 dp
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
destPixels	TokenNameIdentifier	 dest Pixels
[	TokenNameLBRACKET	
dp	TokenNameIdentifier	 dp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
turbulenceFractal_4	TokenNameIdentifier	 turbulence Fractal 4
(	TokenNameLPAREN	
point_0	TokenNameIdentifier	 point 0
,	TokenNameCOMMA	
point_1	TokenNameIdentifier	 point 1
,	TokenNameCOMMA	
fSum	TokenNameIdentifier	 f Sum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
point_0	TokenNameIdentifier	 point 0
+=	TokenNamePLUS_EQUAL	
tx0	TokenNameIdentifier	 tx0
;	TokenNameSEMICOLON	
point_1	TokenNameIdentifier	 point 1
+=	TokenNamePLUS_EQUAL	
tx1	TokenNameIdentifier	 tx1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
point_0	TokenNameIdentifier	 point 0
+=	TokenNamePLUS_EQUAL	
ty0	TokenNameIdentifier	 ty0
;	TokenNameSEMICOLON	
point_1	TokenNameIdentifier	 point 1
+=	TokenNamePLUS_EQUAL	
ty1	TokenNameIdentifier	 ty1
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
+=	TokenNamePLUS_EQUAL	
dstAdjust	TokenNameIdentifier	 dst Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dp	TokenNameIdentifier	 dp
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
turbulenceFractal	TokenNameIdentifier	 turbulence Fractal
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
,	TokenNameCOMMA	
point_0	TokenNameIdentifier	 point 0
,	TokenNameCOMMA	
point_1	TokenNameIdentifier	 point 1
,	TokenNameCOMMA	
fSum	TokenNameIdentifier	 f Sum
,	TokenNameCOMMA	
noise	TokenNameIdentifier	 noise
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Write RGB value. 	TokenNameCOMMENT_LINE	Write RGB value. 
destPixels	TokenNameIdentifier	 dest Pixels
[	TokenNameLBRACKET	
dp	TokenNameIdentifier	 dp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
point_0	TokenNameIdentifier	 point 0
+=	TokenNamePLUS_EQUAL	
tx0	TokenNameIdentifier	 tx0
;	TokenNameSEMICOLON	
point_1	TokenNameIdentifier	 point 1
+=	TokenNamePLUS_EQUAL	
tx1	TokenNameIdentifier	 tx1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
point_0	TokenNameIdentifier	 point 0
+=	TokenNamePLUS_EQUAL	
ty0	TokenNameIdentifier	 ty0
;	TokenNameSEMICOLON	
point_1	TokenNameIdentifier	 point 1
+=	TokenNamePLUS_EQUAL	
ty1	TokenNameIdentifier	 ty1
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
+=	TokenNamePLUS_EQUAL	
dstAdjust	TokenNameIdentifier	 dst Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
StitchInfo	TokenNameIdentifier	 Stitch Info
si	TokenNameIdentifier	 si
=	TokenNameEQUAL	
new	TokenNamenew	
StitchInfo	TokenNameIdentifier	 Stitch Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dp	TokenNameIdentifier	 dp
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
assign	TokenNameIdentifier	 assign
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
stitchInfo	TokenNameIdentifier	 stitch Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
turbulenceFractalStitch	TokenNameIdentifier	 turbulence Fractal Stitch
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
,	TokenNameCOMMA	
point_0	TokenNameIdentifier	 point 0
,	TokenNameCOMMA	
point_1	TokenNameIdentifier	 point 1
,	TokenNameCOMMA	
fSum	TokenNameIdentifier	 f Sum
,	TokenNameCOMMA	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
si	TokenNameIdentifier	 si
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Write RGB value. 	TokenNameCOMMENT_LINE	Write RGB value. 
destPixels	TokenNameIdentifier	 dest Pixels
[	TokenNameLBRACKET	
dp	TokenNameIdentifier	 dp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
point_0	TokenNameIdentifier	 point 0
+=	TokenNamePLUS_EQUAL	
tx0	TokenNameIdentifier	 tx0
;	TokenNameSEMICOLON	
point_1	TokenNameIdentifier	 point 1
+=	TokenNamePLUS_EQUAL	
tx1	TokenNameIdentifier	 tx1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
point_0	TokenNameIdentifier	 point 0
+=	TokenNamePLUS_EQUAL	
ty0	TokenNameIdentifier	 ty0
;	TokenNameSEMICOLON	
point_1	TokenNameIdentifier	 point 1
+=	TokenNamePLUS_EQUAL	
ty1	TokenNameIdentifier	 ty1
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
+=	TokenNamePLUS_EQUAL	
dstAdjust	TokenNameIdentifier	 dst Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Loop for turbulence noise 	TokenNameCOMMENT_LINE	Loop for turbulence noise 
if	TokenNameif	
(	TokenNameLPAREN	
stitchInfo	TokenNameIdentifier	 stitch Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dp	TokenNameIdentifier	 dp
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
destPixels	TokenNameIdentifier	 dest Pixels
[	TokenNameLBRACKET	
dp	TokenNameIdentifier	 dp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
turbulence_4	TokenNameIdentifier	 turbulence 4
(	TokenNameLPAREN	
point_0	TokenNameIdentifier	 point 0
,	TokenNameCOMMA	
point_1	TokenNameIdentifier	 point 1
,	TokenNameCOMMA	
fSum	TokenNameIdentifier	 f Sum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
point_0	TokenNameIdentifier	 point 0
+=	TokenNamePLUS_EQUAL	
tx0	TokenNameIdentifier	 tx0
;	TokenNameSEMICOLON	
point_1	TokenNameIdentifier	 point 1
+=	TokenNamePLUS_EQUAL	
tx1	TokenNameIdentifier	 tx1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
point_0	TokenNameIdentifier	 point 0
+=	TokenNamePLUS_EQUAL	
ty0	TokenNameIdentifier	 ty0
;	TokenNameSEMICOLON	
point_1	TokenNameIdentifier	 point 1
+=	TokenNamePLUS_EQUAL	
ty1	TokenNameIdentifier	 ty1
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
+=	TokenNamePLUS_EQUAL	
dstAdjust	TokenNameIdentifier	 dst Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dp	TokenNameIdentifier	 dp
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
turbulence	TokenNameIdentifier	 turbulence
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
,	TokenNameCOMMA	
point_0	TokenNameIdentifier	 point 0
,	TokenNameCOMMA	
point_1	TokenNameIdentifier	 point 1
,	TokenNameCOMMA	
fSum	TokenNameIdentifier	 f Sum
,	TokenNameCOMMA	
noise	TokenNameIdentifier	 noise
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Write RGB value. 	TokenNameCOMMENT_LINE	Write RGB value. 
destPixels	TokenNameIdentifier	 dest Pixels
[	TokenNameLBRACKET	
dp	TokenNameIdentifier	 dp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
point_0	TokenNameIdentifier	 point 0
+=	TokenNamePLUS_EQUAL	
tx0	TokenNameIdentifier	 tx0
;	TokenNameSEMICOLON	
point_1	TokenNameIdentifier	 point 1
+=	TokenNamePLUS_EQUAL	
tx1	TokenNameIdentifier	 tx1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
point_0	TokenNameIdentifier	 point 0
+=	TokenNamePLUS_EQUAL	
ty0	TokenNameIdentifier	 ty0
;	TokenNameSEMICOLON	
point_1	TokenNameIdentifier	 point 1
+=	TokenNamePLUS_EQUAL	
ty1	TokenNameIdentifier	 ty1
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
+=	TokenNamePLUS_EQUAL	
dstAdjust	TokenNameIdentifier	 dst Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
StitchInfo	TokenNameIdentifier	 Stitch Info
si	TokenNameIdentifier	 si
=	TokenNameEQUAL	
new	TokenNamenew	
StitchInfo	TokenNameIdentifier	 Stitch Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dp	TokenNameIdentifier	 dp
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
assign	TokenNameIdentifier	 assign
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
stitchInfo	TokenNameIdentifier	 stitch Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
turbulenceStitch	TokenNameIdentifier	 turbulence Stitch
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
,	TokenNameCOMMA	
point_0	TokenNameIdentifier	 point 0
,	TokenNameCOMMA	
point_1	TokenNameIdentifier	 point 1
,	TokenNameCOMMA	
fSum	TokenNameIdentifier	 f Sum
,	TokenNameCOMMA	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
si	TokenNameIdentifier	 si
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Write RGB value. 	TokenNameCOMMENT_LINE	Write RGB value. 
destPixels	TokenNameIdentifier	 dest Pixels
[	TokenNameLBRACKET	
dp	TokenNameIdentifier	 dp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
point_0	TokenNameIdentifier	 point 0
+=	TokenNamePLUS_EQUAL	
tx0	TokenNameIdentifier	 tx0
;	TokenNameSEMICOLON	
point_1	TokenNameIdentifier	 point 1
+=	TokenNamePLUS_EQUAL	
tx1	TokenNameIdentifier	 tx1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
point_0	TokenNameIdentifier	 point 0
+=	TokenNamePLUS_EQUAL	
ty0	TokenNameIdentifier	 ty0
;	TokenNameSEMICOLON	
point_1	TokenNameIdentifier	 point 1
+=	TokenNamePLUS_EQUAL	
ty1	TokenNameIdentifier	 ty1
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
+=	TokenNamePLUS_EQUAL	
dstAdjust	TokenNameIdentifier	 dst Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param baseFrequencyX x-axis base frequency for the noise * function along the x-axis * @param baseFrequencyY y-axis base frequency for the noise * function along the x-axis * @param numOctaves number of octaves in the noise * function. Positive integral value. * @param seed starting number for the pseudo random number generator * @param isFractalNoise defines whether the filter performs a * fractal noise or a turbulence function. * @param tile defines the tile size. May be null if stitchTiles * is false. Otherwise, should not be null. * @param txf The affine transform from device to user space. * @param cs The Colorspace to output. * @param alpha True if the data should have an alpha channel. */	TokenNameCOMMENT_JAVADOC	 @param baseFrequencyX x-axis base frequency for the noise function along the x-axis @param baseFrequencyY y-axis base frequency for the noise function along the x-axis @param numOctaves number of octaves in the noise function. Positive integral value. @param seed starting number for the pseudo random number generator @param isFractalNoise defines whether the filter performs a fractal noise or a turbulence function. @param tile defines the tile size. May be null if stitchTiles is false. Otherwise, should not be null. @param txf The affine transform from device to user space. @param cs The Colorspace to output. @param alpha True if the data should have an alpha channel. 
public	TokenNamepublic	
TurbulencePatternRed	TokenNameIdentifier	 Turbulence Pattern Red
(	TokenNameLPAREN	
double	TokenNamedouble	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
,	TokenNameCOMMA	
double	TokenNamedouble	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
,	TokenNameCOMMA	
int	TokenNameint	
numOctaves	TokenNameIdentifier	 num Octaves
,	TokenNameCOMMA	
int	TokenNameint	
seed	TokenNameIdentifier	 seed
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isFractalNoise	TokenNameIdentifier	 is Fractal Noise
,	TokenNameCOMMA	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
tile	TokenNameIdentifier	 tile
,	TokenNameCOMMA	
AffineTransform	TokenNameIdentifier	 Affine Transform
txf	TokenNameIdentifier	 txf
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
devRect	TokenNameIdentifier	 dev Rect
,	TokenNameCOMMA	
ColorSpace	TokenNameIdentifier	 Color Space
cs	TokenNameIdentifier	 cs
,	TokenNameCOMMA	
boolean	TokenNameboolean	
alpha	TokenNameIdentifier	 alpha
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
=	TokenNameEQUAL	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
=	TokenNameEQUAL	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
seed	TokenNameIdentifier	 seed
=	TokenNameEQUAL	
seed	TokenNameIdentifier	 seed
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isFractalNoise	TokenNameIdentifier	 is Fractal Noise
=	TokenNameEQUAL	
isFractalNoise	TokenNameIdentifier	 is Fractal Noise
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tile	TokenNameIdentifier	 tile
=	TokenNameEQUAL	
tile	TokenNameIdentifier	 tile
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
txf	TokenNameIdentifier	 txf
=	TokenNameEQUAL	
txf	TokenNameIdentifier	 txf
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
txf	TokenNameIdentifier	 txf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
txf	TokenNameIdentifier	 txf
=	TokenNameEQUAL	
IDENTITY	TokenNameIdentifier	 IDENTITY
;	TokenNameSEMICOLON	
int	TokenNameint	
nChannels	TokenNameIdentifier	 n Channels
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
getNumComponents	TokenNameIdentifier	 get Num Components
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
alpha	TokenNameIdentifier	 alpha
)	TokenNameRPAREN	
nChannels	TokenNameIdentifier	 n Channels
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
channels	TokenNameIdentifier	 channels
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
nChannels	TokenNameIdentifier	 n Channels
]	TokenNameRBRACKET	
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
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
channels	TokenNameIdentifier	 channels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
txf	TokenNameIdentifier	 txf
.	TokenNameDOT	
deltaTransform	TokenNameIdentifier	 delta Transform
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
txf	TokenNameIdentifier	 txf
.	TokenNameDOT	
deltaTransform	TokenNameIdentifier	 delta Transform
(	TokenNameLPAREN	
ty	TokenNameIdentifier	 ty
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ty	TokenNameIdentifier	 ty
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vecX	TokenNameIdentifier	 vec X
=	TokenNameEQUAL	
{	TokenNameLBRACE	
.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vecY	TokenNameIdentifier	 vec Y
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
.5	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
txf	TokenNameIdentifier	 txf
.	TokenNameDOT	
deltaTransform	TokenNameIdentifier	 delta Transform
(	TokenNameLPAREN	
vecX	TokenNameIdentifier	 vec X
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
vecX	TokenNameIdentifier	 vec X
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
txf	TokenNameIdentifier	 txf
.	TokenNameDOT	
deltaTransform	TokenNameIdentifier	 delta Transform
(	TokenNameLPAREN	
vecY	TokenNameIdentifier	 vec Y
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
vecY	TokenNameIdentifier	 vec Y
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Now, limit the number of octaves so that we do not get frequencies 	TokenNameCOMMENT_LINE	Now, limit the number of octaves so that we do not get frequencies 
// below half a pixel. 	TokenNameCOMMENT_LINE	below half a pixel. 
// 	TokenNameCOMMENT_LINE	 
// If d is the distance between to pixels in user space, then, 	TokenNameCOMMENT_LINE	If d is the distance between to pixels in user space, then, 
// numOctavesMax = -(log2(d) + log2(bf)) 	TokenNameCOMMENT_LINE	numOctavesMax = -(log2(d) + log2(bf)) 
// along one axis. 	TokenNameCOMMENT_LINE	along one axis. 
// 	TokenNameCOMMENT_LINE	 
// The maximum distance along each axis is processed by 	TokenNameCOMMENT_LINE	The maximum distance along each axis is processed by 
// computing the inverse transform of 'maximum' vectors from 	TokenNameCOMMENT_LINE	computing the inverse transform of 'maximum' vectors from 
// device space to the filter space and determining the 	TokenNameCOMMENT_LINE	device space to the filter space and determining the 
// maximum component along each axis. 	TokenNameCOMMENT_LINE	maximum component along each axis. 
double	TokenNamedouble	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
vecX	TokenNameIdentifier	 vec X
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
vecY	TokenNameIdentifier	 vec Y
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxX	TokenNameIdentifier	 max X
=	TokenNameEQUAL	
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
)	TokenNameRPAREN	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
vecX	TokenNameIdentifier	 vec X
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
vecY	TokenNameIdentifier	 vec Y
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxY	TokenNameIdentifier	 max Y
=	TokenNameEQUAL	
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numOctaves	TokenNameIdentifier	 num Octaves
=	TokenNameEQUAL	
numOctaves	TokenNameIdentifier	 num Octaves
>	TokenNameGREATER	
maxX	TokenNameIdentifier	 max X
?	TokenNameQUESTION	
maxX	TokenNameIdentifier	 max X
:	TokenNameCOLON	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numOctaves	TokenNameIdentifier	 num Octaves
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
numOctaves	TokenNameIdentifier	 num Octaves
>	TokenNameGREATER	
maxY	TokenNameIdentifier	 max Y
?	TokenNameQUESTION	
maxY	TokenNameIdentifier	 max Y
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
numOctaves	TokenNameIdentifier	 num Octaves
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
numOctaves	TokenNameIdentifier	 num Octaves
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
numOctaves	TokenNameIdentifier	 num Octaves
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
numOctaves	TokenNameIdentifier	 num Octaves
>	TokenNameGREATER	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// beyond 8 octaves there is no significant contribution 	TokenNameCOMMENT_LINE	beyond 8 octaves there is no significant contribution 
// to the output pixel (contribution is halved for each 	TokenNameCOMMENT_LINE	to the output pixel (contribution is halved for each 
// octave so after 8 we are contributing less than half a 	TokenNameCOMMENT_LINE	octave so after 8 we are contributing less than half a 
// code value _at_best_). 	TokenNameCOMMENT_LINE	code value _at_best_). 
this	TokenNamethis	
.	TokenNameDOT	
numOctaves	TokenNameIdentifier	 num Octaves
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tile	TokenNameIdentifier	 tile
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Adjust frequencies to the tile size 	TokenNameCOMMENT_LINE	Adjust frequencies to the tile size 
// 	TokenNameCOMMENT_LINE	 
double	TokenNamedouble	
lowFreq	TokenNameIdentifier	 low Freq
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
highFreq	TokenNameIdentifier	 high Freq
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
/	TokenNameDIVIDE	
lowFreq	TokenNameIdentifier	 low Freq
<	TokenNameLESS	
highFreq	TokenNameIdentifier	 high Freq
/	TokenNameDIVIDE	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
=	TokenNameEQUAL	
lowFreq	TokenNameIdentifier	 low Freq
;	TokenNameSEMICOLON	
else	TokenNameelse	
this	TokenNamethis	
.	TokenNameDOT	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
=	TokenNameEQUAL	
highFreq	TokenNameIdentifier	 high Freq
;	TokenNameSEMICOLON	
lowFreq	TokenNameIdentifier	 low Freq
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
highFreq	TokenNameIdentifier	 high Freq
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
/	TokenNameDIVIDE	
lowFreq	TokenNameIdentifier	 low Freq
<	TokenNameLESS	
highFreq	TokenNameIdentifier	 high Freq
/	TokenNameDIVIDE	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
=	TokenNameEQUAL	
lowFreq	TokenNameIdentifier	 low Freq
;	TokenNameSEMICOLON	
else	TokenNameelse	
this	TokenNamethis	
.	TokenNameDOT	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
=	TokenNameEQUAL	
highFreq	TokenNameIdentifier	 high Freq
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Now, process the initial latice grid size to compute the minimum 	TokenNameCOMMENT_LINE	Now, process the initial latice grid size to compute the minimum 
// and maximum latice values on each axis. 	TokenNameCOMMENT_LINE	and maximum latice values on each axis. 
// 	TokenNameCOMMENT_LINE	 
stitchInfo	TokenNameIdentifier	 stitch Info
=	TokenNameEQUAL	
new	TokenNamenew	
StitchInfo	TokenNameIdentifier	 Stitch Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
this	TokenNamethis	
.	TokenNameDOT	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
this	TokenNamethis	
.	TokenNameDOT	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
wrapX	TokenNameIdentifier	 wrap X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
this	TokenNamethis	
.	TokenNameDOT	
baseFrequencyX	TokenNameIdentifier	 base Frequency X
+	TokenNamePLUS	
PerlinN	TokenNameIdentifier	 Perlin N
+	TokenNamePLUS	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
wrapY	TokenNameIdentifier	 wrap Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
this	TokenNamethis	
.	TokenNameDOT	
baseFrequencyY	TokenNameIdentifier	 base Frequency Y
+	TokenNamePLUS	
PerlinN	TokenNameIdentifier	 Perlin N
+	TokenNamePLUS	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Protect agains zero frequencies. Setting values to 1 	TokenNameCOMMENT_LINE	Protect agains zero frequencies. Setting values to 1 
// will not affect the result of the computations. 	TokenNameCOMMENT_LINE	will not affect the result of the computations. 
if	TokenNameif	
(	TokenNameLPAREN	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
width	TokenNameIdentifier	 width
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
height	TokenNameIdentifier	 height
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
stitchInfo	TokenNameIdentifier	 stitch Info
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// System.out.println( "minLatticeX = " + minLatticeX + 	TokenNameCOMMENT_LINE	System.out.println( "minLatticeX = " + minLatticeX + 
// " minLatticeY = " + minLatticeY + 	TokenNameCOMMENT_LINE	" minLatticeY = " + minLatticeY + 
// " maxLatticeX = " + maxLatticeX + 	TokenNameCOMMENT_LINE	" maxLatticeX = " + maxLatticeX + 
// " maxLatticeY = " + maxLatticeY); 	TokenNameCOMMENT_LINE	" maxLatticeY = " + maxLatticeY); 
}	TokenNameRBRACE	
initLattice	TokenNameIdentifier	 init Lattice
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
alpha	TokenNameIdentifier	 alpha
)	TokenNameRPAREN	
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
new	TokenNamenew	
DirectColorModel	TokenNameIdentifier	 Direct Color Model
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00FF0000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0000FF00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000000FF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
DataBuffer	TokenNameIdentifier	 Data Buffer
.	TokenNameDOT	
TYPE_INT	TokenNameIdentifier	 TYPE  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
new	TokenNamenew	
DirectColorModel	TokenNameIdentifier	 Direct Color Model
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
,	TokenNameCOMMA	
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00FF0000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0000FF00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000000FF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
DataBuffer	TokenNameIdentifier	 Data Buffer
.	TokenNameDOT	
TYPE_INT	TokenNameIdentifier	 TYPE  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
tileSize	TokenNameIdentifier	 tile Size
=	TokenNameEQUAL	
AbstractTiledRed	TokenNameIdentifier	 Abstract Tiled Red
.	TokenNameDOT	
getDefaultTileSize	TokenNameIdentifier	 get Default Tile Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
)	TokenNameRPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
devRect	TokenNameIdentifier	 dev Rect
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
createCompatibleSampleModel	TokenNameIdentifier	 create Compatible Sample Model
(	TokenNameLPAREN	
tileSize	TokenNameIdentifier	 tile Size
,	TokenNameCOMMA	
tileSize	TokenNameIdentifier	 tile Size
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
