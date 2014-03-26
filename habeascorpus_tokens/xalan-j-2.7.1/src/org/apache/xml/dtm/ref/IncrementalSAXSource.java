/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: IncrementalSAXSource.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: IncrementalSAXSource.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** <p>IncrementalSAXSource is an API that delivers a small number of * SAX events each time a request is made from a "controller" * coroutine. See IncrementalSAXFilter and IncrementalSAXFilter_Xerces * for examples. * * Note that interaction is via the deliverMoreNodes * method, and therefore coroutine support is not exposed * here.</p> * */	TokenNameCOMMENT_JAVADOC	 <p>IncrementalSAXSource is an API that delivers a small number of SAX events each time a request is made from a "controller" coroutine. See IncrementalSAXFilter and IncrementalSAXFilter_Xerces for examples. * Note that interaction is via the deliverMoreNodes method, and therefore coroutine support is not exposed here.</p> 
public	TokenNamepublic	
interface	TokenNameinterface	
IncrementalSAXSource	TokenNameIdentifier	 Incremental SAX Source
{	TokenNameLBRACE	
// ------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
// SAX Output API 	TokenNameCOMMENT_LINE	SAX Output API 
// ------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
/** Register a SAX-style content handler for us to output to */	TokenNameCOMMENT_JAVADOC	 Register a SAX-style content handler for us to output to 
public	TokenNamepublic	
void	TokenNamevoid	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Register a SAX-style lexical handler for us to output to */	TokenNameCOMMENT_JAVADOC	 Register a SAX-style lexical handler for us to output to 
public	TokenNamepublic	
void	TokenNamevoid	
setLexicalHandler	TokenNameIdentifier	 set Lexical Handler
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Register a SAX-style DTD handler for us to output to */	TokenNameCOMMENT_JAVADOC	 Register a SAX-style DTD handler for us to output to 
public	TokenNamepublic	
void	TokenNamevoid	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
DTDHandler	TokenNameIdentifier	 DTD Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
// Command Input API 	TokenNameCOMMENT_LINE	Command Input API 
// ------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
/** deliverMoreNodes() is a simple API which tells the thread in which the * IncrementalSAXSource is running to deliver more events (true), * or stop delivering events and close out its input (false). * * This is intended to be called from one of our partner coroutines, * and serves to encapsulate the coroutine communication protocol. * * @param parsemore If true, tells the incremental SAX stream to deliver * another chunk of events. If false, finishes out the stream. * * @return Boolean.TRUE if the IncrementalSAXSource believes more data * may be available for further parsing. Boolean.FALSE if parsing * ran to completion, or was ended by deliverMoreNodes(false). * */	TokenNameCOMMENT_JAVADOC	 deliverMoreNodes() is a simple API which tells the thread in which the IncrementalSAXSource is running to deliver more events (true), or stop delivering events and close out its input (false). * This is intended to be called from one of our partner coroutines, and serves to encapsulate the coroutine communication protocol. * @param parsemore If true, tells the incremental SAX stream to deliver another chunk of events. If false, finishes out the stream. * @return Boolean.TRUE if the IncrementalSAXSource believes more data may be available for further parsing. Boolean.FALSE if parsing ran to completion, or was ended by deliverMoreNodes(false). 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
deliverMoreNodes	TokenNameIdentifier	 deliver More Nodes
(	TokenNameLPAREN	
boolean	TokenNameboolean	
parsemore	TokenNameIdentifier	 parsemore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
// Parse Thread Convenience API 	TokenNameCOMMENT_LINE	Parse Thread Convenience API 
// ------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
/** Launch an XMLReader's parsing operation, feeding events to this * IncrementalSAXSource. In some implementations, this may launch a * thread which runs the previously supplied XMLReader's parse() operation. * In others, it may do other forms of initialization. * * @throws SAXException is parse thread is already in progress * or parsing can not be started. * */	TokenNameCOMMENT_JAVADOC	 Launch an XMLReader's parsing operation, feeding events to this IncrementalSAXSource. In some implementations, this may launch a thread which runs the previously supplied XMLReader's parse() operation. In others, it may do other forms of initialization. * @throws SAXException is parse thread is already in progress or parsing can not be started. 
public	TokenNamepublic	
void	TokenNamevoid	
startParse	TokenNameIdentifier	 start Parse
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// class IncrementalSAXSource 	TokenNameCOMMENT_LINE	class IncrementalSAXSource 
