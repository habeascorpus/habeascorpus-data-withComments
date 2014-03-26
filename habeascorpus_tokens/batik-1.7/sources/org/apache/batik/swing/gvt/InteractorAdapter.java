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
InputEvent	TokenNameIdentifier	 Input Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
KeyEvent	TokenNameIdentifier	 Key Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
MouseEvent	TokenNameIdentifier	 Mouse Event
;	TokenNameSEMICOLON	
/** * This class represents an interactor which never interacts. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: InteractorAdapter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents an interactor which never interacts. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: InteractorAdapter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
InteractorAdapter	TokenNameIdentifier	 Interactor Adapter
implements	TokenNameimplements	
Interactor	TokenNameIdentifier	 Interactor
{	TokenNameLBRACE	
/** * Tells whether the given event will start the interactor. */	TokenNameCOMMENT_JAVADOC	 Tells whether the given event will start the interactor. 
public	TokenNamepublic	
boolean	TokenNameboolean	
startInteraction	TokenNameIdentifier	 start Interaction
(	TokenNameLPAREN	
InputEvent	TokenNameIdentifier	 Input Event
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether the interaction has finished. */	TokenNameCOMMENT_JAVADOC	 Tells whether the interaction has finished. 
public	TokenNamepublic	
boolean	TokenNameboolean	
endInteraction	TokenNameIdentifier	 end Interaction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// KeyListener ////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	KeyListener ////////////////////////////////////////////////////////// 
/** * Invoked when a key has been typed. * This event occurs when a key press is followed by a key release. */	TokenNameCOMMENT_JAVADOC	 Invoked when a key has been typed. This event occurs when a key press is followed by a key release. 
public	TokenNamepublic	
void	TokenNamevoid	
keyTyped	TokenNameIdentifier	 key Typed
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when a key has been pressed. */	TokenNameCOMMENT_JAVADOC	 Invoked when a key has been pressed. 
public	TokenNamepublic	
void	TokenNamevoid	
keyPressed	TokenNameIdentifier	 key Pressed
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when a key has been released. */	TokenNameCOMMENT_JAVADOC	 Invoked when a key has been released. 
public	TokenNamepublic	
void	TokenNamevoid	
keyReleased	TokenNameIdentifier	 key Released
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// MouseListener /////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	MouseListener /////////////////////////////////////////////////////// 
/** * Invoked when the mouse has been clicked on a component. */	TokenNameCOMMENT_JAVADOC	 Invoked when the mouse has been clicked on a component. 
public	TokenNamepublic	
void	TokenNamevoid	
mouseClicked	TokenNameIdentifier	 mouse Clicked
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when a mouse button has been pressed on a component. */	TokenNameCOMMENT_JAVADOC	 Invoked when a mouse button has been pressed on a component. 
public	TokenNamepublic	
void	TokenNamevoid	
mousePressed	TokenNameIdentifier	 mouse Pressed
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when a mouse button has been released on a component. */	TokenNameCOMMENT_JAVADOC	 Invoked when a mouse button has been released on a component. 
public	TokenNamepublic	
void	TokenNamevoid	
mouseReleased	TokenNameIdentifier	 mouse Released
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when the mouse enters a component. */	TokenNameCOMMENT_JAVADOC	 Invoked when the mouse enters a component. 
public	TokenNamepublic	
void	TokenNamevoid	
mouseEntered	TokenNameIdentifier	 mouse Entered
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when the mouse exits a component. */	TokenNameCOMMENT_JAVADOC	 Invoked when the mouse exits a component. 
public	TokenNamepublic	
void	TokenNamevoid	
mouseExited	TokenNameIdentifier	 mouse Exited
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// MouseMotionListener ///////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	MouseMotionListener ///////////////////////////////////////////////// 
/** * Invoked when a mouse button is pressed on a component and then * dragged. Mouse drag events will continue to be delivered to * the component where the first originated until the mouse button is * released (regardless of whether the mouse position is within the * bounds of the component). */	TokenNameCOMMENT_JAVADOC	 Invoked when a mouse button is pressed on a component and then dragged. Mouse drag events will continue to be delivered to the component where the first originated until the mouse button is released (regardless of whether the mouse position is within the bounds of the component). 
public	TokenNamepublic	
void	TokenNamevoid	
mouseDragged	TokenNameIdentifier	 mouse Dragged
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when the mouse button has been moved on a component * (with no buttons no down). */	TokenNameCOMMENT_JAVADOC	 Invoked when the mouse button has been moved on a component (with no buttons no down). 
public	TokenNamepublic	
void	TokenNamevoid	
mouseMoved	TokenNameIdentifier	 mouse Moved
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
