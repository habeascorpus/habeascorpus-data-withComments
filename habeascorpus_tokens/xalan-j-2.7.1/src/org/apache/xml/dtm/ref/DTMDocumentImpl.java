/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMDocumentImpl.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMDocumentImpl.java 468653 2006-10-28 07:07:05Z minchau $ 
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SourceLocator	TokenNameIdentifier	 Source Locator
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
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
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
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
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
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Locator	TokenNameIdentifier	 Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
;	TokenNameSEMICOLON	
/** * This is the implementation of the DTM document interface. It receives * requests from an XML content handler similar to that of an XML DOM or SAX parser * to store information from the xml document in an array based * dtm table structure. This informtion is used later for document navigation, * query, and SAX event dispatch functions. The DTM can also be used directly as a * document composition model for an application. The requests received are: * <ul> * <li>initiating DTM to set the doc handle</li> * <li>resetting DTM for data structure reuse</li> * <li>hinting the end of document to adjust the end of data structure pointers</li> * <li>createnodes (element, comment, text, attribute, ....)</li> * <li>hinting the end of an element to patch parent and siblings<li> * <li>setting application provided symbol name stringpool data structures</li> * </ul> * <p>State: In progress!!</p> * * %REVIEW% I _think_ the SAX convention is that "no namespace" is expressed * as "" rather than as null (which is the DOM's convention). What should * DTM expect? What should it do with the other? * * <p>Origin: the implemention is a composite logic based on the DTM of XalanJ1 and * DocImpl, DocumentImpl, ElementImpl, TextImpl, etc. of XalanJ2</p> */	TokenNameCOMMENT_JAVADOC	 This is the implementation of the DTM document interface. It receives requests from an XML content handler similar to that of an XML DOM or SAX parser to store information from the xml document in an array based dtm table structure. This informtion is used later for document navigation, query, and SAX event dispatch functions. The DTM can also be used directly as a document composition model for an application. The requests received are: <ul> <li>initiating DTM to set the doc handle</li> <li>resetting DTM for data structure reuse</li> <li>hinting the end of document to adjust the end of data structure pointers</li> <li>createnodes (element, comment, text, attribute, ....)</li> <li>hinting the end of an element to patch parent and siblings<li> <li>setting application provided symbol name stringpool data structures</li> </ul> <p>State: In progress!!</p> * %REVIEW% I _think_ the SAX convention is that "no namespace" is expressed as "" rather than as null (which is the DOM's convention). What should DTM expect? What should it do with the other? * <p>Origin: the implemention is a composite logic based on the DTM of XalanJ1 and DocImpl, DocumentImpl, ElementImpl, TextImpl, etc. of XalanJ2</p> 
public	TokenNamepublic	
class	TokenNameclass	
DTMDocumentImpl	TokenNameIdentifier	 DTM Document Impl
implements	TokenNameimplements	
DTM	TokenNameIdentifier	 DTM
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
{	TokenNameLBRACE	
// Number of lower bits used to represent node index. 	TokenNameCOMMENT_LINE	Number of lower bits used to represent node index. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
DOCHANDLE_SHIFT	TokenNameIdentifier	 DOCHANDLE  SHIFT
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Masks the lower order of node handle. 	TokenNameCOMMENT_LINE	Masks the lower order of node handle. 
// Same as {@link DTMConstructor.IDENT_NODE_DEFAULT} 	TokenNameCOMMENT_LINE	Same as {@link DTMConstructor.IDENT_NODE_DEFAULT} 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NODEHANDLE_MASK	TokenNameIdentifier	 NODEHANDLE  MASK
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
DOCHANDLE_SHIFT	TokenNameIdentifier	 DOCHANDLE  SHIFT
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Masks the higher order Document handle 	TokenNameCOMMENT_LINE	Masks the higher order Document handle 
// Same as {@link DTMConstructor.IDENT_DOC_DEFAULT} 	TokenNameCOMMENT_LINE	Same as {@link DTMConstructor.IDENT_DOC_DEFAULT} 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOCHANDLE_MASK	TokenNameIdentifier	 DOCHANDLE  MASK
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
NODEHANDLE_MASK	TokenNameIdentifier	 NODEHANDLE  MASK
;	TokenNameSEMICOLON	
int	TokenNameint	
m_docHandle	TokenNameIdentifier	 m doc Handle
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
// masked document handle for this dtm document 	TokenNameCOMMENT_LINE	masked document handle for this dtm document 
int	TokenNameint	
m_docElement	TokenNameIdentifier	 m doc Element
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
// nodeHandle to the root of the actual dtm doc content 	TokenNameCOMMENT_LINE	nodeHandle to the root of the actual dtm doc content 
// Context for parse-and-append operations 	TokenNameCOMMENT_LINE	Context for parse-and-append operations 
int	TokenNameint	
currentParent	TokenNameIdentifier	 current Parent
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// current parent - default is document root 	TokenNameCOMMENT_LINE	current parent - default is document root 
int	TokenNameint	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// previous sibling - no previous sibling 	TokenNameCOMMENT_LINE	previous sibling - no previous sibling 
protected	TokenNameprotected	
int	TokenNameint	
m_currentNode	TokenNameIdentifier	 m current Node
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// current node 	TokenNameCOMMENT_LINE	current node 
// The tree under construction can itself be used as 	TokenNameCOMMENT_LINE	The tree under construction can itself be used as 
// the element stack, so m_elemStack isn't needed. 	TokenNameCOMMENT_LINE	the element stack, so m_elemStack isn't needed. 
//protected Stack m_elemStack = new Stack(); // element stack 	TokenNameCOMMENT_LINE	protected Stack m_elemStack = new Stack(); // element stack 
private	TokenNameprivate	
boolean	TokenNameboolean	
previousSiblingWasParent	TokenNameIdentifier	 previous Sibling Was Parent
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Local cache for record-at-a-time fetch 	TokenNameCOMMENT_LINE	Local cache for record-at-a-time fetch 
int	TokenNameint	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// endDocument recieved? 	TokenNameCOMMENT_LINE	endDocument recieved? 
private	TokenNameprivate	
boolean	TokenNameboolean	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
m_isError	TokenNameIdentifier	 m is Error
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** The document base URI. */	TokenNameCOMMENT_JAVADOC	 The document base URI. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_documentBaseURI	TokenNameIdentifier	 m document Base URI
;	TokenNameSEMICOLON	
/** If we're building the model incrementally on demand, we need to * be able to tell the source when to send us more data. * * Note that if this has not been set, and you attempt to read ahead * of the current build point, we'll probably throw a null-pointer * exception. We could try to wait-and-retry instead, as a very poor * fallback, but that has all the known problems with multithreading * on multiprocessors and we Don't Want to Go There. * * @see setIncrementalSAXSource */	TokenNameCOMMENT_JAVADOC	 If we're building the model incrementally on demand, we need to be able to tell the source when to send us more data. * Note that if this has not been set, and you attempt to read ahead of the current build point, we'll probably throw a null-pointer exception. We could try to wait-and-retry instead, as a very poor fallback, but that has all the known problems with multithreading on multiprocessors and we Don't Want to Go There. * @see setIncrementalSAXSource 
private	TokenNameprivate	
IncrementalSAXSource	TokenNameIdentifier	 Incremental SAX Source
m_incrSAXSource	TokenNameIdentifier	 m incr SAX Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// ========= DTM data structure declarations. ============== 	TokenNameCOMMENT_LINE	========= DTM data structure declarations. ============== 
// nodes array: integer array blocks to hold the first level reference of the nodes, 	TokenNameCOMMENT_LINE	nodes array: integer array blocks to hold the first level reference of the nodes, 
// each reference slot is addressed by a nodeHandle index value. 	TokenNameCOMMENT_LINE	each reference slot is addressed by a nodeHandle index value. 
// Assumes indices are not larger than {@link NODEHANDLE_MASK} 	TokenNameCOMMENT_LINE	Assumes indices are not larger than {@link NODEHANDLE_MASK} 
// ({@link DOCHANDLE_SHIFT} bits). 	TokenNameCOMMENT_LINE	({@link DOCHANDLE_SHIFT} bits). 
ChunkedIntArray	TokenNameIdentifier	 Chunked Int Array
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
new	TokenNamenew	
ChunkedIntArray	TokenNameIdentifier	 Chunked Int Array
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// text/comment table: string buffer to hold the text string values of the document, 	TokenNameCOMMENT_LINE	text/comment table: string buffer to hold the text string values of the document, 
// each of which is addressed by the absolute offset and length in the buffer 	TokenNameCOMMENT_LINE	each of which is addressed by the absolute offset and length in the buffer 
private	TokenNameprivate	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
m_char	TokenNameIdentifier	 m char
=	TokenNameEQUAL	
new	TokenNamenew	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Start of string currently being accumulated into m_char; 	TokenNameCOMMENT_LINE	Start of string currently being accumulated into m_char; 
// needed because the string may be appended in several chunks. 	TokenNameCOMMENT_LINE	needed because the string may be appended in several chunks. 
private	TokenNameprivate	
int	TokenNameint	
m_char_current_start	TokenNameIdentifier	 m char current start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// %TBD% INITIALIZATION/STARTUP ISSUES 	TokenNameCOMMENT_LINE	%TBD% INITIALIZATION/STARTUP ISSUES 
// -- Should we really be creating these, or should they be 	TokenNameCOMMENT_LINE	-- Should we really be creating these, or should they be 
// passed in from outside? Scott want to be able to share 	TokenNameCOMMENT_LINE	passed in from outside? Scott want to be able to share 
// pools across multiple documents, so setting them here is 	TokenNameCOMMENT_LINE	pools across multiple documents, so setting them here is 
// probably not the right default. 	TokenNameCOMMENT_LINE	probably not the right default. 
private	TokenNameprivate	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
m_localNames	TokenNameIdentifier	 m local Names
=	TokenNameEQUAL	
new	TokenNamenew	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
m_nsNames	TokenNameIdentifier	 m ns Names
=	TokenNameEQUAL	
new	TokenNamenew	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
m_prefixNames	TokenNameIdentifier	 m prefix Names
=	TokenNameEQUAL	
new	TokenNamenew	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %TBD% If we use the current ExpandedNameTable mapper, it 	TokenNameCOMMENT_LINE	%TBD% If we use the current ExpandedNameTable mapper, it 
// needs to be bound to the NS and local name pools. Which 	TokenNameCOMMENT_LINE	needs to be bound to the NS and local name pools. Which 
// means it needs to attach to them AFTER we've resolved their 	TokenNameCOMMENT_LINE	means it needs to attach to them AFTER we've resolved their 
// startup. Or it needs to attach to this document and 	TokenNameCOMMENT_LINE	startup. Or it needs to attach to this document and 
// retrieve them each time. Or this needs to be 	TokenNameCOMMENT_LINE	retrieve them each time. Or this needs to be 
// an interface _implemented_ by this class... which might be simplest! 	TokenNameCOMMENT_LINE	an interface _implemented_ by this class... which might be simplest! 
private	TokenNameprivate	
ExpandedNameTable	TokenNameIdentifier	 Expanded Name Table
m_expandedNames	TokenNameIdentifier	 m expanded Names
=	TokenNameEQUAL	
new	TokenNamenew	
ExpandedNameTable	TokenNameIdentifier	 Expanded Name Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
m_xsf	TokenNameIdentifier	 m xsf
;	TokenNameSEMICOLON	
/** * Construct a DTM. * * @param documentNumber the ID number assigned to this document. * It will be shifted up into the high bits and returned as part of * all node ID numbers, so those IDs indicate which document they * came from as well as a location within the document. It is the * DTMManager's responsibility to assign a unique number to each * document. */	TokenNameCOMMENT_JAVADOC	 Construct a DTM. * @param documentNumber the ID number assigned to this document. It will be shifted up into the high bits and returned as part of all node ID numbers, so those IDs indicate which document they came from as well as a location within the document. It is the DTMManager's responsibility to assign a unique number to each document. 
public	TokenNamepublic	
DTMDocumentImpl	TokenNameIdentifier	 DTM Document Impl
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
int	TokenNameint	
documentNumber	TokenNameIdentifier	 document Number
,	TokenNameCOMMA	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
xstringfactory	TokenNameIdentifier	 xstringfactory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initDocument	TokenNameIdentifier	 init Document
(	TokenNameLPAREN	
documentNumber	TokenNameIdentifier	 document Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// clear nodes and document handle 	TokenNameCOMMENT_LINE	clear nodes and document handle 
m_xsf	TokenNameIdentifier	 m xsf
=	TokenNameEQUAL	
xstringfactory	TokenNameIdentifier	 xstringfactory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Bind a IncrementalSAXSource to this DTM. If we discover we need nodes * that have not yet been built, we will ask this object to send us more * events, and it will manage interactions with its data sources. * * Note that we do not actually build the IncrementalSAXSource, since we don't * know what source it's reading from, what thread that source will run in, * or when it will run. * * @param source The IncrementalSAXSource that we want to recieve events from * on demand. */	TokenNameCOMMENT_JAVADOC	 Bind a IncrementalSAXSource to this DTM. If we discover we need nodes that have not yet been built, we will ask this object to send us more events, and it will manage interactions with its data sources. * Note that we do not actually build the IncrementalSAXSource, since we don't know what source it's reading from, what thread that source will run in, or when it will run. * @param source The IncrementalSAXSource that we want to recieve events from on demand. 
public	TokenNamepublic	
void	TokenNamevoid	
setIncrementalSAXSource	TokenNameIdentifier	 set Incremental SAX Source
(	TokenNameLPAREN	
IncrementalSAXSource	TokenNameIdentifier	 Incremental SAX Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_incrSAXSource	TokenNameIdentifier	 m incr SAX Source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
// Establish SAX-stream link so we can receive the requested data 	TokenNameCOMMENT_LINE	Establish SAX-stream link so we can receive the requested data 
source	TokenNameIdentifier	 source
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
setLexicalHandler	TokenNameIdentifier	 set Lexical Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Are the following really needed? IncrementalSAXSource doesn't yet 	TokenNameCOMMENT_LINE	Are the following really needed? IncrementalSAXSource doesn't yet 
// support them, and they're mostly no-ops here... 	TokenNameCOMMENT_LINE	support them, and they're mostly no-ops here... 
//source.setErrorHandler(this); 	TokenNameCOMMENT_LINE	source.setErrorHandler(this); 
//source.setDTDHandler(this); 	TokenNameCOMMENT_LINE	source.setDTDHandler(this); 
//source.setDeclHandler(this); 	TokenNameCOMMENT_LINE	source.setDeclHandler(this); 
}	TokenNameRBRACE	
/** * Wrapper for ChunkedIntArray.append, to automatically update the * previous sibling's "next" reference (if necessary) and periodically * wake a reader who may have encountered incomplete data and entered * a wait state. * @param w0 int As in ChunkedIntArray.append * @param w1 int As in ChunkedIntArray.append * @param w2 int As in ChunkedIntArray.append * @param w3 int As in ChunkedIntArray.append * @return int As in ChunkedIntArray.append * @see ChunkedIntArray.append */	TokenNameCOMMENT_JAVADOC	 Wrapper for ChunkedIntArray.append, to automatically update the previous sibling's "next" reference (if necessary) and periodically wake a reader who may have encountered incomplete data and entered a wait state. @param w0 int As in ChunkedIntArray.append @param w1 int As in ChunkedIntArray.append @param w2 int As in ChunkedIntArray.append @param w3 int As in ChunkedIntArray.append @return int As in ChunkedIntArray.append @see ChunkedIntArray.append 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
appendNode	TokenNameIdentifier	 append Node
(	TokenNameLPAREN	
int	TokenNameint	
w0	TokenNameIdentifier	 w0
,	TokenNameCOMMA	
int	TokenNameint	
w1	TokenNameIdentifier	 w1
,	TokenNameCOMMA	
int	TokenNameint	
w2	TokenNameIdentifier	 w2
,	TokenNameCOMMA	
int	TokenNameint	
w3	TokenNameIdentifier	 w3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// A decent compiler may inline this. 	TokenNameCOMMENT_LINE	A decent compiler may inline this. 
int	TokenNameint	
slotnumber	TokenNameIdentifier	 slotnumber
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
appendSlot	TokenNameIdentifier	 append Slot
(	TokenNameLPAREN	
w0	TokenNameIdentifier	 w0
,	TokenNameCOMMA	
w1	TokenNameIdentifier	 w1
,	TokenNameCOMMA	
w2	TokenNameIdentifier	 w2
,	TokenNameCOMMA	
w3	TokenNameIdentifier	 w3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
slotnumber	TokenNameIdentifier	 slotnumber
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
w0	TokenNameIdentifier	 w0
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
w1	TokenNameIdentifier	 w1
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
w2	TokenNameIdentifier	 w2
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
w3	TokenNameIdentifier	 w3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
previousSiblingWasParent	TokenNameIdentifier	 previous Sibling Was Parent
)	TokenNameRPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
writeEntry	TokenNameIdentifier	 write Entry
(	TokenNameLPAREN	
previousSibling	TokenNameIdentifier	 previous Sibling
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
slotnumber	TokenNameIdentifier	 slotnumber
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
previousSiblingWasParent	TokenNameIdentifier	 previous Sibling Was Parent
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Set the default; endElement overrides 	TokenNameCOMMENT_LINE	Set the default; endElement overrides 
return	TokenNamereturn	
slotnumber	TokenNameIdentifier	 slotnumber
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
;	TokenNameSEMICOLON	
/** * Set a reference pointer to the element name symbol table. * %REVIEW% Should this really be Public? Changing it while * DTM is in use would be a disaster. * * @param poolRef DTMStringPool reference to an instance of table. */	TokenNameCOMMENT_JAVADOC	 Set a reference pointer to the element name symbol table. %REVIEW% Should this really be Public? Changing it while DTM is in use would be a disaster. * @param poolRef DTMStringPool reference to an instance of table. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocalNameTable	TokenNameIdentifier	 set Local Name Table
(	TokenNameLPAREN	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
poolRef	TokenNameIdentifier	 pool Ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_localNames	TokenNameIdentifier	 m local Names
=	TokenNameEQUAL	
poolRef	TokenNameIdentifier	 pool Ref
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a reference pointer to the element name symbol table. * * @return DTMStringPool reference to an instance of table. */	TokenNameCOMMENT_JAVADOC	 Get a reference pointer to the element name symbol table. * @return DTMStringPool reference to an instance of table. 
public	TokenNamepublic	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
getLocalNameTable	TokenNameIdentifier	 get Local Name Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_localNames	TokenNameIdentifier	 m local Names
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a reference pointer to the namespace URI symbol table. * %REVIEW% Should this really be Public? Changing it while * DTM is in use would be a disaster. * * @param poolRef DTMStringPool reference to an instance of table. */	TokenNameCOMMENT_JAVADOC	 Set a reference pointer to the namespace URI symbol table. %REVIEW% Should this really be Public? Changing it while DTM is in use would be a disaster. * @param poolRef DTMStringPool reference to an instance of table. 
public	TokenNamepublic	
void	TokenNamevoid	
setNsNameTable	TokenNameIdentifier	 set Ns Name Table
(	TokenNameLPAREN	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
poolRef	TokenNameIdentifier	 pool Ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_nsNames	TokenNameIdentifier	 m ns Names
=	TokenNameEQUAL	
poolRef	TokenNameIdentifier	 pool Ref
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a reference pointer to the namespace URI symbol table. * * @return DTMStringPool reference to an instance of table. */	TokenNameCOMMENT_JAVADOC	 Get a reference pointer to the namespace URI symbol table. * @return DTMStringPool reference to an instance of table. 
public	TokenNamepublic	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
getNsNameTable	TokenNameIdentifier	 get Ns Name Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_nsNames	TokenNameIdentifier	 m ns Names
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a reference pointer to the prefix name symbol table. * %REVIEW% Should this really be Public? Changing it while * DTM is in use would be a disaster. * * @param poolRef DTMStringPool reference to an instance of table. */	TokenNameCOMMENT_JAVADOC	 Set a reference pointer to the prefix name symbol table. %REVIEW% Should this really be Public? Changing it while DTM is in use would be a disaster. * @param poolRef DTMStringPool reference to an instance of table. 
public	TokenNamepublic	
void	TokenNamevoid	
setPrefixNameTable	TokenNameIdentifier	 set Prefix Name Table
(	TokenNameLPAREN	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
poolRef	TokenNameIdentifier	 pool Ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prefixNames	TokenNameIdentifier	 m prefix Names
=	TokenNameEQUAL	
poolRef	TokenNameIdentifier	 pool Ref
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a reference pointer to the prefix name symbol table. * * @return DTMStringPool reference to an instance of table. */	TokenNameCOMMENT_JAVADOC	 Get a reference pointer to the prefix name symbol table. * @return DTMStringPool reference to an instance of table. 
public	TokenNamepublic	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
getPrefixNameTable	TokenNameIdentifier	 get Prefix Name Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_prefixNames	TokenNameIdentifier	 m prefix Names
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a reference pointer to the content-text repository * * @param buffer FastStringBuffer reference to an instance of * buffer */	TokenNameCOMMENT_JAVADOC	 Set a reference pointer to the content-text repository * @param buffer FastStringBuffer reference to an instance of buffer 
void	TokenNamevoid	
setContentBuffer	TokenNameIdentifier	 set Content Buffer
(	TokenNameLPAREN	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_char	TokenNameIdentifier	 m char
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a reference pointer to the content-text repository * * @return FastStringBuffer reference to an instance of buffer */	TokenNameCOMMENT_JAVADOC	 Get a reference pointer to the content-text repository * @return FastStringBuffer reference to an instance of buffer 
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
getContentBuffer	TokenNameIdentifier	 get Content Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_char	TokenNameIdentifier	 m char
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** getContentHandler returns "our SAX builder" -- the thing that * someone else should send SAX events to in order to extend this * DTM model. * * @return null if this model doesn't respond to SAX events, * "this" if the DTM object has a built-in SAX ContentHandler, * the IncrementalSAXSource if we're bound to one and should receive * the SAX stream via it for incremental build purposes... * */	TokenNameCOMMENT_JAVADOC	 getContentHandler returns "our SAX builder" -- the thing that someone else should send SAX events to in order to extend this DTM model. * @return null if this model doesn't respond to SAX events, "this" if the DTM object has a built-in SAX ContentHandler, the IncrementalSAXSource if we're bound to one and should receive the SAX stream via it for incremental build purposes... 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
getContentHandler	TokenNameIdentifier	 get Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_incrSAXSource	TokenNameIdentifier	 m incr SAX Source
instanceof	TokenNameinstanceof	
IncrementalSAXSource_Filter	TokenNameIdentifier	 Incremental SAX Source  Filter
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
)	TokenNameRPAREN	
m_incrSAXSource	TokenNameIdentifier	 m incr SAX Source
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return this DTM's lexical handler. * * %REVIEW% Should this return null if constrution already done/begun? * * @return null if this model doesn't respond to lexical SAX events, * "this" if the DTM object has a built-in SAX ContentHandler, * the IncrementalSAXSource if we're bound to one and should receive * the SAX stream via it for incremental build purposes... */	TokenNameCOMMENT_JAVADOC	 Return this DTM's lexical handler. * %REVIEW% Should this return null if constrution already done/begun? * @return null if this model doesn't respond to lexical SAX events, "this" if the DTM object has a built-in SAX ContentHandler, the IncrementalSAXSource if we're bound to one and should receive the SAX stream via it for incremental build purposes... 
public	TokenNamepublic	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
getLexicalHandler	TokenNameIdentifier	 get Lexical Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_incrSAXSource	TokenNameIdentifier	 m incr SAX Source
instanceof	TokenNameinstanceof	
IncrementalSAXSource_Filter	TokenNameIdentifier	 Incremental SAX Source  Filter
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
m_incrSAXSource	TokenNameIdentifier	 m incr SAX Source
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return this DTM's EntityResolver. * * @return null if this model doesn't respond to SAX entity ref events. */	TokenNameCOMMENT_JAVADOC	 Return this DTM's EntityResolver. * @return null if this model doesn't respond to SAX entity ref events. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
EntityResolver	TokenNameIdentifier	 Entity Resolver
getEntityResolver	TokenNameIdentifier	 get Entity Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return this DTM's DTDHandler. * * @return null if this model doesn't respond to SAX dtd events. */	TokenNameCOMMENT_JAVADOC	 Return this DTM's DTDHandler. * @return null if this model doesn't respond to SAX dtd events. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
DTDHandler	TokenNameIdentifier	 DTD Handler
getDTDHandler	TokenNameIdentifier	 get DTD Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return this DTM's ErrorHandler. * * @return null if this model doesn't respond to SAX error events. */	TokenNameCOMMENT_JAVADOC	 Return this DTM's ErrorHandler. * @return null if this model doesn't respond to SAX error events. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ErrorHandler	TokenNameIdentifier	 Error Handler
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return this DTM's DeclHandler. * * @return null if this model doesn't respond to SAX Decl events. */	TokenNameCOMMENT_JAVADOC	 Return this DTM's DeclHandler. * @return null if this model doesn't respond to SAX Decl events. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
DeclHandler	TokenNameIdentifier	 Decl Handler
getDeclHandler	TokenNameIdentifier	 get Decl Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return true iff we're building this model incrementally (eg * we're partnered with a IncrementalSAXSource) and thus require that the * transformation and the parse run simultaneously. Guidance to the * DTMManager. * */	TokenNameCOMMENT_JAVADOC	 @return true iff we're building this model incrementally (eg we're partnered with a IncrementalSAXSource) and thus require that the transformation and the parse run simultaneously. Guidance to the DTMManager. 
public	TokenNamepublic	
boolean	TokenNameboolean	
needsTwoThreads	TokenNameIdentifier	 needs Two Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_incrSAXSource	TokenNameIdentifier	 m incr SAX Source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
// ========= SAX2 ContentHandler methods ========= 	TokenNameCOMMENT_LINE	========= SAX2 ContentHandler methods ========= 
// Accept SAX events, use them to build/extend the DTM tree. 	TokenNameCOMMENT_LINE	Accept SAX events, use them to build/extend the DTM tree. 
// Replaces the deprecated DocumentHandler interface. 	TokenNameCOMMENT_LINE	Replaces the deprecated DocumentHandler interface. 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
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
// Actually creating the text node is handled by 	TokenNameCOMMENT_LINE	Actually creating the text node is handled by 
// processAccumulatedText(); here we just accumulate the 	TokenNameCOMMENT_LINE	processAccumulatedText(); here we just accumulate the 
// characters into the buffer. 	TokenNameCOMMENT_LINE	characters into the buffer. 
m_char	TokenNameIdentifier	 m char
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Flush string accumulation into a text node 	TokenNameCOMMENT_LINE	Flush string accumulation into a text node 
private	TokenNameprivate	
void	TokenNamevoid	
processAccumulatedText	TokenNameIdentifier	 process Accumulated Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
m_char	TokenNameIdentifier	 m char
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
!=	TokenNameNOT_EQUAL	
m_char_current_start	TokenNameIdentifier	 m char current start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The FastStringBuffer has been previously agreed upon 	TokenNameCOMMENT_LINE	The FastStringBuffer has been previously agreed upon 
appendTextChild	TokenNameIdentifier	 append Text Child
(	TokenNameLPAREN	
m_char_current_start	TokenNameIdentifier	 m char current start
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
m_char_current_start	TokenNameIdentifier	 m char current start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_char_current_start	TokenNameIdentifier	 m char current start
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
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
// May need to tell the low-level builder code to pop up a level. 	TokenNameCOMMENT_LINE	May need to tell the low-level builder code to pop up a level. 
// There _should't_ be any significant pending text at this point. 	TokenNameCOMMENT_LINE	There _should't_ be any significant pending text at this point. 
appendEndDocument	TokenNameIdentifier	 append End Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
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
processAccumulatedText	TokenNameIdentifier	 process Accumulated Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// No args but we do need to tell the low-level builder code to 	TokenNameCOMMENT_LINE	No args but we do need to tell the low-level builder code to 
// pop up a level. 	TokenNameCOMMENT_LINE	pop up a level. 
appendEndElement	TokenNameIdentifier	 append End Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
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
// No-op 	TokenNameCOMMENT_LINE	No-op 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
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
// %TBD% I believe ignorable text isn't part of the DTM model...? 	TokenNameCOMMENT_LINE	%TBD% I believe ignorable text isn't part of the DTM model...? 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
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
processAccumulatedText	TokenNameIdentifier	 process Accumulated Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %TBD% Which pools do target and data go into? 	TokenNameCOMMENT_LINE	%TBD% Which pools do target and data go into? 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No-op for DTM 	TokenNameCOMMENT_LINE	No-op for DTM 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
processAccumulatedText	TokenNameIdentifier	 process Accumulated Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//%TBD% 	TokenNameCOMMENT_LINE	%TBD% 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
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
appendStartDocument	TokenNameIdentifier	 append Start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
atts	TokenNameIdentifier	 atts
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
processAccumulatedText	TokenNameIdentifier	 process Accumulated Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %TBD% Split prefix off qname 	TokenNameCOMMENT_LINE	%TBD% Split prefix off qname 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
colon	TokenNameIdentifier	 colon
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colon	TokenNameIdentifier	 colon
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
colon	TokenNameIdentifier	 colon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %TBD% Where do we pool expandedName, or is it just the union, or... 	TokenNameCOMMENT_LINE	%TBD% Where do we pool expandedName, or is it just the union, or... 
/**/	TokenNameCOMMENT_BLOCK	 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Prefix="	TokenNameStringLiteral	Prefix=
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
" index="	TokenNameStringLiteral	 index=
+	TokenNamePLUS	
m_prefixNames	TokenNameIdentifier	 m prefix Names
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendStartElement	TokenNameIdentifier	 append Start Element
(	TokenNameLPAREN	
m_nsNames	TokenNameIdentifier	 m ns Names
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_localNames	TokenNameIdentifier	 m local Names
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_prefixNames	TokenNameIdentifier	 m prefix Names
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/////// %TBD% 	TokenNameCOMMENT_LINE	///// %TBD% 
// %TBD% I'm assuming that DTM will require resequencing of 	TokenNameCOMMENT_LINE	%TBD% I'm assuming that DTM will require resequencing of 
// NS decls before other attrs, hence two passes are taken. 	TokenNameCOMMENT_LINE	NS decls before other attrs, hence two passes are taken. 
// %TBD% Is there an easier way to test for NSDecl? 	TokenNameCOMMENT_LINE	%TBD% Is there an easier way to test for NSDecl? 
int	TokenNameint	
nAtts	TokenNameIdentifier	 n Atts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %TBD% Countdown is more efficient if nobody cares about sequence. 	TokenNameCOMMENT_LINE	%TBD% Countdown is more efficient if nobody cares about sequence. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
nAtts	TokenNameIdentifier	 n Atts
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
qName	TokenNameIdentifier	 q Name
=	TokenNameEQUAL	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"xmlns"	TokenNameStringLiteral	xmlns
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
colon	TokenNameIdentifier	 colon
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colon	TokenNameIdentifier	 colon
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
colon	TokenNameIdentifier	 colon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// %REVEIW% Null or ""? 	TokenNameCOMMENT_LINE	%REVEIW% Null or ""? 
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Default prefix 	TokenNameCOMMENT_LINE	Default prefix 
}	TokenNameRBRACE	
appendNSDeclaration	TokenNameIdentifier	 append NS Declaration
(	TokenNameLPAREN	
m_prefixNames	TokenNameIdentifier	 m prefix Names
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_nsNames	TokenNameIdentifier	 m ns Names
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"ID"	TokenNameStringLiteral	ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
nAtts	TokenNameIdentifier	 n Atts
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
qName	TokenNameIdentifier	 q Name
=	TokenNameEQUAL	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"xmlns"	TokenNameStringLiteral	xmlns
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %TBD% I hate having to extract the prefix into a new 	TokenNameCOMMENT_LINE	%TBD% I hate having to extract the prefix into a new 
// string when we may never use it. Consider pooling whole 	TokenNameCOMMENT_LINE	string when we may never use it. Consider pooling whole 
// qNames, which are already strings? 	TokenNameCOMMENT_LINE	qNames, which are already strings? 
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
colon	TokenNameIdentifier	 colon
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colon	TokenNameIdentifier	 colon
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
colon	TokenNameIdentifier	 colon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
colon	TokenNameIdentifier	 colon
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// Default prefix 	TokenNameCOMMENT_LINE	Default prefix 
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_char	TokenNameIdentifier	 m char
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Single-string value 	TokenNameCOMMENT_LINE	Single-string value 
int	TokenNameint	
contentEnd	TokenNameIdentifier	 content End
=	TokenNameEQUAL	
m_char	TokenNameIdentifier	 m char
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"xmlns"	TokenNameStringLiteral	xmlns
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
appendAttribute	TokenNameIdentifier	 append Attribute
(	TokenNameLPAREN	
m_nsNames	TokenNameIdentifier	 m ns Names
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_localNames	TokenNameIdentifier	 m local Names
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_prefixNames	TokenNameIdentifier	 m prefix Names
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"ID"	TokenNameStringLiteral	ID
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_char_current_start	TokenNameIdentifier	 m char current start
,	TokenNameCOMMA	
contentEnd	TokenNameIdentifier	 content End
-	TokenNameMINUS	
m_char_current_start	TokenNameIdentifier	 m char current start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_char_current_start	TokenNameIdentifier	 m char current start
=	TokenNameEQUAL	
contentEnd	TokenNameIdentifier	 content End
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
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
// No-op in DTM, handled during element/attr processing? 	TokenNameCOMMENT_LINE	No-op in DTM, handled during element/attr processing? 
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// LexicalHandler support. Not all SAX2 parsers support these events 	TokenNameCOMMENT_LINE	LexicalHandler support. Not all SAX2 parsers support these events 
// but we may want to pass them through when they exist... 	TokenNameCOMMENT_LINE	but we may want to pass them through when they exist... 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
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
processAccumulatedText	TokenNameIdentifier	 process Accumulated Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_char	TokenNameIdentifier	 m char
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Single-string value 	TokenNameCOMMENT_LINE	Single-string value 
appendComment	TokenNameIdentifier	 append Comment
(	TokenNameLPAREN	
m_char_current_start	TokenNameIdentifier	 m char current start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_char_current_start	TokenNameIdentifier	 m char current start
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
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
// No-op in DTM 	TokenNameCOMMENT_LINE	No-op in DTM 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
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
// No-op in DTM 	TokenNameCOMMENT_LINE	No-op in DTM 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
// No-op in DTM 	TokenNameCOMMENT_LINE	No-op in DTM 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
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
// No-op in DTM 	TokenNameCOMMENT_LINE	No-op in DTM 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
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
// No-op in DTM 	TokenNameCOMMENT_LINE	No-op in DTM 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
// No-op in DTM 	TokenNameCOMMENT_LINE	No-op in DTM 
}	TokenNameRBRACE	
//================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
// ========= Document Handler Functions ========= 	TokenNameCOMMENT_LINE	========= Document Handler Functions ========= 
// %REVIEW% jjk -- DocumentHandler is SAX Level 1, and deprecated.... 	TokenNameCOMMENT_LINE	%REVIEW% jjk -- DocumentHandler is SAX Level 1, and deprecated.... 
// and this wasn't a fully compliant or declared implementation of that API 	TokenNameCOMMENT_LINE	and this wasn't a fully compliant or declared implementation of that API 
// in any case. Phase out in favor of SAX2 ContentHandler/LexicalHandler 	TokenNameCOMMENT_LINE	in any case. Phase out in favor of SAX2 ContentHandler/LexicalHandler 
/** * Reset a dtm document to its initial (empty) state. * * The DTMManager will invoke this method when the dtm is created. * * @param documentNumber the handle for the DTM document. */	TokenNameCOMMENT_JAVADOC	 Reset a dtm document to its initial (empty) state. * The DTMManager will invoke this method when the dtm is created. * @param documentNumber the handle for the DTM document. 
final	TokenNamefinal	
void	TokenNamevoid	
initDocument	TokenNameIdentifier	 init Document
(	TokenNameLPAREN	
int	TokenNameint	
documentNumber	TokenNameIdentifier	 document Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// save masked DTM document handle 	TokenNameCOMMENT_LINE	save masked DTM document handle 
m_docHandle	TokenNameIdentifier	 m doc Handle
=	TokenNameEQUAL	
documentNumber	TokenNameIdentifier	 document Number
<<	TokenNameLEFT_SHIFT	
DOCHANDLE_SHIFT	TokenNameIdentifier	 DOCHANDLE  SHIFT
;	TokenNameSEMICOLON	
// Initialize the doc -- no parent, no next-sib 	TokenNameCOMMENT_LINE	Initialize the doc -- no parent, no next-sib 
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
writeSlot	TokenNameIdentifier	 write Slot
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// wait for the first startElement to create the doc root node 	TokenNameCOMMENT_LINE	wait for the first startElement to create the doc root node 
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Receive hint of the end of a document. 	TokenNameCOMMENT_LINE	* Receive hint of the end of a document. 
// * 	TokenNameCOMMENT_LINE	* 
// * <p>The content handler will invoke this method only once, and it will 	TokenNameCOMMENT_LINE	* <p>The content handler will invoke this method only once, and it will 
// * be the last method invoked during the parse. The handler shall not 	TokenNameCOMMENT_LINE	* be the last method invoked during the parse. The handler shall not 
// * not invoke this method until it has either abandoned parsing 	TokenNameCOMMENT_LINE	* not invoke this method until it has either abandoned parsing 
// * (because of an unrecoverable error) or reached the end of 	TokenNameCOMMENT_LINE	* (because of an unrecoverable error) or reached the end of 
// * input.</p> 	TokenNameCOMMENT_LINE	* input.</p> 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public void documentEnd() 	TokenNameCOMMENT_LINE	public void documentEnd() 
// { 	TokenNameCOMMENT_LINE	{ 
// done = true; 	TokenNameCOMMENT_LINE	done = true; 
// // %TBD% may need to notice the last slot number and slot count to avoid 	TokenNameCOMMENT_LINE	// %TBD% may need to notice the last slot number and slot count to avoid 
// // residual data from provious use of this DTM 	TokenNameCOMMENT_LINE	// residual data from provious use of this DTM 
// } 	TokenNameCOMMENT_LINE	} 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Receive notification of the beginning of a document. 	TokenNameCOMMENT_LINE	* Receive notification of the beginning of a document. 
// * 	TokenNameCOMMENT_LINE	* 
// * <p>The SAX parser will invoke this method only once, before any 	TokenNameCOMMENT_LINE	* <p>The SAX parser will invoke this method only once, before any 
// * other methods in this interface.</p> 	TokenNameCOMMENT_LINE	* other methods in this interface.</p> 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public void reset() 	TokenNameCOMMENT_LINE	public void reset() 
// { 	TokenNameCOMMENT_LINE	{ 
// // %TBD% reset slot 0 to indicate ChunkedIntArray reuse or wait for 	TokenNameCOMMENT_LINE	// %TBD% reset slot 0 to indicate ChunkedIntArray reuse or wait for 
// // the next initDocument(). 	TokenNameCOMMENT_LINE	// the next initDocument(). 
// m_docElement = NULL; // reset nodeHandle to the root of the actual dtm doc content 	TokenNameCOMMENT_LINE	m_docElement = NULL; // reset nodeHandle to the root of the actual dtm doc content 
// initDocument(0); 	TokenNameCOMMENT_LINE	initDocument(0); 
// } 	TokenNameCOMMENT_LINE	} 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Factory method; creates an Element node in this document. 	TokenNameCOMMENT_LINE	* Factory method; creates an Element node in this document. 
// * 	TokenNameCOMMENT_LINE	* 
// * The node created will be chained according to its natural order of request 	TokenNameCOMMENT_LINE	* The node created will be chained according to its natural order of request 
// * received. %TBD% It can be rechained later via the optional DTM writable interface. 	TokenNameCOMMENT_LINE	* received. %TBD% It can be rechained later via the optional DTM writable interface. 
// * 	TokenNameCOMMENT_LINE	* 
// * <p>The XML content handler will invoke endElement() method after all 	TokenNameCOMMENT_LINE	* <p>The XML content handler will invoke endElement() method after all 
// * of the element's content are processed in order to give DTM the indication 	TokenNameCOMMENT_LINE	* of the element's content are processed in order to give DTM the indication 
// * to prepare and patch up parent and sibling node pointers.</p> 	TokenNameCOMMENT_LINE	* to prepare and patch up parent and sibling node pointers.</p> 
// * 	TokenNameCOMMENT_LINE	* 
// * <p>The following interface for createElement will use an index value corresponds 	TokenNameCOMMENT_LINE	* <p>The following interface for createElement will use an index value corresponds 
// * to the symbol entry in the DTMDStringPool based symbol tables.</p> 	TokenNameCOMMENT_LINE	* to the symbol entry in the DTMDStringPool based symbol tables.</p> 
// * 	TokenNameCOMMENT_LINE	* 
// * @param nsIndex The namespace of the node 	TokenNameCOMMENT_LINE	* @param nsIndex The namespace of the node 
// * @param nameIndex The element name. 	TokenNameCOMMENT_LINE	* @param nameIndex The element name. 
// * @see #endElement 	TokenNameCOMMENT_LINE	* @see #endElement 
// * @see org.xml.sax.Attributes 	TokenNameCOMMENT_LINE	* @see org.xml.sax.Attributes 
// * @return nodeHandle int of the element created 	TokenNameCOMMENT_LINE	* @return nodeHandle int of the element created 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public int createElement(int nsIndex, int nameIndex, Attributes atts) 	TokenNameCOMMENT_LINE	public int createElement(int nsIndex, int nameIndex, Attributes atts) 
// { 	TokenNameCOMMENT_LINE	{ 
// // do document root node creation here on the first element, create nodes for 	TokenNameCOMMENT_LINE	// do document root node creation here on the first element, create nodes for 
// // this element and its attributes, store the element, namespace, and attritute 	TokenNameCOMMENT_LINE	// this element and its attributes, store the element, namespace, and attritute 
// // name indexes to the nodes array, keep track of the current node and parent 	TokenNameCOMMENT_LINE	// name indexes to the nodes array, keep track of the current node and parent 
// // element used 	TokenNameCOMMENT_LINE	// element used 
// // W0 High: Namespace Low: Node Type 	TokenNameCOMMENT_LINE	// W0 High: Namespace Low: Node Type 
// int w0 = (nsIndex << 16) | ELEMENT_NODE; 	TokenNameCOMMENT_LINE	int w0 = (nsIndex << 16) | ELEMENT_NODE; 
// // W1: Parent 	TokenNameCOMMENT_LINE	// W1: Parent 
// int w1 = currentParent; 	TokenNameCOMMENT_LINE	int w1 = currentParent; 
// // W2: Next (initialized as 0) 	TokenNameCOMMENT_LINE	// W2: Next (initialized as 0) 
// int w2 = 0; 	TokenNameCOMMENT_LINE	int w2 = 0; 
// // W3: Tagname 	TokenNameCOMMENT_LINE	// W3: Tagname 
// int w3 = nameIndex; 	TokenNameCOMMENT_LINE	int w3 = nameIndex; 
// //int ourslot = nodes.appendSlot(w0, w1, w2, w3); 	TokenNameCOMMENT_LINE	//int ourslot = nodes.appendSlot(w0, w1, w2, w3); 
// int ourslot = appendNode(w0, w1, w2, w3); 	TokenNameCOMMENT_LINE	int ourslot = appendNode(w0, w1, w2, w3); 
// currentParent = ourslot; 	TokenNameCOMMENT_LINE	currentParent = ourslot; 
// previousSibling = 0; 	TokenNameCOMMENT_LINE	previousSibling = 0; 
// setAttributes(atts); 	TokenNameCOMMENT_LINE	setAttributes(atts); 
// // set the root element pointer when creating the first element node 	TokenNameCOMMENT_LINE	// set the root element pointer when creating the first element node 
// if (m_docElement == NULL) 	TokenNameCOMMENT_LINE	if (m_docElement == NULL) 
// m_docElement = ourslot; 	TokenNameCOMMENT_LINE	m_docElement = ourslot; 
// return (m_docHandle | ourslot); 	TokenNameCOMMENT_LINE	return (m_docHandle | ourslot); 
// } 	TokenNameCOMMENT_LINE	} 
// // Factory method to create an Element node not associated with a given name space 	TokenNameCOMMENT_LINE	// Factory method to create an Element node not associated with a given name space 
// // using String value parameters passed in from a content handler or application 	TokenNameCOMMENT_LINE	// using String value parameters passed in from a content handler or application 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Factory method; creates an Element node not associated with a given name space in this document. 	TokenNameCOMMENT_LINE	* Factory method; creates an Element node not associated with a given name space in this document. 
// * 	TokenNameCOMMENT_LINE	* 
// * The node created will be chained according to its natural order of request 	TokenNameCOMMENT_LINE	* The node created will be chained according to its natural order of request 
// * received. %TBD% It can be rechained later via the optional DTM writable interface. 	TokenNameCOMMENT_LINE	* received. %TBD% It can be rechained later via the optional DTM writable interface. 
// * 	TokenNameCOMMENT_LINE	* 
// * <p>The XML content handler or application will invoke endElement() method after all 	TokenNameCOMMENT_LINE	* <p>The XML content handler or application will invoke endElement() method after all 
// * of the element's content are processed in order to give DTM the indication 	TokenNameCOMMENT_LINE	* of the element's content are processed in order to give DTM the indication 
// * to prepare and patch up parent and sibling node pointers.</p> 	TokenNameCOMMENT_LINE	* to prepare and patch up parent and sibling node pointers.</p> 
// * 	TokenNameCOMMENT_LINE	* 
// * <p>The following parameters for createElement contains raw string values for name 	TokenNameCOMMENT_LINE	* <p>The following parameters for createElement contains raw string values for name 
// * symbols used in an Element node.</p> 	TokenNameCOMMENT_LINE	* symbols used in an Element node.</p> 
// * 	TokenNameCOMMENT_LINE	* 
// * @param name String the element name, including the prefix if any. 	TokenNameCOMMENT_LINE	* @param name String the element name, including the prefix if any. 
// * @param atts The attributes attached to the element, if any. 	TokenNameCOMMENT_LINE	* @param atts The attributes attached to the element, if any. 
// * @see #endElement 	TokenNameCOMMENT_LINE	* @see #endElement 
// * @see org.xml.sax.Attributes 	TokenNameCOMMENT_LINE	* @see org.xml.sax.Attributes 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public int createElement(String name, Attributes atts) 	TokenNameCOMMENT_LINE	public int createElement(String name, Attributes atts) 
// { 	TokenNameCOMMENT_LINE	{ 
// // This method wraps around the index valued interface of the createElement interface. 	TokenNameCOMMENT_LINE	// This method wraps around the index valued interface of the createElement interface. 
// // The raw string values are stored into the current DTM name symbol tables. The method 	TokenNameCOMMENT_LINE	// The raw string values are stored into the current DTM name symbol tables. The method 
// // method will then use the index values returned to invoke the other createElement() 	TokenNameCOMMENT_LINE	// method will then use the index values returned to invoke the other createElement() 
// // onverted to index values modified to match a 	TokenNameCOMMENT_LINE	// onverted to index values modified to match a 
// // method. 	TokenNameCOMMENT_LINE	// method. 
// int nsIndex = NULL; 	TokenNameCOMMENT_LINE	int nsIndex = NULL; 
// int nameIndex = m_localNames.stringToIndex(name); 	TokenNameCOMMENT_LINE	int nameIndex = m_localNames.stringToIndex(name); 
// // note - there should be no prefix separator in the name because it is not associated 	TokenNameCOMMENT_LINE	// note - there should be no prefix separator in the name because it is not associated 
// // with a name space 	TokenNameCOMMENT_LINE	// with a name space 
// return createElement(nsIndex, nameIndex, atts); 	TokenNameCOMMENT_LINE	return createElement(nsIndex, nameIndex, atts); 
// } 	TokenNameCOMMENT_LINE	} 
// // Factory method to create an Element node associated with a given name space 	TokenNameCOMMENT_LINE	// Factory method to create an Element node associated with a given name space 
// // using String value parameters passed in from a content handler or application 	TokenNameCOMMENT_LINE	// using String value parameters passed in from a content handler or application 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Factory method; creates an Element node associated with a given name space in this document. 	TokenNameCOMMENT_LINE	* Factory method; creates an Element node associated with a given name space in this document. 
// * 	TokenNameCOMMENT_LINE	* 
// * The node created will be chained according to its natural order of request 	TokenNameCOMMENT_LINE	* The node created will be chained according to its natural order of request 
// * received. %TBD% It can be rechained later via the optional DTM writable interface. 	TokenNameCOMMENT_LINE	* received. %TBD% It can be rechained later via the optional DTM writable interface. 
// * 	TokenNameCOMMENT_LINE	* 
// * <p>The XML content handler or application will invoke endElement() method after all 	TokenNameCOMMENT_LINE	* <p>The XML content handler or application will invoke endElement() method after all 
// * of the element's content are processed in order to give DTM the indication 	TokenNameCOMMENT_LINE	* of the element's content are processed in order to give DTM the indication 
// * to prepare and patch up parent and sibling node pointers.</p> 	TokenNameCOMMENT_LINE	* to prepare and patch up parent and sibling node pointers.</p> 
// * 	TokenNameCOMMENT_LINE	* 
// * <p>The following parameters for createElementNS contains raw string values for name 	TokenNameCOMMENT_LINE	* <p>The following parameters for createElementNS contains raw string values for name 
// * symbols used in an Element node.</p> 	TokenNameCOMMENT_LINE	* symbols used in an Element node.</p> 
// * 	TokenNameCOMMENT_LINE	* 
// * @param ns String the namespace of the node 	TokenNameCOMMENT_LINE	* @param ns String the namespace of the node 
// * @param name String the element name, including the prefix if any. 	TokenNameCOMMENT_LINE	* @param name String the element name, including the prefix if any. 
// * @param atts The attributes attached to the element, if any. 	TokenNameCOMMENT_LINE	* @param atts The attributes attached to the element, if any. 
// * @see #endElement 	TokenNameCOMMENT_LINE	* @see #endElement 
// * @see org.xml.sax.Attributes 	TokenNameCOMMENT_LINE	* @see org.xml.sax.Attributes 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public int createElementNS(String ns, String name, Attributes atts) 	TokenNameCOMMENT_LINE	public int createElementNS(String ns, String name, Attributes atts) 
// { 	TokenNameCOMMENT_LINE	{ 
// // This method wraps around the index valued interface of the createElement interface. 	TokenNameCOMMENT_LINE	// This method wraps around the index valued interface of the createElement interface. 
// // The raw string values are stored into the current DTM name symbol tables. The method 	TokenNameCOMMENT_LINE	// The raw string values are stored into the current DTM name symbol tables. The method 
// // method will then use the index values returned to invoke the other createElement() 	TokenNameCOMMENT_LINE	// method will then use the index values returned to invoke the other createElement() 
// // onverted to index values modified to match a 	TokenNameCOMMENT_LINE	// onverted to index values modified to match a 
// // method. 	TokenNameCOMMENT_LINE	// method. 
// int nsIndex = m_nsNames.stringToIndex(ns); 	TokenNameCOMMENT_LINE	int nsIndex = m_nsNames.stringToIndex(ns); 
// int nameIndex = m_localNames.stringToIndex(name); 	TokenNameCOMMENT_LINE	int nameIndex = m_localNames.stringToIndex(name); 
// // The prefixIndex is not needed by the indexed interface of the createElement method 	TokenNameCOMMENT_LINE	// The prefixIndex is not needed by the indexed interface of the createElement method 
// int prefixSep = name.indexOf(":"); 	TokenNameCOMMENT_LINE	int prefixSep = name.indexOf(":"); 
// int prefixIndex = m_prefixNames.stringToIndex(name.substring(0, prefixSep)); 	TokenNameCOMMENT_LINE	int prefixIndex = m_prefixNames.stringToIndex(name.substring(0, prefixSep)); 
// return createElement(nsIndex, nameIndex, atts); 	TokenNameCOMMENT_LINE	return createElement(nsIndex, nameIndex, atts); 
// } 	TokenNameCOMMENT_LINE	} 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Receive an indication for the end of an element. 	TokenNameCOMMENT_LINE	* Receive an indication for the end of an element. 
// * 	TokenNameCOMMENT_LINE	* 
// * <p>The XML content handler will invoke this method at the end of every 	TokenNameCOMMENT_LINE	* <p>The XML content handler will invoke this method at the end of every 
// * element in the XML document to give hint its time to pop up the current 	TokenNameCOMMENT_LINE	* element in the XML document to give hint its time to pop up the current 
// * element and parent and patch up parent and sibling pointers if necessary 	TokenNameCOMMENT_LINE	* element and parent and patch up parent and sibling pointers if necessary 
// * 	TokenNameCOMMENT_LINE	* 
// * <p>%tbd% The following interface may need to be modified to match a 	TokenNameCOMMENT_LINE	* <p>%tbd% The following interface may need to be modified to match a 
// * coordinated access to the DTMDStringPool based symbol tables.</p> 	TokenNameCOMMENT_LINE	* coordinated access to the DTMDStringPool based symbol tables.</p> 
// * 	TokenNameCOMMENT_LINE	* 
// * @param ns the namespace of the element 	TokenNameCOMMENT_LINE	* @param ns the namespace of the element 
// * @param name The element name 	TokenNameCOMMENT_LINE	* @param name The element name 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public void endElement(String ns, String name) 	TokenNameCOMMENT_LINE	public void endElement(String ns, String name) 
// { 	TokenNameCOMMENT_LINE	{ 
// // pop up the stacks 	TokenNameCOMMENT_LINE	// pop up the stacks 
// // 	TokenNameCOMMENT_LINE	// 
// if (previousSiblingWasParent) 	TokenNameCOMMENT_LINE	if (previousSiblingWasParent) 
// nodes.writeEntry(previousSibling, 2, NULL); 	TokenNameCOMMENT_LINE	nodes.writeEntry(previousSibling, 2, NULL); 
// // Pop parentage 	TokenNameCOMMENT_LINE	// Pop parentage 
// previousSibling = currentParent; 	TokenNameCOMMENT_LINE	previousSibling = currentParent; 
// nodes.readSlot(currentParent, gotslot); 	TokenNameCOMMENT_LINE	nodes.readSlot(currentParent, gotslot); 
// currentParent = gotslot[1] & 0xFFFF; 	TokenNameCOMMENT_LINE	currentParent = gotslot[1] & 0xFFFF; 
// // The element just being finished will be 	TokenNameCOMMENT_LINE	// The element just being finished will be 
// // the previous sibling for the next operation 	TokenNameCOMMENT_LINE	// the previous sibling for the next operation 
// previousSiblingWasParent = true; 	TokenNameCOMMENT_LINE	previousSiblingWasParent = true; 
// // Pop a level of namespace table 	TokenNameCOMMENT_LINE	// Pop a level of namespace table 
// // namespaceTable.removeLastElem(); 	TokenNameCOMMENT_LINE	// namespaceTable.removeLastElem(); 
// } 	TokenNameCOMMENT_LINE	} 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Creates attributes for the current node. 	TokenNameCOMMENT_LINE	* Creates attributes for the current node. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param atts Attributes to be created. 	TokenNameCOMMENT_LINE	* @param atts Attributes to be created. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// void setAttributes(Attributes atts) { 	TokenNameCOMMENT_LINE	void setAttributes(Attributes atts) { 
// int atLength = (null == atts) ? 0 : atts.getLength(); 	TokenNameCOMMENT_LINE	int atLength = (null == atts) ? 0 : atts.getLength(); 
// for (int i=0; i < atLength; i++) { 	TokenNameCOMMENT_LINE	for (int i=0; i < atLength; i++) { 
// String qname = atts.getQName(i); 	TokenNameCOMMENT_LINE	String qname = atts.getQName(i); 
// createAttribute(atts.getQName(i), atts.getValue(i)); 	TokenNameCOMMENT_LINE	createAttribute(atts.getQName(i), atts.getValue(i)); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Appends an attribute to the document. 	TokenNameCOMMENT_LINE	* Appends an attribute to the document. 
// * @param qname Qualified Name of the attribute 	TokenNameCOMMENT_LINE	* @param qname Qualified Name of the attribute 
// * @param value Value of the attribute 	TokenNameCOMMENT_LINE	* @param value Value of the attribute 
// * @return Handle of node 	TokenNameCOMMENT_LINE	* @return Handle of node 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public int createAttribute(String qname, String value) { 	TokenNameCOMMENT_LINE	public int createAttribute(String qname, String value) { 
// int colonpos = qname.indexOf(":"); 	TokenNameCOMMENT_LINE	int colonpos = qname.indexOf(":"); 
// String attName = qname.substring(colonpos+1); 	TokenNameCOMMENT_LINE	String attName = qname.substring(colonpos+1); 
// int w0 = 0; 	TokenNameCOMMENT_LINE	int w0 = 0; 
// if (colonpos > 0) { 	TokenNameCOMMENT_LINE	if (colonpos > 0) { 
// String prefix = qname.substring(0, colonpos); 	TokenNameCOMMENT_LINE	String prefix = qname.substring(0, colonpos); 
// if (prefix.equals("xml")) { 	TokenNameCOMMENT_LINE	if (prefix.equals("xml")) { 
// //w0 = ATTRIBUTE_NODE | 	TokenNameCOMMENT_LINE	//w0 = ATTRIBUTE_NODE | 
// // (org.apache.xalan.templates.Constants.S_XMLNAMESPACEURI << 16); 	TokenNameCOMMENT_LINE	// (org.apache.xalan.templates.Constants.S_XMLNAMESPACEURI << 16); 
// } else { 	TokenNameCOMMENT_LINE	} else { 
// //w0 = ATTRIBUTE_NODE | 	TokenNameCOMMENT_LINE	//w0 = ATTRIBUTE_NODE | 
// } 	TokenNameCOMMENT_LINE	} 
// } else { 	TokenNameCOMMENT_LINE	} else { 
// w0 = ATTRIBUTE_NODE; 	TokenNameCOMMENT_LINE	w0 = ATTRIBUTE_NODE; 
// } 	TokenNameCOMMENT_LINE	} 
// // W1: Parent 	TokenNameCOMMENT_LINE	// W1: Parent 
// int w1 = currentParent; 	TokenNameCOMMENT_LINE	int w1 = currentParent; 
// // W2: Next (not yet resolved) 	TokenNameCOMMENT_LINE	// W2: Next (not yet resolved) 
// int w2 = 0; 	TokenNameCOMMENT_LINE	int w2 = 0; 
// // W3: Tag name 	TokenNameCOMMENT_LINE	// W3: Tag name 
// int w3 = m_localNames.stringToIndex(attName); 	TokenNameCOMMENT_LINE	int w3 = m_localNames.stringToIndex(attName); 
// // Add node 	TokenNameCOMMENT_LINE	// Add node 
// int ourslot = appendNode(w0, w1, w2, w3); 	TokenNameCOMMENT_LINE	int ourslot = appendNode(w0, w1, w2, w3); 
// previousSibling = ourslot; // Should attributes be previous siblings 	TokenNameCOMMENT_LINE	previousSibling = ourslot; // Should attributes be previous siblings 
// // W0: Node Type 	TokenNameCOMMENT_LINE	// W0: Node Type 
// w0 = TEXT_NODE; 	TokenNameCOMMENT_LINE	w0 = TEXT_NODE; 
// // W1: Parent 	TokenNameCOMMENT_LINE	// W1: Parent 
// w1 = ourslot; 	TokenNameCOMMENT_LINE	w1 = ourslot; 
// // W2: Start Position within buffer 	TokenNameCOMMENT_LINE	// W2: Start Position within buffer 
// w2 = m_char.length(); 	TokenNameCOMMENT_LINE	w2 = m_char.length(); 
// m_char.append(value); 	TokenNameCOMMENT_LINE	m_char.append(value); 
// // W3: Length 	TokenNameCOMMENT_LINE	// W3: Length 
// w3 = m_char.length() - w2; 	TokenNameCOMMENT_LINE	w3 = m_char.length() - w2; 
// appendNode(w0, w1, w2, w3); 	TokenNameCOMMENT_LINE	appendNode(w0, w1, w2, w3); 
// charStringStart=m_char.length(); 	TokenNameCOMMENT_LINE	charStringStart=m_char.length(); 
// charStringLength = 0; 	TokenNameCOMMENT_LINE	charStringLength = 0; 
// //previousSibling = ourslot; 	TokenNameCOMMENT_LINE	//previousSibling = ourslot; 
// // Attrs are Parents 	TokenNameCOMMENT_LINE	// Attrs are Parents 
// previousSiblingWasParent = true; 	TokenNameCOMMENT_LINE	previousSiblingWasParent = true; 
// return (m_docHandle | ourslot); 	TokenNameCOMMENT_LINE	return (m_docHandle | ourslot); 
// } 	TokenNameCOMMENT_LINE	} 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Factory method; creates a Text node in this document. 	TokenNameCOMMENT_LINE	* Factory method; creates a Text node in this document. 
// * 	TokenNameCOMMENT_LINE	* 
// * The node created will be chained according to its natural order of request 	TokenNameCOMMENT_LINE	* The node created will be chained according to its natural order of request 
// * received. %TBD% It can be rechained later via the optional DTM writable interface. 	TokenNameCOMMENT_LINE	* received. %TBD% It can be rechained later via the optional DTM writable interface. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param text String The characters text string from the XML document. 	TokenNameCOMMENT_LINE	* @param text String The characters text string from the XML document. 
// * @return int DTM node-number of the text node created 	TokenNameCOMMENT_LINE	* @return int DTM node-number of the text node created 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public int createTextNode(String text) 	TokenNameCOMMENT_LINE	public int createTextNode(String text) 
// throws DTMException 	TokenNameCOMMENT_LINE	throws DTMException 
// { 	TokenNameCOMMENT_LINE	{ 
// // wraps around the index value based createTextNode method 	TokenNameCOMMENT_LINE	// wraps around the index value based createTextNode method 
// return createTextNode(text.toCharArray(), 0, text.length()); 	TokenNameCOMMENT_LINE	return createTextNode(text.toCharArray(), 0, text.length()); 
// } 	TokenNameCOMMENT_LINE	} 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Factory method; creates a Text node in this document. 	TokenNameCOMMENT_LINE	* Factory method; creates a Text node in this document. 
// * 	TokenNameCOMMENT_LINE	* 
// * The node created will be chained according to its natural order of request 	TokenNameCOMMENT_LINE	* The node created will be chained according to its natural order of request 
// * received. %TBD% It can be rechained later via the optional DTM writable interface. 	TokenNameCOMMENT_LINE	* received. %TBD% It can be rechained later via the optional DTM writable interface. 
// * 	TokenNameCOMMENT_LINE	* 
// * %REVIEW% for text normalization issues, unless we are willing to 	TokenNameCOMMENT_LINE	* %REVIEW% for text normalization issues, unless we are willing to 
// * insist that all adjacent text must be merged before this method 	TokenNameCOMMENT_LINE	* insist that all adjacent text must be merged before this method 
// * is called. 	TokenNameCOMMENT_LINE	* is called. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param ch The characters from the XML document. 	TokenNameCOMMENT_LINE	* @param ch The characters from the XML document. 
// * @param start The start position in the array. 	TokenNameCOMMENT_LINE	* @param start The start position in the array. 
// * @param length The number of characters to read from the array. 	TokenNameCOMMENT_LINE	* @param length The number of characters to read from the array. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public int createTextNode(char ch[], int start, int length) 	TokenNameCOMMENT_LINE	public int createTextNode(char ch[], int start, int length) 
// throws DTMException 	TokenNameCOMMENT_LINE	throws DTMException 
// { 	TokenNameCOMMENT_LINE	{ 
// m_char.append(ch, start, length); // store the chunk to the text/comment string table 	TokenNameCOMMENT_LINE	m_char.append(ch, start, length); // store the chunk to the text/comment string table 
// // create a Text Node 	TokenNameCOMMENT_LINE	// create a Text Node 
// // %TBD% may be possible to combine with appendNode()to replace the next chunk of code 	TokenNameCOMMENT_LINE	// %TBD% may be possible to combine with appendNode()to replace the next chunk of code 
// int w0 = TEXT_NODE; 	TokenNameCOMMENT_LINE	int w0 = TEXT_NODE; 
// // W1: Parent 	TokenNameCOMMENT_LINE	// W1: Parent 
// int w1 = currentParent; 	TokenNameCOMMENT_LINE	int w1 = currentParent; 
// // W2: Start position within m_char 	TokenNameCOMMENT_LINE	// W2: Start position within m_char 
// int w2 = charStringStart; 	TokenNameCOMMENT_LINE	int w2 = charStringStart; 
// // W3: Length of the full string 	TokenNameCOMMENT_LINE	// W3: Length of the full string 
// int w3 = length; 	TokenNameCOMMENT_LINE	int w3 = length; 
// int ourslot = appendNode(w0, w1, w2, w3); 	TokenNameCOMMENT_LINE	int ourslot = appendNode(w0, w1, w2, w3); 
// previousSibling = ourslot; 	TokenNameCOMMENT_LINE	previousSibling = ourslot; 
// charStringStart=m_char.length(); 	TokenNameCOMMENT_LINE	charStringStart=m_char.length(); 
// charStringLength = 0; 	TokenNameCOMMENT_LINE	charStringLength = 0; 
// return (m_docHandle | ourslot); 	TokenNameCOMMENT_LINE	return (m_docHandle | ourslot); 
// } 	TokenNameCOMMENT_LINE	} 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Factory method; creates a Comment node in this document. 	TokenNameCOMMENT_LINE	* Factory method; creates a Comment node in this document. 
// * 	TokenNameCOMMENT_LINE	* 
// * The node created will be chained according to its natural order of request 	TokenNameCOMMENT_LINE	* The node created will be chained according to its natural order of request 
// * received. %TBD% It can be rechained later via the optional DTM writable interface. 	TokenNameCOMMENT_LINE	* received. %TBD% It can be rechained later via the optional DTM writable interface. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param text String The characters text string from the XML document. 	TokenNameCOMMENT_LINE	* @param text String The characters text string from the XML document. 
// * @return int DTM node-number of the text node created 	TokenNameCOMMENT_LINE	* @return int DTM node-number of the text node created 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public int createComment(String text) 	TokenNameCOMMENT_LINE	public int createComment(String text) 
// throws DTMException 	TokenNameCOMMENT_LINE	throws DTMException 
// { 	TokenNameCOMMENT_LINE	{ 
// // wraps around the index value based createTextNode method 	TokenNameCOMMENT_LINE	// wraps around the index value based createTextNode method 
// return createComment(text.toCharArray(), 0, text.length()); 	TokenNameCOMMENT_LINE	return createComment(text.toCharArray(), 0, text.length()); 
// } 	TokenNameCOMMENT_LINE	} 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Factory method; creates a Comment node in this document. 	TokenNameCOMMENT_LINE	* Factory method; creates a Comment node in this document. 
// * 	TokenNameCOMMENT_LINE	* 
// * The node created will be chained according to its natural order of request 	TokenNameCOMMENT_LINE	* The node created will be chained according to its natural order of request 
// * received. %TBD% It can be rechained later via the optional DTM writable interface. 	TokenNameCOMMENT_LINE	* received. %TBD% It can be rechained later via the optional DTM writable interface. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param ch An array holding the characters in the comment. 	TokenNameCOMMENT_LINE	* @param ch An array holding the characters in the comment. 
// * @param start The starting position in the array. 	TokenNameCOMMENT_LINE	* @param start The starting position in the array. 
// * @param length The number of characters to use from the array. 	TokenNameCOMMENT_LINE	* @param length The number of characters to use from the array. 
// * @see DTMException 	TokenNameCOMMENT_LINE	* @see DTMException 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public int createComment(char ch[], int start, int length) 	TokenNameCOMMENT_LINE	public int createComment(char ch[], int start, int length) 
// throws DTMException 	TokenNameCOMMENT_LINE	throws DTMException 
// { 	TokenNameCOMMENT_LINE	{ 
// m_char.append(ch, start, length); // store the comment string to the text/comment string table 	TokenNameCOMMENT_LINE	m_char.append(ch, start, length); // store the comment string to the text/comment string table 
// // create a Comment Node 	TokenNameCOMMENT_LINE	// create a Comment Node 
// // %TBD% may be possible to combine with appendNode()to replace the next chunk of code 	TokenNameCOMMENT_LINE	// %TBD% may be possible to combine with appendNode()to replace the next chunk of code 
// int w0 = COMMENT_NODE; 	TokenNameCOMMENT_LINE	int w0 = COMMENT_NODE; 
// // W1: Parent 	TokenNameCOMMENT_LINE	// W1: Parent 
// int w1 = currentParent; 	TokenNameCOMMENT_LINE	int w1 = currentParent; 
// // W2: Start position within m_char 	TokenNameCOMMENT_LINE	// W2: Start position within m_char 
// int w2 = charStringStart; 	TokenNameCOMMENT_LINE	int w2 = charStringStart; 
// // W3: Length of the full string 	TokenNameCOMMENT_LINE	// W3: Length of the full string 
// int w3 = length; 	TokenNameCOMMENT_LINE	int w3 = length; 
// int ourslot = appendNode(w0, w1, w2, w3); 	TokenNameCOMMENT_LINE	int ourslot = appendNode(w0, w1, w2, w3); 
// previousSibling = ourslot; 	TokenNameCOMMENT_LINE	previousSibling = ourslot; 
// charStringStart=m_char.length(); 	TokenNameCOMMENT_LINE	charStringStart=m_char.length(); 
// charStringLength = 0; 	TokenNameCOMMENT_LINE	charStringLength = 0; 
// return (m_docHandle | ourslot); 	TokenNameCOMMENT_LINE	return (m_docHandle | ourslot); 
// } 	TokenNameCOMMENT_LINE	} 
// // Counters to keep track of the current text string being accumulated with respect 	TokenNameCOMMENT_LINE	// Counters to keep track of the current text string being accumulated with respect 
// // to the text/comment string table: charStringStart should point to the starting 	TokenNameCOMMENT_LINE	// to the text/comment string table: charStringStart should point to the starting 
// // offset of the string in the table and charStringLength the acccumulated length when 	TokenNameCOMMENT_LINE	// offset of the string in the table and charStringLength the acccumulated length when 
// // appendAccumulatedText starts, and reset to the end of the table and 0 at the end 	TokenNameCOMMENT_LINE	// appendAccumulatedText starts, and reset to the end of the table and 0 at the end 
// // of appendAccumulatedText for the next set of characters receives 	TokenNameCOMMENT_LINE	// of appendAccumulatedText for the next set of characters receives 
// int charStringStart=0,charStringLength=0; 	TokenNameCOMMENT_LINE	int charStringStart=0,charStringLength=0; 
// ========= Document Navigation Functions ========= 	TokenNameCOMMENT_LINE	========= Document Navigation Functions ========= 
/** Given a node handle, test if it has child nodes. * <p> %REVIEW% This is obviously useful at the DOM layer, where it * would permit testing this without having to create a proxy * node. It's less useful in the DTM API, where * (dtm.getFirstChild(nodeHandle)!=DTM.NULL) is just as fast and * almost as self-evident. But it's a convenience, and eases porting * of DOM code to DTM. </p> * * @param nodeHandle int Handle of the node. * @return int true if the given node has child nodes. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, test if it has child nodes. <p> %REVIEW% This is obviously useful at the DOM layer, where it would permit testing this without having to create a proxy node. It's less useful in the DTM API, where (dtm.getFirstChild(nodeHandle)!=DTM.NULL) is just as fast and almost as self-evident. But it's a convenience, and eases porting of DOM code to DTM. </p> * @param nodeHandle int Handle of the node. @return int true if the given node has child nodes. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
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
// ###shs worry about tracing/debug later 	TokenNameCOMMENT_LINE	###shs worry about tracing/debug later 
nodeHandle	TokenNameIdentifier	 node Handle
&=	TokenNameAND_EQUAL	
NODEHANDLE_MASK	TokenNameIdentifier	 NODEHANDLE  MASK
;	TokenNameSEMICOLON	
// Read node into variable 	TokenNameCOMMENT_LINE	Read node into variable 
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readSlot	TokenNameIdentifier	 read Slot
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// type is the last half of first slot 	TokenNameCOMMENT_LINE	type is the last half of first slot 
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check to see if Element or Document node 	TokenNameCOMMENT_LINE	Check to see if Element or Document node 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In case when Document root is given 	TokenNameCOMMENT_LINE	In case when Document root is given 
// if (nodeHandle == 0) nodeHandle = 1; 	TokenNameCOMMENT_LINE	if (nodeHandle == 0) nodeHandle = 1; 
// %TBD% Probably was a mistake. 	TokenNameCOMMENT_LINE	%TBD% Probably was a mistake. 
// If someone explicitly asks for first child 	TokenNameCOMMENT_LINE	If someone explicitly asks for first child 
// of Document, I would expect them to want 	TokenNameCOMMENT_LINE	of Document, I would expect them to want 
// that and only that. 	TokenNameCOMMENT_LINE	that and only that. 
int	TokenNameint	
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
nodeHandle	TokenNameIdentifier	 node Handle
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readSlot	TokenNameIdentifier	 read Slot
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// points to next sibling 	TokenNameCOMMENT_LINE	points to next sibling 
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Return NULL if node has only attributes 	TokenNameCOMMENT_LINE	Return NULL if node has only attributes 
if	TokenNameif	
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
==	TokenNameEQUAL_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readSlot	TokenNameIdentifier	 read Slot
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If parent slot matches given parent, return kid 	TokenNameCOMMENT_LINE	If parent slot matches given parent, return kid 
if	TokenNameif	
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
kid	TokenNameIdentifier	 kid
|	TokenNameOR	
m_docHandle	TokenNameIdentifier	 m doc Handle
;	TokenNameSEMICOLON	
return	TokenNamereturn	
firstChild	TokenNameIdentifier	 first Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// No child found 	TokenNameCOMMENT_LINE	No child found 
return	TokenNamereturn	
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
// ###shs put trace/debug later 	TokenNameCOMMENT_LINE	###shs put trace/debug later 
nodeHandle	TokenNameIdentifier	 node Handle
&=	TokenNameAND_EQUAL	
NODEHANDLE_MASK	TokenNameIdentifier	 NODEHANDLE  MASK
;	TokenNameSEMICOLON	
// do not need to test node type since getFirstChild does that 	TokenNameCOMMENT_LINE	do not need to test node type since getFirstChild does that 
int	TokenNameint	
lastChild	TokenNameIdentifier	 last Child
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
nextkid	TokenNameIdentifier	 nextkid
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextkid	TokenNameIdentifier	 nextkid
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
nextkid	TokenNameIdentifier	 nextkid
=	TokenNameEQUAL	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
nextkid	TokenNameIdentifier	 nextkid
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastChild	TokenNameIdentifier	 last Child
=	TokenNameEQUAL	
nextkid	TokenNameIdentifier	 nextkid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
lastChild	TokenNameIdentifier	 last Child
|	TokenNameOR	
m_docHandle	TokenNameIdentifier	 m doc Handle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves an attribute node by by qualified name and namespace URI. * * @param nodeHandle int Handle of the node upon which to look up this attribute. * @param namespaceURI The namespace URI of the attribute to * retrieve, or null. * @param name The local name of the attribute to * retrieve. * @return The attribute node handle with the specified name ( * <code>nodeName</code>) or <code>DTM.NULL</code> if there is no such * attribute. */	TokenNameCOMMENT_JAVADOC	 Retrieves an attribute node by by qualified name and namespace URI. * @param nodeHandle int Handle of the node upon which to look up this attribute. @param namespaceURI The namespace URI of the attribute to retrieve, or null. @param name The local name of the attribute to retrieve. @return The attribute node handle with the specified name ( <code>nodeName</code>) or <code>DTM.NULL</code> if there is no such attribute. 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
int	TokenNameint	
nsIndex	TokenNameIdentifier	 ns Index
=	TokenNameEQUAL	
m_nsNames	TokenNameIdentifier	 m ns Names
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
,	TokenNameCOMMA	
nameIndex	TokenNameIdentifier	 name Index
=	TokenNameEQUAL	
m_localNames	TokenNameIdentifier	 m local Names
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeHandle	TokenNameIdentifier	 node Handle
&=	TokenNameAND_EQUAL	
NODEHANDLE_MASK	TokenNameIdentifier	 NODEHANDLE  MASK
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readSlot	TokenNameIdentifier	 read Slot
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If nodeHandle points to element next slot would be first attribute 	TokenNameCOMMENT_LINE	If nodeHandle points to element next slot would be first attribute 
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// Iterate through Attribute Nodes 	TokenNameCOMMENT_LINE	Iterate through Attribute Nodes 
while	TokenNamewhile	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nsIndex	TokenNameIdentifier	 ns Index
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
nameIndex	TokenNameIdentifier	 name Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
nodeHandle	TokenNameIdentifier	 node Handle
|	TokenNameOR	
m_docHandle	TokenNameIdentifier	 m doc Handle
;	TokenNameSEMICOLON	
// Goto next sibling 	TokenNameCOMMENT_LINE	Goto next sibling 
nodeHandle	TokenNameIdentifier	 node Handle
=	TokenNameEQUAL	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readSlot	TokenNameIdentifier	 read Slot
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, get the index of the node's first attribute. * * @param nodeHandle int Handle of the Element node. * @return Handle of first attribute, or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, get the index of the node's first attribute. * @param nodeHandle int Handle of the Element node. @return Handle of first attribute, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getFirstAttribute	TokenNameIdentifier	 get First Attribute
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeHandle	TokenNameIdentifier	 node Handle
&=	TokenNameAND_EQUAL	
NODEHANDLE_MASK	TokenNameIdentifier	 NODEHANDLE  MASK
;	TokenNameSEMICOLON	
// %REVIEW% jjk: Just a quick observation: If you're going to 	TokenNameCOMMENT_LINE	%REVIEW% jjk: Just a quick observation: If you're going to 
// call readEntry repeatedly on the same node, it may be 	TokenNameCOMMENT_LINE	call readEntry repeatedly on the same node, it may be 
// more efficiently to do a readSlot to get the data locally, 	TokenNameCOMMENT_LINE	more efficiently to do a readSlot to get the data locally, 
// reducing the addressing and call-and-return overhead. 	TokenNameCOMMENT_LINE	reducing the addressing and call-and-return overhead. 
// Should we check if handle is element (do we want sanity checks?) 	TokenNameCOMMENT_LINE	Should we check if handle is element (do we want sanity checks?) 
if	TokenNameif	
(	TokenNameLPAREN	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readEntry	TokenNameIdentifier	 read Entry
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
// First Attribute (if any) should be at next position in table 	TokenNameCOMMENT_LINE	First Attribute (if any) should be at next position in table 
nodeHandle	TokenNameIdentifier	 node Handle
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readEntry	TokenNameIdentifier	 read Entry
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
nodeHandle	TokenNameIdentifier	 node Handle
|	TokenNameOR	
m_docHandle	TokenNameIdentifier	 m doc Handle
:	TokenNameCOLON	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
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
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, advance to its next sibling. * * %TBD% This currently uses the DTM-internal definition of * sibling; eg, the last attr's next sib is the first * child. In the old DTM, the DOM proxy layer provided the * additional logic for the public view. If we're rewriting * for XPath emulation, that test must be done here. * * %TBD% CODE INTERACTION WITH INCREMENTAL PARSE - If not yet * resolved, should wait for more nodes to be added to the document * and tries again. * * @param nodeHandle int Handle of the node. * @return int Node-number of next sibling, * or DTM.NULL to indicate none exists. * */	TokenNameCOMMENT_JAVADOC	 Given a node handle, advance to its next sibling. * %TBD% This currently uses the DTM-internal definition of sibling; eg, the last attr's next sib is the first child. In the old DTM, the DOM proxy layer provided the additional logic for the public view. If we're rewriting for XPath emulation, that test must be done here. * %TBD% CODE INTERACTION WITH INCREMENTAL PARSE - If not yet resolved, should wait for more nodes to be added to the document and tries again. * @param nodeHandle int Handle of the node. @return int Node-number of next sibling, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeHandle	TokenNameIdentifier	 node Handle
&=	TokenNameAND_EQUAL	
NODEHANDLE_MASK	TokenNameIdentifier	 NODEHANDLE  MASK
;	TokenNameSEMICOLON	
// Document root has no next sibling 	TokenNameCOMMENT_LINE	Document root has no next sibling 
if	TokenNameif	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readEntry	TokenNameIdentifier	 read Entry
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nextSib	TokenNameIdentifier	 next Sib
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readEntry	TokenNameIdentifier	 read Entry
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextSib	TokenNameIdentifier	 next Sib
==	TokenNameEQUAL_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextSib	TokenNameIdentifier	 next Sib
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_docHandle	TokenNameIdentifier	 m doc Handle
|	TokenNameOR	
nextSib	TokenNameIdentifier	 next Sib
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ###shs should cycle/wait if nextSib is 0? Working on threading next 	TokenNameCOMMENT_LINE	###shs should cycle/wait if nextSib is 0? Working on threading next 
}	TokenNameRBRACE	
// Next Sibling is in the next position if it shares the same parent 	TokenNameCOMMENT_LINE	Next Sibling is in the next position if it shares the same parent 
int	TokenNameint	
thisParent	TokenNameIdentifier	 this Parent
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readEntry	TokenNameIdentifier	 read Entry
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readEntry	TokenNameIdentifier	 read Entry
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
thisParent	TokenNameIdentifier	 this Parent
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_docHandle	TokenNameIdentifier	 m doc Handle
|	TokenNameOR	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
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
nodeHandle	TokenNameIdentifier	 node Handle
&=	TokenNameAND_EQUAL	
NODEHANDLE_MASK	TokenNameIdentifier	 NODEHANDLE  MASK
;	TokenNameSEMICOLON	
// Document root has no previous sibling 	TokenNameCOMMENT_LINE	Document root has no previous sibling 
if	TokenNameif	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
int	TokenNameint	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readEntry	TokenNameIdentifier	 read Entry
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
nextkid	TokenNameIdentifier	 nextkid
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextkid	TokenNameIdentifier	 nextkid
!=	TokenNameNOT_EQUAL	
nodeHandle	TokenNameIdentifier	 node Handle
;	TokenNameSEMICOLON	
nextkid	TokenNameIdentifier	 nextkid
=	TokenNameEQUAL	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
nextkid	TokenNameIdentifier	 nextkid
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
nextkid	TokenNameIdentifier	 nextkid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
kid	TokenNameIdentifier	 kid
|	TokenNameOR	
m_docHandle	TokenNameIdentifier	 m doc Handle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, advance to the next attribute. If an * element, we advance to its first attribute; if an attr, we advance to * the next attr on the same node. * * @param nodeHandle int Handle of the node. * @return int DTM node-number of the resolved attr, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, advance to the next attribute. If an element, we advance to its first attribute; if an attr, we advance to the next attr on the same node. * @param nodeHandle int Handle of the node. @return int DTM node-number of the resolved attr, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getNextAttribute	TokenNameIdentifier	 get Next Attribute
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeHandle	TokenNameIdentifier	 node Handle
&=	TokenNameAND_EQUAL	
NODEHANDLE_MASK	TokenNameIdentifier	 NODEHANDLE  MASK
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readSlot	TokenNameIdentifier	 read Slot
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//%REVIEW% Why are we using short here? There's no storage 	TokenNameCOMMENT_LINE	%REVIEW% Why are we using short here? There's no storage 
//reduction for an automatic variable, especially one used 	TokenNameCOMMENT_LINE	reduction for an automatic variable, especially one used 
//so briefly, and it typically costs more cycles to process 	TokenNameCOMMENT_LINE	so briefly, and it typically costs more cycles to process 
//than an int would. 	TokenNameCOMMENT_LINE	than an int would. 
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFirstAttribute	TokenNameIdentifier	 get First Attribute
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_docHandle	TokenNameIdentifier	 m doc Handle
|	TokenNameOR	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a namespace handle, advance to the next namespace. * * %TBD% THIS METHOD DOES NOT MATCH THE CURRENT SIGNATURE IN * THE DTM INTERFACE. FIX IT, OR JUSTIFY CHANGING THE DTM * API. * * @param namespaceHandle handle to node which must be of type NAMESPACE_NODE. * @return handle of next namespace, or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a namespace handle, advance to the next namespace. * %TBD% THIS METHOD DOES NOT MATCH THE CURRENT SIGNATURE IN THE DTM INTERFACE. FIX IT, OR JUSTIFY CHANGING THE DTM API. * @param namespaceHandle handle to node which must be of type NAMESPACE_NODE. @return handle of next namespace, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getNextNamespaceNode	TokenNameIdentifier	 get Next Namespace Node
(	TokenNameLPAREN	
int	TokenNameint	
baseHandle	TokenNameIdentifier	 base Handle
,	TokenNameCOMMA	
int	TokenNameint	
namespaceHandle	TokenNameIdentifier	 namespace Handle
,	TokenNameCOMMA	
boolean	TokenNameboolean	
inScope	TokenNameIdentifier	 in Scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ###shs need to work on namespace 	TokenNameCOMMENT_LINE	###shs need to work on namespace 
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, advance to its next descendant. * If not yet resolved, waits for more nodes to be added to the document and * tries again. * * @param subtreeRootHandle * @param nodeHandle int Handle of the node. * @return handle of next descendant, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, advance to its next descendant. If not yet resolved, waits for more nodes to be added to the document and tries again. * @param subtreeRootHandle @param nodeHandle int Handle of the node. @return handle of next descendant, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getNextDescendant	TokenNameIdentifier	 get Next Descendant
(	TokenNameLPAREN	
int	TokenNameint	
subtreeRootHandle	TokenNameIdentifier	 subtree Root Handle
,	TokenNameCOMMA	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subtreeRootHandle	TokenNameIdentifier	 subtree Root Handle
&=	TokenNameAND_EQUAL	
NODEHANDLE_MASK	TokenNameIdentifier	 NODEHANDLE  MASK
;	TokenNameSEMICOLON	
nodeHandle	TokenNameIdentifier	 node Handle
&=	TokenNameAND_EQUAL	
NODEHANDLE_MASK	TokenNameIdentifier	 NODEHANDLE  MASK
;	TokenNameSEMICOLON	
// Document root [Document Node? -- jjk] - no next-sib 	TokenNameCOMMENT_LINE	Document root [Document Node? -- jjk] - no next-sib 
if	TokenNameif	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_isError	TokenNameIdentifier	 m is Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Document done and node out of bounds 	TokenNameCOMMENT_LINE	Document done and node out of bounds 
if	TokenNameif	
(	TokenNameLPAREN	
done	TokenNameIdentifier	 done
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
>	TokenNameGREATER	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
slotsUsed	TokenNameIdentifier	 slots Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
>	TokenNameGREATER	
subtreeRootHandle	TokenNameIdentifier	 subtree Root Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readSlot	TokenNameIdentifier	 read Slot
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeHandle	TokenNameIdentifier	 node Handle
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
nextParentPos	TokenNameIdentifier	 next Parent Pos
=	TokenNameEQUAL	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextParentPos	TokenNameIdentifier	 next Parent Pos
>=	TokenNameGREATER_EQUAL	
subtreeRootHandle	TokenNameIdentifier	 subtree Root Handle
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_docHandle	TokenNameIdentifier	 m doc Handle
|	TokenNameOR	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
done	TokenNameIdentifier	 done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Add wait logic here 	TokenNameCOMMENT_LINE	Add wait logic here 
}	TokenNameRBRACE	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nodeHandle	TokenNameIdentifier	 node Handle
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Probably should throw error here like original instead of returning 	TokenNameCOMMENT_LINE	Probably should throw error here like original instead of returning 
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, advance to the next node on the following axis. * * @param axisContextHandle the start of the axis that is being traversed. * @param nodeHandle * @return handle of next sibling, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, advance to the next node on the following axis. * @param axisContextHandle the start of the axis that is being traversed. @param nodeHandle @return handle of next sibling, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getNextFollowing	TokenNameIdentifier	 get Next Following
(	TokenNameLPAREN	
int	TokenNameint	
axisContextHandle	TokenNameIdentifier	 axis Context Handle
,	TokenNameCOMMA	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//###shs still working on 	TokenNameCOMMENT_LINE	###shs still working on 
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, advance to the next node on the preceding axis. * * @param axisContextHandle the start of the axis that is being traversed. * @param nodeHandle the id of the node. * @return int Node-number of preceding sibling, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, advance to the next node on the preceding axis. * @param axisContextHandle the start of the axis that is being traversed. @param nodeHandle the id of the node. @return int Node-number of preceding sibling, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getNextPreceding	TokenNameIdentifier	 get Next Preceding
(	TokenNameLPAREN	
int	TokenNameint	
axisContextHandle	TokenNameIdentifier	 axis Context Handle
,	TokenNameCOMMA	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ###shs copied from Xalan 1, what is this suppose to do? 	TokenNameCOMMENT_LINE	###shs copied from Xalan 1, what is this suppose to do? 
nodeHandle	TokenNameIdentifier	 node Handle
&=	TokenNameAND_EQUAL	
NODEHANDLE_MASK	TokenNameIdentifier	 NODEHANDLE  MASK
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeHandle	TokenNameIdentifier	 node Handle
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readEntry	TokenNameIdentifier	 read Entry
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// if nodeHandle is _not_ an ancestor of 	TokenNameCOMMENT_LINE	if nodeHandle is _not_ an ancestor of 
// axisContextHandle, specialFind will return it. 	TokenNameCOMMENT_LINE	axisContextHandle, specialFind will return it. 
// If it _is_ an ancestor, specialFind will return -1 	TokenNameCOMMENT_LINE	If it _is_ an ancestor, specialFind will return -1 
// %REVIEW% unconditional return defeats the 	TokenNameCOMMENT_LINE	%REVIEW% unconditional return defeats the 
// purpose of the while loop -- does this 	TokenNameCOMMENT_LINE	purpose of the while loop -- does this 
// logic make any sense? 	TokenNameCOMMENT_LINE	logic make any sense? 
return	TokenNamereturn	
(	TokenNameLPAREN	
m_docHandle	TokenNameIdentifier	 m doc Handle
|	TokenNameOR	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
specialFind	TokenNameIdentifier	 special Find
(	TokenNameLPAREN	
axisContextHandle	TokenNameIdentifier	 axis Context Handle
,	TokenNameCOMMA	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
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
// Should check to see within range? 	TokenNameCOMMENT_LINE	Should check to see within range? 
// Document Root should not have to be handled differently 	TokenNameCOMMENT_LINE	Document Root should not have to be handled differently 
return	TokenNamereturn	
(	TokenNameLPAREN	
m_docHandle	TokenNameIdentifier	 m doc Handle
|	TokenNameOR	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readEntry	TokenNameIdentifier	 read Entry
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the root element of the document. * @return nodeHandle to the Document Root. */	TokenNameCOMMENT_JAVADOC	 Returns the root element of the document. @return nodeHandle to the Document Root. 
public	TokenNamepublic	
int	TokenNameint	
getDocumentRoot	TokenNameIdentifier	 get Document Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_docHandle	TokenNameIdentifier	 m doc Handle
|	TokenNameOR	
m_docElement	TokenNameIdentifier	 m doc Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, find the owning document node. * * @return int Node handle of document, which should always be valid. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, find the owning document node. * @return int Node handle of document, which should always be valid. 
public	TokenNamepublic	
int	TokenNameint	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_docHandle	TokenNameIdentifier	 m doc Handle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, find the owning document node. This has the exact * same semantics as the DOM Document method of the same name, in that if * the nodeHandle is a document node, it will return NULL. * * <p>%REVIEW% Since this is DOM-specific, it may belong at the DOM * binding layer. Included here as a convenience function and to * aid porting of DOM code to DTM.</p> * * @param nodeHandle the id of the node. * @return int Node handle of owning document, or NULL if the nodeHandle is * a document. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, find the owning document node. This has the exact same semantics as the DOM Document method of the same name, in that if the nodeHandle is a document node, it will return NULL. * <p>%REVIEW% Since this is DOM-specific, it may belong at the DOM binding layer. Included here as a convenience function and to aid porting of DOM code to DTM.</p> * @param nodeHandle the id of the node. @return int Node handle of owning document, or NULL if the nodeHandle is a document. 
public	TokenNamepublic	
int	TokenNameint	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assumption that Document Node is always in 0 slot 	TokenNameCOMMENT_LINE	Assumption that Document Node is always in 0 slot 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
&	TokenNameAND	
NODEHANDLE_MASK	TokenNameIdentifier	 NODEHANDLE  MASK
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
&	TokenNameAND	
DOCHANDLE_MASK	TokenNameIdentifier	 DOCHANDLE  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, find the owning document node. This has the DTM * semantics; a Document node is its own owner. * * <p>%REVIEW% Since this is DOM-specific, it may belong at the DOM * binding layer. Included here as a convenience function and to * aid porting of DOM code to DTM.</p> * * @param nodeHandle the id of the node. * @return int Node handle of owning document, or NULL if the nodeHandle is * a document. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, find the owning document node. This has the DTM semantics; a Document node is its own owner. * <p>%REVIEW% Since this is DOM-specific, it may belong at the DOM binding layer. Included here as a convenience function and to aid porting of DOM code to DTM.</p> * @param nodeHandle the id of the node. @return int Node handle of owning document, or NULL if the nodeHandle is a document. 
public	TokenNamepublic	
int	TokenNameint	
getDocumentRoot	TokenNameIdentifier	 get Document Root
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assumption that Document Node is always in 0 slot 	TokenNameCOMMENT_LINE	Assumption that Document Node is always in 0 slot 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
&	TokenNameAND	
NODEHANDLE_MASK	TokenNameIdentifier	 NODEHANDLE  MASK
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
&	TokenNameAND	
DOCHANDLE_MASK	TokenNameIdentifier	 DOCHANDLE  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the string-value of a node as a String object * (see http://www.w3.org/TR/xpath#data-model * for the definition of a node's string-value). * * @param nodeHandle The node ID. * * @return A string object that represents the string-value of the given node. */	TokenNameCOMMENT_JAVADOC	 Get the string-value of a node as a String object (see http://www.w3.org/TR/xpath#data-model for the definition of a node's string-value). * @param nodeHandle The node ID. * @return A string object that represents the string-value of the given node. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ###zaj - researching 	TokenNameCOMMENT_LINE	###zaj - researching 
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readSlot	TokenNameIdentifier	 read Slot
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nodetype	TokenNameIdentifier	 nodetype
=	TokenNameEQUAL	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nodetype	TokenNameIdentifier	 nodetype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
m_char	TokenNameIdentifier	 m char
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
:	TokenNameCOLON	
case	TokenNamecase	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
case	TokenNamecase	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_xsf	TokenNameIdentifier	 m xsf
.	TokenNameDOT	
newstr	TokenNameIdentifier	 newstr
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get number of character array chunks in * the string-value of a node. * (see http://www.w3.org/TR/xpath#data-model * for the definition of a node's string-value). * Note that a single text node may have multiple text chunks. * * EXPLANATION: This method is an artifact of the fact that the * underlying m_chars object may not store characters in a * single contiguous array -- for example,the current * FastStringBuffer may split a single node's text across * multiple allocation units. This call tells us how many * separate accesses will be required to retrieve the entire * content. PLEASE NOTE that this may not be the same as the * number of SAX characters() events that caused the text node * to be built in the first place, since m_chars buffering may * be on different boundaries than the parser's buffers. * * @param nodeHandle The node ID. * * @return number of character array chunks in * the string-value of a node. * */	TokenNameCOMMENT_JAVADOC	 Get number of character array chunks in the string-value of a node. (see http://www.w3.org/TR/xpath#data-model for the definition of a node's string-value). Note that a single text node may have multiple text chunks. * EXPLANATION: This method is an artifact of the fact that the underlying m_chars object may not store characters in a single contiguous array -- for example,the current FastStringBuffer may split a single node's text across multiple allocation units. This call tells us how many separate accesses will be required to retrieve the entire content. PLEASE NOTE that this may not be the same as the number of SAX characters() events that caused the text node to be built in the first place, since m_chars buffering may be on different boundaries than the parser's buffers. * @param nodeHandle The node ID. * @return number of character array chunks in the string-value of a node. 
//###zaj - tbd 	TokenNameCOMMENT_LINE	###zaj - tbd 
public	TokenNamepublic	
int	TokenNameint	
getStringValueChunkCount	TokenNameIdentifier	 get String Value Chunk Count
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//###zaj return value 	TokenNameCOMMENT_LINE	###zaj return value 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a character array chunk in the string-value of a node. * (see http://www.w3.org/TR/xpath#data-model * for the definition of a node's string-value). * Note that a single text node may have multiple text chunks. * * EXPLANATION: This method is an artifact of the fact that * the underlying m_chars object may not store characters in a * single contiguous array -- for example,the current * FastStringBuffer may split a single node's text across * multiple allocation units. This call retrieves a single * contiguous portion of the text -- as much as m-chars was * able to store in a single allocation unit. PLEASE NOTE * that this may not be the same granularityas the SAX * characters() events that caused the text node to be built * in the first place, since m_chars buffering may be on * different boundaries than the parser's buffers. * * @param nodeHandle The node ID. * @param chunkIndex Which chunk to get. * @param startAndLen An array of 2 where the start position and length of * the chunk will be returned. * * @return The character array reference where the chunk occurs. */	TokenNameCOMMENT_JAVADOC	 Get a character array chunk in the string-value of a node. (see http://www.w3.org/TR/xpath#data-model for the definition of a node's string-value). Note that a single text node may have multiple text chunks. * EXPLANATION: This method is an artifact of the fact that the underlying m_chars object may not store characters in a single contiguous array -- for example,the current FastStringBuffer may split a single node's text across multiple allocation units. This call retrieves a single contiguous portion of the text -- as much as m-chars was able to store in a single allocation unit. PLEASE NOTE that this may not be the same granularityas the SAX characters() events that caused the text node to be built in the first place, since m_chars buffering may be on different boundaries than the parser's buffers. * @param nodeHandle The node ID. @param chunkIndex Which chunk to get. @param startAndLen An array of 2 where the start position and length of the chunk will be returned. * @return The character array reference where the chunk occurs. 
//###zaj - tbd 	TokenNameCOMMENT_LINE	###zaj - tbd 
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
return	TokenNamereturn	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readSlot	TokenNameIdentifier	 read Slot
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
=	TokenNameEQUAL	
m_localNames	TokenNameIdentifier	 m local Names
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Remove prefix from qName 	TokenNameCOMMENT_LINE	Remove prefix from qName 
// %TBD% jjk This is assuming the elementName is the qName. 	TokenNameCOMMENT_LINE	%TBD% jjk This is assuming the elementName is the qName. 
int	TokenNameint	
colonpos	TokenNameIdentifier	 colonpos
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
colonpos	TokenNameIdentifier	 colonpos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get NS 	TokenNameCOMMENT_LINE	Get NS 
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
m_nsNames	TokenNameIdentifier	 m ns Names
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create expanded name 	TokenNameCOMMENT_LINE	Create expanded name 
String	TokenNameIdentifier	 String
expandedName	TokenNameIdentifier	 expanded Name
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
int	TokenNameint	
expandedNameID	TokenNameIdentifier	 expanded Name ID
=	TokenNameEQUAL	
m_nsNames	TokenNameIdentifier	 m ns Names
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
expandedName	TokenNameIdentifier	 expanded Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
expandedNameID	TokenNameIdentifier	 expanded Name ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an expanded name, return an ID. If the expanded-name does not * exist in the internal tables, the entry will be created, and the ID will * be returned. Any additional nodes that are created that have this * expanded name will use this ID. * * @return the expanded-name id of the node. */	TokenNameCOMMENT_JAVADOC	 Given an expanded name, return an ID. If the expanded-name does not exist in the internal tables, the entry will be created, and the ID will be returned. Any additional nodes that are created that have this expanded name will use this ID. * @return the expanded-name id of the node. 
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
// Create expanded name 	TokenNameCOMMENT_LINE	Create expanded name 
// %TBD% jjk Expanded name is bitfield-encoded as 	TokenNameCOMMENT_LINE	%TBD% jjk Expanded name is bitfield-encoded as 
// typeID[6]nsuriID[10]localID[16]. Switch to that form, and to 	TokenNameCOMMENT_LINE	typeID[6]nsuriID[10]localID[16]. Switch to that form, and to 
// accessing the ns/local via their tables rather than confusing 	TokenNameCOMMENT_LINE	accessing the ns/local via their tables rather than confusing 
// nsnames and expandednames. 	TokenNameCOMMENT_LINE	nsnames and expandednames. 
String	TokenNameIdentifier	 String
expandedName	TokenNameIdentifier	 expanded Name
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
int	TokenNameint	
expandedNameID	TokenNameIdentifier	 expanded Name ID
=	TokenNameEQUAL	
m_nsNames	TokenNameIdentifier	 m ns Names
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
expandedName	TokenNameIdentifier	 expanded Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
expandedNameID	TokenNameIdentifier	 expanded Name ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an expanded-name ID, return the local name part. * * @param ExpandedNameID an ID that represents an expanded-name. * @return String Local name of this node. */	TokenNameCOMMENT_JAVADOC	 Given an expanded-name ID, return the local name part. * @param ExpandedNameID an ID that represents an expanded-name. @return String Local name of this node. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalNameFromExpandedNameID	TokenNameIdentifier	 get Local Name From Expanded Name ID
(	TokenNameLPAREN	
int	TokenNameint	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get expanded name 	TokenNameCOMMENT_LINE	Get expanded name 
String	TokenNameIdentifier	 String
expandedName	TokenNameIdentifier	 expanded Name
=	TokenNameEQUAL	
m_localNames	TokenNameIdentifier	 m local Names
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Remove prefix from expanded name 	TokenNameCOMMENT_LINE	Remove prefix from expanded name 
int	TokenNameint	
colonpos	TokenNameIdentifier	 colonpos
=	TokenNameEQUAL	
expandedName	TokenNameIdentifier	 expanded Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
expandedName	TokenNameIdentifier	 expanded Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
colonpos	TokenNameIdentifier	 colonpos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an expanded-name ID, return the namespace URI part. * * @param ExpandedNameID an ID that represents an expanded-name. * @return String URI value of this node's namespace, or null if no * namespace was resolved. */	TokenNameCOMMENT_JAVADOC	 Given an expanded-name ID, return the namespace URI part. * @param ExpandedNameID an ID that represents an expanded-name. @return String URI value of this node's namespace, or null if no namespace was resolved. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceFromExpandedNameID	TokenNameIdentifier	 get Namespace From Expanded Name ID
(	TokenNameLPAREN	
int	TokenNameint	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
expandedName	TokenNameIdentifier	 expanded Name
=	TokenNameEQUAL	
m_localNames	TokenNameIdentifier	 m local Names
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Remove local name from expanded name 	TokenNameCOMMENT_LINE	Remove local name from expanded name 
int	TokenNameint	
colonpos	TokenNameIdentifier	 colonpos
=	TokenNameEQUAL	
expandedName	TokenNameIdentifier	 expanded Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nsName	TokenNameIdentifier	 ns Name
=	TokenNameEQUAL	
expandedName	TokenNameIdentifier	 expanded Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
colonpos	TokenNameIdentifier	 colonpos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nsName	TokenNameIdentifier	 ns Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * fixednames */	TokenNameCOMMENT_JAVADOC	 fixednames 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fixednames	TokenNameIdentifier	 fixednames
=	TokenNameEQUAL	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
// nothing, Element 	TokenNameCOMMENT_LINE	nothing, Element 
null	TokenNamenull	
,	TokenNameCOMMA	
"#text"	TokenNameStringLiteral	#text
,	TokenNameCOMMA	
// Attr, Text 	TokenNameCOMMENT_LINE	Attr, Text 
"#cdata_section"	TokenNameStringLiteral	#cdata_section
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
// CDATA, EntityReference 	TokenNameCOMMENT_LINE	CDATA, EntityReference 
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
// Entity, PI 	TokenNameCOMMENT_LINE	Entity, PI 
"#comment"	TokenNameStringLiteral	#comment
,	TokenNameCOMMA	
"#document"	TokenNameStringLiteral	#document
,	TokenNameCOMMA	
// Comment, Document 	TokenNameCOMMENT_LINE	Comment, Document 
null	TokenNamenull	
,	TokenNameCOMMA	
"#document-fragment"	TokenNameStringLiteral	#document-fragment
,	TokenNameCOMMA	
// Doctype, DocumentFragment 	TokenNameCOMMENT_LINE	Doctype, DocumentFragment 
null	TokenNamenull	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Notation 	TokenNameCOMMENT_LINE	Notation 
/** * Given a node handle, return its DOM-style node name. This will * include names such as #text or #document. * * @param nodeHandle the id of the node. * @return String Name of this node, which may be an empty string. * %REVIEW% Document when empty string is possible... */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its DOM-style node name. This will include names such as #text or #document. * @param nodeHandle the id of the node. @return String Name of this node, which may be an empty string. %REVIEW% Document when empty string is possible... 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readSlot	TokenNameIdentifier	 read Slot
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
fixednames	TokenNameIdentifier	 fixednames
[	TokenNameLBRACKET	
type	TokenNameIdentifier	 type
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/**/	TokenNameCOMMENT_BLOCK	 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"got i="	TokenNameStringLiteral	got i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
m_localNames	TokenNameIdentifier	 m local Names
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
m_prefixNames	TokenNameIdentifier	 m prefix Names
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, return the XPath node name. This should be * the name as described by the XPath data model, NOT the DOM-style * name. * * @param nodeHandle the id of the node. * @return String Name of this node. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return the XPath node name. This should be the name as described by the XPath data model, NOT the DOM-style name. * @param nodeHandle the id of the node. @return String Name of this node. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeNameX	TokenNameIdentifier	 get Node Name X
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, return its DOM-style localname. * (As defined in Namespaces, this is the portion of the name after any * colon character) * * %REVIEW% What's the local name of something other than Element/Attr? * Should this be DOM-style (undefined unless namespaced), or other? * * @param nodeHandle the id of the node. * @return String Local name of this node. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its DOM-style localname. (As defined in Namespaces, this is the portion of the name after any colon character) * %REVIEW% What's the local name of something other than Element/Attr? Should this be DOM-style (undefined unless namespaced), or other? * @param nodeHandle the id of the node. @return String Local name of this node. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readSlot	TokenNameIdentifier	 read Slot
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
m_localNames	TokenNameIdentifier	 m local Names
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a namespace handle, return the prefix that the namespace decl is * mapping. * Given a node handle, return the prefix used to map to the namespace. * * <p> %REVIEW% Are you sure you want "" for no prefix? </p> * * %REVIEW% Should this be DOM-style (undefined unless namespaced), * or other? * * @param nodeHandle the id of the node. * @return String prefix of this node's name, or "" if no explicit * namespace prefix was given. */	TokenNameCOMMENT_JAVADOC	 Given a namespace handle, return the prefix that the namespace decl is mapping. Given a node handle, return the prefix used to map to the namespace. * <p> %REVIEW% Are you sure you want "" for no prefix? </p> * %REVIEW% Should this be DOM-style (undefined unless namespaced), or other? * @param nodeHandle the id of the node. @return String prefix of this node's name, or "" if no explicit namespace prefix was given. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readSlot	TokenNameIdentifier	 read Slot
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
m_prefixNames	TokenNameIdentifier	 m prefix Names
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, return its DOM-style namespace URI * (As defined in Namespaces, this is the declared URI which this node's * prefix -- or default in lieu thereof -- was mapped to.) * * @param nodeHandle the id of the node. * @return String URI value of this node's namespace, or null if no * namespace was resolved. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its DOM-style namespace URI (As defined in Namespaces, this is the declared URI which this node's prefix -- or default in lieu thereof -- was mapped to.) * @param nodeHandle the id of the node. @return String URI value of this node's namespace, or null if no namespace was resolved. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, return its node value. This is mostly * as defined by the DOM, but may ignore some conveniences. * <p> * * @param nodeHandle The node id. * @return String Value of this node, or null if not * meaningful for this node type. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its node value. This is mostly as defined by the DOM, but may ignore some conveniences. <p> * @param nodeHandle The node id. @return String Value of this node, or null if not meaningful for this node type. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readSlot	TokenNameIdentifier	 read Slot
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nodetype	TokenNameIdentifier	 nodetype
=	TokenNameEQUAL	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// ###zaj use mask to get node type 	TokenNameCOMMENT_LINE	###zaj use mask to get node type 
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nodetype	TokenNameIdentifier	 nodetype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ###zaj todo - document nodetypes 	TokenNameCOMMENT_LINE	###zaj todo - document nodetypes 
case	TokenNamecase	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readSlot	TokenNameIdentifier	 read Slot
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
m_char	TokenNameIdentifier	 m char
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//###zaj 	TokenNameCOMMENT_LINE	###zaj 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
:	TokenNameCOLON	
case	TokenNamecase	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a node handle, return its DOM-style node type. * <p> * %REVIEW% Generally, returning short is false economy. Return int? * * @param nodeHandle The node id. * @return int Node type, as per the DOM's Node._NODE constants. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its DOM-style node type. <p> %REVIEW% Generally, returning short is false economy. Return int? * @param nodeHandle The node id. @return int Node type, as per the DOM's Node._NODE constants. 
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readEntry	TokenNameIdentifier	 read Entry
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
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
short	TokenNameshort	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
nodeHandle	TokenNameIdentifier	 node Handle
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readEntry	TokenNameIdentifier	 read Entry
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
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
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the name of the character encoding scheme * in which the document entity is expressed. * * @param nodeHandle The node id, which can be any valid node handle. * @return the document encoding String object. */	TokenNameCOMMENT_JAVADOC	 Return the name of the character encoding scheme in which the document entity is expressed. * @param nodeHandle The node id, which can be any valid node handle. @return the document encoding String object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentEncoding	TokenNameIdentifier	 get Document Encoding
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
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
/** * Return a string representing the XML version of the document. This * property is derived from the XML declaration optionally present at the * beginning of the document entity, and has no value if there is no XML * declaration. * * @param documentHandle the document handle * * @return the document version String object */	TokenNameCOMMENT_JAVADOC	 Return a string representing the XML version of the document. This property is derived from the XML declaration optionally present at the beginning of the document entity, and has no value if there is no XML declaration. * @param documentHandle the document handle * @return the document version String object 
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
/** * Return an indication of * whether the processor has read the complete DTD. Its value is a * boolean. If it is false, then certain properties (indicated in their * descriptions below) may be unknown. If it is true, those properties * are never unknown. * * @return <code>true</code> if all declarations were processed {}; * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Return an indication of whether the processor has read the complete DTD. Its value is a boolean. If it is false, then certain properties (indicated in their descriptions below) may be unknown. If it is true, those properties are never unknown. * @return <code>true</code> if all declarations were processed {}; <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getDocumentAllDeclarationsProcessed	TokenNameIdentifier	 get Document All Declarations Processed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A document type declaration information item has the following properties: * * 1. [system identifier] The system identifier of the external subset, if * it exists. Otherwise this property has no value. * * @return the system identifier String object, or null if there is none. */	TokenNameCOMMENT_JAVADOC	 A document type declaration information item has the following properties: * 1. [system identifier] The system identifier of the external subset, if it exists. Otherwise this property has no value. * @return the system identifier String object, or null if there is none. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentTypeDeclarationSystemIdentifier	TokenNameIdentifier	 get Document Type Declaration System Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the public identifier of the external subset, * normalized as described in 4.2.2 External Entities [XML]. If there is * no external subset or if it has no public identifier, this property * has no value. * * @return the public identifier String object, or null if there is none. */	TokenNameCOMMENT_JAVADOC	 Return the public identifier of the external subset, normalized as described in 4.2.2 External Entities [XML]. If there is no external subset or if it has no public identifier, this property has no value. * @return the public identifier String object, or null if there is none. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentTypeDeclarationPublicIdentifier	TokenNameIdentifier	 get Document Type Declaration Public Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the <code>Element</code> whose <code>ID</code> is given by * <code>elementId</code>. If no such element exists, returns * <code>DTM.NULL</code>. Behavior is not defined if more than one element * has this <code>ID</code>. Attributes (including those * with the name "ID") are not of type ID unless so defined by DTD/Schema * information available to the DTM implementation. * Implementations that do not know whether attributes are of type ID or * not are expected to return <code>DTM.NULL</code>. * * <p>%REVIEW% Presumably IDs are still scoped to a single document, * and this operation searches only within a single document, right? * Wouldn't want collisions between DTMs in the same process.</p> * * @param elementId The unique <code>id</code> value for an element. * @return The handle of the matching element. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>Element</code> whose <code>ID</code> is given by <code>elementId</code>. If no such element exists, returns <code>DTM.NULL</code>. Behavior is not defined if more than one element has this <code>ID</code>. Attributes (including those with the name "ID") are not of type ID unless so defined by DTD/Schema information available to the DTM implementation. Implementations that do not know whether attributes are of type ID or not are expected to return <code>DTM.NULL</code>. * <p>%REVIEW% Presumably IDs are still scoped to a single document, and this operation searches only within a single document, right? Wouldn't want collisions between DTMs in the same process.</p> * @param elementId The unique <code>id</code> value for an element. @return The handle of the matching element. 
public	TokenNamepublic	
int	TokenNameint	
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementId	TokenNameIdentifier	 element Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The getUnparsedEntityURI function returns the URI of the unparsed * entity with the specified name in the same document as the context * node (see [3.3 Unparsed Entities]). It returns the empty string if * there is no such entity. * <p> * XML processors may choose to use the System Identifier (if one * is provided) to resolve the entity, rather than the URI in the * Public Identifier. The details are dependent on the processor, and * we would have to support some form of plug-in resolver to handle * this properly. Currently, we simply return the System Identifier if * present, and hope that it a usable URI or that our caller can * map it to one. * TODO: Resolve Public Identifiers... or consider changing function name. * <p> * If we find a relative URI * reference, XML expects it to be resolved in terms of the base URI * of the document. The DOM doesn't do that for us, and it isn't * entirely clear whether that should be done here; currently that's * pushed up to a higher level of our application. (Note that DOM Level * 1 didn't store the document's base URI.) * TODO: Consider resolving Relative URIs. * <p> * (The DOM's statement that "An XML processor may choose to * completely expand entities before the structure model is passed * to the DOM" refers only to parsed entities, not unparsed, and hence * doesn't affect this function.) * * @param name A string containing the Entity Name of the unparsed * entity. * * @return String containing the URI of the Unparsed Entity, or an * empty string if no such entity exists. */	TokenNameCOMMENT_JAVADOC	 The getUnparsedEntityURI function returns the URI of the unparsed entity with the specified name in the same document as the context node (see [3.3 Unparsed Entities]). It returns the empty string if there is no such entity. <p> XML processors may choose to use the System Identifier (if one is provided) to resolve the entity, rather than the URI in the Public Identifier. The details are dependent on the processor, and we would have to support some form of plug-in resolver to handle this properly. Currently, we simply return the System Identifier if present, and hope that it a usable URI or that our caller can map it to one. TODO: Resolve Public Identifiers... or consider changing function name. <p> If we find a relative URI reference, XML expects it to be resolved in terms of the base URI of the document. The DOM doesn't do that for us, and it isn't entirely clear whether that should be done here; currently that's pushed up to a higher level of our application. (Note that DOM Level 1 didn't store the document's base URI.) TODO: Consider resolving Relative URIs. <p> (The DOM's statement that "An XML processor may choose to completely expand entities before the structure model is passed to the DOM" refers only to parsed entities, not unparsed, and hence doesn't affect this function.) * @param name A string containing the Entity Name of the unparsed entity. * @return String containing the URI of the Unparsed Entity, or an empty string if no such entity exists. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUnparsedEntityURI	TokenNameIdentifier	 get Unparsed Entity URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ============== Boolean methods ================ 	TokenNameCOMMENT_LINE	============== Boolean methods ================ 
/** * Return true if the xsl:strip-space or xsl:preserve-space was processed * during construction of the DTM document. * * <p>%REVEIW% Presumes a 1:1 mapping from DTM to Document, since * we aren't saying which Document to query...?</p> */	TokenNameCOMMENT_JAVADOC	 Return true if the xsl:strip-space or xsl:preserve-space was processed during construction of the DTM document. * <p>%REVEIW% Presumes a 1:1 mapping from DTM to Document, since we aren't saying which Document to query...?</p> 
public	TokenNamepublic	
boolean	TokenNameboolean	
supportsPreStripping	TokenNameIdentifier	 supports Pre Stripping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Figure out whether nodeHandle2 should be considered as being later * in the document than nodeHandle1, in Document Order as defined * by the XPath model. This may not agree with the ordering defined * by other XML applications. * <p> * There are some cases where ordering isn't defined, and neither are * the results of this function -- though we'll generally return true. * * TODO: Make sure this does the right thing with attribute nodes!!! * * @param nodeHandle1 DOM Node to perform position comparison on. * @param nodeHandle2 DOM Node to perform position comparison on . * * @return false if node2 comes before node1, otherwise return true. * You can think of this as * <code>(node1.documentOrderPosition &lt;= node2.documentOrderPosition)</code>. */	TokenNameCOMMENT_JAVADOC	 Figure out whether nodeHandle2 should be considered as being later in the document than nodeHandle1, in Document Order as defined by the XPath model. This may not agree with the ordering defined by other XML applications. <p> There are some cases where ordering isn't defined, and neither are the results of this function -- though we'll generally return true. * TODO: Make sure this does the right thing with attribute nodes!!! * @param nodeHandle1 DOM Node to perform position comparison on. @param nodeHandle2 DOM Node to perform position comparison on . * @return false if node2 comes before node1, otherwise return true. You can think of this as <code>(node1.documentOrderPosition &lt;= node2.documentOrderPosition)</code>. 
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
return	TokenNamereturn	
false	TokenNamefalse	
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
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * 5. [specified] A flag indicating whether this attribute was actually * specified in the start-tag of its element, or was defaulted from the * DTD. * * @param attributeHandle the attribute handle * @return <code>true</code> if the attribute was specified; * <code>false</code> if it was defaulted. */	TokenNameCOMMENT_JAVADOC	 5. [specified] A flag indicating whether this attribute was actually specified in the start-tag of its element, or was defaulted from the DTD. * @param attributeHandle the attribute handle @return <code>true</code> if the attribute was specified; <code>false</code> if it was defaulted. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAttributeSpecified	TokenNameIdentifier	 is Attribute Specified
(	TokenNameLPAREN	
int	TokenNameint	
attributeHandle	TokenNameIdentifier	 attribute Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ========== Direct SAX Dispatch, for optimization purposes ======== 	TokenNameCOMMENT_LINE	========== Direct SAX Dispatch, for optimization purposes ======== 
/** * Directly call the * characters method on the passed ContentHandler for the * string-value of the given node (see http://www.w3.org/TR/xpath#data-model * for the definition of a node's string-value). Multiple calls to the * ContentHandler's characters methods may well occur for a single call to * this method. * * @param nodeHandle The node ID. * @param ch A non-null reference to a ContentHandler. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Directly call the characters method on the passed ContentHandler for the string-value of the given node (see http://www.w3.org/TR/xpath#data-model for the definition of a node's string-value). Multiple calls to the ContentHandler's characters methods may well occur for a single call to this method. * @param nodeHandle The node ID. @param ch A non-null reference to a ContentHandler. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Directly create SAX parser events from a subtree. * * @param nodeHandle The node ID. * @param ch A non-null reference to a ContentHandler. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Directly create SAX parser events from a subtree. * @param nodeHandle The node ID. @param ch A non-null reference to a ContentHandler. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
}	TokenNameRBRACE	
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
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ==== Construction methods (may not be supported by some implementations!) ===== 	TokenNameCOMMENT_LINE	==== Construction methods (may not be supported by some implementations!) ===== 
// %REVIEW% jjk: These probably aren't the right API. At the very least 	TokenNameCOMMENT_LINE	%REVIEW% jjk: These probably aren't the right API. At the very least 
// they need to deal with current-insertion-location and end-element 	TokenNameCOMMENT_LINE	they need to deal with current-insertion-location and end-element 
// issues. 	TokenNameCOMMENT_LINE	issues. 
/** * Append a child to the end of the child list of the current node. Please note that the node * is always cloned if it is owned by another document. * * <p>%REVIEW% "End of the document" needs to be defined more clearly. * Does it become the last child of the Document? Of the root element?</p> * * @param newChild Must be a valid new node handle. * @param clone true if the child should be cloned into the document. * @param cloneDepth if the clone argument is true, specifies that the * clone should include all it's children. */	TokenNameCOMMENT_JAVADOC	 Append a child to the end of the child list of the current node. Please note that the node is always cloned if it is owned by another document. * <p>%REVIEW% "End of the document" needs to be defined more clearly. Does it become the last child of the Document? Of the root element?</p> * @param newChild Must be a valid new node handle. @param clone true if the child should be cloned into the document. @param cloneDepth if the clone argument is true, specifies that the clone should include all it's children. 
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
boolean	TokenNameboolean	
sameDoc	TokenNameIdentifier	 same Doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
&	TokenNameAND	
DOCHANDLE_MASK	TokenNameIdentifier	 DOCHANDLE  MASK
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
m_docHandle	TokenNameIdentifier	 m doc Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
||	TokenNameOR_OR	
!	TokenNameNOT	
sameDoc	TokenNameIdentifier	 same Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Append a text node child that will be constructed from a string, * to the end of the document. * * <p>%REVIEW% "End of the document" needs to be defined more clearly. * Does it become the last child of the Document? Of the root element?</p> * * @param str Non-null reference to a string. */	TokenNameCOMMENT_JAVADOC	 Append a text node child that will be constructed from a string, to the end of the document. * <p>%REVIEW% "End of the document" needs to be defined more clearly. Does it become the last child of the Document? Of the root element?</p> * @param str Non-null reference to a string. 
public	TokenNamepublic	
void	TokenNamevoid	
appendTextChild	TokenNameIdentifier	 append Text Child
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ###shs Think more about how this differs from createTextNode 	TokenNameCOMMENT_LINE	###shs Think more about how this differs from createTextNode 
//%TBD% 	TokenNameCOMMENT_LINE	%TBD% 
}	TokenNameRBRACE	
//================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
// ==== BUILDER methods ==== 	TokenNameCOMMENT_LINE	==== BUILDER methods ==== 
// %TBD% jjk: SHOULD PROBABLY BE INLINED, unless we want to support 	TokenNameCOMMENT_LINE	%TBD% jjk: SHOULD PROBABLY BE INLINED, unless we want to support 
// both SAX1 and SAX2 and share this logic between them. 	TokenNameCOMMENT_LINE	both SAX1 and SAX2 and share this logic between them. 
/** Append a text child at the current insertion point. Assumes that the * actual content of the text has previously been appended to the m_char * buffer (shared with the builder). * * @param m_char_current_start int Starting offset of node's content in m_char. * @param contentLength int Length of node's content in m_char. * */	TokenNameCOMMENT_JAVADOC	 Append a text child at the current insertion point. Assumes that the actual content of the text has previously been appended to the m_char buffer (shared with the builder). * @param m_char_current_start int Starting offset of node's content in m_char. @param contentLength int Length of node's content in m_char. 
void	TokenNamevoid	
appendTextChild	TokenNameIdentifier	 append Text Child
(	TokenNameLPAREN	
int	TokenNameint	
m_char_current_start	TokenNameIdentifier	 m char current start
,	TokenNameCOMMA	
int	TokenNameint	
contentLength	TokenNameIdentifier	 content Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create a Text Node 	TokenNameCOMMENT_LINE	create a Text Node 
// %TBD% may be possible to combine with appendNode()to replace the next chunk of code 	TokenNameCOMMENT_LINE	%TBD% may be possible to combine with appendNode()to replace the next chunk of code 
int	TokenNameint	
w0	TokenNameIdentifier	 w0
=	TokenNameEQUAL	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
;	TokenNameSEMICOLON	
// W1: Parent 	TokenNameCOMMENT_LINE	W1: Parent 
int	TokenNameint	
w1	TokenNameIdentifier	 w1
=	TokenNameEQUAL	
currentParent	TokenNameIdentifier	 current Parent
;	TokenNameSEMICOLON	
// W2: Start position within m_char 	TokenNameCOMMENT_LINE	W2: Start position within m_char 
int	TokenNameint	
w2	TokenNameIdentifier	 w2
=	TokenNameEQUAL	
m_char_current_start	TokenNameIdentifier	 m char current start
;	TokenNameSEMICOLON	
// W3: Length of the full string 	TokenNameCOMMENT_LINE	W3: Length of the full string 
int	TokenNameint	
w3	TokenNameIdentifier	 w3
=	TokenNameEQUAL	
contentLength	TokenNameIdentifier	 content Length
;	TokenNameSEMICOLON	
int	TokenNameint	
ourslot	TokenNameIdentifier	 ourslot
=	TokenNameEQUAL	
appendNode	TokenNameIdentifier	 append Node
(	TokenNameLPAREN	
w0	TokenNameIdentifier	 w0
,	TokenNameCOMMA	
w1	TokenNameIdentifier	 w1
,	TokenNameCOMMA	
w2	TokenNameIdentifier	 w2
,	TokenNameCOMMA	
w3	TokenNameIdentifier	 w3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
ourslot	TokenNameIdentifier	 ourslot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Append a comment child at the current insertion point. Assumes that the * actual content of the comment has previously been appended to the m_char * buffer (shared with the builder). * * @param m_char_current_start int Starting offset of node's content in m_char. * @param contentLength int Length of node's content in m_char. * */	TokenNameCOMMENT_JAVADOC	 Append a comment child at the current insertion point. Assumes that the actual content of the comment has previously been appended to the m_char buffer (shared with the builder). * @param m_char_current_start int Starting offset of node's content in m_char. @param contentLength int Length of node's content in m_char. 
void	TokenNamevoid	
appendComment	TokenNameIdentifier	 append Comment
(	TokenNameLPAREN	
int	TokenNameint	
m_char_current_start	TokenNameIdentifier	 m char current start
,	TokenNameCOMMA	
int	TokenNameint	
contentLength	TokenNameIdentifier	 content Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create a Comment Node 	TokenNameCOMMENT_LINE	create a Comment Node 
// %TBD% may be possible to combine with appendNode()to replace the next chunk of code 	TokenNameCOMMENT_LINE	%TBD% may be possible to combine with appendNode()to replace the next chunk of code 
int	TokenNameint	
w0	TokenNameIdentifier	 w0
=	TokenNameEQUAL	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
;	TokenNameSEMICOLON	
// W1: Parent 	TokenNameCOMMENT_LINE	W1: Parent 
int	TokenNameint	
w1	TokenNameIdentifier	 w1
=	TokenNameEQUAL	
currentParent	TokenNameIdentifier	 current Parent
;	TokenNameSEMICOLON	
// W2: Start position within m_char 	TokenNameCOMMENT_LINE	W2: Start position within m_char 
int	TokenNameint	
w2	TokenNameIdentifier	 w2
=	TokenNameEQUAL	
m_char_current_start	TokenNameIdentifier	 m char current start
;	TokenNameSEMICOLON	
// W3: Length of the full string 	TokenNameCOMMENT_LINE	W3: Length of the full string 
int	TokenNameint	
w3	TokenNameIdentifier	 w3
=	TokenNameEQUAL	
contentLength	TokenNameIdentifier	 content Length
;	TokenNameSEMICOLON	
int	TokenNameint	
ourslot	TokenNameIdentifier	 ourslot
=	TokenNameEQUAL	
appendNode	TokenNameIdentifier	 append Node
(	TokenNameLPAREN	
w0	TokenNameIdentifier	 w0
,	TokenNameCOMMA	
w1	TokenNameIdentifier	 w1
,	TokenNameCOMMA	
w2	TokenNameIdentifier	 w2
,	TokenNameCOMMA	
w3	TokenNameIdentifier	 w3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
ourslot	TokenNameIdentifier	 ourslot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Append an Element child at the current insertion point. This * Element then _becomes_ the insertion point; subsequent appends * become its lastChild until an appendEndElement() call is made. * * Assumes that the symbols (local name, namespace URI and prefix) * have already been added to the pools * * Note that this _only_ handles the Element node itself. Attrs and * namespace nodes are unbundled in the ContentHandler layer * and appended separately. * * @param namespaceIndex: Index within the namespaceURI string pool * @param localNameIndex Index within the local name string pool * @param prefixIndex: Index within the prefix string pool * */	TokenNameCOMMENT_JAVADOC	 Append an Element child at the current insertion point. This Element then _becomes_ the insertion point; subsequent appends become its lastChild until an appendEndElement() call is made. * Assumes that the symbols (local name, namespace URI and prefix) have already been added to the pools * Note that this _only_ handles the Element node itself. Attrs and namespace nodes are unbundled in the ContentHandler layer and appended separately. * @param namespaceIndex: Index within the namespaceURI string pool @param localNameIndex Index within the local name string pool @param prefixIndex: Index within the prefix string pool 
void	TokenNamevoid	
appendStartElement	TokenNameIdentifier	 append Start Element
(	TokenNameLPAREN	
int	TokenNameint	
namespaceIndex	TokenNameIdentifier	 namespace Index
,	TokenNameCOMMA	
int	TokenNameint	
localNameIndex	TokenNameIdentifier	 local Name Index
,	TokenNameCOMMA	
int	TokenNameint	
prefixIndex	TokenNameIdentifier	 prefix Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// do document root node creation here on the first element, create nodes for 	TokenNameCOMMENT_LINE	do document root node creation here on the first element, create nodes for 
// this element and its attributes, store the element, namespace, and attritute 	TokenNameCOMMENT_LINE	this element and its attributes, store the element, namespace, and attritute 
// name indexes to the nodes array, keep track of the current node and parent 	TokenNameCOMMENT_LINE	name indexes to the nodes array, keep track of the current node and parent 
// element used 	TokenNameCOMMENT_LINE	element used 
// W0 High: Namespace Low: Node Type 	TokenNameCOMMENT_LINE	W0 High: Namespace Low: Node Type 
int	TokenNameint	
w0	TokenNameIdentifier	 w0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
namespaceIndex	TokenNameIdentifier	 namespace Index
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
// W1: Parent 	TokenNameCOMMENT_LINE	W1: Parent 
int	TokenNameint	
w1	TokenNameIdentifier	 w1
=	TokenNameEQUAL	
currentParent	TokenNameIdentifier	 current Parent
;	TokenNameSEMICOLON	
// W2: Next (initialized as 0) 	TokenNameCOMMENT_LINE	W2: Next (initialized as 0) 
int	TokenNameint	
w2	TokenNameIdentifier	 w2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// W3: Tagname high: prefix Low: local name 	TokenNameCOMMENT_LINE	W3: Tagname high: prefix Low: local name 
int	TokenNameint	
w3	TokenNameIdentifier	 w3
=	TokenNameEQUAL	
localNameIndex	TokenNameIdentifier	 local Name Index
|	TokenNameOR	
prefixIndex	TokenNameIdentifier	 prefix Index
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/**/	TokenNameCOMMENT_BLOCK	 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"set w3="	TokenNameStringLiteral	set w3=
+	TokenNamePLUS	
w3	TokenNameIdentifier	 w3
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
(	TokenNameLPAREN	
w3	TokenNameIdentifier	 w3
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
(	TokenNameLPAREN	
w3	TokenNameIdentifier	 w3
&	TokenNameAND	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//int ourslot = nodes.appendSlot(w0, w1, w2, w3); 	TokenNameCOMMENT_LINE	int ourslot = nodes.appendSlot(w0, w1, w2, w3); 
int	TokenNameint	
ourslot	TokenNameIdentifier	 ourslot
=	TokenNameEQUAL	
appendNode	TokenNameIdentifier	 append Node
(	TokenNameLPAREN	
w0	TokenNameIdentifier	 w0
,	TokenNameCOMMA	
w1	TokenNameIdentifier	 w1
,	TokenNameCOMMA	
w2	TokenNameIdentifier	 w2
,	TokenNameCOMMA	
w3	TokenNameIdentifier	 w3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentParent	TokenNameIdentifier	 current Parent
=	TokenNameEQUAL	
ourslot	TokenNameIdentifier	 ourslot
;	TokenNameSEMICOLON	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// set the root element pointer when creating the first element node 	TokenNameCOMMENT_LINE	set the root element pointer when creating the first element node 
if	TokenNameif	
(	TokenNameLPAREN	
m_docElement	TokenNameIdentifier	 m doc Element
==	TokenNameEQUAL_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
m_docElement	TokenNameIdentifier	 m doc Element
=	TokenNameEQUAL	
ourslot	TokenNameIdentifier	 ourslot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Append a Namespace Declaration child at the current insertion point. * Assumes that the symbols (namespace URI and prefix) have already been * added to the pools * * @param prefixIndex: Index within the prefix string pool * @param namespaceIndex: Index within the namespaceURI string pool * @param isID: If someone really insists on writing a bad DTD, it is * theoretically possible for a namespace declaration to also be declared * as being a node ID. I don't really want to support that stupidity, * but I'm not sure we can refuse to accept it. * */	TokenNameCOMMENT_JAVADOC	 Append a Namespace Declaration child at the current insertion point. Assumes that the symbols (namespace URI and prefix) have already been added to the pools * @param prefixIndex: Index within the prefix string pool @param namespaceIndex: Index within the namespaceURI string pool @param isID: If someone really insists on writing a bad DTD, it is theoretically possible for a namespace declaration to also be declared as being a node ID. I don't really want to support that stupidity, but I'm not sure we can refuse to accept it. 
void	TokenNamevoid	
appendNSDeclaration	TokenNameIdentifier	 append NS Declaration
(	TokenNameLPAREN	
int	TokenNameint	
prefixIndex	TokenNameIdentifier	 prefix Index
,	TokenNameCOMMA	
int	TokenNameint	
namespaceIndex	TokenNameIdentifier	 namespace Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isID	TokenNameIdentifier	 is ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% I'm assigning this node the "namespace for namespaces" 	TokenNameCOMMENT_LINE	%REVIEW% I'm assigning this node the "namespace for namespaces" 
// which the DOM defined. It is expected that the Namespace spec will 	TokenNameCOMMENT_LINE	which the DOM defined. It is expected that the Namespace spec will 
// adopt this as official. It isn't strictly needed since it's implied 	TokenNameCOMMENT_LINE	adopt this as official. It isn't strictly needed since it's implied 
// by the nodetype, but for now... 	TokenNameCOMMENT_LINE	by the nodetype, but for now... 
// %REVIEW% Prefix need not be recorded; it's implied too. But 	TokenNameCOMMENT_LINE	%REVIEW% Prefix need not be recorded; it's implied too. But 
// recording it might simplify the design. 	TokenNameCOMMENT_LINE	recording it might simplify the design. 
// %TBD% isID is not currently honored. 	TokenNameCOMMENT_LINE	%TBD% isID is not currently honored. 
final	TokenNamefinal	
int	TokenNameint	
namespaceForNamespaces	TokenNameIdentifier	 namespace For Namespaces
=	TokenNameEQUAL	
m_nsNames	TokenNameIdentifier	 m ns Names
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// W0 High: Namespace Low: Node Type 	TokenNameCOMMENT_LINE	W0 High: Namespace Low: Node Type 
int	TokenNameint	
w0	TokenNameIdentifier	 w0
=	TokenNameEQUAL	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
|	TokenNameOR	
(	TokenNameLPAREN	
m_nsNames	TokenNameIdentifier	 m ns Names
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// W1: Parent 	TokenNameCOMMENT_LINE	W1: Parent 
int	TokenNameint	
w1	TokenNameIdentifier	 w1
=	TokenNameEQUAL	
currentParent	TokenNameIdentifier	 current Parent
;	TokenNameSEMICOLON	
// W2: CURRENTLY UNUSED -- It's next-sib in attrs, but we have no kids. 	TokenNameCOMMENT_LINE	W2: CURRENTLY UNUSED -- It's next-sib in attrs, but we have no kids. 
int	TokenNameint	
w2	TokenNameIdentifier	 w2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// W3: namespace name 	TokenNameCOMMENT_LINE	W3: namespace name 
int	TokenNameint	
w3	TokenNameIdentifier	 w3
=	TokenNameEQUAL	
namespaceIndex	TokenNameIdentifier	 namespace Index
;	TokenNameSEMICOLON	
// Add node 	TokenNameCOMMENT_LINE	Add node 
int	TokenNameint	
ourslot	TokenNameIdentifier	 ourslot
=	TokenNameEQUAL	
appendNode	TokenNameIdentifier	 append Node
(	TokenNameLPAREN	
w0	TokenNameIdentifier	 w0
,	TokenNameCOMMA	
w1	TokenNameIdentifier	 w1
,	TokenNameCOMMA	
w2	TokenNameIdentifier	 w2
,	TokenNameCOMMA	
w3	TokenNameIdentifier	 w3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
ourslot	TokenNameIdentifier	 ourslot
;	TokenNameSEMICOLON	
// Should attributes be previous siblings 	TokenNameCOMMENT_LINE	Should attributes be previous siblings 
previousSiblingWasParent	TokenNameIdentifier	 previous Sibling Was Parent
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
//(m_docHandle | ourslot); 	TokenNameCOMMENT_LINE	(m_docHandle | ourslot); 
}	TokenNameRBRACE	
/** Append an Attribute child at the current insertion * point. Assumes that the symbols (namespace URI, local name, and * prefix) have already been added to the pools, and that the content has * already been appended to m_char. Note that the attribute's content has * been flattened into a single string; DTM does _NOT_ attempt to model * the details of entity references within attribute values. * * @param namespaceIndex int Index within the namespaceURI string pool * @param localNameIndex int Index within the local name string pool * @param prefixIndex int Index within the prefix string pool * @param isID boolean True if this attribute was declared as an ID * (for use in supporting getElementByID). * @param m_char_current_start int Starting offset of node's content in m_char. * @param contentLength int Length of node's content in m_char. * */	TokenNameCOMMENT_JAVADOC	 Append an Attribute child at the current insertion point. Assumes that the symbols (namespace URI, local name, and prefix) have already been added to the pools, and that the content has already been appended to m_char. Note that the attribute's content has been flattened into a single string; DTM does _NOT_ attempt to model the details of entity references within attribute values. * @param namespaceIndex int Index within the namespaceURI string pool @param localNameIndex int Index within the local name string pool @param prefixIndex int Index within the prefix string pool @param isID boolean True if this attribute was declared as an ID (for use in supporting getElementByID). @param m_char_current_start int Starting offset of node's content in m_char. @param contentLength int Length of node's content in m_char. 
void	TokenNamevoid	
appendAttribute	TokenNameIdentifier	 append Attribute
(	TokenNameLPAREN	
int	TokenNameint	
namespaceIndex	TokenNameIdentifier	 namespace Index
,	TokenNameCOMMA	
int	TokenNameint	
localNameIndex	TokenNameIdentifier	 local Name Index
,	TokenNameCOMMA	
int	TokenNameint	
prefixIndex	TokenNameIdentifier	 prefix Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isID	TokenNameIdentifier	 is ID
,	TokenNameCOMMA	
int	TokenNameint	
m_char_current_start	TokenNameIdentifier	 m char current start
,	TokenNameCOMMA	
int	TokenNameint	
contentLength	TokenNameIdentifier	 content Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %TBD% isID is not currently honored. 	TokenNameCOMMENT_LINE	%TBD% isID is not currently honored. 
// W0 High: Namespace Low: Node Type 	TokenNameCOMMENT_LINE	W0 High: Namespace Low: Node Type 
int	TokenNameint	
w0	TokenNameIdentifier	 w0
=	TokenNameEQUAL	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
|	TokenNameOR	
namespaceIndex	TokenNameIdentifier	 namespace Index
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// W1: Parent 	TokenNameCOMMENT_LINE	W1: Parent 
int	TokenNameint	
w1	TokenNameIdentifier	 w1
=	TokenNameEQUAL	
currentParent	TokenNameIdentifier	 current Parent
;	TokenNameSEMICOLON	
// W2: Next (not yet resolved) 	TokenNameCOMMENT_LINE	W2: Next (not yet resolved) 
int	TokenNameint	
w2	TokenNameIdentifier	 w2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// W3: Tagname high: prefix Low: local name 	TokenNameCOMMENT_LINE	W3: Tagname high: prefix Low: local name 
int	TokenNameint	
w3	TokenNameIdentifier	 w3
=	TokenNameEQUAL	
localNameIndex	TokenNameIdentifier	 local Name Index
|	TokenNameOR	
prefixIndex	TokenNameIdentifier	 prefix Index
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/**/	TokenNameCOMMENT_BLOCK	 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"set w3="	TokenNameStringLiteral	set w3=
+	TokenNamePLUS	
w3	TokenNameIdentifier	 w3
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
(	TokenNameLPAREN	
w3	TokenNameIdentifier	 w3
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
(	TokenNameLPAREN	
w3	TokenNameIdentifier	 w3
&	TokenNameAND	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add node 	TokenNameCOMMENT_LINE	Add node 
int	TokenNameint	
ourslot	TokenNameIdentifier	 ourslot
=	TokenNameEQUAL	
appendNode	TokenNameIdentifier	 append Node
(	TokenNameLPAREN	
w0	TokenNameIdentifier	 w0
,	TokenNameCOMMA	
w1	TokenNameIdentifier	 w1
,	TokenNameCOMMA	
w2	TokenNameIdentifier	 w2
,	TokenNameCOMMA	
w3	TokenNameIdentifier	 w3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
ourslot	TokenNameIdentifier	 ourslot
;	TokenNameSEMICOLON	
// Should attributes be previous siblings 	TokenNameCOMMENT_LINE	Should attributes be previous siblings 
// Attribute's content is currently appended as a Text Node 	TokenNameCOMMENT_LINE	Attribute's content is currently appended as a Text Node 
// W0: Node Type 	TokenNameCOMMENT_LINE	W0: Node Type 
w0	TokenNameIdentifier	 w0
=	TokenNameEQUAL	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
;	TokenNameSEMICOLON	
// W1: Parent 	TokenNameCOMMENT_LINE	W1: Parent 
w1	TokenNameIdentifier	 w1
=	TokenNameEQUAL	
ourslot	TokenNameIdentifier	 ourslot
;	TokenNameSEMICOLON	
// W2: Start Position within buffer 	TokenNameCOMMENT_LINE	W2: Start Position within buffer 
w2	TokenNameIdentifier	 w2
=	TokenNameEQUAL	
m_char_current_start	TokenNameIdentifier	 m char current start
;	TokenNameSEMICOLON	
// W3: Length 	TokenNameCOMMENT_LINE	W3: Length 
w3	TokenNameIdentifier	 w3
=	TokenNameEQUAL	
contentLength	TokenNameIdentifier	 content Length
;	TokenNameSEMICOLON	
appendNode	TokenNameIdentifier	 append Node
(	TokenNameLPAREN	
w0	TokenNameIdentifier	 w0
,	TokenNameCOMMA	
w1	TokenNameIdentifier	 w1
,	TokenNameCOMMA	
w2	TokenNameIdentifier	 w2
,	TokenNameCOMMA	
w3	TokenNameIdentifier	 w3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Attrs are Parents 	TokenNameCOMMENT_LINE	Attrs are Parents 
previousSiblingWasParent	TokenNameIdentifier	 previous Sibling Was Parent
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
//(m_docHandle | ourslot); 	TokenNameCOMMENT_LINE	(m_docHandle | ourslot); 
}	TokenNameRBRACE	
/** * This returns a stateless "traverser", that can navigate over an * XPath axis, though not in document order. * * @param axis One of Axes.ANCESTORORSELF, etc. * * @return A DTMAxisIterator, or null if the given axis isn't supported. */	TokenNameCOMMENT_JAVADOC	 This returns a stateless "traverser", that can navigate over an XPath axis, though not in document order. * @param axis One of Axes.ANCESTORORSELF, etc. * @return A DTMAxisIterator, or null if the given axis isn't supported. 
public	TokenNamepublic	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
getAxisTraverser	TokenNameIdentifier	 get Axis Traverser
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is a shortcut to the iterators that implement the * supported XPath axes (only namespace::) is not supported. * Returns a bare-bones iterator that must be initialized * with a start node (using iterator.setStartNode()). * * @param axis One of Axes.ANCESTORORSELF, etc. * * @return A DTMAxisIterator, or null if the given axis isn't supported. */	TokenNameCOMMENT_JAVADOC	 This is a shortcut to the iterators that implement the supported XPath axes (only namespace::) is not supported. Returns a bare-bones iterator that must be initialized with a start node (using iterator.setStartNode()). * @param axis One of Axes.ANCESTORORSELF, etc. * @return A DTMAxisIterator, or null if the given axis isn't supported. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getAxisIterator	TokenNameIdentifier	 get Axis Iterator
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %TBD% 	TokenNameCOMMENT_LINE	%TBD% 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an iterator that can navigate over an XPath Axis, predicated by * the extended type ID. * * * @param axis * @param type An extended type ID. * * @return A DTMAxisIterator, or null if the given axis isn't supported. */	TokenNameCOMMENT_JAVADOC	 Get an iterator that can navigate over an XPath Axis, predicated by the extended type ID. * @param axis @param type An extended type ID. * @return A DTMAxisIterator, or null if the given axis isn't supported. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getTypedAxisIterator	TokenNameIdentifier	 get Typed Axis Iterator
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %TBD% 	TokenNameCOMMENT_LINE	%TBD% 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Terminate the element currently acting as an insertion point. Subsequent * insertions will occur as the last child of this element's parent. * */	TokenNameCOMMENT_JAVADOC	 Terminate the element currently acting as an insertion point. Subsequent insertions will occur as the last child of this element's parent. 
void	TokenNamevoid	
appendEndElement	TokenNameIdentifier	 append End Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// pop up the stacks 	TokenNameCOMMENT_LINE	pop up the stacks 
if	TokenNameif	
(	TokenNameLPAREN	
previousSiblingWasParent	TokenNameIdentifier	 previous Sibling Was Parent
)	TokenNameRPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
writeEntry	TokenNameIdentifier	 write Entry
(	TokenNameLPAREN	
previousSibling	TokenNameIdentifier	 previous Sibling
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Pop parentage 	TokenNameCOMMENT_LINE	Pop parentage 
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
currentParent	TokenNameIdentifier	 current Parent
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
readSlot	TokenNameIdentifier	 read Slot
(	TokenNameLPAREN	
currentParent	TokenNameIdentifier	 current Parent
,	TokenNameCOMMA	
gotslot	TokenNameIdentifier	 gotslot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentParent	TokenNameIdentifier	 current Parent
=	TokenNameEQUAL	
gotslot	TokenNameIdentifier	 gotslot
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The element just being finished will be 	TokenNameCOMMENT_LINE	The element just being finished will be 
// the previous sibling for the next operation 	TokenNameCOMMENT_LINE	the previous sibling for the next operation 
previousSiblingWasParent	TokenNameIdentifier	 previous Sibling Was Parent
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Pop a level of namespace table 	TokenNameCOMMENT_LINE	Pop a level of namespace table 
// namespaceTable.removeLastElem(); 	TokenNameCOMMENT_LINE	namespaceTable.removeLastElem(); 
}	TokenNameRBRACE	
/** Starting a new document. Perform any resets/initialization * not already handled. * */	TokenNameCOMMENT_JAVADOC	 Starting a new document. Perform any resets/initialization not already handled. 
void	TokenNamevoid	
appendStartDocument	TokenNameIdentifier	 append Start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %TBD% reset slot 0 to indicate ChunkedIntArray reuse or wait for 	TokenNameCOMMENT_LINE	%TBD% reset slot 0 to indicate ChunkedIntArray reuse or wait for 
// the next initDocument(). 	TokenNameCOMMENT_LINE	the next initDocument(). 
m_docElement	TokenNameIdentifier	 m doc Element
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
// reset nodeHandle to the root of the actual dtm doc content 	TokenNameCOMMENT_LINE	reset nodeHandle to the root of the actual dtm doc content 
initDocument	TokenNameIdentifier	 init Document
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** All appends to this document have finished; do whatever final * cleanup is needed. * */	TokenNameCOMMENT_JAVADOC	 All appends to this document have finished; do whatever final cleanup is needed. 
void	TokenNamevoid	
appendEndDocument	TokenNameIdentifier	 append End Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// %TBD% may need to notice the last slot number and slot count to avoid 	TokenNameCOMMENT_LINE	%TBD% may need to notice the last slot number and slot count to avoid 
// residual data from provious use of this DTM 	TokenNameCOMMENT_LINE	residual data from provious use of this DTM 
}	TokenNameRBRACE	
/** * For the moment all the run time properties are ignored by this * class. * * @param property a <code>String</code> value * @param value an <code>Object</code> value */	TokenNameCOMMENT_JAVADOC	 For the moment all the run time properties are ignored by this class. * @param property a <code>String</code> value @param value an <code>Object</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Source information is not handled yet, so return * <code>null</code> here. * * @param node an <code>int</code> value * @return null */	TokenNameCOMMENT_JAVADOC	 Source information is not handled yet, so return <code>null</code> here. * @param node an <code>int</code> value @return null 
public	TokenNamepublic	
SourceLocator	TokenNameIdentifier	 Source Locator
getSourceLocatorFor	TokenNameIdentifier	 get Source Locator For
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
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
/** * Migrate a DTM built with an old DTMManager to a new DTMManager. * After the migration, the new DTMManager will treat the DTM as * one that is built by itself. * This is used to support DTM sharing between multiple transformations. * @param manager the DTMManager */	TokenNameCOMMENT_JAVADOC	 Migrate a DTM built with an old DTMManager to a new DTMManager. After the migration, the new DTMManager will treat the DTM as one that is built by itself. This is used to support DTM sharing between multiple transformations. @param manager the DTMManager 
public	TokenNamepublic	
void	TokenNamevoid	
migrateTo	TokenNameIdentifier	 migrate To
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
manager	TokenNameIdentifier	 manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
