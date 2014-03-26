/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: KeyRefIterator.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: KeyRefIterator.java 468645 2006-10-28 06:57:24Z minchau $ 
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
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
KeyDeclaration	TokenNameIdentifier	 Key Declaration
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
/** * This class filters nodes from a key iterator, according to * whether or not the use value matches the ref value. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class filters nodes from a key iterator, according to whether or not the use value matches the ref value. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
KeyRefIterator	TokenNameIdentifier	 Key Ref Iterator
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
axes	TokenNameIdentifier	 axes
.	TokenNameDOT	
ChildTestIterator	TokenNameIdentifier	 Child Test Iterator
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3837456451659435102L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Constructor KeyRefIterator * * * @param ref Key value to match * @param ki The main key iterator used to walk the source tree */	TokenNameCOMMENT_JAVADOC	 Constructor KeyRefIterator * @param ref Key value to match @param ki The main key iterator used to walk the source tree 
public	TokenNamepublic	
KeyRefIterator	TokenNameIdentifier	 Key Ref Iterator
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
ref	TokenNameIdentifier	 ref
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
keyDecls	TokenNameIdentifier	 key Decls
,	TokenNameCOMMA	
DTMIterator	TokenNameIdentifier	 DTM Iterator
ki	TokenNameIdentifier	 ki
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_name	TokenNameIdentifier	 m name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
m_ref	TokenNameIdentifier	 m ref
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
=	TokenNameEQUAL	
keyDecls	TokenNameIdentifier	 key Decls
;	TokenNameSEMICOLON	
m_keysNodes	TokenNameIdentifier	 m keys Nodes
=	TokenNameEQUAL	
ki	TokenNameIdentifier	 ki
;	TokenNameSEMICOLON	
setWhatToShow	TokenNameIdentifier	 set What To Show
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DTMIterator	TokenNameIdentifier	 DTM Iterator
m_keysNodes	TokenNameIdentifier	 m keys Nodes
;	TokenNameSEMICOLON	
/** * Get the next node via getNextXXX. Bottlenecked for derived class override. * @return The next node on the axis, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Get the next node via getNextXXX. Bottlenecked for derived class override. @return The next node on the axis, or DTM.NULL. 
protected	TokenNameprotected	
int	TokenNameint	
getNextNode	TokenNameIdentifier	 get Next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
m_keysNodes	TokenNameIdentifier	 m keys Nodes
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
==	TokenNameEQUAL_EQUAL	
filterNode	TokenNameIdentifier	 filter Node
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_lastFetched	TokenNameIdentifier	 m last Fetched
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test whether a specified node is visible in the logical view of a * TreeWalker or NodeIterator. This function will be called by the * implementation of TreeWalker and NodeIterator; it is not intended to * be called directly from user code. * * @param testNode The node to check to see if it passes the filter or not. * * @return a constant to determine whether the node is accepted, * rejected, or skipped, as defined above . */	TokenNameCOMMENT_JAVADOC	 Test whether a specified node is visible in the logical view of a TreeWalker or NodeIterator. This function will be called by the implementation of TreeWalker and NodeIterator; it is not intended to be called directly from user code. * @param testNode The node to check to see if it passes the filter or not. * @return a constant to determine whether the node is accepted, rejected, or skipped, as defined above . 
public	TokenNamepublic	
short	TokenNameshort	
filterNode	TokenNameIdentifier	 filter Node
(	TokenNameLPAREN	
int	TokenNameint	
testNode	TokenNameIdentifier	 test Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
foundKey	TokenNameIdentifier	 found Key
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
;	TokenNameSEMICOLON	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
m_name	TokenNameIdentifier	 m name
;	TokenNameSEMICOLON	
KeyIterator	TokenNameIdentifier	 Key Iterator
ki	TokenNameIdentifier	 ki
=	TokenNameEQUAL	
(	TokenNameLPAREN	
KeyIterator	TokenNameIdentifier	 Key Iterator
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
m_keysNodes	TokenNameIdentifier	 m keys Nodes
)	TokenNameRPAREN	
.	TokenNameDOT	
getContainedIter	TokenNameIdentifier	 get Contained Iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
ki	TokenNameIdentifier	 ki
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"xctxt can not be null here!"	TokenNameStringLiteral	xctxt can not be null here!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
XMLString	TokenNameIdentifier	 XML String
lookupKey	TokenNameIdentifier	 lookup Key
=	TokenNameEQUAL	
m_ref	TokenNameIdentifier	 m ref
;	TokenNameSEMICOLON	
// System.out.println("lookupKey: "+lookupKey); 	TokenNameCOMMENT_LINE	System.out.println("lookupKey: "+lookupKey); 
int	TokenNameint	
nDeclarations	TokenNameIdentifier	 n Declarations
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Walk through each of the declarations made with xsl:key 	TokenNameCOMMENT_LINE	Walk through each of the declarations made with xsl:key 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nDeclarations	TokenNameIdentifier	 n Declarations
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
KeyDeclaration	TokenNameIdentifier	 Key Declaration
kd	TokenNameIdentifier	 kd
=	TokenNameEQUAL	
(	TokenNameLPAREN	
KeyDeclaration	TokenNameIdentifier	 Key Declaration
)	TokenNameRPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Only continue if the name on this key declaration 	TokenNameCOMMENT_LINE	Only continue if the name on this key declaration 
// matches the name on the iterator for this walker. 	TokenNameCOMMENT_LINE	matches the name on the iterator for this walker. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
kd	TokenNameIdentifier	 kd
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
foundKey	TokenNameIdentifier	 found Key
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// xctxt.setNamespaceContext(ki.getPrefixResolver()); 	TokenNameCOMMENT_LINE	xctxt.setNamespaceContext(ki.getPrefixResolver()); 
// Query from the node, according the the select pattern in the 	TokenNameCOMMENT_LINE	Query from the node, according the the select pattern in the 
// use attribute in xsl:key. 	TokenNameCOMMENT_LINE	use attribute in xsl:key. 
XObject	TokenNameIdentifier	 X Object
xuse	TokenNameIdentifier	 xuse
=	TokenNameEQUAL	
kd	TokenNameIdentifier	 kd
.	TokenNameDOT	
getUse	TokenNameIdentifier	 get Use
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
testNode	TokenNameIdentifier	 test Node
,	TokenNameCOMMA	
ki	TokenNameIdentifier	 ki
.	TokenNameDOT	
getPrefixResolver	TokenNameIdentifier	 get Prefix Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xuse	TokenNameIdentifier	 xuse
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
xuse	TokenNameIdentifier	 xuse
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLString	TokenNameIdentifier	 XML String
exprResult	TokenNameIdentifier	 expr Result
=	TokenNameEQUAL	
xuse	TokenNameIdentifier	 xuse
.	TokenNameDOT	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookupKey	TokenNameIdentifier	 lookup Key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
exprResult	TokenNameIdentifier	 expr Result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
DTMIterator	TokenNameIdentifier	 DTM Iterator
nl	TokenNameIdentifier	 nl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
xuse	TokenNameIdentifier	 xuse
)	TokenNameRPAREN	
.	TokenNameDOT	
iterRaw	TokenNameIdentifier	 iter Raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
useNode	TokenNameIdentifier	 use Node
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
useNode	TokenNameIdentifier	 use Node
=	TokenNameEQUAL	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
useNode	TokenNameIdentifier	 use Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLString	TokenNameIdentifier	 XML String
exprResult	TokenNameIdentifier	 expr Result
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
useNode	TokenNameIdentifier	 use Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
exprResult	TokenNameIdentifier	 expr Result
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
lookupKey	TokenNameIdentifier	 lookup Key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
exprResult	TokenNameIdentifier	 expr Result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end for(int i = 0; i < nDeclarations; i++) 	TokenNameCOMMENT_LINE	end for(int i = 0; i < nDeclarations; i++) 
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
foundKey	TokenNameIdentifier	 found Key
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NO_XSLKEY_DECLARATION	TokenNameIdentifier	 ER  NO  XSLKEY  DECLARATION
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_REJECT	TokenNameIdentifier	 FILTER  REJECT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
XMLString	TokenNameIdentifier	 XML String
m_ref	TokenNameIdentifier	 m ref
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
QName	TokenNameIdentifier	 Q Name
m_name	TokenNameIdentifier	 m name
;	TokenNameSEMICOLON	
/** Vector of Key declarations in the stylesheet. * @serial */	TokenNameCOMMENT_JAVADOC	 Vector of Key declarations in the stylesheet. @serial 
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
