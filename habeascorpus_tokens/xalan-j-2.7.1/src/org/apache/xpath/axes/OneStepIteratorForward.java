/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: OneStepIteratorForward.java 469314 2006-10-30 23:31:59Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: OneStepIteratorForward.java 469314 2006-10-30 23:31:59Z minchau $ 
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
OpMap	TokenNameIdentifier	 Op Map
;	TokenNameSEMICOLON	
/** * This class implements a general iterator for * those LocationSteps with only one step, and perhaps a predicate, * that only go forward (i.e. it can not be used with ancestors, * preceding, etc.) * @see org.apache.xpath.axes#ChildTestIterator * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 This class implements a general iterator for those LocationSteps with only one step, and perhaps a predicate, that only go forward (i.e. it can not be used with ancestors, preceding, etc.) @see org.apache.xpath.axes#ChildTestIterator @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
OneStepIteratorForward	TokenNameIdentifier	 One Step Iterator Forward
extends	TokenNameextends	
ChildTestIterator	TokenNameIdentifier	 Child Test Iterator
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
1576936606178190566L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** The traversal axis from where the nodes will be filtered. */	TokenNameCOMMENT_JAVADOC	 The traversal axis from where the nodes will be filtered. 
protected	TokenNameprotected	
int	TokenNameint	
m_axis	TokenNameIdentifier	 m axis
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Create a OneStepIterator object. * * @param compiler A reference to the Compiler that contains the op map. * @param opPos The position within the op map, which contains the * location path expression for this itterator. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a OneStepIterator object. * @param compiler A reference to the Compiler that contains the op map. @param opPos The position within the op map, which contains the location path expression for this itterator. * @throws javax.xml.transform.TransformerException 
OneStepIteratorForward	TokenNameIdentifier	 One Step Iterator Forward
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
int	TokenNameint	
analysis	TokenNameIdentifier	 analysis
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
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
analysis	TokenNameIdentifier	 analysis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
firstStepPos	TokenNameIdentifier	 first Step Pos
=	TokenNameEQUAL	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
getFirstChildPos	TokenNameIdentifier	 get First Child Pos
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axis	TokenNameIdentifier	 m axis
=	TokenNameEQUAL	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
getAxisFromStep	TokenNameIdentifier	 get Axis From Step
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
firstStepPos	TokenNameIdentifier	 first Step Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a OneStepIterator object that will just traverse the self axes. * * @param axis One of the org.apache.xml.dtm.Axis integers. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a OneStepIterator object that will just traverse the self axes. * @param axis One of the org.apache.xml.dtm.Axis integers. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
OneStepIteratorForward	TokenNameIdentifier	 One Step Iterator Forward
(	TokenNameLPAREN	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axis	TokenNameIdentifier	 m axis
=	TokenNameEQUAL	
axis	TokenNameIdentifier	 axis
;	TokenNameSEMICOLON	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
=	TokenNameEQUAL	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
;	TokenNameSEMICOLON	
initNodeTest	TokenNameIdentifier	 init Node Test
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
)	TokenNameRPAREN	
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
m_traverser	TokenNameIdentifier	 m traverser
=	TokenNameEQUAL	
m_cdtm	TokenNameIdentifier	 m cdtm
.	TokenNameDOT	
getAxisTraverser	TokenNameIdentifier	 get Axis Traverser
(	TokenNameLPAREN	
m_axis	TokenNameIdentifier	 m axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Return the first node out of the nodeset, if this expression is 	TokenNameCOMMENT_LINE	* Return the first node out of the nodeset, if this expression is 
// * a nodeset expression. This is the default implementation for 	TokenNameCOMMENT_LINE	* a nodeset expression. This is the default implementation for 
// * nodesets. 	TokenNameCOMMENT_LINE	* nodesets. 
// * <p>WARNING: Do not mutate this class from this function!</p> 	TokenNameCOMMENT_LINE	* <p>WARNING: Do not mutate this class from this function!</p> 
// * @param xctxt The XPath runtime context. 	TokenNameCOMMENT_LINE	* @param xctxt The XPath runtime context. 
// * @return the first node out of the nodeset, or DTM.NULL. 	TokenNameCOMMENT_LINE	* @return the first node out of the nodeset, or DTM.NULL. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public int asNode(XPathContext xctxt) 	TokenNameCOMMENT_LINE	public int asNode(XPathContext xctxt) 
// throws javax.xml.transform.TransformerException 	TokenNameCOMMENT_LINE	throws javax.xml.transform.TransformerException 
// { 	TokenNameCOMMENT_LINE	{ 
// if(getPredicateCount() > 0) 	TokenNameCOMMENT_LINE	if(getPredicateCount() > 0) 
// return super.asNode(xctxt); 	TokenNameCOMMENT_LINE	return super.asNode(xctxt); 
// 	TokenNameCOMMENT_LINE	 
// int current = xctxt.getCurrentNode(); 	TokenNameCOMMENT_LINE	int current = xctxt.getCurrentNode(); 
// 	TokenNameCOMMENT_LINE	 
// DTM dtm = xctxt.getDTM(current); 	TokenNameCOMMENT_LINE	DTM dtm = xctxt.getDTM(current); 
// DTMAxisTraverser traverser = dtm.getAxisTraverser(m_axis); 	TokenNameCOMMENT_LINE	DTMAxisTraverser traverser = dtm.getAxisTraverser(m_axis); 
// 	TokenNameCOMMENT_LINE	 
// String localName = getLocalName(); 	TokenNameCOMMENT_LINE	String localName = getLocalName(); 
// String namespace = getNamespace(); 	TokenNameCOMMENT_LINE	String namespace = getNamespace(); 
// int what = m_whatToShow; 	TokenNameCOMMENT_LINE	int what = m_whatToShow; 
// 	TokenNameCOMMENT_LINE	 
// // System.out.println("what: "); 	TokenNameCOMMENT_LINE	// System.out.println("what: "); 
// // NodeTest.debugWhatToShow(what); 	TokenNameCOMMENT_LINE	// NodeTest.debugWhatToShow(what); 
// if(DTMFilter.SHOW_ALL == what 	TokenNameCOMMENT_LINE	if(DTMFilter.SHOW_ALL == what 
// || ((DTMFilter.SHOW_ELEMENT & what) == 0) 	TokenNameCOMMENT_LINE	|| ((DTMFilter.SHOW_ELEMENT & what) == 0) 
// || localName == NodeTest.WILD 	TokenNameCOMMENT_LINE	|| localName == NodeTest.WILD 
// || namespace == NodeTest.WILD) 	TokenNameCOMMENT_LINE	|| namespace == NodeTest.WILD) 
// { 	TokenNameCOMMENT_LINE	{ 
// return traverser.first(current); 	TokenNameCOMMENT_LINE	return traverser.first(current); 
// } 	TokenNameCOMMENT_LINE	} 
// else 	TokenNameCOMMENT_LINE	else 
// { 	TokenNameCOMMENT_LINE	{ 
// int type = getNodeTypeTest(what); 	TokenNameCOMMENT_LINE	int type = getNodeTypeTest(what); 
// int extendedType = dtm.getExpandedTypeID(namespace, localName, type); 	TokenNameCOMMENT_LINE	int extendedType = dtm.getExpandedTypeID(namespace, localName, type); 
// return traverser.first(current, extendedType); 	TokenNameCOMMENT_LINE	return traverser.first(current, extendedType); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
/** * Get the next node via getFirstAttribute && getNextAttribute. */	TokenNameCOMMENT_JAVADOC	 Get the next node via getFirstAttribute && getNextAttribute. 
protected	TokenNameprotected	
int	TokenNameint	
getNextNode	TokenNameIdentifier	 get Next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lastFetched	TokenNameIdentifier	 m last Fetched
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
m_lastFetched	TokenNameIdentifier	 m last Fetched
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_traverser	TokenNameIdentifier	 m traverser
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
m_context	TokenNameIdentifier	 m context
)	TokenNameRPAREN	
:	TokenNameCOLON	
m_traverser	TokenNameIdentifier	 m traverser
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
m_context	TokenNameIdentifier	 m context
,	TokenNameCOMMA	
m_lastFetched	TokenNameIdentifier	 m last Fetched
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_lastFetched	TokenNameIdentifier	 m last Fetched
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
if	TokenNameif	
(	TokenNameLPAREN	
m_axis	TokenNameIdentifier	 m axis
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
OneStepIteratorForward	TokenNameIdentifier	 One Step Iterator Forward
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
