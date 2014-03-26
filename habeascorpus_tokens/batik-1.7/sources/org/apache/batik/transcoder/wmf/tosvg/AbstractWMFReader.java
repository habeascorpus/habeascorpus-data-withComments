/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
wmf	TokenNameIdentifier	 wmf
.	TokenNameDOT	
tosvg	TokenNameIdentifier	 tosvg
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Rectangle	TokenNameIdentifier	 Rectangle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Toolkit	TokenNameIdentifier	 Toolkit
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInputStream	TokenNameIdentifier	 Data Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
wmf	TokenNameIdentifier	 wmf
.	TokenNameDOT	
WMFConstants	TokenNameIdentifier	 WMF Constants
;	TokenNameSEMICOLON	
/** * This class provides a general framework to read WMF Metafiles. * @version $Id: AbstractWMFReader.java 592650 2007-11-07 08:19:45Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides a general framework to read WMF Metafiles. @version $Id: AbstractWMFReader.java 592650 2007-11-07 08:19:45Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractWMFReader	TokenNameIdentifier	 Abstract WMF Reader
{	TokenNameLBRACE	
// todo should be able to run in headless environment - as is written, will throw exception during init 	TokenNameCOMMENT_LINE	todo should be able to run in headless environment - as is written, will throw exception during init 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
PIXEL_PER_INCH	TokenNameIdentifier	 PIXEL  PER  INCH
=	TokenNameEQUAL	
Toolkit	TokenNameIdentifier	 Toolkit
.	TokenNameDOT	
getDefaultToolkit	TokenNameIdentifier	 get Default Toolkit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getScreenResolution	TokenNameIdentifier	 get Screen Resolution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
MM_PER_PIXEL	TokenNameIdentifier	 MM  PER  PIXEL
=	TokenNameEQUAL	
25.4f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
Toolkit	TokenNameIdentifier	 Toolkit
.	TokenNameDOT	
getDefaultToolkit	TokenNameIdentifier	 get Default Toolkit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getScreenResolution	TokenNameIdentifier	 get Screen Resolution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
top	TokenNameIdentifier	 top
,	TokenNameCOMMA	
bottom	TokenNameIdentifier	 bottom
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
inch	TokenNameIdentifier	 inch
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
scaleX	TokenNameIdentifier	 scale X
,	TokenNameCOMMA	
scaleY	TokenNameIdentifier	 scale Y
,	TokenNameCOMMA	
scaleXY	TokenNameIdentifier	 scale XY
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
vpW	TokenNameIdentifier	 vp W
,	TokenNameCOMMA	
vpH	TokenNameIdentifier	 vp H
,	TokenNameCOMMA	
vpX	TokenNameIdentifier	 vp X
,	TokenNameCOMMA	
vpY	TokenNameIdentifier	 vp Y
;	TokenNameSEMICOLON	
// the sign values for X and Y, will be modified depending on the VIEWPORT values 	TokenNameCOMMENT_LINE	the sign values for X and Y, will be modified depending on the VIEWPORT values 
protected	TokenNameprotected	
int	TokenNameint	
xSign	TokenNameIdentifier	 x Sign
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
ySign	TokenNameIdentifier	 y Sign
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
bReading	TokenNameIdentifier	 b Reading
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isAldus	TokenNameIdentifier	 is Aldus
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isotropic	TokenNameIdentifier	 isotropic
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
mtType	TokenNameIdentifier	 mt Type
,	TokenNameCOMMA	
mtHeaderSize	TokenNameIdentifier	 mt Header Size
,	TokenNameCOMMA	
mtVersion	TokenNameIdentifier	 mt Version
,	TokenNameCOMMA	
mtSize	TokenNameIdentifier	 mt Size
,	TokenNameCOMMA	
mtNoObjects	TokenNameIdentifier	 mt No Objects
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
mtMaxRecord	TokenNameIdentifier	 mt Max Record
,	TokenNameCOMMA	
mtNoParameters	TokenNameIdentifier	 mt No Parameters
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
windowWidth	TokenNameIdentifier	 window Width
,	TokenNameCOMMA	
windowHeight	TokenNameIdentifier	 window Height
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
numObjects	TokenNameIdentifier	 num Objects
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
objectVector	TokenNameIdentifier	 object Vector
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
lastObjectIdx	TokenNameIdentifier	 last Object Idx
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AbstractWMFReader	TokenNameIdentifier	 Abstract WMF Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scaleX	TokenNameIdentifier	 scale X
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
scaleY	TokenNameIdentifier	 scale Y
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
scaleXY	TokenNameIdentifier	 scale XY
=	TokenNameEQUAL	
1f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
left	TokenNameIdentifier	 left
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
top	TokenNameIdentifier	 top
+	TokenNamePLUS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
numObjects	TokenNameIdentifier	 num Objects
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
objectVector	TokenNameIdentifier	 object Vector
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractWMFReader	TokenNameIdentifier	 Abstract WMF Reader
(	TokenNameLPAREN	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read the next short (2 bytes) value in the DataInputStream. */	TokenNameCOMMENT_JAVADOC	 Read the next short (2 bytes) value in the DataInputStream. 
protected	TokenNameprotected	
short	TokenNameshort	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
DataInputStream	TokenNameIdentifier	 Data Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
js	TokenNameIdentifier	 js
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
js	TokenNameIdentifier	 js
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
iTemp	TokenNameIdentifier	 i Temp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
js	TokenNameIdentifier	 js
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xffff	TokenNameIntegerLiteral	
&	TokenNameAND	
iTemp	TokenNameIdentifier	 i Temp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
js	TokenNameIdentifier	 js
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read the next int (4 bytes) value in the DataInputStream. */	TokenNameCOMMENT_JAVADOC	 Read the next int (4 bytes) value in the DataInputStream. 
protected	TokenNameprotected	
int	TokenNameint	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
DataInputStream	TokenNameIdentifier	 Data Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
js	TokenNameIdentifier	 js
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
js	TokenNameIdentifier	 js
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
js	TokenNameIdentifier	 js
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
js	TokenNameIdentifier	 js
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
js	TokenNameIdentifier	 js
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
js	TokenNameIdentifier	 js
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the viewport width, in Metafile Units */	TokenNameCOMMENT_JAVADOC	 Returns the viewport width, in Metafile Units 
public	TokenNamepublic	
float	TokenNamefloat	
getViewportWidthUnits	TokenNameIdentifier	 get Viewport Width Units
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vpW	TokenNameIdentifier	 vp W
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the viewport height, in Metafile Units */	TokenNameCOMMENT_JAVADOC	 Returns the viewport height, in Metafile Units 
public	TokenNamepublic	
float	TokenNamefloat	
getViewportHeightUnits	TokenNameIdentifier	 get Viewport Height Units
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vpH	TokenNameIdentifier	 vp H
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the viewport width, in inches. */	TokenNameCOMMENT_JAVADOC	 Returns the viewport width, in inches. 
public	TokenNamepublic	
float	TokenNamefloat	
getViewportWidthInch	TokenNameIdentifier	 get Viewport Width Inch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vpW	TokenNameIdentifier	 vp W
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the viewport height, in inches. */	TokenNameCOMMENT_JAVADOC	 Returns the viewport height, in inches. 
public	TokenNamepublic	
float	TokenNamefloat	
getViewportHeightInch	TokenNameIdentifier	 get Viewport Height Inch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vpH	TokenNameIdentifier	 vp H
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the number of pixels per unit. */	TokenNameCOMMENT_JAVADOC	 Return the number of pixels per unit. 
public	TokenNamepublic	
float	TokenNamefloat	
getPixelsPerUnit	TokenNameIdentifier	 get Pixels Per Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
PIXEL_PER_INCH	TokenNameIdentifier	 PIXEL  PER  INCH
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the viewport width, in pixels. */	TokenNameCOMMENT_JAVADOC	 Returns the viewport width, in pixels. 
public	TokenNamepublic	
int	TokenNameint	
getVpW	TokenNameIdentifier	 get Vp W
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
PIXEL_PER_INCH	TokenNameIdentifier	 PIXEL  PER  INCH
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vpW	TokenNameIdentifier	 vp W
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the viewport height, in pixels. */	TokenNameCOMMENT_JAVADOC	 Returns the viewport height, in pixels. 
public	TokenNamepublic	
int	TokenNameint	
getVpH	TokenNameIdentifier	 get Vp H
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
PIXEL_PER_INCH	TokenNameIdentifier	 PIXEL  PER  INCH
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vpH	TokenNameIdentifier	 vp H
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the left units in the WMF Metafile. This value is given * in the Aldus Placable Metafile. */	TokenNameCOMMENT_JAVADOC	 get the left units in the WMF Metafile. This value is given in the Aldus Placable Metafile. 
public	TokenNamepublic	
int	TokenNameint	
getLeftUnits	TokenNameIdentifier	 get Left Units
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the right units in the WMF Metafile. This value is given * in the Aldus Placable Header. */	TokenNameCOMMENT_JAVADOC	 get the right units in the WMF Metafile. This value is given in the Aldus Placable Header. 
public	TokenNamepublic	
int	TokenNameint	
getRightUnits	TokenNameIdentifier	 get Right Units
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the top units in the WMF Metafile. This value is given * in the Aldus Placable Header. */	TokenNameCOMMENT_JAVADOC	 get the top units in the WMF Metafile. This value is given in the Aldus Placable Header. 
public	TokenNamepublic	
int	TokenNameint	
getTopUnits	TokenNameIdentifier	 get Top Units
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the width units in the WMF Metafile. This value is given * in the Aldus Placable Header. */	TokenNameCOMMENT_JAVADOC	 get the width units in the WMF Metafile. This value is given in the Aldus Placable Header. 
public	TokenNamepublic	
int	TokenNameint	
getWidthUnits	TokenNameIdentifier	 get Width Units
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the height units in the WMF Metafile. This value is given * in the Aldus Placable Header. */	TokenNameCOMMENT_JAVADOC	 get the height units in the WMF Metafile. This value is given in the Aldus Placable Header. 
public	TokenNamepublic	
int	TokenNameint	
getHeightUnits	TokenNameIdentifier	 get Height Units
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the bottom units in the WMF Metafile. This value is given * in the Aldus Placable Header. */	TokenNameCOMMENT_JAVADOC	 get the bottom units in the WMF Metafile. This value is given in the Aldus Placable Header. 
public	TokenNamepublic	
int	TokenNameint	
getBottomUnits	TokenNameIdentifier	 get Bottom Units
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the number of Metafile units per inch in the WMF Metafile. * This value is given in the Aldus Placable Header. */	TokenNameCOMMENT_JAVADOC	 get the number of Metafile units per inch in the WMF Metafile. This value is given in the Aldus Placable Header. 
public	TokenNamepublic	
int	TokenNameint	
getMetaFileUnitsPerInch	TokenNameIdentifier	 get Meta File Units Per Inch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inch	TokenNameIdentifier	 inch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the Rectangle defining the viewport of the WMF Metafile, in Metafile units. * This viewport is defined in the Aldus Placable Header, by its left, top, bottom, right * components. * @see #getRightUnits() * @see #getLeftUnits() * @see #getTopUnits() * @see #getBottomUnits() */	TokenNameCOMMENT_JAVADOC	 get the Rectangle defining the viewport of the WMF Metafile, in Metafile units. This viewport is defined in the Aldus Placable Header, by its left, top, bottom, right components. @see #getRightUnits() @see #getLeftUnits() @see #getTopUnits() @see #getBottomUnits() 
public	TokenNamepublic	
Rectangle	TokenNameIdentifier	 Rectangle
getRectangleUnits	TokenNameIdentifier	 get Rectangle Units
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
rec	TokenNameIdentifier	 rec
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
top	TokenNameIdentifier	 top
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
rec	TokenNameIdentifier	 rec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the Rectangle defining the viewport of the WMF Metafile, in pixels. */	TokenNameCOMMENT_JAVADOC	 get the Rectangle defining the viewport of the WMF Metafile, in pixels. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getRectanglePixel	TokenNameIdentifier	 get Rectangle Pixel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
_left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
PIXEL_PER_INCH	TokenNameIdentifier	 PIXEL  PER  INCH
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
left	TokenNameIdentifier	 left
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
;	TokenNameSEMICOLON	
float	TokenNamefloat	
_right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
PIXEL_PER_INCH	TokenNameIdentifier	 PIXEL  PER  INCH
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
right	TokenNameIdentifier	 right
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
;	TokenNameSEMICOLON	
float	TokenNamefloat	
_top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
PIXEL_PER_INCH	TokenNameIdentifier	 PIXEL  PER  INCH
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
top	TokenNameIdentifier	 top
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
;	TokenNameSEMICOLON	
float	TokenNamefloat	
_bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
PIXEL_PER_INCH	TokenNameIdentifier	 PIXEL  PER  INCH
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
bottom	TokenNameIdentifier	 bottom
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
rec	TokenNameIdentifier	 rec
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
_left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
_top	TokenNameIdentifier	 top
,	TokenNameCOMMA	
_right	TokenNameIdentifier	 right
-	TokenNameMINUS	
_left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
_bottom	TokenNameIdentifier	 bottom
-	TokenNameMINUS	
_top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
rec	TokenNameIdentifier	 rec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the Rectangle defining the viewport of the WMF Metafile, in inchs. */	TokenNameCOMMENT_JAVADOC	 get the Rectangle defining the viewport of the WMF Metafile, in inchs. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getRectangleInch	TokenNameIdentifier	 get Rectangle Inch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
_left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
left	TokenNameIdentifier	 left
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
;	TokenNameSEMICOLON	
float	TokenNamefloat	
_right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
right	TokenNameIdentifier	 right
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
;	TokenNameSEMICOLON	
float	TokenNamefloat	
_top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
top	TokenNameIdentifier	 top
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
;	TokenNameSEMICOLON	
float	TokenNamefloat	
_bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
bottom	TokenNameIdentifier	 bottom
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
rec	TokenNameIdentifier	 rec
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
_left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
_top	TokenNameIdentifier	 top
,	TokenNameCOMMA	
_right	TokenNameIdentifier	 right
-	TokenNameMINUS	
_left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
_bottom	TokenNameIdentifier	 bottom
-	TokenNameMINUS	
_top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
rec	TokenNameIdentifier	 rec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the width of the WMF Metafile, in pixels. */	TokenNameCOMMENT_JAVADOC	 get the width of the WMF Metafile, in pixels. 
public	TokenNamepublic	
int	TokenNameint	
getWidthPixels	TokenNameIdentifier	 get Width Pixels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
PIXEL_PER_INCH	TokenNameIdentifier	 PIXEL  PER  INCH
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
width	TokenNameIdentifier	 width
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the factor to transform Metafile dimensions in pixels */	TokenNameCOMMENT_JAVADOC	 get the factor to transform Metafile dimensions in pixels 
public	TokenNamepublic	
float	TokenNamefloat	
getUnitsToPixels	TokenNameIdentifier	 get Units To Pixels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
PIXEL_PER_INCH	TokenNameIdentifier	 PIXEL  PER  INCH
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the factor to transform logical units width in pixels */	TokenNameCOMMENT_JAVADOC	 get the factor to transform logical units width in pixels 
public	TokenNamepublic	
float	TokenNamefloat	
getVpWFactor	TokenNameIdentifier	 get Vp W Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
PIXEL_PER_INCH	TokenNameIdentifier	 PIXEL  PER  INCH
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
width	TokenNameIdentifier	 width
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vpW	TokenNameIdentifier	 vp W
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the factor to transform logical units height in pixels */	TokenNameCOMMENT_JAVADOC	 get the factor to transform logical units height in pixels 
public	TokenNamepublic	
float	TokenNamefloat	
getVpHFactor	TokenNameIdentifier	 get Vp H Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
PIXEL_PER_INCH	TokenNameIdentifier	 PIXEL  PER  INCH
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
height	TokenNameIdentifier	 height
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vpH	TokenNameIdentifier	 vp H
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the height of the WMF Metafile, in pixels. */	TokenNameCOMMENT_JAVADOC	 get the height of the WMF Metafile, in pixels. 
public	TokenNamepublic	
int	TokenNameint	
getHeightPixels	TokenNameIdentifier	 get Height Pixels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
PIXEL_PER_INCH	TokenNameIdentifier	 PIXEL  PER  INCH
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
height	TokenNameIdentifier	 height
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
inch	TokenNameIdentifier	 inch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the sign of X coordinates. It is equal to 1 by default, but can be -1 if * all X coordinates are inversed. */	TokenNameCOMMENT_JAVADOC	 Return the sign of X coordinates. It is equal to 1 by default, but can be -1 if all X coordinates are inversed. 
public	TokenNamepublic	
int	TokenNameint	
getXSign	TokenNameIdentifier	 get X Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xSign	TokenNameIdentifier	 x Sign
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the sign of Y coordinates. It is equal to 1 by default, but can be -1 if * all Y coordinates are inversed. */	TokenNameCOMMENT_JAVADOC	 Return the sign of Y coordinates. It is equal to 1 by default, but can be -1 if all Y coordinates are inversed. 
public	TokenNamepublic	
int	TokenNameint	
getYSign	TokenNameIdentifier	 get Y Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setReading	TokenNameIdentifier	 set Reading
(	TokenNameLPAREN	
boolean	TokenNameboolean	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bReading	TokenNameIdentifier	 b Reading
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return true if the reader is currently reading an InputStream. */	TokenNameCOMMENT_JAVADOC	 @return true if the reader is currently reading an InputStream. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
isReading	TokenNameIdentifier	 is Reading
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bReading	TokenNameIdentifier	 b Reading
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** resets this WMFReader. */	TokenNameCOMMENT_JAVADOC	 resets this WMFReader. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Read this InputStream records. The aldus placeable header have already been * read (see {@link #read(DataInputStream)}). The behavior of this method is left * to the subclass. * <p>Each Metafile record is composed of : * <ul> * <li>the size of the Record in int (32 bits)</li> * <li>the function ID for the Record on a short word (16 bits)</li> * <li>the function parameters, according to the WMF Metafile specification. * the remaining size in short words (16 bits) for the parameters is equal to * the total size for the record minus 3 short words (= 16 + 32 bits)</li> * </ul> * </p> * <p>Example :</p> * <pre>while (functionId > 0) { * recSize = readInt( is ); * // Subtract size in 16-bit words of recSize and functionId; * recSize -= 3; * functionId = readShort( is ); * if ( functionId <= 0 ) * break; * switch ( functionId ) { * case WMFConstants.&lt;a WMF function ID&gt; { * do something when this function is encountered * } * break; * * default: * for ( int j = 0; j < recSize; j++ ) * readShort(is); * break; * </pre> * @see WMFConstants */	TokenNameCOMMENT_JAVADOC	 Read this InputStream records. The aldus placeable header have already been read (see {@link #read(DataInputStream)}). The behavior of this method is left to the subclass. <p>Each Metafile record is composed of : <ul> <li>the size of the Record in int (32 bits)</li> <li>the function ID for the Record on a short word (16 bits)</li> <li>the function parameters, according to the WMF Metafile specification. the remaining size in short words (16 bits) for the parameters is equal to the total size for the record minus 3 short words (= 16 + 32 bits)</li> </ul> </p> <p>Example :</p> <pre>while (functionId > 0) { recSize = readInt( is ); // Subtract size in 16-bit words of recSize and functionId; recSize -= 3; functionId = readShort( is ); if ( functionId <= 0 ) break; switch ( functionId ) { case WMFConstants.&lt;a WMF function ID&gt; { do something when this function is encountered } break; * default: for ( int j = 0; j < recSize; j++ ) readShort(is); break; </pre> @see WMFConstants 
protected	TokenNameprotected	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
readRecords	TokenNameIdentifier	 read Records
(	TokenNameLPAREN	
DataInputStream	TokenNameIdentifier	 Data Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Reads the WMF file from the specified Stream, read it and set the following * properties: * <ul> * <li>{@link #mtType} : File type (0 : memory, 1 : disk)</li> * <li>{@link #mtHeaderSize} : Size of header in WORDS (always 9)</li> * <li>{@link #mtVersion} : Version of Microsoft Windows used</li> * <li>{@link #mtSize} : Total size of the metafile in WORDs</li> * <li>{@link #mtNoObjects} : Number of objects in the file</li> * <li>{@link #mtMaxRecord} : The size of largest record in WORDs</li> * <li>{@link #mtNoParameters} : Not Used (always 0)</li> * </ul> * If the file contains an APM * (aldus placeable header), this method read these additionnal properties : * <ul> * <li>{@link #left} : Left coordinate in metafile units</li> * <li>{@link #right} : Right coordinate in metafile units</li> * <li>{@link #top} : Top coordinate in metafile units</li> * <li>{@link #bottom} : Bottom coordinate in metafile units</li> * <li>{@link #inch} : Number of metafile units per inch</li> * </ul> * <p>Then it calls the {@link #readRecords(DataInputStream)} abstract method, * whose behavior is left to the subclass</p>. */	TokenNameCOMMENT_JAVADOC	 Reads the WMF file from the specified Stream, read it and set the following properties: <ul> <li>{@link #mtType} : File type (0 : memory, 1 : disk)</li> <li>{@link #mtHeaderSize} : Size of header in WORDS (always 9)</li> <li>{@link #mtVersion} : Version of Microsoft Windows used</li> <li>{@link #mtSize} : Total size of the metafile in WORDs</li> <li>{@link #mtNoObjects} : Number of objects in the file</li> <li>{@link #mtMaxRecord} : The size of largest record in WORDs</li> <li>{@link #mtNoParameters} : Not Used (always 0)</li> </ul> If the file contains an APM (aldus placeable header), this method read these additionnal properties : <ul> <li>{@link #left} : Left coordinate in metafile units</li> <li>{@link #right} : Right coordinate in metafile units</li> <li>{@link #top} : Top coordinate in metafile units</li> <li>{@link #bottom} : Bottom coordinate in metafile units</li> <li>{@link #inch} : Number of metafile units per inch</li> </ul> <p>Then it calls the {@link #readRecords(DataInputStream)} abstract method, whose behavior is left to the subclass</p>. 
public	TokenNamepublic	
void	TokenNamevoid	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
DataInputStream	TokenNameIdentifier	 Data Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setReading	TokenNameIdentifier	 set Reading
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dwIsAldus	TokenNameIdentifier	 dw Is Aldus
=	TokenNameEQUAL	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dwIsAldus	TokenNameIdentifier	 dw Is Aldus
==	TokenNameEQUAL_EQUAL	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_ALDUS_APM	TokenNameIdentifier	 META  ALDUS  APM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Read the aldus placeable header. 	TokenNameCOMMENT_LINE	Read the aldus placeable header. 
int	TokenNameint	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
dwIsAldus	TokenNameIdentifier	 dw Is Aldus
;	TokenNameSEMICOLON	
isAldus	TokenNameIdentifier	 is Aldus
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// metafile handle, always zero 	TokenNameCOMMENT_LINE	metafile handle, always zero 
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inch	TokenNameIdentifier	 inch
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
reserved	TokenNameIdentifier	 reserved
=	TokenNameEQUAL	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
checksum	TokenNameIdentifier	 checksum
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// inverse values if left > right or top > bottom 	TokenNameCOMMENT_LINE	inverse values if left > right or top > bottom 
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
>	TokenNameGREATER	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
_i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
_i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
xSign	TokenNameIdentifier	 x Sign
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
>	TokenNameGREATER	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
_i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
_i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
ySign	TokenNameIdentifier	 y Sign
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
right	TokenNameIdentifier	 right
-	TokenNameMINUS	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
bottom	TokenNameIdentifier	 bottom
-	TokenNameMINUS	
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
// read the beginning of the header 	TokenNameCOMMENT_LINE	read the beginning of the header 
mtType	TokenNameIdentifier	 mt Type
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mtHeaderSize	TokenNameIdentifier	 mt Header Size
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// read the beginning of the header, the first int corresponds to the first two parameters 	TokenNameCOMMENT_LINE	read the beginning of the header, the first int corresponds to the first two parameters 
mtType	TokenNameIdentifier	 mt Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dwIsAldus	TokenNameIdentifier	 dw Is Aldus
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mtHeaderSize	TokenNameIdentifier	 mt Header Size
=	TokenNameEQUAL	
dwIsAldus	TokenNameIdentifier	 dw Is Aldus
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mtVersion	TokenNameIdentifier	 mt Version
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mtSize	TokenNameIdentifier	 mt Size
=	TokenNameEQUAL	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mtNoObjects	TokenNameIdentifier	 mt No Objects
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mtMaxRecord	TokenNameIdentifier	 mt Max Record
=	TokenNameEQUAL	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mtNoParameters	TokenNameIdentifier	 mt No Parameters
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numObjects	TokenNameIdentifier	 num Objects
=	TokenNameEQUAL	
mtNoObjects	TokenNameIdentifier	 mt No Objects
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
tempList	TokenNameIdentifier	 temp List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
numObjects	TokenNameIdentifier	 num Objects
)	TokenNameRPAREN	
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
numObjects	TokenNameIdentifier	 num Objects
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempList	TokenNameIdentifier	 temp List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
GdiObject	TokenNameIdentifier	 Gdi Object
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
objectVector	TokenNameIdentifier	 object Vector
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
tempList	TokenNameIdentifier	 temp List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
readRecords	TokenNameIdentifier	 read Records
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Unhandled exception while reading records"	TokenNameStringLiteral	Unhandled exception while reading records
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
addObject	TokenNameIdentifier	 add Object
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startIdx	TokenNameIdentifier	 start Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// if ( type == Wmf.PEN ) { 	TokenNameCOMMENT_LINE	if ( type == Wmf.PEN ) { 
// startIdx = 2; 	TokenNameCOMMENT_LINE	startIdx = 2; 
// } 	TokenNameCOMMENT_LINE	} 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
startIdx	TokenNameIdentifier	 start Idx
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numObjects	TokenNameIdentifier	 num Objects
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GdiObject	TokenNameIdentifier	 Gdi Object
gdi	TokenNameIdentifier	 gdi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GdiObject	TokenNameIdentifier	 Gdi Object
)	TokenNameRPAREN	
objectVector	TokenNameIdentifier	 object Vector
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
gdi	TokenNameIdentifier	 gdi
.	TokenNameDOT	
used	TokenNameIdentifier	 used
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gdi	TokenNameIdentifier	 gdi
.	TokenNameDOT	
Setup	TokenNameIdentifier	 Setup
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastObjectIdx	TokenNameIdentifier	 last Object Idx
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
lastObjectIdx	TokenNameIdentifier	 last Object Idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a GdiObject to the internal handle table. * Wmf files specify the index as given in EMF records such as * EMRCREATEPENINDIRECT whereas WMF files always use 0. * * This function should not normally be called by an application. * @return the object index */	TokenNameCOMMENT_JAVADOC	 Adds a GdiObject to the internal handle table. Wmf files specify the index as given in EMF records such as EMRCREATEPENINDIRECT whereas WMF files always use 0. * This function should not normally be called by an application. @return the object index 
public	TokenNamepublic	
int	TokenNameint	
addObjectAt	TokenNameIdentifier	 add Object At
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>	TokenNameGREATER	
numObjects	TokenNameIdentifier	 num Objects
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addObject	TokenNameIdentifier	 add Object
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lastObjectIdx	TokenNameIdentifier	 last Object Idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastObjectIdx	TokenNameIdentifier	 last Object Idx
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
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
numObjects	TokenNameIdentifier	 num Objects
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GdiObject	TokenNameIdentifier	 Gdi Object
gdi	TokenNameIdentifier	 gdi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GdiObject	TokenNameIdentifier	 Gdi Object
)	TokenNameRPAREN	
objectVector	TokenNameIdentifier	 object Vector
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gdi	TokenNameIdentifier	 gdi
.	TokenNameDOT	
Setup	TokenNameIdentifier	 Setup
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a GdiObject from the handle table */	TokenNameCOMMENT_JAVADOC	 Returns a GdiObject from the handle table 
public	TokenNamepublic	
GdiObject	TokenNameIdentifier	 Gdi Object
getObject	TokenNameIdentifier	 get Object
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
GdiObject	TokenNameIdentifier	 Gdi Object
)	TokenNameRPAREN	
objectVector	TokenNameIdentifier	 object Vector
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of GdiObjects in the handle table */	TokenNameCOMMENT_JAVADOC	 Returns the number of GdiObjects in the handle table 
public	TokenNamepublic	
int	TokenNameint	
getNumObjects	TokenNameIdentifier	 get Num Objects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numObjects	TokenNameIdentifier	 num Objects
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
