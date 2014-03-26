/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
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
RootGraphicsNode	TokenNameIdentifier	 Root Graphics Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
/** * Interface for bridge classes that operate on Document nodes. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: DocumentBridge.java 582434 2007-10-06 02:11:51Z cam $ */	TokenNameCOMMENT_JAVADOC	 Interface for bridge classes that operate on Document nodes. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: DocumentBridge.java 582434 2007-10-06 02:11:51Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
DocumentBridge	TokenNameIdentifier	 Document Bridge
extends	TokenNameextends	
Bridge	TokenNameIdentifier	 Bridge
{	TokenNameLBRACE	
/** * Creates a <tt>GraphicsNode</tt> according to the specified parameters. * This is called before children have been added to the * returned GraphicsNode (obviously since you construct and return it). * * @param ctx the bridge context to use * @param doc the document node that describes the graphics node to build * @return a graphics node that represents the specified document node */	TokenNameCOMMENT_JAVADOC	 Creates a <tt>GraphicsNode</tt> according to the specified parameters. This is called before children have been added to the returned GraphicsNode (obviously since you construct and return it). * @param ctx the bridge context to use @param doc the document node that describes the graphics node to build @return a graphics node that represents the specified document node 
RootGraphicsNode	TokenNameIdentifier	 Root Graphics Node
createGraphicsNode	TokenNameIdentifier	 create Graphics Node
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Builds using the specified BridgeContext and element, the * specified graphics node. This is called after all the children * of the node have been constructed and added, so it is safe to * do work that depends on being able to see your children nodes * in this method. * * @param ctx the bridge context to use * @param doc the document node that describes the graphics node to build * @param node the graphics node to build */	TokenNameCOMMENT_JAVADOC	 Builds using the specified BridgeContext and element, the specified graphics node. This is called after all the children of the node have been constructed and added, so it is safe to do work that depends on being able to see your children nodes in this method. * @param ctx the bridge context to use @param doc the document node that describes the graphics node to build @param node the graphics node to build 
void	TokenNamevoid	
buildGraphicsNode	TokenNameIdentifier	 build Graphics Node
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
RootGraphicsNode	TokenNameIdentifier	 Root Graphics Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
