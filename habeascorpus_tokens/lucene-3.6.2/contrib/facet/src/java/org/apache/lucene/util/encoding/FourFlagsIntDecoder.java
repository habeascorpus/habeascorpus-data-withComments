package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Decodes data which was encoded by {@link FourFlagsIntEncoder}. Scans * the <code>indicator</code>, one flag (1-bits) at a time, and decodes extra * data using {@link VInt8IntDecoder}. * * @see FourFlagsIntEncoder * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Decodes data which was encoded by {@link FourFlagsIntEncoder}. Scans the <code>indicator</code>, one flag (1-bits) at a time, and decodes extra data using {@link VInt8IntDecoder}. * @see FourFlagsIntEncoder @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
FourFlagsIntDecoder	TokenNameIdentifier	 Four Flags Int Decoder
extends	TokenNameextends	
IntDecoder	TokenNameIdentifier	 Int Decoder
{	TokenNameLBRACE	
/** * Holds all combinations of <i>indicator</i> for fast decoding (saves time * on real-time bit manipulation) */	TokenNameCOMMENT_JAVADOC	 Holds all combinations of <i>indicator</i> for fast decoding (saves time on real-time bit manipulation) 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
decodeTable	TokenNameIdentifier	 decode Table
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Generating all combinations of <i>indicator</i> into separate flags. */	TokenNameCOMMENT_JAVADOC	 Generating all combinations of <i>indicator</i> into separate flags. 
static	TokenNamestatic	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
decodeTable	TokenNameIdentifier	 decode Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
IntDecoder	TokenNameIdentifier	 Int Decoder
decoder	TokenNameIdentifier	 decoder
=	TokenNameEQUAL	
new	TokenNamenew	
VInt8IntDecoder	TokenNameIdentifier	 V Int8 Int Decoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The indicator for decoding a chunk of 4 integers. */	TokenNameCOMMENT_JAVADOC	 The indicator for decoding a chunk of 4 integers. 
private	TokenNameprivate	
int	TokenNameint	
indicator	TokenNameIdentifier	 indicator
;	TokenNameSEMICOLON	
/** Used as an ordinal of 0 - 3, as the decoder decodes chunks of 4 integers. */	TokenNameCOMMENT_JAVADOC	 Used as an ordinal of 0 - 3, as the decoder decodes chunks of 4 integers. 
private	TokenNameprivate	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// If we've decoded 8 integers, read the next indicator. 	TokenNameCOMMENT_LINE	If we've decoded 8 integers, read the next indicator. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
&	TokenNameAND	
0x3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indicator	TokenNameIdentifier	 indicator
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indicator	TokenNameIdentifier	 indicator
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
EOS	TokenNameIdentifier	 EOS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ordinal	TokenNameIdentifier	 ordinal
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
decodeVal	TokenNameIdentifier	 decode Val
=	TokenNameEQUAL	
decodeTable	TokenNameIdentifier	 decode Table
[	TokenNameLBRACKET	
indicator	TokenNameIdentifier	 indicator
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ordinal	TokenNameIdentifier	 ordinal
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
decodeVal	TokenNameIdentifier	 decode Val
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// decode the value from the stream. 	TokenNameCOMMENT_LINE	decode the value from the stream. 
long	TokenNamelong	
decode	TokenNameIdentifier	 decode
=	TokenNameEQUAL	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
decode	TokenNameIdentifier	 decode
==	TokenNameEQUAL_EQUAL	
EOS	TokenNameIdentifier	 EOS
?	TokenNameQUESTION	
EOS	TokenNameIdentifier	 EOS
:	TokenNameCOLON	
decode	TokenNameIdentifier	 decode
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
decodeVal	TokenNameIdentifier	 decode Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ordinal	TokenNameIdentifier	 ordinal
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
indicator	TokenNameIdentifier	 indicator
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"FourFlags (VInt8)"	TokenNameStringLiteral	FourFlags (VInt8)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
