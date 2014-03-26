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
gvt	TokenNameIdentifier	 gvt
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Shape	TokenNameIdentifier	 Shape
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
AffineTransform	TokenNameIdentifier	 Affine Transform
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
InterruptedBridgeException	TokenNameIdentifier	 Interrupted Bridge Exception
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
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
ImageRenderer	TokenNameIdentifier	 Image Renderer
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
/** * This class represents an object which renders asynchroneaously * a GVT tree. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: GVTTreeRenderer.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents an object which renders asynchroneaously a GVT tree. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: GVTTreeRenderer.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GVTTreeRenderer	TokenNameIdentifier	 GVT Tree Renderer
extends	TokenNameextends	
HaltingThread	TokenNameIdentifier	 Halting Thread
{	TokenNameLBRACE	
/** * The renderer used to paint. */	TokenNameCOMMENT_JAVADOC	 The renderer used to paint. 
protected	TokenNameprotected	
ImageRenderer	TokenNameIdentifier	 Image Renderer
renderer	TokenNameIdentifier	 renderer
;	TokenNameSEMICOLON	
/** * The area of interest. */	TokenNameCOMMENT_JAVADOC	 The area of interest. 
protected	TokenNameprotected	
Shape	TokenNameIdentifier	 Shape
areaOfInterest	TokenNameIdentifier	 area Of Interest
;	TokenNameSEMICOLON	
/** * The buffer width. */	TokenNameCOMMENT_JAVADOC	 The buffer width. 
protected	TokenNameprotected	
int	TokenNameint	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
/** * The buffer height. */	TokenNameCOMMENT_JAVADOC	 The buffer height. 
protected	TokenNameprotected	
int	TokenNameint	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
/** * The user to device transform. */	TokenNameCOMMENT_JAVADOC	 The user to device transform. 
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
user2DeviceTransform	TokenNameIdentifier	 user2 Device Transform
;	TokenNameSEMICOLON	
/** * Whether to enable the double buffering. */	TokenNameCOMMENT_JAVADOC	 Whether to enable the double buffering. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
doubleBuffering	TokenNameIdentifier	 double Buffering
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
/** * Creates a new GVTTreeRenderer. * @param r The renderer to use to paint. * @param usr2dev The user to device transform. * @param dbuffer Whether the double buffering should be enabled. * @param aoi The area of interest in the renderer space units. * @param width The offscreen buffer width. * @param height The offscreen buffer height. */	TokenNameCOMMENT_JAVADOC	 Creates a new GVTTreeRenderer. @param r The renderer to use to paint. @param usr2dev The user to device transform. @param dbuffer Whether the double buffering should be enabled. @param aoi The area of interest in the renderer space units. @param width The offscreen buffer width. @param height The offscreen buffer height. 
public	TokenNamepublic	
GVTTreeRenderer	TokenNameIdentifier	 GVT Tree Renderer
(	TokenNameLPAREN	
ImageRenderer	TokenNameIdentifier	 Image Renderer
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
AffineTransform	TokenNameIdentifier	 Affine Transform
usr2dev	TokenNameIdentifier	 usr2dev
,	TokenNameCOMMA	
boolean	TokenNameboolean	
dbuffer	TokenNameIdentifier	 dbuffer
,	TokenNameCOMMA	
Shape	TokenNameIdentifier	 Shape
aoi	TokenNameIdentifier	 aoi
,	TokenNameCOMMA	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
renderer	TokenNameIdentifier	 renderer
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
areaOfInterest	TokenNameIdentifier	 area Of Interest
=	TokenNameEQUAL	
aoi	TokenNameIdentifier	 aoi
;	TokenNameSEMICOLON	
user2DeviceTransform	TokenNameIdentifier	 user2 Device Transform
=	TokenNameEQUAL	
usr2dev	TokenNameIdentifier	 usr2dev
;	TokenNameSEMICOLON	
doubleBuffering	TokenNameIdentifier	 double Buffering
=	TokenNameEQUAL	
dbuffer	TokenNameIdentifier	 dbuffer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Runs this renderer. */	TokenNameCOMMENT_JAVADOC	 Runs this renderer. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
ev	TokenNameIdentifier	 ev
=	TokenNameEQUAL	
new	TokenNamenew	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
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
prepareDispatcher	TokenNameIdentifier	 prepare Dispatcher
,	TokenNameCOMMA	
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
user2DeviceTransform	TokenNameIdentifier	 user2 Device Transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
setDoubleBuffered	TokenNameIdentifier	 set Double Buffered
(	TokenNameLPAREN	
doubleBuffering	TokenNameIdentifier	 double Buffering
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
updateOffScreen	TokenNameIdentifier	 update Off Screen
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
clearOffScreen	TokenNameIdentifier	 clear Off Screen
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
ev	TokenNameIdentifier	 ev
=	TokenNameEQUAL	
new	TokenNamenew	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
getOffScreen	TokenNameIdentifier	 get Off Screen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
repaint	TokenNameIdentifier	 repaint
(	TokenNameLPAREN	
areaOfInterest	TokenNameIdentifier	 area Of Interest
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
ev	TokenNameIdentifier	 ev
=	TokenNameEQUAL	
new	TokenNamenew	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
getOffScreen	TokenNameIdentifier	 get Off Screen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
NoClassDefFoundError	TokenNameIdentifier	 No Class Def Found Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This error was reported to happen when the rendering 	TokenNameCOMMENT_LINE	This error was reported to happen when the rendering 
// is interrupted with JDK1.3.0rc1 Solaris. 	TokenNameCOMMENT_LINE	is interrupted with JDK1.3.0rc1 Solaris. 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedBridgeException	TokenNameIdentifier	 Interrupted Bridge Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this sometimes happens with SVG Fonts since the glyphs are 	TokenNameCOMMENT_LINE	this sometimes happens with SVG Fonts since the glyphs are 
// not built till the rendering stage 	TokenNameCOMMENT_LINE	not built till the rendering stage 
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
ThreadDeath	TokenNameIdentifier	 Thread Death
td	TokenNameIdentifier	 td
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
failedDispatcher	TokenNameIdentifier	 failed Dispatcher
,	TokenNameCOMMA	
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** * Adds a GVTTreeRendererListener to this GVTTreeRenderer. */	TokenNameCOMMENT_JAVADOC	 Adds a GVTTreeRendererListener to this GVTTreeRenderer. 
public	TokenNamepublic	
void	TokenNamevoid	
addGVTTreeRendererListener	TokenNameIdentifier	 add GVT Tree Renderer Listener
(	TokenNameLPAREN	
GVTTreeRendererListener	TokenNameIdentifier	 GVT Tree Renderer Listener
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
/** * Removes a GVTTreeRendererListener from this GVTTreeRenderer. */	TokenNameCOMMENT_JAVADOC	 Removes a GVTTreeRendererListener from this GVTTreeRenderer. 
public	TokenNamepublic	
void	TokenNamevoid	
removeGVTTreeRendererListener	TokenNameIdentifier	 remove GVT Tree Renderer Listener
(	TokenNameLPAREN	
GVTTreeRendererListener	TokenNameIdentifier	 GVT Tree Renderer Listener
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
static	TokenNamestatic	
Dispatcher	TokenNameIdentifier	 Dispatcher
prepareDispatcher	TokenNameIdentifier	 prepare Dispatcher
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
GVTTreeRendererListener	TokenNameIdentifier	 GVT Tree Renderer Listener
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
.	TokenNameDOT	
gvtRenderingPrepare	TokenNameIdentifier	 gvt Rendering Prepare
(	TokenNameLPAREN	
(	TokenNameLPAREN	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
)	TokenNameRPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
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
GVTTreeRendererListener	TokenNameIdentifier	 GVT Tree Renderer Listener
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
.	TokenNameDOT	
gvtRenderingStarted	TokenNameIdentifier	 gvt Rendering Started
(	TokenNameLPAREN	
(	TokenNameLPAREN	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
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
GVTTreeRendererListener	TokenNameIdentifier	 GVT Tree Renderer Listener
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
.	TokenNameDOT	
gvtRenderingCancelled	TokenNameIdentifier	 gvt Rendering Cancelled
(	TokenNameLPAREN	
(	TokenNameLPAREN	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
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
GVTTreeRendererListener	TokenNameIdentifier	 GVT Tree Renderer Listener
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
.	TokenNameDOT	
gvtRenderingCompleted	TokenNameIdentifier	 gvt Rendering Completed
(	TokenNameLPAREN	
(	TokenNameLPAREN	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
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
GVTTreeRendererListener	TokenNameIdentifier	 GVT Tree Renderer Listener
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
.	TokenNameDOT	
gvtRenderingFailed	TokenNameIdentifier	 gvt Rendering Failed
(	TokenNameLPAREN	
(	TokenNameLPAREN	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
)	TokenNameRPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
