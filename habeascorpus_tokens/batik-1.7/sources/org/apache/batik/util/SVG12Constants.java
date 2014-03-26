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
/** * Define SVG 1.2 constants, such as tag names, attribute names and URI * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVG12Constants.java 478169 2006-11-22 14:23:24Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Define SVG 1.2 constants, such as tag names, attribute names and URI * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVG12Constants.java 478169 2006-11-22 14:23:24Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVG12Constants	TokenNameIdentifier	 SV G12 Constants
extends	TokenNameextends	
SVGConstants	TokenNameIdentifier	 SVG Constants
{	TokenNameLBRACE	
// SVG 1.2 element tag names //////////////////////////////////////////// 	TokenNameCOMMENT_LINE	SVG 1.2 element tag names //////////////////////////////////////////// 
/** Tag name for Batik's flowRoot extension (SVG 1.2). */	TokenNameCOMMENT_JAVADOC	 Tag name for Batik's flowRoot extension (SVG 1.2). 
String	TokenNameIdentifier	 String
SVG_FLOW_ROOT_TAG	TokenNameIdentifier	 SVG  FLOW  ROOT  TAG
=	TokenNameEQUAL	
"flowRoot"	TokenNameStringLiteral	flowRoot
;	TokenNameSEMICOLON	
/** Tag name for Batik's flowRoot extension Region element (SVG 1.2). */	TokenNameCOMMENT_JAVADOC	 Tag name for Batik's flowRoot extension Region element (SVG 1.2). 
String	TokenNameIdentifier	 String
SVG_FLOW_REGION_TAG	TokenNameIdentifier	 SVG  FLOW  REGION  TAG
=	TokenNameEQUAL	
"flowRegion"	TokenNameStringLiteral	flowRegion
;	TokenNameSEMICOLON	
/** Tag name for Batik's flowRoot extension Region element (SVG 1.2). */	TokenNameCOMMENT_JAVADOC	 Tag name for Batik's flowRoot extension Region element (SVG 1.2). 
String	TokenNameIdentifier	 String
SVG_FLOW_REGION_EXCLUDE_TAG	TokenNameIdentifier	 SVG  FLOW  REGION  EXCLUDE  TAG
=	TokenNameEQUAL	
"flowRegionExclude"	TokenNameStringLiteral	flowRegionExclude
;	TokenNameSEMICOLON	
/** Tag name for Batik's flowRoot extension div element SVG 1.2). */	TokenNameCOMMENT_JAVADOC	 Tag name for Batik's flowRoot extension div element SVG 1.2). 
String	TokenNameIdentifier	 String
SVG_FLOW_DIV_TAG	TokenNameIdentifier	 SVG  FLOW  DIV  TAG
=	TokenNameEQUAL	
"flowDiv"	TokenNameStringLiteral	flowDiv
;	TokenNameSEMICOLON	
/** Tag name for Batik's flowRoot extension p element SVG 1.2). */	TokenNameCOMMENT_JAVADOC	 Tag name for Batik's flowRoot extension p element SVG 1.2). 
String	TokenNameIdentifier	 String
SVG_FLOW_PARA_TAG	TokenNameIdentifier	 SVG  FLOW  PARA  TAG
=	TokenNameEQUAL	
"flowPara"	TokenNameStringLiteral	flowPara
;	TokenNameSEMICOLON	
/** Tag name for Batik's flowRoot extension flow Region break * element SVG 1.2). */	TokenNameCOMMENT_JAVADOC	 Tag name for Batik's flowRoot extension flow Region break element SVG 1.2). 
String	TokenNameIdentifier	 String
SVG_FLOW_REGION_BREAK_TAG	TokenNameIdentifier	 SVG  FLOW  REGION  BREAK  TAG
=	TokenNameEQUAL	
"flowRegionBreak"	TokenNameStringLiteral	flowRegionBreak
;	TokenNameSEMICOLON	
/** Tag name for Batik's flowRoot extension line element SVG 1.2). */	TokenNameCOMMENT_JAVADOC	 Tag name for Batik's flowRoot extension line element SVG 1.2). 
String	TokenNameIdentifier	 String
SVG_FLOW_LINE_TAG	TokenNameIdentifier	 SVG  FLOW  LINE  TAG
=	TokenNameEQUAL	
"flowLine"	TokenNameStringLiteral	flowLine
;	TokenNameSEMICOLON	
/** Tag name for Batik's flowRoot extension span element SVG 1.2). */	TokenNameCOMMENT_JAVADOC	 Tag name for Batik's flowRoot extension span element SVG 1.2). 
String	TokenNameIdentifier	 String
SVG_FLOW_SPAN_TAG	TokenNameIdentifier	 SVG  FLOW  SPAN  TAG
=	TokenNameEQUAL	
"flowSpan"	TokenNameStringLiteral	flowSpan
;	TokenNameSEMICOLON	
/** SVG 1.2 'handler' element tag name. */	TokenNameCOMMENT_JAVADOC	 SVG 1.2 'handler' element tag name. 
String	TokenNameIdentifier	 String
SVG_HANDLER_TAG	TokenNameIdentifier	 SVG  HANDLER  TAG
=	TokenNameEQUAL	
"handler"	TokenNameStringLiteral	handler
;	TokenNameSEMICOLON	
/** Tag name for Batik's multiImage extension. */	TokenNameCOMMENT_JAVADOC	 Tag name for Batik's multiImage extension. 
String	TokenNameIdentifier	 String
SVG_MULTI_IMAGE_TAG	TokenNameIdentifier	 SVG  MULTI  IMAGE  TAG
=	TokenNameEQUAL	
"multiImage"	TokenNameStringLiteral	multiImage
;	TokenNameSEMICOLON	
/** Tag name for Batik's solid color extension (SVG 1.2). */	TokenNameCOMMENT_JAVADOC	 Tag name for Batik's solid color extension (SVG 1.2). 
String	TokenNameIdentifier	 String
SVG_SOLID_COLOR_TAG	TokenNameIdentifier	 SVG  SOLID  COLOR  TAG
=	TokenNameEQUAL	
"solidColor"	TokenNameStringLiteral	solidColor
;	TokenNameSEMICOLON	
/** Tag name for Batik's subImage multiImage extension. */	TokenNameCOMMENT_JAVADOC	 Tag name for Batik's subImage multiImage extension. 
String	TokenNameIdentifier	 String
SVG_SUB_IMAGE_TAG	TokenNameIdentifier	 SVG  SUB  IMAGE  TAG
=	TokenNameEQUAL	
"subImage"	TokenNameStringLiteral	subImage
;	TokenNameSEMICOLON	
/** Tag name for Batik's subImageRef multiImage extension. */	TokenNameCOMMENT_JAVADOC	 Tag name for Batik's subImageRef multiImage extension. 
String	TokenNameIdentifier	 String
SVG_SUB_IMAGE_REF_TAG	TokenNameIdentifier	 SVG  SUB  IMAGE  REF  TAG
=	TokenNameEQUAL	
"subImageRef"	TokenNameStringLiteral	subImageRef
;	TokenNameSEMICOLON	
// SVG 1.2 attribute names /////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	SVG 1.2 attribute names /////////////////////////////////////////////// 
/** Attribute name for filterPrimitiveMarginsUnits */	TokenNameCOMMENT_JAVADOC	 Attribute name for filterPrimitiveMarginsUnits 
String	TokenNameIdentifier	 String
SVG_FILTER_PRIMITIVE_MARGINS_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  FILTER  PRIMITIVE  MARGINS  UNITS  ATTRIBUTE
=	TokenNameEQUAL	
"filterPrimitiveMarginsUnits"	TokenNameStringLiteral	filterPrimitiveMarginsUnits
;	TokenNameSEMICOLON	
/** Attribute name for filterMarginsUnits */	TokenNameCOMMENT_JAVADOC	 Attribute name for filterMarginsUnits 
String	TokenNameIdentifier	 String
SVG_FILTER_MARGINS_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  FILTER  MARGINS  UNITS  ATTRIBUTE
=	TokenNameEQUAL	
"filterMarginsUnits"	TokenNameStringLiteral	filterMarginsUnits
;	TokenNameSEMICOLON	
/** Attribute name for pixel-height attribute */	TokenNameCOMMENT_JAVADOC	 Attribute name for pixel-height attribute 
String	TokenNameIdentifier	 String
SVG_MAX_PIXEL_SIZE_ATTRIBUTE	TokenNameIdentifier	 SVG  MAX  PIXEL  SIZE  ATTRIBUTE
=	TokenNameEQUAL	
"max-pixel-size"	TokenNameStringLiteral	max-pixel-size
;	TokenNameSEMICOLON	
/** Attribute name for pixel-width attribute */	TokenNameCOMMENT_JAVADOC	 Attribute name for pixel-width attribute 
String	TokenNameIdentifier	 String
SVG_MIN_PIXEL_SIZE_ATTRIBUTE	TokenNameIdentifier	 SVG  MIN  PIXEL  SIZE  ATTRIBUTE
=	TokenNameEQUAL	
"min-pixel-size"	TokenNameStringLiteral	min-pixel-size
;	TokenNameSEMICOLON	
/** Attribute name for filter mx attribute */	TokenNameCOMMENT_JAVADOC	 Attribute name for filter mx attribute 
String	TokenNameIdentifier	 String
SVG_MX_ATRIBUTE	TokenNameIdentifier	 SVG  MX  ATRIBUTE
=	TokenNameEQUAL	
"mx"	TokenNameStringLiteral	mx
;	TokenNameSEMICOLON	
/** Attribute name for filter my attribute */	TokenNameCOMMENT_JAVADOC	 Attribute name for filter my attribute 
String	TokenNameIdentifier	 String
SVG_MY_ATRIBUTE	TokenNameIdentifier	 SVG  MY  ATRIBUTE
=	TokenNameEQUAL	
"my"	TokenNameStringLiteral	my
;	TokenNameSEMICOLON	
/** Attribute name for filter mw attribute */	TokenNameCOMMENT_JAVADOC	 Attribute name for filter mw attribute 
String	TokenNameIdentifier	 String
SVG_MW_ATRIBUTE	TokenNameIdentifier	 SVG  MW  ATRIBUTE
=	TokenNameEQUAL	
"mw"	TokenNameStringLiteral	mw
;	TokenNameSEMICOLON	
/** Attribute name for filter mh attribute */	TokenNameCOMMENT_JAVADOC	 Attribute name for filter mh attribute 
String	TokenNameIdentifier	 String
SVG_MH_ATRIBUTE	TokenNameIdentifier	 SVG  MH  ATRIBUTE
=	TokenNameEQUAL	
"mh"	TokenNameStringLiteral	mh
;	TokenNameSEMICOLON	
// SVG 1.2 attribute default values ////////////////////////////////////// 	TokenNameCOMMENT_LINE	SVG 1.2 attribute default values ////////////////////////////////////// 
/** Default value for filter mx */	TokenNameCOMMENT_JAVADOC	 Default value for filter mx 
String	TokenNameIdentifier	 String
SVG_FILTER_MX_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FILTER  MX  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
/** Default value for filter my */	TokenNameCOMMENT_JAVADOC	 Default value for filter my 
String	TokenNameIdentifier	 String
SVG_FILTER_MY_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FILTER  MY  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
/** Default value for filter mw */	TokenNameCOMMENT_JAVADOC	 Default value for filter mw 
String	TokenNameIdentifier	 String
SVG_FILTER_MW_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FILTER  MW  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
/** Default value for filter mh */	TokenNameCOMMENT_JAVADOC	 Default value for filter mh 
String	TokenNameIdentifier	 String
SVG_FILTER_MH_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FILTER  MH  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
