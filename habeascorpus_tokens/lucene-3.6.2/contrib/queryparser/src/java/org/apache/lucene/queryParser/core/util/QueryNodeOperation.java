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
util	TokenNameIdentifier	 util
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
QueryNodeError	TokenNameIdentifier	 Query Node Error
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
AndQueryNode	TokenNameIdentifier	 And Query Node
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
/** * Allow joining 2 QueryNode Trees, into one. */	TokenNameCOMMENT_JAVADOC	 Allow joining 2 QueryNode Trees, into one. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
QueryNodeOperation	TokenNameIdentifier	 Query Node Operation
{	TokenNameLBRACE	
private	TokenNameprivate	
QueryNodeOperation	TokenNameIdentifier	 Query Node Operation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Exists only to defeat instantiation. 	TokenNameCOMMENT_LINE	Exists only to defeat instantiation. 
}	TokenNameRBRACE	
private	TokenNameprivate	
enum	TokenNameenum	
ANDOperation	TokenNameIdentifier	 AND Operation
{	TokenNameLBRACE	
BOTH	TokenNameIdentifier	 BOTH
,	TokenNameCOMMA	
Q1	TokenNameIdentifier	 Q1
,	TokenNameCOMMA	
Q2	TokenNameIdentifier	 Q2
,	TokenNameCOMMA	
NONE	TokenNameIdentifier	 NONE
}	TokenNameRBRACE	
/** * perform a logical and of 2 QueryNode trees. if q1 and q2 are ANDQueryNode * nodes it uses head Node from q1 and adds the children of q2 to q1 if q1 is * a AND node and q2 is not, add q2 as a child of the head node of q1 if q2 is * a AND node and q1 is not, add q1 as a child of the head node of q2 if q1 * and q2 are not ANDQueryNode nodes, create a AND node and make q1 and q2 * children of that node if q1 or q2 is null it returns the not null node if * q1 = q2 = null it returns null */	TokenNameCOMMENT_JAVADOC	 perform a logical and of 2 QueryNode trees. if q1 and q2 are ANDQueryNode nodes it uses head Node from q1 and adds the children of q2 to q1 if q1 is a AND node and q2 is not, add q2 as a child of the head node of q1 if q2 is a AND node and q1 is not, add q1 as a child of the head node of q2 if q1 and q2 are not ANDQueryNode nodes, create a AND node and make q1 and q2 children of that node if q1 or q2 is null it returns the not null node if q1 = q2 = null it returns null 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
QueryNode	TokenNameIdentifier	 Query Node
logicalAnd	TokenNameIdentifier	 logical And
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
QueryNode	TokenNameIdentifier	 Query Node
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
q2	TokenNameIdentifier	 q2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
q1	TokenNameIdentifier	 q1
;	TokenNameSEMICOLON	
ANDOperation	TokenNameIdentifier	 AND Operation
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
instanceof	TokenNameinstanceof	
AndQueryNode	TokenNameIdentifier	 And Query Node
&&	TokenNameAND_AND	
q2	TokenNameIdentifier	 q2
instanceof	TokenNameinstanceof	
AndQueryNode	TokenNameIdentifier	 And Query Node
)	TokenNameRPAREN	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
ANDOperation	TokenNameIdentifier	 AND Operation
.	TokenNameDOT	
BOTH	TokenNameIdentifier	 BOTH
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
instanceof	TokenNameinstanceof	
AndQueryNode	TokenNameIdentifier	 And Query Node
)	TokenNameRPAREN	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
ANDOperation	TokenNameIdentifier	 AND Operation
.	TokenNameDOT	
Q1	TokenNameIdentifier	 Q1
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
instanceof	TokenNameinstanceof	
AndQueryNode	TokenNameIdentifier	 And Query Node
)	TokenNameRPAREN	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
ANDOperation	TokenNameIdentifier	 AND Operation
.	TokenNameDOT	
Q2	TokenNameIdentifier	 Q2
;	TokenNameSEMICOLON	
else	TokenNameelse	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
ANDOperation	TokenNameIdentifier	 AND Operation
.	TokenNameDOT	
NONE	TokenNameIdentifier	 NONE
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
QueryNode	TokenNameIdentifier	 Query Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
NONE	TokenNameIdentifier	 NONE
:	TokenNameCOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
AndQueryNode	TokenNameIdentifier	 And Query Node
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
case	TokenNamecase	
Q1	TokenNameIdentifier	 Q1
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
case	TokenNamecase	
Q2	TokenNameIdentifier	 Q2
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
case	TokenNamecase	
BOTH	TokenNameIdentifier	 BOTH
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
QueryNodeError	TokenNameIdentifier	 Query Node Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
