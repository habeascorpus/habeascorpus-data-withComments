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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
PathIterator	TokenNameIdentifier	 Path Iterator
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
/** * Utility class that converts a Polygon object into * an SVG element. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGPolygon.java 504084 2007-02-06 11:24:46Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a Polygon object into an SVG element. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGPolygon.java 504084 2007-02-06 11:24:46Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGPolygon	TokenNameIdentifier	 SVG Polygon
extends	TokenNameextends	
SVGGraphicObjectConverter	TokenNameIdentifier	 SVG Graphic Object Converter
{	TokenNameLBRACE	
/** * @param generatorContext used to build Elements */	TokenNameCOMMENT_JAVADOC	 @param generatorContext used to build Elements 
public	TokenNamepublic	
SVGPolygon	TokenNameIdentifier	 SVG Polygon
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
/** * @param polygon polygon object to convert to SVG */	TokenNameCOMMENT_JAVADOC	 @param polygon polygon object to convert to SVG 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
Polygon	TokenNameIdentifier	 Polygon
polygon	TokenNameIdentifier	 polygon
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
svgPolygon	TokenNameIdentifier	 svg Polygon
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_POLYGON_TAG	TokenNameIdentifier	 SVG  POLYGON  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
points	TokenNameIdentifier	 points
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PathIterator	TokenNameIdentifier	 Path Iterator
pi	TokenNameIdentifier	 pi
=	TokenNameEQUAL	
polygon	TokenNameIdentifier	 polygon
.	TokenNameDOT	
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
seg	TokenNameIdentifier	 seg
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
segType	TokenNameIdentifier	 seg Type
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
segType	TokenNameIdentifier	 seg Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
:	TokenNameCOLON	
appendPoint	TokenNameIdentifier	 append Point
(	TokenNameLPAREN	
points	TokenNameIdentifier	 points
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
:	TokenNameCOLON	
appendPoint	TokenNameIdentifier	 append Point
(	TokenNameLPAREN	
points	TokenNameIdentifier	 points
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_QUADTO	TokenNameIdentifier	 SEG  QUADTO
:	TokenNameCOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CUBICTO	TokenNameIdentifier	 SEG  CUBICTO
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"invalid segmentType:"	TokenNameStringLiteral	invalid segmentType:
+	TokenNamePLUS	
segType	TokenNameIdentifier	 seg Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// while !isDone 	TokenNameCOMMENT_LINE	while !isDone 
svgPolygon	TokenNameIdentifier	 svg Polygon
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_POINTS_ATTRIBUTE	TokenNameIdentifier	 SVG  POINTS  ATTRIBUTE
,	TokenNameCOMMA	
points	TokenNameIdentifier	 points
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
points	TokenNameIdentifier	 points
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
svgPolygon	TokenNameIdentifier	 svg Polygon
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Appends a coordinate to the path data */	TokenNameCOMMENT_JAVADOC	 Appends a coordinate to the path data 
private	TokenNameprivate	
void	TokenNamevoid	
appendPoint	TokenNameIdentifier	 append Point
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
points	TokenNameIdentifier	 points
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
points	TokenNameIdentifier	 points
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
points	TokenNameIdentifier	 points
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SPACE	TokenNameIdentifier	 SPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
points	TokenNameIdentifier	 points
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
points	TokenNameIdentifier	 points
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SPACE	TokenNameIdentifier	 SPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
