/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: IncrementalSAXSource_Filter.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: IncrementalSAXSource_Filter.java 468653 2006-10-28 07:07:05Z minchau $ 
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLMessages	TokenNameIdentifier	 XML Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ThreadControllerWrapper	TokenNameIdentifier	 Thread Controller Wrapper
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
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
DTDHandler	TokenNameIdentifier	 DTD Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ErrorHandler	TokenNameIdentifier	 Error Handler
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
Locator	TokenNameIdentifier	 Locator
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
;	TokenNameSEMICOLON	
/** <p>IncrementalSAXSource_Filter implements IncrementalSAXSource, using a * standard SAX2 event source as its input and parcelling out those * events gradually in reponse to deliverMoreNodes() requests. Output from the * filter will be passed along to a SAX handler registered as our * listener, but those callbacks will pass through a counting stage * which periodically yields control back to the controller coroutine. * </p> * * <p>%REVIEW%: This filter is not currenly intended to be reusable * for parsing additional streams/documents. We may want to consider * making it resettable at some point in the future. But it's a * small object, so that'd be mostly a convenience issue; the cost * of allocating each time is trivial compared to the cost of processing * any nontrival stream.</p> * * <p>For a brief usage example, see the unit-test main() method.</p> * * <p>This is a simplification of the old CoroutineSAXParser, focusing * specifically on filtering. The resulting controller protocol is _far_ * simpler and less error-prone; the only controller operation is deliverMoreNodes(), * and the only requirement is that deliverMoreNodes(false) be called if you want to * discard the rest of the stream and the previous deliverMoreNodes() didn't return * false. * */	TokenNameCOMMENT_JAVADOC	 <p>IncrementalSAXSource_Filter implements IncrementalSAXSource, using a standard SAX2 event source as its input and parcelling out those events gradually in reponse to deliverMoreNodes() requests. Output from the filter will be passed along to a SAX handler registered as our listener, but those callbacks will pass through a counting stage which periodically yields control back to the controller coroutine. </p> * <p>%REVIEW%: This filter is not currenly intended to be reusable for parsing additional streams/documents. We may want to consider making it resettable at some point in the future. But it's a small object, so that'd be mostly a convenience issue; the cost of allocating each time is trivial compared to the cost of processing any nontrival stream.</p> * <p>For a brief usage example, see the unit-test main() method.</p> * <p>This is a simplification of the old CoroutineSAXParser, focusing specifically on filtering. The resulting controller protocol is _far_ simpler and less error-prone; the only controller operation is deliverMoreNodes(), and the only requirement is that deliverMoreNodes(false) be called if you want to discard the rest of the stream and the previous deliverMoreNodes() didn't return false. 
public	TokenNamepublic	
class	TokenNameclass	
IncrementalSAXSource_Filter	TokenNameIdentifier	 Incremental SAX Source  Filter
implements	TokenNameimplements	
IncrementalSAXSource	TokenNameIdentifier	 Incremental SAX Source
,	TokenNameCOMMA	
ContentHandler	TokenNameIdentifier	 Content Handler
,	TokenNameCOMMA	
DTDHandler	TokenNameIdentifier	 DTD Handler
,	TokenNameCOMMA	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
,	TokenNameCOMMA	
ErrorHandler	TokenNameIdentifier	 Error Handler
,	TokenNameCOMMA	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//Internal status report 	TokenNameCOMMENT_LINE	Internal status report 
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
CoroutineManager	TokenNameIdentifier	 Coroutine Manager
fCoroutineManager	TokenNameIdentifier	 f Coroutine Manager
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fControllerCoroutineID	TokenNameIdentifier	 f Controller Coroutine ID
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fSourceCoroutineID	TokenNameIdentifier	 f Source Coroutine ID
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ContentHandler	TokenNameIdentifier	 Content Handler
clientContentHandler	TokenNameIdentifier	 client Content Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// %REVIEW% support multiple? 	TokenNameCOMMENT_LINE	%REVIEW% support multiple? 
private	TokenNameprivate	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
clientLexicalHandler	TokenNameIdentifier	 client Lexical Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// %REVIEW% support multiple? 	TokenNameCOMMENT_LINE	%REVIEW% support multiple? 
private	TokenNameprivate	
DTDHandler	TokenNameIdentifier	 DTD Handler
clientDTDHandler	TokenNameIdentifier	 client DTD Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// %REVIEW% support multiple? 	TokenNameCOMMENT_LINE	%REVIEW% support multiple? 
private	TokenNameprivate	
ErrorHandler	TokenNameIdentifier	 Error Handler
clientErrorHandler	TokenNameIdentifier	 client Error Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// %REVIEW% support multiple? 	TokenNameCOMMENT_LINE	%REVIEW% support multiple? 
private	TokenNameprivate	
int	TokenNameint	
eventcounter	TokenNameIdentifier	 eventcounter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
frequency	TokenNameIdentifier	 frequency
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Flag indicating that no more events should be delivered -- either 	TokenNameCOMMENT_LINE	Flag indicating that no more events should be delivered -- either 
// because input stream ran to completion (endDocument), or because 	TokenNameCOMMENT_LINE	because input stream ran to completion (endDocument), or because 
// the user requested an early stop via deliverMoreNodes(false). 	TokenNameCOMMENT_LINE	the user requested an early stop via deliverMoreNodes(false). 
private	TokenNameprivate	
boolean	TokenNameboolean	
fNoMoreEvents	TokenNameIdentifier	 f No More Events
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Support for startParse() 	TokenNameCOMMENT_LINE	Support for startParse() 
private	TokenNameprivate	
XMLReader	TokenNameIdentifier	 XML Reader
fXMLReader	TokenNameIdentifier	 f XML Reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InputSource	TokenNameIdentifier	 Input Source
fXMLReaderInputSource	TokenNameIdentifier	 f XML Reader Input Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
IncrementalSAXSource_Filter	TokenNameIdentifier	 Incremental SAX Source  Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
new	TokenNamenew	
CoroutineManager	TokenNameIdentifier	 Coroutine Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a IncrementalSAXSource_Filter which is not yet bound to a specific * SAX event source. * */	TokenNameCOMMENT_JAVADOC	 Create a IncrementalSAXSource_Filter which is not yet bound to a specific SAX event source. 
public	TokenNamepublic	
IncrementalSAXSource_Filter	TokenNameIdentifier	 Incremental SAX Source  Filter
(	TokenNameLPAREN	
CoroutineManager	TokenNameIdentifier	 Coroutine Manager
co	TokenNameIdentifier	 co
,	TokenNameCOMMA	
int	TokenNameint	
controllerCoroutineID	TokenNameIdentifier	 controller Coroutine ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
co	TokenNameIdentifier	 co
,	TokenNameCOMMA	
controllerCoroutineID	TokenNameIdentifier	 controller Coroutine ID
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Factories 	TokenNameCOMMENT_LINE	Factories 
// 	TokenNameCOMMENT_LINE	 
static	TokenNamestatic	
public	TokenNamepublic	
IncrementalSAXSource	TokenNameIdentifier	 Incremental SAX Source
createIncrementalSAXSource	TokenNameIdentifier	 create Incremental SAX Source
(	TokenNameLPAREN	
CoroutineManager	TokenNameIdentifier	 Coroutine Manager
co	TokenNameIdentifier	 co
,	TokenNameCOMMA	
int	TokenNameint	
controllerCoroutineID	TokenNameIdentifier	 controller Coroutine ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
IncrementalSAXSource_Filter	TokenNameIdentifier	 Incremental SAX Source  Filter
(	TokenNameLPAREN	
co	TokenNameIdentifier	 co
,	TokenNameCOMMA	
controllerCoroutineID	TokenNameIdentifier	 controller Coroutine ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
CoroutineManager	TokenNameIdentifier	 Coroutine Manager
co	TokenNameIdentifier	 co
,	TokenNameCOMMA	
int	TokenNameint	
controllerCoroutineID	TokenNameIdentifier	 controller Coroutine ID
,	TokenNameCOMMA	
int	TokenNameint	
sourceCoroutineID	TokenNameIdentifier	 source Coroutine ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
co	TokenNameIdentifier	 co
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
co	TokenNameIdentifier	 co
=	TokenNameEQUAL	
new	TokenNamenew	
CoroutineManager	TokenNameIdentifier	 Coroutine Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCoroutineManager	TokenNameIdentifier	 f Coroutine Manager
=	TokenNameEQUAL	
co	TokenNameIdentifier	 co
;	TokenNameSEMICOLON	
fControllerCoroutineID	TokenNameIdentifier	 f Controller Coroutine ID
=	TokenNameEQUAL	
co	TokenNameIdentifier	 co
.	TokenNameDOT	
co_joinCoroutineSet	TokenNameIdentifier	 co join Coroutine Set
(	TokenNameLPAREN	
controllerCoroutineID	TokenNameIdentifier	 controller Coroutine ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fSourceCoroutineID	TokenNameIdentifier	 f Source Coroutine ID
=	TokenNameEQUAL	
co	TokenNameIdentifier	 co
.	TokenNameDOT	
co_joinCoroutineSet	TokenNameIdentifier	 co join Coroutine Set
(	TokenNameLPAREN	
sourceCoroutineID	TokenNameIdentifier	 source Coroutine ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fControllerCoroutineID	TokenNameIdentifier	 f Controller Coroutine ID
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
fSourceCoroutineID	TokenNameIdentifier	 f Source Coroutine ID
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_COJOINROUTINESET_FAILED	TokenNameIdentifier	 ER  COJOINROUTINESET  FAILED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"co_joinCoroutineSet() failed"); 	TokenNameCOMMENT_LINE	"co_joinCoroutineSet() failed"); 
fNoMoreEvents	TokenNameIdentifier	 f No More Events
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
eventcounter	TokenNameIdentifier	 eventcounter
=	TokenNameEQUAL	
frequency	TokenNameIdentifier	 frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Bind our input streams to an XMLReader. * * Just a convenience routine; obviously you can explicitly register * this as a listener with the same effect. * */	TokenNameCOMMENT_JAVADOC	 Bind our input streams to an XMLReader. * Just a convenience routine; obviously you can explicitly register this as a listener with the same effect. 
public	TokenNamepublic	
void	TokenNamevoid	
setXMLReader	TokenNameIdentifier	 set XML Reader
(	TokenNameLPAREN	
XMLReader	TokenNameIdentifier	 XML Reader
eventsource	TokenNameIdentifier	 eventsource
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fXMLReader	TokenNameIdentifier	 f XML Reader
=	TokenNameEQUAL	
eventsource	TokenNameIdentifier	 eventsource
;	TokenNameSEMICOLON	
eventsource	TokenNameIdentifier	 eventsource
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventsource	TokenNameIdentifier	 eventsource
.	TokenNameDOT	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventsource	TokenNameIdentifier	 eventsource
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// to report fatal errors in filtering mode 	TokenNameCOMMENT_LINE	to report fatal errors in filtering mode 
// Not supported by all SAX2 filters: 	TokenNameCOMMENT_LINE	Not supported by all SAX2 filters: 
try	TokenNametry	
{	TokenNameLBRACE	
eventsource	TokenNameIdentifier	 eventsource
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"http://xml.org/sax/properties/lexical-handler"	TokenNameStringLiteral	http://xml.org/sax/properties/lexical-handler
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Nothing we can do about it 	TokenNameCOMMENT_LINE	Nothing we can do about it 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Nothing we can do about it 	TokenNameCOMMENT_LINE	Nothing we can do about it 
}	TokenNameRBRACE	
// Should we also bind as other varieties of handler? 	TokenNameCOMMENT_LINE	Should we also bind as other varieties of handler? 
// (DTDHandler and so on) 	TokenNameCOMMENT_LINE	(DTDHandler and so on) 
}	TokenNameRBRACE	
// Register a content handler for us to output to 	TokenNameCOMMENT_LINE	Register a content handler for us to output to 
public	TokenNamepublic	
void	TokenNamevoid	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clientContentHandler	TokenNameIdentifier	 client Content Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Register a DTD handler for us to output to 	TokenNameCOMMENT_LINE	Register a DTD handler for us to output to 
public	TokenNamepublic	
void	TokenNamevoid	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
DTDHandler	TokenNameIdentifier	 DTD Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clientDTDHandler	TokenNameIdentifier	 client DTD Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Register a lexical handler for us to output to 	TokenNameCOMMENT_LINE	Register a lexical handler for us to output to 
// Not all filters support this... 	TokenNameCOMMENT_LINE	Not all filters support this... 
// ??? Should we register directly on the filter? 	TokenNameCOMMENT_LINE	??? Should we register directly on the filter? 
// NOTE NAME -- subclassing issue in the Xerces version 	TokenNameCOMMENT_LINE	NOTE NAME -- subclassing issue in the Xerces version 
public	TokenNamepublic	
void	TokenNamevoid	
setLexicalHandler	TokenNameIdentifier	 set Lexical Handler
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clientLexicalHandler	TokenNameIdentifier	 client Lexical Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Register an error handler for us to output to 	TokenNameCOMMENT_LINE	Register an error handler for us to output to 
// NOTE NAME -- subclassing issue in the Xerces version 	TokenNameCOMMENT_LINE	NOTE NAME -- subclassing issue in the Xerces version 
public	TokenNamepublic	
void	TokenNamevoid	
setErrHandler	TokenNameIdentifier	 set Err Handler
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clientErrorHandler	TokenNameIdentifier	 client Error Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Set the number of events between resumes of our coroutine 	TokenNameCOMMENT_LINE	Set the number of events between resumes of our coroutine 
// Immediately resets number of events before _next_ resume as well. 	TokenNameCOMMENT_LINE	Immediately resets number of events before _next_ resume as well. 
public	TokenNamepublic	
void	TokenNamevoid	
setReturnFrequency	TokenNameIdentifier	 set Return Frequency
(	TokenNameLPAREN	
int	TokenNameint	
events	TokenNameIdentifier	 events
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
events	TokenNameIdentifier	 events
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
events	TokenNameIdentifier	 events
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
frequency	TokenNameIdentifier	 frequency
=	TokenNameEQUAL	
eventcounter	TokenNameIdentifier	 eventcounter
=	TokenNameEQUAL	
events	TokenNameIdentifier	 events
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// ContentHandler methods 	TokenNameCOMMENT_LINE	ContentHandler methods 
// These pass the data to our client ContentHandler... 	TokenNameCOMMENT_LINE	These pass the data to our client ContentHandler... 
// but they also count the number of events passing through, 	TokenNameCOMMENT_LINE	but they also count the number of events passing through, 
// and resume our coroutine each time that counter hits zero and 	TokenNameCOMMENT_LINE	and resume our coroutine each time that counter hits zero and 
// is reset. 	TokenNameCOMMENT_LINE	is reset. 
// 	TokenNameCOMMENT_LINE	 
// Note that for everything except endDocument and fatalError, we do the count-and-yield 	TokenNameCOMMENT_LINE	Note that for everything except endDocument and fatalError, we do the count-and-yield 
// BEFORE passing the call along. I'm hoping that this will encourage JIT 	TokenNameCOMMENT_LINE	BEFORE passing the call along. I'm hoping that this will encourage JIT 
// compilers to realize that these are tail-calls, reducing the expense of 	TokenNameCOMMENT_LINE	compilers to realize that these are tail-calls, reducing the expense of 
// the additional layer of data flow. 	TokenNameCOMMENT_LINE	the additional layer of data flow. 
// 	TokenNameCOMMENT_LINE	 
// %REVIEW% Glenn suggests that pausing after endElement, endDocument, 	TokenNameCOMMENT_LINE	%REVIEW% Glenn suggests that pausing after endElement, endDocument, 
// and characters may be sufficient. I actually may not want to 	TokenNameCOMMENT_LINE	and characters may be sufficient. I actually may not want to 
// stop after characters, since in our application these wind up being 	TokenNameCOMMENT_LINE	stop after characters, since in our application these wind up being 
// concatenated before they're processed... but that risks huge blocks of 	TokenNameCOMMENT_LINE	concatenated before they're processed... but that risks huge blocks of 
// text causing greater than usual readahead. (Unlikely? Consider the 	TokenNameCOMMENT_LINE	text causing greater than usual readahead. (Unlikely? Consider the 
// possibility of a large base-64 block in a SOAP stream.) 	TokenNameCOMMENT_LINE	possibility of a large base-64 block in a SOAP stream.) 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
eventcounter	TokenNameIdentifier	 eventcounter
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
co_yield	TokenNameIdentifier	 co yield
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventcounter	TokenNameIdentifier	 eventcounter
=	TokenNameEQUAL	
frequency	TokenNameIdentifier	 frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// EXCEPTION: In this case we need to run the event BEFORE we yield. 	TokenNameCOMMENT_LINE	EXCEPTION: In this case we need to run the event BEFORE we yield. 
if	TokenNameif	
(	TokenNameLPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventcounter	TokenNameIdentifier	 eventcounter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
co_yield	TokenNameIdentifier	 co yield
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
eventcounter	TokenNameIdentifier	 eventcounter
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
co_yield	TokenNameIdentifier	 co yield
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventcounter	TokenNameIdentifier	 eventcounter
=	TokenNameEQUAL	
frequency	TokenNameIdentifier	 frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
eventcounter	TokenNameIdentifier	 eventcounter
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
co_yield	TokenNameIdentifier	 co yield
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventcounter	TokenNameIdentifier	 eventcounter
=	TokenNameEQUAL	
frequency	TokenNameIdentifier	 frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
.	TokenNameDOT	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
eventcounter	TokenNameIdentifier	 eventcounter
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
co_yield	TokenNameIdentifier	 co yield
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventcounter	TokenNameIdentifier	 eventcounter
=	TokenNameEQUAL	
frequency	TokenNameIdentifier	 frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
.	TokenNameDOT	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
eventcounter	TokenNameIdentifier	 eventcounter
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
co_yield	TokenNameIdentifier	 co yield
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventcounter	TokenNameIdentifier	 eventcounter
=	TokenNameEQUAL	
frequency	TokenNameIdentifier	 frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
eventcounter	TokenNameIdentifier	 eventcounter
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This can cause a hang. -sb 	TokenNameCOMMENT_LINE	This can cause a hang. -sb 
// co_yield(true); 	TokenNameCOMMENT_LINE	co_yield(true); 
eventcounter	TokenNameIdentifier	 eventcounter
=	TokenNameEQUAL	
frequency	TokenNameIdentifier	 frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
.	TokenNameDOT	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
eventcounter	TokenNameIdentifier	 eventcounter
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
co_yield	TokenNameIdentifier	 co yield
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventcounter	TokenNameIdentifier	 eventcounter
=	TokenNameEQUAL	
frequency	TokenNameIdentifier	 frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
.	TokenNameDOT	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
co_entry_pause	TokenNameIdentifier	 co entry pause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Otherwise, begin normal event delivery 	TokenNameCOMMENT_LINE	Otherwise, begin normal event delivery 
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
eventcounter	TokenNameIdentifier	 eventcounter
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
co_yield	TokenNameIdentifier	 co yield
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventcounter	TokenNameIdentifier	 eventcounter
=	TokenNameEQUAL	
frequency	TokenNameIdentifier	 frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
eventcounter	TokenNameIdentifier	 eventcounter
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
co_yield	TokenNameIdentifier	 co yield
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventcounter	TokenNameIdentifier	 eventcounter
=	TokenNameEQUAL	
frequency	TokenNameIdentifier	 frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
eventcounter	TokenNameIdentifier	 eventcounter
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
co_yield	TokenNameIdentifier	 co yield
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventcounter	TokenNameIdentifier	 eventcounter
=	TokenNameEQUAL	
frequency	TokenNameIdentifier	 frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
clientContentHandler	TokenNameIdentifier	 client Content Handler
.	TokenNameDOT	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// LexicalHandler support. Not all SAX2 filters support these events 	TokenNameCOMMENT_LINE	LexicalHandler support. Not all SAX2 filters support these events 
// but we may want to pass them through when they exist... 	TokenNameCOMMENT_LINE	but we may want to pass them through when they exist... 
// 	TokenNameCOMMENT_LINE	 
// %REVIEW% These do NOT currently affect the eventcounter; I'm asserting 	TokenNameCOMMENT_LINE	%REVIEW% These do NOT currently affect the eventcounter; I'm asserting 
// that they're rare enough that it makes little or no sense to 	TokenNameCOMMENT_LINE	that they're rare enough that it makes little or no sense to 
// pause after them. As such, it may make more sense for folks who 	TokenNameCOMMENT_LINE	pause after them. As such, it may make more sense for folks who 
// actually want to use them to register directly with the filter. 	TokenNameCOMMENT_LINE	actually want to use them to register directly with the filter. 
// But I want 'em here for now, to remind us to recheck this assertion! 	TokenNameCOMMENT_LINE	But I want 'em here for now, to remind us to recheck this assertion! 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
clientLexicalHandler	TokenNameIdentifier	 client Lexical Handler
)	TokenNameRPAREN	
clientLexicalHandler	TokenNameIdentifier	 client Lexical Handler
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
clientLexicalHandler	TokenNameIdentifier	 client Lexical Handler
)	TokenNameRPAREN	
clientLexicalHandler	TokenNameIdentifier	 client Lexical Handler
.	TokenNameDOT	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
clientLexicalHandler	TokenNameIdentifier	 client Lexical Handler
)	TokenNameRPAREN	
clientLexicalHandler	TokenNameIdentifier	 client Lexical Handler
.	TokenNameDOT	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
clientLexicalHandler	TokenNameIdentifier	 client Lexical Handler
)	TokenNameRPAREN	
clientLexicalHandler	TokenNameIdentifier	 client Lexical Handler
.	TokenNameDOT	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
clientLexicalHandler	TokenNameIdentifier	 client Lexical Handler
)	TokenNameRPAREN	
clientLexicalHandler	TokenNameIdentifier	 client Lexical Handler
.	TokenNameDOT	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
clientLexicalHandler	TokenNameIdentifier	 client Lexical Handler
)	TokenNameRPAREN	
clientLexicalHandler	TokenNameIdentifier	 client Lexical Handler
.	TokenNameDOT	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
clientLexicalHandler	TokenNameIdentifier	 client Lexical Handler
)	TokenNameRPAREN	
clientLexicalHandler	TokenNameIdentifier	 client Lexical Handler
.	TokenNameDOT	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// DTDHandler support. 	TokenNameCOMMENT_LINE	DTDHandler support. 
public	TokenNamepublic	
void	TokenNamevoid	
notationDecl	TokenNameIdentifier	 notation Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
clientDTDHandler	TokenNameIdentifier	 client DTD Handler
)	TokenNameRPAREN	
clientDTDHandler	TokenNameIdentifier	 client DTD Handler
.	TokenNameDOT	
notationDecl	TokenNameIdentifier	 notation Decl
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
unparsedEntityDecl	TokenNameIdentifier	 unparsed Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
clientDTDHandler	TokenNameIdentifier	 client DTD Handler
)	TokenNameRPAREN	
clientDTDHandler	TokenNameIdentifier	 client DTD Handler
.	TokenNameDOT	
unparsedEntityDecl	TokenNameIdentifier	 unparsed Entity Decl
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// ErrorHandler support. 	TokenNameCOMMENT_LINE	ErrorHandler support. 
// 	TokenNameCOMMENT_LINE	 
// PROBLEM: Xerces is apparently _not_ calling the ErrorHandler for 	TokenNameCOMMENT_LINE	PROBLEM: Xerces is apparently _not_ calling the ErrorHandler for 
// exceptions thrown by the ContentHandler, which prevents us from 	TokenNameCOMMENT_LINE	exceptions thrown by the ContentHandler, which prevents us from 
// handling this properly when running in filtering mode with Xerces 	TokenNameCOMMENT_LINE	handling this properly when running in filtering mode with Xerces 
// as our event source. It's unclear whether this is a Xerces bug 	TokenNameCOMMENT_LINE	as our event source. It's unclear whether this is a Xerces bug 
// or a SAX design flaw. 	TokenNameCOMMENT_LINE	or a SAX design flaw. 
// 	TokenNameCOMMENT_LINE	 
// %REVIEW% Current solution: In filtering mode, it is REQUIRED that 	TokenNameCOMMENT_LINE	%REVIEW% Current solution: In filtering mode, it is REQUIRED that 
// event source make sure this method is invoked if the event stream 	TokenNameCOMMENT_LINE	event source make sure this method is invoked if the event stream 
// abends before endDocument is delivered. If that means explicitly calling 	TokenNameCOMMENT_LINE	abends before endDocument is delivered. If that means explicitly calling 
// us in the exception handling code because it won't be delivered as part 	TokenNameCOMMENT_LINE	us in the exception handling code because it won't be delivered as part 
// of the normal SAX ErrorHandler stream, that's fine; Not Our Problem. 	TokenNameCOMMENT_LINE	of the normal SAX ErrorHandler stream, that's fine; Not Our Problem. 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
clientErrorHandler	TokenNameIdentifier	 client Error Handler
)	TokenNameRPAREN	
clientErrorHandler	TokenNameIdentifier	 client Error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// EXCEPTION: In this case we need to run the event BEFORE we yield -- 	TokenNameCOMMENT_LINE	EXCEPTION: In this case we need to run the event BEFORE we yield -- 
// just as with endDocument, this terminates the event stream. 	TokenNameCOMMENT_LINE	just as with endDocument, this terminates the event stream. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
clientErrorHandler	TokenNameIdentifier	 client Error Handler
)	TokenNameRPAREN	
clientErrorHandler	TokenNameIdentifier	 client Error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventcounter	TokenNameIdentifier	 eventcounter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
co_yield	TokenNameIdentifier	 co yield
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
clientErrorHandler	TokenNameIdentifier	 client Error Handler
)	TokenNameRPAREN	
clientErrorHandler	TokenNameIdentifier	 client Error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// coroutine support 	TokenNameCOMMENT_LINE	coroutine support 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
int	TokenNameint	
getSourceCoroutineID	TokenNameIdentifier	 get Source Coroutine ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSourceCoroutineID	TokenNameIdentifier	 f Source Coroutine ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getControllerCoroutineID	TokenNameIdentifier	 get Controller Coroutine ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fControllerCoroutineID	TokenNameIdentifier	 f Controller Coroutine ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return the CoroutineManager this CoroutineFilter object is bound to. * If you're using the do...() methods, applications should only * need to talk to the CoroutineManager once, to obtain the * application's Coroutine ID. * */	TokenNameCOMMENT_JAVADOC	 @return the CoroutineManager this CoroutineFilter object is bound to. If you're using the do...() methods, applications should only need to talk to the CoroutineManager once, to obtain the application's Coroutine ID. 
public	TokenNamepublic	
CoroutineManager	TokenNameIdentifier	 Coroutine Manager
getCoroutineManager	TokenNameIdentifier	 get Coroutine Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCoroutineManager	TokenNameIdentifier	 f Coroutine Manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** <p>In the SAX delegation code, I've inlined the count-down in * the hope of encouraging compilers to deliver better * performance. However, if we subclass (eg to directly connect the * output to a DTM builder), that would require calling super in * order to run that logic... which seems inelegant. Hence this * routine for the convenience of subclasses: every [frequency] * invocations, issue a co_yield.</p> * * @param moreExepected Should always be true unless this is being called * at the end of endDocument() handling. * */	TokenNameCOMMENT_JAVADOC	 <p>In the SAX delegation code, I've inlined the count-down in the hope of encouraging compilers to deliver better performance. However, if we subclass (eg to directly connect the output to a DTM builder), that would require calling super in order to run that logic... which seems inelegant. Hence this routine for the convenience of subclasses: every [frequency] invocations, issue a co_yield.</p> * @param moreExepected Should always be true unless this is being called at the end of endDocument() handling. 
protected	TokenNameprotected	
void	TokenNamevoid	
count_and_yield	TokenNameIdentifier	 count and yield
(	TokenNameLPAREN	
boolean	TokenNameboolean	
moreExpected	TokenNameIdentifier	 more Expected
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
moreExpected	TokenNameIdentifier	 more Expected
)	TokenNameRPAREN	
eventcounter	TokenNameIdentifier	 eventcounter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
eventcounter	TokenNameIdentifier	 eventcounter
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
co_yield	TokenNameIdentifier	 co yield
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventcounter	TokenNameIdentifier	 eventcounter
=	TokenNameEQUAL	
frequency	TokenNameIdentifier	 frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * co_entry_pause is called in startDocument() before anything else * happens. It causes the filter to wait for a "go ahead" request * from the controller before delivering any events. Note that * the very first thing the controller tells us may be "I don't * need events after all"! */	TokenNameCOMMENT_JAVADOC	 co_entry_pause is called in startDocument() before anything else happens. It causes the filter to wait for a "go ahead" request from the controller before delivering any events. Note that the very first thing the controller tells us may be "I don't need events after all"! 
private	TokenNameprivate	
void	TokenNamevoid	
co_entry_pause	TokenNameIdentifier	 co entry pause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCoroutineManager	TokenNameIdentifier	 f Coroutine Manager
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Nobody called init()? Do it now... 	TokenNameCOMMENT_LINE	Nobody called init()? Do it now... 
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
fCoroutineManager	TokenNameIdentifier	 f Coroutine Manager
.	TokenNameDOT	
co_entry_pause	TokenNameIdentifier	 co entry pause
(	TokenNameLPAREN	
fSourceCoroutineID	TokenNameIdentifier	 f Source Coroutine ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
co_yield	TokenNameIdentifier	 co yield
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Coroutine system says we haven't registered. That's an 	TokenNameCOMMENT_LINE	Coroutine system says we haven't registered. That's an 
// application coding error, and is unrecoverable. 	TokenNameCOMMENT_LINE	application coding error, and is unrecoverable. 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Co_Yield handles coroutine interactions while a parse is in progress. * * When moreRemains==true, we are pausing after delivering events, to * ask if more are needed. We will resume the controller thread with * co_resume(Boolean.TRUE, ...) * When control is passed back it may indicate * Boolean.TRUE indication to continue delivering events * Boolean.FALSE indication to discontinue events and shut down. * * When moreRemains==false, we shut down immediately without asking the * controller's permission. Normally this means end of document has been * reached. * * Shutting down a IncrementalSAXSource_Filter requires terminating the incoming * SAX event stream. If we are in control of that stream (if it came * from an XMLReader passed to our startReader() method), we can do so * very quickly by throwing a reserved exception to it. If the stream is * coming from another source, we can't do that because its caller may * not be prepared for this "normal abnormal exit", and instead we put * ourselves in a "spin" mode where events are discarded. */	TokenNameCOMMENT_JAVADOC	 Co_Yield handles coroutine interactions while a parse is in progress. * When moreRemains==true, we are pausing after delivering events, to ask if more are needed. We will resume the controller thread with co_resume(Boolean.TRUE, ...) When control is passed back it may indicate Boolean.TRUE indication to continue delivering events Boolean.FALSE indication to discontinue events and shut down. * When moreRemains==false, we shut down immediately without asking the controller's permission. Normally this means end of document has been reached. * Shutting down a IncrementalSAXSource_Filter requires terminating the incoming SAX event stream. If we are in control of that stream (if it came from an XMLReader passed to our startReader() method), we can do so very quickly by throwing a reserved exception to it. If the stream is coming from another source, we can't do that because its caller may not be prepared for this "normal abnormal exit", and instead we put ourselves in a "spin" mode where events are discarded. 
private	TokenNameprivate	
void	TokenNamevoid	
co_yield	TokenNameIdentifier	 co yield
(	TokenNameLPAREN	
boolean	TokenNameboolean	
moreRemains	TokenNameIdentifier	 more Remains
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// Horrendous kluge to run filter to completion. See below. 	TokenNameCOMMENT_LINE	Horrendous kluge to run filter to completion. See below. 
if	TokenNameif	
(	TokenNameLPAREN	
fNoMoreEvents	TokenNameIdentifier	 f No More Events
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
// Coroutine manager might throw no-such. 	TokenNameCOMMENT_LINE	Coroutine manager might throw no-such. 
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
moreRemains	TokenNameIdentifier	 more Remains
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Yield control, resume parsing when done 	TokenNameCOMMENT_LINE	Yield control, resume parsing when done 
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
fCoroutineManager	TokenNameIdentifier	 f Coroutine Manager
.	TokenNameDOT	
co_resume	TokenNameIdentifier	 co resume
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
,	TokenNameCOMMA	
fSourceCoroutineID	TokenNameIdentifier	 f Source Coroutine ID
,	TokenNameCOMMA	
fControllerCoroutineID	TokenNameIdentifier	 f Controller Coroutine ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If we're at end of document or were told to stop early 	TokenNameCOMMENT_LINE	If we're at end of document or were told to stop early 
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNoMoreEvents	TokenNameIdentifier	 f No More Events
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fXMLReader	TokenNameIdentifier	 f XML Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// Running under startParseThread() 	TokenNameCOMMENT_LINE	Running under startParseThread() 
throw	TokenNamethrow	
new	TokenNamenew	
StopException	TokenNameIdentifier	 Stop Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We'll co_exit from there. 	TokenNameCOMMENT_LINE	We'll co_exit from there. 
// Yield control. We do NOT expect anyone to ever ask us again. 	TokenNameCOMMENT_LINE	Yield control. We do NOT expect anyone to ever ask us again. 
fCoroutineManager	TokenNameIdentifier	 f Coroutine Manager
.	TokenNameDOT	
co_exit_to	TokenNameIdentifier	 co exit to
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
,	TokenNameCOMMA	
fSourceCoroutineID	TokenNameIdentifier	 f Source Coroutine ID
,	TokenNameCOMMA	
fControllerCoroutineID	TokenNameIdentifier	 f Controller Coroutine ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Shouldn't happen unless we've miscoded our coroutine logic 	TokenNameCOMMENT_LINE	Shouldn't happen unless we've miscoded our coroutine logic 
// "Shut down the garbage smashers on the detention level!" 	TokenNameCOMMENT_LINE	"Shut down the garbage smashers on the detention level!" 
fNoMoreEvents	TokenNameIdentifier	 f No More Events
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fCoroutineManager	TokenNameIdentifier	 f Coroutine Manager
.	TokenNameDOT	
co_exit	TokenNameIdentifier	 co exit
(	TokenNameLPAREN	
fSourceCoroutineID	TokenNameIdentifier	 f Source Coroutine ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Convenience: Run an XMLReader in a thread 	TokenNameCOMMENT_LINE	Convenience: Run an XMLReader in a thread 
// 	TokenNameCOMMENT_LINE	 
/** Launch a thread that will run an XMLReader's parse() operation within * a thread, feeding events to this IncrementalSAXSource_Filter. Mostly a convenience * routine, but has the advantage that -- since we invoked parse() -- * we can halt parsing quickly via a StopException rather than waiting * for the SAX stream to end by itself. * * @throws SAXException is parse thread is already in progress * or parsing can not be started. * */	TokenNameCOMMENT_JAVADOC	 Launch a thread that will run an XMLReader's parse() operation within a thread, feeding events to this IncrementalSAXSource_Filter. Mostly a convenience routine, but has the advantage that -- since we invoked parse() -- we can halt parsing quickly via a StopException rather than waiting for the SAX stream to end by itself. * @throws SAXException is parse thread is already in progress or parsing can not be started. 
public	TokenNamepublic	
void	TokenNamevoid	
startParse	TokenNameIdentifier	 start Parse
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNoMoreEvents	TokenNameIdentifier	 f No More Events
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_INCRSAXSRCFILTER_NOT_RESTARTABLE	TokenNameIdentifier	 ER  INCRSAXSRCFILTER  NOT  RESTARTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"IncrmentalSAXSource_Filter not currently restartable."); 	TokenNameCOMMENT_LINE	"IncrmentalSAXSource_Filter not currently restartable."); 
if	TokenNameif	
(	TokenNameLPAREN	
fXMLReader	TokenNameIdentifier	 f XML Reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_XMLRDR_NOT_BEFORE_STARTPARSE	TokenNameIdentifier	 ER  XMLRDR  NOT  BEFORE  STARTPARSE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"XMLReader not before startParse request"); 	TokenNameCOMMENT_LINE	"XMLReader not before startParse request"); 
fXMLReaderInputSource	TokenNameIdentifier	 f XML Reader Input Source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
// Xalan thread pooling... 	TokenNameCOMMENT_LINE	Xalan thread pooling... 
// org.apache.xalan.transformer.TransformerImpl.runTransformThread(this); 	TokenNameCOMMENT_LINE	org.apache.xalan.transformer.TransformerImpl.runTransformThread(this); 
ThreadControllerWrapper	TokenNameIdentifier	 Thread Controller Wrapper
.	TokenNameDOT	
runThread	TokenNameIdentifier	 run Thread
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Thread logic to support startParseThread() */	TokenNameCOMMENT_BLOCK	 Thread logic to support startParseThread() 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Guard against direct invocation of start(). 	TokenNameCOMMENT_LINE	Guard against direct invocation of start(). 
if	TokenNameif	
(	TokenNameLPAREN	
fXMLReader	TokenNameIdentifier	 f XML Reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"IncrementalSAXSource_Filter parse thread launched"	TokenNameStringLiteral	IncrementalSAXSource_Filter parse thread launched
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Initially assume we'll run successfully. 	TokenNameCOMMENT_LINE	Initially assume we'll run successfully. 
Object	TokenNameIdentifier	 Object
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
// For the duration of this operation, all coroutine handshaking 	TokenNameCOMMENT_LINE	For the duration of this operation, all coroutine handshaking 
// will occur in the co_yield method. That's the nice thing about 	TokenNameCOMMENT_LINE	will occur in the co_yield method. That's the nice thing about 
// coroutines; they give us a way to hand off control from the 	TokenNameCOMMENT_LINE	coroutines; they give us a way to hand off control from the 
// middle of a synchronous method. 	TokenNameCOMMENT_LINE	middle of a synchronous method. 
try	TokenNametry	
{	TokenNameLBRACE	
fXMLReader	TokenNameIdentifier	 f XML Reader
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
fXMLReaderInputSource	TokenNameIdentifier	 f XML Reader Input Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
StopException	TokenNameIdentifier	 Stop Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Expected and harmless 	TokenNameCOMMENT_LINE	Expected and harmless 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Active IncrementalSAXSource_Filter normal stop exception"	TokenNameStringLiteral	Active IncrementalSAXSource_Filter normal stop exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Exception	TokenNameIdentifier	 Exception
inner	TokenNameIdentifier	 inner
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inner	TokenNameIdentifier	 inner
instanceof	TokenNameinstanceof	
StopException	TokenNameIdentifier	 Stop Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Expected and harmless 	TokenNameCOMMENT_LINE	Expected and harmless 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Active IncrementalSAXSource_Filter normal stop exception"	TokenNameStringLiteral	Active IncrementalSAXSource_Filter normal stop exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Unexpected malfunction 	TokenNameCOMMENT_LINE	Unexpected malfunction 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Active IncrementalSAXSource_Filter UNEXPECTED SAX exception: "	TokenNameStringLiteral	Active IncrementalSAXSource_Filter UNEXPECTED SAX exception: 
+	TokenNamePLUS	
inner	TokenNameIdentifier	 inner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end parse 	TokenNameCOMMENT_LINE	end parse 
// Mark as no longer running in thread. 	TokenNameCOMMENT_LINE	Mark as no longer running in thread. 
fXMLReader	TokenNameIdentifier	 f XML Reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Mark as done and yield control to the controller coroutine 	TokenNameCOMMENT_LINE	Mark as done and yield control to the controller coroutine 
fNoMoreEvents	TokenNameIdentifier	 f No More Events
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fCoroutineManager	TokenNameIdentifier	 f Coroutine Manager
.	TokenNameDOT	
co_exit_to	TokenNameIdentifier	 co exit to
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
,	TokenNameCOMMA	
fSourceCoroutineID	TokenNameIdentifier	 f Source Coroutine ID
,	TokenNameCOMMA	
fControllerCoroutineID	TokenNameIdentifier	 f Controller Coroutine ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Shouldn't happen unless we've miscoded our coroutine logic 	TokenNameCOMMENT_LINE	Shouldn't happen unless we've miscoded our coroutine logic 
// "CPO, shut down the garbage smashers on the detention level!" 	TokenNameCOMMENT_LINE	"CPO, shut down the garbage smashers on the detention level!" 
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCoroutineManager	TokenNameIdentifier	 f Coroutine Manager
.	TokenNameDOT	
co_exit	TokenNameIdentifier	 co exit
(	TokenNameLPAREN	
fSourceCoroutineID	TokenNameIdentifier	 f Source Coroutine ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Used to quickly terminate parse when running under a startParse() thread. Only its type is important. */	TokenNameCOMMENT_JAVADOC	 Used to quickly terminate parse when running under a startParse() thread. Only its type is important. 
class	TokenNameclass	
StopException	TokenNameIdentifier	 Stop Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
1129245796185754956L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** deliverMoreNodes() is a simple API which tells the coroutine * parser that we need more nodes. This is intended to be called * from one of our partner routines, and serves to encapsulate the * details of how incremental parsing has been achieved. * * @param parsemore If true, tells the incremental filter to generate * another chunk of output. If false, tells the filter that we're * satisfied and it can terminate parsing of this document. * * @return Boolean.TRUE if there may be more events available by invoking * deliverMoreNodes() again. Boolean.FALSE if parsing has run to completion (or been * terminated by deliverMoreNodes(false). Or an exception object if something * malfunctioned. %REVIEW% We _could_ actually throw the exception, but * that would require runinng deliverMoreNodes() in a try/catch... and for many * applications, exception will be simply be treated as "not TRUE" in * any case. * */	TokenNameCOMMENT_JAVADOC	 deliverMoreNodes() is a simple API which tells the coroutine parser that we need more nodes. This is intended to be called from one of our partner routines, and serves to encapsulate the details of how incremental parsing has been achieved. * @param parsemore If true, tells the incremental filter to generate another chunk of output. If false, tells the filter that we're satisfied and it can terminate parsing of this document. * @return Boolean.TRUE if there may be more events available by invoking deliverMoreNodes() again. Boolean.FALSE if parsing has run to completion (or been terminated by deliverMoreNodes(false). Or an exception object if something malfunctioned. %REVIEW% We _could_ actually throw the exception, but that would require runinng deliverMoreNodes() in a try/catch... and for many applications, exception will be simply be treated as "not TRUE" in any case. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
deliverMoreNodes	TokenNameIdentifier	 deliver More Nodes
(	TokenNameLPAREN	
boolean	TokenNameboolean	
parsemore	TokenNameIdentifier	 parsemore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If parsing is already done, we can immediately say so 	TokenNameCOMMENT_LINE	If parsing is already done, we can immediately say so 
if	TokenNameif	
(	TokenNameLPAREN	
fNoMoreEvents	TokenNameIdentifier	 f No More Events
)	TokenNameRPAREN	
return	TokenNamereturn	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
fCoroutineManager	TokenNameIdentifier	 f Coroutine Manager
.	TokenNameDOT	
co_resume	TokenNameIdentifier	 co resume
(	TokenNameLPAREN	
parsemore	TokenNameIdentifier	 parsemore
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
,	TokenNameCOMMA	
fControllerCoroutineID	TokenNameIdentifier	 f Controller Coroutine ID
,	TokenNameCOMMA	
fSourceCoroutineID	TokenNameIdentifier	 f Source Coroutine ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
fCoroutineManager	TokenNameIdentifier	 f Coroutine Manager
.	TokenNameDOT	
co_exit	TokenNameIdentifier	 co exit
(	TokenNameLPAREN	
fControllerCoroutineID	TokenNameIdentifier	 f Controller Coroutine ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// SHOULD NEVER OCCUR, since the coroutine number and coroutine manager 	TokenNameCOMMENT_LINE	SHOULD NEVER OCCUR, since the coroutine number and coroutine manager 
// are those previously established for this IncrementalSAXSource_Filter... 	TokenNameCOMMENT_LINE	are those previously established for this IncrementalSAXSource_Filter... 
// So I'm just going to return it as a parsing exception, for now. 	TokenNameCOMMENT_LINE	So I'm just going to return it as a parsing exception, for now. 
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
/** Simple unit test. Attempt coroutine parsing of document indicated * by first argument (as a URI), report progress. */	TokenNameCOMMENT_JAVADOC	 Simple unit test. Attempt coroutine parsing of document indicated by first argument (as a URI), report progress. 
/* public static void main(String args[]) { System.out.println("Starting..."); org.xml.sax.XMLReader theSAXParser= new org.apache.xerces.parsers.SAXParser(); for(int arg=0;arg<args.length;++arg) { // The filter is not currently designed to be restartable // after a parse has ended. Generate a new one each time. IncrementalSAXSource_Filter filter= new IncrementalSAXSource_Filter(); // Use a serializer as our sample output org.apache.xml.serialize.XMLSerializer trace; trace=new org.apache.xml.serialize.XMLSerializer(System.out,null); filter.setContentHandler(trace); filter.setLexicalHandler(trace); try { InputSource source = new InputSource(args[arg]); Object result=null; boolean more=true; // init not issued; we _should_ automagically Do The Right Thing // Bind parser, kick off parsing in a thread filter.setXMLReader(theSAXParser); filter.startParse(source); for(result = filter.deliverMoreNodes(more); (result instanceof Boolean && ((Boolean)result)==Boolean.TRUE); result = filter.deliverMoreNodes(more)) { System.out.println("\nSome parsing successful, trying more.\n"); // Special test: Terminate parsing early. if(arg+1<args.length && "!".equals(args[arg+1])) { ++arg; more=false; } } if (result instanceof Boolean && ((Boolean)result)==Boolean.FALSE) { System.out.println("\nFilter ended (EOF or on request).\n"); } else if (result == null) { System.out.println("\nUNEXPECTED: Filter says shut down prematurely.\n"); } else if (result instanceof Exception) { System.out.println("\nFilter threw exception:"); ((Exception)result).printStackTrace(); } } catch(SAXException e) { e.printStackTrace(); } } // end for } */	TokenNameCOMMENT_BLOCK	 public static void main(String args[]) { System.out.println("Starting..."); org.xml.sax.XMLReader theSAXParser= new org.apache.xerces.parsers.SAXParser(); for(int arg=0;arg<args.length;++arg) { // The filter is not currently designed to be restartable // after a parse has ended. Generate a new one each time. IncrementalSAXSource_Filter filter= new IncrementalSAXSource_Filter(); // Use a serializer as our sample output org.apache.xml.serialize.XMLSerializer trace; trace=new org.apache.xml.serialize.XMLSerializer(System.out,null); filter.setContentHandler(trace); filter.setLexicalHandler(trace); try { InputSource source = new InputSource(args[arg]); Object result=null; boolean more=true; // init not issued; we _should_ automagically Do The Right Thing // Bind parser, kick off parsing in a thread filter.setXMLReader(theSAXParser); filter.startParse(source); for(result = filter.deliverMoreNodes(more); (result instanceof Boolean && ((Boolean)result)==Boolean.TRUE); result = filter.deliverMoreNodes(more)) { System.out.println("\nSome parsing successful, trying more.\n"); // Special test: Terminate parsing early. if(arg+1<args.length && "!".equals(args[arg+1])) { ++arg; more=false; } } if (result instanceof Boolean && ((Boolean)result)==Boolean.FALSE) { System.out.println("\nFilter ended (EOF or on request).\n"); } else if (result == null) { System.out.println("\nUNEXPECTED: Filter says shut down prematurely.\n"); } else if (result instanceof Exception) { System.out.println("\nFilter threw exception:"); ((Exception)result).printStackTrace(); } } catch(SAXException e) { e.printStackTrace(); } } // end for } 
}	TokenNameRBRACE	
// class IncrementalSAXSource_Filter 	TokenNameCOMMENT_LINE	class IncrementalSAXSource_Filter 
