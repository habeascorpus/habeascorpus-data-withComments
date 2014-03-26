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
/** * @version $Id: Table.java 478176 2006-11-22 14:50:50Z dvholten $ * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> */	TokenNameCOMMENT_JAVADOC	 @version $Id: Table.java 478176 2006-11-22 14:50:50Z dvholten $ @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> 
public	TokenNamepublic	
interface	TokenNameinterface	
Table	TokenNameIdentifier	 Table
{	TokenNameLBRACE	
// Table constants 	TokenNameCOMMENT_LINE	Table constants 
int	TokenNameint	
BASE	TokenNameIdentifier	 BASE
=	TokenNameEQUAL	
0x42415345	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Baseline data [OpenType] 	TokenNameCOMMENT_LINE	Baseline data [OpenType] 
int	TokenNameint	
CFF	TokenNameIdentifier	 CFF
=	TokenNameEQUAL	
0x43464620	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// PostScript font program (compact font format) [PostScript] 	TokenNameCOMMENT_LINE	PostScript font program (compact font format) [PostScript] 
int	TokenNameint	
DSIG	TokenNameIdentifier	 DSIG
=	TokenNameEQUAL	
0x44534947	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Digital signature 	TokenNameCOMMENT_LINE	Digital signature 
int	TokenNameint	
EBDT	TokenNameIdentifier	 EBDT
=	TokenNameEQUAL	
0x45424454	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Embedded bitmap data 	TokenNameCOMMENT_LINE	Embedded bitmap data 
int	TokenNameint	
EBLC	TokenNameIdentifier	 EBLC
=	TokenNameEQUAL	
0x45424c43	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Embedded bitmap location data 	TokenNameCOMMENT_LINE	Embedded bitmap location data 
int	TokenNameint	
EBSC	TokenNameIdentifier	 EBSC
=	TokenNameEQUAL	
0x45425343	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Embedded bitmap scaling data 	TokenNameCOMMENT_LINE	Embedded bitmap scaling data 
int	TokenNameint	
GDEF	TokenNameIdentifier	 GDEF
=	TokenNameEQUAL	
0x47444546	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Glyph definition data [OpenType] 	TokenNameCOMMENT_LINE	Glyph definition data [OpenType] 
int	TokenNameint	
GPOS	TokenNameIdentifier	 GPOS
=	TokenNameEQUAL	
0x47504f53	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Glyph positioning data [OpenType] 	TokenNameCOMMENT_LINE	Glyph positioning data [OpenType] 
int	TokenNameint	
GSUB	TokenNameIdentifier	 GSUB
=	TokenNameEQUAL	
0x47535542	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Glyph substitution data [OpenType] 	TokenNameCOMMENT_LINE	Glyph substitution data [OpenType] 
int	TokenNameint	
JSTF	TokenNameIdentifier	 JSTF
=	TokenNameEQUAL	
0x4a535446	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Justification data [OpenType] 	TokenNameCOMMENT_LINE	Justification data [OpenType] 
int	TokenNameint	
LTSH	TokenNameIdentifier	 LTSH
=	TokenNameEQUAL	
0x4c545348	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Linear threshold table 	TokenNameCOMMENT_LINE	Linear threshold table 
int	TokenNameint	
MMFX	TokenNameIdentifier	 MMFX
=	TokenNameEQUAL	
0x4d4d4658	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Multiple master font metrics [PostScript] 	TokenNameCOMMENT_LINE	Multiple master font metrics [PostScript] 
int	TokenNameint	
MMSD	TokenNameIdentifier	 MMSD
=	TokenNameEQUAL	
0x4d4d5344	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Multiple master supplementary data [PostScript] 	TokenNameCOMMENT_LINE	Multiple master supplementary data [PostScript] 
int	TokenNameint	
OS_2	TokenNameIdentifier	 OS 2
=	TokenNameEQUAL	
0x4f532f32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// OS/2 and Windows specific metrics [r] 	TokenNameCOMMENT_LINE	OS/2 and Windows specific metrics [r] 
int	TokenNameint	
PCLT	TokenNameIdentifier	 PCLT
=	TokenNameEQUAL	
0x50434c54	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// PCL5 	TokenNameCOMMENT_LINE	PCL5 
int	TokenNameint	
VDMX	TokenNameIdentifier	 VDMX
=	TokenNameEQUAL	
0x56444d58	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Vertical Device Metrics table 	TokenNameCOMMENT_LINE	Vertical Device Metrics table 
int	TokenNameint	
cmap	TokenNameIdentifier	 cmap
=	TokenNameEQUAL	
0x636d6170	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// character to glyph mapping [r] 	TokenNameCOMMENT_LINE	character to glyph mapping [r] 
int	TokenNameint	
cvt	TokenNameIdentifier	 cvt
=	TokenNameEQUAL	
0x63767420	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Control Value Table 	TokenNameCOMMENT_LINE	Control Value Table 
int	TokenNameint	
fpgm	TokenNameIdentifier	 fpgm
=	TokenNameEQUAL	
0x6670676d	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// font program 	TokenNameCOMMENT_LINE	font program 
int	TokenNameint	
fvar	TokenNameIdentifier	 fvar
=	TokenNameEQUAL	
0x66766172	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Apple's font variations table [PostScript] 	TokenNameCOMMENT_LINE	Apple's font variations table [PostScript] 
int	TokenNameint	
gasp	TokenNameIdentifier	 gasp
=	TokenNameEQUAL	
0x67617370	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// grid-fitting and scan conversion procedure (grayscale) 	TokenNameCOMMENT_LINE	grid-fitting and scan conversion procedure (grayscale) 
int	TokenNameint	
glyf	TokenNameIdentifier	 glyf
=	TokenNameEQUAL	
0x676c7966	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// glyph data [r] 	TokenNameCOMMENT_LINE	glyph data [r] 
int	TokenNameint	
hdmx	TokenNameIdentifier	 hdmx
=	TokenNameEQUAL	
0x68646d78	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// horizontal device metrics 	TokenNameCOMMENT_LINE	horizontal device metrics 
int	TokenNameint	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
0x68656164	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// font header [r] 	TokenNameCOMMENT_LINE	font header [r] 
int	TokenNameint	
hhea	TokenNameIdentifier	 hhea
=	TokenNameEQUAL	
0x68686561	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// horizontal header [r] 	TokenNameCOMMENT_LINE	horizontal header [r] 
int	TokenNameint	
hmtx	TokenNameIdentifier	 hmtx
=	TokenNameEQUAL	
0x686d7478	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// horizontal metrics [r] 	TokenNameCOMMENT_LINE	horizontal metrics [r] 
int	TokenNameint	
kern	TokenNameIdentifier	 kern
=	TokenNameEQUAL	
0x6b65726e	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// kerning 	TokenNameCOMMENT_LINE	kerning 
int	TokenNameint	
loca	TokenNameIdentifier	 loca
=	TokenNameEQUAL	
0x6c6f6361	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// index to location [r] 	TokenNameCOMMENT_LINE	index to location [r] 
int	TokenNameint	
maxp	TokenNameIdentifier	 maxp
=	TokenNameEQUAL	
0x6d617870	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// maximum profile [r] 	TokenNameCOMMENT_LINE	maximum profile [r] 
int	TokenNameint	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
0x6e616d65	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// naming table [r] 	TokenNameCOMMENT_LINE	naming table [r] 
int	TokenNameint	
prep	TokenNameIdentifier	 prep
=	TokenNameEQUAL	
0x70726570	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CVT Program 	TokenNameCOMMENT_LINE	CVT Program 
int	TokenNameint	
post	TokenNameIdentifier	 post
=	TokenNameEQUAL	
0x706f7374	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// PostScript information [r] 	TokenNameCOMMENT_LINE	PostScript information [r] 
int	TokenNameint	
vhea	TokenNameIdentifier	 vhea
=	TokenNameEQUAL	
0x76686561	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Vertical Metrics header 	TokenNameCOMMENT_LINE	Vertical Metrics header 
int	TokenNameint	
vmtx	TokenNameIdentifier	 vmtx
=	TokenNameEQUAL	
0x766d7478	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Vertical Metrics 	TokenNameCOMMENT_LINE	Vertical Metrics 
// Platform IDs 	TokenNameCOMMENT_LINE	Platform IDs 
short	TokenNameshort	
platformAppleUnicode	TokenNameIdentifier	 platform Apple Unicode
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
platformMacintosh	TokenNameIdentifier	 platform Macintosh
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
platformISO	TokenNameIdentifier	 platform ISO
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
platformMicrosoft	TokenNameIdentifier	 platform Microsoft
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Microsoft Encoding IDs 	TokenNameCOMMENT_LINE	Microsoft Encoding IDs 
short	TokenNameshort	
encodingUndefined	TokenNameIdentifier	 encoding Undefined
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingUGL	TokenNameIdentifier	 encoding UGL
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Macintosh Encoding IDs 	TokenNameCOMMENT_LINE	Macintosh Encoding IDs 
short	TokenNameshort	
encodingRoman	TokenNameIdentifier	 encoding Roman
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingJapanese	TokenNameIdentifier	 encoding Japanese
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingChinese	TokenNameIdentifier	 encoding Chinese
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingKorean	TokenNameIdentifier	 encoding Korean
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingArabic	TokenNameIdentifier	 encoding Arabic
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingHebrew	TokenNameIdentifier	 encoding Hebrew
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingGreek	TokenNameIdentifier	 encoding Greek
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingRussian	TokenNameIdentifier	 encoding Russian
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingRSymbol	TokenNameIdentifier	 encoding R Symbol
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingDevanagari	TokenNameIdentifier	 encoding Devanagari
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingGurmukhi	TokenNameIdentifier	 encoding Gurmukhi
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingGujarati	TokenNameIdentifier	 encoding Gujarati
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingOriya	TokenNameIdentifier	 encoding Oriya
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingBengali	TokenNameIdentifier	 encoding Bengali
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingTamil	TokenNameIdentifier	 encoding Tamil
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingTelugu	TokenNameIdentifier	 encoding Telugu
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingKannada	TokenNameIdentifier	 encoding Kannada
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingMalayalam	TokenNameIdentifier	 encoding Malayalam
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingSinhalese	TokenNameIdentifier	 encoding Sinhalese
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingBurmese	TokenNameIdentifier	 encoding Burmese
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingKhmer	TokenNameIdentifier	 encoding Khmer
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingThai	TokenNameIdentifier	 encoding Thai
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingLaotian	TokenNameIdentifier	 encoding Laotian
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingGeorgian	TokenNameIdentifier	 encoding Georgian
=	TokenNameEQUAL	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingArmenian	TokenNameIdentifier	 encoding Armenian
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingMaldivian	TokenNameIdentifier	 encoding Maldivian
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingTibetan	TokenNameIdentifier	 encoding Tibetan
=	TokenNameEQUAL	
26	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingMongolian	TokenNameIdentifier	 encoding Mongolian
=	TokenNameEQUAL	
27	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingGeez	TokenNameIdentifier	 encoding Geez
=	TokenNameEQUAL	
28	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingSlavic	TokenNameIdentifier	 encoding Slavic
=	TokenNameEQUAL	
29	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingVietnamese	TokenNameIdentifier	 encoding Vietnamese
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingSindhi	TokenNameIdentifier	 encoding Sindhi
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingUninterp	TokenNameIdentifier	 encoding Uninterp
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// ISO Encoding IDs 	TokenNameCOMMENT_LINE	ISO Encoding IDs 
short	TokenNameshort	
encodingASCII	TokenNameIdentifier	 encoding ASCII
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingISO10646	TokenNameIdentifier	 encoding IS O10646
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
encodingISO8859_1	TokenNameIdentifier	 encoding IS O8859 1
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Microsoft Language IDs 	TokenNameCOMMENT_LINE	Microsoft Language IDs 
short	TokenNameshort	
languageSQI	TokenNameIdentifier	 language SQI
=	TokenNameEQUAL	
0x041c	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageEUQ	TokenNameIdentifier	 language EUQ
=	TokenNameEQUAL	
0x042d	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageBEL	TokenNameIdentifier	 language BEL
=	TokenNameEQUAL	
0x0423	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageBGR	TokenNameIdentifier	 language BGR
=	TokenNameEQUAL	
0x0402	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageCAT	TokenNameIdentifier	 language CAT
=	TokenNameEQUAL	
0x0403	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageSHL	TokenNameIdentifier	 language SHL
=	TokenNameEQUAL	
0x041a	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageCSY	TokenNameIdentifier	 language CSY
=	TokenNameEQUAL	
0x0405	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageDAN	TokenNameIdentifier	 language DAN
=	TokenNameEQUAL	
0x0406	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageNLD	TokenNameIdentifier	 language NLD
=	TokenNameEQUAL	
0x0413	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageNLB	TokenNameIdentifier	 language NLB
=	TokenNameEQUAL	
0x0813	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageENU	TokenNameIdentifier	 language ENU
=	TokenNameEQUAL	
0x0409	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageENG	TokenNameIdentifier	 language ENG
=	TokenNameEQUAL	
0x0809	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageENA	TokenNameIdentifier	 language ENA
=	TokenNameEQUAL	
0x0c09	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageENC	TokenNameIdentifier	 language ENC
=	TokenNameEQUAL	
0x1009	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageENZ	TokenNameIdentifier	 language ENZ
=	TokenNameEQUAL	
0x1409	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageENI	TokenNameIdentifier	 language ENI
=	TokenNameEQUAL	
0x1809	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageETI	TokenNameIdentifier	 language ETI
=	TokenNameEQUAL	
0x0425	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageFIN	TokenNameIdentifier	 language FIN
=	TokenNameEQUAL	
0x040b	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageFRA	TokenNameIdentifier	 language FRA
=	TokenNameEQUAL	
0x040c	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageFRB	TokenNameIdentifier	 language FRB
=	TokenNameEQUAL	
0x080c	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageFRC	TokenNameIdentifier	 language FRC
=	TokenNameEQUAL	
0x0c0c	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageFRS	TokenNameIdentifier	 language FRS
=	TokenNameEQUAL	
0x100c	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageFRL	TokenNameIdentifier	 language FRL
=	TokenNameEQUAL	
0x140c	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageDEU	TokenNameIdentifier	 language DEU
=	TokenNameEQUAL	
0x0407	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageDES	TokenNameIdentifier	 language DES
=	TokenNameEQUAL	
0x0807	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageDEA	TokenNameIdentifier	 language DEA
=	TokenNameEQUAL	
0x0c07	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageDEL	TokenNameIdentifier	 language DEL
=	TokenNameEQUAL	
0x1007	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageDEC	TokenNameIdentifier	 language DEC
=	TokenNameEQUAL	
0x1407	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageELL	TokenNameIdentifier	 language ELL
=	TokenNameEQUAL	
0x0408	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageHUN	TokenNameIdentifier	 language HUN
=	TokenNameEQUAL	
0x040e	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageISL	TokenNameIdentifier	 language ISL
=	TokenNameEQUAL	
0x040f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageITA	TokenNameIdentifier	 language ITA
=	TokenNameEQUAL	
0x0410	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageITS	TokenNameIdentifier	 language ITS
=	TokenNameEQUAL	
0x0810	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageLVI	TokenNameIdentifier	 language LVI
=	TokenNameEQUAL	
0x0426	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageLTH	TokenNameIdentifier	 language LTH
=	TokenNameEQUAL	
0x0427	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageNOR	TokenNameIdentifier	 language NOR
=	TokenNameEQUAL	
0x0414	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageNON	TokenNameIdentifier	 language NON
=	TokenNameEQUAL	
0x0814	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languagePLK	TokenNameIdentifier	 language PLK
=	TokenNameEQUAL	
0x0415	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languagePTB	TokenNameIdentifier	 language PTB
=	TokenNameEQUAL	
0x0416	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languagePTG	TokenNameIdentifier	 language PTG
=	TokenNameEQUAL	
0x0816	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageROM	TokenNameIdentifier	 language ROM
=	TokenNameEQUAL	
0x0418	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageRUS	TokenNameIdentifier	 language RUS
=	TokenNameEQUAL	
0x0419	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageSKY	TokenNameIdentifier	 language SKY
=	TokenNameEQUAL	
0x041b	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageSLV	TokenNameIdentifier	 language SLV
=	TokenNameEQUAL	
0x0424	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageESP	TokenNameIdentifier	 language ESP
=	TokenNameEQUAL	
0x040a	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageESM	TokenNameIdentifier	 language ESM
=	TokenNameEQUAL	
0x080a	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageESN	TokenNameIdentifier	 language ESN
=	TokenNameEQUAL	
0x0c0a	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageSVE	TokenNameIdentifier	 language SVE
=	TokenNameEQUAL	
0x041d	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageTRK	TokenNameIdentifier	 language TRK
=	TokenNameEQUAL	
0x041f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageUKR	TokenNameIdentifier	 language UKR
=	TokenNameEQUAL	
0x0422	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Macintosh Language IDs 	TokenNameCOMMENT_LINE	Macintosh Language IDs 
short	TokenNameshort	
languageEnglish	TokenNameIdentifier	 language English
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageFrench	TokenNameIdentifier	 language French
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageGerman	TokenNameIdentifier	 language German
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageItalian	TokenNameIdentifier	 language Italian
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageDutch	TokenNameIdentifier	 language Dutch
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageSwedish	TokenNameIdentifier	 language Swedish
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageSpanish	TokenNameIdentifier	 language Spanish
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageDanish	TokenNameIdentifier	 language Danish
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languagePortuguese	TokenNameIdentifier	 language Portuguese
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageNorwegian	TokenNameIdentifier	 language Norwegian
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageHebrew	TokenNameIdentifier	 language Hebrew
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageJapanese	TokenNameIdentifier	 language Japanese
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageArabic	TokenNameIdentifier	 language Arabic
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageFinnish	TokenNameIdentifier	 language Finnish
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageGreek	TokenNameIdentifier	 language Greek
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageIcelandic	TokenNameIdentifier	 language Icelandic
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageMaltese	TokenNameIdentifier	 language Maltese
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageTurkish	TokenNameIdentifier	 language Turkish
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageYugoslavian	TokenNameIdentifier	 language Yugoslavian
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageChinese	TokenNameIdentifier	 language Chinese
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageUrdu	TokenNameIdentifier	 language Urdu
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageHindi	TokenNameIdentifier	 language Hindi
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
languageThai	TokenNameIdentifier	 language Thai
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Name IDs 	TokenNameCOMMENT_LINE	Name IDs 
short	TokenNameshort	
nameCopyrightNotice	TokenNameIdentifier	 name Copyright Notice
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
nameFontFamilyName	TokenNameIdentifier	 name Font Family Name
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
nameFontSubfamilyName	TokenNameIdentifier	 name Font Subfamily Name
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
nameUniqueFontIdentifier	TokenNameIdentifier	 name Unique Font Identifier
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
nameFullFontName	TokenNameIdentifier	 name Full Font Name
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
nameVersionString	TokenNameIdentifier	 name Version String
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
namePostscriptName	TokenNameIdentifier	 name Postscript Name
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
nameTrademark	TokenNameIdentifier	 name Trademark
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Get the table type, as a table directory value. * @return The table type */	TokenNameCOMMENT_JAVADOC	 Get the table type, as a table directory value. @return The table type 
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
