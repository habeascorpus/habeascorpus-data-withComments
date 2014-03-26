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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
;	TokenNameSEMICOLON	
/** * Provides a {@link ReaderPayloadProcessor} to be used for a {@link Directory}. * This allows using different {@link ReaderPayloadProcessor}s for different * source {@link IndexReader}, for e.g. to perform different processing of payloads of * different directories. * <p> * <b>NOTE:</b> to avoid processing payloads of certain directories, you can * return <code>null</code> in {@link #getReaderProcessor}. * <p> * <b>NOTE:</b> it is possible that the same {@link ReaderPayloadProcessor} will be * requested for the same {@link Directory} concurrently. Therefore, to avoid * concurrency issues you should return different instances for different * threads. Usually, if your {@link ReaderPayloadProcessor} does not maintain state * this is not a problem. The merge code ensures that the * {@link ReaderPayloadProcessor} instance you return will be accessed by one * thread to obtain the {@link PayloadProcessor}s for different terms. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Provides a {@link ReaderPayloadProcessor} to be used for a {@link Directory}. This allows using different {@link ReaderPayloadProcessor}s for different source {@link IndexReader}, for e.g. to perform different processing of payloads of different directories. <p> <b>NOTE:</b> to avoid processing payloads of certain directories, you can return <code>null</code> in {@link #getReaderProcessor}. <p> <b>NOTE:</b> it is possible that the same {@link ReaderPayloadProcessor} will be requested for the same {@link Directory} concurrently. Therefore, to avoid concurrency issues you should return different instances for different threads. Usually, if your {@link ReaderPayloadProcessor} does not maintain state this is not a problem. The merge code ensures that the {@link ReaderPayloadProcessor} instance you return will be accessed by one thread to obtain the {@link PayloadProcessor}s for different terms. * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
PayloadProcessorProvider	TokenNameIdentifier	 Payload Processor Provider
{	TokenNameLBRACE	
/** * Returns a {@link PayloadProcessor} for a given {@link Term} which allows * processing the payloads of different terms differently. If you intent to * process all your payloads the same way, then you can ignore the given term. * <p> * <b>NOTE:</b> if you protect your {@link ReaderPayloadProcessor} from * concurrency issues, then you shouldn't worry about any such issues when * {@link PayloadProcessor}s are requested for different terms. */	TokenNameCOMMENT_JAVADOC	 Returns a {@link PayloadProcessor} for a given {@link Term} which allows processing the payloads of different terms differently. If you intent to process all your payloads the same way, then you can ignore the given term. <p> <b>NOTE:</b> if you protect your {@link ReaderPayloadProcessor} from concurrency issues, then you shouldn't worry about any such issues when {@link PayloadProcessor}s are requested for different terms. 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
ReaderPayloadProcessor	TokenNameIdentifier	 Reader Payload Processor
{	TokenNameLBRACE	
/** Returns a {@link PayloadProcessor} for the given term. */	TokenNameCOMMENT_JAVADOC	 Returns a {@link PayloadProcessor} for the given term. 
public	TokenNamepublic	
abstract	TokenNameabstract	
PayloadProcessor	TokenNameIdentifier	 Payload Processor
getProcessor	TokenNameIdentifier	 get Processor
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated Use {@link ReaderPayloadProcessor} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Use {@link ReaderPayloadProcessor} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
DirPayloadProcessor	TokenNameIdentifier	 Dir Payload Processor
extends	TokenNameextends	
ReaderPayloadProcessor	TokenNameIdentifier	 Reader Payload Processor
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Processes the given payload. One should call {@link #payloadLength()} to * get the length of the processed payload. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Processes the given payload. One should call {@link #payloadLength()} to get the length of the processed payload. * @lucene.experimental 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
PayloadProcessor	TokenNameIdentifier	 Payload Processor
{	TokenNameLBRACE	
/** Returns the length of the payload that was returned by {@link #processPayload}. */	TokenNameCOMMENT_JAVADOC	 Returns the length of the payload that was returned by {@link #processPayload}. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
payloadLength	TokenNameIdentifier	 payload Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Process the incoming payload and returns the resulting byte[]. Note that * a new array might be allocated if the given array is not big enough. The * length of the new payload data can be obtained via * {@link #payloadLength()}. */	TokenNameCOMMENT_JAVADOC	 Process the incoming payload and returns the resulting byte[]. Note that a new array might be allocated if the given array is not big enough. The length of the new payload data can be obtained via {@link #payloadLength()}. 
public	TokenNamepublic	
abstract	TokenNameabstract	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
processPayload	TokenNameIdentifier	 process Payload
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
payload	TokenNameIdentifier	 payload
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a {@link ReaderPayloadProcessor} for the given {@link Directory}, * through which {@link PayloadProcessor}s can be obtained for each * {@link Term}, or <code>null</code> if none should be used. * You should override this method, not {@link #getDirProcessor}. */	TokenNameCOMMENT_JAVADOC	 Returns a {@link ReaderPayloadProcessor} for the given {@link Directory}, through which {@link PayloadProcessor}s can be obtained for each {@link Term}, or <code>null</code> if none should be used. You should override this method, not {@link #getDirProcessor}. 
public	TokenNamepublic	
ReaderPayloadProcessor	TokenNameIdentifier	 Reader Payload Processor
getReaderProcessor	TokenNameIdentifier	 get Reader Processor
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getDirProcessor	TokenNameIdentifier	 get Dir Processor
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a {@link DirPayloadProcessor} for the given {@link Directory}, * through which {@link PayloadProcessor}s can be obtained for each * {@link Term}, or <code>null</code> if none should be used. * @deprecated Use {@link #getReaderProcessor} instead. You can still select by {@link Directory}, * if you retrieve the underlying directory from {@link IndexReader#directory()}. */	TokenNameCOMMENT_JAVADOC	 Returns a {@link DirPayloadProcessor} for the given {@link Directory}, through which {@link PayloadProcessor}s can be obtained for each {@link Term}, or <code>null</code> if none should be used. @deprecated Use {@link #getReaderProcessor} instead. You can still select by {@link Directory}, if you retrieve the underlying directory from {@link IndexReader#directory()}. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
DirPayloadProcessor	TokenNameIdentifier	 Dir Payload Processor
getDirProcessor	TokenNameIdentifier	 get Dir Processor
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"You must either implement getReaderProcessor() or getDirProcessor()."	TokenNameStringLiteral	You must either implement getReaderProcessor() or getDirProcessor().
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
