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
/** * @version $Id: GlyfTable.java 475477 2006-11-15 22:44:28Z cam $ * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> */	TokenNameCOMMENT_JAVADOC	 @version $Id: GlyfTable.java 475477 2006-11-15 22:44:28Z cam $ @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> 
public	TokenNamepublic	
class	TokenNameclass	
GlyfTable	TokenNameIdentifier	 Glyf Table
implements	TokenNameimplements	
Table	TokenNameIdentifier	 Table
{	TokenNameLBRACE	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
GlyfDescript	TokenNameIdentifier	 Glyf Descript
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
descript	TokenNameIdentifier	 descript
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
GlyfTable	TokenNameIdentifier	 Glyf Table
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
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
de	TokenNameIdentifier	 de
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* TableMaxp t_maxp = (TableMaxp) td.getEntryByTag(maxp).getTable(); TableLoca t_loca = (TableLoca) td.getEntryByTag(loca).getTable(); descript = new TableGlyfDescript[t_maxp.getNumGlyphs()]; for (int i = 0; i < t_maxp.getNumGlyphs(); i++) { raf.seek(tde.getOffset() + t_loca.getOffset(i)); int len = t_loca.getOffset((short)(i + 1)) - t_loca.getOffset(i); if (len > 0) { short numberOfContours = raf.readShort(); if (numberOfContours < 0) { // descript[i] = new TableGlyfCompositeDescript(this, raf); } else { descript[i] = new TableGlyfSimpleDescript(this, numberOfContours, raf); } } else { descript[i] = null; } } for (int i = 0; i < t_maxp.getNumGlyphs(); i++) { raf.seek(tde.getOffset() + t_loca.getOffset(i)); int len = t_loca.getOffset((short)(i + 1)) - t_loca.getOffset(i); if (len > 0) { short numberOfContours = raf.readShort(); if (numberOfContours < 0) { descript[i] = new TableGlyfCompositeDescript(this, raf); } } } */	TokenNameCOMMENT_BLOCK	 TableMaxp t_maxp = (TableMaxp) td.getEntryByTag(maxp).getTable(); TableLoca t_loca = (TableLoca) td.getEntryByTag(loca).getTable(); descript = new TableGlyfDescript[t_maxp.getNumGlyphs()]; for (int i = 0; i < t_maxp.getNumGlyphs(); i++) { raf.seek(tde.getOffset() + t_loca.getOffset(i)); int len = t_loca.getOffset((short)(i + 1)) - t_loca.getOffset(i); if (len > 0) { short numberOfContours = raf.readShort(); if (numberOfContours < 0) { // descript[i] = new TableGlyfCompositeDescript(this, raf); } else { descript[i] = new TableGlyfSimpleDescript(this, numberOfContours, raf); } } else { descript[i] = null; } } for (int i = 0; i < t_maxp.getNumGlyphs(); i++) { raf.seek(tde.getOffset() + t_loca.getOffset(i)); int len = t_loca.getOffset((short)(i + 1)) - t_loca.getOffset(i); if (len > 0) { short numberOfContours = raf.readShort(); if (numberOfContours < 0) { descript[i] = new TableGlyfCompositeDescript(this, raf); } } } 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
int	TokenNameint	
numGlyphs	TokenNameIdentifier	 num Glyphs
,	TokenNameCOMMA	
LocaTable	TokenNameIdentifier	 Loca Table
loca	TokenNameIdentifier	 loca
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
descript	TokenNameIdentifier	 descript
=	TokenNameEQUAL	
new	TokenNamenew	
GlyfDescript	TokenNameIdentifier	 Glyf Descript
[	TokenNameLBRACKET	
numGlyphs	TokenNameIdentifier	 num Glyphs
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
bais	TokenNameIdentifier	 bais
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
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
numGlyphs	TokenNameIdentifier	 num Glyphs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
loca	TokenNameIdentifier	 loca
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
loca	TokenNameIdentifier	 loca
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
loca	TokenNameIdentifier	 loca
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
numberOfContours	TokenNameIdentifier	 number Of Contours
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
if	TokenNameif	
(	TokenNameLPAREN	
numberOfContours	TokenNameIdentifier	 number Of Contours
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
descript	TokenNameIdentifier	 descript
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
GlyfSimpleDescript	TokenNameIdentifier	 Glyf Simple Descript
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
numberOfContours	TokenNameIdentifier	 number Of Contours
,	TokenNameCOMMA	
bais	TokenNameIdentifier	 bais
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
descript	TokenNameIdentifier	 descript
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
GlyfCompositeDescript	TokenNameIdentifier	 Glyf Composite Descript
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
bais	TokenNameIdentifier	 bais
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
null	TokenNamenull	
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
numGlyphs	TokenNameIdentifier	 num Glyphs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
descript	TokenNameIdentifier	 descript
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
descript	TokenNameIdentifier	 descript
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
GlyfDescript	TokenNameIdentifier	 Glyf Descript
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
descript	TokenNameIdentifier	 descript
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
glyf	TokenNameIdentifier	 glyf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
