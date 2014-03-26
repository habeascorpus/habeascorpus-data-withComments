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
/** * * @version $Id: ErrorConstants.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 * @version $Id: ErrorConstants.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ErrorConstants	TokenNameIdentifier	 Error Constants
{	TokenNameLBRACE	
// general errors 	TokenNameCOMMENT_LINE	general errors 
String	TokenNameIdentifier	 String
ERR_UNEXPECTED	TokenNameIdentifier	 ERR  UNEXPECTED
=	TokenNameEQUAL	
"unexpected exception"	TokenNameStringLiteral	unexpected exception
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_CONTEXT_NULL	TokenNameIdentifier	 ERR  CONTEXT  NULL
=	TokenNameEQUAL	
"generatorContext should not be null"	TokenNameStringLiteral	generatorContext should not be null
;	TokenNameSEMICOLON	
/// image handling errors 	TokenNameCOMMENT_LINE	/ image handling errors 
String	TokenNameIdentifier	 String
ERR_IMAGE_DIR_NULL	TokenNameIdentifier	 ERR  IMAGE  DIR  NULL
=	TokenNameEQUAL	
"imageDir should not be null"	TokenNameStringLiteral	imageDir should not be null
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_IMAGE_DIR_DOES_NOT_EXIST	TokenNameIdentifier	 ERR  IMAGE  DIR  DOES  NOT  EXIST
=	TokenNameEQUAL	
"imageDir does not exist"	TokenNameStringLiteral	imageDir does not exist
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_CANNOT_USE_IMAGE_DIR	TokenNameIdentifier	 ERR  CANNOT  USE  IMAGE  DIR
=	TokenNameEQUAL	
"cannot convert imageDir to a URL value : "	TokenNameStringLiteral	cannot convert imageDir to a URL value : 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_IMAGE_NULL	TokenNameIdentifier	 ERR  IMAGE  NULL
=	TokenNameEQUAL	
"image should not be null"	TokenNameStringLiteral	image should not be null
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_WRITE	TokenNameIdentifier	 ERR  WRITE
=	TokenNameEQUAL	
"could not write image File "	TokenNameStringLiteral	could not write image File 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_READ	TokenNameIdentifier	 ERR  READ
=	TokenNameEQUAL	
"could not read image File "	TokenNameStringLiteral	could not read image File 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_IMAGE_HANDLER_NOT_SUPPORTED	TokenNameIdentifier	 ERR  IMAGE  HANDLER  NOT  SUPPORTED
=	TokenNameEQUAL	
"imageHandler does not implement CachedImageHandler: "	TokenNameStringLiteral	imageHandler does not implement CachedImageHandler: 
;	TokenNameSEMICOLON	
// SVGGraphics2D errors 	TokenNameCOMMENT_LINE	SVGGraphics2D errors 
String	TokenNameIdentifier	 String
ERR_CANVAS_SIZE_NULL	TokenNameIdentifier	 ERR  CANVAS  SIZE  NULL
=	TokenNameEQUAL	
"canvas size should not be null"	TokenNameStringLiteral	canvas size should not be null
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_XOR	TokenNameIdentifier	 ERR  XOR
=	TokenNameEQUAL	
"XOR Mode is not supported by Graphics2D SVG Generator"	TokenNameStringLiteral	XOR Mode is not supported by Graphics2D SVG Generator
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_ACI	TokenNameIdentifier	 ERR  ACI
=	TokenNameEQUAL	
"AttributedCharacterIterator not supported yet"	TokenNameStringLiteral	AttributedCharacterIterator not supported yet
;	TokenNameSEMICOLON	
// XmlWriter 	TokenNameCOMMENT_LINE	XmlWriter 
String	TokenNameIdentifier	 String
ERR_PROXY	TokenNameIdentifier	 ERR  PROXY
=	TokenNameEQUAL	
"proxy should not be null"	TokenNameStringLiteral	proxy should not be null
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
INVALID_NODE	TokenNameIdentifier	 INVALID  NODE
=	TokenNameEQUAL	
"Unable to write node of type "	TokenNameStringLiteral	Unable to write node of type 
;	TokenNameSEMICOLON	
// DOMGroup/TreeManager 	TokenNameCOMMENT_LINE	DOMGroup/TreeManager 
String	TokenNameIdentifier	 String
ERR_GC_NULL	TokenNameIdentifier	 ERR  GC  NULL
=	TokenNameEQUAL	
"gc should not be null"	TokenNameStringLiteral	gc should not be null
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_DOMTREEMANAGER_NULL	TokenNameIdentifier	 ERR  DOMTREEMANAGER  NULL
=	TokenNameEQUAL	
"domTreeManager should not be null"	TokenNameStringLiteral	domTreeManager should not be null
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_MAXGCOVERRIDES_OUTOFRANGE	TokenNameIdentifier	 ERR  MAXGCOVERRIDES  OUTOFRANGE
=	TokenNameEQUAL	
"maxGcOverrides should be greater than zero"	TokenNameStringLiteral	maxGcOverrides should be greater than zero
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_TOP_LEVEL_GROUP_NULL	TokenNameIdentifier	 ERR  TOP  LEVEL  GROUP  NULL
=	TokenNameEQUAL	
"topLevelGroup should not be null"	TokenNameStringLiteral	topLevelGroup should not be null
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_TOP_LEVEL_GROUP_NOT_G	TokenNameIdentifier	 ERR  TOP  LEVEL  GROUP  NOT  G
=	TokenNameEQUAL	
"topLevelGroup should be a group <g>"	TokenNameStringLiteral	topLevelGroup should be a group <g>
;	TokenNameSEMICOLON	
// SVGClip/Font/Hint/Stroke descriptor 	TokenNameCOMMENT_LINE	SVGClip/Font/Hint/Stroke descriptor 
String	TokenNameIdentifier	 String
ERR_CLIP_NULL	TokenNameIdentifier	 ERR  CLIP  NULL
=	TokenNameEQUAL	
"clipPathValue should not be null"	TokenNameStringLiteral	clipPathValue should not be null
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_FONT_NULL	TokenNameIdentifier	 ERR  FONT  NULL
=	TokenNameEQUAL	
"none of the font description parameters should be null"	TokenNameStringLiteral	none of the font description parameters should be null
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_HINT_NULL	TokenNameIdentifier	 ERR  HINT  NULL
=	TokenNameEQUAL	
"none of the hints description parameters should be null"	TokenNameStringLiteral	none of the hints description parameters should be null
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_STROKE_NULL	TokenNameIdentifier	 ERR  STROKE  NULL
=	TokenNameEQUAL	
"none of the stroke description parameters should be null"	TokenNameStringLiteral	none of the stroke description parameters should be null
;	TokenNameSEMICOLON	
// context 	TokenNameCOMMENT_LINE	context 
String	TokenNameIdentifier	 String
ERR_MAP_NULL	TokenNameIdentifier	 ERR  MAP  NULL
=	TokenNameEQUAL	
"context map(s) should not be null"	TokenNameStringLiteral	context map(s) should not be null
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_TRANS_NULL	TokenNameIdentifier	 ERR  TRANS  NULL
=	TokenNameEQUAL	
"transformer stack should not be null"	TokenNameStringLiteral	transformer stack should not be null
;	TokenNameSEMICOLON	
// SVGLookUp/RescaleOp 	TokenNameCOMMENT_LINE	SVGLookUp/RescaleOp 
String	TokenNameIdentifier	 String
ERR_ILLEGAL_BUFFERED_IMAGE_LOOKUP_OP	TokenNameIdentifier	 ERR  ILLEGAL  BUFFERED  IMAGE  LOOKUP  OP
=	TokenNameEQUAL	
"BufferedImage LookupOp should have 1, 3 or 4 lookup arrays"	TokenNameStringLiteral	BufferedImage LookupOp should have 1, 3 or 4 lookup arrays
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_SCALE_FACTORS_AND_OFFSETS_MISMATCH	TokenNameIdentifier	 ERR  SCALE  FACTORS  AND  OFFSETS  MISMATCH
=	TokenNameEQUAL	
"RescapeOp offsets and scaleFactor array length do not match"	TokenNameStringLiteral	RescapeOp offsets and scaleFactor array length do not match
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_ILLEGAL_BUFFERED_IMAGE_RESCALE_OP	TokenNameIdentifier	 ERR  ILLEGAL  BUFFERED  IMAGE  RESCALE  OP
=	TokenNameEQUAL	
"BufferedImage RescaleOp should have 1, 3 or 4 scale factors"	TokenNameStringLiteral	BufferedImage RescaleOp should have 1, 3 or 4 scale factors
;	TokenNameSEMICOLON	
// SVGGeneratorContext 	TokenNameCOMMENT_LINE	SVGGeneratorContext 
String	TokenNameIdentifier	 String
ERR_DOM_FACTORY_NULL	TokenNameIdentifier	 ERR  DOM  FACTORY  NULL
=	TokenNameEQUAL	
"domFactory should not be null"	TokenNameStringLiteral	domFactory should not be null
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_IMAGE_HANDLER_NULL	TokenNameIdentifier	 ERR  IMAGE  HANDLER  NULL
=	TokenNameEQUAL	
"imageHandler should not be null"	TokenNameStringLiteral	imageHandler should not be null
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_EXTENSION_HANDLER_NULL	TokenNameIdentifier	 ERR  EXTENSION  HANDLER  NULL
=	TokenNameEQUAL	
"extensionHandler should not be null"	TokenNameStringLiteral	extensionHandler should not be null
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_ID_GENERATOR_NULL	TokenNameIdentifier	 ERR  ID  GENERATOR  NULL
=	TokenNameEQUAL	
"idGenerator should not be null"	TokenNameStringLiteral	idGenerator should not be null
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_STYLE_HANDLER_NULL	TokenNameIdentifier	 ERR  STYLE  HANDLER  NULL
=	TokenNameEQUAL	
"styleHandler should not be null"	TokenNameStringLiteral	styleHandler should not be null
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ERR_ERROR_HANDLER_NULL	TokenNameIdentifier	 ERR  ERROR  HANDLER  NULL
=	TokenNameEQUAL	
"errorHandler should not be null"	TokenNameStringLiteral	errorHandler should not be null
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
