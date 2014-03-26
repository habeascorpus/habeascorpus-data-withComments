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
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
tiff	TokenNameIdentifier	 tiff
;	TokenNameSEMICOLON	
/** * A class for performing LZW decoding. * * @version $Id: TIFFLZWDecoder.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A class for performing LZW decoding. * @version $Id: TIFFLZWDecoder.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TIFFLZWDecoder	TokenNameIdentifier	 TIFFLZW Decoder
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stringTable	TokenNameIdentifier	 string Table
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
uncompData	TokenNameIdentifier	 uncomp Data
;	TokenNameSEMICOLON	
int	TokenNameint	
tableIndex	TokenNameIdentifier	 table Index
,	TokenNameCOMMA	
bitsToGet	TokenNameIdentifier	 bits To Get
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bytePointer	TokenNameIdentifier	 byte Pointer
,	TokenNameCOMMA	
bitPointer	TokenNameIdentifier	 bit Pointer
;	TokenNameSEMICOLON	
int	TokenNameint	
dstIndex	TokenNameIdentifier	 dst Index
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
int	TokenNameint	
predictor	TokenNameIdentifier	 predictor
,	TokenNameCOMMA	
samplesPerPixel	TokenNameIdentifier	 samples Per Pixel
;	TokenNameSEMICOLON	
int	TokenNameint	
nextData	TokenNameIdentifier	 next Data
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
nextBits	TokenNameIdentifier	 next Bits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
andTable	TokenNameIdentifier	 and Table
=	TokenNameEQUAL	
{	TokenNameLBRACE	
511	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1023	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2047	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4095	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TIFFLZWDecoder	TokenNameIdentifier	 TIFFLZW Decoder
(	TokenNameLPAREN	
int	TokenNameint	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
int	TokenNameint	
predictor	TokenNameIdentifier	 predictor
,	TokenNameCOMMA	
int	TokenNameint	
samplesPerPixel	TokenNameIdentifier	 samples Per Pixel
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
predictor	TokenNameIdentifier	 predictor
=	TokenNameEQUAL	
predictor	TokenNameIdentifier	 predictor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
samplesPerPixel	TokenNameIdentifier	 samples Per Pixel
=	TokenNameEQUAL	
samplesPerPixel	TokenNameIdentifier	 samples Per Pixel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Method to decode LZW compressed data. * * @param data The compressed data. * @param uncompData Array to return the uncompressed data in. * @param h The number of rows the compressed data contains. */	TokenNameCOMMENT_JAVADOC	 Method to decode LZW compressed data. * @param data The compressed data. @param uncompData Array to return the uncompressed data in. @param h The number of rows the compressed data contains. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
uncompData	TokenNameIdentifier	 uncomp Data
,	TokenNameCOMMA	
int	TokenNameint	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x00	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x01	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"TIFFLZWDecoder0"	TokenNameStringLiteral	TIFFLZWDecoder0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
initializeStringTable	TokenNameIdentifier	 initialize String Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
uncompData	TokenNameIdentifier	 uncomp Data
=	TokenNameEQUAL	
uncompData	TokenNameIdentifier	 uncomp Data
;	TokenNameSEMICOLON	
// Initialize pointers 	TokenNameCOMMENT_LINE	Initialize pointers 
bytePointer	TokenNameIdentifier	 byte Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bitPointer	TokenNameIdentifier	 bit Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstIndex	TokenNameIdentifier	 dst Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nextData	TokenNameIdentifier	 next Data
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nextBits	TokenNameIdentifier	 next Bits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
oldCode	TokenNameIdentifier	 old Code
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
string	TokenNameIdentifier	 string
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
getNextCode	TokenNameIdentifier	 get Next Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
257	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
dstIndex	TokenNameIdentifier	 dst Index
!=	TokenNameNOT_EQUAL	
uncompData	TokenNameIdentifier	 uncomp Data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
256	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initializeStringTable	TokenNameIdentifier	 initialize String Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
getNextCode	TokenNameIdentifier	 get Next Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
257	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
stringTable	TokenNameIdentifier	 string Table
[	TokenNameLBRACKET	
code	TokenNameIdentifier	 code
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldCode	TokenNameIdentifier	 old Code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
tableIndex	TokenNameIdentifier	 table Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
string	TokenNameIdentifier	 string
=	TokenNameEQUAL	
stringTable	TokenNameIdentifier	 string Table
[	TokenNameLBRACKET	
code	TokenNameIdentifier	 code
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addStringToTable	TokenNameIdentifier	 add String To Table
(	TokenNameLPAREN	
stringTable	TokenNameIdentifier	 string Table
[	TokenNameLBRACKET	
oldCode	TokenNameIdentifier	 old Code
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
string	TokenNameIdentifier	 string
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldCode	TokenNameIdentifier	 old Code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
string	TokenNameIdentifier	 string
=	TokenNameEQUAL	
stringTable	TokenNameIdentifier	 string Table
[	TokenNameLBRACKET	
oldCode	TokenNameIdentifier	 old Code
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
string	TokenNameIdentifier	 string
=	TokenNameEQUAL	
composeString	TokenNameIdentifier	 compose String
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
string	TokenNameIdentifier	 string
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addStringToTable	TokenNameIdentifier	 add String To Table
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldCode	TokenNameIdentifier	 old Code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Horizontal Differencing Predictor 	TokenNameCOMMENT_LINE	Horizontal Differencing Predictor 
if	TokenNameif	
(	TokenNameLPAREN	
predictor	TokenNameIdentifier	 predictor
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
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
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
samplesPerPixel	TokenNameIdentifier	 samples Per Pixel
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
*	TokenNameMULTIPLY	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
samplesPerPixel	TokenNameIdentifier	 samples Per Pixel
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
samplesPerPixel	TokenNameIdentifier	 samples Per Pixel
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uncompData	TokenNameIdentifier	 uncomp Data
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
uncompData	TokenNameIdentifier	 uncomp Data
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
samplesPerPixel	TokenNameIdentifier	 samples Per Pixel
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
uncompData	TokenNameIdentifier	 uncomp Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize the string table. */	TokenNameCOMMENT_JAVADOC	 Initialize the string table. 
public	TokenNamepublic	
void	TokenNamevoid	
initializeStringTable	TokenNameIdentifier	 initialize String Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stringTable	TokenNameIdentifier	 string Table
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
4096	TokenNameIntegerLiteral	
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
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stringTable	TokenNameIdentifier	 string Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
stringTable	TokenNameIdentifier	 string Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tableIndex	TokenNameIdentifier	 table Index
=	TokenNameEQUAL	
258	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bitsToGet	TokenNameIdentifier	 bits To Get
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write out the string just uncompressed. */	TokenNameCOMMENT_JAVADOC	 Write out the string just uncompressed. 
public	TokenNamepublic	
void	TokenNamevoid	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
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
string	TokenNameIdentifier	 string
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uncompData	TokenNameIdentifier	 uncomp Data
[	TokenNameLBRACKET	
dstIndex	TokenNameIdentifier	 dst Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a new string to the string table. */	TokenNameCOMMENT_JAVADOC	 Add a new string to the string table. 
public	TokenNamepublic	
void	TokenNamevoid	
addStringToTable	TokenNameIdentifier	 add String To Table
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldString	TokenNameIdentifier	 old String
,	TokenNameCOMMA	
byte	TokenNamebyte	
newString	TokenNameIdentifier	 new String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
oldString	TokenNameIdentifier	 old String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
string	TokenNameIdentifier	 string
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
oldString	TokenNameIdentifier	 old String
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
string	TokenNameIdentifier	 string
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newString	TokenNameIdentifier	 new String
;	TokenNameSEMICOLON	
// Add this new String to the table 	TokenNameCOMMENT_LINE	Add this new String to the table 
stringTable	TokenNameIdentifier	 string Table
[	TokenNameLBRACKET	
tableIndex	TokenNameIdentifier	 table Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tableIndex	TokenNameIdentifier	 table Index
==	TokenNameEQUAL_EQUAL	
511	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bitsToGet	TokenNameIdentifier	 bits To Get
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tableIndex	TokenNameIdentifier	 table Index
==	TokenNameEQUAL_EQUAL	
1023	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bitsToGet	TokenNameIdentifier	 bits To Get
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tableIndex	TokenNameIdentifier	 table Index
==	TokenNameEQUAL_EQUAL	
2047	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bitsToGet	TokenNameIdentifier	 bits To Get
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a new string to the string table. */	TokenNameCOMMENT_JAVADOC	 Add a new string to the string table. 
public	TokenNamepublic	
void	TokenNamevoid	
addStringToTable	TokenNameIdentifier	 add String To Table
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Add this new String to the table 	TokenNameCOMMENT_LINE	Add this new String to the table 
stringTable	TokenNameIdentifier	 string Table
[	TokenNameLBRACKET	
tableIndex	TokenNameIdentifier	 table Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tableIndex	TokenNameIdentifier	 table Index
==	TokenNameEQUAL_EQUAL	
511	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bitsToGet	TokenNameIdentifier	 bits To Get
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tableIndex	TokenNameIdentifier	 table Index
==	TokenNameEQUAL_EQUAL	
1023	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bitsToGet	TokenNameIdentifier	 bits To Get
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tableIndex	TokenNameIdentifier	 table Index
==	TokenNameEQUAL_EQUAL	
2047	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bitsToGet	TokenNameIdentifier	 bits To Get
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Append <code>newString</code> to the end of <code>oldString</code>. */	TokenNameCOMMENT_JAVADOC	 Append <code>newString</code> to the end of <code>oldString</code>. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
composeString	TokenNameIdentifier	 compose String
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldString	TokenNameIdentifier	 old String
,	TokenNameCOMMA	
byte	TokenNamebyte	
newString	TokenNameIdentifier	 new String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
oldString	TokenNameIdentifier	 old String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
string	TokenNameIdentifier	 string
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
oldString	TokenNameIdentifier	 old String
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
string	TokenNameIdentifier	 string
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newString	TokenNameIdentifier	 new String
;	TokenNameSEMICOLON	
return	TokenNamereturn	
string	TokenNameIdentifier	 string
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Returns the next 9, 10, 11 or 12 bits 	TokenNameCOMMENT_LINE	Returns the next 9, 10, 11 or 12 bits 
public	TokenNamepublic	
int	TokenNameint	
getNextCode	TokenNameIdentifier	 get Next Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Attempt to get the next code. The exception is caught to make 	TokenNameCOMMENT_LINE	Attempt to get the next code. The exception is caught to make 
// this robust to cases wherein the EndOfInformation code has been 	TokenNameCOMMENT_LINE	this robust to cases wherein the EndOfInformation code has been 
// omitted from a strip. Examples of such cases have been observed 	TokenNameCOMMENT_LINE	omitted from a strip. Examples of such cases have been observed 
// in practice. 	TokenNameCOMMENT_LINE	in practice. 
try	TokenNametry	
{	TokenNameLBRACE	
nextData	TokenNameIdentifier	 next Data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
nextData	TokenNameIdentifier	 next Data
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
bytePointer	TokenNameIdentifier	 byte Pointer
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextBits	TokenNameIdentifier	 next Bits
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextBits	TokenNameIdentifier	 next Bits
<	TokenNameLESS	
bitsToGet	TokenNameIdentifier	 bits To Get
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextData	TokenNameIdentifier	 next Data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
nextData	TokenNameIdentifier	 next Data
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
bytePointer	TokenNameIdentifier	 byte Pointer
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextBits	TokenNameIdentifier	 next Bits
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
nextData	TokenNameIdentifier	 next Data
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
nextBits	TokenNameIdentifier	 next Bits
-	TokenNameMINUS	
bitsToGet	TokenNameIdentifier	 bits To Get
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
andTable	TokenNameIdentifier	 and Table
[	TokenNameLBRACKET	
bitsToGet	TokenNameIdentifier	 bits To Get
-	TokenNameMINUS	
9	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
nextBits	TokenNameIdentifier	 next Bits
-=	TokenNameMINUS_EQUAL	
bitsToGet	TokenNameIdentifier	 bits To Get
;	TokenNameSEMICOLON	
return	TokenNamereturn	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Strip not terminated as expected: return EndOfInformation code. 	TokenNameCOMMENT_LINE	Strip not terminated as expected: return EndOfInformation code. 
return	TokenNamereturn	
257	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
