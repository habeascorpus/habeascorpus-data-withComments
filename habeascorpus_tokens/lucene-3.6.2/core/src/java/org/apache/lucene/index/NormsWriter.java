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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Similarity	TokenNameIdentifier	 Similarity
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
// TODO FI: norms could actually be stored as doc store 	TokenNameCOMMENT_LINE	TODO FI: norms could actually be stored as doc store 
/** Writes norms. Each thread X field accumulates the norms * for the doc/fields it saw, then the flush method below * merges all of these together into a single _X.nrm file. */	TokenNameCOMMENT_JAVADOC	 Writes norms. Each thread X field accumulates the norms for the doc/fields it saw, then the flush method below merges all of these together into a single _X.nrm file. 
final	TokenNamefinal	
class	TokenNameclass	
NormsWriter	TokenNameIdentifier	 Norms Writer
extends	TokenNameextends	
InvertedDocEndConsumer	TokenNameIdentifier	 Inverted Doc End Consumer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
byte	TokenNamebyte	
defaultNorm	TokenNameIdentifier	 default Norm
=	TokenNameEQUAL	
Similarity	TokenNameIdentifier	 Similarity
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
encodeNormValue	TokenNameIdentifier	 encode Norm Value
(	TokenNameLPAREN	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
InvertedDocEndConsumerPerThread	TokenNameIdentifier	 Inverted Doc End Consumer Per Thread
addThread	TokenNameIdentifier	 add Thread
(	TokenNameLPAREN	
DocInverterPerThread	TokenNameIdentifier	 Doc Inverter Per Thread
docInverterPerThread	TokenNameIdentifier	 doc Inverter Per Thread
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NormsWriterPerThread	TokenNameIdentifier	 Norms Writer Per Thread
(	TokenNameLPAREN	
docInverterPerThread	TokenNameIdentifier	 doc Inverter Per Thread
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// We only write the _X.nrm file at flush 	TokenNameCOMMENT_LINE	We only write the _X.nrm file at flush 
void	TokenNamevoid	
files	TokenNameIdentifier	 files
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
setFieldInfos	TokenNameIdentifier	 set Field Infos
(	TokenNameLPAREN	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Produce _X.nrm if any document had a field with norms * not disabled */	TokenNameCOMMENT_JAVADOC	 Produce _X.nrm if any document had a field with norms not disabled 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InvertedDocEndConsumerPerThread	TokenNameIdentifier	 Inverted Doc End Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InvertedDocEndConsumerPerField	TokenNameIdentifier	 Inverted Doc End Consumer Per Field
>>	TokenNameRIGHT_SHIFT	
threadsAndFields	TokenNameIdentifier	 threads And Fields
,	TokenNameCOMMA	
SegmentWriteState	TokenNameIdentifier	 Segment Write State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
FieldInfo	TokenNameIdentifier	 Field Info
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
NormsWriterPerField	TokenNameIdentifier	 Norms Writer Per Field
>>	TokenNameRIGHT_SHIFT	
byField	TokenNameIdentifier	 by Field
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
FieldInfo	TokenNameIdentifier	 Field Info
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
NormsWriterPerField	TokenNameIdentifier	 Norms Writer Per Field
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Typically, each thread will have encountered the same 	TokenNameCOMMENT_LINE	Typically, each thread will have encountered the same 
// field. So first we collate by field, ie, all 	TokenNameCOMMENT_LINE	field. So first we collate by field, ie, all 
// per-thread field instances that correspond to the 	TokenNameCOMMENT_LINE	per-thread field instances that correspond to the 
// same FieldInfo 	TokenNameCOMMENT_LINE	same FieldInfo 
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
InvertedDocEndConsumerPerThread	TokenNameIdentifier	 Inverted Doc End Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InvertedDocEndConsumerPerField	TokenNameIdentifier	 Inverted Doc End Consumer Per Field
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
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InvertedDocEndConsumerPerField	TokenNameIdentifier	 Inverted Doc End Consumer Per Field
>	TokenNameGREATER	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
InvertedDocEndConsumerPerField	TokenNameIdentifier	 Inverted Doc End Consumer Per Field
>	TokenNameGREATER	
fieldsIt	TokenNameIdentifier	 fields It
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
fieldsIt	TokenNameIdentifier	 fields It
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
NormsWriterPerField	TokenNameIdentifier	 Norms Writer Per Field
perField	TokenNameIdentifier	 per Field
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NormsWriterPerField	TokenNameIdentifier	 Norms Writer Per Field
)	TokenNameRPAREN	
fieldsIt	TokenNameIdentifier	 fields It
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
upto	TokenNameIdentifier	 upto
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// It has some norms 	TokenNameCOMMENT_LINE	It has some norms 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
NormsWriterPerField	TokenNameIdentifier	 Norms Writer Per Field
>	TokenNameGREATER	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
byField	TokenNameIdentifier	 by Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
NormsWriterPerField	TokenNameIdentifier	 Norms Writer Per Field
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byField	TokenNameIdentifier	 by Field
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
perField	TokenNameIdentifier	 per Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// Remove this field since we haven't seen it 	TokenNameCOMMENT_LINE	Remove this field since we haven't seen it 
// since the previous flush 	TokenNameCOMMENT_LINE	since the previous flush 
fieldsIt	TokenNameIdentifier	 fields It
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
normsFileName	TokenNameIdentifier	 norms File Name
=	TokenNameEQUAL	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
segmentName	TokenNameIdentifier	 segment Name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
NORMS_EXTENSION	TokenNameIdentifier	 NORMS  EXTENSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexOutput	TokenNameIdentifier	 Index Output
normsOut	TokenNameIdentifier	 norms Out
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
normsFileName	TokenNameIdentifier	 norms File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
normsOut	TokenNameIdentifier	 norms Out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
SegmentNorms	TokenNameIdentifier	 Segment Norms
.	TokenNameDOT	
NORMS_HEADER	TokenNameIdentifier	 NORMS  HEADER
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SegmentNorms	TokenNameIdentifier	 Segment Norms
.	TokenNameDOT	
NORMS_HEADER	TokenNameIdentifier	 NORMS  HEADER
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numField	TokenNameIdentifier	 num Field
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
normCount	TokenNameIdentifier	 norm Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
fieldNumber	TokenNameIdentifier	 field Number
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fieldNumber	TokenNameIdentifier	 field Number
<	TokenNameLESS	
numField	TokenNameIdentifier	 num Field
;	TokenNameSEMICOLON	
fieldNumber	TokenNameIdentifier	 field Number
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
fieldNumber	TokenNameIdentifier	 field Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
NormsWriterPerField	TokenNameIdentifier	 Norms Writer Per Field
>	TokenNameGREATER	
toMerge	TokenNameIdentifier	 to Merge
=	TokenNameEQUAL	
byField	TokenNameIdentifier	 by Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
toMerge	TokenNameIdentifier	 to Merge
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
numFields	TokenNameIdentifier	 num Fields
=	TokenNameEQUAL	
toMerge	TokenNameIdentifier	 to Merge
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
normCount	TokenNameIdentifier	 norm Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
NormsWriterPerField	TokenNameIdentifier	 Norms Writer Per Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
NormsWriterPerField	TokenNameIdentifier	 Norms Writer Per Field
[	TokenNameLBRACKET	
numFields	TokenNameIdentifier	 num Fields
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
uptos	TokenNameIdentifier	 uptos
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numFields	TokenNameIdentifier	 num Fields
]	TokenNameRBRACKET	
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
numFields	TokenNameIdentifier	 num Fields
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
toMerge	TokenNameIdentifier	 to Merge
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numLeft	TokenNameIdentifier	 num Left
=	TokenNameEQUAL	
numFields	TokenNameIdentifier	 num Fields
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
numLeft	TokenNameIdentifier	 num Left
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
uptos	TokenNameIdentifier	 uptos
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
docIDs	TokenNameIdentifier	 doc I Ds
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
" uptos[0]="	TokenNameStringLiteral	 uptos[0]=
+	TokenNamePLUS	
uptos	TokenNameIdentifier	 uptos
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" len="	TokenNameStringLiteral	 len=
+	TokenNamePLUS	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
docIDs	TokenNameIdentifier	 doc I Ds
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
minLoc	TokenNameIdentifier	 min Loc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
minDocID	TokenNameIdentifier	 min Doc ID
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
docIDs	TokenNameIdentifier	 doc I Ds
[	TokenNameLBRACKET	
uptos	TokenNameIdentifier	 uptos
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
numLeft	TokenNameIdentifier	 num Left
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
docIDs	TokenNameIdentifier	 doc I Ds
[	TokenNameLBRACKET	
uptos	TokenNameIdentifier	 uptos
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docID	TokenNameIdentifier	 doc ID
<	TokenNameLESS	
minDocID	TokenNameIdentifier	 min Doc ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minDocID	TokenNameIdentifier	 min Doc ID
=	TokenNameEQUAL	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
minLoc	TokenNameIdentifier	 min Loc
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assert	TokenNameassert	
minDocID	TokenNameIdentifier	 min Doc ID
<	TokenNameLESS	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
// Fill hole 	TokenNameCOMMENT_LINE	Fill hole 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
<	TokenNameLESS	
minDocID	TokenNameIdentifier	 min Doc ID
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
normsOut	TokenNameIdentifier	 norms Out
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
defaultNorm	TokenNameIdentifier	 default Norm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
normsOut	TokenNameIdentifier	 norms Out
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
minLoc	TokenNameIdentifier	 min Loc
]	TokenNameRBRACKET	
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
[	TokenNameLBRACKET	
uptos	TokenNameIdentifier	 uptos
[	TokenNameLBRACKET	
minLoc	TokenNameIdentifier	 min Loc
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
uptos	TokenNameIdentifier	 uptos
[	TokenNameLBRACKET	
minLoc	TokenNameIdentifier	 min Loc
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uptos	TokenNameIdentifier	 uptos
[	TokenNameLBRACKET	
minLoc	TokenNameIdentifier	 min Loc
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
minLoc	TokenNameIdentifier	 min Loc
]	TokenNameRBRACKET	
.	TokenNameDOT	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
minLoc	TokenNameIdentifier	 min Loc
]	TokenNameRBRACKET	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minLoc	TokenNameIdentifier	 min Loc
!=	TokenNameNOT_EQUAL	
numLeft	TokenNameIdentifier	 num Left
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
minLoc	TokenNameIdentifier	 min Loc
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
numLeft	TokenNameIdentifier	 num Left
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
uptos	TokenNameIdentifier	 uptos
[	TokenNameLBRACKET	
minLoc	TokenNameIdentifier	 min Loc
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
uptos	TokenNameIdentifier	 uptos
[	TokenNameLBRACKET	
numLeft	TokenNameIdentifier	 num Left
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
numLeft	TokenNameIdentifier	 num Left
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Fill final hole with defaultNorm 	TokenNameCOMMENT_LINE	Fill final hole with defaultNorm 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
<	TokenNameLESS	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
normsOut	TokenNameIdentifier	 norms Out
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
defaultNorm	TokenNameIdentifier	 default Norm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
&&	TokenNameAND_AND	
!	TokenNameNOT	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
normCount	TokenNameIdentifier	 norm Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// Fill entire field with default norm: 	TokenNameCOMMENT_LINE	Fill entire field with default norm: 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
<	TokenNameLESS	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
normsOut	TokenNameIdentifier	 norms Out
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
defaultNorm	TokenNameIdentifier	 default Norm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
normCount	TokenNameIdentifier	 norm Count
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
==	TokenNameEQUAL_EQUAL	
normsOut	TokenNameIdentifier	 norms Out
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
".nrm file size mismatch: expected="	TokenNameStringLiteral	.nrm file size mismatch: expected=
+	TokenNamePLUS	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
normCount	TokenNameIdentifier	 norm Count
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
+	TokenNamePLUS	
" actual="	TokenNameStringLiteral	 actual=
+	TokenNamePLUS	
normsOut	TokenNameIdentifier	 norms Out
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
normsOut	TokenNameIdentifier	 norms Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
normsOut	TokenNameIdentifier	 norms Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
