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
Polygon	TokenNameIdentifier	 Polygon
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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Arc2D	TokenNameIdentifier	 Arc2 D
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
/** * Utility class that converts a Shape object into the corresponding * SVG element. Note that this class analyzes the input Shape class * to generate the most appropriate corresponding SVG element: * + Polygon is mapped to polygon * + Rectangle2D and RoundRectangle2D are mapped to rect * + Ellipse2D is mapped to circle or ellipse * + Line2D is mapped to line * + Arc2D, CubicCurve2D, Area, GeneralPath and QuadCurve2D are mapped to * path. * + Any custom Shape implementation is mapped to path as well. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGShape.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a Shape object into the corresponding SVG element. Note that this class analyzes the input Shape class to generate the most appropriate corresponding SVG element: + Polygon is mapped to polygon + Rectangle2D and RoundRectangle2D are mapped to rect + Ellipse2D is mapped to circle or ellipse + Line2D is mapped to line + Arc2D, CubicCurve2D, Area, GeneralPath and QuadCurve2D are mapped to path. + Any custom Shape implementation is mapped to path as well. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGShape.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGShape	TokenNameIdentifier	 SVG Shape
extends	TokenNameextends	
SVGGraphicObjectConverter	TokenNameIdentifier	 SVG Graphic Object Converter
{	TokenNameLBRACE	
/* * Subconverts, for each type of Shape class */	TokenNameCOMMENT_BLOCK	 Subconverts, for each type of Shape class 
private	TokenNameprivate	
SVGArc	TokenNameIdentifier	 SVG Arc
svgArc	TokenNameIdentifier	 svg Arc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SVGEllipse	TokenNameIdentifier	 SVG Ellipse
svgEllipse	TokenNameIdentifier	 svg Ellipse
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SVGLine	TokenNameIdentifier	 SVG Line
svgLine	TokenNameIdentifier	 svg Line
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SVGPath	TokenNameIdentifier	 SVG Path
svgPath	TokenNameIdentifier	 svg Path
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SVGPolygon	TokenNameIdentifier	 SVG Polygon
svgPolygon	TokenNameIdentifier	 svg Polygon
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SVGRectangle	TokenNameIdentifier	 SVG Rectangle
svgRectangle	TokenNameIdentifier	 svg Rectangle
;	TokenNameSEMICOLON	
/** * @param generatorContext used to build Elements */	TokenNameCOMMENT_JAVADOC	 @param generatorContext used to build Elements 
public	TokenNamepublic	
SVGShape	TokenNameIdentifier	 SVG Shape
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
svgArc	TokenNameIdentifier	 svg Arc
=	TokenNameEQUAL	
new	TokenNamenew	
SVGArc	TokenNameIdentifier	 SVG Arc
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgEllipse	TokenNameIdentifier	 svg Ellipse
=	TokenNameEQUAL	
new	TokenNamenew	
SVGEllipse	TokenNameIdentifier	 SVG Ellipse
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
svgPath	TokenNameIdentifier	 svg Path
=	TokenNameEQUAL	
new	TokenNamenew	
SVGPath	TokenNameIdentifier	 SVG Path
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgPolygon	TokenNameIdentifier	 svg Polygon
=	TokenNameEQUAL	
new	TokenNamenew	
SVGPolygon	TokenNameIdentifier	 SVG Polygon
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgRectangle	TokenNameIdentifier	 svg Rectangle
=	TokenNameEQUAL	
new	TokenNamenew	
SVGRectangle	TokenNameIdentifier	 SVG Rectangle
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param shape Shape object to be converted */	TokenNameCOMMENT_JAVADOC	 @param shape Shape object to be converted 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
instanceof	TokenNameinstanceof	
Polygon	TokenNameIdentifier	 Polygon
)	TokenNameRPAREN	
return	TokenNamereturn	
svgPolygon	TokenNameIdentifier	 svg Polygon
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Polygon	TokenNameIdentifier	 Polygon
)	TokenNameRPAREN	
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
instanceof	TokenNameinstanceof	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
)	TokenNameRPAREN	
return	TokenNamereturn	
svgRectangle	TokenNameIdentifier	 svg Rectangle
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
)	TokenNameRPAREN	
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
instanceof	TokenNameinstanceof	
RoundRectangle2D	TokenNameIdentifier	 Round Rectangle2 D
)	TokenNameRPAREN	
return	TokenNamereturn	
svgRectangle	TokenNameIdentifier	 svg Rectangle
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RoundRectangle2D	TokenNameIdentifier	 Round Rectangle2 D
)	TokenNameRPAREN	
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
instanceof	TokenNameinstanceof	
Ellipse2D	TokenNameIdentifier	 Ellipse2 D
)	TokenNameRPAREN	
return	TokenNamereturn	
svgEllipse	TokenNameIdentifier	 svg Ellipse
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Ellipse2D	TokenNameIdentifier	 Ellipse2 D
)	TokenNameRPAREN	
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
instanceof	TokenNameinstanceof	
Line2D	TokenNameIdentifier	 Line2 D
)	TokenNameRPAREN	
return	TokenNamereturn	
svgLine	TokenNameIdentifier	 svg Line
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Line2D	TokenNameIdentifier	 Line2 D
)	TokenNameRPAREN	
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
instanceof	TokenNameinstanceof	
Arc2D	TokenNameIdentifier	 Arc2 D
)	TokenNameRPAREN	
return	TokenNamereturn	
svgArc	TokenNameIdentifier	 svg Arc
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Arc2D	TokenNameIdentifier	 Arc2 D
)	TokenNameRPAREN	
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
svgPath	TokenNameIdentifier	 svg Path
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
