package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
harness	TokenNameIdentifier	 harness
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
jxpath	TokenNameIdentifier	 jxpath
.	TokenNameDOT	
ri	TokenNameIdentifier	 ri
.	TokenNameDOT	
Compiler	TokenNameIdentifier	 Compiler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
jxpath	TokenNameIdentifier	 jxpath
.	TokenNameDOT	
ri	TokenNameIdentifier	 ri
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
NodeNameTest	TokenNameIdentifier	 Node Name Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
jxpath	TokenNameIdentifier	 jxpath
.	TokenNameDOT	
ri	TokenNameIdentifier	 ri
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
NodeTest	TokenNameIdentifier	 Node Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
jxpath	TokenNameIdentifier	 jxpath
.	TokenNameDOT	
ri	TokenNameIdentifier	 ri
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
NodeTypeTest	TokenNameIdentifier	 Node Type Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
jxpath	TokenNameIdentifier	 jxpath
.	TokenNameDOT	
ri	TokenNameIdentifier	 ri
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
NodeIterator	TokenNameIdentifier	 Node Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
jxpath	TokenNameIdentifier	 jxpath
.	TokenNameDOT	
ri	TokenNameIdentifier	 ri
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
NodePointer	TokenNameIdentifier	 Node Pointer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
;	TokenNameSEMICOLON	
/** * A node iterator for JXPath to support <code>Xpp3Dom</code>. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 A node iterator for JXPath to support <code>Xpp3Dom</code>. * @author Benjamin Bentmann 
class	TokenNameclass	
Xpp3DomNodeIterator	TokenNameIdentifier	 Xpp3 Dom Node Iterator
implements	TokenNameimplements	
NodeIterator	TokenNameIdentifier	 Node Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
NodePointer	TokenNameIdentifier	 Node Pointer
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
private	TokenNameprivate	
NodeTest	TokenNameIdentifier	 Node Test
test	TokenNameIdentifier	 test
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
>	TokenNameGREATER	
filteredChildren	TokenNameIdentifier	 filtered Children
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
filteredIndex	TokenNameIdentifier	 filtered Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Xpp3DomNodeIterator	TokenNameIdentifier	 Xpp3 Dom Node Iterator
(	TokenNameLPAREN	
NodePointer	TokenNameIdentifier	 Node Pointer
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
NodeTest	TokenNameIdentifier	 Node Test
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reverse	TokenNameIdentifier	 reverse
,	TokenNameCOMMA	
NodePointer	TokenNameIdentifier	 Node Pointer
startWith	TokenNameIdentifier	 start With
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startWith	TokenNameIdentifier	 start With
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
filteredIndex	TokenNameIdentifier	 filtered Index
<	TokenNameLESS	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
filteredIndex	TokenNameIdentifier	 filtered Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startWith	TokenNameIdentifier	 start With
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
filteredIndex	TokenNameIdentifier	 filtered Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filteredIndex	TokenNameIdentifier	 filtered Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
test	TokenNameIdentifier	 test
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
NodePointer	TokenNameIdentifier	 Node Pointer
getNodePointer	TokenNameIdentifier	 get Node Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setPosition	TokenNameIdentifier	 set Position
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
new	TokenNamenew	
Xpp3DomNodePointer	TokenNameIdentifier	 Xpp3 Dom Node Pointer
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
setPosition	TokenNameIdentifier	 set Position
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
filterChildren	TokenNameIdentifier	 filter Children
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
position	TokenNameIdentifier	 position
<=	TokenNameLESS_EQUAL	
filteredChildren	TokenNameIdentifier	 filtered Children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
filteredChildren	TokenNameIdentifier	 filtered Children
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
filterChildren	TokenNameIdentifier	 filter Children
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
>	TokenNameGREATER	
filteredChildren	TokenNameIdentifier	 filtered Children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
filteredIndex	TokenNameIdentifier	 filtered Index
<	TokenNameLESS	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
filteredIndex	TokenNameIdentifier	 filtered Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
filteredIndex	TokenNameIdentifier	 filtered Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testNode	TokenNameIdentifier	 test Node
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filteredChildren	TokenNameIdentifier	 filtered Children
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
testNode	TokenNameIdentifier	 test Node
(	TokenNameLPAREN	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
instanceof	TokenNameinstanceof	
NodeNameTest	TokenNameIdentifier	 Node Name Test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
NodeNameTest	TokenNameIdentifier	 Node Name Test
nodeNameTest	TokenNameIdentifier	 node Name Test
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeNameTest	TokenNameIdentifier	 Node Name Test
)	TokenNameRPAREN	
test	TokenNameIdentifier	 test
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
nodeNameTest	TokenNameIdentifier	 node Name Test
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
wildcard	TokenNameIdentifier	 wildcard
=	TokenNameEQUAL	
nodeNameTest	TokenNameIdentifier	 node Name Test
.	TokenNameDOT	
isWildcard	TokenNameIdentifier	 is Wildcard
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
testName	TokenNameIdentifier	 test Name
=	TokenNameEQUAL	
nodeNameTest	TokenNameIdentifier	 node Name Test
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
testPrefix	TokenNameIdentifier	 test Prefix
=	TokenNameEQUAL	
nodeNameTest	TokenNameIdentifier	 node Name Test
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wildcard	TokenNameIdentifier	 wildcard
&&	TokenNameAND_AND	
testPrefix	TokenNameIdentifier	 test Prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
wildcard	TokenNameIdentifier	 wildcard
||	TokenNameOR_OR	
testName	TokenNameIdentifier	 test Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
||	TokenNameOR_OR	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
testPrefix	TokenNameIdentifier	 test Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
instanceof	TokenNameinstanceof	
NodeTypeTest	TokenNameIdentifier	 Node Type Test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeTypeTest	TokenNameIdentifier	 Node Type Test
)	TokenNameRPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Compiler	TokenNameIdentifier	 Compiler
.	TokenNameDOT	
NODE_TYPE_NODE	TokenNameIdentifier	 NODE  TYPE  NODE
:	TokenNameCOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Compiler	TokenNameIdentifier	 Compiler
.	TokenNameDOT	
NODE_TYPE_TEXT	TokenNameIdentifier	 NODE  TYPE  TEXT
:	TokenNameCOLON	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
