/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ChildTestIterator.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ChildTestIterator.java 468655 2006-10-28 07:12:06Z minchau $ 
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
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
Compiler	TokenNameIdentifier	 Compiler
;	TokenNameSEMICOLON	
/** * This class implements an optimized iterator for * children patterns that have a node test, and possibly a predicate. * @see org.apache.xpath.axes.BasicTestIterator * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 This class implements an optimized iterator for children patterns that have a node test, and possibly a predicate. @see org.apache.xpath.axes.BasicTestIterator @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ChildTestIterator	TokenNameIdentifier	 Child Test Iterator
extends	TokenNameextends	
BasicTestIterator	TokenNameIdentifier	 Basic Test Iterator
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
7936835957960705722L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** The traverser to use to navigate over the descendants. */	TokenNameCOMMENT_JAVADOC	 The traverser to use to navigate over the descendants. 
transient	TokenNametransient	
protected	TokenNameprotected	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
m_traverser	TokenNameIdentifier	 m traverser
;	TokenNameSEMICOLON	
/** The extended type ID, not set until setRoot. */	TokenNameCOMMENT_JAVADOC	 The extended type ID, not set until setRoot. 
// protected int m_extendedTypeID; 	TokenNameCOMMENT_LINE	protected int m_extendedTypeID; 
/** * Create a ChildTestIterator object. * * @param compiler A reference to the Compiler that contains the op map. * @param opPos The position within the op map, which contains the * location path expression for this itterator. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a ChildTestIterator object. * @param compiler A reference to the Compiler that contains the op map. @param opPos The position within the op map, which contains the location path expression for this itterator. * @throws javax.xml.transform.TransformerException 
ChildTestIterator	TokenNameIdentifier	 Child Test Iterator
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
}	TokenNameRBRACE	
/** * Create a ChildTestIterator object. * * @param traverser Traverser that tells how the KeyIterator is to be handled. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a ChildTestIterator object. * @param traverser Traverser that tells how the KeyIterator is to be handled. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
ChildTestIterator	TokenNameIdentifier	 Child Test Iterator
(	TokenNameLPAREN	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
traverser	TokenNameIdentifier	 traverser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_traverser	TokenNameIdentifier	 m traverser
=	TokenNameEQUAL	
traverser	TokenNameIdentifier	 traverser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node via getNextXXX. Bottlenecked for derived class override. * @return The next node on the axis, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Get the next node via getNextXXX. Bottlenecked for derived class override. @return The next node on the axis, or DTM.NULL. 
protected	TokenNameprotected	
int	TokenNameint	
getNextNode	TokenNameIdentifier	 get Next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
true	TokenNametrue	
/* 0 == m_extendedTypeID */	TokenNameCOMMENT_BLOCK	 0 == m_extendedTypeID 
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
}	TokenNameRBRACE	
// else 	TokenNameCOMMENT_LINE	else 
// { 	TokenNameCOMMENT_LINE	{ 
// m_lastFetched = (DTM.NULL == m_lastFetched) 	TokenNameCOMMENT_LINE	m_lastFetched = (DTM.NULL == m_lastFetched) 
// ? m_traverser.first(m_context, m_extendedTypeID) 	TokenNameCOMMENT_LINE	? m_traverser.first(m_context, m_extendedTypeID) 
// : m_traverser.next(m_context, m_lastFetched, 	TokenNameCOMMENT_LINE	: m_traverser.next(m_context, m_lastFetched, 
// m_extendedTypeID); 	TokenNameCOMMENT_LINE	m_extendedTypeID); 
// } 	TokenNameCOMMENT_LINE	} 
return	TokenNamereturn	
m_lastFetched	TokenNameIdentifier	 m last Fetched
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a cloned Iterator that is reset to the beginning * of the query. * * @return A cloned NodeIterator set of the start of the query. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a cloned Iterator that is reset to the beginning of the query. * @return A cloned NodeIterator set of the start of the query. * @throws CloneNotSupportedException 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
ChildTestIterator	TokenNameIdentifier	 Child Test Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildTestIterator	TokenNameIdentifier	 Child Test Iterator
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_traverser	TokenNameIdentifier	 m traverser
=	TokenNameEQUAL	
m_traverser	TokenNameIdentifier	 m traverser
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
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
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
CHILD	TokenNameIdentifier	 CHILD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// String localName = getLocalName(); 	TokenNameCOMMENT_LINE	String localName = getLocalName(); 
// String namespace = getNamespace(); 	TokenNameCOMMENT_LINE	String namespace = getNamespace(); 
// int what = m_whatToShow; 	TokenNameCOMMENT_LINE	int what = m_whatToShow; 
// // System.out.println("what: "); 	TokenNameCOMMENT_LINE	// System.out.println("what: "); 
// // NodeTest.debugWhatToShow(what); 	TokenNameCOMMENT_LINE	// NodeTest.debugWhatToShow(what); 
// if(DTMFilter.SHOW_ALL == what || 	TokenNameCOMMENT_LINE	if(DTMFilter.SHOW_ALL == what || 
// ((DTMFilter.SHOW_ELEMENT & what) == 0) 	TokenNameCOMMENT_LINE	((DTMFilter.SHOW_ELEMENT & what) == 0) 
// || localName == NodeTest.WILD 	TokenNameCOMMENT_LINE	|| localName == NodeTest.WILD 
// || namespace == NodeTest.WILD) 	TokenNameCOMMENT_LINE	|| namespace == NodeTest.WILD) 
// { 	TokenNameCOMMENT_LINE	{ 
// m_extendedTypeID = 0; 	TokenNameCOMMENT_LINE	m_extendedTypeID = 0; 
// } 	TokenNameCOMMENT_LINE	} 
// else 	TokenNameCOMMENT_LINE	else 
// { 	TokenNameCOMMENT_LINE	{ 
// int type = getNodeTypeTest(what); 	TokenNameCOMMENT_LINE	int type = getNodeTypeTest(what); 
// m_extendedTypeID = m_cdtm.getExpandedTypeID(namespace, localName, type); 	TokenNameCOMMENT_LINE	m_extendedTypeID = m_cdtm.getExpandedTypeID(namespace, localName, type); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
/** * Returns the axis being iterated, if it is known. * * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple * types. */	TokenNameCOMMENT_JAVADOC	 Returns the axis being iterated, if it is known. * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple types. 
public	TokenNamepublic	
int	TokenNameint	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
CHILD	TokenNameIdentifier	 CHILD
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_traverser	TokenNameIdentifier	 m traverser
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Always call the superclass detach last! 	TokenNameCOMMENT_LINE	Always call the superclass detach last! 
super	TokenNamesuper	
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
