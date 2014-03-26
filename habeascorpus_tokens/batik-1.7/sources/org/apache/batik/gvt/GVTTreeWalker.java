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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * <tt>GVTTreeWalker</tt> objects are used to navigate a GVT tree or subtree. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: GVTTreeWalker.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 <tt>GVTTreeWalker</tt> objects are used to navigate a GVT tree or subtree. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: GVTTreeWalker.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GVTTreeWalker	TokenNameIdentifier	 GVT Tree Walker
{	TokenNameLBRACE	
/** The GVT root into which text is searched. */	TokenNameCOMMENT_JAVADOC	 The GVT root into which text is searched. 
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
gvtRoot	TokenNameIdentifier	 gvt Root
;	TokenNameSEMICOLON	
/** The root of the subtree of the GVT which is traversed. */	TokenNameCOMMENT_JAVADOC	 The root of the subtree of the GVT which is traversed. 
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
treeRoot	TokenNameIdentifier	 tree Root
;	TokenNameSEMICOLON	
/** The current GraphicsNode. */	TokenNameCOMMENT_JAVADOC	 The current GraphicsNode. 
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
/** * Constructs a new <tt>GVTTreeWalker</tt>. * * @param treeRoot the top of the graphics node tree to search */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>GVTTreeWalker</tt>. * @param treeRoot the top of the graphics node tree to search 
public	TokenNamepublic	
GVTTreeWalker	TokenNameIdentifier	 GVT Tree Walker
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
treeRoot	TokenNameIdentifier	 tree Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
gvtRoot	TokenNameIdentifier	 gvt Root
=	TokenNameEQUAL	
treeRoot	TokenNameIdentifier	 tree Root
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
treeRoot	TokenNameIdentifier	 tree Root
=	TokenNameEQUAL	
treeRoot	TokenNameIdentifier	 tree Root
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
treeRoot	TokenNameIdentifier	 tree Root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the root graphics node. */	TokenNameCOMMENT_JAVADOC	 Returns the root graphics node. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
treeRoot	TokenNameIdentifier	 tree Root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the GVT root graphics node. */	TokenNameCOMMENT_JAVADOC	 Returns the GVT root graphics node. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getGVTRoot	TokenNameIdentifier	 get GVT Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gvtRoot	TokenNameIdentifier	 gvt Root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the current GraphicsNode to the specified node. * * @param node the new current graphics node * @exception IllegalArgumentException if the node is not part of * the GVT Tree this walker is dedicated to */	TokenNameCOMMENT_JAVADOC	 Sets the current GraphicsNode to the specified node. * @param node the new current graphics node @exception IllegalArgumentException if the node is not part of the GVT Tree this walker is dedicated to 
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentGraphicsNode	TokenNameIdentifier	 set Current Graphics Node
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
gvtRoot	TokenNameIdentifier	 gvt Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"The node "	TokenNameStringLiteral	The node 
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
+	TokenNamePLUS	
" is not part of the document "	TokenNameStringLiteral	 is not part of the document 
+	TokenNamePLUS	
gvtRoot	TokenNameIdentifier	 gvt Root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current <tt>GraphicsNode</tt>. */	TokenNameCOMMENT_JAVADOC	 Returns the current <tt>GraphicsNode</tt>. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getCurrentGraphicsNode	TokenNameIdentifier	 get Current Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the previous <tt>GraphicsNode</tt>. If the current * graphics node does not have a previous node, returns null and * retains the current node. */	TokenNameCOMMENT_JAVADOC	 Returns the previous <tt>GraphicsNode</tt>. If the current graphics node does not have a previous node, returns null and retains the current node. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
previousGraphicsNode	TokenNameIdentifier	 previous Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getPreviousGraphicsNode	TokenNameIdentifier	 get Previous Graphics Node
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next <tt>GraphicsNode</tt>. If the current graphics * node does not have a next node, returns null and retains the * current node. */	TokenNameCOMMENT_JAVADOC	 Returns the next <tt>GraphicsNode</tt>. If the current graphics node does not have a next node, returns null and retains the current node. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
nextGraphicsNode	TokenNameIdentifier	 next Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getNextGraphicsNode	TokenNameIdentifier	 get Next Graphics Node
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the parent of the current <tt>GraphicsNode</tt>. If the * current graphics node has no parent, returns null and retains * the current node. */	TokenNameCOMMENT_JAVADOC	 Returns the parent of the current <tt>GraphicsNode</tt>. If the current graphics node has no parent, returns null and retains the current node. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
parentGraphicsNode	TokenNameIdentifier	 parent Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't ascend above treeRoot. 	TokenNameCOMMENT_LINE	Don't ascend above treeRoot. 
if	TokenNameif	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
==	TokenNameEQUAL_EQUAL	
treeRoot	TokenNameIdentifier	 tree Root
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
GraphicsNode	TokenNameIdentifier	 Graphics Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next sibling of the current * <tt>GraphicsNode</tt>. If the current graphics node does not * have a next sibling, returns null and retains the current node. */	TokenNameCOMMENT_JAVADOC	 Returns the next sibling of the current <tt>GraphicsNode</tt>. If the current graphics node does not have a next sibling, returns null and retains the current node. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next previous of the current * <tt>GraphicsNode</tt>. If the current graphics node does not * have a previous sibling, returns null and retains the current * node. */	TokenNameCOMMENT_JAVADOC	 Returns the next previous of the current <tt>GraphicsNode</tt>. If the current graphics node does not have a previous sibling, returns null and retains the current node. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the first child of the current * <tt>GraphicsNode</tt>. If the current graphics node does not * have a first child, returns null and retains the current node. */	TokenNameCOMMENT_JAVADOC	 Returns the first child of the current <tt>GraphicsNode</tt>. If the current graphics node does not have a first child, returns null and retains the current node. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
firstChild	TokenNameIdentifier	 first Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the last child of the current <tt>GraphicsNode</tt>. If * the current graphics node does not have a last child, returns * null and retains the current node. */	TokenNameCOMMENT_JAVADOC	 Returns the last child of the current <tt>GraphicsNode</tt>. If the current graphics node does not have a last child, returns null and retains the current node. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	//////////////////////////////////////////////////////////////////////// 
////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	//////////////////////////////////////////////////////////////////////// 
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getNextGraphicsNode	TokenNameIdentifier	 get Next Graphics Node
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Go to the first child 	TokenNameCOMMENT_LINE	Go to the first child 
GraphicsNode	TokenNameIdentifier	 Graphics Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Go to the next sibling 	TokenNameCOMMENT_LINE	Go to the next sibling 
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Go to the first sibling of one of the ancestors 	TokenNameCOMMENT_LINE	Go to the first sibling of one of the ancestors 
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
treeRoot	TokenNameIdentifier	 tree Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getPreviousGraphicsNode	TokenNameIdentifier	 get Previous Graphics Node
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// The previous of root is null 	TokenNameCOMMENT_LINE	The previous of root is null 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
treeRoot	TokenNameIdentifier	 tree Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Go to the parent of a first child 	TokenNameCOMMENT_LINE	Go to the parent of a first child 
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Go to the last child of child... 	TokenNameCOMMENT_LINE	Go to the last child of child... 
GraphicsNode	TokenNameIdentifier	 Graphics Node
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
