/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
.	TokenNameDOT	
font	TokenNameIdentifier	 font
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
GlyfDescript	TokenNameIdentifier	 Glyf Descript
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
GlyphDescription	TokenNameIdentifier	 Glyph Description
;	TokenNameSEMICOLON	
/** * An individual glyph within a font. * @version $Id: Glyph.java 475477 2006-11-15 22:44:28Z cam $ * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> */	TokenNameCOMMENT_JAVADOC	 An individual glyph within a font. @version $Id: Glyph.java 475477 2006-11-15 22:44:28Z cam $ @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> 
public	TokenNamepublic	
class	TokenNameclass	
Glyph	TokenNameIdentifier	 Glyph
{	TokenNameLBRACE	
protected	TokenNameprotected	
short	TokenNameshort	
leftSideBearing	TokenNameIdentifier	 left Side Bearing
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
advanceWidth	TokenNameIdentifier	 advance Width
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Point	TokenNameIdentifier	 Point
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
points	TokenNameIdentifier	 points
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Glyph	TokenNameIdentifier	 Glyph
(	TokenNameLPAREN	
GlyphDescription	TokenNameIdentifier	 Glyph Description
gd	TokenNameIdentifier	 gd
,	TokenNameCOMMA	
short	TokenNameshort	
lsb	TokenNameIdentifier	 lsb
,	TokenNameCOMMA	
int	TokenNameint	
advance	TokenNameIdentifier	 advance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
leftSideBearing	TokenNameIdentifier	 left Side Bearing
=	TokenNameEQUAL	
lsb	TokenNameIdentifier	 lsb
;	TokenNameSEMICOLON	
advanceWidth	TokenNameIdentifier	 advance Width
=	TokenNameEQUAL	
advance	TokenNameIdentifier	 advance
;	TokenNameSEMICOLON	
describe	TokenNameIdentifier	 describe
(	TokenNameLPAREN	
gd	TokenNameIdentifier	 gd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getAdvanceWidth	TokenNameIdentifier	 get Advance Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
advanceWidth	TokenNameIdentifier	 advance Width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getLeftSideBearing	TokenNameIdentifier	 get Left Side Bearing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
leftSideBearing	TokenNameIdentifier	 left Side Bearing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Point	TokenNameIdentifier	 Point
getPoint	TokenNameIdentifier	 get Point
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
points	TokenNameIdentifier	 points
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getPointCount	TokenNameIdentifier	 get Point Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
points	TokenNameIdentifier	 points
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the glyph to the TrueType table settings */	TokenNameCOMMENT_JAVADOC	 Resets the glyph to the TrueType table settings 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @param factor a 16.16 fixed value */	TokenNameCOMMENT_JAVADOC	 @param factor a 16.16 fixed value 
public	TokenNamepublic	
void	TokenNamevoid	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
int	TokenNameint	
factor	TokenNameIdentifier	 factor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
points	TokenNameIdentifier	 points
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//points[i].x = ( points[i].x * factor ) >> 6; 	TokenNameCOMMENT_LINE	points[i].x = ( points[i].x * factor ) >> 6; 
//points[i].y = ( points[i].y * factor ) >> 6; 	TokenNameCOMMENT_LINE	points[i].y = ( points[i].y * factor ) >> 6; 
points	TokenNameIdentifier	 points
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
points	TokenNameIdentifier	 points
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
<<	TokenNameLEFT_SHIFT	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
factor	TokenNameIdentifier	 factor
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
26	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
points	TokenNameIdentifier	 points
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
points	TokenNameIdentifier	 points
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
<<	TokenNameLEFT_SHIFT	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
factor	TokenNameIdentifier	 factor
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
26	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
leftSideBearing	TokenNameIdentifier	 left Side Bearing
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
leftSideBearing	TokenNameIdentifier	 left Side Bearing
*	TokenNameMULTIPLY	
factor	TokenNameIdentifier	 factor
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
advanceWidth	TokenNameIdentifier	 advance Width
=	TokenNameEQUAL	
(	TokenNameLPAREN	
advanceWidth	TokenNameIdentifier	 advance Width
*	TokenNameMULTIPLY	
factor	TokenNameIdentifier	 factor
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the points of a glyph from the GlyphDescription */	TokenNameCOMMENT_JAVADOC	 Set the points of a glyph from the GlyphDescription 
private	TokenNameprivate	
void	TokenNamevoid	
describe	TokenNameIdentifier	 describe
(	TokenNameLPAREN	
GlyphDescription	TokenNameIdentifier	 Glyph Description
gd	TokenNameIdentifier	 gd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
endPtIndex	TokenNameIdentifier	 end Pt Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
points	TokenNameIdentifier	 points
=	TokenNameEQUAL	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
[	TokenNameLBRACKET	
gd	TokenNameIdentifier	 gd
.	TokenNameDOT	
getPointCount	TokenNameIdentifier	 get Point Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
gd	TokenNameIdentifier	 gd
.	TokenNameDOT	
getPointCount	TokenNameIdentifier	 get Point Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
endPt	TokenNameIdentifier	 end Pt
=	TokenNameEQUAL	
gd	TokenNameIdentifier	 gd
.	TokenNameDOT	
getEndPtOfContours	TokenNameIdentifier	 get End Pt Of Contours
(	TokenNameLPAREN	
endPtIndex	TokenNameIdentifier	 end Pt Index
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endPt	TokenNameIdentifier	 end Pt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endPtIndex	TokenNameIdentifier	 end Pt Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
points	TokenNameIdentifier	 points
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
(	TokenNameLPAREN	
gd	TokenNameIdentifier	 gd
.	TokenNameDOT	
getXCoordinate	TokenNameIdentifier	 get X Coordinate
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
gd	TokenNameIdentifier	 gd
.	TokenNameDOT	
getYCoordinate	TokenNameIdentifier	 get Y Coordinate
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
gd	TokenNameIdentifier	 gd
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
&	TokenNameAND	
GlyfDescript	TokenNameIdentifier	 Glyf Descript
.	TokenNameDOT	
onCurve	TokenNameIdentifier	 on Curve
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
endPt	TokenNameIdentifier	 end Pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Append the origin and advanceWidth points (n & n+1) 	TokenNameCOMMENT_LINE	Append the origin and advanceWidth points (n & n+1) 
points	TokenNameIdentifier	 points
[	TokenNameLBRACKET	
gd	TokenNameIdentifier	 gd
.	TokenNameDOT	
getPointCount	TokenNameIdentifier	 get Point Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
points	TokenNameIdentifier	 points
[	TokenNameLBRACKET	
gd	TokenNameIdentifier	 gd
.	TokenNameDOT	
getPointCount	TokenNameIdentifier	 get Point Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
(	TokenNameLPAREN	
advanceWidth	TokenNameIdentifier	 advance Width
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
