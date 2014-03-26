/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: KeyTable.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: KeyTable.java 468645 2006-10-28 06:57:24Z minchau $ 
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
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
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
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
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
/** * Table of element keys, keyed by document node. An instance of this * class is keyed by a Document node that should be matched with the * root of the current context. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Table of element keys, keyed by document node. An instance of this class is keyed by a Document node that should be matched with the root of the current context. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
KeyTable	TokenNameIdentifier	 Key Table
{	TokenNameLBRACE	
/** * The document key. This table should only be used with contexts * whose Document roots match this key. */	TokenNameCOMMENT_JAVADOC	 The document key. This table should only be used with contexts whose Document roots match this key. 
private	TokenNameprivate	
int	TokenNameint	
m_docKey	TokenNameIdentifier	 m doc Key
;	TokenNameSEMICOLON	
/** * Vector of KeyDeclaration instances holding the key declarations. */	TokenNameCOMMENT_JAVADOC	 Vector of KeyDeclaration instances holding the key declarations. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
;	TokenNameSEMICOLON	
/** * Hold a cache of key() function result for each ref. * Key is XMLString, the ref value * Value is XNodeSet, the key() function result for the given ref value. */	TokenNameCOMMENT_JAVADOC	 Hold a cache of key() function result for each ref. Key is XMLString, the ref value Value is XNodeSet, the key() function result for the given ref value. 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
m_refsTable	TokenNameIdentifier	 m refs Table
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Get the document root matching this key. * * @return the document root matching this key */	TokenNameCOMMENT_JAVADOC	 Get the document root matching this key. * @return the document root matching this key 
public	TokenNamepublic	
int	TokenNameint	
getDocKey	TokenNameIdentifier	 get Doc Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_docKey	TokenNameIdentifier	 m doc Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The main iterator that will walk through the source * tree for this key. */	TokenNameCOMMENT_JAVADOC	 The main iterator that will walk through the source tree for this key. 
private	TokenNameprivate	
XNodeSet	TokenNameIdentifier	 X Node Set
m_keyNodes	TokenNameIdentifier	 m key Nodes
;	TokenNameSEMICOLON	
KeyIterator	TokenNameIdentifier	 Key Iterator
getKeyIterator	TokenNameIdentifier	 get Key Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
KeyIterator	TokenNameIdentifier	 Key Iterator
)	TokenNameRPAREN	
(	TokenNameLPAREN	
m_keyNodes	TokenNameIdentifier	 m key Nodes
.	TokenNameDOT	
getContainedIter	TokenNameIdentifier	 get Contained Iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Build a keys table. * @param doc The owner document key. * @param nscontext The stylesheet's namespace context. * @param name The key name * @param keyDeclarations The stylesheet's xsl:key declarations. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Build a keys table. @param doc The owner document key. @param nscontext The stylesheet's namespace context. @param name The key name @param keyDeclarations The stylesheet's xsl:key declarations. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
KeyTable	TokenNameIdentifier	 Key Table
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
nscontext	TokenNameIdentifier	 nscontext
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
keyDeclarations	TokenNameIdentifier	 key Declarations
,	TokenNameCOMMA	
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
m_docKey	TokenNameIdentifier	 m doc Key
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
=	TokenNameEQUAL	
keyDeclarations	TokenNameIdentifier	 key Declarations
;	TokenNameSEMICOLON	
KeyIterator	TokenNameIdentifier	 Key Iterator
ki	TokenNameIdentifier	 ki
=	TokenNameEQUAL	
new	TokenNamenew	
KeyIterator	TokenNameIdentifier	 Key Iterator
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
keyDeclarations	TokenNameIdentifier	 key Declarations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_keyNodes	TokenNameIdentifier	 m key Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
XNodeSet	TokenNameIdentifier	 X Node Set
(	TokenNameLPAREN	
ki	TokenNameIdentifier	 ki
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_keyNodes	TokenNameIdentifier	 m key Nodes
.	TokenNameDOT	
allowDetachToRelease	TokenNameIdentifier	 allow Detach To Release
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_keyNodes	TokenNameIdentifier	 m key Nodes
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a valid element key, return the corresponding node list. * * @param name The name of the key, which must match the 'name' attribute on xsl:key. * @param ref The value that must match the value found by the 'match' attribute on xsl:key. * @return a set of nodes referenced by the key named <CODE>name</CODE> and the reference <CODE>ref</CODE>. If no node is referenced by this key, an empty node set is returned. */	TokenNameCOMMENT_JAVADOC	 Given a valid element key, return the corresponding node list. * @param name The name of the key, which must match the 'name' attribute on xsl:key. @param ref The value that must match the value found by the 'match' attribute on xsl:key. @return a set of nodes referenced by the key named <CODE>name</CODE> and the reference <CODE>ref</CODE>. If no node is referenced by this key, an empty node set is returned. 
public	TokenNamepublic	
XNodeSet	TokenNameIdentifier	 X Node Set
getNodeSetDTMByKey	TokenNameIdentifier	 get Node Set DTM By Key
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XNodeSet	TokenNameIdentifier	 X Node Set
refNodes	TokenNameIdentifier	 ref Nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
getRefsTable	TokenNameIdentifier	 get Refs Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// clone wiht reset the node set 	TokenNameCOMMENT_LINE	clone wiht reset the node set 
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
refNodes	TokenNameIdentifier	 ref Nodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
refNodes	TokenNameIdentifier	 ref Nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
refNodes	TokenNameIdentifier	 ref Nodes
.	TokenNameDOT	
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
refNodes	TokenNameIdentifier	 ref Nodes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
refNodes	TokenNameIdentifier	 ref Nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create an empty XNodeSet 	TokenNameCOMMENT_LINE	create an empty XNodeSet 
KeyIterator	TokenNameIdentifier	 Key Iterator
ki	TokenNameIdentifier	 ki
=	TokenNameEQUAL	
(	TokenNameLPAREN	
KeyIterator	TokenNameIdentifier	 Key Iterator
)	TokenNameRPAREN	
(	TokenNameLPAREN	
m_keyNodes	TokenNameIdentifier	 m key Nodes
)	TokenNameRPAREN	
.	TokenNameDOT	
getContainedIter	TokenNameIdentifier	 get Contained Iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
ki	TokenNameIdentifier	 ki
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
refNodes	TokenNameIdentifier	 ref Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
XNodeSet	TokenNameIdentifier	 X Node Set
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
environment	TokenNameIdentifier	 environment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Root cannot be set on non-iterated node sets. Ignore it. 	TokenNameCOMMENT_LINE	Root cannot be set on non-iterated node sets. Ignore it. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
refNodes	TokenNameIdentifier	 ref Nodes
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
refNodes	TokenNameIdentifier	 ref Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get Key Name for this KeyTable * * @return Key name */	TokenNameCOMMENT_JAVADOC	 Get Key Name for this KeyTable * @return Key name 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getKeyTableName	TokenNameIdentifier	 get Key Table Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getKeyIterator	TokenNameIdentifier	 get Key Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return key declarations for the key associated to this KeyTable */	TokenNameCOMMENT_JAVADOC	 @return key declarations for the key associated to this KeyTable 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
getKeyDeclarations	TokenNameIdentifier	 get Key Declarations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nDeclarations	TokenNameIdentifier	 n Declarations
=	TokenNameEQUAL	
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
keyDecls	TokenNameIdentifier	 key Decls
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
nDeclarations	TokenNameIdentifier	 n Declarations
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
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add the declaration if the name on this key declaration 	TokenNameCOMMENT_LINE	Add the declaration if the name on this key declaration 
// matches the name on the iterator for this walker. 	TokenNameCOMMENT_LINE	matches the name on the iterator for this walker. 
if	TokenNameif	
(	TokenNameLPAREN	
kd	TokenNameIdentifier	 kd
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getKeyTableName	TokenNameIdentifier	 get Key Table Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keyDecls	TokenNameIdentifier	 key Decls
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
kd	TokenNameIdentifier	 kd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
keyDecls	TokenNameIdentifier	 key Decls
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return lazy initialized refs table associating evaluation of key function * with a XNodeSet */	TokenNameCOMMENT_JAVADOC	 @return lazy initialized refs table associating evaluation of key function with a XNodeSet 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
getRefsTable	TokenNameIdentifier	 get Refs Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_refsTable	TokenNameIdentifier	 m refs Table
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// initial capacity set to a prime number to improve hash performance 	TokenNameCOMMENT_LINE	initial capacity set to a prime number to improve hash performance 
m_refsTable	TokenNameIdentifier	 m refs Table
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
89	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
KeyIterator	TokenNameIdentifier	 Key Iterator
ki	TokenNameIdentifier	 ki
=	TokenNameEQUAL	
(	TokenNameLPAREN	
KeyIterator	TokenNameIdentifier	 Key Iterator
)	TokenNameRPAREN	
(	TokenNameLPAREN	
m_keyNodes	TokenNameIdentifier	 m key Nodes
)	TokenNameRPAREN	
.	TokenNameDOT	
getContainedIter	TokenNameIdentifier	 get Contained Iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
ki	TokenNameIdentifier	 ki
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
keyDecls	TokenNameIdentifier	 key Decls
=	TokenNameEQUAL	
getKeyDeclarations	TokenNameIdentifier	 get Key Declarations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nKeyDecls	TokenNameIdentifier	 n Key Decls
=	TokenNameEQUAL	
keyDecls	TokenNameIdentifier	 key Decls
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
m_keyNodes	TokenNameIdentifier	 m key Nodes
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
m_keyNodes	TokenNameIdentifier	 m key Nodes
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
keyDeclIdx	TokenNameIdentifier	 key Decl Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
keyDeclIdx	TokenNameIdentifier	 key Decl Idx
<	TokenNameLESS	
nKeyDecls	TokenNameIdentifier	 n Key Decls
;	TokenNameSEMICOLON	
keyDeclIdx	TokenNameIdentifier	 key Decl Idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
KeyDeclaration	TokenNameIdentifier	 Key Declaration
keyDeclaration	TokenNameIdentifier	 key Declaration
=	TokenNameEQUAL	
(	TokenNameLPAREN	
KeyDeclaration	TokenNameIdentifier	 Key Declaration
)	TokenNameRPAREN	
keyDecls	TokenNameIdentifier	 key Decls
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
keyDeclIdx	TokenNameIdentifier	 key Decl Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
xuse	TokenNameIdentifier	 xuse
=	TokenNameEQUAL	
keyDeclaration	TokenNameIdentifier	 key Declaration
.	TokenNameDOT	
getUse	TokenNameIdentifier	 get Use
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
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
addValueInRefsTable	TokenNameIdentifier	 add Value In Refs Table
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
exprResult	TokenNameIdentifier	 expr Result
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
DTMIterator	TokenNameIdentifier	 DTM Iterator
i	TokenNameIdentifier	 i
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
currentNodeInUseClause	TokenNameIdentifier	 current Node In Use Clause
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
currentNodeInUseClause	TokenNameIdentifier	 current Node In Use Clause
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
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
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
currentNodeInUseClause	TokenNameIdentifier	 current Node In Use Clause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLString	TokenNameIdentifier	 XML String
exprResult	TokenNameIdentifier	 expr Result
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
currentNodeInUseClause	TokenNameIdentifier	 current Node In Use Clause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addValueInRefsTable	TokenNameIdentifier	 add Value In Refs Table
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
exprResult	TokenNameIdentifier	 expr Result
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_refsTable	TokenNameIdentifier	 m refs Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an association between a ref and a node in the m_refsTable. * Requires that m_refsTable != null * @param xctxt XPath context * @param ref the value of the use clause of the current key for the given node * @param node the node to reference */	TokenNameCOMMENT_JAVADOC	 Add an association between a ref and a node in the m_refsTable. Requires that m_refsTable != null @param xctxt XPath context @param ref the value of the use clause of the current key for the given node @param node the node to reference 
private	TokenNameprivate	
void	TokenNamevoid	
addValueInRefsTable	TokenNameIdentifier	 add Value In Refs Table
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
ref	TokenNameIdentifier	 ref
,	TokenNameCOMMA	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XNodeSet	TokenNameIdentifier	 X Node Set
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
m_refsTable	TokenNameIdentifier	 m refs Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
new	TokenNamenew	
XNodeSet	TokenNameIdentifier	 X Node Set
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_refsTable	TokenNameIdentifier	 m refs Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
,	TokenNameCOMMA	
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Nodes are passed to this method in document order. Since we need to 	TokenNameCOMMENT_LINE	Nodes are passed to this method in document order. Since we need to 
// suppress duplicates, we only need to check against the last entry 	TokenNameCOMMENT_LINE	suppress duplicates, we only need to check against the last entry 
// in each nodeset. We use nodes.nextNode after each entry so we can 	TokenNameCOMMENT_LINE	in each nodeset. We use nodes.nextNode after each entry so we can 
// easily compare node against the current node. 	TokenNameCOMMENT_LINE	easily compare node against the current node. 
if	TokenNameif	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
mutableNodeset	TokenNameIdentifier	 mutable Nodeset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
