/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
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
/** * The Document interface represents the entire HTML or XML document. * Conceptually, it is the root of the document tree, and provides the * primary access to the document's data. * <P> * Since elements, text nodes, comments, processing instructions, * etc. cannot exist outside the context of a Document, the Document * interface also contains the factory methods needed to create these * objects. The Node objects created have a ownerDocument attribute * which associates them with the Document within whose context they * were created. * * @xerces.internal * * @version $Id: DeferredDocumentImpl.java 965320 2010-07-18 23:25:54Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 The Document interface represents the entire HTML or XML document. Conceptually, it is the root of the document tree, and provides the primary access to the document's data. <P> Since elements, text nodes, comments, processing instructions, etc. cannot exist outside the context of a Document, the Document interface also contains the factory methods needed to create these objects. The Node objects created have a ownerDocument attribute which associates them with the Document within whose context they were created. * @xerces.internal * @version $Id: DeferredDocumentImpl.java 965320 2010-07-18 23:25:54Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
DeferredDocumentImpl	TokenNameIdentifier	 Deferred Document Impl
extends	TokenNameextends	
DocumentImpl	TokenNameIdentifier	 Document Impl
implements	TokenNameimplements	
DeferredNode	TokenNameIdentifier	 Deferred Node
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
5186323580749626857L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// debugging 	TokenNameCOMMENT_LINE	debugging 
/** To include code for printing the ref count tables. */	TokenNameCOMMENT_JAVADOC	 To include code for printing the ref count tables. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_PRINT_REF_COUNTS	TokenNameIdentifier	 DEBUG  PRINT  REF  COUNTS
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** To include code for printing the internal tables. */	TokenNameCOMMENT_JAVADOC	 To include code for printing the internal tables. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_PRINT_TABLES	TokenNameIdentifier	 DEBUG  PRINT  TABLES
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** To debug identifiers set to true and recompile. */	TokenNameCOMMENT_JAVADOC	 To debug identifiers set to true and recompile. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_IDS	TokenNameIdentifier	 DEBUG  IDS
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// protected 	TokenNameCOMMENT_LINE	protected 
/** Chunk shift. */	TokenNameCOMMENT_JAVADOC	 Chunk shift. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 2^11 = 2k 	TokenNameCOMMENT_LINE	2^11 = 2k 
/** Chunk size. */	TokenNameCOMMENT_JAVADOC	 Chunk size. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Chunk mask. */	TokenNameCOMMENT_JAVADOC	 Chunk mask. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
=	TokenNameEQUAL	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Initial chunk size. */	TokenNameCOMMENT_JAVADOC	 Initial chunk size. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
16	TokenNameIntegerLiteral	
-	TokenNameMINUS	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 2^16 = 64k 	TokenNameCOMMENT_LINE	2^16 = 64k 
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
// lazy-eval information 	TokenNameCOMMENT_LINE	lazy-eval information 
// To maximize memory consumption the actual semantic of these fields vary 	TokenNameCOMMENT_LINE	To maximize memory consumption the actual semantic of these fields vary 
// depending on the node type. 	TokenNameCOMMENT_LINE	depending on the node type. 
/** Node count. */	TokenNameCOMMENT_JAVADOC	 Node count. 
protected	TokenNameprotected	
transient	TokenNametransient	
int	TokenNameint	
fNodeCount	TokenNameIdentifier	 f Node Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Node types. */	TokenNameCOMMENT_JAVADOC	 Node types. 
protected	TokenNameprotected	
transient	TokenNametransient	
int	TokenNameint	
fNodeType	TokenNameIdentifier	 f Node Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Node names. */	TokenNameCOMMENT_JAVADOC	 Node names. 
protected	TokenNameprotected	
transient	TokenNametransient	
Object	TokenNameIdentifier	 Object
fNodeName	TokenNameIdentifier	 f Node Name
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Node values. */	TokenNameCOMMENT_JAVADOC	 Node values. 
protected	TokenNameprotected	
transient	TokenNametransient	
Object	TokenNameIdentifier	 Object
fNodeValue	TokenNameIdentifier	 f Node Value
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Node parents. */	TokenNameCOMMENT_JAVADOC	 Node parents. 
protected	TokenNameprotected	
transient	TokenNametransient	
int	TokenNameint	
fNodeParent	TokenNameIdentifier	 f Node Parent
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Node first children. */	TokenNameCOMMENT_JAVADOC	 Node first children. 
protected	TokenNameprotected	
transient	TokenNametransient	
int	TokenNameint	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Node prev siblings. */	TokenNameCOMMENT_JAVADOC	 Node prev siblings. 
protected	TokenNameprotected	
transient	TokenNametransient	
int	TokenNameint	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Node namespace URI. */	TokenNameCOMMENT_JAVADOC	 Node namespace URI. 
protected	TokenNameprotected	
transient	TokenNametransient	
Object	TokenNameIdentifier	 Object
fNodeURI	TokenNameIdentifier	 f Node URI
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Extra data. */	TokenNameCOMMENT_JAVADOC	 Extra data. 
protected	TokenNameprotected	
transient	TokenNametransient	
int	TokenNameint	
fNodeExtra	TokenNameIdentifier	 f Node Extra
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Identifier count. */	TokenNameCOMMENT_JAVADOC	 Identifier count. 
protected	TokenNameprotected	
transient	TokenNametransient	
int	TokenNameint	
fIdCount	TokenNameIdentifier	 f Id Count
;	TokenNameSEMICOLON	
/** Identifier name indexes. */	TokenNameCOMMENT_JAVADOC	 Identifier name indexes. 
protected	TokenNameprotected	
transient	TokenNametransient	
String	TokenNameIdentifier	 String
fIdName	TokenNameIdentifier	 f Id Name
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Identifier element indexes. */	TokenNameCOMMENT_JAVADOC	 Identifier element indexes. 
protected	TokenNameprotected	
transient	TokenNametransient	
int	TokenNameint	
fIdElement	TokenNameIdentifier	 f Id Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** DOM2: For namespace support in the deferred case. */	TokenNameCOMMENT_JAVADOC	 DOM2: For namespace support in the deferred case. 
// Implementation Note: The deferred element and attribute must know how to 	TokenNameCOMMENT_LINE	Implementation Note: The deferred element and attribute must know how to 
// interpret the int representing the qname. 	TokenNameCOMMENT_LINE	interpret the int representing the qname. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fNamespacesEnabled	TokenNameIdentifier	 f Namespaces Enabled
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// private data 	TokenNameCOMMENT_LINE	private data 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
transient	TokenNametransient	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
fBufferStr	TokenNameIdentifier	 f Buffer Str
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
transient	TokenNametransient	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
fStrChunks	TokenNameIdentifier	 f Str Chunks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * NON-DOM: Actually creating a Document is outside the DOM's spec, * since it has to operate in terms of a particular implementation. */	TokenNameCOMMENT_JAVADOC	 NON-DOM: Actually creating a Document is outside the DOM's spec, since it has to operate in terms of a particular implementation. 
public	TokenNamepublic	
DeferredDocumentImpl	TokenNameIdentifier	 Deferred Document Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
/** * NON-DOM: Actually creating a Document is outside the DOM's spec, * since it has to operate in terms of a particular implementation. */	TokenNameCOMMENT_JAVADOC	 NON-DOM: Actually creating a Document is outside the DOM's spec, since it has to operate in terms of a particular implementation. 
public	TokenNamepublic	
DeferredDocumentImpl	TokenNameIdentifier	 Deferred Document Impl
(	TokenNameLPAREN	
boolean	TokenNameboolean	
namespacesEnabled	TokenNameIdentifier	 namespaces Enabled
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
namespacesEnabled	TokenNameIdentifier	 namespaces Enabled
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(boolean) 	TokenNameCOMMENT_LINE	<init>(boolean) 
/** Experimental constructor. */	TokenNameCOMMENT_JAVADOC	 Experimental constructor. 
public	TokenNamepublic	
DeferredDocumentImpl	TokenNameIdentifier	 Deferred Document Impl
(	TokenNameLPAREN	
boolean	TokenNameboolean	
namespaces	TokenNameIdentifier	 namespaces
,	TokenNameCOMMA	
boolean	TokenNameboolean	
grammarAccess	TokenNameIdentifier	 grammar Access
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
grammarAccess	TokenNameIdentifier	 grammar Access
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNamespacesEnabled	TokenNameIdentifier	 f Namespaces Enabled
=	TokenNameEQUAL	
namespaces	TokenNameIdentifier	 namespaces
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(boolean,boolean) 	TokenNameCOMMENT_LINE	<init>(boolean,boolean) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * Retrieve information describing the abilities of this particular * DOM implementation. Intended to support applications that may be * using DOMs retrieved from several different sources, potentially * with different underlying representations. */	TokenNameCOMMENT_JAVADOC	 Retrieve information describing the abilities of this particular DOM implementation. Intended to support applications that may be using DOMs retrieved from several different sources, potentially with different underlying representations. 
public	TokenNamepublic	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Currently implemented as a singleton, since it's hardcoded 	TokenNameCOMMENT_LINE	Currently implemented as a singleton, since it's hardcoded 
// information anyway. 	TokenNameCOMMENT_LINE	information anyway. 
return	TokenNamereturn	
DeferredDOMImplementationImpl	TokenNameIdentifier	 Deferred DOM Implementation Impl
.	TokenNameDOT	
getDOMImplementation	TokenNameIdentifier	 get DOM Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the cached parser.getNamespaces() value.*/	TokenNameCOMMENT_JAVADOC	 Returns the cached parser.getNamespaces() value.
boolean	TokenNameboolean	
getNamespacesEnabled	TokenNameIdentifier	 get Namespaces Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNamespacesEnabled	TokenNameIdentifier	 f Namespaces Enabled
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setNamespacesEnabled	TokenNameIdentifier	 set Namespaces Enabled
(	TokenNameLPAREN	
boolean	TokenNameboolean	
enable	TokenNameIdentifier	 enable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespacesEnabled	TokenNameIdentifier	 f Namespaces Enabled
=	TokenNameEQUAL	
enable	TokenNameIdentifier	 enable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// internal factory methods 	TokenNameCOMMENT_LINE	internal factory methods 
/** Creates a document node in the table. */	TokenNameCOMMENT_JAVADOC	 Creates a document node in the table. 
public	TokenNamepublic	
int	TokenNameint	
createDeferredDocument	TokenNameIdentifier	 create Deferred Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nodeIndex	TokenNameIdentifier	 node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates a doctype. */	TokenNameCOMMENT_JAVADOC	 Creates a doctype. 
public	TokenNamepublic	
int	TokenNameint	
createDeferredDocumentType	TokenNameIdentifier	 create Deferred Document Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rootElementName	TokenNameIdentifier	 root Element Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create node 	TokenNameCOMMENT_LINE	create node 
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
// save name, public id, system id 	TokenNameCOMMENT_LINE	save name, public id, system id 
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
rootElementName	TokenNameIdentifier	 root Element Name
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeURI	TokenNameIdentifier	 f Node URI
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return node index 	TokenNameCOMMENT_LINE	return node index 
return	TokenNamereturn	
nodeIndex	TokenNameIdentifier	 node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDeferredDocumentType(String,String,String):int 	TokenNameCOMMENT_LINE	createDeferredDocumentType(String,String,String):int 
public	TokenNamepublic	
void	TokenNamevoid	
setInternalSubset	TokenNameIdentifier	 set Internal Subset
(	TokenNameLPAREN	
int	TokenNameint	
doctypeIndex	TokenNameIdentifier	 doctype Index
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
subset	TokenNameIdentifier	 subset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
doctypeIndex	TokenNameIdentifier	 doctype Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
doctypeIndex	TokenNameIdentifier	 doctype Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
// create extra data node to store internal subset 	TokenNameCOMMENT_LINE	create extra data node to store internal subset 
int	TokenNameint	
extraDataIndex	TokenNameIdentifier	 extra Data Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
echunk	TokenNameIdentifier	 echunk
=	TokenNameEQUAL	
extraDataIndex	TokenNameIdentifier	 extra Data Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
eindex	TokenNameIdentifier	 eindex
=	TokenNameEQUAL	
extraDataIndex	TokenNameIdentifier	 extra Data Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
extraDataIndex	TokenNameIdentifier	 extra Data Index
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
subset	TokenNameIdentifier	 subset
,	TokenNameCOMMA	
echunk	TokenNameIdentifier	 echunk
,	TokenNameCOMMA	
eindex	TokenNameIdentifier	 eindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates a notation in the table. */	TokenNameCOMMENT_JAVADOC	 Creates a notation in the table. 
public	TokenNamepublic	
int	TokenNameint	
createDeferredNotation	TokenNameIdentifier	 create Deferred Notation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
notationName	TokenNameIdentifier	 notation Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create node 	TokenNameCOMMENT_LINE	create node 
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
// create extra data node 	TokenNameCOMMENT_LINE	create extra data node 
int	TokenNameint	
extraDataIndex	TokenNameIdentifier	 extra Data Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
echunk	TokenNameIdentifier	 echunk
=	TokenNameEQUAL	
extraDataIndex	TokenNameIdentifier	 extra Data Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
eindex	TokenNameIdentifier	 eindex
=	TokenNameEQUAL	
extraDataIndex	TokenNameIdentifier	 extra Data Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
// save name, public id, system id, and notation name 	TokenNameCOMMENT_LINE	save name, public id, system id, and notation name 
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
notationName	TokenNameIdentifier	 notation Name
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeURI	TokenNameIdentifier	 f Node URI
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// in extra data node set baseURI value 	TokenNameCOMMENT_LINE	in extra data node set baseURI value 
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
extraDataIndex	TokenNameIdentifier	 extra Data Index
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
baseURI	TokenNameIdentifier	 base URI
,	TokenNameCOMMA	
echunk	TokenNameIdentifier	 echunk
,	TokenNameCOMMA	
eindex	TokenNameIdentifier	 eindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return node index 	TokenNameCOMMENT_LINE	return node index 
return	TokenNamereturn	
nodeIndex	TokenNameIdentifier	 node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDeferredNotation(String,String,String):int 	TokenNameCOMMENT_LINE	createDeferredNotation(String,String,String):int 
/** Creates an entity in the table. */	TokenNameCOMMENT_JAVADOC	 Creates an entity in the table. 
public	TokenNamepublic	
int	TokenNameint	
createDeferredEntity	TokenNameIdentifier	 create Deferred Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
entityName	TokenNameIdentifier	 entity Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
notationName	TokenNameIdentifier	 notation Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create node 	TokenNameCOMMENT_LINE	create node 
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
// create extra data node 	TokenNameCOMMENT_LINE	create extra data node 
int	TokenNameint	
extraDataIndex	TokenNameIdentifier	 extra Data Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
echunk	TokenNameIdentifier	 echunk
=	TokenNameEQUAL	
extraDataIndex	TokenNameIdentifier	 extra Data Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
eindex	TokenNameIdentifier	 eindex
=	TokenNameEQUAL	
extraDataIndex	TokenNameIdentifier	 extra Data Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
// save name, public id, system id, and notation name 	TokenNameCOMMENT_LINE	save name, public id, system id, and notation name 
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
entityName	TokenNameIdentifier	 entity Name
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeURI	TokenNameIdentifier	 f Node URI
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
extraDataIndex	TokenNameIdentifier	 extra Data Index
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set other values in the extra chunk 	TokenNameCOMMENT_LINE	set other values in the extra chunk 
// notation 	TokenNameCOMMENT_LINE	notation 
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
notationName	TokenNameIdentifier	 notation Name
,	TokenNameCOMMA	
echunk	TokenNameIdentifier	 echunk
,	TokenNameCOMMA	
eindex	TokenNameIdentifier	 eindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// version L3 	TokenNameCOMMENT_LINE	version L3 
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
echunk	TokenNameIdentifier	 echunk
,	TokenNameCOMMA	
eindex	TokenNameIdentifier	 eindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// encoding L3 	TokenNameCOMMENT_LINE	encoding L3 
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeURI	TokenNameIdentifier	 f Node URI
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
echunk	TokenNameIdentifier	 echunk
,	TokenNameCOMMA	
eindex	TokenNameIdentifier	 eindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
extraDataIndex2	TokenNameIdentifier	 extra Data Index2
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
echunk2	TokenNameIdentifier	 echunk2
=	TokenNameEQUAL	
extraDataIndex2	TokenNameIdentifier	 extra Data Index2
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
eindex2	TokenNameIdentifier	 eindex2
=	TokenNameEQUAL	
extraDataIndex2	TokenNameIdentifier	 extra Data Index2
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
extraDataIndex2	TokenNameIdentifier	 extra Data Index2
,	TokenNameCOMMA	
echunk	TokenNameIdentifier	 echunk
,	TokenNameCOMMA	
eindex	TokenNameIdentifier	 eindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// baseURI 	TokenNameCOMMENT_LINE	baseURI 
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
baseURI	TokenNameIdentifier	 base URI
,	TokenNameCOMMA	
echunk2	TokenNameIdentifier	 echunk2
,	TokenNameCOMMA	
eindex2	TokenNameIdentifier	 eindex2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return node index 	TokenNameCOMMENT_LINE	return node index 
return	TokenNamereturn	
nodeIndex	TokenNameIdentifier	 node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDeferredEntity(String,String,String,String):int 	TokenNameCOMMENT_LINE	createDeferredEntity(String,String,String,String):int 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDeferredEntityBaseURI	TokenNameIdentifier	 get Deferred Entity Base URI
(	TokenNameLPAREN	
int	TokenNameint	
entityIndex	TokenNameIdentifier	 entity Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entityIndex	TokenNameIdentifier	 entity Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
extraDataIndex	TokenNameIdentifier	 extra Data Index
=	TokenNameEQUAL	
getNodeExtra	TokenNameIdentifier	 get Node Extra
(	TokenNameLPAREN	
entityIndex	TokenNameIdentifier	 entity Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
extraDataIndex	TokenNameIdentifier	 extra Data Index
=	TokenNameEQUAL	
getNodeExtra	TokenNameIdentifier	 get Node Extra
(	TokenNameLPAREN	
extraDataIndex	TokenNameIdentifier	 extra Data Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
extraDataIndex	TokenNameIdentifier	 extra Data Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DOM Level 3: setting encoding and version 	TokenNameCOMMENT_LINE	DOM Level 3: setting encoding and version 
public	TokenNamepublic	
void	TokenNamevoid	
setEntityInfo	TokenNameIdentifier	 set Entity Info
(	TokenNameLPAREN	
int	TokenNameint	
currentEntityDecl	TokenNameIdentifier	 current Entity Decl
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
eNodeIndex	TokenNameIdentifier	 e Node Index
=	TokenNameEQUAL	
getNodeExtra	TokenNameIdentifier	 get Node Extra
(	TokenNameLPAREN	
currentEntityDecl	TokenNameIdentifier	 current Entity Decl
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eNodeIndex	TokenNameIdentifier	 e Node Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
echunk	TokenNameIdentifier	 echunk
=	TokenNameEQUAL	
eNodeIndex	TokenNameIdentifier	 e Node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
eindex	TokenNameIdentifier	 eindex
=	TokenNameEQUAL	
eNodeIndex	TokenNameIdentifier	 e Node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
echunk	TokenNameIdentifier	 echunk
,	TokenNameCOMMA	
eindex	TokenNameIdentifier	 eindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeURI	TokenNameIdentifier	 f Node URI
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
echunk	TokenNameIdentifier	 echunk
,	TokenNameCOMMA	
eindex	TokenNameIdentifier	 eindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// DOM Level 3: sets element TypeInfo 	TokenNameCOMMENT_LINE	DOM Level 3: sets element TypeInfo 
public	TokenNamepublic	
void	TokenNamevoid	
setTypeInfo	TokenNameIdentifier	 set Type Info
(	TokenNameLPAREN	
int	TokenNameint	
elementNodeIndex	TokenNameIdentifier	 element Node Index
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
elementChunk	TokenNameIdentifier	 element Chunk
=	TokenNameEQUAL	
elementNodeIndex	TokenNameIdentifier	 element Node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
elementIndex	TokenNameIdentifier	 element Index
=	TokenNameEQUAL	
elementNodeIndex	TokenNameIdentifier	 element Node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
elementChunk	TokenNameIdentifier	 element Chunk
,	TokenNameCOMMA	
elementIndex	TokenNameIdentifier	 element Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM Internal * * An attribute specifying the actual encoding of this document. This is * <code>null</code> otherwise. * <br> This attribute represents the property [character encoding scheme] * defined in . */	TokenNameCOMMENT_JAVADOC	 DOM Internal * An attribute specifying the actual encoding of this document. This is <code>null</code> otherwise. <br> This attribute represents the property [character encoding scheme] defined in . 
public	TokenNamepublic	
void	TokenNamevoid	
setInputEncoding	TokenNameIdentifier	 set Input Encoding
(	TokenNameLPAREN	
int	TokenNameint	
currentEntityDecl	TokenNameIdentifier	 current Entity Decl
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get first extra data chunk 	TokenNameCOMMENT_LINE	get first extra data chunk 
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
getNodeExtra	TokenNameIdentifier	 get Node Extra
(	TokenNameLPAREN	
currentEntityDecl	TokenNameIdentifier	 current Entity Decl
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get second extra data chunk 	TokenNameCOMMENT_LINE	get second extra data chunk 
int	TokenNameint	
extraDataIndex	TokenNameIdentifier	 extra Data Index
=	TokenNameEQUAL	
getNodeExtra	TokenNameIdentifier	 get Node Extra
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
echunk	TokenNameIdentifier	 echunk
=	TokenNameEQUAL	
extraDataIndex	TokenNameIdentifier	 extra Data Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
eindex	TokenNameIdentifier	 eindex
=	TokenNameEQUAL	
extraDataIndex	TokenNameIdentifier	 extra Data Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
echunk	TokenNameIdentifier	 echunk
,	TokenNameCOMMA	
eindex	TokenNameIdentifier	 eindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates an entity reference node in the table. */	TokenNameCOMMENT_JAVADOC	 Creates an entity reference node in the table. 
public	TokenNamepublic	
int	TokenNameint	
createDeferredEntityReference	TokenNameIdentifier	 create Deferred Entity Reference
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create node 	TokenNameCOMMENT_LINE	create node 
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
baseURI	TokenNameIdentifier	 base URI
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return node index 	TokenNameCOMMENT_LINE	return node index 
return	TokenNamereturn	
nodeIndex	TokenNameIdentifier	 node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDeferredEntityReference(String):int 	TokenNameCOMMENT_LINE	createDeferredEntityReference(String):int 
/** * Creates an element node with a URI in the table and type information. * @deprecated */	TokenNameCOMMENT_JAVADOC	 Creates an element node with a URI in the table and type information. @deprecated 
public	TokenNamepublic	
int	TokenNameint	
createDeferredElement	TokenNameIdentifier	 create Deferred Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementURI	TokenNameIdentifier	 element URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create node 	TokenNameCOMMENT_LINE	create node 
int	TokenNameint	
elementNodeIndex	TokenNameIdentifier	 element Node Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
elementChunk	TokenNameIdentifier	 element Chunk
=	TokenNameEQUAL	
elementNodeIndex	TokenNameIdentifier	 element Node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
elementIndex	TokenNameIdentifier	 element Index
=	TokenNameEQUAL	
elementNodeIndex	TokenNameIdentifier	 element Node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
elementChunk	TokenNameIdentifier	 element Chunk
,	TokenNameCOMMA	
elementIndex	TokenNameIdentifier	 element Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeURI	TokenNameIdentifier	 f Node URI
,	TokenNameCOMMA	
elementURI	TokenNameIdentifier	 element URI
,	TokenNameCOMMA	
elementChunk	TokenNameIdentifier	 element Chunk
,	TokenNameCOMMA	
elementIndex	TokenNameIdentifier	 element Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
elementChunk	TokenNameIdentifier	 element Chunk
,	TokenNameCOMMA	
elementIndex	TokenNameIdentifier	 element Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return node index 	TokenNameCOMMENT_LINE	return node index 
return	TokenNamereturn	
elementNodeIndex	TokenNameIdentifier	 element Node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDeferredElement(String,String,Object):int 	TokenNameCOMMENT_LINE	createDeferredElement(String,String,Object):int 
/** * Creates an element node in the table. * @deprecated */	TokenNameCOMMENT_JAVADOC	 Creates an element node in the table. @deprecated 
public	TokenNamepublic	
int	TokenNameint	
createDeferredElement	TokenNameIdentifier	 create Deferred Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createDeferredElement	TokenNameIdentifier	 create Deferred Element
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an element node with a URI in the table. */	TokenNameCOMMENT_JAVADOC	 Creates an element node with a URI in the table. 
public	TokenNamepublic	
int	TokenNameint	
createDeferredElement	TokenNameIdentifier	 create Deferred Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementURI	TokenNameIdentifier	 element URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create node 	TokenNameCOMMENT_LINE	create node 
int	TokenNameint	
elementNodeIndex	TokenNameIdentifier	 element Node Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
elementChunk	TokenNameIdentifier	 element Chunk
=	TokenNameEQUAL	
elementNodeIndex	TokenNameIdentifier	 element Node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
elementIndex	TokenNameIdentifier	 element Index
=	TokenNameEQUAL	
elementNodeIndex	TokenNameIdentifier	 element Node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
elementChunk	TokenNameIdentifier	 element Chunk
,	TokenNameCOMMA	
elementIndex	TokenNameIdentifier	 element Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeURI	TokenNameIdentifier	 f Node URI
,	TokenNameCOMMA	
elementURI	TokenNameIdentifier	 element URI
,	TokenNameCOMMA	
elementChunk	TokenNameIdentifier	 element Chunk
,	TokenNameCOMMA	
elementIndex	TokenNameIdentifier	 element Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return node index 	TokenNameCOMMENT_LINE	return node index 
return	TokenNamereturn	
elementNodeIndex	TokenNameIdentifier	 element Node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDeferredElement(String,String):int 	TokenNameCOMMENT_LINE	createDeferredElement(String,String):int 
/** * This method is used by the DOMParser to create attributes. * @param elementNodeIndex * @param attrName * @param attrURI * @param attrValue * @param specified * @param id * @param type * @return int */	TokenNameCOMMENT_JAVADOC	 This method is used by the DOMParser to create attributes. @param elementNodeIndex @param attrName @param attrURI @param attrValue @param specified @param id @param type @return int 
public	TokenNamepublic	
int	TokenNameint	
setDeferredAttribute	TokenNameIdentifier	 set Deferred Attribute
(	TokenNameLPAREN	
int	TokenNameint	
elementNodeIndex	TokenNameIdentifier	 element Node Index
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrURI	TokenNameIdentifier	 attr URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrValue	TokenNameIdentifier	 attr Value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
specified	TokenNameIdentifier	 specified
,	TokenNameCOMMA	
boolean	TokenNameboolean	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create attribute 	TokenNameCOMMENT_LINE	create attribute 
int	TokenNameint	
attrNodeIndex	TokenNameIdentifier	 attr Node Index
=	TokenNameEQUAL	
createDeferredAttribute	TokenNameIdentifier	 create Deferred Attribute
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
attrURI	TokenNameIdentifier	 attr URI
,	TokenNameCOMMA	
attrValue	TokenNameIdentifier	 attr Value
,	TokenNameCOMMA	
specified	TokenNameIdentifier	 specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
attrChunk	TokenNameIdentifier	 attr Chunk
=	TokenNameEQUAL	
attrNodeIndex	TokenNameIdentifier	 attr Node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
=	TokenNameEQUAL	
attrNodeIndex	TokenNameIdentifier	 attr Node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
// set attribute's parent to element 	TokenNameCOMMENT_LINE	set attribute's parent to element 
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeParent	TokenNameIdentifier	 f Node Parent
,	TokenNameCOMMA	
elementNodeIndex	TokenNameIdentifier	 element Node Index
,	TokenNameCOMMA	
attrChunk	TokenNameIdentifier	 attr Chunk
,	TokenNameCOMMA	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
elementChunk	TokenNameIdentifier	 element Chunk
=	TokenNameEQUAL	
elementNodeIndex	TokenNameIdentifier	 element Node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
elementIndex	TokenNameIdentifier	 element Index
=	TokenNameEQUAL	
elementNodeIndex	TokenNameIdentifier	 element Node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
// get element's last attribute 	TokenNameCOMMENT_LINE	get element's last attribute 
int	TokenNameint	
lastAttrNodeIndex	TokenNameIdentifier	 last Attr Node Index
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
elementChunk	TokenNameIdentifier	 element Chunk
,	TokenNameCOMMA	
elementIndex	TokenNameIdentifier	 element Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastAttrNodeIndex	TokenNameIdentifier	 last Attr Node Index
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// add link from new attribute to last attribute 	TokenNameCOMMENT_LINE	add link from new attribute to last attribute 
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
lastAttrNodeIndex	TokenNameIdentifier	 last Attr Node Index
,	TokenNameCOMMA	
attrChunk	TokenNameIdentifier	 attr Chunk
,	TokenNameCOMMA	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// add link from element to new last attribute 	TokenNameCOMMENT_LINE	add link from element to new last attribute 
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
attrNodeIndex	TokenNameIdentifier	 attr Node Index
,	TokenNameCOMMA	
elementChunk	TokenNameIdentifier	 element Chunk
,	TokenNameCOMMA	
elementIndex	TokenNameIdentifier	 element Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
attrChunk	TokenNameIdentifier	 attr Chunk
,	TokenNameCOMMA	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
extra	TokenNameIdentifier	 extra
|	TokenNameOR	
ID	TokenNameIdentifier	 ID
;	TokenNameSEMICOLON	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
extra	TokenNameIdentifier	 extra
,	TokenNameCOMMA	
attrChunk	TokenNameIdentifier	 attr Chunk
,	TokenNameCOMMA	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
attrChunk	TokenNameIdentifier	 attr Chunk
,	TokenNameCOMMA	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
putIdentifier	TokenNameIdentifier	 put Identifier
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
elementNodeIndex	TokenNameIdentifier	 element Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// store type information 	TokenNameCOMMENT_LINE	store type information 
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
extraDataIndex	TokenNameIdentifier	 extra Data Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
DeferredNode	TokenNameIdentifier	 Deferred Node
.	TokenNameDOT	
TYPE_NODE	TokenNameIdentifier	 TYPE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
echunk	TokenNameIdentifier	 echunk
=	TokenNameEQUAL	
extraDataIndex	TokenNameIdentifier	 extra Data Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
eindex	TokenNameIdentifier	 eindex
=	TokenNameEQUAL	
extraDataIndex	TokenNameIdentifier	 extra Data Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
,	TokenNameCOMMA	
extraDataIndex	TokenNameIdentifier	 extra Data Index
,	TokenNameCOMMA	
attrChunk	TokenNameIdentifier	 attr Chunk
,	TokenNameCOMMA	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
echunk	TokenNameIdentifier	 echunk
,	TokenNameCOMMA	
eindex	TokenNameIdentifier	 eindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return node index 	TokenNameCOMMENT_LINE	return node index 
return	TokenNamereturn	
attrNodeIndex	TokenNameIdentifier	 attr Node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets an attribute on an element node. * @deprecated */	TokenNameCOMMENT_JAVADOC	 Sets an attribute on an element node. @deprecated 
public	TokenNamepublic	
int	TokenNameint	
setDeferredAttribute	TokenNameIdentifier	 set Deferred Attribute
(	TokenNameLPAREN	
int	TokenNameint	
elementNodeIndex	TokenNameIdentifier	 element Node Index
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrURI	TokenNameIdentifier	 attr URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrValue	TokenNameIdentifier	 attr Value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
specified	TokenNameIdentifier	 specified
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create attribute 	TokenNameCOMMENT_LINE	create attribute 
int	TokenNameint	
attrNodeIndex	TokenNameIdentifier	 attr Node Index
=	TokenNameEQUAL	
createDeferredAttribute	TokenNameIdentifier	 create Deferred Attribute
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
attrURI	TokenNameIdentifier	 attr URI
,	TokenNameCOMMA	
attrValue	TokenNameIdentifier	 attr Value
,	TokenNameCOMMA	
specified	TokenNameIdentifier	 specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
attrChunk	TokenNameIdentifier	 attr Chunk
=	TokenNameEQUAL	
attrNodeIndex	TokenNameIdentifier	 attr Node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
=	TokenNameEQUAL	
attrNodeIndex	TokenNameIdentifier	 attr Node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
// set attribute's parent to element 	TokenNameCOMMENT_LINE	set attribute's parent to element 
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeParent	TokenNameIdentifier	 f Node Parent
,	TokenNameCOMMA	
elementNodeIndex	TokenNameIdentifier	 element Node Index
,	TokenNameCOMMA	
attrChunk	TokenNameIdentifier	 attr Chunk
,	TokenNameCOMMA	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
elementChunk	TokenNameIdentifier	 element Chunk
=	TokenNameEQUAL	
elementNodeIndex	TokenNameIdentifier	 element Node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
elementIndex	TokenNameIdentifier	 element Index
=	TokenNameEQUAL	
elementNodeIndex	TokenNameIdentifier	 element Node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
// get element's last attribute 	TokenNameCOMMENT_LINE	get element's last attribute 
int	TokenNameint	
lastAttrNodeIndex	TokenNameIdentifier	 last Attr Node Index
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
elementChunk	TokenNameIdentifier	 element Chunk
,	TokenNameCOMMA	
elementIndex	TokenNameIdentifier	 element Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastAttrNodeIndex	TokenNameIdentifier	 last Attr Node Index
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// add link from new attribute to last attribute 	TokenNameCOMMENT_LINE	add link from new attribute to last attribute 
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
lastAttrNodeIndex	TokenNameIdentifier	 last Attr Node Index
,	TokenNameCOMMA	
attrChunk	TokenNameIdentifier	 attr Chunk
,	TokenNameCOMMA	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// add link from element to new last attribute 	TokenNameCOMMENT_LINE	add link from element to new last attribute 
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
attrNodeIndex	TokenNameIdentifier	 attr Node Index
,	TokenNameCOMMA	
elementChunk	TokenNameIdentifier	 element Chunk
,	TokenNameCOMMA	
elementIndex	TokenNameIdentifier	 element Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return node index 	TokenNameCOMMENT_LINE	return node index 
return	TokenNamereturn	
attrNodeIndex	TokenNameIdentifier	 attr Node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setDeferredAttribute(int,String,String,String,boolean):int 	TokenNameCOMMENT_LINE	setDeferredAttribute(int,String,String,String,boolean):int 
/** Creates an attribute in the table. */	TokenNameCOMMENT_JAVADOC	 Creates an attribute in the table. 
public	TokenNamepublic	
int	TokenNameint	
createDeferredAttribute	TokenNameIdentifier	 create Deferred Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrValue	TokenNameIdentifier	 attr Value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
specified	TokenNameIdentifier	 specified
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createDeferredAttribute	TokenNameIdentifier	 create Deferred Attribute
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
attrValue	TokenNameIdentifier	 attr Value
,	TokenNameCOMMA	
specified	TokenNameIdentifier	 specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates an attribute with a URI in the table. */	TokenNameCOMMENT_JAVADOC	 Creates an attribute with a URI in the table. 
public	TokenNamepublic	
int	TokenNameint	
createDeferredAttribute	TokenNameIdentifier	 create Deferred Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrURI	TokenNameIdentifier	 attr URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrValue	TokenNameIdentifier	 attr Value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
specified	TokenNameIdentifier	 specified
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create node 	TokenNameCOMMENT_LINE	create node 
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeURI	TokenNameIdentifier	 f Node URI
,	TokenNameCOMMA	
attrURI	TokenNameIdentifier	 attr URI
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
attrValue	TokenNameIdentifier	 attr Value
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
specified	TokenNameIdentifier	 specified
?	TokenNameQUESTION	
SPECIFIED	TokenNameIdentifier	 SPECIFIED
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
extra	TokenNameIdentifier	 extra
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return node index 	TokenNameCOMMENT_LINE	return node index 
return	TokenNamereturn	
nodeIndex	TokenNameIdentifier	 node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDeferredAttribute(String,String,String,boolean):int 	TokenNameCOMMENT_LINE	createDeferredAttribute(String,String,String,boolean):int 
/** Creates an element definition in the table.*/	TokenNameCOMMENT_JAVADOC	 Creates an element definition in the table.
public	TokenNamepublic	
int	TokenNameint	
createDeferredElementDefinition	TokenNameIdentifier	 create Deferred Element Definition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create node 	TokenNameCOMMENT_LINE	create node 
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
.	TokenNameDOT	
ELEMENT_DEFINITION_NODE	TokenNameIdentifier	 ELEMENT  DEFINITION  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return node index 	TokenNameCOMMENT_LINE	return node index 
return	TokenNamereturn	
nodeIndex	TokenNameIdentifier	 node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDeferredElementDefinition(String):int 	TokenNameCOMMENT_LINE	createDeferredElementDefinition(String):int 
/** Creates a text node in the table. */	TokenNameCOMMENT_JAVADOC	 Creates a text node in the table. 
public	TokenNamepublic	
int	TokenNameint	
createDeferredTextNode	TokenNameIdentifier	 create Deferred Text Node
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create node 	TokenNameCOMMENT_LINE	create node 
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// use extra to store ignorableWhitespace info 	TokenNameCOMMENT_LINE	use extra to store ignorableWhitespace info 
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return node index 	TokenNameCOMMENT_LINE	return node index 
return	TokenNamereturn	
nodeIndex	TokenNameIdentifier	 node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDeferredTextNode(String,boolean):int 	TokenNameCOMMENT_LINE	createDeferredTextNode(String,boolean):int 
/** Creates a CDATA section node in the table. */	TokenNameCOMMENT_JAVADOC	 Creates a CDATA section node in the table. 
public	TokenNamepublic	
int	TokenNameint	
createDeferredCDATASection	TokenNameIdentifier	 create Deferred CDATA Section
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create node 	TokenNameCOMMENT_LINE	create node 
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return node index 	TokenNameCOMMENT_LINE	return node index 
return	TokenNamereturn	
nodeIndex	TokenNameIdentifier	 node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDeferredCDATASection(String):int 	TokenNameCOMMENT_LINE	createDeferredCDATASection(String):int 
/** Creates a processing instruction node in the table. */	TokenNameCOMMENT_JAVADOC	 Creates a processing instruction node in the table. 
public	TokenNamepublic	
int	TokenNameint	
createDeferredProcessingInstruction	TokenNameIdentifier	 create Deferred Processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create node 	TokenNameCOMMENT_LINE	create node 
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return node index 	TokenNameCOMMENT_LINE	return node index 
return	TokenNamereturn	
nodeIndex	TokenNameIdentifier	 node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDeferredProcessingInstruction(String,String):int 	TokenNameCOMMENT_LINE	createDeferredProcessingInstruction(String,String):int 
/** Creates a comment node in the table. */	TokenNameCOMMENT_JAVADOC	 Creates a comment node in the table. 
public	TokenNamepublic	
int	TokenNameint	
createDeferredComment	TokenNameIdentifier	 create Deferred Comment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create node 	TokenNameCOMMENT_LINE	create node 
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return node index 	TokenNameCOMMENT_LINE	return node index 
return	TokenNamereturn	
nodeIndex	TokenNameIdentifier	 node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDeferredComment(String):int 	TokenNameCOMMENT_LINE	createDeferredComment(String):int 
/** Creates a clone of the specified node. */	TokenNameCOMMENT_JAVADOC	 Creates a clone of the specified node. 
public	TokenNamepublic	
int	TokenNameint	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// clone immediate node 	TokenNameCOMMENT_LINE	clone immediate node 
int	TokenNameint	
nchunk	TokenNameIdentifier	 nchunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
nindex	TokenNameIdentifier	 nindex
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
fNodeType	TokenNameIdentifier	 f Node Type
[	TokenNameLBRACKET	
nchunk	TokenNameIdentifier	 nchunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
nindex	TokenNameIdentifier	 nindex
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
cloneIndex	TokenNameIdentifier	 clone Index
=	TokenNameEQUAL	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
cchunk	TokenNameIdentifier	 cchunk
=	TokenNameEQUAL	
cloneIndex	TokenNameIdentifier	 clone Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
cindex	TokenNameIdentifier	 cindex
=	TokenNameEQUAL	
cloneIndex	TokenNameIdentifier	 clone Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
fNodeName	TokenNameIdentifier	 f Node Name
[	TokenNameLBRACKET	
nchunk	TokenNameIdentifier	 nchunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
nindex	TokenNameIdentifier	 nindex
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
cchunk	TokenNameIdentifier	 cchunk
,	TokenNameCOMMA	
cindex	TokenNameIdentifier	 cindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
fNodeValue	TokenNameIdentifier	 f Node Value
[	TokenNameLBRACKET	
nchunk	TokenNameIdentifier	 nchunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
nindex	TokenNameIdentifier	 nindex
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
cchunk	TokenNameIdentifier	 cchunk
,	TokenNameCOMMA	
cindex	TokenNameIdentifier	 cindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
fNodeURI	TokenNameIdentifier	 f Node URI
,	TokenNameCOMMA	
fNodeURI	TokenNameIdentifier	 f Node URI
[	TokenNameLBRACKET	
nchunk	TokenNameIdentifier	 nchunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
nindex	TokenNameIdentifier	 nindex
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
cchunk	TokenNameIdentifier	 cchunk
,	TokenNameCOMMA	
cindex	TokenNameIdentifier	 cindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
extraIndex	TokenNameIdentifier	 extra Index
=	TokenNameEQUAL	
fNodeExtra	TokenNameIdentifier	 f Node Extra
[	TokenNameLBRACKET	
nchunk	TokenNameIdentifier	 nchunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
nindex	TokenNameIdentifier	 nindex
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
extraIndex	TokenNameIdentifier	 extra Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
&&	TokenNameAND_AND	
nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extraIndex	TokenNameIdentifier	 extra Index
=	TokenNameEQUAL	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
extraIndex	TokenNameIdentifier	 extra Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
extraIndex	TokenNameIdentifier	 extra Index
,	TokenNameCOMMA	
cchunk	TokenNameIdentifier	 cchunk
,	TokenNameCOMMA	
cindex	TokenNameIdentifier	 cindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clone and attach children 	TokenNameCOMMENT_LINE	clone and attach children 
if	TokenNameif	
(	TokenNameLPAREN	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
prevIndex	TokenNameIdentifier	 prev Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
childIndex	TokenNameIdentifier	 child Index
=	TokenNameEQUAL	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
childIndex	TokenNameIdentifier	 child Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
clonedChildIndex	TokenNameIdentifier	 cloned Child Index
=	TokenNameEQUAL	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
childIndex	TokenNameIdentifier	 child Index
,	TokenNameCOMMA	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
cloneIndex	TokenNameIdentifier	 clone Index
,	TokenNameCOMMA	
clonedChildIndex	TokenNameIdentifier	 cloned Child Index
,	TokenNameCOMMA	
prevIndex	TokenNameIdentifier	 prev Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevIndex	TokenNameIdentifier	 prev Index
=	TokenNameEQUAL	
clonedChildIndex	TokenNameIdentifier	 cloned Child Index
;	TokenNameSEMICOLON	
childIndex	TokenNameIdentifier	 child Index
=	TokenNameEQUAL	
getRealPrevSibling	TokenNameIdentifier	 get Real Prev Sibling
(	TokenNameLPAREN	
childIndex	TokenNameIdentifier	 child Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// return cloned node index 	TokenNameCOMMENT_LINE	return cloned node index 
return	TokenNamereturn	
cloneIndex	TokenNameIdentifier	 clone Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// cloneNode(int,boolean):int 	TokenNameCOMMENT_LINE	cloneNode(int,boolean):int 
/** Appends a child to the specified parent in the table. */	TokenNameCOMMENT_JAVADOC	 Appends a child to the specified parent in the table. 
public	TokenNamepublic	
void	TokenNamevoid	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
int	TokenNameint	
parentIndex	TokenNameIdentifier	 parent Index
,	TokenNameCOMMA	
int	TokenNameint	
childIndex	TokenNameIdentifier	 child Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// append parent index 	TokenNameCOMMENT_LINE	append parent index 
int	TokenNameint	
pchunk	TokenNameIdentifier	 pchunk
=	TokenNameEQUAL	
parentIndex	TokenNameIdentifier	 parent Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
pindex	TokenNameIdentifier	 pindex
=	TokenNameEQUAL	
parentIndex	TokenNameIdentifier	 parent Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
int	TokenNameint	
cchunk	TokenNameIdentifier	 cchunk
=	TokenNameEQUAL	
childIndex	TokenNameIdentifier	 child Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
cindex	TokenNameIdentifier	 cindex
=	TokenNameEQUAL	
childIndex	TokenNameIdentifier	 child Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeParent	TokenNameIdentifier	 f Node Parent
,	TokenNameCOMMA	
parentIndex	TokenNameIdentifier	 parent Index
,	TokenNameCOMMA	
cchunk	TokenNameIdentifier	 cchunk
,	TokenNameCOMMA	
cindex	TokenNameIdentifier	 cindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set previous sibling of new child 	TokenNameCOMMENT_LINE	set previous sibling of new child 
int	TokenNameint	
olast	TokenNameIdentifier	 olast
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
,	TokenNameCOMMA	
pchunk	TokenNameIdentifier	 pchunk
,	TokenNameCOMMA	
pindex	TokenNameIdentifier	 pindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
olast	TokenNameIdentifier	 olast
,	TokenNameCOMMA	
cchunk	TokenNameIdentifier	 cchunk
,	TokenNameCOMMA	
cindex	TokenNameIdentifier	 cindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// update parent's last child 	TokenNameCOMMENT_LINE	update parent's last child 
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
,	TokenNameCOMMA	
childIndex	TokenNameIdentifier	 child Index
,	TokenNameCOMMA	
pchunk	TokenNameIdentifier	 pchunk
,	TokenNameCOMMA	
pindex	TokenNameIdentifier	 pindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// appendChild(int,int) 	TokenNameCOMMENT_LINE	appendChild(int,int) 
/** Adds an attribute node to the specified element. */	TokenNameCOMMENT_JAVADOC	 Adds an attribute node to the specified element. 
public	TokenNamepublic	
int	TokenNameint	
setAttributeNode	TokenNameIdentifier	 set Attribute Node
(	TokenNameLPAREN	
int	TokenNameint	
elemIndex	TokenNameIdentifier	 elem Index
,	TokenNameCOMMA	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
echunk	TokenNameIdentifier	 echunk
=	TokenNameEQUAL	
elemIndex	TokenNameIdentifier	 elem Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
eindex	TokenNameIdentifier	 eindex
=	TokenNameEQUAL	
elemIndex	TokenNameIdentifier	 elem Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
int	TokenNameint	
achunk	TokenNameIdentifier	 achunk
=	TokenNameEQUAL	
attrIndex	TokenNameIdentifier	 attr Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
aindex	TokenNameIdentifier	 aindex
=	TokenNameEQUAL	
attrIndex	TokenNameIdentifier	 attr Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
// see if this attribute is already here 	TokenNameCOMMENT_LINE	see if this attribute is already here 
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
=	TokenNameEQUAL	
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
achunk	TokenNameIdentifier	 achunk
,	TokenNameCOMMA	
aindex	TokenNameIdentifier	 aindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
oldAttrIndex	TokenNameIdentifier	 old Attr Index
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
echunk	TokenNameIdentifier	 echunk
,	TokenNameCOMMA	
eindex	TokenNameIdentifier	 eindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nextIndex	TokenNameIdentifier	 next Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
oachunk	TokenNameIdentifier	 oachunk
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
oaindex	TokenNameIdentifier	 oaindex
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
oldAttrIndex	TokenNameIdentifier	 old Attr Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oachunk	TokenNameIdentifier	 oachunk
=	TokenNameEQUAL	
oldAttrIndex	TokenNameIdentifier	 old Attr Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
oaindex	TokenNameIdentifier	 oaindex
=	TokenNameEQUAL	
oldAttrIndex	TokenNameIdentifier	 old Attr Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
oldAttrName	TokenNameIdentifier	 old Attr Name
=	TokenNameEQUAL	
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
oachunk	TokenNameIdentifier	 oachunk
,	TokenNameCOMMA	
oaindex	TokenNameIdentifier	 oaindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldAttrName	TokenNameIdentifier	 old Attr Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextIndex	TokenNameIdentifier	 next Index
=	TokenNameEQUAL	
oldAttrIndex	TokenNameIdentifier	 old Attr Index
;	TokenNameSEMICOLON	
oldAttrIndex	TokenNameIdentifier	 old Attr Index
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
oachunk	TokenNameIdentifier	 oachunk
,	TokenNameCOMMA	
oaindex	TokenNameIdentifier	 oaindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// remove old attribute 	TokenNameCOMMENT_LINE	remove old attribute 
if	TokenNameif	
(	TokenNameLPAREN	
oldAttrIndex	TokenNameIdentifier	 old Attr Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// patch links 	TokenNameCOMMENT_LINE	patch links 
int	TokenNameint	
prevIndex	TokenNameIdentifier	 prev Index
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
oachunk	TokenNameIdentifier	 oachunk
,	TokenNameCOMMA	
oaindex	TokenNameIdentifier	 oaindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextIndex	TokenNameIdentifier	 next Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
prevIndex	TokenNameIdentifier	 prev Index
,	TokenNameCOMMA	
echunk	TokenNameIdentifier	 echunk
,	TokenNameCOMMA	
eindex	TokenNameIdentifier	 eindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
pchunk	TokenNameIdentifier	 pchunk
=	TokenNameEQUAL	
nextIndex	TokenNameIdentifier	 next Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
pindex	TokenNameIdentifier	 pindex
=	TokenNameEQUAL	
nextIndex	TokenNameIdentifier	 next Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
prevIndex	TokenNameIdentifier	 prev Index
,	TokenNameCOMMA	
pchunk	TokenNameIdentifier	 pchunk
,	TokenNameCOMMA	
pindex	TokenNameIdentifier	 pindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// remove connections to siblings 	TokenNameCOMMENT_LINE	remove connections to siblings 
clearChunkIndex	TokenNameIdentifier	 clear Chunk Index
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
,	TokenNameCOMMA	
oachunk	TokenNameIdentifier	 oachunk
,	TokenNameCOMMA	
oaindex	TokenNameIdentifier	 oaindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clearChunkValue	TokenNameIdentifier	 clear Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
oachunk	TokenNameIdentifier	 oachunk
,	TokenNameCOMMA	
oaindex	TokenNameIdentifier	 oaindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clearChunkValue	TokenNameIdentifier	 clear Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
oachunk	TokenNameIdentifier	 oachunk
,	TokenNameCOMMA	
oaindex	TokenNameIdentifier	 oaindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clearChunkIndex	TokenNameIdentifier	 clear Chunk Index
(	TokenNameLPAREN	
fNodeParent	TokenNameIdentifier	 f Node Parent
,	TokenNameCOMMA	
oachunk	TokenNameIdentifier	 oachunk
,	TokenNameCOMMA	
oaindex	TokenNameIdentifier	 oaindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clearChunkIndex	TokenNameIdentifier	 clear Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
oachunk	TokenNameIdentifier	 oachunk
,	TokenNameCOMMA	
oaindex	TokenNameIdentifier	 oaindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
attrTextIndex	TokenNameIdentifier	 attr Text Index
=	TokenNameEQUAL	
clearChunkIndex	TokenNameIdentifier	 clear Chunk Index
(	TokenNameLPAREN	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
,	TokenNameCOMMA	
oachunk	TokenNameIdentifier	 oachunk
,	TokenNameCOMMA	
oaindex	TokenNameIdentifier	 oaindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
atchunk	TokenNameIdentifier	 atchunk
=	TokenNameEQUAL	
attrTextIndex	TokenNameIdentifier	 attr Text Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
atindex	TokenNameIdentifier	 atindex
=	TokenNameEQUAL	
attrTextIndex	TokenNameIdentifier	 attr Text Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
clearChunkIndex	TokenNameIdentifier	 clear Chunk Index
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
,	TokenNameCOMMA	
atchunk	TokenNameIdentifier	 atchunk
,	TokenNameCOMMA	
atindex	TokenNameIdentifier	 atindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clearChunkValue	TokenNameIdentifier	 clear Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
atchunk	TokenNameIdentifier	 atchunk
,	TokenNameCOMMA	
atindex	TokenNameIdentifier	 atindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clearChunkIndex	TokenNameIdentifier	 clear Chunk Index
(	TokenNameLPAREN	
fNodeParent	TokenNameIdentifier	 f Node Parent
,	TokenNameCOMMA	
atchunk	TokenNameIdentifier	 atchunk
,	TokenNameCOMMA	
atindex	TokenNameIdentifier	 atindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clearChunkIndex	TokenNameIdentifier	 clear Chunk Index
(	TokenNameLPAREN	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
,	TokenNameCOMMA	
atchunk	TokenNameIdentifier	 atchunk
,	TokenNameCOMMA	
atindex	TokenNameIdentifier	 atindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// add new attribute 	TokenNameCOMMENT_LINE	add new attribute 
int	TokenNameint	
prevIndex	TokenNameIdentifier	 prev Index
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
echunk	TokenNameIdentifier	 echunk
,	TokenNameCOMMA	
eindex	TokenNameIdentifier	 eindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
echunk	TokenNameIdentifier	 echunk
,	TokenNameCOMMA	
eindex	TokenNameIdentifier	 eindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
prevIndex	TokenNameIdentifier	 prev Index
,	TokenNameCOMMA	
achunk	TokenNameIdentifier	 achunk
,	TokenNameCOMMA	
aindex	TokenNameIdentifier	 aindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return 	TokenNameCOMMENT_LINE	return 
return	TokenNamereturn	
oldAttrIndex	TokenNameIdentifier	 old Attr Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setAttributeNode(int,int):int 	TokenNameCOMMENT_LINE	setAttributeNode(int,int):int 
/** Adds an attribute node to the specified element. */	TokenNameCOMMENT_JAVADOC	 Adds an attribute node to the specified element. 
public	TokenNamepublic	
void	TokenNamevoid	
setIdAttributeNode	TokenNameIdentifier	 set Id Attribute Node
(	TokenNameLPAREN	
int	TokenNameint	
elemIndex	TokenNameIdentifier	 elem Index
,	TokenNameCOMMA	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
attrIndex	TokenNameIdentifier	 attr Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
attrIndex	TokenNameIdentifier	 attr Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
int	TokenNameint	
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
extra	TokenNameIdentifier	 extra
|	TokenNameOR	
ID	TokenNameIdentifier	 ID
;	TokenNameSEMICOLON	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
extra	TokenNameIdentifier	 extra
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
putIdentifier	TokenNameIdentifier	 put Identifier
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
elemIndex	TokenNameIdentifier	 elem Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets type of attribute */	TokenNameCOMMENT_JAVADOC	 Sets type of attribute 
public	TokenNamepublic	
void	TokenNamevoid	
setIdAttribute	TokenNameIdentifier	 set Id Attribute
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
attrIndex	TokenNameIdentifier	 attr Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
attrIndex	TokenNameIdentifier	 attr Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
int	TokenNameint	
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
extra	TokenNameIdentifier	 extra
|	TokenNameOR	
ID	TokenNameIdentifier	 ID
;	TokenNameSEMICOLON	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
extra	TokenNameIdentifier	 extra
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Inserts a child before the specified node in the table. */	TokenNameCOMMENT_JAVADOC	 Inserts a child before the specified node in the table. 
public	TokenNamepublic	
int	TokenNameint	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
int	TokenNameint	
parentIndex	TokenNameIdentifier	 parent Index
,	TokenNameCOMMA	
int	TokenNameint	
newChildIndex	TokenNameIdentifier	 new Child Index
,	TokenNameCOMMA	
int	TokenNameint	
refChildIndex	TokenNameIdentifier	 ref Child Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
refChildIndex	TokenNameIdentifier	 ref Child Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
parentIndex	TokenNameIdentifier	 parent Index
,	TokenNameCOMMA	
newChildIndex	TokenNameIdentifier	 new Child Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newChildIndex	TokenNameIdentifier	 new Child Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
nchunk	TokenNameIdentifier	 nchunk
=	TokenNameEQUAL	
newChildIndex	TokenNameIdentifier	 new Child Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
nindex	TokenNameIdentifier	 nindex
=	TokenNameEQUAL	
newChildIndex	TokenNameIdentifier	 new Child Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
int	TokenNameint	
rchunk	TokenNameIdentifier	 rchunk
=	TokenNameEQUAL	
refChildIndex	TokenNameIdentifier	 ref Child Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
rindex	TokenNameIdentifier	 rindex
=	TokenNameEQUAL	
refChildIndex	TokenNameIdentifier	 ref Child Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
int	TokenNameint	
previousIndex	TokenNameIdentifier	 previous Index
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
rchunk	TokenNameIdentifier	 rchunk
,	TokenNameCOMMA	
rindex	TokenNameIdentifier	 rindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
newChildIndex	TokenNameIdentifier	 new Child Index
,	TokenNameCOMMA	
rchunk	TokenNameIdentifier	 rchunk
,	TokenNameCOMMA	
rindex	TokenNameIdentifier	 rindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
previousIndex	TokenNameIdentifier	 previous Index
,	TokenNameCOMMA	
nchunk	TokenNameIdentifier	 nchunk
,	TokenNameCOMMA	
nindex	TokenNameIdentifier	 nindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newChildIndex	TokenNameIdentifier	 new Child Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// insertBefore(int,int,int):int 	TokenNameCOMMENT_LINE	insertBefore(int,int,int):int 
/** Sets the last child of the parentIndex to childIndex. */	TokenNameCOMMENT_JAVADOC	 Sets the last child of the parentIndex to childIndex. 
public	TokenNamepublic	
void	TokenNamevoid	
setAsLastChild	TokenNameIdentifier	 set As Last Child
(	TokenNameLPAREN	
int	TokenNameint	
parentIndex	TokenNameIdentifier	 parent Index
,	TokenNameCOMMA	
int	TokenNameint	
childIndex	TokenNameIdentifier	 child Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pchunk	TokenNameIdentifier	 pchunk
=	TokenNameEQUAL	
parentIndex	TokenNameIdentifier	 parent Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
pindex	TokenNameIdentifier	 pindex
=	TokenNameEQUAL	
parentIndex	TokenNameIdentifier	 parent Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
,	TokenNameCOMMA	
childIndex	TokenNameIdentifier	 child Index
,	TokenNameCOMMA	
pchunk	TokenNameIdentifier	 pchunk
,	TokenNameCOMMA	
pindex	TokenNameIdentifier	 pindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setAsLastChild(int,int) 	TokenNameCOMMENT_LINE	setAsLastChild(int,int) 
/** * Returns the parent node of the given node. * <em>Calling this method does not free the parent index.</em> */	TokenNameCOMMENT_JAVADOC	 Returns the parent node of the given node. <em>Calling this method does not free the parent index.</em> 
public	TokenNamepublic	
int	TokenNameint	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the parent node of the given node. * @param free True to free parent node. */	TokenNameCOMMENT_JAVADOC	 Returns the parent node of the given node. @param free True to free parent node. 
public	TokenNamepublic	
int	TokenNameint	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
free	TokenNameIdentifier	 free
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
return	TokenNamereturn	
free	TokenNameIdentifier	 free
?	TokenNameQUESTION	
clearChunkIndex	TokenNameIdentifier	 clear Chunk Index
(	TokenNameLPAREN	
fNodeParent	TokenNameIdentifier	 f Node Parent
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeParent	TokenNameIdentifier	 f Node Parent
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getParentNode(int):int 	TokenNameCOMMENT_LINE	getParentNode(int):int 
/** Returns the last child of the given node. */	TokenNameCOMMENT_JAVADOC	 Returns the last child of the given node. 
public	TokenNamepublic	
int	TokenNameint	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the last child of the given node. * @param free True to free child index. */	TokenNameCOMMENT_JAVADOC	 Returns the last child of the given node. @param free True to free child index. 
public	TokenNamepublic	
int	TokenNameint	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
free	TokenNameIdentifier	 free
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
return	TokenNamereturn	
free	TokenNameIdentifier	 free
?	TokenNameQUESTION	
clearChunkIndex	TokenNameIdentifier	 clear Chunk Index
(	TokenNameLPAREN	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLastChild(int,boolean):int 	TokenNameCOMMENT_LINE	getLastChild(int,boolean):int 
/** * Returns the prev sibling of the given node. * This is post-normalization of Text Nodes. */	TokenNameCOMMENT_JAVADOC	 Returns the prev sibling of the given node. This is post-normalization of Text Nodes. 
public	TokenNamepublic	
int	TokenNameint	
getPrevSibling	TokenNameIdentifier	 get Prev Sibling
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPrevSibling	TokenNameIdentifier	 get Prev Sibling
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the prev sibling of the given node. * @param free True to free sibling index. */	TokenNameCOMMENT_JAVADOC	 Returns the prev sibling of the given node. @param free True to free sibling index. 
public	TokenNamepublic	
int	TokenNameint	
getPrevSibling	TokenNameIdentifier	 get Prev Sibling
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
free	TokenNameIdentifier	 free
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
nodeIndex	TokenNameIdentifier	 node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getPrevSibling(int,boolean):int 	TokenNameCOMMENT_LINE	getPrevSibling(int,boolean):int 
/** * Returns the <i>real</i> prev sibling of the given node, * directly from the data structures. Used by TextImpl#getNodeValue() * to normalize values. */	TokenNameCOMMENT_JAVADOC	 Returns the <i>real</i> prev sibling of the given node, directly from the data structures. Used by TextImpl#getNodeValue() to normalize values. 
public	TokenNamepublic	
int	TokenNameint	
getRealPrevSibling	TokenNameIdentifier	 get Real Prev Sibling
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRealPrevSibling	TokenNameIdentifier	 get Real Prev Sibling
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the <i>real</i> prev sibling of the given node. * @param free True to free sibling index. */	TokenNameCOMMENT_JAVADOC	 Returns the <i>real</i> prev sibling of the given node. @param free True to free sibling index. 
public	TokenNamepublic	
int	TokenNameint	
getRealPrevSibling	TokenNameIdentifier	 get Real Prev Sibling
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
free	TokenNameIdentifier	 free
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
return	TokenNamereturn	
free	TokenNameIdentifier	 free
?	TokenNameQUESTION	
clearChunkIndex	TokenNameIdentifier	 clear Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getReadPrevSibling(int,boolean):int 	TokenNameCOMMENT_LINE	getReadPrevSibling(int,boolean):int 
/** * Returns the index of the element definition in the table * with the specified name index, or -1 if no such definition * exists. */	TokenNameCOMMENT_JAVADOC	 Returns the index of the element definition in the table with the specified name index, or -1 if no such definition exists. 
public	TokenNamepublic	
int	TokenNameint	
lookupElementDefinition	TokenNameIdentifier	 lookup Element Definition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNodeCount	TokenNameIdentifier	 f Node Count
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find doctype 	TokenNameCOMMENT_LINE	find doctype 
int	TokenNameint	
docTypeIndex	TokenNameIdentifier	 doc Type Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
nchunk	TokenNameIdentifier	 nchunk
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
nindex	TokenNameIdentifier	 nindex
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
,	TokenNameCOMMA	
nchunk	TokenNameIdentifier	 nchunk
,	TokenNameCOMMA	
nindex	TokenNameIdentifier	 nindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
nchunk	TokenNameIdentifier	 nchunk
,	TokenNameCOMMA	
nindex	TokenNameIdentifier	 nindex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nchunk	TokenNameIdentifier	 nchunk
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
nindex	TokenNameIdentifier	 nindex
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
,	TokenNameCOMMA	
nchunk	TokenNameIdentifier	 nchunk
,	TokenNameCOMMA	
nindex	TokenNameIdentifier	 nindex
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docTypeIndex	TokenNameIdentifier	 doc Type Index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// find element definition 	TokenNameCOMMENT_LINE	find element definition 
if	TokenNameif	
(	TokenNameLPAREN	
docTypeIndex	TokenNameIdentifier	 doc Type Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nchunk	TokenNameIdentifier	 nchunk
=	TokenNameEQUAL	
docTypeIndex	TokenNameIdentifier	 doc Type Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
nindex	TokenNameIdentifier	 nindex
=	TokenNameEQUAL	
docTypeIndex	TokenNameIdentifier	 doc Type Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
,	TokenNameCOMMA	
nchunk	TokenNameIdentifier	 nchunk
,	TokenNameCOMMA	
nindex	TokenNameIdentifier	 nindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
nchunk	TokenNameIdentifier	 nchunk
,	TokenNameCOMMA	
nindex	TokenNameIdentifier	 nindex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nchunk	TokenNameIdentifier	 nchunk
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
nindex	TokenNameIdentifier	 nindex
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
,	TokenNameCOMMA	
nchunk	TokenNameIdentifier	 nchunk
,	TokenNameCOMMA	
nindex	TokenNameIdentifier	 nindex
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NodeImpl	TokenNameIdentifier	 Node Impl
.	TokenNameDOT	
ELEMENT_DEFINITION_NODE	TokenNameIdentifier	 ELEMENT  DEFINITION  NODE
&&	TokenNameAND_AND	
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
nchunk	TokenNameIdentifier	 nchunk
,	TokenNameCOMMA	
nindex	TokenNameIdentifier	 nindex
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// lookupElementDefinition(String):int 	TokenNameCOMMENT_LINE	lookupElementDefinition(String):int 
/** Instantiates the requested node object. */	TokenNameCOMMENT_JAVADOC	 Instantiates the requested node object. 
public	TokenNamepublic	
DeferredNode	TokenNameIdentifier	 Deferred Node
getNodeObject	TokenNameIdentifier	 get Node Object
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// is there anything to do? 	TokenNameCOMMENT_LINE	is there anything to do? 
if	TokenNameif	
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get node type 	TokenNameCOMMENT_LINE	get node type 
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clearChunkIndex	TokenNameIdentifier	 clear Chunk Index
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create new node 	TokenNameCOMMENT_LINE	create new node 
DeferredNode	TokenNameIdentifier	 Deferred Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Standard DOM node types 	TokenNameCOMMENT_LINE	Standard DOM node types 
// 	TokenNameCOMMENT_LINE	 
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespacesEnabled	TokenNameIdentifier	 f Namespaces Enabled
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
DeferredAttrNSImpl	TokenNameIdentifier	 Deferred Attr NS Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
DeferredAttrImpl	TokenNameIdentifier	 Deferred Attr Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
DeferredCDATASectionImpl	TokenNameIdentifier	 Deferred CDATA Section Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
DeferredCommentImpl	TokenNameIdentifier	 Deferred Comment Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// NOTE: Document fragments can never be "fast". 	TokenNameCOMMENT_LINE	NOTE: Document fragments can never be "fast". 
// 	TokenNameCOMMENT_LINE	 
// The parser will never ask to create a document 	TokenNameCOMMENT_LINE	The parser will never ask to create a document 
// fragment during the parse. Document fragments 	TokenNameCOMMENT_LINE	fragment during the parse. Document fragments 
// are used by the application *after* the parse. 	TokenNameCOMMENT_LINE	are used by the application *after* the parse. 
// 	TokenNameCOMMENT_LINE	 
// case Node.DOCUMENT_FRAGMENT_NODE: { break; } 	TokenNameCOMMENT_LINE	case Node.DOCUMENT_FRAGMENT_NODE: { break; } 
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
// this node is never "fast" 	TokenNameCOMMENT_LINE	this node is never "fast" 
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
DeferredDocumentTypeImpl	TokenNameIdentifier	 Deferred Document Type Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// save the doctype node 	TokenNameCOMMENT_LINE	save the doctype node 
docType	TokenNameIdentifier	 doc Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocumentTypeImpl	TokenNameIdentifier	 Document Type Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_IDS	TokenNameIdentifier	 DEBUG  IDS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"getNodeObject(ELEMENT_NODE): "	TokenNameStringLiteral	getNodeObject(ELEMENT_NODE): 
+	TokenNamePLUS	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create node 	TokenNameCOMMENT_LINE	create node 
if	TokenNameif	
(	TokenNameLPAREN	
fNamespacesEnabled	TokenNameIdentifier	 f Namespaces Enabled
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
DeferredElementNSImpl	TokenNameIdentifier	 Deferred Element NS Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
DeferredElementImpl	TokenNameIdentifier	 Deferred Element Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check to see if this element needs to be 	TokenNameCOMMENT_LINE	check to see if this element needs to be 
// registered for its ID attributes 	TokenNameCOMMENT_LINE	registered for its ID attributes 
if	TokenNameif	
(	TokenNameLPAREN	
fIdElement	TokenNameIdentifier	 f Id Element
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idIndex	TokenNameIdentifier	 id Index
=	TokenNameEQUAL	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
fIdElement	TokenNameIdentifier	 f Id Element
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fIdCount	TokenNameIdentifier	 f Id Count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
idIndex	TokenNameIdentifier	 id Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_IDS	TokenNameIdentifier	 DEBUG  IDS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" id index: "	TokenNameStringLiteral	 id index: 
+	TokenNamePLUS	
idIndex	TokenNameIdentifier	 id Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" fIdName["	TokenNameStringLiteral	 fIdName[
+	TokenNamePLUS	
idIndex	TokenNameIdentifier	 id Index
+	TokenNamePLUS	
"]: "	TokenNameStringLiteral	]: 
+	TokenNamePLUS	
fIdName	TokenNameIdentifier	 f Id Name
[	TokenNameLBRACKET	
idIndex	TokenNameIdentifier	 id Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// register ID 	TokenNameCOMMENT_LINE	register ID 
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
fIdName	TokenNameIdentifier	 f Id Name
[	TokenNameLBRACKET	
idIndex	TokenNameIdentifier	 id Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_IDS	TokenNameIdentifier	 DEBUG  IDS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" name: "	TokenNameStringLiteral	 name: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"getNodeObject()#"	TokenNameStringLiteral	getNodeObject()#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
putIdentifier0	TokenNameIdentifier	 put Identifier0
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIdName	TokenNameIdentifier	 f Id Name
[	TokenNameLBRACKET	
idIndex	TokenNameIdentifier	 id Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// continue if there are more IDs for 	TokenNameCOMMENT_LINE	continue if there are more IDs for 
// this element 	TokenNameCOMMENT_LINE	this element 
if	TokenNameif	
(	TokenNameLPAREN	
idIndex	TokenNameIdentifier	 id Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
fIdCount	TokenNameIdentifier	 f Id Count
&&	TokenNameAND_AND	
fIdElement	TokenNameIdentifier	 f Id Element
[	TokenNameLBRACKET	
idIndex	TokenNameIdentifier	 id Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idIndex	TokenNameIdentifier	 id Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
idIndex	TokenNameIdentifier	 id Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
DeferredEntityImpl	TokenNameIdentifier	 Deferred Entity Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
DeferredEntityReferenceImpl	TokenNameIdentifier	 Deferred Entity Reference Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
DeferredNotationImpl	TokenNameIdentifier	 Deferred Notation Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
DeferredProcessingInstructionImpl	TokenNameIdentifier	 Deferred Processing Instruction Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
DeferredTextImpl	TokenNameIdentifier	 Deferred Text Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// non-standard DOM node types 	TokenNameCOMMENT_LINE	non-standard DOM node types 
// 	TokenNameCOMMENT_LINE	 
case	TokenNamecase	
NodeImpl	TokenNameIdentifier	 Node Impl
.	TokenNameDOT	
ELEMENT_DEFINITION_NODE	TokenNameIdentifier	 ELEMENT  DEFINITION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
DeferredElementDefinitionImpl	TokenNameIdentifier	 Deferred Element Definition Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"type: "	TokenNameStringLiteral	type: 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// switch node type 	TokenNameCOMMENT_LINE	switch node type 
// store and return 	TokenNameCOMMENT_LINE	store and return 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// error 	TokenNameCOMMENT_LINE	error 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createNodeObject(int):Node 	TokenNameCOMMENT_LINE	createNodeObject(int):Node 
/** Returns the name of the given node. */	TokenNameCOMMENT_JAVADOC	 Returns the name of the given node. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNodeNameString(int):String 	TokenNameCOMMENT_LINE	getNodeNameString(int):String 
/** * Returns the name of the given node. * @param free True to free the string index. */	TokenNameCOMMENT_JAVADOC	 Returns the name of the given node. @param free True to free the string index. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
free	TokenNameIdentifier	 free
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
return	TokenNamereturn	
free	TokenNameIdentifier	 free
?	TokenNameQUESTION	
clearChunkValue	TokenNameIdentifier	 clear Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNodeName(int,boolean):String 	TokenNameCOMMENT_LINE	getNodeName(int,boolean):String 
/** Returns the real value of the given node. */	TokenNameCOMMENT_JAVADOC	 Returns the real value of the given node. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeValueString	TokenNameIdentifier	 get Node Value String
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNodeValueString	TokenNameIdentifier	 get Node Value String
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNodeValueString(int):String 	TokenNameCOMMENT_LINE	getNodeValueString(int):String 
/** * Returns the real value of the given node. * @param free True to free the string index. */	TokenNameCOMMENT_JAVADOC	 Returns the real value of the given node. @param free True to free the string index. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeValueString	TokenNameIdentifier	 get Node Value String
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
free	TokenNameIdentifier	 free
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
free	TokenNameIdentifier	 free
?	TokenNameQUESTION	
clearChunkValue	TokenNameIdentifier	 clear Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
prevSib	TokenNameIdentifier	 prev Sib
=	TokenNameEQUAL	
getRealPrevSibling	TokenNameIdentifier	 get Real Prev Sibling
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prevSib	TokenNameIdentifier	 prev Sib
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
prevSib	TokenNameIdentifier	 prev Sib
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// append data that is stored in fNodeValue 	TokenNameCOMMENT_LINE	append data that is stored in fNodeValue 
// REVISIT: for text nodes it works differently than for CDATA 	TokenNameCOMMENT_LINE	REVISIT: for text nodes it works differently than for CDATA 
// nodes. 	TokenNameCOMMENT_LINE	nodes. 
fStrChunks	TokenNameIdentifier	 f Str Chunks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
// go in reverse order: find last child, then 	TokenNameCOMMENT_LINE	go in reverse order: find last child, then 
// its previous sibling, etc 	TokenNameCOMMENT_LINE	its previous sibling, etc 
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
prevSib	TokenNameIdentifier	 prev Sib
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
prevSib	TokenNameIdentifier	 prev Sib
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStrChunks	TokenNameIdentifier	 f Str Chunks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevSib	TokenNameIdentifier	 prev Sib
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prevSib	TokenNameIdentifier	 prev Sib
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
prevSib	TokenNameIdentifier	 prev Sib
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
chunkCount	TokenNameIdentifier	 chunk Count
=	TokenNameEQUAL	
fStrChunks	TokenNameIdentifier	 f Str Chunks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add to the buffer in the correct order. 	TokenNameCOMMENT_LINE	add to the buffer in the correct order. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
chunkCount	TokenNameIdentifier	 chunk Count
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
fBufferStr	TokenNameIdentifier	 f Buffer Str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fStrChunks	TokenNameIdentifier	 f Str Chunks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
fBufferStr	TokenNameIdentifier	 f Buffer Str
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStrChunks	TokenNameIdentifier	 f Str Chunks
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBufferStr	TokenNameIdentifier	 f Buffer Str
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find if any other data stored in children 	TokenNameCOMMENT_LINE	find if any other data stored in children 
int	TokenNameint	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// append data that is stored in fNodeValue 	TokenNameCOMMENT_LINE	append data that is stored in fNodeValue 
fBufferStr	TokenNameIdentifier	 f Buffer Str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// go in reverse order: find last child, then 	TokenNameCOMMENT_LINE	go in reverse order: find last child, then 
// its previous sibling, etc 	TokenNameCOMMENT_LINE	its previous sibling, etc 
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStrChunks	TokenNameIdentifier	 f Str Chunks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// add to the buffer in the correct order. 	TokenNameCOMMENT_LINE	add to the buffer in the correct order. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fStrChunks	TokenNameIdentifier	 f Str Chunks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
fBufferStr	TokenNameIdentifier	 f Buffer Str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fStrChunks	TokenNameIdentifier	 f Str Chunks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
fBufferStr	TokenNameIdentifier	 f Buffer Str
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStrChunks	TokenNameIdentifier	 f Str Chunks
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBufferStr	TokenNameIdentifier	 f Buffer Str
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNodeValueString(int,boolean):String 	TokenNameCOMMENT_LINE	getNodeValueString(int,boolean):String 
/** * Returns the value of the given node. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the given node. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clears the type info that is stored in the fNodeValue array * @param nodeIndex * @return Object - type information for the attribute/element node */	TokenNameCOMMENT_JAVADOC	 Clears the type info that is stored in the fNodeValue array @param nodeIndex @return Object - type information for the attribute/element node 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getTypeInfo	TokenNameIdentifier	 get Type Info
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
fNodeValue	TokenNameIdentifier	 f Node Value
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
fNodeValue	TokenNameIdentifier	 f Node Value
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNodeValue	TokenNameIdentifier	 f Node Value
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
RefCount	TokenNameIdentifier	 Ref Count
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RefCount	TokenNameIdentifier	 Ref Count
)	TokenNameRPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
fCount	TokenNameIdentifier	 f Count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
fCount	TokenNameIdentifier	 f Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNodeValue	TokenNameIdentifier	 f Node Value
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of the given node. * @param free True to free the value index. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the given node. @param free True to free the value index. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
free	TokenNameIdentifier	 free
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
return	TokenNamereturn	
free	TokenNameIdentifier	 free
?	TokenNameQUESTION	
clearChunkValue	TokenNameIdentifier	 clear Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNodeValue(int,boolean):String 	TokenNameCOMMENT_LINE	getNodeValue(int,boolean):String 
/** * Returns the extra info of the given node. * Used by AttrImpl to store specified value (1 == true). */	TokenNameCOMMENT_JAVADOC	 Returns the extra info of the given node. Used by AttrImpl to store specified value (1 == true). 
public	TokenNamepublic	
int	TokenNameint	
getNodeExtra	TokenNameIdentifier	 get Node Extra
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNodeExtra	TokenNameIdentifier	 get Node Extra
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the extra info of the given node. * @param free True to free the value index. */	TokenNameCOMMENT_JAVADOC	 Returns the extra info of the given node. @param free True to free the value index. 
public	TokenNamepublic	
int	TokenNameint	
getNodeExtra	TokenNameIdentifier	 get Node Extra
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
free	TokenNameIdentifier	 free
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
return	TokenNamereturn	
free	TokenNameIdentifier	 free
?	TokenNameQUESTION	
clearChunkIndex	TokenNameIdentifier	 clear Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNodeExtra(int,boolean):int 	TokenNameCOMMENT_LINE	getNodeExtra(int,boolean):int 
/** Returns the type of the given node. */	TokenNameCOMMENT_JAVADOC	 Returns the type of the given node. 
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the type of the given node. * @param free True to free type index. */	TokenNameCOMMENT_JAVADOC	 Returns the type of the given node. @param free True to free type index. 
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
free	TokenNameIdentifier	 free
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
return	TokenNamereturn	
free	TokenNameIdentifier	 free
?	TokenNameQUESTION	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
clearChunkIndex	TokenNameIdentifier	 clear Chunk Index
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNodeType(int):int 	TokenNameCOMMENT_LINE	getNodeType(int):int 
/** Returns the attribute value of the given name. */	TokenNameCOMMENT_JAVADOC	 Returns the attribute value of the given name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
int	TokenNameint	
elemIndex	TokenNameIdentifier	 elem Index
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
elemIndex	TokenNameIdentifier	 elem Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
echunk	TokenNameIdentifier	 echunk
=	TokenNameEQUAL	
elemIndex	TokenNameIdentifier	 elem Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
eindex	TokenNameIdentifier	 eindex
=	TokenNameEQUAL	
elemIndex	TokenNameIdentifier	 elem Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
echunk	TokenNameIdentifier	 echunk
,	TokenNameCOMMA	
eindex	TokenNameIdentifier	 eindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
attrIndex	TokenNameIdentifier	 attr Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
achunk	TokenNameIdentifier	 achunk
=	TokenNameEQUAL	
attrIndex	TokenNameIdentifier	 attr Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
aindex	TokenNameIdentifier	 aindex
=	TokenNameEQUAL	
attrIndex	TokenNameIdentifier	 attr Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
achunk	TokenNameIdentifier	 achunk
,	TokenNameCOMMA	
aindex	TokenNameIdentifier	 aindex
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
achunk	TokenNameIdentifier	 achunk
,	TokenNameCOMMA	
aindex	TokenNameIdentifier	 aindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attrIndex	TokenNameIdentifier	 attr Index
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
achunk	TokenNameIdentifier	 achunk
,	TokenNameCOMMA	
aindex	TokenNameIdentifier	 aindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the URI of the given node. */	TokenNameCOMMENT_JAVADOC	 Returns the URI of the given node. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeURI	TokenNameIdentifier	 get Node URI
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNodeURI	TokenNameIdentifier	 get Node URI
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the URI of the given node. * @param free True to free URI index. */	TokenNameCOMMENT_JAVADOC	 Returns the URI of the given node. @param free True to free URI index. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeURI	TokenNameIdentifier	 get Node URI
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
free	TokenNameIdentifier	 free
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
return	TokenNamereturn	
free	TokenNameIdentifier	 free
?	TokenNameQUESTION	
clearChunkValue	TokenNameIdentifier	 clear Chunk Value
(	TokenNameLPAREN	
fNodeURI	TokenNameIdentifier	 f Node URI
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
fNodeURI	TokenNameIdentifier	 f Node URI
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNodeURI(int,int):String 	TokenNameCOMMENT_LINE	getNodeURI(int,int):String 
// identifier maintenance 	TokenNameCOMMENT_LINE	identifier maintenance 
/** Registers an identifier name with a specified element node. */	TokenNameCOMMENT_JAVADOC	 Registers an identifier name with a specified element node. 
public	TokenNamepublic	
void	TokenNamevoid	
putIdentifier	TokenNameIdentifier	 put Identifier
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
elementNodeIndex	TokenNameIdentifier	 element Node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_IDS	TokenNameIdentifier	 DEBUG  IDS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"putIdentifier("	TokenNameStringLiteral	putIdentifier(
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
elementNodeIndex	TokenNameIdentifier	 element Node Index
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
" // "	TokenNameStringLiteral	 // 
+	TokenNamePLUS	
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
elementNodeIndex	TokenNameIdentifier	 element Node Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
,	TokenNameCOMMA	
elementNodeIndex	TokenNameIdentifier	 element Node Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// initialize arrays 	TokenNameCOMMENT_LINE	initialize arrays 
if	TokenNameif	
(	TokenNameLPAREN	
fIdName	TokenNameIdentifier	 f Id Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIdName	TokenNameIdentifier	 f Id Name
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
64	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fIdElement	TokenNameIdentifier	 f Id Element
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
64	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// resize arrays 	TokenNameCOMMENT_LINE	resize arrays 
if	TokenNameif	
(	TokenNameLPAREN	
fIdCount	TokenNameIdentifier	 f Id Count
==	TokenNameEQUAL_EQUAL	
fIdName	TokenNameIdentifier	 f Id Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
idName	TokenNameIdentifier	 id Name
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
fIdCount	TokenNameIdentifier	 f Id Count
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fIdName	TokenNameIdentifier	 f Id Name
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idName	TokenNameIdentifier	 id Name
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fIdCount	TokenNameIdentifier	 f Id Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIdName	TokenNameIdentifier	 f Id Name
=	TokenNameEQUAL	
idName	TokenNameIdentifier	 id Name
;	TokenNameSEMICOLON	
int	TokenNameint	
idElement	TokenNameIdentifier	 id Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
idName	TokenNameIdentifier	 id Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fIdElement	TokenNameIdentifier	 f Id Element
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idElement	TokenNameIdentifier	 id Element
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fIdCount	TokenNameIdentifier	 f Id Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIdElement	TokenNameIdentifier	 f Id Element
=	TokenNameEQUAL	
idElement	TokenNameIdentifier	 id Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// store identifier 	TokenNameCOMMENT_LINE	store identifier 
fIdName	TokenNameIdentifier	 f Id Name
[	TokenNameLBRACKET	
fIdCount	TokenNameIdentifier	 f Id Count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
fIdElement	TokenNameIdentifier	 f Id Element
[	TokenNameLBRACKET	
fIdCount	TokenNameIdentifier	 f Id Count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
elementNodeIndex	TokenNameIdentifier	 element Node Index
;	TokenNameSEMICOLON	
fIdCount	TokenNameIdentifier	 f Id Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// putIdentifier(String,int) 	TokenNameCOMMENT_LINE	putIdentifier(String,int) 
// 	TokenNameCOMMENT_LINE	 
// DEBUG 	TokenNameCOMMENT_LINE	DEBUG 
// 	TokenNameCOMMENT_LINE	 
/** Prints out the tables. */	TokenNameCOMMENT_JAVADOC	 Prints out the tables. 
public	TokenNamepublic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_PRINT_REF_COUNTS	TokenNameIdentifier	 DEBUG  PRINT  REF  COUNTS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"num "	TokenNameStringLiteral	num 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"type "	TokenNameStringLiteral	type 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"name "	TokenNameStringLiteral	name 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"val "	TokenNameStringLiteral	val 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"par "	TokenNameStringLiteral	par 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"lch "	TokenNameStringLiteral	lch 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"psib"	TokenNameStringLiteral	psib
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
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
fNodeType	TokenNameIdentifier	 f Node Type
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// separator 	TokenNameCOMMENT_LINE	separator 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"--------"	TokenNameStringLiteral	--------
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"--------"	TokenNameStringLiteral	--------
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"--------"	TokenNameStringLiteral	--------
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"--------"	TokenNameStringLiteral	--------
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"--------"	TokenNameStringLiteral	--------
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"--------"	TokenNameStringLiteral	--------
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"--------"	TokenNameStringLiteral	--------
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ref count 	TokenNameCOMMENT_LINE	ref count 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DocumentImpl	TokenNameIdentifier	 Document Impl
.	TokenNameDOT	
ELEMENT_DEFINITION_NODE	TokenNameIdentifier	 ELEMENT  DEFINITION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"EDef"	TokenNameStringLiteral	EDef
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Doc"	TokenNameStringLiteral	Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"DType"	TokenNameStringLiteral	DType
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Com"	TokenNameStringLiteral	Com
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"PI"	TokenNameStringLiteral	PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Elem"	TokenNameStringLiteral	Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Ent"	TokenNameStringLiteral	Ent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"ERef"	TokenNameStringLiteral	ERef
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Text"	TokenNameStringLiteral	Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Attr"	TokenNameStringLiteral	Attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
DeferredNode	TokenNameIdentifier	 Deferred Node
.	TokenNameDOT	
TYPE_NODE	TokenNameIdentifier	 TYPE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"TypeInfo"	TokenNameStringLiteral	TypeInfo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
+	TokenNamePLUS	
fNodeType	TokenNameIdentifier	 f Node Type
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fNodeURI	TokenNameIdentifier	 f Node URI
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fNodeParent	TokenNameIdentifier	 f Node Parent
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_PRINT_TABLES	TokenNameIdentifier	 DEBUG  PRINT  TABLES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This assumes that the document is small 	TokenNameCOMMENT_LINE	This assumes that the document is small 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"# start table"	TokenNameStringLiteral	# start table
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
fNodeCount	TokenNameIdentifier	 f Node Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
10	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"num "	TokenNameStringLiteral	num 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"type "	TokenNameStringLiteral	type 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"name "	TokenNameStringLiteral	name 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"val "	TokenNameStringLiteral	val 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"uri "	TokenNameStringLiteral	uri 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"par "	TokenNameStringLiteral	par 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"lch "	TokenNameStringLiteral	lch 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"psib "	TokenNameStringLiteral	psib 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"xtra"	TokenNameStringLiteral	xtra
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DocumentImpl	TokenNameIdentifier	 Document Impl
.	TokenNameDOT	
ELEMENT_DEFINITION_NODE	TokenNameIdentifier	 ELEMENT  DEFINITION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"EDef"	TokenNameStringLiteral	EDef
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Doc"	TokenNameStringLiteral	Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"DType"	TokenNameStringLiteral	DType
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Com"	TokenNameStringLiteral	Com
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"PI"	TokenNameStringLiteral	PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Elem"	TokenNameStringLiteral	Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Ent"	TokenNameStringLiteral	Ent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"ERef"	TokenNameStringLiteral	ERef
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Text"	TokenNameStringLiteral	Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Attr"	TokenNameStringLiteral	Attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
DeferredNode	TokenNameIdentifier	 Deferred Node
.	TokenNameDOT	
TYPE_NODE	TokenNameIdentifier	 TYPE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"TypeInfo"	TokenNameStringLiteral	TypeInfo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
+	TokenNamePLUS	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
fNodeURI	TokenNameIdentifier	 f Node URI
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeParent	TokenNameIdentifier	 f Node Parent
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"# end table"	TokenNameStringLiteral	# end table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// print() 	TokenNameCOMMENT_LINE	print() 
// 	TokenNameCOMMENT_LINE	 
// DeferredNode methods 	TokenNameCOMMENT_LINE	DeferredNode methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns the node index. */	TokenNameCOMMENT_JAVADOC	 Returns the node index. 
public	TokenNamepublic	
int	TokenNameint	
getNodeIndex	TokenNameIdentifier	 get Node Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
/** Synchronizes the node's data. */	TokenNameCOMMENT_JAVADOC	 Synchronizes the node's data. 
protected	TokenNameprotected	
void	TokenNamevoid	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no need to sync in the future 	TokenNameCOMMENT_LINE	no need to sync in the future 
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fluff up enough nodes to fill identifiers hash 	TokenNameCOMMENT_LINE	fluff up enough nodes to fill identifiers hash 
if	TokenNameif	
(	TokenNameLPAREN	
fIdElement	TokenNameIdentifier	 f Id Element
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: There has to be a more efficient way of 	TokenNameCOMMENT_LINE	REVISIT: There has to be a more efficient way of 
// doing this. But keep in mind that the 	TokenNameCOMMENT_LINE	doing this. But keep in mind that the 
// tree can have been altered and re-ordered 	TokenNameCOMMENT_LINE	tree can have been altered and re-ordered 
// before all of the element nodes with ID 	TokenNameCOMMENT_LINE	before all of the element nodes with ID 
// attributes have been registered. For now 	TokenNameCOMMENT_LINE	attributes have been registered. For now 
// this is reasonable and safe. -Ac 	TokenNameCOMMENT_LINE	this is reasonable and safe. -Ac 
IntVector	TokenNameIdentifier	 Int Vector
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
IntVector	TokenNameIdentifier	 Int Vector
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
fIdCount	TokenNameIdentifier	 f Id Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore if it's already been registered 	TokenNameCOMMENT_LINE	ignore if it's already been registered 
int	TokenNameint	
elementNodeIndex	TokenNameIdentifier	 element Node Index
=	TokenNameEQUAL	
fIdElement	TokenNameIdentifier	 f Id Element
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
idName	TokenNameIdentifier	 id Name
=	TokenNameEQUAL	
fIdName	TokenNameIdentifier	 f Id Name
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idName	TokenNameIdentifier	 id Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// find path from this element to the root 	TokenNameCOMMENT_LINE	find path from this element to the root 
path	TokenNameIdentifier	 path
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
elementNodeIndex	TokenNameIdentifier	 element Node Index
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pchunk	TokenNameIdentifier	 pchunk
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
pindex	TokenNameIdentifier	 pindex
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
fNodeParent	TokenNameIdentifier	 f Node Parent
,	TokenNameCOMMA	
pchunk	TokenNameIdentifier	 pchunk
,	TokenNameCOMMA	
pindex	TokenNameIdentifier	 pindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Traverse path (backwards), fluffing the elements 	TokenNameCOMMENT_LINE	Traverse path (backwards), fluffing the elements 
// along the way. When this loop finishes, "place" 	TokenNameCOMMENT_LINE	along the way. When this loop finishes, "place" 
// will contain the reference to the element node 	TokenNameCOMMENT_LINE	will contain the reference to the element node 
// we're interested in. -Ac 	TokenNameCOMMENT_LINE	we're interested in. -Ac 
Node	TokenNameIdentifier	 Node
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
instanceof	TokenNameinstanceof	
DeferredNode	TokenNameIdentifier	 Deferred Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DeferredNode	TokenNameIdentifier	 Deferred Node
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
.	TokenNameDOT	
getNodeIndex	TokenNameIdentifier	 get Node Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
==	TokenNameEQUAL_EQUAL	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// register the element 	TokenNameCOMMENT_LINE	register the element 
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
place	TokenNameIdentifier	 place
;	TokenNameSEMICOLON	
putIdentifier0	TokenNameIdentifier	 put Identifier0
(	TokenNameLPAREN	
idName	TokenNameIdentifier	 id Name
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIdName	TokenNameIdentifier	 f Id Name
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// see if there are more IDs on this element 	TokenNameCOMMENT_LINE	see if there are more IDs on this element 
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
fIdCount	TokenNameIdentifier	 f Id Count
&&	TokenNameAND_AND	
fIdElement	TokenNameIdentifier	 f Id Element
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
elementNodeIndex	TokenNameIdentifier	 element Node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idName	TokenNameIdentifier	 id Name
=	TokenNameEQUAL	
fIdName	TokenNameIdentifier	 f Id Name
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idName	TokenNameIdentifier	 id Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
putIdentifier0	TokenNameIdentifier	 put Identifier0
(	TokenNameLPAREN	
idName	TokenNameIdentifier	 id Name
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if identifiers 	TokenNameCOMMENT_LINE	if identifiers 
}	TokenNameRBRACE	
// synchronizeData() 	TokenNameCOMMENT_LINE	synchronizeData() 
/** * Synchronizes the node's children with the internal structure. * Fluffing the children at once solves a lot of work to keep * the two structures in sync. The problem gets worse when * editing the tree -- this makes it a lot easier. */	TokenNameCOMMENT_JAVADOC	 Synchronizes the node's children with the internal structure. Fluffing the children at once solves a lot of work to keep the two structures in sync. The problem gets worse when editing the tree -- this makes it a lot easier. 
protected	TokenNameprotected	
void	TokenNamevoid	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * when we have elements with IDs this method is being recursively * called from synchronizeData, in which case we've already gone * through the following and we can now simply stop here. */	TokenNameCOMMENT_BLOCK	 when we have elements with IDs this method is being recursively called from synchronizeData, in which case we've already gone through the following and we can now simply stop here. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// we don't want to generate any event for this so turn them off 	TokenNameCOMMENT_LINE	we don't want to generate any event for this so turn them off 
boolean	TokenNameboolean	
orig	TokenNameIdentifier	 orig
=	TokenNameEQUAL	
mutationEvents	TokenNameIdentifier	 mutation Events
;	TokenNameSEMICOLON	
mutationEvents	TokenNameIdentifier	 mutation Events
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// no need to sync in the future 	TokenNameCOMMENT_LINE	no need to sync in the future 
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create children and link them as siblings 	TokenNameCOMMENT_LINE	create children and link them as siblings 
ChildNode	TokenNameIdentifier	 Child Node
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ChildNode	TokenNameIdentifier	 Child Node
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getPrevSibling	TokenNameIdentifier	 get Prev Sibling
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChildNode	TokenNameIdentifier	 Child Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
getNodeObject	TokenNameIdentifier	 get Node Object
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
ownerNode	TokenNameIdentifier	 owner Node
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
// save doctype and document type 	TokenNameCOMMENT_LINE	save doctype and document type 
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docElement	TokenNameIdentifier	 doc Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docType	TokenNameIdentifier	 doc Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocumentTypeImpl	TokenNameIdentifier	 Document Type Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// set mutation events flag back to its original value 	TokenNameCOMMENT_LINE	set mutation events flag back to its original value 
mutationEvents	TokenNameIdentifier	 mutation Events
=	TokenNameEQUAL	
orig	TokenNameIdentifier	 orig
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// synchronizeChildren() 	TokenNameCOMMENT_LINE	synchronizeChildren() 
/** * Synchronizes the node's children with the internal structure. * Fluffing the children at once solves a lot of work to keep * the two structures in sync. The problem gets worse when * editing the tree -- this makes it a lot easier. * This is not directly used in this class but this method is * here so that it can be shared by all deferred subclasses of AttrImpl. */	TokenNameCOMMENT_JAVADOC	 Synchronizes the node's children with the internal structure. Fluffing the children at once solves a lot of work to keep the two structures in sync. The problem gets worse when editing the tree -- this makes it a lot easier. This is not directly used in this class but this method is here so that it can be shared by all deferred subclasses of AttrImpl. 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
AttrImpl	TokenNameIdentifier	 Attr Impl
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we don't want to generate any event for this so turn them off 	TokenNameCOMMENT_LINE	we don't want to generate any event for this so turn them off 
boolean	TokenNameboolean	
orig	TokenNameIdentifier	 orig
=	TokenNameEQUAL	
getMutationEvents	TokenNameIdentifier	 get Mutation Events
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMutationEvents	TokenNameIdentifier	 set Mutation Events
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no need to sync in the future 	TokenNameCOMMENT_LINE	no need to sync in the future 
a	TokenNameIdentifier	 a
.	TokenNameDOT	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create children and link them as siblings or simply store the value 	TokenNameCOMMENT_LINE	create children and link them as siblings or simply store the value 
// as a String if all we have is one piece of text 	TokenNameCOMMENT_LINE	as a String if all we have is one piece of text 
int	TokenNameint	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
getPrevSibling	TokenNameIdentifier	 get Prev Sibling
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
getNodeValueString	TokenNameIdentifier	 get Node Value String
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ChildNode	TokenNameIdentifier	 Child Node
firstNode	TokenNameIdentifier	 first Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ChildNode	TokenNameIdentifier	 Child Node
lastNode	TokenNameIdentifier	 last Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getPrevSibling	TokenNameIdentifier	 get Prev Sibling
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChildNode	TokenNameIdentifier	 Child Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
getNodeObject	TokenNameIdentifier	 get Node Object
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastNode	TokenNameIdentifier	 last Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastNode	TokenNameIdentifier	 last Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
firstNode	TokenNameIdentifier	 first Node
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
ownerNode	TokenNameIdentifier	 owner Node
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
firstNode	TokenNameIdentifier	 first Node
;	TokenNameSEMICOLON	
firstNode	TokenNameIdentifier	 first Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastNode	TokenNameIdentifier	 last Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
firstNode	TokenNameIdentifier	 first Node
;	TokenNameSEMICOLON	
// firstChild = firstNode 	TokenNameCOMMENT_LINE	firstChild = firstNode 
firstNode	TokenNameIdentifier	 first Node
.	TokenNameDOT	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
lastNode	TokenNameIdentifier	 last Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// set mutation events flag back to its original value 	TokenNameCOMMENT_LINE	set mutation events flag back to its original value 
setMutationEvents	TokenNameIdentifier	 set Mutation Events
(	TokenNameLPAREN	
orig	TokenNameIdentifier	 orig
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// synchronizeChildren(AttrImpl,int):void 	TokenNameCOMMENT_LINE	synchronizeChildren(AttrImpl,int):void 
/** * Synchronizes the node's children with the internal structure. * Fluffing the children at once solves a lot of work to keep * the two structures in sync. The problem gets worse when * editing the tree -- this makes it a lot easier. * This is not directly used in this class but this method is * here so that it can be shared by all deferred subclasses of ParentNode. */	TokenNameCOMMENT_JAVADOC	 Synchronizes the node's children with the internal structure. Fluffing the children at once solves a lot of work to keep the two structures in sync. The problem gets worse when editing the tree -- this makes it a lot easier. This is not directly used in this class but this method is here so that it can be shared by all deferred subclasses of ParentNode. 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
ParentNode	TokenNameIdentifier	 Parent Node
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we don't want to generate any event for this so turn them off 	TokenNameCOMMENT_LINE	we don't want to generate any event for this so turn them off 
boolean	TokenNameboolean	
orig	TokenNameIdentifier	 orig
=	TokenNameEQUAL	
getMutationEvents	TokenNameIdentifier	 get Mutation Events
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMutationEvents	TokenNameIdentifier	 set Mutation Events
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no need to sync in the future 	TokenNameCOMMENT_LINE	no need to sync in the future 
p	TokenNameIdentifier	 p
.	TokenNameDOT	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create children and link them as siblings 	TokenNameCOMMENT_LINE	create children and link them as siblings 
ChildNode	TokenNameIdentifier	 Child Node
firstNode	TokenNameIdentifier	 first Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ChildNode	TokenNameIdentifier	 Child Node
lastNode	TokenNameIdentifier	 last Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getPrevSibling	TokenNameIdentifier	 get Prev Sibling
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChildNode	TokenNameIdentifier	 Child Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
getNodeObject	TokenNameIdentifier	 get Node Object
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastNode	TokenNameIdentifier	 last Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastNode	TokenNameIdentifier	 last Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
firstNode	TokenNameIdentifier	 first Node
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
ownerNode	TokenNameIdentifier	 owner Node
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
firstNode	TokenNameIdentifier	 first Node
;	TokenNameSEMICOLON	
firstNode	TokenNameIdentifier	 first Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastNode	TokenNameIdentifier	 last Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
firstNode	TokenNameIdentifier	 first Node
;	TokenNameSEMICOLON	
firstNode	TokenNameIdentifier	 first Node
.	TokenNameDOT	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
lastNode	TokenNameIdentifier	 last Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// set mutation events flag back to its original value 	TokenNameCOMMENT_LINE	set mutation events flag back to its original value 
setMutationEvents	TokenNameIdentifier	 set Mutation Events
(	TokenNameLPAREN	
orig	TokenNameIdentifier	 orig
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// synchronizeChildren(ParentNode,int):void 	TokenNameCOMMENT_LINE	synchronizeChildren(ParentNode,int):void 
// utility methods 	TokenNameCOMMENT_LINE	utility methods 
/** Ensures that the internal tables are large enough. */	TokenNameCOMMENT_JAVADOC	 Ensures that the internal tables are large enough. 
protected	TokenNameprotected	
void	TokenNamevoid	
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create buffers 	TokenNameCOMMENT_LINE	create buffers 
fNodeType	TokenNameIdentifier	 f Node Type
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fNodeName	TokenNameIdentifier	 f Node Name
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fNodeValue	TokenNameIdentifier	 f Node Value
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fNodeParent	TokenNameIdentifier	 f Node Parent
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fNodeURI	TokenNameIdentifier	 f Node URI
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fNodeExtra	TokenNameIdentifier	 f Node Extra
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// resize the tables 	TokenNameCOMMENT_LINE	resize the tables 
int	TokenNameint	
newsize	TokenNameIdentifier	 newsize
=	TokenNameEQUAL	
chunk	TokenNameIdentifier	 chunk
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNodeType	TokenNameIdentifier	 f Node Type
=	TokenNameEQUAL	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newStrArray	TokenNameIdentifier	 new Str Array
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newStrArray	TokenNameIdentifier	 new Str Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNodeName	TokenNameIdentifier	 f Node Name
=	TokenNameEQUAL	
newStrArray	TokenNameIdentifier	 new Str Array
;	TokenNameSEMICOLON	
newStrArray	TokenNameIdentifier	 new Str Array
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newStrArray	TokenNameIdentifier	 new Str Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNodeValue	TokenNameIdentifier	 f Node Value
=	TokenNameEQUAL	
newStrArray	TokenNameIdentifier	 new Str Array
;	TokenNameSEMICOLON	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fNodeParent	TokenNameIdentifier	 f Node Parent
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNodeParent	TokenNameIdentifier	 f Node Parent
=	TokenNameEQUAL	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
=	TokenNameEQUAL	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
=	TokenNameEQUAL	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
newStrArray	TokenNameIdentifier	 new Str Array
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fNodeURI	TokenNameIdentifier	 f Node URI
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newStrArray	TokenNameIdentifier	 new Str Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNodeURI	TokenNameIdentifier	 f Node URI
=	TokenNameEQUAL	
newStrArray	TokenNameIdentifier	 new Str Array
;	TokenNameSEMICOLON	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNodeExtra	TokenNameIdentifier	 f Node Extra
=	TokenNameEQUAL	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Done - there's sufficient capacity 	TokenNameCOMMENT_LINE	Done - there's sufficient capacity 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create new chunks 	TokenNameCOMMENT_LINE	create new chunks 
createChunk	TokenNameIdentifier	 create Chunk
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createChunk	TokenNameIdentifier	 create Chunk
(	TokenNameLPAREN	
fNodeName	TokenNameIdentifier	 f Node Name
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createChunk	TokenNameIdentifier	 create Chunk
(	TokenNameLPAREN	
fNodeValue	TokenNameIdentifier	 f Node Value
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createChunk	TokenNameIdentifier	 create Chunk
(	TokenNameLPAREN	
fNodeParent	TokenNameIdentifier	 f Node Parent
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createChunk	TokenNameIdentifier	 create Chunk
(	TokenNameLPAREN	
fNodeLastChild	TokenNameIdentifier	 f Node Last Child
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createChunk	TokenNameIdentifier	 create Chunk
(	TokenNameLPAREN	
fNodePrevSib	TokenNameIdentifier	 f Node Prev Sib
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createChunk	TokenNameIdentifier	 create Chunk
(	TokenNameLPAREN	
fNodeURI	TokenNameIdentifier	 f Node URI
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createChunk	TokenNameIdentifier	 create Chunk
(	TokenNameLPAREN	
fNodeExtra	TokenNameIdentifier	 f Node Extra
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Done 	TokenNameCOMMENT_LINE	Done 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ensureCapacity(int,int) 	TokenNameCOMMENT_LINE	ensureCapacity(int,int) 
/** Creates a node of the specified type. */	TokenNameCOMMENT_JAVADOC	 Creates a node of the specified type. 
protected	TokenNameprotected	
int	TokenNameint	
createNode	TokenNameIdentifier	 create Node
(	TokenNameLPAREN	
short	TokenNameshort	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ensure tables are large enough 	TokenNameCOMMENT_LINE	ensure tables are large enough 
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
fNodeCount	TokenNameIdentifier	 f Node Count
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fNodeCount	TokenNameIdentifier	 f Node Count
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// initialize node 	TokenNameCOMMENT_LINE	initialize node 
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
fNodeType	TokenNameIdentifier	 f Node Type
,	TokenNameCOMMA	
nodeType	TokenNameIdentifier	 node Type
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return node index number 	TokenNameCOMMENT_LINE	return node index number 
return	TokenNamereturn	
fNodeCount	TokenNameIdentifier	 f Node Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createNode(short):int 	TokenNameCOMMENT_LINE	createNode(short):int 
/** * Performs a binary search for a target value in an array of * values. The array of values must be in ascending sorted order * before calling this method and all array values must be * non-negative. * * @param values The array of values to search. * @param start The starting offset of the search. * @param end The ending offset of the search. * @param target The target value. * * @return This function will return the <i>first</i> occurrence * of the target value, or -1 if the target value cannot * be found. */	TokenNameCOMMENT_JAVADOC	 Performs a binary search for a target value in an array of values. The array of values must be in ascending sorted order before calling this method and all array values must be non-negative. * @param values The array of values to search. @param start The starting offset of the search. @param end The ending offset of the search. @param target The target value. * @return This function will return the <i>first</i> occurrence of the target value, or -1 if the target value cannot be found. 
protected	TokenNameprotected	
static	TokenNamestatic	
int	TokenNameint	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_IDS	TokenNameIdentifier	 DEBUG  IDS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"binarySearch(), target: "	TokenNameStringLiteral	binarySearch(), target: 
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// look for target value 	TokenNameCOMMENT_LINE	look for target value 
while	TokenNamewhile	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<=	TokenNameLESS_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// is this the one we're looking for? 	TokenNameCOMMENT_LINE	is this the one we're looking for? 
int	TokenNameint	
middle	TokenNameIdentifier	 middle
=	TokenNameEQUAL	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
middle	TokenNameIdentifier	 middle
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_IDS	TokenNameIdentifier	 DEBUG  IDS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" value: "	TokenNameStringLiteral	 value: 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
", target: "	TokenNameStringLiteral	, target: 
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
+	TokenNamePLUS	
" // "	TokenNameStringLiteral	 // 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
middle	TokenNameIdentifier	 middle
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
middle	TokenNameIdentifier	 middle
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
middle	TokenNameIdentifier	 middle
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
middle	TokenNameIdentifier	 middle
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_IDS	TokenNameIdentifier	 DEBUG  IDS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"FOUND AT "	TokenNameStringLiteral	FOUND AT 
+	TokenNamePLUS	
middle	TokenNameIdentifier	 middle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
middle	TokenNameIdentifier	 middle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// is this point higher or lower? 	TokenNameCOMMENT_LINE	is this point higher or lower? 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
>	TokenNameGREATER	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
middle	TokenNameIdentifier	 middle
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
middle	TokenNameIdentifier	 middle
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// while 	TokenNameCOMMENT_LINE	while 
// not found 	TokenNameCOMMENT_LINE	not found 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_IDS	TokenNameIdentifier	 DEBUG  IDS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"NOT FOUND!"	TokenNameStringLiteral	NOT FOUND!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// binarySearch(int[],int,int,int):int 	TokenNameCOMMENT_LINE	binarySearch(int[],int,int,int):int 
// 	TokenNameCOMMENT_LINE	 
// Private methods 	TokenNameCOMMENT_LINE	Private methods 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
INIT_ARRAY	TokenNameIdentifier	 INIT  ARRAY
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
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
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
INIT_ARRAY	TokenNameIdentifier	 INIT  ARRAY
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Creates the specified chunk in the given array of chunks. */	TokenNameCOMMENT_JAVADOC	 Creates the specified chunk in the given array of chunks. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
createChunk	TokenNameIdentifier	 create Chunk
(	TokenNameLPAREN	
int	TokenNameint	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
INIT_ARRAY	TokenNameIdentifier	 INIT  ARRAY
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
RefCount	TokenNameIdentifier	 Ref Count
{	TokenNameLBRACE	
int	TokenNameint	
fCount	TokenNameIdentifier	 f Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
createChunk	TokenNameIdentifier	 create Chunk
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
RefCount	TokenNameIdentifier	 Ref Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the specified value in the given of data at the chunk and index. * * @return Returns the old value. */	TokenNameCOMMENT_JAVADOC	 Sets the specified value in the given of data at the chunk and index. * @return Returns the old value. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
setChunkIndex	TokenNameIdentifier	 set Chunk Index
(	TokenNameLPAREN	
int	TokenNameint	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clearChunkIndex	TokenNameIdentifier	 clear Chunk Index
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dataChunk	TokenNameIdentifier	 data Chunk
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Re-create chunk if it was deleted. 	TokenNameCOMMENT_LINE	Re-create chunk if it was deleted. 
if	TokenNameif	
(	TokenNameLPAREN	
dataChunk	TokenNameIdentifier	 data Chunk
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createChunk	TokenNameIdentifier	 create Chunk
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataChunk	TokenNameIdentifier	 data Chunk
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
ovalue	TokenNameIdentifier	 ovalue
=	TokenNameEQUAL	
dataChunk	TokenNameIdentifier	 data Chunk
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ovalue	TokenNameIdentifier	 ovalue
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataChunk	TokenNameIdentifier	 data Chunk
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dataChunk	TokenNameIdentifier	 data Chunk
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ovalue	TokenNameIdentifier	 ovalue
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
setChunkValue	TokenNameIdentifier	 set Chunk Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clearChunkValue	TokenNameIdentifier	 clear Chunk Value
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dataChunk	TokenNameIdentifier	 data Chunk
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Re-create chunk if it was deleted. 	TokenNameCOMMENT_LINE	Re-create chunk if it was deleted. 
if	TokenNameif	
(	TokenNameLPAREN	
dataChunk	TokenNameIdentifier	 data Chunk
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createChunk	TokenNameIdentifier	 create Chunk
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataChunk	TokenNameIdentifier	 data Chunk
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
ovalue	TokenNameIdentifier	 ovalue
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
dataChunk	TokenNameIdentifier	 data Chunk
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ovalue	TokenNameIdentifier	 ovalue
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RefCount	TokenNameIdentifier	 Ref Count
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RefCount	TokenNameIdentifier	 Ref Count
)	TokenNameRPAREN	
dataChunk	TokenNameIdentifier	 data Chunk
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
fCount	TokenNameIdentifier	 f Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dataChunk	TokenNameIdentifier	 data Chunk
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ovalue	TokenNameIdentifier	 ovalue
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified value in the given data at the chunk and index. */	TokenNameCOMMENT_JAVADOC	 Returns the specified value in the given data at the chunk and index. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
getChunkIndex	TokenNameIdentifier	 get Chunk Index
(	TokenNameLPAREN	
int	TokenNameint	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getChunkValue	TokenNameIdentifier	 get Chunk Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
fNodeValue	TokenNameIdentifier	 f Node Value
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// type information 	TokenNameCOMMENT_LINE	type information 
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Clears the specified value in the given data at the chunk and index. * Note that this method will clear the given chunk if the reference * count becomes zero. * * @return Returns the old value. */	TokenNameCOMMENT_JAVADOC	 Clears the specified value in the given data at the chunk and index. Note that this method will clear the given chunk if the reference count becomes zero. * @return Returns the old value. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
clearChunkIndex	TokenNameIdentifier	 clear Chunk Index
(	TokenNameLPAREN	
int	TokenNameint	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
clearChunkValue	TokenNameIdentifier	 clear Chunk Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
RefCount	TokenNameIdentifier	 Ref Count
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RefCount	TokenNameIdentifier	 Ref Count
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
fCount	TokenNameIdentifier	 f Count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
fCount	TokenNameIdentifier	 f Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This version of putIdentifier is needed to avoid fluffing * all of the paths to ID attributes when a node object is * created that contains an ID attribute. */	TokenNameCOMMENT_JAVADOC	 This version of putIdentifier is needed to avoid fluffing all of the paths to ID attributes when a node object is created that contains an ID attribute. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
putIdentifier0	TokenNameIdentifier	 put Identifier0
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
idName	TokenNameIdentifier	 id Name
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_IDS	TokenNameIdentifier	 DEBUG  IDS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"putIdentifier0("	TokenNameStringLiteral	putIdentifier0(
+	TokenNamePLUS	
idName	TokenNameIdentifier	 id Name
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
element	TokenNameIdentifier	 element
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create hashtable 	TokenNameCOMMENT_LINE	create hashtable 
if	TokenNameif	
(	TokenNameLPAREN	
identifiers	TokenNameIdentifier	 identifiers
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
identifiers	TokenNameIdentifier	 identifiers
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// save ID and its associated element 	TokenNameCOMMENT_LINE	save ID and its associated element 
identifiers	TokenNameIdentifier	 identifiers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
idName	TokenNameIdentifier	 id Name
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// putIdentifier0(String,Element) 	TokenNameCOMMENT_LINE	putIdentifier0(String,Element) 
/** Prints the ID array. */	TokenNameCOMMENT_JAVADOC	 Prints the ID array. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
int	TokenNameint	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
int	TokenNameint	
middle	TokenNameIdentifier	 middle
,	TokenNameCOMMA	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_IDS	TokenNameIdentifier	 DEBUG  IDS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" ["	TokenNameStringLiteral	 [
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
middle	TokenNameIdentifier	 middle
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"!"	TokenNameStringLiteral	!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"] "	TokenNameStringLiteral	] 
+	TokenNamePLUS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// print(int[],int,int,int,int) 	TokenNameCOMMENT_LINE	print(int[],int,int,int,int) 
// 	TokenNameCOMMENT_LINE	 
// Classes 	TokenNameCOMMENT_LINE	Classes 
// 	TokenNameCOMMENT_LINE	 
/** * A simple integer vector. */	TokenNameCOMMENT_JAVADOC	 A simple integer vector. 
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
IntVector	TokenNameIdentifier	 Int Vector
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Data. */	TokenNameCOMMENT_JAVADOC	 Data. 
private	TokenNameprivate	
int	TokenNameint	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Size. */	TokenNameCOMMENT_JAVADOC	 Size. 
private	TokenNameprivate	
int	TokenNameint	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns the length of this vector. */	TokenNameCOMMENT_JAVADOC	 Returns the length of this vector. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the element at the specified index. */	TokenNameCOMMENT_JAVADOC	 Returns the element at the specified index. 
public	TokenNamepublic	
int	TokenNameint	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Appends an element to the end of the vector. */	TokenNameCOMMENT_JAVADOC	 Appends an element to the end of the vector. 
public	TokenNamepublic	
void	TokenNamevoid	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
int	TokenNameint	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Clears the vector. */	TokenNameCOMMENT_JAVADOC	 Clears the vector. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Private methods 	TokenNameCOMMENT_LINE	Private methods 
// 	TokenNameCOMMENT_LINE	 
/** Makes sure that there is enough storage. */	TokenNameCOMMENT_JAVADOC	 Makes sure that there is enough storage. 
private	TokenNameprivate	
void	TokenNamevoid	
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
int	TokenNameint	
newsize	TokenNameIdentifier	 newsize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
+	TokenNamePLUS	
15	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
newsize	TokenNameIdentifier	 newsize
>	TokenNameGREATER	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newdata	TokenNameIdentifier	 newdata
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
+	TokenNamePLUS	
15	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newdata	TokenNameIdentifier	 newdata
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
newdata	TokenNameIdentifier	 newdata
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ensureCapacity(int) 	TokenNameCOMMENT_LINE	ensureCapacity(int) 
}	TokenNameRBRACE	
// class IntVector 	TokenNameCOMMENT_LINE	class IntVector 
}	TokenNameRBRACE	
// class DeferredDocumentImpl 	TokenNameCOMMENT_LINE	class DeferredDocumentImpl 
