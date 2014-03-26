/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: AxesWalker.java 513117 2007-03-01 03:28:52Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: AxesWalker.java 513117 2007-03-01 03:28:52Z minchau $ 
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
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
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
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
XPathContext	TokenNameIdentifier	 X Path Context
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
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
;	TokenNameSEMICOLON	
/** * Serves as common interface for axes Walkers, and stores common * state variables. */	TokenNameCOMMENT_JAVADOC	 Serves as common interface for axes Walkers, and stores common state variables. 
public	TokenNamepublic	
class	TokenNameclass	
AxesWalker	TokenNameIdentifier	 Axes Walker
extends	TokenNameextends	
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
PathComponent	TokenNameIdentifier	 Path Component
,	TokenNameCOMMA	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
2966031951306601247L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Construct an AxesWalker using a LocPathIterator. * * @param locPathIterator non-null reference to the parent iterator. */	TokenNameCOMMENT_JAVADOC	 Construct an AxesWalker using a LocPathIterator. * @param locPathIterator non-null reference to the parent iterator. 
public	TokenNamepublic	
AxesWalker	TokenNameIdentifier	 Axes Walker
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
locPathIterator	TokenNameIdentifier	 loc Path Iterator
,	TokenNameCOMMA	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
locPathIterator	TokenNameIdentifier	 loc Path Iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axis	TokenNameIdentifier	 m axis
=	TokenNameEQUAL	
axis	TokenNameIdentifier	 axis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
wi	TokenNameIdentifier	 wi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
)	TokenNameRPAREN	
m_lpi	TokenNameIdentifier	 m lpi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize an AxesWalker during the parse of the XPath expression. * * @param compiler The Compiler object that has information about this * walker in the op map. * @param opPos The op code position of this location step. * @param stepType The type of location step. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Initialize an AxesWalker during the parse of the XPath expression. * @param compiler The Compiler object that has information about this walker in the op map. @param opPos The op code position of this location step. @param stepType The type of location step. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
int	TokenNameint	
stepType	TokenNameIdentifier	 step Type
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
initPredicateInfo	TokenNameIdentifier	 init Predicate Info
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// int testType = compiler.getOp(nodeTestOpPos); 	TokenNameCOMMENT_LINE	int testType = compiler.getOp(nodeTestOpPos); 
}	TokenNameRBRACE	
/** * Get a cloned AxesWalker. * * @return A new AxesWalker that can be used without mutating this one. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a cloned AxesWalker. * @return A new AxesWalker that can be used without mutating this one. * @throws CloneNotSupportedException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
// Do not access the location path itterator during this operation! 	TokenNameCOMMENT_LINE	Do not access the location path itterator during this operation! 
AxesWalker	TokenNameIdentifier	 Axes Walker
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AxesWalker	TokenNameIdentifier	 Axes Walker
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//clone.setCurrentNode(clone.m_root); 	TokenNameCOMMENT_LINE	clone.setCurrentNode(clone.m_root); 
// clone.m_isFresh = true; 	TokenNameCOMMENT_LINE	clone.m_isFresh = true; 
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Do a deep clone of this walker, including next and previous walkers. * If the this AxesWalker is on the clone list, don't clone but * return the already cloned version. * * @param cloneOwner non-null reference to the cloned location path * iterator to which this clone will be added. * @param cloneList non-null vector of sources in odd elements, and the * corresponding clones in even vectors. * * @return non-null clone, which may be a new clone, or may be a clone * contained on the cloneList. */	TokenNameCOMMENT_JAVADOC	 Do a deep clone of this walker, including next and previous walkers. If the this AxesWalker is on the clone list, don't clone but return the already cloned version. * @param cloneOwner non-null reference to the cloned location path iterator to which this clone will be added. @param cloneList non-null vector of sources in odd elements, and the corresponding clones in even vectors. * @return non-null clone, which may be a new clone, or may be a clone contained on the cloneList. 
AxesWalker	TokenNameIdentifier	 Axes Walker
cloneDeep	TokenNameIdentifier	 clone Deep
(	TokenNameLPAREN	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
cloneOwner	TokenNameIdentifier	 clone Owner
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
cloneList	TokenNameIdentifier	 clone List
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
AxesWalker	TokenNameIdentifier	 Axes Walker
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
findClone	TokenNameIdentifier	 find Clone
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
cloneList	TokenNameIdentifier	 clone List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
clone	TokenNameIdentifier	 clone
)	TokenNameRPAREN	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AxesWalker	TokenNameIdentifier	 Axes Walker
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setLocPathIterator	TokenNameIdentifier	 set Loc Path Iterator
(	TokenNameLPAREN	
cloneOwner	TokenNameIdentifier	 clone Owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
cloneList	TokenNameIdentifier	 clone List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cloneList	TokenNameIdentifier	 clone List
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cloneList	TokenNameIdentifier	 clone List
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
wi	TokenNameIdentifier	 wi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
m_lastUsedWalker	TokenNameIdentifier	 m last Used Walker
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
cloneOwner	TokenNameIdentifier	 clone Owner
.	TokenNameDOT	
m_lastUsedWalker	TokenNameIdentifier	 m last Used Walker
=	TokenNameEQUAL	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_nextWalker	TokenNameIdentifier	 m next Walker
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_nextWalker	TokenNameIdentifier	 m next Walker
=	TokenNameEQUAL	
m_nextWalker	TokenNameIdentifier	 m next Walker
.	TokenNameDOT	
cloneDeep	TokenNameIdentifier	 clone Deep
(	TokenNameLPAREN	
cloneOwner	TokenNameIdentifier	 clone Owner
,	TokenNameCOMMA	
cloneList	TokenNameIdentifier	 clone List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If you don't check for the cloneList here, you'll go into an 	TokenNameCOMMENT_LINE	If you don't check for the cloneList here, you'll go into an 
// recursive infinate loop. 	TokenNameCOMMENT_LINE	recursive infinate loop. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
cloneList	TokenNameIdentifier	 clone List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_prevWalker	TokenNameIdentifier	 m prev Walker
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_prevWalker	TokenNameIdentifier	 m prev Walker
=	TokenNameEQUAL	
m_prevWalker	TokenNameIdentifier	 m prev Walker
.	TokenNameDOT	
cloneDeep	TokenNameIdentifier	 clone Deep
(	TokenNameLPAREN	
cloneOwner	TokenNameIdentifier	 clone Owner
,	TokenNameCOMMA	
cloneList	TokenNameIdentifier	 clone List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_nextWalker	TokenNameIdentifier	 m next Walker
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_nextWalker	TokenNameIdentifier	 m next Walker
.	TokenNameDOT	
m_prevWalker	TokenNameIdentifier	 m prev Walker
=	TokenNameEQUAL	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find a clone that corresponds to the key argument. * * @param key The original AxesWalker for which there may be a clone. * @param cloneList vector of sources in odd elements, and the * corresponding clones in even vectors, may be null. * * @return A clone that corresponds to the key, or null if key not found. */	TokenNameCOMMENT_JAVADOC	 Find a clone that corresponds to the key argument. * @param key The original AxesWalker for which there may be a clone. @param cloneList vector of sources in odd elements, and the corresponding clones in even vectors, may be null. * @return A clone that corresponds to the key, or null if key not found. 
static	TokenNamestatic	
AxesWalker	TokenNameIdentifier	 Axes Walker
findClone	TokenNameIdentifier	 find Clone
(	TokenNameLPAREN	
AxesWalker	TokenNameIdentifier	 Axes Walker
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
cloneList	TokenNameIdentifier	 clone List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
cloneList	TokenNameIdentifier	 clone List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First, look for clone on list. 	TokenNameCOMMENT_LINE	First, look for clone on list. 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
cloneList	TokenNameIdentifier	 clone List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
cloneList	TokenNameIdentifier	 clone List
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
AxesWalker	TokenNameIdentifier	 Axes Walker
)	TokenNameRPAREN	
cloneList	TokenNameIdentifier	 clone List
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Detaches the walker from the set which it iterated over, releasing * any computational resources and placing the iterator in the INVALID * state. */	TokenNameCOMMENT_JAVADOC	 Detaches the walker from the set which it iterated over, releasing any computational resources and placing the iterator in the INVALID state. 
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentNode	TokenNameIdentifier	 m current Node
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
m_dtm	TokenNameIdentifier	 m dtm
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_traverser	TokenNameIdentifier	 m traverser
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_isFresh	TokenNameIdentifier	 m is Fresh
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_root	TokenNameIdentifier	 m root
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//=============== TreeWalker Implementation =============== 	TokenNameCOMMENT_LINE	=============== TreeWalker Implementation =============== 
/** * The root node of the TreeWalker, as specified in setRoot(int root). * Note that this may actually be below the current node. * * @return The context node of the step. */	TokenNameCOMMENT_JAVADOC	 The root node of the TreeWalker, as specified in setRoot(int root). Note that this may actually be below the current node. * @return The context node of the step. 
public	TokenNamepublic	
int	TokenNameint	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_root	TokenNameIdentifier	 m root
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
axis	TokenNameIdentifier	 axis
=	TokenNameEQUAL	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bit	TokenNameIdentifier	 bit
=	TokenNameEQUAL	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
getAnalysisBitFromAxes	TokenNameIdentifier	 get Analysis Bit From Axes
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bit	TokenNameIdentifier	 bit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the root node of the TreeWalker. * (Not part of the DOM2 TreeWalker interface). * * @param root The context node of this step. */	TokenNameCOMMENT_JAVADOC	 Set the root node of the TreeWalker. (Not part of the DOM2 TreeWalker interface). * @param root The context node of this step. 
public	TokenNamepublic	
void	TokenNamevoid	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
int	TokenNameint	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %OPT% Get this directly from the lpi. 	TokenNameCOMMENT_LINE	%OPT% Get this directly from the lpi. 
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
wi	TokenNameIdentifier	 wi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_dtm	TokenNameIdentifier	 m dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_traverser	TokenNameIdentifier	 m traverser
=	TokenNameEQUAL	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getAxisTraverser	TokenNameIdentifier	 get Axis Traverser
(	TokenNameLPAREN	
m_axis	TokenNameIdentifier	 m axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_isFresh	TokenNameIdentifier	 m is Fresh
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_foundLast	TokenNameIdentifier	 m found Last
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_root	TokenNameIdentifier	 m root
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
m_currentNode	TokenNameIdentifier	 m current Node
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_SETTING_WALKER_ROOT_TO_NULL	TokenNameIdentifier	 ER  SETTING  WALKER  ROOT  TO  NULL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"\n !!!! Error! Setting the root of a walker to null!!!"); 	TokenNameCOMMENT_LINE	"\n !!!! Error! Setting the root of a walker to null!!!"); 
}	TokenNameRBRACE	
resetProximityPositions	TokenNameIdentifier	 reset Proximity Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The node at which the TreeWalker is currently positioned. * <br> The value must not be null. Alterations to the DOM tree may cause * the current node to no longer be accepted by the TreeWalker's * associated filter. currentNode may also be explicitly set to any node, * whether or not it is within the subtree specified by the root node or * would be accepted by the filter and whatToShow flags. Further * traversal occurs relative to currentNode even if it is not part of the * current view by applying the filters in the requested direction (not * changing currentNode where no traversal is possible). * * @return The node at which the TreeWalker is currently positioned, only null * if setRoot has not yet been called. */	TokenNameCOMMENT_JAVADOC	 The node at which the TreeWalker is currently positioned. <br> The value must not be null. Alterations to the DOM tree may cause the current node to no longer be accepted by the TreeWalker's associated filter. currentNode may also be explicitly set to any node, whether or not it is within the subtree specified by the root node or would be accepted by the filter and whatToShow flags. Further traversal occurs relative to currentNode even if it is not part of the current view by applying the filters in the requested direction (not changing currentNode where no traversal is possible). * @return The node at which the TreeWalker is currently positioned, only null if setRoot has not yet been called. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_currentNode	TokenNameIdentifier	 m current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the next walker in the location step chain. * * * @param walker Reference to AxesWalker derivative, or may be null. */	TokenNameCOMMENT_JAVADOC	 Set the next walker in the location step chain. * @param walker Reference to AxesWalker derivative, or may be null. 
public	TokenNamepublic	
void	TokenNamevoid	
setNextWalker	TokenNameIdentifier	 set Next Walker
(	TokenNameLPAREN	
AxesWalker	TokenNameIdentifier	 Axes Walker
walker	TokenNameIdentifier	 walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_nextWalker	TokenNameIdentifier	 m next Walker
=	TokenNameEQUAL	
walker	TokenNameIdentifier	 walker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next walker in the location step chain. * * * @return Reference to AxesWalker derivative, or null. */	TokenNameCOMMENT_JAVADOC	 Get the next walker in the location step chain. * @return Reference to AxesWalker derivative, or null. 
public	TokenNamepublic	
AxesWalker	TokenNameIdentifier	 Axes Walker
getNextWalker	TokenNameIdentifier	 get Next Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_nextWalker	TokenNameIdentifier	 m next Walker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set or clear the previous walker reference in the location step chain. * * * @param walker Reference to previous walker reference in the location * step chain, or null. */	TokenNameCOMMENT_JAVADOC	 Set or clear the previous walker reference in the location step chain. * @param walker Reference to previous walker reference in the location step chain, or null. 
public	TokenNamepublic	
void	TokenNamevoid	
setPrevWalker	TokenNameIdentifier	 set Prev Walker
(	TokenNameLPAREN	
AxesWalker	TokenNameIdentifier	 Axes Walker
walker	TokenNameIdentifier	 walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prevWalker	TokenNameIdentifier	 m prev Walker
=	TokenNameEQUAL	
walker	TokenNameIdentifier	 walker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the previous walker reference in the location step chain. * * * @return Reference to previous walker reference in the location * step chain, or null. */	TokenNameCOMMENT_JAVADOC	 Get the previous walker reference in the location step chain. * @return Reference to previous walker reference in the location step chain, or null. 
public	TokenNamepublic	
AxesWalker	TokenNameIdentifier	 Axes Walker
getPrevWalker	TokenNameIdentifier	 get Prev Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_prevWalker	TokenNameIdentifier	 m prev Walker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is simply a way to bottle-neck the return of the next node, for * diagnostic purposes. * * @param n Node to return, or null. * * @return The argument. */	TokenNameCOMMENT_JAVADOC	 This is simply a way to bottle-neck the return of the next node, for diagnostic purposes. * @param n Node to return, or null. * @return The argument. 
private	TokenNameprivate	
int	TokenNameint	
returnNextNode	TokenNameIdentifier	 return Next Node
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in document order on the axes. * * @return the next node in document order on the axes, or null. */	TokenNameCOMMENT_JAVADOC	 Get the next node in document order on the axes. * @return the next node in document order on the axes, or null. 
protected	TokenNameprotected	
int	TokenNameint	
getNextNode	TokenNameIdentifier	 get Next Node
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
if	TokenNameif	
(	TokenNameLPAREN	
m_isFresh	TokenNameIdentifier	 m is Fresh
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentNode	TokenNameIdentifier	 m current Node
=	TokenNameEQUAL	
m_traverser	TokenNameIdentifier	 m traverser
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
m_root	TokenNameIdentifier	 m root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_isFresh	TokenNameIdentifier	 m is Fresh
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// I shouldn't have to do this the check for current node, I think. 	TokenNameCOMMENT_LINE	I shouldn't have to do this the check for current node, I think. 
// numbering\numbering24.xsl fails if I don't do this. I think 	TokenNameCOMMENT_LINE	numbering\numbering24.xsl fails if I don't do this. I think 
// it occurs as the walkers are backing up. -sb 	TokenNameCOMMENT_LINE	it occurs as the walkers are backing up. -sb 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
m_currentNode	TokenNameIdentifier	 m current Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentNode	TokenNameIdentifier	 m current Node
=	TokenNameEQUAL	
m_traverser	TokenNameIdentifier	 m traverser
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
m_root	TokenNameIdentifier	 m root
,	TokenNameCOMMA	
m_currentNode	TokenNameIdentifier	 m current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
m_currentNode	TokenNameIdentifier	 m current Node
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_foundLast	TokenNameIdentifier	 m found Last
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_currentNode	TokenNameIdentifier	 m current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Moves the <code>TreeWalker</code> to the next visible node in document * order relative to the current node, and returns the new node. If the * current node has no next node, or if the search for nextNode attempts * to step upward from the TreeWalker's root node, returns * <code>null</code> , and retains the current node. * @return The new node, or <code>null</code> if the current node has no * next node in the TreeWalker's logical view. */	TokenNameCOMMENT_JAVADOC	 Moves the <code>TreeWalker</code> to the next visible node in document order relative to the current node, and returns the new node. If the current node has no next node, or if the search for nextNode attempts to step upward from the TreeWalker's root node, returns <code>null</code> , and retains the current node. @return The new node, or <code>null</code> if the current node has no next node in the TreeWalker's logical view. 
public	TokenNamepublic	
int	TokenNameint	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
AxesWalker	TokenNameIdentifier	 Axes Walker
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
wi	TokenNameIdentifier	 wi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLastUsedWalker	TokenNameIdentifier	 get Last Used Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
walker	TokenNameIdentifier	 walker
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
getNextNode	TokenNameIdentifier	 get Next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
m_prevWalker	TokenNameIdentifier	 m prev Walker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
m_nextWalker	TokenNameIdentifier	 m next Walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wi	TokenNameIdentifier	 wi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLastUsedWalker	TokenNameIdentifier	 set Last Used Walker
(	TokenNameLPAREN	
walker	TokenNameIdentifier	 walker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return walker.returnNextNode(nextNode); 	TokenNameCOMMENT_LINE	return walker.returnNextNode(nextNode); 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
AxesWalker	TokenNameIdentifier	 Axes Walker
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
walker	TokenNameIdentifier	 walker
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
m_nextWalker	TokenNameIdentifier	 m next Walker
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
m_prevWalker	TokenNameIdentifier	 m prev Walker
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if(null != nextNode) 	TokenNameCOMMENT_LINE	if(null != nextNode) 
}	TokenNameRBRACE	
// while(null != walker) 	TokenNameCOMMENT_LINE	while(null != walker) 
return	TokenNamereturn	
nextNode	TokenNameIdentifier	 next Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//============= End TreeWalker Implementation ============= 	TokenNameCOMMENT_LINE	============= End TreeWalker Implementation ============= 
/** * Get the index of the last node that can be itterated to. * * * @param xctxt XPath runtime context. * * @return the index of the last node that can be itterated to. */	TokenNameCOMMENT_JAVADOC	 Get the index of the last node that can be itterated to. * @param xctxt XPath runtime context. * @return the index of the last node that can be itterated to. 
public	TokenNamepublic	
int	TokenNameint	
getLastPos	TokenNameIdentifier	 get Last Pos
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AxesWalker	TokenNameIdentifier	 Axes Walker
walker	TokenNameIdentifier	 walker
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AxesWalker	TokenNameIdentifier	 Axes Walker
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
setPredicateCount	TokenNameIdentifier	 set Predicate Count
(	TokenNameLPAREN	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
setNextWalker	TokenNameIdentifier	 set Next Walker
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
setPrevWalker	TokenNameIdentifier	 set Prev Walker
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
lpi	TokenNameIdentifier	 lpi
=	TokenNameEQUAL	
wi	TokenNameIdentifier	 wi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AxesWalker	TokenNameIdentifier	 Axes Walker
savedWalker	TokenNameIdentifier	 saved Walker
=	TokenNameEQUAL	
lpi	TokenNameIdentifier	 lpi
.	TokenNameDOT	
getLastUsedWalker	TokenNameIdentifier	 get Last Used Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
lpi	TokenNameIdentifier	 lpi
.	TokenNameDOT	
setLastUsedWalker	TokenNameIdentifier	 set Last Used Walker
(	TokenNameLPAREN	
walker	TokenNameIdentifier	 walker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: Should probably save this in the iterator. 	TokenNameCOMMENT_LINE	TODO: Should probably save this in the iterator. 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
lpi	TokenNameIdentifier	 lpi
.	TokenNameDOT	
setLastUsedWalker	TokenNameIdentifier	 set Last Used Walker
(	TokenNameLPAREN	
savedWalker	TokenNameIdentifier	 saved Walker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println("pos: "+pos); 	TokenNameCOMMENT_LINE	System.out.println("pos: "+pos); 
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//============= State Data ============= 	TokenNameCOMMENT_LINE	============= State Data ============= 
/** * The DTM for the root. This can not be used, or must be changed, * for the filter walker, or any walker that can have nodes * from multiple documents. * Never, ever, access this value without going through getDTM(int node). */	TokenNameCOMMENT_JAVADOC	 The DTM for the root. This can not be used, or must be changed, for the filter walker, or any walker that can have nodes from multiple documents. Never, ever, access this value without going through getDTM(int node). 
private	TokenNameprivate	
DTM	TokenNameIdentifier	 DTM
m_dtm	TokenNameIdentifier	 m dtm
;	TokenNameSEMICOLON	
/** * Set the DTM for this walker. * * @param dtm Non-null reference to a DTM. */	TokenNameCOMMENT_JAVADOC	 Set the DTM for this walker. * @param dtm Non-null reference to a DTM. 
public	TokenNamepublic	
void	TokenNamevoid	
setDefaultDTM	TokenNameIdentifier	 set Default DTM
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dtm	TokenNameIdentifier	 m dtm
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the DTM for this walker. * * @return Non-null reference to a DTM. */	TokenNameCOMMENT_JAVADOC	 Get the DTM for this walker. * @return Non-null reference to a DTM. 
public	TokenNamepublic	
DTM	TokenNameIdentifier	 DTM
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
return	TokenNamereturn	
wi	TokenNameIdentifier	 wi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if all the nodes in the iteration well be returned in document * order. * Warning: This can only be called after setRoot has been called! * * @return true as a default. */	TokenNameCOMMENT_JAVADOC	 Returns true if all the nodes in the iteration well be returned in document order. Warning: This can only be called after setRoot has been called! * @return true as a default. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDocOrdered	TokenNameIdentifier	 is Doc Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the axis being iterated, if it is known. * * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple * types. */	TokenNameCOMMENT_JAVADOC	 Returns the axis being iterated, if it is known. * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple types. 
public	TokenNamepublic	
int	TokenNameint	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_axis	TokenNameIdentifier	 m axis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This will traverse the heararchy, calling the visitor for * each member. If the called visitor method returns * false, the subtree should not be called. * * @param owner The owner of the visitor, where that path may be * rewritten if needed. * @param visitor The visitor whose appropriate method will be called. */	TokenNameCOMMENT_JAVADOC	 This will traverse the heararchy, calling the visitor for each member. If the called visitor method returns false, the subtree should not be called. * @param owner The owner of the visitor, where that path may be rewritten if needed. @param visitor The visitor whose appropriate method will be called. 
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
visitStep	TokenNameIdentifier	 visit Step
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
callPredicateVisitors	TokenNameIdentifier	 call Predicate Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_nextWalker	TokenNameIdentifier	 m next Walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_nextWalker	TokenNameIdentifier	 m next Walker
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see ExpressionOwner#getExpression() */	TokenNameCOMMENT_JAVADOC	 @see ExpressionOwner#getExpression() 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_nextWalker	TokenNameIdentifier	 m next Walker
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
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nextWalker	TokenNameIdentifier	 m next Walker
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AxesWalker	TokenNameIdentifier	 Axes Walker
)	TokenNameRPAREN	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
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
AxesWalker	TokenNameIdentifier	 Axes Walker
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AxesWalker	TokenNameIdentifier	 Axes Walker
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_axis	TokenNameIdentifier	 m axis
!=	TokenNameNOT_EQUAL	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
m_axis	TokenNameIdentifier	 m axis
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The root node of the TreeWalker, as specified when it was created. */	TokenNameCOMMENT_JAVADOC	 The root node of the TreeWalker, as specified when it was created. 
transient	TokenNametransient	
int	TokenNameint	
m_root	TokenNameIdentifier	 m root
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** * The node at which the TreeWalker is currently positioned. */	TokenNameCOMMENT_JAVADOC	 The node at which the TreeWalker is currently positioned. 
private	TokenNameprivate	
transient	TokenNametransient	
int	TokenNameint	
m_currentNode	TokenNameIdentifier	 m current Node
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** True if an itteration has not begun. */	TokenNameCOMMENT_JAVADOC	 True if an itteration has not begun. 
transient	TokenNametransient	
boolean	TokenNameboolean	
m_isFresh	TokenNameIdentifier	 m is Fresh
;	TokenNameSEMICOLON	
/** The next walker in the location step chain. * @serial */	TokenNameCOMMENT_JAVADOC	 The next walker in the location step chain. @serial 
protected	TokenNameprotected	
AxesWalker	TokenNameIdentifier	 Axes Walker
m_nextWalker	TokenNameIdentifier	 m next Walker
;	TokenNameSEMICOLON	
/** The previous walker in the location step chain, or null. * @serial */	TokenNameCOMMENT_JAVADOC	 The previous walker in the location step chain, or null. @serial 
AxesWalker	TokenNameIdentifier	 Axes Walker
m_prevWalker	TokenNameIdentifier	 m prev Walker
;	TokenNameSEMICOLON	
/** The traversal axis from where the nodes will be filtered. */	TokenNameCOMMENT_JAVADOC	 The traversal axis from where the nodes will be filtered. 
protected	TokenNameprotected	
int	TokenNameint	
m_axis	TokenNameIdentifier	 m axis
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The DTM inner traversal class, that corresponds to the super axis. */	TokenNameCOMMENT_JAVADOC	 The DTM inner traversal class, that corresponds to the super axis. 
protected	TokenNameprotected	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
m_traverser	TokenNameIdentifier	 m traverser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
