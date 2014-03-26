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
Iterator	TokenNameIdentifier	 Iterator
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
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
DeletedQueryNode	TokenNameIdentifier	 Deleted Query Node
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
MatchNoDocsQueryNode	TokenNameIdentifier	 Match No Docs Query Node
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
/** * A {@link QueryNodeProcessorPipeline} class removes every instance of * {@link DeletedQueryNode} from a query node tree. If the resulting root node * is a {@link DeletedQueryNode}, {@link MatchNoDocsQueryNode} is returned. * */	TokenNameCOMMENT_JAVADOC	 A {@link QueryNodeProcessorPipeline} class removes every instance of {@link DeletedQueryNode} from a query node tree. If the resulting root node is a {@link DeletedQueryNode}, {@link MatchNoDocsQueryNode} is returned. 
public	TokenNamepublic	
class	TokenNameclass	
RemoveDeletedQueryNodesProcessor	TokenNameIdentifier	 Remove Deleted Query Nodes Processor
extends	TokenNameextends	
QueryNodeProcessorImpl	TokenNameIdentifier	 Query Node Processor Impl
{	TokenNameLBRACE	
public	TokenNamepublic	
RemoveDeletedQueryNodesProcessor	TokenNameIdentifier	 Remove Deleted Query Nodes Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty constructor 	TokenNameCOMMENT_LINE	empty constructor 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
queryTree	TokenNameIdentifier	 query Tree
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queryTree	TokenNameIdentifier	 query Tree
instanceof	TokenNameinstanceof	
DeletedQueryNode	TokenNameIdentifier	 Deleted Query Node
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
queryTree	TokenNameIdentifier	 query Tree
instanceof	TokenNameinstanceof	
MatchNoDocsQueryNode	TokenNameIdentifier	 Match No Docs Query Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MatchNoDocsQueryNode	TokenNameIdentifier	 Match No Docs Query Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
queryTree	TokenNameIdentifier	 query Tree
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
QueryNode	TokenNameIdentifier	 Query Node
postProcessNode	TokenNameIdentifier	 post Process Node
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
isLeaf	TokenNameIdentifier	 is Leaf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
removeBoolean	TokenNameIdentifier	 remove Boolean
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeBoolean	TokenNameIdentifier	 remove Boolean
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
removeBoolean	TokenNameIdentifier	 remove Boolean
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
DeletedQueryNode	TokenNameIdentifier	 Deleted Query Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeBoolean	TokenNameIdentifier	 remove Boolean
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
removeBoolean	TokenNameIdentifier	 remove Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DeletedQueryNode	TokenNameIdentifier	 Deleted Query Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
DeletedQueryNode	TokenNameIdentifier	 Deleted Query Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
QueryNode	TokenNameIdentifier	 Query Node
preProcessNode	TokenNameIdentifier	 pre Process Node
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
