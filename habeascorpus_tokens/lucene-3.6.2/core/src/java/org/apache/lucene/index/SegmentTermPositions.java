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
IndexInput	TokenNameIdentifier	 Index Input
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
SegmentTermPositions	TokenNameIdentifier	 Segment Term Positions
extends	TokenNameextends	
SegmentTermDocs	TokenNameIdentifier	 Segment Term Docs
implements	TokenNameimplements	
TermPositions	TokenNameIdentifier	 Term Positions
{	TokenNameLBRACE	
private	TokenNameprivate	
IndexInput	TokenNameIdentifier	 Index Input
proxStream	TokenNameIdentifier	 prox Stream
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
proxCount	TokenNameIdentifier	 prox Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
// the current payload length 	TokenNameCOMMENT_LINE	the current payload length 
private	TokenNameprivate	
int	TokenNameint	
payloadLength	TokenNameIdentifier	 payload Length
;	TokenNameSEMICOLON	
// indicates whether the payload of the current position has 	TokenNameCOMMENT_LINE	indicates whether the payload of the current position has 
// been read from the proxStream yet 	TokenNameCOMMENT_LINE	been read from the proxStream yet 
private	TokenNameprivate	
boolean	TokenNameboolean	
needToLoadPayload	TokenNameIdentifier	 need To Load Payload
;	TokenNameSEMICOLON	
// these variables are being used to remember information 	TokenNameCOMMENT_LINE	these variables are being used to remember information 
// for a lazy skip 	TokenNameCOMMENT_LINE	for a lazy skip 
private	TokenNameprivate	
long	TokenNamelong	
lazySkipPointer	TokenNameIdentifier	 lazy Skip Pointer
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lazySkipProxCount	TokenNameIdentifier	 lazy Skip Prox Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
SegmentTermPositions	TokenNameIdentifier	 Segment Term Positions
(	TokenNameLPAREN	
SegmentReader	TokenNameIdentifier	 Segment Reader
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
proxStream	TokenNameIdentifier	 prox Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// the proxStream will be cloned lazily when nextPosition() is called for the first time 	TokenNameCOMMENT_LINE	the proxStream will be cloned lazily when nextPosition() is called for the first time 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
TermInfo	TokenNameIdentifier	 Term Info
ti	TokenNameIdentifier	 ti
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
lazySkipPointer	TokenNameIdentifier	 lazy Skip Pointer
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
;	TokenNameSEMICOLON	
lazySkipProxCount	TokenNameIdentifier	 lazy Skip Prox Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
proxCount	TokenNameIdentifier	 prox Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
payloadLength	TokenNameIdentifier	 payload Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
needToLoadPayload	TokenNameIdentifier	 need To Load Payload
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
proxStream	TokenNameIdentifier	 prox Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
proxStream	TokenNameIdentifier	 prox Stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
indexOptions	TokenNameIdentifier	 index Options
!=	TokenNameNOT_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
)	TokenNameRPAREN	
// This field does not store positions, payloads 	TokenNameCOMMENT_LINE	This field does not store positions, payloads 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// perform lazy skips if necessary 	TokenNameCOMMENT_LINE	perform lazy skips if necessary 
lazySkip	TokenNameIdentifier	 lazy Skip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
proxCount	TokenNameIdentifier	 prox Count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
position	TokenNameIdentifier	 position
+=	TokenNamePLUS_EQUAL	
readDeltaPosition	TokenNameIdentifier	 read Delta Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
readDeltaPosition	TokenNameIdentifier	 read Delta Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
proxStream	TokenNameIdentifier	 prox Stream
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentFieldStoresPayloads	TokenNameIdentifier	 current Field Stores Payloads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if the current field stores payloads then 	TokenNameCOMMENT_LINE	if the current field stores payloads then 
// the position delta is shifted one bit to the left. 	TokenNameCOMMENT_LINE	the position delta is shifted one bit to the left. 
// if the LSB is set, then we have to read the current 	TokenNameCOMMENT_LINE	if the LSB is set, then we have to read the current 
// payload length 	TokenNameCOMMENT_LINE	payload length 
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
=	TokenNameEQUAL	
proxStream	TokenNameIdentifier	 prox Stream
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
needToLoadPayload	TokenNameIdentifier	 need To Load Payload
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
skippingDoc	TokenNameIdentifier	 skipping Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// we remember to skip a document lazily 	TokenNameCOMMENT_LINE	we remember to skip a document lazily 
lazySkipProxCount	TokenNameIdentifier	 lazy Skip Prox Count
+=	TokenNamePLUS_EQUAL	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// we remember to skip the remaining positions of the current 	TokenNameCOMMENT_LINE	we remember to skip the remaining positions of the current 
// document lazily 	TokenNameCOMMENT_LINE	document lazily 
lazySkipProxCount	TokenNameIdentifier	 lazy Skip Prox Count
+=	TokenNamePLUS_EQUAL	
proxCount	TokenNameIdentifier	 prox Count
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// run super 	TokenNameCOMMENT_LINE	run super 
proxCount	TokenNameIdentifier	 prox Count
=	TokenNameEQUAL	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
// note frequency 	TokenNameCOMMENT_LINE	note frequency 
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// reset position 	TokenNameCOMMENT_LINE	reset position 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freqs	TokenNameIdentifier	 freqs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"TermPositions does not support processing multiple documents in one call. Use TermDocs instead."	TokenNameStringLiteral	TermPositions does not support processing multiple documents in one call. Use TermDocs instead.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Called by super.skipTo(). */	TokenNameCOMMENT_JAVADOC	 Called by super.skipTo(). 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
skipProx	TokenNameIdentifier	 skip Prox
(	TokenNameLPAREN	
long	TokenNamelong	
proxPointer	TokenNameIdentifier	 prox Pointer
,	TokenNameCOMMA	
int	TokenNameint	
payloadLength	TokenNameIdentifier	 payload Length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// we save the pointer, we might have to skip there lazily 	TokenNameCOMMENT_LINE	we save the pointer, we might have to skip there lazily 
lazySkipPointer	TokenNameIdentifier	 lazy Skip Pointer
=	TokenNameEQUAL	
proxPointer	TokenNameIdentifier	 prox Pointer
;	TokenNameSEMICOLON	
lazySkipProxCount	TokenNameIdentifier	 lazy Skip Prox Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
proxCount	TokenNameIdentifier	 prox Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
payloadLength	TokenNameIdentifier	 payload Length
=	TokenNameEQUAL	
payloadLength	TokenNameIdentifier	 payload Length
;	TokenNameSEMICOLON	
needToLoadPayload	TokenNameIdentifier	 need To Load Payload
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
skipPositions	TokenNameIdentifier	 skip Positions
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// skip unread positions 	TokenNameCOMMENT_LINE	skip unread positions 
readDeltaPosition	TokenNameIdentifier	 read Delta Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipPayload	TokenNameIdentifier	 skip Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
skipPayload	TokenNameIdentifier	 skip Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needToLoadPayload	TokenNameIdentifier	 need To Load Payload
&&	TokenNameAND_AND	
payloadLength	TokenNameIdentifier	 payload Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
proxStream	TokenNameIdentifier	 prox Stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
proxStream	TokenNameIdentifier	 prox Stream
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
payloadLength	TokenNameIdentifier	 payload Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
needToLoadPayload	TokenNameIdentifier	 need To Load Payload
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// It is not always necessary to move the prox pointer 	TokenNameCOMMENT_LINE	It is not always necessary to move the prox pointer 
// to a new document after the freq pointer has been moved. 	TokenNameCOMMENT_LINE	to a new document after the freq pointer has been moved. 
// Consider for example a phrase query with two terms: 	TokenNameCOMMENT_LINE	Consider for example a phrase query with two terms: 
// the freq pointer for term 1 has to move to document x 	TokenNameCOMMENT_LINE	the freq pointer for term 1 has to move to document x 
// to answer the question if the term occurs in that document. But 	TokenNameCOMMENT_LINE	to answer the question if the term occurs in that document. But 
// only if term 2 also matches document x, the positions have to be 	TokenNameCOMMENT_LINE	only if term 2 also matches document x, the positions have to be 
// read to figure out if term 1 and term 2 appear next 	TokenNameCOMMENT_LINE	read to figure out if term 1 and term 2 appear next 
// to each other in document x and thus satisfy the query. 	TokenNameCOMMENT_LINE	to each other in document x and thus satisfy the query. 
// So we move the prox pointer lazily to the document 	TokenNameCOMMENT_LINE	So we move the prox pointer lazily to the document 
// as soon as positions are requested. 	TokenNameCOMMENT_LINE	as soon as positions are requested. 
private	TokenNameprivate	
void	TokenNamevoid	
lazySkip	TokenNameIdentifier	 lazy Skip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
proxStream	TokenNameIdentifier	 prox Stream
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// clone lazily 	TokenNameCOMMENT_LINE	clone lazily 
proxStream	TokenNameIdentifier	 prox Stream
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
proxStream	TokenNameIdentifier	 prox Stream
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we might have to skip the current payload 	TokenNameCOMMENT_LINE	we might have to skip the current payload 
// if it was not read yet 	TokenNameCOMMENT_LINE	if it was not read yet 
skipPayload	TokenNameIdentifier	 skip Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lazySkipPointer	TokenNameIdentifier	 lazy Skip Pointer
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
proxStream	TokenNameIdentifier	 prox Stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
lazySkipPointer	TokenNameIdentifier	 lazy Skip Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lazySkipPointer	TokenNameIdentifier	 lazy Skip Pointer
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lazySkipProxCount	TokenNameIdentifier	 lazy Skip Prox Count
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
skipPositions	TokenNameIdentifier	 skip Positions
(	TokenNameLPAREN	
lazySkipProxCount	TokenNameIdentifier	 lazy Skip Prox Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lazySkipProxCount	TokenNameIdentifier	 lazy Skip Prox Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getPayloadLength	TokenNameIdentifier	 get Payload Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
payloadLength	TokenNameIdentifier	 payload Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
needToLoadPayload	TokenNameIdentifier	 need To Load Payload
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Either no payload exists at this term position or an attempt was made to load it more than once."	TokenNameStringLiteral	Either no payload exists at this term position or an attempt was made to load it more than once.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// read payloads lazily 	TokenNameCOMMENT_LINE	read payloads lazily 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
retArray	TokenNameIdentifier	 ret Array
;	TokenNameSEMICOLON	
int	TokenNameint	
retOffset	TokenNameIdentifier	 ret Offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
payloadLength	TokenNameIdentifier	 payload Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the array is too small to store the payload data, 	TokenNameCOMMENT_LINE	the array is too small to store the payload data, 
// so we allocate a new one 	TokenNameCOMMENT_LINE	so we allocate a new one 
retArray	TokenNameIdentifier	 ret Array
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
payloadLength	TokenNameIdentifier	 payload Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
retOffset	TokenNameIdentifier	 ret Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
retArray	TokenNameIdentifier	 ret Array
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
retOffset	TokenNameIdentifier	 ret Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
proxStream	TokenNameIdentifier	 prox Stream
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
retArray	TokenNameIdentifier	 ret Array
,	TokenNameCOMMA	
retOffset	TokenNameIdentifier	 ret Offset
,	TokenNameCOMMA	
payloadLength	TokenNameIdentifier	 payload Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
needToLoadPayload	TokenNameIdentifier	 need To Load Payload
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
retArray	TokenNameIdentifier	 ret Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isPayloadAvailable	TokenNameIdentifier	 is Payload Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
needToLoadPayload	TokenNameIdentifier	 need To Load Payload
&&	TokenNameAND_AND	
payloadLength	TokenNameIdentifier	 payload Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
