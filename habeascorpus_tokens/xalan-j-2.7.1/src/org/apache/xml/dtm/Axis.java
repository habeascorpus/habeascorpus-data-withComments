/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Axis.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Axis.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
/** * Specifies values related to XPath Axes. * <p>The ancestor, descendant, following, preceding and self axes partition a * document (ignoring attribute and namespace nodes): they do not overlap * and together they contain all the nodes in the document.</p> * */	TokenNameCOMMENT_JAVADOC	 Specifies values related to XPath Axes. <p>The ancestor, descendant, following, preceding and self axes partition a document (ignoring attribute and namespace nodes): they do not overlap and together they contain all the nodes in the document.</p> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Axis	TokenNameIdentifier	 Axis
{	TokenNameLBRACE	
/** * The ancestor axis contains the ancestors of the context node; * the ancestors of the context node consist of the parent of context * node and the parent's parent and so on; thus, the ancestor axis will * always include the root node, unless the context node is the root node. */	TokenNameCOMMENT_JAVADOC	 The ancestor axis contains the ancestors of the context node; the ancestors of the context node consist of the parent of context node and the parent's parent and so on; thus, the ancestor axis will always include the root node, unless the context node is the root node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ANCESTOR	TokenNameIdentifier	 ANCESTOR
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * the ancestor-or-self axis contains the context node and the ancestors of * the context node; thus, the ancestor axis will always include the * root node. */	TokenNameCOMMENT_JAVADOC	 the ancestor-or-self axis contains the context node and the ancestors of the context node; thus, the ancestor axis will always include the root node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ANCESTORORSELF	TokenNameIdentifier	 ANCESTORORSELF
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * the attribute axis contains the attributes of the context node; the axis * will be empty unless the context node is an element. */	TokenNameCOMMENT_JAVADOC	 the attribute axis contains the attributes of the context node; the axis will be empty unless the context node is an element. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The child axis contains the children of the context node. */	TokenNameCOMMENT_JAVADOC	 The child axis contains the children of the context node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHILD	TokenNameIdentifier	 CHILD
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The descendant axis contains the descendants of the context node; * a descendant is a child or a child of a child and so on; thus the * descendant axis never contains attribute or namespace nodes. */	TokenNameCOMMENT_JAVADOC	 The descendant axis contains the descendants of the context node; a descendant is a child or a child of a child and so on; thus the descendant axis never contains attribute or namespace nodes. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DESCENDANT	TokenNameIdentifier	 DESCENDANT
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The descendant-or-self axis contains the context node and the * descendants of the context node. */	TokenNameCOMMENT_JAVADOC	 The descendant-or-self axis contains the context node and the descendants of the context node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DESCENDANTORSELF	TokenNameIdentifier	 DESCENDANTORSELF
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * the following axis contains all nodes in the same document as the * context node that are after the context node in document order, excluding * any descendants and excluding attribute nodes and namespace nodes. */	TokenNameCOMMENT_JAVADOC	 the following axis contains all nodes in the same document as the context node that are after the context node in document order, excluding any descendants and excluding attribute nodes and namespace nodes. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FOLLOWING	TokenNameIdentifier	 FOLLOWING
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The following-sibling axis contains all the following siblings of the * context node; if the context node is an attribute node or namespace node, * the following-sibling axis is empty. */	TokenNameCOMMENT_JAVADOC	 The following-sibling axis contains all the following siblings of the context node; if the context node is an attribute node or namespace node, the following-sibling axis is empty. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FOLLOWINGSIBLING	TokenNameIdentifier	 FOLLOWINGSIBLING
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The namespace axis contains the namespace nodes of the context node; the * axis will be empty unless the context node is an element. */	TokenNameCOMMENT_JAVADOC	 The namespace axis contains the namespace nodes of the context node; the axis will be empty unless the context node is an element. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NAMESPACEDECLS	TokenNameIdentifier	 NAMESPACEDECLS
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The namespace axis contains the namespace nodes of the context node; the * axis will be empty unless the context node is an element. */	TokenNameCOMMENT_JAVADOC	 The namespace axis contains the namespace nodes of the context node; the axis will be empty unless the context node is an element. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NAMESPACE	TokenNameIdentifier	 NAMESPACE
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The parent axis contains the parent of the context node, * if there is one. */	TokenNameCOMMENT_JAVADOC	 The parent axis contains the parent of the context node, if there is one. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PARENT	TokenNameIdentifier	 PARENT
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The preceding axis contains all nodes in the same document as the context * node that are before the context node in document order, excluding any * ancestors and excluding attribute nodes and namespace nodes */	TokenNameCOMMENT_JAVADOC	 The preceding axis contains all nodes in the same document as the context node that are before the context node in document order, excluding any ancestors and excluding attribute nodes and namespace nodes 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PRECEDING	TokenNameIdentifier	 PRECEDING
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The preceding-sibling axis contains all the preceding siblings of the * context node; if the context node is an attribute node or namespace node, * the preceding-sibling axis is empty. */	TokenNameCOMMENT_JAVADOC	 The preceding-sibling axis contains all the preceding siblings of the context node; if the context node is an attribute node or namespace node, the preceding-sibling axis is empty. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PRECEDINGSIBLING	TokenNameIdentifier	 PRECEDINGSIBLING
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The self axis contains just the context node itself. */	TokenNameCOMMENT_JAVADOC	 The self axis contains just the context node itself. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SELF	TokenNameIdentifier	 SELF
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A non-xpath axis, traversing the subtree including the subtree * root, descendants, attributes, and namespace node decls. */	TokenNameCOMMENT_JAVADOC	 A non-xpath axis, traversing the subtree including the subtree root, descendants, attributes, and namespace node decls. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ALLFROMNODE	TokenNameIdentifier	 ALLFROMNODE
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A non-xpath axis, traversing the the preceding and the ancestor nodes, * needed for inverseing select patterns to match patterns. */	TokenNameCOMMENT_JAVADOC	 A non-xpath axis, traversing the the preceding and the ancestor nodes, needed for inverseing select patterns to match patterns. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PRECEDINGANDANCESTOR	TokenNameIdentifier	 PRECEDINGANDANCESTOR
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// =========================================== 	TokenNameCOMMENT_LINE	=========================================== 
// All axis past this are absolute. 	TokenNameCOMMENT_LINE	All axis past this are absolute. 
/** * A non-xpath axis, returns all nodes in the tree from and including the * root. */	TokenNameCOMMENT_JAVADOC	 A non-xpath axis, returns all nodes in the tree from and including the root. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ALL	TokenNameIdentifier	 ALL
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A non-xpath axis, returns all nodes that aren't namespaces or attributes, * from and including the root. */	TokenNameCOMMENT_JAVADOC	 A non-xpath axis, returns all nodes that aren't namespaces or attributes, from and including the root. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DESCENDANTSFROMROOT	TokenNameIdentifier	 DESCENDANTSFROMROOT
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A non-xpath axis, returns all nodes that aren't namespaces or attributes, * from and including the root. */	TokenNameCOMMENT_JAVADOC	 A non-xpath axis, returns all nodes that aren't namespaces or attributes, from and including the root. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DESCENDANTSORSELFFROMROOT	TokenNameIdentifier	 DESCENDANTSORSELFFROMROOT
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A non-xpath axis, returns root only. */	TokenNameCOMMENT_JAVADOC	 A non-xpath axis, returns root only. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ROOT	TokenNameIdentifier	 ROOT
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A non-xpath axis, for functions. */	TokenNameCOMMENT_JAVADOC	 A non-xpath axis, for functions. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FILTEREDLIST	TokenNameIdentifier	 FILTEREDLIST
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A table to identify whether an axis is a reverse axis; */	TokenNameCOMMENT_JAVADOC	 A table to identify whether an axis is a reverse axis; 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
isReverse	TokenNameIdentifier	 is Reverse
=	TokenNameEQUAL	
{	TokenNameLBRACE	
true	TokenNametrue	
,	TokenNameCOMMA	
// ancestor 	TokenNameCOMMENT_LINE	ancestor 
true	TokenNametrue	
,	TokenNameCOMMA	
// ancestor-or-self 	TokenNameCOMMENT_LINE	ancestor-or-self 
false	TokenNamefalse	
,	TokenNameCOMMA	
// attribute 	TokenNameCOMMENT_LINE	attribute 
false	TokenNamefalse	
,	TokenNameCOMMA	
// child 	TokenNameCOMMENT_LINE	child 
false	TokenNamefalse	
,	TokenNameCOMMA	
// descendant 	TokenNameCOMMENT_LINE	descendant 
false	TokenNamefalse	
,	TokenNameCOMMA	
// descendant-or-self 	TokenNameCOMMENT_LINE	descendant-or-self 
false	TokenNamefalse	
,	TokenNameCOMMA	
// following 	TokenNameCOMMENT_LINE	following 
false	TokenNamefalse	
,	TokenNameCOMMA	
// following-sibling 	TokenNameCOMMENT_LINE	following-sibling 
false	TokenNamefalse	
,	TokenNameCOMMA	
// namespace 	TokenNameCOMMENT_LINE	namespace 
false	TokenNamefalse	
,	TokenNameCOMMA	
// namespace-declarations 	TokenNameCOMMENT_LINE	namespace-declarations 
false	TokenNamefalse	
,	TokenNameCOMMA	
// parent (one node, has no order) 	TokenNameCOMMENT_LINE	parent (one node, has no order) 
true	TokenNametrue	
,	TokenNameCOMMA	
// preceding 	TokenNameCOMMENT_LINE	preceding 
true	TokenNametrue	
,	TokenNameCOMMA	
// preceding-sibling 	TokenNameCOMMENT_LINE	preceding-sibling 
false	TokenNamefalse	
// self (one node, has no order) 	TokenNameCOMMENT_LINE	self (one node, has no order) 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** The names of the axes for diagnostic purposes. */	TokenNameCOMMENT_JAVADOC	 The names of the axes for diagnostic purposes. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"ancestor"	TokenNameStringLiteral	ancestor
,	TokenNameCOMMA	
// 0 	TokenNameCOMMENT_LINE	0 
"ancestor-or-self"	TokenNameStringLiteral	ancestor-or-self
,	TokenNameCOMMA	
// 1 	TokenNameCOMMENT_LINE	1 
"attribute"	TokenNameStringLiteral	attribute
,	TokenNameCOMMA	
// 2 	TokenNameCOMMENT_LINE	2 
"child"	TokenNameStringLiteral	child
,	TokenNameCOMMA	
// 3 	TokenNameCOMMENT_LINE	3 
"descendant"	TokenNameStringLiteral	descendant
,	TokenNameCOMMA	
// 4 	TokenNameCOMMENT_LINE	4 
"descendant-or-self"	TokenNameStringLiteral	descendant-or-self
,	TokenNameCOMMA	
// 5 	TokenNameCOMMENT_LINE	5 
"following"	TokenNameStringLiteral	following
,	TokenNameCOMMA	
// 6 	TokenNameCOMMENT_LINE	6 
"following-sibling"	TokenNameStringLiteral	following-sibling
,	TokenNameCOMMA	
// 7 	TokenNameCOMMENT_LINE	7 
"namespace-decls"	TokenNameStringLiteral	namespace-decls
,	TokenNameCOMMA	
// 8 	TokenNameCOMMENT_LINE	8 
"namespace"	TokenNameStringLiteral	namespace
,	TokenNameCOMMA	
// 9 	TokenNameCOMMENT_LINE	9 
"parent"	TokenNameStringLiteral	parent
,	TokenNameCOMMA	
// 10 	TokenNameCOMMENT_LINE	10 
"preceding"	TokenNameStringLiteral	preceding
,	TokenNameCOMMA	
// 11 	TokenNameCOMMENT_LINE	11 
"preceding-sibling"	TokenNameStringLiteral	preceding-sibling
,	TokenNameCOMMA	
// 12 	TokenNameCOMMENT_LINE	12 
"self"	TokenNameStringLiteral	self
,	TokenNameCOMMA	
// 13 	TokenNameCOMMENT_LINE	13 
"all-from-node"	TokenNameStringLiteral	all-from-node
,	TokenNameCOMMA	
// 14 	TokenNameCOMMENT_LINE	14 
"preceding-and-ancestor"	TokenNameStringLiteral	preceding-and-ancestor
,	TokenNameCOMMA	
// 15 	TokenNameCOMMENT_LINE	15 
"all"	TokenNameStringLiteral	all
,	TokenNameCOMMA	
// 16 	TokenNameCOMMENT_LINE	16 
"descendants-from-root"	TokenNameStringLiteral	descendants-from-root
,	TokenNameCOMMA	
// 17 	TokenNameCOMMENT_LINE	17 
"descendants-or-self-from-root"	TokenNameStringLiteral	descendants-or-self-from-root
,	TokenNameCOMMA	
// 18 	TokenNameCOMMENT_LINE	18 
"root"	TokenNameStringLiteral	root
,	TokenNameCOMMA	
// 19 	TokenNameCOMMENT_LINE	19 
"filtered-list"	TokenNameStringLiteral	filtered-list
// 20 	TokenNameCOMMENT_LINE	20 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isReverse	TokenNameIdentifier	 is Reverse
(	TokenNameLPAREN	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isReverse	TokenNameIdentifier	 is Reverse
[	TokenNameLBRACKET	
axis	TokenNameIdentifier	 axis
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getNames	TokenNameIdentifier	 get Names
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
names	TokenNameIdentifier	 names
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getNamesLength	TokenNameIdentifier	 get Names Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
