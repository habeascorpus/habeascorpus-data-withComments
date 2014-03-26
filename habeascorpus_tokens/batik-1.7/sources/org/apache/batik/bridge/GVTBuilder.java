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
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HaltingThread	TokenNameIdentifier	 Halting Thread
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
SVGConstants	TokenNameIdentifier	 SVG Constants
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * This class is responsible for creating a GVT tree using an SVG DOM tree. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: GVTBuilder.java 599681 2007-11-30 02:55:48Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class is responsible for creating a GVT tree using an SVG DOM tree. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: GVTBuilder.java 599681 2007-11-30 02:55:48Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GVTBuilder	TokenNameIdentifier	 GVT Builder
implements	TokenNameimplements	
SVGConstants	TokenNameIdentifier	 SVG Constants
{	TokenNameLBRACE	
/** * Constructs a new builder. */	TokenNameCOMMENT_JAVADOC	 Constructs a new builder. 
public	TokenNamepublic	
GVTBuilder	TokenNameIdentifier	 GVT Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Builds using the specified bridge context the specified SVG document. * * @param ctx the bridge context * @param document the SVG document to build * @exception BridgeException if an error occured while constructing * the GVT tree */	TokenNameCOMMENT_JAVADOC	 Builds using the specified bridge context the specified SVG document. * @param ctx the bridge context @param document the SVG document to build @exception BridgeException if an error occured while constructing the GVT tree 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the bridge context is now associated to one document 	TokenNameCOMMENT_LINE	the bridge context is now associated to one document 
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
setDocument	TokenNameIdentifier	 set Document
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
initializeDocument	TokenNameIdentifier	 initialize Document
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// inform the bridge context the builder to use 	TokenNameCOMMENT_LINE	inform the bridge context the builder to use 
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
setGVTBuilder	TokenNameIdentifier	 set GVT Builder
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// build the GVT tree 	TokenNameCOMMENT_LINE	build the GVT tree 
DocumentBridge	TokenNameIdentifier	 Document Bridge
dBridge	TokenNameIdentifier	 d Bridge
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getDocumentBridge	TokenNameIdentifier	 get Document Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RootGraphicsNode	TokenNameIdentifier	 Root Graphics Node
rootNode	TokenNameIdentifier	 root Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// create the root node 	TokenNameCOMMENT_LINE	create the root node 
rootNode	TokenNameIdentifier	 root Node
=	TokenNameEQUAL	
dBridge	TokenNameIdentifier	 d Bridge
.	TokenNameDOT	
createGraphicsNode	TokenNameIdentifier	 create Graphics Node
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
svgElement	TokenNameIdentifier	 svg Element
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GraphicsNode	TokenNameIdentifier	 Graphics Node
topNode	TokenNameIdentifier	 top Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// get the appropriate bridge according to the specified element 	TokenNameCOMMENT_LINE	get the appropriate bridge according to the specified element 
Bridge	TokenNameIdentifier	 Bridge
bridge	TokenNameIdentifier	 bridge
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getBridge	TokenNameIdentifier	 get Bridge
(	TokenNameLPAREN	
svgElement	TokenNameIdentifier	 svg Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bridge	TokenNameIdentifier	 bridge
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
bridge	TokenNameIdentifier	 bridge
instanceof	TokenNameinstanceof	
GraphicsNodeBridge	TokenNameIdentifier	 Graphics Node Bridge
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create the associated composite graphics node 	TokenNameCOMMENT_LINE	create the associated composite graphics node 
GraphicsNodeBridge	TokenNameIdentifier	 Graphics Node Bridge
gnBridge	TokenNameIdentifier	 gn Bridge
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GraphicsNodeBridge	TokenNameIdentifier	 Graphics Node Bridge
)	TokenNameRPAREN	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
topNode	TokenNameIdentifier	 top Node
=	TokenNameEQUAL	
gnBridge	TokenNameIdentifier	 gn Bridge
.	TokenNameDOT	
createGraphicsNode	TokenNameIdentifier	 create Graphics Node
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
svgElement	TokenNameIdentifier	 svg Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
topNode	TokenNameIdentifier	 top Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rootNode	TokenNameIdentifier	 root Node
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
topNode	TokenNameIdentifier	 top Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buildComposite	TokenNameIdentifier	 build Composite
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
svgElement	TokenNameIdentifier	 svg Element
,	TokenNameCOMMA	
(	TokenNameLPAREN	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
)	TokenNameRPAREN	
topNode	TokenNameIdentifier	 top Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gnBridge	TokenNameIdentifier	 gn Bridge
.	TokenNameDOT	
buildGraphicsNode	TokenNameIdentifier	 build Graphics Node
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
svgElement	TokenNameIdentifier	 svg Element
,	TokenNameCOMMA	
topNode	TokenNameIdentifier	 top Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// finally, build the root node 	TokenNameCOMMENT_LINE	finally, build the root node 
dBridge	TokenNameIdentifier	 d Bridge
.	TokenNameDOT	
buildGraphicsNode	TokenNameIdentifier	 build Graphics Node
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
rootNode	TokenNameIdentifier	 root Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BridgeException	TokenNameIdentifier	 Bridge Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// update the exception with the missing parameters 	TokenNameCOMMENT_LINE	update the exception with the missing parameters 
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
setGraphicsNode	TokenNameIdentifier	 set Graphics Node
(	TokenNameLPAREN	
rootNode	TokenNameIdentifier	 root Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//ex.printStackTrace(); 	TokenNameCOMMENT_LINE	ex.printStackTrace(); 
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
// re-throw the udpated exception 	TokenNameCOMMENT_LINE	re-throw the udpated exception 
}	TokenNameRBRACE	
// For cursor handling 	TokenNameCOMMENT_LINE	For cursor handling 
if	TokenNameif	
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
isInteractive	TokenNameIdentifier	 is Interactive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
addUIEventListeners	TokenNameIdentifier	 add UI Event Listeners
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// register GVT listeners for AWT event support 	TokenNameCOMMENT_LINE	register GVT listeners for AWT event support 
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
addGVTListener	TokenNameIdentifier	 add GVT Listener
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <!> FIXME: TO BE REMOVED 	TokenNameCOMMENT_LINE	<!> FIXME: TO BE REMOVED 
if	TokenNameif	
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
isDynamic	TokenNameIdentifier	 is Dynamic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// register DOM listeners for dynamic support 	TokenNameCOMMENT_LINE	register DOM listeners for dynamic support 
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
addDOMListeners	TokenNameIdentifier	 add DOM Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
rootNode	TokenNameIdentifier	 root Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds using the specified bridge context the specified Element. * * @param ctx the bridge context * @param e the element to build * @exception BridgeException if an error occured while constructing * the GVT tree */	TokenNameCOMMENT_JAVADOC	 Builds using the specified bridge context the specified Element. * @param ctx the bridge context @param e the element to build @exception BridgeException if an error occured while constructing the GVT tree 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the appropriate bridge according to the specified element 	TokenNameCOMMENT_LINE	get the appropriate bridge according to the specified element 
Bridge	TokenNameIdentifier	 Bridge
bridge	TokenNameIdentifier	 bridge
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getBridge	TokenNameIdentifier	 get Bridge
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bridge	TokenNameIdentifier	 bridge
instanceof	TokenNameinstanceof	
GenericBridge	TokenNameIdentifier	 Generic Bridge
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If it is a GenericBridge just handle it and any GenericBridge 	TokenNameCOMMENT_LINE	If it is a GenericBridge just handle it and any GenericBridge 
// descendents and return. 	TokenNameCOMMENT_LINE	descendents and return. 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
GenericBridge	TokenNameIdentifier	 Generic Bridge
)	TokenNameRPAREN	
bridge	TokenNameIdentifier	 bridge
)	TokenNameRPAREN	
.	TokenNameDOT	
handleElement	TokenNameIdentifier	 handle Element
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handleGenericBridges	TokenNameIdentifier	 handle Generic Bridges
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bridge	TokenNameIdentifier	 bridge
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
bridge	TokenNameIdentifier	 bridge
instanceof	TokenNameinstanceof	
GraphicsNodeBridge	TokenNameIdentifier	 Graphics Node Bridge
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleGenericBridges	TokenNameIdentifier	 handle Generic Bridges
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create the associated graphics node 	TokenNameCOMMENT_LINE	create the associated graphics node 
GraphicsNodeBridge	TokenNameIdentifier	 Graphics Node Bridge
gnBridge	TokenNameIdentifier	 gn Bridge
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GraphicsNodeBridge	TokenNameIdentifier	 Graphics Node Bridge
)	TokenNameRPAREN	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
// check the display property 	TokenNameCOMMENT_LINE	check the display property 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
gnBridge	TokenNameIdentifier	 gn Bridge
.	TokenNameDOT	
getDisplay	TokenNameIdentifier	 get Display
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleGenericBridges	TokenNameIdentifier	 handle Generic Bridges
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
gnBridge	TokenNameIdentifier	 gn Bridge
.	TokenNameDOT	
createGraphicsNode	TokenNameIdentifier	 create Graphics Node
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gn	TokenNameIdentifier	 gn
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gnBridge	TokenNameIdentifier	 gn Bridge
.	TokenNameDOT	
isComposite	TokenNameIdentifier	 is Composite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildComposite	TokenNameIdentifier	 build Composite
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
(	TokenNameLPAREN	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
)	TokenNameRPAREN	
gn	TokenNameIdentifier	 gn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
handleGenericBridges	TokenNameIdentifier	 handle Generic Bridges
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
gnBridge	TokenNameIdentifier	 gn Bridge
.	TokenNameDOT	
buildGraphicsNode	TokenNameIdentifier	 build Graphics Node
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
gn	TokenNameIdentifier	 gn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <!> FIXME: see build(BridgeContext, Element) 	TokenNameCOMMENT_LINE	<!> FIXME: see build(BridgeContext, Element) 
// + may load the script twice (for example 	TokenNameCOMMENT_LINE	+ may load the script twice (for example 
// outside 'use' is ok versus local 'use' maybe wrong). 	TokenNameCOMMENT_LINE	outside 'use' is ok versus local 'use' maybe wrong). 
if	TokenNameif	
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
isDynamic	TokenNameIdentifier	 is Dynamic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//BridgeEventSupport.loadScripts(ctx, e); 	TokenNameCOMMENT_LINE	BridgeEventSupport.loadScripts(ctx, e); 
}	TokenNameRBRACE	
return	TokenNamereturn	
gn	TokenNameIdentifier	 gn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds a composite Element. * * @param ctx the bridge context * @param e the element to build * @param parentNode the composite graphics node, parent of the * graphics node to build * @exception BridgeException if an error occured while constructing * the GVT tree */	TokenNameCOMMENT_JAVADOC	 Builds a composite Element. * @param ctx the bridge context @param e the element to build @param parentNode the composite graphics node, parent of the graphics node to build @exception BridgeException if an error occured while constructing the GVT tree 
protected	TokenNameprotected	
void	TokenNamevoid	
buildComposite	TokenNameIdentifier	 build Composite
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
parentNode	TokenNameIdentifier	 parent Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildGraphicsNode	TokenNameIdentifier	 build Graphics Node
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
parentNode	TokenNameIdentifier	 parent Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Builds a 'leaf' Element. * * @param ctx the bridge context * @param e the element to build * @param parentNode the composite graphics node, parent of the * graphics node to build * @exception BridgeException if an error occured while constructing * the GVT tree */	TokenNameCOMMENT_JAVADOC	 Builds a 'leaf' Element. * @param ctx the bridge context @param e the element to build @param parentNode the composite graphics node, parent of the graphics node to build @exception BridgeException if an error occured while constructing the GVT tree 
protected	TokenNameprotected	
void	TokenNamevoid	
buildGraphicsNode	TokenNameIdentifier	 build Graphics Node
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
parentNode	TokenNameIdentifier	 parent Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check If we should halt early. 	TokenNameCOMMENT_LINE	Check If we should halt early. 
if	TokenNameif	
(	TokenNameLPAREN	
HaltingThread	TokenNameIdentifier	 Halting Thread
.	TokenNameDOT	
hasBeenHalted	TokenNameIdentifier	 has Been Halted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InterruptedBridgeException	TokenNameIdentifier	 Interrupted Bridge Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get the appropriate bridge according to the specified element 	TokenNameCOMMENT_LINE	get the appropriate bridge according to the specified element 
Bridge	TokenNameIdentifier	 Bridge
bridge	TokenNameIdentifier	 bridge
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getBridge	TokenNameIdentifier	 get Bridge
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bridge	TokenNameIdentifier	 bridge
instanceof	TokenNameinstanceof	
GenericBridge	TokenNameIdentifier	 Generic Bridge
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If it is a GenericBridge just handle it and any GenericBridge 	TokenNameCOMMENT_LINE	If it is a GenericBridge just handle it and any GenericBridge 
// descendents and return. 	TokenNameCOMMENT_LINE	descendents and return. 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
GenericBridge	TokenNameIdentifier	 Generic Bridge
)	TokenNameRPAREN	
bridge	TokenNameIdentifier	 bridge
)	TokenNameRPAREN	
.	TokenNameDOT	
handleElement	TokenNameIdentifier	 handle Element
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handleGenericBridges	TokenNameIdentifier	 handle Generic Bridges
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bridge	TokenNameIdentifier	 bridge
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
bridge	TokenNameIdentifier	 bridge
instanceof	TokenNameinstanceof	
GraphicsNodeBridge	TokenNameIdentifier	 Graphics Node Bridge
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleGenericBridges	TokenNameIdentifier	 handle Generic Bridges
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check the display property 	TokenNameCOMMENT_LINE	check the display property 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
convertDisplay	TokenNameIdentifier	 convert Display
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleGenericBridges	TokenNameIdentifier	 handle Generic Bridges
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GraphicsNodeBridge	TokenNameIdentifier	 Graphics Node Bridge
gnBridge	TokenNameIdentifier	 gn Bridge
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GraphicsNodeBridge	TokenNameIdentifier	 Graphics Node Bridge
)	TokenNameRPAREN	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// create the associated graphics node 	TokenNameCOMMENT_LINE	create the associated graphics node 
GraphicsNode	TokenNameIdentifier	 Graphics Node
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
gnBridge	TokenNameIdentifier	 gn Bridge
.	TokenNameDOT	
createGraphicsNode	TokenNameIdentifier	 create Graphics Node
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gn	TokenNameIdentifier	 gn
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// attach the graphics node to the GVT tree now ! 	TokenNameCOMMENT_LINE	attach the graphics node to the GVT tree now ! 
parentNode	TokenNameIdentifier	 parent Node
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
gn	TokenNameIdentifier	 gn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check if the element has children to build 	TokenNameCOMMENT_LINE	check if the element has children to build 
if	TokenNameif	
(	TokenNameLPAREN	
gnBridge	TokenNameIdentifier	 gn Bridge
.	TokenNameDOT	
isComposite	TokenNameIdentifier	 is Composite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildComposite	TokenNameIdentifier	 build Composite
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
(	TokenNameLPAREN	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
)	TokenNameRPAREN	
gn	TokenNameIdentifier	 gn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// if not then still handle the GenericBridges 	TokenNameCOMMENT_LINE	if not then still handle the GenericBridges 
handleGenericBridges	TokenNameIdentifier	 handle Generic Bridges
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
gnBridge	TokenNameIdentifier	 gn Bridge
.	TokenNameDOT	
buildGraphicsNode	TokenNameIdentifier	 build Graphics Node
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
gn	TokenNameIdentifier	 gn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
handleGenericBridges	TokenNameIdentifier	 handle Generic Bridges
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BridgeException	TokenNameIdentifier	 Bridge Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// some bridge may decide that the node in error can be 	TokenNameCOMMENT_LINE	some bridge may decide that the node in error can be 
// displayed (e.g. polyline, path...) 	TokenNameCOMMENT_LINE	displayed (e.g. polyline, path...) 
// In this case, the exception contains the GraphicsNode 	TokenNameCOMMENT_LINE	In this case, the exception contains the GraphicsNode 
GraphicsNode	TokenNameIdentifier	 Graphics Node
errNode	TokenNameIdentifier	 err Node
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getGraphicsNode	TokenNameIdentifier	 get Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
errNode	TokenNameIdentifier	 err Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parentNode	TokenNameIdentifier	 parent Node
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
errNode	TokenNameIdentifier	 err Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gnBridge	TokenNameIdentifier	 gn Bridge
.	TokenNameDOT	
buildGraphicsNode	TokenNameIdentifier	 build Graphics Node
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
errNode	TokenNameIdentifier	 err Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
setGraphicsNode	TokenNameIdentifier	 set Graphics Node
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//ex.printStackTrace(); 	TokenNameCOMMENT_LINE	ex.printStackTrace(); 
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Handles any GenericBridge elements which are children of the * specified element. * @param ctx the bridge context * @param e the element whose child elements should be handled */	TokenNameCOMMENT_JAVADOC	 Handles any GenericBridge elements which are children of the specified element. @param ctx the bridge context @param e the element whose child elements should be handled 
protected	TokenNameprotected	
void	TokenNamevoid	
handleGenericBridges	TokenNameIdentifier	 handle Generic Bridges
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
instanceof	TokenNameinstanceof	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
e2	TokenNameIdentifier	 e2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
Bridge	TokenNameIdentifier	 Bridge
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getBridge	TokenNameIdentifier	 get Bridge
(	TokenNameLPAREN	
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
instanceof	TokenNameinstanceof	
GenericBridge	TokenNameIdentifier	 Generic Bridge
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
GenericBridge	TokenNameIdentifier	 Generic Bridge
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
.	TokenNameDOT	
handleElement	TokenNameIdentifier	 handle Element
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
handleGenericBridges	TokenNameIdentifier	 handle Generic Bridges
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
