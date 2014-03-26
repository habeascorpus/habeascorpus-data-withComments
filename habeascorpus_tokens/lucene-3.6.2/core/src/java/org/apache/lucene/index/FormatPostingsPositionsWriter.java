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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
FieldInfo	TokenNameIdentifier	 Field Info
.	TokenNameDOT	
IndexOptions	TokenNameIdentifier	 Index Options
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IOUtils	TokenNameIdentifier	 IO Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Closeable	TokenNameIdentifier	 Closeable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
final	TokenNamefinal	
class	TokenNameclass	
FormatPostingsPositionsWriter	TokenNameIdentifier	 Format Postings Positions Writer
extends	TokenNameextends	
FormatPostingsPositionsConsumer	TokenNameIdentifier	 Format Postings Positions Consumer
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
final	TokenNamefinal	
FormatPostingsDocsWriter	TokenNameIdentifier	 Format Postings Docs Writer
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexOutput	TokenNameIdentifier	 Index Output
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
omitTermFreqAndPositions	TokenNameIdentifier	 omit Term Freq And Positions
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
storePayloads	TokenNameIdentifier	 store Payloads
;	TokenNameSEMICOLON	
int	TokenNameint	
lastPayloadLength	TokenNameIdentifier	 last Payload Length
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
FormatPostingsPositionsWriter	TokenNameIdentifier	 Format Postings Positions Writer
(	TokenNameLPAREN	
SegmentWriteState	TokenNameIdentifier	 Segment Write State
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
FormatPostingsDocsWriter	TokenNameIdentifier	 Format Postings Docs Writer
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
omitTermFreqAndPositions	TokenNameIdentifier	 omit Term Freq And Positions
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
omitTermFreqAndPositions	TokenNameIdentifier	 omit Term Freq And Positions
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
hasProx	TokenNameIdentifier	 has Prox
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// At least one field does not omit TF, so create the 	TokenNameCOMMENT_LINE	At least one field does not omit TF, so create the 
// prox file 	TokenNameCOMMENT_LINE	prox file 
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
PROX_EXTENSION	TokenNameIdentifier	 PROX  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
skipListWriter	TokenNameIdentifier	 skip List Writer
.	TokenNameDOT	
setProxOutput	TokenNameIdentifier	 set Prox Output
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// Every field omits TF so we will write no prox file 	TokenNameCOMMENT_LINE	Every field omits TF so we will write no prox file 
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
lastPosition	TokenNameIdentifier	 last Position
;	TokenNameSEMICOLON	
/** Add a new position & payload */	TokenNameCOMMENT_JAVADOC	 Add a new position & payload 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
addPosition	TokenNameIdentifier	 add Position
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
payload	TokenNameIdentifier	 payload
,	TokenNameCOMMA	
int	TokenNameint	
payloadOffset	TokenNameIdentifier	 payload Offset
,	TokenNameCOMMA	
int	TokenNameint	
payloadLength	TokenNameIdentifier	 payload Length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
omitTermFreqAndPositions	TokenNameIdentifier	 omit Term Freq And Positions
:	TokenNameCOLON	
"omitTermFreqAndPositions is true"	TokenNameStringLiteral	omitTermFreqAndPositions is true
;	TokenNameSEMICOLON	
assert	TokenNameassert	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
lastPosition	TokenNameIdentifier	 last Position
;	TokenNameSEMICOLON	
lastPosition	TokenNameIdentifier	 last Position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
storePayloads	TokenNameIdentifier	 store Payloads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
payloadLength	TokenNameIdentifier	 payload Length
!=	TokenNameNOT_EQUAL	
lastPayloadLength	TokenNameIdentifier	 last Payload Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastPayloadLength	TokenNameIdentifier	 last Payload Length
=	TokenNameEQUAL	
payloadLength	TokenNameIdentifier	 payload Length
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
payloadLength	TokenNameIdentifier	 payload Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
payloadLength	TokenNameIdentifier	 payload Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
payload	TokenNameIdentifier	 payload
,	TokenNameCOMMA	
payloadLength	TokenNameIdentifier	 payload Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setField	TokenNameIdentifier	 set Field
(	TokenNameLPAREN	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
omitTermFreqAndPositions	TokenNameIdentifier	 omit Term Freq And Positions
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_ONLY	TokenNameIdentifier	 DOCS  ONLY
;	TokenNameSEMICOLON	
storePayloads	TokenNameIdentifier	 store Payloads
=	TokenNameEQUAL	
omitTermFreqAndPositions	TokenNameIdentifier	 omit Term Freq And Positions
?	TokenNameQUESTION	
false	TokenNamefalse	
:	TokenNameCOLON	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
storePayloads	TokenNameIdentifier	 store Payloads
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Called when we are done adding positions & payloads */	TokenNameCOMMENT_JAVADOC	 Called when we are done adding positions & payloads 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastPosition	TokenNameIdentifier	 last Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lastPayloadLength	TokenNameIdentifier	 last Payload Length
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
