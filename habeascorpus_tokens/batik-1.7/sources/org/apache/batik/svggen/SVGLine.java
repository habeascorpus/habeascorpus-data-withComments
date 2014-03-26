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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * Utility class that converts a Line2D object into * a corresponding SVG line element. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGLine.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a Line2D object into a corresponding SVG line element. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGLine.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGLine	TokenNameIdentifier	 SVG Line
extends	TokenNameextends	
SVGGraphicObjectConverter	TokenNameIdentifier	 SVG Graphic Object Converter
{	TokenNameLBRACE	
/** * @param generatorContext used to build Elements */	TokenNameCOMMENT_JAVADOC	 @param generatorContext used to build Elements 
public	TokenNamepublic	
SVGLine	TokenNameIdentifier	 SVG Line
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
/** * @param line the Line2D object to be converted */	TokenNameCOMMENT_JAVADOC	 @param line the Line2D object to be converted 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
Line2D	TokenNameIdentifier	 Line2 D
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
svgLine	TokenNameIdentifier	 svg Line
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_LINE_TAG	TokenNameIdentifier	 SVG  LINE  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgLine	TokenNameIdentifier	 svg Line
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_X1_ATTRIBUTE	TokenNameIdentifier	 SVG  X1  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
getX1	TokenNameIdentifier	 get X1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgLine	TokenNameIdentifier	 svg Line
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y1_ATTRIBUTE	TokenNameIdentifier	 SVG  Y1  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
getY1	TokenNameIdentifier	 get Y1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgLine	TokenNameIdentifier	 svg Line
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_X2_ATTRIBUTE	TokenNameIdentifier	 SVG  X2  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
getX2	TokenNameIdentifier	 get X2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgLine	TokenNameIdentifier	 svg Line
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y2_ATTRIBUTE	TokenNameIdentifier	 SVG  Y2  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
getY2	TokenNameIdentifier	 get Y2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
svgLine	TokenNameIdentifier	 svg Line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
