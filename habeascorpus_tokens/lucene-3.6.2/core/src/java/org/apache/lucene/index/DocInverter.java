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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** This is a DocFieldConsumer that inverts each field, * separately, from a Document, and accepts a * InvertedTermsConsumer to process those terms. */	TokenNameCOMMENT_JAVADOC	 This is a DocFieldConsumer that inverts each field, separately, from a Document, and accepts a InvertedTermsConsumer to process those terms. 
final	TokenNamefinal	
class	TokenNameclass	
DocInverter	TokenNameIdentifier	 Doc Inverter
extends	TokenNameextends	
DocFieldConsumer	TokenNameIdentifier	 Doc Field Consumer
{	TokenNameLBRACE	
final	TokenNamefinal	
InvertedDocConsumer	TokenNameIdentifier	 Inverted Doc Consumer
consumer	TokenNameIdentifier	 consumer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
InvertedDocEndConsumer	TokenNameIdentifier	 Inverted Doc End Consumer
endConsumer	TokenNameIdentifier	 end Consumer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DocInverter	TokenNameIdentifier	 Doc Inverter
(	TokenNameLPAREN	
InvertedDocConsumer	TokenNameIdentifier	 Inverted Doc Consumer
consumer	TokenNameIdentifier	 consumer
,	TokenNameCOMMA	
InvertedDocEndConsumer	TokenNameIdentifier	 Inverted Doc End Consumer
endConsumer	TokenNameIdentifier	 end Consumer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
=	TokenNameEQUAL	
consumer	TokenNameIdentifier	 consumer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endConsumer	TokenNameIdentifier	 end Consumer
=	TokenNameEQUAL	
endConsumer	TokenNameIdentifier	 end Consumer
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
super	TokenNamesuper	
.	TokenNameDOT	
setFieldInfos	TokenNameIdentifier	 set Field Infos
(	TokenNameLPAREN	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
setFieldInfos	TokenNameIdentifier	 set Field Infos
(	TokenNameLPAREN	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endConsumer	TokenNameIdentifier	 end Consumer
.	TokenNameDOT	
setFieldInfos	TokenNameIdentifier	 set Field Infos
(	TokenNameLPAREN	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
DocFieldConsumerPerThread	TokenNameIdentifier	 Doc Field Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
DocFieldConsumerPerField	TokenNameIdentifier	 Doc Field Consumer Per Field
>>	TokenNameRIGHT_SHIFT	
threadsAndFields	TokenNameIdentifier	 threads And Fields
,	TokenNameCOMMA	
SegmentWriteState	TokenNameIdentifier	 Segment Write State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InvertedDocConsumerPerThread	TokenNameIdentifier	 Inverted Doc Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InvertedDocConsumerPerField	TokenNameIdentifier	 Inverted Doc Consumer Per Field
>>	TokenNameRIGHT_SHIFT	
childThreadsAndFields	TokenNameIdentifier	 child Threads And Fields
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
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InvertedDocEndConsumerPerThread	TokenNameIdentifier	 Inverted Doc End Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InvertedDocEndConsumerPerField	TokenNameIdentifier	 Inverted Doc End Consumer Per Field
>>	TokenNameRIGHT_SHIFT	
endChildThreadsAndFields	TokenNameIdentifier	 end Child Threads And Fields
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
InvertedDocEndConsumerPerThread	TokenNameIdentifier	 Inverted Doc End Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InvertedDocEndConsumerPerField	TokenNameIdentifier	 Inverted Doc End Consumer Per Field
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
DocFieldConsumerPerThread	TokenNameIdentifier	 Doc Field Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
DocFieldConsumerPerField	TokenNameIdentifier	 Doc Field Consumer Per Field
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
DocInverterPerThread	TokenNameIdentifier	 Doc Inverter Per Thread
perThread	TokenNameIdentifier	 per Thread
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocInverterPerThread	TokenNameIdentifier	 Doc Inverter Per Thread
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
childFields	TokenNameIdentifier	 child Fields
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
InvertedDocConsumerPerField	TokenNameIdentifier	 Inverted Doc Consumer Per Field
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InvertedDocEndConsumerPerField	TokenNameIdentifier	 Inverted Doc End Consumer Per Field
>	TokenNameGREATER	
endChildFields	TokenNameIdentifier	 end Child Fields
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
InvertedDocEndConsumerPerField	TokenNameIdentifier	 Inverted Doc End Consumer Per Field
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
DocFieldConsumerPerField	TokenNameIdentifier	 Doc Field Consumer Per Field
field	TokenNameIdentifier	 field
:	TokenNameCOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocInverterPerField	TokenNameIdentifier	 Doc Inverter Per Field
perField	TokenNameIdentifier	 per Field
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocInverterPerField	TokenNameIdentifier	 Doc Inverter Per Field
)	TokenNameRPAREN	
field	TokenNameIdentifier	 field
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
endChildFields	TokenNameIdentifier	 end Child Fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
endConsumer	TokenNameIdentifier	 end Consumer
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
endChildThreadsAndFields	TokenNameIdentifier	 end Child Threads And Fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
endConsumer	TokenNameIdentifier	 end Consumer
,	TokenNameCOMMA	
endChildFields	TokenNameIdentifier	 end Child Fields
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
endConsumer	TokenNameIdentifier	 end Consumer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
endChildThreadsAndFields	TokenNameIdentifier	 end Child Threads And Fields
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
endConsumer	TokenNameIdentifier	 end Consumer
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
freeRAM	TokenNameIdentifier	 free RAM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
freeRAM	TokenNameIdentifier	 free RAM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocFieldConsumerPerThread	TokenNameIdentifier	 Doc Field Consumer Per Thread
addThread	TokenNameIdentifier	 add Thread
(	TokenNameLPAREN	
DocFieldProcessorPerThread	TokenNameIdentifier	 Doc Field Processor Per Thread
docFieldProcessorPerThread	TokenNameIdentifier	 doc Field Processor Per Thread
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DocInverterPerThread	TokenNameIdentifier	 Doc Inverter Per Thread
(	TokenNameLPAREN	
docFieldProcessorPerThread	TokenNameIdentifier	 doc Field Processor Per Thread
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
