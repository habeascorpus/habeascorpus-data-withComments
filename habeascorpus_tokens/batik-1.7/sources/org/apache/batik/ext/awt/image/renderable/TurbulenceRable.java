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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
;	TokenNameSEMICOLON	
/** * Creates a sourceless image from a turbulence function. * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: TurbulenceRable.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Creates a sourceless image from a turbulence function. * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: TurbulenceRable.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
TurbulenceRable	TokenNameIdentifier	 Turbulence Rable
extends	TokenNameextends	
FilterColorInterpolation	TokenNameIdentifier	 Filter Color Interpolation
{	TokenNameLBRACE	
/** * Sets the turbulence region * @param turbulenceRegion region to fill with turbulence function. */	TokenNameCOMMENT_JAVADOC	 Sets the turbulence region @param turbulenceRegion region to fill with turbulence function. 
void	TokenNamevoid	
setTurbulenceRegion	TokenNameIdentifier	 set Turbulence Region
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
turbulenceRegion	TokenNameIdentifier	 turbulence Region
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the turbulence region */	TokenNameCOMMENT_JAVADOC	 Gets the turbulence region 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getTurbulenceRegion	TokenNameIdentifier	 get Turbulence Region
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the current seed value for the pseudo random number generator. * @return The current seed value for the pseudo random number generator. */	TokenNameCOMMENT_JAVADOC	 Gets the current seed value for the pseudo random number generator. @return The current seed value for the pseudo random number generator. 
int	TokenNameint	
getSeed	TokenNameIdentifier	 get Seed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the current base fequency in x direction. * @return The current base fequency in x direction. */	TokenNameCOMMENT_JAVADOC	 Gets the current base fequency in x direction. @return The current base fequency in x direction. 
double	TokenNamedouble	
getBaseFrequencyX	TokenNameIdentifier	 get Base Frequency X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the current base fequency in y direction. * @return The current base fequency in y direction. */	TokenNameCOMMENT_JAVADOC	 Gets the current base fequency in y direction. @return The current base fequency in y direction. 
double	TokenNamedouble	
getBaseFrequencyY	TokenNameIdentifier	 get Base Frequency Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the current number of octaves for the noise function . * @return The current number of octaves for the noise function . */	TokenNameCOMMENT_JAVADOC	 Gets the current number of octaves for the noise function . @return The current number of octaves for the noise function . 
int	TokenNameint	
getNumOctaves	TokenNameIdentifier	 get Num Octaves
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the turbulence function is currently stitching tiles. * @return true if the turbulence function is currently stitching tiles. */	TokenNameCOMMENT_JAVADOC	 Returns true if the turbulence function is currently stitching tiles. @return true if the turbulence function is currently stitching tiles. 
boolean	TokenNameboolean	
isStitched	TokenNameIdentifier	 is Stitched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the turbulence function is using fractal noise, * instead of turbulence noise. * @return true if the turbulence function is using fractal noise, * instead of turbulence noise. */	TokenNameCOMMENT_JAVADOC	 Returns true if the turbulence function is using fractal noise, instead of turbulence noise. @return true if the turbulence function is using fractal noise, instead of turbulence noise. 
boolean	TokenNameboolean	
isFractalNoise	TokenNameIdentifier	 is Fractal Noise
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the seed value for the pseudo random number generator. * @param seed The new seed value for the pseudo random number generator. */	TokenNameCOMMENT_JAVADOC	 Sets the seed value for the pseudo random number generator. @param seed The new seed value for the pseudo random number generator. 
void	TokenNamevoid	
setSeed	TokenNameIdentifier	 set Seed
(	TokenNameLPAREN	
int	TokenNameint	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the base fequency in x direction. * @param xfreq The new base fequency in x direction. */	TokenNameCOMMENT_JAVADOC	 Sets the base fequency in x direction. @param xfreq The new base fequency in x direction. 
void	TokenNamevoid	
setBaseFrequencyX	TokenNameIdentifier	 set Base Frequency X
(	TokenNameLPAREN	
double	TokenNamedouble	
xfreq	TokenNameIdentifier	 xfreq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the base fequency in y direction. * @param yfreq The new base fequency in y direction. */	TokenNameCOMMENT_JAVADOC	 Sets the base fequency in y direction. @param yfreq The new base fequency in y direction. 
void	TokenNamevoid	
setBaseFrequencyY	TokenNameIdentifier	 set Base Frequency Y
(	TokenNameLPAREN	
double	TokenNamedouble	
yfreq	TokenNameIdentifier	 yfreq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the number of octaves for the noise function . * @param numOctaves The new number of octaves for the noise function . */	TokenNameCOMMENT_JAVADOC	 Sets the number of octaves for the noise function . @param numOctaves The new number of octaves for the noise function . 
void	TokenNamevoid	
setNumOctaves	TokenNameIdentifier	 set Num Octaves
(	TokenNameLPAREN	
int	TokenNameint	
numOctaves	TokenNameIdentifier	 num Octaves
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets stitching state for tiles. * @param stitched true if the turbulence operator should stitch tiles. */	TokenNameCOMMENT_JAVADOC	 Sets stitching state for tiles. @param stitched true if the turbulence operator should stitch tiles. 
void	TokenNamevoid	
setStitched	TokenNameIdentifier	 set Stitched
(	TokenNameLPAREN	
boolean	TokenNameboolean	
stitched	TokenNameIdentifier	 stitched
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Turns on/off fractal noise. * @param fractalNoise true if fractal noise should be used. */	TokenNameCOMMENT_JAVADOC	 Turns on/off fractal noise. @param fractalNoise true if fractal noise should be used. 
void	TokenNamevoid	
setFractalNoise	TokenNameIdentifier	 set Fractal Noise
(	TokenNameLPAREN	
boolean	TokenNameboolean	
fractalNoise	TokenNameIdentifier	 fractal Noise
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
