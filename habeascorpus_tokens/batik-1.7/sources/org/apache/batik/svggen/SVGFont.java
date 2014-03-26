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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Font	TokenNameIdentifier	 Font
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Shape	TokenNameIdentifier	 Shape
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
FontRenderContext	TokenNameIdentifier	 Font Render Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
GlyphMetrics	TokenNameIdentifier	 Glyph Metrics
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
GlyphVector	TokenNameIdentifier	 Glyph Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
LineMetrics	TokenNameIdentifier	 Line Metrics
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
AffineTransform	TokenNameIdentifier	 Affine Transform
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
GraphicContext	TokenNameIdentifier	 Graphic Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
/** * Utility class that converts a Font object into a set of SVG * font attributes * * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGFont.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a Font object into a set of SVG font attributes * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGFont.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGFont	TokenNameIdentifier	 SVG Font
extends	TokenNameextends	
AbstractSVGConverter	TokenNameIdentifier	 Abstract SVG Converter
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
EXTRA_LIGHT	TokenNameIdentifier	 EXTRA  LIGHT
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_EXTRA_LIGHT	TokenNameIdentifier	 WEIGHT  EXTRA  LIGHT
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
LIGHT	TokenNameIdentifier	 LIGHT
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_LIGHT	TokenNameIdentifier	 WEIGHT  LIGHT
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
DEMILIGHT	TokenNameIdentifier	 DEMILIGHT
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_DEMILIGHT	TokenNameIdentifier	 WEIGHT  DEMILIGHT
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
REGULAR	TokenNameIdentifier	 REGULAR
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_REGULAR	TokenNameIdentifier	 WEIGHT  REGULAR
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
SEMIBOLD	TokenNameIdentifier	 SEMIBOLD
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_SEMIBOLD	TokenNameIdentifier	 WEIGHT  SEMIBOLD
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
MEDIUM	TokenNameIdentifier	 MEDIUM
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_MEDIUM	TokenNameIdentifier	 WEIGHT  MEDIUM
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
DEMIBOLD	TokenNameIdentifier	 DEMIBOLD
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_DEMIBOLD	TokenNameIdentifier	 WEIGHT  DEMIBOLD
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
BOLD	TokenNameIdentifier	 BOLD
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_BOLD	TokenNameIdentifier	 WEIGHT  BOLD
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
HEAVY	TokenNameIdentifier	 HEAVY
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_HEAVY	TokenNameIdentifier	 WEIGHT  HEAVY
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
EXTRABOLD	TokenNameIdentifier	 EXTRABOLD
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_EXTRABOLD	TokenNameIdentifier	 WEIGHT  EXTRABOLD
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
ULTRABOLD	TokenNameIdentifier	 ULTRABOLD
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_ULTRABOLD	TokenNameIdentifier	 WEIGHT  ULTRABOLD
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
POSTURE_REGULAR	TokenNameIdentifier	 POSTURE  REGULAR
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
POSTURE_REGULAR	TokenNameIdentifier	 POSTURE  REGULAR
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
POSTURE_OBLIQUE	TokenNameIdentifier	 POSTURE  OBLIQUE
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
POSTURE_OBLIQUE	TokenNameIdentifier	 POSTURE  OBLIQUE
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Contains threshold value for the various Font styles. If a given * style is in an interval, then it is mapped to the style at the top * of that interval. * @see #styleToSVG */	TokenNameCOMMENT_JAVADOC	 Contains threshold value for the various Font styles. If a given style is in an interval, then it is mapped to the style at the top of that interval. @see #styleToSVG 
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fontStyles	TokenNameIdentifier	 font Styles
=	TokenNameEQUAL	
{	TokenNameLBRACE	
POSTURE_REGULAR	TokenNameIdentifier	 POSTURE  REGULAR
+	TokenNamePLUS	
(	TokenNameLPAREN	
POSTURE_OBLIQUE	TokenNameIdentifier	 POSTURE  OBLIQUE
-	TokenNameMINUS	
POSTURE_REGULAR	TokenNameIdentifier	 POSTURE  REGULAR
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * SVG Styles corresponding to the fontStyles */	TokenNameCOMMENT_JAVADOC	 SVG Styles corresponding to the fontStyles 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
svgStyles	TokenNameIdentifier	 svg Styles
=	TokenNameEQUAL	
{	TokenNameLBRACE	
/*POSTURE_REGULAR*/	TokenNameCOMMENT_BLOCK	POSTURE_REGULAR
SVG_NORMAL_VALUE	TokenNameIdentifier	 SVG  NORMAL  VALUE
,	TokenNameCOMMA	
/*POSTURE_OBLIQUE*/	TokenNameCOMMENT_BLOCK	POSTURE_OBLIQUE
SVG_ITALIC_VALUE	TokenNameIdentifier	 SVG  ITALIC  VALUE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Contains threshold values for the various Font weights. If a given * weight is in an interval, then it is mapped to the weight at the top * of the interval. * @see #weightToSVG */	TokenNameCOMMENT_JAVADOC	 Contains threshold values for the various Font weights. If a given weight is in an interval, then it is mapped to the weight at the top of the interval. @see #weightToSVG 
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fontWeights	TokenNameIdentifier	 font Weights
=	TokenNameEQUAL	
{	TokenNameLBRACE	
EXTRA_LIGHT	TokenNameIdentifier	 EXTRA  LIGHT
+	TokenNamePLUS	
(	TokenNameLPAREN	
LIGHT	TokenNameIdentifier	 LIGHT
-	TokenNameMINUS	
EXTRA_LIGHT	TokenNameIdentifier	 EXTRA  LIGHT
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
LIGHT	TokenNameIdentifier	 LIGHT
+	TokenNamePLUS	
(	TokenNameLPAREN	
DEMILIGHT	TokenNameIdentifier	 DEMILIGHT
-	TokenNameMINUS	
LIGHT	TokenNameIdentifier	 LIGHT
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
DEMILIGHT	TokenNameIdentifier	 DEMILIGHT
+	TokenNamePLUS	
(	TokenNameLPAREN	
REGULAR	TokenNameIdentifier	 REGULAR
-	TokenNameMINUS	
DEMILIGHT	TokenNameIdentifier	 DEMILIGHT
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
REGULAR	TokenNameIdentifier	 REGULAR
+	TokenNamePLUS	
(	TokenNameLPAREN	
SEMIBOLD	TokenNameIdentifier	 SEMIBOLD
-	TokenNameMINUS	
REGULAR	TokenNameIdentifier	 REGULAR
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
SEMIBOLD	TokenNameIdentifier	 SEMIBOLD
+	TokenNamePLUS	
(	TokenNameLPAREN	
MEDIUM	TokenNameIdentifier	 MEDIUM
-	TokenNameMINUS	
SEMIBOLD	TokenNameIdentifier	 SEMIBOLD
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
MEDIUM	TokenNameIdentifier	 MEDIUM
+	TokenNamePLUS	
(	TokenNameLPAREN	
DEMIBOLD	TokenNameIdentifier	 DEMIBOLD
-	TokenNameMINUS	
MEDIUM	TokenNameIdentifier	 MEDIUM
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
DEMIBOLD	TokenNameIdentifier	 DEMIBOLD
+	TokenNamePLUS	
(	TokenNameLPAREN	
BOLD	TokenNameIdentifier	 BOLD
-	TokenNameMINUS	
DEMIBOLD	TokenNameIdentifier	 DEMIBOLD
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
BOLD	TokenNameIdentifier	 BOLD
+	TokenNamePLUS	
(	TokenNameLPAREN	
HEAVY	TokenNameIdentifier	 HEAVY
-	TokenNameMINUS	
BOLD	TokenNameIdentifier	 BOLD
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
HEAVY	TokenNameIdentifier	 HEAVY
+	TokenNamePLUS	
(	TokenNameLPAREN	
EXTRABOLD	TokenNameIdentifier	 EXTRABOLD
-	TokenNameMINUS	
HEAVY	TokenNameIdentifier	 HEAVY
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
EXTRABOLD	TokenNameIdentifier	 EXTRABOLD
+	TokenNamePLUS	
(	TokenNameLPAREN	
ULTRABOLD	TokenNameIdentifier	 ULTRABOLD
-	TokenNameMINUS	
EXTRABOLD	TokenNameIdentifier	 EXTRABOLD
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * SVG Weights corresponding to the fontWeights */	TokenNameCOMMENT_JAVADOC	 SVG Weights corresponding to the fontWeights 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
svgWeights	TokenNameIdentifier	 svg Weights
=	TokenNameEQUAL	
{	TokenNameLBRACE	
/*EXTRA_LIGHT*/	TokenNameCOMMENT_BLOCK	EXTRA_LIGHT
SVG_100_VALUE	TokenNameIdentifier	 SVG 100  VALUE
,	TokenNameCOMMA	
/*LIGHT*/	TokenNameCOMMENT_BLOCK	LIGHT
SVG_200_VALUE	TokenNameIdentifier	 SVG 200  VALUE
,	TokenNameCOMMA	
/*DEMILIGHT*/	TokenNameCOMMENT_BLOCK	DEMILIGHT
SVG_300_VALUE	TokenNameIdentifier	 SVG 300  VALUE
,	TokenNameCOMMA	
/*REGULAR*/	TokenNameCOMMENT_BLOCK	REGULAR
SVG_NORMAL_VALUE	TokenNameIdentifier	 SVG  NORMAL  VALUE
,	TokenNameCOMMA	
/*SEMIBOLD*/	TokenNameCOMMENT_BLOCK	SEMIBOLD
SVG_500_VALUE	TokenNameIdentifier	 SVG 500  VALUE
,	TokenNameCOMMA	
/*MEDIUM*/	TokenNameCOMMENT_BLOCK	MEDIUM
SVG_500_VALUE	TokenNameIdentifier	 SVG 500  VALUE
,	TokenNameCOMMA	
/*DEMIBOLD*/	TokenNameCOMMENT_BLOCK	DEMIBOLD
SVG_600_VALUE	TokenNameIdentifier	 SVG 600  VALUE
,	TokenNameCOMMA	
/*BOLD*/	TokenNameCOMMENT_BLOCK	BOLD
SVG_BOLD_VALUE	TokenNameIdentifier	 SVG  BOLD  VALUE
,	TokenNameCOMMA	
/*HEAVY*/	TokenNameCOMMENT_BLOCK	HEAVY
SVG_800_VALUE	TokenNameIdentifier	 SVG 800  VALUE
,	TokenNameCOMMA	
/*EXTRABOLD*/	TokenNameCOMMENT_BLOCK	EXTRABOLD
SVG_800_VALUE	TokenNameIdentifier	 SVG 800  VALUE
,	TokenNameCOMMA	
/*ULTRABOLD*/	TokenNameCOMMENT_BLOCK	ULTRABOLD
SVG_900_VALUE	TokenNameIdentifier	 SVG 900  VALUE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Logical fonts mapping */	TokenNameCOMMENT_JAVADOC	 Logical fonts mapping 
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
logicalFontMap	TokenNameIdentifier	 logical Font Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
logicalFontMap	TokenNameIdentifier	 logical Font Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"dialog"	TokenNameStringLiteral	dialog
,	TokenNameCOMMA	
"sans-serif"	TokenNameStringLiteral	sans-serif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logicalFontMap	TokenNameIdentifier	 logical Font Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"dialoginput"	TokenNameStringLiteral	dialoginput
,	TokenNameCOMMA	
"monospace"	TokenNameStringLiteral	monospace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logicalFontMap	TokenNameIdentifier	 logical Font Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"monospaced"	TokenNameStringLiteral	monospaced
,	TokenNameCOMMA	
"monospace"	TokenNameStringLiteral	monospace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logicalFontMap	TokenNameIdentifier	 logical Font Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"serif"	TokenNameStringLiteral	serif
,	TokenNameCOMMA	
"serif"	TokenNameStringLiteral	serif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logicalFontMap	TokenNameIdentifier	 logical Font Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"sansserif"	TokenNameStringLiteral	sansserif
,	TokenNameCOMMA	
"sans-serif"	TokenNameStringLiteral	sans-serif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logicalFontMap	TokenNameIdentifier	 logical Font Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"symbol"	TokenNameStringLiteral	symbol
,	TokenNameCOMMA	
"'WingDings'"	TokenNameStringLiteral	'WingDings'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The common font size to use when generating all SVG fonts. */	TokenNameCOMMENT_JAVADOC	 The common font size to use when generating all SVG fonts. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMMON_FONT_SIZE	TokenNameIdentifier	 COMMON  FONT  SIZE
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Used to keep track of which characters have been rendered by each font * used. MapKey is the fontKey, mapValue is a sorted array of used characters. */	TokenNameCOMMENT_JAVADOC	 Used to keep track of which characters have been rendered by each font used. MapKey is the fontKey, mapValue is a sorted array of used characters. 
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
fontStringMap	TokenNameIdentifier	 font String Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @param generatorContext used to build Elements */	TokenNameCOMMENT_JAVADOC	 @param generatorContext used to build Elements 
public	TokenNamepublic	
SVGFont	TokenNameIdentifier	 SVG Font
(	TokenNameLPAREN	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Records that the specified font has been used to draw the text string. * This is so we can keep track of which glyphs are required for each * SVG font that is generated. */	TokenNameCOMMENT_JAVADOC	 Records that the specified font has been used to draw the text string. This is so we can keep track of which glyphs are required for each SVG font that is generated. 
public	TokenNamepublic	
void	TokenNamevoid	
recordFontUsage	TokenNameIdentifier	 record Font Usage
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Font	TokenNameIdentifier	 Font
commonSizeFont	TokenNameIdentifier	 common Size Font
=	TokenNameEQUAL	
createCommonSizeFont	TokenNameIdentifier	 create Common Size Font
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fontKey	TokenNameIdentifier	 font Key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
commonSizeFont	TokenNameIdentifier	 common Size Font
.	TokenNameDOT	
getFamily	TokenNameIdentifier	 get Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
commonSizeFont	TokenNameIdentifier	 common Size Font
.	TokenNameDOT	
getStyle	TokenNameIdentifier	 get Style
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// String textUsingFont = (String)fontStringMap.get(fontKey); 	TokenNameCOMMENT_LINE	String textUsingFont = (String)fontStringMap.get(fontKey); 
// if (textUsingFont == null) { 	TokenNameCOMMENT_LINE	if (textUsingFont == null) { 
// // font has not been used before 	TokenNameCOMMENT_LINE	// font has not been used before 
// textUsingFont = ""; 	TokenNameCOMMENT_LINE	textUsingFont = ""; 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// // append any new characters to textUsingFont 	TokenNameCOMMENT_LINE	// append any new characters to textUsingFont 
// // FIXX: This is horribly inefficent, consider binary tree, Set, etc. 	TokenNameCOMMENT_LINE	// FIXX: This is horribly inefficent, consider binary tree, Set, etc. 
// for (int i = 0; i < string.length(); i++) { 	TokenNameCOMMENT_LINE	for (int i = 0; i < string.length(); i++) { 
// char ch = string.charAt(i); 	TokenNameCOMMENT_LINE	char ch = string.charAt(i); 
// if (textUsingFont.indexOf(ch) == -1) { 	TokenNameCOMMENT_LINE	if (textUsingFont.indexOf(ch) == -1) { 
// textUsingFont += ch; 	TokenNameCOMMENT_LINE	textUsingFont += ch; 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
CharListHelper	TokenNameIdentifier	 Char List Helper
chl	TokenNameIdentifier	 chl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CharListHelper	TokenNameIdentifier	 Char List Helper
)	TokenNameRPAREN	
fontStringMap	TokenNameIdentifier	 font String Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fontKey	TokenNameIdentifier	 font Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chl	TokenNameIdentifier	 chl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// was not in use before, so we need to create a fresh one 	TokenNameCOMMENT_LINE	was not in use before, so we need to create a fresh one 
chl	TokenNameIdentifier	 chl
=	TokenNameEQUAL	
new	TokenNamenew	
CharListHelper	TokenNameIdentifier	 Char List Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// todo take care of surrogate chars here... 	TokenNameCOMMENT_LINE	todo take care of surrogate chars here... 
chl	TokenNameIdentifier	 chl
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fontStringMap	TokenNameIdentifier	 font String Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fontKey	TokenNameIdentifier	 font Key
,	TokenNameCOMMA	
chl	TokenNameIdentifier	 chl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new Font that is of the common font size used for generating * SVG fonts. The new Font will be the same as the specified font, with * only its size attribute modified. */	TokenNameCOMMENT_JAVADOC	 Creates a new Font that is of the common font size used for generating SVG fonts. The new Font will be the same as the specified font, with only its size attribute modified. 
private	TokenNameprivate	
static	TokenNamestatic	
Font	TokenNameIdentifier	 Font
createCommonSizeFont	TokenNameIdentifier	 create Common Size Font
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
SIZE	TokenNameIdentifier	 SIZE
,	TokenNameCOMMA	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
COMMON_FONT_SIZE	TokenNameIdentifier	 COMMON  FONT  SIZE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Remove Transform from font otherwise it will be applied twice. 	TokenNameCOMMENT_LINE	Remove Transform from font otherwise it will be applied twice. 
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
TRANSFORM	TokenNameIdentifier	 TRANSFORM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Font	TokenNameIdentifier	 Font
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts part or all of the input GraphicContext into * a set of attribute/value pairs and related definitions * * @param gc GraphicContext to be converted * @return descriptor of the attributes required to represent * some or all of the GraphicContext state, along * with the related definitions * @see org.apache.batik.svggen.SVGDescriptor */	TokenNameCOMMENT_JAVADOC	 Converts part or all of the input GraphicContext into a set of attribute/value pairs and related definitions * @param gc GraphicContext to be converted @return descriptor of the attributes required to represent some or all of the GraphicContext state, along with the related definitions @see org.apache.batik.svggen.SVGDescriptor 
public	TokenNamepublic	
SVGDescriptor	TokenNameIdentifier	 SVG Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
GraphicContext	TokenNameIdentifier	 Graphic Context
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getFont	TokenNameIdentifier	 get Font
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getFontRenderContext	TokenNameIdentifier	 get Font Render Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param font Font object which should be converted to a set * of SVG attributes * @param frc The FontRenderContext which will be used to generate glyph * elements for the SVGFont definition element * @return description of attribute values that describe the font */	TokenNameCOMMENT_JAVADOC	 @param font Font object which should be converted to a set of SVG attributes @param frc The FontRenderContext which will be used to generate glyph elements for the SVGFont definition element @return description of attribute values that describe the font 
public	TokenNamepublic	
SVGFontDescriptor	TokenNameIdentifier	 SVG Font Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
,	TokenNameCOMMA	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Remove affine from FRC otherwise it will be applied twice. 	TokenNameCOMMENT_LINE	Remove affine from FRC otherwise it will be applied twice. 
FontRenderContext	TokenNameIdentifier	 Font Render Context
localFRC	TokenNameIdentifier	 local FRC
;	TokenNameSEMICOLON	
localFRC	TokenNameIdentifier	 local FRC
=	TokenNameEQUAL	
new	TokenNamenew	
FontRenderContext	TokenNameIdentifier	 Font Render Context
(	TokenNameLPAREN	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
frc	TokenNameIdentifier	 frc
.	TokenNameDOT	
isAntiAliased	TokenNameIdentifier	 is Anti Aliased
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
frc	TokenNameIdentifier	 frc
.	TokenNameDOT	
usesFractionalMetrics	TokenNameIdentifier	 uses Fractional Metrics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fontSize	TokenNameIdentifier	 font Size
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
getSize2D	TokenNameIdentifier	 get Size2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fontWeight	TokenNameIdentifier	 font Weight
=	TokenNameEQUAL	
weightToSVG	TokenNameIdentifier	 weight To SVG
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fontStyle	TokenNameIdentifier	 font Style
=	TokenNameEQUAL	
styleToSVG	TokenNameIdentifier	 style To SVG
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fontFamilyStr	TokenNameIdentifier	 font Family Str
=	TokenNameEQUAL	
familyToSVG	TokenNameIdentifier	 family To SVG
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Font	TokenNameIdentifier	 Font
commonSizeFont	TokenNameIdentifier	 common Size Font
=	TokenNameEQUAL	
createCommonSizeFont	TokenNameIdentifier	 create Common Size Font
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fontKey	TokenNameIdentifier	 font Key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
commonSizeFont	TokenNameIdentifier	 common Size Font
.	TokenNameDOT	
getFamily	TokenNameIdentifier	 get Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
commonSizeFont	TokenNameIdentifier	 common Size Font
.	TokenNameDOT	
getStyle	TokenNameIdentifier	 get Style
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharListHelper	TokenNameIdentifier	 Char List Helper
clh	TokenNameIdentifier	 clh
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CharListHelper	TokenNameIdentifier	 Char List Helper
)	TokenNameRPAREN	
fontStringMap	TokenNameIdentifier	 font String Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fontKey	TokenNameIdentifier	 font Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clh	TokenNameIdentifier	 clh
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this font hasn't been used by any text yet, 	TokenNameCOMMENT_LINE	this font hasn't been used by any text yet, 
// so don't create an SVG Font element for it 	TokenNameCOMMENT_LINE	so don't create an SVG Font element for it 
return	TokenNamereturn	
new	TokenNamenew	
SVGFontDescriptor	TokenNameIdentifier	 SVG Font Descriptor
(	TokenNameLPAREN	
fontSize	TokenNameIdentifier	 font Size
,	TokenNameCOMMA	
fontWeight	TokenNameIdentifier	 font Weight
,	TokenNameCOMMA	
fontStyle	TokenNameIdentifier	 font Style
,	TokenNameCOMMA	
fontFamilyStr	TokenNameIdentifier	 font Family Str
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Document	TokenNameIdentifier	 Document
domFactory	TokenNameIdentifier	 dom Factory
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
;	TokenNameSEMICOLON	
// see if a description already exists for this font 	TokenNameCOMMENT_LINE	see if a description already exists for this font 
SVGFontDescriptor	TokenNameIdentifier	 SVG Font Descriptor
fontDesc	TokenNameIdentifier	 font Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGFontDescriptor	TokenNameIdentifier	 SVG Font Descriptor
)	TokenNameRPAREN	
descMap	TokenNameIdentifier	 desc Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fontKey	TokenNameIdentifier	 font Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
fontDef	TokenNameIdentifier	 font Def
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fontDesc	TokenNameIdentifier	 font Desc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// use the SVG Font element that has already been created 	TokenNameCOMMENT_LINE	use the SVG Font element that has already been created 
fontDef	TokenNameIdentifier	 font Def
=	TokenNameEQUAL	
fontDesc	TokenNameIdentifier	 font Desc
.	TokenNameDOT	
getDef	TokenNameIdentifier	 get Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// create a new SVG Font element 	TokenNameCOMMENT_LINE	create a new SVG Font element 
fontDef	TokenNameIdentifier	 font Def
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FONT_TAG	TokenNameIdentifier	 SVG  FONT  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// create the font-face element 	TokenNameCOMMENT_LINE	create the font-face element 
// 	TokenNameCOMMENT_LINE	 
Element	TokenNameIdentifier	 Element
fontFace	TokenNameIdentifier	 font Face
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FONT_FACE_TAG	TokenNameIdentifier	 SVG  FONT  FACE  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
svgFontFamilyString	TokenNameIdentifier	 svg Font Family String
=	TokenNameEQUAL	
fontFamilyStr	TokenNameIdentifier	 font Family Str
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fontFamilyStr	TokenNameIdentifier	 font Family Str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fontFamilyStr	TokenNameIdentifier	 font Family Str
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get rid of the quotes 	TokenNameCOMMENT_LINE	get rid of the quotes 
svgFontFamilyString	TokenNameIdentifier	 svg Font Family String
=	TokenNameEQUAL	
fontFamilyStr	TokenNameIdentifier	 font Family Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fontFamilyStr	TokenNameIdentifier	 font Family Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fontFace	TokenNameIdentifier	 font Face
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_FONT_FAMILY_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  FAMILY  ATTRIBUTE
,	TokenNameCOMMA	
svgFontFamilyString	TokenNameIdentifier	 svg Font Family String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontFace	TokenNameIdentifier	 font Face
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_FONT_WEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  WEIGHT  ATTRIBUTE
,	TokenNameCOMMA	
fontWeight	TokenNameIdentifier	 font Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontFace	TokenNameIdentifier	 font Face
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_FONT_STYLE_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  STYLE  ATTRIBUTE
,	TokenNameCOMMA	
fontStyle	TokenNameIdentifier	 font Style
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontFace	TokenNameIdentifier	 font Face
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_UNITS_PER_EM_ATTRIBUTE	TokenNameIdentifier	 SVG  UNITS  PER  EM  ATTRIBUTE
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
COMMON_FONT_SIZE	TokenNameIdentifier	 COMMON  FONT  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontDef	TokenNameIdentifier	 font Def
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
fontFace	TokenNameIdentifier	 font Face
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// create missing glyph element 	TokenNameCOMMENT_LINE	create missing glyph element 
// 	TokenNameCOMMENT_LINE	 
Element	TokenNameIdentifier	 Element
missingGlyphElement	TokenNameIdentifier	 missing Glyph Element
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_MISSING_GLYPH_TAG	TokenNameIdentifier	 SVG  MISSING  GLYPH  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
missingGlyphCode	TokenNameIdentifier	 missing Glyph Code
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
missingGlyphCode	TokenNameIdentifier	 missing Glyph Code
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
commonSizeFont	TokenNameIdentifier	 common Size Font
.	TokenNameDOT	
getMissingGlyphCode	TokenNameIdentifier	 get Missing Glyph Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GlyphVector	TokenNameIdentifier	 Glyph Vector
gv	TokenNameIdentifier	 gv
;	TokenNameSEMICOLON	
gv	TokenNameIdentifier	 gv
=	TokenNameEQUAL	
commonSizeFont	TokenNameIdentifier	 common Size Font
.	TokenNameDOT	
createGlyphVector	TokenNameIdentifier	 create Glyph Vector
(	TokenNameLPAREN	
localFRC	TokenNameIdentifier	 local FRC
,	TokenNameCOMMA	
missingGlyphCode	TokenNameIdentifier	 missing Glyph Code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Shape	TokenNameIdentifier	 Shape
missingGlyphShape	TokenNameIdentifier	 missing Glyph Shape
=	TokenNameEQUAL	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getGlyphOutline	TokenNameIdentifier	 get Glyph Outline
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GlyphMetrics	TokenNameIdentifier	 Glyph Metrics
gm	TokenNameIdentifier	 gm
=	TokenNameEQUAL	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getGlyphMetrics	TokenNameIdentifier	 get Glyph Metrics
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// need to turn the missing glyph upside down to be in the font 	TokenNameCOMMENT_LINE	need to turn the missing glyph upside down to be in the font 
// coordinate system (i.e Y axis up) 	TokenNameCOMMENT_LINE	coordinate system (i.e Y axis up) 
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getScaleInstance	TokenNameIdentifier	 get Scale Instance
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
missingGlyphShape	TokenNameIdentifier	 missing Glyph Shape
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
missingGlyphShape	TokenNameIdentifier	 missing Glyph Shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
missingGlyphElement	TokenNameIdentifier	 missing Glyph Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_D_ATTRIBUTE	TokenNameIdentifier	 SVG  D  ATTRIBUTE
,	TokenNameCOMMA	
SVGPath	TokenNameIdentifier	 SVG Path
.	TokenNameDOT	
toSVGPathData	TokenNameIdentifier	 to SVG Path Data
(	TokenNameLPAREN	
missingGlyphShape	TokenNameIdentifier	 missing Glyph Shape
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
missingGlyphElement	TokenNameIdentifier	 missing Glyph Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_HORIZ_ADV_X_ATTRIBUTE	TokenNameIdentifier	 SVG  HORIZ  ADV  X  ATTRIBUTE
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
gm	TokenNameIdentifier	 gm
.	TokenNameDOT	
getAdvance	TokenNameIdentifier	 get Advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontDef	TokenNameIdentifier	 font Def
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
missingGlyphElement	TokenNameIdentifier	 missing Glyph Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the font's default horizontal advance to be the same as 	TokenNameCOMMENT_LINE	set the font's default horizontal advance to be the same as 
// the missing glyph 	TokenNameCOMMENT_LINE	the missing glyph 
fontDef	TokenNameIdentifier	 font Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_HORIZ_ADV_X_ATTRIBUTE	TokenNameIdentifier	 SVG  HORIZ  ADV  X  ATTRIBUTE
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
gm	TokenNameIdentifier	 gm
.	TokenNameDOT	
getAdvance	TokenNameIdentifier	 get Advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the ascent and descent attributes 	TokenNameCOMMENT_LINE	set the ascent and descent attributes 
LineMetrics	TokenNameIdentifier	 Line Metrics
lm	TokenNameIdentifier	 lm
=	TokenNameEQUAL	
commonSizeFont	TokenNameIdentifier	 common Size Font
.	TokenNameDOT	
getLineMetrics	TokenNameIdentifier	 get Line Metrics
(	TokenNameLPAREN	
"By"	TokenNameStringLiteral	By
,	TokenNameCOMMA	
localFRC	TokenNameIdentifier	 local FRC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontFace	TokenNameIdentifier	 font Face
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ASCENT_ATTRIBUTE	TokenNameIdentifier	 SVG  ASCENT  ATTRIBUTE
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
lm	TokenNameIdentifier	 lm
.	TokenNameDOT	
getAscent	TokenNameIdentifier	 get Ascent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontFace	TokenNameIdentifier	 font Face
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_DESCENT_ATTRIBUTE	TokenNameIdentifier	 SVG  DESCENT  ATTRIBUTE
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
lm	TokenNameIdentifier	 lm
.	TokenNameDOT	
getDescent	TokenNameIdentifier	 get Descent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Font ID 	TokenNameCOMMENT_LINE	Font ID 
// 	TokenNameCOMMENT_LINE	 
fontDef	TokenNameIdentifier	 font Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
idGenerator	TokenNameIdentifier	 id Generator
.	TokenNameDOT	
generateID	TokenNameIdentifier	 generate ID
(	TokenNameLPAREN	
ID_PREFIX_FONT	TokenNameIdentifier	 ID  PREFIX  FONT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// add any new glyphs to the fontDef here 	TokenNameCOMMENT_LINE	add any new glyphs to the fontDef here 
// 	TokenNameCOMMENT_LINE	 
String	TokenNameIdentifier	 String
textUsingFont	TokenNameIdentifier	 text Using Font
=	TokenNameEQUAL	
clh	TokenNameIdentifier	 clh
.	TokenNameDOT	
getNewChars	TokenNameIdentifier	 get New Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clh	TokenNameIdentifier	 clh
.	TokenNameDOT	
clearNewChars	TokenNameIdentifier	 clear New Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// process the characters in textUsingFont backwards since the new chars 	TokenNameCOMMENT_LINE	process the characters in textUsingFont backwards since the new chars 
// are at the end, can stop when find a char that already has a glyph 	TokenNameCOMMENT_LINE	are at the end, can stop when find a char that already has a glyph 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
textUsingFont	TokenNameIdentifier	 text Using Font
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
textUsingFont	TokenNameIdentifier	 text Using Font
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
searchStr	TokenNameIdentifier	 search Str
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
foundGlyph	TokenNameIdentifier	 found Glyph
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
NodeList	TokenNameIdentifier	 Node List
fontChildren	TokenNameIdentifier	 font Children
=	TokenNameEQUAL	
fontDef	TokenNameIdentifier	 font Def
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
fontChildren	TokenNameIdentifier	 font Children
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fontChildren	TokenNameIdentifier	 font Children
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
childElement	TokenNameIdentifier	 child Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
fontChildren	TokenNameIdentifier	 font Children
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
childElement	TokenNameIdentifier	 child Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_UNICODE_ATTRIBUTE	TokenNameIdentifier	 SVG  UNICODE  ATTRIBUTE
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
searchStr	TokenNameIdentifier	 search Str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundGlyph	TokenNameIdentifier	 found Glyph
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
foundGlyph	TokenNameIdentifier	 found Glyph
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// need to create one 	TokenNameCOMMENT_LINE	need to create one 
Element	TokenNameIdentifier	 Element
glyphElement	TokenNameIdentifier	 glyph Element
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_GLYPH_TAG	TokenNameIdentifier	 SVG  GLYPH  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GlyphVector	TokenNameIdentifier	 Glyph Vector
gv	TokenNameIdentifier	 gv
;	TokenNameSEMICOLON	
gv	TokenNameIdentifier	 gv
=	TokenNameEQUAL	
commonSizeFont	TokenNameIdentifier	 common Size Font
.	TokenNameDOT	
createGlyphVector	TokenNameIdentifier	 create Glyph Vector
(	TokenNameLPAREN	
localFRC	TokenNameIdentifier	 local FRC
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Shape	TokenNameIdentifier	 Shape
glyphShape	TokenNameIdentifier	 glyph Shape
=	TokenNameEQUAL	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getGlyphOutline	TokenNameIdentifier	 get Glyph Outline
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GlyphMetrics	TokenNameIdentifier	 Glyph Metrics
gm	TokenNameIdentifier	 gm
=	TokenNameEQUAL	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getGlyphMetrics	TokenNameIdentifier	 get Glyph Metrics
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// need to turn the glyph upside down to be in the font 	TokenNameCOMMENT_LINE	need to turn the glyph upside down to be in the font 
// coordinate system (i.e Y axis up) 	TokenNameCOMMENT_LINE	coordinate system (i.e Y axis up) 
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getScaleInstance	TokenNameIdentifier	 get Scale Instance
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphShape	TokenNameIdentifier	 glyph Shape
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
glyphShape	TokenNameIdentifier	 glyph Shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphElement	TokenNameIdentifier	 glyph Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_D_ATTRIBUTE	TokenNameIdentifier	 SVG  D  ATTRIBUTE
,	TokenNameCOMMA	
SVGPath	TokenNameIdentifier	 SVG Path
.	TokenNameDOT	
toSVGPathData	TokenNameIdentifier	 to SVG Path Data
(	TokenNameLPAREN	
glyphShape	TokenNameIdentifier	 glyph Shape
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphElement	TokenNameIdentifier	 glyph Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_HORIZ_ADV_X_ATTRIBUTE	TokenNameIdentifier	 SVG  HORIZ  ADV  X  ATTRIBUTE
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
gm	TokenNameIdentifier	 gm
.	TokenNameDOT	
getAdvance	TokenNameIdentifier	 get Advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphElement	TokenNameIdentifier	 glyph Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_UNICODE_ATTRIBUTE	TokenNameIdentifier	 SVG  UNICODE  ATTRIBUTE
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontDef	TokenNameIdentifier	 font Def
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
glyphElement	TokenNameIdentifier	 glyph Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// have reached the chars in textUsingFont that already 	TokenNameCOMMENT_LINE	have reached the chars in textUsingFont that already 
// have glyphs, don't need to process any further 	TokenNameCOMMENT_LINE	have glyphs, don't need to process any further 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// create a new font description for this instance of the font usage 	TokenNameCOMMENT_LINE	create a new font description for this instance of the font usage 
// 	TokenNameCOMMENT_LINE	 
SVGFontDescriptor	TokenNameIdentifier	 SVG Font Descriptor
newFontDesc	TokenNameIdentifier	 new Font Desc
=	TokenNameEQUAL	
new	TokenNamenew	
SVGFontDescriptor	TokenNameIdentifier	 SVG Font Descriptor
(	TokenNameLPAREN	
fontSize	TokenNameIdentifier	 font Size
,	TokenNameCOMMA	
fontWeight	TokenNameIdentifier	 font Weight
,	TokenNameCOMMA	
fontStyle	TokenNameIdentifier	 font Style
,	TokenNameCOMMA	
fontFamilyStr	TokenNameIdentifier	 font Family Str
,	TokenNameCOMMA	
fontDef	TokenNameIdentifier	 font Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Update maps so that the font def can be reused if needed 	TokenNameCOMMENT_LINE	Update maps so that the font def can be reused if needed 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
fontDesc	TokenNameIdentifier	 font Desc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
descMap	TokenNameIdentifier	 desc Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fontKey	TokenNameIdentifier	 font Key
,	TokenNameCOMMA	
newFontDesc	TokenNameIdentifier	 new Font Desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defSet	TokenNameIdentifier	 def Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fontDef	TokenNameIdentifier	 font Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newFontDesc	TokenNameIdentifier	 new Font Desc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param font whose family should be converted to an SVG string * value. */	TokenNameCOMMENT_JAVADOC	 @param font whose family should be converted to an SVG string value. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
familyToSVG	TokenNameIdentifier	 family To SVG
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fontFamilyStr	TokenNameIdentifier	 font Family Str
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
getFamily	TokenNameIdentifier	 get Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
logicalFontFamily	TokenNameIdentifier	 logical Font Family
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
logicalFontMap	TokenNameIdentifier	 logical Font Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logicalFontFamily	TokenNameIdentifier	 logical Font Family
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fontFamilyStr	TokenNameIdentifier	 font Family Str
=	TokenNameEQUAL	
logicalFontFamily	TokenNameIdentifier	 logical Font Family
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
QUOTE	TokenNameIdentifier	 QUOTE
=	TokenNameEQUAL	
'\''	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
fontFamilyStr	TokenNameIdentifier	 font Family Str
=	TokenNameEQUAL	
QUOTE	TokenNameIdentifier	 QUOTE
+	TokenNamePLUS	
fontFamilyStr	TokenNameIdentifier	 font Family Str
+	TokenNamePLUS	
QUOTE	TokenNameIdentifier	 QUOTE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fontFamilyStr	TokenNameIdentifier	 font Family Str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param font whose style should be converted to an SVG string * value. */	TokenNameCOMMENT_JAVADOC	 @param font whose style should be converted to an SVG string value. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
styleToSVG	TokenNameIdentifier	 style To SVG
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
attrMap	TokenNameIdentifier	 attr Map
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Float	TokenNameIdentifier	 Float
styleValue	TokenNameIdentifier	 style Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
POSTURE	TokenNameIdentifier	 POSTURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
styleValue	TokenNameIdentifier	 style Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
isItalic	TokenNameIdentifier	 is Italic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
styleValue	TokenNameIdentifier	 style Value
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
POSTURE_OBLIQUE	TokenNameIdentifier	 POSTURE  OBLIQUE
;	TokenNameSEMICOLON	
else	TokenNameelse	
styleValue	TokenNameIdentifier	 style Value
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
POSTURE_REGULAR	TokenNameIdentifier	 POSTURE  REGULAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
style	TokenNameIdentifier	 style
=	TokenNameEQUAL	
styleValue	TokenNameIdentifier	 style Value
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fontStyles	TokenNameIdentifier	 font Styles
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
style	TokenNameIdentifier	 style
<=	TokenNameLESS_EQUAL	
fontStyles	TokenNameIdentifier	 font Styles
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
svgStyles	TokenNameIdentifier	 svg Styles
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param font whose weight should be converted to an SVG string * value. Note that there is loss of precision for * semibold and extrabold. */	TokenNameCOMMENT_JAVADOC	 @param font whose weight should be converted to an SVG string value. Note that there is loss of precision for semibold and extrabold. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
weightToSVG	TokenNameIdentifier	 weight To SVG
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
attrMap	TokenNameIdentifier	 attr Map
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Float	TokenNameIdentifier	 Float
weightValue	TokenNameIdentifier	 weight Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT	TokenNameIdentifier	 WEIGHT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
weightValue	TokenNameIdentifier	 weight Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
isBold	TokenNameIdentifier	 is Bold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
weightValue	TokenNameIdentifier	 weight Value
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_BOLD	TokenNameIdentifier	 WEIGHT  BOLD
;	TokenNameSEMICOLON	
else	TokenNameelse	
weightValue	TokenNameIdentifier	 weight Value
=	TokenNameEQUAL	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_REGULAR	TokenNameIdentifier	 WEIGHT  REGULAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
weightValue	TokenNameIdentifier	 weight Value
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fontWeights	TokenNameIdentifier	 font Weights
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
<=	TokenNameLESS_EQUAL	
fontWeights	TokenNameIdentifier	 font Weights
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
svgWeights	TokenNameIdentifier	 svg Weights
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * this helper-class implements a set of characters. it stores all used characters * in a font. * * <br>implementation: we keep a sorted list of integers. This allows to use binary search * for lookup and insert. The use of <code>int</code> instead of <code>char</code> allows us to * handle surrogate characters as well. */	TokenNameCOMMENT_JAVADOC	 this helper-class implements a set of characters. it stores all used characters in a font. * <br>implementation: we keep a sorted list of integers. This allows to use binary search for lookup and insert. The use of <code>int</code> instead of <code>char</code> allows us to handle surrogate characters as well. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
CharListHelper	TokenNameIdentifier	 Char List Helper
{	TokenNameLBRACE	
/** * the number of slots actually used. * must always be 0 &lt;= nUsed &lt;= charList.length */	TokenNameCOMMENT_JAVADOC	 the number of slots actually used. must always be 0 &lt;= nUsed &lt;= charList.length 
private	TokenNameprivate	
int	TokenNameint	
nUsed	TokenNameIdentifier	 n Used
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * keeps added characters, is kept sorted for efficient search. */	TokenNameCOMMENT_JAVADOC	 keeps added characters, is kept sorted for efficient search. 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charList	TokenNameIdentifier	 char List
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
40	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * this keeps all added characters in order. It can be cleared from toSVG() * when glyphs are created for some characters. */	TokenNameCOMMENT_JAVADOC	 this keeps all added characters in order. It can be cleared from toSVG() when glyphs are created for some characters. 
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
freshChars	TokenNameIdentifier	 fresh Chars
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
40	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharListHelper	TokenNameIdentifier	 Char List Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * get a string of all characters added since last call to clearNewChars(). * @return a string of all recently added characters */	TokenNameCOMMENT_JAVADOC	 get a string of all characters added since last call to clearNewChars(). @return a string of all recently added characters 
String	TokenNameIdentifier	 String
getNewChars	TokenNameIdentifier	 get New Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
freshChars	TokenNameIdentifier	 fresh Chars
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * reset the string of recently added characters - used after glyphs were created for them. */	TokenNameCOMMENT_JAVADOC	 reset the string of recently added characters - used after glyphs were created for them. 
void	TokenNamevoid	
clearNewChars	TokenNameIdentifier	 clear New Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
freshChars	TokenNameIdentifier	 fresh Chars
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
40	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test, if the character is contained in the charList. * If not, insert c into charList. * charList is kept sorted for efficient search. * @param c * @return true, when fresh inserted */	TokenNameCOMMENT_JAVADOC	 test, if the character is contained in the charList. If not, insert c into charList. charList is kept sorted for efficient search. @param c @return true, when fresh inserted 
boolean	TokenNameboolean	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
binSearch	TokenNameIdentifier	 bin Search
(	TokenNameLPAREN	
charList	TokenNameIdentifier	 char List
,	TokenNameCOMMA	
nUsed	TokenNameIdentifier	 n Used
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// was in list: no activity needed 	TokenNameCOMMENT_LINE	was in list: no activity needed 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// insert new char into array, grow if necessary 	TokenNameCOMMENT_LINE	insert new char into array, grow if necessary 
if	TokenNameif	
(	TokenNameLPAREN	
nUsed	TokenNameIdentifier	 n Used
==	TokenNameEQUAL_EQUAL	
charList	TokenNameIdentifier	 char List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// full, allocate some more slots - moderately... 	TokenNameCOMMENT_LINE	full, allocate some more slots - moderately... 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
nUsed	TokenNameIdentifier	 n Used
+	TokenNamePLUS	
20	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
charList	TokenNameIdentifier	 char List
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nUsed	TokenNameIdentifier	 n Used
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charList	TokenNameIdentifier	 char List
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// now we can insert the new character 	TokenNameCOMMENT_LINE	now we can insert the new character 
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
charList	TokenNameIdentifier	 char List
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
charList	TokenNameIdentifier	 char List
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nUsed	TokenNameIdentifier	 n Used
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charList	TokenNameIdentifier	 char List
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
freshChars	TokenNameIdentifier	 fresh Chars
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// todo if necessary split surrogates here 	TokenNameCOMMENT_LINE	todo if necessary split surrogates here 
nUsed	TokenNameIdentifier	 n Used
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * unfortunatly, Arrays.binarySearch() does not support search in a * part of the array (not in jdk1.3 and jdk1.4). - so we have do provide our own * implementation. * @param list to search within * @param nUsed the last used index, can be &lt; list.length * @param chr the character to lookup * @return the index when found, or the negative insert position. */	TokenNameCOMMENT_JAVADOC	 unfortunatly, Arrays.binarySearch() does not support search in a part of the array (not in jdk1.3 and jdk1.4). - so we have do provide our own implementation. @param list to search within @param nUsed the last used index, can be &lt; list.length @param chr the character to lookup @return the index when found, or the negative insert position. 
static	TokenNamestatic	
int	TokenNameint	
binSearch	TokenNameIdentifier	 bin Search
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
int	TokenNameint	
nUsed	TokenNameIdentifier	 n Used
,	TokenNameCOMMA	
int	TokenNameint	
chr	TokenNameIdentifier	 chr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
nUsed	TokenNameIdentifier	 n Used
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
<=	TokenNameLESS_EQUAL	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
+	TokenNamePLUS	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// we're not sun - we know how to binSearch... 	TokenNameCOMMENT_LINE	we're not sun - we know how to binSearch... 
int	TokenNameint	
midVal	TokenNameIdentifier	 mid Val
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
midVal	TokenNameIdentifier	 mid Val
<	TokenNameLESS	
chr	TokenNameIdentifier	 chr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
midVal	TokenNameIdentifier	 mid Val
>	TokenNameGREATER	
chr	TokenNameIdentifier	 chr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
// char found 	TokenNameCOMMENT_LINE	char found 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// char not found, should be inserted at -pos -1 	TokenNameCOMMENT_LINE	char not found, should be inserted at -pos -1 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
