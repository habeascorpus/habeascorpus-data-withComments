/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: UnionChildIterator.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: UnionChildIterator.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
axes	TokenNameIdentifier	 axes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMIterator	TokenNameIdentifier	 DTM Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
NodeTest	TokenNameIdentifier	 Node Test
;	TokenNameSEMICOLON	
/** * This class defines a simplified type of union iterator that only * tests along the child axes. If the conditions are right, it is * much faster than using a UnionPathIterator. */	TokenNameCOMMENT_JAVADOC	 This class defines a simplified type of union iterator that only tests along the child axes. If the conditions are right, it is much faster than using a UnionPathIterator. 
public	TokenNamepublic	
class	TokenNameclass	
UnionChildIterator	TokenNameIdentifier	 Union Child Iterator
extends	TokenNameextends	
ChildTestIterator	TokenNameIdentifier	 Child Test Iterator
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3500298482193003495L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Even though these may hold full LocPathIterators, this array does * not have to be cloned, since only the node test and predicate * portion are used, and these only need static information. However, * also note that index predicates can not be used! */	TokenNameCOMMENT_JAVADOC	 Even though these may hold full LocPathIterators, this array does not have to be cloned, since only the node test and predicate portion are used, and these only need static information. However, also note that index predicates can not be used! 
private	TokenNameprivate	
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_nodeTests	TokenNameIdentifier	 m node Tests
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructor for UnionChildIterator */	TokenNameCOMMENT_JAVADOC	 Constructor for UnionChildIterator 
public	TokenNamepublic	
UnionChildIterator	TokenNameIdentifier	 Union Child Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a node test to the union list. * * @param test reference to a NodeTest, which will be added * directly to the list of node tests (in other words, it will * not be cloned). The parent of this test will be set to * this object. */	TokenNameCOMMENT_JAVADOC	 Add a node test to the union list. * @param test reference to a NodeTest, which will be added directly to the list of node tests (in other words, it will not be cloned). The parent of this test will be set to this object. 
public	TokenNamepublic	
void	TokenNamevoid	
addNodeTest	TokenNameIdentifier	 add Node Test
(	TokenNameLPAREN	
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Increase array size by only 1 at a time. Fix this 	TokenNameCOMMENT_LINE	Increase array size by only 1 at a time. Fix this 
// if it looks to be a problem. 	TokenNameCOMMENT_LINE	if it looks to be a problem. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_nodeTests	TokenNameIdentifier	 m node Tests
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_nodeTests	TokenNameIdentifier	 m node Tests
=	TokenNameEQUAL	
new	TokenNamenew	
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_nodeTests	TokenNameIdentifier	 m node Tests
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
test	TokenNameIdentifier	 test
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tests	TokenNameIdentifier	 tests
=	TokenNameEQUAL	
m_nodeTests	TokenNameIdentifier	 m node Tests
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
m_nodeTests	TokenNameIdentifier	 m node Tests
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
m_nodeTests	TokenNameIdentifier	 m node Tests
=	TokenNameEQUAL	
new	TokenNamenew	
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
tests	TokenNameIdentifier	 tests
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_nodeTests	TokenNameIdentifier	 m node Tests
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nodeTests	TokenNameIdentifier	 m node Tests
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
test	TokenNameIdentifier	 test
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is used to fixup variables from QNames to stack frame * indexes at stylesheet build time. * @param vars List of QNames that correspond to variables. This list * should be searched backwards for the first qualified name that * corresponds to the variable reference qname. The position of the * QName in the vector from the start of the vector will be its position * in the stack frame (but variables above the globalsTop value will need * to be offset to the current stack frame). */	TokenNameCOMMENT_JAVADOC	 This function is used to fixup variables from QNames to stack frame indexes at stylesheet build time. @param vars List of QNames that correspond to variables. This list should be searched backwards for the first qualified name that corresponds to the variable reference qname. The position of the QName in the vector from the start of the vector will be its position in the stack frame (but variables above the globalsTop value will need to be offset to the current stack frame). 
public	TokenNamepublic	
void	TokenNamevoid	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
int	TokenNameint	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_nodeTests	TokenNameIdentifier	 m node Tests
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
m_nodeTests	TokenNameIdentifier	 m node Tests
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_nodeTests	TokenNameIdentifier	 m node Tests
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test whether a specified node is visible in the logical view of a * TreeWalker or NodeIterator. This function will be called by the * implementation of TreeWalker and NodeIterator; it is not intended to * be called directly from user code. * @param n The node to check to see if it passes the filter or not. * @return a constant to determine whether the node is accepted, * rejected, or skipped, as defined above . */	TokenNameCOMMENT_JAVADOC	 Test whether a specified node is visible in the logical view of a TreeWalker or NodeIterator. This function will be called by the implementation of TreeWalker and NodeIterator; it is not intended to be called directly from user code. @param n The node to check to see if it passes the filter or not. @return a constant to determine whether the node is accepted, rejected, or skipped, as defined above . 
public	TokenNamepublic	
short	TokenNameshort	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
m_nodeTests	TokenNameIdentifier	 m node Tests
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
pnt	TokenNameIdentifier	 pnt
=	TokenNameEQUAL	
m_nodeTests	TokenNameIdentifier	 m node Tests
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
pnt	TokenNameIdentifier	 pnt
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
!=	TokenNameNOT_EQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Note that we are assuming there are no positional predicates! 	TokenNameCOMMENT_LINE	Note that we are assuming there are no positional predicates! 
if	TokenNameif	
(	TokenNameLPAREN	
pnt	TokenNameIdentifier	 pnt
.	TokenNameDOT	
getPredicateCount	TokenNameIdentifier	 get Predicate Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pnt	TokenNameIdentifier	 pnt
.	TokenNameDOT	
executePredicates	TokenNameIdentifier	 execute Predicates
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: Fix this. 	TokenNameCOMMENT_LINE	TODO: Fix this. 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNode	TokenNameIdentifier	 pop Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
