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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
BitVector	TokenNameIdentifier	 Bit Vector
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
CollectionUtil	TokenNameIdentifier	 Collection Util
;	TokenNameSEMICOLON	
final	TokenNamefinal	
class	TokenNameclass	
FreqProxTermsWriter	TokenNameIdentifier	 Freq Prox Terms Writer
extends	TokenNameextends	
TermsHashConsumer	TokenNameIdentifier	 Terms Hash Consumer
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermsHashConsumerPerThread	TokenNameIdentifier	 Terms Hash Consumer Per Thread
addThread	TokenNameIdentifier	 add Thread
(	TokenNameLPAREN	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
perThread	TokenNameIdentifier	 per Thread
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FreqProxTermsWriterPerThread	TokenNameIdentifier	 Freq Prox Terms Writer Per Thread
(	TokenNameLPAREN	
perThread	TokenNameIdentifier	 per Thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
compareText	TokenNameIdentifier	 compare Text
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text1	TokenNameIdentifier	 text1
,	TokenNameCOMMA	
int	TokenNameint	
pos1	TokenNameIdentifier	 pos1
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text2	TokenNameIdentifier	 text2
,	TokenNameCOMMA	
int	TokenNameint	
pos2	TokenNameIdentifier	 pos2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
text1	TokenNameIdentifier	 text1
[	TokenNameLBRACKET	
pos1	TokenNameIdentifier	 pos1
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
text2	TokenNameIdentifier	 text2
[	TokenNameLBRACKET	
pos2	TokenNameIdentifier	 pos2
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
!=	TokenNameNOT_EQUAL	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0xffff	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
0xffff	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
c1	TokenNameIdentifier	 c1
-	TokenNameMINUS	
c2	TokenNameIdentifier	 c2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
0xffff	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// TODO: would be nice to factor out more of this, eg the 	TokenNameCOMMENT_LINE	TODO: would be nice to factor out more of this, eg the 
// FreqProxFieldMergeState, and code to visit all Fields 	TokenNameCOMMENT_LINE	FreqProxFieldMergeState, and code to visit all Fields 
// under the same FieldInfo together, up into TermsHash*. 	TokenNameCOMMENT_LINE	under the same FieldInfo together, up into TermsHash*. 
// Other writers would presumably share alot of this... 	TokenNameCOMMENT_LINE	Other writers would presumably share alot of this... 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
TermsHashConsumerPerThread	TokenNameIdentifier	 Terms Hash Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
>>	TokenNameRIGHT_SHIFT	
threadsAndFields	TokenNameIdentifier	 threads And Fields
,	TokenNameCOMMA	
final	TokenNamefinal	
SegmentWriteState	TokenNameIdentifier	 Segment Write State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Gather all FieldData's that have postings, across all 	TokenNameCOMMENT_LINE	Gather all FieldData's that have postings, across all 
// ThreadStates 	TokenNameCOMMENT_LINE	ThreadStates 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FreqProxTermsWriterPerField	TokenNameIdentifier	 Freq Prox Terms Writer Per Field
>	TokenNameGREATER	
allFields	TokenNameIdentifier	 all Fields
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FreqProxTermsWriterPerField	TokenNameIdentifier	 Freq Prox Terms Writer Per Field
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
TermsHashConsumerPerThread	TokenNameIdentifier	 Terms Hash Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
>>	TokenNameRIGHT_SHIFT	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
threadsAndFields	TokenNameIdentifier	 threads And Fields
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
>	TokenNameGREATER	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
FreqProxTermsWriterPerField	TokenNameIdentifier	 Freq Prox Terms Writer Per Field
perField	TokenNameIdentifier	 per Field
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FreqProxTermsWriterPerField	TokenNameIdentifier	 Freq Prox Terms Writer Per Field
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
numPostings	TokenNameIdentifier	 num Postings
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
allFields	TokenNameIdentifier	 all Fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
perField	TokenNameIdentifier	 per Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Sort by field name 	TokenNameCOMMENT_LINE	Sort by field name 
CollectionUtil	TokenNameIdentifier	 Collection Util
.	TokenNameDOT	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
allFields	TokenNameIdentifier	 all Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numAllFields	TokenNameIdentifier	 num All Fields
=	TokenNameEQUAL	
allFields	TokenNameIdentifier	 all Fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: allow Lucene user to customize this consumer: 	TokenNameCOMMENT_LINE	TODO: allow Lucene user to customize this consumer: 
final	TokenNamefinal	
FormatPostingsFieldsConsumer	TokenNameIdentifier	 Format Postings Fields Consumer
consumer	TokenNameIdentifier	 consumer
=	TokenNameEQUAL	
new	TokenNamenew	
FormatPostingsFieldsWriter	TokenNameIdentifier	 Format Postings Fields Writer
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Current writer chain: FormatPostingsFieldsConsumer -> IMPL: FormatPostingsFieldsWriter -> FormatPostingsTermsConsumer -> IMPL: FormatPostingsTermsWriter -> FormatPostingsDocConsumer -> IMPL: FormatPostingsDocWriter -> FormatPostingsPositionsConsumer -> IMPL: FormatPostingsPositionsWriter */	TokenNameCOMMENT_BLOCK	 Current writer chain: FormatPostingsFieldsConsumer -> IMPL: FormatPostingsFieldsWriter -> FormatPostingsTermsConsumer -> IMPL: FormatPostingsTermsWriter -> FormatPostingsDocConsumer -> IMPL: FormatPostingsDocWriter -> FormatPostingsPositionsConsumer -> IMPL: FormatPostingsPositionsWriter 
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
numAllFields	TokenNameIdentifier	 num All Fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
=	TokenNameEQUAL	
allFields	TokenNameIdentifier	 all Fields
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
<	TokenNameLESS	
numAllFields	TokenNameIdentifier	 num All Fields
&&	TokenNameAND_AND	
allFields	TokenNameIdentifier	 all Fields
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
end	TokenNameIdentifier	 end
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
FreqProxTermsWriterPerField	TokenNameIdentifier	 Freq Prox Terms Writer Per Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
FreqProxTermsWriterPerField	TokenNameIdentifier	 Freq Prox Terms Writer Per Field
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
allFields	TokenNameIdentifier	 all Fields
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Aggregate the storePayload as seen by the same 	TokenNameCOMMENT_LINE	Aggregate the storePayload as seen by the same 
// field across multiple threads 	TokenNameCOMMENT_LINE	field across multiple threads 
if	TokenNameif	
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
storePayloads	TokenNameIdentifier	 store Payloads
|=	TokenNameOR_EQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
.	TokenNameDOT	
hasPayloads	TokenNameIdentifier	 has Payloads
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If this field has postings then add them to the 	TokenNameCOMMENT_LINE	If this field has postings then add them to the 
// segment 	TokenNameCOMMENT_LINE	segment 
appendPostings	TokenNameIdentifier	 append Postings
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
consumer	TokenNameIdentifier	 consumer
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
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TermsHashPerField	TokenNameIdentifier	 Terms Hash Per Field
perField	TokenNameIdentifier	 per Field
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
;	TokenNameSEMICOLON	
int	TokenNameint	
numPostings	TokenNameIdentifier	 num Postings
=	TokenNameEQUAL	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
numPostings	TokenNameIdentifier	 num Postings
;	TokenNameSEMICOLON	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
shrinkHash	TokenNameIdentifier	 shrink Hash
(	TokenNameLPAREN	
numPostings	TokenNameIdentifier	 num Postings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
TermsHashConsumerPerThread	TokenNameIdentifier	 Terms Hash Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
>>	TokenNameRIGHT_SHIFT	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
threadsAndFields	TokenNameIdentifier	 threads And Fields
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FreqProxTermsWriterPerThread	TokenNameIdentifier	 Freq Prox Terms Writer Per Thread
perThread	TokenNameIdentifier	 per Thread
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FreqProxTermsWriterPerThread	TokenNameIdentifier	 Freq Prox Terms Writer Per Thread
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
termsHashPerThread	TokenNameIdentifier	 terms Hash Per Thread
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
payloadBuffer	TokenNameIdentifier	 payload Buffer
;	TokenNameSEMICOLON	
/* Walk through all unique text tokens (Posting * instances) found in this field and serialize them * into a single RAM segment. */	TokenNameCOMMENT_BLOCK	 Walk through all unique text tokens (Posting instances) found in this field and serialize them into a single RAM segment. 
void	TokenNamevoid	
appendPostings	TokenNameIdentifier	 append Postings
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
SegmentWriteState	TokenNameIdentifier	 Segment Write State
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
FreqProxTermsWriterPerField	TokenNameIdentifier	 Freq Prox Terms Writer Per Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
FormatPostingsFieldsConsumer	TokenNameIdentifier	 Format Postings Fields Consumer
consumer	TokenNameIdentifier	 consumer
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
numFields	TokenNameIdentifier	 num Fields
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FreqProxFieldMergeState	TokenNameIdentifier	 Freq Prox Field Merge State
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mergeStates	TokenNameIdentifier	 merge States
=	TokenNameEQUAL	
new	TokenNamenew	
FreqProxFieldMergeState	TokenNameIdentifier	 Freq Prox Field Merge State
[	TokenNameLBRACKET	
numFields	TokenNameIdentifier	 num Fields
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
numFields	TokenNameIdentifier	 num Fields
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FreqProxFieldMergeState	TokenNameIdentifier	 Freq Prox Field Merge State
fms	TokenNameIdentifier	 fms
=	TokenNameEQUAL	
mergeStates	TokenNameIdentifier	 merge States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
FreqProxFieldMergeState	TokenNameIdentifier	 Freq Prox Field Merge State
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
fms	TokenNameIdentifier	 fms
.	TokenNameDOT	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
==	TokenNameEQUAL_EQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
// Should always be true 	TokenNameCOMMENT_LINE	Should always be true 
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
fms	TokenNameIdentifier	 fms
.	TokenNameDOT	
nextTerm	TokenNameIdentifier	 next Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
FormatPostingsTermsConsumer	TokenNameIdentifier	 Format Postings Terms Consumer
termsConsumer	TokenNameIdentifier	 terms Consumer
=	TokenNameEQUAL	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
protoTerm	TokenNameIdentifier	 proto Term
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FreqProxFieldMergeState	TokenNameIdentifier	 Freq Prox Field Merge State
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
termStates	TokenNameIdentifier	 term States
=	TokenNameEQUAL	
new	TokenNamenew	
FreqProxFieldMergeState	TokenNameIdentifier	 Freq Prox Field Merge State
[	TokenNameLBRACKET	
numFields	TokenNameIdentifier	 num Fields
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexOptions	TokenNameIdentifier	 Index Options
currentFieldIndexOptions	TokenNameIdentifier	 current Field Index Options
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
segDeletes	TokenNameIdentifier	 seg Deletes
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
segDeletes	TokenNameIdentifier	 seg Deletes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
segDeletes	TokenNameIdentifier	 seg Deletes
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
segDeletes	TokenNameIdentifier	 seg Deletes
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
segDeletes	TokenNameIdentifier	 seg Deletes
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
segDeletes	TokenNameIdentifier	 seg Deletes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// TODO: really TermsHashPerField should take over most 	TokenNameCOMMENT_LINE	TODO: really TermsHashPerField should take over most 
// of this loop, including merge sort of terms from 	TokenNameCOMMENT_LINE	of this loop, including merge sort of terms from 
// multiple threads and interacting with the 	TokenNameCOMMENT_LINE	multiple threads and interacting with the 
// TermsConsumer, only calling out to us (passing us the 	TokenNameCOMMENT_LINE	TermsConsumer, only calling out to us (passing us the 
// DocsConsumer) to handle delivery of docs/positions 	TokenNameCOMMENT_LINE	DocsConsumer) to handle delivery of docs/positions 
while	TokenNamewhile	
(	TokenNameLPAREN	
numFields	TokenNameIdentifier	 num Fields
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the next term to merge 	TokenNameCOMMENT_LINE	Get the next term to merge 
termStates	TokenNameIdentifier	 term States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
mergeStates	TokenNameIdentifier	 merge States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
numToMerge	TokenNameIdentifier	 num To Merge
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// TODO: pqueue 	TokenNameCOMMENT_LINE	TODO: pqueue 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numFields	TokenNameIdentifier	 num Fields
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
mergeStates	TokenNameIdentifier	 merge States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
textOffset	TokenNameIdentifier	 text Offset
=	TokenNameEQUAL	
mergeStates	TokenNameIdentifier	 merge States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
textOffset	TokenNameIdentifier	 text Offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
compareText	TokenNameIdentifier	 compare Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
textOffset	TokenNameIdentifier	 text Offset
,	TokenNameCOMMA	
termStates	TokenNameIdentifier	 term States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
termStates	TokenNameIdentifier	 term States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
textOffset	TokenNameIdentifier	 text Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termStates	TokenNameIdentifier	 term States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
mergeStates	TokenNameIdentifier	 merge States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
numToMerge	TokenNameIdentifier	 num To Merge
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
termStates	TokenNameIdentifier	 term States
[	TokenNameLBRACKET	
numToMerge	TokenNameIdentifier	 num To Merge
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
mergeStates	TokenNameIdentifier	 merge States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
FormatPostingsDocsConsumer	TokenNameIdentifier	 Format Postings Docs Consumer
docConsumer	TokenNameIdentifier	 doc Consumer
=	TokenNameEQUAL	
termsConsumer	TokenNameIdentifier	 terms Consumer
.	TokenNameDOT	
addTerm	TokenNameIdentifier	 add Term
(	TokenNameLPAREN	
termStates	TokenNameIdentifier	 term States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
termStates	TokenNameIdentifier	 term States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
textOffset	TokenNameIdentifier	 text Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
delDocLimit	TokenNameIdentifier	 del Doc Limit
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segDeletes	TokenNameIdentifier	 seg Deletes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
docIDUpto	TokenNameIdentifier	 doc ID Upto
=	TokenNameEQUAL	
segDeletes	TokenNameIdentifier	 seg Deletes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
protoTerm	TokenNameIdentifier	 proto Term
.	TokenNameDOT	
createTerm	TokenNameIdentifier	 create Term
(	TokenNameLPAREN	
termStates	TokenNameIdentifier	 term States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
termText	TokenNameIdentifier	 term Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docIDUpto	TokenNameIdentifier	 doc ID Upto
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delDocLimit	TokenNameIdentifier	 del Doc Limit
=	TokenNameEQUAL	
docIDUpto	TokenNameIdentifier	 doc ID Upto
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
delDocLimit	TokenNameIdentifier	 del Doc Limit
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
delDocLimit	TokenNameIdentifier	 del Doc Limit
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Now termStates has numToMerge FieldMergeStates 	TokenNameCOMMENT_LINE	Now termStates has numToMerge FieldMergeStates 
// which all share the same term. Now we must 	TokenNameCOMMENT_LINE	which all share the same term. Now we must 
// interleave the docID streams. 	TokenNameCOMMENT_LINE	interleave the docID streams. 
while	TokenNamewhile	
(	TokenNameLPAREN	
numToMerge	TokenNameIdentifier	 num To Merge
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FreqProxFieldMergeState	TokenNameIdentifier	 Freq Prox Field Merge State
minState	TokenNameIdentifier	 min State
=	TokenNameEQUAL	
termStates	TokenNameIdentifier	 term States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numToMerge	TokenNameIdentifier	 num To Merge
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
termStates	TokenNameIdentifier	 term States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
<	TokenNameLESS	
minState	TokenNameIdentifier	 min State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
minState	TokenNameIdentifier	 min State
=	TokenNameEQUAL	
termStates	TokenNameIdentifier	 term States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
termDocFreq	TokenNameIdentifier	 term Doc Freq
=	TokenNameEQUAL	
minState	TokenNameIdentifier	 min State
.	TokenNameDOT	
termFreq	TokenNameIdentifier	 term Freq
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FormatPostingsPositionsConsumer	TokenNameIdentifier	 Format Postings Positions Consumer
posConsumer	TokenNameIdentifier	 pos Consumer
=	TokenNameEQUAL	
docConsumer	TokenNameIdentifier	 doc Consumer
.	TokenNameDOT	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
minState	TokenNameIdentifier	 min State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
,	TokenNameCOMMA	
termDocFreq	TokenNameIdentifier	 term Doc Freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NOTE: we could check here if the docID was 	TokenNameCOMMENT_LINE	NOTE: we could check here if the docID was 
// deleted, and skip it. However, this is somewhat 	TokenNameCOMMENT_LINE	deleted, and skip it. However, this is somewhat 
// dangerous because it can yield non-deterministic 	TokenNameCOMMENT_LINE	dangerous because it can yield non-deterministic 
// behavior since we may see the docID before we see 	TokenNameCOMMENT_LINE	behavior since we may see the docID before we see 
// the term that caused it to be deleted. This 	TokenNameCOMMENT_LINE	the term that caused it to be deleted. This 
// would mean some (but not all) of its postings may 	TokenNameCOMMENT_LINE	would mean some (but not all) of its postings may 
// make it into the index, which'd alter the docFreq 	TokenNameCOMMENT_LINE	make it into the index, which'd alter the docFreq 
// for those terms. We could fix this by doing two 	TokenNameCOMMENT_LINE	for those terms. We could fix this by doing two 
// passes, ie first sweep marks all del docs, and 	TokenNameCOMMENT_LINE	passes, ie first sweep marks all del docs, and 
// 2nd sweep does the real flush, but I suspect 	TokenNameCOMMENT_LINE	2nd sweep does the real flush, but I suspect 
// that'd add too much time to flush. 	TokenNameCOMMENT_LINE	that'd add too much time to flush. 
if	TokenNameif	
(	TokenNameLPAREN	
minState	TokenNameIdentifier	 min State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
<	TokenNameLESS	
delDocLimit	TokenNameIdentifier	 del Doc Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Mark it deleted. TODO: we could also skip 	TokenNameCOMMENT_LINE	Mark it deleted. TODO: we could also skip 
// writing its postings; this would be 	TokenNameCOMMENT_LINE	writing its postings; this would be 
// deterministic (just for this Term's docs). 	TokenNameCOMMENT_LINE	deterministic (just for this Term's docs). 
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
deletedDocs	TokenNameIdentifier	 deleted Docs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
deletedDocs	TokenNameIdentifier	 deleted Docs
=	TokenNameEQUAL	
new	TokenNamenew	
BitVector	TokenNameIdentifier	 Bit Vector
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
deletedDocs	TokenNameIdentifier	 deleted Docs
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
minState	TokenNameIdentifier	 min State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
ByteSliceReader	TokenNameIdentifier	 Byte Slice Reader
prox	TokenNameIdentifier	 prox
=	TokenNameEQUAL	
minState	TokenNameIdentifier	 min State
.	TokenNameDOT	
prox	TokenNameIdentifier	 prox
;	TokenNameSEMICOLON	
// Carefully copy over the prox + payload info, 	TokenNameCOMMENT_LINE	Carefully copy over the prox + payload info, 
// changing the format to match Lucene's segment 	TokenNameCOMMENT_LINE	changing the format to match Lucene's segment 
// format. 	TokenNameCOMMENT_LINE	format. 
if	TokenNameif	
(	TokenNameLPAREN	
currentFieldIndexOptions	TokenNameIdentifier	 current Field Index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// omitTermFreqAndPositions == false so we do write positions & 	TokenNameCOMMENT_LINE	omitTermFreqAndPositions == false so we do write positions & 
// payload 	TokenNameCOMMENT_LINE	payload 
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
termDocFreq	TokenNameIdentifier	 term Doc Freq
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
prox	TokenNameIdentifier	 prox
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
+=	TokenNamePLUS_EQUAL	
code	TokenNameIdentifier	 code
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
payloadLength	TokenNameIdentifier	 payload Length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This position has a payload 	TokenNameCOMMENT_LINE	This position has a payload 
payloadLength	TokenNameIdentifier	 payload Length
=	TokenNameEQUAL	
prox	TokenNameIdentifier	 prox
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
payloadBuffer	TokenNameIdentifier	 payload Buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
payloadBuffer	TokenNameIdentifier	 payload Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
payloadLength	TokenNameIdentifier	 payload Length
)	TokenNameRPAREN	
payloadBuffer	TokenNameIdentifier	 payload Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
payloadLength	TokenNameIdentifier	 payload Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
prox	TokenNameIdentifier	 prox
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
payloadBuffer	TokenNameIdentifier	 payload Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
payloadLength	TokenNameIdentifier	 payload Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
payloadLength	TokenNameIdentifier	 payload Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
posConsumer	TokenNameIdentifier	 pos Consumer
.	TokenNameDOT	
addPosition	TokenNameIdentifier	 add Position
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
payloadBuffer	TokenNameIdentifier	 payload Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
payloadLength	TokenNameIdentifier	 payload Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//End for 	TokenNameCOMMENT_LINE	End for 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
posConsumer	TokenNameIdentifier	 pos Consumer
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
minState	TokenNameIdentifier	 min State
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Remove from termStates 	TokenNameCOMMENT_LINE	Remove from termStates 
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
numToMerge	TokenNameIdentifier	 num To Merge
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
termStates	TokenNameIdentifier	 term States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
minState	TokenNameIdentifier	 min State
)	TokenNameRPAREN	
termStates	TokenNameIdentifier	 term States
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
termStates	TokenNameIdentifier	 term States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
numToMerge	TokenNameIdentifier	 num To Merge
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
numToMerge	TokenNameIdentifier	 num To Merge
;	TokenNameSEMICOLON	
// Advance this state to the next term 	TokenNameCOMMENT_LINE	Advance this state to the next term 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
minState	TokenNameIdentifier	 min State
.	TokenNameDOT	
nextTerm	TokenNameIdentifier	 next Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// OK, no more terms, so remove from mergeStates 	TokenNameCOMMENT_LINE	OK, no more terms, so remove from mergeStates 
// as well 	TokenNameCOMMENT_LINE	as well 
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
numFields	TokenNameIdentifier	 num Fields
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
mergeStates	TokenNameIdentifier	 merge States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
minState	TokenNameIdentifier	 min State
)	TokenNameRPAREN	
mergeStates	TokenNameIdentifier	 merge States
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
mergeStates	TokenNameIdentifier	 merge States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
numFields	TokenNameIdentifier	 num Fields
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
numFields	TokenNameIdentifier	 num Fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
docConsumer	TokenNameIdentifier	 doc Consumer
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
termsConsumer	TokenNameIdentifier	 terms Consumer
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
termsUTF8	TokenNameIdentifier	 terms UT F8
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
