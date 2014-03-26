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
/** * This class is responsible for breaking up a block of tiles into * a set of smaller requests that are as large as possible without * rerequesting significant numbers of tiles that are already * available. * * @version $Id: TileBlock.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class is responsible for breaking up a block of tiles into a set of smaller requests that are as large as possible without rerequesting significant numbers of tiles that are already available. * @version $Id: TileBlock.java 489226 2006-12-21 00:05:36Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TileBlock	TokenNameIdentifier	 Tile Block
{	TokenNameLBRACE	
int	TokenNameint	
occX	TokenNameIdentifier	 occ X
,	TokenNameCOMMA	
occY	TokenNameIdentifier	 occ Y
,	TokenNameCOMMA	
occW	TokenNameIdentifier	 occ W
,	TokenNameCOMMA	
occH	TokenNameIdentifier	 occ H
;	TokenNameSEMICOLON	
int	TokenNameint	
xOff	TokenNameIdentifier	 x Off
,	TokenNameCOMMA	
yOff	TokenNameIdentifier	 y Off
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
benefit	TokenNameIdentifier	 benefit
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
occupied	TokenNameIdentifier	 occupied
;	TokenNameSEMICOLON	
/** * Construct a tile block this represents a block of contigous * tiles. * @param xOff The x index of left edge of the tile block. * @param yOff The y index of top edge of the tile block. * @param w The number of tiles across in the block * @param h The number of tiles down the block * @param occupied Which entries in the block are already * computed. */	TokenNameCOMMENT_JAVADOC	 Construct a tile block this represents a block of contigous tiles. @param xOff The x index of left edge of the tile block. @param yOff The y index of top edge of the tile block. @param w The number of tiles across in the block @param h The number of tiles down the block @param occupied Which entries in the block are already computed. 
TileBlock	TokenNameIdentifier	 Tile Block
(	TokenNameLPAREN	
int	TokenNameint	
occX	TokenNameIdentifier	 occ X
,	TokenNameCOMMA	
int	TokenNameint	
occY	TokenNameIdentifier	 occ Y
,	TokenNameCOMMA	
int	TokenNameint	
occW	TokenNameIdentifier	 occ W
,	TokenNameCOMMA	
int	TokenNameint	
occH	TokenNameIdentifier	 occ H
,	TokenNameCOMMA	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
occupied	TokenNameIdentifier	 occupied
,	TokenNameCOMMA	
int	TokenNameint	
xOff	TokenNameIdentifier	 x Off
,	TokenNameCOMMA	
int	TokenNameint	
yOff	TokenNameIdentifier	 y Off
,	TokenNameCOMMA	
int	TokenNameint	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
int	TokenNameint	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
occX	TokenNameIdentifier	 occ X
=	TokenNameEQUAL	
occX	TokenNameIdentifier	 occ X
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
occY	TokenNameIdentifier	 occ Y
=	TokenNameEQUAL	
occY	TokenNameIdentifier	 occ Y
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
occW	TokenNameIdentifier	 occ W
=	TokenNameEQUAL	
occW	TokenNameIdentifier	 occ W
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
occH	TokenNameIdentifier	 occ H
=	TokenNameEQUAL	
occH	TokenNameIdentifier	 occ H
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
xOff	TokenNameIdentifier	 x Off
=	TokenNameEQUAL	
xOff	TokenNameIdentifier	 x Off
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
yOff	TokenNameIdentifier	 y Off
=	TokenNameEQUAL	
yOff	TokenNameIdentifier	 y Off
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
occupied	TokenNameIdentifier	 occupied
=	TokenNameEQUAL	
occupied	TokenNameIdentifier	 occupied
;	TokenNameSEMICOLON	
// System.out.println("Block: [" + 	TokenNameCOMMENT_LINE	System.out.println("Block: [" + 
// xloc + "," + yloc + "," + 	TokenNameCOMMENT_LINE	xloc + "," + yloc + "," + 
// w + "," + h + "]"); 	TokenNameCOMMENT_LINE	w + "," + h + "]"); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
occupied	TokenNameIdentifier	 occupied
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
xOff	TokenNameIdentifier	 x Off
+	TokenNamePLUS	
occW	TokenNameIdentifier	 occ W
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
benefit	TokenNameIdentifier	 benefit
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Really nice to string that outlines what tiles are filled * and what region this block covers. Really useful for * debugging the TileBlock stuff. */	TokenNameCOMMENT_JAVADOC	 Really nice to string that outlines what tiles are filled and what region this block covers. Really useful for debugging the TileBlock stuff. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
occH	TokenNameIdentifier	 occ H
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
occW	TokenNameIdentifier	 occ W
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
==	TokenNameEQUAL_EQUAL	
xOff	TokenNameIdentifier	 x Off
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
==	TokenNameEQUAL_EQUAL	
xOff	TokenNameIdentifier	 x Off
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
==	TokenNameEQUAL_EQUAL	
yOff	TokenNameIdentifier	 y Off
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
==	TokenNameEQUAL_EQUAL	
yOff	TokenNameIdentifier	 y Off
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
"+"	TokenNameStringLiteral	+
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
>	TokenNameGREATER	
yOff	TokenNameIdentifier	 y Off
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
yOff	TokenNameIdentifier	 y Off
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
"|"	TokenNameStringLiteral	|
;	TokenNameSEMICOLON	
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
==	TokenNameEQUAL_EQUAL	
yOff	TokenNameIdentifier	 y Off
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>	TokenNameGREATER	
xOff	TokenNameIdentifier	 x Off
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
xOff	TokenNameIdentifier	 x Off
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
"-"	TokenNameStringLiteral	-
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
==	TokenNameEQUAL_EQUAL	
yOff	TokenNameIdentifier	 y Off
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>	TokenNameGREATER	
xOff	TokenNameIdentifier	 x Off
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
xOff	TokenNameIdentifier	 x Off
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
"_"	TokenNameStringLiteral	_
;	TokenNameSEMICOLON	
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
==	TokenNameEQUAL_EQUAL	
occW	TokenNameIdentifier	 occ W
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
occupied	TokenNameIdentifier	 occupied
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
occW	TokenNameIdentifier	 occ W
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
"*"	TokenNameStringLiteral	*
;	TokenNameSEMICOLON	
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the x location of this block of tiles */	TokenNameCOMMENT_JAVADOC	 Return the x location of this block of tiles 
int	TokenNameint	
getXLoc	TokenNameIdentifier	 get X Loc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
occX	TokenNameIdentifier	 occ X
+	TokenNamePLUS	
xOff	TokenNameIdentifier	 x Off
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the y location of this block of tiles */	TokenNameCOMMENT_JAVADOC	 Return the y location of this block of tiles 
int	TokenNameint	
getYLoc	TokenNameIdentifier	 get Y Loc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
occY	TokenNameIdentifier	 occ Y
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the width of this block of tiles */	TokenNameCOMMENT_JAVADOC	 Return the width of this block of tiles 
int	TokenNameint	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the height of this block of tiles */	TokenNameCOMMENT_JAVADOC	 Return the height of this block of tiles 
int	TokenNameint	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the number of new tiles computed. */	TokenNameCOMMENT_JAVADOC	 Return the number of new tiles computed. 
int	TokenNameint	
getBenefit	TokenNameIdentifier	 get Benefit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
benefit	TokenNameIdentifier	 benefit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the approximate amount of work required to compute * those tiles. */	TokenNameCOMMENT_JAVADOC	 Return the approximate amount of work required to compute those tiles. 
int	TokenNameint	
getWork	TokenNameIdentifier	 get Work
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
h	TokenNameIdentifier	 h
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the total amount of work for the array of tile blocks */	TokenNameCOMMENT_JAVADOC	 Returns the total amount of work for the array of tile blocks 
static	TokenNamestatic	
int	TokenNameint	
getWork	TokenNameIdentifier	 get Work
(	TokenNameLPAREN	
TileBlock	TokenNameIdentifier	 Tile Block
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
blocks	TokenNameIdentifier	 blocks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getWork	TokenNameIdentifier	 get Work
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returnes an optimized list of TileBlocks to generate that * tries to minimize the work to benefit ratio, for the set of * blocks defined by this block. */	TokenNameCOMMENT_JAVADOC	 Returnes an optimized list of TileBlocks to generate that tries to minimize the work to benefit ratio, for the set of blocks defined by this block. 
TileBlock	TokenNameIdentifier	 Tile Block
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBestSplit	TokenNameIdentifier	 get Best Split
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
simplify	TokenNameIdentifier	 simplify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Optimal split already... 	TokenNameCOMMENT_LINE	Optimal split already... 
if	TokenNameif	
(	TokenNameLPAREN	
benefit	TokenNameIdentifier	 benefit
==	TokenNameEQUAL_EQUAL	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
TileBlock	TokenNameIdentifier	 Tile Block
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
this	TokenNamethis	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
splitOneGo	TokenNameIdentifier	 split One Go
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TileBlock	TokenNameIdentifier	 Tile Block
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
splitOneGo	TokenNameIdentifier	 split One Go
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
filled	TokenNameIdentifier	 filled
=	TokenNameEQUAL	
(	TokenNameLPAREN	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
occupied	TokenNameIdentifier	 occupied
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
items	TokenNameIdentifier	 items
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
yOff	TokenNameIdentifier	 y Off
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
yOff	TokenNameIdentifier	 y Off
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
xOff	TokenNameIdentifier	 x Off
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
xOff	TokenNameIdentifier	 x Off
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
filled	TokenNameIdentifier	 filled
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
occW	TokenNameIdentifier	 occ W
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We have an unfilled tile slot, so first we 	TokenNameCOMMENT_LINE	We have an unfilled tile slot, so first we 
// figure out how long the slot is in this row. 	TokenNameCOMMENT_LINE	figure out how long the slot is in this row. 
int	TokenNameint	
cw	TokenNameIdentifier	 cw
=	TokenNameEQUAL	
xOff	TokenNameIdentifier	 x Off
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
cx	TokenNameIdentifier	 cx
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
cx	TokenNameIdentifier	 cx
<	TokenNameLESS	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
cw	TokenNameIdentifier	 cw
;	TokenNameSEMICOLON	
cx	TokenNameIdentifier	 cx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
filled	TokenNameIdentifier	 filled
[	TokenNameLBRACKET	
cx	TokenNameIdentifier	 cx
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
occW	TokenNameIdentifier	 occ W
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
cw	TokenNameIdentifier	 cw
=	TokenNameEQUAL	
cx	TokenNameIdentifier	 cx
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
else	TokenNameelse	
filled	TokenNameIdentifier	 filled
[	TokenNameLBRACKET	
cx	TokenNameIdentifier	 cx
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
occW	TokenNameIdentifier	 occ W
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// fill as we go.. 	TokenNameCOMMENT_LINE	fill as we go.. 
// Then we check the next rows until we hit 	TokenNameCOMMENT_LINE	Then we check the next rows until we hit 
// a row that doesn't have this slot all free. 	TokenNameCOMMENT_LINE	a row that doesn't have this slot all free. 
// at which point we stop... 	TokenNameCOMMENT_LINE	at which point we stop... 
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
cy	TokenNameIdentifier	 cy
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
cy	TokenNameIdentifier	 cy
<	TokenNameLESS	
yOff	TokenNameIdentifier	 y Off
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
cy	TokenNameIdentifier	 cy
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
cx	TokenNameIdentifier	 cx
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
cx	TokenNameIdentifier	 cx
<	TokenNameLESS	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
cw	TokenNameIdentifier	 cw
;	TokenNameSEMICOLON	
cx	TokenNameIdentifier	 cx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
filled	TokenNameIdentifier	 filled
[	TokenNameLBRACKET	
cx	TokenNameIdentifier	 cx
+	TokenNamePLUS	
cy	TokenNameIdentifier	 cy
*	TokenNameMULTIPLY	
occW	TokenNameIdentifier	 occ W
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Partial row so bail (we'll get it later..) 	TokenNameCOMMENT_LINE	Partial row so bail (we'll get it later..) 
if	TokenNameif	
(	TokenNameLPAREN	
cx	TokenNameIdentifier	 cx
!=	TokenNameNOT_EQUAL	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
cw	TokenNameIdentifier	 cw
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Fill in the slot since we will use it... 	TokenNameCOMMENT_LINE	Fill in the slot since we will use it... 
for	TokenNamefor	
(	TokenNameLPAREN	
cx	TokenNameIdentifier	 cx
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
cx	TokenNameIdentifier	 cx
<	TokenNameLESS	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
cw	TokenNameIdentifier	 cw
;	TokenNameSEMICOLON	
cx	TokenNameIdentifier	 cx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
filled	TokenNameIdentifier	 filled
[	TokenNameLBRACKET	
cx	TokenNameIdentifier	 cx
+	TokenNamePLUS	
cy	TokenNameIdentifier	 cy
*	TokenNameMULTIPLY	
occW	TokenNameIdentifier	 occ W
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TileBlock	TokenNameIdentifier	 Tile Block
(	TokenNameLPAREN	
occX	TokenNameIdentifier	 occ X
,	TokenNameCOMMA	
occY	TokenNameIdentifier	 occ Y
,	TokenNameCOMMA	
occW	TokenNameIdentifier	 occ W
,	TokenNameCOMMA	
occH	TokenNameIdentifier	 occ H
,	TokenNameCOMMA	
occupied	TokenNameIdentifier	 occupied
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
cw	TokenNameIdentifier	 cw
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
cw	TokenNameIdentifier	 cw
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
TileBlock	TokenNameIdentifier	 Tile Block
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
TileBlock	TokenNameIdentifier	 Tile Block
[	TokenNameLBRACKET	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
simplify	TokenNameIdentifier	 simplify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
workOccupied	TokenNameIdentifier	 work Occupied
=	TokenNameEQUAL	
occupied	TokenNameIdentifier	 occupied
;	TokenNameSEMICOLON	
// local is cheaper 	TokenNameCOMMENT_LINE	local is cheaper 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
workOccupied	TokenNameIdentifier	 work Occupied
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
xOff	TokenNameIdentifier	 x Off
+	TokenNamePLUS	
occW	TokenNameIdentifier	 occ W
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Fully occupied row so remove it. 	TokenNameCOMMENT_LINE	Fully occupied row so remove it. 
yOff	TokenNameIdentifier	 y Off
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return true if we were simplified out of existance. 	TokenNameCOMMENT_LINE	return true if we were simplified out of existance. 
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// If we make it past here we must have at least one good block. 	TokenNameCOMMENT_LINE	If we make it past here we must have at least one good block. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
workOccupied	TokenNameIdentifier	 work Occupied
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
xOff	TokenNameIdentifier	 x Off
+	TokenNamePLUS	
occW	TokenNameIdentifier	 occ W
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Fully occupied row so remove it. 	TokenNameCOMMENT_LINE	Fully occupied row so remove it. 
h	TokenNameIdentifier	 h
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
workOccupied	TokenNameIdentifier	 work Occupied
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
xOff	TokenNameIdentifier	 x Off
+	TokenNamePLUS	
occW	TokenNameIdentifier	 occ W
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
!=	TokenNameNOT_EQUAL	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Fully occupied Col so remove it. 	TokenNameCOMMENT_LINE	Fully occupied Col so remove it. 
xOff	TokenNameIdentifier	 x Off
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
workOccupied	TokenNameIdentifier	 work Occupied
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
xOff	TokenNameIdentifier	 x Off
+	TokenNamePLUS	
occW	TokenNameIdentifier	 occ W
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
!=	TokenNameNOT_EQUAL	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Fully occupied Col so remove it. 	TokenNameCOMMENT_LINE	Fully occupied Col so remove it. 
w	TokenNameIdentifier	 w
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
