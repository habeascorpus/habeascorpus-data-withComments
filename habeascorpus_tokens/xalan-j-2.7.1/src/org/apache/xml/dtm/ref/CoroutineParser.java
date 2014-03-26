/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: CoroutineParser.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: CoroutineParser.java 468653 2006-10-28 07:07:05Z minchau $ 
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
XMLReader	TokenNameIdentifier	 XML Reader
;	TokenNameSEMICOLON	
/** <p>CoroutineParser is an API for parser threads that operate as * coroutines. See CoroutineSAXParser and CoroutineSAXParser_Xerces * for examples.</p> * * <p>&lt;grumble&gt; I'd like the interface to require a specific form * for either the base constructor or a static factory method. Java * doesn't allow us to specify either, so I'll just document them * here: * * <ul> * <li>public CoroutineParser(CoroutineManager co, int appCoroutine);</li> * <li>public CoroutineParser createCoroutineParser(CoroutineManager co, int appCoroutine);</li> * </ul> * * &lt;/grumble&gt;</p> * * @deprecated Since the ability to start a parse via the * coroutine protocol was not being used and was complicating design. * See {@link IncrementalSAXSource}. * */	TokenNameCOMMENT_JAVADOC	 <p>CoroutineParser is an API for parser threads that operate as coroutines. See CoroutineSAXParser and CoroutineSAXParser_Xerces for examples.</p> * <p>&lt;grumble&gt; I'd like the interface to require a specific form for either the base constructor or a static factory method. Java doesn't allow us to specify either, so I'll just document them here: * <ul> <li>public CoroutineParser(CoroutineManager co, int appCoroutine);</li> <li>public CoroutineParser createCoroutineParser(CoroutineManager co, int appCoroutine);</li> </ul> * &lt;/grumble&gt;</p> * @deprecated Since the ability to start a parse via the coroutine protocol was not being used and was complicating design. See {@link IncrementalSAXSource}. 
public	TokenNamepublic	
interface	TokenNameinterface	
CoroutineParser	TokenNameIdentifier	 Coroutine Parser
{	TokenNameLBRACE	
/** @return the coroutine ID number for this CoroutineParser object. * Note that this isn't useful unless you know which CoroutineManager * you're talking to. Also note that the do...() methods encapsulate * the common transactions with the CoroutineParser, so you shouldn't * need this in most cases. * */	TokenNameCOMMENT_JAVADOC	 @return the coroutine ID number for this CoroutineParser object. Note that this isn't useful unless you know which CoroutineManager you're talking to. Also note that the do...() methods encapsulate the common transactions with the CoroutineParser, so you shouldn't need this in most cases. 
public	TokenNamepublic	
int	TokenNameint	
getParserCoroutineID	TokenNameIdentifier	 get Parser Coroutine ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** @return the CoroutineManager for this CoroutineParser object. * If you're using the do...() methods, applications should only * need to talk to the CoroutineManager once, to obtain the * application's Coroutine ID. * */	TokenNameCOMMENT_JAVADOC	 @return the CoroutineManager for this CoroutineParser object. If you're using the do...() methods, applications should only need to talk to the CoroutineManager once, to obtain the application's Coroutine ID. 
public	TokenNamepublic	
CoroutineManager	TokenNameIdentifier	 Coroutine Manager
getCoroutineManager	TokenNameIdentifier	 get Coroutine Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Register a SAX-style content handler for us to output to */	TokenNameCOMMENT_JAVADOC	 Register a SAX-style content handler for us to output to 
public	TokenNamepublic	
void	TokenNamevoid	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Register a SAX-style lexical handler for us to output to * Not all parsers support this... * * %REVIEW% Not called setLexicalHandler because Xalan uses that name * internally, which causes subclassing nuisances. */	TokenNameCOMMENT_JAVADOC	 Register a SAX-style lexical handler for us to output to Not all parsers support this... * %REVIEW% Not called setLexicalHandler because Xalan uses that name internally, which causes subclassing nuisances. 
public	TokenNamepublic	
void	TokenNamevoid	
setLexHandler	TokenNameIdentifier	 set Lex Handler
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
/* The run() method is required in CoroutineParsers that run as * threads (of course)... but it isn't part of our API, and * shouldn't be declared here. * */	TokenNameCOMMENT_BLOCK	 The run() method is required in CoroutineParsers that run as threads (of course)... but it isn't part of our API, and shouldn't be declared here. 
//================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
/** doParse() is a simple API which tells the coroutine parser * to begin reading from a file. This is intended to be called from one * of our partner coroutines, and serves both to encapsulate the * communication protocol and to avoid having to explicitly use the * CoroutineParser's coroutine ID number. * * %REVIEW% Can/should this unify with doMore? (if URI hasn't changed, * parse more from same file, else end and restart parsing...? * * @param source The InputSource to parse from. * @param appCoroutine The coroutine ID number of the coroutine invoking * this method, so it can be resumed after the parser has responded to the * request. * @return Boolean.TRUE if the CoroutineParser believes more data may be available * for further parsing. Boolean.FALSE if parsing ran to completion. * Exception if the parser objected for some reason. * */	TokenNameCOMMENT_JAVADOC	 doParse() is a simple API which tells the coroutine parser to begin reading from a file. This is intended to be called from one of our partner coroutines, and serves both to encapsulate the communication protocol and to avoid having to explicitly use the CoroutineParser's coroutine ID number. * %REVIEW% Can/should this unify with doMore? (if URI hasn't changed, parse more from same file, else end and restart parsing...? * @param source The InputSource to parse from. @param appCoroutine The coroutine ID number of the coroutine invoking this method, so it can be resumed after the parser has responded to the request. @return Boolean.TRUE if the CoroutineParser believes more data may be available for further parsing. Boolean.FALSE if parsing ran to completion. Exception if the parser objected for some reason. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
doParse	TokenNameIdentifier	 do Parse
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
int	TokenNameint	
appCoroutine	TokenNameIdentifier	 app Coroutine
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** doMore() is a simple API which tells the coroutine parser * that we need more nodes. This is intended to be called from one * of our partner coroutines, and serves both to encapsulate the * communication protocol and to avoid having to explicitly use the * CoroutineParser's coroutine ID number. * * @param parsemore If true, tells the incremental parser to generate * another chunk of output. If false, tells the parser that we're * satisfied and it can terminate parsing of this document. * @param appCoroutine The coroutine ID number of the coroutine invoking * this method, so it can be resumed after the parser has responded to the * request. * @return Boolean.TRUE if the CoroutineParser believes more data may be available * for further parsing. Boolean.FALSE if parsing ran to completion. * Exception if the parser objected for some reason. * */	TokenNameCOMMENT_JAVADOC	 doMore() is a simple API which tells the coroutine parser that we need more nodes. This is intended to be called from one of our partner coroutines, and serves both to encapsulate the communication protocol and to avoid having to explicitly use the CoroutineParser's coroutine ID number. * @param parsemore If true, tells the incremental parser to generate another chunk of output. If false, tells the parser that we're satisfied and it can terminate parsing of this document. @param appCoroutine The coroutine ID number of the coroutine invoking this method, so it can be resumed after the parser has responded to the request. @return Boolean.TRUE if the CoroutineParser believes more data may be available for further parsing. Boolean.FALSE if parsing ran to completion. Exception if the parser objected for some reason. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
doMore	TokenNameIdentifier	 do More
(	TokenNameLPAREN	
boolean	TokenNameboolean	
parsemore	TokenNameIdentifier	 parsemore
,	TokenNameCOMMA	
int	TokenNameint	
appCoroutine	TokenNameIdentifier	 app Coroutine
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** doTerminate() is a simple API which tells the coroutine * parser to terminate itself. This is intended to be called from * one of our partner coroutines, and serves both to encapsulate the * communication protocol and to avoid having to explicitly use the * CoroutineParser's coroutine ID number. * * Returns only after the CoroutineParser has acknowledged the request. * * @param appCoroutine The coroutine ID number of the coroutine invoking * this method, so it can be resumed after the parser has responded to the * request. * */	TokenNameCOMMENT_JAVADOC	 doTerminate() is a simple API which tells the coroutine parser to terminate itself. This is intended to be called from one of our partner coroutines, and serves both to encapsulate the communication protocol and to avoid having to explicitly use the CoroutineParser's coroutine ID number. * Returns only after the CoroutineParser has acknowledged the request. * @param appCoroutine The coroutine ID number of the coroutine invoking this method, so it can be resumed after the parser has responded to the request. 
public	TokenNamepublic	
void	TokenNamevoid	
doTerminate	TokenNameIdentifier	 do Terminate
(	TokenNameLPAREN	
int	TokenNameint	
appCoroutine	TokenNameIdentifier	 app Coroutine
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Initialize the coroutine parser. Same parameters could be passed * in a non-default constructor, or by using using context ClassLoader * and newInstance and then calling init() */	TokenNameCOMMENT_JAVADOC	 Initialize the coroutine parser. Same parameters could be passed in a non-default constructor, or by using using context ClassLoader and newInstance and then calling init() 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
CoroutineManager	TokenNameIdentifier	 Coroutine Manager
co	TokenNameIdentifier	 co
,	TokenNameCOMMA	
int	TokenNameint	
appCoroutineID	TokenNameIdentifier	 app Coroutine ID
,	TokenNameCOMMA	
XMLReader	TokenNameIdentifier	 XML Reader
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// class CoroutineParser 	TokenNameCOMMENT_LINE	class CoroutineParser 
