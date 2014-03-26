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
nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
EscapeQuerySyntax	TokenNameIdentifier	 Escape Query Syntax
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
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
RemoveDeletedQueryNodesProcessor	TokenNameIdentifier	 Remove Deleted Query Nodes Processor
;	TokenNameSEMICOLON	
/** * A {@link DeletedQueryNode} represents a node that was deleted from the query * node tree. It can be removed from the tree using the * {@link RemoveDeletedQueryNodesProcessor} processor. */	TokenNameCOMMENT_JAVADOC	 A {@link DeletedQueryNode} represents a node that was deleted from the query node tree. It can be removed from the tree using the {@link RemoveDeletedQueryNodesProcessor} processor. 
public	TokenNamepublic	
class	TokenNameclass	
DeletedQueryNode	TokenNameIdentifier	 Deleted Query Node
extends	TokenNameextends	
QueryNodeImpl	TokenNameIdentifier	 Query Node Impl
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
9151675506000425293L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DeletedQueryNode	TokenNameIdentifier	 Deleted Query Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty constructor 	TokenNameCOMMENT_LINE	empty constructor 
}	TokenNameRBRACE	
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
EscapeQuerySyntax	TokenNameIdentifier	 Escape Query Syntax
escaper	TokenNameIdentifier	 escaper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[DELETEDCHILD]"	TokenNameStringLiteral	[DELETEDCHILD]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"<deleted/>"	TokenNameStringLiteral	<deleted/>
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
QueryNode	TokenNameIdentifier	 Query Node
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
DeletedQueryNode	TokenNameIdentifier	 Deleted Query Node
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DeletedQueryNode	TokenNameIdentifier	 Deleted Query Node
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
