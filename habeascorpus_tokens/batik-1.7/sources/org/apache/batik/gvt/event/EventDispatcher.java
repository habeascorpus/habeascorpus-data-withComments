/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
InputEvent	TokenNameIdentifier	 Input Event
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
EventListener	TokenNameIdentifier	 Event Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EventObject	TokenNameIdentifier	 Event Object
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
/** * Interface for receiving and dispatching events down to a GVT tree. * * <p>Mouse events are dispatched to their "containing" node (the * GraphicsNode corresponding to the mouse event coordinate). Searches * for containment are performed from the EventDispatcher's "root" * node.</p> * * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> * @author <a href="mailto:tkormann@ilog.fr">Thierry Kormann</a> * @version $Id: EventDispatcher.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Interface for receiving and dispatching events down to a GVT tree. * <p>Mouse events are dispatched to their "containing" node (the GraphicsNode corresponding to the mouse event coordinate). Searches for containment are performed from the EventDispatcher's "root" node.</p> * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> @author <a href="mailto:tkormann@ilog.fr">Thierry Kormann</a> @version $Id: EventDispatcher.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
EventDispatcher	TokenNameIdentifier	 Event Dispatcher
{	TokenNameLBRACE	
/** * Sets the root node for MouseEvent dispatch containment searches * and field selections. * @param root the root node */	TokenNameCOMMENT_JAVADOC	 Sets the root node for MouseEvent dispatch containment searches and field selections. @param root the root node 
void	TokenNamevoid	
setRootNode	TokenNameIdentifier	 set Root Node
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the root node for MouseEvent dispatch containment * searches and field selections. */	TokenNameCOMMENT_JAVADOC	 Returns the root node for MouseEvent dispatch containment searches and field selections. 
GraphicsNode	TokenNameIdentifier	 Graphics Node
getRootNode	TokenNameIdentifier	 get Root Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the base transform applied to MouseEvent coordinates prior * to dispatch. * @param t the affine transform */	TokenNameCOMMENT_JAVADOC	 Sets the base transform applied to MouseEvent coordinates prior to dispatch. @param t the affine transform 
void	TokenNamevoid	
setBaseTransform	TokenNameIdentifier	 set Base Transform
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the base transform applied to MouseEvent coordinates prior * to dispatch. */	TokenNameCOMMENT_JAVADOC	 Returns the base transform applied to MouseEvent coordinates prior to dispatch. 
AffineTransform	TokenNameIdentifier	 Affine Transform
getBaseTransform	TokenNameIdentifier	 get Base Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Dispatched the specified event object. * * <p>Converts the EventObject to a corresponding GraphicsNodeEvent * and dispatch it to the appropriate GraphicsNode(s). If the * event is a MouseEvent the dispatch is performed to each * GraphicsNode which contains the MouseEvent coordinate, until * the event is consumed. If the event is a KeyEvent, it is * dispatched to the currently selected GraphicsNode.</p> * * @param e the event to dispatch */	TokenNameCOMMENT_JAVADOC	 Dispatched the specified event object. * <p>Converts the EventObject to a corresponding GraphicsNodeEvent and dispatch it to the appropriate GraphicsNode(s). If the event is a MouseEvent the dispatch is performed to each GraphicsNode which contains the MouseEvent coordinate, until the event is consumed. If the event is a KeyEvent, it is dispatched to the currently selected GraphicsNode.</p> * @param e the event to dispatch 
void	TokenNamevoid	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
EventObject	TokenNameIdentifier	 Event Object
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Global GVT listeners support 	TokenNameCOMMENT_LINE	Global GVT listeners support 
// 	TokenNameCOMMENT_LINE	 
/** * Adds the specified 'global' GraphicsNodeMouseListener which is * notified of all MouseEvents dispatched. * @param l the listener to add */	TokenNameCOMMENT_JAVADOC	 Adds the specified 'global' GraphicsNodeMouseListener which is notified of all MouseEvents dispatched. @param l the listener to add 
void	TokenNamevoid	
addGraphicsNodeMouseListener	TokenNameIdentifier	 add Graphics Node Mouse Listener
(	TokenNameLPAREN	
GraphicsNodeMouseListener	TokenNameIdentifier	 Graphics Node Mouse Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Removes the specified 'global' GraphicsNodeMouseListener which is * notified of all MouseEvents dispatched. * @param l the listener to remove */	TokenNameCOMMENT_JAVADOC	 Removes the specified 'global' GraphicsNodeMouseListener which is notified of all MouseEvents dispatched. @param l the listener to remove 
void	TokenNamevoid	
removeGraphicsNodeMouseListener	TokenNameIdentifier	 remove Graphics Node Mouse Listener
(	TokenNameLPAREN	
GraphicsNodeMouseListener	TokenNameIdentifier	 Graphics Node Mouse Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Adds the specified 'global' GraphicsNodeMouseWheelListener which is * notified of all MouseWheelEvents dispatched. * @param l the listener to add */	TokenNameCOMMENT_JAVADOC	 Adds the specified 'global' GraphicsNodeMouseWheelListener which is notified of all MouseWheelEvents dispatched. @param l the listener to add 
void	TokenNamevoid	
addGraphicsNodeMouseWheelListener	TokenNameIdentifier	 add Graphics Node Mouse Wheel Listener
(	TokenNameLPAREN	
GraphicsNodeMouseWheelListener	TokenNameIdentifier	 Graphics Node Mouse Wheel Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Removes the specified 'global' GraphicsNodeMouseWheelListener which is * notified of all MouseWheelEvents dispatched. * @param l the listener to remove */	TokenNameCOMMENT_JAVADOC	 Removes the specified 'global' GraphicsNodeMouseWheelListener which is notified of all MouseWheelEvents dispatched. @param l the listener to remove 
void	TokenNamevoid	
removeGraphicsNodeMouseWheelListener	TokenNameIdentifier	 remove Graphics Node Mouse Wheel Listener
(	TokenNameLPAREN	
GraphicsNodeMouseWheelListener	TokenNameIdentifier	 Graphics Node Mouse Wheel Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Adds the specified 'global' GraphicsNodeKeyListener which is * notified of all KeyEvents dispatched. * @param l the listener to add */	TokenNameCOMMENT_JAVADOC	 Adds the specified 'global' GraphicsNodeKeyListener which is notified of all KeyEvents dispatched. @param l the listener to add 
void	TokenNamevoid	
addGraphicsNodeKeyListener	TokenNameIdentifier	 add Graphics Node Key Listener
(	TokenNameLPAREN	
GraphicsNodeKeyListener	TokenNameIdentifier	 Graphics Node Key Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Removes the specified 'global' GraphicsNodeKeyListener which is * notified of all KeyEvents dispatched. * @param l the listener to remove */	TokenNameCOMMENT_JAVADOC	 Removes the specified 'global' GraphicsNodeKeyListener which is notified of all KeyEvents dispatched. @param l the listener to remove 
void	TokenNamevoid	
removeGraphicsNodeKeyListener	TokenNameIdentifier	 remove Graphics Node Key Listener
(	TokenNameLPAREN	
GraphicsNodeKeyListener	TokenNameIdentifier	 Graphics Node Key Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns an array of listeners that were added to this event * dispatcher and of the specified type. * @param listenerType the type of the listeners to return */	TokenNameCOMMENT_JAVADOC	 Returns an array of listeners that were added to this event dispatcher and of the specified type. @param listenerType the type of the listeners to return 
EventListener	TokenNameIdentifier	 Event Listener
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getListeners	TokenNameIdentifier	 get Listeners
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
listenerType	TokenNameIdentifier	 listener Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Associates all InputEvents of type <tt>e.getID()</tt> * with "incrementing" of the currently selected GraphicsNode. */	TokenNameCOMMENT_JAVADOC	 Associates all InputEvents of type <tt>e.getID()</tt> with "incrementing" of the currently selected GraphicsNode. 
void	TokenNamevoid	
setNodeIncrementEvent	TokenNameIdentifier	 set Node Increment Event
(	TokenNameLPAREN	
InputEvent	TokenNameIdentifier	 Input Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Associates all InputEvents of type <tt>e.getID()</tt> * with "decrementing" of the currently selected GraphicsNode. * The notion of "currently selected" GraphicsNode is used * for dispatching KeyEvents. */	TokenNameCOMMENT_JAVADOC	 Associates all InputEvents of type <tt>e.getID()</tt> with "decrementing" of the currently selected GraphicsNode. The notion of "currently selected" GraphicsNode is used for dispatching KeyEvents. 
void	TokenNamevoid	
setNodeDecrementEvent	TokenNameIdentifier	 set Node Decrement Event
(	TokenNameLPAREN	
InputEvent	TokenNameIdentifier	 Input Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
