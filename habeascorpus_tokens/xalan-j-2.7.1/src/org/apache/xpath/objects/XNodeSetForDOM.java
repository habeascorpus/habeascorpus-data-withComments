/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XNodeSetForDOM.java 469368 2006-10-31 04:41:36Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XNodeSetForDOM.java 469368 2006-10-31 04:41:36Z minchau $ 
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
DTMManager	TokenNameIdentifier	 DTM Manager
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
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
/** * This class overrides the XNodeSet#object() method to provide the original * Node object, NodeList object, or NodeIterator. */	TokenNameCOMMENT_JAVADOC	 This class overrides the XNodeSet#object() method to provide the original Node object, NodeList object, or NodeIterator. 
public	TokenNamepublic	
class	TokenNameclass	
XNodeSetForDOM	TokenNameIdentifier	 X Node Set For DOM
extends	TokenNameextends	
XNodeSet	TokenNameIdentifier	 X Node Set
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
8396190713754624640L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
m_origObj	TokenNameIdentifier	 m orig Obj
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XNodeSetForDOM	TokenNameIdentifier	 X Node Set For DOM
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
DTMManager	TokenNameIdentifier	 DTM Manager
dtmMgr	TokenNameIdentifier	 dtm Mgr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dtmMgr	TokenNameIdentifier	 m dtm Mgr
=	TokenNameEQUAL	
dtmMgr	TokenNameIdentifier	 dtm Mgr
;	TokenNameSEMICOLON	
m_origObj	TokenNameIdentifier	 m orig Obj
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
int	TokenNameint	
dtmHandle	TokenNameIdentifier	 dtm Handle
=	TokenNameEQUAL	
dtmMgr	TokenNameIdentifier	 dtm Mgr
.	TokenNameDOT	
getDTMHandleFromNode	TokenNameIdentifier	 get DTM Handle From Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
new	TokenNamenew	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
(	TokenNameLPAREN	
dtmMgr	TokenNameIdentifier	 dtm Mgr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
)	TokenNameRPAREN	
.	TokenNameDOT	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
dtmHandle	TokenNameIdentifier	 dtm Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a XNodeSet object. * * @param val Value of the XNodeSet object */	TokenNameCOMMENT_JAVADOC	 Construct a XNodeSet object. * @param val Value of the XNodeSet object 
public	TokenNamepublic	
XNodeSetForDOM	TokenNameIdentifier	 X Node Set For DOM
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
instanceof	TokenNameinstanceof	
XNodeSetForDOM	TokenNameIdentifier	 X Node Set For DOM
)	TokenNameRPAREN	
m_origObj	TokenNameIdentifier	 m orig Obj
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XNodeSetForDOM	TokenNameIdentifier	 X Node Set For DOM
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
.	TokenNameDOT	
m_origObj	TokenNameIdentifier	 m orig Obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XNodeSetForDOM	TokenNameIdentifier	 X Node Set For DOM
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nodeList	TokenNameIdentifier	 node List
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dtmMgr	TokenNameIdentifier	 m dtm Mgr
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_origObj	TokenNameIdentifier	 m orig Obj
=	TokenNameEQUAL	
nodeList	TokenNameIdentifier	 node List
;	TokenNameSEMICOLON	
// JKESS 20020514: Longer-term solution is to force 	TokenNameCOMMENT_LINE	JKESS 20020514: Longer-term solution is to force 
// folks to request length through an accessor, so we can defer this 	TokenNameCOMMENT_LINE	folks to request length through an accessor, so we can defer this 
// retrieval... but that requires an API change. 	TokenNameCOMMENT_LINE	retrieval... but that requires an API change. 
// m_obj=new org.apache.xpath.NodeSetDTM(nodeList, xctxt); 	TokenNameCOMMENT_LINE	m_obj=new org.apache.xpath.NodeSetDTM(nodeList, xctxt); 
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
nsdtm	TokenNameIdentifier	 nsdtm
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
(	TokenNameLPAREN	
nodeList	TokenNameIdentifier	 node List
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
nsdtm	TokenNameIdentifier	 nsdtm
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
nsdtm	TokenNameIdentifier	 nsdtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XNodeSetForDOM	TokenNameIdentifier	 X Node Set For DOM
(	TokenNameLPAREN	
NodeIterator	TokenNameIdentifier	 Node Iterator
nodeIter	TokenNameIdentifier	 node Iter
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dtmMgr	TokenNameIdentifier	 m dtm Mgr
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_origObj	TokenNameIdentifier	 m orig Obj
=	TokenNameEQUAL	
nodeIter	TokenNameIdentifier	 node Iter
;	TokenNameSEMICOLON	
// JKESS 20020514: Longer-term solution is to force 	TokenNameCOMMENT_LINE	JKESS 20020514: Longer-term solution is to force 
// folks to request length through an accessor, so we can defer this 	TokenNameCOMMENT_LINE	folks to request length through an accessor, so we can defer this 
// retrieval... but that requires an API change. 	TokenNameCOMMENT_LINE	retrieval... but that requires an API change. 
// m_obj = new org.apache.xpath.NodeSetDTM(nodeIter, xctxt); 	TokenNameCOMMENT_LINE	m_obj = new org.apache.xpath.NodeSetDTM(nodeIter, xctxt); 
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
nsdtm	TokenNameIdentifier	 nsdtm
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
(	TokenNameLPAREN	
nodeIter	TokenNameIdentifier	 node Iter
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
nsdtm	TokenNameIdentifier	 nsdtm
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
nsdtm	TokenNameIdentifier	 nsdtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the original DOM object that the user passed in. For use primarily * by the extension mechanism. * * @return The object that this class wraps */	TokenNameCOMMENT_JAVADOC	 Return the original DOM object that the user passed in. For use primarily by the extension mechanism. * @return The object that this class wraps 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_origObj	TokenNameIdentifier	 m orig Obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a nodelist. Always issues an error. * * @return null * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Cast result object to a nodelist. Always issues an error. * @return null * @throws javax.xml.transform.TransformerException 
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
(	TokenNameLPAREN	
m_origObj	TokenNameIdentifier	 m orig Obj
instanceof	TokenNameinstanceof	
NodeIterator	TokenNameIdentifier	 Node Iterator
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
NodeIterator	TokenNameIdentifier	 Node Iterator
)	TokenNameRPAREN	
m_origObj	TokenNameIdentifier	 m orig Obj
:	TokenNameCOLON	
super	TokenNamesuper	
.	TokenNameDOT	
nodeset	TokenNameIdentifier	 nodeset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a nodelist. Always issues an error. * * @return null * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Cast result object to a nodelist. Always issues an error. * @return null * @throws javax.xml.transform.TransformerException 
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
return	TokenNamereturn	
(	TokenNameLPAREN	
m_origObj	TokenNameIdentifier	 m orig Obj
instanceof	TokenNameinstanceof	
NodeList	TokenNameIdentifier	 Node List
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
)	TokenNameRPAREN	
m_origObj	TokenNameIdentifier	 m orig Obj
:	TokenNameCOLON	
super	TokenNamesuper	
.	TokenNameDOT	
nodelist	TokenNameIdentifier	 nodelist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
