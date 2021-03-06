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
/** * An abstract adapter class for receiving graphics node change * events. The methods in this class are empty. This class exists as * convenience for creating listener objects. * * <p>Extend this class to create a <tt>GraphicsNodeChangeEvent</tt> * listener and override the methods for the events of interest. (If * you implement the <tt>GraphicsNodeChangeListener</tt> interface, you * have to define all of the methods in it. This abstract class * defines null methods for them all, so you can only have to define * methods for events you care about.) * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: GraphicsNodeChangeAdapter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An abstract adapter class for receiving graphics node change events. The methods in this class are empty. This class exists as convenience for creating listener objects. * <p>Extend this class to create a <tt>GraphicsNodeChangeEvent</tt> listener and override the methods for the events of interest. (If you implement the <tt>GraphicsNodeChangeListener</tt> interface, you have to define all of the methods in it. This abstract class defines null methods for them all, so you can only have to define methods for events you care about.) * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: GraphicsNodeChangeAdapter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
GraphicsNodeChangeAdapter	TokenNameIdentifier	 Graphics Node Change Adapter
implements	TokenNameimplements	
GraphicsNodeChangeListener	TokenNameIdentifier	 Graphics Node Change Listener
{	TokenNameLBRACE	
/** * Invoked when a change has started on a graphics node, but before * any changes occure in the graphics node it's self. * @param gnce the graphics node change event */	TokenNameCOMMENT_JAVADOC	 Invoked when a change has started on a graphics node, but before any changes occure in the graphics node it's self. @param gnce the graphics node change event 
public	TokenNamepublic	
void	TokenNamevoid	
changeStarted	TokenNameIdentifier	 change Started
(	TokenNameLPAREN	
GraphicsNodeChangeEvent	TokenNameIdentifier	 Graphics Node Change Event
gnce	TokenNameIdentifier	 gnce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when a change on a graphics node has completed * @param gnce the graphics node change event */	TokenNameCOMMENT_JAVADOC	 Invoked when a change on a graphics node has completed @param gnce the graphics node change event 
public	TokenNamepublic	
void	TokenNamevoid	
changeCompleted	TokenNameIdentifier	 change Completed
(	TokenNameLPAREN	
GraphicsNodeChangeEvent	TokenNameIdentifier	 Graphics Node Change Event
gnce	TokenNameIdentifier	 gnce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
