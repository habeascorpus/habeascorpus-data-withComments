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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** This class implements {@link InvertedDocConsumer}, which * is passed each token produced by the analyzer on each * field. It stores these tokens in a hash table, and * allocates separate byte streams per token. Consumers of * this class, eg {@link FreqProxTermsWriter} and {@link * TermVectorsTermsWriter}, write their own byte streams * under each term. */	TokenNameCOMMENT_JAVADOC	 This class implements {@link InvertedDocConsumer}, which is passed each token produced by the analyzer on each field. It stores these tokens in a hash table, and allocates separate byte streams per token. Consumers of this class, eg {@link FreqProxTermsWriter} and {@link TermVectorsTermsWriter}, write their own byte streams under each term. 
final	TokenNamefinal	
class	TokenNameclass	
TermsHash	TokenNameIdentifier	 Terms Hash
extends	TokenNameextends	
InvertedDocConsumer	TokenNameIdentifier	 Inverted Doc Consumer
{	TokenNameLBRACE	
final	TokenNamefinal	
TermsHashConsumer	TokenNameIdentifier	 Terms Hash Consumer
consumer	TokenNameIdentifier	 consumer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermsHash	TokenNameIdentifier	 Terms Hash
nextTermsHash	TokenNameIdentifier	 next Terms Hash
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
docWriter	TokenNameIdentifier	 doc Writer
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
trackAllocations	TokenNameIdentifier	 track Allocations
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TermsHash	TokenNameIdentifier	 Terms Hash
(	TokenNameLPAREN	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
docWriter	TokenNameIdentifier	 doc Writer
,	TokenNameCOMMA	
boolean	TokenNameboolean	
trackAllocations	TokenNameIdentifier	 track Allocations
,	TokenNameCOMMA	
final	TokenNamefinal	
TermsHashConsumer	TokenNameIdentifier	 Terms Hash Consumer
consumer	TokenNameIdentifier	 consumer
,	TokenNameCOMMA	
final	TokenNamefinal	
TermsHash	TokenNameIdentifier	 Terms Hash
nextTermsHash	TokenNameIdentifier	 next Terms Hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
docWriter	TokenNameIdentifier	 doc Writer
=	TokenNameEQUAL	
docWriter	TokenNameIdentifier	 doc Writer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
=	TokenNameEQUAL	
consumer	TokenNameIdentifier	 consumer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nextTermsHash	TokenNameIdentifier	 next Terms Hash
=	TokenNameEQUAL	
nextTermsHash	TokenNameIdentifier	 next Terms Hash
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
trackAllocations	TokenNameIdentifier	 track Allocations
=	TokenNameEQUAL	
trackAllocations	TokenNameIdentifier	 track Allocations
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
InvertedDocConsumerPerThread	TokenNameIdentifier	 Inverted Doc Consumer Per Thread
addThread	TokenNameIdentifier	 add Thread
(	TokenNameLPAREN	
DocInverterPerThread	TokenNameIdentifier	 Doc Inverter Per Thread
docInverterPerThread	TokenNameIdentifier	 doc Inverter Per Thread
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
(	TokenNameLPAREN	
docInverterPerThread	TokenNameIdentifier	 doc Inverter Per Thread
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
nextTermsHash	TokenNameIdentifier	 next Terms Hash
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
addThread	TokenNameIdentifier	 add Thread
(	TokenNameLPAREN	
DocInverterPerThread	TokenNameIdentifier	 Doc Inverter Per Thread
docInverterPerThread	TokenNameIdentifier	 doc Inverter Per Thread
,	TokenNameCOMMA	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
primaryPerThread	TokenNameIdentifier	 primary Per Thread
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
(	TokenNameLPAREN	
docInverterPerThread	TokenNameIdentifier	 doc Inverter Per Thread
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
nextTermsHash	TokenNameIdentifier	 next Terms Hash
,	TokenNameCOMMA	
primaryPerThread	TokenNameIdentifier	 primary Per Thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
setFieldInfos	TokenNameIdentifier	 set Field Infos
(	TokenNameLPAREN	
fieldInfos	TokenNameIdentifier	 field Infos
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
try	TokenNametry	
{	TokenNameLBRACE	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nextTermsHash	TokenNameIdentifier	 next Terms Hash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextTermsHash	TokenNameIdentifier	 next Terms Hash
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InvertedDocConsumerPerThread	TokenNameIdentifier	 Inverted Doc Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InvertedDocConsumerPerField	TokenNameIdentifier	 Inverted Doc Consumer Per Field
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
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
TermsHashConsumerPerThread	TokenNameIdentifier	 Terms Hash Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
>>	TokenNameRIGHT_SHIFT	
childThreadsAndFields	TokenNameIdentifier	 child Threads And Fields
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
TermsHashConsumerPerThread	TokenNameIdentifier	 Terms Hash Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InvertedDocConsumerPerThread	TokenNameIdentifier	 Inverted Doc Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InvertedDocConsumerPerField	TokenNameIdentifier	 Inverted Doc Consumer Per Field
>>	TokenNameRIGHT_SHIFT	
nextThreadsAndFields	TokenNameIdentifier	 next Threads And Fields
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextTermsHash	TokenNameIdentifier	 next Terms Hash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nextThreadsAndFields	TokenNameIdentifier	 next Threads And Fields
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
InvertedDocConsumerPerThread	TokenNameIdentifier	 Inverted Doc Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InvertedDocConsumerPerField	TokenNameIdentifier	 Inverted Doc Consumer Per Field
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
nextThreadsAndFields	TokenNameIdentifier	 next Threads And Fields
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
InvertedDocConsumerPerThread	TokenNameIdentifier	 Inverted Doc Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InvertedDocConsumerPerField	TokenNameIdentifier	 Inverted Doc Consumer Per Field
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
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
perThread	TokenNameIdentifier	 per Thread
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InvertedDocConsumerPerField	TokenNameIdentifier	 Inverted Doc Consumer Per Field
>	TokenNameGREATER	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
InvertedDocConsumerPerField	TokenNameIdentifier	 Inverted Doc Consumer Per Field
>	TokenNameGREATER	
fieldsIt	TokenNameIdentifier	 fields It
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
>	TokenNameGREATER	
childFields	TokenNameIdentifier	 child Fields
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InvertedDocConsumerPerField	TokenNameIdentifier	 Inverted Doc Consumer Per Field
>	TokenNameGREATER	
nextChildFields	TokenNameIdentifier	 next Child Fields
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextTermsHash	TokenNameIdentifier	 next Terms Hash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nextChildFields	TokenNameIdentifier	 next Child Fields
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
InvertedDocConsumerPerField	TokenNameIdentifier	 Inverted Doc Consumer Per Field
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
nextChildFields	TokenNameIdentifier	 next Child Fields
=	TokenNameEQUAL	
null	TokenNamenull	
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
TermsHashPerField	TokenNameIdentifier	 Terms Hash Per Field
perField	TokenNameIdentifier	 per Field
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermsHashPerField	TokenNameIdentifier	 Terms Hash Per Field
)	TokenNameRPAREN	
fieldsIt	TokenNameIdentifier	 fields It
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childFields	TokenNameIdentifier	 child Fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextTermsHash	TokenNameIdentifier	 next Terms Hash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nextChildFields	TokenNameIdentifier	 next Child Fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
nextPerField	TokenNameIdentifier	 next Per Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
childThreadsAndFields	TokenNameIdentifier	 child Threads And Fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
,	TokenNameCOMMA	
childFields	TokenNameIdentifier	 child Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextTermsHash	TokenNameIdentifier	 next Terms Hash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nextThreadsAndFields	TokenNameIdentifier	 next Threads And Fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
nextPerThread	TokenNameIdentifier	 next Per Thread
,	TokenNameCOMMA	
nextChildFields	TokenNameIdentifier	 next Child Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
childThreadsAndFields	TokenNameIdentifier	 child Threads And Fields
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextTermsHash	TokenNameIdentifier	 next Terms Hash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nextTermsHash	TokenNameIdentifier	 next Terms Hash
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
nextThreadsAndFields	TokenNameIdentifier	 next Threads And Fields
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
synchronized	TokenNamesynchronized	
public	TokenNamepublic	
boolean	TokenNameboolean	
freeRAM	TokenNameIdentifier	 free RAM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
