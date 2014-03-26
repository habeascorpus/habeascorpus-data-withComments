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
.	TokenNameDOT	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
;	TokenNameSEMICOLON	
/** * @version $Id: GlyfCompositeComp.java 475477 2006-11-15 22:44:28Z cam $ * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> */	TokenNameCOMMENT_JAVADOC	 @version $Id: GlyfCompositeComp.java 475477 2006-11-15 22:44:28Z cam $ @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> 
public	TokenNamepublic	
class	TokenNameclass	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ARG_1_AND_2_ARE_WORDS	TokenNameIdentifier	 ARG 1  AND 2  ARE  WORDS
=	TokenNameEQUAL	
0x0001	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ARGS_ARE_XY_VALUES	TokenNameIdentifier	 ARGS  ARE  XY  VALUES
=	TokenNameEQUAL	
0x0002	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ROUND_XY_TO_GRID	TokenNameIdentifier	 ROUND  XY  TO  GRID
=	TokenNameEQUAL	
0x0004	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
WE_HAVE_A_SCALE	TokenNameIdentifier	 WE  HAVE  A  SCALE
=	TokenNameEQUAL	
0x0008	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
MORE_COMPONENTS	TokenNameIdentifier	 MORE  COMPONENTS
=	TokenNameEQUAL	
0x0020	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
WE_HAVE_AN_X_AND_Y_SCALE	TokenNameIdentifier	 WE  HAVE  AN  X  AND  Y  SCALE
=	TokenNameEQUAL	
0x0040	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
WE_HAVE_A_TWO_BY_TWO	TokenNameIdentifier	 WE  HAVE  A  TWO  BY  TWO
=	TokenNameEQUAL	
0x0080	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
WE_HAVE_INSTRUCTIONS	TokenNameIdentifier	 WE  HAVE  INSTRUCTIONS
=	TokenNameEQUAL	
0x0100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
USE_MY_METRICS	TokenNameIdentifier	 USE  MY  METRICS
=	TokenNameEQUAL	
0x0200	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
firstIndex	TokenNameIdentifier	 first Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
firstContour	TokenNameIdentifier	 first Contour
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
argument1	TokenNameIdentifier	 argument1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
argument2	TokenNameIdentifier	 argument2
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
flags	TokenNameIdentifier	 flags
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
xscale	TokenNameIdentifier	 xscale
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
yscale	TokenNameIdentifier	 yscale
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
scale01	TokenNameIdentifier	 scale01
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
scale10	TokenNameIdentifier	 scale10
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
xtranslate	TokenNameIdentifier	 xtranslate
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
ytranslate	TokenNameIdentifier	 ytranslate
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
point1	TokenNameIdentifier	 point1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
point2	TokenNameIdentifier	 point2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
(	TokenNameLPAREN	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
bais	TokenNameIdentifier	 bais
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphIndex	TokenNameIdentifier	 glyph Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the arguments as just their raw values 	TokenNameCOMMENT_LINE	Get the arguments as just their raw values 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
ARG_1_AND_2_ARE_WORDS	TokenNameIdentifier	 ARG 1  AND 2  ARE  WORDS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
argument1	TokenNameIdentifier	 argument1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argument2	TokenNameIdentifier	 argument2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
argument1	TokenNameIdentifier	 argument1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argument2	TokenNameIdentifier	 argument2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Assign the arguments according to the flags 	TokenNameCOMMENT_LINE	Assign the arguments according to the flags 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
ARGS_ARE_XY_VALUES	TokenNameIdentifier	 ARGS  ARE  XY  VALUES
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xtranslate	TokenNameIdentifier	 xtranslate
=	TokenNameEQUAL	
argument1	TokenNameIdentifier	 argument1
;	TokenNameSEMICOLON	
ytranslate	TokenNameIdentifier	 ytranslate
=	TokenNameEQUAL	
argument2	TokenNameIdentifier	 argument2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
point1	TokenNameIdentifier	 point1
=	TokenNameEQUAL	
argument1	TokenNameIdentifier	 argument1
;	TokenNameSEMICOLON	
point2	TokenNameIdentifier	 point2
=	TokenNameEQUAL	
argument2	TokenNameIdentifier	 argument2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Get the scale values (if any) 	TokenNameCOMMENT_LINE	Get the scale values (if any) 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
WE_HAVE_A_SCALE	TokenNameIdentifier	 WE  HAVE  A  SCALE
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xscale	TokenNameIdentifier	 xscale
=	TokenNameEQUAL	
yscale	TokenNameIdentifier	 yscale
=	TokenNameEQUAL	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
0x4000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
WE_HAVE_AN_X_AND_Y_SCALE	TokenNameIdentifier	 WE  HAVE  AN  X  AND  Y  SCALE
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xscale	TokenNameIdentifier	 xscale
=	TokenNameEQUAL	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
0x4000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yscale	TokenNameIdentifier	 yscale
=	TokenNameEQUAL	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
0x4000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
WE_HAVE_A_TWO_BY_TWO	TokenNameIdentifier	 WE  HAVE  A  TWO  BY  TWO
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xscale	TokenNameIdentifier	 xscale
=	TokenNameEQUAL	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
0x4000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scale01	TokenNameIdentifier	 scale01
=	TokenNameEQUAL	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
0x4000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scale10	TokenNameIdentifier	 scale10
=	TokenNameEQUAL	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
0x4000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yscale	TokenNameIdentifier	 yscale
=	TokenNameEQUAL	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
0x4000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFirstIndex	TokenNameIdentifier	 set First Index
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstIndex	TokenNameIdentifier	 first Index
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getFirstIndex	TokenNameIdentifier	 get First Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
firstIndex	TokenNameIdentifier	 first Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFirstContour	TokenNameIdentifier	 set First Contour
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstContour	TokenNameIdentifier	 first Contour
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getFirstContour	TokenNameIdentifier	 get First Contour
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
firstContour	TokenNameIdentifier	 first Contour
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getArgument1	TokenNameIdentifier	 get Argument1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
argument1	TokenNameIdentifier	 argument1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getArgument2	TokenNameIdentifier	 get Argument2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
argument2	TokenNameIdentifier	 argument2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
flags	TokenNameIdentifier	 flags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getGlyphIndex	TokenNameIdentifier	 get Glyph Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
glyphIndex	TokenNameIdentifier	 glyph Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getScale01	TokenNameIdentifier	 get Scale01
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scale01	TokenNameIdentifier	 scale01
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getScale10	TokenNameIdentifier	 get Scale10
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scale10	TokenNameIdentifier	 scale10
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getXScale	TokenNameIdentifier	 get X Scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xscale	TokenNameIdentifier	 xscale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getYScale	TokenNameIdentifier	 get Y Scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
yscale	TokenNameIdentifier	 yscale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getXTranslate	TokenNameIdentifier	 get X Translate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xtranslate	TokenNameIdentifier	 xtranslate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getYTranslate	TokenNameIdentifier	 get Y Translate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ytranslate	TokenNameIdentifier	 ytranslate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Transforms an x-coordinate of a point for this component. * @param x The x-coordinate of the point to transform * @param y The y-coordinate of the point to transform * @return The transformed x-coordinate */	TokenNameCOMMENT_JAVADOC	 Transforms an x-coordinate of a point for this component. @param x The x-coordinate of the point to transform @param y The y-coordinate of the point to transform @return The transformed x-coordinate 
public	TokenNamepublic	
int	TokenNameint	
scaleX	TokenNameIdentifier	 scale X
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
*	TokenNameMULTIPLY	
xscale	TokenNameIdentifier	 xscale
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
scale10	TokenNameIdentifier	 scale10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Transforms a y-coordinate of a point for this component. * @param x The x-coordinate of the point to transform * @param y The y-coordinate of the point to transform * @return The transformed y-coordinate */	TokenNameCOMMENT_JAVADOC	 Transforms a y-coordinate of a point for this component. @param x The x-coordinate of the point to transform @param y The y-coordinate of the point to transform @return The transformed y-coordinate 
public	TokenNamepublic	
int	TokenNameint	
scaleY	TokenNameIdentifier	 scale Y
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
*	TokenNameMULTIPLY	
scale01	TokenNameIdentifier	 scale01
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
yscale	TokenNameIdentifier	 yscale
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
