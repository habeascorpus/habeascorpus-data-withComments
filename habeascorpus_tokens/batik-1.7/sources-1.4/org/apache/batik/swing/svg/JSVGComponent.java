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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
MouseWheelEvent	TokenNameIdentifier	 Mouse Wheel Event
;	TokenNameSEMICOLON	
/** * Concrete version of {@link org.apache.batik.swing.svg.AbstractJSVGComponent}. * * This class is used for JDKs &gt;= 1.4, which have MouseWheelEvent * support. For JDKs &lt; 1.4, the file * sources-1.3/org/apache/batik/swing/gvt/JSVGComponent defines a * version of this class that does support MouseWheelEvents. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: JSVGComponent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Concrete version of {@link org.apache.batik.swing.svg.AbstractJSVGComponent}. * This class is used for JDKs &gt;= 1.4, which have MouseWheelEvent support. For JDKs &lt; 1.4, the file sources-1.3/org/apache/batik/swing/gvt/JSVGComponent defines a version of this class that does support MouseWheelEvents. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: JSVGComponent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
JSVGComponent	TokenNameIdentifier	 JSVG Component
extends	TokenNameextends	
AbstractJSVGComponent	TokenNameIdentifier	 Abstract JSVG Component
{	TokenNameLBRACE	
/** * Creates a new AbstractJSVGComponent. * @param ua a SVGUserAgent instance or null. * @param eventsEnabled Whether the GVT tree should be reactive * to mouse and key events. * @param selectableText Whether the text should be selectable. */	TokenNameCOMMENT_JAVADOC	 Creates a new AbstractJSVGComponent. @param ua a SVGUserAgent instance or null. @param eventsEnabled Whether the GVT tree should be reactive to mouse and key events. @param selectableText Whether the text should be selectable. 
public	TokenNamepublic	
JSVGComponent	TokenNameIdentifier	 JSVG Component
(	TokenNameLPAREN	
SVGUserAgent	TokenNameIdentifier	 SVG User Agent
ua	TokenNameIdentifier	 ua
,	TokenNameCOMMA	
boolean	TokenNameboolean	
eventsEnabled	TokenNameIdentifier	 events Enabled
,	TokenNameCOMMA	
boolean	TokenNameboolean	
selectableText	TokenNameIdentifier	 selectable Text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ua	TokenNameIdentifier	 ua
,	TokenNameCOMMA	
eventsEnabled	TokenNameIdentifier	 events Enabled
,	TokenNameCOMMA	
selectableText	TokenNameIdentifier	 selectable Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an instance of Listener. */	TokenNameCOMMENT_JAVADOC	 Creates an instance of Listener. 
protected	TokenNameprotected	
Listener	TokenNameIdentifier	 Listener
createListener	TokenNameIdentifier	 create Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ExtendedSVGListener	TokenNameIdentifier	 Extended SVG Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To hide the listener methods. */	TokenNameCOMMENT_JAVADOC	 To hide the listener methods. 
protected	TokenNameprotected	
class	TokenNameclass	
ExtendedSVGListener	TokenNameIdentifier	 Extended SVG Listener
extends	TokenNameextends	
SVGListener	TokenNameIdentifier	 SVG Listener
{	TokenNameLBRACE	
/** * Dispatches the event to the GVT tree. */	TokenNameCOMMENT_JAVADOC	 Dispatches the event to the GVT tree. 
protected	TokenNameprotected	
void	TokenNamevoid	
dispatchMouseWheelMoved	TokenNameIdentifier	 dispatch Mouse Wheel Moved
(	TokenNameLPAREN	
final	TokenNamefinal	
MouseWheelEvent	TokenNameIdentifier	 Mouse Wheel Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isInteractiveDocument	TokenNameIdentifier	 is Interactive Document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
dispatchMouseWheelMoved	TokenNameIdentifier	 dispatch Mouse Wheel Moved
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
updateManager	TokenNameIdentifier	 update Manager
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
updateManager	TokenNameIdentifier	 update Manager
.	TokenNameDOT	
isRunning	TokenNameIdentifier	 is Running
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
updateManager	TokenNameIdentifier	 update Manager
.	TokenNameDOT	
getUpdateRunnableQueue	TokenNameIdentifier	 get Update Runnable Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
invokeLater	TokenNameIdentifier	 invoke Later
(	TokenNameLPAREN	
new	TokenNamenew	
Runnable	TokenNameIdentifier	 Runnable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eventDispatcher	TokenNameIdentifier	 event Dispatcher
.	TokenNameDOT	
mouseWheelMoved	TokenNameIdentifier	 mouse Wheel Moved
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
