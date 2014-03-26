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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * Defines the set of attributes from Exchange SVG that * are defined as styling properties in Stylable SVG. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGStylingAttributes.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Defines the set of attributes from Exchange SVG that are defined as styling properties in Stylable SVG. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGStylingAttributes.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGStylingAttributes	TokenNameIdentifier	 SVG Styling Attributes
implements	TokenNameimplements	
SVGSyntax	TokenNameIdentifier	 SVG Syntax
{	TokenNameLBRACE	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
attrSet	TokenNameIdentifier	 attr Set
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_CLIP_PATH_ATTRIBUTE	TokenNameIdentifier	 SVG  CLIP  PATH  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_COLOR_INTERPOLATION_ATTRIBUTE	TokenNameIdentifier	 SVG  COLOR  INTERPOLATION  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_COLOR_RENDERING_ATTRIBUTE	TokenNameIdentifier	 SVG  COLOR  RENDERING  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_ENABLE_BACKGROUND_ATTRIBUTE	TokenNameIdentifier	 SVG  ENABLE  BACKGROUND  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_FILL_ATTRIBUTE	TokenNameIdentifier	 SVG  FILL  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_FILL_OPACITY_ATTRIBUTE	TokenNameIdentifier	 SVG  FILL  OPACITY  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_FILL_RULE_ATTRIBUTE	TokenNameIdentifier	 SVG  FILL  RULE  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_FILTER_ATTRIBUTE	TokenNameIdentifier	 SVG  FILTER  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_FLOOD_COLOR_ATTRIBUTE	TokenNameIdentifier	 SVG  FLOOD  COLOR  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_FLOOD_OPACITY_ATTRIBUTE	TokenNameIdentifier	 SVG  FLOOD  OPACITY  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_FONT_FAMILY_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  FAMILY  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_FONT_SIZE_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  SIZE  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_FONT_WEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  WEIGHT  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_FONT_STYLE_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  STYLE  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_IMAGE_RENDERING_ATTRIBUTE	TokenNameIdentifier	 SVG  IMAGE  RENDERING  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_MASK_ATTRIBUTE	TokenNameIdentifier	 SVG  MASK  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_OPACITY_ATTRIBUTE	TokenNameIdentifier	 SVG  OPACITY  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_SHAPE_RENDERING_ATTRIBUTE	TokenNameIdentifier	 SVG  SHAPE  RENDERING  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_STOP_COLOR_ATTRIBUTE	TokenNameIdentifier	 SVG  STOP  COLOR  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_STOP_OPACITY_ATTRIBUTE	TokenNameIdentifier	 SVG  STOP  OPACITY  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_STROKE_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_STROKE_OPACITY_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  OPACITY  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_STROKE_DASHARRAY_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  DASHARRAY  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_STROKE_DASHOFFSET_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  DASHOFFSET  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_STROKE_LINECAP_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  LINECAP  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_STROKE_LINEJOIN_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  LINEJOIN  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_STROKE_MITERLIMIT_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  MITERLIMIT  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_STROKE_WIDTH_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  WIDTH  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_TEXT_RENDERING_ATTRIBUTE	TokenNameIdentifier	 SVG  TEXT  RENDERING  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attributes that represent styling properties */	TokenNameCOMMENT_JAVADOC	 Attributes that represent styling properties 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
attrSet	TokenNameIdentifier	 attr Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
