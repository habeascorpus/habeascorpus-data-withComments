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
/** Used by DocumentsWriter to maintain per-thread state. * We keep a separate Posting hash and other state for each * thread and then merge postings hashes from all threads * when writing the segment. */	TokenNameCOMMENT_JAVADOC	 Used by DocumentsWriter to maintain per-thread state. We keep a separate Posting hash and other state for each thread and then merge postings hashes from all threads when writing the segment. 
final	TokenNamefinal	
class	TokenNameclass	
DocumentsWriterThreadState	TokenNameIdentifier	 Documents Writer Thread State
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isIdle	TokenNameIdentifier	 is Idle
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// false if this is currently in use by a thread 	TokenNameCOMMENT_LINE	false if this is currently in use by a thread 
int	TokenNameint	
numThreads	TokenNameIdentifier	 num Threads
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Number of threads that share this instance 	TokenNameCOMMENT_LINE	Number of threads that share this instance 
final	TokenNamefinal	
DocConsumerPerThread	TokenNameIdentifier	 Doc Consumer Per Thread
consumer	TokenNameIdentifier	 consumer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocState	TokenNameIdentifier	 Doc State
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
docWriter	TokenNameIdentifier	 doc Writer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DocumentsWriterThreadState	TokenNameIdentifier	 Documents Writer Thread State
(	TokenNameLPAREN	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
docWriter	TokenNameIdentifier	 doc Writer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
docWriter	TokenNameIdentifier	 doc Writer
=	TokenNameEQUAL	
docWriter	TokenNameIdentifier	 doc Writer
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
=	TokenNameEQUAL	
new	TokenNamenew	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocState	TokenNameIdentifier	 Doc State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
maxFieldLength	TokenNameIdentifier	 max Field Length
=	TokenNameEQUAL	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
maxFieldLength	TokenNameIdentifier	 max Field Length
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
infoStream	TokenNameIdentifier	 info Stream
=	TokenNameEQUAL	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
infoStream	TokenNameIdentifier	 info Stream
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
similarity	TokenNameIdentifier	 similarity
=	TokenNameEQUAL	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docWriter	TokenNameIdentifier	 doc Writer
=	TokenNameEQUAL	
docWriter	TokenNameIdentifier	 doc Writer
;	TokenNameSEMICOLON	
consumer	TokenNameIdentifier	 consumer
=	TokenNameEQUAL	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
addThread	TokenNameIdentifier	 add Thread
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
doAfterFlush	TokenNameIdentifier	 do After Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numThreads	TokenNameIdentifier	 num Threads
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
