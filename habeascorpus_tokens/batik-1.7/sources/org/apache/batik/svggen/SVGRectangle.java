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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Line2D	TokenNameIdentifier	 Line2 D
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
RectangularShape	TokenNameIdentifier	 Rectangular Shape
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
RoundRectangle2D	TokenNameIdentifier	 Round Rectangle2 D
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
/** * Utility class that converts a Rectangle2D or RoundRectangle2D * object into an SVG element. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGRectangle.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a Rectangle2D or RoundRectangle2D object into an SVG element. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGRectangle.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGRectangle	TokenNameIdentifier	 SVG Rectangle
extends	TokenNameextends	
SVGGraphicObjectConverter	TokenNameIdentifier	 SVG Graphic Object Converter
{	TokenNameLBRACE	
/** * Line converter used for degenerate cases */	TokenNameCOMMENT_JAVADOC	 Line converter used for degenerate cases 
private	TokenNameprivate	
SVGLine	TokenNameIdentifier	 SVG Line
svgLine	TokenNameIdentifier	 svg Line
;	TokenNameSEMICOLON	
/** * @param generatorContext used to build Elements */	TokenNameCOMMENT_JAVADOC	 @param generatorContext used to build Elements 
public	TokenNamepublic	
SVGRectangle	TokenNameIdentifier	 SVG Rectangle
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
svgLine	TokenNameIdentifier	 svg Line
=	TokenNameEQUAL	
new	TokenNamenew	
SVGLine	TokenNameIdentifier	 SVG Line
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param rect rectangle object to convert to SVG */	TokenNameCOMMENT_JAVADOC	 @param rect rectangle object to convert to SVG 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RectangularShape	TokenNameIdentifier	 Rectangular Shape
)	TokenNameRPAREN	
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * In the Java 2D API, arc width/height are used * as absolute values. * * @param rect rectangle object to convert to SVG */	TokenNameCOMMENT_JAVADOC	 In the Java 2D API, arc width/height are used as absolute values. * @param rect rectangle object to convert to SVG 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
RoundRectangle2D	TokenNameIdentifier	 Round Rectangle2 D
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
svgRect	TokenNameIdentifier	 svg Rect
=	TokenNameEQUAL	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RectangularShape	TokenNameIdentifier	 Rectangular Shape
)	TokenNameRPAREN	
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
svgRect	TokenNameIdentifier	 svg Rect
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
svgRect	TokenNameIdentifier	 svg Rect
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
SVG_RECT_TAG	TokenNameIdentifier	 SVG  RECT  TAG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
svgRect	TokenNameIdentifier	 svg Rect
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RX_ATTRIBUTE	TokenNameIdentifier	 SVG  RX  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getArcWidth	TokenNameIdentifier	 get Arc Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgRect	TokenNameIdentifier	 svg Rect
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RY_ATTRIBUTE	TokenNameIdentifier	 SVG  RY  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getArcHeight	TokenNameIdentifier	 get Arc Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
svgRect	TokenNameIdentifier	 svg Rect
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param rect rectangle object to convert to SVG */	TokenNameCOMMENT_JAVADOC	 @param rect rectangle object to convert to SVG 
private	TokenNameprivate	
Element	TokenNameIdentifier	 Element
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
RectangularShape	TokenNameIdentifier	 Rectangular Shape
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
svgRect	TokenNameIdentifier	 svg Rect
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_RECT_TAG	TokenNameIdentifier	 SVG  RECT  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgRect	TokenNameIdentifier	 svg Rect
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_X_ATTRIBUTE	TokenNameIdentifier	 SVG  X  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgRect	TokenNameIdentifier	 svg Rect
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  Y  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgRect	TokenNameIdentifier	 svg Rect
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_WIDTH_ATTRIBUTE	TokenNameIdentifier	 SVG  WIDTH  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgRect	TokenNameIdentifier	 svg Rect
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_HEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  HEIGHT  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
svgRect	TokenNameIdentifier	 svg Rect
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Handle degenerate cases 	TokenNameCOMMENT_LINE	Handle degenerate cases 
if	TokenNameif	
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Degenerate to a line 	TokenNameCOMMENT_LINE	Degenerate to a line 
Line2D	TokenNameIdentifier	 Line2 D
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
new	TokenNamenew	
Line2D	TokenNameIdentifier	 Line2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
svgLine	TokenNameIdentifier	 svg Line
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Degenerate to a line 	TokenNameCOMMENT_LINE	Degenerate to a line 
Line2D	TokenNameIdentifier	 Line2 D
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
new	TokenNamenew	
Line2D	TokenNameIdentifier	 Line2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
svgLine	TokenNameIdentifier	 svg Line
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
