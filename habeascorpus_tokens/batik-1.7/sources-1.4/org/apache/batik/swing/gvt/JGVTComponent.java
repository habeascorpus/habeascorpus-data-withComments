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
event	TokenNameIdentifier	 event
.	TokenNameDOT	
MouseWheelEvent	TokenNameIdentifier	 Mouse Wheel Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
MouseWheelListener	TokenNameIdentifier	 Mouse Wheel Listener
;	TokenNameSEMICOLON	
/** * Concrete version of {@link org.apache.batik.swing.gvt.AbstractJGVTComponent}. * * This class is used for JDKs &gt;= 1.4, which have MouseWheelEvent * support. For JDKs &lt; 1.4, the file * sources-1.3/org/apache/batik/swing/gvt/JGVTComponent defines a * version of this class that does support MouseWheelEvents. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: JGVTComponent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Concrete version of {@link org.apache.batik.swing.gvt.AbstractJGVTComponent}. * This class is used for JDKs &gt;= 1.4, which have MouseWheelEvent support. For JDKs &lt; 1.4, the file sources-1.3/org/apache/batik/swing/gvt/JGVTComponent defines a version of this class that does support MouseWheelEvents. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: JGVTComponent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
JGVTComponent	TokenNameIdentifier	 JGVT Component
extends	TokenNameextends	
AbstractJGVTComponent	TokenNameIdentifier	 Abstract JGVT Component
{	TokenNameLBRACE	
/** * Creates a new JGVTComponent. */	TokenNameCOMMENT_JAVADOC	 Creates a new JGVTComponent. 
public	TokenNamepublic	
JGVTComponent	TokenNameIdentifier	 JGVT Component
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new JGVTComponent. * @param eventsEnabled Whether the GVT tree should be reactive * to mouse and key events. * @param selectableText Whether the text should be selectable. * if eventEnabled is false, this flag is ignored. */	TokenNameCOMMENT_JAVADOC	 Creates a new JGVTComponent. @param eventsEnabled Whether the GVT tree should be reactive to mouse and key events. @param selectableText Whether the text should be selectable. if eventEnabled is false, this flag is ignored. 
public	TokenNamepublic	
JGVTComponent	TokenNameIdentifier	 JGVT Component
(	TokenNameLPAREN	
boolean	TokenNameboolean	
eventsEnabled	TokenNameIdentifier	 events Enabled
,	TokenNameCOMMA	
boolean	TokenNameboolean	
selectableText	TokenNameIdentifier	 selectable Text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
eventsEnabled	TokenNameIdentifier	 events Enabled
,	TokenNameCOMMA	
selectableText	TokenNameIdentifier	 selectable Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds the AWT listeners. */	TokenNameCOMMENT_JAVADOC	 Adds the AWT listeners. 
protected	TokenNameprotected	
void	TokenNamevoid	
addAWTListeners	TokenNameIdentifier	 add AWT Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
addAWTListeners	TokenNameIdentifier	 add AWT Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addMouseWheelListener	TokenNameIdentifier	 add Mouse Wheel Listener
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExtendedListener	TokenNameIdentifier	 Extended Listener
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an instance of Listener. * Override to provide a Listener that can listen for mouse wheel * events. */	TokenNameCOMMENT_JAVADOC	 Creates an instance of Listener. Override to provide a Listener that can listen for mouse wheel events. 
protected	TokenNameprotected	
Listener	TokenNameIdentifier	 Listener
createListener	TokenNameIdentifier	 create Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ExtendedListener	TokenNameIdentifier	 Extended Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To hide the listener methods. */	TokenNameCOMMENT_JAVADOC	 To hide the listener methods. 
protected	TokenNameprotected	
class	TokenNameclass	
ExtendedListener	TokenNameIdentifier	 Extended Listener
extends	TokenNameextends	
Listener	TokenNameIdentifier	 Listener
implements	TokenNameimplements	
MouseWheelListener	TokenNameIdentifier	 Mouse Wheel Listener
{	TokenNameLBRACE	
// MouseWheelListener /////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	MouseWheelListener /////////////////////////////////////////////// 
/** * Invoked when the mouse wheel has been scrolled. */	TokenNameCOMMENT_JAVADOC	 Invoked when the mouse wheel has been scrolled. 
public	TokenNamepublic	
void	TokenNamevoid	
mouseWheelMoved	TokenNameIdentifier	 mouse Wheel Moved
(	TokenNameLPAREN	
MouseWheelEvent	TokenNameIdentifier	 Mouse Wheel Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*selectInteractor(e); if (interactor != null) { interactor.mouseWheelMoved(e); deselectInteractor(); } else*/	TokenNameCOMMENT_BLOCK	selectInteractor(e); if (interactor != null) { interactor.mouseWheelMoved(e); deselectInteractor(); } else
if	TokenNameif	
(	TokenNameLPAREN	
eventDispatcher	TokenNameIdentifier	 event Dispatcher
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatchMouseWheelMoved	TokenNameIdentifier	 dispatch Mouse Wheel Moved
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Dispatches the mouse event to the GVT tree. */	TokenNameCOMMENT_JAVADOC	 Dispatches the mouse event to the GVT tree. 
protected	TokenNameprotected	
void	TokenNamevoid	
dispatchMouseWheelMoved	TokenNameIdentifier	 dispatch Mouse Wheel Moved
(	TokenNameLPAREN	
MouseWheelEvent	TokenNameIdentifier	 Mouse Wheel Event
e	TokenNameIdentifier	 e
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
}	TokenNameRBRACE	
