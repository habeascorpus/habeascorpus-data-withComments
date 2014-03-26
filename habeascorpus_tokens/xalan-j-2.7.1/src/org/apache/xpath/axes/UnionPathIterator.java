/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: UnionPathIterator.java 469314 2006-10-30 23:31:59Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: UnionPathIterator.java 469314 2006-10-30 23:31:59Z minchau $ 
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
Axis	TokenNameIdentifier	 Axis
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
DTM	TokenNameIdentifier	 DTM
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
Expression	TokenNameIdentifier	 Expression
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
Compiler	TokenNameIdentifier	 Compiler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
OpCodes	TokenNameIdentifier	 Op Codes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
OpMap	TokenNameIdentifier	 Op Map
;	TokenNameSEMICOLON	
/** * This class extends NodeSetDTM, which implements DTMIterator, * and fetches nodes one at a time in document order based on a XPath * <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>. * As each node is iterated via nextNode(), the node is also stored * in the NodeVector, so that previousNode() can easily be done. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 This class extends NodeSetDTM, which implements DTMIterator, and fetches nodes one at a time in document order based on a XPath <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>. As each node is iterated via nextNode(), the node is also stored in the NodeVector, so that previousNode() can easily be done. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
UnionPathIterator	TokenNameIdentifier	 Union Path Iterator
extends	TokenNameextends	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
DTMIterator	TokenNameIdentifier	 DTM Iterator
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
PathComponent	TokenNameIdentifier	 Path Component
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
3910351546843826781L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Constructor to create an instance which you can add location paths to. */	TokenNameCOMMENT_JAVADOC	 Constructor to create an instance which you can add location paths to. 
public	TokenNamepublic	
UnionPathIterator	TokenNameIdentifier	 Union Path Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// m_mutable = false; 	TokenNameCOMMENT_LINE	m_mutable = false; 
// m_cacheNodes = false; 	TokenNameCOMMENT_LINE	m_cacheNodes = false; 
m_iterators	TokenNameIdentifier	 m iterators
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_exprs	TokenNameIdentifier	 m exprs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize the context values for this expression * after it is cloned. * * @param context The XPath runtime context for this * transformation. */	TokenNameCOMMENT_JAVADOC	 Initialize the context values for this expression after it is cloned. * @param context The XPath runtime context for this transformation. 
public	TokenNamepublic	
void	TokenNamevoid	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
environment	TokenNameIdentifier	 environment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
environment	TokenNameIdentifier	 environment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_exprs	TokenNameIdentifier	 m exprs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_exprs	TokenNameIdentifier	 m exprs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
DTMIterator	TokenNameIdentifier	 DTM Iterator
newIters	TokenNameIdentifier	 new Iters
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
DTMIterator	TokenNameIdentifier	 DTM Iterator
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTMIterator	TokenNameIdentifier	 DTM Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
m_exprs	TokenNameIdentifier	 m exprs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
asIterator	TokenNameIdentifier	 as Iterator
(	TokenNameLPAREN	
m_execContext	TokenNameIdentifier	 m exec Context
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newIters	TokenNameIdentifier	 new Iters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_iterators	TokenNameIdentifier	 m iterators
=	TokenNameEQUAL	
newIters	TokenNameIdentifier	 new Iters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add an iterator to the union list. * * @param expr non-null reference to a location path iterator. */	TokenNameCOMMENT_JAVADOC	 Add an iterator to the union list. * @param expr non-null reference to a location path iterator. 
public	TokenNamepublic	
void	TokenNamevoid	
addIterator	TokenNameIdentifier	 add Iterator
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Increase array size by only 1 at a time. Fix this 	TokenNameCOMMENT_LINE	Increase array size by only 1 at a time. Fix this 
// if it looks to be a problem. 	TokenNameCOMMENT_LINE	if it looks to be a problem. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_iterators	TokenNameIdentifier	 m iterators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_iterators	TokenNameIdentifier	 m iterators
=	TokenNameEQUAL	
new	TokenNamenew	
DTMIterator	TokenNameIdentifier	 DTM Iterator
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_iterators	TokenNameIdentifier	 m iterators
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
DTMIterator	TokenNameIdentifier	 DTM Iterator
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
exprs	TokenNameIdentifier	 exprs
=	TokenNameEQUAL	
m_iterators	TokenNameIdentifier	 m iterators
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
m_iterators	TokenNameIdentifier	 m iterators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
m_iterators	TokenNameIdentifier	 m iterators
=	TokenNameEQUAL	
new	TokenNamenew	
DTMIterator	TokenNameIdentifier	 DTM Iterator
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
exprs	TokenNameIdentifier	 exprs
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_iterators	TokenNameIdentifier	 m iterators
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_iterators	TokenNameIdentifier	 m iterators
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
instanceof	TokenNameinstanceof	
Expression	TokenNameIdentifier	 Expression
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Detaches the iterator from the set which it iterated over, releasing * any computational resources and placing the iterator in the INVALID * state. After<code>detach</code> has been invoked, calls to * <code>nextNode</code> or<code>previousNode</code> will raise the * exception INVALID_STATE_ERR. */	TokenNameCOMMENT_JAVADOC	 Detaches the iterator from the set which it iterated over, releasing any computational resources and placing the iterator in the INVALID state. After<code>detach</code> has been invoked, calls to <code>nextNode</code> or<code>previousNode</code> will raise the exception INVALID_STATE_ERR. 
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_allowDetach	TokenNameIdentifier	 m allow Detach
&&	TokenNameAND_AND	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_iterators	TokenNameIdentifier	 m iterators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_iterators	TokenNameIdentifier	 m iterators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_iterators	TokenNameIdentifier	 m iterators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_iterators	TokenNameIdentifier	 m iterators
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a UnionPathIterator object, including creation * of location path iterators from the opcode list, and call back * into the Compiler to create predicate expressions. * * @param compiler The Compiler which is creating * this expression. * @param opPos The position of this iterator in the * opcode list from the compiler. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a UnionPathIterator object, including creation of location path iterators from the opcode list, and call back into the Compiler to create predicate expressions. * @param compiler The Compiler which is creating this expression. @param opPos The position of this iterator in the opcode list from the compiler. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
UnionPathIterator	TokenNameIdentifier	 Union Path Iterator
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
getFirstChildPos	TokenNameIdentifier	 get First Child Pos
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loadLocationPaths	TokenNameIdentifier	 load Location Paths
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This will return an iterator capable of handling the union of paths given. * * @param compiler The Compiler which is creating * this expression. * @param opPos The position of this iterator in the * opcode list from the compiler. * * @return Object that is derived from LocPathIterator. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 This will return an iterator capable of handling the union of paths given. * @param compiler The Compiler which is creating this expression. @param opPos The position of this iterator in the opcode list from the compiler. * @return Object that is derived from LocPathIterator. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
static	TokenNamestatic	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
createUnionIterator	TokenNameIdentifier	 create Union Iterator
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// For the moment, I'm going to first create a full UnionPathIterator, and 	TokenNameCOMMENT_LINE	For the moment, I'm going to first create a full UnionPathIterator, and 
// then see if I can reduce it to a UnionChildIterator. It would obviously 	TokenNameCOMMENT_LINE	then see if I can reduce it to a UnionChildIterator. It would obviously 
// be more effecient to just test for the conditions for a UnionChildIterator, 	TokenNameCOMMENT_LINE	be more effecient to just test for the conditions for a UnionChildIterator, 
// and then create that directly. 	TokenNameCOMMENT_LINE	and then create that directly. 
UnionPathIterator	TokenNameIdentifier	 Union Path Iterator
upi	TokenNameIdentifier	 upi
=	TokenNameEQUAL	
new	TokenNamenew	
UnionPathIterator	TokenNameIdentifier	 Union Path Iterator
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nPaths	TokenNameIdentifier	 n Paths
=	TokenNameEQUAL	
upi	TokenNameIdentifier	 upi
.	TokenNameDOT	
m_exprs	TokenNameIdentifier	 m exprs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isAllChildIterators	TokenNameIdentifier	 is All Child Iterators
=	TokenNameEQUAL	
true	TokenNametrue	
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
nPaths	TokenNameIdentifier	 n Paths
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
lpi	TokenNameIdentifier	 lpi
=	TokenNameEQUAL	
upi	TokenNameIdentifier	 upi
.	TokenNameDOT	
m_exprs	TokenNameIdentifier	 m exprs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lpi	TokenNameIdentifier	 lpi
.	TokenNameDOT	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
CHILD	TokenNameIdentifier	 CHILD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isAllChildIterators	TokenNameIdentifier	 is All Child Iterators
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// check for positional predicates or position function, which won't work. 	TokenNameCOMMENT_LINE	check for positional predicates or position function, which won't work. 
if	TokenNameif	
(	TokenNameLPAREN	
HasPositionalPredChecker	TokenNameIdentifier	 Has Positional Pred Checker
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
lpi	TokenNameIdentifier	 lpi
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isAllChildIterators	TokenNameIdentifier	 is All Child Iterators
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
isAllChildIterators	TokenNameIdentifier	 is All Child Iterators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UnionChildIterator	TokenNameIdentifier	 Union Child Iterator
uci	TokenNameIdentifier	 uci
=	TokenNameEQUAL	
new	TokenNamenew	
UnionChildIterator	TokenNameIdentifier	 Union Child Iterator
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
nPaths	TokenNameIdentifier	 n Paths
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
lpi	TokenNameIdentifier	 lpi
=	TokenNameEQUAL	
upi	TokenNameIdentifier	 upi
.	TokenNameDOT	
m_exprs	TokenNameIdentifier	 m exprs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// I could strip the lpi down to a pure PredicatedNodeTest, but 	TokenNameCOMMENT_LINE	I could strip the lpi down to a pure PredicatedNodeTest, but 
// I don't think it's worth it. Note that the test can be used 	TokenNameCOMMENT_LINE	I don't think it's worth it. Note that the test can be used 
// as a static object... so it doesn't have to be cloned. 	TokenNameCOMMENT_LINE	as a static object... so it doesn't have to be cloned. 
uci	TokenNameIdentifier	 uci
.	TokenNameDOT	
addNodeTest	TokenNameIdentifier	 add Node Test
(	TokenNameLPAREN	
lpi	TokenNameIdentifier	 lpi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
uci	TokenNameIdentifier	 uci
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
upi	TokenNameIdentifier	 upi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the analysis bits for this walker, as defined in the WalkerFactory. * @return One of WalkerFactory#BIT_DESCENDANT, etc. */	TokenNameCOMMENT_JAVADOC	 Get the analysis bits for this walker, as defined in the WalkerFactory. @return One of WalkerFactory#BIT_DESCENDANT, etc. 
public	TokenNamepublic	
int	TokenNameint	
getAnalysisBits	TokenNameIdentifier	 get Analysis Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_exprs	TokenNameIdentifier	 m exprs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_exprs	TokenNameIdentifier	 m exprs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bit	TokenNameIdentifier	 bit
=	TokenNameEQUAL	
m_exprs	TokenNameIdentifier	 m exprs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getAnalysisBits	TokenNameIdentifier	 get Analysis Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
bit	TokenNameIdentifier	 bit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read the object from a serialization stream. * * @param stream Input stream to read from * * @throws java.io.IOException * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Read the object from a serialization stream. * @param stream Input stream to read from * @throws java.io.IOException @throws javax.xml.transform.TransformerException 
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
defaultReadObject	TokenNameIdentifier	 default Read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_clones	TokenNameIdentifier	 m clones
=	TokenNameEQUAL	
new	TokenNamenew	
IteratorPool	TokenNameIdentifier	 Iterator Pool
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get a cloned LocPathIterator that holds the same * position as this iterator. * * @return A clone of this iterator that holds the same node position. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a cloned LocPathIterator that holds the same position as this iterator. * @return A clone of this iterator that holds the same node position. * @throws CloneNotSupportedException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
UnionPathIterator	TokenNameIdentifier	 Union Path Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnionPathIterator	TokenNameIdentifier	 Union Path Iterator
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_iterators	TokenNameIdentifier	 m iterators
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_iterators	TokenNameIdentifier	 m iterators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_iterators	TokenNameIdentifier	 m iterators
=	TokenNameEQUAL	
new	TokenNamenew	
DTMIterator	TokenNameIdentifier	 DTM Iterator
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_iterators	TokenNameIdentifier	 m iterators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
m_iterators	TokenNameIdentifier	 m iterators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new location path iterator. * * @param compiler The Compiler which is creating * this expression. * @param opPos The position of this iterator in the * * @return New location path iterator. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a new location path iterator. * @param compiler The Compiler which is creating this expression. @param opPos The position of this iterator in the * @return New location path iterator. * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
createDTMIterator	TokenNameIdentifier	 create DTM Iterator
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
lpi	TokenNameIdentifier	 lpi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
)	TokenNameRPAREN	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
newDTMIterator	TokenNameIdentifier	 new DTM Iterator
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getLocationPathDepth	TokenNameIdentifier	 get Location Path Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lpi	TokenNameIdentifier	 lpi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize the location path iterators. Recursive. * * @param compiler The Compiler which is creating * this expression. * @param opPos The position of this iterator in the * opcode list from the compiler. * @param count The insert position of the iterator. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Initialize the location path iterators. Recursive. * @param compiler The Compiler which is creating this expression. @param opPos The position of this iterator in the opcode list from the compiler. @param count The insert position of the iterator. * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
loadLocationPaths	TokenNameIdentifier	 load Location Paths
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// TODO: Handle unwrapped FilterExpr 	TokenNameCOMMENT_LINE	TODO: Handle unwrapped FilterExpr 
int	TokenNameint	
steptype	TokenNameIdentifier	 steptype
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
steptype	TokenNameIdentifier	 steptype
==	TokenNameEQUAL_EQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_LOCATIONPATH	TokenNameIdentifier	 OP  LOCATIONPATH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loadLocationPaths	TokenNameIdentifier	 load Location Paths
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getNextOpPos	TokenNameIdentifier	 get Next Op Pos
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_exprs	TokenNameIdentifier	 m exprs
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
createDTMIterator	TokenNameIdentifier	 create DTM Iterator
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_exprs	TokenNameIdentifier	 m exprs
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Have to check for unwrapped functions, which the LocPathIterator 	TokenNameCOMMENT_LINE	Have to check for unwrapped functions, which the LocPathIterator 
// doesn't handle. 	TokenNameCOMMENT_LINE	doesn't handle. 
switch	TokenNameswitch	
(	TokenNameLPAREN	
steptype	TokenNameIdentifier	 steptype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_VARIABLE	TokenNameIdentifier	 OP  VARIABLE
:	TokenNameCOLON	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_EXTFUNCTION	TokenNameIdentifier	 OP  EXTFUNCTION
:	TokenNameCOLON	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_FUNCTION	TokenNameIdentifier	 OP  FUNCTION
:	TokenNameCOLON	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_GROUP	TokenNameIdentifier	 OP  GROUP
:	TokenNameCOLON	
loadLocationPaths	TokenNameIdentifier	 load Location Paths
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getNextOpPos	TokenNameIdentifier	 get Next Op Pos
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
new	TokenNamenew	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getNamespaceContext	TokenNameIdentifier	 get Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getLocationPathDepth	TokenNameIdentifier	 get Location Path Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
setIsTopLevel	TokenNameIdentifier	 set Is Top Level
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
m_firstWalker	TokenNameIdentifier	 m first Walker
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
axes	TokenNameIdentifier	 axes
.	TokenNameDOT	
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
m_firstWalker	TokenNameIdentifier	 m first Walker
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
steptype	TokenNameIdentifier	 steptype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_exprs	TokenNameIdentifier	 m exprs
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
m_exprs	TokenNameIdentifier	 m exprs
=	TokenNameEQUAL	
new	TokenNamenew	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next node in the set and advances the position of the * iterator in the set. After a DTMIterator is created, the first call * to nextNode() returns the first node in the set. * @return The next <code>Node</code> in the set being iterated over, or * <code>null</code> if there are no more members in that set. */	TokenNameCOMMENT_JAVADOC	 Returns the next node in the set and advances the position of the iterator in the set. After a DTMIterator is created, the first call to nextNode() returns the first node in the set. @return The next <code>Node</code> in the set being iterated over, or <code>null</code> if there are no more members in that set. 
public	TokenNamepublic	
int	TokenNameint	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_foundLast	TokenNameIdentifier	 m found Last
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
// Loop through the iterators getting the current fetched 	TokenNameCOMMENT_LINE	Loop through the iterators getting the current fetched 
// node, and get the earliest occuring in document order 	TokenNameCOMMENT_LINE	node, and get the earliest occuring in document order 
int	TokenNameint	
earliestNode	TokenNameIdentifier	 earliest Node
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_iterators	TokenNameIdentifier	 m iterators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_iterators	TokenNameIdentifier	 m iterators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
iteratorUsed	TokenNameIdentifier	 iterator Used
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
m_iterators	TokenNameIdentifier	 m iterators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
earliestNode	TokenNameIdentifier	 earliest Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iteratorUsed	TokenNameIdentifier	 iterator Used
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
earliestNode	TokenNameIdentifier	 earliest Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
earliestNode	TokenNameIdentifier	 earliest Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Found a duplicate, so skip past it. 	TokenNameCOMMENT_LINE	Found a duplicate, so skip past it. 
m_iterators	TokenNameIdentifier	 m iterators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
isNodeAfter	TokenNameIdentifier	 is Node After
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
earliestNode	TokenNameIdentifier	 earliest Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iteratorUsed	TokenNameIdentifier	 iterator Used
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
earliestNode	TokenNameIdentifier	 earliest Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
earliestNode	TokenNameIdentifier	 earliest Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_iterators	TokenNameIdentifier	 m iterators
[	TokenNameLBRACKET	
iteratorUsed	TokenNameIdentifier	 iterator Used
]	TokenNameRBRACKET	
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incrementCurrentPos	TokenNameIdentifier	 increment Current Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
m_foundLast	TokenNameIdentifier	 m found Last
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_lastFetched	TokenNameIdentifier	 m last Fetched
=	TokenNameEQUAL	
earliestNode	TokenNameIdentifier	 earliest Node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
earliestNode	TokenNameIdentifier	 earliest Node
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
m_exprs	TokenNameIdentifier	 m exprs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_exprs	TokenNameIdentifier	 m exprs
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
/** * The location path iterators, one for each * <a href="http://www.w3.org/TR/xpath#NT-LocationPath">location * path</a> contained in the union expression. * @serial */	TokenNameCOMMENT_JAVADOC	 The location path iterators, one for each <a href="http://www.w3.org/TR/xpath#NT-LocationPath">location path</a> contained in the union expression. @serial 
protected	TokenNameprotected	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_exprs	TokenNameIdentifier	 m exprs
;	TokenNameSEMICOLON	
/** * The location path iterators, one for each * <a href="http://www.w3.org/TR/xpath#NT-LocationPath">location * path</a> contained in the union expression. * @serial */	TokenNameCOMMENT_JAVADOC	 The location path iterators, one for each <a href="http://www.w3.org/TR/xpath#NT-LocationPath">location path</a> contained in the union expression. @serial 
protected	TokenNameprotected	
DTMIterator	TokenNameIdentifier	 DTM Iterator
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_iterators	TokenNameIdentifier	 m iterators
;	TokenNameSEMICOLON	
/** * Returns the axis being iterated, if it is known. * * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple * types. */	TokenNameCOMMENT_JAVADOC	 Returns the axis being iterated, if it is known. * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple types. 
public	TokenNamepublic	
int	TokenNameint	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Could be smarter. 	TokenNameCOMMENT_LINE	Could be smarter. 
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
class	TokenNameclass	
iterOwner	TokenNameIdentifier	 iter Owner
implements	TokenNameimplements	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
{	TokenNameLBRACE	
int	TokenNameint	
m_index	TokenNameIdentifier	 m index
;	TokenNameSEMICOLON	
iterOwner	TokenNameIdentifier	 iter Owner
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_index	TokenNameIdentifier	 m index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExpressionOwner#getExpression() */	TokenNameCOMMENT_JAVADOC	 @see ExpressionOwner#getExpression() 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_exprs	TokenNameIdentifier	 m exprs
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExpressionOwner#setExpression(Expression) */	TokenNameCOMMENT_JAVADOC	 @see ExpressionOwner#setExpression(Expression) 
public	TokenNamepublic	
void	TokenNamevoid	
setExpression	TokenNameIdentifier	 set Expression
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
exp	TokenNameIdentifier	 exp
instanceof	TokenNameinstanceof	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Yuck. Need FilterExprIter. Or make it so m_exprs can be just 	TokenNameCOMMENT_LINE	Yuck. Need FilterExprIter. Or make it so m_exprs can be just 
// plain expressions? 	TokenNameCOMMENT_LINE	plain expressions? 
WalkingIterator	TokenNameIdentifier	 Walking Iterator
wi	TokenNameIdentifier	 wi
=	TokenNameEQUAL	
new	TokenNamenew	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
(	TokenNameLPAREN	
getPrefixResolver	TokenNameIdentifier	 get Prefix Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
few	TokenNameIdentifier	 few
=	TokenNameEQUAL	
new	TokenNamenew	
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
(	TokenNameLPAREN	
wi	TokenNameIdentifier	 wi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wi	TokenNameIdentifier	 wi
.	TokenNameDOT	
setFirstWalker	TokenNameIdentifier	 set First Walker
(	TokenNameLPAREN	
few	TokenNameIdentifier	 few
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
few	TokenNameIdentifier	 few
.	TokenNameDOT	
setInnerExpression	TokenNameIdentifier	 set Inner Expression
(	TokenNameLPAREN	
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wi	TokenNameIdentifier	 wi
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
UnionPathIterator	TokenNameIdentifier	 Union Path Iterator
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
few	TokenNameIdentifier	 few
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
wi	TokenNameIdentifier	 wi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
few	TokenNameIdentifier	 few
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
wi	TokenNameIdentifier	 wi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
UnionPathIterator	TokenNameIdentifier	 Union Path Iterator
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_exprs	TokenNameIdentifier	 m exprs
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
)	TokenNameRPAREN	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see org.apache.xpath.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xpath.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor) 
public	TokenNamepublic	
void	TokenNamevoid	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitUnionPath	TokenNameIdentifier	 visit Union Path
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_exprs	TokenNameIdentifier	 m exprs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_exprs	TokenNameIdentifier	 m exprs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_exprs	TokenNameIdentifier	 m exprs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
new	TokenNamenew	
iterOwner	TokenNameIdentifier	 iter Owner
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see Expression#deepEquals(Expression) */	TokenNameCOMMENT_JAVADOC	 @see Expression#deepEquals(Expression) 
public	TokenNamepublic	
boolean	TokenNameboolean	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
super	TokenNamesuper	
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
UnionPathIterator	TokenNameIdentifier	 Union Path Iterator
upi	TokenNameIdentifier	 upi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnionPathIterator	TokenNameIdentifier	 Union Path Iterator
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_exprs	TokenNameIdentifier	 m exprs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_exprs	TokenNameIdentifier	 m exprs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
upi	TokenNameIdentifier	 upi
.	TokenNameDOT	
m_exprs	TokenNameIdentifier	 m exprs
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
upi	TokenNameIdentifier	 upi
.	TokenNameDOT	
m_exprs	TokenNameIdentifier	 m exprs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_exprs	TokenNameIdentifier	 m exprs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
upi	TokenNameIdentifier	 upi
.	TokenNameDOT	
m_exprs	TokenNameIdentifier	 m exprs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
upi	TokenNameIdentifier	 upi
.	TokenNameDOT	
m_exprs	TokenNameIdentifier	 m exprs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
