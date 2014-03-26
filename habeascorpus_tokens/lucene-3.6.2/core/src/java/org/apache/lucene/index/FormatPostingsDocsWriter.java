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
/** Consumes doc & freq, writing them using the current * index file format */	TokenNameCOMMENT_JAVADOC	 Consumes doc & freq, writing them using the current index file format 
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
;	TokenNameSEMICOLON	
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
final	TokenNamefinal	
class	TokenNameclass	
FormatPostingsDocsWriter	TokenNameIdentifier	 Format Postings Docs Writer
extends	TokenNameextends	
FormatPostingsDocsConsumer	TokenNameIdentifier	 Format Postings Docs Consumer
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexOutput	TokenNameIdentifier	 Index Output
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FormatPostingsTermsWriter	TokenNameIdentifier	 Format Postings Terms Writer
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FormatPostingsPositionsWriter	TokenNameIdentifier	 Format Postings Positions Writer
posWriter	TokenNameIdentifier	 pos Writer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DefaultSkipListWriter	TokenNameIdentifier	 Default Skip List Writer
skipListWriter	TokenNameIdentifier	 skip List Writer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
skipInterval	TokenNameIdentifier	 skip Interval
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
totalNumDocs	TokenNameIdentifier	 total Num Docs
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
omitTermFreqAndPositions	TokenNameIdentifier	 omit Term Freq And Positions
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
storePayloads	TokenNameIdentifier	 store Payloads
;	TokenNameSEMICOLON	
long	TokenNamelong	
freqStart	TokenNameIdentifier	 freq Start
;	TokenNameSEMICOLON	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
FormatPostingsDocsWriter	TokenNameIdentifier	 Format Postings Docs Writer
(	TokenNameLPAREN	
SegmentWriteState	TokenNameIdentifier	 Segment Write State
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
FormatPostingsTermsWriter	TokenNameIdentifier	 Format Postings Terms Writer
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
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
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
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
FREQ_EXTENSION	TokenNameIdentifier	 FREQ  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
totalNumDocs	TokenNameIdentifier	 total Num Docs
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
totalNumDocs	TokenNameIdentifier	 total Num Docs
;	TokenNameSEMICOLON	
// TODO: abstraction violation 	TokenNameCOMMENT_LINE	TODO: abstraction violation 
skipInterval	TokenNameIdentifier	 skip Interval
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
termsOut	TokenNameIdentifier	 terms Out
.	TokenNameDOT	
skipInterval	TokenNameIdentifier	 skip Interval
;	TokenNameSEMICOLON	
skipListWriter	TokenNameIdentifier	 skip List Writer
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
skipListWriter	TokenNameIdentifier	 skip List Writer
;	TokenNameSEMICOLON	
skipListWriter	TokenNameIdentifier	 skip List Writer
.	TokenNameDOT	
setFreqOutput	TokenNameIdentifier	 set Freq Output
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posWriter	TokenNameIdentifier	 pos Writer
=	TokenNameEQUAL	
new	TokenNamenew	
FormatPostingsPositionsWriter	TokenNameIdentifier	 Format Postings Positions Writer
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
setField	TokenNameIdentifier	 set Field
(	TokenNameLPAREN	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
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
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
storePayloads	TokenNameIdentifier	 store Payloads
;	TokenNameSEMICOLON	
posWriter	TokenNameIdentifier	 pos Writer
.	TokenNameDOT	
setField	TokenNameIdentifier	 set Field
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
lastDocID	TokenNameIdentifier	 last Doc ID
;	TokenNameSEMICOLON	
int	TokenNameint	
df	TokenNameIdentifier	 df
;	TokenNameSEMICOLON	
/** Adds a new doc in this term. If this returns null * then we just skip consuming positions/payloads. */	TokenNameCOMMENT_JAVADOC	 Adds a new doc in this term. If this returns null then we just skip consuming positions/payloads. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
FormatPostingsPositionsConsumer	TokenNameIdentifier	 Format Postings Positions Consumer
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
,	TokenNameCOMMA	
int	TokenNameint	
termDocFreq	TokenNameIdentifier	 term Doc Freq
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
docID	TokenNameIdentifier	 doc ID
-	TokenNameMINUS	
lastDocID	TokenNameIdentifier	 last Doc ID
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docID	TokenNameIdentifier	 doc ID
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
df	TokenNameIdentifier	 df
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
delta	TokenNameIdentifier	 delta
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
(	TokenNameLPAREN	
"docs out of order ("	TokenNameStringLiteral	docs out of order (
+	TokenNamePLUS	
docID	TokenNameIdentifier	 doc ID
+	TokenNamePLUS	
" <= "	TokenNameStringLiteral	 <= 
+	TokenNamePLUS	
lastDocID	TokenNameIdentifier	 last Doc ID
+	TokenNamePLUS	
" ) (out: "	TokenNameStringLiteral	 ) (out: 
+	TokenNamePLUS	
out	TokenNameIdentifier	 out
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
df	TokenNameIdentifier	 df
%	TokenNameREMAINDER	
skipInterval	TokenNameIdentifier	 skip Interval
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: abstraction violation 	TokenNameCOMMENT_LINE	TODO: abstraction violation 
skipListWriter	TokenNameIdentifier	 skip List Writer
.	TokenNameDOT	
setSkipData	TokenNameIdentifier	 set Skip Data
(	TokenNameLPAREN	
lastDocID	TokenNameIdentifier	 last Doc ID
,	TokenNameCOMMA	
storePayloads	TokenNameIdentifier	 store Payloads
,	TokenNameCOMMA	
posWriter	TokenNameIdentifier	 pos Writer
.	TokenNameDOT	
lastPayloadLength	TokenNameIdentifier	 last Payload Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipListWriter	TokenNameIdentifier	 skip List Writer
.	TokenNameDOT	
bufferSkip	TokenNameIdentifier	 buffer Skip
(	TokenNameLPAREN	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
docID	TokenNameIdentifier	 doc ID
<	TokenNameLESS	
totalNumDocs	TokenNameIdentifier	 total Num Docs
:	TokenNameCOLON	
"docID="	TokenNameStringLiteral	docID=
+	TokenNamePLUS	
docID	TokenNameIdentifier	 doc ID
+	TokenNamePLUS	
" totalNumDocs="	TokenNameStringLiteral	 totalNumDocs=
+	TokenNamePLUS	
totalNumDocs	TokenNameIdentifier	 total Num Docs
;	TokenNameSEMICOLON	
lastDocID	TokenNameIdentifier	 last Doc ID
=	TokenNameEQUAL	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
omitTermFreqAndPositions	TokenNameIdentifier	 omit Term Freq And Positions
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
termDocFreq	TokenNameIdentifier	 term Doc Freq
)	TokenNameRPAREN	
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
else	TokenNameelse	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
termDocFreq	TokenNameIdentifier	 term Doc Freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
posWriter	TokenNameIdentifier	 pos Writer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
TermInfo	TokenNameIdentifier	 Term Info
termInfo	TokenNameIdentifier	 term Info
=	TokenNameEQUAL	
new	TokenNamenew	
TermInfo	TokenNameIdentifier	 Term Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// minimize consing 	TokenNameCOMMENT_LINE	minimize consing 
final	TokenNamefinal	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
utf8	TokenNameIdentifier	 utf8
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Called when we are done adding docs to this term */	TokenNameCOMMENT_JAVADOC	 Called when we are done adding docs to this term 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
skipPointer	TokenNameIdentifier	 skip Pointer
=	TokenNameEQUAL	
skipListWriter	TokenNameIdentifier	 skip List Writer
.	TokenNameDOT	
writeSkip	TokenNameIdentifier	 write Skip
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: this is abstraction violation -- we should not 	TokenNameCOMMENT_LINE	TODO: this is abstraction violation -- we should not 
// peek up into parents terms encoding format 	TokenNameCOMMENT_LINE	peek up into parents terms encoding format 
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
df	TokenNameIdentifier	 df
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
freqStart	TokenNameIdentifier	 freq Start
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
proxStart	TokenNameIdentifier	 prox Start
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
skipPointer	TokenNameIdentifier	 skip Pointer
-	TokenNameMINUS	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
freqStart	TokenNameIdentifier	 freq Start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: we could do this incrementally 	TokenNameCOMMENT_LINE	TODO: we could do this incrementally 
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16toUTF8	TokenNameIdentifier	 UT F16to UT F8
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
currentTerm	TokenNameIdentifier	 current Term
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
currentTermStart	TokenNameIdentifier	 current Term Start
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
df	TokenNameIdentifier	 df
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
termsOut	TokenNameIdentifier	 terms Out
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
number	TokenNameIdentifier	 number
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
termInfo	TokenNameIdentifier	 term Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastDocID	TokenNameIdentifier	 last Doc ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
,	TokenNameCOMMA	
posWriter	TokenNameIdentifier	 pos Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
