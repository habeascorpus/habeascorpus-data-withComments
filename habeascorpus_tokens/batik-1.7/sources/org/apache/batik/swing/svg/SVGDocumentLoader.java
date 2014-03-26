/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
DocumentLoader	TokenNameIdentifier	 Document Loader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EventDispatcher	TokenNameIdentifier	 Event Dispatcher
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EventDispatcher	TokenNameIdentifier	 Event Dispatcher
.	TokenNameDOT	
Dispatcher	TokenNameIdentifier	 Dispatcher
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HaltingThread	TokenNameIdentifier	 Halting Thread
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGDocument	TokenNameIdentifier	 SVG Document
;	TokenNameSEMICOLON	
/** * This class represents an object which loads asynchroneaously a SVG document. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGDocumentLoader.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents an object which loads asynchroneaously a SVG document. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGDocumentLoader.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGDocumentLoader	TokenNameIdentifier	 SVG Document Loader
extends	TokenNameextends	
HaltingThread	TokenNameIdentifier	 Halting Thread
{	TokenNameLBRACE	
/** * The URL of the document, */	TokenNameCOMMENT_JAVADOC	 The URL of the document, 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
/** * The document loader. */	TokenNameCOMMENT_JAVADOC	 The document loader. 
protected	TokenNameprotected	
DocumentLoader	TokenNameIdentifier	 Document Loader
loader	TokenNameIdentifier	 loader
;	TokenNameSEMICOLON	
/** * The exception thrown. */	TokenNameCOMMENT_JAVADOC	 The exception thrown. 
protected	TokenNameprotected	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
/** * The listeners. */	TokenNameCOMMENT_JAVADOC	 The listeners. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedList	TokenNameIdentifier	 synchronized List
(	TokenNameLPAREN	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new SVGDocumentLoader. * @param u The URL of the document. * @param l The document loader to use */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGDocumentLoader. @param u The URL of the document. @param l The document loader to use 
public	TokenNamepublic	
SVGDocumentLoader	TokenNameIdentifier	 SVG Document Loader
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
u	TokenNameIdentifier	 u
,	TokenNameCOMMA	
DocumentLoader	TokenNameIdentifier	 Document Loader
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
;	TokenNameSEMICOLON	
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Runs this loader. */	TokenNameCOMMENT_JAVADOC	 Runs this loader. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGDocumentLoaderEvent	TokenNameIdentifier	 SVG Document Loader Event
evt	TokenNameIdentifier	 evt
;	TokenNameSEMICOLON	
evt	TokenNameIdentifier	 evt
=	TokenNameEQUAL	
new	TokenNamenew	
SVGDocumentLoaderEvent	TokenNameIdentifier	 SVG Document Loader Event
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
startedDispatcher	TokenNameIdentifier	 started Dispatcher
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isHalted	TokenNameIdentifier	 is Halted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
cancelledDispatcher	TokenNameIdentifier	 cancelled Dispatcher
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SVGDocument	TokenNameIdentifier	 SVG Document
svgDocument	TokenNameIdentifier	 svg Document
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGDocument	TokenNameIdentifier	 SVG Document
)	TokenNameRPAREN	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isHalted	TokenNameIdentifier	 is Halted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
cancelledDispatcher	TokenNameIdentifier	 cancelled Dispatcher
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
evt	TokenNameIdentifier	 evt
=	TokenNameEQUAL	
new	TokenNamenew	
SVGDocumentLoaderEvent	TokenNameIdentifier	 SVG Document Loader Event
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
svgDocument	TokenNameIdentifier	 svg Document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
completedDispatcher	TokenNameIdentifier	 completed Dispatcher
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
cancelledDispatcher	TokenNameIdentifier	 cancelled Dispatcher
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
failedDispatcher	TokenNameIdentifier	 failed Dispatcher
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ThreadDeath	TokenNameIdentifier	 Thread Death
td	TokenNameIdentifier	 td
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
failedDispatcher	TokenNameIdentifier	 failed Dispatcher
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
td	TokenNameIdentifier	 td
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
failedDispatcher	TokenNameIdentifier	 failed Dispatcher
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the exception, if any occured. */	TokenNameCOMMENT_JAVADOC	 Returns the exception, if any occured. 
public	TokenNamepublic	
Exception	TokenNameIdentifier	 Exception
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a SVGDocumentLoaderListener to this SVGDocumentLoader. */	TokenNameCOMMENT_JAVADOC	 Adds a SVGDocumentLoaderListener to this SVGDocumentLoader. 
public	TokenNamepublic	
void	TokenNamevoid	
addSVGDocumentLoaderListener	TokenNameIdentifier	 add SVG Document Loader Listener
(	TokenNameLPAREN	
SVGDocumentLoaderListener	TokenNameIdentifier	 SVG Document Loader Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes a SVGDocumentLoaderListener from this SVGDocumentLoader. */	TokenNameCOMMENT_JAVADOC	 Removes a SVGDocumentLoaderListener from this SVGDocumentLoader. 
public	TokenNamepublic	
void	TokenNamevoid	
removeSVGDocumentLoaderListener	TokenNameIdentifier	 remove SVG Document Loader Listener
(	TokenNameLPAREN	
SVGDocumentLoaderListener	TokenNameIdentifier	 SVG Document Loader Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
Dispatcher	TokenNameIdentifier	 Dispatcher
dispatcher	TokenNameIdentifier	 dispatcher
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EventDispatcher	TokenNameIdentifier	 Event Dispatcher
.	TokenNameDOT	
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
dispatcher	TokenNameIdentifier	 dispatcher
,	TokenNameCOMMA	
listeners	TokenNameIdentifier	 listeners
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Dispatcher	TokenNameIdentifier	 Dispatcher
startedDispatcher	TokenNameIdentifier	 started Dispatcher
=	TokenNameEQUAL	
new	TokenNamenew	
Dispatcher	TokenNameIdentifier	 Dispatcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
dispatch	TokenNameIdentifier	 dispatch
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGDocumentLoaderListener	TokenNameIdentifier	 SVG Document Loader Listener
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
.	TokenNameDOT	
documentLoadingStarted	TokenNameIdentifier	 document Loading Started
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGDocumentLoaderEvent	TokenNameIdentifier	 SVG Document Loader Event
)	TokenNameRPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Dispatcher	TokenNameIdentifier	 Dispatcher
completedDispatcher	TokenNameIdentifier	 completed Dispatcher
=	TokenNameEQUAL	
new	TokenNamenew	
Dispatcher	TokenNameIdentifier	 Dispatcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
dispatch	TokenNameIdentifier	 dispatch
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGDocumentLoaderListener	TokenNameIdentifier	 SVG Document Loader Listener
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
.	TokenNameDOT	
documentLoadingCompleted	TokenNameIdentifier	 document Loading Completed
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGDocumentLoaderEvent	TokenNameIdentifier	 SVG Document Loader Event
)	TokenNameRPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Dispatcher	TokenNameIdentifier	 Dispatcher
cancelledDispatcher	TokenNameIdentifier	 cancelled Dispatcher
=	TokenNameEQUAL	
new	TokenNamenew	
Dispatcher	TokenNameIdentifier	 Dispatcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
dispatch	TokenNameIdentifier	 dispatch
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGDocumentLoaderListener	TokenNameIdentifier	 SVG Document Loader Listener
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
.	TokenNameDOT	
documentLoadingCancelled	TokenNameIdentifier	 document Loading Cancelled
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGDocumentLoaderEvent	TokenNameIdentifier	 SVG Document Loader Event
)	TokenNameRPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Dispatcher	TokenNameIdentifier	 Dispatcher
failedDispatcher	TokenNameIdentifier	 failed Dispatcher
=	TokenNameEQUAL	
new	TokenNamenew	
Dispatcher	TokenNameIdentifier	 Dispatcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
dispatch	TokenNameIdentifier	 dispatch
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGDocumentLoaderListener	TokenNameIdentifier	 SVG Document Loader Listener
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
.	TokenNameDOT	
documentLoadingFailed	TokenNameIdentifier	 document Loading Failed
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGDocumentLoaderEvent	TokenNameIdentifier	 SVG Document Loader Event
)	TokenNameRPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
