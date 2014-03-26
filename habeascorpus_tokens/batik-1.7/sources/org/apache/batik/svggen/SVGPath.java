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
Shape	TokenNameIdentifier	 Shape
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
GeneralPath	TokenNameIdentifier	 General Path
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
/** * Utility class that converts a Shape object into an SVG * path element. Note that this class does not attempt to * find out what type of object (e.g., whether the input * Shape is a Rectangle or an Ellipse. This type of analysis * is done by the SVGShape class). * Note that this class assumes that the parent of the * path element it generates defines the fill-rule as * nonzero. This is not the SVG default value. However, * because it is the GeneralPath's default, it is preferable * to have this attribute specified once to set the default * (in the parent element, e.g., a group) and then only in * the rare instance where the winding rule is different * than the default. Otherwise, the attribute would have * to be specified in the majority of path elements. * * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGPath.java 504084 2007-02-06 11:24:46Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a Shape object into an SVG path element. Note that this class does not attempt to find out what type of object (e.g., whether the input Shape is a Rectangle or an Ellipse. This type of analysis is done by the SVGShape class). Note that this class assumes that the parent of the path element it generates defines the fill-rule as nonzero. This is not the SVG default value. However, because it is the GeneralPath's default, it is preferable to have this attribute specified once to set the default (in the parent element, e.g., a group) and then only in the rare instance where the winding rule is different than the default. Otherwise, the attribute would have to be specified in the majority of path elements. * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGPath.java 504084 2007-02-06 11:24:46Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGPath	TokenNameIdentifier	 SVG Path
extends	TokenNameextends	
SVGGraphicObjectConverter	TokenNameIdentifier	 SVG Graphic Object Converter
{	TokenNameLBRACE	
/** * @param generatorContext used to build Elements */	TokenNameCOMMENT_JAVADOC	 @param generatorContext used to build Elements 
public	TokenNamepublic	
SVGPath	TokenNameIdentifier	 SVG Path
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
/** * @param path the Shape that should be converted to an SVG path * element. * @return a path Element. */	TokenNameCOMMENT_JAVADOC	 @param path the Shape that should be converted to an SVG path element. @return a path Element. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Create the path element and process its 	TokenNameCOMMENT_LINE	Create the path element and process its 
// d attribute. 	TokenNameCOMMENT_LINE	d attribute. 
String	TokenNameIdentifier	 String
dAttr	TokenNameIdentifier	 d Attr
=	TokenNameEQUAL	
toSVGPathData	TokenNameIdentifier	 to SVG Path Data
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dAttr	TokenNameIdentifier	 d Attr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
dAttr	TokenNameIdentifier	 d Attr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// be careful not to append null to the DOM tree 	TokenNameCOMMENT_LINE	be careful not to append null to the DOM tree 
// because it will crash 	TokenNameCOMMENT_LINE	because it will crash 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Element	TokenNameIdentifier	 Element
svgPath	TokenNameIdentifier	 svg Path
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_PATH_TAG	TokenNameIdentifier	 SVG  PATH  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgPath	TokenNameIdentifier	 svg Path
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_D_ATTRIBUTE	TokenNameIdentifier	 SVG  D  ATTRIBUTE
,	TokenNameCOMMA	
dAttr	TokenNameIdentifier	 d Attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set winding rule if different than SVG's default 	TokenNameCOMMENT_LINE	Set winding rule if different than SVG's default 
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
getWindingRule	TokenNameIdentifier	 get Winding Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
GeneralPath	TokenNameIdentifier	 General Path
.	TokenNameDOT	
WIND_EVEN_ODD	TokenNameIdentifier	 WIND  EVEN  ODD
)	TokenNameRPAREN	
svgPath	TokenNameIdentifier	 svg Path
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_FILL_RULE_ATTRIBUTE	TokenNameIdentifier	 SVG  FILL  RULE  ATTRIBUTE
,	TokenNameCOMMA	
SVG_EVEN_ODD_VALUE	TokenNameIdentifier	 SVG  EVEN  ODD  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
svgPath	TokenNameIdentifier	 svg Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param path the GeneralPath to convert * @return the value of the corresponding d attribute */	TokenNameCOMMENT_JAVADOC	 @param path the GeneralPath to convert @return the value of the corresponding d attribute 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
toSVGPathData	TokenNameIdentifier	 to SVG Path Data
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
40	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PathIterator	TokenNameIdentifier	 Path Iterator
pi	TokenNameIdentifier	 pi
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
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
int	TokenNameint	
segType	TokenNameIdentifier	 seg Type
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
d	TokenNameIdentifier	 d
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
PATH_MOVE	TokenNameIdentifier	 PATH  MOVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendPoint	TokenNameIdentifier	 append Point
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
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
,	TokenNameCOMMA	
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
:	TokenNameCOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
PATH_LINE_TO	TokenNameIdentifier	 PATH  LINE  TO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendPoint	TokenNameIdentifier	 append Point
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
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
,	TokenNameCOMMA	
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
:	TokenNameCOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
PATH_CLOSE	TokenNameIdentifier	 PATH  CLOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_QUADTO	TokenNameIdentifier	 SEG  QUADTO
:	TokenNameCOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
PATH_QUAD_TO	TokenNameIdentifier	 PATH  QUAD  TO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendPoint	TokenNameIdentifier	 append Point
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
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
,	TokenNameCOMMA	
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendPoint	TokenNameIdentifier	 append Point
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CUBICTO	TokenNameIdentifier	 SEG  CUBICTO
:	TokenNameCOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
PATH_CUBIC_TO	TokenNameIdentifier	 PATH  CUBIC  TO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendPoint	TokenNameIdentifier	 append Point
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
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
,	TokenNameCOMMA	
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendPoint	TokenNameIdentifier	 append Point
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendPoint	TokenNameIdentifier	 append Point
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
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
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// This is a degenerate case: there was no initial moveTo 	TokenNameCOMMENT_LINE	This is a degenerate case: there was no initial moveTo 
// in the path and no data at all. However, this happens 	TokenNameCOMMENT_LINE	in the path and no data at all. However, this happens 
// in the Java 2D API (e.g., when clipping to a rectangle 	TokenNameCOMMENT_LINE	in the Java 2D API (e.g., when clipping to a rectangle 
// with negative height/width, the clip will be a GeneralPath 	TokenNameCOMMENT_LINE	with negative height/width, the clip will be a GeneralPath 
// with no data, which causes everything to be clipped) 	TokenNameCOMMENT_LINE	with no data, which causes everything to be clipped) 
// It is the responsibility of the users of SVGPath to detect 	TokenNameCOMMENT_LINE	It is the responsibility of the users of SVGPath to detect 
// instances where the converted element (see #toSVG above) 	TokenNameCOMMENT_LINE	instances where the converted element (see #toSVG above) 
// returns null, which only happens for degenerate cases. 	TokenNameCOMMENT_LINE	returns null, which only happens for degenerate cases. 
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Appends a coordinate to the path data */	TokenNameCOMMENT_JAVADOC	 Appends a coordinate to the path data 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
appendPoint	TokenNameIdentifier	 append Point
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SPACE	TokenNameIdentifier	 SPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SPACE	TokenNameIdentifier	 SPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
