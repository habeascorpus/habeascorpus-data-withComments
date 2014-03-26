/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: CountersTable.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: CountersTable.java 468645 2006-10-28 06:57:24Z minchau $ 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
/** * This is a table of counters, keyed by ElemNumber objects, each * of which has a list of Counter objects. This really isn't a true * table, it is more like a list of lists (there must be a technical * term for that...). * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This is a table of counters, keyed by ElemNumber objects, each of which has a list of Counter objects. This really isn't a true table, it is more like a list of lists (there must be a technical term for that...). @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
CountersTable	TokenNameIdentifier	 Counters Table
extends	TokenNameextends	
Hashtable	TokenNameIdentifier	 Hashtable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
2159100770924179875L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Construct a CountersTable. */	TokenNameCOMMENT_JAVADOC	 Construct a CountersTable. 
public	TokenNamepublic	
CountersTable	TokenNameIdentifier	 Counters Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Get the list of counters that corresponds to * the given ElemNumber object. * * @param numberElem the given xsl:number element. * * @return the list of counters that corresponds to * the given ElemNumber object. */	TokenNameCOMMENT_JAVADOC	 Get the list of counters that corresponds to the given ElemNumber object. * @param numberElem the given xsl:number element. * @return the list of counters that corresponds to the given ElemNumber object. 
Vector	TokenNameIdentifier	 Vector
getCounters	TokenNameIdentifier	 get Counters
(	TokenNameLPAREN	
ElemNumber	TokenNameIdentifier	 Elem Number
numberElem	TokenNameIdentifier	 number Elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
counters	TokenNameIdentifier	 counters
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
numberElem	TokenNameIdentifier	 number Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
counters	TokenNameIdentifier	 counters
)	TokenNameRPAREN	
?	TokenNameQUESTION	
putElemNumber	TokenNameIdentifier	 put Elem Number
(	TokenNameLPAREN	
numberElem	TokenNameIdentifier	 number Elem
)	TokenNameRPAREN	
:	TokenNameCOLON	
counters	TokenNameIdentifier	 counters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Put a counter into the table and create an empty * vector as it's value. * * @param numberElem the given xsl:number element. * * @return an empty vector to be used to store counts * for this number element. */	TokenNameCOMMENT_JAVADOC	 Put a counter into the table and create an empty vector as it's value. * @param numberElem the given xsl:number element. * @return an empty vector to be used to store counts for this number element. 
Vector	TokenNameIdentifier	 Vector
putElemNumber	TokenNameIdentifier	 put Elem Number
(	TokenNameLPAREN	
ElemNumber	TokenNameIdentifier	 Elem Number
numberElem	TokenNameIdentifier	 number Elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
counters	TokenNameIdentifier	 counters
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
numberElem	TokenNameIdentifier	 number Elem
,	TokenNameCOMMA	
counters	TokenNameIdentifier	 counters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
counters	TokenNameIdentifier	 counters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Place to collect new counters. */	TokenNameCOMMENT_JAVADOC	 Place to collect new counters. 
transient	TokenNametransient	
private	TokenNameprivate	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
m_newFound	TokenNameIdentifier	 m new Found
;	TokenNameSEMICOLON	
/** * Add a list of counted nodes that were built in backwards document * order, or a list of counted nodes that are in forwards document * order. * * @param flist Vector of nodes built in forwards document order * @param blist Vector of nodes built in backwards document order */	TokenNameCOMMENT_JAVADOC	 Add a list of counted nodes that were built in backwards document order, or a list of counted nodes that are in forwards document order. * @param flist Vector of nodes built in forwards document order @param blist Vector of nodes built in backwards document order 
void	TokenNamevoid	
appendBtoFList	TokenNameIdentifier	 append Bto F List
(	TokenNameLPAREN	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
flist	TokenNameIdentifier	 flist
,	TokenNameCOMMA	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
blist	TokenNameIdentifier	 blist
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
blist	TokenNameIdentifier	 blist
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
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flist	TokenNameIdentifier	 flist
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
blist	TokenNameIdentifier	 blist
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// For diagnostics 	TokenNameCOMMENT_LINE	For diagnostics 
/** Number of counters created so far */	TokenNameCOMMENT_JAVADOC	 Number of counters created so far 
transient	TokenNametransient	
int	TokenNameint	
m_countersMade	TokenNameIdentifier	 m counters Made
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Count forward until the given node is found, or until * we have looked to the given amount. * * @param support The XPath context to use * @param numberElem The given xsl:number element. * @param node The node to count. * * @return The node count, or 0 if not found. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Count forward until the given node is found, or until we have looked to the given amount. * @param support The XPath context to use @param numberElem The given xsl:number element. @param node The node to count. * @return The node count, or 0 if not found. * @throws TransformerException 
public	TokenNamepublic	
int	TokenNameint	
countNode	TokenNameIdentifier	 count Node
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
,	TokenNameCOMMA	
ElemNumber	TokenNameIdentifier	 Elem Number
numberElem	TokenNameIdentifier	 number Elem
,	TokenNameCOMMA	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
counters	TokenNameIdentifier	 counters
=	TokenNameEQUAL	
getCounters	TokenNameIdentifier	 get Counters
(	TokenNameLPAREN	
numberElem	TokenNameIdentifier	 number Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nCounters	TokenNameIdentifier	 n Counters
=	TokenNameEQUAL	
counters	TokenNameIdentifier	 counters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XPath countMatchPattern = numberElem.getCountMatchPattern(support, node); 	TokenNameCOMMENT_LINE	XPath countMatchPattern = numberElem.getCountMatchPattern(support, node); 
// XPath fromMatchPattern = numberElem.m_fromMatchPattern; 	TokenNameCOMMENT_LINE	XPath fromMatchPattern = numberElem.m_fromMatchPattern; 
int	TokenNameint	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
numberElem	TokenNameIdentifier	 number Elem
.	TokenNameDOT	
getTargetNode	TokenNameIdentifier	 get Target Node
(	TokenNameLPAREN	
support	TokenNameIdentifier	 support
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
target	TokenNameIdentifier	 target
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
nCounters	TokenNameIdentifier	 n Counters
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Counter	TokenNameIdentifier	 Counter
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Counter	TokenNameIdentifier	 Counter
)	TokenNameRPAREN	
counters	TokenNameIdentifier	 counters
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
counter	TokenNameIdentifier	 counter
.	TokenNameDOT	
getPreviouslyCounted	TokenNameIdentifier	 get Previously Counted
(	TokenNameLPAREN	
support	TokenNameIdentifier	 support
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// In the loop below, we collect the nodes in backwards doc order, so 	TokenNameCOMMENT_LINE	In the loop below, we collect the nodes in backwards doc order, so 
// we don't have to do inserts, but then we store the nodes in forwards 	TokenNameCOMMENT_LINE	we don't have to do inserts, but then we store the nodes in forwards 
// document order, so we don't have to insert nodes into that list, 	TokenNameCOMMENT_LINE	document order, so we don't have to insert nodes into that list, 
// so that's what the appendBtoFList stuff is all about. In cases 	TokenNameCOMMENT_LINE	so that's what the appendBtoFList stuff is all about. In cases 
// of forward counting by one, this will mean a single node copy from 	TokenNameCOMMENT_LINE	of forward counting by one, this will mean a single node copy from 
// the backwards list (m_newFound) to the forwards list (counter.m_countNodes). 	TokenNameCOMMENT_LINE	the backwards list (m_newFound) to the forwards list (counter.m_countNodes). 
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_newFound	TokenNameIdentifier	 m new Found
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_newFound	TokenNameIdentifier	 m new Found
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
(	TokenNameLPAREN	
support	TokenNameIdentifier	 support
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
numberElem	TokenNameIdentifier	 number Elem
.	TokenNameDOT	
getPreviousNode	TokenNameIdentifier	 get Previous Node
(	TokenNameLPAREN	
support	TokenNameIdentifier	 support
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First time in, we should not have to check for previous counts, 	TokenNameCOMMENT_LINE	First time in, we should not have to check for previous counts, 
// since the original target node was already checked in the 	TokenNameCOMMENT_LINE	since the original target node was already checked in the 
// block above. 	TokenNameCOMMENT_LINE	block above. 
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
count	TokenNameIdentifier	 count
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
nCounters	TokenNameIdentifier	 n Counters
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Counter	TokenNameIdentifier	 Counter
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Counter	TokenNameIdentifier	 Counter
)	TokenNameRPAREN	
counters	TokenNameIdentifier	 counters
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
cacheLen	TokenNameIdentifier	 cache Len
=	TokenNameEQUAL	
counter	TokenNameIdentifier	 counter
.	TokenNameDOT	
m_countNodes	TokenNameIdentifier	 m count Nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cacheLen	TokenNameIdentifier	 cache Len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
.	TokenNameDOT	
m_countNodes	TokenNameIdentifier	 m count Nodes
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
cacheLen	TokenNameIdentifier	 cache Len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
cacheLen	TokenNameIdentifier	 cache Len
+	TokenNamePLUS	
counter	TokenNameIdentifier	 counter
.	TokenNameDOT	
m_countNodesStartCount	TokenNameIdentifier	 m count Nodes Start Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cacheLen	TokenNameIdentifier	 cache Len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
appendBtoFList	TokenNameIdentifier	 append Bto F List
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
.	TokenNameDOT	
m_countNodes	TokenNameIdentifier	 m count Nodes
,	TokenNameCOMMA	
m_newFound	TokenNameIdentifier	 m new Found
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_newFound	TokenNameIdentifier	 m new Found
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_newFound	TokenNameIdentifier	 m new Found
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If we got to this point, then we didn't find a counter, so make 	TokenNameCOMMENT_LINE	If we got to this point, then we didn't find a counter, so make 
// one and add it to the list. 	TokenNameCOMMENT_LINE	one and add it to the list. 
Counter	TokenNameIdentifier	 Counter
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
new	TokenNamenew	
Counter	TokenNameIdentifier	 Counter
(	TokenNameLPAREN	
numberElem	TokenNameIdentifier	 number Elem
,	TokenNameCOMMA	
new	TokenNamenew	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
(	TokenNameLPAREN	
support	TokenNameIdentifier	 support
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_countersMade	TokenNameIdentifier	 m counters Made
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// for diagnostics 	TokenNameCOMMENT_LINE	for diagnostics 
appendBtoFList	TokenNameIdentifier	 append Bto F List
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
.	TokenNameDOT	
m_countNodes	TokenNameIdentifier	 m count Nodes
,	TokenNameCOMMA	
m_newFound	TokenNameIdentifier	 m new Found
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_newFound	TokenNameIdentifier	 m new Found
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
counters	TokenNameIdentifier	 counters
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
