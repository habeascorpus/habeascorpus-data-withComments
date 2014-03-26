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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
/** * This is a DocConsumer that gathers all fields under the * same name, and calls per-field consumers to process field * by field. This class doesn't doesn't do any "real" work * of its own: it just forwards the fields to a * DocFieldConsumer. */	TokenNameCOMMENT_JAVADOC	 This is a DocConsumer that gathers all fields under the same name, and calls per-field consumers to process field by field. This class doesn't doesn't do any "real" work of its own: it just forwards the fields to a DocFieldConsumer. 
final	TokenNamefinal	
class	TokenNameclass	
DocFieldProcessor	TokenNameIdentifier	 Doc Field Processor
extends	TokenNameextends	
DocConsumer	TokenNameIdentifier	 Doc Consumer
{	TokenNameLBRACE	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
docWriter	TokenNameIdentifier	 doc Writer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocFieldConsumer	TokenNameIdentifier	 Doc Field Consumer
consumer	TokenNameIdentifier	 consumer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
StoredFieldsWriter	TokenNameIdentifier	 Stored Fields Writer
fieldsWriter	TokenNameIdentifier	 fields Writer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DocFieldProcessor	TokenNameIdentifier	 Doc Field Processor
(	TokenNameLPAREN	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
docWriter	TokenNameIdentifier	 doc Writer
,	TokenNameCOMMA	
DocFieldConsumer	TokenNameIdentifier	 Doc Field Consumer
consumer	TokenNameIdentifier	 consumer
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
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
getFieldInfos	TokenNameIdentifier	 get Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
setFieldInfos	TokenNameIdentifier	 set Field Infos
(	TokenNameLPAREN	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsWriter	TokenNameIdentifier	 fields Writer
=	TokenNameEQUAL	
new	TokenNamenew	
StoredFieldsWriter	TokenNameIdentifier	 Stored Fields Writer
(	TokenNameLPAREN	
docWriter	TokenNameIdentifier	 doc Writer
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
DocConsumerPerThread	TokenNameIdentifier	 Doc Consumer Per Thread
>	TokenNameGREATER	
threads	TokenNameIdentifier	 threads
,	TokenNameCOMMA	
SegmentWriteState	TokenNameIdentifier	 Segment Write State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
DocFieldConsumerPerThread	TokenNameIdentifier	 Doc Field Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
DocFieldConsumerPerField	TokenNameIdentifier	 Doc Field Consumer Per Field
>>	TokenNameRIGHT_SHIFT	
childThreadsAndFields	TokenNameIdentifier	 child Threads And Fields
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
DocFieldConsumerPerThread	TokenNameIdentifier	 Doc Field Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
DocFieldConsumerPerField	TokenNameIdentifier	 Doc Field Consumer Per Field
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
DocConsumerPerThread	TokenNameIdentifier	 Doc Consumer Per Thread
thread	TokenNameIdentifier	 thread
:	TokenNameCOLON	
threads	TokenNameIdentifier	 threads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocFieldProcessorPerThread	TokenNameIdentifier	 Doc Field Processor Per Thread
perThread	TokenNameIdentifier	 per Thread
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocFieldProcessorPerThread	TokenNameIdentifier	 Doc Field Processor Per Thread
)	TokenNameRPAREN	
thread	TokenNameIdentifier	 thread
;	TokenNameSEMICOLON	
childThreadsAndFields	TokenNameIdentifier	 child Threads And Fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
,	TokenNameCOMMA	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
trimFields	TokenNameIdentifier	 trim Fields
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
childThreadsAndFields	TokenNameIdentifier	 child Threads And Fields
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Important to save after asking consumer to flush so 	TokenNameCOMMENT_LINE	Important to save after asking consumer to flush so 
// consumer can alter the FieldInfo* if necessary. EG, 	TokenNameCOMMENT_LINE	consumer can alter the FieldInfo* if necessary. EG, 
// FreqProxTermsWriter does this with 	TokenNameCOMMENT_LINE	FreqProxTermsWriter does this with 
// FieldInfo.storePayload. 	TokenNameCOMMENT_LINE	FieldInfo.storePayload. 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
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
FIELD_INFOS_EXTENSION	TokenNameIdentifier	 FIELD  INFOS  EXTENSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
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
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
consumer	TokenNameIdentifier	 consumer
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
DocConsumerPerThread	TokenNameIdentifier	 Doc Consumer Per Thread
addThread	TokenNameIdentifier	 add Thread
(	TokenNameLPAREN	
DocumentsWriterThreadState	TokenNameIdentifier	 Documents Writer Thread State
threadState	TokenNameIdentifier	 thread State
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DocFieldProcessorPerThread	TokenNameIdentifier	 Doc Field Processor Per Thread
(	TokenNameLPAREN	
threadState	TokenNameIdentifier	 thread State
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
