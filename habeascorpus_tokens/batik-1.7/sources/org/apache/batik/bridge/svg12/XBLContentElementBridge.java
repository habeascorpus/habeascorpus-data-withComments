/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
svg12	TokenNameIdentifier	 svg12
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
AbstractGraphicsNodeBridge	TokenNameIdentifier	 Abstract Graphics Node Bridge
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
Bridge	TokenNameIdentifier	 Bridge
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
BridgeContext	TokenNameIdentifier	 Bridge Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
GVTBuilder	TokenNameIdentifier	 GVT Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AbstractDocument	TokenNameIdentifier	 Abstract Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg12	TokenNameIdentifier	 svg12
.	TokenNameDOT	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XBLConstants	TokenNameIdentifier	 XBL Constants
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
/** * Bridge class for the &lt;xbl:content&gt; element. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: XBLContentElementBridge.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;xbl:content&gt; element. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: XBLContentElementBridge.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
XBLContentElementBridge	TokenNameIdentifier	 XBL Content Element Bridge
extends	TokenNameextends	
AbstractGraphicsNodeBridge	TokenNameIdentifier	 Abstract Graphics Node Bridge
{	TokenNameLBRACE	
/** * The event listener for content element selection changes. */	TokenNameCOMMENT_JAVADOC	 The event listener for content element selection changes. 
protected	TokenNameprotected	
ContentChangedListener	TokenNameIdentifier	 Content Changed Listener
contentChangedListener	TokenNameIdentifier	 content Changed Listener
;	TokenNameSEMICOLON	
/** * The ContentManager object used for the content element selection * change events. */	TokenNameCOMMENT_JAVADOC	 The ContentManager object used for the content element selection change events. 
protected	TokenNameprotected	
ContentManager	TokenNameIdentifier	 Content Manager
contentManager	TokenNameIdentifier	 content Manager
;	TokenNameSEMICOLON	
/** * Constructs a new bridge for the &lt;xbl:content&gt; element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the &lt;xbl:content&gt; element. 
public	TokenNamepublic	
XBLContentElementBridge	TokenNameIdentifier	 XBL Content Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'content'. */	TokenNameCOMMENT_JAVADOC	 Returns 'content'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XBLConstants	TokenNameIdentifier	 XBL Constants
.	TokenNameDOT	
XBL_CONTENT_TAG	TokenNameIdentifier	 XBL  CONTENT  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the XBL namespace. */	TokenNameCOMMENT_JAVADOC	 Returns the XBL namespace. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XBLConstants	TokenNameIdentifier	 XBL Constants
.	TokenNameDOT	
XBL_NAMESPACE_URI	TokenNameIdentifier	 XBL  NAMESPACE  URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new instance of this bridge. */	TokenNameCOMMENT_JAVADOC	 Returns a new instance of this bridge. 
public	TokenNamepublic	
Bridge	TokenNameIdentifier	 Bridge
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XBLContentElementBridge	TokenNameIdentifier	 XBL Content Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a <tt>GraphicsNode</tt> according to the specified parameters. * * @param ctx the bridge context to use * @param e the element that describes the graphics node to build * @return a graphics node that represents the specified element */	TokenNameCOMMENT_JAVADOC	 Creates a <tt>GraphicsNode</tt> according to the specified parameters. * @param ctx the bridge context to use @param e the element that describes the graphics node to build @return a graphics node that represents the specified element 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
createGraphicsNode	TokenNameIdentifier	 create Graphics Node
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
buildCompositeGraphicsNode	TokenNameIdentifier	 build Composite Graphics Node
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gn	TokenNameIdentifier	 gn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a <tt>GraphicsNode</tt> from the input element and * populates the input <tt>CompositeGraphicsNode</tt> * * @param ctx the bridge context to use * @param e the element that describes the graphics node to build * @param cgn the CompositeGraphicsNode where the use graphical * content will be appended. The composite node is emptied * before appending new content. */	TokenNameCOMMENT_JAVADOC	 Creates a <tt>GraphicsNode</tt> from the input element and populates the input <tt>CompositeGraphicsNode</tt> * @param ctx the bridge context to use @param e the element that describes the graphics node to build @param cgn the CompositeGraphicsNode where the use graphical content will be appended. The composite node is emptied before appending new content. 
public	TokenNamepublic	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
buildCompositeGraphicsNode	TokenNameIdentifier	 build Composite Graphics Node
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
cgn	TokenNameIdentifier	 cgn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
AbstractDocument	TokenNameIdentifier	 Abstract Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DefaultXBLManager	TokenNameIdentifier	 Default XBL Manager
xm	TokenNameIdentifier	 xm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DefaultXBLManager	TokenNameIdentifier	 Default XBL Manager
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getXBLManager	TokenNameIdentifier	 get XBL Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
contentManager	TokenNameIdentifier	 content Manager
=	TokenNameEQUAL	
xm	TokenNameIdentifier	 xm
.	TokenNameDOT	
getContentManager	TokenNameIdentifier	 get Content Manager
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cgn	TokenNameIdentifier	 cgn
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cgn	TokenNameIdentifier	 cgn
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
associateSVGContext	TokenNameIdentifier	 associate SVG Context
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
cgn	TokenNameIdentifier	 cgn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
cgn	TokenNameIdentifier	 cgn
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cgn	TokenNameIdentifier	 cgn
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
GVTBuilder	TokenNameIdentifier	 GVT Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getGVTBuilder	TokenNameIdentifier	 get GVT Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeList	TokenNameIdentifier	 Node List
nl	TokenNameIdentifier	 nl
=	TokenNameEQUAL	
contentManager	TokenNameIdentifier	 content Manager
.	TokenNameDOT	
getSelectedContent	TokenNameIdentifier	 get Selected Content
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nl	TokenNameIdentifier	 nl
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
GraphicsNode	TokenNameIdentifier	 Graphics Node
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gn	TokenNameIdentifier	 gn
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cgn	TokenNameIdentifier	 cgn
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
gn	TokenNameIdentifier	 gn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
isDynamic	TokenNameIdentifier	 is Dynamic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
contentChangedListener	TokenNameIdentifier	 content Changed Listener
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Should be the same ContentManager each build 	TokenNameCOMMENT_LINE	Should be the same ContentManager each build 
contentChangedListener	TokenNameIdentifier	 content Changed Listener
=	TokenNameEQUAL	
new	TokenNamenew	
ContentChangedListener	TokenNameIdentifier	 Content Changed Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
contentManager	TokenNameIdentifier	 content Manager
.	TokenNameDOT	
addContentSelectionChangedListener	TokenNameIdentifier	 add Content Selection Changed Listener
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
contentChangedListener	TokenNameIdentifier	 content Changed Listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
cgn	TokenNameIdentifier	 cgn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a <tt>CompositeGraphicsNode</tt>. */	TokenNameCOMMENT_JAVADOC	 Creates a <tt>CompositeGraphicsNode</tt>. 
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
instantiateGraphicsNode	TokenNameIdentifier	 instantiate Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Not needed, since createGraphicsNode is overridden 	TokenNameCOMMENT_LINE	Not needed, since createGraphicsNode is overridden 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds using the specified BridgeContext and element, the * specified graphics node. * * @param ctx the bridge context to use * @param e the element that describes the graphics node to build * @param node the graphics node to build */	TokenNameCOMMENT_JAVADOC	 Builds using the specified BridgeContext and element, the specified graphics node. * @param ctx the bridge context to use @param e the element that describes the graphics node to build @param node the graphics node to build 
public	TokenNamepublic	
void	TokenNamevoid	
buildGraphicsNode	TokenNameIdentifier	 build Graphics Node
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initializeDynamicSupport	TokenNameIdentifier	 initialize Dynamic Support
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the graphics node has to be displayed, false * otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if the graphics node has to be displayed, false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getDisplay	TokenNameIdentifier	 get Display
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns false as the &lt;xbl:content&gt; element's selected nodes * are built all in this class. */	TokenNameCOMMENT_JAVADOC	 Returns false as the &lt;xbl:content&gt; element's selected nodes are built all in this class. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isComposite	TokenNameIdentifier	 is Composite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dispose this bridge by removing the ContentSelectionChangedListener * object. */	TokenNameCOMMENT_JAVADOC	 Dispose this bridge by removing the ContentSelectionChangedListener object. 
public	TokenNamepublic	
void	TokenNamevoid	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
contentChangedListener	TokenNameIdentifier	 content Changed Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
contentManager	TokenNameIdentifier	 content Manager
.	TokenNameDOT	
removeContentSelectionChangedListener	TokenNameIdentifier	 remove Content Selection Changed Listener
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
contentChangedListener	TokenNameIdentifier	 content Changed Listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Class to respond to content selection changes and cause GVT rebuilds. */	TokenNameCOMMENT_JAVADOC	 Class to respond to content selection changes and cause GVT rebuilds. 
protected	TokenNameprotected	
class	TokenNameclass	
ContentChangedListener	TokenNameIdentifier	 Content Changed Listener
implements	TokenNameimplements	
ContentSelectionChangedListener	TokenNameIdentifier	 Content Selection Changed Listener
{	TokenNameLBRACE	
/** * Invoked after an xbl:content element has updated its selected * nodes list. * @param csce the ContentSelectionChangedEvent object */	TokenNameCOMMENT_JAVADOC	 Invoked after an xbl:content element has updated its selected nodes list. @param csce the ContentSelectionChangedEvent object 
public	TokenNamepublic	
void	TokenNamevoid	
contentSelectionChanged	TokenNameIdentifier	 content Selection Changed
(	TokenNameLPAREN	
ContentSelectionChangedEvent	TokenNameIdentifier	 Content Selection Changed Event
csce	TokenNameIdentifier	 csce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildCompositeGraphicsNode	TokenNameIdentifier	 build Composite Graphics Node
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
(	TokenNameLPAREN	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
