/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * Exposes the SVG feature strings that Batik supports. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id$ */	TokenNameCOMMENT_JAVADOC	 Exposes the SVG feature strings that Batik supports. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id$ 
public	TokenNamepublic	
class	TokenNameclass	
SVGFeatureStrings	TokenNameIdentifier	 SVG Feature Strings
{	TokenNameLBRACE	
/** * Adds a <code>String</code> to the specified {@link Set} corresponding * to each SVG feature string that Batik supports. * * @param features The set to add feature strings to. */	TokenNameCOMMENT_JAVADOC	 Adds a <code>String</code> to the specified {@link Set} corresponding to each SVG feature string that Batik supports. * @param features The set to add feature strings to. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
addSupportedFeatureStrings	TokenNameIdentifier	 add Supported Feature Strings
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
features	TokenNameIdentifier	 features
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// SVG 1.0 feature strings 	TokenNameCOMMENT_LINE	SVG 1.0 feature strings 
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ORG_W3C_SVG_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  SVG  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ORG_W3C_SVG_STATIC_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  SVG  STATIC  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ORG_W3C_SVG_ANIMATION_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  SVG  ANIMATION  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ORG_W3C_SVG_DYNAMIC_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  SVG  DYNAMIC  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ORG_W3C_SVG_ALL_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  SVG  ALL  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ORG_W3C_DOM_SVG_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  DOM  SVG  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ORG_W3C_DOM_SVG_STATIC_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  DOM  SVG  STATIC  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ORG_W3C_DOM_SVG_ANIMATION_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  DOM  SVG  ANIMATION  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ORG_W3C_DOM_SVG_DYNAMIC_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  DOM  SVG  DYNAMIC  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ORG_W3C_DOM_SVG_ALL_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  DOM  SVG  ALL  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// SVG 1.1 feature strings 	TokenNameCOMMENT_LINE	SVG 1.1 feature strings 
// Due to SVG_SVG11_VIEWPORT_ATTRIBUTE_FEATURE not being supported 	TokenNameCOMMENT_LINE	Due to SVG_SVG11_VIEWPORT_ATTRIBUTE_FEATURE not being supported 
// features.add(SVGConstants.SVG_SVG11_SVG_FEATURE); 	TokenNameCOMMENT_LINE	features.add(SVGConstants.SVG_SVG11_SVG_FEATURE); 
// features.add(SVGConstants.SVG_SVG11_SVG_STATIC_FEATURE); 	TokenNameCOMMENT_LINE	features.add(SVGConstants.SVG_SVG11_SVG_STATIC_FEATURE); 
// features.add(SVGConstants.SVG_SVG11_SVG_ANIMATION_FEATURE); 	TokenNameCOMMENT_LINE	features.add(SVGConstants.SVG_SVG11_SVG_ANIMATION_FEATURE); 
// features.add(SVGConstants.SVG_SVG11_SVG_DYNAMIC_FEATURE); 	TokenNameCOMMENT_LINE	features.add(SVGConstants.SVG_SVG11_SVG_DYNAMIC_FEATURE); 
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_SVG_DOM_FEATURE	TokenNameIdentifier	 SVG  SV G11  SVG  DOM  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_SVG_DOM_STATIC_FEATURE	TokenNameIdentifier	 SVG  SV G11  SVG  DOM  STATIC  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_SVG_DOM_ANIMATION_FEATURE	TokenNameIdentifier	 SVG  SV G11  SVG  DOM  ANIMATION  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_SVG_DOM_DYNAMIC_FEATURE	TokenNameIdentifier	 SVG  SV G11  SVG  DOM  DYNAMIC  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_CORE_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  CORE  ATTRIBUTE  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_STRUCTURE_FEATURE	TokenNameIdentifier	 SVG  SV G11  STRUCTURE  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_BASIC_STRUCTURE_FEATURE	TokenNameIdentifier	 SVG  SV G11  BASIC  STRUCTURE  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_CONTAINER_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  CONTAINER  ATTRIBUTE  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_CONDITIONAL_PROCESSING_FEATURE	TokenNameIdentifier	 SVG  SV G11  CONDITIONAL  PROCESSING  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_IMAGE_FEATURE	TokenNameIdentifier	 SVG  SV G11  IMAGE  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_STYLE_FEATURE	TokenNameIdentifier	 SVG  SV G11  STYLE  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'clip' on various elements not supported 	TokenNameCOMMENT_LINE	'clip' on various elements not supported 
// features.add(SVGConstants.SVG_SVG11_VIEWPORT_ATTRIBUTE_FEATURE); 	TokenNameCOMMENT_LINE	features.add(SVGConstants.SVG_SVG11_VIEWPORT_ATTRIBUTE_FEATURE); 
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_SHAPE_FEATURE	TokenNameIdentifier	 SVG  SV G11  SHAPE  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_TEXT_FEATURE	TokenNameIdentifier	 SVG  SV G11  TEXT  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_BASIC_TEXT_FEATURE	TokenNameIdentifier	 SVG  SV G11  BASIC  TEXT  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_PAINT_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  PAINT  ATTRIBUTE  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_BASIC_PAINT_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  BASIC  PAINT  ATTRIBUTE  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_OPACITY_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  OPACITY  ATTRIBUTE  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_GRAPHICS_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  GRAPHICS  ATTRIBUTE  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_BASIC_GRAPHICS_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  BASIC  GRAPHICS  ATTRIBUTE  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_MARKER_FEATURE	TokenNameIdentifier	 SVG  SV G11  MARKER  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_COLOR_PROFILE_FEATURE	TokenNameIdentifier	 SVG  SV G11  COLOR  PROFILE  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_GRADIENT_FEATURE	TokenNameIdentifier	 SVG  SV G11  GRADIENT  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_PATTERN_FEATURE	TokenNameIdentifier	 SVG  SV G11  PATTERN  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_CLIP_FEATURE	TokenNameIdentifier	 SVG  SV G11  CLIP  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_BASIC_CLIP_FEATURE	TokenNameIdentifier	 SVG  SV G11  BASIC  CLIP  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_MASK_FEATURE	TokenNameIdentifier	 SVG  SV G11  MASK  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_FILTER_FEATURE	TokenNameIdentifier	 SVG  SV G11  FILTER  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_BASIC_FILTER_FEATURE	TokenNameIdentifier	 SVG  SV G11  BASIC  FILTER  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_DOCUMENT_EVENTS_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  DOCUMENT  EVENTS  ATTRIBUTE  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_GRAPHICAL_EVENTS_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  GRAPHICAL  EVENTS  ATTRIBUTE  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_ANIMATION_EVENTS_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  ANIMATION  EVENTS  ATTRIBUTE  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_CURSOR_FEATURE	TokenNameIdentifier	 SVG  SV G11  CURSOR  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_HYPERLINKING_FEATURE	TokenNameIdentifier	 SVG  SV G11  HYPERLINKING  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_XLINK_FEATURE	TokenNameIdentifier	 SVG  SV G11  XLINK  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// externalResourcesRequired="" not supported 	TokenNameCOMMENT_LINE	externalResourcesRequired="" not supported 
// features.add(SVGConstants.SVG_SVG11_EXTERNAL_RESOURCES_REQUIRED_FEATURE); 	TokenNameCOMMENT_LINE	features.add(SVGConstants.SVG_SVG11_EXTERNAL_RESOURCES_REQUIRED_FEATURE); 
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_VIEW_FEATURE	TokenNameIdentifier	 SVG  SV G11  VIEW  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_SCRIPT_FEATURE	TokenNameIdentifier	 SVG  SV G11  SCRIPT  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_ANIMATION_FEATURE	TokenNameIdentifier	 SVG  SV G11  ANIMATION  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_FONT_FEATURE	TokenNameIdentifier	 SVG  SV G11  FONT  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_BASIC_FONT_FEATURE	TokenNameIdentifier	 SVG  SV G11  BASIC  FONT  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG11_EXTENSIBILITY_FEATURE	TokenNameIdentifier	 SVG  SV G11  EXTENSIBILITY  FEATURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
