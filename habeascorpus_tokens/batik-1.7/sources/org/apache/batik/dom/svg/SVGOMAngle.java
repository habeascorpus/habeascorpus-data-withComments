/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
AngleParser	TokenNameIdentifier	 Angle Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
DefaultAngleHandler	TokenNameIdentifier	 Default Angle Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
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
SVGAngle	TokenNameIdentifier	 SVG Angle
;	TokenNameSEMICOLON	
/** * Implementation of an {@link SVGAngle} not associated with any attribute. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SVGOMAngle.java 479349 2006-11-26 11:54:23Z cam $ */	TokenNameCOMMENT_JAVADOC	 Implementation of an {@link SVGAngle} not associated with any attribute. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SVGOMAngle.java 479349 2006-11-26 11:54:23Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMAngle	TokenNameIdentifier	 SVGOM Angle
implements	TokenNameimplements	
SVGAngle	TokenNameIdentifier	 SVG Angle
{	TokenNameLBRACE	
/** * The type of this angle. */	TokenNameCOMMENT_JAVADOC	 The type of this angle. 
protected	TokenNameprotected	
short	TokenNameshort	
unitType	TokenNameIdentifier	 unit Type
;	TokenNameSEMICOLON	
/** * The value of this angle. */	TokenNameCOMMENT_JAVADOC	 The value of this angle. 
protected	TokenNameprotected	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * The unit string representations. */	TokenNameCOMMENT_JAVADOC	 The unit string representations. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
UNITS	TokenNameIdentifier	 UNITS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"deg"	TokenNameStringLiteral	deg
,	TokenNameCOMMA	
"rad"	TokenNameStringLiteral	rad
,	TokenNameCOMMA	
"grad"	TokenNameStringLiteral	grad
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * <b>DOM</b>: Implements {@link SVGAngle#getUnitType()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#getUnitType()}. 
public	TokenNamepublic	
short	TokenNameshort	
getUnitType	TokenNameIdentifier	 get Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
unitType	TokenNameIdentifier	 unit Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAngle#getValue()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#getValue()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
toUnit	TokenNameIdentifier	 to Unit
(	TokenNameLPAREN	
unitType	TokenNameIdentifier	 unit Type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
SVG_ANGLETYPE_DEG	TokenNameIdentifier	 SVG  ANGLETYPE  DEG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAngle#setValue(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#setValue(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
unitType	TokenNameIdentifier	 unit Type
=	TokenNameEQUAL	
SVG_ANGLETYPE_DEG	TokenNameIdentifier	 SVG  ANGLETYPE  DEG
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAngle#getValueInSpecifiedUnits()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#getValueInSpecifiedUnits()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getValueInSpecifiedUnits	TokenNameIdentifier	 get Value In Specified Units
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGAngle#setValueInSpecifiedUnits(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#setValueInSpecifiedUnits(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setValueInSpecifiedUnits	TokenNameIdentifier	 set Value In Specified Units
(	TokenNameLPAREN	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAngle#getValueAsString()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#getValueAsString()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
+	TokenNamePLUS	
UNITS	TokenNameIdentifier	 UNITS
[	TokenNameLBRACKET	
unitType	TokenNameIdentifier	 unit Type
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAngle#setValueAsString(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#setValueAsString(String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setValueAsString	TokenNameIdentifier	 set Value As String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGAngle#newValueSpecifiedUnits(short,float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#newValueSpecifiedUnits(short,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
newValueSpecifiedUnits	TokenNameIdentifier	 new Value Specified Units
(	TokenNameLPAREN	
short	TokenNameshort	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unitType	TokenNameIdentifier	 unit Type
=	TokenNameEQUAL	
unit	TokenNameIdentifier	 unit
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGAngle#convertToSpecifiedUnits(short)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#convertToSpecifiedUnits(short)}. 
public	TokenNamepublic	
void	TokenNamevoid	
convertToSpecifiedUnits	TokenNameIdentifier	 convert To Specified Units
(	TokenNameLPAREN	
short	TokenNameshort	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
toUnit	TokenNameIdentifier	 to Unit
(	TokenNameLPAREN	
unitType	TokenNameIdentifier	 unit Type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unitType	TokenNameIdentifier	 unit Type
=	TokenNameEQUAL	
unit	TokenNameIdentifier	 unit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the associated attribute value according to the current value. * This should be overridden in descendant classes that associate the * angle object with an attribute. */	TokenNameCOMMENT_JAVADOC	 Resets the associated attribute value according to the current value. This should be overridden in descendant classes that associate the angle object with an attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Updates the values in this object according to the associated attribute * value. This should be overridden in descendant classes that associate * the angle object with an attribute. */	TokenNameCOMMENT_JAVADOC	 Updates the values in this object according to the associated attribute value. This should be overridden in descendant classes that associate the angle object with an attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Parse a String value as an SVGAngle. */	TokenNameCOMMENT_JAVADOC	 Parse a String value as an SVGAngle. 
protected	TokenNameprotected	
void	TokenNamevoid	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
AngleParser	TokenNameIdentifier	 Angle Parser
angleParser	TokenNameIdentifier	 angle Parser
=	TokenNameEQUAL	
new	TokenNamenew	
AngleParser	TokenNameIdentifier	 Angle Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
angleParser	TokenNameIdentifier	 angle Parser
.	TokenNameDOT	
setAngleHandler	TokenNameIdentifier	 set Angle Handler
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultAngleHandler	TokenNameIdentifier	 Default Angle Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
angleValue	TokenNameIdentifier	 angle Value
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
deg	TokenNameIdentifier	 deg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
unitType	TokenNameIdentifier	 unit Type
=	TokenNameEQUAL	
SVG_ANGLETYPE_DEG	TokenNameIdentifier	 SVG  ANGLETYPE  DEG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
rad	TokenNameIdentifier	 rad
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
unitType	TokenNameIdentifier	 unit Type
=	TokenNameEQUAL	
SVG_ANGLETYPE_RAD	TokenNameIdentifier	 SVG  ANGLETYPE  RAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
grad	TokenNameIdentifier	 grad
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
unitType	TokenNameIdentifier	 unit Type
=	TokenNameEQUAL	
SVG_ANGLETYPE_GRAD	TokenNameIdentifier	 SVG  ANGLETYPE  GRAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unitType	TokenNameIdentifier	 unit Type
=	TokenNameEQUAL	
SVG_ANGLETYPE_UNSPECIFIED	TokenNameIdentifier	 SVG  ANGLETYPE  UNSPECIFIED
;	TokenNameSEMICOLON	
angleParser	TokenNameIdentifier	 angle Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unitType	TokenNameIdentifier	 unit Type
=	TokenNameEQUAL	
SVG_ANGLETYPE_UNKNOWN	TokenNameIdentifier	 SVG  ANGLETYPE  UNKNOWN
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Table of multipliers for angle unit conversion. */	TokenNameCOMMENT_JAVADOC	 Table of multipliers for angle unit conversion. 
protected	TokenNameprotected	
static	TokenNamestatic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
K	TokenNameIdentifier	 K
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
/	TokenNameDIVIDE	
180	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
/	TokenNameDIVIDE	
200	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
180	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1800	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
0.9	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
/	TokenNameDIVIDE	
1800	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Converts an angle from one unit to another. */	TokenNameCOMMENT_JAVADOC	 Converts an angle from one unit to another. 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
toUnit	TokenNameIdentifier	 to Unit
(	TokenNameLPAREN	
short	TokenNameshort	
fromUnit	TokenNameIdentifier	 from Unit
,	TokenNameCOMMA	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
short	TokenNameshort	
toUnit	TokenNameIdentifier	 to Unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fromUnit	TokenNameIdentifier	 from Unit
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fromUnit	TokenNameIdentifier	 from Unit
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toUnit	TokenNameIdentifier	 to Unit
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toUnit	TokenNameIdentifier	 to Unit
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
[	TokenNameLBRACKET	
fromUnit	TokenNameIdentifier	 from Unit
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
toUnit	TokenNameIdentifier	 to Unit
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
