/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SAX2RTFDTM.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SAX2RTFDTM.java 468653 2006-10-28 07:07:05Z minchau $ 
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
.	TokenNameDOT	
sax2dtm	TokenNameIdentifier	 sax2dtm
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
DTMManager	TokenNameIdentifier	 DTM Manager
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
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
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
IntStack	TokenNameIdentifier	 Int Stack
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
IntVector	TokenNameIdentifier	 Int Vector
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
StringVector	TokenNameIdentifier	 String Vector
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * This is a subclass of SAX2DTM which has been modified to meet the needs of * Result Tree Frameworks (RTFs). The differences are: * * 1) Multiple XML trees may be appended to the single DTM. This means * that the root node of each document is _not_ node 0. Some code has * had to be deoptimized to support this mode of operation, and an * explicit mechanism for obtaining the Node Handle of the root node * has been provided. * * 2) A stack of these documents is maintained, allowing us to "tail-prune" the * most recently added trees off the end of the DTM as stylesheet elements * (and thus variable contexts) are exited. * * PLEASE NOTE that this class may be _heavily_ dependent upon the * internals of the SAX2DTM superclass, and must be maintained in * parallel with that code. Arguably, they should be conditionals * within a single class... but they have deen separated for * performance reasons. (In fact, one could even argue about which is * the superclass and which is the subclass; the current arrangement * is as much about preserving stability of existing code during * development as anything else.) * * %REVIEW% In fact, since the differences are so minor, I think it * may be possible/practical to fold them back into the base * SAX2DTM. Consider that as a future code-size optimization. * */	TokenNameCOMMENT_JAVADOC	 This is a subclass of SAX2DTM which has been modified to meet the needs of Result Tree Frameworks (RTFs). The differences are: * 1) Multiple XML trees may be appended to the single DTM. This means that the root node of each document is _not_ node 0. Some code has had to be deoptimized to support this mode of operation, and an explicit mechanism for obtaining the Node Handle of the root node has been provided. * 2) A stack of these documents is maintained, allowing us to "tail-prune" the most recently added trees off the end of the DTM as stylesheet elements (and thus variable contexts) are exited. * PLEASE NOTE that this class may be _heavily_ dependent upon the internals of the SAX2DTM superclass, and must be maintained in parallel with that code. Arguably, they should be conditionals within a single class... but they have deen separated for performance reasons. (In fact, one could even argue about which is the superclass and which is the subclass; the current arrangement is as much about preserving stability of existing code during development as anything else.) * %REVIEW% In fact, since the differences are so minor, I think it may be possible/practical to fold them back into the base SAX2DTM. Consider that as a future code-size optimization. 
public	TokenNamepublic	
class	TokenNameclass	
SAX2RTFDTM	TokenNameIdentifier	 SA X2 RTFDTM
extends	TokenNameextends	
SAX2DTM	TokenNameIdentifier	 SA X2 DTM
{	TokenNameLBRACE	
/** Set true to monitor SAX events and similar diagnostic info. */	TokenNameCOMMENT_JAVADOC	 Set true to monitor SAX events and similar diagnostic info. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Most recently started Document, or null if the DTM is empty. */	TokenNameCOMMENT_JAVADOC	 Most recently started Document, or null if the DTM is empty. 
private	TokenNameprivate	
int	TokenNameint	
m_currentDocumentNode	TokenNameIdentifier	 m current Document Node
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** Tail-pruning mark: Number of nodes in use */	TokenNameCOMMENT_JAVADOC	 Tail-pruning mark: Number of nodes in use 
IntStack	TokenNameIdentifier	 Int Stack
mark_size	TokenNameIdentifier	 mark size
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Tail-pruning mark: Number of data items in use */	TokenNameCOMMENT_JAVADOC	 Tail-pruning mark: Number of data items in use 
IntStack	TokenNameIdentifier	 Int Stack
mark_data_size	TokenNameIdentifier	 mark data size
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Tail-pruning mark: Number of size-of-data fields in use */	TokenNameCOMMENT_JAVADOC	 Tail-pruning mark: Number of size-of-data fields in use 
IntStack	TokenNameIdentifier	 Int Stack
mark_char_size	TokenNameIdentifier	 mark char size
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Tail-pruning mark: Number of dataOrQName slots in use */	TokenNameCOMMENT_JAVADOC	 Tail-pruning mark: Number of dataOrQName slots in use 
IntStack	TokenNameIdentifier	 Int Stack
mark_doq_size	TokenNameIdentifier	 mark doq size
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Tail-pruning mark: Number of namespace declaration sets in use * %REVIEW% I don't think number of NS sets is ever different from number * of NS elements. We can probabably reduce these to a single stack and save * some storage. * */	TokenNameCOMMENT_JAVADOC	 Tail-pruning mark: Number of namespace declaration sets in use %REVIEW% I don't think number of NS sets is ever different from number of NS elements. We can probabably reduce these to a single stack and save some storage. 
IntStack	TokenNameIdentifier	 Int Stack
mark_nsdeclset_size	TokenNameIdentifier	 mark nsdeclset size
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Tail-pruning mark: Number of naespace declaration elements in use * %REVIEW% I don't think number of NS sets is ever different from number * of NS elements. We can probabably reduce these to a single stack and save * some storage. */	TokenNameCOMMENT_JAVADOC	 Tail-pruning mark: Number of naespace declaration elements in use %REVIEW% I don't think number of NS sets is ever different from number of NS elements. We can probabably reduce these to a single stack and save some storage. 
IntStack	TokenNameIdentifier	 Int Stack
mark_nsdeclelem_size	TokenNameIdentifier	 mark nsdeclelem size
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Tail-pruning mark: initial number of nodes in use */	TokenNameCOMMENT_JAVADOC	 Tail-pruning mark: initial number of nodes in use 
int	TokenNameint	
m_emptyNodeCount	TokenNameIdentifier	 m empty Node Count
;	TokenNameSEMICOLON	
/** * Tail-pruning mark: initial number of namespace declaration sets */	TokenNameCOMMENT_JAVADOC	 Tail-pruning mark: initial number of namespace declaration sets 
int	TokenNameint	
m_emptyNSDeclSetCount	TokenNameIdentifier	 m empty NS Decl Set Count
;	TokenNameSEMICOLON	
/** * Tail-pruning mark: initial number of namespace declaration elements */	TokenNameCOMMENT_JAVADOC	 Tail-pruning mark: initial number of namespace declaration elements 
int	TokenNameint	
m_emptyNSDeclSetElemsCount	TokenNameIdentifier	 m empty NS Decl Set Elems Count
;	TokenNameSEMICOLON	
/** * Tail-pruning mark: initial number of data items in use */	TokenNameCOMMENT_JAVADOC	 Tail-pruning mark: initial number of data items in use 
int	TokenNameint	
m_emptyDataCount	TokenNameIdentifier	 m empty Data Count
;	TokenNameSEMICOLON	
/** * Tail-pruning mark: initial number of characters in use */	TokenNameCOMMENT_JAVADOC	 Tail-pruning mark: initial number of characters in use 
int	TokenNameint	
m_emptyCharsCount	TokenNameIdentifier	 m empty Chars Count
;	TokenNameSEMICOLON	
/** * Tail-pruning mark: default initial number of dataOrQName slots in use */	TokenNameCOMMENT_JAVADOC	 Tail-pruning mark: default initial number of dataOrQName slots in use 
int	TokenNameint	
m_emptyDataQNCount	TokenNameIdentifier	 m empty Data QN Count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SAX2RTFDTM	TokenNameIdentifier	 SA X2 RTFDTM
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
super	TokenNamesuper	
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NEVER track source locators for RTFs; they aren't meaningful. I think. 	TokenNameCOMMENT_LINE	NEVER track source locators for RTFs; they aren't meaningful. I think. 
// (If we did track them, we'd need to tail-prune these too.) 	TokenNameCOMMENT_LINE	(If we did track them, we'd need to tail-prune these too.) 
//org.apache.xalan.processor.TransformerFactoryImpl.m_source_location; 	TokenNameCOMMENT_LINE	org.apache.xalan.processor.TransformerFactoryImpl.m_source_location; 
m_useSourceLocationProperty	TokenNameIdentifier	 m use Source Location Property
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_sourceSystemId	TokenNameIdentifier	 m source System Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_useSourceLocationProperty	TokenNameIdentifier	 m use Source Location Property
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
StringVector	TokenNameIdentifier	 String Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_sourceLine	TokenNameIdentifier	 m source Line
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_useSourceLocationProperty	TokenNameIdentifier	 m use Source Location Property
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
IntVector	TokenNameIdentifier	 Int Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_sourceColumn	TokenNameIdentifier	 m source Column
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_useSourceLocationProperty	TokenNameIdentifier	 m use Source Location Property
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
IntVector	TokenNameIdentifier	 Int Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Record initial sizes of fields that are pushed and restored 	TokenNameCOMMENT_LINE	Record initial sizes of fields that are pushed and restored 
// for RTF tail-pruning. More entries can be popped than pushed, so 	TokenNameCOMMENT_LINE	for RTF tail-pruning. More entries can be popped than pushed, so 
// we need this to mark the primordial state of the DTM. 	TokenNameCOMMENT_LINE	we need this to mark the primordial state of the DTM. 
m_emptyNodeCount	TokenNameIdentifier	 m empty Node Count
=	TokenNameEQUAL	
m_size	TokenNameIdentifier	 m size
;	TokenNameSEMICOLON	
m_emptyNSDeclSetCount	TokenNameIdentifier	 m empty NS Decl Set Count
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_emptyNSDeclSetElemsCount	TokenNameIdentifier	 m empty NS Decl Set Elems Count
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_emptyDataCount	TokenNameIdentifier	 m empty Data Count
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_emptyCharsCount	TokenNameIdentifier	 m empty Chars Count
=	TokenNameEQUAL	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_emptyDataQNCount	TokenNameIdentifier	 m empty Data QN Count
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a DTM, find the owning document node. In the case of * SAX2RTFDTM, which may contain multiple documents, this returns * the <b>most recently started</b> document, or null if the DTM is * empty or no document is currently under construction. * * %REVIEW% Should we continue to report the most recent after * construction has ended? I think not, given that it may have been * tail-pruned. * * @return int Node handle of Document node, or null if this DTM does not * contain an "active" document. * */	TokenNameCOMMENT_JAVADOC	 Given a DTM, find the owning document node. In the case of SAX2RTFDTM, which may contain multiple documents, this returns the <b>most recently started</b> document, or null if the DTM is empty or no document is currently under construction. * %REVIEW% Should we continue to report the most recent after construction has ended? I think not, given that it may have been tail-pruned. * @return int Node handle of Document node, or null if this DTM does not contain an "active" document. 
public	TokenNamepublic	
int	TokenNameint	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
m_currentDocumentNode	TokenNameIdentifier	 m current Document Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, find the owning document node, using DTM semantics * (Document owns itself) rather than DOM semantics (Document has no owner). * * (I'm counting on the fact that getOwnerDocument() is implemented on top * of this call, in the superclass, to avoid having to rewrite that one. * Be careful if that code changes!) * * @param nodeHandle the id of the node. * @return int Node handle of owning document */	TokenNameCOMMENT_JAVADOC	 Given a node handle, find the owning document node, using DTM semantics (Document owns itself) rather than DOM semantics (Document has no owner). * (I'm counting on the fact that getOwnerDocument() is implemented on top of this call, in the superclass, to avoid having to rewrite that one. Be careful if that code changes!) * @param nodeHandle the id of the node. @return int Node handle of owning document 
public	TokenNamepublic	
int	TokenNameint	
getDocumentRoot	TokenNameIdentifier	 get Document Root
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
id	TokenNameIdentifier	 id
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
// Safety net; should never happen 	TokenNameCOMMENT_LINE	Safety net; should never happen 
}	TokenNameRBRACE	
/** * Given a node identifier, find the owning document node. Unlike the DOM, * this considers the owningDocument of a Document to be itself. Note that * in shared DTMs this may not be zero. * * @param nodeIdentifier the id of the starting node. * @return int Node identifier of the root of this DTM tree */	TokenNameCOMMENT_JAVADOC	 Given a node identifier, find the owning document node. Unlike the DOM, this considers the owningDocument of a Document to be itself. Note that in shared DTMs this may not be zero. * @param nodeIdentifier the id of the starting node. @return int Node identifier of the root of this DTM tree 
protected	TokenNameprotected	
int	TokenNameint	
_documentRoot	TokenNameIdentifier	 document Root
(	TokenNameLPAREN	
int	TokenNameint	
nodeIdentifier	TokenNameIdentifier	 node Identifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeIdentifier	TokenNameIdentifier	 node Identifier
==	TokenNameEQUAL_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
nodeIdentifier	TokenNameIdentifier	 node Identifier
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
nodeIdentifier	TokenNameIdentifier	 node Identifier
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
nodeIdentifier	TokenNameIdentifier	 node Identifier
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nodeIdentifier	TokenNameIdentifier	 node Identifier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the beginning of a new RTF document. * * %REVIEW% Y'know, this isn't all that much of a deoptimization. We * might want to consider folding the start/endDocument changes back * into the main SAX2DTM so we don't have to expose so many fields * (even as Protected) and carry the additional code. * * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#startDocument * */	TokenNameCOMMENT_JAVADOC	 Receive notification of the beginning of a new RTF document. * %REVIEW% Y'know, this isn't all that much of a deoptimization. We might want to consider folding the start/endDocument changes back into the main SAX2DTM so we don't have to expose so many fields (even as Protected) and carry the additional code. * @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#startDocument 
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// Re-initialize the tree append process 	TokenNameCOMMENT_LINE	Re-initialize the tree append process 
m_endDocumentOccured	TokenNameIdentifier	 m end Document Occured
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
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
m_contextIndexes	TokenNameIdentifier	 m context Indexes
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parents	TokenNameIdentifier	 m parents
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentDocumentNode	TokenNameIdentifier	 m current Document Node
=	TokenNameEQUAL	
m_size	TokenNameIdentifier	 m size
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the end of the document. * * %REVIEW% Y'know, this isn't all that much of a deoptimization. We * might want to consider folding the start/endDocument changes back * into the main SAX2DTM so we don't have to expose so many fields * (even as Protected). * * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#endDocument * */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of the document. * %REVIEW% Y'know, this isn't all that much of a deoptimization. We might want to consider folding the start/endDocument changes back into the main SAX2DTM so we don't have to expose so many fields (even as Protected). * @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#endDocument 
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
charactersFlush	TokenNameIdentifier	 characters Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
m_currentDocumentNode	TokenNameIdentifier	 m current Document Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstch	TokenNameIdentifier	 m firstch
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_currentDocumentNode	TokenNameIdentifier	 m current Document Node
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
)	TokenNameRPAREN	
m_firstch	TokenNameIdentifier	 m firstch
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
m_currentDocumentNode	TokenNameIdentifier	 m current Document Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
m_previous	TokenNameIdentifier	 m previous
)	TokenNameRPAREN	
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
m_previous	TokenNameIdentifier	 m previous
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parents	TokenNameIdentifier	 m parents
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_contextIndexes	TokenNameIdentifier	 m context Indexes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_currentDocumentNode	TokenNameIdentifier	 m current Document Node
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
// no longer open 	TokenNameCOMMENT_LINE	no longer open 
m_endDocumentOccured	TokenNameIdentifier	 m end Document Occured
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** "Tail-pruning" support for RTFs. * * This function pushes information about the current size of the * DTM's data structures onto a stack, for use by popRewindMark() * (which see). * * %REVIEW% I have no idea how to rewind m_elemIndexes. However, * RTFs will not be indexed, so I can simply panic if that case * arises. Hey, it works... * */	TokenNameCOMMENT_JAVADOC	 "Tail-pruning" support for RTFs. * This function pushes information about the current size of the DTM's data structures onto a stack, for use by popRewindMark() (which see). * %REVIEW% I have no idea how to rewind m_elemIndexes. However, RTFs will not be indexed, so I can simply panic if that case arises. Hey, it works... 
public	TokenNamepublic	
void	TokenNamevoid	
pushRewindMark	TokenNameIdentifier	 push Rewind Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_indexing	TokenNameIdentifier	 m indexing
||	TokenNameOR_OR	
m_elemIndexes	TokenNameIdentifier	 m elem Indexes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"Coding error; Don't try to mark/rewind an indexed DTM"	TokenNameStringLiteral	Coding error; Don't try to mark/rewind an indexed DTM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Values from DTMDefaultBase 	TokenNameCOMMENT_LINE	Values from DTMDefaultBase 
// %REVIEW% Can the namespace stack sizes ever differ? If not, save space! 	TokenNameCOMMENT_LINE	%REVIEW% Can the namespace stack sizes ever differ? If not, save space! 
mark_size	TokenNameIdentifier	 mark size
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mark_nsdeclset_size	TokenNameIdentifier	 mark nsdeclset size
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mark_nsdeclelem_size	TokenNameIdentifier	 mark nsdeclelem size
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Values from SAX2DTM 	TokenNameCOMMENT_LINE	Values from SAX2DTM 
mark_data_size	TokenNameIdentifier	 mark data size
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mark_char_size	TokenNameIdentifier	 mark char size
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mark_doq_size	TokenNameIdentifier	 mark doq size
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** "Tail-pruning" support for RTFs. * * This function pops the information previously saved by * pushRewindMark (which see) and uses it to discard all nodes added * to the DTM after that time. We expect that this will allow us to * reuse storage more effectively. * * This is _not_ intended to be called while a document is still being * constructed -- only between endDocument and the next startDocument * * %REVIEW% WARNING: This is the first use of some of the truncation * methods. If Xalan blows up after this is called, that's a likely * place to check. * * %REVIEW% Our original design for DTMs permitted them to share * string pools. If there any risk that this might be happening, we * can _not_ rewind and recover the string storage. One solution * might to assert that DTMs used for RTFs Must Not take advantage * of that feature, but this seems excessively fragile. Another, much * less attractive, would be to just let them leak... Nah. * * @return true if and only if the pop completely emptied the * RTF. That response is used when determining how to unspool * RTF-started-while-RTF-open situations. * */	TokenNameCOMMENT_JAVADOC	 "Tail-pruning" support for RTFs. * This function pops the information previously saved by pushRewindMark (which see) and uses it to discard all nodes added to the DTM after that time. We expect that this will allow us to reuse storage more effectively. * This is _not_ intended to be called while a document is still being constructed -- only between endDocument and the next startDocument * %REVIEW% WARNING: This is the first use of some of the truncation methods. If Xalan blows up after this is called, that's a likely place to check. * %REVIEW% Our original design for DTMs permitted them to share string pools. If there any risk that this might be happening, we can _not_ rewind and recover the string storage. One solution might to assert that DTMs used for RTFs Must Not take advantage of that feature, but this seems excessively fragile. Another, much less attractive, would be to just let them leak... Nah. * @return true if and only if the pop completely emptied the RTF. That response is used when determining how to unspool RTF-started-while-RTF-open situations. 
public	TokenNamepublic	
boolean	TokenNameboolean	
popRewindMark	TokenNameIdentifier	 pop Rewind Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
mark_size	TokenNameIdentifier	 mark size
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_size	TokenNameIdentifier	 m size
=	TokenNameEQUAL	
top	TokenNameIdentifier	 top
?	TokenNameQUESTION	
m_emptyNodeCount	TokenNameIdentifier	 m empty Node Count
:	TokenNameCOLON	
mark_size	TokenNameIdentifier	 mark size
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_exptype	TokenNameIdentifier	 m exptype
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_firstch	TokenNameIdentifier	 m firstch
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_prevsib	TokenNameIdentifier	 m prevsib
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elemIndexes	TokenNameIdentifier	 m elem Indexes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
top	TokenNameIdentifier	 top
?	TokenNameQUESTION	
m_emptyNSDeclSetCount	TokenNameIdentifier	 m empty NS Decl Set Count
:	TokenNameCOLON	
mark_nsdeclset_size	TokenNameIdentifier	 mark nsdeclset size
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
ds1	TokenNameIdentifier	 ds1
=	TokenNameEQUAL	
top	TokenNameIdentifier	 top
?	TokenNameQUESTION	
m_emptyNSDeclSetElemsCount	TokenNameIdentifier	 m empty NS Decl Set Elems Count
:	TokenNameCOLON	
mark_nsdeclelem_size	TokenNameIdentifier	 mark nsdeclelem size
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
ds1	TokenNameIdentifier	 ds1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Values from SAX2DTM - m_data always has a reserved entry 	TokenNameCOMMENT_LINE	Values from SAX2DTM - m_data always has a reserved entry 
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
?	TokenNameQUESTION	
m_emptyDataCount	TokenNameIdentifier	 m empty Data Count
:	TokenNameCOLON	
mark_data_size	TokenNameIdentifier	 mark data size
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
?	TokenNameQUESTION	
m_emptyCharsCount	TokenNameIdentifier	 m empty Chars Count
:	TokenNameCOLON	
mark_char_size	TokenNameIdentifier	 mark char size
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
?	TokenNameQUESTION	
m_emptyDataQNCount	TokenNameIdentifier	 m empty Data QN Count
:	TokenNameCOLON	
mark_doq_size	TokenNameIdentifier	 mark doq size
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Return true iff DTM now empty 	TokenNameCOMMENT_LINE	Return true iff DTM now empty 
return	TokenNamereturn	
m_size	TokenNameIdentifier	 m size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return true if a DTM tree is currently under construction. * */	TokenNameCOMMENT_JAVADOC	 @return true if a DTM tree is currently under construction. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isTreeIncomplete	TokenNameIdentifier	 is Tree Incomplete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
m_endDocumentOccured	TokenNameIdentifier	 m end Document Occured
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
