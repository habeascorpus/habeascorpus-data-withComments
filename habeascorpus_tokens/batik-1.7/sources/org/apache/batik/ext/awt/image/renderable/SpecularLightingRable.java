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
Light	TokenNameIdentifier	 Light
;	TokenNameSEMICOLON	
/** * This filter follows the specification of the feSpecularLighting filter in * the SVG 1.0 specification. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SpecularLightingRable.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This filter follows the specification of the feSpecularLighting filter in the SVG 1.0 specification. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SpecularLightingRable.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SpecularLightingRable	TokenNameIdentifier	 Specular Lighting Rable
extends	TokenNameextends	
FilterColorInterpolation	TokenNameIdentifier	 Filter Color Interpolation
{	TokenNameLBRACE	
/** * Returns the source to be filtered */	TokenNameCOMMENT_JAVADOC	 Returns the source to be filtered 
Filter	TokenNameIdentifier	 Filter
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the source to be filtered */	TokenNameCOMMENT_JAVADOC	 Sets the source to be filtered 
void	TokenNamevoid	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return Light object used for the diffuse lighting */	TokenNameCOMMENT_JAVADOC	 @return Light object used for the diffuse lighting 
Light	TokenNameIdentifier	 Light
getLight	TokenNameIdentifier	 get Light
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @param light New Light object */	TokenNameCOMMENT_JAVADOC	 @param light New Light object 
void	TokenNamevoid	
setLight	TokenNameIdentifier	 set Light
(	TokenNameLPAREN	
Light	TokenNameIdentifier	 Light
light	TokenNameIdentifier	 light
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return surfaceScale */	TokenNameCOMMENT_JAVADOC	 @return surfaceScale 
double	TokenNamedouble	
getSurfaceScale	TokenNameIdentifier	 get Surface Scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the surface scale */	TokenNameCOMMENT_JAVADOC	 Sets the surface scale 
void	TokenNamevoid	
setSurfaceScale	TokenNameIdentifier	 set Surface Scale
(	TokenNameLPAREN	
double	TokenNamedouble	
surfaceScale	TokenNameIdentifier	 surface Scale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return specular constant, or ks. */	TokenNameCOMMENT_JAVADOC	 @return specular constant, or ks. 
double	TokenNamedouble	
getKs	TokenNameIdentifier	 get Ks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the specular constant, or ks */	TokenNameCOMMENT_JAVADOC	 Sets the specular constant, or ks 
void	TokenNamevoid	
setKs	TokenNameIdentifier	 set Ks
(	TokenNameLPAREN	
double	TokenNamedouble	
ks	TokenNameIdentifier	 ks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return specular exponent, or kd */	TokenNameCOMMENT_JAVADOC	 @return specular exponent, or kd 
double	TokenNamedouble	
getSpecularExponent	TokenNameIdentifier	 get Specular Exponent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the specular exponent */	TokenNameCOMMENT_JAVADOC	 Sets the specular exponent 
void	TokenNamevoid	
setSpecularExponent	TokenNameIdentifier	 set Specular Exponent
(	TokenNameLPAREN	
double	TokenNamedouble	
specularExponent	TokenNameIdentifier	 specular Exponent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the litRegion for this filter */	TokenNameCOMMENT_JAVADOC	 @return the litRegion for this filter 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getLitRegion	TokenNameIdentifier	 get Lit Region
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the litRegion for this filter */	TokenNameCOMMENT_JAVADOC	 Sets the litRegion for this filter 
void	TokenNamevoid	
setLitRegion	TokenNameIdentifier	 set Lit Region
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
litRegion	TokenNameIdentifier	 lit Region
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the min [dx,dy] distance in user space for evalutation of * the sobel gradient. */	TokenNameCOMMENT_JAVADOC	 Returns the min [dx,dy] distance in user space for evalutation of the sobel gradient. 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getKernelUnitLength	TokenNameIdentifier	 get Kernel Unit Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the min [dx,dy] distance in user space for evaluation of the * sobel gradient. If set to zero or null then device space will be used. */	TokenNameCOMMENT_JAVADOC	 Sets the min [dx,dy] distance in user space for evaluation of the sobel gradient. If set to zero or null then device space will be used. 
void	TokenNamevoid	
setKernelUnitLength	TokenNameIdentifier	 set Kernel Unit Length
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
kernelUnitLength	TokenNameIdentifier	 kernel Unit Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
