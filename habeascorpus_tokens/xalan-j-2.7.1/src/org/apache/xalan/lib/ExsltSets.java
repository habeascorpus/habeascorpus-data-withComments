/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExsltSets.java 469688 2006-10-31 22:39:43Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExsltSets.java 469688 2006-10-31 22:39:43Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
lib	TokenNameIdentifier	 lib
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
DOMHelper	TokenNameIdentifier	 DOM Helper
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
NodeSet	TokenNameIdentifier	 Node Set
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
/** * This class contains EXSLT set extension functions. * It is accessed by specifying a namespace URI as follows: * <pre> * xmlns:set="http://exslt.org/sets" * </pre> * * The documentation for each function has been copied from the relevant * EXSLT Implementer page. * * @see <a href="http://www.exslt.org/">EXSLT</a> * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 This class contains EXSLT set extension functions. It is accessed by specifying a namespace URI as follows: <pre> xmlns:set="http://exslt.org/sets" </pre> * The documentation for each function has been copied from the relevant EXSLT Implementer page. * @see <a href="http://www.exslt.org/">EXSLT</a> @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
ExsltSets	TokenNameIdentifier	 Exslt Sets
extends	TokenNameextends	
ExsltBase	TokenNameIdentifier	 Exslt Base
{	TokenNameLBRACE	
/** * The set:leading function returns the nodes in the node set passed as the first argument that * precede, in document order, the first node in the node set passed as the second argument. If * the first node in the second node set is not contained in the first node set, then an empty * node set is returned. If the second node set is empty, then the first node set is returned. * * @param nl1 NodeList for first node-set. * @param nl2 NodeList for second node-set. * @return a NodeList containing the nodes in nl1 that precede in document order the first * node in nl2; an empty node-set if the first node in nl2 is not in nl1; all of nl1 if nl2 * is empty. * * @see <a href="http://www.exslt.org/">EXSLT</a> */	TokenNameCOMMENT_JAVADOC	 The set:leading function returns the nodes in the node set passed as the first argument that precede, in document order, the first node in the node set passed as the second argument. If the first node in the second node set is not contained in the first node set, then an empty node set is returned. If the second node set is empty, then the first node set is returned. * @param nl1 NodeList for first node-set. @param nl2 NodeList for second node-set. @return a NodeList containing the nodes in nl1 that precede in document order the first node in nl2; an empty node-set if the first node in nl2 is not in nl1; all of nl1 if nl2 is empty. * @see <a href="http://www.exslt.org/">EXSLT</a> 
public	TokenNamepublic	
static	TokenNamestatic	
NodeList	TokenNameIdentifier	 Node List
leading	TokenNameIdentifier	 leading
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nl1	TokenNameIdentifier	 nl1
,	TokenNameCOMMA	
NodeList	TokenNameIdentifier	 Node List
nl2	TokenNameIdentifier	 nl2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nl2	TokenNameIdentifier	 nl2
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
nl1	TokenNameIdentifier	 nl1
;	TokenNameSEMICOLON	
NodeSet	TokenNameIdentifier	 Node Set
ns1	TokenNameIdentifier	 ns1
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
nl1	TokenNameIdentifier	 nl1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeSet	TokenNameIdentifier	 Node Set
leadNodes	TokenNameIdentifier	 lead Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
endNode	TokenNameIdentifier	 end Node
=	TokenNameEQUAL	
nl2	TokenNameIdentifier	 nl2
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ns1	TokenNameIdentifier	 ns1
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
endNode	TokenNameIdentifier	 end Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
leadNodes	TokenNameIdentifier	 lead Nodes
;	TokenNameSEMICOLON	
// empty NodeSet 	TokenNameCOMMENT_LINE	empty NodeSet 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nl1	TokenNameIdentifier	 nl1
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
testNode	TokenNameIdentifier	 test Node
=	TokenNameEQUAL	
nl1	TokenNameIdentifier	 nl1
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DOMHelper	TokenNameIdentifier	 DOM Helper
.	TokenNameDOT	
isNodeAfter	TokenNameIdentifier	 is Node After
(	TokenNameLPAREN	
testNode	TokenNameIdentifier	 test Node
,	TokenNameCOMMA	
endNode	TokenNameIdentifier	 end Node
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
DOMHelper	TokenNameIdentifier	 DOM Helper
.	TokenNameDOT	
isNodeTheSame	TokenNameIdentifier	 is Node The Same
(	TokenNameLPAREN	
testNode	TokenNameIdentifier	 test Node
,	TokenNameCOMMA	
endNode	TokenNameIdentifier	 end Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
leadNodes	TokenNameIdentifier	 lead Nodes
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
testNode	TokenNameIdentifier	 test Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
leadNodes	TokenNameIdentifier	 lead Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The set:trailing function returns the nodes in the node set passed as the first argument that * follow, in document order, the first node in the node set passed as the second argument. If * the first node in the second node set is not contained in the first node set, then an empty * node set is returned. If the second node set is empty, then the first node set is returned. * * @param nl1 NodeList for first node-set. * @param nl2 NodeList for second node-set. * @return a NodeList containing the nodes in nl1 that follow in document order the first * node in nl2; an empty node-set if the first node in nl2 is not in nl1; all of nl1 if nl2 * is empty. * * @see <a href="http://www.exslt.org/">EXSLT</a> */	TokenNameCOMMENT_JAVADOC	 The set:trailing function returns the nodes in the node set passed as the first argument that follow, in document order, the first node in the node set passed as the second argument. If the first node in the second node set is not contained in the first node set, then an empty node set is returned. If the second node set is empty, then the first node set is returned. * @param nl1 NodeList for first node-set. @param nl2 NodeList for second node-set. @return a NodeList containing the nodes in nl1 that follow in document order the first node in nl2; an empty node-set if the first node in nl2 is not in nl1; all of nl1 if nl2 is empty. * @see <a href="http://www.exslt.org/">EXSLT</a> 
public	TokenNamepublic	
static	TokenNamestatic	
NodeList	TokenNameIdentifier	 Node List
trailing	TokenNameIdentifier	 trailing
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nl1	TokenNameIdentifier	 nl1
,	TokenNameCOMMA	
NodeList	TokenNameIdentifier	 Node List
nl2	TokenNameIdentifier	 nl2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nl2	TokenNameIdentifier	 nl2
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
nl1	TokenNameIdentifier	 nl1
;	TokenNameSEMICOLON	
NodeSet	TokenNameIdentifier	 Node Set
ns1	TokenNameIdentifier	 ns1
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
nl1	TokenNameIdentifier	 nl1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeSet	TokenNameIdentifier	 Node Set
trailNodes	TokenNameIdentifier	 trail Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
nl2	TokenNameIdentifier	 nl2
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ns1	TokenNameIdentifier	 ns1
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
trailNodes	TokenNameIdentifier	 trail Nodes
;	TokenNameSEMICOLON	
// empty NodeSet 	TokenNameCOMMENT_LINE	empty NodeSet 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nl1	TokenNameIdentifier	 nl1
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
testNode	TokenNameIdentifier	 test Node
=	TokenNameEQUAL	
nl1	TokenNameIdentifier	 nl1
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DOMHelper	TokenNameIdentifier	 DOM Helper
.	TokenNameDOT	
isNodeAfter	TokenNameIdentifier	 is Node After
(	TokenNameLPAREN	
startNode	TokenNameIdentifier	 start Node
,	TokenNameCOMMA	
testNode	TokenNameIdentifier	 test Node
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
DOMHelper	TokenNameIdentifier	 DOM Helper
.	TokenNameDOT	
isNodeTheSame	TokenNameIdentifier	 is Node The Same
(	TokenNameLPAREN	
startNode	TokenNameIdentifier	 start Node
,	TokenNameCOMMA	
testNode	TokenNameIdentifier	 test Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
trailNodes	TokenNameIdentifier	 trail Nodes
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
testNode	TokenNameIdentifier	 test Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
trailNodes	TokenNameIdentifier	 trail Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The set:intersection function returns a node set comprising the nodes that are within * both the node sets passed as arguments to it. * * @param nl1 NodeList for first node-set. * @param nl2 NodeList for second node-set. * @return a NodeList containing the nodes in nl1 that are also * in nl2. * * @see <a href="http://www.exslt.org/">EXSLT</a> */	TokenNameCOMMENT_JAVADOC	 The set:intersection function returns a node set comprising the nodes that are within both the node sets passed as arguments to it. * @param nl1 NodeList for first node-set. @param nl2 NodeList for second node-set. @return a NodeList containing the nodes in nl1 that are also in nl2. * @see <a href="http://www.exslt.org/">EXSLT</a> 
public	TokenNamepublic	
static	TokenNamestatic	
NodeList	TokenNameIdentifier	 Node List
intersection	TokenNameIdentifier	 intersection
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nl1	TokenNameIdentifier	 nl1
,	TokenNameCOMMA	
NodeList	TokenNameIdentifier	 Node List
nl2	TokenNameIdentifier	 nl2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeSet	TokenNameIdentifier	 Node Set
ns1	TokenNameIdentifier	 ns1
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
nl1	TokenNameIdentifier	 nl1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeSet	TokenNameIdentifier	 Node Set
ns2	TokenNameIdentifier	 ns2
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
nl2	TokenNameIdentifier	 nl2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeSet	TokenNameIdentifier	 Node Set
inter	TokenNameIdentifier	 inter
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inter	TokenNameIdentifier	 inter
.	TokenNameDOT	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
true	TokenNametrue	
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
ns1	TokenNameIdentifier	 ns1
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
ns1	TokenNameIdentifier	 ns1
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ns2	TokenNameIdentifier	 ns2
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
inter	TokenNameIdentifier	 inter
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
inter	TokenNameIdentifier	 inter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The set:difference function returns the difference between two node sets - those nodes that * are in the node set passed as the first argument that are not in the node set passed as the * second argument. * * @param nl1 NodeList for first node-set. * @param nl2 NodeList for second node-set. * @return a NodeList containing the nodes in nl1 that are not in nl2. * * @see <a href="http://www.exslt.org/">EXSLT</a> */	TokenNameCOMMENT_JAVADOC	 The set:difference function returns the difference between two node sets - those nodes that are in the node set passed as the first argument that are not in the node set passed as the second argument. * @param nl1 NodeList for first node-set. @param nl2 NodeList for second node-set. @return a NodeList containing the nodes in nl1 that are not in nl2. * @see <a href="http://www.exslt.org/">EXSLT</a> 
public	TokenNamepublic	
static	TokenNamestatic	
NodeList	TokenNameIdentifier	 Node List
difference	TokenNameIdentifier	 difference
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nl1	TokenNameIdentifier	 nl1
,	TokenNameCOMMA	
NodeList	TokenNameIdentifier	 Node List
nl2	TokenNameIdentifier	 nl2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeSet	TokenNameIdentifier	 Node Set
ns1	TokenNameIdentifier	 ns1
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
nl1	TokenNameIdentifier	 nl1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeSet	TokenNameIdentifier	 Node Set
ns2	TokenNameIdentifier	 ns2
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
nl2	TokenNameIdentifier	 nl2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeSet	TokenNameIdentifier	 Node Set
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
true	TokenNametrue	
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
ns1	TokenNameIdentifier	 ns1
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
ns1	TokenNameIdentifier	 ns1
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ns2	TokenNameIdentifier	 ns2
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The set:distinct function returns a subset of the nodes contained in the node-set NS passed * as the first argument. Specifically, it selects a node N if there is no node in NS that has * the same string value as N, and that precedes N in document order. * * @param nl NodeList for the node-set. * @return a NodeList with nodes from nl containing distinct string values. * In other words, if more than one node in nl contains the same string value, * only include the first such node found. * * @see <a href="http://www.exslt.org/">EXSLT</a> */	TokenNameCOMMENT_JAVADOC	 The set:distinct function returns a subset of the nodes contained in the node-set NS passed as the first argument. Specifically, it selects a node N if there is no node in NS that has the same string value as N, and that precedes N in document order. * @param nl NodeList for the node-set. @return a NodeList with nodes from nl containing distinct string values. In other words, if more than one node in nl contains the same string value, only include the first such node found. * @see <a href="http://www.exslt.org/">EXSLT</a> 
public	TokenNamepublic	
static	TokenNamestatic	
NodeList	TokenNameIdentifier	 Node List
distinct	TokenNameIdentifier	 distinct
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nl	TokenNameIdentifier	 nl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeSet	TokenNameIdentifier	 Node Set
dist	TokenNameIdentifier	 dist
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dist	TokenNameIdentifier	 dist
.	TokenNameDOT	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
stringTable	TokenNameIdentifier	 string Table
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
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
currNode	TokenNameIdentifier	 curr Node
=	TokenNameEQUAL	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
currNode	TokenNameIdentifier	 curr Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
dist	TokenNameIdentifier	 dist
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
currNode	TokenNameIdentifier	 curr Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
stringTable	TokenNameIdentifier	 string Table
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stringTable	TokenNameIdentifier	 string Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
currNode	TokenNameIdentifier	 curr Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dist	TokenNameIdentifier	 dist
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
currNode	TokenNameIdentifier	 curr Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
dist	TokenNameIdentifier	 dist
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The set:has-same-node function returns true if the node set passed as the first argument shares * any nodes with the node set passed as the second argument. If there are no nodes that are in both * node sets, then it returns false. * * The Xalan extensions MethodResolver converts 'has-same-node' to 'hasSameNode'. * * Note: Not to be confused with hasSameNodes in the Xalan namespace, which returns true if * the two node sets contain the exactly the same nodes (perhaps in a different order), * otherwise false. * * @see <a href="http://www.exslt.org/">EXSLT</a> */	TokenNameCOMMENT_JAVADOC	 The set:has-same-node function returns true if the node set passed as the first argument shares any nodes with the node set passed as the second argument. If there are no nodes that are in both node sets, then it returns false. * The Xalan extensions MethodResolver converts 'has-same-node' to 'hasSameNode'. * Note: Not to be confused with hasSameNodes in the Xalan namespace, which returns true if the two node sets contain the exactly the same nodes (perhaps in a different order), otherwise false. * @see <a href="http://www.exslt.org/">EXSLT</a> 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
hasSameNode	TokenNameIdentifier	 has Same Node
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nl1	TokenNameIdentifier	 nl1
,	TokenNameCOMMA	
NodeList	TokenNameIdentifier	 Node List
nl2	TokenNameIdentifier	 nl2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeSet	TokenNameIdentifier	 Node Set
ns1	TokenNameIdentifier	 ns1
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
nl1	TokenNameIdentifier	 nl1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeSet	TokenNameIdentifier	 Node Set
ns2	TokenNameIdentifier	 ns2
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
nl2	TokenNameIdentifier	 nl2
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
ns1	TokenNameIdentifier	 ns1
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ns2	TokenNameIdentifier	 ns2
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
ns1	TokenNameIdentifier	 ns1
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
