/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
AbstractColorManager	TokenNameIdentifier	 Abstract Color Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
Value	TokenNameIdentifier	 Value
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
ValueManager	TokenNameIdentifier	 Value Manager
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
CSSConstants	TokenNameIdentifier	 CSS Constants
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
SVGTypes	TokenNameIdentifier	 SVG Types
;	TokenNameSEMICOLON	
/** * This class provides a manager for the 'color' property values. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ColorManager.java 478160 2006-11-22 13:35:06Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides a manager for the 'color' property values. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ColorManager.java 478160 2006-11-22 13:35:06Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
ColorManager	TokenNameIdentifier	 Color Manager
extends	TokenNameextends	
AbstractColorManager	TokenNameIdentifier	 Abstract Color Manager
{	TokenNameLBRACE	
/** * The default color value. */	TokenNameCOMMENT_JAVADOC	 The default color value. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Value	TokenNameIdentifier	 Value
DEFAULT_VALUE	TokenNameIdentifier	 DEFAULT  VALUE
=	TokenNameEQUAL	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
BLACK_RGB_VALUE	TokenNameIdentifier	 BLACK  RGB  VALUE
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Add some identifier values. 	TokenNameCOMMENT_LINE	Add some identifier values. 
// 	TokenNameCOMMENT_LINE	 
static	TokenNamestatic	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ALICEBLUE_VALUE	TokenNameIdentifier	 CSS  ALICEBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
ALICEBLUE_VALUE	TokenNameIdentifier	 ALICEBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ANTIQUEWHITE_VALUE	TokenNameIdentifier	 CSS  ANTIQUEWHITE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
ANTIQUEWHITE_VALUE	TokenNameIdentifier	 ANTIQUEWHITE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_AQUAMARINE_VALUE	TokenNameIdentifier	 CSS  AQUAMARINE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
AQUAMARINE_VALUE	TokenNameIdentifier	 AQUAMARINE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_AZURE_VALUE	TokenNameIdentifier	 CSS  AZURE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
AZURE_VALUE	TokenNameIdentifier	 AZURE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BEIGE_VALUE	TokenNameIdentifier	 CSS  BEIGE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
BEIGE_VALUE	TokenNameIdentifier	 BEIGE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BISQUE_VALUE	TokenNameIdentifier	 CSS  BISQUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
BISQUE_VALUE	TokenNameIdentifier	 BISQUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BLANCHEDALMOND_VALUE	TokenNameIdentifier	 CSS  BLANCHEDALMOND  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
BLANCHEDALMOND_VALUE	TokenNameIdentifier	 BLANCHEDALMOND  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BLUEVIOLET_VALUE	TokenNameIdentifier	 CSS  BLUEVIOLET  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
BLUEVIOLET_VALUE	TokenNameIdentifier	 BLUEVIOLET  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BROWN_VALUE	TokenNameIdentifier	 CSS  BROWN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
BROWN_VALUE	TokenNameIdentifier	 BROWN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BURLYWOOD_VALUE	TokenNameIdentifier	 CSS  BURLYWOOD  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
BURLYWOOD_VALUE	TokenNameIdentifier	 BURLYWOOD  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CADETBLUE_VALUE	TokenNameIdentifier	 CSS  CADETBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
CADETBLUE_VALUE	TokenNameIdentifier	 CADETBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CHARTREUSE_VALUE	TokenNameIdentifier	 CSS  CHARTREUSE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
CHARTREUSE_VALUE	TokenNameIdentifier	 CHARTREUSE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CHOCOLATE_VALUE	TokenNameIdentifier	 CSS  CHOCOLATE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
CHOCOLATE_VALUE	TokenNameIdentifier	 CHOCOLATE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CORAL_VALUE	TokenNameIdentifier	 CSS  CORAL  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
CORAL_VALUE	TokenNameIdentifier	 CORAL  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CORNFLOWERBLUE_VALUE	TokenNameIdentifier	 CSS  CORNFLOWERBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
CORNFLOWERBLUE_VALUE	TokenNameIdentifier	 CORNFLOWERBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CORNSILK_VALUE	TokenNameIdentifier	 CSS  CORNSILK  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
CORNSILK_VALUE	TokenNameIdentifier	 CORNSILK  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CRIMSON_VALUE	TokenNameIdentifier	 CSS  CRIMSON  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
CRIMSON_VALUE	TokenNameIdentifier	 CRIMSON  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CYAN_VALUE	TokenNameIdentifier	 CSS  CYAN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
CYAN_VALUE	TokenNameIdentifier	 CYAN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKBLUE_VALUE	TokenNameIdentifier	 CSS  DARKBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKBLUE_VALUE	TokenNameIdentifier	 DARKBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKCYAN_VALUE	TokenNameIdentifier	 CSS  DARKCYAN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKCYAN_VALUE	TokenNameIdentifier	 DARKCYAN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKGOLDENROD_VALUE	TokenNameIdentifier	 CSS  DARKGOLDENROD  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKGOLDENROD_VALUE	TokenNameIdentifier	 DARKGOLDENROD  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKGRAY_VALUE	TokenNameIdentifier	 CSS  DARKGRAY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKGRAY_VALUE	TokenNameIdentifier	 DARKGRAY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKGREEN_VALUE	TokenNameIdentifier	 CSS  DARKGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKGREEN_VALUE	TokenNameIdentifier	 DARKGREEN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKGREY_VALUE	TokenNameIdentifier	 CSS  DARKGREY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKGREY_VALUE	TokenNameIdentifier	 DARKGREY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKKHAKI_VALUE	TokenNameIdentifier	 CSS  DARKKHAKI  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKKHAKI_VALUE	TokenNameIdentifier	 DARKKHAKI  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKMAGENTA_VALUE	TokenNameIdentifier	 CSS  DARKMAGENTA  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKMAGENTA_VALUE	TokenNameIdentifier	 DARKMAGENTA  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKOLIVEGREEN_VALUE	TokenNameIdentifier	 CSS  DARKOLIVEGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKOLIVEGREEN_VALUE	TokenNameIdentifier	 DARKOLIVEGREEN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKORANGE_VALUE	TokenNameIdentifier	 CSS  DARKORANGE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKORANGE_VALUE	TokenNameIdentifier	 DARKORANGE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKORCHID_VALUE	TokenNameIdentifier	 CSS  DARKORCHID  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKORCHID_VALUE	TokenNameIdentifier	 DARKORCHID  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKRED_VALUE	TokenNameIdentifier	 CSS  DARKRED  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKRED_VALUE	TokenNameIdentifier	 DARKRED  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKSALMON_VALUE	TokenNameIdentifier	 CSS  DARKSALMON  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKSALMON_VALUE	TokenNameIdentifier	 DARKSALMON  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKSEAGREEN_VALUE	TokenNameIdentifier	 CSS  DARKSEAGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKSEAGREEN_VALUE	TokenNameIdentifier	 DARKSEAGREEN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKSLATEBLUE_VALUE	TokenNameIdentifier	 CSS  DARKSLATEBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKSLATEBLUE_VALUE	TokenNameIdentifier	 DARKSLATEBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKSLATEGRAY_VALUE	TokenNameIdentifier	 CSS  DARKSLATEGRAY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKSLATEGRAY_VALUE	TokenNameIdentifier	 DARKSLATEGRAY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKSLATEGREY_VALUE	TokenNameIdentifier	 CSS  DARKSLATEGREY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKSLATEGREY_VALUE	TokenNameIdentifier	 DARKSLATEGREY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKTURQUOISE_VALUE	TokenNameIdentifier	 CSS  DARKTURQUOISE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKTURQUOISE_VALUE	TokenNameIdentifier	 DARKTURQUOISE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKVIOLET_VALUE	TokenNameIdentifier	 CSS  DARKVIOLET  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKVIOLET_VALUE	TokenNameIdentifier	 DARKVIOLET  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DEEPPINK_VALUE	TokenNameIdentifier	 CSS  DEEPPINK  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DEEPPINK_VALUE	TokenNameIdentifier	 DEEPPINK  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DEEPSKYBLUE_VALUE	TokenNameIdentifier	 CSS  DEEPSKYBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DEEPSKYBLUE_VALUE	TokenNameIdentifier	 DEEPSKYBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DIMGRAY_VALUE	TokenNameIdentifier	 CSS  DIMGRAY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DIMGRAY_VALUE	TokenNameIdentifier	 DIMGRAY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DIMGREY_VALUE	TokenNameIdentifier	 CSS  DIMGREY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DIMGREY_VALUE	TokenNameIdentifier	 DIMGREY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DODGERBLUE_VALUE	TokenNameIdentifier	 CSS  DODGERBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DODGERBLUE_VALUE	TokenNameIdentifier	 DODGERBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FIREBRICK_VALUE	TokenNameIdentifier	 CSS  FIREBRICK  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
FIREBRICK_VALUE	TokenNameIdentifier	 FIREBRICK  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FLORALWHITE_VALUE	TokenNameIdentifier	 CSS  FLORALWHITE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
FLORALWHITE_VALUE	TokenNameIdentifier	 FLORALWHITE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FORESTGREEN_VALUE	TokenNameIdentifier	 CSS  FORESTGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
FORESTGREEN_VALUE	TokenNameIdentifier	 FORESTGREEN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GAINSBORO_VALUE	TokenNameIdentifier	 CSS  GAINSBORO  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
GAINSBORO_VALUE	TokenNameIdentifier	 GAINSBORO  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GHOSTWHITE_VALUE	TokenNameIdentifier	 CSS  GHOSTWHITE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
GHOSTWHITE_VALUE	TokenNameIdentifier	 GHOSTWHITE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GOLD_VALUE	TokenNameIdentifier	 CSS  GOLD  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
GOLD_VALUE	TokenNameIdentifier	 GOLD  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GOLDENROD_VALUE	TokenNameIdentifier	 CSS  GOLDENROD  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
GOLDENROD_VALUE	TokenNameIdentifier	 GOLDENROD  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GREENYELLOW_VALUE	TokenNameIdentifier	 CSS  GREENYELLOW  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
GREENYELLOW_VALUE	TokenNameIdentifier	 GREENYELLOW  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GREY_VALUE	TokenNameIdentifier	 CSS  GREY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
GREY_VALUE	TokenNameIdentifier	 GREY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_HONEYDEW_VALUE	TokenNameIdentifier	 CSS  HONEYDEW  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
HONEYDEW_VALUE	TokenNameIdentifier	 HONEYDEW  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_HOTPINK_VALUE	TokenNameIdentifier	 CSS  HOTPINK  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
HOTPINK_VALUE	TokenNameIdentifier	 HOTPINK  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_INDIANRED_VALUE	TokenNameIdentifier	 CSS  INDIANRED  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
INDIANRED_VALUE	TokenNameIdentifier	 INDIANRED  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_INDIGO_VALUE	TokenNameIdentifier	 CSS  INDIGO  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
INDIGO_VALUE	TokenNameIdentifier	 INDIGO  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_IVORY_VALUE	TokenNameIdentifier	 CSS  IVORY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
IVORY_VALUE	TokenNameIdentifier	 IVORY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_KHAKI_VALUE	TokenNameIdentifier	 CSS  KHAKI  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
KHAKI_VALUE	TokenNameIdentifier	 KHAKI  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LAVENDER_VALUE	TokenNameIdentifier	 CSS  LAVENDER  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LAVENDER_VALUE	TokenNameIdentifier	 LAVENDER  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LAVENDERBLUSH_VALUE	TokenNameIdentifier	 CSS  LAVENDERBLUSH  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LAVENDERBLUSH_VALUE	TokenNameIdentifier	 LAVENDERBLUSH  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LAWNGREEN_VALUE	TokenNameIdentifier	 CSS  LAWNGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LAWNGREEN_VALUE	TokenNameIdentifier	 LAWNGREEN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LEMONCHIFFON_VALUE	TokenNameIdentifier	 CSS  LEMONCHIFFON  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LEMONCHIFFON_VALUE	TokenNameIdentifier	 LEMONCHIFFON  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTBLUE_VALUE	TokenNameIdentifier	 CSS  LIGHTBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTBLUE_VALUE	TokenNameIdentifier	 LIGHTBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTCORAL_VALUE	TokenNameIdentifier	 CSS  LIGHTCORAL  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTCORAL_VALUE	TokenNameIdentifier	 LIGHTCORAL  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTCYAN_VALUE	TokenNameIdentifier	 CSS  LIGHTCYAN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTCYAN_VALUE	TokenNameIdentifier	 LIGHTCYAN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTGOLDENRODYELLOW_VALUE	TokenNameIdentifier	 CSS  LIGHTGOLDENRODYELLOW  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTGOLDENRODYELLOW_VALUE	TokenNameIdentifier	 LIGHTGOLDENRODYELLOW  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTGRAY_VALUE	TokenNameIdentifier	 CSS  LIGHTGRAY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTGRAY_VALUE	TokenNameIdentifier	 LIGHTGRAY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTGREEN_VALUE	TokenNameIdentifier	 CSS  LIGHTGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTGREEN_VALUE	TokenNameIdentifier	 LIGHTGREEN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTGREY_VALUE	TokenNameIdentifier	 CSS  LIGHTGREY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTGREY_VALUE	TokenNameIdentifier	 LIGHTGREY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTPINK_VALUE	TokenNameIdentifier	 CSS  LIGHTPINK  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTPINK_VALUE	TokenNameIdentifier	 LIGHTPINK  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTSALMON_VALUE	TokenNameIdentifier	 CSS  LIGHTSALMON  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTSALMON_VALUE	TokenNameIdentifier	 LIGHTSALMON  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTSEAGREEN_VALUE	TokenNameIdentifier	 CSS  LIGHTSEAGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTSEAGREEN_VALUE	TokenNameIdentifier	 LIGHTSEAGREEN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTSKYBLUE_VALUE	TokenNameIdentifier	 CSS  LIGHTSKYBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTSKYBLUE_VALUE	TokenNameIdentifier	 LIGHTSKYBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTSLATEGRAY_VALUE	TokenNameIdentifier	 CSS  LIGHTSLATEGRAY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTSLATEGRAY_VALUE	TokenNameIdentifier	 LIGHTSLATEGRAY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTSLATEGREY_VALUE	TokenNameIdentifier	 CSS  LIGHTSLATEGREY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTSLATEGREY_VALUE	TokenNameIdentifier	 LIGHTSLATEGREY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTSTEELBLUE_VALUE	TokenNameIdentifier	 CSS  LIGHTSTEELBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTSTEELBLUE_VALUE	TokenNameIdentifier	 LIGHTSTEELBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTYELLOW_VALUE	TokenNameIdentifier	 CSS  LIGHTYELLOW  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTYELLOW_VALUE	TokenNameIdentifier	 LIGHTYELLOW  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIMEGREEN_VALUE	TokenNameIdentifier	 CSS  LIMEGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIMEGREEN_VALUE	TokenNameIdentifier	 LIMEGREEN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LINEN_VALUE	TokenNameIdentifier	 CSS  LINEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LINEN_VALUE	TokenNameIdentifier	 LINEN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MAGENTA_VALUE	TokenNameIdentifier	 CSS  MAGENTA  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MAGENTA_VALUE	TokenNameIdentifier	 MAGENTA  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMAQUAMARINE_VALUE	TokenNameIdentifier	 CSS  MEDIUMAQUAMARINE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMAQUAMARINE_VALUE	TokenNameIdentifier	 MEDIUMAQUAMARINE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMBLUE_VALUE	TokenNameIdentifier	 CSS  MEDIUMBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMBLUE_VALUE	TokenNameIdentifier	 MEDIUMBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMORCHID_VALUE	TokenNameIdentifier	 CSS  MEDIUMORCHID  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMORCHID_VALUE	TokenNameIdentifier	 MEDIUMORCHID  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMPURPLE_VALUE	TokenNameIdentifier	 CSS  MEDIUMPURPLE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMPURPLE_VALUE	TokenNameIdentifier	 MEDIUMPURPLE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMSEAGREEN_VALUE	TokenNameIdentifier	 CSS  MEDIUMSEAGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMSEAGREEN_VALUE	TokenNameIdentifier	 MEDIUMSEAGREEN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMSLATEBLUE_VALUE	TokenNameIdentifier	 CSS  MEDIUMSLATEBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMSLATEBLUE_VALUE	TokenNameIdentifier	 MEDIUMSLATEBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMSPRINGGREEN_VALUE	TokenNameIdentifier	 CSS  MEDIUMSPRINGGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMSPRINGGREEN_VALUE	TokenNameIdentifier	 MEDIUMSPRINGGREEN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMTURQUOISE_VALUE	TokenNameIdentifier	 CSS  MEDIUMTURQUOISE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMTURQUOISE_VALUE	TokenNameIdentifier	 MEDIUMTURQUOISE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMVIOLETRED_VALUE	TokenNameIdentifier	 CSS  MEDIUMVIOLETRED  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMVIOLETRED_VALUE	TokenNameIdentifier	 MEDIUMVIOLETRED  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MIDNIGHTBLUE_VALUE	TokenNameIdentifier	 CSS  MIDNIGHTBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MIDNIGHTBLUE_VALUE	TokenNameIdentifier	 MIDNIGHTBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MINTCREAM_VALUE	TokenNameIdentifier	 CSS  MINTCREAM  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MINTCREAM_VALUE	TokenNameIdentifier	 MINTCREAM  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MISTYROSE_VALUE	TokenNameIdentifier	 CSS  MISTYROSE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MISTYROSE_VALUE	TokenNameIdentifier	 MISTYROSE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MOCCASIN_VALUE	TokenNameIdentifier	 CSS  MOCCASIN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MOCCASIN_VALUE	TokenNameIdentifier	 MOCCASIN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_NAVAJOWHITE_VALUE	TokenNameIdentifier	 CSS  NAVAJOWHITE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
NAVAJOWHITE_VALUE	TokenNameIdentifier	 NAVAJOWHITE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_OLDLACE_VALUE	TokenNameIdentifier	 CSS  OLDLACE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
OLDLACE_VALUE	TokenNameIdentifier	 OLDLACE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_OLIVEDRAB_VALUE	TokenNameIdentifier	 CSS  OLIVEDRAB  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
OLIVEDRAB_VALUE	TokenNameIdentifier	 OLIVEDRAB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ORANGE_VALUE	TokenNameIdentifier	 CSS  ORANGE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
ORANGE_VALUE	TokenNameIdentifier	 ORANGE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ORANGERED_VALUE	TokenNameIdentifier	 CSS  ORANGERED  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
ORANGERED_VALUE	TokenNameIdentifier	 ORANGERED  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ORCHID_VALUE	TokenNameIdentifier	 CSS  ORCHID  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
ORCHID_VALUE	TokenNameIdentifier	 ORCHID  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PALEGOLDENROD_VALUE	TokenNameIdentifier	 CSS  PALEGOLDENROD  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PALEGOLDENROD_VALUE	TokenNameIdentifier	 PALEGOLDENROD  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PALEGREEN_VALUE	TokenNameIdentifier	 CSS  PALEGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PALEGREEN_VALUE	TokenNameIdentifier	 PALEGREEN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PALETURQUOISE_VALUE	TokenNameIdentifier	 CSS  PALETURQUOISE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PALETURQUOISE_VALUE	TokenNameIdentifier	 PALETURQUOISE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PALEVIOLETRED_VALUE	TokenNameIdentifier	 CSS  PALEVIOLETRED  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PALEVIOLETRED_VALUE	TokenNameIdentifier	 PALEVIOLETRED  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PAPAYAWHIP_VALUE	TokenNameIdentifier	 CSS  PAPAYAWHIP  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PAPAYAWHIP_VALUE	TokenNameIdentifier	 PAPAYAWHIP  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PEACHPUFF_VALUE	TokenNameIdentifier	 CSS  PEACHPUFF  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PEACHPUFF_VALUE	TokenNameIdentifier	 PEACHPUFF  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PERU_VALUE	TokenNameIdentifier	 CSS  PERU  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PERU_VALUE	TokenNameIdentifier	 PERU  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PINK_VALUE	TokenNameIdentifier	 CSS  PINK  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PINK_VALUE	TokenNameIdentifier	 PINK  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PLUM_VALUE	TokenNameIdentifier	 CSS  PLUM  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PLUM_VALUE	TokenNameIdentifier	 PLUM  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_POWDERBLUE_VALUE	TokenNameIdentifier	 CSS  POWDERBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
POWDERBLUE_VALUE	TokenNameIdentifier	 POWDERBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PURPLE_VALUE	TokenNameIdentifier	 CSS  PURPLE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PURPLE_VALUE	TokenNameIdentifier	 PURPLE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ROSYBROWN_VALUE	TokenNameIdentifier	 CSS  ROSYBROWN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
ROSYBROWN_VALUE	TokenNameIdentifier	 ROSYBROWN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ROYALBLUE_VALUE	TokenNameIdentifier	 CSS  ROYALBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
ROYALBLUE_VALUE	TokenNameIdentifier	 ROYALBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SADDLEBROWN_VALUE	TokenNameIdentifier	 CSS  SADDLEBROWN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SADDLEBROWN_VALUE	TokenNameIdentifier	 SADDLEBROWN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SALMON_VALUE	TokenNameIdentifier	 CSS  SALMON  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SALMON_VALUE	TokenNameIdentifier	 SALMON  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SANDYBROWN_VALUE	TokenNameIdentifier	 CSS  SANDYBROWN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SANDYBROWN_VALUE	TokenNameIdentifier	 SANDYBROWN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SEAGREEN_VALUE	TokenNameIdentifier	 CSS  SEAGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SEAGREEN_VALUE	TokenNameIdentifier	 SEAGREEN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SEASHELL_VALUE	TokenNameIdentifier	 CSS  SEASHELL  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SEASHELL_VALUE	TokenNameIdentifier	 SEASHELL  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SIENNA_VALUE	TokenNameIdentifier	 CSS  SIENNA  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SIENNA_VALUE	TokenNameIdentifier	 SIENNA  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SKYBLUE_VALUE	TokenNameIdentifier	 CSS  SKYBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SKYBLUE_VALUE	TokenNameIdentifier	 SKYBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SLATEBLUE_VALUE	TokenNameIdentifier	 CSS  SLATEBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SLATEBLUE_VALUE	TokenNameIdentifier	 SLATEBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SLATEGRAY_VALUE	TokenNameIdentifier	 CSS  SLATEGRAY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SLATEGRAY_VALUE	TokenNameIdentifier	 SLATEGRAY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SLATEGREY_VALUE	TokenNameIdentifier	 CSS  SLATEGREY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SLATEGREY_VALUE	TokenNameIdentifier	 SLATEGREY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SNOW_VALUE	TokenNameIdentifier	 CSS  SNOW  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SNOW_VALUE	TokenNameIdentifier	 SNOW  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SPRINGGREEN_VALUE	TokenNameIdentifier	 CSS  SPRINGGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SPRINGGREEN_VALUE	TokenNameIdentifier	 SPRINGGREEN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_STEELBLUE_VALUE	TokenNameIdentifier	 CSS  STEELBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
STEELBLUE_VALUE	TokenNameIdentifier	 STEELBLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_TAN_VALUE	TokenNameIdentifier	 CSS  TAN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
TAN_VALUE	TokenNameIdentifier	 TAN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_THISTLE_VALUE	TokenNameIdentifier	 CSS  THISTLE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
THISTLE_VALUE	TokenNameIdentifier	 THISTLE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_TOMATO_VALUE	TokenNameIdentifier	 CSS  TOMATO  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
TOMATO_VALUE	TokenNameIdentifier	 TOMATO  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_TURQUOISE_VALUE	TokenNameIdentifier	 CSS  TURQUOISE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
TURQUOISE_VALUE	TokenNameIdentifier	 TURQUOISE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_VIOLET_VALUE	TokenNameIdentifier	 CSS  VIOLET  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
VIOLET_VALUE	TokenNameIdentifier	 VIOLET  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_WHEAT_VALUE	TokenNameIdentifier	 CSS  WHEAT  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
WHEAT_VALUE	TokenNameIdentifier	 WHEAT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_WHITESMOKE_VALUE	TokenNameIdentifier	 CSS  WHITESMOKE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
WHITESMOKE_VALUE	TokenNameIdentifier	 WHITESMOKE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_YELLOWGREEN_VALUE	TokenNameIdentifier	 CSS  YELLOWGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
YELLOWGREEN_VALUE	TokenNameIdentifier	 YELLOWGREEN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Add and replace some computed colors. 	TokenNameCOMMENT_LINE	Add and replace some computed colors. 
// 	TokenNameCOMMENT_LINE	 
static	TokenNamestatic	
{	TokenNameLBRACE	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BLACK_VALUE	TokenNameIdentifier	 CSS  BLACK  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
BLACK_RGB_VALUE	TokenNameIdentifier	 BLACK  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SILVER_VALUE	TokenNameIdentifier	 CSS  SILVER  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SILVER_RGB_VALUE	TokenNameIdentifier	 SILVER  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GRAY_VALUE	TokenNameIdentifier	 CSS  GRAY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
GRAY_RGB_VALUE	TokenNameIdentifier	 GRAY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_WHITE_VALUE	TokenNameIdentifier	 CSS  WHITE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
WHITE_RGB_VALUE	TokenNameIdentifier	 WHITE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MAROON_VALUE	TokenNameIdentifier	 CSS  MAROON  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MAROON_RGB_VALUE	TokenNameIdentifier	 MAROON  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_RED_VALUE	TokenNameIdentifier	 CSS  RED  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
RED_RGB_VALUE	TokenNameIdentifier	 RED  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PURPLE_VALUE	TokenNameIdentifier	 CSS  PURPLE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PURPLE_RGB_VALUE	TokenNameIdentifier	 PURPLE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FUCHSIA_VALUE	TokenNameIdentifier	 CSS  FUCHSIA  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
FUCHSIA_RGB_VALUE	TokenNameIdentifier	 FUCHSIA  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GREEN_VALUE	TokenNameIdentifier	 CSS  GREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
GREEN_RGB_VALUE	TokenNameIdentifier	 GREEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIME_VALUE	TokenNameIdentifier	 CSS  LIME  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIME_RGB_VALUE	TokenNameIdentifier	 LIME  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_OLIVE_VALUE	TokenNameIdentifier	 CSS  OLIVE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
OLIVE_RGB_VALUE	TokenNameIdentifier	 OLIVE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_YELLOW_VALUE	TokenNameIdentifier	 CSS  YELLOW  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
YELLOW_RGB_VALUE	TokenNameIdentifier	 YELLOW  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_NAVY_VALUE	TokenNameIdentifier	 CSS  NAVY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
NAVY_RGB_VALUE	TokenNameIdentifier	 NAVY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BLUE_VALUE	TokenNameIdentifier	 CSS  BLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
BLUE_RGB_VALUE	TokenNameIdentifier	 BLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_TEAL_VALUE	TokenNameIdentifier	 CSS  TEAL  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
TEAL_RGB_VALUE	TokenNameIdentifier	 TEAL  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_AQUA_VALUE	TokenNameIdentifier	 CSS  AQUA  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
AQUA_RGB_VALUE	TokenNameIdentifier	 AQUA  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ALICEBLUE_VALUE	TokenNameIdentifier	 CSS  ALICEBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
ALICEBLUE_RGB_VALUE	TokenNameIdentifier	 ALICEBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ANTIQUEWHITE_VALUE	TokenNameIdentifier	 CSS  ANTIQUEWHITE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
ANTIQUEWHITE_RGB_VALUE	TokenNameIdentifier	 ANTIQUEWHITE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_AQUAMARINE_VALUE	TokenNameIdentifier	 CSS  AQUAMARINE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
AQUAMARINE_RGB_VALUE	TokenNameIdentifier	 AQUAMARINE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_AZURE_VALUE	TokenNameIdentifier	 CSS  AZURE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
AZURE_RGB_VALUE	TokenNameIdentifier	 AZURE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BEIGE_VALUE	TokenNameIdentifier	 CSS  BEIGE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
BEIGE_RGB_VALUE	TokenNameIdentifier	 BEIGE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BISQUE_VALUE	TokenNameIdentifier	 CSS  BISQUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
BISQUE_RGB_VALUE	TokenNameIdentifier	 BISQUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BLANCHEDALMOND_VALUE	TokenNameIdentifier	 CSS  BLANCHEDALMOND  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
BLANCHEDALMOND_RGB_VALUE	TokenNameIdentifier	 BLANCHEDALMOND  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BLUEVIOLET_VALUE	TokenNameIdentifier	 CSS  BLUEVIOLET  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
BLUEVIOLET_RGB_VALUE	TokenNameIdentifier	 BLUEVIOLET  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BROWN_VALUE	TokenNameIdentifier	 CSS  BROWN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
BROWN_RGB_VALUE	TokenNameIdentifier	 BROWN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BURLYWOOD_VALUE	TokenNameIdentifier	 CSS  BURLYWOOD  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
BURLYWOOD_RGB_VALUE	TokenNameIdentifier	 BURLYWOOD  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CADETBLUE_VALUE	TokenNameIdentifier	 CSS  CADETBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
CADETBLUE_RGB_VALUE	TokenNameIdentifier	 CADETBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CHARTREUSE_VALUE	TokenNameIdentifier	 CSS  CHARTREUSE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
CHARTREUSE_RGB_VALUE	TokenNameIdentifier	 CHARTREUSE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CHOCOLATE_VALUE	TokenNameIdentifier	 CSS  CHOCOLATE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
CHOCOLATE_RGB_VALUE	TokenNameIdentifier	 CHOCOLATE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CORAL_VALUE	TokenNameIdentifier	 CSS  CORAL  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
CORAL_RGB_VALUE	TokenNameIdentifier	 CORAL  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CORNFLOWERBLUE_VALUE	TokenNameIdentifier	 CSS  CORNFLOWERBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
CORNFLOWERBLUE_RGB_VALUE	TokenNameIdentifier	 CORNFLOWERBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CORNSILK_VALUE	TokenNameIdentifier	 CSS  CORNSILK  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
CORNSILK_RGB_VALUE	TokenNameIdentifier	 CORNSILK  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CRIMSON_VALUE	TokenNameIdentifier	 CSS  CRIMSON  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
CRIMSON_RGB_VALUE	TokenNameIdentifier	 CRIMSON  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CYAN_VALUE	TokenNameIdentifier	 CSS  CYAN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
CYAN_RGB_VALUE	TokenNameIdentifier	 CYAN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKBLUE_VALUE	TokenNameIdentifier	 CSS  DARKBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKBLUE_RGB_VALUE	TokenNameIdentifier	 DARKBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKCYAN_VALUE	TokenNameIdentifier	 CSS  DARKCYAN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKCYAN_RGB_VALUE	TokenNameIdentifier	 DARKCYAN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKGOLDENROD_VALUE	TokenNameIdentifier	 CSS  DARKGOLDENROD  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKGOLDENROD_RGB_VALUE	TokenNameIdentifier	 DARKGOLDENROD  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKGRAY_VALUE	TokenNameIdentifier	 CSS  DARKGRAY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKGRAY_RGB_VALUE	TokenNameIdentifier	 DARKGRAY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKGREEN_VALUE	TokenNameIdentifier	 CSS  DARKGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKGREEN_RGB_VALUE	TokenNameIdentifier	 DARKGREEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKGREY_VALUE	TokenNameIdentifier	 CSS  DARKGREY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKGREY_RGB_VALUE	TokenNameIdentifier	 DARKGREY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKKHAKI_VALUE	TokenNameIdentifier	 CSS  DARKKHAKI  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKKHAKI_RGB_VALUE	TokenNameIdentifier	 DARKKHAKI  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKMAGENTA_VALUE	TokenNameIdentifier	 CSS  DARKMAGENTA  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKMAGENTA_RGB_VALUE	TokenNameIdentifier	 DARKMAGENTA  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKOLIVEGREEN_VALUE	TokenNameIdentifier	 CSS  DARKOLIVEGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKOLIVEGREEN_RGB_VALUE	TokenNameIdentifier	 DARKOLIVEGREEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKORANGE_VALUE	TokenNameIdentifier	 CSS  DARKORANGE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKORANGE_RGB_VALUE	TokenNameIdentifier	 DARKORANGE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKORCHID_VALUE	TokenNameIdentifier	 CSS  DARKORCHID  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKORCHID_RGB_VALUE	TokenNameIdentifier	 DARKORCHID  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKRED_VALUE	TokenNameIdentifier	 CSS  DARKRED  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKRED_RGB_VALUE	TokenNameIdentifier	 DARKRED  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKSALMON_VALUE	TokenNameIdentifier	 CSS  DARKSALMON  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKSALMON_RGB_VALUE	TokenNameIdentifier	 DARKSALMON  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKSEAGREEN_VALUE	TokenNameIdentifier	 CSS  DARKSEAGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKSEAGREEN_RGB_VALUE	TokenNameIdentifier	 DARKSEAGREEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKSLATEBLUE_VALUE	TokenNameIdentifier	 CSS  DARKSLATEBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKSLATEBLUE_RGB_VALUE	TokenNameIdentifier	 DARKSLATEBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKSLATEGRAY_VALUE	TokenNameIdentifier	 CSS  DARKSLATEGRAY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKSLATEGRAY_RGB_VALUE	TokenNameIdentifier	 DARKSLATEGRAY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKSLATEGREY_VALUE	TokenNameIdentifier	 CSS  DARKSLATEGREY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKSLATEGREY_RGB_VALUE	TokenNameIdentifier	 DARKSLATEGREY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKTURQUOISE_VALUE	TokenNameIdentifier	 CSS  DARKTURQUOISE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKTURQUOISE_RGB_VALUE	TokenNameIdentifier	 DARKTURQUOISE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DARKVIOLET_VALUE	TokenNameIdentifier	 CSS  DARKVIOLET  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DARKVIOLET_RGB_VALUE	TokenNameIdentifier	 DARKVIOLET  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DEEPPINK_VALUE	TokenNameIdentifier	 CSS  DEEPPINK  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DEEPPINK_RGB_VALUE	TokenNameIdentifier	 DEEPPINK  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DEEPSKYBLUE_VALUE	TokenNameIdentifier	 CSS  DEEPSKYBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DEEPSKYBLUE_RGB_VALUE	TokenNameIdentifier	 DEEPSKYBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DIMGRAY_VALUE	TokenNameIdentifier	 CSS  DIMGRAY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DIMGRAY_RGB_VALUE	TokenNameIdentifier	 DIMGRAY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DIMGREY_VALUE	TokenNameIdentifier	 CSS  DIMGREY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DIMGREY_RGB_VALUE	TokenNameIdentifier	 DIMGREY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_DODGERBLUE_VALUE	TokenNameIdentifier	 CSS  DODGERBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
DODGERBLUE_RGB_VALUE	TokenNameIdentifier	 DODGERBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FIREBRICK_VALUE	TokenNameIdentifier	 CSS  FIREBRICK  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
FIREBRICK_RGB_VALUE	TokenNameIdentifier	 FIREBRICK  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FLORALWHITE_VALUE	TokenNameIdentifier	 CSS  FLORALWHITE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
FLORALWHITE_RGB_VALUE	TokenNameIdentifier	 FLORALWHITE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FORESTGREEN_VALUE	TokenNameIdentifier	 CSS  FORESTGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
FORESTGREEN_RGB_VALUE	TokenNameIdentifier	 FORESTGREEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GAINSBORO_VALUE	TokenNameIdentifier	 CSS  GAINSBORO  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
GAINSBORO_RGB_VALUE	TokenNameIdentifier	 GAINSBORO  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GHOSTWHITE_VALUE	TokenNameIdentifier	 CSS  GHOSTWHITE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
GHOSTWHITE_RGB_VALUE	TokenNameIdentifier	 GHOSTWHITE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GOLD_VALUE	TokenNameIdentifier	 CSS  GOLD  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
GOLD_RGB_VALUE	TokenNameIdentifier	 GOLD  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GOLDENROD_VALUE	TokenNameIdentifier	 CSS  GOLDENROD  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
GOLDENROD_RGB_VALUE	TokenNameIdentifier	 GOLDENROD  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GREY_VALUE	TokenNameIdentifier	 CSS  GREY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
GREY_RGB_VALUE	TokenNameIdentifier	 GREY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GREENYELLOW_VALUE	TokenNameIdentifier	 CSS  GREENYELLOW  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
GREENYELLOW_RGB_VALUE	TokenNameIdentifier	 GREENYELLOW  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_HONEYDEW_VALUE	TokenNameIdentifier	 CSS  HONEYDEW  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
HONEYDEW_RGB_VALUE	TokenNameIdentifier	 HONEYDEW  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_HOTPINK_VALUE	TokenNameIdentifier	 CSS  HOTPINK  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
HOTPINK_RGB_VALUE	TokenNameIdentifier	 HOTPINK  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_INDIANRED_VALUE	TokenNameIdentifier	 CSS  INDIANRED  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
INDIANRED_RGB_VALUE	TokenNameIdentifier	 INDIANRED  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_INDIGO_VALUE	TokenNameIdentifier	 CSS  INDIGO  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
INDIGO_RGB_VALUE	TokenNameIdentifier	 INDIGO  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_IVORY_VALUE	TokenNameIdentifier	 CSS  IVORY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
IVORY_RGB_VALUE	TokenNameIdentifier	 IVORY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_KHAKI_VALUE	TokenNameIdentifier	 CSS  KHAKI  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
KHAKI_RGB_VALUE	TokenNameIdentifier	 KHAKI  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LAVENDER_VALUE	TokenNameIdentifier	 CSS  LAVENDER  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LAVENDER_RGB_VALUE	TokenNameIdentifier	 LAVENDER  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LAVENDERBLUSH_VALUE	TokenNameIdentifier	 CSS  LAVENDERBLUSH  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LAVENDERBLUSH_RGB_VALUE	TokenNameIdentifier	 LAVENDERBLUSH  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LAWNGREEN_VALUE	TokenNameIdentifier	 CSS  LAWNGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LAWNGREEN_RGB_VALUE	TokenNameIdentifier	 LAWNGREEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LEMONCHIFFON_VALUE	TokenNameIdentifier	 CSS  LEMONCHIFFON  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LEMONCHIFFON_RGB_VALUE	TokenNameIdentifier	 LEMONCHIFFON  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTBLUE_VALUE	TokenNameIdentifier	 CSS  LIGHTBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTBLUE_RGB_VALUE	TokenNameIdentifier	 LIGHTBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTCORAL_VALUE	TokenNameIdentifier	 CSS  LIGHTCORAL  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTCORAL_RGB_VALUE	TokenNameIdentifier	 LIGHTCORAL  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTCYAN_VALUE	TokenNameIdentifier	 CSS  LIGHTCYAN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTCYAN_RGB_VALUE	TokenNameIdentifier	 LIGHTCYAN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTGOLDENRODYELLOW_VALUE	TokenNameIdentifier	 CSS  LIGHTGOLDENRODYELLOW  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTGOLDENRODYELLOW_RGB_VALUE	TokenNameIdentifier	 LIGHTGOLDENRODYELLOW  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTGRAY_VALUE	TokenNameIdentifier	 CSS  LIGHTGRAY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTGRAY_RGB_VALUE	TokenNameIdentifier	 LIGHTGRAY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTGREEN_VALUE	TokenNameIdentifier	 CSS  LIGHTGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTGREEN_RGB_VALUE	TokenNameIdentifier	 LIGHTGREEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTGREY_VALUE	TokenNameIdentifier	 CSS  LIGHTGREY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTGREY_RGB_VALUE	TokenNameIdentifier	 LIGHTGREY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTPINK_VALUE	TokenNameIdentifier	 CSS  LIGHTPINK  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTPINK_RGB_VALUE	TokenNameIdentifier	 LIGHTPINK  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTSALMON_VALUE	TokenNameIdentifier	 CSS  LIGHTSALMON  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTSALMON_RGB_VALUE	TokenNameIdentifier	 LIGHTSALMON  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTSEAGREEN_VALUE	TokenNameIdentifier	 CSS  LIGHTSEAGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTSEAGREEN_RGB_VALUE	TokenNameIdentifier	 LIGHTSEAGREEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTSKYBLUE_VALUE	TokenNameIdentifier	 CSS  LIGHTSKYBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTSKYBLUE_RGB_VALUE	TokenNameIdentifier	 LIGHTSKYBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTSLATEGRAY_VALUE	TokenNameIdentifier	 CSS  LIGHTSLATEGRAY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTSLATEGRAY_RGB_VALUE	TokenNameIdentifier	 LIGHTSLATEGRAY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTSLATEGREY_VALUE	TokenNameIdentifier	 CSS  LIGHTSLATEGREY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTSLATEGREY_RGB_VALUE	TokenNameIdentifier	 LIGHTSLATEGREY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTSTEELBLUE_VALUE	TokenNameIdentifier	 CSS  LIGHTSTEELBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTSTEELBLUE_RGB_VALUE	TokenNameIdentifier	 LIGHTSTEELBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIGHTYELLOW_VALUE	TokenNameIdentifier	 CSS  LIGHTYELLOW  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIGHTYELLOW_RGB_VALUE	TokenNameIdentifier	 LIGHTYELLOW  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIMEGREEN_VALUE	TokenNameIdentifier	 CSS  LIMEGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LIMEGREEN_RGB_VALUE	TokenNameIdentifier	 LIMEGREEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LINEN_VALUE	TokenNameIdentifier	 CSS  LINEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LINEN_RGB_VALUE	TokenNameIdentifier	 LINEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MAGENTA_VALUE	TokenNameIdentifier	 CSS  MAGENTA  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MAGENTA_RGB_VALUE	TokenNameIdentifier	 MAGENTA  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMAQUAMARINE_VALUE	TokenNameIdentifier	 CSS  MEDIUMAQUAMARINE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMAQUAMARINE_RGB_VALUE	TokenNameIdentifier	 MEDIUMAQUAMARINE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMBLUE_VALUE	TokenNameIdentifier	 CSS  MEDIUMBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMBLUE_RGB_VALUE	TokenNameIdentifier	 MEDIUMBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMORCHID_VALUE	TokenNameIdentifier	 CSS  MEDIUMORCHID  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMORCHID_RGB_VALUE	TokenNameIdentifier	 MEDIUMORCHID  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMPURPLE_VALUE	TokenNameIdentifier	 CSS  MEDIUMPURPLE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMPURPLE_RGB_VALUE	TokenNameIdentifier	 MEDIUMPURPLE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMSEAGREEN_VALUE	TokenNameIdentifier	 CSS  MEDIUMSEAGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMSEAGREEN_RGB_VALUE	TokenNameIdentifier	 MEDIUMSEAGREEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMSLATEBLUE_VALUE	TokenNameIdentifier	 CSS  MEDIUMSLATEBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMSLATEBLUE_RGB_VALUE	TokenNameIdentifier	 MEDIUMSLATEBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMSPRINGGREEN_VALUE	TokenNameIdentifier	 CSS  MEDIUMSPRINGGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMSPRINGGREEN_RGB_VALUE	TokenNameIdentifier	 MEDIUMSPRINGGREEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMTURQUOISE_VALUE	TokenNameIdentifier	 CSS  MEDIUMTURQUOISE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMTURQUOISE_RGB_VALUE	TokenNameIdentifier	 MEDIUMTURQUOISE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUMVIOLETRED_VALUE	TokenNameIdentifier	 CSS  MEDIUMVIOLETRED  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MEDIUMVIOLETRED_RGB_VALUE	TokenNameIdentifier	 MEDIUMVIOLETRED  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MIDNIGHTBLUE_VALUE	TokenNameIdentifier	 CSS  MIDNIGHTBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MIDNIGHTBLUE_RGB_VALUE	TokenNameIdentifier	 MIDNIGHTBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MINTCREAM_VALUE	TokenNameIdentifier	 CSS  MINTCREAM  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MINTCREAM_RGB_VALUE	TokenNameIdentifier	 MINTCREAM  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MISTYROSE_VALUE	TokenNameIdentifier	 CSS  MISTYROSE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MISTYROSE_RGB_VALUE	TokenNameIdentifier	 MISTYROSE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MOCCASIN_VALUE	TokenNameIdentifier	 CSS  MOCCASIN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
MOCCASIN_RGB_VALUE	TokenNameIdentifier	 MOCCASIN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_NAVAJOWHITE_VALUE	TokenNameIdentifier	 CSS  NAVAJOWHITE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
NAVAJOWHITE_RGB_VALUE	TokenNameIdentifier	 NAVAJOWHITE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_OLDLACE_VALUE	TokenNameIdentifier	 CSS  OLDLACE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
OLDLACE_RGB_VALUE	TokenNameIdentifier	 OLDLACE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_OLIVEDRAB_VALUE	TokenNameIdentifier	 CSS  OLIVEDRAB  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
OLIVEDRAB_RGB_VALUE	TokenNameIdentifier	 OLIVEDRAB  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ORANGE_VALUE	TokenNameIdentifier	 CSS  ORANGE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
ORANGE_RGB_VALUE	TokenNameIdentifier	 ORANGE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ORANGERED_VALUE	TokenNameIdentifier	 CSS  ORANGERED  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
ORANGERED_RGB_VALUE	TokenNameIdentifier	 ORANGERED  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ORCHID_VALUE	TokenNameIdentifier	 CSS  ORCHID  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
ORCHID_RGB_VALUE	TokenNameIdentifier	 ORCHID  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PALEGOLDENROD_VALUE	TokenNameIdentifier	 CSS  PALEGOLDENROD  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PALEGOLDENROD_RGB_VALUE	TokenNameIdentifier	 PALEGOLDENROD  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PALEGREEN_VALUE	TokenNameIdentifier	 CSS  PALEGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PALEGREEN_RGB_VALUE	TokenNameIdentifier	 PALEGREEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PALETURQUOISE_VALUE	TokenNameIdentifier	 CSS  PALETURQUOISE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PALETURQUOISE_RGB_VALUE	TokenNameIdentifier	 PALETURQUOISE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PALEVIOLETRED_VALUE	TokenNameIdentifier	 CSS  PALEVIOLETRED  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PALEVIOLETRED_RGB_VALUE	TokenNameIdentifier	 PALEVIOLETRED  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PAPAYAWHIP_VALUE	TokenNameIdentifier	 CSS  PAPAYAWHIP  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PAPAYAWHIP_RGB_VALUE	TokenNameIdentifier	 PAPAYAWHIP  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PEACHPUFF_VALUE	TokenNameIdentifier	 CSS  PEACHPUFF  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PEACHPUFF_RGB_VALUE	TokenNameIdentifier	 PEACHPUFF  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PERU_VALUE	TokenNameIdentifier	 CSS  PERU  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PERU_RGB_VALUE	TokenNameIdentifier	 PERU  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PINK_VALUE	TokenNameIdentifier	 CSS  PINK  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PINK_RGB_VALUE	TokenNameIdentifier	 PINK  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PLUM_VALUE	TokenNameIdentifier	 CSS  PLUM  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PLUM_RGB_VALUE	TokenNameIdentifier	 PLUM  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_POWDERBLUE_VALUE	TokenNameIdentifier	 CSS  POWDERBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
POWDERBLUE_RGB_VALUE	TokenNameIdentifier	 POWDERBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PURPLE_VALUE	TokenNameIdentifier	 CSS  PURPLE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PURPLE_RGB_VALUE	TokenNameIdentifier	 PURPLE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ROSYBROWN_VALUE	TokenNameIdentifier	 CSS  ROSYBROWN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
ROSYBROWN_RGB_VALUE	TokenNameIdentifier	 ROSYBROWN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ROYALBLUE_VALUE	TokenNameIdentifier	 CSS  ROYALBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
ROYALBLUE_RGB_VALUE	TokenNameIdentifier	 ROYALBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SADDLEBROWN_VALUE	TokenNameIdentifier	 CSS  SADDLEBROWN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SADDLEBROWN_RGB_VALUE	TokenNameIdentifier	 SADDLEBROWN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SALMON_VALUE	TokenNameIdentifier	 CSS  SALMON  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SALMON_RGB_VALUE	TokenNameIdentifier	 SALMON  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SANDYBROWN_VALUE	TokenNameIdentifier	 CSS  SANDYBROWN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SANDYBROWN_RGB_VALUE	TokenNameIdentifier	 SANDYBROWN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SEAGREEN_VALUE	TokenNameIdentifier	 CSS  SEAGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SEAGREEN_RGB_VALUE	TokenNameIdentifier	 SEAGREEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SEASHELL_VALUE	TokenNameIdentifier	 CSS  SEASHELL  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SEASHELL_RGB_VALUE	TokenNameIdentifier	 SEASHELL  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SIENNA_VALUE	TokenNameIdentifier	 CSS  SIENNA  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SIENNA_RGB_VALUE	TokenNameIdentifier	 SIENNA  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SKYBLUE_VALUE	TokenNameIdentifier	 CSS  SKYBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SKYBLUE_RGB_VALUE	TokenNameIdentifier	 SKYBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SLATEBLUE_VALUE	TokenNameIdentifier	 CSS  SLATEBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SLATEBLUE_RGB_VALUE	TokenNameIdentifier	 SLATEBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SLATEGRAY_VALUE	TokenNameIdentifier	 CSS  SLATEGRAY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SLATEGRAY_RGB_VALUE	TokenNameIdentifier	 SLATEGRAY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SLATEGREY_VALUE	TokenNameIdentifier	 CSS  SLATEGREY  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SLATEGREY_RGB_VALUE	TokenNameIdentifier	 SLATEGREY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SNOW_VALUE	TokenNameIdentifier	 CSS  SNOW  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SNOW_RGB_VALUE	TokenNameIdentifier	 SNOW  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SPRINGGREEN_VALUE	TokenNameIdentifier	 CSS  SPRINGGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SPRINGGREEN_RGB_VALUE	TokenNameIdentifier	 SPRINGGREEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_STEELBLUE_VALUE	TokenNameIdentifier	 CSS  STEELBLUE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
STEELBLUE_RGB_VALUE	TokenNameIdentifier	 STEELBLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_TAN_VALUE	TokenNameIdentifier	 CSS  TAN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
TAN_RGB_VALUE	TokenNameIdentifier	 TAN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_THISTLE_VALUE	TokenNameIdentifier	 CSS  THISTLE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
THISTLE_RGB_VALUE	TokenNameIdentifier	 THISTLE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_TOMATO_VALUE	TokenNameIdentifier	 CSS  TOMATO  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
TOMATO_RGB_VALUE	TokenNameIdentifier	 TOMATO  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_TURQUOISE_VALUE	TokenNameIdentifier	 CSS  TURQUOISE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
TURQUOISE_RGB_VALUE	TokenNameIdentifier	 TURQUOISE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_VIOLET_VALUE	TokenNameIdentifier	 CSS  VIOLET  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
VIOLET_RGB_VALUE	TokenNameIdentifier	 VIOLET  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_WHEAT_VALUE	TokenNameIdentifier	 CSS  WHEAT  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
WHEAT_RGB_VALUE	TokenNameIdentifier	 WHEAT  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_WHITESMOKE_VALUE	TokenNameIdentifier	 CSS  WHITESMOKE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
WHITESMOKE_RGB_VALUE	TokenNameIdentifier	 WHITESMOKE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_YELLOWGREEN_VALUE	TokenNameIdentifier	 CSS  YELLOWGREEN  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
YELLOWGREEN_RGB_VALUE	TokenNameIdentifier	 YELLOWGREEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.css.engine.value.ValueManager#isInheritedProperty()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.css.engine.value.ValueManager#isInheritedProperty()}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isInheritedProperty	TokenNameIdentifier	 is Inherited Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link ValueManager#isAnimatableProperty()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#isAnimatableProperty()}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAnimatableProperty	TokenNameIdentifier	 is Animatable Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link ValueManager#isAdditiveProperty()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#isAdditiveProperty()}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAdditiveProperty	TokenNameIdentifier	 is Additive Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link ValueManager#getPropertyType()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#getPropertyType()}. 
public	TokenNamepublic	
int	TokenNameint	
getPropertyType	TokenNameIdentifier	 get Property Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_COLOR	TokenNameIdentifier	 TYPE  COLOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.css.engine.value.ValueManager#getPropertyName()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.css.engine.value.ValueManager#getPropertyName()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPropertyName	TokenNameIdentifier	 get Property Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_COLOR_PROPERTY	TokenNameIdentifier	 CSS  COLOR  PROPERTY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.css.engine.value.ValueManager#getDefaultValue()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.css.engine.value.ValueManager#getDefaultValue()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getDefaultValue	TokenNameIdentifier	 get Default Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DEFAULT_VALUE	TokenNameIdentifier	 DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
