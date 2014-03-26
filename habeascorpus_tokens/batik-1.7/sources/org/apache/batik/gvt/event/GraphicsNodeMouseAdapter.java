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
/** * An abstract adapter class for receiving graphics node mouse * events. The methods in this class are empty. This class exists as * convenience for creating listener objects. * * <p>Extend this class to create a <tt>GraphicsNodeMouseEvent</tt> * listener and override the methods for the events of interest. (If * you implement the <tt>GraphicsNodeMouseListener</tt> interface, you * have to define all of the methods in it. This abstract class * defines null methods for them all, so you can only have to define * methods for events you care about.) * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: GraphicsNodeMouseAdapter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An abstract adapter class for receiving graphics node mouse events. The methods in this class are empty. This class exists as convenience for creating listener objects. * <p>Extend this class to create a <tt>GraphicsNodeMouseEvent</tt> listener and override the methods for the events of interest. (If you implement the <tt>GraphicsNodeMouseListener</tt> interface, you have to define all of the methods in it. This abstract class defines null methods for them all, so you can only have to define methods for events you care about.) * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: GraphicsNodeMouseAdapter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
GraphicsNodeMouseAdapter	TokenNameIdentifier	 Graphics Node Mouse Adapter
implements	TokenNameimplements	
GraphicsNodeMouseListener	TokenNameIdentifier	 Graphics Node Mouse Listener
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mouseClicked	TokenNameIdentifier	 mouse Clicked
(	TokenNameLPAREN	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mousePressed	TokenNameIdentifier	 mouse Pressed
(	TokenNameLPAREN	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mouseReleased	TokenNameIdentifier	 mouse Released
(	TokenNameLPAREN	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mouseEntered	TokenNameIdentifier	 mouse Entered
(	TokenNameLPAREN	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mouseExited	TokenNameIdentifier	 mouse Exited
(	TokenNameLPAREN	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mouseDragged	TokenNameIdentifier	 mouse Dragged
(	TokenNameLPAREN	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mouseMoved	TokenNameIdentifier	 mouse Moved
(	TokenNameLPAREN	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
