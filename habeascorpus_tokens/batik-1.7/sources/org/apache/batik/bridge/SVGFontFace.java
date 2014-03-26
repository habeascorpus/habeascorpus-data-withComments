/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
GVTFontFamily	TokenNameIdentifier	 GVT Font Family
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * This class represents a &lt;font-face> element or @font-face rule * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: SVGFontFace.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a &lt;font-face> element or @font-face rule * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: SVGFontFace.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGFontFace	TokenNameIdentifier	 SVG Font Face
extends	TokenNameextends	
FontFace	TokenNameIdentifier	 Font Face
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
fontFaceElement	TokenNameIdentifier	 font Face Element
;	TokenNameSEMICOLON	
GVTFontFamily	TokenNameIdentifier	 GVT Font Family
fontFamily	TokenNameIdentifier	 font Family
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructes an SVGFontFace with the specfied font-face attributes. */	TokenNameCOMMENT_JAVADOC	 Constructes an SVGFontFace with the specfied font-face attributes. 
public	TokenNamepublic	
SVGFontFace	TokenNameIdentifier	 SVG Font Face
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
fontFaceElement	TokenNameIdentifier	 font Face Element
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
srcs	TokenNameIdentifier	 srcs
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
familyName	TokenNameIdentifier	 family Name
,	TokenNameCOMMA	
float	TokenNamefloat	
unitsPerEm	TokenNameIdentifier	 units Per Em
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fontWeight	TokenNameIdentifier	 font Weight
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fontStyle	TokenNameIdentifier	 font Style
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fontVariant	TokenNameIdentifier	 font Variant
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fontStretch	TokenNameIdentifier	 font Stretch
,	TokenNameCOMMA	
float	TokenNamefloat	
slope	TokenNameIdentifier	 slope
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
panose1	TokenNameIdentifier	 panose1
,	TokenNameCOMMA	
float	TokenNamefloat	
ascent	TokenNameIdentifier	 ascent
,	TokenNameCOMMA	
float	TokenNamefloat	
descent	TokenNameIdentifier	 descent
,	TokenNameCOMMA	
float	TokenNamefloat	
strikethroughPosition	TokenNameIdentifier	 strikethrough Position
,	TokenNameCOMMA	
float	TokenNamefloat	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
,	TokenNameCOMMA	
float	TokenNamefloat	
underlinePosition	TokenNameIdentifier	 underline Position
,	TokenNameCOMMA	
float	TokenNamefloat	
underlineThickness	TokenNameIdentifier	 underline Thickness
,	TokenNameCOMMA	
float	TokenNamefloat	
overlinePosition	TokenNameIdentifier	 overline Position
,	TokenNameCOMMA	
float	TokenNamefloat	
overlineThickness	TokenNameIdentifier	 overline Thickness
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcs	TokenNameIdentifier	 srcs
,	TokenNameCOMMA	
familyName	TokenNameIdentifier	 family Name
,	TokenNameCOMMA	
unitsPerEm	TokenNameIdentifier	 units Per Em
,	TokenNameCOMMA	
fontWeight	TokenNameIdentifier	 font Weight
,	TokenNameCOMMA	
fontStyle	TokenNameIdentifier	 font Style
,	TokenNameCOMMA	
fontVariant	TokenNameIdentifier	 font Variant
,	TokenNameCOMMA	
fontStretch	TokenNameIdentifier	 font Stretch
,	TokenNameCOMMA	
slope	TokenNameIdentifier	 slope
,	TokenNameCOMMA	
panose1	TokenNameIdentifier	 panose1
,	TokenNameCOMMA	
ascent	TokenNameIdentifier	 ascent
,	TokenNameCOMMA	
descent	TokenNameIdentifier	 descent
,	TokenNameCOMMA	
strikethroughPosition	TokenNameIdentifier	 strikethrough Position
,	TokenNameCOMMA	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
,	TokenNameCOMMA	
underlinePosition	TokenNameIdentifier	 underline Position
,	TokenNameCOMMA	
underlineThickness	TokenNameIdentifier	 underline Thickness
,	TokenNameCOMMA	
overlinePosition	TokenNameIdentifier	 overline Position
,	TokenNameCOMMA	
overlineThickness	TokenNameIdentifier	 overline Thickness
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fontFaceElement	TokenNameIdentifier	 font Face Element
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the font associated with this rule or element. */	TokenNameCOMMENT_JAVADOC	 Returns the font associated with this rule or element. 
public	TokenNamepublic	
GVTFontFamily	TokenNameIdentifier	 GVT Font Family
getFontFamily	TokenNameIdentifier	 get Font Family
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fontFamily	TokenNameIdentifier	 font Family
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
fontFamily	TokenNameIdentifier	 font Family
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
fontElt	TokenNameIdentifier	 font Elt
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
getParentElement	TokenNameIdentifier	 get Parent Element
(	TokenNameLPAREN	
fontFaceElement	TokenNameIdentifier	 font Face Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fontElt	TokenNameIdentifier	 font Elt
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fontElt	TokenNameIdentifier	 font Elt
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_FONT_TAG	TokenNameIdentifier	 SVG  FONT  TAG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SVGFontFamily	TokenNameIdentifier	 SVG Font Family
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
fontElt	TokenNameIdentifier	 font Elt
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fontFamily	TokenNameIdentifier	 font Family
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getFontFamily	TokenNameIdentifier	 get Font Family
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fontFamily	TokenNameIdentifier	 font Family
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getFontFaceElement	TokenNameIdentifier	 get Font Face Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fontFaceElement	TokenNameIdentifier	 font Face Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Default implementation uses the root element of the document * associated with BridgeContext. This is useful for CSS case. */	TokenNameCOMMENT_JAVADOC	 Default implementation uses the root element of the document associated with BridgeContext. This is useful for CSS case. 
protected	TokenNameprotected	
Element	TokenNameIdentifier	 Element
getBaseElement	TokenNameIdentifier	 get Base Element
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fontFaceElement	TokenNameIdentifier	 font Face Element
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
fontFaceElement	TokenNameIdentifier	 font Face Element
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getBaseElement	TokenNameIdentifier	 get Base Element
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
