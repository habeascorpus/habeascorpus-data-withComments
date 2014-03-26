package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
QueryNode	TokenNameIdentifier	 Query Node
;	TokenNameSEMICOLON	
/** * <p> * This is a default implementation for the {@link QueryNodeProcessor} * interface, it's an abstract class, so it should be extended by classes that * want to process a {@link QueryNode} tree. * </p> * <p> * This class process {@link QueryNode}s from left to right in the tree. While * it's walking down the tree, for every node, * {@link #preProcessNode(QueryNode)} is invoked. After a node's children are * processed, {@link #postProcessNode(QueryNode)} is invoked for that node. * {@link #setChildrenOrder(List)} is invoked before * {@link #postProcessNode(QueryNode)} only if the node has at least one child, * in {@link #setChildrenOrder(List)} the implementor might redefine the * children order or remove any children from the children list. * </p> * <p> * Here is an example about how it process the nodes: * </p> * * <pre> * a * / \ * b e * / \ * c d * </pre> * * Here is the order the methods would be invoked for the tree described above: * * <pre> * preProcessNode( a ); * preProcessNode( b ); * preProcessNode( c ); * postProcessNode( c ); * preProcessNode( d ); * postProcessNode( d ); * setChildrenOrder( bChildrenList ); * postProcessNode( b ); * preProcessNode( e ); * postProcessNode( e ); * setChildrenOrder( aChildrenList ); * postProcessNode( a ) * </pre> * * @see org.apache.lucene.queryParser.core.processors.QueryNodeProcessor */	TokenNameCOMMENT_JAVADOC	 <p> This is a default implementation for the {@link QueryNodeProcessor} interface, it's an abstract class, so it should be extended by classes that want to process a {@link QueryNode} tree. </p> <p> This class process {@link QueryNode}s from left to right in the tree. While it's walking down the tree, for every node, {@link #preProcessNode(QueryNode)} is invoked. After a node's children are processed, {@link #postProcessNode(QueryNode)} is invoked for that node. {@link #setChildrenOrder(List)} is invoked before {@link #postProcessNode(QueryNode)} only if the node has at least one child, in {@link #setChildrenOrder(List)} the implementor might redefine the children order or remove any children from the children list. </p> <p> Here is an example about how it process the nodes: </p> * <pre> a / \ b e / \ c d </pre> * Here is the order the methods would be invoked for the tree described above: * <pre> preProcessNode( a ); preProcessNode( b ); preProcessNode( c ); postProcessNode( c ); preProcessNode( d ); postProcessNode( d ); setChildrenOrder( bChildrenList ); postProcessNode( b ); preProcessNode( e ); postProcessNode( e ); setChildrenOrder( aChildrenList ); postProcessNode( a ) </pre> * @see org.apache.lucene.queryParser.core.processors.QueryNodeProcessor 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
QueryNodeProcessorImpl	TokenNameIdentifier	 Query Node Processor Impl
implements	TokenNameimplements	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
{	TokenNameLBRACE	
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ChildrenList	TokenNameIdentifier	 Children List
>	TokenNameGREATER	
childrenListPool	TokenNameIdentifier	 children List Pool
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ChildrenList	TokenNameIdentifier	 Children List
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
queryConfig	TokenNameIdentifier	 query Config
;	TokenNameSEMICOLON	
public	TokenNamepublic	
QueryNodeProcessorImpl	TokenNameIdentifier	 Query Node Processor Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty constructor 	TokenNameCOMMENT_LINE	empty constructor 
}	TokenNameRBRACE	
public	TokenNamepublic	
QueryNodeProcessorImpl	TokenNameIdentifier	 Query Node Processor Impl
(	TokenNameLPAREN	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
queryConfigHandler	TokenNameIdentifier	 query Config Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
queryConfig	TokenNameIdentifier	 query Config
=	TokenNameEQUAL	
queryConfigHandler	TokenNameIdentifier	 query Config Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
QueryNode	TokenNameIdentifier	 Query Node
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
processIteration	TokenNameIdentifier	 process Iteration
(	TokenNameLPAREN	
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
QueryNode	TokenNameIdentifier	 Query Node
processIteration	TokenNameIdentifier	 process Iteration
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
{	TokenNameLBRACE	
queryTree	TokenNameIdentifier	 query Tree
=	TokenNameEQUAL	
preProcessNode	TokenNameIdentifier	 pre Process Node
(	TokenNameLPAREN	
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
processChildren	TokenNameIdentifier	 process Children
(	TokenNameLPAREN	
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryTree	TokenNameIdentifier	 query Tree
=	TokenNameEQUAL	
postProcessNode	TokenNameIdentifier	 post Process Node
(	TokenNameLPAREN	
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
queryTree	TokenNameIdentifier	 query Tree
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is called every time a child is processed. * * @param queryTree * the query node child to be processed * @throws QueryNodeException * if something goes wrong during the query node processing */	TokenNameCOMMENT_JAVADOC	 This method is called every time a child is processed. * @param queryTree the query node child to be processed @throws QueryNodeException if something goes wrong during the query node processing 
protected	TokenNameprotected	
void	TokenNamevoid	
processChildren	TokenNameIdentifier	 process Children
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
queryTree	TokenNameIdentifier	 query Tree
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ChildrenList	TokenNameIdentifier	 Children List
newChildren	TokenNameIdentifier	 new Children
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newChildren	TokenNameIdentifier	 new Children
=	TokenNameEQUAL	
allocateChildrenList	TokenNameIdentifier	 allocate Children List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
child	TokenNameIdentifier	 child
:	TokenNameCOLON	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
processIteration	TokenNameIdentifier	 process Iteration
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
newChildren	TokenNameIdentifier	 new Children
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
orderedChildrenList	TokenNameIdentifier	 ordered Children List
=	TokenNameEQUAL	
setChildrenOrder	TokenNameIdentifier	 set Children Order
(	TokenNameLPAREN	
newChildren	TokenNameIdentifier	 new Children
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryTree	TokenNameIdentifier	 query Tree
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
orderedChildrenList	TokenNameIdentifier	 ordered Children List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
newChildren	TokenNameIdentifier	 new Children
.	TokenNameDOT	
beingUsed	TokenNameIdentifier	 being Used
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
ChildrenList	TokenNameIdentifier	 Children List
allocateChildrenList	TokenNameIdentifier	 allocate Children List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChildrenList	TokenNameIdentifier	 Children List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ChildrenList	TokenNameIdentifier	 Children List
auxList	TokenNameIdentifier	 aux List
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
childrenListPool	TokenNameIdentifier	 children List Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
auxList	TokenNameIdentifier	 aux List
.	TokenNameDOT	
beingUsed	TokenNameIdentifier	 being Used
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
auxList	TokenNameIdentifier	 aux List
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ChildrenList	TokenNameIdentifier	 Children List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
childrenListPool	TokenNameIdentifier	 children List Pool
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
beingUsed	TokenNameIdentifier	 being Used
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For reference about this method check: * {@link QueryNodeProcessor#setQueryConfigHandler(QueryConfigHandler)}. * * @param queryConfigHandler * the query configuration handler to be set. * * @see QueryNodeProcessor#getQueryConfigHandler() * @see QueryConfigHandler */	TokenNameCOMMENT_JAVADOC	 For reference about this method check: {@link QueryNodeProcessor#setQueryConfigHandler(QueryConfigHandler)}. * @param queryConfigHandler the query configuration handler to be set. * @see QueryNodeProcessor#getQueryConfigHandler() @see QueryConfigHandler 
public	TokenNamepublic	
void	TokenNamevoid	
setQueryConfigHandler	TokenNameIdentifier	 set Query Config Handler
(	TokenNameLPAREN	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
queryConfigHandler	TokenNameIdentifier	 query Config Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
queryConfig	TokenNameIdentifier	 query Config
=	TokenNameEQUAL	
queryConfigHandler	TokenNameIdentifier	 query Config Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For reference about this method check: * {@link QueryNodeProcessor#getQueryConfigHandler()}. * * @return QueryConfigHandler the query configuration handler to be set. * * @see QueryNodeProcessor#setQueryConfigHandler(QueryConfigHandler) * @see QueryConfigHandler */	TokenNameCOMMENT_JAVADOC	 For reference about this method check: {@link QueryNodeProcessor#getQueryConfigHandler()}. * @return QueryConfigHandler the query configuration handler to be set. * @see QueryNodeProcessor#setQueryConfigHandler(QueryConfigHandler) @see QueryConfigHandler 
public	TokenNamepublic	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
getQueryConfigHandler	TokenNameIdentifier	 get Query Config Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
queryConfig	TokenNameIdentifier	 query Config
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is invoked for every node when walking down the tree. * * @param node * the query node to be pre-processed * * @return a query node * * @throws QueryNodeException * if something goes wrong during the query node processing */	TokenNameCOMMENT_JAVADOC	 This method is invoked for every node when walking down the tree. * @param node the query node to be pre-processed * @return a query node * @throws QueryNodeException if something goes wrong during the query node processing 
abstract	TokenNameabstract	
protected	TokenNameprotected	
QueryNode	TokenNameIdentifier	 Query Node
preProcessNode	TokenNameIdentifier	 pre Process Node
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
;	TokenNameSEMICOLON	
/** * This method is invoked for every node when walking up the tree. * * @param node * node the query node to be post-processed * * @return a query node * * @throws QueryNodeException * if something goes wrong during the query node processing */	TokenNameCOMMENT_JAVADOC	 This method is invoked for every node when walking up the tree. * @param node node the query node to be post-processed * @return a query node * @throws QueryNodeException if something goes wrong during the query node processing 
abstract	TokenNameabstract	
protected	TokenNameprotected	
QueryNode	TokenNameIdentifier	 Query Node
postProcessNode	TokenNameIdentifier	 post Process Node
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
;	TokenNameSEMICOLON	
/** * This method is invoked for every node that has at least on child. It's * invoked right before {@link #postProcessNode(QueryNode)} is invoked. * * @param children * the list containing all current node's children * * @return a new list containing all children that should be set to the * current node * * @throws QueryNodeException * if something goes wrong during the query node processing */	TokenNameCOMMENT_JAVADOC	 This method is invoked for every node that has at least on child. It's invoked right before {@link #postProcessNode(QueryNode)} is invoked. * @param children the list containing all current node's children * @return a new list containing all children that should be set to the current node * @throws QueryNodeException if something goes wrong during the query node processing 
abstract	TokenNameabstract	
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
setChildrenOrder	TokenNameIdentifier	 set Children Order
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ChildrenList	TokenNameIdentifier	 Children List
extends	TokenNameextends	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
2613518456949297135L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
beingUsed	TokenNameIdentifier	 being Used
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
