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
/** * @version $Id: Os2Table.java 475477 2006-11-15 22:44:28Z cam $ * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> */	TokenNameCOMMENT_JAVADOC	 @version $Id: Os2Table.java 475477 2006-11-15 22:44:28Z cam $ @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> 
public	TokenNamepublic	
class	TokenNameclass	
Os2Table	TokenNameIdentifier	 Os2 Table
implements	TokenNameimplements	
Table	TokenNameIdentifier	 Table
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
xAvgCharWidth	TokenNameIdentifier	 x Avg Char Width
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
usWeightClass	TokenNameIdentifier	 us Weight Class
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
usWidthClass	TokenNameIdentifier	 us Width Class
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
fsType	TokenNameIdentifier	 fs Type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
ySubscriptXSize	TokenNameIdentifier	 y Subscript X Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
ySubscriptYSize	TokenNameIdentifier	 y Subscript Y Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
ySubscriptXOffset	TokenNameIdentifier	 y Subscript X Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
ySubscriptYOffset	TokenNameIdentifier	 y Subscript Y Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
ySuperscriptXSize	TokenNameIdentifier	 y Superscript X Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
ySuperscriptYSize	TokenNameIdentifier	 y Superscript Y Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
ySuperscriptXOffset	TokenNameIdentifier	 y Superscript X Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
ySuperscriptYOffset	TokenNameIdentifier	 y Superscript Y Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
yStrikeoutSize	TokenNameIdentifier	 y Strikeout Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
yStrikeoutPosition	TokenNameIdentifier	 y Strikeout Position
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
sFamilyClass	TokenNameIdentifier	 s Family Class
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Panose	TokenNameIdentifier	 Panose
panose	TokenNameIdentifier	 panose
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
ulUnicodeRange1	TokenNameIdentifier	 ul Unicode Range1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
ulUnicodeRange2	TokenNameIdentifier	 ul Unicode Range2
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
ulUnicodeRange3	TokenNameIdentifier	 ul Unicode Range3
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
ulUnicodeRange4	TokenNameIdentifier	 ul Unicode Range4
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
achVendorID	TokenNameIdentifier	 ach Vendor ID
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
fsSelection	TokenNameIdentifier	 fs Selection
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
usFirstCharIndex	TokenNameIdentifier	 us First Char Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
usLastCharIndex	TokenNameIdentifier	 us Last Char Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
sTypoAscender	TokenNameIdentifier	 s Typo Ascender
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
sTypoDescender	TokenNameIdentifier	 s Typo Descender
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
sTypoLineGap	TokenNameIdentifier	 s Typo Line Gap
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
usWinAscent	TokenNameIdentifier	 us Win Ascent
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
usWinDescent	TokenNameIdentifier	 us Win Descent
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
ulCodePageRange1	TokenNameIdentifier	 ul Code Page Range1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
ulCodePageRange2	TokenNameIdentifier	 ul Code Page Range2
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Os2Table	TokenNameIdentifier	 Os2 Table
(	TokenNameLPAREN	
DirectoryEntry	TokenNameIdentifier	 Directory Entry
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
RandomAccessFile	TokenNameIdentifier	 Random Access File
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xAvgCharWidth	TokenNameIdentifier	 x Avg Char Width
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usWeightClass	TokenNameIdentifier	 us Weight Class
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usWidthClass	TokenNameIdentifier	 us Width Class
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fsType	TokenNameIdentifier	 fs Type
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ySubscriptXSize	TokenNameIdentifier	 y Subscript X Size
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ySubscriptYSize	TokenNameIdentifier	 y Subscript Y Size
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ySubscriptXOffset	TokenNameIdentifier	 y Subscript X Offset
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ySubscriptYOffset	TokenNameIdentifier	 y Subscript Y Offset
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ySuperscriptXSize	TokenNameIdentifier	 y Superscript X Size
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ySuperscriptYSize	TokenNameIdentifier	 y Superscript Y Size
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ySuperscriptXOffset	TokenNameIdentifier	 y Superscript X Offset
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ySuperscriptYOffset	TokenNameIdentifier	 y Superscript Y Offset
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yStrikeoutSize	TokenNameIdentifier	 y Strikeout Size
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yStrikeoutPosition	TokenNameIdentifier	 y Strikeout Position
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sFamilyClass	TokenNameIdentifier	 s Family Class
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
panose	TokenNameIdentifier	 panose
=	TokenNameEQUAL	
new	TokenNamenew	
Panose	TokenNameIdentifier	 Panose
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ulUnicodeRange1	TokenNameIdentifier	 ul Unicode Range1
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ulUnicodeRange2	TokenNameIdentifier	 ul Unicode Range2
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ulUnicodeRange3	TokenNameIdentifier	 ul Unicode Range3
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ulUnicodeRange4	TokenNameIdentifier	 ul Unicode Range4
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
achVendorID	TokenNameIdentifier	 ach Vendor ID
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fsSelection	TokenNameIdentifier	 fs Selection
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usFirstCharIndex	TokenNameIdentifier	 us First Char Index
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usLastCharIndex	TokenNameIdentifier	 us Last Char Index
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sTypoAscender	TokenNameIdentifier	 s Typo Ascender
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sTypoDescender	TokenNameIdentifier	 s Typo Descender
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sTypoLineGap	TokenNameIdentifier	 s Typo Line Gap
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usWinAscent	TokenNameIdentifier	 us Win Ascent
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usWinDescent	TokenNameIdentifier	 us Win Descent
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ulCodePageRange1	TokenNameIdentifier	 ul Code Page Range1
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ulCodePageRange2	TokenNameIdentifier	 ul Code Page Range2
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getAvgCharWidth	TokenNameIdentifier	 get Avg Char Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xAvgCharWidth	TokenNameIdentifier	 x Avg Char Width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getWeightClass	TokenNameIdentifier	 get Weight Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
usWeightClass	TokenNameIdentifier	 us Weight Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getWidthClass	TokenNameIdentifier	 get Width Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
usWidthClass	TokenNameIdentifier	 us Width Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getLicenseType	TokenNameIdentifier	 get License Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fsType	TokenNameIdentifier	 fs Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getSubscriptXSize	TokenNameIdentifier	 get Subscript X Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ySubscriptXSize	TokenNameIdentifier	 y Subscript X Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getSubscriptYSize	TokenNameIdentifier	 get Subscript Y Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ySubscriptYSize	TokenNameIdentifier	 y Subscript Y Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getSubscriptXOffset	TokenNameIdentifier	 get Subscript X Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ySubscriptXOffset	TokenNameIdentifier	 y Subscript X Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getSubscriptYOffset	TokenNameIdentifier	 get Subscript Y Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ySubscriptYOffset	TokenNameIdentifier	 y Subscript Y Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getSuperscriptXSize	TokenNameIdentifier	 get Superscript X Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ySuperscriptXSize	TokenNameIdentifier	 y Superscript X Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getSuperscriptYSize	TokenNameIdentifier	 get Superscript Y Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ySuperscriptYSize	TokenNameIdentifier	 y Superscript Y Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getSuperscriptXOffset	TokenNameIdentifier	 get Superscript X Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ySuperscriptXOffset	TokenNameIdentifier	 y Superscript X Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getSuperscriptYOffset	TokenNameIdentifier	 get Superscript Y Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ySuperscriptYOffset	TokenNameIdentifier	 y Superscript Y Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getStrikeoutSize	TokenNameIdentifier	 get Strikeout Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
yStrikeoutSize	TokenNameIdentifier	 y Strikeout Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getStrikeoutPosition	TokenNameIdentifier	 get Strikeout Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
yStrikeoutPosition	TokenNameIdentifier	 y Strikeout Position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getFamilyClass	TokenNameIdentifier	 get Family Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sFamilyClass	TokenNameIdentifier	 s Family Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Panose	TokenNameIdentifier	 Panose
getPanose	TokenNameIdentifier	 get Panose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
panose	TokenNameIdentifier	 panose
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getUnicodeRange1	TokenNameIdentifier	 get Unicode Range1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ulUnicodeRange1	TokenNameIdentifier	 ul Unicode Range1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getUnicodeRange2	TokenNameIdentifier	 get Unicode Range2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ulUnicodeRange2	TokenNameIdentifier	 ul Unicode Range2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getUnicodeRange3	TokenNameIdentifier	 get Unicode Range3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ulUnicodeRange3	TokenNameIdentifier	 ul Unicode Range3
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getUnicodeRange4	TokenNameIdentifier	 get Unicode Range4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ulUnicodeRange4	TokenNameIdentifier	 ul Unicode Range4
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getVendorID	TokenNameIdentifier	 get Vendor ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
achVendorID	TokenNameIdentifier	 ach Vendor ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getSelection	TokenNameIdentifier	 get Selection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fsSelection	TokenNameIdentifier	 fs Selection
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getFirstCharIndex	TokenNameIdentifier	 get First Char Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
usFirstCharIndex	TokenNameIdentifier	 us First Char Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLastCharIndex	TokenNameIdentifier	 get Last Char Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
usLastCharIndex	TokenNameIdentifier	 us Last Char Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getTypoAscender	TokenNameIdentifier	 get Typo Ascender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sTypoAscender	TokenNameIdentifier	 s Typo Ascender
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getTypoDescender	TokenNameIdentifier	 get Typo Descender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sTypoDescender	TokenNameIdentifier	 s Typo Descender
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getTypoLineGap	TokenNameIdentifier	 get Typo Line Gap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sTypoLineGap	TokenNameIdentifier	 s Typo Line Gap
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getWinAscent	TokenNameIdentifier	 get Win Ascent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
usWinAscent	TokenNameIdentifier	 us Win Ascent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getWinDescent	TokenNameIdentifier	 get Win Descent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
usWinDescent	TokenNameIdentifier	 us Win Descent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getCodePageRange1	TokenNameIdentifier	 get Code Page Range1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ulCodePageRange1	TokenNameIdentifier	 ul Code Page Range1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getCodePageRange2	TokenNameIdentifier	 get Code Page Range2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ulCodePageRange2	TokenNameIdentifier	 ul Code Page Range2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
OS_2	TokenNameIdentifier	 OS 2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
