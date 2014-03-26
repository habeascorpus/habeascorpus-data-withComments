/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
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
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
GraphicsNodeChangeListener	TokenNameIdentifier	 Graphics Node Change Listener
;	TokenNameSEMICOLON	
/** * The top-level graphics node of the GVT tree. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: RootGraphicsNode.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 The top-level graphics node of the GVT tree. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: RootGraphicsNode.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
RootGraphicsNode	TokenNameIdentifier	 Root Graphics Node
extends	TokenNameextends	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
treeGraphicsNodeChangeListeners	TokenNameIdentifier	 tree Graphics Node Change Listeners
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructs a new empty <tt>RootGraphicsNode</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new empty <tt>RootGraphicsNode</tt>. 
public	TokenNamepublic	
RootGraphicsNode	TokenNameIdentifier	 Root Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns the root of the GVT tree or null if the node is not * part of a GVT tree. */	TokenNameCOMMENT_JAVADOC	 Returns the root of the GVT tree or null if the node is not part of a GVT tree. 
public	TokenNamepublic	
RootGraphicsNode	TokenNameIdentifier	 Root Graphics Node
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getTreeGraphicsNodeChangeListeners	TokenNameIdentifier	 get Tree Graphics Node Change Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
treeGraphicsNodeChangeListeners	TokenNameIdentifier	 tree Graphics Node Change Listeners
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
treeGraphicsNodeChangeListeners	TokenNameIdentifier	 tree Graphics Node Change Listeners
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
treeGraphicsNodeChangeListeners	TokenNameIdentifier	 tree Graphics Node Change Listeners
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addTreeGraphicsNodeChangeListener	TokenNameIdentifier	 add Tree Graphics Node Change Listener
(	TokenNameLPAREN	
GraphicsNodeChangeListener	TokenNameIdentifier	 Graphics Node Change Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getTreeGraphicsNodeChangeListeners	TokenNameIdentifier	 get Tree Graphics Node Change Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
removeTreeGraphicsNodeChangeListener	TokenNameIdentifier	 remove Tree Graphics Node Change Listener
(	TokenNameLPAREN	
GraphicsNodeChangeListener	TokenNameIdentifier	 Graphics Node Change Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getTreeGraphicsNodeChangeListeners	TokenNameIdentifier	 get Tree Graphics Node Change Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
