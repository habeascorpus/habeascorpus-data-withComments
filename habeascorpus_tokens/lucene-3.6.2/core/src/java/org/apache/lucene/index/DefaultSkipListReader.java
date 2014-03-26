package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
IndexInput	TokenNameIdentifier	 Index Input
;	TokenNameSEMICOLON	
/** * Implements the skip list reader for the default posting list format * that stores positions and payloads. * */	TokenNameCOMMENT_JAVADOC	 Implements the skip list reader for the default posting list format that stores positions and payloads. 
class	TokenNameclass	
DefaultSkipListReader	TokenNameIdentifier	 Default Skip List Reader
extends	TokenNameextends	
MultiLevelSkipListReader	TokenNameIdentifier	 Multi Level Skip List Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
currentFieldStoresPayloads	TokenNameIdentifier	 current Field Stores Payloads
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
freqPointer	TokenNameIdentifier	 freq Pointer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
proxPointer	TokenNameIdentifier	 prox Pointer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
payloadLength	TokenNameIdentifier	 payload Length
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
lastFreqPointer	TokenNameIdentifier	 last Freq Pointer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
lastProxPointer	TokenNameIdentifier	 last Prox Pointer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lastPayloadLength	TokenNameIdentifier	 last Payload Length
;	TokenNameSEMICOLON	
DefaultSkipListReader	TokenNameIdentifier	 Default Skip List Reader
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
skipStream	TokenNameIdentifier	 skip Stream
,	TokenNameCOMMA	
int	TokenNameint	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
,	TokenNameCOMMA	
int	TokenNameint	
skipInterval	TokenNameIdentifier	 skip Interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
skipStream	TokenNameIdentifier	 skip Stream
,	TokenNameCOMMA	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
,	TokenNameCOMMA	
skipInterval	TokenNameIdentifier	 skip Interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
freqPointer	TokenNameIdentifier	 freq Pointer
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
proxPointer	TokenNameIdentifier	 prox Pointer
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
payloadLength	TokenNameIdentifier	 payload Length
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
long	TokenNamelong	
skipPointer	TokenNameIdentifier	 skip Pointer
,	TokenNameCOMMA	
long	TokenNamelong	
freqBasePointer	TokenNameIdentifier	 freq Base Pointer
,	TokenNameCOMMA	
long	TokenNamelong	
proxBasePointer	TokenNameIdentifier	 prox Base Pointer
,	TokenNameCOMMA	
int	TokenNameint	
df	TokenNameIdentifier	 df
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storesPayloads	TokenNameIdentifier	 stores Payloads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
skipPointer	TokenNameIdentifier	 skip Pointer
,	TokenNameCOMMA	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentFieldStoresPayloads	TokenNameIdentifier	 current Field Stores Payloads
=	TokenNameEQUAL	
storesPayloads	TokenNameIdentifier	 stores Payloads
;	TokenNameSEMICOLON	
lastFreqPointer	TokenNameIdentifier	 last Freq Pointer
=	TokenNameEQUAL	
freqBasePointer	TokenNameIdentifier	 freq Base Pointer
;	TokenNameSEMICOLON	
lastProxPointer	TokenNameIdentifier	 last Prox Pointer
=	TokenNameEQUAL	
proxBasePointer	TokenNameIdentifier	 prox Base Pointer
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
freqPointer	TokenNameIdentifier	 freq Pointer
,	TokenNameCOMMA	
freqBasePointer	TokenNameIdentifier	 freq Base Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
proxPointer	TokenNameIdentifier	 prox Pointer
,	TokenNameCOMMA	
proxBasePointer	TokenNameIdentifier	 prox Base Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
payloadLength	TokenNameIdentifier	 payload Length
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the freq pointer of the doc to which the last call of * {@link MultiLevelSkipListReader#skipTo(int)} has skipped. */	TokenNameCOMMENT_JAVADOC	 Returns the freq pointer of the doc to which the last call of {@link MultiLevelSkipListReader#skipTo(int)} has skipped. 
long	TokenNamelong	
getFreqPointer	TokenNameIdentifier	 get Freq Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastFreqPointer	TokenNameIdentifier	 last Freq Pointer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the prox pointer of the doc to which the last call of * {@link MultiLevelSkipListReader#skipTo(int)} has skipped. */	TokenNameCOMMENT_JAVADOC	 Returns the prox pointer of the doc to which the last call of {@link MultiLevelSkipListReader#skipTo(int)} has skipped. 
long	TokenNamelong	
getProxPointer	TokenNameIdentifier	 get Prox Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastProxPointer	TokenNameIdentifier	 last Prox Pointer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the payload length of the payload stored just before * the doc to which the last call of {@link MultiLevelSkipListReader#skipTo(int)} * has skipped. */	TokenNameCOMMENT_JAVADOC	 Returns the payload length of the payload stored just before the doc to which the last call of {@link MultiLevelSkipListReader#skipTo(int)} has skipped. 
int	TokenNameint	
getPayloadLength	TokenNameIdentifier	 get Payload Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastPayloadLength	TokenNameIdentifier	 last Payload Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
seekChild	TokenNameIdentifier	 seek Child
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
seekChild	TokenNameIdentifier	 seek Child
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
freqPointer	TokenNameIdentifier	 freq Pointer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lastFreqPointer	TokenNameIdentifier	 last Freq Pointer
;	TokenNameSEMICOLON	
proxPointer	TokenNameIdentifier	 prox Pointer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lastProxPointer	TokenNameIdentifier	 last Prox Pointer
;	TokenNameSEMICOLON	
payloadLength	TokenNameIdentifier	 payload Length
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lastPayloadLength	TokenNameIdentifier	 last Payload Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setLastSkipData	TokenNameIdentifier	 set Last Skip Data
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setLastSkipData	TokenNameIdentifier	 set Last Skip Data
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastFreqPointer	TokenNameIdentifier	 last Freq Pointer
=	TokenNameEQUAL	
freqPointer	TokenNameIdentifier	 freq Pointer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lastProxPointer	TokenNameIdentifier	 last Prox Pointer
=	TokenNameEQUAL	
proxPointer	TokenNameIdentifier	 prox Pointer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lastPayloadLength	TokenNameIdentifier	 last Payload Length
=	TokenNameEQUAL	
payloadLength	TokenNameIdentifier	 payload Length
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
readSkipData	TokenNameIdentifier	 read Skip Data
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
IndexInput	TokenNameIdentifier	 Index Input
skipStream	TokenNameIdentifier	 skip Stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentFieldStoresPayloads	TokenNameIdentifier	 current Field Stores Payloads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the current field stores payloads. 	TokenNameCOMMENT_LINE	the current field stores payloads. 
// if the doc delta is odd then we have 	TokenNameCOMMENT_LINE	if the doc delta is odd then we have 
// to read the current payload length 	TokenNameCOMMENT_LINE	to read the current payload length 
// because it differs from the length of the 	TokenNameCOMMENT_LINE	because it differs from the length of the 
// previous payload 	TokenNameCOMMENT_LINE	previous payload 
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
skipStream	TokenNameIdentifier	 skip Stream
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
payloadLength	TokenNameIdentifier	 payload Length
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
skipStream	TokenNameIdentifier	 skip Stream
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
delta	TokenNameIdentifier	 delta
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
skipStream	TokenNameIdentifier	 skip Stream
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
freqPointer	TokenNameIdentifier	 freq Pointer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
skipStream	TokenNameIdentifier	 skip Stream
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
proxPointer	TokenNameIdentifier	 prox Pointer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
skipStream	TokenNameIdentifier	 skip Stream
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
