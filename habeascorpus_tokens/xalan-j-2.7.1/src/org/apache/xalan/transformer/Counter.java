/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Counter.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Counter.java 468645 2006-10-28 06:57:24Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemNumber	TokenNameIdentifier	 Elem Number
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
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
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
/** * A class that does incremental counting for support of xsl:number. * This class stores a cache of counted nodes (m_countNodes). * It tries to cache the counted nodes in document order... * the node count is based on its position in the cache list * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 A class that does incremental counting for support of xsl:number. This class stores a cache of counted nodes (m_countNodes). It tries to cache the counted nodes in document order... the node count is based on its position in the cache list @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
Counter	TokenNameIdentifier	 Counter
{	TokenNameLBRACE	
/** * Set the maximum ammount the m_countNodes list can * grow to. */	TokenNameCOMMENT_JAVADOC	 Set the maximum ammount the m_countNodes list can grow to. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAXCOUNTNODES	TokenNameIdentifier	 MAXCOUNTNODES
=	TokenNameEQUAL	
500	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The start count from where m_countNodes counts * from. In other words, the count of a given node * in the m_countNodes vector is node position + * m_countNodesStartCount. */	TokenNameCOMMENT_JAVADOC	 The start count from where m_countNodes counts from. In other words, the count of a given node in the m_countNodes vector is node position + m_countNodesStartCount. 
int	TokenNameint	
m_countNodesStartCount	TokenNameIdentifier	 m count Nodes Start Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A vector of all nodes counted so far. */	TokenNameCOMMENT_JAVADOC	 A vector of all nodes counted so far. 
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
m_countNodes	TokenNameIdentifier	 m count Nodes
;	TokenNameSEMICOLON	
/** * The node from where the counting starts. This is needed to * find a counter if the node being counted is not immediatly * found in the m_countNodes vector. */	TokenNameCOMMENT_JAVADOC	 The node from where the counting starts. This is needed to find a counter if the node being counted is not immediatly found in the m_countNodes vector. 
int	TokenNameint	
m_fromNode	TokenNameIdentifier	 m from Node
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** * The owning xsl:number element. */	TokenNameCOMMENT_JAVADOC	 The owning xsl:number element. 
ElemNumber	TokenNameIdentifier	 Elem Number
m_numberElem	TokenNameIdentifier	 m number Elem
;	TokenNameSEMICOLON	
/** * Value to store result of last getCount call, for benifit * of returning val from CountersTable.getCounterByCounted, * who calls getCount. */	TokenNameCOMMENT_JAVADOC	 Value to store result of last getCount call, for benifit of returning val from CountersTable.getCounterByCounted, who calls getCount. 
int	TokenNameint	
m_countResult	TokenNameIdentifier	 m count Result
;	TokenNameSEMICOLON	
/** * Construct a counter object. * * @param numberElem The owning xsl:number element. * @param countNodes A vector of all nodes counted so far. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Construct a counter object. * @param numberElem The owning xsl:number element. @param countNodes A vector of all nodes counted so far. * @throws TransformerException 
Counter	TokenNameIdentifier	 Counter
(	TokenNameLPAREN	
ElemNumber	TokenNameIdentifier	 Elem Number
numberElem	TokenNameIdentifier	 number Elem
,	TokenNameCOMMA	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
countNodes	TokenNameIdentifier	 count Nodes
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
m_countNodes	TokenNameIdentifier	 m count Nodes
=	TokenNameEQUAL	
countNodes	TokenNameIdentifier	 count Nodes
;	TokenNameSEMICOLON	
m_numberElem	TokenNameIdentifier	 m number Elem
=	TokenNameEQUAL	
numberElem	TokenNameIdentifier	 number Elem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a counter object. * * @param numberElem The owning xsl:number element. * * @throws TransformerException * Counter(ElemNumber numberElem) throws TransformerException { m_numberElem = numberElem; }*/	TokenNameCOMMENT_JAVADOC	 Construct a counter object. * @param numberElem The owning xsl:number element. * @throws TransformerException Counter(ElemNumber numberElem) throws TransformerException { m_numberElem = numberElem; }
/** * Try and find a node that was previously counted. If found, * return a positive integer that corresponds to the count. * * @param support The XPath context to use * @param node The node to be counted. * * @return The count of the node, or -1 if not found. */	TokenNameCOMMENT_JAVADOC	 Try and find a node that was previously counted. If found, return a positive integer that corresponds to the count. * @param support The XPath context to use @param node The node to be counted. * @return The count of the node, or -1 if not found. 
int	TokenNameint	
getPreviouslyCounted	TokenNameIdentifier	 get Previously Counted
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
,	TokenNameCOMMA	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_countNodes	TokenNameIdentifier	 m count Nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_countResult	TokenNameIdentifier	 m count Result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
countedNode	TokenNameIdentifier	 counted Node
=	TokenNameEQUAL	
m_countNodes	TokenNameIdentifier	 m count Nodes
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
countedNode	TokenNameIdentifier	 counted Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Since the list is in backwards order, the count is 	TokenNameCOMMENT_LINE	Since the list is in backwards order, the count is 
// how many are in the rest of the list. 	TokenNameCOMMENT_LINE	how many are in the rest of the list. 
m_countResult	TokenNameIdentifier	 m count Result
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
m_countNodesStartCount	TokenNameIdentifier	 m count Nodes Start Count
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
support	TokenNameIdentifier	 support
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
countedNode	TokenNameIdentifier	 counted Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Try to see if the given node falls after the counted node... 	TokenNameCOMMENT_LINE	Try to see if the given node falls after the counted node... 
// if it does, don't keep searching backwards. 	TokenNameCOMMENT_LINE	if it does, don't keep searching backwards. 
if	TokenNameif	
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
isNodeAfter	TokenNameIdentifier	 is Node After
(	TokenNameLPAREN	
countedNode	TokenNameIdentifier	 counted Node
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_countResult	TokenNameIdentifier	 m count Result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the last node in the list. * * @return the last node in the list. */	TokenNameCOMMENT_JAVADOC	 Get the last node in the list. * @return the last node in the list. 
int	TokenNameint	
getLast	TokenNameIdentifier	 get Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
m_countNodes	TokenNameIdentifier	 m count Nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_countNodes	TokenNameIdentifier	 m count Nodes
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
