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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
class	TokenNameclass	
InvertedDocConsumer	TokenNameIdentifier	 Inverted Doc Consumer
{	TokenNameLBRACE	
/** Add a new thread */	TokenNameCOMMENT_JAVADOC	 Add a new thread 
abstract	TokenNameabstract	
InvertedDocConsumerPerThread	TokenNameIdentifier	 Inverted Doc Consumer Per Thread
addThread	TokenNameIdentifier	 add Thread
(	TokenNameLPAREN	
DocInverterPerThread	TokenNameIdentifier	 Doc Inverter Per Thread
docInverterPerThread	TokenNameIdentifier	 doc Inverter Per Thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Abort (called after hitting AbortException) */	TokenNameCOMMENT_JAVADOC	 Abort (called after hitting AbortException) 
abstract	TokenNameabstract	
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Flush a new segment */	TokenNameCOMMENT_JAVADOC	 Flush a new segment 
abstract	TokenNameabstract	
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
SegmentWriteState	TokenNameIdentifier	 Segment Write State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Attempt to free RAM, returning true if any RAM was * freed */	TokenNameCOMMENT_JAVADOC	 Attempt to free RAM, returning true if any RAM was freed 
abstract	TokenNameabstract	
boolean	TokenNameboolean	
freeRAM	TokenNameIdentifier	 free RAM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
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
}	TokenNameRBRACE	
