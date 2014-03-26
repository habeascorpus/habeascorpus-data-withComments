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
Ellipse2D	TokenNameIdentifier	 Ellipse2 D
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * Utility class that converts an Ellipse2D object into * a corresponding SVG element, i.e., a circle or an ellipse. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGEllipse.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Utility class that converts an Ellipse2D object into a corresponding SVG element, i.e., a circle or an ellipse. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGEllipse.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGEllipse	TokenNameIdentifier	 SVG Ellipse
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
SVGEllipse	TokenNameIdentifier	 SVG Ellipse
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
/** * @param ellipse the Ellipse2D object to be converted */	TokenNameCOMMENT_JAVADOC	 @param ellipse the Ellipse2D object to be converted 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
Ellipse2D	TokenNameIdentifier	 Ellipse2 D
ellipse	TokenNameIdentifier	 ellipse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
toSVGCircle	TokenNameIdentifier	 to SVG Circle
(	TokenNameLPAREN	
ellipse	TokenNameIdentifier	 ellipse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
toSVGEllipse	TokenNameIdentifier	 to SVG Ellipse
(	TokenNameLPAREN	
ellipse	TokenNameIdentifier	 ellipse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param ellipse the Ellipse2D object to be converted to a circle */	TokenNameCOMMENT_JAVADOC	 @param ellipse the Ellipse2D object to be converted to a circle 
private	TokenNameprivate	
Element	TokenNameIdentifier	 Element
toSVGCircle	TokenNameIdentifier	 to SVG Circle
(	TokenNameLPAREN	
Ellipse2D	TokenNameIdentifier	 Ellipse2 D
ellipse	TokenNameIdentifier	 ellipse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
svgCircle	TokenNameIdentifier	 svg Circle
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_CIRCLE_TAG	TokenNameIdentifier	 SVG  CIRCLE  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgCircle	TokenNameIdentifier	 svg Circle
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_CX_ATTRIBUTE	TokenNameIdentifier	 SVG  CX  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgCircle	TokenNameIdentifier	 svg Circle
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_CY_ATTRIBUTE	TokenNameIdentifier	 SVG  CY  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgCircle	TokenNameIdentifier	 svg Circle
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_R_ATTRIBUTE	TokenNameIdentifier	 SVG  R  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
svgCircle	TokenNameIdentifier	 svg Circle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param ellipse the Ellipse2D object to be converted to an ellipse */	TokenNameCOMMENT_JAVADOC	 @param ellipse the Ellipse2D object to be converted to an ellipse 
private	TokenNameprivate	
Element	TokenNameIdentifier	 Element
toSVGEllipse	TokenNameIdentifier	 to SVG Ellipse
(	TokenNameLPAREN	
Ellipse2D	TokenNameIdentifier	 Ellipse2 D
ellipse	TokenNameIdentifier	 ellipse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
svgCircle	TokenNameIdentifier	 svg Circle
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_ELLIPSE_TAG	TokenNameIdentifier	 SVG  ELLIPSE  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgCircle	TokenNameIdentifier	 svg Circle
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_CX_ATTRIBUTE	TokenNameIdentifier	 SVG  CX  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgCircle	TokenNameIdentifier	 svg Circle
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_CY_ATTRIBUTE	TokenNameIdentifier	 SVG  CY  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgCircle	TokenNameIdentifier	 svg Circle
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RX_ATTRIBUTE	TokenNameIdentifier	 SVG  RX  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgCircle	TokenNameIdentifier	 svg Circle
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RY_ATTRIBUTE	TokenNameIdentifier	 SVG  RY  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
svgCircle	TokenNameIdentifier	 svg Circle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ellipse	TokenNameIdentifier	 ellipse
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
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
svgLine	TokenNameIdentifier	 svg Line
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
svgLine	TokenNameIdentifier	 svg Line
=	TokenNameEQUAL	
new	TokenNamenew	
SVGLine	TokenNameIdentifier	 SVG Line
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
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
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ellipse	TokenNameIdentifier	 ellipse
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
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ellipse	TokenNameIdentifier	 ellipse
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
svgLine	TokenNameIdentifier	 svg Line
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
svgLine	TokenNameIdentifier	 svg Line
=	TokenNameEQUAL	
new	TokenNamenew	
SVGLine	TokenNameIdentifier	 SVG Line
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
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
