/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XNodeSet.java 469368 2006-10-31 04:41:36Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XNodeSet.java 469368 2006-10-31 04:41:36Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMManager	TokenNameIdentifier	 DTM Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLString	TokenNameIdentifier	 XML String
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
axes	TokenNameIdentifier	 axes
.	TokenNameDOT	
NodeSequence	TokenNameIdentifier	 Node Sequence
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeIterator	TokenNameIdentifier	 Node Iterator
;	TokenNameSEMICOLON	
/** * This class represents an XPath nodeset object, and is capable of * converting the nodeset to other types, such as a string. * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 This class represents an XPath nodeset object, and is capable of converting the nodeset to other types, such as a string. @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
XNodeSet	TokenNameIdentifier	 X Node Set
extends	TokenNameextends	
NodeSequence	TokenNameIdentifier	 Node Sequence
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1916026368035639667L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Default constructor for derived objects. */	TokenNameCOMMENT_JAVADOC	 Default constructor for derived objects. 
protected	TokenNameprotected	
XNodeSet	TokenNameIdentifier	 X Node Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Construct a XNodeSet object. * * @param val Value of the XNodeSet object */	TokenNameCOMMENT_JAVADOC	 Construct a XNodeSet object. * @param val Value of the XNodeSet object 
public	TokenNamepublic	
XNodeSet	TokenNameIdentifier	 X Node Set
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
instanceof	TokenNameinstanceof	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
XNodeSet	TokenNameIdentifier	 X Node Set
nodeSet	TokenNameIdentifier	 node Set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
setIter	TokenNameIdentifier	 set Iter
(	TokenNameLPAREN	
nodeSet	TokenNameIdentifier	 node Set
.	TokenNameDOT	
m_iter	TokenNameIdentifier	 m iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_dtmMgr	TokenNameIdentifier	 m dtm Mgr
=	TokenNameEQUAL	
nodeSet	TokenNameIdentifier	 node Set
.	TokenNameDOT	
m_dtmMgr	TokenNameIdentifier	 m dtm Mgr
;	TokenNameSEMICOLON	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
nodeSet	TokenNameIdentifier	 node Set
.	TokenNameDOT	
m_last	TokenNameIdentifier	 m last
;	TokenNameSEMICOLON	
// First make sure the DTMIterator val has a cache, 	TokenNameCOMMENT_LINE	First make sure the DTMIterator val has a cache, 
// so if it doesn't have one, make one. 	TokenNameCOMMENT_LINE	so if it doesn't have one, make one. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
nodeSet	TokenNameIdentifier	 node Set
.	TokenNameDOT	
hasCache	TokenNameIdentifier	 has Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
nodeSet	TokenNameIdentifier	 node Set
.	TokenNameDOT	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the cache from val and use it ourselves (we share it). 	TokenNameCOMMENT_LINE	Get the cache from val and use it ourselves (we share it). 
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
nodeSet	TokenNameIdentifier	 node Set
.	TokenNameDOT	
getIteratorCache	TokenNameIdentifier	 get Iterator Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
setIter	TokenNameIdentifier	 set Iter
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a XNodeSet object. * * @param val Value of the XNodeSet object */	TokenNameCOMMENT_JAVADOC	 Construct a XNodeSet object. * @param val Value of the XNodeSet object 
public	TokenNamepublic	
XNodeSet	TokenNameIdentifier	 X Node Set
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setIter	TokenNameIdentifier	 set Iter
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
m_iter	TokenNameIdentifier	 m iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_dtmMgr	TokenNameIdentifier	 m dtm Mgr
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
m_dtmMgr	TokenNameIdentifier	 m dtm Mgr
;	TokenNameSEMICOLON	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
m_last	TokenNameIdentifier	 m last
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
hasCache	TokenNameIdentifier	 has Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
m_obj	TokenNameIdentifier	 m obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an empty XNodeSet object. This is used to create a mutable * nodeset to which random nodes may be added. */	TokenNameCOMMENT_JAVADOC	 Construct an empty XNodeSet object. This is used to create a mutable nodeset to which random nodes may be added. 
public	TokenNamepublic	
XNodeSet	TokenNameIdentifier	 X Node Set
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
dtmMgr	TokenNameIdentifier	 dtm Mgr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
dtmMgr	TokenNameIdentifier	 dtm Mgr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a XNodeSet object for one node. * * @param n Node to add to the new XNodeSet object */	TokenNameCOMMENT_JAVADOC	 Construct a XNodeSet object for one node. * @param n Node to add to the new XNodeSet object 
public	TokenNamepublic	
XNodeSet	TokenNameIdentifier	 X Node Set
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
DTMManager	TokenNameIdentifier	 DTM Manager
dtmMgr	TokenNameIdentifier	 dtm Mgr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
(	TokenNameLPAREN	
dtmMgr	TokenNameIdentifier	 dtm Mgr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_dtmMgr	TokenNameIdentifier	 m dtm Mgr
=	TokenNameEQUAL	
dtmMgr	TokenNameIdentifier	 dtm Mgr
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
)	TokenNameRPAREN	
.	TokenNameDOT	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell that this is a CLASS_NODESET. * * @return type CLASS_NODESET */	TokenNameCOMMENT_JAVADOC	 Tell that this is a CLASS_NODESET. * @return type CLASS_NODESET 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a request type, return the equivalent string. * For diagnostic purposes. * * @return type string "#NODESET" */	TokenNameCOMMENT_JAVADOC	 Given a request type, return the equivalent string. For diagnostic purposes. * @return type string "#NODESET" 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeString	TokenNameIdentifier	 get Type String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"#NODESET"	TokenNameStringLiteral	#NODESET
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get numeric value of the string conversion from a single node. * * @param n Node to convert * * @return numeric value of the string conversion from a single node. */	TokenNameCOMMENT_JAVADOC	 Get numeric value of the string conversion from a single node. * @param n Node to convert * @return numeric value of the string conversion from a single node. 
public	TokenNamepublic	
double	TokenNamedouble	
getNumberFromNode	TokenNameIdentifier	 get Number From Node
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLString	TokenNameIdentifier	 XML String
xstr	TokenNameIdentifier	 xstr
=	TokenNameEQUAL	
m_dtmMgr	TokenNameIdentifier	 m dtm Mgr
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
xstr	TokenNameIdentifier	 xstr
.	TokenNameDOT	
toDouble	TokenNameIdentifier	 to Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a number. * * @return numeric value of the string conversion from the * next node in the NodeSetDTM, or NAN if no node was found */	TokenNameCOMMENT_JAVADOC	 Cast result object to a number. * @return numeric value of the string conversion from the next node in the NodeSetDTM, or NAN if no node was found 
public	TokenNamepublic	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getNumberFromNode	TokenNameIdentifier	 get Number From Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
:	TokenNameCOLON	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a number, but allow side effects, such as the * incrementing of an iterator. * * @return numeric value of the string conversion from the * next node in the NodeSetDTM, or NAN if no node was found */	TokenNameCOMMENT_JAVADOC	 Cast result object to a number, but allow side effects, such as the incrementing of an iterator. * @return numeric value of the string conversion from the next node in the NodeSetDTM, or NAN if no node was found 
public	TokenNamepublic	
double	TokenNamedouble	
numWithSideEffects	TokenNameIdentifier	 num With Side Effects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getNumberFromNode	TokenNameIdentifier	 get Number From Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
:	TokenNameCOLON	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a boolean. * * @return True if there is a next node in the nodeset */	TokenNameCOMMENT_JAVADOC	 Cast result object to a boolean. * @return True if there is a next node in the nodeset 
public	TokenNamepublic	
boolean	TokenNameboolean	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a boolean, but allow side effects, such as the * incrementing of an iterator. * * @return True if there is a next node in the nodeset */	TokenNameCOMMENT_JAVADOC	 Cast result object to a boolean, but allow side effects, such as the incrementing of an iterator. * @return True if there is a next node in the nodeset 
public	TokenNamepublic	
boolean	TokenNameboolean	
boolWithSideEffects	TokenNameIdentifier	 bool With Side Effects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the string conversion from a single node. * * @param n Node to convert * * @return the string conversion from a single node. */	TokenNameCOMMENT_JAVADOC	 Get the string conversion from a single node. * @param n Node to convert * @return the string conversion from a single node. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
getStringFromNode	TokenNameIdentifier	 get String From Node
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %OPT% 	TokenNameCOMMENT_LINE	%OPT% 
// I guess we'll have to get a static instance of the DTM manager... 	TokenNameCOMMENT_LINE	I guess we'll have to get a static instance of the DTM manager... 
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dtmMgr	TokenNameIdentifier	 m dtm Mgr
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XString	TokenNameIdentifier	 X String
.	TokenNameDOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Directly call the * characters method on the passed ContentHandler for the * string-value. Multiple calls to the * ContentHandler's characters methods may well occur for a single call to * this method. * * @param ch A non-null reference to a ContentHandler. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Directly call the characters method on the passed ContentHandler for the string-value. Multiple calls to the ContentHandler's characters methods may well occur for a single call to this method. * @param ch A non-null reference to a ContentHandler. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dtmMgr	TokenNameIdentifier	 m dtm Mgr
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Cast result object to an XMLString. * * @return The document fragment node data or the empty string. */	TokenNameCOMMENT_JAVADOC	 Cast result object to an XMLString. * @return The document fragment node data or the empty string. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getStringFromNode	TokenNameIdentifier	 get String From Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
:	TokenNameCOLON	
XString	TokenNameIdentifier	 X String
.	TokenNameDOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a string. * * @return The string this wraps or the empty string if null */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * @return The string this wraps or the empty string if null 
public	TokenNamepublic	
void	TokenNamevoid	
appendToFsb	TokenNameIdentifier	 append To Fsb
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
fsb	TokenNameIdentifier	 fsb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XString	TokenNameIdentifier	 X String
xstring	TokenNameIdentifier	 xstring
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XString	TokenNameIdentifier	 X String
)	TokenNameRPAREN	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xstring	TokenNameIdentifier	 xstring
.	TokenNameDOT	
appendToFsb	TokenNameIdentifier	 append To Fsb
(	TokenNameLPAREN	
fsb	TokenNameIdentifier	 fsb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a string. * * @return the string conversion from the next node in the nodeset * or "" if there is no next node */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * @return the string conversion from the next node in the nodeset or "" if there is no next node 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getStringFromNode	TokenNameIdentifier	 get String From Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a java object that's closest to the representation * that should be handed to an extension. * * @return The object that this class wraps */	TokenNameCOMMENT_JAVADOC	 Return a java object that's closest to the representation that should be handed to an extension. * @return The object that this class wraps 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_obj	TokenNameIdentifier	 m obj
)	TokenNameRPAREN	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_obj	TokenNameIdentifier	 m obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// %REVIEW% 	TokenNameCOMMENT_LINE	%REVIEW% 
// hmmm... 	TokenNameCOMMENT_LINE	hmmm... 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Cast result object to a result tree fragment. 	TokenNameCOMMENT_LINE	* Cast result object to a result tree fragment. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param support The XPath context to use for the conversion 	TokenNameCOMMENT_LINE	* @param support The XPath context to use for the conversion 
// * 	TokenNameCOMMENT_LINE	* 
// * @return the nodeset as a result tree fragment. 	TokenNameCOMMENT_LINE	* @return the nodeset as a result tree fragment. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public DocumentFragment rtree(XPathContext support) 	TokenNameCOMMENT_LINE	public DocumentFragment rtree(XPathContext support) 
// { 	TokenNameCOMMENT_LINE	{ 
// DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); 	TokenNameCOMMENT_LINE	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); 
// DocumentBuilder db = dbf.newDocumentBuilder(); 	TokenNameCOMMENT_LINE	DocumentBuilder db = dbf.newDocumentBuilder(); 
// Document myDoc = db.newDocument(); 	TokenNameCOMMENT_LINE	Document myDoc = db.newDocument(); 
// 	TokenNameCOMMENT_LINE	 
// DocumentFragment docFrag = myDoc.createDocumentFragment(); 	TokenNameCOMMENT_LINE	DocumentFragment docFrag = myDoc.createDocumentFragment(); 
// 	TokenNameCOMMENT_LINE	 
// DTMIterator nl = iter(); 	TokenNameCOMMENT_LINE	DTMIterator nl = iter(); 
// int node; 	TokenNameCOMMENT_LINE	int node; 
// 	TokenNameCOMMENT_LINE	 
// while (DTM.NULL != (node = nl.nextNode())) 	TokenNameCOMMENT_LINE	while (DTM.NULL != (node = nl.nextNode())) 
// { 	TokenNameCOMMENT_LINE	{ 
// frag.appendChild(node, true, true); 	TokenNameCOMMENT_LINE	frag.appendChild(node, true, true); 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// return frag.getDocument(); 	TokenNameCOMMENT_LINE	return frag.getDocument(); 
// } 	TokenNameCOMMENT_LINE	} 
/** * Cast result object to a nodelist. * * @return a NodeIterator. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Cast result object to a nodelist. * @return a NodeIterator. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
NodeIterator	TokenNameIdentifier	 Node Iterator
nodeset	TokenNameIdentifier	 nodeset
(	TokenNameLPAREN	
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
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMNodeIterator	TokenNameIdentifier	 DTM Node Iterator
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a nodelist. * * @return a NodeList. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Cast result object to a nodelist. * @return a NodeList. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
nodelist	TokenNameIdentifier	 nodelist
(	TokenNameLPAREN	
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMNodeList	TokenNameIdentifier	 DTM Node List
nodelist	TokenNameIdentifier	 nodelist
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMNodeList	TokenNameIdentifier	 DTM Node List
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Creating a DTMNodeList has the side-effect that it will create a clone 	TokenNameCOMMENT_LINE	Creating a DTMNodeList has the side-effect that it will create a clone 
// XNodeSet with cache and run m_iter to the end. You cannot get any node 	TokenNameCOMMENT_LINE	XNodeSet with cache and run m_iter to the end. You cannot get any node 
// from m_iter after this call. As a fix, we call SetVector() on the clone's 	TokenNameCOMMENT_LINE	from m_iter after this call. As a fix, we call SetVector() on the clone's 
// cache. See Bugzilla 14406. 	TokenNameCOMMENT_LINE	cache. See Bugzilla 14406. 
XNodeSet	TokenNameIdentifier	 X Node Set
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
nodelist	TokenNameIdentifier	 nodelist
.	TokenNameDOT	
getDTMIterator	TokenNameIdentifier	 get DTM Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SetVector	TokenNameIdentifier	 Set Vector
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nodelist	TokenNameIdentifier	 nodelist
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Return a java object that's closest to the representation 	TokenNameCOMMENT_LINE	* Return a java object that's closest to the representation 
// * that should be handed to an extension. 	TokenNameCOMMENT_LINE	* that should be handed to an extension. 
// * 	TokenNameCOMMENT_LINE	* 
// * @return The object that this class wraps 	TokenNameCOMMENT_LINE	* @return The object that this class wraps 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public Object object() 	TokenNameCOMMENT_LINE	public Object object() 
// { 	TokenNameCOMMENT_LINE	{ 
// return new org.apache.xml.dtm.ref.DTMNodeList(iter()); 	TokenNameCOMMENT_LINE	return new org.apache.xml.dtm.ref.DTMNodeList(iter()); 
// } 	TokenNameCOMMENT_LINE	} 
/** * Return the iterator without cloning, etc. */	TokenNameCOMMENT_JAVADOC	 Return the iterator without cloning, etc. 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
iterRaw	TokenNameIdentifier	 iter Raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Cast result object to a nodelist. * * @return The nodeset as a nodelist */	TokenNameCOMMENT_JAVADOC	 Cast result object to a nodelist. * @return The nodeset as a nodelist 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
iter	TokenNameIdentifier	 iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasCache	TokenNameIdentifier	 has Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
// don't bother to clone... won't do any good! 	TokenNameCOMMENT_LINE	don't bother to clone... won't do any good! 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
cnse	TokenNameIdentifier	 cnse
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get a fresh copy of the object. For use with variables. * * @return A fresh nodelist. */	TokenNameCOMMENT_JAVADOC	 Get a fresh copy of the object. For use with variables. * @return A fresh nodelist. 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
getFresh	TokenNameIdentifier	 get Fresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasCache	TokenNameIdentifier	 has Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
// don't bother to clone... won't do any good! 	TokenNameCOMMENT_LINE	don't bother to clone... won't do any good! 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
cnse	TokenNameIdentifier	 cnse
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Cast result object to a mutableNodeset. * * @return The nodeset as a mutableNodeset */	TokenNameCOMMENT_JAVADOC	 Cast result object to a mutableNodeset. * @return The nodeset as a mutableNodeset 
public	TokenNamepublic	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
mutableNodeset	TokenNameIdentifier	 mutable Nodeset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
mnl	TokenNameIdentifier	 mnl
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_obj	TokenNameIdentifier	 m obj
instanceof	TokenNameinstanceof	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mnl	TokenNameIdentifier	 mnl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
mnl	TokenNameIdentifier	 mnl
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
mnl	TokenNameIdentifier	 mnl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setCurrentPos	TokenNameIdentifier	 set Current Pos
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
mnl	TokenNameIdentifier	 mnl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Less than comparator */	TokenNameCOMMENT_JAVADOC	 Less than comparator 
static	TokenNamestatic	
final	TokenNamefinal	
LessThanComparator	TokenNameIdentifier	 Less Than Comparator
S_LT	TokenNameIdentifier	 S  LT
=	TokenNameEQUAL	
new	TokenNamenew	
LessThanComparator	TokenNameIdentifier	 Less Than Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Less than or equal comparator */	TokenNameCOMMENT_JAVADOC	 Less than or equal comparator 
static	TokenNamestatic	
final	TokenNamefinal	
LessThanOrEqualComparator	TokenNameIdentifier	 Less Than Or Equal Comparator
S_LTE	TokenNameIdentifier	 S  LTE
=	TokenNameEQUAL	
new	TokenNamenew	
LessThanOrEqualComparator	TokenNameIdentifier	 Less Than Or Equal Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Greater than comparator */	TokenNameCOMMENT_JAVADOC	 Greater than comparator 
static	TokenNamestatic	
final	TokenNamefinal	
GreaterThanComparator	TokenNameIdentifier	 Greater Than Comparator
S_GT	TokenNameIdentifier	 S  GT
=	TokenNameEQUAL	
new	TokenNamenew	
GreaterThanComparator	TokenNameIdentifier	 Greater Than Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Greater than or equal comparator */	TokenNameCOMMENT_JAVADOC	 Greater than or equal comparator 
static	TokenNamestatic	
final	TokenNamefinal	
GreaterThanOrEqualComparator	TokenNameIdentifier	 Greater Than Or Equal Comparator
S_GTE	TokenNameIdentifier	 S  GTE
=	TokenNameEQUAL	
new	TokenNamenew	
GreaterThanOrEqualComparator	TokenNameIdentifier	 Greater Than Or Equal Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Equal comparator */	TokenNameCOMMENT_JAVADOC	 Equal comparator 
static	TokenNamestatic	
final	TokenNamefinal	
EqualComparator	TokenNameIdentifier	 Equal Comparator
S_EQ	TokenNameIdentifier	 S  EQ
=	TokenNameEQUAL	
new	TokenNamenew	
EqualComparator	TokenNameIdentifier	 Equal Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Not equal comparator */	TokenNameCOMMENT_JAVADOC	 Not equal comparator 
static	TokenNamestatic	
final	TokenNamefinal	
NotEqualComparator	TokenNameIdentifier	 Not Equal Comparator
S_NEQ	TokenNameIdentifier	 S  NEQ
=	TokenNameEQUAL	
new	TokenNamenew	
NotEqualComparator	TokenNameIdentifier	 Not Equal Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Tell if one object is less than the other. * * @param obj2 Object to compare this nodeset to * @param comparator Comparator to use * * @return See the comments below for each object type comparison * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if one object is less than the other. * @param obj2 Object to compare this nodeset to @param comparator Comparator to use * @return See the comments below for each object type comparison * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
comparator	TokenNameIdentifier	 comparator
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
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %OPT% This should be XMLString based instead of string based... 	TokenNameCOMMENT_LINE	%OPT% This should be XMLString based instead of string based... 
// From http://www.w3.org/TR/xpath: 	TokenNameCOMMENT_LINE	From http://www.w3.org/TR/xpath: 
// If both objects to be compared are node-sets, then the comparison 	TokenNameCOMMENT_LINE	If both objects to be compared are node-sets, then the comparison 
// will be true if and only if there is a node in the first node-set 	TokenNameCOMMENT_LINE	will be true if and only if there is a node in the first node-set 
// and a node in the second node-set such that the result of performing 	TokenNameCOMMENT_LINE	and a node in the second node-set such that the result of performing 
// the comparison on the string-values of the two nodes is true. 	TokenNameCOMMENT_LINE	the comparison on the string-values of the two nodes is true. 
// Note this little gem from the draft: 	TokenNameCOMMENT_LINE	Note this little gem from the draft: 
// NOTE: If $x is bound to a node-set, then $x="foo" 	TokenNameCOMMENT_LINE	NOTE: If $x is bound to a node-set, then $x="foo" 
// does not mean the same as not($x!="foo"): the former 	TokenNameCOMMENT_LINE	does not mean the same as not($x!="foo"): the former 
// is true if and only if some node in $x has the string-value 	TokenNameCOMMENT_LINE	is true if and only if some node in $x has the string-value 
// foo; the latter is true if and only if all nodes in $x have 	TokenNameCOMMENT_LINE	foo; the latter is true if and only if all nodes in $x have 
// the string-value foo. 	TokenNameCOMMENT_LINE	the string-value foo. 
DTMIterator	TokenNameIdentifier	 DTM Iterator
list1	TokenNameIdentifier	 list1
=	TokenNameEQUAL	
iterRaw	TokenNameIdentifier	 iter Raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTMIterator	TokenNameIdentifier	 DTM Iterator
list2	TokenNameIdentifier	 list2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
.	TokenNameDOT	
iterRaw	TokenNameIdentifier	 iter Raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
node1	TokenNameIdentifier	 node1
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
node2Strings	TokenNameIdentifier	 node2 Strings
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
node1	TokenNameIdentifier	 node1
=	TokenNameEQUAL	
list1	TokenNameIdentifier	 list1
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLString	TokenNameIdentifier	 XML String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
getStringFromNode	TokenNameIdentifier	 get String From Node
(	TokenNameLPAREN	
node1	TokenNameIdentifier	 node1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
node2Strings	TokenNameIdentifier	 node2 Strings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node2	TokenNameIdentifier	 node2
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
node2	TokenNameIdentifier	 node2
=	TokenNameEQUAL	
list2	TokenNameIdentifier	 list2
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLString	TokenNameIdentifier	 XML String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
getStringFromNode	TokenNameIdentifier	 get String From Node
(	TokenNameLPAREN	
node2	TokenNameIdentifier	 node2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compareStrings	TokenNameIdentifier	 compare Strings
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
node2Strings	TokenNameIdentifier	 node2 Strings
)	TokenNameRPAREN	
node2Strings	TokenNameIdentifier	 node2 Strings
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node2Strings	TokenNameIdentifier	 node2 Strings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
node2Strings	TokenNameIdentifier	 node2 Strings
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
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compareStrings	TokenNameIdentifier	 compare Strings
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
)	TokenNameRPAREN	
node2Strings	TokenNameIdentifier	 node2 Strings
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
list1	TokenNameIdentifier	 list1
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list2	TokenNameIdentifier	 list2
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_BOOLEAN	TokenNameIdentifier	 CLASS  BOOLEAN
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// From http://www.w3.org/TR/xpath: 	TokenNameCOMMENT_LINE	From http://www.w3.org/TR/xpath: 
// If one object to be compared is a node-set and the other is a boolean, 	TokenNameCOMMENT_LINE	If one object to be compared is a node-set and the other is a boolean, 
// then the comparison will be true if and only if the result of 	TokenNameCOMMENT_LINE	then the comparison will be true if and only if the result of 
// performing the comparison on the boolean and on the result of 	TokenNameCOMMENT_LINE	performing the comparison on the boolean and on the result of 
// converting the node-set to a boolean using the boolean function 	TokenNameCOMMENT_LINE	converting the node-set to a boolean using the boolean function 
// is true. 	TokenNameCOMMENT_LINE	is true. 
double	TokenNamedouble	
num1	TokenNameIdentifier	 num1
=	TokenNameEQUAL	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
1.0	TokenNameDoubleLiteral	
:	TokenNameCOLON	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
num2	TokenNameIdentifier	 num2
=	TokenNameEQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compareNumbers	TokenNameIdentifier	 compare Numbers
(	TokenNameLPAREN	
num1	TokenNameIdentifier	 num1
,	TokenNameCOMMA	
num2	TokenNameIdentifier	 num2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NUMBER	TokenNameIdentifier	 CLASS  NUMBER
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// From http://www.w3.org/TR/xpath: 	TokenNameCOMMENT_LINE	From http://www.w3.org/TR/xpath: 
// If one object to be compared is a node-set and the other is a number, 	TokenNameCOMMENT_LINE	If one object to be compared is a node-set and the other is a number, 
// then the comparison will be true if and only if there is a 	TokenNameCOMMENT_LINE	then the comparison will be true if and only if there is a 
// node in the node-set such that the result of performing the 	TokenNameCOMMENT_LINE	node in the node-set such that the result of performing the 
// comparison on the number to be compared and on the result of 	TokenNameCOMMENT_LINE	comparison on the number to be compared and on the result of 
// converting the string-value of that node to a number using 	TokenNameCOMMENT_LINE	converting the string-value of that node to a number using 
// the number function is true. 	TokenNameCOMMENT_LINE	the number function is true. 
DTMIterator	TokenNameIdentifier	 DTM Iterator
list1	TokenNameIdentifier	 list1
=	TokenNameEQUAL	
iterRaw	TokenNameIdentifier	 iter Raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
num2	TokenNameIdentifier	 num2
=	TokenNameEQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
list1	TokenNameIdentifier	 list1
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
num1	TokenNameIdentifier	 num1
=	TokenNameEQUAL	
getNumberFromNode	TokenNameIdentifier	 get Number From Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compareNumbers	TokenNameIdentifier	 compare Numbers
(	TokenNameLPAREN	
num1	TokenNameIdentifier	 num1
,	TokenNameCOMMA	
num2	TokenNameIdentifier	 num2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
list1	TokenNameIdentifier	 list1
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_RTREEFRAG	TokenNameIdentifier	 CLASS  RTREEFRAG
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLString	TokenNameIdentifier	 XML String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTMIterator	TokenNameIdentifier	 DTM Iterator
list1	TokenNameIdentifier	 list1
=	TokenNameEQUAL	
iterRaw	TokenNameIdentifier	 iter Raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
list1	TokenNameIdentifier	 list1
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLString	TokenNameIdentifier	 XML String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
getStringFromNode	TokenNameIdentifier	 get String From Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compareStrings	TokenNameIdentifier	 compare Strings
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
list1	TokenNameIdentifier	 list1
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_STRING	TokenNameIdentifier	 CLASS  STRING
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// From http://www.w3.org/TR/xpath: 	TokenNameCOMMENT_LINE	From http://www.w3.org/TR/xpath: 
// If one object to be compared is a node-set and the other is a 	TokenNameCOMMENT_LINE	If one object to be compared is a node-set and the other is a 
// string, then the comparison will be true if and only if there 	TokenNameCOMMENT_LINE	string, then the comparison will be true if and only if there 
// is a node in the node-set such that the result of performing 	TokenNameCOMMENT_LINE	is a node in the node-set such that the result of performing 
// the comparison on the string-value of the node and the other 	TokenNameCOMMENT_LINE	the comparison on the string-value of the node and the other 
// string is true. 	TokenNameCOMMENT_LINE	string is true. 
XMLString	TokenNameIdentifier	 XML String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTMIterator	TokenNameIdentifier	 DTM Iterator
list1	TokenNameIdentifier	 list1
=	TokenNameEQUAL	
iterRaw	TokenNameIdentifier	 iter Raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
list1	TokenNameIdentifier	 list1
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLString	TokenNameIdentifier	 XML String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
getStringFromNode	TokenNameIdentifier	 get String From Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compareStrings	TokenNameIdentifier	 compare Strings
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
list1	TokenNameIdentifier	 list1
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compareNumbers	TokenNameIdentifier	 compare Numbers
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if one object is less than the other. * * @param obj2 object to compare this nodeset to * * @return see this.compare(...) * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if one object is less than the other. * @param obj2 object to compare this nodeset to * @return see this.compare(...) * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
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
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
,	TokenNameCOMMA	
S_LT	TokenNameIdentifier	 S  LT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if one object is less than or equal to the other. * * @param obj2 object to compare this nodeset to * * @return see this.compare(...) * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if one object is less than or equal to the other. * @param obj2 object to compare this nodeset to * @return see this.compare(...) * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
lessThanOrEqual	TokenNameIdentifier	 less Than Or Equal
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
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
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
,	TokenNameCOMMA	
S_LTE	TokenNameIdentifier	 S  LTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if one object is less than the other. * * @param obj2 object to compare this nodeset to * * @return see this.compare(...) * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if one object is less than the other. * @param obj2 object to compare this nodeset to * @return see this.compare(...) * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
greaterThan	TokenNameIdentifier	 greater Than
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
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
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
,	TokenNameCOMMA	
S_GT	TokenNameIdentifier	 S  GT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if one object is less than the other. * * @param obj2 object to compare this nodeset to * * @return see this.compare(...) * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if one object is less than the other. * @param obj2 object to compare this nodeset to * @return see this.compare(...) * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
greaterThanOrEqual	TokenNameIdentifier	 greater Than Or Equal
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
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
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
,	TokenNameCOMMA	
S_GTE	TokenNameIdentifier	 S  GTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if two objects are functionally equal. * * @param obj2 object to compare this nodeset to * * @return see this.compare(...) * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if two objects are functionally equal. * @param obj2 object to compare this nodeset to * @return see this.compare(...) * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
,	TokenNameCOMMA	
S_EQ	TokenNameIdentifier	 S  EQ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
te	TokenNameIdentifier	 te
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
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tell if two objects are functionally not equal. * * @param obj2 object to compare this nodeset to * * @return see this.compare(...) * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if two objects are functionally not equal. * @param obj2 object to compare this nodeset to * @return see this.compare(...) * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
notEquals	TokenNameIdentifier	 not Equals
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
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
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
,	TokenNameCOMMA	
S_NEQ	TokenNameIdentifier	 S  NEQ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * compares nodes for various boolean operations. */	TokenNameCOMMENT_JAVADOC	 compares nodes for various boolean operations. 
abstract	TokenNameabstract	
class	TokenNameclass	
Comparator	TokenNameIdentifier	 Comparator
{	TokenNameLBRACE	
/** * Compare two strings * * * @param s1 First string to compare * @param s2 Second String to compare * * @return Whether the strings are equal or not */	TokenNameCOMMENT_JAVADOC	 Compare two strings * @param s1 First string to compare @param s2 Second String to compare * @return Whether the strings are equal or not 
abstract	TokenNameabstract	
boolean	TokenNameboolean	
compareStrings	TokenNameIdentifier	 compare Strings
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Compare two numbers * * * @param n1 First number to compare * @param n2 Second number to compare * * @return Whether the numbers are equal or not */	TokenNameCOMMENT_JAVADOC	 Compare two numbers * @param n1 First number to compare @param n2 Second number to compare * @return Whether the numbers are equal or not 
abstract	TokenNameabstract	
boolean	TokenNameboolean	
compareNumbers	TokenNameIdentifier	 compare Numbers
(	TokenNameLPAREN	
double	TokenNamedouble	
n1	TokenNameIdentifier	 n1
,	TokenNameCOMMA	
double	TokenNamedouble	
n2	TokenNameIdentifier	 n2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compare strings or numbers for less than. */	TokenNameCOMMENT_JAVADOC	 Compare strings or numbers for less than. 
class	TokenNameclass	
LessThanComparator	TokenNameIdentifier	 Less Than Comparator
extends	TokenNameextends	
Comparator	TokenNameIdentifier	 Comparator
{	TokenNameLBRACE	
/** * Compare two strings for less than. * * * @param s1 First string to compare * @param s2 Second String to compare * * @return True if s1 is less than s2 */	TokenNameCOMMENT_JAVADOC	 Compare two strings for less than. * @param s1 First string to compare @param s2 Second String to compare * @return True if s1 is less than s2 
boolean	TokenNameboolean	
compareStrings	TokenNameIdentifier	 compare Strings
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
toDouble	TokenNameIdentifier	 to Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
s2	TokenNameIdentifier	 s2
.	TokenNameDOT	
toDouble	TokenNameIdentifier	 to Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return s1.compareTo(s2) < 0; 	TokenNameCOMMENT_LINE	return s1.compareTo(s2) < 0; 
}	TokenNameRBRACE	
/** * Compare two numbers for less than. * * * @param n1 First number to compare * @param n2 Second number to compare * * @return true if n1 is less than n2 */	TokenNameCOMMENT_JAVADOC	 Compare two numbers for less than. * @param n1 First number to compare @param n2 Second number to compare * @return true if n1 is less than n2 
boolean	TokenNameboolean	
compareNumbers	TokenNameIdentifier	 compare Numbers
(	TokenNameLPAREN	
double	TokenNamedouble	
n1	TokenNameIdentifier	 n1
,	TokenNameCOMMA	
double	TokenNamedouble	
n2	TokenNameIdentifier	 n2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n1	TokenNameIdentifier	 n1
<	TokenNameLESS	
n2	TokenNameIdentifier	 n2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Compare strings or numbers for less than or equal. */	TokenNameCOMMENT_JAVADOC	 Compare strings or numbers for less than or equal. 
class	TokenNameclass	
LessThanOrEqualComparator	TokenNameIdentifier	 Less Than Or Equal Comparator
extends	TokenNameextends	
Comparator	TokenNameIdentifier	 Comparator
{	TokenNameLBRACE	
/** * Compare two strings for less than or equal. * * * @param s1 First string to compare * @param s2 Second String to compare * * @return true if s1 is less than or equal to s2 */	TokenNameCOMMENT_JAVADOC	 Compare two strings for less than or equal. * @param s1 First string to compare @param s2 Second String to compare * @return true if s1 is less than or equal to s2 
boolean	TokenNameboolean	
compareStrings	TokenNameIdentifier	 compare Strings
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
toDouble	TokenNameIdentifier	 to Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
s2	TokenNameIdentifier	 s2
.	TokenNameDOT	
toDouble	TokenNameIdentifier	 to Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return s1.compareTo(s2) <= 0; 	TokenNameCOMMENT_LINE	return s1.compareTo(s2) <= 0; 
}	TokenNameRBRACE	
/** * Compare two numbers for less than or equal. * * * @param n1 First number to compare * @param n2 Second number to compare * * @return true if n1 is less than or equal to n2 */	TokenNameCOMMENT_JAVADOC	 Compare two numbers for less than or equal. * @param n1 First number to compare @param n2 Second number to compare * @return true if n1 is less than or equal to n2 
boolean	TokenNameboolean	
compareNumbers	TokenNameIdentifier	 compare Numbers
(	TokenNameLPAREN	
double	TokenNamedouble	
n1	TokenNameIdentifier	 n1
,	TokenNameCOMMA	
double	TokenNamedouble	
n2	TokenNameIdentifier	 n2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n1	TokenNameIdentifier	 n1
<=	TokenNameLESS_EQUAL	
n2	TokenNameIdentifier	 n2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Compare strings or numbers for greater than. */	TokenNameCOMMENT_JAVADOC	 Compare strings or numbers for greater than. 
class	TokenNameclass	
GreaterThanComparator	TokenNameIdentifier	 Greater Than Comparator
extends	TokenNameextends	
Comparator	TokenNameIdentifier	 Comparator
{	TokenNameLBRACE	
/** * Compare two strings for greater than. * * * @param s1 First string to compare * @param s2 Second String to compare * * @return true if s1 is greater than s2 */	TokenNameCOMMENT_JAVADOC	 Compare two strings for greater than. * @param s1 First string to compare @param s2 Second String to compare * @return true if s1 is greater than s2 
boolean	TokenNameboolean	
compareStrings	TokenNameIdentifier	 compare Strings
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
toDouble	TokenNameIdentifier	 to Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
s2	TokenNameIdentifier	 s2
.	TokenNameDOT	
toDouble	TokenNameIdentifier	 to Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return s1.compareTo(s2) > 0; 	TokenNameCOMMENT_LINE	return s1.compareTo(s2) > 0; 
}	TokenNameRBRACE	
/** * Compare two numbers for greater than. * * * @param n1 First number to compare * @param n2 Second number to compare * * @return true if n1 is greater than n2 */	TokenNameCOMMENT_JAVADOC	 Compare two numbers for greater than. * @param n1 First number to compare @param n2 Second number to compare * @return true if n1 is greater than n2 
boolean	TokenNameboolean	
compareNumbers	TokenNameIdentifier	 compare Numbers
(	TokenNameLPAREN	
double	TokenNamedouble	
n1	TokenNameIdentifier	 n1
,	TokenNameCOMMA	
double	TokenNamedouble	
n2	TokenNameIdentifier	 n2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n1	TokenNameIdentifier	 n1
>	TokenNameGREATER	
n2	TokenNameIdentifier	 n2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Compare strings or numbers for greater than or equal. */	TokenNameCOMMENT_JAVADOC	 Compare strings or numbers for greater than or equal. 
class	TokenNameclass	
GreaterThanOrEqualComparator	TokenNameIdentifier	 Greater Than Or Equal Comparator
extends	TokenNameextends	
Comparator	TokenNameIdentifier	 Comparator
{	TokenNameLBRACE	
/** * Compare two strings for greater than or equal. * * * @param s1 First string to compare * @param s2 Second String to compare * * @return true if s1 is greater than or equal to s2 */	TokenNameCOMMENT_JAVADOC	 Compare two strings for greater than or equal. * @param s1 First string to compare @param s2 Second String to compare * @return true if s1 is greater than or equal to s2 
boolean	TokenNameboolean	
compareStrings	TokenNameIdentifier	 compare Strings
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
toDouble	TokenNameIdentifier	 to Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
s2	TokenNameIdentifier	 s2
.	TokenNameDOT	
toDouble	TokenNameIdentifier	 to Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return s1.compareTo(s2) >= 0; 	TokenNameCOMMENT_LINE	return s1.compareTo(s2) >= 0; 
}	TokenNameRBRACE	
/** * Compare two numbers for greater than or equal. * * * @param n1 First number to compare * @param n2 Second number to compare * * @return true if n1 is greater than or equal to n2 */	TokenNameCOMMENT_JAVADOC	 Compare two numbers for greater than or equal. * @param n1 First number to compare @param n2 Second number to compare * @return true if n1 is greater than or equal to n2 
boolean	TokenNameboolean	
compareNumbers	TokenNameIdentifier	 compare Numbers
(	TokenNameLPAREN	
double	TokenNamedouble	
n1	TokenNameIdentifier	 n1
,	TokenNameCOMMA	
double	TokenNamedouble	
n2	TokenNameIdentifier	 n2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n1	TokenNameIdentifier	 n1
>=	TokenNameGREATER_EQUAL	
n2	TokenNameIdentifier	 n2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Compare strings or numbers for equality. */	TokenNameCOMMENT_JAVADOC	 Compare strings or numbers for equality. 
class	TokenNameclass	
EqualComparator	TokenNameIdentifier	 Equal Comparator
extends	TokenNameextends	
Comparator	TokenNameIdentifier	 Comparator
{	TokenNameLBRACE	
/** * Compare two strings for equality. * * * @param s1 First string to compare * @param s2 Second String to compare * * @return true if s1 is equal to s2 */	TokenNameCOMMENT_JAVADOC	 Compare two strings for equality. * @param s1 First string to compare @param s2 Second String to compare * @return true if s1 is equal to s2 
boolean	TokenNameboolean	
compareStrings	TokenNameIdentifier	 compare Strings
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compare two numbers for equality. * * * @param n1 First number to compare * @param n2 Second number to compare * * @return true if n1 is equal to n2 */	TokenNameCOMMENT_JAVADOC	 Compare two numbers for equality. * @param n1 First number to compare @param n2 Second number to compare * @return true if n1 is equal to n2 
boolean	TokenNameboolean	
compareNumbers	TokenNameIdentifier	 compare Numbers
(	TokenNameLPAREN	
double	TokenNamedouble	
n1	TokenNameIdentifier	 n1
,	TokenNameCOMMA	
double	TokenNamedouble	
n2	TokenNameIdentifier	 n2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n1	TokenNameIdentifier	 n1
==	TokenNameEQUAL_EQUAL	
n2	TokenNameIdentifier	 n2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Compare strings or numbers for non-equality. */	TokenNameCOMMENT_JAVADOC	 Compare strings or numbers for non-equality. 
class	TokenNameclass	
NotEqualComparator	TokenNameIdentifier	 Not Equal Comparator
extends	TokenNameextends	
Comparator	TokenNameIdentifier	 Comparator
{	TokenNameLBRACE	
/** * Compare two strings for non-equality. * * * @param s1 First string to compare * @param s2 Second String to compare * * @return true if s1 is not equal to s2 */	TokenNameCOMMENT_JAVADOC	 Compare two strings for non-equality. * @param s1 First string to compare @param s2 Second String to compare * @return true if s1 is not equal to s2 
boolean	TokenNameboolean	
compareStrings	TokenNameIdentifier	 compare Strings
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compare two numbers for non-equality. * * * @param n1 First number to compare * @param n2 Second number to compare * * @return true if n1 is not equal to n2 */	TokenNameCOMMENT_JAVADOC	 Compare two numbers for non-equality. * @param n1 First number to compare @param n2 Second number to compare * @return true if n1 is not equal to n2 
boolean	TokenNameboolean	
compareNumbers	TokenNameIdentifier	 compare Numbers
(	TokenNameLPAREN	
double	TokenNamedouble	
n1	TokenNameIdentifier	 n1
,	TokenNameCOMMA	
double	TokenNamedouble	
n2	TokenNameIdentifier	 n2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n1	TokenNameIdentifier	 n1
!=	TokenNameNOT_EQUAL	
n2	TokenNameIdentifier	 n2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
