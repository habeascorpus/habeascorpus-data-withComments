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
/** * @version $Id: HmtxTable.java 489226 2006-12-21 00:05:36Z cam $ * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> */	TokenNameCOMMENT_JAVADOC	 @version $Id: HmtxTable.java 489226 2006-12-21 00:05:36Z cam $ @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> 
public	TokenNamepublic	
class	TokenNameclass	
HmtxTable	TokenNameIdentifier	 Hmtx Table
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
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hMetrics	TokenNameIdentifier	 h Metrics
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
leftSideBearing	TokenNameIdentifier	 left Side Bearing
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
HmtxTable	TokenNameIdentifier	 Hmtx Table
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
/* TableMaxp t_maxp = (TableMaxp) td.getEntryByTag(maxp).getTable(); TableHhea t_hhea = (TableHhea) td.getEntryByTag(hhea).getTable(); int lsbCount = t_maxp.getNumGlyphs() - t_hhea.getNumberOfHMetrics(); hMetrics = new int[t_hhea.getNumberOfHMetrics()]; for (int i = 0; i < t_hhea.getNumberOfHMetrics(); i++) { hMetrics[i] = raf.readInt(); } if (lsbCount > 0) { leftSideBearing = new short[lsbCount]; for (int i = 0; i < lsbCount; i++) { leftSideBearing[i] = raf.readShort(); } } */	TokenNameCOMMENT_BLOCK	 TableMaxp t_maxp = (TableMaxp) td.getEntryByTag(maxp).getTable(); TableHhea t_hhea = (TableHhea) td.getEntryByTag(hhea).getTable(); int lsbCount = t_maxp.getNumGlyphs() - t_hhea.getNumberOfHMetrics(); hMetrics = new int[t_hhea.getNumberOfHMetrics()]; for (int i = 0; i < t_hhea.getNumberOfHMetrics(); i++) { hMetrics[i] = raf.readInt(); } if (lsbCount > 0) { leftSideBearing = new short[lsbCount]; for (int i = 0; i < lsbCount; i++) { leftSideBearing[i] = raf.readShort(); } } 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
int	TokenNameint	
numberOfHMetrics	TokenNameIdentifier	 number Of H Metrics
,	TokenNameCOMMA	
int	TokenNameint	
lsbCount	TokenNameIdentifier	 lsb Count
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
hMetrics	TokenNameIdentifier	 h Metrics
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numberOfHMetrics	TokenNameIdentifier	 number Of H Metrics
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
numberOfHMetrics	TokenNameIdentifier	 number Of H Metrics
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// pack 4 bytes from bais into an int and store in hMetrics[] 	TokenNameCOMMENT_LINE	pack 4 bytes from bais into an int and store in hMetrics[] 
// bais.read() returns an int 0..255, so no need to worry for sign-extension here 	TokenNameCOMMENT_LINE	bais.read() returns an int 0..255, so no need to worry for sign-extension here 
hMetrics	TokenNameIdentifier	 h Metrics
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
|	TokenNameOR	
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
if	TokenNameif	
(	TokenNameLPAREN	
lsbCount	TokenNameIdentifier	 lsb Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
leftSideBearing	TokenNameIdentifier	 left Side Bearing
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
lsbCount	TokenNameIdentifier	 lsb Count
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
lsbCount	TokenNameIdentifier	 lsb Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
leftSideBearing	TokenNameIdentifier	 left Side Bearing
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
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
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getAdvanceWidth	TokenNameIdentifier	 get Advance Width
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hMetrics	TokenNameIdentifier	 h Metrics
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
hMetrics	TokenNameIdentifier	 h Metrics
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hMetrics	TokenNameIdentifier	 h Metrics
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
hMetrics	TokenNameIdentifier	 h Metrics
[	TokenNameLBRACKET	
hMetrics	TokenNameIdentifier	 h Metrics
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getLeftSideBearing	TokenNameIdentifier	 get Left Side Bearing
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hMetrics	TokenNameIdentifier	 h Metrics
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
hMetrics	TokenNameIdentifier	 h Metrics
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
hMetrics	TokenNameIdentifier	 h Metrics
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
leftSideBearing	TokenNameIdentifier	 left Side Bearing
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
hMetrics	TokenNameIdentifier	 h Metrics
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hmtx	TokenNameIdentifier	 hmtx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
