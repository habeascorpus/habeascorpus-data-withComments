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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EventListener	TokenNameIdentifier	 Event Listener
;	TokenNameSEMICOLON	
/** * The listener interface for receiving graphics node key events. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: GraphicsNodeKeyListener.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 The listener interface for receiving graphics node key events. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: GraphicsNodeKeyListener.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
GraphicsNodeKeyListener	TokenNameIdentifier	 Graphics Node Key Listener
extends	TokenNameextends	
EventListener	TokenNameIdentifier	 Event Listener
{	TokenNameLBRACE	
/** * Invoked when a key has been pressed. * @param evt the graphics node key event */	TokenNameCOMMENT_JAVADOC	 Invoked when a key has been pressed. @param evt the graphics node key event 
void	TokenNamevoid	
keyPressed	TokenNameIdentifier	 key Pressed
(	TokenNameLPAREN	
GraphicsNodeKeyEvent	TokenNameIdentifier	 Graphics Node Key Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked when a key has been released. * @param evt the graphics node key event */	TokenNameCOMMENT_JAVADOC	 Invoked when a key has been released. @param evt the graphics node key event 
void	TokenNamevoid	
keyReleased	TokenNameIdentifier	 key Released
(	TokenNameLPAREN	
GraphicsNodeKeyEvent	TokenNameIdentifier	 Graphics Node Key Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked when a key has been typed. * @param evt the graphics node key event */	TokenNameCOMMENT_JAVADOC	 Invoked when a key has been typed. @param evt the graphics node key event 
void	TokenNamevoid	
keyTyped	TokenNameIdentifier	 key Typed
(	TokenNameLPAREN	
GraphicsNodeKeyEvent	TokenNameIdentifier	 Graphics Node Key Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
