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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
RandomAccessFile	TokenNameIdentifier	 Random Access File
;	TokenNameSEMICOLON	
/** * @version $Id: CmapFormat4.java 501844 2007-01-31 13:54:05Z dvholten $ * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> */	TokenNameCOMMENT_JAVADOC	 @version $Id: CmapFormat4.java 501844 2007-01-31 13:54:05Z dvholten $ @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> 
public	TokenNamepublic	
class	TokenNameclass	
CmapFormat4	TokenNameIdentifier	 Cmap Format4
extends	TokenNameextends	
CmapFormat	TokenNameIdentifier	 Cmap Format
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
language	TokenNameIdentifier	 language
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
segCountX2	TokenNameIdentifier	 seg Count X2
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
searchRange	TokenNameIdentifier	 search Range
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
entrySelector	TokenNameIdentifier	 entry Selector
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
rangeShift	TokenNameIdentifier	 range Shift
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
endCode	TokenNameIdentifier	 end Code
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
startCode	TokenNameIdentifier	 start Code
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
idDelta	TokenNameIdentifier	 id Delta
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
idRangeOffset	TokenNameIdentifier	 id Range Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphIdArray	TokenNameIdentifier	 glyph Id Array
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
segCount	TokenNameIdentifier	 seg Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
CmapFormat4	TokenNameIdentifier	 Cmap Format4
(	TokenNameLPAREN	
RandomAccessFile	TokenNameIdentifier	 Random Access File
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
segCountX2	TokenNameIdentifier	 seg Count X2
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segCount	TokenNameIdentifier	 seg Count
=	TokenNameEQUAL	
segCountX2	TokenNameIdentifier	 seg Count X2
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
endCode	TokenNameIdentifier	 end Code
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
segCount	TokenNameIdentifier	 seg Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
startCode	TokenNameIdentifier	 start Code
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
segCount	TokenNameIdentifier	 seg Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
idDelta	TokenNameIdentifier	 id Delta
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
segCount	TokenNameIdentifier	 seg Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
idRangeOffset	TokenNameIdentifier	 id Range Offset
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
segCount	TokenNameIdentifier	 seg Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
searchRange	TokenNameIdentifier	 search Range
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entrySelector	TokenNameIdentifier	 entry Selector
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rangeShift	TokenNameIdentifier	 range Shift
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
-	TokenNameMINUS	
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
segCount	TokenNameIdentifier	 seg Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endCode	TokenNameIdentifier	 end Code
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endCode	TokenNameIdentifier	 end Code
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>	TokenNameGREATER	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
endCode	TokenNameIdentifier	 end Code
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reservePad 	TokenNameCOMMENT_LINE	reservePad 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
segCount	TokenNameIdentifier	 seg Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startCode	TokenNameIdentifier	 start Code
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
startCode	TokenNameIdentifier	 start Code
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<	TokenNameLESS	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
)	TokenNameRPAREN	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
startCode	TokenNameIdentifier	 start Code
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
segCount	TokenNameIdentifier	 seg Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idDelta	TokenNameIdentifier	 id Delta
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
segCount	TokenNameIdentifier	 seg Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idRangeOffset	TokenNameIdentifier	 id Range Offset
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Whatever remains of this header belongs in glyphIdArray 	TokenNameCOMMENT_LINE	Whatever remains of this header belongs in glyphIdArray 
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
16	TokenNameIntegerLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
segCount	TokenNameIdentifier	 seg Count
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
glyphIdArray	TokenNameIdentifier	 glyph Id Array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
glyphIdArray	TokenNameIdentifier	 glyph Id Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getFirst	TokenNameIdentifier	 get First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLast	TokenNameIdentifier	 get Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
mapCharCode	TokenNameIdentifier	 map Char Code
(	TokenNameLPAREN	
int	TokenNameint	
charCode	TokenNameIdentifier	 char Code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
/* Quoting : http://developer.apple.com/fonts/TTRefMan/RM06/Chap6cmap.html#Surrogates The original architecture of the Unicode Standard allowed for all encoded characters to be represented using sixteen bit code points. This allowed for up to 65,354 characters to be encoded. (Unicode code points U+FFFE and U+FFFF are reserved and unavailable to represent characters. For more details, see The Unicode Standard.) My comment : Isn't there a typo here ? Shouldn't we rather read 65,534 ? */	TokenNameCOMMENT_BLOCK	 Quoting : http://developer.apple.com/fonts/TTRefMan/RM06/Chap6cmap.html#Surrogates The original architecture of the Unicode Standard allowed for all encoded characters to be represented using sixteen bit code points. This allowed for up to 65,354 characters to be encoded. (Unicode code points U+FFFE and U+FFFF are reserved and unavailable to represent characters. For more details, see The Unicode Standard.) My comment : Isn't there a typo here ? Shouldn't we rather read 65,534 ? 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
charCode	TokenNameIdentifier	 char Code
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charCode	TokenNameIdentifier	 char Code
>=	TokenNameGREATER_EQUAL	
0xFFFE	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
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
segCount	TokenNameIdentifier	 seg Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endCode	TokenNameIdentifier	 end Code
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
charCode	TokenNameIdentifier	 char Code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startCode	TokenNameIdentifier	 start Code
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
charCode	TokenNameIdentifier	 char Code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idRangeOffset	TokenNameIdentifier	 id Range Offset
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
glyphIdArray	TokenNameIdentifier	 glyph Id Array
[	TokenNameLBRACKET	
idRangeOffset	TokenNameIdentifier	 id Range Offset
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
charCode	TokenNameIdentifier	 char Code
-	TokenNameMINUS	
startCode	TokenNameIdentifier	 start Code
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
segCount	TokenNameIdentifier	 seg Count
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
idDelta	TokenNameIdentifier	 id Delta
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
charCode	TokenNameIdentifier	 char Code
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
65536	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: Array out of bounds - "	TokenNameStringLiteral	error: Array out of bounds - 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", segCountX2: "	TokenNameStringLiteral	, segCountX2: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
segCountX2	TokenNameIdentifier	 seg Count X2
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", searchRange: "	TokenNameStringLiteral	, searchRange: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
searchRange	TokenNameIdentifier	 search Range
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", entrySelector: "	TokenNameStringLiteral	, entrySelector: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
entrySelector	TokenNameIdentifier	 entry Selector
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", rangeShift: "	TokenNameStringLiteral	, rangeShift: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
rangeShift	TokenNameIdentifier	 range Shift
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", endCode: "	TokenNameStringLiteral	, endCode: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
intToStr	TokenNameIdentifier	 int To Str
(	TokenNameLPAREN	
endCode	TokenNameIdentifier	 end Code
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", startCode: "	TokenNameStringLiteral	, startCode: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
intToStr	TokenNameIdentifier	 int To Str
(	TokenNameLPAREN	
startCode	TokenNameIdentifier	 start Code
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", idDelta: "	TokenNameStringLiteral	, idDelta: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
intToStr	TokenNameIdentifier	 int To Str
(	TokenNameLPAREN	
idDelta	TokenNameIdentifier	 id Delta
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", idRangeOffset: "	TokenNameStringLiteral	, idRangeOffset: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
intToStr	TokenNameIdentifier	 int To Str
(	TokenNameLPAREN	
idRangeOffset	TokenNameIdentifier	 id Range Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * local helper method to convert an int-array to String. * Intended for debugging, format may change. * * @param array of int to convert * @return a String in the form "[val,val,val ... ]" */	TokenNameCOMMENT_JAVADOC	 local helper method to convert an int-array to String. Intended for debugging, format may change. * @param array of int to convert @return a String in the form "[val,val,val ... ]" 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
intToStr	TokenNameIdentifier	 int To Str
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nSlots	TokenNameIdentifier	 n Slots
=	TokenNameEQUAL	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
workBuff	TokenNameIdentifier	 work Buff
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
nSlots	TokenNameIdentifier	 n Slots
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
workBuff	TokenNameIdentifier	 work Buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
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
nSlots	TokenNameIdentifier	 n Slots
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
workBuff	TokenNameIdentifier	 work Buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nSlots	TokenNameIdentifier	 n Slots
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
workBuff	TokenNameIdentifier	 work Buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
workBuff	TokenNameIdentifier	 work Buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
workBuff	TokenNameIdentifier	 work Buff
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
