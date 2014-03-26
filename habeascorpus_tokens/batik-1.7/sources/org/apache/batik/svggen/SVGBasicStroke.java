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
BasicStroke	TokenNameIdentifier	 Basic Stroke
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
/** * Utility class that converts a Java BasicStroke object into * a set of SVG style attributes * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGBasicStroke.java 476924 2006-11-19 21:13:26Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a Java BasicStroke object into a set of SVG style attributes * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGBasicStroke.java 476924 2006-11-19 21:13:26Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGBasicStroke	TokenNameIdentifier	 SVG Basic Stroke
extends	TokenNameextends	
AbstractSVGConverter	TokenNameIdentifier	 Abstract SVG Converter
{	TokenNameLBRACE	
/** * @param generatorContext used by converter to handle precision * or to create elements. */	TokenNameCOMMENT_JAVADOC	 @param generatorContext used by converter to handle precision or to create elements. 
public	TokenNamepublic	
SVGBasicStroke	TokenNameIdentifier	 SVG Basic Stroke
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
/** * Converts part or all of the input GraphicContext into * a set of attribute/value pairs and related definitions * * @param gc GraphicContext to be converted * @return descriptor of the attributes required to represent * some or all of the GraphicContext state, along * with the related definitions * @see org.apache.batik.svggen.SVGDescriptor */	TokenNameCOMMENT_JAVADOC	 Converts part or all of the input GraphicContext into a set of attribute/value pairs and related definitions * @param gc GraphicContext to be converted @return descriptor of the attributes required to represent some or all of the GraphicContext state, along with the related definitions @see org.apache.batik.svggen.SVGDescriptor 
public	TokenNamepublic	
SVGDescriptor	TokenNameIdentifier	 SVG Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
GraphicContext	TokenNameIdentifier	 Graphic Context
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getStroke	TokenNameIdentifier	 get Stroke
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
BasicStroke	TokenNameIdentifier	 Basic Stroke
)	TokenNameRPAREN	
return	TokenNamereturn	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BasicStroke	TokenNameIdentifier	 Basic Stroke
)	TokenNameRPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getStroke	TokenNameIdentifier	 get Stroke
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param stroke BasicStroke to convert to a set of * SVG attributes * @return map of attributes describing the stroke */	TokenNameCOMMENT_JAVADOC	 @param stroke BasicStroke to convert to a set of SVG attributes @return map of attributes describing the stroke 
public	TokenNamepublic	
final	TokenNamefinal	
SVGStrokeDescriptor	TokenNameIdentifier	 SVG Stroke Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
BasicStroke	TokenNameIdentifier	 Basic Stroke
stroke	TokenNameIdentifier	 stroke
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Stroke width 	TokenNameCOMMENT_LINE	Stroke width 
String	TokenNameIdentifier	 String
strokeWidth	TokenNameIdentifier	 stroke Width
=	TokenNameEQUAL	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
stroke	TokenNameIdentifier	 stroke
.	TokenNameDOT	
getLineWidth	TokenNameIdentifier	 get Line Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Cap style 	TokenNameCOMMENT_LINE	Cap style 
String	TokenNameIdentifier	 String
capStyle	TokenNameIdentifier	 cap Style
=	TokenNameEQUAL	
endCapToSVG	TokenNameIdentifier	 end Cap To SVG
(	TokenNameLPAREN	
stroke	TokenNameIdentifier	 stroke
.	TokenNameDOT	
getEndCap	TokenNameIdentifier	 get End Cap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Join style 	TokenNameCOMMENT_LINE	Join style 
String	TokenNameIdentifier	 String
joinStyle	TokenNameIdentifier	 join Style
=	TokenNameEQUAL	
joinToSVG	TokenNameIdentifier	 join To SVG
(	TokenNameLPAREN	
stroke	TokenNameIdentifier	 stroke
.	TokenNameDOT	
getLineJoin	TokenNameIdentifier	 get Line Join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Miter limit 	TokenNameCOMMENT_LINE	Miter limit 
String	TokenNameIdentifier	 String
miterLimit	TokenNameIdentifier	 miter Limit
=	TokenNameEQUAL	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
stroke	TokenNameIdentifier	 stroke
.	TokenNameDOT	
getMiterLimit	TokenNameIdentifier	 get Miter Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Dash array 	TokenNameCOMMENT_LINE	Dash array 
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
stroke	TokenNameIdentifier	 stroke
.	TokenNameDOT	
getDashArray	TokenNameIdentifier	 get Dash Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dashArray	TokenNameIdentifier	 dash Array
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
dashArray	TokenNameIdentifier	 dash Array
=	TokenNameEQUAL	
dashArrayToSVG	TokenNameIdentifier	 dash Array To SVG
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
dashArray	TokenNameIdentifier	 dash Array
=	TokenNameEQUAL	
SVG_NONE_VALUE	TokenNameIdentifier	 SVG  NONE  VALUE
;	TokenNameSEMICOLON	
// Dash offset 	TokenNameCOMMENT_LINE	Dash offset 
String	TokenNameIdentifier	 String
dashOffset	TokenNameIdentifier	 dash Offset
=	TokenNameEQUAL	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
stroke	TokenNameIdentifier	 stroke
.	TokenNameDOT	
getDashPhase	TokenNameIdentifier	 get Dash Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGStrokeDescriptor	TokenNameIdentifier	 SVG Stroke Descriptor
(	TokenNameLPAREN	
strokeWidth	TokenNameIdentifier	 stroke Width
,	TokenNameCOMMA	
capStyle	TokenNameIdentifier	 cap Style
,	TokenNameCOMMA	
joinStyle	TokenNameIdentifier	 join Style
,	TokenNameCOMMA	
miterLimit	TokenNameIdentifier	 miter Limit
,	TokenNameCOMMA	
dashArray	TokenNameIdentifier	 dash Array
,	TokenNameCOMMA	
dashOffset	TokenNameIdentifier	 dash Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param dashArray float array to convert to a string */	TokenNameCOMMENT_JAVADOC	 @param dashArray float array to convert to a string 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
dashArrayToSVG	TokenNameIdentifier	 dash Array To SVG
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dashArray	TokenNameIdentifier	 dash Array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
dashArrayBuf	TokenNameIdentifier	 dash Array Buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
dashArray	TokenNameIdentifier	 dash Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dashArray	TokenNameIdentifier	 dash Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
dashArrayBuf	TokenNameIdentifier	 dash Array Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
dashArray	TokenNameIdentifier	 dash Array
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
dashArray	TokenNameIdentifier	 dash Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dashArrayBuf	TokenNameIdentifier	 dash Array Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
COMMA	TokenNameIdentifier	 COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dashArrayBuf	TokenNameIdentifier	 dash Array Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
dashArray	TokenNameIdentifier	 dash Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
dashArrayBuf	TokenNameIdentifier	 dash Array Buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param lineJoin join style */	TokenNameCOMMENT_JAVADOC	 @param lineJoin join style 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
joinToSVG	TokenNameIdentifier	 join To SVG
(	TokenNameLPAREN	
int	TokenNameint	
lineJoin	TokenNameIdentifier	 line Join
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
lineJoin	TokenNameIdentifier	 line Join
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
BasicStroke	TokenNameIdentifier	 Basic Stroke
.	TokenNameDOT	
JOIN_BEVEL	TokenNameIdentifier	 JOIN  BEVEL
:	TokenNameCOLON	
return	TokenNamereturn	
SVG_BEVEL_VALUE	TokenNameIdentifier	 SVG  BEVEL  VALUE
;	TokenNameSEMICOLON	
case	TokenNamecase	
BasicStroke	TokenNameIdentifier	 Basic Stroke
.	TokenNameDOT	
JOIN_ROUND	TokenNameIdentifier	 JOIN  ROUND
:	TokenNameCOLON	
return	TokenNamereturn	
SVG_ROUND_VALUE	TokenNameIdentifier	 SVG  ROUND  VALUE
;	TokenNameSEMICOLON	
case	TokenNamecase	
BasicStroke	TokenNameIdentifier	 Basic Stroke
.	TokenNameDOT	
JOIN_MITER	TokenNameIdentifier	 JOIN  MITER
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
SVG_MITER_VALUE	TokenNameIdentifier	 SVG  MITER  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @param endCap cap style */	TokenNameCOMMENT_JAVADOC	 @param endCap cap style 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
endCapToSVG	TokenNameIdentifier	 end Cap To SVG
(	TokenNameLPAREN	
int	TokenNameint	
endCap	TokenNameIdentifier	 end Cap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
endCap	TokenNameIdentifier	 end Cap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
BasicStroke	TokenNameIdentifier	 Basic Stroke
.	TokenNameDOT	
CAP_BUTT	TokenNameIdentifier	 CAP  BUTT
:	TokenNameCOLON	
return	TokenNamereturn	
SVG_BUTT_VALUE	TokenNameIdentifier	 SVG  BUTT  VALUE
;	TokenNameSEMICOLON	
case	TokenNamecase	
BasicStroke	TokenNameIdentifier	 Basic Stroke
.	TokenNameDOT	
CAP_ROUND	TokenNameIdentifier	 CAP  ROUND
:	TokenNameCOLON	
return	TokenNamereturn	
SVG_ROUND_VALUE	TokenNameIdentifier	 SVG  ROUND  VALUE
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
case	TokenNamecase	
BasicStroke	TokenNameIdentifier	 Basic Stroke
.	TokenNameDOT	
CAP_SQUARE	TokenNameIdentifier	 CAP  SQUARE
:	TokenNameCOLON	
return	TokenNamereturn	
SVG_SQUARE_VALUE	TokenNameIdentifier	 SVG  SQUARE  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
