/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NodeSorter.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NodeSorter.java 468645 2006-10-28 06:57:24Z minchau $ 
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
CollationKey	TokenNameIdentifier	 Collation Key
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
XNodeSet	TokenNameIdentifier	 X Node Set
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
/** * This class can sort vectors of DOM nodes according to a select pattern. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class can sort vectors of DOM nodes according to a select pattern. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
NodeSorter	TokenNameIdentifier	 Node Sorter
{	TokenNameLBRACE	
/** Current XPath context */	TokenNameCOMMENT_JAVADOC	 Current XPath context 
XPathContext	TokenNameIdentifier	 X Path Context
m_execContext	TokenNameIdentifier	 m exec Context
;	TokenNameSEMICOLON	
/** Vector of NodeSortKeys */	TokenNameCOMMENT_JAVADOC	 Vector of NodeSortKeys 
Vector	TokenNameIdentifier	 Vector
m_keys	TokenNameIdentifier	 m keys
;	TokenNameSEMICOLON	
// vector of NodeSortKeys 	TokenNameCOMMENT_LINE	vector of NodeSortKeys 
// /** 	TokenNameCOMMENT_LINE	/** 
// * TODO: Adjust this for locale. 	TokenNameCOMMENT_LINE	* TODO: Adjust this for locale. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// NumberFormat m_formatter = NumberFormat.getNumberInstance(); 	TokenNameCOMMENT_LINE	NumberFormat m_formatter = NumberFormat.getNumberInstance(); 
/** * Construct a NodeSorter, passing in the XSL TransformerFactory * so it can know how to get the node data according to * the proper whitespace rules. * * @param p Xpath context to use */	TokenNameCOMMENT_JAVADOC	 Construct a NodeSorter, passing in the XSL TransformerFactory so it can know how to get the node data according to the proper whitespace rules. * @param p Xpath context to use 
public	TokenNamepublic	
NodeSorter	TokenNameIdentifier	 Node Sorter
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_execContext	TokenNameIdentifier	 m exec Context
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a vector of nodes, sort each node according to * the criteria in the keys. * @param v an vector of Nodes. * @param keys a vector of NodeSortKeys. * @param support XPath context to use * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Given a vector of nodes, sort each node according to the criteria in the keys. @param v an vector of Nodes. @param keys a vector of NodeSortKeys. @param support XPath context to use * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
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
m_keys	TokenNameIdentifier	 m keys
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
// QuickSort2(v, 0, v.size() - 1 ); 	TokenNameCOMMENT_LINE	QuickSort2(v, 0, v.size() - 1 ); 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %OPT% Change mergesort to just take a DTMIterator? 	TokenNameCOMMENT_LINE	%OPT% Change mergesort to just take a DTMIterator? 
// We would also have to adapt DTMIterator to have the function 	TokenNameCOMMENT_LINE	We would also have to adapt DTMIterator to have the function 
// of NodeCompareElem. 	TokenNameCOMMENT_LINE	of NodeCompareElem. 
// Create a vector of node compare elements 	TokenNameCOMMENT_LINE	Create a vector of node compare elements 
// based on the input vector of nodes 	TokenNameCOMMENT_LINE	based on the input vector of nodes 
Vector	TokenNameIdentifier	 Vector
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
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
NodeCompareElem	TokenNameIdentifier	 Node Compare Elem
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
new	TokenNamenew	
NodeCompareElem	TokenNameIdentifier	 Node Compare Elem
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Vector	TokenNameIdentifier	 Vector
scratchVector	TokenNameIdentifier	 scratch Vector
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergesort	TokenNameIdentifier	 mergesort
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
,	TokenNameCOMMA	
scratchVector	TokenNameIdentifier	 scratch Vector
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return sorted vector of nodes 	TokenNameCOMMENT_LINE	return sorted vector of nodes 
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
v	TokenNameIdentifier	 v
.	TokenNameDOT	
setItem	TokenNameIdentifier	 set Item
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeCompareElem	TokenNameIdentifier	 Node Compare Elem
)	TokenNameRPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
m_node	TokenNameIdentifier	 m node
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
setCurrentPos	TokenNameIdentifier	 set Current Pos
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// old code... 	TokenNameCOMMENT_LINE	old code... 
//NodeVector scratchVector = new NodeVector(n); 	TokenNameCOMMENT_LINE	NodeVector scratchVector = new NodeVector(n); 
//mergesort(v, scratchVector, 0, n - 1, support); 	TokenNameCOMMENT_LINE	mergesort(v, scratchVector, 0, n - 1, support); 
}	TokenNameRBRACE	
/** * Return the results of a compare of two nodes. * TODO: Optimize compare -- cache the getStringExpr results, key by m_selectPat + hash of node. * * @param n1 First node to use in compare * @param n2 Second node to use in compare * @param kIndex Index of NodeSortKey to use for sort * @param support XPath context to use * * @return The results of the compare of the two nodes. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Return the results of a compare of two nodes. TODO: Optimize compare -- cache the getStringExpr results, key by m_selectPat + hash of node. * @param n1 First node to use in compare @param n2 Second node to use in compare @param kIndex Index of NodeSortKey to use for sort @param support XPath context to use * @return The results of the compare of the two nodes. * @throws TransformerException 
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
NodeCompareElem	TokenNameIdentifier	 Node Compare Elem
n1	TokenNameIdentifier	 n1
,	TokenNameCOMMA	
NodeCompareElem	TokenNameIdentifier	 Node Compare Elem
n2	TokenNameIdentifier	 n2
,	TokenNameCOMMA	
int	TokenNameint	
kIndex	TokenNameIdentifier	 k Index
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
NodeSortKey	TokenNameIdentifier	 Node Sort Key
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeSortKey	TokenNameIdentifier	 Node Sort Key
)	TokenNameRPAREN	
m_keys	TokenNameIdentifier	 m keys
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
kIndex	TokenNameIdentifier	 k Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
m_treatAsNumbers	TokenNameIdentifier	 m treat As Numbers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
n1Num	TokenNameIdentifier	 n1 Num
,	TokenNameCOMMA	
n2Num	TokenNameIdentifier	 n2 Num
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
kIndex	TokenNameIdentifier	 k Index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n1Num	TokenNameIdentifier	 n1 Num
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
n1	TokenNameIdentifier	 n1
.	TokenNameDOT	
m_key1Value	TokenNameIdentifier	 m key1 Value
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n2Num	TokenNameIdentifier	 n2 Num
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
n2	TokenNameIdentifier	 n2
.	TokenNameDOT	
m_key1Value	TokenNameIdentifier	 m key1 Value
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
kIndex	TokenNameIdentifier	 k Index
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n1Num	TokenNameIdentifier	 n1 Num
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
n1	TokenNameIdentifier	 n1
.	TokenNameDOT	
m_key2Value	TokenNameIdentifier	 m key2 Value
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n2Num	TokenNameIdentifier	 n2 Num
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
n2	TokenNameIdentifier	 n2
.	TokenNameDOT	
m_key2Value	TokenNameIdentifier	 m key2 Value
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Leave this in case we decide to use an array later if (kIndex < maxkey) { double n1Num = (double)n1.m_keyValue[kIndex]; double n2Num = (double)n2.m_keyValue[kIndex]; }*/	TokenNameCOMMENT_BLOCK	 Leave this in case we decide to use an array later if (kIndex < maxkey) { double n1Num = (double)n1.m_keyValue[kIndex]; double n2Num = (double)n2.m_keyValue[kIndex]; }
else	TokenNameelse	
{	TokenNameLBRACE	
// Get values dynamically 	TokenNameCOMMENT_LINE	Get values dynamically 
XObject	TokenNameIdentifier	 X Object
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
m_selectPat	TokenNameIdentifier	 m select Pat
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
m_execContext	TokenNameIdentifier	 m exec Context
,	TokenNameCOMMA	
n1	TokenNameIdentifier	 n1
.	TokenNameDOT	
m_node	TokenNameIdentifier	 m node
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
m_namespaceContext	TokenNameIdentifier	 m namespace Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
m_selectPat	TokenNameIdentifier	 m select Pat
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
m_execContext	TokenNameIdentifier	 m exec Context
,	TokenNameCOMMA	
n2	TokenNameIdentifier	 n2
.	TokenNameDOT	
m_node	TokenNameIdentifier	 m node
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
m_namespaceContext	TokenNameIdentifier	 m namespace Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n1Num	TokenNameIdentifier	 n1 Num
=	TokenNameEQUAL	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Can't use NaN for compare. They are never equal. Use zero instead. 	TokenNameCOMMENT_LINE	Can't use NaN for compare. They are never equal. Use zero instead. 
// That way we can keep elements in document order. 	TokenNameCOMMENT_LINE	That way we can keep elements in document order. 
//n1Num = Double.isNaN(d) ? 0.0 : d; 	TokenNameCOMMENT_LINE	n1Num = Double.isNaN(d) ? 0.0 : d; 
n2Num	TokenNameIdentifier	 n2 Num
=	TokenNameEQUAL	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//n2Num = Double.isNaN(d) ? 0.0 : d; 	TokenNameCOMMENT_LINE	n2Num = Double.isNaN(d) ? 0.0 : d; 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
n1Num	TokenNameIdentifier	 n1 Num
==	TokenNameEQUAL_EQUAL	
n2Num	TokenNameIdentifier	 n2 Num
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
kIndex	TokenNameIdentifier	 k Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<	TokenNameLESS	
m_keys	TokenNameIdentifier	 m keys
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
n1	TokenNameIdentifier	 n1
,	TokenNameCOMMA	
n2	TokenNameIdentifier	 n2
,	TokenNameCOMMA	
kIndex	TokenNameIdentifier	 k Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
double	TokenNamedouble	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
n1Num	TokenNameIdentifier	 n1 Num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
n2Num	TokenNameIdentifier	 n2 Num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
n2Num	TokenNameIdentifier	 n2 Num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
n1Num	TokenNameIdentifier	 n1 Num
-	TokenNameMINUS	
n2Num	TokenNameIdentifier	 n2 Num
;	TokenNameSEMICOLON	
// process order parameter 	TokenNameCOMMENT_LINE	process order parameter 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
<	TokenNameLESS	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
m_descending	TokenNameIdentifier	 m descending
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
>	TokenNameGREATER	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
m_descending	TokenNameIdentifier	 m descending
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end treat as numbers 	TokenNameCOMMENT_LINE	end treat as numbers 
else	TokenNameelse	
{	TokenNameLBRACE	
CollationKey	TokenNameIdentifier	 Collation Key
n1String	TokenNameIdentifier	 n1 String
,	TokenNameCOMMA	
n2String	TokenNameIdentifier	 n2 String
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
kIndex	TokenNameIdentifier	 k Index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n1String	TokenNameIdentifier	 n1 String
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CollationKey	TokenNameIdentifier	 Collation Key
)	TokenNameRPAREN	
n1	TokenNameIdentifier	 n1
.	TokenNameDOT	
m_key1Value	TokenNameIdentifier	 m key1 Value
;	TokenNameSEMICOLON	
n2String	TokenNameIdentifier	 n2 String
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CollationKey	TokenNameIdentifier	 Collation Key
)	TokenNameRPAREN	
n2	TokenNameIdentifier	 n2
.	TokenNameDOT	
m_key1Value	TokenNameIdentifier	 m key1 Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
kIndex	TokenNameIdentifier	 k Index
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n1String	TokenNameIdentifier	 n1 String
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CollationKey	TokenNameIdentifier	 Collation Key
)	TokenNameRPAREN	
n1	TokenNameIdentifier	 n1
.	TokenNameDOT	
m_key2Value	TokenNameIdentifier	 m key2 Value
;	TokenNameSEMICOLON	
n2String	TokenNameIdentifier	 n2 String
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CollationKey	TokenNameIdentifier	 Collation Key
)	TokenNameRPAREN	
n2	TokenNameIdentifier	 n2
.	TokenNameDOT	
m_key2Value	TokenNameIdentifier	 m key2 Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Leave this in case we decide to use an array later if (kIndex < maxkey) { String n1String = (String)n1.m_keyValue[kIndex]; String n2String = (String)n2.m_keyValue[kIndex]; }*/	TokenNameCOMMENT_BLOCK	 Leave this in case we decide to use an array later if (kIndex < maxkey) { String n1String = (String)n1.m_keyValue[kIndex]; String n2String = (String)n2.m_keyValue[kIndex]; }
else	TokenNameelse	
{	TokenNameLBRACE	
// Get values dynamically 	TokenNameCOMMENT_LINE	Get values dynamically 
XObject	TokenNameIdentifier	 X Object
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
m_selectPat	TokenNameIdentifier	 m select Pat
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
m_execContext	TokenNameIdentifier	 m exec Context
,	TokenNameCOMMA	
n1	TokenNameIdentifier	 n1
.	TokenNameDOT	
m_node	TokenNameIdentifier	 m node
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
m_namespaceContext	TokenNameIdentifier	 m namespace Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
m_selectPat	TokenNameIdentifier	 m select Pat
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
m_execContext	TokenNameIdentifier	 m exec Context
,	TokenNameCOMMA	
n2	TokenNameIdentifier	 n2
.	TokenNameDOT	
m_node	TokenNameIdentifier	 m node
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
m_namespaceContext	TokenNameIdentifier	 m namespace Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n1String	TokenNameIdentifier	 n1 String
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
m_col	TokenNameIdentifier	 m col
.	TokenNameDOT	
getCollationKey	TokenNameIdentifier	 get Collation Key
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n2String	TokenNameIdentifier	 n2 String
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
m_col	TokenNameIdentifier	 m col
.	TokenNameDOT	
getCollationKey	TokenNameIdentifier	 get Collation Key
(	TokenNameLPAREN	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Use collation keys for faster compare, but note that whitespaces 	TokenNameCOMMENT_LINE	Use collation keys for faster compare, but note that whitespaces 
// etc... are treated differently from if we were comparing Strings. 	TokenNameCOMMENT_LINE	etc... are treated differently from if we were comparing Strings. 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
n1String	TokenNameIdentifier	 n1 String
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
n2String	TokenNameIdentifier	 n2 String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Process caseOrder parameter 	TokenNameCOMMENT_LINE	Process caseOrder parameter 
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
m_caseOrderUpper	TokenNameIdentifier	 m case Order Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tempN1	TokenNameIdentifier	 temp N1
=	TokenNameEQUAL	
n1String	TokenNameIdentifier	 n1 String
.	TokenNameDOT	
getSourceString	TokenNameIdentifier	 get Source String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tempN2	TokenNameIdentifier	 temp N2
=	TokenNameEQUAL	
n2String	TokenNameIdentifier	 n2 String
.	TokenNameDOT	
getSourceString	TokenNameIdentifier	 get Source String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tempN1	TokenNameIdentifier	 temp N1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tempN2	TokenNameIdentifier	 temp N2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//java defaults to upper case is greater. 	TokenNameCOMMENT_LINE	java defaults to upper case is greater. 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//Process order parameter 	TokenNameCOMMENT_LINE	Process order parameter 
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
m_descending	TokenNameIdentifier	 m descending
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
-	TokenNameMINUS	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//end else 	TokenNameCOMMENT_LINE	end else 
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
kIndex	TokenNameIdentifier	 k Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<	TokenNameLESS	
m_keys	TokenNameIdentifier	 m keys
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
n1	TokenNameIdentifier	 n1
,	TokenNameCOMMA	
n2	TokenNameIdentifier	 n2
,	TokenNameCOMMA	
kIndex	TokenNameIdentifier	 k Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// I shouldn't have to do this except that there seems to 	TokenNameCOMMENT_LINE	I shouldn't have to do this except that there seems to 
// be a glitch in the mergesort 	TokenNameCOMMENT_LINE	be a glitch in the mergesort 
// if(r1.getType() == r1.CLASS_NODESET) 	TokenNameCOMMENT_LINE	if(r1.getType() == r1.CLASS_NODESET) 
// { 	TokenNameCOMMENT_LINE	{ 
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
support	TokenNameIdentifier	 support
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
n1	TokenNameIdentifier	 n1
.	TokenNameDOT	
m_node	TokenNameIdentifier	 m node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %OPT% 	TokenNameCOMMENT_LINE	%OPT% 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
isNodeAfter	TokenNameIdentifier	 is Node After
(	TokenNameLPAREN	
n1	TokenNameIdentifier	 n1
.	TokenNameDOT	
m_node	TokenNameIdentifier	 m node
,	TokenNameCOMMA	
n2	TokenNameIdentifier	 n2
.	TokenNameDOT	
m_node	TokenNameIdentifier	 m node
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This implements a standard Mergesort, as described in * Robert Sedgewick's Algorithms book. This is a better * sort for our purpose than the Quicksort because it * maintains the original document order of the input if * the order isn't changed by the sort. * * @param a First vector of nodes to compare * @param b Second vector of nodes to compare * @param l Left boundary of partition * @param r Right boundary of partition * @param support XPath context to use * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 This implements a standard Mergesort, as described in Robert Sedgewick's Algorithms book. This is a better sort for our purpose than the Quicksort because it maintains the original document order of the input if the order isn't changed by the sort. * @param a First vector of nodes to compare @param b Second vector of nodes to compare @param l Left boundary of partition @param r Right boundary of partition @param support XPath context to use * @throws TransformerException 
void	TokenNamevoid	
mergesort	TokenNameIdentifier	 mergesort
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
int	TokenNameint	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
-	TokenNameMINUS	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
mergesort	TokenNameIdentifier	 mergesort
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergesort	TokenNameIdentifier	 mergesort
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// b[i] = a[i]; 	TokenNameCOMMENT_LINE	b[i] = a[i]; 
// Use insert if we need to increment vector size. 	TokenNameCOMMENT_LINE	Use insert if we need to increment vector size. 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// b[r+m+1-j] = a[j]; 	TokenNameCOMMENT_LINE	b[r+m+1-j] = a[j]; 
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
m	TokenNameIdentifier	 m
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
j	TokenNameIdentifier	 j
>=	TokenNameGREATER_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
m	TokenNameIdentifier	 m
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
m	TokenNameIdentifier	 m
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
int	TokenNameint	
compVal	TokenNameIdentifier	 comp Val
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<=	TokenNameLESS_EQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if(b[i] < b[j]) 	TokenNameCOMMENT_LINE	if(b[i] < b[j]) 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
compVal	TokenNameIdentifier	 comp Val
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
compVal	TokenNameIdentifier	 comp Val
=	TokenNameEQUAL	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeCompareElem	TokenNameIdentifier	 Node Compare Elem
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
NodeCompareElem	TokenNameIdentifier	 Node Compare Elem
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compVal	TokenNameIdentifier	 comp Val
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// a[k]=b[i]; 	TokenNameCOMMENT_LINE	a[k]=b[i]; 
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
compVal	TokenNameIdentifier	 comp Val
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// a[k]=b[j]; 	TokenNameCOMMENT_LINE	a[k]=b[j]; 
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This is a generic version of C.A.R Hoare's Quick Sort * algorithm. This will handle arrays that are already * sorted, and arrays with duplicate keys.<BR> * * If you think of a one dimensional array as going from * the lowest index on the left to the highest index on the right * then the parameters to this function are lowest index or * left and highest index or right. The first time you call * this function it will be with the parameters 0, a.length - 1. * * @param v a vector of integers * @param lo0 left boundary of array partition * @param hi0 right boundary of array partition * */	TokenNameCOMMENT_JAVADOC	 This is a generic version of C.A.R Hoare's Quick Sort algorithm. This will handle arrays that are already sorted, and arrays with duplicate keys.<BR> * If you think of a one dimensional array as going from the lowest index on the left to the highest index on the right then the parameters to this function are lowest index or left and highest index or right. The first time you call this function it will be with the parameters 0, a.length - 1. * @param v a vector of integers @param lo0 left boundary of array partition @param hi0 right boundary of array partition 
/* private void QuickSort2(Vector v, int lo0, int hi0, XPathContext support) throws javax.xml.transform.TransformerException, java.net.MalformedURLException, java.io.FileNotFoundException, java.io.IOException { int lo = lo0; int hi = hi0; if ( hi0 > lo0) { // Arbitrarily establishing partition element as the midpoint of // the array. Node midNode = (Node)v.elementAt( ( lo0 + hi0 ) / 2 ); // loop through the array until indices cross while( lo <= hi ) { // find the first element that is greater than or equal to // the partition element starting from the left Index. while( (lo < hi0) && (compare((Node)v.elementAt(lo), midNode, 0, support) < 0) ) { ++lo; } // end while // find an element that is smaller than or equal to // the partition element starting from the right Index. while( (hi > lo0) && (compare((Node)v.elementAt(hi), midNode, 0, support) > 0) ) { --hi; } // if the indexes have not crossed, swap if( lo <= hi ) { swap(v, lo, hi); ++lo; --hi; } } // If the right index has not reached the left side of array // must now sort the left partition. if( lo0 < hi ) { QuickSort2( v, lo0, hi, support ); } // If the left index has not reached the right side of array // must now sort the right partition. if( lo < hi0 ) { QuickSort2( v, lo, hi0, support ); } } } // end QuickSort2 */	TokenNameCOMMENT_BLOCK	 private void QuickSort2(Vector v, int lo0, int hi0, XPathContext support) throws javax.xml.transform.TransformerException, java.net.MalformedURLException, java.io.FileNotFoundException, java.io.IOException { int lo = lo0; int hi = hi0; if ( hi0 > lo0) { // Arbitrarily establishing partition element as the midpoint of // the array. Node midNode = (Node)v.elementAt( ( lo0 + hi0 ) / 2 ); // loop through the array until indices cross while( lo <= hi ) { // find the first element that is greater than or equal to // the partition element starting from the left Index. while( (lo < hi0) && (compare((Node)v.elementAt(lo), midNode, 0, support) < 0) ) { ++lo; } // end while // find an element that is smaller than or equal to // the partition element starting from the right Index. while( (hi > lo0) && (compare((Node)v.elementAt(hi), midNode, 0, support) > 0) ) { --hi; } // if the indexes have not crossed, swap if( lo <= hi ) { swap(v, lo, hi); ++lo; --hi; } } // If the right index has not reached the left side of array // must now sort the left partition. if( lo0 < hi ) { QuickSort2( v, lo0, hi, support ); } // If the left index has not reached the right side of array // must now sort the right partition. if( lo < hi0 ) { QuickSort2( v, lo, hi0, support ); } } } // end QuickSort2 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Simple function to swap two elements in 	TokenNameCOMMENT_LINE	* Simple function to swap two elements in 
// * a vector. 	TokenNameCOMMENT_LINE	* a vector. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param v Vector of nodes to swap 	TokenNameCOMMENT_LINE	* @param v Vector of nodes to swap 
// * @param i Index of first node to swap 	TokenNameCOMMENT_LINE	* @param i Index of first node to swap 
// * @param i Index of second node to swap 	TokenNameCOMMENT_LINE	* @param i Index of second node to swap 
// */ 	TokenNameCOMMENT_LINE	*/ 
// private void swap(Vector v, int i, int j) 	TokenNameCOMMENT_LINE	private void swap(Vector v, int i, int j) 
// { 	TokenNameCOMMENT_LINE	{ 
// 	TokenNameCOMMENT_LINE	 
// int node = (Node) v.elementAt(i); 	TokenNameCOMMENT_LINE	int node = (Node) v.elementAt(i); 
// 	TokenNameCOMMENT_LINE	 
// v.setElementAt(v.elementAt(j), i); 	TokenNameCOMMENT_LINE	v.setElementAt(v.elementAt(j), i); 
// v.setElementAt(node, j); 	TokenNameCOMMENT_LINE	v.setElementAt(node, j); 
// } 	TokenNameCOMMENT_LINE	} 
/** * This class holds the value(s) from executing the given * node against the sort key(s). * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class holds the value(s) from executing the given node against the sort key(s). @xsl.usage internal 
class	TokenNameclass	
NodeCompareElem	TokenNameIdentifier	 Node Compare Elem
{	TokenNameLBRACE	
/** Current node */	TokenNameCOMMENT_JAVADOC	 Current node 
int	TokenNameint	
m_node	TokenNameIdentifier	 m node
;	TokenNameSEMICOLON	
/** This maxkey value was chosen arbitrarily. We are assuming that the // maxkey + 1 keys will only hit fairly rarely and therefore, we // will get the node values for those keys dynamically. */	TokenNameCOMMENT_JAVADOC	 This maxkey value was chosen arbitrarily. We are assuming that the // maxkey + 1 keys will only hit fairly rarely and therefore, we // will get the node values for those keys dynamically. 
int	TokenNameint	
maxkey	TokenNameIdentifier	 maxkey
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Keep this in case we decide to use an array. Right now 	TokenNameCOMMENT_LINE	Keep this in case we decide to use an array. Right now 
// using two variables is cheaper. 	TokenNameCOMMENT_LINE	using two variables is cheaper. 
//Object[] m_KeyValue = new Object[2]; 	TokenNameCOMMENT_LINE	Object[] m_KeyValue = new Object[2]; 
/** Value from first sort key */	TokenNameCOMMENT_JAVADOC	 Value from first sort key 
Object	TokenNameIdentifier	 Object
m_key1Value	TokenNameIdentifier	 m key1 Value
;	TokenNameSEMICOLON	
/** Value from second sort key */	TokenNameCOMMENT_JAVADOC	 Value from second sort key 
Object	TokenNameIdentifier	 Object
m_key2Value	TokenNameIdentifier	 m key2 Value
;	TokenNameSEMICOLON	
/** * Constructor NodeCompareElem * * * @param node Current node * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Constructor NodeCompareElem * @param node Current node * @throws javax.xml.transform.TransformerException 
NodeCompareElem	TokenNameIdentifier	 Node Compare Elem
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
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
m_node	TokenNameIdentifier	 m node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_keys	TokenNameIdentifier	 m keys
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeSortKey	TokenNameIdentifier	 Node Sort Key
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeSortKey	TokenNameIdentifier	 Node Sort Key
)	TokenNameRPAREN	
m_keys	TokenNameIdentifier	 m keys
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
k1	TokenNameIdentifier	 k1
.	TokenNameDOT	
m_selectPat	TokenNameIdentifier	 m select Pat
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
m_execContext	TokenNameIdentifier	 m exec Context
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
k1	TokenNameIdentifier	 k1
.	TokenNameDOT	
m_namespaceContext	TokenNameIdentifier	 m namespace Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
.	TokenNameDOT	
m_treatAsNumbers	TokenNameIdentifier	 m treat As Numbers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Can't use NaN for compare. They are never equal. Use zero instead. 	TokenNameCOMMENT_LINE	Can't use NaN for compare. They are never equal. Use zero instead. 
m_key1Value	TokenNameIdentifier	 m key1 Value
=	TokenNameEQUAL	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_key1Value	TokenNameIdentifier	 m key1 Value
=	TokenNameEQUAL	
k1	TokenNameIdentifier	 k1
.	TokenNameDOT	
m_col	TokenNameIdentifier	 m col
.	TokenNameDOT	
getCollationKey	TokenNameIdentifier	 get Collation Key
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% 	TokenNameCOMMENT_LINE	%REVIEW% 
DTMIterator	TokenNameIdentifier	 DTM Iterator
ni	TokenNameIdentifier	 ni
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
.	TokenNameDOT	
iterRaw	TokenNameIdentifier	 iter Raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
ni	TokenNameIdentifier	 ni
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
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if (ni instanceof ContextNodeList) // %REVIEW% 	TokenNameCOMMENT_LINE	if (ni instanceof ContextNodeList) // %REVIEW% 
// tryNextKey = (DTM.NULL != current); 	TokenNameCOMMENT_LINE	tryNextKey = (DTM.NULL != current); 
// else abdicate... should never happen, but... -sb 	TokenNameCOMMENT_LINE	else abdicate... should never happen, but... -sb 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_keys	TokenNameIdentifier	 m keys
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeSortKey	TokenNameIdentifier	 Node Sort Key
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeSortKey	TokenNameIdentifier	 Node Sort Key
)	TokenNameRPAREN	
m_keys	TokenNameIdentifier	 m keys
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
k2	TokenNameIdentifier	 k2
.	TokenNameDOT	
m_selectPat	TokenNameIdentifier	 m select Pat
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
m_execContext	TokenNameIdentifier	 m exec Context
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
k2	TokenNameIdentifier	 k2
.	TokenNameDOT	
m_namespaceContext	TokenNameIdentifier	 m namespace Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
.	TokenNameDOT	
m_treatAsNumbers	TokenNameIdentifier	 m treat As Numbers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_key2Value	TokenNameIdentifier	 m key2 Value
=	TokenNameEQUAL	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_key2Value	TokenNameIdentifier	 m key2 Value
=	TokenNameEQUAL	
k2	TokenNameIdentifier	 k2
.	TokenNameDOT	
m_col	TokenNameIdentifier	 m col
.	TokenNameDOT	
getCollationKey	TokenNameIdentifier	 get Collation Key
(	TokenNameLPAREN	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* Leave this in case we decide to use an array later while (kIndex <= m_keys.size() && kIndex < maxkey) { NodeSortKey k = (NodeSortKey)m_keys.elementAt(kIndex); XObject r = k.m_selectPat.execute(m_execContext, node, k.m_namespaceContext); if(k.m_treatAsNumbers) m_KeyValue[kIndex] = r.num(); else m_KeyValue[kIndex] = r.str(); } */	TokenNameCOMMENT_BLOCK	 Leave this in case we decide to use an array later while (kIndex <= m_keys.size() && kIndex < maxkey) { NodeSortKey k = (NodeSortKey)m_keys.elementAt(kIndex); XObject r = k.m_selectPat.execute(m_execContext, node, k.m_namespaceContext); if(k.m_treatAsNumbers) m_KeyValue[kIndex] = r.num(); else m_KeyValue[kIndex] = r.str(); } 
}	TokenNameRBRACE	
// end if not empty 	TokenNameCOMMENT_LINE	end if not empty 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end NodeCompareElem class 	TokenNameCOMMENT_LINE	end NodeCompareElem class 
}	TokenNameRBRACE	
