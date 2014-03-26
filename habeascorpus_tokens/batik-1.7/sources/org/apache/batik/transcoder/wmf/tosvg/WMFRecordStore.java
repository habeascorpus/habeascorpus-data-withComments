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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
/** * Reads a WMF file, including an Aldus Placable Metafile Header. * * @author <a href="mailto:luano@asd.ie">Luan O'Carroll</a> * @version $Id: WMFRecordStore.java 606882 2007-12-26 11:18:04Z cam $ */	TokenNameCOMMENT_JAVADOC	 Reads a WMF file, including an Aldus Placable Metafile Header. * @author <a href="mailto:luano@asd.ie">Luan O'Carroll</a> @version $Id: WMFRecordStore.java 606882 2007-12-26 11:18:04Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
WMFRecordStore	TokenNameIdentifier	 WMF Record Store
extends	TokenNameextends	
AbstractWMFReader	TokenNameIdentifier	 Abstract WMF Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
numRecords	TokenNameIdentifier	 num Records
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
vpX	TokenNameIdentifier	 vp X
,	TokenNameCOMMA	
vpY	TokenNameIdentifier	 vp Y
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
records	TokenNameIdentifier	 records
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
_bext	TokenNameIdentifier	 bext
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WMFRecordStore	TokenNameIdentifier	 WMF Record Store
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the internal storage and viewport coordinates. */	TokenNameCOMMENT_JAVADOC	 Resets the internal storage and viewport coordinates. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numRecords	TokenNameIdentifier	 num Records
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
vpX	TokenNameIdentifier	 vp X
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
vpY	TokenNameIdentifier	 vp Y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
vpW	TokenNameIdentifier	 vp W
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
vpH	TokenNameIdentifier	 vp H
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
inch	TokenNameIdentifier	 inch
=	TokenNameEQUAL	
84	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads the WMF file from the specified Stream. */	TokenNameCOMMENT_JAVADOC	 Reads the WMF file from the specified Stream. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
readRecords	TokenNameIdentifier	 read Records
(	TokenNameLPAREN	
DataInputStream	TokenNameIdentifier	 Data Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
short	TokenNameshort	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
recSize	TokenNameIdentifier	 rec Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
recData	TokenNameIdentifier	 rec Data
;	TokenNameSEMICOLON	
numRecords	TokenNameIdentifier	 num Records
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
functionId	TokenNameIdentifier	 function Id
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recSize	TokenNameIdentifier	 rec Size
=	TokenNameEQUAL	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Subtract size in 16-bit words of recSize and functionId; 	TokenNameCOMMENT_LINE	Subtract size in 16-bit words of recSize and functionId; 
recSize	TokenNameIdentifier	 rec Size
-=	TokenNameMINUS_EQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
functionId	TokenNameIdentifier	 function Id
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
MetaRecord	TokenNameIdentifier	 Meta Record
mr	TokenNameIdentifier	 mr
=	TokenNameEQUAL	
new	TokenNamenew	
MetaRecord	TokenNameIdentifier	 Meta Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
functionId	TokenNameIdentifier	 function Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_SETMAPMODE	TokenNameIdentifier	 META  SETMAPMODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
int	TokenNameint	
mapmode	TokenNameIdentifier	 mapmode
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mapmode	TokenNameIdentifier	 mapmode
==	TokenNameEQUAL_EQUAL	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
MM_ANISOTROPIC	TokenNameIdentifier	 MM  ANISOTROPIC
)	TokenNameRPAREN	
isotropic	TokenNameIdentifier	 isotropic
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
mapmode	TokenNameIdentifier	 mapmode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_DRAWTEXT	TokenNameIdentifier	 META  DRAWTEXT
:	TokenNameCOLON	
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
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
recData	TokenNameIdentifier	 rec Data
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// todo shouldn't the read data be used for something?? 	TokenNameCOMMENT_LINE	todo shouldn't the read data be used for something?? 
numRecords	TokenNameIdentifier	 num Records
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_EXTTEXTOUT	TokenNameIdentifier	 META  EXTTEXTOUT
:	TokenNameCOLON	
{	TokenNameLBRACE	
int	TokenNameint	
yVal	TokenNameIdentifier	 y Val
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
xVal	TokenNameIdentifier	 x Val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lenText	TokenNameIdentifier	 len Text
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
flag	TokenNameIdentifier	 flag
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// used to track the actual size really read 	TokenNameCOMMENT_LINE	used to track the actual size really read 
boolean	TokenNameboolean	
clipped	TokenNameIdentifier	 clipped
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
x2	TokenNameIdentifier	 x2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
// determination of clipping property 	TokenNameCOMMENT_LINE	determination of clipping property 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
flag	TokenNameIdentifier	 flag
&	TokenNameAND	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
ETO_CLIPPED	TokenNameIdentifier	 ETO  CLIPPED
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
x2	TokenNameIdentifier	 x2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y2	TokenNameIdentifier	 y2
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
read	TokenNameIdentifier	 read
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
clipped	TokenNameIdentifier	 clipped
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bstr	TokenNameIdentifier	 bstr
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
lenText	TokenNameIdentifier	 len Text
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
lenText	TokenNameIdentifier	 len Text
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bstr	TokenNameIdentifier	 bstr
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
read	TokenNameIdentifier	 read
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
lenText	TokenNameIdentifier	 len Text
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* must do this because WMF strings always have an even number of bytes, even * if there is an odd number of characters */	TokenNameCOMMENT_BLOCK	 must do this because WMF strings always have an even number of bytes, even if there is an odd number of characters 
if	TokenNameif	
(	TokenNameLPAREN	
lenText	TokenNameIdentifier	 len Text
%	TokenNameREMAINDER	
2	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if the record was not completely read, finish reading 	TokenNameCOMMENT_LINE	if the record was not completely read, finish reading 
if	TokenNameif	
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
<	TokenNameLESS	
recSize	TokenNameIdentifier	 rec Size
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* get the StringRecord, having decoded the String, using the current * charset (which was given by the last META_CREATEFONTINDIRECT) */	TokenNameCOMMENT_BLOCK	 get the StringRecord, having decoded the String, using the current charset (which was given by the last META_CREATEFONTINDIRECT) 
mr	TokenNameIdentifier	 mr
=	TokenNameEQUAL	
new	TokenNamenew	
MetaRecord	TokenNameIdentifier	 Meta Record
.	TokenNameDOT	
ByteRecord	TokenNameIdentifier	 Byte Record
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
xVal	TokenNameIdentifier	 x Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
yVal	TokenNameIdentifier	 y Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clipped	TokenNameIdentifier	 clipped
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
x2	TokenNameIdentifier	 x2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_TEXTOUT	TokenNameIdentifier	 META  TEXTOUT
:	TokenNameCOLON	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// used to track the actual size really read 	TokenNameCOMMENT_LINE	used to track the actual size really read 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bstr	TokenNameIdentifier	 bstr
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bstr	TokenNameIdentifier	 bstr
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* must do this because WMF strings always have an even number of bytes, even * if there is an odd number of characters */	TokenNameCOMMENT_BLOCK	 must do this because WMF strings always have an even number of bytes, even if there is an odd number of characters 
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
%	TokenNameREMAINDER	
2	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
read	TokenNameIdentifier	 read
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
yVal	TokenNameIdentifier	 y Val
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
xVal	TokenNameIdentifier	 x Val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
read	TokenNameIdentifier	 read
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// if the record was not completely read, finish reading 	TokenNameCOMMENT_LINE	if the record was not completely read, finish reading 
if	TokenNameif	
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
<	TokenNameLESS	
recSize	TokenNameIdentifier	 rec Size
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* get the StringRecord, having decoded the String, using the current * charset (which was givben by the last META_CREATEFONTINDIRECT) */	TokenNameCOMMENT_BLOCK	 get the StringRecord, having decoded the String, using the current charset (which was givben by the last META_CREATEFONTINDIRECT) 
mr	TokenNameIdentifier	 mr
=	TokenNameEQUAL	
new	TokenNamenew	
MetaRecord	TokenNameIdentifier	 Meta Record
.	TokenNameDOT	
ByteRecord	TokenNameIdentifier	 Byte Record
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
xVal	TokenNameIdentifier	 x Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
yVal	TokenNameIdentifier	 y Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CREATEFONTINDIRECT	TokenNameIdentifier	 META  CREATEFONTINDIRECT
:	TokenNameCOLON	
{	TokenNameLBRACE	
int	TokenNameint	
lfHeight	TokenNameIdentifier	 lf Height
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lfWidth	TokenNameIdentifier	 lf Width
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lfEscapement	TokenNameIdentifier	 lf Escapement
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lfOrientation	TokenNameIdentifier	 lf Orientation
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lfWeight	TokenNameIdentifier	 lf Weight
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lfItalic	TokenNameIdentifier	 lf Italic
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lfUnderline	TokenNameIdentifier	 lf Underline
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lfStrikeOut	TokenNameIdentifier	 lf Strike Out
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lfCharSet	TokenNameIdentifier	 lf Char Set
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//System.out.println("lfCharSet: "+(lfCharSet & 0x00ff)); 	TokenNameCOMMENT_LINE	System.out.println("lfCharSet: "+(lfCharSet & 0x00ff)); 
int	TokenNameint	
lfOutPrecision	TokenNameIdentifier	 lf Out Precision
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lfClipPrecision	TokenNameIdentifier	 lf Clip Precision
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lfQuality	TokenNameIdentifier	 lf Quality
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lfPitchAndFamily	TokenNameIdentifier	 lf Pitch And Family
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// don't need to read the end of the record, 	TokenNameCOMMENT_LINE	don't need to read the end of the record, 
// because it will always be completely used 	TokenNameCOMMENT_LINE	because it will always be completely used 
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
recSize	TokenNameIdentifier	 rec Size
-	TokenNameMINUS	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lfFaceName	TokenNameIdentifier	 lf Face Name
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
ch	TokenNameIdentifier	 ch
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
lfFaceName	TokenNameIdentifier	 lf Face Name
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
lfFaceName	TokenNameIdentifier	 lf Face Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// what locale ?? ascii ?? platform ?? 	TokenNameCOMMENT_LINE	what locale ?? ascii ?? platform ?? 
mr	TokenNameIdentifier	 mr
=	TokenNameEQUAL	
new	TokenNamenew	
MetaRecord	TokenNameIdentifier	 Meta Record
.	TokenNameDOT	
StringRecord	TokenNameIdentifier	 String Record
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
lfHeight	TokenNameIdentifier	 lf Height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
lfItalic	TokenNameIdentifier	 lf Italic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
lfWeight	TokenNameIdentifier	 lf Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
lfCharSet	TokenNameIdentifier	 lf Char Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
lfUnderline	TokenNameIdentifier	 lf Underline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
lfStrikeOut	TokenNameIdentifier	 lf Strike Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
lfOrientation	TokenNameIdentifier	 lf Orientation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// escapement is the orientation of the text in tenth of degrees 	TokenNameCOMMENT_LINE	escapement is the orientation of the text in tenth of degrees 
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
lfEscapement	TokenNameIdentifier	 lf Escapement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_SETVIEWPORTORG	TokenNameIdentifier	 META  SETVIEWPORTORG
:	TokenNameCOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_SETVIEWPORTEXT	TokenNameIdentifier	 META  SETVIEWPORTEXT
:	TokenNameCOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_SETWINDOWORG	TokenNameIdentifier	 META  SETWINDOWORG
:	TokenNameCOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_SETWINDOWEXT	TokenNameIdentifier	 META  SETWINDOWEXT
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
int	TokenNameint	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// inverse the values signs if they are negative 	TokenNameCOMMENT_LINE	inverse the values signs if they are negative 
if	TokenNameif	
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
-	TokenNameMINUS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
xSign	TokenNameIdentifier	 x Sign
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
height	TokenNameIdentifier	 height
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
-	TokenNameMINUS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
ySign	TokenNameIdentifier	 y Sign
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_bext	TokenNameIdentifier	 bext
&&	TokenNameAND_AND	
functionId	TokenNameIdentifier	 function Id
==	TokenNameEQUAL_EQUAL	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_SETWINDOWEXT	TokenNameIdentifier	 META  SETWINDOWEXT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vpW	TokenNameIdentifier	 vp W
=	TokenNameEQUAL	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
vpH	TokenNameIdentifier	 vp H
=	TokenNameEQUAL	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isotropic	TokenNameIdentifier	 isotropic
)	TokenNameRPAREN	
scaleXY	TokenNameIdentifier	 scale XY
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vpW	TokenNameIdentifier	 vp W
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vpH	TokenNameIdentifier	 vp H
;	TokenNameSEMICOLON	
vpW	TokenNameIdentifier	 vp W
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
vpW	TokenNameIdentifier	 vp W
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_bext	TokenNameIdentifier	 bext
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// sets the width, height of the image if the file does not have an APM (in this case it is retrieved 	TokenNameCOMMENT_LINE	sets the width, height of the image if the file does not have an APM (in this case it is retrieved 
// from the viewport) 	TokenNameCOMMENT_LINE	from the viewport) 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAldus	TokenNameIdentifier	 is Aldus
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
vpW	TokenNameIdentifier	 vp W
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
vpH	TokenNameIdentifier	 vp H
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_OFFSETVIEWPORTORG	TokenNameIdentifier	 META  OFFSETVIEWPORTORG
:	TokenNameCOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_OFFSETWINDOWORG	TokenNameIdentifier	 META  OFFSETWINDOWORG
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_SCALEVIEWPORTEXT	TokenNameIdentifier	 META  SCALEVIEWPORTEXT
:	TokenNameCOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_SCALEWINDOWEXT	TokenNameIdentifier	 META  SCALEWINDOWEXT
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
int	TokenNameint	
ydenom	TokenNameIdentifier	 ydenom
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ynum	TokenNameIdentifier	 ynum
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
xdenom	TokenNameIdentifier	 xdenom
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
xnum	TokenNameIdentifier	 xnum
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
xdenom	TokenNameIdentifier	 xdenom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
ydenom	TokenNameIdentifier	 ydenom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
xnum	TokenNameIdentifier	 xnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
ynum	TokenNameIdentifier	 ynum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scaleX	TokenNameIdentifier	 scale X
=	TokenNameEQUAL	
scaleX	TokenNameIdentifier	 scale X
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
xdenom	TokenNameIdentifier	 xdenom
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
xnum	TokenNameIdentifier	 xnum
;	TokenNameSEMICOLON	
scaleY	TokenNameIdentifier	 scale Y
=	TokenNameEQUAL	
scaleY	TokenNameIdentifier	 scale Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
ydenom	TokenNameIdentifier	 ydenom
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
ynum	TokenNameIdentifier	 ynum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CREATEBRUSHINDIRECT	TokenNameIdentifier	 META  CREATEBRUSHINDIRECT
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
// The style 	TokenNameCOMMENT_LINE	The style 
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
colorref	TokenNameIdentifier	 colorref
=	TokenNameEQUAL	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
red	TokenNameIdentifier	 red
=	TokenNameEQUAL	
colorref	TokenNameIdentifier	 colorref
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
green	TokenNameIdentifier	 green
=	TokenNameEQUAL	
(	TokenNameLPAREN	
colorref	TokenNameIdentifier	 colorref
&	TokenNameAND	
0xff00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
blue	TokenNameIdentifier	 blue
=	TokenNameEQUAL	
(	TokenNameLPAREN	
colorref	TokenNameIdentifier	 colorref
&	TokenNameAND	
0xff0000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
(	TokenNameLPAREN	
colorref	TokenNameIdentifier	 colorref
&	TokenNameAND	
0x3000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
red	TokenNameIdentifier	 red
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
green	TokenNameIdentifier	 green
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
blue	TokenNameIdentifier	 blue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The hatch style 	TokenNameCOMMENT_LINE	The hatch style 
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CREATEPENINDIRECT	TokenNameIdentifier	 META  CREATEPENINDIRECT
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
// The style 	TokenNameCOMMENT_LINE	The style 
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
colorref	TokenNameIdentifier	 colorref
=	TokenNameEQUAL	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * sometimes records generated by PPT have a * recSize of 6 and not 5 => in this case only we have * to read a last short element **/	TokenNameCOMMENT_JAVADOC	 sometimes records generated by PPT have a recSize of 6 and not 5 => in this case only we have to read a last short element *
//int height = readShort( is ); 	TokenNameCOMMENT_LINE	int height = readShort( is ); 
if	TokenNameif	
(	TokenNameLPAREN	
recSize	TokenNameIdentifier	 rec Size
==	TokenNameEQUAL_EQUAL	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
red	TokenNameIdentifier	 red
=	TokenNameEQUAL	
colorref	TokenNameIdentifier	 colorref
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// format: fff.bbbbbbbb.gggggggg.rrrrrrrr 	TokenNameCOMMENT_LINE	format: fff.bbbbbbbb.gggggggg.rrrrrrrr 
int	TokenNameint	
green	TokenNameIdentifier	 green
=	TokenNameEQUAL	
(	TokenNameLPAREN	
colorref	TokenNameIdentifier	 colorref
&	TokenNameAND	
0xff00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
blue	TokenNameIdentifier	 blue
=	TokenNameEQUAL	
(	TokenNameLPAREN	
colorref	TokenNameIdentifier	 colorref
&	TokenNameAND	
0xff0000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
(	TokenNameLPAREN	
colorref	TokenNameIdentifier	 colorref
&	TokenNameAND	
0x3000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
red	TokenNameIdentifier	 red
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
green	TokenNameIdentifier	 green
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
blue	TokenNameIdentifier	 blue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The pen width 	TokenNameCOMMENT_LINE	The pen width 
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_SETTEXTALIGN	TokenNameIdentifier	 META  SETTEXTALIGN
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
int	TokenNameint	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// need to do this, because sometimes there is more than one short 	TokenNameCOMMENT_LINE	need to do this, because sometimes there is more than one short 
if	TokenNameif	
(	TokenNameLPAREN	
recSize	TokenNameIdentifier	 rec Size
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
align	TokenNameIdentifier	 align
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_SETTEXTCOLOR	TokenNameIdentifier	 META  SETTEXTCOLOR
:	TokenNameCOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_SETBKCOLOR	TokenNameIdentifier	 META  SETBKCOLOR
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
int	TokenNameint	
colorref	TokenNameIdentifier	 colorref
=	TokenNameEQUAL	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
red	TokenNameIdentifier	 red
=	TokenNameEQUAL	
colorref	TokenNameIdentifier	 colorref
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
green	TokenNameIdentifier	 green
=	TokenNameEQUAL	
(	TokenNameLPAREN	
colorref	TokenNameIdentifier	 colorref
&	TokenNameAND	
0xff00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
blue	TokenNameIdentifier	 blue
=	TokenNameEQUAL	
(	TokenNameLPAREN	
colorref	TokenNameIdentifier	 colorref
&	TokenNameAND	
0xff0000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
(	TokenNameLPAREN	
colorref	TokenNameIdentifier	 colorref
&	TokenNameAND	
0x3000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
red	TokenNameIdentifier	 red
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
green	TokenNameIdentifier	 green
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
blue	TokenNameIdentifier	 blue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_LINETO	TokenNameIdentifier	 META  LINETO
:	TokenNameCOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_MOVETO	TokenNameIdentifier	 META  MOVETO
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_SETPOLYFILLMODE	TokenNameIdentifier	 META  SETPOLYFILLMODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// need to do this, because sometimes there is more than one short 	TokenNameCOMMENT_LINE	need to do this, because sometimes there is more than one short 
if	TokenNameif	
(	TokenNameLPAREN	
recSize	TokenNameIdentifier	 rec Size
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_POLYPOLYGON	TokenNameIdentifier	 META  POLYPOLYGON
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// number of polygons 	TokenNameCOMMENT_LINE	number of polygons 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pts	TokenNameIdentifier	 pts
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
ptCount	TokenNameIdentifier	 pt Count
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pts	TokenNameIdentifier	 pts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// number of points for the polygon 	TokenNameCOMMENT_LINE	number of points for the polygon 
ptCount	TokenNameIdentifier	 pt Count
+=	TokenNamePLUS_EQUAL	
pts	TokenNameIdentifier	 pts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
pts	TokenNameIdentifier	 pts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nPoints	TokenNameIdentifier	 n Points
=	TokenNameEQUAL	
pts	TokenNameIdentifier	 pts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nPoints	TokenNameIdentifier	 n Points
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// x position of the polygon 	TokenNameCOMMENT_LINE	x position of the polygon 
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// y position of the polygon 	TokenNameCOMMENT_LINE	y position of the polygon 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_POLYLINE	TokenNameIdentifier	 META  POLYLINE
:	TokenNameCOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_POLYGON	TokenNameIdentifier	 META  POLYGON
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_ELLIPSE	TokenNameIdentifier	 META  ELLIPSE
:	TokenNameCOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_INTERSECTCLIPRECT	TokenNameIdentifier	 META  INTERSECTCLIPRECT
:	TokenNameCOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_RECTANGLE	TokenNameIdentifier	 META  RECTANGLE
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CREATEREGION	TokenNameIdentifier	 META  CREATEREGION
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_ROUNDRECT	TokenNameIdentifier	 META  ROUNDRECT
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
int	TokenNameint	
el_height	TokenNameIdentifier	 el height
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
el_width	TokenNameIdentifier	 el width
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
el_width	TokenNameIdentifier	 el width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
el_height	TokenNameIdentifier	 el height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_ARC	TokenNameIdentifier	 META  ARC
:	TokenNameCOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_PIE	TokenNameIdentifier	 META  PIE
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
int	TokenNameint	
yend	TokenNameIdentifier	 yend
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
xend	TokenNameIdentifier	 xend
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ystart	TokenNameIdentifier	 ystart
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
xstart	TokenNameIdentifier	 xstart
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
xstart	TokenNameIdentifier	 xstart
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
ystart	TokenNameIdentifier	 ystart
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
xend	TokenNameIdentifier	 xend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
yend	TokenNameIdentifier	 yend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// META_PATBLT added 	TokenNameCOMMENT_LINE	META_PATBLT added 
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_PATBLT	TokenNameIdentifier	 META  PATBLT
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
int	TokenNameint	
rop	TokenNameIdentifier	 rop
=	TokenNameEQUAL	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
rop	TokenNameIdentifier	 rop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_SETBKMODE	TokenNameIdentifier	 META  SETBKMODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//if (recSize > 1) readShort( is ); 	TokenNameCOMMENT_LINE	if (recSize > 1) readShort( is ); 
if	TokenNameif	
(	TokenNameLPAREN	
recSize	TokenNameIdentifier	 rec Size
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// UPDATED : META_SETROP2 added 	TokenNameCOMMENT_LINE	UPDATED : META_SETROP2 added 
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_SETROP2	TokenNameIdentifier	 META  SETRO P2
:	TokenNameCOLON	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
// rop should always be a short, but it is sometimes an int... 	TokenNameCOMMENT_LINE	rop should always be a short, but it is sometimes an int... 
int	TokenNameint	
rop	TokenNameIdentifier	 rop
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
recSize	TokenNameIdentifier	 rec Size
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rop	TokenNameIdentifier	 rop
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
rop	TokenNameIdentifier	 rop
=	TokenNameEQUAL	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
rop	TokenNameIdentifier	 rop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// UPDATED : META_DIBSTRETCHBLT added 	TokenNameCOMMENT_LINE	UPDATED : META_DIBSTRETCHBLT added 
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_DIBSTRETCHBLT	TokenNameIdentifier	 META  DIBSTRETCHBLT
:	TokenNameCOLON	
{	TokenNameLBRACE	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
heightSrc	TokenNameIdentifier	 height Src
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
widthSrc	TokenNameIdentifier	 width Src
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
sy	TokenNameIdentifier	 sy
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
sx	TokenNameIdentifier	 sx
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
heightDst	TokenNameIdentifier	 height Dst
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
widthDst	TokenNameIdentifier	 width Dst
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
recSize	TokenNameIdentifier	 rec Size
-	TokenNameMINUS	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bitmap	TokenNameIdentifier	 bitmap
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
bitmap	TokenNameIdentifier	 bitmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
=	TokenNameEQUAL	
new	TokenNamenew	
MetaRecord	TokenNameIdentifier	 Meta Record
.	TokenNameDOT	
ByteRecord	TokenNameIdentifier	 Byte Record
(	TokenNameLPAREN	
bitmap	TokenNameIdentifier	 bitmap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
heightSrc	TokenNameIdentifier	 height Src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
widthSrc	TokenNameIdentifier	 width Src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
heightDst	TokenNameIdentifier	 height Dst
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
widthDst	TokenNameIdentifier	 width Dst
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_STRETCHDIB	TokenNameIdentifier	 META  STRETCHDIB
:	TokenNameCOLON	
{	TokenNameLBRACE	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
usage	TokenNameIdentifier	 usage
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
heightSrc	TokenNameIdentifier	 height Src
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
widthSrc	TokenNameIdentifier	 width Src
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
sy	TokenNameIdentifier	 sy
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
sx	TokenNameIdentifier	 sx
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
heightDst	TokenNameIdentifier	 height Dst
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
widthDst	TokenNameIdentifier	 width Dst
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ySign	TokenNameIdentifier	 y Sign
;	TokenNameSEMICOLON	
int	TokenNameint	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
recSize	TokenNameIdentifier	 rec Size
-	TokenNameMINUS	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
bitmap	TokenNameIdentifier	 bitmap
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
bitmap	TokenNameIdentifier	 bitmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
=	TokenNameEQUAL	
new	TokenNamenew	
MetaRecord	TokenNameIdentifier	 Meta Record
.	TokenNameDOT	
ByteRecord	TokenNameIdentifier	 Byte Record
(	TokenNameLPAREN	
bitmap	TokenNameIdentifier	 bitmap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
heightSrc	TokenNameIdentifier	 height Src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
widthSrc	TokenNameIdentifier	 width Src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
heightDst	TokenNameIdentifier	 height Dst
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
widthDst	TokenNameIdentifier	 width Dst
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// UPDATED : META_DIBBITBLT added 	TokenNameCOMMENT_LINE	UPDATED : META_DIBBITBLT added 
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_DIBBITBLT	TokenNameIdentifier	 META  DIBBITBLT
:	TokenNameCOLON	
{	TokenNameLBRACE	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
sy	TokenNameIdentifier	 sy
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sx	TokenNameIdentifier	 sx
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hdc	TokenNameIdentifier	 hdc
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xSign	TokenNameIdentifier	 x Sign
*	TokenNameMULTIPLY	
scaleXY	TokenNameIdentifier	 scale XY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
recSize	TokenNameIdentifier	 rec Size
-	TokenNameMINUS	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bitmap	TokenNameIdentifier	 bitmap
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
bitmap	TokenNameIdentifier	 bitmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
=	TokenNameEQUAL	
new	TokenNamenew	
MetaRecord	TokenNameIdentifier	 Meta Record
.	TokenNameDOT	
ByteRecord	TokenNameIdentifier	 Byte Record
(	TokenNameLPAREN	
bitmap	TokenNameIdentifier	 bitmap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// what does this mean?? len <= 0 ?? 	TokenNameCOMMENT_LINE	what does this mean?? len <= 0 ?? 
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// UPDATED : META_CREATEPATTERNBRUSH added 	TokenNameCOMMENT_LINE	UPDATED : META_CREATEPATTERNBRUSH added 
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_DIBCREATEPATTERNBRUSH	TokenNameIdentifier	 META  DIBCREATEPATTERNBRUSH
:	TokenNameCOLON	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
recSize	TokenNameIdentifier	 rec Size
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bitmap	TokenNameIdentifier	 bitmap
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
bitmap	TokenNameIdentifier	 bitmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
=	TokenNameEQUAL	
new	TokenNamenew	
MetaRecord	TokenNameIdentifier	 Meta Record
.	TokenNameDOT	
ByteRecord	TokenNameIdentifier	 Byte Record
(	TokenNameLPAREN	
bitmap	TokenNameIdentifier	 bitmap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
recSize	TokenNameIdentifier	 rec Size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
numRecords	TokenNameIdentifier	 num Records
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// sets the characteristics of the image if the file does not have an APM (in this case it is retrieved 	TokenNameCOMMENT_LINE	sets the characteristics of the image if the file does not have an APM (in this case it is retrieved 
// from the viewport). This is only useful if one wants to retrieve informations about the file after 	TokenNameCOMMENT_LINE	from the viewport). This is only useful if one wants to retrieve informations about the file after 
// decoding it. 	TokenNameCOMMENT_LINE	decoding it. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAldus	TokenNameIdentifier	 is Aldus
)	TokenNameRPAREN	
{	TokenNameLBRACE	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
vpX	TokenNameIdentifier	 vp X
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
vpX	TokenNameIdentifier	 vp X
+	TokenNamePLUS	
vpW	TokenNameIdentifier	 vp W
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
vpY	TokenNameIdentifier	 vp Y
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
vpY	TokenNameIdentifier	 vp Y
+	TokenNamePLUS	
vpH	TokenNameIdentifier	 vp H
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setReading	TokenNameIdentifier	 set Reading
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current URL */	TokenNameCOMMENT_JAVADOC	 Returns the current URL 
public	TokenNamepublic	
URL	TokenNameIdentifier	 URL
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the current URL */	TokenNameCOMMENT_JAVADOC	 Sets the current URL 
public	TokenNamepublic	
void	TokenNamevoid	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
newUrl	TokenNameIdentifier	 new Url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
newUrl	TokenNameIdentifier	 new Url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a meta record. */	TokenNameCOMMENT_JAVADOC	 Returns a meta record. 
public	TokenNamepublic	
MetaRecord	TokenNameIdentifier	 Meta Record
getRecord	TokenNameIdentifier	 get Record
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
MetaRecord	TokenNameIdentifier	 Meta Record
)	TokenNameRPAREN	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a number of records in the image */	TokenNameCOMMENT_JAVADOC	 Returns a number of records in the image 
public	TokenNamepublic	
int	TokenNameint	
getNumRecords	TokenNameIdentifier	 get Num Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numRecords	TokenNameIdentifier	 num Records
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the viewport x origin */	TokenNameCOMMENT_JAVADOC	 Returns the viewport x origin 
public	TokenNamepublic	
float	TokenNamefloat	
getVpX	TokenNameIdentifier	 get Vp X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vpX	TokenNameIdentifier	 vp X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the viewport y origin */	TokenNameCOMMENT_JAVADOC	 Returns the viewport y origin 
public	TokenNamepublic	
float	TokenNamefloat	
getVpY	TokenNameIdentifier	 get Vp Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vpY	TokenNameIdentifier	 vp Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the viewport x origin */	TokenNameCOMMENT_JAVADOC	 Sets the viewport x origin 
public	TokenNamepublic	
void	TokenNamevoid	
setVpX	TokenNameIdentifier	 set Vp X
(	TokenNameLPAREN	
float	TokenNamefloat	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vpX	TokenNameIdentifier	 vp X
=	TokenNameEQUAL	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the viewport y origin */	TokenNameCOMMENT_JAVADOC	 Sets the viewport y origin 
public	TokenNamepublic	
void	TokenNamevoid	
setVpY	TokenNameIdentifier	 set Vp Y
(	TokenNameLPAREN	
float	TokenNamefloat	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vpY	TokenNameIdentifier	 vp Y
=	TokenNameEQUAL	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
