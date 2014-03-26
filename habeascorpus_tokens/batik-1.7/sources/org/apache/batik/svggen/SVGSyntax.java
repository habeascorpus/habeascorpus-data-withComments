/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SVGConstants	TokenNameIdentifier	 SVG Constants
;	TokenNameSEMICOLON	
/** * Contains the definition of the SVG tags and attribute names. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGSyntax.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Contains the definition of the SVG tags and attribute names. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGSyntax.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGSyntax	TokenNameIdentifier	 SVG Syntax
extends	TokenNameextends	
SVGConstants	TokenNameIdentifier	 SVG Constants
{	TokenNameLBRACE	
// ID prefix constants. Generated IDs have the form <prefix><nn>. 	TokenNameCOMMENT_LINE	ID prefix constants. Generated IDs have the form <prefix><nn>. 
String	TokenNameIdentifier	 String
ID_PREFIX_ALPHA_COMPOSITE_CLEAR	TokenNameIdentifier	 ID  PREFIX  ALPHA  COMPOSITE  CLEAR
=	TokenNameEQUAL	
"alphaCompositeClear"	TokenNameStringLiteral	alphaCompositeClear
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_ALPHA_COMPOSITE_DST_IN	TokenNameIdentifier	 ID  PREFIX  ALPHA  COMPOSITE  DST  IN
=	TokenNameEQUAL	
"alphaCompositeDstIn"	TokenNameStringLiteral	alphaCompositeDstIn
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_ALPHA_COMPOSITE_DST_OUT	TokenNameIdentifier	 ID  PREFIX  ALPHA  COMPOSITE  DST  OUT
=	TokenNameEQUAL	
"alphaCompositeDstOut"	TokenNameStringLiteral	alphaCompositeDstOut
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_ALPHA_COMPOSITE_DST_OVER	TokenNameIdentifier	 ID  PREFIX  ALPHA  COMPOSITE  DST  OVER
=	TokenNameEQUAL	
"alphaCompositeDstOver"	TokenNameStringLiteral	alphaCompositeDstOver
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_ALPHA_COMPOSITE_SRC	TokenNameIdentifier	 ID  PREFIX  ALPHA  COMPOSITE  SRC
=	TokenNameEQUAL	
"alphaCompositeSrc"	TokenNameStringLiteral	alphaCompositeSrc
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_ALPHA_COMPOSITE_SRC_IN	TokenNameIdentifier	 ID  PREFIX  ALPHA  COMPOSITE  SRC  IN
=	TokenNameEQUAL	
"alphaCompositeSrcIn"	TokenNameStringLiteral	alphaCompositeSrcIn
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_ALPHA_COMPOSITE_SRC_OUT	TokenNameIdentifier	 ID  PREFIX  ALPHA  COMPOSITE  SRC  OUT
=	TokenNameEQUAL	
"alphaCompositeSrcOut"	TokenNameStringLiteral	alphaCompositeSrcOut
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_AMBIENT_LIGHT	TokenNameIdentifier	 ID  PREFIX  AMBIENT  LIGHT
=	TokenNameEQUAL	
"ambientLight"	TokenNameStringLiteral	ambientLight
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_BUMP_MAP	TokenNameIdentifier	 ID  PREFIX  BUMP  MAP
=	TokenNameEQUAL	
"bumpMap"	TokenNameStringLiteral	bumpMap
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_CLIP_PATH	TokenNameIdentifier	 ID  PREFIX  CLIP  PATH
=	TokenNameEQUAL	
"clipPath"	TokenNameStringLiteral	clipPath
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_DEFS	TokenNameIdentifier	 ID  PREFIX  DEFS
=	TokenNameEQUAL	
"defs"	TokenNameStringLiteral	defs
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_DIFFUSE_ADD	TokenNameIdentifier	 ID  PREFIX  DIFFUSE  ADD
=	TokenNameEQUAL	
"diffuseAdd"	TokenNameStringLiteral	diffuseAdd
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_DIFFUSE_LIGHTING_RESULT	TokenNameIdentifier	 ID  PREFIX  DIFFUSE  LIGHTING  RESULT
=	TokenNameEQUAL	
"diffuseLightingResult"	TokenNameStringLiteral	diffuseLightingResult
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_FE_CONVOLVE_MATRIX	TokenNameIdentifier	 ID  PREFIX  FE  CONVOLVE  MATRIX
=	TokenNameEQUAL	
"convolve"	TokenNameStringLiteral	convolve
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_FE_COMPONENT_TRANSFER	TokenNameIdentifier	 ID  PREFIX  FE  COMPONENT  TRANSFER
=	TokenNameEQUAL	
"componentTransfer"	TokenNameStringLiteral	componentTransfer
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_FE_COMPOSITE	TokenNameIdentifier	 ID  PREFIX  FE  COMPOSITE
=	TokenNameEQUAL	
"composite"	TokenNameStringLiteral	composite
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_FE_COMPLEX_FILTER	TokenNameIdentifier	 ID  PREFIX  FE  COMPLEX  FILTER
=	TokenNameEQUAL	
"complexFilter"	TokenNameStringLiteral	complexFilter
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_FE_DIFFUSE_LIGHTING	TokenNameIdentifier	 ID  PREFIX  FE  DIFFUSE  LIGHTING
=	TokenNameEQUAL	
"diffuseLighting"	TokenNameStringLiteral	diffuseLighting
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_FE_FLOOD	TokenNameIdentifier	 ID  PREFIX  FE  FLOOD
=	TokenNameEQUAL	
"flood"	TokenNameStringLiteral	flood
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_FE_GAUSSIAN_BLUR	TokenNameIdentifier	 ID  PREFIX  FE  GAUSSIAN  BLUR
=	TokenNameEQUAL	
"feGaussianBlur"	TokenNameStringLiteral	feGaussianBlur
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_FE_LIGHTING_FILTER	TokenNameIdentifier	 ID  PREFIX  FE  LIGHTING  FILTER
=	TokenNameEQUAL	
"feLightingFilter"	TokenNameStringLiteral	feLightingFilter
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_FE_SPECULAR_LIGHTING	TokenNameIdentifier	 ID  PREFIX  FE  SPECULAR  LIGHTING
=	TokenNameEQUAL	
"feSpecularLighting"	TokenNameStringLiteral	feSpecularLighting
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_FONT	TokenNameIdentifier	 ID  PREFIX  FONT
=	TokenNameEQUAL	
"font"	TokenNameStringLiteral	font
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_GENERIC_DEFS	TokenNameIdentifier	 ID  PREFIX  GENERIC  DEFS
=	TokenNameEQUAL	
"genericDefs"	TokenNameStringLiteral	genericDefs
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_IMAGE	TokenNameIdentifier	 ID  PREFIX  IMAGE
=	TokenNameEQUAL	
"image"	TokenNameStringLiteral	image
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_IMAGE_DEFS	TokenNameIdentifier	 ID  PREFIX  IMAGE  DEFS
=	TokenNameEQUAL	
"imageDefs"	TokenNameStringLiteral	imageDefs
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_LINEAR_GRADIENT	TokenNameIdentifier	 ID  PREFIX  LINEAR  GRADIENT
=	TokenNameEQUAL	
"linearGradient"	TokenNameStringLiteral	linearGradient
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_MASK	TokenNameIdentifier	 ID  PREFIX  MASK
=	TokenNameEQUAL	
"mask"	TokenNameStringLiteral	mask
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_PATTERN	TokenNameIdentifier	 ID  PREFIX  PATTERN
=	TokenNameEQUAL	
"pattern"	TokenNameStringLiteral	pattern
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_RADIAL_GRADIENT	TokenNameIdentifier	 ID  PREFIX  RADIAL  GRADIENT
=	TokenNameEQUAL	
"radialGradient"	TokenNameStringLiteral	radialGradient
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_SPECULAR_ADD	TokenNameIdentifier	 ID  PREFIX  SPECULAR  ADD
=	TokenNameEQUAL	
"specularAdd"	TokenNameStringLiteral	specularAdd
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ID_PREFIX_SPECULAR_LIGHTING_RESULT	TokenNameIdentifier	 ID  PREFIX  SPECULAR  LIGHTING  RESULT
=	TokenNameEQUAL	
"specularLightingResult"	TokenNameStringLiteral	specularLightingResult
;	TokenNameSEMICOLON	
// Generic string constants. 	TokenNameCOMMENT_LINE	Generic string constants. 
String	TokenNameIdentifier	 String
CLOSE_PARENTHESIS	TokenNameIdentifier	 CLOSE  PARENTHESIS
=	TokenNameEQUAL	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
COMMA	TokenNameIdentifier	 COMMA
=	TokenNameEQUAL	
","	TokenNameStringLiteral	,
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
OPEN_PARENTHESIS	TokenNameIdentifier	 OPEN  PARENTHESIS
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
RGB_PREFIX	TokenNameIdentifier	 RGB  PREFIX
=	TokenNameEQUAL	
"rgb("	TokenNameStringLiteral	rgb(
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
RGB_SUFFIX	TokenNameIdentifier	 RGB  SUFFIX
=	TokenNameEQUAL	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SIGN_PERCENT	TokenNameIdentifier	 SIGN  PERCENT
=	TokenNameEQUAL	
"%"	TokenNameStringLiteral	%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SIGN_POUND	TokenNameIdentifier	 SIGN  POUND
=	TokenNameEQUAL	
"#"	TokenNameStringLiteral	#
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SPACE	TokenNameIdentifier	 SPACE
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
URL_PREFIX	TokenNameIdentifier	 URL  PREFIX
=	TokenNameEQUAL	
"url("	TokenNameStringLiteral	url(
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
URL_SUFFIX	TokenNameIdentifier	 URL  SUFFIX
=	TokenNameEQUAL	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
DATA_PROTOCOL_PNG_PREFIX	TokenNameIdentifier	 DATA  PROTOCOL  PNG  PREFIX
=	TokenNameEQUAL	
"data:image/png;base64,"	TokenNameStringLiteral	data:image/png;base64,
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
