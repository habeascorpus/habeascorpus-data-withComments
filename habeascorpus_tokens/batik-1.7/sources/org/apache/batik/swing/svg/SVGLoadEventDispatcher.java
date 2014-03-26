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
BridgeContext	TokenNameIdentifier	 Bridge Context
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
InterruptedBridgeException	TokenNameIdentifier	 Interrupted Bridge Exception
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
UpdateManager	TokenNameIdentifier	 Update Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
GraphicsNode	TokenNameIdentifier	 Graphics Node
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
/** * This class dispatches the SVGLoadEvent event on a SVG document. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGLoadEventDispatcher.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class dispatches the SVGLoadEvent event on a SVG document. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGLoadEventDispatcher.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGLoadEventDispatcher	TokenNameIdentifier	 SVG Load Event Dispatcher
extends	TokenNameextends	
HaltingThread	TokenNameIdentifier	 Halting Thread
{	TokenNameLBRACE	
/** * The SVG document to give to the bridge. */	TokenNameCOMMENT_JAVADOC	 The SVG document to give to the bridge. 
protected	TokenNameprotected	
SVGDocument	TokenNameIdentifier	 SVG Document
svgDocument	TokenNameIdentifier	 svg Document
;	TokenNameSEMICOLON	
/** * The root graphics node. */	TokenNameCOMMENT_JAVADOC	 The root graphics node. 
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
/** * The bridge context to use. */	TokenNameCOMMENT_JAVADOC	 The bridge context to use. 
protected	TokenNameprotected	
BridgeContext	TokenNameIdentifier	 Bridge Context
bridgeContext	TokenNameIdentifier	 bridge Context
;	TokenNameSEMICOLON	
/** * The update manager. */	TokenNameCOMMENT_JAVADOC	 The update manager. 
protected	TokenNameprotected	
UpdateManager	TokenNameIdentifier	 Update Manager
updateManager	TokenNameIdentifier	 update Manager
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
/** * The exception thrown. */	TokenNameCOMMENT_JAVADOC	 The exception thrown. 
protected	TokenNameprotected	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
/** * Creates a new SVGLoadEventDispatcher. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGLoadEventDispatcher. 
public	TokenNamepublic	
SVGLoadEventDispatcher	TokenNameIdentifier	 SVG Load Event Dispatcher
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
gn	TokenNameIdentifier	 gn
,	TokenNameCOMMA	
SVGDocument	TokenNameIdentifier	 SVG Document
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
BridgeContext	TokenNameIdentifier	 Bridge Context
bc	TokenNameIdentifier	 bc
,	TokenNameCOMMA	
UpdateManager	TokenNameIdentifier	 Update Manager
um	TokenNameIdentifier	 um
)	TokenNameRPAREN	
{	TokenNameLBRACE	
svgDocument	TokenNameIdentifier	 svg Document
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
;	TokenNameSEMICOLON	
bridgeContext	TokenNameIdentifier	 bridge Context
=	TokenNameEQUAL	
bc	TokenNameIdentifier	 bc
;	TokenNameSEMICOLON	
updateManager	TokenNameIdentifier	 update Manager
=	TokenNameEQUAL	
um	TokenNameIdentifier	 um
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Runs the dispatcher. */	TokenNameCOMMENT_JAVADOC	 Runs the dispatcher. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGLoadEventDispatcherEvent	TokenNameIdentifier	 SVG Load Event Dispatcher Event
ev	TokenNameIdentifier	 ev
;	TokenNameSEMICOLON	
ev	TokenNameIdentifier	 ev
=	TokenNameEQUAL	
new	TokenNamenew	
SVGLoadEventDispatcherEvent	TokenNameIdentifier	 SVG Load Event Dispatcher Event
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
startedDispatcher	TokenNameIdentifier	 started Dispatcher
,	TokenNameCOMMA	
ev	TokenNameIdentifier	 ev
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
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
updateManager	TokenNameIdentifier	 update Manager
.	TokenNameDOT	
dispatchSVGLoadEvent	TokenNameIdentifier	 dispatch SVG Load Event
(	TokenNameLPAREN	
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
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
completedDispatcher	TokenNameIdentifier	 completed Dispatcher
,	TokenNameCOMMA	
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
cancelledDispatcher	TokenNameIdentifier	 cancelled Dispatcher
,	TokenNameCOMMA	
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedBridgeException	TokenNameIdentifier	 Interrupted Bridge Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
cancelledDispatcher	TokenNameIdentifier	 cancelled Dispatcher
,	TokenNameCOMMA	
ev	TokenNameIdentifier	 ev
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
ev	TokenNameIdentifier	 ev
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
ev	TokenNameIdentifier	 ev
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
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the update manager. */	TokenNameCOMMENT_JAVADOC	 Returns the update manager. 
public	TokenNamepublic	
UpdateManager	TokenNameIdentifier	 Update Manager
getUpdateManager	TokenNameIdentifier	 get Update Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
updateManager	TokenNameIdentifier	 update Manager
;	TokenNameSEMICOLON	
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
/** * Adds a SVGLoadEventDispatcherListener to this SVGLoadEventDispatcher. */	TokenNameCOMMENT_JAVADOC	 Adds a SVGLoadEventDispatcherListener to this SVGLoadEventDispatcher. 
public	TokenNamepublic	
void	TokenNamevoid	
addSVGLoadEventDispatcherListener	TokenNameIdentifier	 add SVG Load Event Dispatcher Listener
(	TokenNameLPAREN	
SVGLoadEventDispatcherListener	TokenNameIdentifier	 SVG Load Event Dispatcher Listener
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
/** * Removes a SVGLoadEventDispatcherListener from this * SVGLoadEventDispatcher. */	TokenNameCOMMENT_JAVADOC	 Removes a SVGLoadEventDispatcherListener from this SVGLoadEventDispatcher. 
public	TokenNamepublic	
void	TokenNamevoid	
removeSVGLoadEventDispatcherListener	TokenNameIdentifier	 remove SVG Load Event Dispatcher Listener
(	TokenNameLPAREN	
SVGLoadEventDispatcherListener	TokenNameIdentifier	 SVG Load Event Dispatcher Listener
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
SVGLoadEventDispatcherListener	TokenNameIdentifier	 SVG Load Event Dispatcher Listener
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
.	TokenNameDOT	
svgLoadEventDispatchStarted	TokenNameIdentifier	 svg Load Event Dispatch Started
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGLoadEventDispatcherEvent	TokenNameIdentifier	 SVG Load Event Dispatcher Event
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
SVGLoadEventDispatcherListener	TokenNameIdentifier	 SVG Load Event Dispatcher Listener
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
.	TokenNameDOT	
svgLoadEventDispatchCompleted	TokenNameIdentifier	 svg Load Event Dispatch Completed
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGLoadEventDispatcherEvent	TokenNameIdentifier	 SVG Load Event Dispatcher Event
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
SVGLoadEventDispatcherListener	TokenNameIdentifier	 SVG Load Event Dispatcher Listener
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
.	TokenNameDOT	
svgLoadEventDispatchCancelled	TokenNameIdentifier	 svg Load Event Dispatch Cancelled
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGLoadEventDispatcherEvent	TokenNameIdentifier	 SVG Load Event Dispatcher Event
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
SVGLoadEventDispatcherListener	TokenNameIdentifier	 SVG Load Event Dispatcher Listener
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
.	TokenNameDOT	
svgLoadEventDispatchFailed	TokenNameIdentifier	 svg Load Event Dispatch Failed
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGLoadEventDispatcherEvent	TokenNameIdentifier	 SVG Load Event Dispatcher Event
)	TokenNameRPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
