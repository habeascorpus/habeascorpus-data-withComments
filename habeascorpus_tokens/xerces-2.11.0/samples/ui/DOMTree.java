/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
ui	TokenNameIdentifier	 ui
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JTree	TokenNameIdentifier	 J Tree
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
DefaultTreeModel	TokenNameIdentifier	 Default Tree Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
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
NamedNodeMap	TokenNameIdentifier	 Named Node Map
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
/** * Displays a DOM document in a tree control. * * @author Andy Clark, IBM * @version $Id: DOMTree.java 447689 2006-09-19 02:40:36Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Displays a DOM document in a tree control. * @author Andy Clark, IBM @version $Id: DOMTree.java 447689 2006-09-19 02:40:36Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMTree	TokenNameIdentifier	 DOM Tree
extends	TokenNameextends	
JTree	TokenNameIdentifier	 J Tree
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3977582510937224497L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
DOMTree	TokenNameIdentifier	 DOM Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constructs a tree with the specified document. */	TokenNameCOMMENT_JAVADOC	 Constructs a tree with the specified document. 
public	TokenNamepublic	
DOMTree	TokenNameIdentifier	 DOM Tree
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
Model	TokenNameIdentifier	 Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set tree properties 	TokenNameCOMMENT_LINE	set tree properties 
setRootVisible	TokenNameIdentifier	 set Root Visible
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set properties 	TokenNameCOMMENT_LINE	set properties 
setDocument	TokenNameIdentifier	 set Document
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Sets the document. */	TokenNameCOMMENT_JAVADOC	 Sets the document. 
public	TokenNamepublic	
void	TokenNamevoid	
setDocument	TokenNameIdentifier	 set Document
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
)	TokenNameRPAREN	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setDocument	TokenNameIdentifier	 set Document
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expandRow	TokenNameIdentifier	 expand Row
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the document. */	TokenNameCOMMENT_JAVADOC	 Returns the document. 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
)	TokenNameRPAREN	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the org.w3c.Node for a MutableTreeNode. */	TokenNameCOMMENT_JAVADOC	 get the org.w3c.Node for a MutableTreeNode. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
treeNode	TokenNameIdentifier	 tree Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
)	TokenNameRPAREN	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
treeNode	TokenNameIdentifier	 tree Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Classes 	TokenNameCOMMENT_LINE	Classes 
// 	TokenNameCOMMENT_LINE	 
/** * DOM tree model. * * @author Andy Clark, IBM * @version */	TokenNameCOMMENT_JAVADOC	 DOM tree model. * @author Andy Clark, IBM @version 
static	TokenNamestatic	
class	TokenNameclass	
Model	TokenNameIdentifier	 Model
extends	TokenNameextends	
DefaultTreeModel	TokenNameIdentifier	 Default Tree Model
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3257286915924571186L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Document. */	TokenNameCOMMENT_JAVADOC	 Document. 
private	TokenNameprivate	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
/** Node Map. */	TokenNameCOMMENT_JAVADOC	 Node Map. 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
nodeMap	TokenNameIdentifier	 node Map
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
Model	TokenNameIdentifier	 Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constructs a model from the specified document. */	TokenNameCOMMENT_JAVADOC	 Constructs a model from the specified document. 
public	TokenNamepublic	
Model	TokenNameIdentifier	 Model
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setDocument	TokenNameIdentifier	 set Document
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Sets the document. */	TokenNameCOMMENT_JAVADOC	 Sets the document. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setDocument	TokenNameIdentifier	 set Document
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// save document 	TokenNameCOMMENT_LINE	save document 
this	TokenNamethis	
.	TokenNameDOT	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
// clear tree and re-populate 	TokenNameCOMMENT_LINE	clear tree and re-populate 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
)	TokenNameRPAREN	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeAllChildren	TokenNameIdentifier	 remove All Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeMap	TokenNameIdentifier	 node Map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buildTree	TokenNameIdentifier	 build Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireTreeStructureChanged	TokenNameIdentifier	 fire Tree Structure Changed
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setDocument(Document) 	TokenNameCOMMENT_LINE	setDocument(Document) 
/** Returns the document. */	TokenNameCOMMENT_JAVADOC	 Returns the document. 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the org.w3c.Node for a MutableTreeNode. */	TokenNameCOMMENT_JAVADOC	 get the org.w3c.Node for a MutableTreeNode. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
treeNode	TokenNameIdentifier	 tree Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
nodeMap	TokenNameIdentifier	 node Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
treeNode	TokenNameIdentifier	 tree Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Private methods 	TokenNameCOMMENT_LINE	Private methods 
// 	TokenNameCOMMENT_LINE	 
/** Builds the tree. */	TokenNameCOMMENT_JAVADOC	 Builds the tree. 
private	TokenNameprivate	
void	TokenNamevoid	
buildTree	TokenNameIdentifier	 build Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// is there anything to do? 	TokenNameCOMMENT_LINE	is there anything to do? 
if	TokenNameif	
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// iterate over children of this node 	TokenNameCOMMENT_LINE	iterate over children of this node 
NodeList	TokenNameIdentifier	 Node List
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
)	TokenNameRPAREN	
getRoot	TokenNameIdentifier	 get Root
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
insertDocumentNode	TokenNameIdentifier	 insert Document Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
insertElementNode	TokenNameIdentifier	 insert Element Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
// switch 	TokenNameCOMMENT_LINE	switch 
}	TokenNameRBRACE	
// for 	TokenNameCOMMENT_LINE	for 
}	TokenNameRBRACE	
// buildTree() 	TokenNameCOMMENT_LINE	buildTree() 
/** Inserts a node and returns a reference to the new node. */	TokenNameCOMMENT_JAVADOC	 Inserts a node and returns a reference to the new node. 
private	TokenNameprivate	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
insertNode	TokenNameIdentifier	 insert Node
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
what	TokenNameIdentifier	 what
,	TokenNameCOMMA	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
where	TokenNameIdentifier	 where
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
(	TokenNameLPAREN	
what	TokenNameIdentifier	 what
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertNodeInto	TokenNameIdentifier	 insert Node Into
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
where	TokenNameIdentifier	 where
,	TokenNameCOMMA	
where	TokenNameIdentifier	 where
.	TokenNameDOT	
getChildCount	TokenNameIdentifier	 get Child Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// insertNode(Node,MutableTreeNode):MutableTreeNode 	TokenNameCOMMENT_LINE	insertNode(Node,MutableTreeNode):MutableTreeNode 
/** Inserts the document node. */	TokenNameCOMMENT_JAVADOC	 Inserts the document node. 
private	TokenNameprivate	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
insertDocumentNode	TokenNameIdentifier	 insert Document Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
what	TokenNameIdentifier	 what
,	TokenNameCOMMA	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
where	TokenNameIdentifier	 where
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
treeNode	TokenNameIdentifier	 tree Node
=	TokenNameEQUAL	
insertNode	TokenNameIdentifier	 insert Node
(	TokenNameLPAREN	
"<"	TokenNameStringLiteral	<
+	TokenNamePLUS	
what	TokenNameIdentifier	 what
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
'>'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
where	TokenNameIdentifier	 where
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeMap	TokenNameIdentifier	 node Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
treeNode	TokenNameIdentifier	 tree Node
,	TokenNameCOMMA	
what	TokenNameIdentifier	 what
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
treeNode	TokenNameIdentifier	 tree Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Inserts an element node. */	TokenNameCOMMENT_JAVADOC	 Inserts an element node. 
private	TokenNameprivate	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
insertElementNode	TokenNameIdentifier	 insert Element Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
what	TokenNameIdentifier	 what
,	TokenNameCOMMA	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
where	TokenNameIdentifier	 where
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// build up name 	TokenNameCOMMENT_LINE	build up name 
StringBuffer	TokenNameIdentifier	 String Buffer
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
what	TokenNameIdentifier	 what
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
what	TokenNameIdentifier	 what
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
attrCount	TokenNameIdentifier	 attr Count
=	TokenNameEQUAL	
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
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
attrCount	TokenNameIdentifier	 attr Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"=""	TokenNameStringLiteral	="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// insert element node 	TokenNameCOMMENT_LINE	insert element node 
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
insertNode	TokenNameIdentifier	 insert Node
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
where	TokenNameIdentifier	 where
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeMap	TokenNameIdentifier	 node Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
what	TokenNameIdentifier	 what
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gather up attributes and children nodes 	TokenNameCOMMENT_LINE	gather up attributes and children nodes 
NodeList	TokenNameIdentifier	 Node List
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
what	TokenNameIdentifier	 what
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
insertCDataSectionNode	TokenNameIdentifier	 insert C Data Section Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Add a Section Node 	TokenNameCOMMENT_LINE	Add a Section Node 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
insertTextNode	TokenNameIdentifier	 insert Text Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
insertElementNode	TokenNameIdentifier	 insert Element Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// insertElementNode(Node,MutableTreeNode):MutableTreeNode 	TokenNameCOMMENT_LINE	insertElementNode(Node,MutableTreeNode):MutableTreeNode 
/** Inserts a text node. */	TokenNameCOMMENT_JAVADOC	 Inserts a text node. 
private	TokenNameprivate	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
insertTextNode	TokenNameIdentifier	 insert Text Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
what	TokenNameIdentifier	 what
,	TokenNameCOMMA	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
where	TokenNameIdentifier	 where
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
what	TokenNameIdentifier	 what
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
treeNode	TokenNameIdentifier	 tree Node
=	TokenNameEQUAL	
insertNode	TokenNameIdentifier	 insert Node
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
where	TokenNameIdentifier	 where
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeMap	TokenNameIdentifier	 node Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
treeNode	TokenNameIdentifier	 tree Node
,	TokenNameCOMMA	
what	TokenNameIdentifier	 what
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
treeNode	TokenNameIdentifier	 tree Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Inserts a CData Section Node. */	TokenNameCOMMENT_JAVADOC	 Inserts a CData Section Node. 
private	TokenNameprivate	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
insertCDataSectionNode	TokenNameIdentifier	 insert C Data Section Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
what	TokenNameIdentifier	 what
,	TokenNameCOMMA	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
where	TokenNameIdentifier	 where
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
CSectionBfr	TokenNameIdentifier	 C Section Bfr
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//--- optional --- CSectionBfr.append( "<![CDATA[" ); 	TokenNameCOMMENT_LINE	--- optional --- CSectionBfr.append( "<![CDATA[" ); 
CSectionBfr	TokenNameIdentifier	 C Section Bfr
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
what	TokenNameIdentifier	 what
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//--- optional --- CSectionBfr.append( "]]>" ); 	TokenNameCOMMENT_LINE	--- optional --- CSectionBfr.append( "]]>" ); 
if	TokenNameif	
(	TokenNameLPAREN	
CSectionBfr	TokenNameIdentifier	 C Section Bfr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MutableTreeNode	TokenNameIdentifier	 Mutable Tree Node
treeNode	TokenNameIdentifier	 tree Node
=	TokenNameEQUAL	
insertNode	TokenNameIdentifier	 insert Node
(	TokenNameLPAREN	
CSectionBfr	TokenNameIdentifier	 C Section Bfr
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
where	TokenNameIdentifier	 where
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeMap	TokenNameIdentifier	 node Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
treeNode	TokenNameIdentifier	 tree Node
,	TokenNameCOMMA	
what	TokenNameIdentifier	 what
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
treeNode	TokenNameIdentifier	 tree Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class Model 	TokenNameCOMMENT_LINE	class Model 
}	TokenNameRBRACE	
// class DOMTree 	TokenNameCOMMENT_LINE	class DOMTree 
