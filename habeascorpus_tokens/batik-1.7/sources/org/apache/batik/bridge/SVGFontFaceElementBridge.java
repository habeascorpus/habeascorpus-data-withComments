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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AbstractNode	TokenNameIdentifier	 Abstract Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XLinkSupport	TokenNameIdentifier	 X Link Support
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
ParsedURL	TokenNameIdentifier	 Parsed URL
;	TokenNameSEMICOLON	
/** * Bridge class for the &lt;font-face> element. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: SVGFontFaceElementBridge.java 502538 2007-02-02 08:52:56Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;font-face> element. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: SVGFontFaceElementBridge.java 502538 2007-02-02 08:52:56Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGFontFaceElementBridge	TokenNameIdentifier	 SVG Font Face Element Bridge
extends	TokenNameextends	
AbstractSVGBridge	TokenNameIdentifier	 Abstract SVG Bridge
implements	TokenNameimplements	
ErrorConstants	TokenNameIdentifier	 Error Constants
{	TokenNameLBRACE	
/** * Constructs a new bridge for the &lt;font-face> element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the &lt;font-face> element. 
public	TokenNamepublic	
SVGFontFaceElementBridge	TokenNameIdentifier	 SVG Font Face Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'font-face'. */	TokenNameCOMMENT_JAVADOC	 Returns 'font-face'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_FONT_FACE_TAG	TokenNameIdentifier	 SVG  FONT  FACE  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an SVGFontFace that repesents the specified * &lt;font-face> element. * * @param ctx The current bridge context. * @param fontFaceElement The &lt;font-face> element. * * @return A new SVGFontFace. */	TokenNameCOMMENT_JAVADOC	 Creates an SVGFontFace that repesents the specified &lt;font-face> element. * @param ctx The current bridge context. @param fontFaceElement The &lt;font-face> element. * @return A new SVGFontFace. 
public	TokenNamepublic	
SVGFontFace	TokenNameIdentifier	 SVG Font Face
createFontFace	TokenNameIdentifier	 create Font Face
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
fontFaceElement	TokenNameIdentifier	 font Face Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get all the font-face attributes 	TokenNameCOMMENT_LINE	get all the font-face attributes 
String	TokenNameIdentifier	 String
familyNames	TokenNameIdentifier	 family Names
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_FONT_FAMILY_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  FAMILY  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// units per em 	TokenNameCOMMENT_LINE	units per em 
String	TokenNameIdentifier	 String
unitsPerEmStr	TokenNameIdentifier	 units Per Em Str
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_UNITS_PER_EM_ATTRIBUTE	TokenNameIdentifier	 SVG  UNITS  PER  EM  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
unitsPerEmStr	TokenNameIdentifier	 units Per Em Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unitsPerEmStr	TokenNameIdentifier	 units Per Em Str
=	TokenNameEQUAL	
SVG_FONT_FACE_UNITS_PER_EM_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  UNITS  PER  EM  DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
unitsPerEm	TokenNameIdentifier	 units Per Em
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
unitsPerEm	TokenNameIdentifier	 units Per Em
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertSVGNumber	TokenNameIdentifier	 convert SVG Number
(	TokenNameLPAREN	
unitsPerEmStr	TokenNameIdentifier	 units Per Em Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfEx	TokenNameIdentifier	 nf Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
fontFaceElement	TokenNameIdentifier	 font Face Element
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_UNITS_PER_EM_ATTRIBUTE	TokenNameIdentifier	 SVG  UNITS  PER  EM  ATTRIBUTE
,	TokenNameCOMMA	
unitsPerEmStr	TokenNameIdentifier	 units Per Em Str
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// font-weight 	TokenNameCOMMENT_LINE	font-weight 
String	TokenNameIdentifier	 String
fontWeight	TokenNameIdentifier	 font Weight
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_FONT_WEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  WEIGHT  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fontWeight	TokenNameIdentifier	 font Weight
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fontWeight	TokenNameIdentifier	 font Weight
=	TokenNameEQUAL	
SVG_FONT_FACE_FONT_WEIGHT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  FONT  WEIGHT  DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// font-style 	TokenNameCOMMENT_LINE	font-style 
String	TokenNameIdentifier	 String
fontStyle	TokenNameIdentifier	 font Style
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_FONT_STYLE_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  STYLE  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fontStyle	TokenNameIdentifier	 font Style
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fontStyle	TokenNameIdentifier	 font Style
=	TokenNameEQUAL	
SVG_FONT_FACE_FONT_STYLE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  FONT  STYLE  DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// font-variant 	TokenNameCOMMENT_LINE	font-variant 
String	TokenNameIdentifier	 String
fontVariant	TokenNameIdentifier	 font Variant
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_FONT_VARIANT_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  VARIANT  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fontVariant	TokenNameIdentifier	 font Variant
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fontVariant	TokenNameIdentifier	 font Variant
=	TokenNameEQUAL	
SVG_FONT_FACE_FONT_VARIANT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  FONT  VARIANT  DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// font-stretch 	TokenNameCOMMENT_LINE	font-stretch 
String	TokenNameIdentifier	 String
fontStretch	TokenNameIdentifier	 font Stretch
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_FONT_STRETCH_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  STRETCH  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fontStretch	TokenNameIdentifier	 font Stretch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fontStretch	TokenNameIdentifier	 font Stretch
=	TokenNameEQUAL	
SVG_FONT_FACE_FONT_STRETCH_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  FONT  STRETCH  DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// slopeStr 	TokenNameCOMMENT_LINE	slopeStr 
String	TokenNameIdentifier	 String
slopeStr	TokenNameIdentifier	 slope Str
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SLOPE_ATTRIBUTE	TokenNameIdentifier	 SVG  SLOPE  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
slopeStr	TokenNameIdentifier	 slope Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
slopeStr	TokenNameIdentifier	 slope Str
=	TokenNameEQUAL	
SVG_FONT_FACE_SLOPE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  SLOPE  DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
slope	TokenNameIdentifier	 slope
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
slope	TokenNameIdentifier	 slope
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertSVGNumber	TokenNameIdentifier	 convert SVG Number
(	TokenNameLPAREN	
slopeStr	TokenNameIdentifier	 slope Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfEx	TokenNameIdentifier	 nf Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
fontFaceElement	TokenNameIdentifier	 font Face Element
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_FONT_FACE_SLOPE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  SLOPE  DEFAULT  VALUE
,	TokenNameCOMMA	
slopeStr	TokenNameIdentifier	 slope Str
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// panose-1 	TokenNameCOMMENT_LINE	panose-1 
String	TokenNameIdentifier	 String
panose1	TokenNameIdentifier	 panose1
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_PANOSE_1_ATTRIBUTE	TokenNameIdentifier	 SVG  PANOSE 1  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
panose1	TokenNameIdentifier	 panose1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
panose1	TokenNameIdentifier	 panose1
=	TokenNameEQUAL	
SVG_FONT_FACE_PANOSE_1_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  PANOSE 1  DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ascent 	TokenNameCOMMENT_LINE	ascent 
String	TokenNameIdentifier	 String
ascentStr	TokenNameIdentifier	 ascent Str
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ASCENT_ATTRIBUTE	TokenNameIdentifier	 SVG  ASCENT  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ascentStr	TokenNameIdentifier	 ascent Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// set it to be unitsPerEm * .8 	TokenNameCOMMENT_LINE	set it to be unitsPerEm * .8 
ascentStr	TokenNameIdentifier	 ascent Str
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
unitsPerEm	TokenNameIdentifier	 units Per Em
*	TokenNameMULTIPLY	
0.8	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
ascent	TokenNameIdentifier	 ascent
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ascent	TokenNameIdentifier	 ascent
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertSVGNumber	TokenNameIdentifier	 convert SVG Number
(	TokenNameLPAREN	
ascentStr	TokenNameIdentifier	 ascent Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfEx	TokenNameIdentifier	 nf Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
fontFaceElement	TokenNameIdentifier	 font Face Element
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_FONT_FACE_SLOPE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  SLOPE  DEFAULT  VALUE
,	TokenNameCOMMA	
ascentStr	TokenNameIdentifier	 ascent Str
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// descent 	TokenNameCOMMENT_LINE	descent 
String	TokenNameIdentifier	 String
descentStr	TokenNameIdentifier	 descent Str
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_DESCENT_ATTRIBUTE	TokenNameIdentifier	 SVG  DESCENT  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
descentStr	TokenNameIdentifier	 descent Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// set it to be unitsPerEm *.2. 	TokenNameCOMMENT_LINE	set it to be unitsPerEm *.2. 
descentStr	TokenNameIdentifier	 descent Str
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
unitsPerEm	TokenNameIdentifier	 units Per Em
*	TokenNameMULTIPLY	
0.2	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
descent	TokenNameIdentifier	 descent
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
descent	TokenNameIdentifier	 descent
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertSVGNumber	TokenNameIdentifier	 convert SVG Number
(	TokenNameLPAREN	
descentStr	TokenNameIdentifier	 descent Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfEx	TokenNameIdentifier	 nf Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
fontFaceElement	TokenNameIdentifier	 font Face Element
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_FONT_FACE_SLOPE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  SLOPE  DEFAULT  VALUE
,	TokenNameCOMMA	
descentStr	TokenNameIdentifier	 descent Str
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// underline-position 	TokenNameCOMMENT_LINE	underline-position 
String	TokenNameIdentifier	 String
underlinePosStr	TokenNameIdentifier	 underline Pos Str
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_UNDERLINE_POSITION_ATTRIBUTE	TokenNameIdentifier	 SVG  UNDERLINE  POSITION  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
underlinePosStr	TokenNameIdentifier	 underline Pos Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
underlinePosStr	TokenNameIdentifier	 underline Pos Str
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
unitsPerEm	TokenNameIdentifier	 units Per Em
/	TokenNameDIVIDE	
40	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
underlinePos	TokenNameIdentifier	 underline Pos
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
underlinePos	TokenNameIdentifier	 underline Pos
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertSVGNumber	TokenNameIdentifier	 convert SVG Number
(	TokenNameLPAREN	
underlinePosStr	TokenNameIdentifier	 underline Pos Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfEx	TokenNameIdentifier	 nf Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
fontFaceElement	TokenNameIdentifier	 font Face Element
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_FONT_FACE_SLOPE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  SLOPE  DEFAULT  VALUE
,	TokenNameCOMMA	
underlinePosStr	TokenNameIdentifier	 underline Pos Str
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// underline-thickness 	TokenNameCOMMENT_LINE	underline-thickness 
String	TokenNameIdentifier	 String
underlineThicknessStr	TokenNameIdentifier	 underline Thickness Str
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_UNDERLINE_THICKNESS_ATTRIBUTE	TokenNameIdentifier	 SVG  UNDERLINE  THICKNESS  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
underlineThicknessStr	TokenNameIdentifier	 underline Thickness Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
underlineThicknessStr	TokenNameIdentifier	 underline Thickness Str
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
unitsPerEm	TokenNameIdentifier	 units Per Em
/	TokenNameDIVIDE	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
underlineThickness	TokenNameIdentifier	 underline Thickness
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
underlineThickness	TokenNameIdentifier	 underline Thickness
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertSVGNumber	TokenNameIdentifier	 convert SVG Number
(	TokenNameLPAREN	
underlineThicknessStr	TokenNameIdentifier	 underline Thickness Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfEx	TokenNameIdentifier	 nf Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
fontFaceElement	TokenNameIdentifier	 font Face Element
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_FONT_FACE_SLOPE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  SLOPE  DEFAULT  VALUE
,	TokenNameCOMMA	
underlineThicknessStr	TokenNameIdentifier	 underline Thickness Str
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// strikethrough-position 	TokenNameCOMMENT_LINE	strikethrough-position 
String	TokenNameIdentifier	 String
strikethroughPosStr	TokenNameIdentifier	 strikethrough Pos Str
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_STRIKETHROUGH_POSITION_ATTRIBUTE	TokenNameIdentifier	 SVG  STRIKETHROUGH  POSITION  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
strikethroughPosStr	TokenNameIdentifier	 strikethrough Pos Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
strikethroughPosStr	TokenNameIdentifier	 strikethrough Pos Str
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
ascent	TokenNameIdentifier	 ascent
/	TokenNameDIVIDE	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
strikethroughPos	TokenNameIdentifier	 strikethrough Pos
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
strikethroughPos	TokenNameIdentifier	 strikethrough Pos
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertSVGNumber	TokenNameIdentifier	 convert SVG Number
(	TokenNameLPAREN	
strikethroughPosStr	TokenNameIdentifier	 strikethrough Pos Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfEx	TokenNameIdentifier	 nf Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
fontFaceElement	TokenNameIdentifier	 font Face Element
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_FONT_FACE_SLOPE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  SLOPE  DEFAULT  VALUE
,	TokenNameCOMMA	
strikethroughPosStr	TokenNameIdentifier	 strikethrough Pos Str
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// strikethrough-thickness 	TokenNameCOMMENT_LINE	strikethrough-thickness 
String	TokenNameIdentifier	 String
strikethroughThicknessStr	TokenNameIdentifier	 strikethrough Thickness Str
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_STRIKETHROUGH_THICKNESS_ATTRIBUTE	TokenNameIdentifier	 SVG  STRIKETHROUGH  THICKNESS  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
strikethroughThicknessStr	TokenNameIdentifier	 strikethrough Thickness Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
strikethroughThicknessStr	TokenNameIdentifier	 strikethrough Thickness Str
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
unitsPerEm	TokenNameIdentifier	 units Per Em
/	TokenNameDIVIDE	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertSVGNumber	TokenNameIdentifier	 convert SVG Number
(	TokenNameLPAREN	
strikethroughThicknessStr	TokenNameIdentifier	 strikethrough Thickness Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfEx	TokenNameIdentifier	 nf Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
fontFaceElement	TokenNameIdentifier	 font Face Element
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_FONT_FACE_SLOPE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  SLOPE  DEFAULT  VALUE
,	TokenNameCOMMA	
strikethroughThicknessStr	TokenNameIdentifier	 strikethrough Thickness Str
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// overline-position 	TokenNameCOMMENT_LINE	overline-position 
String	TokenNameIdentifier	 String
overlinePosStr	TokenNameIdentifier	 overline Pos Str
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_OVERLINE_POSITION_ATTRIBUTE	TokenNameIdentifier	 SVG  OVERLINE  POSITION  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
overlinePosStr	TokenNameIdentifier	 overline Pos Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
overlinePosStr	TokenNameIdentifier	 overline Pos Str
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
ascent	TokenNameIdentifier	 ascent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
overlinePos	TokenNameIdentifier	 overline Pos
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
overlinePos	TokenNameIdentifier	 overline Pos
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertSVGNumber	TokenNameIdentifier	 convert SVG Number
(	TokenNameLPAREN	
overlinePosStr	TokenNameIdentifier	 overline Pos Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfEx	TokenNameIdentifier	 nf Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
fontFaceElement	TokenNameIdentifier	 font Face Element
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_FONT_FACE_SLOPE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  SLOPE  DEFAULT  VALUE
,	TokenNameCOMMA	
overlinePosStr	TokenNameIdentifier	 overline Pos Str
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// overline-thickness 	TokenNameCOMMENT_LINE	overline-thickness 
String	TokenNameIdentifier	 String
overlineThicknessStr	TokenNameIdentifier	 overline Thickness Str
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_OVERLINE_THICKNESS_ATTRIBUTE	TokenNameIdentifier	 SVG  OVERLINE  THICKNESS  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
overlineThicknessStr	TokenNameIdentifier	 overline Thickness Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
overlineThicknessStr	TokenNameIdentifier	 overline Thickness Str
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
unitsPerEm	TokenNameIdentifier	 units Per Em
/	TokenNameDIVIDE	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
overlineThickness	TokenNameIdentifier	 overline Thickness
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
overlineThickness	TokenNameIdentifier	 overline Thickness
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertSVGNumber	TokenNameIdentifier	 convert SVG Number
(	TokenNameLPAREN	
overlineThicknessStr	TokenNameIdentifier	 overline Thickness Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfEx	TokenNameIdentifier	 nf Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
fontFaceElement	TokenNameIdentifier	 font Face Element
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_FONT_FACE_SLOPE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  SLOPE  DEFAULT  VALUE
,	TokenNameCOMMA	
overlineThicknessStr	TokenNameIdentifier	 overline Thickness Str
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
srcs	TokenNameIdentifier	 srcs
=	TokenNameEQUAL	
null	TokenNamenull	
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
!	TokenNameNOT	
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
||	TokenNameOR_OR	
!	TokenNameNOT	
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
srcs	TokenNameIdentifier	 srcs
=	TokenNameEQUAL	
getFontFaceSrcs	TokenNameIdentifier	 get Font Face Srcs
(	TokenNameLPAREN	
fontFaceElement	TokenNameIdentifier	 font Face Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: get the rest of the attributes 	TokenNameCOMMENT_LINE	TODO: get the rest of the attributes 
return	TokenNamereturn	
new	TokenNamenew	
SVGFontFace	TokenNameIdentifier	 SVG Font Face
(	TokenNameLPAREN	
fontFaceElement	TokenNameIdentifier	 font Face Element
,	TokenNameCOMMA	
srcs	TokenNameIdentifier	 srcs
,	TokenNameCOMMA	
familyNames	TokenNameIdentifier	 family Names
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
strikethroughPos	TokenNameIdentifier	 strikethrough Pos
,	TokenNameCOMMA	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
,	TokenNameCOMMA	
underlinePos	TokenNameIdentifier	 underline Pos
,	TokenNameCOMMA	
underlineThickness	TokenNameIdentifier	 underline Thickness
,	TokenNameCOMMA	
overlinePos	TokenNameIdentifier	 overline Pos
,	TokenNameCOMMA	
overlineThickness	TokenNameIdentifier	 overline Thickness
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * the returned list may contain Strings and ParsedURLs */	TokenNameCOMMENT_JAVADOC	 the returned list may contain Strings and ParsedURLs 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getFontFaceSrcs	TokenNameIdentifier	 get Font Face Srcs
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
fontFaceElement	TokenNameIdentifier	 font Face Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Search for a font-face-src element 	TokenNameCOMMENT_LINE	Search for a font-face-src element 
Element	TokenNameIdentifier	 Element
ffsrc	TokenNameIdentifier	 ffsrc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
fontFaceElement	TokenNameIdentifier	 font Face Element
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
n	TokenNameIdentifier	 n
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
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_FONT_FACE_SRC_TAG	TokenNameIdentifier	 SVG  FONT  FACE  SRC  TAG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ffsrc	TokenNameIdentifier	 ffsrc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ffsrc	TokenNameIdentifier	 ffsrc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Search for a font-face-uri, or font-face-name elements 	TokenNameCOMMENT_LINE	Search for a font-face-uri, or font-face-name elements 
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
ffsrc	TokenNameIdentifier	 ffsrc
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_FONT_FACE_URI_TAG	TokenNameIdentifier	 SVG  FONT  FACE  URI  TAG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
ffuri	TokenNameIdentifier	 ffuri
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
XLinkSupport	TokenNameIdentifier	 X Link Support
.	TokenNameDOT	
getXLinkHref	TokenNameIdentifier	 get X Link Href
(	TokenNameLPAREN	
ffuri	TokenNameIdentifier	 ffuri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
AbstractNode	TokenNameIdentifier	 Abstract Node
.	TokenNameDOT	
getBaseURI	TokenNameIdentifier	 get Base URI
(	TokenNameLPAREN	
ffuri	TokenNameIdentifier	 ffuri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
purl	TokenNameIdentifier	 purl
=	TokenNameEQUAL	
new	TokenNamenew	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
purl	TokenNameIdentifier	 purl
=	TokenNameEQUAL	
new	TokenNamenew	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
purl	TokenNameIdentifier	 purl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// here we add a ParsedURL 	TokenNameCOMMENT_LINE	here we add a ParsedURL 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_FONT_FACE_NAME_TAG	TokenNameIdentifier	 SVG  FONT  FACE  NAME  TAG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
ffname	TokenNameIdentifier	 ffname
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
ffname	TokenNameIdentifier	 ffname
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// here we add a String 	TokenNameCOMMENT_LINE	here we add a String 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
