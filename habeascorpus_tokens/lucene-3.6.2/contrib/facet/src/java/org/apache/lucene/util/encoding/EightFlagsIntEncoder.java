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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A {@link ChunksIntEncoder} which encodes data in chunks of 8. Every group starts with a single * byte (called indicator) which represents 8 - 1 bit flags, where the value: * <ul> * <li>1 means the encoded value is '1' * <li>0 means the value is encoded using {@link VInt8IntEncoder}, and the * encoded bytes follow the indicator.<br> * Since value 0 is illegal, and 1 is encoded in the indicator, the actual * value that is encoded is <code>value-2</code>, which saves some more bits. * </ul> * Encoding example: * <ul> * <li>Original values: 6, 16, 5, 9, 7, 1 * <li>After sorting: 1, 5, 6, 7, 9, 16 * <li>D-Gap computing: 1, 4, 1, 1, 2, 5 (so far - done by * {@link DGapIntEncoder}) * <li>Encoding: 1,0,1,1,0,0,0,0 as the indicator, by 2 (4-2), 0 (2-2), 3 (5-2). * <li>Binary encode: <u>0 | 0 | 0 | 0 | 1 | 1 | 0 | 1</u> 00000010 00000000 * 00000011 (indicator is <u>underlined</u>).<br> * <b>NOTE:</b> the order of the values in the indicator is lsb &rArr; msb, * which allows for more efficient decoding. * </ul> * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A {@link ChunksIntEncoder} which encodes data in chunks of 8. Every group starts with a single byte (called indicator) which represents 8 - 1 bit flags, where the value: <ul> <li>1 means the encoded value is '1' <li>0 means the value is encoded using {@link VInt8IntEncoder}, and the encoded bytes follow the indicator.<br> Since value 0 is illegal, and 1 is encoded in the indicator, the actual value that is encoded is <code>value-2</code>, which saves some more bits. </ul> Encoding example: <ul> <li>Original values: 6, 16, 5, 9, 7, 1 <li>After sorting: 1, 5, 6, 7, 9, 16 <li>D-Gap computing: 1, 4, 1, 1, 2, 5 (so far - done by {@link DGapIntEncoder}) <li>Encoding: 1,0,1,1,0,0,0,0 as the indicator, by 2 (4-2), 0 (2-2), 3 (5-2). <li>Binary encode: <u>0 | 0 | 0 | 0 | 1 | 1 | 0 | 1</u> 00000010 00000000 00000011 (indicator is <u>underlined</u>).<br> <b>NOTE:</b> the order of the values in the indicator is lsb &rArr; msb, which allows for more efficient decoding. </ul> * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
EightFlagsIntEncoder	TokenNameIdentifier	 Eight Flags Int Encoder
extends	TokenNameextends	
ChunksIntEncoder	TokenNameIdentifier	 Chunks Int Encoder
{	TokenNameLBRACE	
/** * Holds all combinations of <i>indicator</i> flags for fast encoding (saves * time on bit manipulation at encode time) */	TokenNameCOMMENT_JAVADOC	 Holds all combinations of <i>indicator</i> flags for fast encoding (saves time on bit manipulation at encode time) 
private	TokenNameprivate	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
encodeTable	TokenNameIdentifier	 encode Table
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x80	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
EightFlagsIntEncoder	TokenNameIdentifier	 Eight Flags Int Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
int	TokenNameint	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indicator	TokenNameIdentifier	 indicator
|=	TokenNameOR_EQUAL	
encodeTable	TokenNameIdentifier	 encode Table
[	TokenNameLBRACKET	
ordinal	TokenNameIdentifier	 ordinal
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
encodeQueue	TokenNameIdentifier	 encode Queue
[	TokenNameLBRACKET	
encodeQueueSize	TokenNameIdentifier	 encode Queue Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
ordinal	TokenNameIdentifier	 ordinal
;	TokenNameSEMICOLON	
// If 8 values were encoded thus far, 'flush' them including the indicator. 	TokenNameCOMMENT_LINE	If 8 values were encoded thus far, 'flush' them including the indicator. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
&	TokenNameAND	
0x7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
encodeChunk	TokenNameIdentifier	 encode Chunk
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
IntDecoder	TokenNameIdentifier	 Int Decoder
createMatchingDecoder	TokenNameIdentifier	 create Matching Decoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
EightFlagsIntDecoder	TokenNameIdentifier	 Eight Flags Int Decoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
"EightFlags ("	TokenNameStringLiteral	EightFlags (
+	TokenNamePLUS	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
