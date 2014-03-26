/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: FuncKey.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: FuncKey.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
KeyManager	TokenNameIdentifier	 Key Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
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
XPathContext	TokenNameIdentifier	 X Path Context
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
UnionPathIterator	TokenNameIdentifier	 Union Path Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
Function2Args	TokenNameIdentifier	 Function2 Args
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
/** * Execute the Key() function. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Execute the Key() function. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
FuncKey	TokenNameIdentifier	 Func Key
extends	TokenNameextends	
Function2Args	TokenNameIdentifier	 Function2 Args
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
9089293100115347340L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Dummy value to be used in usedrefs hashtable */	TokenNameCOMMENT_JAVADOC	 Dummy value to be used in usedrefs hashtable 
static	TokenNamestatic	
private	TokenNameprivate	
Boolean	TokenNameIdentifier	 Boolean
ISTRUE	TokenNameIdentifier	 ISTRUE
=	TokenNameEQUAL	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Execute the function. The function must return * a valid object. * @param xctxt The current execution context. * @return A valid XObject. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the function. The function must return a valid object. @param xctxt The current execution context. @return A valid XObject. * @throws javax.xml.transform.TransformerException 
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
// TransformerImpl transformer = (TransformerImpl)xctxt; 	TokenNameCOMMENT_LINE	TransformerImpl transformer = (TransformerImpl)xctxt; 
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
)	TokenNameRPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getOwnerObject	TokenNameIdentifier	 get Owner Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XNodeSet	TokenNameIdentifier	 X Node Set
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
null	TokenNamenull	
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
docContext	TokenNameIdentifier	 doc Context
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getDocumentRoot	TokenNameIdentifier	 get Document Root
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
docContext	TokenNameIdentifier	 doc Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// path.error(context, XPATHErrorResources.ER_CONTEXT_HAS_NO_OWNERDOC); //"context does not have an owner document!"); 	TokenNameCOMMENT_LINE	path.error(context, XPATHErrorResources.ER_CONTEXT_HAS_NO_OWNERDOC); //"context does not have an owner document!"); 
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
xkeyname	TokenNameIdentifier	 xkeyname
=	TokenNameEQUAL	
getArg0	TokenNameIdentifier	 get Arg0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QName	TokenNameIdentifier	 Q Name
keyname	TokenNameIdentifier	 keyname
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
xkeyname	TokenNameIdentifier	 xkeyname
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getNamespaceContext	TokenNameIdentifier	 get Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
getArg1	TokenNameIdentifier	 get Arg1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
argIsNodeSetDTM	TokenNameIdentifier	 arg Is Node Set DTM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
==	TokenNameEQUAL_EQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
KeyManager	TokenNameIdentifier	 Key Manager
kmgr	TokenNameIdentifier	 kmgr
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getKeyManager	TokenNameIdentifier	 get Key Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Don't bother with nodeset logic if the thing is only one node. 	TokenNameCOMMENT_LINE	Don't bother with nodeset logic if the thing is only one node. 
if	TokenNameif	
(	TokenNameLPAREN	
argIsNodeSetDTM	TokenNameIdentifier	 arg Is Node Set DTM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XNodeSet	TokenNameIdentifier	 X Node Set
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
argIsNodeSetDTM	TokenNameIdentifier	 arg Is Node Set DTM
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
argIsNodeSetDTM	TokenNameIdentifier	 arg Is Node Set DTM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
usedrefs	TokenNameIdentifier	 usedrefs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
DTMIterator	TokenNameIdentifier	 DTM Iterator
ni	TokenNameIdentifier	 ni
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
iter	TokenNameIdentifier	 iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
UnionPathIterator	TokenNameIdentifier	 Union Path Iterator
upi	TokenNameIdentifier	 upi
=	TokenNameEQUAL	
new	TokenNamenew	
UnionPathIterator	TokenNameIdentifier	 Union Path Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upi	TokenNameIdentifier	 upi
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLString	TokenNameIdentifier	 XML String
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
usedrefs	TokenNameIdentifier	 usedrefs
)	TokenNameRPAREN	
usedrefs	TokenNameIdentifier	 usedrefs
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
usedrefs	TokenNameIdentifier	 usedrefs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// We already have 'em. 	TokenNameCOMMENT_LINE	We already have 'em. 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// ISTRUE being used as a dummy value. 	TokenNameCOMMENT_LINE	ISTRUE being used as a dummy value. 
usedrefs	TokenNameIdentifier	 usedrefs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
,	TokenNameCOMMA	
ISTRUE	TokenNameIdentifier	 ISTRUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XNodeSet	TokenNameIdentifier	 X Node Set
nl	TokenNameIdentifier	 nl
=	TokenNameEQUAL	
kmgr	TokenNameIdentifier	 kmgr
.	TokenNameDOT	
getNodeSetDTMByKey	TokenNameIdentifier	 get Node Set DTM By Key
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
docContext	TokenNameIdentifier	 doc Context
,	TokenNameCOMMA	
keyname	TokenNameIdentifier	 keyname
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getNamespaceContext	TokenNameIdentifier	 get Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// try 	TokenNameCOMMENT_LINE	try 
// { 	TokenNameCOMMENT_LINE	{ 
upi	TokenNameIdentifier	 upi
.	TokenNameDOT	
addIterator	TokenNameIdentifier	 add Iterator
(	TokenNameLPAREN	
nl	TokenNameIdentifier	 nl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// } 	TokenNameCOMMENT_LINE	} 
// catch(CloneNotSupportedException cnse) 	TokenNameCOMMENT_LINE	catch(CloneNotSupportedException cnse) 
// { 	TokenNameCOMMENT_LINE	{ 
// // will never happen. 	TokenNameCOMMENT_LINE	// will never happen. 
// } 	TokenNameCOMMENT_LINE	} 
//mnodeset.addNodesInDocOrder(nl, xctxt); needed?? 	TokenNameCOMMENT_LINE	mnodeset.addNodesInDocOrder(nl, xctxt); needed?? 
}	TokenNameRBRACE	
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upi	TokenNameIdentifier	 upi
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
new	TokenNamenew	
XNodeSet	TokenNameIdentifier	 X Node Set
(	TokenNameLPAREN	
upi	TokenNameIdentifier	 upi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
XMLString	TokenNameIdentifier	 XML String
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
kmgr	TokenNameIdentifier	 kmgr
.	TokenNameDOT	
getNodeSetDTMByKey	TokenNameIdentifier	 get Node Set DTM By Key
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
docContext	TokenNameIdentifier	 doc Context
,	TokenNameCOMMA	
keyname	TokenNameIdentifier	 keyname
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getNamespaceContext	TokenNameIdentifier	 get Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
