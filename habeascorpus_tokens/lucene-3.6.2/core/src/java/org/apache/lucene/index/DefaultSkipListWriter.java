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
IndexOutput	TokenNameIdentifier	 Index Output
;	TokenNameSEMICOLON	
/** * Implements the skip list writer for the default posting list format * that stores positions and payloads. * */	TokenNameCOMMENT_JAVADOC	 Implements the skip list writer for the default posting list format that stores positions and payloads. 
class	TokenNameclass	
DefaultSkipListWriter	TokenNameIdentifier	 Default Skip List Writer
extends	TokenNameextends	
MultiLevelSkipListWriter	TokenNameIdentifier	 Multi Level Skip List Writer
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lastSkipDoc	TokenNameIdentifier	 last Skip Doc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lastSkipPayloadLength	TokenNameIdentifier	 last Skip Payload Length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lastSkipFreqPointer	TokenNameIdentifier	 last Skip Freq Pointer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lastSkipProxPointer	TokenNameIdentifier	 last Skip Prox Pointer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexOutput	TokenNameIdentifier	 Index Output
freqOutput	TokenNameIdentifier	 freq Output
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexOutput	TokenNameIdentifier	 Index Output
proxOutput	TokenNameIdentifier	 prox Output
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
curDoc	TokenNameIdentifier	 cur Doc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
curStorePayloads	TokenNameIdentifier	 cur Store Payloads
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
curPayloadLength	TokenNameIdentifier	 cur Payload Length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
curFreqPointer	TokenNameIdentifier	 cur Freq Pointer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
curProxPointer	TokenNameIdentifier	 cur Prox Pointer
;	TokenNameSEMICOLON	
DefaultSkipListWriter	TokenNameIdentifier	 Default Skip List Writer
(	TokenNameLPAREN	
int	TokenNameint	
skipInterval	TokenNameIdentifier	 skip Interval
,	TokenNameCOMMA	
int	TokenNameint	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
,	TokenNameCOMMA	
int	TokenNameint	
docCount	TokenNameIdentifier	 doc Count
,	TokenNameCOMMA	
IndexOutput	TokenNameIdentifier	 Index Output
freqOutput	TokenNameIdentifier	 freq Output
,	TokenNameCOMMA	
IndexOutput	TokenNameIdentifier	 Index Output
proxOutput	TokenNameIdentifier	 prox Output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
skipInterval	TokenNameIdentifier	 skip Interval
,	TokenNameCOMMA	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
,	TokenNameCOMMA	
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
freqOutput	TokenNameIdentifier	 freq Output
=	TokenNameEQUAL	
freqOutput	TokenNameIdentifier	 freq Output
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
proxOutput	TokenNameIdentifier	 prox Output
=	TokenNameEQUAL	
proxOutput	TokenNameIdentifier	 prox Output
;	TokenNameSEMICOLON	
lastSkipDoc	TokenNameIdentifier	 last Skip Doc
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lastSkipPayloadLength	TokenNameIdentifier	 last Skip Payload Length
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lastSkipFreqPointer	TokenNameIdentifier	 last Skip Freq Pointer
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lastSkipProxPointer	TokenNameIdentifier	 last Skip Prox Pointer
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setFreqOutput	TokenNameIdentifier	 set Freq Output
(	TokenNameLPAREN	
IndexOutput	TokenNameIdentifier	 Index Output
freqOutput	TokenNameIdentifier	 freq Output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
freqOutput	TokenNameIdentifier	 freq Output
=	TokenNameEQUAL	
freqOutput	TokenNameIdentifier	 freq Output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setProxOutput	TokenNameIdentifier	 set Prox Output
(	TokenNameLPAREN	
IndexOutput	TokenNameIdentifier	 Index Output
proxOutput	TokenNameIdentifier	 prox Output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
proxOutput	TokenNameIdentifier	 prox Output
=	TokenNameEQUAL	
proxOutput	TokenNameIdentifier	 prox Output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the values for the current skip data. */	TokenNameCOMMENT_JAVADOC	 Sets the values for the current skip data. 
void	TokenNamevoid	
setSkipData	TokenNameIdentifier	 set Skip Data
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storePayloads	TokenNameIdentifier	 store Payloads
,	TokenNameCOMMA	
int	TokenNameint	
payloadLength	TokenNameIdentifier	 payload Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
curDoc	TokenNameIdentifier	 cur Doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
curStorePayloads	TokenNameIdentifier	 cur Store Payloads
=	TokenNameEQUAL	
storePayloads	TokenNameIdentifier	 store Payloads
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
curPayloadLength	TokenNameIdentifier	 cur Payload Length
=	TokenNameEQUAL	
payloadLength	TokenNameIdentifier	 payload Length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
curFreqPointer	TokenNameIdentifier	 cur Freq Pointer
=	TokenNameEQUAL	
freqOutput	TokenNameIdentifier	 freq Output
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
proxOutput	TokenNameIdentifier	 prox Output
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
curProxPointer	TokenNameIdentifier	 cur Prox Pointer
=	TokenNameEQUAL	
proxOutput	TokenNameIdentifier	 prox Output
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
resetSkip	TokenNameIdentifier	 reset Skip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
resetSkip	TokenNameIdentifier	 reset Skip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
lastSkipDoc	TokenNameIdentifier	 last Skip Doc
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
lastSkipPayloadLength	TokenNameIdentifier	 last Skip Payload Length
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we don't have to write the first length in the skip list 	TokenNameCOMMENT_LINE	we don't have to write the first length in the skip list 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
lastSkipFreqPointer	TokenNameIdentifier	 last Skip Freq Pointer
,	TokenNameCOMMA	
freqOutput	TokenNameIdentifier	 freq Output
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
proxOutput	TokenNameIdentifier	 prox Output
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
lastSkipProxPointer	TokenNameIdentifier	 last Skip Prox Pointer
,	TokenNameCOMMA	
proxOutput	TokenNameIdentifier	 prox Output
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
writeSkipData	TokenNameIdentifier	 write Skip Data
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
IndexOutput	TokenNameIdentifier	 Index Output
skipBuffer	TokenNameIdentifier	 skip Buffer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// To efficiently store payloads in the posting lists we do not store the length of 	TokenNameCOMMENT_LINE	To efficiently store payloads in the posting lists we do not store the length of 
// every payload. Instead we omit the length for a payload if the previous payload had 	TokenNameCOMMENT_LINE	every payload. Instead we omit the length for a payload if the previous payload had 
// the same length. 	TokenNameCOMMENT_LINE	the same length. 
// However, in order to support skipping the payload length at every skip point must be known. 	TokenNameCOMMENT_LINE	However, in order to support skipping the payload length at every skip point must be known. 
// So we use the same length encoding that we use for the posting lists for the skip data as well: 	TokenNameCOMMENT_LINE	So we use the same length encoding that we use for the posting lists for the skip data as well: 
// Case 1: current field does not store payloads 	TokenNameCOMMENT_LINE	Case 1: current field does not store payloads 
// SkipDatum --> DocSkip, FreqSkip, ProxSkip 	TokenNameCOMMENT_LINE	SkipDatum --> DocSkip, FreqSkip, ProxSkip 
// DocSkip,FreqSkip,ProxSkip --> VInt 	TokenNameCOMMENT_LINE	DocSkip,FreqSkip,ProxSkip --> VInt 
// DocSkip records the document number before every SkipInterval th document in TermFreqs. 	TokenNameCOMMENT_LINE	DocSkip records the document number before every SkipInterval th document in TermFreqs. 
// Document numbers are represented as differences from the previous value in the sequence. 	TokenNameCOMMENT_LINE	Document numbers are represented as differences from the previous value in the sequence. 
// Case 2: current field stores payloads 	TokenNameCOMMENT_LINE	Case 2: current field stores payloads 
// SkipDatum --> DocSkip, PayloadLength?, FreqSkip,ProxSkip 	TokenNameCOMMENT_LINE	SkipDatum --> DocSkip, PayloadLength?, FreqSkip,ProxSkip 
// DocSkip,FreqSkip,ProxSkip --> VInt 	TokenNameCOMMENT_LINE	DocSkip,FreqSkip,ProxSkip --> VInt 
// PayloadLength --> VInt 	TokenNameCOMMENT_LINE	PayloadLength --> VInt 
// In this case DocSkip/2 is the difference between 	TokenNameCOMMENT_LINE	In this case DocSkip/2 is the difference between 
// the current and the previous value. If DocSkip 	TokenNameCOMMENT_LINE	the current and the previous value. If DocSkip 
// is odd, then a PayloadLength encoded as VInt follows, 	TokenNameCOMMENT_LINE	is odd, then a PayloadLength encoded as VInt follows, 
// if DocSkip is even, then it is assumed that the 	TokenNameCOMMENT_LINE	if DocSkip is even, then it is assumed that the 
// current payload length equals the length at the previous 	TokenNameCOMMENT_LINE	current payload length equals the length at the previous 
// skip point 	TokenNameCOMMENT_LINE	skip point 
if	TokenNameif	
(	TokenNameLPAREN	
curStorePayloads	TokenNameIdentifier	 cur Store Payloads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
curDoc	TokenNameIdentifier	 cur Doc
-	TokenNameMINUS	
lastSkipDoc	TokenNameIdentifier	 last Skip Doc
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
curPayloadLength	TokenNameIdentifier	 cur Payload Length
==	TokenNameEQUAL_EQUAL	
lastSkipPayloadLength	TokenNameIdentifier	 last Skip Payload Length
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the current payload length equals the length at the previous skip point, 	TokenNameCOMMENT_LINE	the current payload length equals the length at the previous skip point, 
// so we don't store the length again 	TokenNameCOMMENT_LINE	so we don't store the length again 
skipBuffer	TokenNameIdentifier	 skip Buffer
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// the payload length is different from the previous one. We shift the DocSkip, 	TokenNameCOMMENT_LINE	the payload length is different from the previous one. We shift the DocSkip, 
// set the lowest bit and store the current payload length as VInt. 	TokenNameCOMMENT_LINE	set the lowest bit and store the current payload length as VInt. 
skipBuffer	TokenNameIdentifier	 skip Buffer
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipBuffer	TokenNameIdentifier	 skip Buffer
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
curPayloadLength	TokenNameIdentifier	 cur Payload Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastSkipPayloadLength	TokenNameIdentifier	 last Skip Payload Length
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
curPayloadLength	TokenNameIdentifier	 cur Payload Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// current field does not store payloads 	TokenNameCOMMENT_LINE	current field does not store payloads 
skipBuffer	TokenNameIdentifier	 skip Buffer
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
curDoc	TokenNameIdentifier	 cur Doc
-	TokenNameMINUS	
lastSkipDoc	TokenNameIdentifier	 last Skip Doc
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
skipBuffer	TokenNameIdentifier	 skip Buffer
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
curFreqPointer	TokenNameIdentifier	 cur Freq Pointer
-	TokenNameMINUS	
lastSkipFreqPointer	TokenNameIdentifier	 last Skip Freq Pointer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipBuffer	TokenNameIdentifier	 skip Buffer
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
curProxPointer	TokenNameIdentifier	 cur Prox Pointer
-	TokenNameMINUS	
lastSkipProxPointer	TokenNameIdentifier	 last Skip Prox Pointer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastSkipDoc	TokenNameIdentifier	 last Skip Doc
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
curDoc	TokenNameIdentifier	 cur Doc
;	TokenNameSEMICOLON	
//System.out.println("write doc at level " + level + ": " + curDoc); 	TokenNameCOMMENT_LINE	System.out.println("write doc at level " + level + ": " + curDoc); 
lastSkipFreqPointer	TokenNameIdentifier	 last Skip Freq Pointer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
curFreqPointer	TokenNameIdentifier	 cur Freq Pointer
;	TokenNameSEMICOLON	
lastSkipProxPointer	TokenNameIdentifier	 last Skip Prox Pointer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
curProxPointer	TokenNameIdentifier	 cur Prox Pointer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
