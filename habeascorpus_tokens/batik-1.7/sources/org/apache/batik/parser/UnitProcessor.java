/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGLength	TokenNameIdentifier	 SVG Length
;	TokenNameSEMICOLON	
/** * This class provides methods to convert SVG length and coordinate to * float in user units. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: UnitProcessor.java 480490 2006-11-29 09:02:20Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides methods to convert SVG length and coordinate to float in user units. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: UnitProcessor.java 480490 2006-11-29 09:02:20Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
UnitProcessor	TokenNameIdentifier	 Unit Processor
{	TokenNameLBRACE	
/** * This constant represents horizontal lengths. */	TokenNameCOMMENT_JAVADOC	 This constant represents horizontal lengths. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
HORIZONTAL_LENGTH	TokenNameIdentifier	 HORIZONTAL  LENGTH
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This constant represents vertical lengths. */	TokenNameCOMMENT_JAVADOC	 This constant represents vertical lengths. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
VERTICAL_LENGTH	TokenNameIdentifier	 VERTICAL  LENGTH
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This constant represents other lengths. */	TokenNameCOMMENT_JAVADOC	 This constant represents other lengths. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
OTHER_LENGTH	TokenNameIdentifier	 OTHER  LENGTH
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * precomputed square-root of 2.0 */	TokenNameCOMMENT_JAVADOC	 precomputed square-root of 2.0 
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
SQRT2	TokenNameIdentifier	 SQR T2
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
2.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * No instance of this class is required. */	TokenNameCOMMENT_JAVADOC	 No instance of this class is required. 
protected	TokenNameprotected	
UnitProcessor	TokenNameIdentifier	 Unit Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns the specified value with the specified direction in * objectBoundingBox units. * * @param s the value * @param attr the attribute name that represents the value * @param d the direction of the value * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified value with the specified direction in objectBoundingBox units. * @param s the value @param attr the attribute name that represents the value @param d the direction of the value @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgToObjectBoundingBox	TokenNameIdentifier	 svg To Object Bounding Box
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
short	TokenNameshort	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
LengthParser	TokenNameIdentifier	 Length Parser
lengthParser	TokenNameIdentifier	 length Parser
=	TokenNameEQUAL	
new	TokenNamenew	
LengthParser	TokenNameIdentifier	 Length Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnitResolver	TokenNameIdentifier	 Unit Resolver
ur	TokenNameIdentifier	 ur
=	TokenNameEQUAL	
new	TokenNamenew	
UnitResolver	TokenNameIdentifier	 Unit Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lengthParser	TokenNameIdentifier	 length Parser
.	TokenNameDOT	
setLengthHandler	TokenNameIdentifier	 set Length Handler
(	TokenNameLPAREN	
ur	TokenNameIdentifier	 ur
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lengthParser	TokenNameIdentifier	 length Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
svgToObjectBoundingBox	TokenNameIdentifier	 svg To Object Bounding Box
(	TokenNameLPAREN	
ur	TokenNameIdentifier	 ur
.	TokenNameDOT	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
ur	TokenNameIdentifier	 ur
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified value with the specified direction in * objectBoundingBox units. * * @param value the value * @param type the type of the value * @param d the direction of the value * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified value with the specified direction in objectBoundingBox units. * @param value the value @param type the type of the value @param d the direction of the value @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgToObjectBoundingBox	TokenNameIdentifier	 svg To Object Bounding Box
(	TokenNameLPAREN	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
short	TokenNameshort	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_NUMBER	TokenNameIdentifier	 SVG  LENGTHTYPE  NUMBER
:	TokenNameCOLON	
// as is 	TokenNameCOMMENT_LINE	as is 
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PERCENTAGE	TokenNameIdentifier	 SVG  LENGTHTYPE  PERCENTAGE
:	TokenNameCOLON	
// If a percentage value is used, it is converted to a 	TokenNameCOMMENT_LINE	If a percentage value is used, it is converted to a 
// 'bounding box' space coordinate by division by 100 	TokenNameCOMMENT_LINE	'bounding box' space coordinate by division by 100 
return	TokenNamereturn	
value	TokenNameIdentifier	 value
/	TokenNameDIVIDE	
100f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PX	TokenNameIdentifier	 SVG  LENGTHTYPE  PX
:	TokenNameCOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_MM	TokenNameIdentifier	 SVG  LENGTHTYPE  MM
:	TokenNameCOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_CM	TokenNameIdentifier	 SVG  LENGTHTYPE  CM
:	TokenNameCOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_IN	TokenNameIdentifier	 SVG  LENGTHTYPE  IN
:	TokenNameCOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PT	TokenNameIdentifier	 SVG  LENGTHTYPE  PT
:	TokenNameCOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PC	TokenNameIdentifier	 SVG  LENGTHTYPE  PC
:	TokenNameCOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_EMS	TokenNameIdentifier	 SVG  LENGTHTYPE  EMS
:	TokenNameCOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_EXS	TokenNameIdentifier	 SVG  LENGTHTYPE  EXS
:	TokenNameCOLON	
// <!> FIXME: resolve units in userSpace but consider them 	TokenNameCOMMENT_LINE	<!> FIXME: resolve units in userSpace but consider them 
// in the objectBoundingBox coordinate system 	TokenNameCOMMENT_LINE	in the objectBoundingBox coordinate system 
return	TokenNamereturn	
svgToUserSpace	TokenNameIdentifier	 svg To User Space
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Length has unknown type"	TokenNameStringLiteral	Length has unknown type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
// SVG methods - userSpace 	TokenNameCOMMENT_LINE	SVG methods - userSpace 
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
/** * Returns the specified coordinate with the specified direction * in user units. * * @param s the 'other' coordinate * @param attr the attribute name that represents the length * @param d the direction of the coordinate * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified coordinate with the specified direction in user units. * @param s the 'other' coordinate @param attr the attribute name that represents the length @param d the direction of the coordinate @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgToUserSpace	TokenNameIdentifier	 svg To User Space
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
short	TokenNameshort	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
LengthParser	TokenNameIdentifier	 Length Parser
lengthParser	TokenNameIdentifier	 length Parser
=	TokenNameEQUAL	
new	TokenNamenew	
LengthParser	TokenNameIdentifier	 Length Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnitResolver	TokenNameIdentifier	 Unit Resolver
ur	TokenNameIdentifier	 ur
=	TokenNameEQUAL	
new	TokenNamenew	
UnitResolver	TokenNameIdentifier	 Unit Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lengthParser	TokenNameIdentifier	 length Parser
.	TokenNameDOT	
setLengthHandler	TokenNameIdentifier	 set Length Handler
(	TokenNameLPAREN	
ur	TokenNameIdentifier	 ur
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lengthParser	TokenNameIdentifier	 length Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
svgToUserSpace	TokenNameIdentifier	 svg To User Space
(	TokenNameLPAREN	
ur	TokenNameIdentifier	 ur
.	TokenNameDOT	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
ur	TokenNameIdentifier	 ur
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts the specified value of the specified type and * direction to user units. * * @param v the value to convert * @param type the type of the value * @param d HORIZONTAL_LENGTH, VERTICAL_LENGTH, or OTHER_LENGTH * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Converts the specified value of the specified type and direction to user units. * @param v the value to convert @param type the type of the value @param d HORIZONTAL_LENGTH, VERTICAL_LENGTH, or OTHER_LENGTH @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgToUserSpace	TokenNameIdentifier	 svg To User Space
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
short	TokenNameshort	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_NUMBER	TokenNameIdentifier	 SVG  LENGTHTYPE  NUMBER
:	TokenNameCOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PX	TokenNameIdentifier	 SVG  LENGTHTYPE  PX
:	TokenNameCOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_MM	TokenNameIdentifier	 SVG  LENGTHTYPE  MM
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
/	TokenNameDIVIDE	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_CM	TokenNameIdentifier	 SVG  LENGTHTYPE  CM
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
10f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_IN	TokenNameIdentifier	 SVG  LENGTHTYPE  IN
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
25.4f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PT	TokenNameIdentifier	 SVG  LENGTHTYPE  PT
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
25.4f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
72f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PC	TokenNameIdentifier	 SVG  LENGTHTYPE  PC
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
25.4f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
6f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_EMS	TokenNameIdentifier	 SVG  LENGTHTYPE  EMS
:	TokenNameCOLON	
return	TokenNamereturn	
emsToPixels	TokenNameIdentifier	 ems To Pixels
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_EXS	TokenNameIdentifier	 SVG  LENGTHTYPE  EXS
:	TokenNameCOLON	
return	TokenNamereturn	
exsToPixels	TokenNameIdentifier	 exs To Pixels
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PERCENTAGE	TokenNameIdentifier	 SVG  LENGTHTYPE  PERCENTAGE
:	TokenNameCOLON	
return	TokenNamereturn	
percentagesToPixels	TokenNameIdentifier	 percentages To Pixels
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Length has unknown type"	TokenNameStringLiteral	Length has unknown type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Converts the specified value of the specified type and * direction to SVG units. * * @param v the value to convert * @param type the type of the value * @param d HORIZONTAL_LENGTH, VERTICAL_LENGTH, or OTHER_LENGTH * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Converts the specified value of the specified type and direction to SVG units. * @param v the value to convert @param type the type of the value @param d HORIZONTAL_LENGTH, VERTICAL_LENGTH, or OTHER_LENGTH @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
userSpaceToSVG	TokenNameIdentifier	 user Space To SVG
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
short	TokenNameshort	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_NUMBER	TokenNameIdentifier	 SVG  LENGTHTYPE  NUMBER
:	TokenNameCOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PX	TokenNameIdentifier	 SVG  LENGTHTYPE  PX
:	TokenNameCOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_MM	TokenNameIdentifier	 SVG  LENGTHTYPE  MM
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_CM	TokenNameIdentifier	 SVG  LENGTHTYPE  CM
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
10f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_IN	TokenNameIdentifier	 SVG  LENGTHTYPE  IN
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
25.4f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PT	TokenNameIdentifier	 SVG  LENGTHTYPE  PT
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
72f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
25.4f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PC	TokenNameIdentifier	 SVG  LENGTHTYPE  PC
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
6f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
25.4f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_EMS	TokenNameIdentifier	 SVG  LENGTHTYPE  EMS
:	TokenNameCOLON	
return	TokenNamereturn	
pixelsToEms	TokenNameIdentifier	 pixels To Ems
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_EXS	TokenNameIdentifier	 SVG  LENGTHTYPE  EXS
:	TokenNameCOLON	
return	TokenNamereturn	
pixelsToExs	TokenNameIdentifier	 pixels To Exs
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PERCENTAGE	TokenNameIdentifier	 SVG  LENGTHTYPE  PERCENTAGE
:	TokenNameCOLON	
return	TokenNamereturn	
pixelsToPercentages	TokenNameIdentifier	 pixels To Percentages
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Length has unknown type"	TokenNameStringLiteral	Length has unknown type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
// Utilities methods for relative length 	TokenNameCOMMENT_LINE	Utilities methods for relative length 
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
/** * Converts percentages to user units. * * @param v the percentage to convert * @param d HORIZONTAL_LENGTH, VERTICAL_LENGTH, or OTHER_LENGTH * @param ctx the context */	TokenNameCOMMENT_JAVADOC	 Converts percentages to user units. * @param v the percentage to convert @param d HORIZONTAL_LENGTH, VERTICAL_LENGTH, or OTHER_LENGTH @param ctx the context 
protected	TokenNameprotected	
static	TokenNamestatic	
float	TokenNamefloat	
percentagesToPixels	TokenNameIdentifier	 percentages To Pixels
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
short	TokenNameshort	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
HORIZONTAL_LENGTH	TokenNameIdentifier	 HORIZONTAL  LENGTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getViewportWidth	TokenNameIdentifier	 get Viewport Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
/	TokenNameDIVIDE	
100f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
VERTICAL_LENGTH	TokenNameIdentifier	 VERTICAL  LENGTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getViewportHeight	TokenNameIdentifier	 get Viewport Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
h	TokenNameIdentifier	 h
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
/	TokenNameDIVIDE	
100f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getViewportWidth	TokenNameIdentifier	 get Viewport Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getViewportHeight	TokenNameIdentifier	 get Viewport Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
vpp	TokenNameIdentifier	 vpp
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
*	TokenNameMULTIPLY	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
SQRT2	TokenNameIdentifier	 SQR T2
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
vpp	TokenNameIdentifier	 vpp
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
/	TokenNameDIVIDE	
100d	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Converts user units to percentages relative to the viewport. * * @param v the value to convert * @param d HORIZONTAL_LENGTH, VERTICAL_LENGTH, or OTHER_LENGTH * @param ctx the context */	TokenNameCOMMENT_JAVADOC	 Converts user units to percentages relative to the viewport. * @param v the value to convert @param d HORIZONTAL_LENGTH, VERTICAL_LENGTH, or OTHER_LENGTH @param ctx the context 
protected	TokenNameprotected	
static	TokenNamestatic	
float	TokenNamefloat	
pixelsToPercentages	TokenNameIdentifier	 pixels To Percentages
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
short	TokenNameshort	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
HORIZONTAL_LENGTH	TokenNameIdentifier	 HORIZONTAL  LENGTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getViewportWidth	TokenNameIdentifier	 get Viewport Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
100f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
VERTICAL_LENGTH	TokenNameIdentifier	 VERTICAL  LENGTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getViewportHeight	TokenNameIdentifier	 get Viewport Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
100f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getViewportWidth	TokenNameIdentifier	 get Viewport Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getViewportHeight	TokenNameIdentifier	 get Viewport Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
vpp	TokenNameIdentifier	 vpp
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
*	TokenNameMULTIPLY	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
SQRT2	TokenNameIdentifier	 SQR T2
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
100d	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
vpp	TokenNameIdentifier	 vpp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Converts user units to ems units. * * @param v the value to convert * @param d HORIZONTAL_LENGTH, VERTICAL_LENGTH, or OTHER_LENGTH * @param ctx the context */	TokenNameCOMMENT_JAVADOC	 Converts user units to ems units. * @param v the value to convert @param d HORIZONTAL_LENGTH, VERTICAL_LENGTH, or OTHER_LENGTH @param ctx the context 
protected	TokenNameprotected	
static	TokenNamestatic	
float	TokenNamefloat	
pixelsToEms	TokenNameIdentifier	 pixels To Ems
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
short	TokenNameshort	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
/	TokenNameDIVIDE	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getFontSize	TokenNameIdentifier	 get Font Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts ems units to user units. * * @param v the value to convert * @param d HORIZONTAL_LENGTH, VERTICAL_LENGTH, or OTHER_LENGTH * @param ctx the context */	TokenNameCOMMENT_JAVADOC	 Converts ems units to user units. * @param v the value to convert @param d HORIZONTAL_LENGTH, VERTICAL_LENGTH, or OTHER_LENGTH @param ctx the context 
protected	TokenNameprotected	
static	TokenNamestatic	
float	TokenNamefloat	
emsToPixels	TokenNameIdentifier	 ems To Pixels
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
short	TokenNameshort	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getFontSize	TokenNameIdentifier	 get Font Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts user units to exs units. * * @param v the value to convert * @param d HORIZONTAL_LENGTH, VERTICAL_LENGTH, or OTHER_LENGTH * @param ctx the context */	TokenNameCOMMENT_JAVADOC	 Converts user units to exs units. * @param v the value to convert @param d HORIZONTAL_LENGTH, VERTICAL_LENGTH, or OTHER_LENGTH @param ctx the context 
protected	TokenNameprotected	
static	TokenNamestatic	
float	TokenNamefloat	
pixelsToExs	TokenNameIdentifier	 pixels To Exs
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
short	TokenNameshort	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
xh	TokenNameIdentifier	 xh
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getXHeight	TokenNameIdentifier	 get X Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
/	TokenNameDIVIDE	
xh	TokenNameIdentifier	 xh
/	TokenNameDIVIDE	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getFontSize	TokenNameIdentifier	 get Font Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts exs units to user units. * * @param v the value to convert * @param d HORIZONTAL_LENGTH, VERTICAL_LENGTH, or OTHER_LENGTH * @param ctx the context */	TokenNameCOMMENT_JAVADOC	 Converts exs units to user units. * @param v the value to convert @param d HORIZONTAL_LENGTH, VERTICAL_LENGTH, or OTHER_LENGTH @param ctx the context 
protected	TokenNameprotected	
static	TokenNamestatic	
float	TokenNamefloat	
exsToPixels	TokenNameIdentifier	 exs To Pixels
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
short	TokenNameshort	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
xh	TokenNameIdentifier	 xh
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getXHeight	TokenNameIdentifier	 get X Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
xh	TokenNameIdentifier	 xh
*	TokenNameMULTIPLY	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getFontSize	TokenNameIdentifier	 get Font Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A LengthHandler that convert units. */	TokenNameCOMMENT_JAVADOC	 A LengthHandler that convert units. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
UnitResolver	TokenNameIdentifier	 Unit Resolver
implements	TokenNameimplements	
LengthHandler	TokenNameIdentifier	 Length Handler
{	TokenNameLBRACE	
/** * The length value. */	TokenNameCOMMENT_JAVADOC	 The length value. 
public	TokenNamepublic	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * The length type. */	TokenNameCOMMENT_JAVADOC	 The length type. 
public	TokenNamepublic	
short	TokenNameshort	
unit	TokenNameIdentifier	 unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_NUMBER	TokenNameIdentifier	 SVG  LENGTHTYPE  NUMBER
;	TokenNameSEMICOLON	
/** * Implements {@link LengthHandler#startLength()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#startLength()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startLength	TokenNameIdentifier	 start Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#lengthValue(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#lengthValue(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
lengthValue	TokenNameIdentifier	 length Value
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#em()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#em()}. 
public	TokenNamepublic	
void	TokenNamevoid	
em	TokenNameIdentifier	 em
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_EMS	TokenNameIdentifier	 SVG  LENGTHTYPE  EMS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#ex()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#ex()}. 
public	TokenNamepublic	
void	TokenNamevoid	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_EXS	TokenNameIdentifier	 SVG  LENGTHTYPE  EXS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#in()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#in()}. 
public	TokenNamepublic	
void	TokenNamevoid	
in	TokenNameIdentifier	 in
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_IN	TokenNameIdentifier	 SVG  LENGTHTYPE  IN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#cm()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#cm()}. 
public	TokenNamepublic	
void	TokenNamevoid	
cm	TokenNameIdentifier	 cm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_CM	TokenNameIdentifier	 SVG  LENGTHTYPE  CM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#mm()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#mm()}. 
public	TokenNamepublic	
void	TokenNamevoid	
mm	TokenNameIdentifier	 mm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_MM	TokenNameIdentifier	 SVG  LENGTHTYPE  MM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#pc()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#pc()}. 
public	TokenNamepublic	
void	TokenNamevoid	
pc	TokenNameIdentifier	 pc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PC	TokenNameIdentifier	 SVG  LENGTHTYPE  PC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#pt()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#pt()}. 
public	TokenNamepublic	
void	TokenNamevoid	
pt	TokenNameIdentifier	 pt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PT	TokenNameIdentifier	 SVG  LENGTHTYPE  PT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#px()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#px()}. 
public	TokenNamepublic	
void	TokenNamevoid	
px	TokenNameIdentifier	 px
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PX	TokenNameIdentifier	 SVG  LENGTHTYPE  PX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#percentage()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#percentage()}. 
public	TokenNamepublic	
void	TokenNamevoid	
percentage	TokenNameIdentifier	 percentage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PERCENTAGE	TokenNameIdentifier	 SVG  LENGTHTYPE  PERCENTAGE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#endLength()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#endLength()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endLength	TokenNameIdentifier	 end Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Holds the informations needed to compute the units. */	TokenNameCOMMENT_JAVADOC	 Holds the informations needed to compute the units. 
public	TokenNamepublic	
interface	TokenNameinterface	
Context	TokenNameIdentifier	 Context
{	TokenNameLBRACE	
/** * Returns the element. */	TokenNameCOMMENT_JAVADOC	 Returns the element. 
Element	TokenNameIdentifier	 Element
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the size of a px CSS unit in millimeters. */	TokenNameCOMMENT_JAVADOC	 Returns the size of a px CSS unit in millimeters. 
float	TokenNamefloat	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the size of a px CSS unit in millimeters. * This will be removed after next release. * @see #getPixelUnitToMillimeter() */	TokenNameCOMMENT_JAVADOC	 Returns the size of a px CSS unit in millimeters. This will be removed after next release. @see #getPixelUnitToMillimeter() 
float	TokenNamefloat	
getPixelToMM	TokenNameIdentifier	 get Pixel To MM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the font-size value. */	TokenNameCOMMENT_JAVADOC	 Returns the font-size value. 
float	TokenNamefloat	
getFontSize	TokenNameIdentifier	 get Font Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the x-height value. */	TokenNameCOMMENT_JAVADOC	 Returns the x-height value. 
float	TokenNamefloat	
getXHeight	TokenNameIdentifier	 get X Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the viewport width used to compute units. */	TokenNameCOMMENT_JAVADOC	 Returns the viewport width used to compute units. 
float	TokenNamefloat	
getViewportWidth	TokenNameIdentifier	 get Viewport Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the viewport height used to compute units. */	TokenNameCOMMENT_JAVADOC	 Returns the viewport height used to compute units. 
float	TokenNamefloat	
getViewportHeight	TokenNameIdentifier	 get Viewport Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
