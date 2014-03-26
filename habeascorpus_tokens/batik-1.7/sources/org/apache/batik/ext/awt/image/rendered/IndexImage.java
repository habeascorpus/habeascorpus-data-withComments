/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
rendered	TokenNameIdentifier	 rendered
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Graphics2D	TokenNameIdentifier	 Graphics2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Point	TokenNameIdentifier	 Point
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
RenderingHints	TokenNameIdentifier	 Rendering Hints
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
BufferedImage	TokenNameIdentifier	 Buffered Image
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
ColorModel	TokenNameIdentifier	 Color Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
DataBuffer	TokenNameIdentifier	 Data Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
IndexColorModel	TokenNameIdentifier	 Index Color Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
MultiPixelPackedSampleModel	TokenNameIdentifier	 Multi Pixel Packed Sample Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
Raster	TokenNameIdentifier	 Raster
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
SampleModel	TokenNameIdentifier	 Sample Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
WritableRaster	TokenNameIdentifier	 Writable Raster
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
;	TokenNameSEMICOLON	
/** * This class implements an adaptive palette generator to reduce images to a * specified number of colors. * * Ideally this would also support a better dither option than just * the JDK's pattern dither. * * The algorithm used is the 'Median Cut Algorithm' published by * Paul Heckbert in early '80s. * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @author <a href="mailto:jun@oop-reserch.com">Jun Inamori</a> * @version $Id: IndexImage.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements an adaptive palette generator to reduce images to a specified number of colors. * Ideally this would also support a better dither option than just the JDK's pattern dither. * The algorithm used is the 'Median Cut Algorithm' published by Paul Heckbert in early '80s. * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @author <a href="mailto:jun@oop-reserch.com">Jun Inamori</a> @version $Id: IndexImage.java 489226 2006-12-21 00:05:36Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
IndexImage	TokenNameIdentifier	 Index Image
{	TokenNameLBRACE	
/** * Used to track a color and the number of pixels of that colors */	TokenNameCOMMENT_JAVADOC	 Used to track a color and the number of pixels of that colors 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Counter	TokenNameIdentifier	 Counter
{	TokenNameLBRACE	
/** * contains the 'packed' rgb-color for this point. * Must not change after construction! */	TokenNameCOMMENT_JAVADOC	 contains the 'packed' rgb-color for this point. Must not change after construction! 
final	TokenNamefinal	
int	TokenNameint	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
/** * the number of image-pixels with this color. */	TokenNameCOMMENT_JAVADOC	 the number of image-pixels with this color. 
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Counter	TokenNameIdentifier	 Counter
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// See if the value matches us... 	TokenNameCOMMENT_LINE	See if the value matches us... 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
val	TokenNameIdentifier	 val
!=	TokenNameNOT_EQUAL	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * convert the color-point of this counter to an rgb-array. * To avoid creating lots of arrays, the caller passes the * array to store the result. * * @param rgb an int[ 3 ] to store the result. * @return an int-array with rgb-color-values (same as rgb-parameter) */	TokenNameCOMMENT_JAVADOC	 convert the color-point of this counter to an rgb-array. To avoid creating lots of arrays, the caller passes the array to store the result. * @param rgb an int[ 3 ] to store the result. @return an int-array with rgb-color-values (same as rgb-parameter) 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRgb	TokenNameIdentifier	 get Rgb
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rgb	TokenNameIdentifier	 rgb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
Cube	TokenNameIdentifier	 Cube
.	TokenNameDOT	
RED	TokenNameIdentifier	 RED
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
&	TokenNameAND	
0xFF0000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
Cube	TokenNameIdentifier	 Cube
.	TokenNameDOT	
GRN	TokenNameIdentifier	 GRN
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
&	TokenNameAND	
0x00FF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
Cube	TokenNameIdentifier	 Cube
.	TokenNameDOT	
BLU	TokenNameIdentifier	 BLU
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
&	TokenNameAND	
0x0000FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
rgb	TokenNameIdentifier	 rgb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Used to define a cube of the colorspace. The cube can be split * approximagely in half to generate two cubes. */	TokenNameCOMMENT_JAVADOC	 Used to define a cube of the colorspace. The cube can be split approximagely in half to generate two cubes. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Cube	TokenNameIdentifier	 Cube
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
RGB_BLACK	TokenNameIdentifier	 RGB  BLACK
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
{	TokenNameLBRACE	
255	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
255	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
255	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * the colors-array is not modified - in fact, all cubes use * the same colors-array. The Counter contains the * rgb-color-code and the count of pixels with this color. */	TokenNameCOMMENT_JAVADOC	 the colors-array is not modified - in fact, all cubes use the same colors-array. The Counter contains the rgb-color-code and the count of pixels with this color. 
final	TokenNamefinal	
Counter	TokenNameIdentifier	 Counter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colors	TokenNameIdentifier	 colors
;	TokenNameSEMICOLON	
/** * the number of color-points in this cube. */	TokenNameCOMMENT_JAVADOC	 the number of color-points in this cube. 
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RED	TokenNameIdentifier	 RED
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
GRN	TokenNameIdentifier	 GRN
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BLU	TokenNameIdentifier	 BLU
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Define a new cube. * @param colors contains the 3D color histogram to be subdivided * @param count the total number of pixels in the 3D histogram. */	TokenNameCOMMENT_JAVADOC	 Define a new cube. @param colors contains the 3D color histogram to be subdivided @param count the total number of pixels in the 3D histogram. 
Cube	TokenNameIdentifier	 Cube
(	TokenNameLPAREN	
Counter	TokenNameIdentifier	 Counter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
colors	TokenNameIdentifier	 colors
=	TokenNameEQUAL	
colors	TokenNameIdentifier	 colors
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If this returns true then the cube can not be subdivided any * further */	TokenNameCOMMENT_JAVADOC	 If this returns true then the cube can not be subdivided any further 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
done	TokenNameIdentifier	 done
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * check, if the color defined by val[] is inside this cube. * * @param val int[ 3 ] containing r,g,b-values * @return true when color is inside this cube */	TokenNameCOMMENT_JAVADOC	 check, if the color defined by val[] is inside this cube. * @param val int[ 3 ] containing r,g,b-values @return true when color is inside this cube 
private	TokenNameprivate	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
vRed	TokenNameIdentifier	 v Red
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
[	TokenNameLBRACKET	
RED	TokenNameIdentifier	 RED
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// just save some array-accesses 	TokenNameCOMMENT_LINE	just save some array-accesses 
int	TokenNameint	
vGrn	TokenNameIdentifier	 v Grn
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
[	TokenNameLBRACKET	
GRN	TokenNameIdentifier	 GRN
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
vBlu	TokenNameIdentifier	 v Blu
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
[	TokenNameLBRACKET	
BLU	TokenNameIdentifier	 BLU
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
RED	TokenNameIdentifier	 RED
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
vRed	TokenNameIdentifier	 v Red
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
vRed	TokenNameIdentifier	 v Red
<=	TokenNameLESS_EQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
RED	TokenNameIdentifier	 RED
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
GRN	TokenNameIdentifier	 GRN
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
vGrn	TokenNameIdentifier	 v Grn
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
vGrn	TokenNameIdentifier	 v Grn
<=	TokenNameLESS_EQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
GRN	TokenNameIdentifier	 GRN
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
BLU	TokenNameIdentifier	 BLU
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
vBlu	TokenNameIdentifier	 v Blu
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
vBlu	TokenNameIdentifier	 v Blu
<=	TokenNameLESS_EQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
BLU	TokenNameIdentifier	 BLU
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Splits the cube into two parts. This cube is * changed to be one half and the returned cube is the other half. * This tries to pick the right channel to split on. */	TokenNameCOMMENT_JAVADOC	 Splits the cube into two parts. This cube is changed to be one half and the returned cube is the other half. This tries to pick the right channel to split on. 
Cube	TokenNameIdentifier	 Cube
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dr	TokenNameIdentifier	 dr
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
RED	TokenNameIdentifier	 RED
]	TokenNameRBRACKET	
-	TokenNameMINUS	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
RED	TokenNameIdentifier	 RED
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
dg	TokenNameIdentifier	 dg
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
GRN	TokenNameIdentifier	 GRN
]	TokenNameRBRACKET	
-	TokenNameMINUS	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
GRN	TokenNameIdentifier	 GRN
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
BLU	TokenNameIdentifier	 BLU
]	TokenNameRBRACKET	
-	TokenNameMINUS	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
BLU	TokenNameIdentifier	 BLU
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
c0	TokenNameIdentifier	 c0
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
,	TokenNameCOMMA	
splitChannel	TokenNameIdentifier	 split Channel
;	TokenNameSEMICOLON	
// Figure out which axis is the longest and split along 	TokenNameCOMMENT_LINE	Figure out which axis is the longest and split along 
// that axis (this tries to keep cubes square-ish). 	TokenNameCOMMENT_LINE	that axis (this tries to keep cubes square-ish). 
if	TokenNameif	
(	TokenNameLPAREN	
dr	TokenNameIdentifier	 dr
>=	TokenNameGREATER_EQUAL	
dg	TokenNameIdentifier	 dg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dr	TokenNameIdentifier	 dr
>=	TokenNameGREATER_EQUAL	
db	TokenNameIdentifier	 db
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splitChannel	TokenNameIdentifier	 split Channel
=	TokenNameEQUAL	
RED	TokenNameIdentifier	 RED
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
=	TokenNameEQUAL	
GRN	TokenNameIdentifier	 GRN
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
BLU	TokenNameIdentifier	 BLU
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
splitChannel	TokenNameIdentifier	 split Channel
=	TokenNameEQUAL	
BLU	TokenNameIdentifier	 BLU
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
=	TokenNameEQUAL	
RED	TokenNameIdentifier	 RED
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
GRN	TokenNameIdentifier	 GRN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dg	TokenNameIdentifier	 dg
>=	TokenNameGREATER_EQUAL	
db	TokenNameIdentifier	 db
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splitChannel	TokenNameIdentifier	 split Channel
=	TokenNameEQUAL	
GRN	TokenNameIdentifier	 GRN
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
=	TokenNameEQUAL	
RED	TokenNameIdentifier	 RED
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
BLU	TokenNameIdentifier	 BLU
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
splitChannel	TokenNameIdentifier	 split Channel
=	TokenNameEQUAL	
BLU	TokenNameIdentifier	 BLU
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
=	TokenNameEQUAL	
GRN	TokenNameIdentifier	 GRN
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
RED	TokenNameIdentifier	 RED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println("Red:" + dr 	TokenNameCOMMENT_LINE	System.out.println("Red:" + dr 
// + " Grn:" + dg 	TokenNameCOMMENT_LINE	+ " Grn:" + dg 
// + " Blu:" + db 	TokenNameCOMMENT_LINE	+ " Blu:" + db 
// + " Split:" + splitChannel 	TokenNameCOMMENT_LINE	+ " Split:" + splitChannel 
// + " c0:" + c0 	TokenNameCOMMENT_LINE	+ " c0:" + c0 
// + " c1:" + c1 ); 	TokenNameCOMMENT_LINE	+ " c1:" + c1 ); 
Cube	TokenNameIdentifier	 Cube
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
// try to split the longest axis 	TokenNameCOMMENT_LINE	try to split the longest axis 
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
splitChannel	TokenNameIdentifier	 split Channel
(	TokenNameLPAREN	
splitChannel	TokenNameIdentifier	 split Channel
,	TokenNameCOMMA	
c0	TokenNameIdentifier	 c0
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
// try to split along the 2nd longest axis 	TokenNameCOMMENT_LINE	try to split along the 2nd longest axis 
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
splitChannel	TokenNameIdentifier	 split Channel
(	TokenNameLPAREN	
c0	TokenNameIdentifier	 c0
,	TokenNameCOMMA	
splitChannel	TokenNameIdentifier	 split Channel
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
// only one left 	TokenNameCOMMENT_LINE	only one left 
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
splitChannel	TokenNameIdentifier	 split Channel
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
,	TokenNameCOMMA	
splitChannel	TokenNameIdentifier	 split Channel
,	TokenNameCOMMA	
c0	TokenNameIdentifier	 c0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
// so far, no split was possible trying all 3 colors: this 	TokenNameCOMMENT_LINE	so far, no split was possible trying all 3 colors: this 
// cube can't be split further 	TokenNameCOMMENT_LINE	cube can't be split further 
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adjust (normalize) min/max of this cube so that they span * the actual content. This method is called on the two cubes * resulting from a split. <br> We search the counts[] from * min to max for the leftmost non-null entry. That is the * new min. Then we search counts[] from max to min for the * rightmost non-null entry. That is the new max. <br>This * requires, that {@link #computeCounts } really computes * <i>all</i> counts-values (and does not stop after the * necessary number of points for a split is found, as it was * done in the previous version of this class). * * @param splitChannel the color used for the last split * @param counts contains the number of points along the splitChannel * - only counts[ min .. max ] is valid. */	TokenNameCOMMENT_JAVADOC	 Adjust (normalize) min/max of this cube so that they span the actual content. This method is called on the two cubes resulting from a split. <br> We search the counts[] from min to max for the leftmost non-null entry. That is the new min. Then we search counts[] from max to min for the rightmost non-null entry. That is the new max. <br>This requires, that {@link #computeCounts } really computes <i>all</i> counts-values (and does not stop after the necessary number of points for a split is found, as it was done in the previous version of this class). * @param splitChannel the color used for the last split @param counts contains the number of points along the splitChannel - only counts[ min .. max ] is valid. 
private	TokenNameprivate	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
int	TokenNameint	
splitChannel	TokenNameIdentifier	 split Channel
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
counts	TokenNameIdentifier	 counts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty cube: nothing to normalize 	TokenNameCOMMENT_LINE	empty cube: nothing to normalize 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
iMin	TokenNameIdentifier	 i Min
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
iMax	TokenNameIdentifier	 i Max
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
loBound	TokenNameIdentifier	 lo Bound
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
hiBound	TokenNameIdentifier	 hi Bound
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// we search from left to right for the first non-null 	TokenNameCOMMENT_LINE	we search from left to right for the first non-null 
// entry in counts[] 	TokenNameCOMMENT_LINE	entry in counts[] 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
iMin	TokenNameIdentifier	 i Min
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
iMax	TokenNameIdentifier	 i Max
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
counts	TokenNameIdentifier	 counts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this entry is 0: search more 	TokenNameCOMMENT_LINE	this entry is 0: search more 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we reached a non-null entry: stop looking further 	TokenNameCOMMENT_LINE	we reached a non-null entry: stop looking further 
loBound	TokenNameIdentifier	 lo Bound
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we search from right to left for the first non-null 	TokenNameCOMMENT_LINE	we search from right to left for the first non-null 
// entry in counts[] 	TokenNameCOMMENT_LINE	entry in counts[] 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
iMax	TokenNameIdentifier	 i Max
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
iMin	TokenNameIdentifier	 i Min
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
counts	TokenNameIdentifier	 counts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this entry is 0: search more 	TokenNameCOMMENT_LINE	this entry is 0: search more 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we reached a non-null entry: stop looking further 	TokenNameCOMMENT_LINE	we reached a non-null entry: stop looking further 
hiBound	TokenNameIdentifier	 hi Bound
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
flagChangedLo	TokenNameIdentifier	 flag Changed Lo
=	TokenNameEQUAL	
(	TokenNameLPAREN	
loBound	TokenNameIdentifier	 lo Bound
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
iMin	TokenNameIdentifier	 i Min
!=	TokenNameNOT_EQUAL	
loBound	TokenNameIdentifier	 lo Bound
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
flagChangedHi	TokenNameIdentifier	 flag Changed Hi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hiBound	TokenNameIdentifier	 hi Bound
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
iMax	TokenNameIdentifier	 i Max
!=	TokenNameNOT_EQUAL	
hiBound	TokenNameIdentifier	 hi Bound
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if ( flagChangedLo || flagChangedHi ){ 	TokenNameCOMMENT_LINE	if ( flagChangedLo || flagChangedHi ){ 
// System.out.println("old min:" + min[ splitChannel ] + "/max:" + max[ splitChannel ] 	TokenNameCOMMENT_LINE	System.out.println("old min:" + min[ splitChannel ] + "/max:" + max[ splitChannel ] 
// + " new: " + loBound + "/" + hiBound ); 	TokenNameCOMMENT_LINE	+ " new: " + loBound + "/" + hiBound ); 
// StringBuffer buff = new StringBuffer( 100 ); 	TokenNameCOMMENT_LINE	StringBuffer buff = new StringBuffer( 100 ); 
// for( int i= min[ splitChannel ]; i <= max[ splitChannel]; i++ ){ 	TokenNameCOMMENT_LINE	for( int i= min[ splitChannel ]; i <= max[ splitChannel]; i++ ){ 
// buff.append( counts[ i ] ); 	TokenNameCOMMENT_LINE	buff.append( counts[ i ] ); 
// buff.append( ',' ); 	TokenNameCOMMENT_LINE	buff.append( ',' ); 
// } 	TokenNameCOMMENT_LINE	} 
// System.out.println("Counts:" + buff ); 	TokenNameCOMMENT_LINE	System.out.println("Counts:" + buff ); 
// } 	TokenNameCOMMENT_LINE	} 
if	TokenNameif	
(	TokenNameLPAREN	
flagChangedLo	TokenNameIdentifier	 flag Changed Lo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
loBound	TokenNameIdentifier	 lo Bound
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
flagChangedHi	TokenNameIdentifier	 flag Changed Hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
hiBound	TokenNameIdentifier	 hi Bound
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Splits the image according to the parameters. It tries * to find a location where half the pixels are on one side * and half the pixels are on the other. */	TokenNameCOMMENT_JAVADOC	 Splits the image according to the parameters. It tries to find a location where half the pixels are on one side and half the pixels are on the other. 
Cube	TokenNameIdentifier	 Cube
splitChannel	TokenNameIdentifier	 split Channel
(	TokenNameLPAREN	
int	TokenNameint	
splitChannel	TokenNameIdentifier	 split Channel
,	TokenNameCOMMA	
int	TokenNameint	
c0	TokenNameIdentifier	 c0
,	TokenNameCOMMA	
int	TokenNameint	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// thickness along the splitChannel is only one point: cannot split 	TokenNameCOMMENT_LINE	thickness along the splitChannel is only one point: cannot split 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this Cube has no points: cannot split 	TokenNameCOMMENT_LINE	this Cube has no points: cannot split 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println( toString() ); 	TokenNameCOMMENT_LINE	System.out.println( toString() ); 
int	TokenNameint	
half	TokenNameIdentifier	 half
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Each entry is the number of pixels that have that value 	TokenNameCOMMENT_LINE	Each entry is the number of pixels that have that value 
// in the split channel within the cube (so pixels 	TokenNameCOMMENT_LINE	in the split channel within the cube (so pixels 
// that have that value in the split channel aren't counted 	TokenNameCOMMENT_LINE	that have that value in the split channel aren't counted 
// if they are outside the cube in the other color channels. 	TokenNameCOMMENT_LINE	if they are outside the cube in the other color channels. 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
counts	TokenNameIdentifier	 counts
=	TokenNameEQUAL	
computeCounts	TokenNameIdentifier	 compute Counts
(	TokenNameLPAREN	
splitChannel	TokenNameIdentifier	 split Channel
,	TokenNameCOMMA	
c0	TokenNameIdentifier	 c0
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
tcount	TokenNameIdentifier	 tcount
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastAdd	TokenNameIdentifier	 last Add
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// These indicate what the top value for the low cube and 	TokenNameCOMMENT_LINE	These indicate what the top value for the low cube and 
// the low value of the high cube should be in the split channel 	TokenNameCOMMENT_LINE	the low value of the high cube should be in the split channel 
// (they may not be one off if there are 'dead' spots in the 	TokenNameCOMMENT_LINE	(they may not be one off if there are 'dead' spots in the 
// counts array. 	TokenNameCOMMENT_LINE	counts array. 
int	TokenNameint	
splitLo	TokenNameIdentifier	 split Lo
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
splitHi	TokenNameIdentifier	 split Hi
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
counts	TokenNameIdentifier	 counts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No counts below this so move up bottom of cube. 	TokenNameCOMMENT_LINE	No counts below this so move up bottom of cube. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tcount	TokenNameIdentifier	 tcount
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tcount	TokenNameIdentifier	 tcount
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
half	TokenNameIdentifier	 half
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastAdd	TokenNameIdentifier	 last Add
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
tcount	TokenNameIdentifier	 tcount
+=	TokenNamePLUS_EQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
half	TokenNameIdentifier	 half
-	TokenNameMINUS	
tcount	TokenNameIdentifier	 tcount
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tcount	TokenNameIdentifier	 tcount
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
-	TokenNameMINUS	
half	TokenNameIdentifier	 half
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Then lastAdd is a better top idx for this then i. 	TokenNameCOMMENT_LINE	Then lastAdd is a better top idx for this then i. 
if	TokenNameif	
(	TokenNameLPAREN	
lastAdd	TokenNameIdentifier	 last Add
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No lower place to break. 	TokenNameCOMMENT_LINE	No lower place to break. 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// All pixels are at this value so make min/max 	TokenNameCOMMENT_LINE	All pixels are at this value so make min/max 
// reflect that. 	TokenNameCOMMENT_LINE	reflect that. 
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// no split to make. 	TokenNameCOMMENT_LINE	no split to make. 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// There are values about this one so 	TokenNameCOMMENT_LINE	There are values about this one so 
// split above. 	TokenNameCOMMENT_LINE	split above. 
splitLo	TokenNameIdentifier	 split Lo
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
splitHi	TokenNameIdentifier	 split Hi
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tcount	TokenNameIdentifier	 tcount
+=	TokenNamePLUS_EQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
// fix 35683 	TokenNameCOMMENT_LINE	fix 35683 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
splitLo	TokenNameIdentifier	 split Lo
=	TokenNameEQUAL	
lastAdd	TokenNameIdentifier	 last Add
;	TokenNameSEMICOLON	
splitHi	TokenNameIdentifier	 split Hi
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// would move min up but that should 	TokenNameCOMMENT_LINE	would move min up but that should 
// have happened already. 	TokenNameCOMMENT_LINE	have happened already. 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// no split to make. 	TokenNameCOMMENT_LINE	no split to make. 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Would like to break between i and i+1 	TokenNameCOMMENT_LINE	Would like to break between i and i+1 
// but no i+1 so use lastAdd and i; 	TokenNameCOMMENT_LINE	but no i+1 so use lastAdd and i; 
splitLo	TokenNameIdentifier	 split Lo
=	TokenNameEQUAL	
lastAdd	TokenNameIdentifier	 last Add
;	TokenNameSEMICOLON	
splitHi	TokenNameIdentifier	 split Hi
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Include c in counts 	TokenNameCOMMENT_LINE	Include c in counts 
tcount	TokenNameIdentifier	 tcount
+=	TokenNamePLUS_EQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
splitLo	TokenNameIdentifier	 split Lo
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
splitHi	TokenNameIdentifier	 split Hi
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println("Split: " + splitChannel + "@" 	TokenNameCOMMENT_LINE	System.out.println("Split: " + splitChannel + "@" 
// + splitLo + "-"+splitHi + 	TokenNameCOMMENT_LINE	+ splitLo + "-"+splitHi + 
// " Count: " + tcount + " of " + count + 	TokenNameCOMMENT_LINE	" Count: " + tcount + " of " + count + 
// " LA: " + lastAdd); 	TokenNameCOMMENT_LINE	" LA: " + lastAdd); 
// Create the new cube and update everyone's bounds & counts. 	TokenNameCOMMENT_LINE	Create the new cube and update everyone's bounds & counts. 
Cube	TokenNameIdentifier	 Cube
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
Cube	TokenNameIdentifier	 Cube
(	TokenNameLPAREN	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
tcount	TokenNameIdentifier	 tcount
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
tcount	TokenNameIdentifier	 tcount
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
splitLo	TokenNameIdentifier	 split Lo
;	TokenNameSEMICOLON	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
splitHi	TokenNameIdentifier	 split Hi
;	TokenNameSEMICOLON	
// the cube was split along splitChannel, the other 	TokenNameCOMMENT_LINE	the cube was split along splitChannel, the other 
// dimensions dont change 	TokenNameCOMMENT_LINE	dimensions dont change 
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
c0	TokenNameIdentifier	 c0
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
c0	TokenNameIdentifier	 c0
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
c0	TokenNameIdentifier	 c0
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
c0	TokenNameIdentifier	 c0
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
c1	TokenNameIdentifier	 c1
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
c1	TokenNameIdentifier	 c1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
c1	TokenNameIdentifier	 c1
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
c1	TokenNameIdentifier	 c1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// if ( count <= 0 ){ 	TokenNameCOMMENT_LINE	if ( count <= 0 ){ 
// System.out.println("This cube has no points after split:" + toString() ); 	TokenNameCOMMENT_LINE	System.out.println("This cube has no points after split:" + toString() ); 
// } 	TokenNameCOMMENT_LINE	} 
// if ( ret.count <= 0 ){ 	TokenNameCOMMENT_LINE	if ( ret.count <= 0 ){ 
// System.out.println("That cube has no points after split:" + ret.toString() + " this:" + toString() ); 	TokenNameCOMMENT_LINE	System.out.println("That cube has no points after split:" + ret.toString() + " this:" + toString() ); 
// System.out.println("SplitLo:" + splitLo + " SplitHi:" + splitHi ); 	TokenNameCOMMENT_LINE	System.out.println("SplitLo:" + splitLo + " SplitHi:" + splitHi ); 
// } 	TokenNameCOMMENT_LINE	} 
// after a split we 'normalize' both cubes, so that their 	TokenNameCOMMENT_LINE	after a split we 'normalize' both cubes, so that their 
// min/max reflect the actual bounds of the cube. comment 	TokenNameCOMMENT_LINE	min/max reflect the actual bounds of the cube. comment 
// the next two lines when you want to see the impact of 	TokenNameCOMMENT_LINE	the next two lines when you want to see the impact of 
// using non-normalized cubes 	TokenNameCOMMENT_LINE	using non-normalized cubes 
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
splitChannel	TokenNameIdentifier	 split Channel
,	TokenNameCOMMA	
counts	TokenNameIdentifier	 counts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
splitChannel	TokenNameIdentifier	 split Channel
,	TokenNameCOMMA	
counts	TokenNameIdentifier	 counts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * create an array, which contains the number of pixels for * each point along the splitChannel (between min and max of * this cube). * * @param splitChannel one of RED | GRN | BLU * @param c0 one of the other channels * @param c1 the third channel * @return an int[ 255 ] where only int[ min .. max ] contain * valid counts. */	TokenNameCOMMENT_JAVADOC	 create an array, which contains the number of pixels for each point along the splitChannel (between min and max of this cube). * @param splitChannel one of RED | GRN | BLU @param c0 one of the other channels @param c1 the third channel @return an int[ 255 ] where only int[ min .. max ] contain valid counts. 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
computeCounts	TokenNameIdentifier	 compute Counts
(	TokenNameLPAREN	
int	TokenNameint	
splitChannel	TokenNameIdentifier	 split Channel
,	TokenNameCOMMA	
int	TokenNameint	
c0	TokenNameIdentifier	 c0
,	TokenNameCOMMA	
int	TokenNameint	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
splitSh4	TokenNameIdentifier	 split Sh4
=	TokenNameEQUAL	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
splitChannel	TokenNameIdentifier	 split Channel
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
c0Sh4	TokenNameIdentifier	 c0 Sh4
=	TokenNameEQUAL	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
c0	TokenNameIdentifier	 c0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
c1Sh4	TokenNameIdentifier	 c1 Sh4
=	TokenNameEQUAL	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// after split, each half should have half of the cube's points 	TokenNameCOMMENT_LINE	after split, each half should have half of the cube's points 
int	TokenNameint	
half	TokenNameIdentifier	 half
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Each entry is the number of pixels that have that value 	TokenNameCOMMENT_LINE	Each entry is the number of pixels that have that value 
// in the split channel within the cube (so pixels 	TokenNameCOMMENT_LINE	in the split channel within the cube (so pixels 
// that have that value in the split channel aren't counted 	TokenNameCOMMENT_LINE	that have that value in the split channel aren't counted 
// if they are outside the cube in the other color channels. 	TokenNameCOMMENT_LINE	if they are outside the cube in the other color channels. 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
counts	TokenNameIdentifier	 counts
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
tcount	TokenNameIdentifier	 tcount
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
minR	TokenNameIdentifier	 min R
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
minG	TokenNameIdentifier	 min G
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
minB	TokenNameIdentifier	 min B
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxR	TokenNameIdentifier	 max R
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
maxG	TokenNameIdentifier	 max G
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
maxB	TokenNameIdentifier	 max B
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minIdx	TokenNameIdentifier	 min Idx
=	TokenNameEQUAL	
{	TokenNameLBRACE	
minR	TokenNameIdentifier	 min R
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
minG	TokenNameIdentifier	 min G
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
minB	TokenNameIdentifier	 min B
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
maxIdx	TokenNameIdentifier	 max Idx
=	TokenNameEQUAL	
{	TokenNameLBRACE	
maxR	TokenNameIdentifier	 max R
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
maxG	TokenNameIdentifier	 max G
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
maxB	TokenNameIdentifier	 max B
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vals	TokenNameIdentifier	 vals
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
minIdx	TokenNameIdentifier	 min Idx
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
maxIdx	TokenNameIdentifier	 max Idx
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx1	TokenNameIdentifier	 idx1
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
splitSh4	TokenNameIdentifier	 split Sh4
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
minIdx	TokenNameIdentifier	 min Idx
[	TokenNameLBRACKET	
c0	TokenNameIdentifier	 c0
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
maxIdx	TokenNameIdentifier	 max Idx
[	TokenNameLBRACKET	
c0	TokenNameIdentifier	 c0
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx2	TokenNameIdentifier	 idx2
=	TokenNameEQUAL	
idx1	TokenNameIdentifier	 idx1
|	TokenNameOR	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<<	TokenNameLEFT_SHIFT	
c0Sh4	TokenNameIdentifier	 c0 Sh4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
minIdx	TokenNameIdentifier	 min Idx
[	TokenNameLBRACKET	
c1	TokenNameIdentifier	 c1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<=	TokenNameLESS_EQUAL	
maxIdx	TokenNameIdentifier	 max Idx
[	TokenNameLBRACKET	
c1	TokenNameIdentifier	 c1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
idx2	TokenNameIdentifier	 idx2
|	TokenNameOR	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<<	TokenNameLEFT_SHIFT	
c1Sh4	TokenNameIdentifier	 c1 Sh4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Counter	TokenNameIdentifier	 Counter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
colors	TokenNameIdentifier	 colors
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iColor	TokenNameIdentifier	 i Color
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iColor	TokenNameIdentifier	 i Color
<	TokenNameLESS	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
iColor	TokenNameIdentifier	 i Color
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Counter	TokenNameIdentifier	 Counter
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
iColor	TokenNameIdentifier	 i Color
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
vals	TokenNameIdentifier	 vals
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getRgb	TokenNameIdentifier	 get Rgb
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The vals[] lies completly within 	TokenNameCOMMENT_LINE	The vals[] lies completly within 
// this cube so count it. 	TokenNameCOMMENT_LINE	this cube so count it. 
counts	TokenNameIdentifier	 counts
[	TokenNameLBRACKET	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
splitChannel	TokenNameIdentifier	 split Channel
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
tcount	TokenNameIdentifier	 tcount
+=	TokenNamePLUS_EQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// the next statement-line stops the loop after we 	TokenNameCOMMENT_LINE	the next statement-line stops the loop after we 
// found the split-point. however, we continue to 	TokenNameCOMMENT_LINE	found the split-point. however, we continue to 
// fill the counts[] because that is needed for 	TokenNameCOMMENT_LINE	fill the counts[] because that is needed for 
// normalization 	TokenNameCOMMENT_LINE	normalization 
// // We've found the half way point. Note that the 	TokenNameCOMMENT_LINE	// We've found the half way point. Note that the 
// // rest of counts is not filled out. 	TokenNameCOMMENT_LINE	// rest of counts is not filled out. 
// if (( tcount > 0 ) && (tcount >= half)) break; // fix 35683 	TokenNameCOMMENT_LINE	if (( tcount > 0 ) && (tcount >= half)) break; // fix 35683 
}	TokenNameRBRACE	
// the result so far is the filled counts[] 	TokenNameCOMMENT_LINE	the result so far is the filled counts[] 
return	TokenNamereturn	
counts	TokenNameIdentifier	 counts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * convert the cube-content to String-representation for logging. * @return the min/max-boundarys of the rgb-channels and * pixel-count of this Cube. */	TokenNameCOMMENT_JAVADOC	 convert the cube-content to String-representation for logging. @return the min/max-boundarys of the rgb-channels and pixel-count of this Cube. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Cube: ["	TokenNameStringLiteral	Cube: [
+	TokenNamePLUS	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
RED	TokenNameIdentifier	 RED
]	TokenNameRBRACKET	
+	TokenNamePLUS	
'-'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
RED	TokenNameIdentifier	 RED
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] ["	TokenNameStringLiteral	] [
+	TokenNamePLUS	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
GRN	TokenNameIdentifier	 GRN
]	TokenNameRBRACKET	
+	TokenNamePLUS	
'-'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
GRN	TokenNameIdentifier	 GRN
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] ["	TokenNameStringLiteral	] [
+	TokenNamePLUS	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
BLU	TokenNameIdentifier	 BLU
]	TokenNameRBRACKET	
+	TokenNamePLUS	
'-'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
BLU	TokenNameIdentifier	 BLU
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] n:"	TokenNameStringLiteral	] n:
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the average color for this cube (no alpha). */	TokenNameCOMMENT_JAVADOC	 Returns the average color for this cube (no alpha). 
public	TokenNamepublic	
int	TokenNameint	
averageColor	TokenNameIdentifier	 average Color
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// cube is empty: return black 	TokenNameCOMMENT_LINE	cube is empty: return black 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rgb	TokenNameIdentifier	 rgb
=	TokenNameEQUAL	
averageColorRGB	TokenNameIdentifier	 average Color RGB
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
RED	TokenNameIdentifier	 RED
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x00FF0000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
GRN	TokenNameIdentifier	 GRN
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0000FF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
BLU	TokenNameIdentifier	 BLU
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&	TokenNameAND	
0x000000FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the average color for this cube */	TokenNameCOMMENT_JAVADOC	 Returns the average color for this cube 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
averageColorRGB	TokenNameIdentifier	 average Color RGB
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rgb	TokenNameIdentifier	 rgb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
RGB_BLACK	TokenNameIdentifier	 RGB  BLACK
;	TokenNameSEMICOLON	
float	TokenNamefloat	
red	TokenNameIdentifier	 red
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
grn	TokenNameIdentifier	 grn
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
blu	TokenNameIdentifier	 blu
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// the boundarys of this cube 	TokenNameCOMMENT_LINE	the boundarys of this cube 
int	TokenNameint	
minR	TokenNameIdentifier	 min R
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
minG	TokenNameIdentifier	 min G
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
minB	TokenNameIdentifier	 min B
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxR	TokenNameIdentifier	 max R
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
maxG	TokenNameIdentifier	 max G
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
maxB	TokenNameIdentifier	 max B
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minIdx	TokenNameIdentifier	 min Idx
=	TokenNameEQUAL	
{	TokenNameLBRACE	
minR	TokenNameIdentifier	 min R
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
minG	TokenNameIdentifier	 min G
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
minB	TokenNameIdentifier	 min B
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
maxIdx	TokenNameIdentifier	 max Idx
=	TokenNameEQUAL	
{	TokenNameLBRACE	
maxR	TokenNameIdentifier	 max R
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
maxG	TokenNameIdentifier	 max G
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
maxB	TokenNameIdentifier	 max B
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vals	TokenNameIdentifier	 vals
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
minIdx	TokenNameIdentifier	 min Idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
maxIdx	TokenNameIdentifier	 max Idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx1	TokenNameIdentifier	 idx1
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
minIdx	TokenNameIdentifier	 min Idx
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
maxIdx	TokenNameIdentifier	 max Idx
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx2	TokenNameIdentifier	 idx2
=	TokenNameEQUAL	
idx1	TokenNameIdentifier	 idx1
|	TokenNameOR	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
minIdx	TokenNameIdentifier	 min Idx
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<=	TokenNameLESS_EQUAL	
maxIdx	TokenNameIdentifier	 max Idx
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
idx2	TokenNameIdentifier	 idx2
|	TokenNameOR	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
Counter	TokenNameIdentifier	 Counter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
colors	TokenNameIdentifier	 colors
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iColor	TokenNameIdentifier	 i Color
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iColor	TokenNameIdentifier	 i Color
<	TokenNameLESS	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
iColor	TokenNameIdentifier	 i Color
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Counter	TokenNameIdentifier	 Counter
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
iColor	TokenNameIdentifier	 i Color
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
vals	TokenNameIdentifier	 vals
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getRgb	TokenNameIdentifier	 get Rgb
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
count	TokenNameIdentifier	 count
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
red	TokenNameIdentifier	 red
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
grn	TokenNameIdentifier	 grn
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blu	TokenNameIdentifier	 blu
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
:	TokenNameCOLON	
rgb	TokenNameIdentifier	 rgb
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
RED	TokenNameIdentifier	 RED
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
red	TokenNameIdentifier	 red
+	TokenNamePLUS	
0.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
GRN	TokenNameIdentifier	 GRN
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
grn	TokenNameIdentifier	 grn
+	TokenNamePLUS	
0.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
BLU	TokenNameIdentifier	 BLU
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
blu	TokenNameIdentifier	 blu
+	TokenNamePLUS	
0.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * create an array of rgb-colors from the cubes-array. * The color of each cube is computed as the sum of all colors in the cube, * where each pixel is weighted according to it's count. * * @param nCubes number of entries to use in cubes * @param cubes contains the Cubes resulting from running the split-algorithm. * @return a byte[][] which is arranged as [ r|g|b ][ 0..nCubes-1 ] */	TokenNameCOMMENT_JAVADOC	 create an array of rgb-colors from the cubes-array. The color of each cube is computed as the sum of all colors in the cube, where each pixel is weighted according to it's count. * @param nCubes number of entries to use in cubes @param cubes contains the Cubes resulting from running the split-algorithm. @return a byte[][] which is arranged as [ r|g|b ][ 0..nCubes-1 ] 
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
computeRGB	TokenNameIdentifier	 compute RGB
(	TokenNameLPAREN	
int	TokenNameint	
nCubes	TokenNameIdentifier	 n Cubes
,	TokenNameCOMMA	
Cube	TokenNameIdentifier	 Cube
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cubes	TokenNameIdentifier	 cubes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
nCubes	TokenNameIdentifier	 n Cubes
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
nCubes	TokenNameIdentifier	 n Cubes
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
nCubes	TokenNameIdentifier	 n Cubes
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rgb	TokenNameIdentifier	 rgb
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
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
nCubes	TokenNameIdentifier	 n Cubes
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rgb	TokenNameIdentifier	 rgb
=	TokenNameEQUAL	
cubes	TokenNameIdentifier	 cubes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
averageColorRGB	TokenNameIdentifier	 average Color RGB
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
Cube	TokenNameIdentifier	 Cube
.	TokenNameDOT	
RED	TokenNameIdentifier	 RED
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
Cube	TokenNameIdentifier	 Cube
.	TokenNameDOT	
GRN	TokenNameIdentifier	 GRN
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
rgb	TokenNameIdentifier	 rgb
[	TokenNameLBRACKET	
Cube	TokenNameIdentifier	 Cube
.	TokenNameDOT	
BLU	TokenNameIdentifier	 BLU
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
Cube	TokenNameIdentifier	 Cube
.	TokenNameDOT	
RED	TokenNameIdentifier	 RED
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
Cube	TokenNameIdentifier	 Cube
.	TokenNameDOT	
GRN	TokenNameIdentifier	 GRN
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
Cube	TokenNameIdentifier	 Cube
.	TokenNameDOT	
BLU	TokenNameIdentifier	 BLU
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
// logRGB( r, g, b ); 	TokenNameCOMMENT_LINE	logRGB( r, g, b ); 
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * helper-method to print the complete rgb-arrays. * @param r * @param g * @param b */	TokenNameCOMMENT_JAVADOC	 helper-method to print the complete rgb-arrays. @param r @param g @param b 
static	TokenNamestatic	
void	TokenNamevoid	
logRGB	TokenNameIdentifier	 log RGB
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buff	TokenNameIdentifier	 buff
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nColors	TokenNameIdentifier	 n Colors
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
nColors	TokenNameIdentifier	 n Colors
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
rgbStr	TokenNameIdentifier	 rgb Str
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
','	TokenNameCharacterLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
','	TokenNameCharacterLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"),"	TokenNameStringLiteral	),
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
rgbStr	TokenNameIdentifier	 rgb Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"RGB:"	TokenNameStringLiteral	RGB:
+	TokenNamePLUS	
nColors	TokenNameIdentifier	 n Colors
+	TokenNamePLUS	
buff	TokenNameIdentifier	 buff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * step 1: fill a data-structure with the count of each color in the image. * @param bi input-image * @return a List[] where each slot is a List of Counters (or null) */	TokenNameCOMMENT_JAVADOC	 step 1: fill a data-structure with the count of each color in the image. @param bi input-image @return a List[] where each slot is a List of Counters (or null) 
static	TokenNamestatic	
List	TokenNameIdentifier	 List
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
createColorList	TokenNameIdentifier	 create Color List
(	TokenNameLPAREN	
BufferedImage	TokenNameIdentifier	 Buffered Image
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Using 4 bits from RG & B. 	TokenNameCOMMENT_LINE	Using 4 bits from RG & B. 
List	TokenNameIdentifier	 List
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colors	TokenNameIdentifier	 colors
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
12	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i_w	TokenNameIdentifier	 i w
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i_w	TokenNameIdentifier	 i w
<	TokenNameLESS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
i_w	TokenNameIdentifier	 i w
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i_h	TokenNameIdentifier	 i h
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i_h	TokenNameIdentifier	 i h
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i_h	TokenNameIdentifier	 i h
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
rgb	TokenNameIdentifier	 rgb
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getRGB	TokenNameIdentifier	 get RGB
(	TokenNameLPAREN	
i_w	TokenNameIdentifier	 i w
,	TokenNameCOMMA	
i_h	TokenNameIdentifier	 i h
)	TokenNameRPAREN	
&	TokenNameAND	
0x00FFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// mask away alpha 	TokenNameCOMMENT_LINE	mask away alpha 
// Get index from high four bits of each component. 	TokenNameCOMMENT_LINE	Get index from high four bits of each component. 
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
&	TokenNameAND	
0xF00000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
&	TokenNameAND	
0x00F000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
&	TokenNameAND	
0x0000F0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the 'hash vector' for that key. 	TokenNameCOMMENT_LINE	Get the 'hash vector' for that key. 
List	TokenNameIdentifier	 List
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
colors	TokenNameIdentifier	 colors
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No colors in this bin yet so create list and 	TokenNameCOMMENT_LINE	No colors in this bin yet so create list and 
// add color. 	TokenNameCOMMENT_LINE	add color. 
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Counter	TokenNameIdentifier	 Counter
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colors	TokenNameIdentifier	 colors
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// find our color in the bin or create a counter for it. 	TokenNameCOMMENT_LINE	find our color in the bin or create a counter for it. 
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// try adding our color to each counter... 	TokenNameCOMMENT_LINE	try adding our color to each counter... 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Counter	TokenNameIdentifier	 Counter
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Counter	TokenNameIdentifier	 Counter
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
colors	TokenNameIdentifier	 colors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * step 2: convert the result of step 1 to an Cube[][] which is * more efficient in the following iterations. All slots in the * result are filled with at least an empty array - thus we avoid * tests for null. <br>Note: the converted slots in colors are no * longer needed and removed. * * @param colors the data-structure to convert. Note that it is * empty after conversion! * @return same data as in colors, but Lists are converted to arrays. */	TokenNameCOMMENT_JAVADOC	 step 2: convert the result of step 1 to an Cube[][] which is more efficient in the following iterations. All slots in the result are filled with at least an empty array - thus we avoid tests for null. <br>Note: the converted slots in colors are no longer needed and removed. * @param colors the data-structure to convert. Note that it is empty after conversion! @return same data as in colors, but Lists are converted to arrays. 
static	TokenNamestatic	
Counter	TokenNameIdentifier	 Counter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
convertColorList	TokenNameIdentifier	 convert Color List
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colors	TokenNameIdentifier	 colors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// used to fill empty slots 	TokenNameCOMMENT_LINE	used to fill empty slots 
final	TokenNamefinal	
Counter	TokenNameIdentifier	 Counter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_COUNTER	TokenNameIdentifier	 EMPTY  COUNTER
=	TokenNameEQUAL	
new	TokenNamenew	
Counter	TokenNameIdentifier	 Counter
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Counter	TokenNameIdentifier	 Counter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colorTbl	TokenNameIdentifier	 color Tbl
=	TokenNameEQUAL	
new	TokenNamenew	
Counter	TokenNameIdentifier	 Counter
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
12	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
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
colors	TokenNameIdentifier	 colors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
colors	TokenNameIdentifier	 colors
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
colorTbl	TokenNameIdentifier	 color Tbl
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
EMPTY_COUNTER	TokenNameIdentifier	 EMPTY  COUNTER
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
nSlots	TokenNameIdentifier	 n Slots
=	TokenNameEQUAL	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorTbl	TokenNameIdentifier	 color Tbl
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Counter	TokenNameIdentifier	 Counter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Counter	TokenNameIdentifier	 Counter
[	TokenNameLBRACKET	
nSlots	TokenNameIdentifier	 n Slots
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the colors[ i ] - data is no longer needed: discard 	TokenNameCOMMENT_LINE	the colors[ i ] - data is no longer needed: discard 
colors	TokenNameIdentifier	 colors
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
colorTbl	TokenNameIdentifier	 color Tbl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts the input image (must be TYPE_INT_RGB or * TYPE_INT_ARGB) to an indexed image. Generating an adaptive * palette with number of colors specified. * @param bi the image to be processed. * @param nColors number of colors in the palette */	TokenNameCOMMENT_JAVADOC	 Converts the input image (must be TYPE_INT_RGB or TYPE_INT_ARGB) to an indexed image. Generating an adaptive palette with number of colors specified. @param bi the image to be processed. @param nColors number of colors in the palette 
public	TokenNamepublic	
static	TokenNamestatic	
BufferedImage	TokenNameIdentifier	 Buffered Image
getIndexedImage	TokenNameIdentifier	 get Indexed Image
(	TokenNameLPAREN	
BufferedImage	TokenNameIdentifier	 Buffered Image
bi	TokenNameIdentifier	 bi
,	TokenNameCOMMA	
int	TokenNameint	
nColors	TokenNameIdentifier	 n Colors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Using 4 bits from RG & B. 	TokenNameCOMMENT_LINE	Using 4 bits from RG & B. 
List	TokenNameIdentifier	 List
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colors	TokenNameIdentifier	 colors
=	TokenNameEQUAL	
createColorList	TokenNameIdentifier	 create Color List
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now we have initialized the colors[] with lists of Counters. 	TokenNameCOMMENT_LINE	now we have initialized the colors[] with lists of Counters. 
// from now on, this data-structure is just read, not modified. 	TokenNameCOMMENT_LINE	from now on, this data-structure is just read, not modified. 
// convert it to Counter[][] for faster iteration 	TokenNameCOMMENT_LINE	convert it to Counter[][] for faster iteration 
Counter	TokenNameIdentifier	 Counter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colorTbl	TokenNameIdentifier	 color Tbl
=	TokenNameEQUAL	
convertColorList	TokenNameIdentifier	 convert Color List
(	TokenNameLPAREN	
colors	TokenNameIdentifier	 colors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this is no longer needed: discard 	TokenNameCOMMENT_LINE	this is no longer needed: discard 
colors	TokenNameIdentifier	 colors
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
nCubes	TokenNameIdentifier	 n Cubes
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
fCube	TokenNameIdentifier	 f Cube
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Cube	TokenNameIdentifier	 Cube
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cubes	TokenNameIdentifier	 cubes
=	TokenNameEQUAL	
new	TokenNamenew	
Cube	TokenNameIdentifier	 Cube
[	TokenNameLBRACKET	
nColors	TokenNameIdentifier	 n Colors
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cubes	TokenNameIdentifier	 cubes
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Cube	TokenNameIdentifier	 Cube
(	TokenNameLPAREN	
colorTbl	TokenNameIdentifier	 color Tbl
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nCubes	TokenNameIdentifier	 n Cubes
<	TokenNameLESS	
nColors	TokenNameIdentifier	 n Colors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
cubes	TokenNameIdentifier	 cubes
[	TokenNameLBRACKET	
fCube	TokenNameIdentifier	 f Cube
]	TokenNameRBRACKET	
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCube	TokenNameIdentifier	 f Cube
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCube	TokenNameIdentifier	 f Cube
==	TokenNameEQUAL_EQUAL	
nCubes	TokenNameIdentifier	 n Cubes
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCube	TokenNameIdentifier	 f Cube
==	TokenNameEQUAL_EQUAL	
nCubes	TokenNameIdentifier	 n Cubes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("fCube == nCubes" + fCube ); 	TokenNameCOMMENT_LINE	System.out.println("fCube == nCubes" + fCube ); 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Cube	TokenNameIdentifier	 Cube
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
cubes	TokenNameIdentifier	 cubes
[	TokenNameLBRACKET	
fCube	TokenNameIdentifier	 f Cube
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Cube	TokenNameIdentifier	 Cube
nc	TokenNameIdentifier	 nc
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nc	TokenNameIdentifier	 nc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// store the cube with less points towards the end of 	TokenNameCOMMENT_LINE	store the cube with less points towards the end of 
// the array, so that fat cubes get more splits 	TokenNameCOMMENT_LINE	the array, so that fat cubes get more splits 
if	TokenNameif	
(	TokenNameLPAREN	
nc	TokenNameIdentifier	 nc
.	TokenNameDOT	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// new cube has more points: swap 	TokenNameCOMMENT_LINE	new cube has more points: swap 
Cube	TokenNameIdentifier	 Cube
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
nc	TokenNameIdentifier	 nc
;	TokenNameSEMICOLON	
nc	TokenNameIdentifier	 nc
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
fCube	TokenNameIdentifier	 f Cube
;	TokenNameSEMICOLON	
int	TokenNameint	
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fCube	TokenNameIdentifier	 f Cube
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nCubes	TokenNameIdentifier	 n Cubes
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cubes	TokenNameIdentifier	 cubes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
cnt	TokenNameIdentifier	 cnt
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
cubes	TokenNameIdentifier	 cubes
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cubes	TokenNameIdentifier	 cubes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cubes	TokenNameIdentifier	 cubes
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
nc	TokenNameIdentifier	 nc
.	TokenNameDOT	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nCubes	TokenNameIdentifier	 n Cubes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cubes	TokenNameIdentifier	 cubes
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
cnt	TokenNameIdentifier	 cnt
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
nCubes	TokenNameIdentifier	 n Cubes
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
cubes	TokenNameIdentifier	 cubes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cubes	TokenNameIdentifier	 cubes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cubes	TokenNameIdentifier	 cubes
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
nc	TokenNameIdentifier	 nc
;	TokenNameSEMICOLON	
nCubes	TokenNameIdentifier	 n Cubes
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// convert the remaining cubes to the colors they represent 	TokenNameCOMMENT_LINE	convert the remaining cubes to the colors they represent 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rgbTbl	TokenNameIdentifier	 rgb Tbl
=	TokenNameEQUAL	
computeRGB	TokenNameIdentifier	 compute RGB
(	TokenNameLPAREN	
nCubes	TokenNameIdentifier	 n Cubes
,	TokenNameCOMMA	
cubes	TokenNameIdentifier	 cubes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The JDK doesn't seem to dither the image correctly if I go 	TokenNameCOMMENT_LINE	The JDK doesn't seem to dither the image correctly if I go 
// below 8bits per pixel. So I dither to an 8bit palette 	TokenNameCOMMENT_LINE	below 8bits per pixel. So I dither to an 8bit palette 
// image that only has nCubes colors. Then I copy the data to 	TokenNameCOMMENT_LINE	image that only has nCubes colors. Then I copy the data to 
// a lower bit depth image that I return. 	TokenNameCOMMENT_LINE	a lower bit depth image that I return. 
IndexColorModel	TokenNameIdentifier	 Index Color Model
icm	TokenNameIdentifier	 icm
=	TokenNameEQUAL	
new	TokenNamenew	
IndexColorModel	TokenNameIdentifier	 Index Color Model
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nCubes	TokenNameIdentifier	 n Cubes
,	TokenNameCOMMA	
rgbTbl	TokenNameIdentifier	 rgb Tbl
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rgbTbl	TokenNameIdentifier	 rgb Tbl
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rgbTbl	TokenNameIdentifier	 rgb Tbl
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedImage	TokenNameIdentifier	 Buffered Image
indexed	TokenNameIdentifier	 indexed
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
BufferedImage	TokenNameIdentifier	 Buffered Image
.	TokenNameDOT	
TYPE_BYTE_INDEXED	TokenNameIdentifier	 TYPE  BYTE  INDEXED
,	TokenNameCOMMA	
icm	TokenNameIdentifier	 icm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
=	TokenNameEQUAL	
indexed	TokenNameIdentifier	 indexed
.	TokenNameDOT	
createGraphics	TokenNameIdentifier	 create Graphics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setRenderingHint	TokenNameIdentifier	 set Rendering Hint
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_DITHERING	TokenNameIdentifier	 KEY  DITHERING
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_DITHER_ENABLE	TokenNameIdentifier	 VALUE  DITHER  ENABLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
drawImage	TokenNameIdentifier	 draw Image
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
<=	TokenNameLESS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
nCubes	TokenNameIdentifier	 n Cubes
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println("Bits: " + bits + " Cubes: " + nCubes); 	TokenNameCOMMENT_LINE	System.out.println("Bits: " + bits + " Cubes: " + nCubes); 
if	TokenNameif	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
>	TokenNameGREATER	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 8 bit image we are done... 	TokenNameCOMMENT_LINE	8 bit image we are done... 
return	TokenNamereturn	
indexed	TokenNameIdentifier	 indexed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Create our low bit depth image... 	TokenNameCOMMENT_LINE	Create our low bit depth image... 
if	TokenNameif	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
new	TokenNamenew	
IndexColorModel	TokenNameIdentifier	 Index Color Model
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
nCubes	TokenNameIdentifier	 n Cubes
,	TokenNameCOMMA	
rgbTbl	TokenNameIdentifier	 rgb Tbl
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rgbTbl	TokenNameIdentifier	 rgb Tbl
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rgbTbl	TokenNameIdentifier	 rgb Tbl
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
;	TokenNameSEMICOLON	
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
new	TokenNamenew	
MultiPixelPackedSampleModel	TokenNameIdentifier	 Multi Pixel Packed Sample Model
(	TokenNameLPAREN	
DataBuffer	TokenNameIdentifier	 Data Buffer
.	TokenNameDOT	
TYPE_BYTE	TokenNameIdentifier	 TYPE  BYTE
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WritableRaster	TokenNameIdentifier	 Writable Raster
ras	TokenNameIdentifier	 ras
=	TokenNameEQUAL	
Raster	TokenNameIdentifier	 Raster
.	TokenNameDOT	
createWritableRaster	TokenNameIdentifier	 create Writable Raster
(	TokenNameLPAREN	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Copy the data to the low bitdepth image. 	TokenNameCOMMENT_LINE	Copy the data to the low bitdepth image. 
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
indexed	TokenNameIdentifier	 indexed
;	TokenNameSEMICOLON	
indexed	TokenNameIdentifier	 indexed
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
ras	TokenNameIdentifier	 ras
,	TokenNameCOMMA	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
,	TokenNameCOMMA	
indexed	TokenNameIdentifier	 indexed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
indexed	TokenNameIdentifier	 indexed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
