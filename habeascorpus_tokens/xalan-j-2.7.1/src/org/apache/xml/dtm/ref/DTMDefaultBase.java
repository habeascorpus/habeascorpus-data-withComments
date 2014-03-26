/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMDefaultBase.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMDefaultBase.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
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
*	TokenNameMULTIPLY	
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
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
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
BoolStack	TokenNameIdentifier	 Bool Stack
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
Source	TokenNameIdentifier	 Source
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLMessages	TokenNameIdentifier	 XML Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
// for dumpDTM 	TokenNameCOMMENT_LINE	for dumpDTM 
/** * The <code>DTMDefaultBase</code> class serves as a helper base for DTMs. * It sets up structures for navigation and type, while leaving data * management and construction to the derived classes. */	TokenNameCOMMENT_JAVADOC	 The <code>DTMDefaultBase</code> class serves as a helper base for DTMs. It sets up structures for navigation and type, while leaving data management and construction to the derived classes. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
implements	TokenNameimplements	
DTM	TokenNameIdentifier	 DTM
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
JJK_DEBUG	TokenNameIdentifier	 JJK  DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// This constant is likely to be removed in the future. Use the 	TokenNameCOMMENT_LINE	This constant is likely to be removed in the future. Use the 
// getDocument() method instead of ROOTNODE to get at the root 	TokenNameCOMMENT_LINE	getDocument() method instead of ROOTNODE to get at the root 
// node of a DTM. 	TokenNameCOMMENT_LINE	node of a DTM. 
/** The identity of the root node. */	TokenNameCOMMENT_JAVADOC	 The identity of the root node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The number of nodes, which is also used to determine the next * node index. */	TokenNameCOMMENT_JAVADOC	 The number of nodes, which is also used to determine the next node index. 
protected	TokenNameprotected	
int	TokenNameint	
m_size	TokenNameIdentifier	 m size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The expanded names, one array element for each node. */	TokenNameCOMMENT_JAVADOC	 The expanded names, one array element for each node. 
protected	TokenNameprotected	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
m_exptype	TokenNameIdentifier	 m exptype
;	TokenNameSEMICOLON	
/** First child values, one array element for each node. */	TokenNameCOMMENT_JAVADOC	 First child values, one array element for each node. 
protected	TokenNameprotected	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
m_firstch	TokenNameIdentifier	 m firstch
;	TokenNameSEMICOLON	
/** Next sibling values, one array element for each node. */	TokenNameCOMMENT_JAVADOC	 Next sibling values, one array element for each node. 
protected	TokenNameprotected	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
m_nextsib	TokenNameIdentifier	 m nextsib
;	TokenNameSEMICOLON	
/** Previous sibling values, one array element for each node. */	TokenNameCOMMENT_JAVADOC	 Previous sibling values, one array element for each node. 
protected	TokenNameprotected	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
m_prevsib	TokenNameIdentifier	 m prevsib
;	TokenNameSEMICOLON	
/** Previous sibling values, one array element for each node. */	TokenNameCOMMENT_JAVADOC	 Previous sibling values, one array element for each node. 
protected	TokenNameprotected	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
m_parent	TokenNameIdentifier	 m parent
;	TokenNameSEMICOLON	
/** Vector of SuballocatedIntVectors of NS decl sets */	TokenNameCOMMENT_JAVADOC	 Vector of SuballocatedIntVectors of NS decl sets 
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** SuballocatedIntVector of elements at which corresponding * namespaceDeclSets were defined */	TokenNameCOMMENT_JAVADOC	 SuballocatedIntVector of elements at which corresponding namespaceDeclSets were defined 
protected	TokenNameprotected	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * These hold indexes to elements based on namespace and local name. * The base lookup is the the namespace. The second lookup is the local * name, and the last array contains the the first free element * at the start, and the list of element handles following. */	TokenNameCOMMENT_JAVADOC	 These hold indexes to elements based on namespace and local name. The base lookup is the the namespace. The second lookup is the local name, and the last array contains the the first free element at the start, and the list of element handles following. 
protected	TokenNameprotected	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_elemIndexes	TokenNameIdentifier	 m elem Indexes
;	TokenNameSEMICOLON	
/** The default block size of the node arrays */	TokenNameCOMMENT_JAVADOC	 The default block size of the node arrays 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_BLOCKSIZE	TokenNameIdentifier	 DEFAULT  BLOCKSIZE
=	TokenNameEQUAL	
512	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// favor small docs. 	TokenNameCOMMENT_LINE	favor small docs. 
/** The number of blocks for the node arrays */	TokenNameCOMMENT_JAVADOC	 The number of blocks for the node arrays 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_NUMBLOCKS	TokenNameIdentifier	 DEFAULT  NUMBLOCKS
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The number of blocks used for small documents & RTFs */	TokenNameCOMMENT_JAVADOC	 The number of blocks used for small documents & RTFs 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_NUMBLOCKS_SMALL	TokenNameIdentifier	 DEFAULT  NUMBLOCKS  SMALL
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The block size of the node arrays */	TokenNameCOMMENT_JAVADOC	 The block size of the node arrays 
//protected final int m_blocksize; 	TokenNameCOMMENT_LINE	protected final int m_blocksize; 
/** * The value to use when the information has not been built yet. */	TokenNameCOMMENT_JAVADOC	 The value to use when the information has not been built yet. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The DTM manager who "owns" this DTM. */	TokenNameCOMMENT_JAVADOC	 The DTM manager who "owns" this DTM. 
public	TokenNamepublic	
DTMManager	TokenNameIdentifier	 DTM Manager
m_mgr	TokenNameIdentifier	 m mgr
;	TokenNameSEMICOLON	
/** * m_mgr cast to DTMManagerDefault, or null if it isn't an instance * (Efficiency hook) */	TokenNameCOMMENT_JAVADOC	 m_mgr cast to DTMManagerDefault, or null if it isn't an instance (Efficiency hook) 
protected	TokenNameprotected	
DTMManagerDefault	TokenNameIdentifier	 DTM Manager Default
m_mgrDefault	TokenNameIdentifier	 m mgr Default
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The document identity number(s). If we have overflowed the addressing * range of the first that was assigned to us, we may add others. */	TokenNameCOMMENT_JAVADOC	 The document identity number(s). If we have overflowed the addressing range of the first that was assigned to us, we may add others. 
protected	TokenNameprotected	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
m_dtmIdent	TokenNameIdentifier	 m dtm Ident
;	TokenNameSEMICOLON	
/** The mask for the identity. %REVIEW% Should this really be set to the _DEFAULT? What if a particular DTM wanted to use another value? */	TokenNameCOMMENT_JAVADOC	 The mask for the identity. %REVIEW% Should this really be set to the _DEFAULT? What if a particular DTM wanted to use another value? 
//protected final static int m_mask = DTMManager.IDENT_NODE_DEFAULT; 	TokenNameCOMMENT_LINE	protected final static int m_mask = DTMManager.IDENT_NODE_DEFAULT; 
/** The base URI for this document. */	TokenNameCOMMENT_JAVADOC	 The base URI for this document. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_documentBaseURI	TokenNameIdentifier	 m document Base URI
;	TokenNameSEMICOLON	
/** * The whitespace filter that enables elements to strip whitespace or not. */	TokenNameCOMMENT_JAVADOC	 The whitespace filter that enables elements to strip whitespace or not. 
protected	TokenNameprotected	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
m_wsfilter	TokenNameIdentifier	 m wsfilter
;	TokenNameSEMICOLON	
/** Flag indicating whether to strip whitespace nodes */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether to strip whitespace nodes 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_shouldStripWS	TokenNameIdentifier	 m should Strip WS
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Stack of flags indicating whether to strip whitespace nodes */	TokenNameCOMMENT_JAVADOC	 Stack of flags indicating whether to strip whitespace nodes 
protected	TokenNameprotected	
BoolStack	TokenNameIdentifier	 Bool Stack
m_shouldStripWhitespaceStack	TokenNameIdentifier	 m should Strip Whitespace Stack
;	TokenNameSEMICOLON	
/** The XMLString factory for creating XMLStrings. */	TokenNameCOMMENT_JAVADOC	 The XMLString factory for creating XMLStrings. 
protected	TokenNameprotected	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
m_xstrf	TokenNameIdentifier	 m xstrf
;	TokenNameSEMICOLON	
/** * The table for exandedNameID lookups. This may or may not be the same * table as is contained in the DTMManagerDefault. */	TokenNameCOMMENT_JAVADOC	 The table for exandedNameID lookups. This may or may not be the same table as is contained in the DTMManagerDefault. 
protected	TokenNameprotected	
ExpandedNameTable	TokenNameIdentifier	 Expanded Name Table
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
;	TokenNameSEMICOLON	
/** true if indexing is turned on. */	TokenNameCOMMENT_JAVADOC	 true if indexing is turned on. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_indexing	TokenNameIdentifier	 m indexing
;	TokenNameSEMICOLON	
/** * Construct a DTMDefaultBase object using the default block size. * * @param mgr The DTMManager who owns this DTM. * @param source The object that is used to specify the construction source. * @param dtmIdentity The DTM identity ID for this DTM. * @param whiteSpaceFilter The white space filter for this DTM, which may * be null. * @param xstringfactory The factory to use for creating XMLStrings. * @param doIndexing true if the caller considers it worth it to use * indexing schemes. */	TokenNameCOMMENT_JAVADOC	 Construct a DTMDefaultBase object using the default block size. * @param mgr The DTMManager who owns this DTM. @param source The object that is used to specify the construction source. @param dtmIdentity The DTM identity ID for this DTM. @param whiteSpaceFilter The white space filter for this DTM, which may be null. @param xstringfactory The factory to use for creating XMLStrings. @param doIndexing true if the caller considers it worth it to use indexing schemes. 
public	TokenNamepublic	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
int	TokenNameint	
dtmIdentity	TokenNameIdentifier	 dtm Identity
,	TokenNameCOMMA	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
xstringfactory	TokenNameIdentifier	 xstringfactory
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doIndexing	TokenNameIdentifier	 do Indexing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
dtmIdentity	TokenNameIdentifier	 dtm Identity
,	TokenNameCOMMA	
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
xstringfactory	TokenNameIdentifier	 xstringfactory
,	TokenNameCOMMA	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
DEFAULT_BLOCKSIZE	TokenNameIdentifier	 DEFAULT  BLOCKSIZE
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a DTMDefaultBase object from a DOM node. * * @param mgr The DTMManager who owns this DTM. * @param source The object that is used to specify the construction source. * @param dtmIdentity The DTM identity ID for this DTM. * @param whiteSpaceFilter The white space filter for this DTM, which may * be null. * @param xstringfactory The factory to use for creating XMLStrings. * @param doIndexing true if the caller considers it worth it to use * indexing schemes. * @param blocksize The block size of the DTM. * @param usePrevsib true if we want to build the previous sibling node array. * @param newNameTable true if we want to use a new ExpandedNameTable for this DTM. */	TokenNameCOMMENT_JAVADOC	 Construct a DTMDefaultBase object from a DOM node. * @param mgr The DTMManager who owns this DTM. @param source The object that is used to specify the construction source. @param dtmIdentity The DTM identity ID for this DTM. @param whiteSpaceFilter The white space filter for this DTM, which may be null. @param xstringfactory The factory to use for creating XMLStrings. @param doIndexing true if the caller considers it worth it to use indexing schemes. @param blocksize The block size of the DTM. @param usePrevsib true if we want to build the previous sibling node array. @param newNameTable true if we want to use a new ExpandedNameTable for this DTM. 
public	TokenNamepublic	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
int	TokenNameint	
dtmIdentity	TokenNameIdentifier	 dtm Identity
,	TokenNameCOMMA	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
xstringfactory	TokenNameIdentifier	 xstringfactory
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
int	TokenNameint	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
boolean	TokenNameboolean	
usePrevsib	TokenNameIdentifier	 use Prevsib
,	TokenNameCOMMA	
boolean	TokenNameboolean	
newNameTable	TokenNameIdentifier	 new Name Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Use smaller sizes for the internal node arrays if the block size 	TokenNameCOMMENT_LINE	Use smaller sizes for the internal node arrays if the block size 
// is small. 	TokenNameCOMMENT_LINE	is small. 
int	TokenNameint	
numblocks	TokenNameIdentifier	 numblocks
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
<=	TokenNameLESS_EQUAL	
64	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numblocks	TokenNameIdentifier	 numblocks
=	TokenNameEQUAL	
DEFAULT_NUMBLOCKS_SMALL	TokenNameIdentifier	 DEFAULT  NUMBLOCKS  SMALL
;	TokenNameSEMICOLON	
m_dtmIdent	TokenNameIdentifier	 m dtm Ident
=	TokenNameEQUAL	
new	TokenNamenew	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
numblocks	TokenNameIdentifier	 numblocks
=	TokenNameEQUAL	
DEFAULT_NUMBLOCKS	TokenNameIdentifier	 DEFAULT  NUMBLOCKS
;	TokenNameSEMICOLON	
m_dtmIdent	TokenNameIdentifier	 m dtm Ident
=	TokenNameEQUAL	
new	TokenNamenew	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_exptype	TokenNameIdentifier	 m exptype
=	TokenNameEQUAL	
new	TokenNamenew	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
numblocks	TokenNameIdentifier	 numblocks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_firstch	TokenNameIdentifier	 m firstch
=	TokenNameEQUAL	
new	TokenNamenew	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
numblocks	TokenNameIdentifier	 numblocks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nextsib	TokenNameIdentifier	 m nextsib
=	TokenNameEQUAL	
new	TokenNamenew	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
numblocks	TokenNameIdentifier	 numblocks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parent	TokenNameIdentifier	 m parent
=	TokenNameEQUAL	
new	TokenNamenew	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
numblocks	TokenNameIdentifier	 numblocks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Only create the m_prevsib array if the usePrevsib flag is true. 	TokenNameCOMMENT_LINE	Only create the m_prevsib array if the usePrevsib flag is true. 
// Some DTM implementations (e.g. SAXImpl) do not need this array. 	TokenNameCOMMENT_LINE	Some DTM implementations (e.g. SAXImpl) do not need this array. 
// We can save the time to build it in those cases. 	TokenNameCOMMENT_LINE	We can save the time to build it in those cases. 
if	TokenNameif	
(	TokenNameLPAREN	
usePrevsib	TokenNameIdentifier	 use Prevsib
)	TokenNameRPAREN	
m_prevsib	TokenNameIdentifier	 m prevsib
=	TokenNameEQUAL	
new	TokenNamenew	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
numblocks	TokenNameIdentifier	 numblocks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_mgr	TokenNameIdentifier	 m mgr
=	TokenNameEQUAL	
mgr	TokenNameIdentifier	 mgr
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mgr	TokenNameIdentifier	 mgr
instanceof	TokenNameinstanceof	
DTMManagerDefault	TokenNameIdentifier	 DTM Manager Default
)	TokenNameRPAREN	
m_mgrDefault	TokenNameIdentifier	 m mgr Default
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMManagerDefault	TokenNameIdentifier	 DTM Manager Default
)	TokenNameRPAREN	
mgr	TokenNameIdentifier	 mgr
;	TokenNameSEMICOLON	
m_documentBaseURI	TokenNameIdentifier	 m document Base URI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
?	TokenNameQUESTION	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_dtmIdent	TokenNameIdentifier	 m dtm Ident
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
dtmIdentity	TokenNameIdentifier	 dtm Identity
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_wsfilter	TokenNameIdentifier	 m wsfilter
=	TokenNameEQUAL	
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
;	TokenNameSEMICOLON	
m_xstrf	TokenNameIdentifier	 m xstrf
=	TokenNameEQUAL	
xstringfactory	TokenNameIdentifier	 xstringfactory
;	TokenNameSEMICOLON	
m_indexing	TokenNameIdentifier	 m indexing
=	TokenNameEQUAL	
doIndexing	TokenNameIdentifier	 do Indexing
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doIndexing	TokenNameIdentifier	 do Indexing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
=	TokenNameEQUAL	
new	TokenNamenew	
ExpandedNameTable	TokenNameIdentifier	 Expanded Name Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Note that this fails if we aren't talking to an instance of 	TokenNameCOMMENT_LINE	Note that this fails if we aren't talking to an instance of 
// DTMManagerDefault 	TokenNameCOMMENT_LINE	DTMManagerDefault 
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
=	TokenNameEQUAL	
m_mgrDefault	TokenNameIdentifier	 m mgr Default
.	TokenNameDOT	
getExpandedNameTable	TokenNameIdentifier	 get Expanded Name Table
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_shouldStripWhitespaceStack	TokenNameIdentifier	 m should Strip Whitespace Stack
=	TokenNameEQUAL	
new	TokenNamenew	
BoolStack	TokenNameIdentifier	 Bool Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushShouldStripWhitespace	TokenNameIdentifier	 push Should Strip Whitespace
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Ensure that the size of the element indexes can hold the information. * * @param namespaceID Namespace ID index. * @param LocalNameID Local name ID. */	TokenNameCOMMENT_JAVADOC	 Ensure that the size of the element indexes can hold the information. * @param namespaceID Namespace ID index. @param LocalNameID Local name ID. 
protected	TokenNameprotected	
void	TokenNamevoid	
ensureSizeOfIndex	TokenNameIdentifier	 ensure Size Of Index
(	TokenNameLPAREN	
int	TokenNameint	
namespaceID	TokenNameIdentifier	 namespace ID
,	TokenNameCOMMA	
int	TokenNameint	
LocalNameID	TokenNameIdentifier	 Local Name ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_elemIndexes	TokenNameIdentifier	 m elem Indexes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_elemIndexes	TokenNameIdentifier	 m elem Indexes
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
namespaceID	TokenNameIdentifier	 namespace ID
+	TokenNamePLUS	
20	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemIndexes	TokenNameIdentifier	 m elem Indexes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
namespaceID	TokenNameIdentifier	 namespace ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
indexes	TokenNameIdentifier	 indexes
=	TokenNameEQUAL	
m_elemIndexes	TokenNameIdentifier	 m elem Indexes
;	TokenNameSEMICOLON	
m_elemIndexes	TokenNameIdentifier	 m elem Indexes
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
namespaceID	TokenNameIdentifier	 namespace ID
+	TokenNamePLUS	
20	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_elemIndexes	TokenNameIdentifier	 m elem Indexes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
localNameIndex	TokenNameIdentifier	 local Name Index
=	TokenNameEQUAL	
m_elemIndexes	TokenNameIdentifier	 m elem Indexes
[	TokenNameLBRACKET	
namespaceID	TokenNameIdentifier	 namespace ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
localNameIndex	TokenNameIdentifier	 local Name Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localNameIndex	TokenNameIdentifier	 local Name Index
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
LocalNameID	TokenNameIdentifier	 Local Name ID
+	TokenNamePLUS	
100	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_elemIndexes	TokenNameIdentifier	 m elem Indexes
[	TokenNameLBRACKET	
namespaceID	TokenNameIdentifier	 namespace ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
localNameIndex	TokenNameIdentifier	 local Name Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
localNameIndex	TokenNameIdentifier	 local Name Index
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
LocalNameID	TokenNameIdentifier	 Local Name ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
indexes	TokenNameIdentifier	 indexes
=	TokenNameEQUAL	
localNameIndex	TokenNameIdentifier	 local Name Index
;	TokenNameSEMICOLON	
localNameIndex	TokenNameIdentifier	 local Name Index
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
LocalNameID	TokenNameIdentifier	 Local Name ID
+	TokenNamePLUS	
100	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
localNameIndex	TokenNameIdentifier	 local Name Index
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elemIndexes	TokenNameIdentifier	 m elem Indexes
[	TokenNameLBRACKET	
namespaceID	TokenNameIdentifier	 namespace ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
localNameIndex	TokenNameIdentifier	 local Name Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elemHandles	TokenNameIdentifier	 elem Handles
=	TokenNameEQUAL	
localNameIndex	TokenNameIdentifier	 local Name Index
[	TokenNameLBRACKET	
LocalNameID	TokenNameIdentifier	 Local Name ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
elemHandles	TokenNameIdentifier	 elem Handles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elemHandles	TokenNameIdentifier	 elem Handles
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
128	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
localNameIndex	TokenNameIdentifier	 local Name Index
[	TokenNameLBRACKET	
LocalNameID	TokenNameIdentifier	 Local Name ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
elemHandles	TokenNameIdentifier	 elem Handles
;	TokenNameSEMICOLON	
elemHandles	TokenNameIdentifier	 elem Handles
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
elemHandles	TokenNameIdentifier	 elem Handles
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
elemHandles	TokenNameIdentifier	 elem Handles
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
indexes	TokenNameIdentifier	 indexes
=	TokenNameEQUAL	
elemHandles	TokenNameIdentifier	 elem Handles
;	TokenNameSEMICOLON	
elemHandles	TokenNameIdentifier	 elem Handles
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
elemHandles	TokenNameIdentifier	 elem Handles
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1024	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
elemHandles	TokenNameIdentifier	 elem Handles
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localNameIndex	TokenNameIdentifier	 local Name Index
[	TokenNameLBRACKET	
LocalNameID	TokenNameIdentifier	 Local Name ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
elemHandles	TokenNameIdentifier	 elem Handles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a node to the element indexes. The node will not be added unless * it's an element. * * @param expandedTypeID The expanded type ID of the node. * @param identity The node identity index. */	TokenNameCOMMENT_JAVADOC	 Add a node to the element indexes. The node will not be added unless it's an element. * @param expandedTypeID The expanded type ID of the node. @param identity The node identity index. 
protected	TokenNameprotected	
void	TokenNamevoid	
indexNode	TokenNameIdentifier	 index Node
(	TokenNameLPAREN	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
,	TokenNameCOMMA	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExpandedNameTable	TokenNameIdentifier	 Expanded Name Table
ent	TokenNameIdentifier	 ent
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
;	TokenNameSEMICOLON	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
ent	TokenNameIdentifier	 ent
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
namespaceID	TokenNameIdentifier	 namespace ID
=	TokenNameEQUAL	
ent	TokenNameIdentifier	 ent
.	TokenNameDOT	
getNamespaceID	TokenNameIdentifier	 get Namespace ID
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
localNameID	TokenNameIdentifier	 local Name ID
=	TokenNameEQUAL	
ent	TokenNameIdentifier	 ent
.	TokenNameDOT	
getLocalNameID	TokenNameIdentifier	 get Local Name ID
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ensureSizeOfIndex	TokenNameIdentifier	 ensure Size Of Index
(	TokenNameLPAREN	
namespaceID	TokenNameIdentifier	 namespace ID
,	TokenNameCOMMA	
localNameID	TokenNameIdentifier	 local Name ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_elemIndexes	TokenNameIdentifier	 m elem Indexes
[	TokenNameLBRACKET	
namespaceID	TokenNameIdentifier	 namespace ID
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
localNameID	TokenNameIdentifier	 local Name ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Find the first index that occurs in the list that is greater than or * equal to the given value. * * @param list A list of integers. * @param start The start index to begin the search. * @param len The number of items to search. * @param value Find the slot that has a value that is greater than or * identical to this argument. * * @return The index in the list of the slot that is higher or identical * to the identity argument, or -1 if no node is higher or equal. */	TokenNameCOMMENT_JAVADOC	 Find the first index that occurs in the list that is greater than or equal to the given value. * @param list A list of integers. @param start The start index to begin the search. @param len The number of items to search. @param value Find the slot that has a value that is greater than or identical to this argument. * @return The index in the list of the slot that is higher or identical to the identity argument, or -1 if no node is higher or equal. 
protected	TokenNameprotected	
int	TokenNameint	
findGTE	TokenNameIdentifier	 find GTE
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
int	TokenNameint	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
high	TokenNameIdentifier	 high
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
<=	TokenNameLESS_EQUAL	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
+	TokenNamePLUS	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
<=	TokenNameLESS_EQUAL	
end	TokenNameIdentifier	 end
&&	TokenNameAND_AND	
list	TokenNameIdentifier	 list
[	TokenNameLBRACKET	
low	TokenNameIdentifier	 low
]	TokenNameRBRACKET	
>	TokenNameGREATER	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
?	TokenNameQUESTION	
low	TokenNameIdentifier	 low
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the first matching element from the index at or after the * given node. * * @param nsIndex The namespace index lookup. * @param lnIndex The local name index lookup. * @param firstPotential The first potential match that is worth looking at. * * @return The first node that is greater than or equal to the * firstPotential argument, or DTM.NOTPROCESSED if not found. */	TokenNameCOMMENT_JAVADOC	 Find the first matching element from the index at or after the given node. * @param nsIndex The namespace index lookup. @param lnIndex The local name index lookup. @param firstPotential The first potential match that is worth looking at. * @return The first node that is greater than or equal to the firstPotential argument, or DTM.NOTPROCESSED if not found. 
int	TokenNameint	
findElementFromIndex	TokenNameIdentifier	 find Element From Index
(	TokenNameLPAREN	
int	TokenNameint	
nsIndex	TokenNameIdentifier	 ns Index
,	TokenNameCOMMA	
int	TokenNameint	
lnIndex	TokenNameIdentifier	 ln Index
,	TokenNameCOMMA	
int	TokenNameint	
firstPotential	TokenNameIdentifier	 first Potential
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
indexes	TokenNameIdentifier	 indexes
=	TokenNameEQUAL	
m_elemIndexes	TokenNameIdentifier	 m elem Indexes
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
indexes	TokenNameIdentifier	 indexes
&&	TokenNameAND_AND	
nsIndex	TokenNameIdentifier	 ns Index
<	TokenNameLESS	
indexes	TokenNameIdentifier	 indexes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lnIndexs	TokenNameIdentifier	 ln Indexs
=	TokenNameEQUAL	
indexes	TokenNameIdentifier	 indexes
[	TokenNameLBRACKET	
nsIndex	TokenNameIdentifier	 ns Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
lnIndexs	TokenNameIdentifier	 ln Indexs
&&	TokenNameAND_AND	
lnIndex	TokenNameIdentifier	 ln Index
<	TokenNameLESS	
lnIndexs	TokenNameIdentifier	 ln Indexs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elems	TokenNameIdentifier	 elems
=	TokenNameEQUAL	
lnIndexs	TokenNameIdentifier	 ln Indexs
[	TokenNameLBRACKET	
lnIndex	TokenNameIdentifier	 ln Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
elems	TokenNameIdentifier	 elems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
findGTE	TokenNameIdentifier	 find GTE
(	TokenNameLPAREN	
elems	TokenNameIdentifier	 elems
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
elems	TokenNameIdentifier	 elems
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
firstPotential	TokenNameIdentifier	 first Potential
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elems	TokenNameIdentifier	 elems
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node identity value in the list, and call the iterator * if it hasn't been added yet. * * @param identity The node identity (index). * @return identity+1, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Get the next node identity value in the list, and call the iterator if it hasn't been added yet. * @param identity The node identity (index). @return identity+1, or DTM.NULL. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
getNextNodeIdentity	TokenNameIdentifier	 get Next Node Identity
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method should try and build one or more nodes in the table. * * @return The true if a next node is found or false if * there are no more nodes. */	TokenNameCOMMENT_JAVADOC	 This method should try and build one or more nodes in the table. * @return The true if a next node is found or false if there are no more nodes. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the number of nodes that have been added. * * @return the number of nodes that have been mapped. */	TokenNameCOMMENT_JAVADOC	 Get the number of nodes that have been added. * @return the number of nodes that have been mapped. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
getNumberOfNodes	TokenNameIdentifier	 get Number Of Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Stateless axis traversers, lazely built. */	TokenNameCOMMENT_JAVADOC	 Stateless axis traversers, lazely built. 
protected	TokenNameprotected	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_traversers	TokenNameIdentifier	 m traversers
;	TokenNameSEMICOLON	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Ensure that the size of the information arrays can hold another entry 	TokenNameCOMMENT_LINE	* Ensure that the size of the information arrays can hold another entry 
// * at the given index. 	TokenNameCOMMENT_LINE	* at the given index. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param index On exit from this function, the information arrays sizes must be 	TokenNameCOMMENT_LINE	* @param index On exit from this function, the information arrays sizes must be 
// * at least index+1. 	TokenNameCOMMENT_LINE	* at least index+1. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// protected void ensureSize(int index) 	TokenNameCOMMENT_LINE	protected void ensureSize(int index) 
// { 	TokenNameCOMMENT_LINE	{ 
// // We've cut over to Suballocated*Vector, which are self-sizing. 	TokenNameCOMMENT_LINE	// We've cut over to Suballocated*Vector, which are self-sizing. 
// } 	TokenNameCOMMENT_LINE	} 
/** * Get the simple type ID for the given node identity. * * @param identity The node identity. * * @return The simple type ID, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Get the simple type ID for the given node identity. * @param identity The node identity. * @return The simple type ID, or DTM.NULL. 
protected	TokenNameprotected	
short	TokenNameshort	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
return	TokenNamereturn	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the expanded type ID for the given node identity. * * @param identity The node identity. * * @return The expanded type ID, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Get the expanded type ID for the given node identity. * @param identity The node identity. * @return The expanded type ID, or DTM.NULL. 
protected	TokenNameprotected	
int	TokenNameint	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
// Reorganized test and loop into single flow 	TokenNameCOMMENT_LINE	Reorganized test and loop into single flow 
// Tiny performance improvement, saves a few bytes of code, clearer. 	TokenNameCOMMENT_LINE	Tiny performance improvement, saves a few bytes of code, clearer. 
// %OPT% Other internal getters could be treated simliarly 	TokenNameCOMMENT_LINE	%OPT% Other internal getters could be treated simliarly 
while	TokenNamewhile	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
>=	TokenNameGREATER_EQUAL	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
identity	TokenNameIdentifier	 identity
>=	TokenNameGREATER_EQUAL	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_exptype	TokenNameIdentifier	 m exptype
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the level in the tree for the given node identity. * * @param identity The node identity. * * @return The tree level, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Get the level in the tree for the given node identity. * @param identity The node identity. * @return The tree level, or DTM.NULL. 
protected	TokenNameprotected	
int	TokenNameint	
_level	TokenNameIdentifier	 level
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
>=	TokenNameGREATER_EQUAL	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isMore	TokenNameIdentifier	 is More
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isMore	TokenNameIdentifier	 is More
&&	TokenNameAND_AND	
identity	TokenNameIdentifier	 identity
>=	TokenNameGREATER_EQUAL	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the first child for the given node identity. * * @param identity The node identity. * * @return The first child identity, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Get the first child for the given node identity. * @param identity The node identity. * @return The first child identity, or DTM.NULL. 
protected	TokenNameprotected	
int	TokenNameint	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Boiler-plate code for each of the _xxx functions, except for the array. 	TokenNameCOMMENT_LINE	Boiler-plate code for each of the _xxx functions, except for the array. 
int	TokenNameint	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
>=	TokenNameGREATER_EQUAL	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
?	TokenNameQUESTION	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
:	TokenNameCOLON	
m_firstch	TokenNameIdentifier	 m firstch
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check to see if the information requested has been processed, and, 	TokenNameCOMMENT_LINE	Check to see if the information requested has been processed, and, 
// if not, advance the iterator until we the information has been 	TokenNameCOMMENT_LINE	if not, advance the iterator until we the information has been 
// processed. 	TokenNameCOMMENT_LINE	processed. 
while	TokenNamewhile	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
==	TokenNameEQUAL_EQUAL	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isMore	TokenNameIdentifier	 is More
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
>=	TokenNameGREATER_EQUAL	
m_size	TokenNameIdentifier	 m size
&&	TokenNameAND_AND	
!	TokenNameNOT	
isMore	TokenNameIdentifier	 is More
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
m_firstch	TokenNameIdentifier	 m firstch
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
==	TokenNameEQUAL_EQUAL	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
&&	TokenNameAND_AND	
!	TokenNameNOT	
isMore	TokenNameIdentifier	 is More
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
info	TokenNameIdentifier	 info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next sibling for the given node identity. * * @param identity The node identity. * * @return The next sibling identity, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Get the next sibling for the given node identity. * @param identity The node identity. * @return The next sibling identity, or DTM.NULL. 
protected	TokenNameprotected	
int	TokenNameint	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Boiler-plate code for each of the _xxx functions, except for the array. 	TokenNameCOMMENT_LINE	Boiler-plate code for each of the _xxx functions, except for the array. 
int	TokenNameint	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
>=	TokenNameGREATER_EQUAL	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
?	TokenNameQUESTION	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
:	TokenNameCOLON	
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check to see if the information requested has been processed, and, 	TokenNameCOMMENT_LINE	Check to see if the information requested has been processed, and, 
// if not, advance the iterator until we the information has been 	TokenNameCOMMENT_LINE	if not, advance the iterator until we the information has been 
// processed. 	TokenNameCOMMENT_LINE	processed. 
while	TokenNamewhile	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
==	TokenNameEQUAL_EQUAL	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isMore	TokenNameIdentifier	 is More
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
>=	TokenNameGREATER_EQUAL	
m_size	TokenNameIdentifier	 m size
&&	TokenNameAND_AND	
!	TokenNameNOT	
isMore	TokenNameIdentifier	 is More
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
==	TokenNameEQUAL_EQUAL	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
&&	TokenNameAND_AND	
!	TokenNameNOT	
isMore	TokenNameIdentifier	 is More
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
info	TokenNameIdentifier	 info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the previous sibling for the given node identity. * * @param identity The node identity. * * @return The previous sibling identity, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Get the previous sibling for the given node identity. * @param identity The node identity. * @return The previous sibling identity, or DTM.NULL. 
protected	TokenNameprotected	
int	TokenNameint	
_prevsib	TokenNameIdentifier	 prevsib
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
<	TokenNameLESS	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
return	TokenNamereturn	
m_prevsib	TokenNameIdentifier	 m prevsib
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check to see if the information requested has been processed, and, 	TokenNameCOMMENT_LINE	Check to see if the information requested has been processed, and, 
// if not, advance the iterator until we the information has been 	TokenNameCOMMENT_LINE	if not, advance the iterator until we the information has been 
// processed. 	TokenNameCOMMENT_LINE	processed. 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isMore	TokenNameIdentifier	 is More
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
>=	TokenNameGREATER_EQUAL	
m_size	TokenNameIdentifier	 m size
&&	TokenNameAND_AND	
!	TokenNameNOT	
isMore	TokenNameIdentifier	 is More
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
<	TokenNameLESS	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
return	TokenNamereturn	
m_prevsib	TokenNameIdentifier	 m prevsib
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the parent for the given node identity. * * @param identity The node identity. * * @return The parent identity, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Get the parent for the given node identity. * @param identity The node identity. * @return The parent identity, or DTM.NULL. 
protected	TokenNameprotected	
int	TokenNameint	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
<	TokenNameLESS	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
return	TokenNamereturn	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check to see if the information requested has been processed, and, 	TokenNameCOMMENT_LINE	Check to see if the information requested has been processed, and, 
// if not, advance the iterator until we the information has been 	TokenNameCOMMENT_LINE	if not, advance the iterator until we the information has been 
// processed. 	TokenNameCOMMENT_LINE	processed. 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isMore	TokenNameIdentifier	 is More
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
>=	TokenNameGREATER_EQUAL	
m_size	TokenNameIdentifier	 m size
&&	TokenNameAND_AND	
!	TokenNameNOT	
isMore	TokenNameIdentifier	 is More
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
<	TokenNameLESS	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
return	TokenNamereturn	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Diagnostics function to dump the DTM. */	TokenNameCOMMENT_JAVADOC	 Diagnostics function to dump the DTM. 
public	TokenNamepublic	
void	TokenNamevoid	
dumpDTM	TokenNameIdentifier	 dump DTM
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"DTMDump"	TokenNameStringLiteral	DTMDump
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".txt"	TokenNameStringLiteral	.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Dumping... "	TokenNameStringLiteral	Dumping... 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PrintStream	TokenNameIdentifier	 Print Stream
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
nRecords	TokenNameIdentifier	 n Records
=	TokenNameEQUAL	
m_size	TokenNameIdentifier	 m size
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Total nodes: "	TokenNameStringLiteral	Total nodes: 
+	TokenNamePLUS	
nRecords	TokenNameIdentifier	 n Records
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
nRecords	TokenNameIdentifier	 n Records
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"=========== index="	TokenNameStringLiteral	=========== index=
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
" handle="	TokenNameStringLiteral	 handle=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" ==========="	TokenNameStringLiteral	 ===========
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"NodeName: "	TokenNameStringLiteral	NodeName: 
+	TokenNamePLUS	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"NodeNameX: "	TokenNameStringLiteral	NodeNameX: 
+	TokenNamePLUS	
getNodeNameX	TokenNameIdentifier	 get Node Name X
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"LocalName: "	TokenNameStringLiteral	LocalName: 
+	TokenNamePLUS	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"NamespaceURI: "	TokenNameStringLiteral	NamespaceURI: 
+	TokenNamePLUS	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Prefix: "	TokenNameStringLiteral	Prefix: 
+	TokenNamePLUS	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
exTypeID	TokenNameIdentifier	 ex Type ID
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Expanded Type ID: "	TokenNameStringLiteral	Expanded Type ID: 
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
exTypeID	TokenNameIdentifier	 ex Type ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
typestring	TokenNameIdentifier	 typestring
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"ATTRIBUTE_NODE"	TokenNameStringLiteral	ATTRIBUTE_NODE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"CDATA_SECTION_NODE"	TokenNameStringLiteral	CDATA_SECTION_NODE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"COMMENT_NODE"	TokenNameStringLiteral	COMMENT_NODE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"DOCUMENT_FRAGMENT_NODE"	TokenNameStringLiteral	DOCUMENT_FRAGMENT_NODE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"DOCUMENT_NODE"	TokenNameStringLiteral	DOCUMENT_NODE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"DOCUMENT_NODE"	TokenNameStringLiteral	DOCUMENT_NODE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"ELEMENT_NODE"	TokenNameStringLiteral	ELEMENT_NODE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"ENTITY_NODE"	TokenNameStringLiteral	ENTITY_NODE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"ENTITY_REFERENCE_NODE"	TokenNameStringLiteral	ENTITY_REFERENCE_NODE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"NAMESPACE_NODE"	TokenNameStringLiteral	NAMESPACE_NODE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"NOTATION_NODE"	TokenNameStringLiteral	NOTATION_NODE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"NULL"	TokenNameStringLiteral	NULL
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"PROCESSING_INSTRUCTION_NODE"	TokenNameStringLiteral	PROCESSING_INSTRUCTION_NODE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"TEXT_NODE"	TokenNameStringLiteral	TEXT_NODE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"Unknown!"	TokenNameStringLiteral	Unknown!
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Type: "	TokenNameStringLiteral	Type: 
+	TokenNamePLUS	
typestring	TokenNameIdentifier	 typestring
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"First child: DTM.NULL"	TokenNameStringLiteral	First child: DTM.NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
==	TokenNameEQUAL_EQUAL	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"First child: NOTPROCESSED"	TokenNameStringLiteral	First child: NOTPROCESSED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"First child: "	TokenNameStringLiteral	First child: 
+	TokenNamePLUS	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_prevsib	TokenNameIdentifier	 m prevsib
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
prevSibling	TokenNameIdentifier	 prev Sibling
=	TokenNameEQUAL	
_prevsib	TokenNameIdentifier	 prevsib
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
prevSibling	TokenNameIdentifier	 prev Sibling
)	TokenNameRPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Prev sibling: DTM.NULL"	TokenNameStringLiteral	Prev sibling: DTM.NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
==	TokenNameEQUAL_EQUAL	
prevSibling	TokenNameIdentifier	 prev Sibling
)	TokenNameRPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Prev sibling: NOTPROCESSED"	TokenNameStringLiteral	Prev sibling: NOTPROCESSED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Prev sibling: "	TokenNameStringLiteral	Prev sibling: 
+	TokenNamePLUS	
prevSibling	TokenNameIdentifier	 prev Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
nextSibling	TokenNameIdentifier	 next Sibling
)	TokenNameRPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Next sibling: DTM.NULL"	TokenNameStringLiteral	Next sibling: DTM.NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
==	TokenNameEQUAL_EQUAL	
nextSibling	TokenNameIdentifier	 next Sibling
)	TokenNameRPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Next sibling: NOTPROCESSED"	TokenNameStringLiteral	Next sibling: NOTPROCESSED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Next sibling: "	TokenNameStringLiteral	Next sibling: 
+	TokenNamePLUS	
nextSibling	TokenNameIdentifier	 next Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parent: DTM.NULL"	TokenNameStringLiteral	Parent: DTM.NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
==	TokenNameEQUAL_EQUAL	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parent: NOTPROCESSED"	TokenNameStringLiteral	Parent: NOTPROCESSED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parent: "	TokenNameStringLiteral	Parent: 
+	TokenNamePLUS	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
_level	TokenNameIdentifier	 level
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Level: "	TokenNameStringLiteral	Level: 
+	TokenNamePLUS	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Node Value: "	TokenNameStringLiteral	Node Value: 
+	TokenNamePLUS	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"String Value: "	TokenNameStringLiteral	String Value: 
+	TokenNamePLUS	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Diagnostics function to dump a single node. * * %REVIEW% KNOWN GLITCH: If you pass it a node index rather than a * node handle, it works just fine... but the displayed identity * number before the colon is different, which complicates comparing * it with nodes printed the other way. We could always OR the DTM ID * into the value, to suppress that distinction... * * %REVIEW% This might want to be moved up to DTMDefaultBase, or possibly * DTM itself, since it's a useful diagnostic and uses only DTM's public * APIs. */	TokenNameCOMMENT_JAVADOC	 Diagnostics function to dump a single node. * %REVIEW% KNOWN GLITCH: If you pass it a node index rather than a node handle, it works just fine... but the displayed identity number before the colon is different, which complicates comparing it with nodes printed the other way. We could always OR the DTM ID into the value, to suppress that distinction... * %REVIEW% This might want to be moved up to DTMDefaultBase, or possibly DTM itself, since it's a useful diagnostic and uses only DTM's public APIs. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
dumpNode	TokenNameIdentifier	 dump Node
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
"[null]"	TokenNameStringLiteral	[null]
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
typestring	TokenNameIdentifier	 typestring
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"ATTR"	TokenNameStringLiteral	ATTR
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"CDATA"	TokenNameStringLiteral	CDATA
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"COMMENT"	TokenNameStringLiteral	COMMENT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"DOC_FRAG"	TokenNameStringLiteral	DOC_FRAG
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"DOC"	TokenNameStringLiteral	DOC
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"DOC_TYPE"	TokenNameStringLiteral	DOC_TYPE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"ELEMENT"	TokenNameStringLiteral	ELEMENT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"ENTITY"	TokenNameStringLiteral	ENTITY
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"ENT_REF"	TokenNameStringLiteral	ENT_REF
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"NAMESPACE"	TokenNameStringLiteral	NAMESPACE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"NOTATION"	TokenNameStringLiteral	NOTATION
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"null"	TokenNameStringLiteral	null
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"PI"	TokenNameStringLiteral	PI
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"TEXT"	TokenNameStringLiteral	TEXT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
typestring	TokenNameIdentifier	 typestring
=	TokenNameEQUAL	
"Unknown!"	TokenNameStringLiteral	Unknown!
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
nodeHandle	TokenNameIdentifier	 node Handle
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
typestring	TokenNameIdentifier	 typestring
+	TokenNamePLUS	
"(0x"	TokenNameStringLiteral	(0x
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
getNodeNameX	TokenNameIdentifier	 get Node Name X
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
+	TokenNamePLUS	
" {"	TokenNameStringLiteral	 {
+	TokenNamePLUS	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
+	TokenNamePLUS	
"=""	TokenNameStringLiteral	="
+	TokenNamePLUS	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
+	TokenNamePLUS	
""]"	TokenNameStringLiteral	"]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ========= DTM Implementation Control Functions. ============== 	TokenNameCOMMENT_LINE	========= DTM Implementation Control Functions. ============== 
/** * Set an implementation dependent feature. * <p> * %REVIEW% Do we really expect to set features on DTMs? * * @param featureId A feature URL. * @param state true if this feature should be on, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Set an implementation dependent feature. <p> %REVIEW% Do we really expect to set features on DTMs? * @param featureId A feature URL. @param state true if this feature should be on, false otherwise. 
public	TokenNamepublic	
void	TokenNamevoid	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
,	TokenNameCOMMA	
boolean	TokenNameboolean	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// ========= Document Navigation Functions ========= 	TokenNameCOMMENT_LINE	========= Document Navigation Functions ========= 
/** * Given a node handle, test if it has child nodes. * <p> %REVIEW% This is obviously useful at the DOM layer, where it * would permit testing this without having to create a proxy * node. It's less useful in the DTM API, where * (dtm.getFirstChild(nodeHandle)!=DTM.NULL) is just as fast and * almost as self-evident. But it's a convenience, and eases porting * of DOM code to DTM. </p> * * @param nodeHandle int Handle of the node. * @return int true if the given node has child nodes. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, test if it has child nodes. <p> %REVIEW% This is obviously useful at the DOM layer, where it would permit testing this without having to create a proxy node. It's less useful in the DTM API, where (dtm.getFirstChild(nodeHandle)!=DTM.NULL) is just as fast and almost as self-evident. But it's a convenience, and eases porting of DOM code to DTM. </p> * @param nodeHandle int Handle of the node. @return int true if the given node has child nodes. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
firstChild	TokenNameIdentifier	 first Child
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Given a node identity, return a node handle. If extended addressing * has been used (multiple DTM IDs), we need to map the high bits of the * identity into the proper DTM ID. * * This has been made FINAL to facilitate inlining, since we do not expect * any subclass of DTMDefaultBase to ever change the algorithm. (I don't * really like doing so, and would love to have an excuse not to...) * * %REVIEW% Is it worth trying to specialcase small documents? * %REVIEW% Should this be exposed at the package/public layers? * * @param nodeIdentity Internal offset to this node's records. * @return NodeHandle (external representation of node) * */	TokenNameCOMMENT_JAVADOC	 Given a node identity, return a node handle. If extended addressing has been used (multiple DTM IDs), we need to map the high bits of the identity into the proper DTM ID. * This has been made FINAL to facilitate inlining, since we do not expect any subclass of DTMDefaultBase to ever change the algorithm. (I don't really like doing so, and would love to have an excuse not to...) * %REVIEW% Is it worth trying to specialcase small documents? %REVIEW% Should this be exposed at the package/public layers? * @param nodeIdentity Internal offset to this node's records. @return NodeHandle (external representation of node) 
final	TokenNamefinal	
public	TokenNamepublic	
int	TokenNameint	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
int	TokenNameint	
nodeIdentity	TokenNameIdentifier	 node Identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
nodeIdentity	TokenNameIdentifier	 node Identity
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
JJK_DEBUG	TokenNameIdentifier	 JJK  DEBUG
&&	TokenNameAND_AND	
nodeIdentity	TokenNameIdentifier	 node Identity
>	TokenNameGREATER	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_NODE_DEFAULT	TokenNameIdentifier	 IDENT  NODE  DEFAULT
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"GONK! (only useful in limited situations)"	TokenNameStringLiteral	GONK! (only useful in limited situations)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_dtmIdent	TokenNameIdentifier	 m dtm Ident
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
nodeIdentity	TokenNameIdentifier	 node Identity
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_DTM_NODE_BITS	TokenNameIdentifier	 IDENT  DTM  NODE  BITS
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
nodeIdentity	TokenNameIdentifier	 node Identity
&	TokenNameAND	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_NODE_DEFAULT	TokenNameIdentifier	 IDENT  NODE  DEFAULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Given a node handle, return a node identity. If extended addressing * has been used (multiple DTM IDs), we need to map the high bits of the * identity into the proper DTM ID and thence find the proper offset * to add to the low bits of the identity * * This has been made FINAL to facilitate inlining, since we do not expect * any subclass of DTMDefaultBase to ever change the algorithm. (I don't * really like doing so, and would love to have an excuse not to...) * * %OPT% Performance is critical for this operation. * * %REVIEW% Should this be exposed at the package/public layers? * * @param nodeHandle (external representation of node) * @return nodeIdentity Internal offset to this node's records. * */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return a node identity. If extended addressing has been used (multiple DTM IDs), we need to map the high bits of the identity into the proper DTM ID and thence find the proper offset to add to the low bits of the identity * This has been made FINAL to facilitate inlining, since we do not expect any subclass of DTMDefaultBase to ever change the algorithm. (I don't really like doing so, and would love to have an excuse not to...) * %OPT% Performance is critical for this operation. * %REVIEW% Should this be exposed at the package/public layers? * @param nodeHandle (external representation of node) @return nodeIdentity Internal offset to this node's records. 
final	TokenNamefinal	
public	TokenNamepublic	
int	TokenNameint	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_mgrDefault	TokenNameIdentifier	 m mgr Default
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Optimization: use the DTMManagerDefault's fast DTMID-to-offsets 	TokenNameCOMMENT_LINE	Optimization: use the DTMManagerDefault's fast DTMID-to-offsets 
// table. I'm not wild about this solution but this operation 	TokenNameCOMMENT_LINE	table. I'm not wild about this solution but this operation 
// needs need extreme speed. 	TokenNameCOMMENT_LINE	needs need extreme speed. 
int	TokenNameint	
whichDTMindex	TokenNameIdentifier	 which DT Mindex
=	TokenNameEQUAL	
nodeHandle	TokenNameIdentifier	 node Handle
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_DTM_NODE_BITS	TokenNameIdentifier	 IDENT  DTM  NODE  BITS
;	TokenNameSEMICOLON	
// %REVIEW% Wish I didn't have to perform the pre-test, but 	TokenNameCOMMENT_LINE	%REVIEW% Wish I didn't have to perform the pre-test, but 
// someone is apparently asking DTMs whether they contain nodes 	TokenNameCOMMENT_LINE	someone is apparently asking DTMs whether they contain nodes 
// which really don't belong to them. That's probably a bug 	TokenNameCOMMENT_LINE	which really don't belong to them. That's probably a bug 
// which should be fixed, but until it is: 	TokenNameCOMMENT_LINE	which should be fixed, but until it is: 
if	TokenNameif	
(	TokenNameLPAREN	
m_mgrDefault	TokenNameIdentifier	 m mgr Default
.	TokenNameDOT	
m_dtms	TokenNameIdentifier	 m dtms
[	TokenNameLBRACKET	
whichDTMindex	TokenNameIdentifier	 which DT Mindex
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_mgrDefault	TokenNameIdentifier	 m mgr Default
.	TokenNameDOT	
m_dtm_offsets	TokenNameIdentifier	 m dtm offsets
[	TokenNameLBRACKET	
whichDTMindex	TokenNameIdentifier	 which DT Mindex
]	TokenNameRBRACKET	
|	TokenNameOR	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
&	TokenNameAND	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_NODE_DEFAULT	TokenNameIdentifier	 IDENT  NODE  DEFAULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
whichDTMid	TokenNameIdentifier	 which DT Mid
=	TokenNameEQUAL	
m_dtmIdent	TokenNameIdentifier	 m dtm Ident
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
&	TokenNameAND	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_DTM_DEFAULT	TokenNameIdentifier	 IDENT  DTM  DEFAULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
whichDTMid	TokenNameIdentifier	 which DT Mid
==	TokenNameEQUAL_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
?	TokenNameQUESTION	
NULL	TokenNameIdentifier	 NULL
:	TokenNameCOLON	
(	TokenNameLPAREN	
whichDTMid	TokenNameIdentifier	 which DT Mid
<<	TokenNameLEFT_SHIFT	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_DTM_NODE_BITS	TokenNameIdentifier	 IDENT  DTM  NODE  BITS
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
&	TokenNameAND	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_NODE_DEFAULT	TokenNameIdentifier	 IDENT  NODE  DEFAULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, get the handle of the node's first child. * If not yet resolved, waits for more nodes to be added to the document and * tries again. * * @param nodeHandle int Handle of the node. * @return int DTM node-number of first child, or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, get the handle of the node's first child. If not yet resolved, waits for more nodes to be added to the document and tries again. * @param nodeHandle int Handle of the node. @return int DTM node-number of first child, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, get the handle of the node's first child. * If not yet resolved, waits for more nodes to be added to the document and * tries again. * * @param nodeHandle int Handle of the node. * @return int DTM node-number of first child, or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, get the handle of the node's first child. If not yet resolved, waits for more nodes to be added to the document and tries again. * @param nodeHandle int Handle of the node. @return int DTM node-number of first child, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getTypedFirstChild	TokenNameIdentifier	 get Typed First Child
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
firstChild	TokenNameIdentifier	 first Child
,	TokenNameCOMMA	
eType	TokenNameIdentifier	 e Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
<	TokenNameLESS	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstChild	TokenNameIdentifier	 first Child
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eType	TokenNameIdentifier	 e Type
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
||	TokenNameOR_OR	
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
>=	TokenNameGREATER_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
&&	TokenNameAND_AND	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstChild	TokenNameIdentifier	 first Child
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, advance to its last child. * If not yet resolved, waits for more nodes to be added to the document and * tries again. * * @param nodeHandle int Handle of the node. * @return int Node-number of last child, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, advance to its last child. If not yet resolved, waits for more nodes to be added to the document and tries again. * @param nodeHandle int Handle of the node. @return int Node-number of last child, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastChild	TokenNameIdentifier	 last Child
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastChild	TokenNameIdentifier	 last Child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
lastChild	TokenNameIdentifier	 last Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves an attribute node by by qualified name and namespace URI. * * @param nodeHandle int Handle of the node upon which to look up this attribute.. * @param namespaceURI The namespace URI of the attribute to * retrieve, or null. * @param name The local name of the attribute to * retrieve. * @return The attribute node handle with the specified name ( * <code>nodeName</code>) or <code>DTM.NULL</code> if there is no such * attribute. */	TokenNameCOMMENT_JAVADOC	 Retrieves an attribute node by by qualified name and namespace URI. * @param nodeHandle int Handle of the node upon which to look up this attribute.. @param namespaceURI The namespace URI of the attribute to retrieve, or null. @param name The local name of the attribute to retrieve. @return The attribute node handle with the specified name ( <code>nodeName</code>) or <code>DTM.NULL</code> if there is no such attribute. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
getAttributeNode	TokenNameIdentifier	 get Attribute Node
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, get the index of the node's first attribute. * * @param nodeHandle int Handle of the node. * @return Handle of first attribute, or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, get the index of the node's first attribute. * @param nodeHandle int Handle of the node. @return Handle of first attribute, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getFirstAttribute	TokenNameIdentifier	 get First Attribute
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
getFirstAttributeIdentity	TokenNameIdentifier	 get First Attribute Identity
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node identity, get the index of the node's first attribute. * * @param identity int identity of the node. * @return Identity of first attribute, or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node identity, get the index of the node's first attribute. * @param identity int identity of the node. @return Identity of first attribute, or DTM.NULL to indicate none exists. 
protected	TokenNameprotected	
int	TokenNameint	
getFirstAttributeIdentity	TokenNameIdentifier	 get First Attribute Identity
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assume that attributes and namespaces immediately follow the element. 	TokenNameCOMMENT_LINE	Assume that attributes and namespaces immediately follow the element. 
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
getNextNodeIdentity	TokenNameIdentifier	 get Next Node Identity
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assume this can not be null. 	TokenNameCOMMENT_LINE	Assume this can not be null. 
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
!=	TokenNameNOT_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle and an expanded type ID, get the index of the node's * attribute of that type, if any. * * @param nodeHandle int Handle of the node. * @param attType int expanded type ID of the required attribute. * @return Handle of attribute of the required type, or DTM.NULL to indicate * none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle and an expanded type ID, get the index of the node's attribute of that type, if any. * @param nodeHandle int Handle of the node. @param attType int expanded type ID of the required attribute. @return Handle of attribute of the required type, or DTM.NULL to indicate none exists. 
protected	TokenNameprotected	
int	TokenNameint	
getTypedAttribute	TokenNameIdentifier	 get Typed Attribute
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
int	TokenNameint	
attType	TokenNameIdentifier	 att Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
getNextNodeIdentity	TokenNameIdentifier	 get Next Node Identity
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
attType	TokenNameIdentifier	 att Type
)	TokenNameRPAREN	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
!=	TokenNameNOT_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, advance to its next sibling. * If not yet resolved, waits for more nodes to be added to the document and * tries again. * @param nodeHandle int Handle of the node. * @return int Node-number of next sibling, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, advance to its next sibling. If not yet resolved, waits for more nodes to be added to the document and tries again. @param nodeHandle int Handle of the node. @return int Node-number of next sibling, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, advance to its next sibling. * If not yet resolved, waits for more nodes to be added to the document and * tries again. * @param nodeHandle int Handle of the node. * @return int Node-number of next sibling, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, advance to its next sibling. If not yet resolved, waits for more nodes to be added to the document and tries again. @param nodeHandle int Handle of the node. @return int Node-number of next sibling, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getTypedNextSibling	TokenNameIdentifier	 get Typed Next Sibling
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
eType	TokenNameIdentifier	 e Type
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodeType	TokenNameIdentifier	 node Type
&&	TokenNameAND_AND	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//_type(node) != nodeType)); 	TokenNameCOMMENT_LINE	_type(node) != nodeType)); 
return	TokenNamereturn	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
?	TokenNameQUESTION	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
:	TokenNameCOLON	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, find its preceeding sibling. * WARNING: DTM is asymmetric; this operation is resolved by search, and is * relatively expensive. * * @param nodeHandle the id of the node. * @return int Node-number of the previous sib, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, find its preceeding sibling. WARNING: DTM is asymmetric; this operation is resolved by search, and is relatively expensive. * @param nodeHandle the id of the node. @return int Node-number of the previous sib, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_prevsib	TokenNameIdentifier	 m prevsib
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
_prevsib	TokenNameIdentifier	 prevsib
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// If the previous sibling array is not built, we get at 	TokenNameCOMMENT_LINE	If the previous sibling array is not built, we get at 
// the previous sibling using the parent, firstch and 	TokenNameCOMMENT_LINE	the previous sibling using the parent, firstch and 
// nextsib arrays. 	TokenNameCOMMENT_LINE	nextsib arrays. 
int	TokenNameint	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Given a node handle, advance to the next attribute. * If an attr, we advance to * the next attr on the same node. If not an attribute, we return NULL. * * @param nodeHandle int Handle of the node. * @return int DTM node-number of the resolved attr, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, advance to the next attribute. If an attr, we advance to the next attr on the same node. If not an attribute, we return NULL. * @param nodeHandle int Handle of the node. @return int DTM node-number of the resolved attr, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getNextAttribute	TokenNameIdentifier	 get Next Attribute
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
getNextAttributeIdentity	TokenNameIdentifier	 get Next Attribute Identity
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node identity for an attribute, advance to the next attribute. * * @param identity int identity of the attribute node. This * <strong>must</strong> be an attribute node. * * @return int DTM node-identity of the resolved attr, * or DTM.NULL to indicate none exists. * */	TokenNameCOMMENT_JAVADOC	 Given a node identity for an attribute, advance to the next attribute. * @param identity int identity of the attribute node. This <strong>must</strong> be an attribute node. * @return int DTM node-identity of the resolved attr, or DTM.NULL to indicate none exists. 
protected	TokenNameprotected	
int	TokenNameint	
getNextAttributeIdentity	TokenNameIdentifier	 get Next Attribute Identity
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assume that attributes and namespace nodes immediately follow the element 	TokenNameCOMMENT_LINE	Assume that attributes and namespace nodes immediately follow the element 
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
getNextNodeIdentity	TokenNameIdentifier	 get Next Node Identity
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Lazily created namespace lists. */	TokenNameCOMMENT_JAVADOC	 Lazily created namespace lists. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_namespaceLists	TokenNameIdentifier	 m namespace Lists
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// on demand 	TokenNameCOMMENT_LINE	on demand 
/** Build table of namespace declaration * locations during DTM construction. Table is a Vector of * SuballocatedIntVectors containing the namespace node HANDLES declared at * that ID, plus an SuballocatedIntVector of the element node INDEXES at which * these declarations appeared. * * NOTE: Since this occurs during model build, nodes will be encountered * in doucment order and thus the table will be ordered by element, * permitting binary-search as a possible retrieval optimization. * * %REVIEW% Directly managed arrays rather than vectors? * %REVIEW% Handles or IDs? Given usage, I think handles. * */	TokenNameCOMMENT_JAVADOC	 Build table of namespace declaration locations during DTM construction. Table is a Vector of SuballocatedIntVectors containing the namespace node HANDLES declared at that ID, plus an SuballocatedIntVector of the element node INDEXES at which these declarations appeared. * NOTE: Since this occurs during model build, nodes will be encountered in doucment order and thus the table will be ordered by element, permitting binary-search as a possible retrieval optimization. * %REVIEW% Directly managed arrays rather than vectors? %REVIEW% Handles or IDs? Given usage, I think handles. 
protected	TokenNameprotected	
void	TokenNamevoid	
declareNamespaceInContext	TokenNameIdentifier	 declare Namespace In Context
(	TokenNameLPAREN	
int	TokenNameint	
elementNodeIndex	TokenNameIdentifier	 element Node Index
,	TokenNameCOMMA	
int	TokenNameint	
namespaceNodeIndex	TokenNameIdentifier	 namespace Node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
nsList	TokenNameIdentifier	 ns List
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First 	TokenNameCOMMENT_LINE	First 
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
=	TokenNameEQUAL	
new	TokenNamenew	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
elementNodeIndex	TokenNameIdentifier	 element Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nsList	TokenNameIdentifier	 ns List
=	TokenNameEQUAL	
new	TokenNamenew	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
nsList	TokenNameIdentifier	 ns List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Most recent. May be -1 (none) if DTM was pruned. 	TokenNameCOMMENT_LINE	Most recent. May be -1 (none) if DTM was pruned. 
// %OPT% Is there a lastElement() method? Should there be? 	TokenNameCOMMENT_LINE	%OPT% Is there a lastElement() method? Should there be? 
int	TokenNameint	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
elementNodeIndex	TokenNameIdentifier	 element Node Index
==	TokenNameEQUAL_EQUAL	
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nsList	TokenNameIdentifier	 ns List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
)	TokenNameRPAREN	
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nsList	TokenNameIdentifier	 ns List
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
elementNodeIndex	TokenNameIdentifier	 element Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
inherited	TokenNameIdentifier	 inherited
=	TokenNameEQUAL	
findNamespaceContext	TokenNameIdentifier	 find Namespace Context
(	TokenNameLPAREN	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
elementNodeIndex	TokenNameIdentifier	 element Node Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inherited	TokenNameIdentifier	 inherited
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %OPT% Count-down might be faster, but debuggability may 	TokenNameCOMMENT_LINE	%OPT% Count-down might be faster, but debuggability may 
// be better this way, and if we ever decide we want to 	TokenNameCOMMENT_LINE	be better this way, and if we ever decide we want to 
// keep this ordered by expanded-type... 	TokenNameCOMMENT_LINE	keep this ordered by expanded-type... 
int	TokenNameint	
isize	TokenNameIdentifier	 isize
=	TokenNameEQUAL	
inherited	TokenNameIdentifier	 inherited
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Base the size of a new namespace list on the 	TokenNameCOMMENT_LINE	Base the size of a new namespace list on the 
// size of the inherited list - but within reason! 	TokenNameCOMMENT_LINE	size of the inherited list - but within reason! 
nsList	TokenNameIdentifier	 ns List
=	TokenNameEQUAL	
new	TokenNamenew	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
isize	TokenNameIdentifier	 isize
+	TokenNamePLUS	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2048	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
isize	TokenNameIdentifier	 isize
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nsList	TokenNameIdentifier	 ns List
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
inherited	TokenNameIdentifier	 inherited
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nsList	TokenNameIdentifier	 ns List
=	TokenNameEQUAL	
new	TokenNamenew	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
nsList	TokenNameIdentifier	 ns List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Handle overwriting inherited. 	TokenNameCOMMENT_LINE	Handle overwriting inherited. 
// %OPT% Keep sorted? (By expanded-name rather than by doc order...) 	TokenNameCOMMENT_LINE	%OPT% Keep sorted? (By expanded-name rather than by doc order...) 
// Downside: Would require insertElementAt if not found, 	TokenNameCOMMENT_LINE	Downside: Would require insertElementAt if not found, 
// which has recopying costs. But these are generally short lists... 	TokenNameCOMMENT_LINE	which has recopying costs. But these are generally short lists... 
int	TokenNameint	
newEType	TokenNameIdentifier	 new E Type
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
namespaceNodeIndex	TokenNameIdentifier	 namespace Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
nsList	TokenNameIdentifier	 ns List
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
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newEType	TokenNameIdentifier	 new E Type
==	TokenNameEQUAL_EQUAL	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
nsList	TokenNameIdentifier	 ns List
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nsList	TokenNameIdentifier	 ns List
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
namespaceNodeIndex	TokenNameIdentifier	 namespace Node Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
nsList	TokenNameIdentifier	 ns List
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
namespaceNodeIndex	TokenNameIdentifier	 namespace Node Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Retrieve list of namespace declaration locations * active at this node. List is an SuballocatedIntVector whose * entries are the namespace node HANDLES declared at that ID. * * %REVIEW% Directly managed arrays rather than vectors? * %REVIEW% Handles or IDs? Given usage, I think handles. * */	TokenNameCOMMENT_JAVADOC	 Retrieve list of namespace declaration locations active at this node. List is an SuballocatedIntVector whose entries are the namespace node HANDLES declared at that ID. * %REVIEW% Directly managed arrays rather than vectors? %REVIEW% Handles or IDs? Given usage, I think handles. 
protected	TokenNameprotected	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
findNamespaceContext	TokenNameIdentifier	 find Namespace Context
(	TokenNameLPAREN	
int	TokenNameint	
elementNodeIndex	TokenNameIdentifier	 element Node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %OPT% Is binary-search really saving us a lot versus linear? 	TokenNameCOMMENT_LINE	%OPT% Is binary-search really saving us a lot versus linear? 
// (... It may be, in large docs with many NS decls.) 	TokenNameCOMMENT_LINE	(... It may be, in large docs with many NS decls.) 
int	TokenNameint	
wouldBeAt	TokenNameIdentifier	 would Be At
=	TokenNameEQUAL	
findInSortedSuballocatedIntVector	TokenNameIdentifier	 find In Sorted Suballocated Int Vector
(	TokenNameLPAREN	
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
,	TokenNameCOMMA	
elementNodeIndex	TokenNameIdentifier	 element Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wouldBeAt	TokenNameIdentifier	 would Be At
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// Found it 	TokenNameCOMMENT_LINE	Found it 
return	TokenNamereturn	
(	TokenNameLPAREN	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
)	TokenNameRPAREN	
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
wouldBeAt	TokenNameIdentifier	 would Be At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wouldBeAt	TokenNameIdentifier	 would Be At
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// -1-wouldbeat == 0 	TokenNameCOMMENT_LINE	-1-wouldbeat == 0 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Not after anything; definitely not found 	TokenNameCOMMENT_LINE	Not after anything; definitely not found 
// Not found, but we know where it should have been. 	TokenNameCOMMENT_LINE	Not found, but we know where it should have been. 
// Search back until we find an ancestor or run out. 	TokenNameCOMMENT_LINE	Search back until we find an ancestor or run out. 
wouldBeAt	TokenNameIdentifier	 would Be At
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
wouldBeAt	TokenNameIdentifier	 would Be At
;	TokenNameSEMICOLON	
// Decrement wouldBeAt to find last possible ancestor 	TokenNameCOMMENT_LINE	Decrement wouldBeAt to find last possible ancestor 
int	TokenNameint	
candidate	TokenNameIdentifier	 candidate
=	TokenNameEQUAL	
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
wouldBeAt	TokenNameIdentifier	 would Be At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ancestor	TokenNameIdentifier	 ancestor
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
elementNodeIndex	TokenNameIdentifier	 element Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Special case: if the candidate is before the given node, and 	TokenNameCOMMENT_LINE	Special case: if the candidate is before the given node, and 
// is in the earliest possible position in the document, it 	TokenNameCOMMENT_LINE	is in the earliest possible position in the document, it 
// must have the namespace declarations we're interested in. 	TokenNameCOMMENT_LINE	must have the namespace declarations we're interested in. 
if	TokenNameif	
(	TokenNameLPAREN	
wouldBeAt	TokenNameIdentifier	 would Be At
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
candidate	TokenNameIdentifier	 candidate
<	TokenNameLESS	
ancestor	TokenNameIdentifier	 ancestor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
rootHandle	TokenNameIdentifier	 root Handle
=	TokenNameEQUAL	
getDocumentRoot	TokenNameIdentifier	 get Document Root
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
elementNodeIndex	TokenNameIdentifier	 element Node Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
rootID	TokenNameIdentifier	 root ID
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
rootHandle	TokenNameIdentifier	 root Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
uppermostNSCandidateID	TokenNameIdentifier	 uppermost NS Candidate ID
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
rootHandle	TokenNameIdentifier	 root Handle
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
rootID	TokenNameIdentifier	 root ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uppermostNSCandidateID	TokenNameIdentifier	 uppermost NS Candidate ID
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ch	TokenNameIdentifier	 ch
:	TokenNameCOLON	
rootID	TokenNameIdentifier	 root ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
uppermostNSCandidateID	TokenNameIdentifier	 uppermost NS Candidate ID
=	TokenNameEQUAL	
rootID	TokenNameIdentifier	 root ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
==	TokenNameEQUAL_EQUAL	
uppermostNSCandidateID	TokenNameIdentifier	 uppermost NS Candidate ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
)	TokenNameRPAREN	
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
wouldBeAt	TokenNameIdentifier	 would Be At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
wouldBeAt	TokenNameIdentifier	 would Be At
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ancestor	TokenNameIdentifier	 ancestor
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
==	TokenNameEQUAL_EQUAL	
ancestor	TokenNameIdentifier	 ancestor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Found ancestor in list 	TokenNameCOMMENT_LINE	Found ancestor in list 
return	TokenNamereturn	
(	TokenNameLPAREN	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
)	TokenNameRPAREN	
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
wouldBeAt	TokenNameIdentifier	 would Be At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
<	TokenNameLESS	
ancestor	TokenNameIdentifier	 ancestor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Too deep in tree 	TokenNameCOMMENT_LINE	Too deep in tree 
do	TokenNamedo	
{	TokenNameLBRACE	
ancestor	TokenNameIdentifier	 ancestor
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
<	TokenNameLESS	
ancestor	TokenNameIdentifier	 ancestor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
wouldBeAt	TokenNameIdentifier	 would Be At
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Too late in list 	TokenNameCOMMENT_LINE	Too late in list 
candidate	TokenNameIdentifier	 candidate
=	TokenNameEQUAL	
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
wouldBeAt	TokenNameIdentifier	 would Be At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// No namespaces known at this node 	TokenNameCOMMENT_LINE	No namespaces known at this node 
}	TokenNameRBRACE	
/** * Subroutine: Locate the specified node within * m_namespaceDeclSetElements, or the last element which * preceeds it in document order * * %REVIEW% Inlne this into findNamespaceContext? Create SortedSuballocatedIntVector type? * * @return If positive or zero, the index of the found item. * If negative, index of the point at which it would have appeared, * encoded as -1-index and hence reconvertable by subtracting * it from -1. (Encoding because I don't want to recompare the strings * but don't want to burn bytes on a datatype to hold a flagged value.) */	TokenNameCOMMENT_JAVADOC	 Subroutine: Locate the specified node within m_namespaceDeclSetElements, or the last element which preceeds it in document order * %REVIEW% Inlne this into findNamespaceContext? Create SortedSuballocatedIntVector type? * @return If positive or zero, the index of the found item. If negative, index of the point at which it would have appeared, encoded as -1-index and hence reconvertable by subtracting it from -1. (Encoding because I don't want to recompare the strings but don't want to burn bytes on a datatype to hold a flagged value.) 
protected	TokenNameprotected	
int	TokenNameint	
findInSortedSuballocatedIntVector	TokenNameIdentifier	 find In Sorted Suballocated Int Vector
(	TokenNameLPAREN	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
vector	TokenNameIdentifier	 vector
,	TokenNameCOMMA	
int	TokenNameint	
lookfor	TokenNameIdentifier	 lookfor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Binary search 	TokenNameCOMMENT_LINE	Binary search 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
vector	TokenNameIdentifier	 vector
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
vector	TokenNameIdentifier	 vector
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
<=	TokenNameLESS_EQUAL	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
+	TokenNamePLUS	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
lookfor	TokenNameIdentifier	 lookfor
-	TokenNameMINUS	
vector	TokenNameIdentifier	 vector
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// Name found 	TokenNameCOMMENT_LINE	Name found 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// looked too late 	TokenNameCOMMENT_LINE	looked too late 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// looked ot early 	TokenNameCOMMENT_LINE	looked ot early 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
// Clean up at loop end 	TokenNameCOMMENT_LINE	Clean up at loop end 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// not-found has to be encoded. 	TokenNameCOMMENT_LINE	not-found has to be encoded. 
}	TokenNameRBRACE	
/** * Given a node handle, get the index of the node's first child. * If not yet resolved, waits for more nodes to be added to the document and * tries again * * @param nodeHandle handle to node, which should probably be an element * node, but need not be. * * @param inScope true if all namespaces in scope should be returned, * false if only the namespace declarations should be * returned. * @return handle of first namespace, or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, get the index of the node's first child. If not yet resolved, waits for more nodes to be added to the document and tries again * @param nodeHandle handle to node, which should probably be an element node, but need not be. * @param inScope true if all namespaces in scope should be returned, false if only the namespace declarations should be returned. @return handle of first namespace, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getFirstNamespaceNode	TokenNameIdentifier	 get First Namespace Node
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
boolean	TokenNameboolean	
inScope	TokenNameIdentifier	 in Scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inScope	TokenNameIdentifier	 in Scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
nsContext	TokenNameIdentifier	 ns Context
=	TokenNameEQUAL	
findNamespaceContext	TokenNameIdentifier	 find Namespace Context
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nsContext	TokenNameIdentifier	 ns Context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
nsContext	TokenNameIdentifier	 ns Context
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nsContext	TokenNameIdentifier	 ns Context
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Assume that attributes and namespaces immediately 	TokenNameCOMMENT_LINE	Assume that attributes and namespaces immediately 
// follow the element. 	TokenNameCOMMENT_LINE	follow the element. 
// 	TokenNameCOMMENT_LINE	 
// %OPT% Would things be faster if all NS nodes were built 	TokenNameCOMMENT_LINE	%OPT% Would things be faster if all NS nodes were built 
// before all Attr nodes? Some costs at build time for 2nd 	TokenNameCOMMENT_LINE	before all Attr nodes? Some costs at build time for 2nd 
// pass... 	TokenNameCOMMENT_LINE	pass... 
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
getNextNodeIdentity	TokenNameIdentifier	 get Next Node Identity
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
)	TokenNameRPAREN	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
!=	TokenNameNOT_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Given a namespace handle, advance to the next namespace. * * @param baseHandle handle to original node from where the first namespace * was relative to (needed to return nodes in document order). * @param nodeHandle A namespace handle for which we will find the next node. * @param inScope true if all namespaces that are in scope should be processed, * otherwise just process the nodes in the given element handle. * @return handle of next namespace, or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a namespace handle, advance to the next namespace. * @param baseHandle handle to original node from where the first namespace was relative to (needed to return nodes in document order). @param nodeHandle A namespace handle for which we will find the next node. @param inScope true if all namespaces that are in scope should be processed, otherwise just process the nodes in the given element handle. @return handle of next namespace, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getNextNamespaceNode	TokenNameIdentifier	 get Next Namespace Node
(	TokenNameLPAREN	
int	TokenNameint	
baseHandle	TokenNameIdentifier	 base Handle
,	TokenNameCOMMA	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
boolean	TokenNameboolean	
inScope	TokenNameIdentifier	 in Scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inScope	TokenNameIdentifier	 in Scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Since we've been given the base, try direct lookup 	TokenNameCOMMENT_LINE	Since we've been given the base, try direct lookup 
//(could look from nodeHandle but this is at least one 	TokenNameCOMMENT_LINE	(could look from nodeHandle but this is at least one 
//comparison/get-parent faster) 	TokenNameCOMMENT_LINE	comparison/get-parent faster) 
//SuballocatedIntVector nsContext=findNamespaceContext(nodeHandle & m_mask); 	TokenNameCOMMENT_LINE	SuballocatedIntVector nsContext=findNamespaceContext(nodeHandle & m_mask); 
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
nsContext	TokenNameIdentifier	 ns Context
=	TokenNameEQUAL	
findNamespaceContext	TokenNameIdentifier	 find Namespace Context
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
baseHandle	TokenNameIdentifier	 base Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nsContext	TokenNameIdentifier	 ns Context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
nsContext	TokenNameIdentifier	 ns Context
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
nsContext	TokenNameIdentifier	 ns Context
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nsContext	TokenNameIdentifier	 ns Context
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Assume that attributes and namespace nodes immediately follow the element. 	TokenNameCOMMENT_LINE	Assume that attributes and namespace nodes immediately follow the element. 
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
getNextNodeIdentity	TokenNameIdentifier	 get Next Node Identity
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, find its parent node. * * @param nodeHandle the id of the node. * @return int Node-number of parent, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, find its parent node. * @param nodeHandle the id of the node. @return int Node-number of parent, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the Document node handle for the document currently under construction. * PLEASE NOTE that most people should use getOwnerDocument(nodeHandle) instead; * this version of the operation is primarily intended for use during negotiation * with the DTM Manager. * * @return int Node handle of document, which should always be valid. */	TokenNameCOMMENT_JAVADOC	 Find the Document node handle for the document currently under construction. PLEASE NOTE that most people should use getOwnerDocument(nodeHandle) instead; this version of the operation is primarily intended for use during negotiation with the DTM Manager. * @return int Node handle of document, which should always be valid. 
public	TokenNamepublic	
int	TokenNameint	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dtmIdent	TokenNameIdentifier	 m dtm Ident
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// makeNodeHandle(0) 	TokenNameCOMMENT_LINE	makeNodeHandle(0) 
}	TokenNameRBRACE	
/** * Given a node handle, find the owning document node. This has the exact * same semantics as the DOM Document method of the same name, in that if * the nodeHandle is a document node, it will return NULL. * * <p>%REVIEW% Since this is DOM-specific, it may belong at the DOM * binding layer. Included here as a convenience function and to * aid porting of DOM code to DTM.</p> * * @param nodeHandle the id of the node. * @return int Node handle of owning document, or -1 if the node was a Docment */	TokenNameCOMMENT_JAVADOC	 Given a node handle, find the owning document node. This has the exact same semantics as the DOM Document method of the same name, in that if the nodeHandle is a document node, it will return NULL. * <p>%REVIEW% Since this is DOM-specific, it may belong at the DOM binding layer. Included here as a convenience function and to aid porting of DOM code to DTM.</p> * @param nodeHandle the id of the node. @return int Node handle of owning document, or -1 if the node was a Docment 
public	TokenNamepublic	
int	TokenNameint	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
==	TokenNameEQUAL_EQUAL	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getDocumentRoot	TokenNameIdentifier	 get Document Root
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, find the owning document node. Unlike the DOM, * this considers the owningDocument of a Document to be itself. * * @param nodeHandle the id of the node. * @return int Node handle of owning document, or the nodeHandle if it is * a Document. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, find the owning document node. Unlike the DOM, this considers the owningDocument of a Document to be itself. * @param nodeHandle the id of the node. @return int Node handle of owning document, or the nodeHandle if it is a Document. 
public	TokenNamepublic	
int	TokenNameint	
getDocumentRoot	TokenNameIdentifier	 get Document Root
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getManager	TokenNameIdentifier	 get Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the string-value of a node as a String object * (see http://www.w3.org/TR/xpath#data-model * for the definition of a node's string-value). * * @param nodeHandle The node ID. * * @return A string object that represents the string-value of the given node. */	TokenNameCOMMENT_JAVADOC	 Get the string-value of a node as a String object (see http://www.w3.org/TR/xpath#data-model for the definition of a node's string-value). * @param nodeHandle The node ID. * @return A string object that represents the string-value of the given node. 
public	TokenNamepublic	
abstract	TokenNameabstract	
XMLString	TokenNameIdentifier	 XML String
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get number of character array chunks in * the string-value of a node. * (see http://www.w3.org/TR/xpath#data-model * for the definition of a node's string-value). * Note that a single text node may have multiple text chunks. * * @param nodeHandle The node ID. * * @return number of character array chunks in * the string-value of a node. */	TokenNameCOMMENT_JAVADOC	 Get number of character array chunks in the string-value of a node. (see http://www.w3.org/TR/xpath#data-model for the definition of a node's string-value). Note that a single text node may have multiple text chunks. * @param nodeHandle The node ID. * @return number of character array chunks in the string-value of a node. 
public	TokenNamepublic	
int	TokenNameint	
getStringValueChunkCount	TokenNameIdentifier	 get String Value Chunk Count
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %TBD% 	TokenNameCOMMENT_LINE	%TBD% 
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_METHOD_NOT_SUPPORTED	TokenNameIdentifier	 ER  METHOD  NOT  SUPPORTED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//("getStringValueChunkCount not yet supported!"); 	TokenNameCOMMENT_LINE	("getStringValueChunkCount not yet supported!"); 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a character array chunk in the string-value of a node. * (see http://www.w3.org/TR/xpath#data-model * for the definition of a node's string-value). * Note that a single text node may have multiple text chunks. * * @param nodeHandle The node ID. * @param chunkIndex Which chunk to get. * @param startAndLen An array of 2 where the start position and length of * the chunk will be returned. * * @return The character array reference where the chunk occurs. */	TokenNameCOMMENT_JAVADOC	 Get a character array chunk in the string-value of a node. (see http://www.w3.org/TR/xpath#data-model for the definition of a node's string-value). Note that a single text node may have multiple text chunks. * @param nodeHandle The node ID. @param chunkIndex Which chunk to get. @param startAndLen An array of 2 where the start position and length of the chunk will be returned. * @return The character array reference where the chunk occurs. 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getStringValueChunk	TokenNameIdentifier	 get String Value Chunk
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
int	TokenNameint	
chunkIndex	TokenNameIdentifier	 chunk Index
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
startAndLen	TokenNameIdentifier	 start And Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %TBD% 	TokenNameCOMMENT_LINE	%TBD% 
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_METHOD_NOT_SUPPORTED	TokenNameIdentifier	 ER  METHOD  NOT  SUPPORTED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"getStringValueChunk not yet supported!"); 	TokenNameCOMMENT_LINE	"getStringValueChunk not yet supported!"); 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, return an ID that represents the node's expanded name. * * @param nodeHandle The handle to the node in question. * * @return the expanded-name id of the node. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return an ID that represents the node's expanded name. * @param nodeHandle The handle to the node in question. * @return the expanded-name id of the node. 
public	TokenNamepublic	
int	TokenNameint	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% This _should_ only be null if someone asked the wrong DTM about the node... 	TokenNameCOMMENT_LINE	%REVIEW% This _should_ only be null if someone asked the wrong DTM about the node... 
// which one would hope would never happen... 	TokenNameCOMMENT_LINE	which one would hope would never happen... 
int	TokenNameint	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
==	TokenNameEQUAL_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an expanded name, return an ID. If the expanded-name does not * exist in the internal tables, the entry will be created, and the ID will * be returned. Any additional nodes that are created that have this * expanded name will use this ID. * * @param type The simple type, i.e. one of ELEMENT, ATTRIBUTE, etc. * * @param namespace The namespace URI, which may be null, may be an empty * string (which will be the same as null), or may be a * namespace URI. * @param localName The local name string, which must be a valid * <a href="http://www.w3.org/TR/REC-xml-names/">NCName</a>. * * @return the expanded-name id of the node. */	TokenNameCOMMENT_JAVADOC	 Given an expanded name, return an ID. If the expanded-name does not exist in the internal tables, the entry will be created, and the ID will be returned. Any additional nodes that are created that have this expanded name will use this ID. * @param type The simple type, i.e. one of ELEMENT, ATTRIBUTE, etc. * @param namespace The namespace URI, which may be null, may be an empty string (which will be the same as null), or may be a namespace URI. @param localName The local name string, which must be a valid <a href="http://www.w3.org/TR/REC-xml-names/">NCName</a>. * @return the expanded-name id of the node. 
public	TokenNamepublic	
int	TokenNameint	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExpandedNameTable	TokenNameIdentifier	 Expanded Name Table
ent	TokenNameIdentifier	 ent
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ent	TokenNameIdentifier	 ent
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an expanded-name ID, return the local name part. * * @param expandedNameID an ID that represents an expanded-name. * @return String Local name of this node. */	TokenNameCOMMENT_JAVADOC	 Given an expanded-name ID, return the local name part. * @param expandedNameID an ID that represents an expanded-name. @return String Local name of this node. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalNameFromExpandedNameID	TokenNameIdentifier	 get Local Name From Expanded Name ID
(	TokenNameLPAREN	
int	TokenNameint	
expandedNameID	TokenNameIdentifier	 expanded Name ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
expandedNameID	TokenNameIdentifier	 expanded Name ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an expanded-name ID, return the namespace URI part. * * @param expandedNameID an ID that represents an expanded-name. * @return String URI value of this node's namespace, or null if no * namespace was resolved. */	TokenNameCOMMENT_JAVADOC	 Given an expanded-name ID, return the namespace URI part. * @param expandedNameID an ID that represents an expanded-name. @return String URI value of this node's namespace, or null if no namespace was resolved. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceFromExpandedNameID	TokenNameIdentifier	 get Namespace From Expanded Name ID
(	TokenNameLPAREN	
int	TokenNameint	
expandedNameID	TokenNameIdentifier	 expanded Name ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
expandedNameID	TokenNameIdentifier	 expanded Name ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the namespace type of a specific node * @param nodeHandle the id of the node. * @return the ID of the namespace. */	TokenNameCOMMENT_JAVADOC	 Returns the namespace type of a specific node @param nodeHandle the id of the node. @return the ID of the namespace. 
public	TokenNamepublic	
int	TokenNameint	
getNamespaceType	TokenNameIdentifier	 get Namespace Type
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
expandedNameID	TokenNameIdentifier	 expanded Name ID
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getNamespaceID	TokenNameIdentifier	 get Namespace ID
(	TokenNameLPAREN	
expandedNameID	TokenNameIdentifier	 expanded Name ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, return its DOM-style node name. This will * include names such as #text or #document. * * @param nodeHandle the id of the node. * @return String Name of this node, which may be an empty string. * %REVIEW% Document when empty string is possible... * %REVIEW-COMMENT% It should never be empty, should it? */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its DOM-style node name. This will include names such as #text or #document. * @param nodeHandle the id of the node. @return String Name of this node, which may be an empty string. %REVIEW% Document when empty string is possible... %REVIEW-COMMENT% It should never be empty, should it? 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, return the XPath node name. This should be * the name as described by the XPath data model, NOT the DOM-style * name. * * @param nodeHandle the id of the node. * @return String Name of this node, which may be an empty string. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return the XPath node name. This should be the name as described by the XPath data model, NOT the DOM-style name. * @param nodeHandle the id of the node. @return String Name of this node, which may be an empty string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeNameX	TokenNameIdentifier	 get Node Name X
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/** @todo: implement this org.apache.xml.dtm.DTMDefaultBase abstract method */	TokenNameCOMMENT_JAVADOC	 @todo: implement this org.apache.xml.dtm.DTMDefaultBase abstract method 
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_METHOD_NOT_SUPPORTED	TokenNameIdentifier	 ER  METHOD  NOT  SUPPORTED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Not yet supported!"); 	TokenNameCOMMENT_LINE	"Not yet supported!"); 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, return its XPath-style localname. * (As defined in Namespaces, this is the portion of the name after any * colon character). * * @param nodeHandle the id of the node. * @return String Local name of this node. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its XPath-style localname. (As defined in Namespaces, this is the portion of the name after any colon character). * @param nodeHandle the id of the node. @return String Local name of this node. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a namespace handle, return the prefix that the namespace decl is * mapping. * Given a node handle, return the prefix used to map to the namespace. * * <p> %REVIEW% Are you sure you want "" for no prefix? </p> * <p> %REVIEW-COMMENT% I think so... not totally sure. -sb </p> * * @param nodeHandle the id of the node. * @return String prefix of this node's name, or "" if no explicit * namespace prefix was given. */	TokenNameCOMMENT_JAVADOC	 Given a namespace handle, return the prefix that the namespace decl is mapping. Given a node handle, return the prefix used to map to the namespace. * <p> %REVIEW% Are you sure you want "" for no prefix? </p> <p> %REVIEW-COMMENT% I think so... not totally sure. -sb </p> * @param nodeHandle the id of the node. @return String prefix of this node's name, or "" if no explicit namespace prefix was given. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, return its DOM-style namespace URI * (As defined in Namespaces, this is the declared URI which this node's * prefix -- or default in lieu thereof -- was mapped to.) * * <p>%REVIEW% Null or ""? -sb</p> * * @param nodeHandle the id of the node. * @return String URI value of this node's namespace, or null if no * namespace was resolved. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its DOM-style namespace URI (As defined in Namespaces, this is the declared URI which this node's prefix -- or default in lieu thereof -- was mapped to.) * <p>%REVIEW% Null or ""? -sb</p> * @param nodeHandle the id of the node. @return String URI value of this node's namespace, or null if no namespace was resolved. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, return its node value. This is mostly * as defined by the DOM, but may ignore some conveniences. * <p> * * @param nodeHandle The node id. * @return String Value of this node, or null if not * meaningful for this node type. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its node value. This is mostly as defined by the DOM, but may ignore some conveniences. <p> * @param nodeHandle The node id. @return String Value of this node, or null if not meaningful for this node type. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, return its DOM-style node type. * <p> * %REVIEW% Generally, returning short is false economy. Return int? * %REVIEW% Make assumption that node has already arrived. Is OK? * * @param nodeHandle The node id. * @return int Node type, as per the DOM's Node._NODE constants. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its DOM-style node type. <p> %REVIEW% Generally, returning short is false economy. Return int? %REVIEW% Make assumption that node has already arrived. Is OK? * @param nodeHandle The node id. @return int Node type, as per the DOM's Node._NODE constants. 
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the depth level of this node in the tree (equals 1 for * a parentless node). * * @param nodeHandle The node id. * @return the number of ancestors, plus one * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Get the depth level of this node in the tree (equals 1 for a parentless node). * @param nodeHandle The node id. @return the number of ancestors, plus one @xsl.usage internal 
public	TokenNamepublic	
short	TokenNameshort	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Apparently, the axis walker stuff requires levels to count from 1. 	TokenNameCOMMENT_LINE	Apparently, the axis walker stuff requires levels to count from 1. 
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
_level	TokenNameIdentifier	 level
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the identity of this node in the tree * * @param nodeHandle The node handle. * @return the node identity * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Get the identity of this node in the tree * @param nodeHandle The node handle. @return the node identity @xsl.usage internal 
public	TokenNamepublic	
int	TokenNameint	
getNodeIdent	TokenNameIdentifier	 get Node Ident
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*if (nodeHandle != DTM.NULL) return nodeHandle & m_mask; else return DTM.NULL;*/	TokenNameCOMMENT_BLOCK	if (nodeHandle != DTM.NULL) return nodeHandle & m_mask; else return DTM.NULL;
return	TokenNamereturn	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the handle of this node in the tree * * @param nodeId The node identity. * @return the node handle * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Get the handle of this node in the tree * @param nodeId The node identity. @return the node handle @xsl.usage internal 
public	TokenNamepublic	
int	TokenNameint	
getNodeHandle	TokenNameIdentifier	 get Node Handle
(	TokenNameLPAREN	
int	TokenNameint	
nodeId	TokenNameIdentifier	 node Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*if (nodeId != DTM.NULL) return nodeId | m_dtmIdent; else return DTM.NULL;*/	TokenNameCOMMENT_BLOCK	if (nodeId != DTM.NULL) return nodeId | m_dtmIdent; else return DTM.NULL;
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
nodeId	TokenNameIdentifier	 node Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ============== Document query functions ============== 	TokenNameCOMMENT_LINE	============== Document query functions ============== 
/** * Tests whether DTM DOM implementation implements a specific feature and * that feature is supported by this node. * * @param feature The name of the feature to test. * @param version This is the version number of the feature to test. * If the version is not * specified, supporting any version of the feature will cause the * method to return <code>true</code>. * @return Returns <code>true</code> if the specified feature is * supported on this node, <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Tests whether DTM DOM implementation implements a specific feature and that feature is supported by this node. * @param feature The name of the feature to test. @param version This is the version number of the feature to test. If the version is not specified, supporting any version of the feature will cause the method to return <code>true</code>. @return Returns <code>true</code> if the specified feature is supported on this node, <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSupported	TokenNameIdentifier	 is Supported
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %TBD% 	TokenNameCOMMENT_LINE	%TBD% 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the base URI of the document entity. If it is not known * (because the document was parsed from a socket connection or from * standard input, for example), the value of this property is unknown. * * @return the document base URI String object or null if unknown. */	TokenNameCOMMENT_JAVADOC	 Return the base URI of the document entity. If it is not known (because the document was parsed from a socket connection or from standard input, for example), the value of this property is unknown. * @return the document base URI String object or null if unknown. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentBaseURI	TokenNameIdentifier	 get Document Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_documentBaseURI	TokenNameIdentifier	 m document Base URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the base URI of the document entity. * * @param baseURI the document base URI String object or null if unknown. */	TokenNameCOMMENT_JAVADOC	 Set the base URI of the document entity. * @param baseURI the document base URI String object or null if unknown. 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentBaseURI	TokenNameIdentifier	 set Document Base URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_documentBaseURI	TokenNameIdentifier	 m document Base URI
=	TokenNameEQUAL	
baseURI	TokenNameIdentifier	 base URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the system identifier of the document entity. If * it is not known, the value of this property is unknown. * * @param nodeHandle The node id, which can be any valid node handle. * @return the system identifier String object or null if unknown. */	TokenNameCOMMENT_JAVADOC	 Return the system identifier of the document entity. If it is not known, the value of this property is unknown. * @param nodeHandle The node id, which can be any valid node handle. @return the system identifier String object or null if unknown. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentSystemIdentifier	TokenNameIdentifier	 get Document System Identifier
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% OK? -sb 	TokenNameCOMMENT_LINE	%REVIEW% OK? -sb 
return	TokenNamereturn	
m_documentBaseURI	TokenNameIdentifier	 m document Base URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the name of the character encoding scheme * in which the document entity is expressed. * * @param nodeHandle The node id, which can be any valid node handle. * @return the document encoding String object. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Return the name of the character encoding scheme in which the document entity is expressed. * @param nodeHandle The node id, which can be any valid node handle. @return the document encoding String object. @xsl.usage internal 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentEncoding	TokenNameIdentifier	 get Document Encoding
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% OK?? -sb 	TokenNameCOMMENT_LINE	%REVIEW% OK?? -sb 
return	TokenNamereturn	
"UTF-8"	TokenNameStringLiteral	UTF-8
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return an indication of the standalone status of the document, * either "yes" or "no". This property is derived from the optional * standalone document declaration in the XML declaration at the * beginning of the document entity, and has no value if there is no * standalone document declaration. * * @param nodeHandle The node id, which can be any valid node handle. * @return the document standalone String object, either "yes", "no", or null. */	TokenNameCOMMENT_JAVADOC	 Return an indication of the standalone status of the document, either "yes" or "no". This property is derived from the optional standalone document declaration in the XML declaration at the beginning of the document entity, and has no value if there is no standalone document declaration. * @param nodeHandle The node id, which can be any valid node handle. @return the document standalone String object, either "yes", "no", or null. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentStandalone	TokenNameIdentifier	 get Document Standalone
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a string representing the XML version of the document. This * property is derived from the XML declaration optionally present at the * beginning of the document entity, and has no value if there is no XML * declaration. * * @param documentHandle The document handle * * @return the document version String object. */	TokenNameCOMMENT_JAVADOC	 Return a string representing the XML version of the document. This property is derived from the XML declaration optionally present at the beginning of the document entity, and has no value if there is no XML declaration. * @param documentHandle The document handle * @return the document version String object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentVersion	TokenNameIdentifier	 get Document Version
(	TokenNameLPAREN	
int	TokenNameint	
documentHandle	TokenNameIdentifier	 document Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return an indication of * whether the processor has read the complete DTD. Its value is a * boolean. If it is false, then certain properties (indicated in their * descriptions below) may be unknown. If it is true, those properties * are never unknown. * * @return <code>true</code> if all declarations were processed; * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Return an indication of whether the processor has read the complete DTD. Its value is a boolean. If it is false, then certain properties (indicated in their descriptions below) may be unknown. If it is true, those properties are never unknown. * @return <code>true</code> if all declarations were processed; <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getDocumentAllDeclarationsProcessed	TokenNameIdentifier	 get Document All Declarations Processed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% OK? 	TokenNameCOMMENT_LINE	%REVIEW% OK? 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A document type declaration information item has the following properties: * * 1. [system identifier] The system identifier of the external subset, if * it exists. Otherwise this property has no value. * * @return the system identifier String object, or null if there is none. */	TokenNameCOMMENT_JAVADOC	 A document type declaration information item has the following properties: * 1. [system identifier] The system identifier of the external subset, if it exists. Otherwise this property has no value. * @return the system identifier String object, or null if there is none. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getDocumentTypeDeclarationSystemIdentifier	TokenNameIdentifier	 get Document Type Declaration System Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return the public identifier of the external subset, * normalized as described in 4.2.2 External Entities [XML]. If there is * no external subset or if it has no public identifier, this property * has no value. * * @return the public identifier String object, or null if there is none. */	TokenNameCOMMENT_JAVADOC	 Return the public identifier of the external subset, normalized as described in 4.2.2 External Entities [XML]. If there is no external subset or if it has no public identifier, this property has no value. * @return the public identifier String object, or null if there is none. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getDocumentTypeDeclarationPublicIdentifier	TokenNameIdentifier	 get Document Type Declaration Public Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the <code>Element</code> whose <code>ID</code> is given by * <code>elementId</code>. If no such element exists, returns * <code>DTM.NULL</code>. Behavior is not defined if more than one element * has this <code>ID</code>. Attributes (including those * with the name "ID") are not of type ID unless so defined by DTD/Schema * information available to the DTM implementation. * Implementations that do not know whether attributes are of type ID or * not are expected to return <code>DTM.NULL</code>. * * <p>%REVIEW% Presumably IDs are still scoped to a single document, * and this operation searches only within a single document, right? * Wouldn't want collisions between DTMs in the same process.</p> * * @param elementId The unique <code>id</code> value for an element. * @return The handle of the matching element. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>Element</code> whose <code>ID</code> is given by <code>elementId</code>. If no such element exists, returns <code>DTM.NULL</code>. Behavior is not defined if more than one element has this <code>ID</code>. Attributes (including those with the name "ID") are not of type ID unless so defined by DTD/Schema information available to the DTM implementation. Implementations that do not know whether attributes are of type ID or not are expected to return <code>DTM.NULL</code>. * <p>%REVIEW% Presumably IDs are still scoped to a single document, and this operation searches only within a single document, right? Wouldn't want collisions between DTMs in the same process.</p> * @param elementId The unique <code>id</code> value for an element. @return The handle of the matching element. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementId	TokenNameIdentifier	 element Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The getUnparsedEntityURI function returns the URI of the unparsed * entity with the specified name in the same document as the context * node (see [3.3 Unparsed Entities]). It returns the empty string if * there is no such entity. * <p> * XML processors may choose to use the System Identifier (if one * is provided) to resolve the entity, rather than the URI in the * Public Identifier. The details are dependent on the processor, and * we would have to support some form of plug-in resolver to handle * this properly. Currently, we simply return the System Identifier if * present, and hope that it a usable URI or that our caller can * map it to one. * TODO: Resolve Public Identifiers... or consider changing function name. * <p> * If we find a relative URI * reference, XML expects it to be resolved in terms of the base URI * of the document. The DOM doesn't do that for us, and it isn't * entirely clear whether that should be done here; currently that's * pushed up to a higher level of our application. (Note that DOM Level * 1 didn't store the document's base URI.) * TODO: Consider resolving Relative URIs. * <p> * (The DOM's statement that "An XML processor may choose to * completely expand entities before the structure model is passed * to the DOM" refers only to parsed entities, not unparsed, and hence * doesn't affect this function.) * * @param name A string containing the Entity Name of the unparsed * entity. * * @return String containing the URI of the Unparsed Entity, or an * empty string if no such entity exists. */	TokenNameCOMMENT_JAVADOC	 The getUnparsedEntityURI function returns the URI of the unparsed entity with the specified name in the same document as the context node (see [3.3 Unparsed Entities]). It returns the empty string if there is no such entity. <p> XML processors may choose to use the System Identifier (if one is provided) to resolve the entity, rather than the URI in the Public Identifier. The details are dependent on the processor, and we would have to support some form of plug-in resolver to handle this properly. Currently, we simply return the System Identifier if present, and hope that it a usable URI or that our caller can map it to one. TODO: Resolve Public Identifiers... or consider changing function name. <p> If we find a relative URI reference, XML expects it to be resolved in terms of the base URI of the document. The DOM doesn't do that for us, and it isn't entirely clear whether that should be done here; currently that's pushed up to a higher level of our application. (Note that DOM Level 1 didn't store the document's base URI.) TODO: Consider resolving Relative URIs. <p> (The DOM's statement that "An XML processor may choose to completely expand entities before the structure model is passed to the DOM" refers only to parsed entities, not unparsed, and hence doesn't affect this function.) * @param name A string containing the Entity Name of the unparsed entity. * @return String containing the URI of the Unparsed Entity, or an empty string if no such entity exists. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getUnparsedEntityURI	TokenNameIdentifier	 get Unparsed Entity URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ============== Boolean methods ================ 	TokenNameCOMMENT_LINE	============== Boolean methods ================ 
/** * Return true if the xsl:strip-space or xsl:preserve-space was processed * during construction of the DTM document. * * @return true if this DTM supports prestripping. */	TokenNameCOMMENT_JAVADOC	 Return true if the xsl:strip-space or xsl:preserve-space was processed during construction of the DTM document. * @return true if this DTM supports prestripping. 
public	TokenNamepublic	
boolean	TokenNameboolean	
supportsPreStripping	TokenNameIdentifier	 supports Pre Stripping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Figure out whether nodeHandle2 should be considered as being later * in the document than nodeHandle1, in Document Order as defined * by the XPath model. This may not agree with the ordering defined * by other XML applications. * <p> * There are some cases where ordering isn't defined, and neither are * the results of this function -- though we'll generally return false. * * @param nodeHandle1 Node handle to perform position comparison on. * @param nodeHandle2 Second Node handle to perform position comparison on . * * @return true if node1 comes before node2, otherwise return false. * You can think of this as * <code>(node1.documentOrderPosition &lt;= node2.documentOrderPosition)</code>. */	TokenNameCOMMENT_JAVADOC	 Figure out whether nodeHandle2 should be considered as being later in the document than nodeHandle1, in Document Order as defined by the XPath model. This may not agree with the ordering defined by other XML applications. <p> There are some cases where ordering isn't defined, and neither are the results of this function -- though we'll generally return false. * @param nodeHandle1 Node handle to perform position comparison on. @param nodeHandle2 Second Node handle to perform position comparison on . * @return true if node1 comes before node2, otherwise return false. You can think of this as <code>(node1.documentOrderPosition &lt;= node2.documentOrderPosition)</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNodeAfter	TokenNameIdentifier	 is Node After
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle1	TokenNameIdentifier	 node Handle1
,	TokenNameCOMMA	
int	TokenNameint	
nodeHandle2	TokenNameIdentifier	 node Handle2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// These return NULL if the node doesn't belong to this document. 	TokenNameCOMMENT_LINE	These return NULL if the node doesn't belong to this document. 
int	TokenNameint	
index1	TokenNameIdentifier	 index1
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle1	TokenNameIdentifier	 node Handle1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index2	TokenNameIdentifier	 index2
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle2	TokenNameIdentifier	 node Handle2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
index1	TokenNameIdentifier	 index1
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
&&	TokenNameAND_AND	
index2	TokenNameIdentifier	 index2
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
&&	TokenNameAND_AND	
index1	TokenNameIdentifier	 index1
<=	TokenNameLESS_EQUAL	
index2	TokenNameIdentifier	 index2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * 2. [element content whitespace] A boolean indicating whether the * character is white space appearing within element content (see [XML], * 2.10 "White Space Handling"). Note that validating XML processors are * required by XML 1.0 to provide this information. If there is no * declaration for the containing element, this property has no value for * white space characters. If no declaration has been read, but the [all * declarations processed] property of the document information item is * false (so there may be an unread declaration), then the value of this * property is unknown for white space characters. It is always false for * characters that are not white space. * * @param nodeHandle the node ID. * @return <code>true</code> if the character data is whitespace; * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 2. [element content whitespace] A boolean indicating whether the character is white space appearing within element content (see [XML], 2.10 "White Space Handling"). Note that validating XML processors are required by XML 1.0 to provide this information. If there is no declaration for the containing element, this property has no value for white space characters. If no declaration has been read, but the [all declarations processed] property of the document information item is false (so there may be an unread declaration), then the value of this property is unknown for white space characters. It is always false for characters that are not white space. * @param nodeHandle the node ID. @return <code>true</code> if the character data is whitespace; <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCharacterElementContentWhitespace	TokenNameIdentifier	 is Character Element Content Whitespace
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %TBD% 	TokenNameCOMMENT_LINE	%TBD% 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * 10. [all declarations processed] This property is not strictly speaking * part of the infoset of the document. Rather it is an indication of * whether the processor has read the complete DTD. Its value is a * boolean. If it is false, then certain properties (indicated in their * descriptions below) may be unknown. If it is true, those properties * are never unknown. * * @param documentHandle A node handle that must identify a document. * @return <code>true</code> if all declarations were processed; * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 10. [all declarations processed] This property is not strictly speaking part of the infoset of the document. Rather it is an indication of whether the processor has read the complete DTD. Its value is a boolean. If it is false, then certain properties (indicated in their descriptions below) may be unknown. If it is true, those properties are never unknown. * @param documentHandle A node handle that must identify a document. @return <code>true</code> if all declarations were processed; <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDocumentAllDeclarationsProcessed	TokenNameIdentifier	 is Document All Declarations Processed
(	TokenNameLPAREN	
int	TokenNameint	
documentHandle	TokenNameIdentifier	 document Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * 5. [specified] A flag indicating whether this attribute was actually * specified in the start-tag of its element, or was defaulted from the * DTD. * * @param attributeHandle The attribute handle in question. * * @return <code>true</code> if the attribute was specified; * <code>false</code> if it was defaulted. */	TokenNameCOMMENT_JAVADOC	 5. [specified] A flag indicating whether this attribute was actually specified in the start-tag of its element, or was defaulted from the DTD. * @param attributeHandle The attribute handle in question. * @return <code>true</code> if the attribute was specified; <code>false</code> if it was defaulted. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isAttributeSpecified	TokenNameIdentifier	 is Attribute Specified
(	TokenNameLPAREN	
int	TokenNameint	
attributeHandle	TokenNameIdentifier	 attribute Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ========== Direct SAX Dispatch, for optimization purposes ======== 	TokenNameCOMMENT_LINE	========== Direct SAX Dispatch, for optimization purposes ======== 
/** * Directly call the * characters method on the passed ContentHandler for the * string-value of the given node (see http://www.w3.org/TR/xpath#data-model * for the definition of a node's string-value). Multiple calls to the * ContentHandler's characters methods may well occur for a single call to * this method. * * @param nodeHandle The node ID. * @param ch A non-null reference to a ContentHandler. * @param normalize true if the content should be normalized according to * the rules for the XPath * <a href="http://www.w3.org/TR/xpath#function-normalize-space">normalize-space</a> * function. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Directly call the characters method on the passed ContentHandler for the string-value of the given node (see http://www.w3.org/TR/xpath#data-model for the definition of a node's string-value). Multiple calls to the ContentHandler's characters methods may well occur for a single call to this method. * @param nodeHandle The node ID. @param ch A non-null reference to a ContentHandler. @param normalize true if the content should be normalized according to the rules for the XPath <a href="http://www.w3.org/TR/xpath#function-normalize-space">normalize-space</a> function. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
boolean	TokenNameboolean	
normalize	TokenNameIdentifier	 normalize
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Directly create SAX parser events from a subtree. * * @param nodeHandle The node ID. * @param ch A non-null reference to a ContentHandler. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Directly create SAX parser events from a subtree. * @param nodeHandle The node ID. @param ch A non-null reference to a ContentHandler. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
dispatchToEvents	TokenNameIdentifier	 dispatch To Events
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
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
;	TokenNameSEMICOLON	
/** * Return an DOM node for the given node. * * @param nodeHandle The node ID. * * @return A node representation of the DTM node. */	TokenNameCOMMENT_JAVADOC	 Return an DOM node for the given node. * @param nodeHandle The node ID. * @return A node representation of the DTM node. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ==== Construction methods (may not be supported by some implementations!) ===== 	TokenNameCOMMENT_LINE	==== Construction methods (may not be supported by some implementations!) ===== 
/** * Append a child to the end of the document. Please note that the node * is always cloned if it is owned by another document. * * <p>%REVIEW% "End of the document" needs to be defined more clearly. * Does it become the last child of the Document? Of the root element?</p> * * @param newChild Must be a valid new node handle. * @param clone true if the child should be cloned into the document. * @param cloneDepth if the clone argument is true, specifies that the * clone should include all it's children. */	TokenNameCOMMENT_JAVADOC	 Append a child to the end of the document. Please note that the node is always cloned if it is owned by another document. * <p>%REVIEW% "End of the document" needs to be defined more clearly. Does it become the last child of the Document? Of the root element?</p> * @param newChild Must be a valid new node handle. @param clone true if the child should be cloned into the document. @param cloneDepth if the clone argument is true, specifies that the clone should include all it's children. 
public	TokenNamepublic	
void	TokenNamevoid	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
int	TokenNameint	
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
boolean	TokenNameboolean	
clone	TokenNameIdentifier	 clone
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cloneDepth	TokenNameIdentifier	 clone Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_METHOD_NOT_SUPPORTED	TokenNameIdentifier	 ER  METHOD  NOT  SUPPORTED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"appendChild not yet supported!"); 	TokenNameCOMMENT_LINE	"appendChild not yet supported!"); 
}	TokenNameRBRACE	
/** * Append a text node child that will be constructed from a string, * to the end of the document. * * <p>%REVIEW% "End of the document" needs to be defined more clearly. * Does it become the last child of the Document? Of the root element?</p> * * @param str Non-null reverence to a string. */	TokenNameCOMMENT_JAVADOC	 Append a text node child that will be constructed from a string, to the end of the document. * <p>%REVIEW% "End of the document" needs to be defined more clearly. Does it become the last child of the Document? Of the root element?</p> * @param str Non-null reverence to a string. 
public	TokenNamepublic	
void	TokenNamevoid	
appendTextChild	TokenNameIdentifier	 append Text Child
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_METHOD_NOT_SUPPORTED	TokenNameIdentifier	 ER  METHOD  NOT  SUPPORTED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"appendTextChild not yet supported!"); 	TokenNameCOMMENT_LINE	"appendTextChild not yet supported!"); 
}	TokenNameRBRACE	
/** * Simple error for asserts and the like. * * @param msg Error message to report. */	TokenNameCOMMENT_JAVADOC	 Simple error for asserts and the like. * @param msg Error message to report. 
protected	TokenNameprotected	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find out whether or not to strip whispace nodes. * * * @return whether or not to strip whispace nodes. */	TokenNameCOMMENT_JAVADOC	 Find out whether or not to strip whispace nodes. * @return whether or not to strip whispace nodes. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
getShouldStripWhitespace	TokenNameIdentifier	 get Should Strip Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_shouldStripWS	TokenNameIdentifier	 m should Strip WS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether to strip whitespaces and push in current value of * m_shouldStripWS in m_shouldStripWhitespaceStack. * * @param shouldStrip Flag indicating whether to strip whitespace nodes */	TokenNameCOMMENT_JAVADOC	 Set whether to strip whitespaces and push in current value of m_shouldStripWS in m_shouldStripWhitespaceStack. * @param shouldStrip Flag indicating whether to strip whitespace nodes 
protected	TokenNameprotected	
void	TokenNamevoid	
pushShouldStripWhitespace	TokenNameIdentifier	 push Should Strip Whitespace
(	TokenNameLPAREN	
boolean	TokenNameboolean	
shouldStrip	TokenNameIdentifier	 should Strip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_shouldStripWS	TokenNameIdentifier	 m should Strip WS
=	TokenNameEQUAL	
shouldStrip	TokenNameIdentifier	 should Strip
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_shouldStripWhitespaceStack	TokenNameIdentifier	 m should Strip Whitespace Stack
)	TokenNameRPAREN	
m_shouldStripWhitespaceStack	TokenNameIdentifier	 m should Strip Whitespace Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
shouldStrip	TokenNameIdentifier	 should Strip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether to strip whitespaces at this point by popping out * m_shouldStripWhitespaceStack. * */	TokenNameCOMMENT_JAVADOC	 Set whether to strip whitespaces at this point by popping out m_shouldStripWhitespaceStack. 
protected	TokenNameprotected	
void	TokenNamevoid	
popShouldStripWhitespace	TokenNameIdentifier	 pop Should Strip Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_shouldStripWhitespaceStack	TokenNameIdentifier	 m should Strip Whitespace Stack
)	TokenNameRPAREN	
m_shouldStripWS	TokenNameIdentifier	 m should Strip WS
=	TokenNameEQUAL	
m_shouldStripWhitespaceStack	TokenNameIdentifier	 m should Strip Whitespace Stack
.	TokenNameDOT	
popAndTop	TokenNameIdentifier	 pop And Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether to strip whitespaces and set the top of the stack to * the current value of m_shouldStripWS. * * * @param shouldStrip Flag indicating whether to strip whitespace nodes */	TokenNameCOMMENT_JAVADOC	 Set whether to strip whitespaces and set the top of the stack to the current value of m_shouldStripWS. * @param shouldStrip Flag indicating whether to strip whitespace nodes 
protected	TokenNameprotected	
void	TokenNamevoid	
setShouldStripWhitespace	TokenNameIdentifier	 set Should Strip Whitespace
(	TokenNameLPAREN	
boolean	TokenNameboolean	
shouldStrip	TokenNameIdentifier	 should Strip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_shouldStripWS	TokenNameIdentifier	 m should Strip WS
=	TokenNameEQUAL	
shouldStrip	TokenNameIdentifier	 should Strip
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_shouldStripWhitespaceStack	TokenNameIdentifier	 m should Strip Whitespace Stack
)	TokenNameRPAREN	
m_shouldStripWhitespaceStack	TokenNameIdentifier	 m should Strip Whitespace Stack
.	TokenNameDOT	
setTop	TokenNameIdentifier	 set Top
(	TokenNameLPAREN	
shouldStrip	TokenNameIdentifier	 should Strip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A dummy routine to satisify the abstract interface. If the DTM * implememtation that extends the default base requires notification * of registration, they can override this method. */	TokenNameCOMMENT_JAVADOC	 A dummy routine to satisify the abstract interface. If the DTM implememtation that extends the default base requires notification of registration, they can override this method. 
public	TokenNamepublic	
void	TokenNamevoid	
documentRegistration	TokenNameIdentifier	 document Registration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * A dummy routine to satisify the abstract interface. If the DTM * implememtation that extends the default base requires notification * when the document is being released, they can override this method */	TokenNameCOMMENT_JAVADOC	 A dummy routine to satisify the abstract interface. If the DTM implememtation that extends the default base requires notification when the document is being released, they can override this method 
public	TokenNamepublic	
void	TokenNamevoid	
documentRelease	TokenNameIdentifier	 document Release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Migrate a DTM built with an old DTMManager to a new DTMManager. * After the migration, the new DTMManager will treat the DTM as * one that is built by itself. * This is used to support DTM sharing between multiple transformations. * @param mgr the DTMManager */	TokenNameCOMMENT_JAVADOC	 Migrate a DTM built with an old DTMManager to a new DTMManager. After the migration, the new DTMManager will treat the DTM as one that is built by itself. This is used to support DTM sharing between multiple transformations. @param mgr the DTMManager 
public	TokenNamepublic	
void	TokenNamevoid	
migrateTo	TokenNameIdentifier	 migrate To
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
mgr	TokenNameIdentifier	 mgr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mgr	TokenNameIdentifier	 m mgr
=	TokenNameEQUAL	
mgr	TokenNameIdentifier	 mgr
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mgr	TokenNameIdentifier	 mgr
instanceof	TokenNameinstanceof	
DTMManagerDefault	TokenNameIdentifier	 DTM Manager Default
)	TokenNameRPAREN	
m_mgrDefault	TokenNameIdentifier	 m mgr Default
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMManagerDefault	TokenNameIdentifier	 DTM Manager Default
)	TokenNameRPAREN	
mgr	TokenNameIdentifier	 mgr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Query which DTMManager this DTM is currently being handled by. * * %REVEW% Should this become part of the base DTM API? * * @return a DTMManager, or null if this is a "stand-alone" DTM. */	TokenNameCOMMENT_JAVADOC	 Query which DTMManager this DTM is currently being handled by. * %REVEW% Should this become part of the base DTM API? * @return a DTMManager, or null if this is a "stand-alone" DTM. 
public	TokenNamepublic	
DTMManager	TokenNameIdentifier	 DTM Manager
getManager	TokenNameIdentifier	 get Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_mgr	TokenNameIdentifier	 m mgr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Query which DTMIDs this DTM is currently using within the DTMManager. * * %REVEW% Should this become part of the base DTM API? * * @return an IntVector, or null if this is a "stand-alone" DTM. */	TokenNameCOMMENT_JAVADOC	 Query which DTMIDs this DTM is currently using within the DTMManager. * %REVEW% Should this become part of the base DTM API? * @return an IntVector, or null if this is a "stand-alone" DTM. 
public	TokenNamepublic	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
getDTMIDs	TokenNameIdentifier	 get DTMI Ds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_mgr	TokenNameIdentifier	 m mgr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_dtmIdent	TokenNameIdentifier	 m dtm Ident
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
