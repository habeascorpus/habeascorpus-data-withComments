/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: StepPattern.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: StepPattern.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
patterns	TokenNameIdentifier	 patterns
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
DTMFilter	TokenNameIdentifier	 DTM Filter
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
axes	TokenNameIdentifier	 axes
.	TokenNameDOT	
SubContextList	TokenNameIdentifier	 Sub Context List
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
PsuedoNames	TokenNameIdentifier	 Psuedo Names
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
/** * This class represents a single pattern match step. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 This class represents a single pattern match step. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
StepPattern	TokenNameIdentifier	 Step Pattern
extends	TokenNameextends	
NodeTest	TokenNameIdentifier	 Node Test
implements	TokenNameimplements	
SubContextList	TokenNameIdentifier	 Sub Context List
,	TokenNameCOMMA	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
9071668960168152644L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** The axis for this test. */	TokenNameCOMMENT_JAVADOC	 The axis for this test. 
protected	TokenNameprotected	
int	TokenNameint	
m_axis	TokenNameIdentifier	 m axis
;	TokenNameSEMICOLON	
/** * Construct a StepPattern that tests for namespaces and node names. * * * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}. * @param namespace The namespace to be tested. * @param name The local name to be tested. * @param axis The Axis for this test, one of of Axes.ANCESTORORSELF, etc. * @param axisForPredicate No longer used. */	TokenNameCOMMENT_JAVADOC	 Construct a StepPattern that tests for namespaces and node names. * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}. @param namespace The namespace to be tested. @param name The local name to be tested. @param axis The Axis for this test, one of of Axes.ANCESTORORSELF, etc. @param axisForPredicate No longer used. 
public	TokenNamepublic	
StepPattern	TokenNameIdentifier	 Step Pattern
(	TokenNameLPAREN	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
,	TokenNameCOMMA	
int	TokenNameint	
axisForPredicate	TokenNameIdentifier	 axis For Predicate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
,	TokenNameCOMMA	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axis	TokenNameIdentifier	 m axis
=	TokenNameEQUAL	
axis	TokenNameIdentifier	 axis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a StepPattern that doesn't test for node names. * * * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}. * @param axis The Axis for this test, one of of Axes.ANCESTORORSELF, etc. * @param axisForPredicate No longer used. */	TokenNameCOMMENT_JAVADOC	 Construct a StepPattern that doesn't test for node names. * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}. @param axis The Axis for this test, one of of Axes.ANCESTORORSELF, etc. @param axisForPredicate No longer used. 
public	TokenNamepublic	
StepPattern	TokenNameIdentifier	 Step Pattern
(	TokenNameLPAREN	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
,	TokenNameCOMMA	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
,	TokenNameCOMMA	
int	TokenNameint	
axisForPredicate	TokenNameIdentifier	 axis For Predicate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axis	TokenNameIdentifier	 m axis
=	TokenNameEQUAL	
axis	TokenNameIdentifier	 axis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The target local name or psuedo name, for hash table lookup optimization. * @serial */	TokenNameCOMMENT_JAVADOC	 The target local name or psuedo name, for hash table lookup optimization. @serial 
String	TokenNameIdentifier	 String
m_targetString	TokenNameIdentifier	 m target String
;	TokenNameSEMICOLON	
// only calculate on head 	TokenNameCOMMENT_LINE	only calculate on head 
/** * Calculate the local name or psuedo name of the node that this pattern will test, * for hash table lookup optimization. * * @see org.apache.xpath.compiler.PsuedoNames */	TokenNameCOMMENT_JAVADOC	 Calculate the local name or psuedo name of the node that this pattern will test, for hash table lookup optimization. * @see org.apache.xpath.compiler.PsuedoNames 
public	TokenNamepublic	
void	TokenNamevoid	
calcTargetString	TokenNameIdentifier	 calc Target String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
=	TokenNameEQUAL	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_COMMENT	TokenNameIdentifier	 SHOW  COMMENT
:	TokenNameCOLON	
m_targetString	TokenNameIdentifier	 m target String
=	TokenNameEQUAL	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
.	TokenNameDOT	
PSEUDONAME_COMMENT	TokenNameIdentifier	 PSEUDONAME  COMMENT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_TEXT	TokenNameIdentifier	 SHOW  TEXT
:	TokenNameCOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_CDATA_SECTION	TokenNameIdentifier	 SHOW  CDATA  SECTION
:	TokenNameCOLON	
case	TokenNamecase	
(	TokenNameLPAREN	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_TEXT	TokenNameIdentifier	 SHOW  TEXT
|	TokenNameOR	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_CDATA_SECTION	TokenNameIdentifier	 SHOW  CDATA  SECTION
)	TokenNameRPAREN	
:	TokenNameCOLON	
m_targetString	TokenNameIdentifier	 m target String
=	TokenNameEQUAL	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
.	TokenNameDOT	
PSEUDONAME_TEXT	TokenNameIdentifier	 PSEUDONAME  TEXT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
:	TokenNameCOLON	
m_targetString	TokenNameIdentifier	 m target String
=	TokenNameEQUAL	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
.	TokenNameDOT	
PSEUDONAME_ANY	TokenNameIdentifier	 PSEUDONAME  ANY
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_DOCUMENT	TokenNameIdentifier	 SHOW  DOCUMENT
:	TokenNameCOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_DOCUMENT	TokenNameIdentifier	 SHOW  DOCUMENT
|	TokenNameOR	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_DOCUMENT_FRAGMENT	TokenNameIdentifier	 SHOW  DOCUMENT  FRAGMENT
:	TokenNameCOLON	
m_targetString	TokenNameIdentifier	 m target String
=	TokenNameEQUAL	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
.	TokenNameDOT	
PSEUDONAME_ROOT	TokenNameIdentifier	 PSEUDONAME  ROOT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ELEMENT	TokenNameIdentifier	 SHOW  ELEMENT
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
WILD	TokenNameIdentifier	 WILD
==	TokenNameEQUAL_EQUAL	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
m_targetString	TokenNameIdentifier	 m target String
=	TokenNameEQUAL	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
.	TokenNameDOT	
PSEUDONAME_ANY	TokenNameIdentifier	 PSEUDONAME  ANY
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_targetString	TokenNameIdentifier	 m target String
=	TokenNameEQUAL	
m_name	TokenNameIdentifier	 m name
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
m_targetString	TokenNameIdentifier	 m target String
=	TokenNameEQUAL	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
.	TokenNameDOT	
PSEUDONAME_ANY	TokenNameIdentifier	 PSEUDONAME  ANY
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the local name or psuedo name of the node that this pattern will test, * for hash table lookup optimization. * * * @return local name or psuedo name of the node. * @see org.apache.xpath.compiler.PsuedoNames */	TokenNameCOMMENT_JAVADOC	 Get the local name or psuedo name of the node that this pattern will test, for hash table lookup optimization. * @return local name or psuedo name of the node. @see org.apache.xpath.compiler.PsuedoNames 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTargetString	TokenNameIdentifier	 get Target String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_targetString	TokenNameIdentifier	 m target String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reference to nodetest and predicate for * parent or ancestor. * @serial */	TokenNameCOMMENT_JAVADOC	 Reference to nodetest and predicate for parent or ancestor. @serial 
StepPattern	TokenNameIdentifier	 Step Pattern
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
;	TokenNameSEMICOLON	
/** * This function is used to fixup variables from QNames to stack frame * indexes at stylesheet build time. * @param vars List of QNames that correspond to variables. This list * should be searched backwards for the first qualified name that * corresponds to the variable reference qname. The position of the * QName in the vector from the start of the vector will be its position * in the stack frame (but variables above the globalsTop value will need * to be offset to the current stack frame). * @param globalsSize The number of variables in the global variable area. */	TokenNameCOMMENT_JAVADOC	 This function is used to fixup variables from QNames to stack frame indexes at stylesheet build time. @param vars List of QNames that correspond to variables. This list should be searched backwards for the first qualified name that corresponds to the variable reference qname. The position of the QName in the vector from the start of the vector will be its position in the stack frame (but variables above the globalsTop value will need to be offset to the current stack frame). @param globalsSize The number of variables in the global variable area. 
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
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_predicates	TokenNameIdentifier	 m predicates
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
m_predicates	TokenNameIdentifier	 m predicates
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_predicates	TokenNameIdentifier	 m predicates
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
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
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
/** * Set the reference to nodetest and predicate for * parent or ancestor. * * * @param expr The relative pattern expression. */	TokenNameCOMMENT_JAVADOC	 Set the reference to nodetest and predicate for parent or ancestor. * @param expr The relative pattern expression. 
public	TokenNamepublic	
void	TokenNamevoid	
setRelativePathPattern	TokenNameIdentifier	 set Relative Path Pattern
(	TokenNameLPAREN	
StepPattern	TokenNameIdentifier	 Step Pattern
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
=	TokenNameEQUAL	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calcScore	TokenNameIdentifier	 calc Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the reference to nodetest and predicate for * parent or ancestor. * * * @return The relative pattern expression. */	TokenNameCOMMENT_JAVADOC	 Get the reference to nodetest and predicate for parent or ancestor. * @return The relative pattern expression. 
public	TokenNamepublic	
StepPattern	TokenNameIdentifier	 Step Pattern
getRelativePathPattern	TokenNameIdentifier	 get Relative Path Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Set the list of predicate expressions for this pattern step. 	TokenNameCOMMENT_LINE	* Set the list of predicate expressions for this pattern step. 
// * @param predicates List of expression objects. 	TokenNameCOMMENT_LINE	* @param predicates List of expression objects. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public void setPredicates(Expression[] predicates) 	TokenNameCOMMENT_LINE	public void setPredicates(Expression[] predicates) 
// { 	TokenNameCOMMENT_LINE	{ 
// m_predicates = predicates; 	TokenNameCOMMENT_LINE	m_predicates = predicates; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Set the list of predicate expressions for this pattern step. * @return List of expression objects. */	TokenNameCOMMENT_JAVADOC	 Set the list of predicate expressions for this pattern step. @return List of expression objects. 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPredicates	TokenNameIdentifier	 get Predicates
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_predicates	TokenNameIdentifier	 m predicates
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The list of predicate expressions for this pattern step. * @serial */	TokenNameCOMMENT_JAVADOC	 The list of predicate expressions for this pattern step. @serial 
Expression	TokenNameIdentifier	 Expression
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_predicates	TokenNameIdentifier	 m predicates
;	TokenNameSEMICOLON	
/** * Tell if this expression or it's subexpressions can traverse outside * the current subtree. * * NOTE: Ancestors tests with predicates are problematic, and will require * special treatment. * * @return true if traversal outside the context node's subtree can occur. */	TokenNameCOMMENT_JAVADOC	 Tell if this expression or it's subexpressions can traverse outside the current subtree. * NOTE: Ancestors tests with predicates are problematic, and will require special treatment. * @return true if traversal outside the context node's subtree can occur. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getPredicateCount	TokenNameIdentifier	 get Predicate Count
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
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getPredicate	TokenNameIdentifier	 get Predicate
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
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
/** * Get a predicate expression. * * * @param i The index of the predicate. * * @return A predicate expression. */	TokenNameCOMMENT_JAVADOC	 Get a predicate expression. * @param i The index of the predicate. * @return A predicate expression. 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getPredicate	TokenNameIdentifier	 get Predicate
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of predicates for this match pattern step. * * * @return the number of predicates for this match pattern step. */	TokenNameCOMMENT_JAVADOC	 Get the number of predicates for this match pattern step. * @return the number of predicates for this match pattern step. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getPredicateCount	TokenNameIdentifier	 get Predicate Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_predicates	TokenNameIdentifier	 m predicates
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
m_predicates	TokenNameIdentifier	 m predicates
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the predicates for this match pattern step. * * * @param predicates An array of expressions that define predicates * for this step. */	TokenNameCOMMENT_JAVADOC	 Set the predicates for this match pattern step. * @param predicates An array of expressions that define predicates for this step. 
public	TokenNamepublic	
void	TokenNamevoid	
setPredicates	TokenNameIdentifier	 set Predicates
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
predicates	TokenNameIdentifier	 predicates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_predicates	TokenNameIdentifier	 m predicates
=	TokenNameEQUAL	
predicates	TokenNameIdentifier	 predicates
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
predicates	TokenNameIdentifier	 predicates
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
predicates	TokenNameIdentifier	 predicates
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
predicates	TokenNameIdentifier	 predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
calcScore	TokenNameIdentifier	 calc Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Static calc of match score. */	TokenNameCOMMENT_JAVADOC	 Static calc of match score. 
public	TokenNamepublic	
void	TokenNamevoid	
calcScore	TokenNameIdentifier	 calc Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
getPredicateCount	TokenNameIdentifier	 get Predicate Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_score	TokenNameIdentifier	 m score
=	TokenNameEQUAL	
SCORE_OTHER	TokenNameIdentifier	 SCORE  OTHER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
super	TokenNamesuper	
.	TokenNameDOT	
calcScore	TokenNameIdentifier	 calc Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_targetString	TokenNameIdentifier	 m target String
)	TokenNameRPAREN	
calcTargetString	TokenNameIdentifier	 calc Target String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute this pattern step, including predicates. * * * @param xctxt XPath runtime context. * @param currentNode The current node context. * * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or * {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute this pattern step, including predicates. * @param xctxt XPath runtime context. @param currentNode The current node context. * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
currentNode	TokenNameIdentifier	 current Node
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
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
expType	TokenNameIdentifier	 exp Type
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
expType	TokenNameIdentifier	 exp Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute this pattern step, including predicates. * * * @param xctxt XPath runtime context. * * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or * {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute this pattern step, including predicates. * @param xctxt XPath runtime context. * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
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
return	TokenNamereturn	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute an expression in the XPath runtime context, and return the * result of the expression. * * * @param xctxt The XPath runtime context. * @param currentNode The currentNode. * @param dtm The DTM of the current node. * @param expType The expanded type ID of the current node. * * @return The result of the expression in the form of a <code>XObject</code>. * * @throws javax.xml.transform.TransformerException if a runtime exception * occurs. */	TokenNameCOMMENT_JAVADOC	 Execute an expression in the XPath runtime context, and return the result of the expression. * @param xctxt The XPath runtime context. @param currentNode The currentNode. @param dtm The DTM of the current node. @param expType The expanded type ID of the current node. * @return The result of the expression in the form of a <code>XObject</code>. * @throws javax.xml.transform.TransformerException if a runtime exception occurs. 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
currentNode	TokenNameIdentifier	 current Node
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
int	TokenNameint	
expType	TokenNameIdentifier	 exp Type
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
if	TokenNameif	
(	TokenNameLPAREN	
m_whatToShow	TokenNameIdentifier	 m what To Show
==	TokenNameEQUAL_EQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SHOW_BYFUNCTION	TokenNameIdentifier	 SHOW  BYFUNCTION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XObject	TokenNameIdentifier	 X Object
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
expType	TokenNameIdentifier	 exp Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
==	TokenNameEQUAL_EQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
)	TokenNameRPAREN	
return	TokenNamereturn	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getPredicateCount	TokenNameIdentifier	 get Predicate Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
executePredicates	TokenNameIdentifier	 execute Predicates
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
)	TokenNameRPAREN	
return	TokenNamereturn	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
.	TokenNameDOT	
executeRelativePathPattern	TokenNameIdentifier	 execute Relative Path Pattern
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * New Method to check whether the current node satisfies a position predicate * * @param xctxt The XPath runtime context. * @param predPos Which predicate we're evaluating of foo[1][2][3]. * @param dtm The DTM of the current node. * @param context The currentNode. * @param pos The position being requested, i.e. the value returned by * m_predicates[predPos].execute(xctxt). * * @return true of the position of the context matches pos, false otherwise. */	TokenNameCOMMENT_JAVADOC	 New Method to check whether the current node satisfies a position predicate * @param xctxt The XPath runtime context. @param predPos Which predicate we're evaluating of foo[1][2][3]. @param dtm The DTM of the current node. @param context The currentNode. @param pos The position being requested, i.e. the value returned by m_predicates[predPos].execute(xctxt). * @return true of the position of the context matches pos, false otherwise. 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
checkProximityPosition	TokenNameIdentifier	 check Proximity Position
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
predPos	TokenNameIdentifier	 pred Pos
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getAxisTraverser	TokenNameIdentifier	 get Axis Traverser
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
PRECEDINGSIBLING	TokenNameIdentifier	 PRECEDINGSIBLING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
traverser	TokenNameIdentifier	 traverser
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
traverser	TokenNameIdentifier	 traverser
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
!=	TokenNameNOT_EQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
pass	TokenNameIdentifier	 pass
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushSubContextList	TokenNameIdentifier	 push Sub Context List
(	TokenNameLPAREN	
this	TokenNamethis	
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
predPos	TokenNameIdentifier	 pred Pos
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushPredicatePos	TokenNameIdentifier	 push Predicate Pos
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
pred	TokenNameIdentifier	 pred
=	TokenNameEQUAL	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NUMBER	TokenNameIdentifier	 CLASS  NUMBER
==	TokenNameEQUAL_EQUAL	
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"Why: Should never have been called"	TokenNameStringLiteral	Why: Should never have been called
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
boolWithSideEffects	TokenNameIdentifier	 bool With Side Effects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pass	TokenNameIdentifier	 pass
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popPredicatePos	TokenNameIdentifier	 pop Predicate Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popSubContextList	TokenNameIdentifier	 pop Sub Context List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pass	TokenNameIdentifier	 pass
)	TokenNameRPAREN	
pos	TokenNameIdentifier	 pos
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// TODO: should keep throw sax exception... 	TokenNameCOMMENT_LINE	TODO: should keep throw sax exception... 
throw	TokenNamethrow	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
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
return	TokenNamereturn	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the proximity position index of the current node based on this * node test. * * * @param xctxt XPath runtime context. * @param predPos Which predicate we're evaluating of foo[1][2][3]. * @param findLast If true, don't terminate when the context node is found. * * @return the proximity position index of the current node based on the * node test. */	TokenNameCOMMENT_JAVADOC	 Get the proximity position index of the current node based on this node test. * @param xctxt XPath runtime context. @param predPos Which predicate we're evaluating of foo[1][2][3]. @param findLast If true, don't terminate when the context node is found. * @return the proximity position index of the current node based on the node test. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
predPos	TokenNameIdentifier	 pred Pos
,	TokenNameCOMMA	
boolean	TokenNameboolean	
findLast	TokenNameIdentifier	 find Last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getAxisTraverser	TokenNameIdentifier	 get Axis Traverser
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
CHILD	TokenNameIdentifier	 CHILD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
traverser	TokenNameIdentifier	 traverser
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
traverser	TokenNameIdentifier	 traverser
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
!=	TokenNameNOT_EQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
pass	TokenNameIdentifier	 pass
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushSubContextList	TokenNameIdentifier	 push Sub Context List
(	TokenNameLPAREN	
this	TokenNamethis	
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
predPos	TokenNameIdentifier	 pred Pos
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushPredicatePos	TokenNameIdentifier	 push Predicate Pos
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
pred	TokenNameIdentifier	 pred
=	TokenNameEQUAL	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NUMBER	TokenNameIdentifier	 CLASS  NUMBER
==	TokenNameEQUAL_EQUAL	
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
numWithSideEffects	TokenNameIdentifier	 num With Side Effects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pass	TokenNameIdentifier	 pass
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
boolWithSideEffects	TokenNameIdentifier	 bool With Side Effects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pass	TokenNameIdentifier	 pass
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popPredicatePos	TokenNameIdentifier	 pop Predicate Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popSubContextList	TokenNameIdentifier	 pop Sub Context List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pass	TokenNameIdentifier	 pass
)	TokenNameRPAREN	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
findLast	TokenNameIdentifier	 find Last
&&	TokenNameAND_AND	
child	TokenNameIdentifier	 child
==	TokenNameEQUAL_EQUAL	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
// TODO: should keep throw sax exception... 	TokenNameCOMMENT_LINE	TODO: should keep throw sax exception... 
throw	TokenNamethrow	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
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
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the proximity position index of the current node based on this * node test. * * * @param xctxt XPath runtime context. * * @return the proximity position index of the current node based on the * node test. */	TokenNameCOMMENT_JAVADOC	 Get the proximity position index of the current node based on this node test. * @param xctxt XPath runtime context. * @return the proximity position index of the current node based on the node test. 
public	TokenNamepublic	
int	TokenNameint	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getPredicatePos	TokenNameIdentifier	 get Predicate Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the count of the nodes that match the test, which is the proximity * position of the last node that can pass this test in the sub context * selection. In XSLT 1-based indexing, this count is the index of the last * node. * * * @param xctxt XPath runtime context. * * @return the count of the nodes that match the test. */	TokenNameCOMMENT_JAVADOC	 Get the count of the nodes that match the test, which is the proximity position of the last node that can pass this test in the sub context selection. In XSLT 1-based indexing, this count is the index of the last node. * @param xctxt XPath runtime context. * @return the count of the nodes that match the test. 
public	TokenNamepublic	
int	TokenNameint	
getLastPos	TokenNameIdentifier	 get Last Pos
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getPredicatePos	TokenNameIdentifier	 get Predicate Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the match pattern step relative to another step. * * * @param xctxt The XPath runtime context. * @param dtm The DTM of the current node. * @param currentNode The current node context. * * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or * {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the match pattern step relative to another step. * @param xctxt The XPath runtime context. @param dtm The DTM of the current node. @param currentNode The current node context. * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
final	TokenNamefinal	
XObject	TokenNameIdentifier	 X Object
executeRelativePathPattern	TokenNameIdentifier	 execute Relative Path Pattern
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
int	TokenNameint	
currentNode	TokenNameIdentifier	 current Node
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
XObject	TokenNameIdentifier	 X Object
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
;	TokenNameSEMICOLON	
int	TokenNameint	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
traverser	TokenNameIdentifier	 traverser
;	TokenNameSEMICOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getAxisTraverser	TokenNameIdentifier	 get Axis Traverser
(	TokenNameLPAREN	
m_axis	TokenNameIdentifier	 m axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
relative	TokenNameIdentifier	 relative
=	TokenNameEQUAL	
traverser	TokenNameIdentifier	 traverser
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
relative	TokenNameIdentifier	 relative
;	TokenNameSEMICOLON	
relative	TokenNameIdentifier	 relative
=	TokenNameEQUAL	
traverser	TokenNameIdentifier	 traverser
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
relative	TokenNameIdentifier	 relative
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
relative	TokenNameIdentifier	 relative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
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
break	TokenNamebreak	
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
}	TokenNameRBRACE	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the predicates on this step to determine if the current node * should be filtered or accepted. * * @param xctxt The XPath runtime context. * @param dtm The DTM of the current node. * @param currentNode The current node context. * * @return true if the node should be accepted, false otherwise. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the predicates on this step to determine if the current node should be filtered or accepted. * @param xctxt The XPath runtime context. @param dtm The DTM of the current node. @param currentNode The current node context. * @return true if the node should be accepted, false otherwise. * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
executePredicates	TokenNameIdentifier	 execute Predicates
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
int	TokenNameint	
currentNode	TokenNameIdentifier	 current Node
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
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
positionAlreadySeen	TokenNameIdentifier	 position Already Seen
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getPredicateCount	TokenNameIdentifier	 get Predicate Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushSubContextList	TokenNameIdentifier	 push Sub Context List
(	TokenNameLPAREN	
this	TokenNamethis	
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
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushPredicatePos	TokenNameIdentifier	 push Predicate Pos
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
pred	TokenNameIdentifier	 pred
=	TokenNameEQUAL	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NUMBER	TokenNameIdentifier	 CLASS  NUMBER
==	TokenNameEQUAL_EQUAL	
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
positionAlreadySeen	TokenNameIdentifier	 position Already Seen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
positionAlreadySeen	TokenNameIdentifier	 position Already Seen
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
checkProximityPosition	TokenNameIdentifier	 check Proximity Position
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
boolWithSideEffects	TokenNameIdentifier	 bool With Side Effects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popPredicatePos	TokenNameIdentifier	 pop Predicate Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popSubContextList	TokenNameIdentifier	 pop Sub Context List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the string represenentation of this step for diagnostic purposes. * * * @return A string representation of this step, built by reverse-engineering * the contained info. */	TokenNameCOMMENT_JAVADOC	 Get the string represenentation of this step for diagnostic purposes. * @return A string representation of this step, built by reverse-engineering the contained info. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
StepPattern	TokenNameIdentifier	 Step Pattern
pat	TokenNameIdentifier	 pat
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
pat	TokenNameIdentifier	 pat
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
pat	TokenNameIdentifier	 pat
=	TokenNameEQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
getNames	TokenNameIdentifier	 get Names
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_axis	TokenNameIdentifier	 m axis
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"::"	TokenNameStringLiteral	::
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0x000005000	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_whatToShow	TokenNameIdentifier	 m what To Show
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"doc()"	TokenNameStringLiteral	doc()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_BYFUNCTION	TokenNameIdentifier	 SHOW  BYFUNCTION
==	TokenNameEQUAL_EQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_whatToShow	TokenNameIdentifier	 m what To Show
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"function()"	TokenNameStringLiteral	function()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
==	TokenNameEQUAL_EQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_whatToShow	TokenNameIdentifier	 m what To Show
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"node()"	TokenNameStringLiteral	node()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_TEXT	TokenNameIdentifier	 SHOW  TEXT
==	TokenNameEQUAL_EQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_whatToShow	TokenNameIdentifier	 m what To Show
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"text()"	TokenNameStringLiteral	text()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_PROCESSING_INSTRUCTION	TokenNameIdentifier	 SHOW  PROCESSING  INSTRUCTION
==	TokenNameEQUAL_EQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_whatToShow	TokenNameIdentifier	 m what To Show
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"processing-instruction("	TokenNameStringLiteral	processing-instruction(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_COMMENT	TokenNameIdentifier	 SHOW  COMMENT
==	TokenNameEQUAL_EQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_whatToShow	TokenNameIdentifier	 m what To Show
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"comment()"	TokenNameStringLiteral	comment()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ATTRIBUTE	TokenNameIdentifier	 SHOW  ATTRIBUTE
==	TokenNameEQUAL_EQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_whatToShow	TokenNameIdentifier	 m what To Show
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"@"	TokenNameStringLiteral	@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_namespace	TokenNameIdentifier	 m namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_namespace	TokenNameIdentifier	 m namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ATTRIBUTE	TokenNameIdentifier	 SHOW  ATTRIBUTE
==	TokenNameEQUAL_EQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_whatToShow	TokenNameIdentifier	 m what To Show
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"@"	TokenNameStringLiteral	@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_DOCUMENT	TokenNameIdentifier	 SHOW  DOCUMENT
|	TokenNameOR	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_DOCUMENT_FRAGMENT	TokenNameIdentifier	 SHOW  DOCUMENT  FRAGMENT
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_whatToShow	TokenNameIdentifier	 m what To Show
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"doc-root()"	TokenNameStringLiteral	doc-root()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_whatToShow	TokenNameIdentifier	 m what To Show
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_predicates	TokenNameIdentifier	 m predicates
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
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_predicates	TokenNameIdentifier	 m predicates
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set to true to send diagnostics about pattern matches to the consol. */	TokenNameCOMMENT_JAVADOC	 Set to true to send diagnostics about pattern matches to the consol. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_MATCHES	TokenNameIdentifier	 DEBUG  MATCHES
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Get the match score of the given node. * * @param xctxt The XPath runtime context. * @param context The node to be tested. * * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or * {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Get the match score of the given node. * @param xctxt The XPath runtime context. @param context The node to be tested. * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
double	TokenNamedouble	
getMatchScore	TokenNameIdentifier	 get Match Score
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
context	TokenNameIdentifier	 context
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
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentExpressionNode	TokenNameIdentifier	 push Current Expression Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
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
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentExpressionNode	TokenNameIdentifier	 pop Current Expression Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return XPath.MATCH_SCORE_NONE; 	TokenNameCOMMENT_LINE	return XPath.MATCH_SCORE_NONE; 
}	TokenNameRBRACE	
/** * Set the axis that this step should follow. * * * @param axis The Axis for this test, one of of Axes.ANCESTORORSELF, etc. */	TokenNameCOMMENT_JAVADOC	 Set the axis that this step should follow. * @param axis The Axis for this test, one of of Axes.ANCESTORORSELF, etc. 
public	TokenNamepublic	
void	TokenNamevoid	
setAxis	TokenNameIdentifier	 set Axis
(	TokenNameLPAREN	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_axis	TokenNameIdentifier	 m axis
=	TokenNameEQUAL	
axis	TokenNameIdentifier	 axis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the axis that this step follows. * * * @return The Axis for this test, one of of Axes.ANCESTORORSELF, etc. */	TokenNameCOMMENT_JAVADOC	 Get the axis that this step follows. * @return The Axis for this test, one of of Axes.ANCESTORORSELF, etc. 
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
class	TokenNameclass	
PredOwner	TokenNameIdentifier	 Pred Owner
implements	TokenNameimplements	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
{	TokenNameLBRACE	
int	TokenNameint	
m_index	TokenNameIdentifier	 m index
;	TokenNameSEMICOLON	
PredOwner	TokenNameIdentifier	 Pred Owner
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
m_predicates	TokenNameIdentifier	 m predicates
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
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
StepPattern	TokenNameIdentifier	 Step Pattern
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
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
visitMatchPattern	TokenNameIdentifier	 visit Match Pattern
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
callSubtreeVisitors	TokenNameIdentifier	 call Subtree Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Call the visitors on the subtree. Factored out from callVisitors * so it may be called by derived classes. */	TokenNameCOMMENT_JAVADOC	 Call the visitors on the subtree. Factored out from callVisitors so it may be called by derived classes. 
protected	TokenNameprotected	
void	TokenNamevoid	
callSubtreeVisitors	TokenNameIdentifier	 call Subtree Visitors
(	TokenNameLPAREN	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_predicates	TokenNameIdentifier	 m predicates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_predicates	TokenNameIdentifier	 m predicates
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
ExpressionOwner	TokenNameIdentifier	 Expression Owner
predOwner	TokenNameIdentifier	 pred Owner
=	TokenNameEQUAL	
new	TokenNamenew	
PredOwner	TokenNameIdentifier	 Pred Owner
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitPredicate	TokenNameIdentifier	 visit Predicate
(	TokenNameLPAREN	
predOwner	TokenNameIdentifier	 pred Owner
,	TokenNameCOMMA	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
predOwner	TokenNameIdentifier	 pred Owner
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
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
/** * @see ExpressionOwner#getExpression() */	TokenNameCOMMENT_JAVADOC	 @see ExpressionOwner#getExpression() 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
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
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StepPattern	TokenNameIdentifier	 Step Pattern
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
StepPattern	TokenNameIdentifier	 Step Pattern
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StepPattern	TokenNameIdentifier	 Step Pattern
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_predicates	TokenNameIdentifier	 m predicates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_predicates	TokenNameIdentifier	 m predicates
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
m_predicates	TokenNameIdentifier	 m predicates
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
m_predicates	TokenNameIdentifier	 m predicates
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
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
m_predicates	TokenNameIdentifier	 m predicates
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
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
m_predicates	TokenNameIdentifier	 m predicates
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
m_relativePathPattern	TokenNameIdentifier	 m relative Path Pattern
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
