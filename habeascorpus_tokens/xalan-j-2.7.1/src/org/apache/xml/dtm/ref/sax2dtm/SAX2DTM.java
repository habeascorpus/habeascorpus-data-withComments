/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SAX2DTM.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SAX2DTM.java 468653 2006-10-28 07:07:05Z minchau $ 
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
Source	TokenNameIdentifier	 Source
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
*	TokenNameMULTIPLY	
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
ref	TokenNameIdentifier	 ref
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
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
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
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * This class implements a DTM that tends to be optimized more for speed than * for compactness, that is constructed via SAX2 ContentHandler events. */	TokenNameCOMMENT_JAVADOC	 This class implements a DTM that tends to be optimized more for speed than for compactness, that is constructed via SAX2 ContentHandler events. 
public	TokenNamepublic	
class	TokenNameclass	
SAX2DTM	TokenNameIdentifier	 SA X2 DTM
extends	TokenNameextends	
DTMDefaultBaseIterators	TokenNameIdentifier	 DTM Default Base Iterators
implements	TokenNameimplements	
EntityResolver	TokenNameIdentifier	 Entity Resolver
,	TokenNameCOMMA	
DTDHandler	TokenNameIdentifier	 DTD Handler
,	TokenNameCOMMA	
ContentHandler	TokenNameIdentifier	 Content Handler
,	TokenNameCOMMA	
ErrorHandler	TokenNameIdentifier	 Error Handler
,	TokenNameCOMMA	
DeclHandler	TokenNameIdentifier	 Decl Handler
,	TokenNameCOMMA	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
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
/** * If we're building the model incrementally on demand, we need to * be able to tell the source when to send us more data. * * Note that if this has not been set, and you attempt to read ahead * of the current build point, we'll probably throw a null-pointer * exception. We could try to wait-and-retry instead, as a very poor * fallback, but that has all the known problems with multithreading * on multiprocessors and we Don't Want to Go There. * * @see setIncrementalSAXSource */	TokenNameCOMMENT_JAVADOC	 If we're building the model incrementally on demand, we need to be able to tell the source when to send us more data. * Note that if this has not been set, and you attempt to read ahead of the current build point, we'll probably throw a null-pointer exception. We could try to wait-and-retry instead, as a very poor fallback, but that has all the known problems with multithreading on multiprocessors and we Don't Want to Go There. * @see setIncrementalSAXSource 
private	TokenNameprivate	
IncrementalSAXSource	TokenNameIdentifier	 Incremental SAX Source
m_incrementalSAXSource	TokenNameIdentifier	 m incremental SAX Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * All the character content, including attribute values, are stored in * this buffer. * * %REVIEW% Should this have an option of being shared across DTMs? * Sequentially only; not threadsafe... Currently, I think not. * * %REVIEW% Initial size was pushed way down to reduce weight of RTFs. * pending reduction in number of RTF DTMs. Now that we're sharing a DTM * between RTFs, and tail-pruning... consider going back to the larger/faster. * * Made protected rather than private so SAX2RTFDTM can access it. */	TokenNameCOMMENT_JAVADOC	 All the character content, including attribute values, are stored in this buffer. * %REVIEW% Should this have an option of being shared across DTMs? Sequentially only; not threadsafe... Currently, I think not. * %REVIEW% Initial size was pushed way down to reduce weight of RTFs. pending reduction in number of RTF DTMs. Now that we're sharing a DTM between RTFs, and tail-pruning... consider going back to the larger/faster. * Made protected rather than private so SAX2RTFDTM can access it. 
//private FastStringBuffer m_chars = new FastStringBuffer(13, 13); 	TokenNameCOMMENT_LINE	private FastStringBuffer m_chars = new FastStringBuffer(13, 13); 
protected	TokenNameprotected	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
m_chars	TokenNameIdentifier	 m chars
;	TokenNameSEMICOLON	
/** This vector holds offset and length data. */	TokenNameCOMMENT_JAVADOC	 This vector holds offset and length data. 
protected	TokenNameprotected	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
m_data	TokenNameIdentifier	 m data
;	TokenNameSEMICOLON	
/** The parent stack, needed only for construction. * Made protected rather than private so SAX2RTFDTM can access it. */	TokenNameCOMMENT_JAVADOC	 The parent stack, needed only for construction. Made protected rather than private so SAX2RTFDTM can access it. 
transient	TokenNametransient	
protected	TokenNameprotected	
IntStack	TokenNameIdentifier	 Int Stack
m_parents	TokenNameIdentifier	 m parents
;	TokenNameSEMICOLON	
/** The current previous node, needed only for construction time. * Made protected rather than private so SAX2RTFDTM can access it. */	TokenNameCOMMENT_JAVADOC	 The current previous node, needed only for construction time. Made protected rather than private so SAX2RTFDTM can access it. 
transient	TokenNametransient	
protected	TokenNameprotected	
int	TokenNameint	
m_previous	TokenNameIdentifier	 m previous
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Namespace support, only relevent at construction time. * Made protected rather than private so SAX2RTFDTM can access it. */	TokenNameCOMMENT_JAVADOC	 Namespace support, only relevent at construction time. Made protected rather than private so SAX2RTFDTM can access it. 
transient	TokenNametransient	
protected	TokenNameprotected	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
/** Namespace support, only relevent at construction time. * Made protected rather than private so SAX2RTFDTM can access it. */	TokenNameCOMMENT_JAVADOC	 Namespace support, only relevent at construction time. Made protected rather than private so SAX2RTFDTM can access it. 
transient	TokenNametransient	
protected	TokenNameprotected	
IntStack	TokenNameIdentifier	 Int Stack
m_contextIndexes	TokenNameIdentifier	 m context Indexes
;	TokenNameSEMICOLON	
/** Type of next characters() event within text block in prgress. */	TokenNameCOMMENT_JAVADOC	 Type of next characters() event within text block in prgress. 
transient	TokenNametransient	
protected	TokenNameprotected	
int	TokenNameint	
m_textType	TokenNameIdentifier	 m text Type
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
;	TokenNameSEMICOLON	
/** * Type of coalesced text block. See logic in the characters() * method. */	TokenNameCOMMENT_JAVADOC	 Type of coalesced text block. See logic in the characters() method. 
transient	TokenNametransient	
protected	TokenNameprotected	
int	TokenNameint	
m_coalescedTextType	TokenNameIdentifier	 m coalesced Text Type
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
;	TokenNameSEMICOLON	
/** The SAX Document locator */	TokenNameCOMMENT_JAVADOC	 The SAX Document locator 
transient	TokenNametransient	
protected	TokenNameprotected	
Locator	TokenNameIdentifier	 Locator
m_locator	TokenNameIdentifier	 m locator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The SAX Document system-id */	TokenNameCOMMENT_JAVADOC	 The SAX Document system-id 
transient	TokenNametransient	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_systemId	TokenNameIdentifier	 m system Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** We are inside the DTD. This is used for ignoring comments. */	TokenNameCOMMENT_JAVADOC	 We are inside the DTD. This is used for ignoring comments. 
transient	TokenNametransient	
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_insideDTD	TokenNameIdentifier	 m inside DTD
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Tree Walker for dispatchToEvents. */	TokenNameCOMMENT_JAVADOC	 Tree Walker for dispatchToEvents. 
protected	TokenNameprotected	
DTMTreeWalker	TokenNameIdentifier	 DTM Tree Walker
m_walker	TokenNameIdentifier	 m walker
=	TokenNameEQUAL	
new	TokenNamenew	
DTMTreeWalker	TokenNameIdentifier	 DTM Tree Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** pool of string values that come as strings. */	TokenNameCOMMENT_JAVADOC	 pool of string values that come as strings. 
protected	TokenNameprotected	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
;	TokenNameSEMICOLON	
/** End document has been reached. * Made protected rather than private so SAX2RTFDTM can access it. */	TokenNameCOMMENT_JAVADOC	 End document has been reached. Made protected rather than private so SAX2RTFDTM can access it. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_endDocumentOccured	TokenNameIdentifier	 m end Document Occured
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Data or qualified name values, one array element for each node. */	TokenNameCOMMENT_JAVADOC	 Data or qualified name values, one array element for each node. 
protected	TokenNameprotected	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
;	TokenNameSEMICOLON	
/** * This table holds the ID string to node associations, for * XML IDs. */	TokenNameCOMMENT_JAVADOC	 This table holds the ID string to node associations, for XML IDs. 
protected	TokenNameprotected	
Hashtable	TokenNameIdentifier	 Hashtable
m_idAttributes	TokenNameIdentifier	 m id Attributes
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * fixed dom-style names. */	TokenNameCOMMENT_JAVADOC	 fixed dom-style names. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_fixednames	TokenNameIdentifier	 m fixednames
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
/** * Vector of entities. Each record is composed of four Strings: * publicId, systemID, notationName, and name. */	TokenNameCOMMENT_JAVADOC	 Vector of entities. Each record is composed of four Strings: publicId, systemID, notationName, and name. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_entities	TokenNameIdentifier	 m entities
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** m_entities public ID offset. */	TokenNameCOMMENT_JAVADOC	 m_entities public ID offset. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ENTITY_FIELD_PUBLICID	TokenNameIdentifier	 ENTITY  FIELD  PUBLICID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** m_entities system ID offset. */	TokenNameCOMMENT_JAVADOC	 m_entities system ID offset. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ENTITY_FIELD_SYSTEMID	TokenNameIdentifier	 ENTITY  FIELD  SYSTEMID
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** m_entities notation name offset. */	TokenNameCOMMENT_JAVADOC	 m_entities notation name offset. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ENTITY_FIELD_NOTATIONNAME	TokenNameIdentifier	 ENTITY  FIELD  NOTATIONNAME
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** m_entities name offset. */	TokenNameCOMMENT_JAVADOC	 m_entities name offset. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ENTITY_FIELD_NAME	TokenNameIdentifier	 ENTITY  FIELD  NAME
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Number of entries per record for m_entities. */	TokenNameCOMMENT_JAVADOC	 Number of entries per record for m_entities. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ENTITY_FIELDS_PER	TokenNameIdentifier	 ENTITY  FIELDS  PER
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The starting offset within m_chars for the text or * CDATA_SECTION node currently being acumulated, * or -1 if there is no text node in progress */	TokenNameCOMMENT_JAVADOC	 The starting offset within m_chars for the text or CDATA_SECTION node currently being acumulated, or -1 if there is no text node in progress 
protected	TokenNameprotected	
int	TokenNameint	
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Describes whether information about document source location * should be maintained or not. * * Made protected for access by SAX2RTFDTM. */	TokenNameCOMMENT_JAVADOC	 Describes whether information about document source location should be maintained or not. * Made protected for access by SAX2RTFDTM. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_useSourceLocationProperty	TokenNameIdentifier	 m use Source Location Property
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Made protected for access by SAX2RTFDTM. */	TokenNameCOMMENT_JAVADOC	 Made protected for access by SAX2RTFDTM. 
protected	TokenNameprotected	
StringVector	TokenNameIdentifier	 String Vector
m_sourceSystemId	TokenNameIdentifier	 m source System Id
;	TokenNameSEMICOLON	
/** Made protected for access by SAX2RTFDTM. */	TokenNameCOMMENT_JAVADOC	 Made protected for access by SAX2RTFDTM. 
protected	TokenNameprotected	
IntVector	TokenNameIdentifier	 Int Vector
m_sourceLine	TokenNameIdentifier	 m source Line
;	TokenNameSEMICOLON	
/** Made protected for access by SAX2RTFDTM. */	TokenNameCOMMENT_JAVADOC	 Made protected for access by SAX2RTFDTM. 
protected	TokenNameprotected	
IntVector	TokenNameIdentifier	 Int Vector
m_sourceColumn	TokenNameIdentifier	 m source Column
;	TokenNameSEMICOLON	
/** * Construct a SAX2DTM object using the default block size. * * @param mgr The DTMManager who owns this DTM. * @param source the JAXP 1.1 Source object for this DTM. * @param dtmIdentity The DTM identity ID for this DTM. * @param whiteSpaceFilter The white space filter for this DTM, which may * be null. * @param xstringfactory XMLString factory for creating character content. * @param doIndexing true if the caller considers it worth it to use * indexing schemes. */	TokenNameCOMMENT_JAVADOC	 Construct a SAX2DTM object using the default block size. * @param mgr The DTMManager who owns this DTM. @param source the JAXP 1.1 Source object for this DTM. @param dtmIdentity The DTM identity ID for this DTM. @param whiteSpaceFilter The white space filter for this DTM, which may be null. @param xstringfactory XMLString factory for creating character content. @param doIndexing true if the caller considers it worth it to use indexing schemes. 
public	TokenNamepublic	
SAX2DTM	TokenNameIdentifier	 SA X2 DTM
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
/** * Construct a SAX2DTM object ready to be constructed from SAX2 * ContentHandler events. * * @param mgr The DTMManager who owns this DTM. * @param source the JAXP 1.1 Source object for this DTM. * @param dtmIdentity The DTM identity ID for this DTM. * @param whiteSpaceFilter The white space filter for this DTM, which may * be null. * @param xstringfactory XMLString factory for creating character content. * @param doIndexing true if the caller considers it worth it to use * indexing schemes. * @param blocksize The block size of the DTM. * @param usePrevsib true if we want to build the previous sibling node array. * @param newNameTable true if we want to use a new ExpandedNameTable for this DTM. */	TokenNameCOMMENT_JAVADOC	 Construct a SAX2DTM object ready to be constructed from SAX2 ContentHandler events. * @param mgr The DTMManager who owns this DTM. @param source the JAXP 1.1 Source object for this DTM. @param dtmIdentity The DTM identity ID for this DTM. @param whiteSpaceFilter The white space filter for this DTM, which may be null. @param xstringfactory XMLString factory for creating character content. @param doIndexing true if the caller considers it worth it to use indexing schemes. @param blocksize The block size of the DTM. @param usePrevsib true if we want to build the previous sibling node array. @param newNameTable true if we want to use a new ExpandedNameTable for this DTM. 
public	TokenNamepublic	
SAX2DTM	TokenNameIdentifier	 SA X2 DTM
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
,	TokenNameCOMMA	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
usePrevsib	TokenNameIdentifier	 use Prevsib
,	TokenNameCOMMA	
newNameTable	TokenNameIdentifier	 new Name Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %OPT% Use smaller sizes for all internal storage units when 	TokenNameCOMMENT_LINE	%OPT% Use smaller sizes for all internal storage units when 
// the blocksize is small. This reduces the cost of creating an RTF. 	TokenNameCOMMENT_LINE	the blocksize is small. This reduces the cost of creating an RTF. 
if	TokenNameif	
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
<=	TokenNameLESS_EQUAL	
64	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_data	TokenNameIdentifier	 m data
=	TokenNameEQUAL	
new	TokenNamenew	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
DEFAULT_NUMBLOCKS_SMALL	TokenNameIdentifier	 DEFAULT  NUMBLOCKS  SMALL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
=	TokenNameEQUAL	
new	TokenNamenew	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
DEFAULT_NUMBLOCKS_SMALL	TokenNameIdentifier	 DEFAULT  NUMBLOCKS  SMALL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
=	TokenNameEQUAL	
new	TokenNamenew	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
(	TokenNameLPAREN	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_chars	TokenNameIdentifier	 m chars
=	TokenNameEQUAL	
new	TokenNamenew	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_contextIndexes	TokenNameIdentifier	 m context Indexes
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parents	TokenNameIdentifier	 m parents
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_data	TokenNameIdentifier	 m data
=	TokenNameEQUAL	
new	TokenNamenew	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
DEFAULT_NUMBLOCKS	TokenNameIdentifier	 DEFAULT  NUMBLOCKS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
=	TokenNameEQUAL	
new	TokenNamenew	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
DEFAULT_NUMBLOCKS	TokenNameIdentifier	 DEFAULT  NUMBLOCKS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
=	TokenNameEQUAL	
new	TokenNamenew	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_chars	TokenNameIdentifier	 m chars
=	TokenNameEQUAL	
new	TokenNamenew	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
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
}	TokenNameRBRACE	
// %REVIEW% Initial size pushed way down to reduce weight of RTFs 	TokenNameCOMMENT_LINE	%REVIEW% Initial size pushed way down to reduce weight of RTFs 
// (I'm not entirely sure 0 would work, so I'm playing it safe for now.) 	TokenNameCOMMENT_LINE	(I'm not entirely sure 0 would work, so I'm playing it safe for now.) 
//m_data = new SuballocatedIntVector(doIndexing ? (1024*2) : 512, 1024); 	TokenNameCOMMENT_LINE	m_data = new SuballocatedIntVector(doIndexing ? (1024*2) : 512, 1024); 
//m_data = new SuballocatedIntVector(blocksize); 	TokenNameCOMMENT_LINE	m_data = new SuballocatedIntVector(blocksize); 
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Need placeholder in case index into here must be <0. 	TokenNameCOMMENT_LINE	Need placeholder in case index into here must be <0. 
//m_dataOrQName = new SuballocatedIntVector(blocksize); 	TokenNameCOMMENT_LINE	m_dataOrQName = new SuballocatedIntVector(blocksize); 
// m_useSourceLocationProperty=org.apache.xalan.processor.TransformerFactoryImpl.m_source_location; 	TokenNameCOMMENT_LINE	m_useSourceLocationProperty=org.apache.xalan.processor.TransformerFactoryImpl.m_source_location; 
m_useSourceLocationProperty	TokenNameIdentifier	 m use Source Location Property
=	TokenNameEQUAL	
mgr	TokenNameIdentifier	 mgr
.	TokenNameDOT	
getSource_location	TokenNameIdentifier	 get Source location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
/** * Set whether information about document source location * should be maintained or not. */	TokenNameCOMMENT_JAVADOC	 Set whether information about document source location should be maintained or not. 
public	TokenNamepublic	
void	TokenNamevoid	
setUseSourceLocation	TokenNameIdentifier	 set Use Source Location
(	TokenNameLPAREN	
boolean	TokenNameboolean	
useSourceLocation	TokenNameIdentifier	 use Source Location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_useSourceLocationProperty	TokenNameIdentifier	 m use Source Location Property
=	TokenNameEQUAL	
useSourceLocation	TokenNameIdentifier	 use Source Location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the data or qualified name for the given node identity. * * @param identity The node identity. * * @return The data or qualified name, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Get the data or qualified name for the given node identity. * @param identity The node identity. * @return The data or qualified name, or DTM.NULL. 
protected	TokenNameprotected	
int	TokenNameint	
_dataOrQName	TokenNameIdentifier	 data Or Q Name
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
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
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
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Ask the CoRoutine parser to doTerminate and clear the reference. */	TokenNameCOMMENT_JAVADOC	 Ask the CoRoutine parser to doTerminate and clear the reference. 
public	TokenNamepublic	
void	TokenNamevoid	
clearCoRoutine	TokenNameIdentifier	 clear Co Routine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clearCoRoutine	TokenNameIdentifier	 clear Co Routine
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ask the CoRoutine parser to doTerminate and clear the reference. If * the CoRoutine parser has already been cleared, this will have no effect. * * @param callDoTerminate true of doTerminate should be called on the * coRoutine parser. */	TokenNameCOMMENT_JAVADOC	 Ask the CoRoutine parser to doTerminate and clear the reference. If the CoRoutine parser has already been cleared, this will have no effect. * @param callDoTerminate true of doTerminate should be called on the coRoutine parser. 
public	TokenNamepublic	
void	TokenNamevoid	
clearCoRoutine	TokenNameIdentifier	 clear Co Routine
(	TokenNameLPAREN	
boolean	TokenNameboolean	
callDoTerminate	TokenNameIdentifier	 call Do Terminate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_incrementalSAXSource	TokenNameIdentifier	 m incremental SAX Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
callDoTerminate	TokenNameIdentifier	 call Do Terminate
)	TokenNameRPAREN	
m_incrementalSAXSource	TokenNameIdentifier	 m incremental SAX Source
.	TokenNameDOT	
deliverMoreNodes	TokenNameIdentifier	 deliver More Nodes
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_incrementalSAXSource	TokenNameIdentifier	 m incremental SAX Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Bind a IncrementalSAXSource to this DTM. If we discover we need nodes * that have not yet been built, we will ask this object to send us more * events, and it will manage interactions with its data sources. * * Note that we do not actually build the IncrementalSAXSource, since we don't * know what source it's reading from, what thread that source will run in, * or when it will run. * * @param incrementalSAXSource The parser that we want to recieve events from * on demand. */	TokenNameCOMMENT_JAVADOC	 Bind a IncrementalSAXSource to this DTM. If we discover we need nodes that have not yet been built, we will ask this object to send us more events, and it will manage interactions with its data sources. * Note that we do not actually build the IncrementalSAXSource, since we don't know what source it's reading from, what thread that source will run in, or when it will run. * @param incrementalSAXSource The parser that we want to recieve events from on demand. 
public	TokenNamepublic	
void	TokenNamevoid	
setIncrementalSAXSource	TokenNameIdentifier	 set Incremental SAX Source
(	TokenNameLPAREN	
IncrementalSAXSource	TokenNameIdentifier	 Incremental SAX Source
incrementalSAXSource	TokenNameIdentifier	 incremental SAX Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Establish coroutine link so we can request more data 	TokenNameCOMMENT_LINE	Establish coroutine link so we can request more data 
// 	TokenNameCOMMENT_LINE	 
// Note: It's possible that some versions of IncrementalSAXSource may 	TokenNameCOMMENT_LINE	Note: It's possible that some versions of IncrementalSAXSource may 
// not actually use a CoroutineManager, and hence may not require 	TokenNameCOMMENT_LINE	not actually use a CoroutineManager, and hence may not require 
// that we obtain an Application Coroutine ID. (This relies on the 	TokenNameCOMMENT_LINE	that we obtain an Application Coroutine ID. (This relies on the 
// coroutine transaction details having been encapsulated in the 	TokenNameCOMMENT_LINE	coroutine transaction details having been encapsulated in the 
// IncrementalSAXSource.do...() methods.) 	TokenNameCOMMENT_LINE	IncrementalSAXSource.do...() methods.) 
m_incrementalSAXSource	TokenNameIdentifier	 m incremental SAX Source
=	TokenNameEQUAL	
incrementalSAXSource	TokenNameIdentifier	 incremental SAX Source
;	TokenNameSEMICOLON	
// Establish SAX-stream link so we can receive the requested data 	TokenNameCOMMENT_LINE	Establish SAX-stream link so we can receive the requested data 
incrementalSAXSource	TokenNameIdentifier	 incremental SAX Source
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incrementalSAXSource	TokenNameIdentifier	 incremental SAX Source
.	TokenNameDOT	
setLexicalHandler	TokenNameIdentifier	 set Lexical Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incrementalSAXSource	TokenNameIdentifier	 incremental SAX Source
.	TokenNameDOT	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Are the following really needed? incrementalSAXSource doesn't yet 	TokenNameCOMMENT_LINE	Are the following really needed? incrementalSAXSource doesn't yet 
// support them, and they're mostly no-ops here... 	TokenNameCOMMENT_LINE	support them, and they're mostly no-ops here... 
//incrementalSAXSource.setErrorHandler(this); 	TokenNameCOMMENT_LINE	incrementalSAXSource.setErrorHandler(this); 
//incrementalSAXSource.setDeclHandler(this); 	TokenNameCOMMENT_LINE	incrementalSAXSource.setDeclHandler(this); 
}	TokenNameRBRACE	
/** * getContentHandler returns "our SAX builder" -- the thing that * someone else should send SAX events to in order to extend this * DTM model. * * %REVIEW% Should this return null if constrution already done/begun? * * @return null if this model doesn't respond to SAX events, * "this" if the DTM object has a built-in SAX ContentHandler, * the IncrementalSAXSource if we're bound to one and should receive * the SAX stream via it for incremental build purposes... */	TokenNameCOMMENT_JAVADOC	 getContentHandler returns "our SAX builder" -- the thing that someone else should send SAX events to in order to extend this DTM model. * %REVIEW% Should this return null if constrution already done/begun? * @return null if this model doesn't respond to SAX events, "this" if the DTM object has a built-in SAX ContentHandler, the IncrementalSAXSource if we're bound to one and should receive the SAX stream via it for incremental build purposes... 
public	TokenNamepublic	
ContentHandler	TokenNameIdentifier	 Content Handler
getContentHandler	TokenNameIdentifier	 get Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_incrementalSAXSource	TokenNameIdentifier	 m incremental SAX Source
instanceof	TokenNameinstanceof	
IncrementalSAXSource_Filter	TokenNameIdentifier	 Incremental SAX Source  Filter
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
)	TokenNameRPAREN	
m_incrementalSAXSource	TokenNameIdentifier	 m incremental SAX Source
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
m_incrementalSAXSource	TokenNameIdentifier	 m incremental SAX Source
instanceof	TokenNameinstanceof	
IncrementalSAXSource_Filter	TokenNameIdentifier	 Incremental SAX Source  Filter
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
m_incrementalSAXSource	TokenNameIdentifier	 m incremental SAX Source
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return this DTM's EntityResolver. * * @return null if this model doesn't respond to SAX entity ref events. */	TokenNameCOMMENT_JAVADOC	 Return this DTM's EntityResolver. * @return null if this model doesn't respond to SAX entity ref events. 
public	TokenNamepublic	
EntityResolver	TokenNameIdentifier	 Entity Resolver
getEntityResolver	TokenNameIdentifier	 get Entity Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return this DTM's DTDHandler. * * @return null if this model doesn't respond to SAX dtd events. */	TokenNameCOMMENT_JAVADOC	 Return this DTM's DTDHandler. * @return null if this model doesn't respond to SAX dtd events. 
public	TokenNamepublic	
DTDHandler	TokenNameIdentifier	 DTD Handler
getDTDHandler	TokenNameIdentifier	 get DTD Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return this DTM's ErrorHandler. * * @return null if this model doesn't respond to SAX error events. */	TokenNameCOMMENT_JAVADOC	 Return this DTM's ErrorHandler. * @return null if this model doesn't respond to SAX error events. 
public	TokenNamepublic	
ErrorHandler	TokenNameIdentifier	 Error Handler
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return this DTM's DeclHandler. * * @return null if this model doesn't respond to SAX Decl events. */	TokenNameCOMMENT_JAVADOC	 Return this DTM's DeclHandler. * @return null if this model doesn't respond to SAX Decl events. 
public	TokenNamepublic	
DeclHandler	TokenNameIdentifier	 Decl Handler
getDeclHandler	TokenNameIdentifier	 get Decl Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true iff we're building this model incrementally (eg * we're partnered with a IncrementalSAXSource) and thus require that the * transformation and the parse run simultaneously. Guidance to the * DTMManager. */	TokenNameCOMMENT_JAVADOC	 @return true iff we're building this model incrementally (eg we're partnered with a IncrementalSAXSource) and thus require that the transformation and the parse run simultaneously. Guidance to the DTMManager. 
public	TokenNamepublic	
boolean	TokenNameboolean	
needsTwoThreads	TokenNameIdentifier	 needs Two Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_incrementalSAXSource	TokenNameIdentifier	 m incremental SAX Source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Directly call the * characters method on the passed ContentHandler for the * string-value of the given node (see http://www.w3.org/TR/xpath#data-model * for the definition of a node's string-value). Multiple calls to the * ContentHandler's characters methods may well occur for a single call to * this method. * * @param nodeHandle The node ID. * @param ch A non-null reference to a ContentHandler. * @param normalize true if the content should be normalized according to * the rules for the XPath * <a href="http://www.w3.org/TR/xpath#function-normalize-space">normalize-space</a> * function. * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Directly call the characters method on the passed ContentHandler for the string-value of the given node (see http://www.w3.org/TR/xpath#data-model for the definition of a node's string-value). Multiple calls to the ContentHandler's characters methods may well occur for a single call to this method. * @param nodeHandle The node ID. @param ch A non-null reference to a ContentHandler. @param normalize true if the content should be normalized according to the rules for the XPath <a href="http://www.w3.org/TR/xpath#function-normalize-space">normalize-space</a> function. * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
boolean	TokenNameboolean	
normalize	TokenNameIdentifier	 normalize
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
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
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
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
isTextType	TokenNameIdentifier	 is Text Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
)	TokenNameRPAREN	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
sendNormalizedSAXcharacters	TokenNameIdentifier	 send Normalized SA Xcharacters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
sendSAXcharacters	TokenNameIdentifier	 send SA Xcharacters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
;	TokenNameSEMICOLON	
do	TokenNamedo	
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
isTextType	TokenNameIdentifier	 is Text Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
_dataOrQName	TokenNameIdentifier	 data Or Q Name
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
getNextNodeIdentity	TokenNameIdentifier	 get Next Node Identity
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
identity	TokenNameIdentifier	 identity
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
)	TokenNameRPAREN	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
sendNormalizedSAXcharacters	TokenNameIdentifier	 send Normalized SA Xcharacters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
sendSAXcharacters	TokenNameIdentifier	 send SA Xcharacters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
_dataOrQName	TokenNameIdentifier	 data Or Q Name
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
;	TokenNameSEMICOLON	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
)	TokenNameRPAREN	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
.	TokenNameDOT	
sendNormalizedSAXcharacters	TokenNameIdentifier	 send Normalized SA Xcharacters
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Given a node handle, return its DOM-style node name. This will * include names such as #text or #document. * * @param nodeHandle the id of the node. * @return String Name of this node, which may be an empty string. * %REVIEW% Document when empty string is possible... * %REVIEW-COMMENT% It should never be empty, should it? */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its DOM-style node name. This will include names such as #text or #document. * @param nodeHandle the id of the node. @return String Name of this node, which may be an empty string. %REVIEW% Document when empty string is possible... %REVIEW-COMMENT% It should never be empty, should it? 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
=	TokenNameEQUAL	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If just testing nonzero, no need to shift... 	TokenNameCOMMENT_LINE	If just testing nonzero, no need to shift... 
int	TokenNameint	
namespaceID	TokenNameIdentifier	 namespace ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getNamespaceID	TokenNameIdentifier	 get Namespace ID
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
namespaceID	TokenNameIdentifier	 namespace ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't retrieve name until/unless needed 	TokenNameCOMMENT_LINE	Don't retrieve name until/unless needed 
// String name = m_expandedNameTable.getLocalName(expandedTypeID); 	TokenNameCOMMENT_LINE	String name = m_expandedNameTable.getLocalName(expandedTypeID); 
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
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"xmlns"	TokenNameStringLiteral	xmlns
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
"xmlns:"	TokenNameStringLiteral	xmlns:
+	TokenNamePLUS	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getLocalNameID	TokenNameIdentifier	 get Local Name ID
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_fixednames	TokenNameIdentifier	 m fixednames
[	TokenNameLBRACKET	
type	TokenNameIdentifier	 type
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
qnameIndex	TokenNameIdentifier	 qname Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
qnameIndex	TokenNameIdentifier	 qname Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
qnameIndex	TokenNameIdentifier	 qname Index
;	TokenNameSEMICOLON	
qnameIndex	TokenNameIdentifier	 qname Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Given a node handle, return the XPath node name. This should be * the name as described by the XPath data model, NOT the DOM-style * name. * * @param nodeHandle the id of the node. * @return String Name of this node, which may be an empty string. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return the XPath node name. This should be the name as described by the XPath data model, NOT the DOM-style name. * @param nodeHandle the id of the node. @return String Name of this node, which may be an empty string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeNameX	TokenNameIdentifier	 get Node Name X
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
=	TokenNameEQUAL	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
namespaceID	TokenNameIdentifier	 namespace ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getNamespaceID	TokenNameIdentifier	 get Namespace ID
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
namespaceID	TokenNameIdentifier	 namespace ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
qnameIndex	TokenNameIdentifier	 qname Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
qnameIndex	TokenNameIdentifier	 qname Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
qnameIndex	TokenNameIdentifier	 qname Index
;	TokenNameSEMICOLON	
qnameIndex	TokenNameIdentifier	 qname Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * 5. [specified] A flag indicating whether this attribute was actually * specified in the start-tag of its element, or was defaulted from the * DTD. * * @param attributeHandle Must be a valid handle to an attribute node. * @return <code>true</code> if the attribute was specified; * <code>false</code> if it was defaulted. */	TokenNameCOMMENT_JAVADOC	 5. [specified] A flag indicating whether this attribute was actually specified in the start-tag of its element, or was defaulted from the DTD. * @param attributeHandle Must be a valid handle to an attribute node. @return <code>true</code> if the attribute was specified; <code>false</code> if it was defaulted. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAttributeSpecified	TokenNameIdentifier	 is Attribute Specified
(	TokenNameLPAREN	
int	TokenNameint	
attributeHandle	TokenNameIdentifier	 attribute Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// I'm not sure if I want to do anything with this... 	TokenNameCOMMENT_LINE	I'm not sure if I want to do anything with this... 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// ?? 	TokenNameCOMMENT_LINE	?? 
}	TokenNameRBRACE	
/** * A document type declaration information item has the following properties: * * 1. [system identifier] The system identifier of the external subset, if * it exists. Otherwise this property has no value. * * @return the system identifier String object, or null if there is none. */	TokenNameCOMMENT_JAVADOC	 A document type declaration information item has the following properties: * 1. [system identifier] The system identifier of the external subset, if it exists. Otherwise this property has no value. * @return the system identifier String object, or null if there is none. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentTypeDeclarationSystemIdentifier	TokenNameIdentifier	 get Document Type Declaration System Identifier
(	TokenNameLPAREN	
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
/** * Get the next node identity value in the list, and call the iterator * if it hasn't been added yet. * * @param identity The node identity (index). * @return identity+1, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Get the next node identity value in the list, and call the iterator if it hasn't been added yet. * @param identity The node identity (index). @return identity+1, or DTM.NULL. 
protected	TokenNameprotected	
int	TokenNameint	
getNextNodeIdentity	TokenNameIdentifier	 get Next Node Identity
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
identity	TokenNameIdentifier	 identity
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
>=	TokenNameGREATER_EQUAL	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_incrementalSAXSource	TokenNameIdentifier	 m incremental SAX Source
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
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
DTMTreeWalker	TokenNameIdentifier	 DTM Tree Walker
treeWalker	TokenNameIdentifier	 tree Walker
=	TokenNameEQUAL	
m_walker	TokenNameIdentifier	 m walker
;	TokenNameSEMICOLON	
ContentHandler	TokenNameIdentifier	 Content Handler
prevCH	TokenNameIdentifier	 prev CH
=	TokenNameEQUAL	
treeWalker	TokenNameIdentifier	 tree Walker
.	TokenNameDOT	
getcontentHandler	TokenNameIdentifier	 getcontent Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
prevCH	TokenNameIdentifier	 prev CH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
treeWalker	TokenNameIdentifier	 tree Walker
=	TokenNameEQUAL	
new	TokenNamenew	
DTMTreeWalker	TokenNameIdentifier	 DTM Tree Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
treeWalker	TokenNameIdentifier	 tree Walker
.	TokenNameDOT	
setcontentHandler	TokenNameIdentifier	 setcontent Handler
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
treeWalker	TokenNameIdentifier	 tree Walker
.	TokenNameDOT	
setDTM	TokenNameIdentifier	 set DTM
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
treeWalker	TokenNameIdentifier	 tree Walker
.	TokenNameDOT	
traverse	TokenNameIdentifier	 traverse
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
treeWalker	TokenNameIdentifier	 tree Walker
.	TokenNameDOT	
setcontentHandler	TokenNameIdentifier	 setcontent Handler
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the number of nodes that have been added. * * @return The number of that are currently in the tree. */	TokenNameCOMMENT_JAVADOC	 Get the number of nodes that have been added. * @return The number of that are currently in the tree. 
public	TokenNamepublic	
int	TokenNameint	
getNumberOfNodes	TokenNameIdentifier	 get Number Of Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_size	TokenNameIdentifier	 m size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method should try and build one or more nodes in the table. * * @return The true if a next node is found or false if * there are no more nodes. */	TokenNameCOMMENT_JAVADOC	 This method should try and build one or more nodes in the table. * @return The true if a next node is found or false if there are no more nodes. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_incrementalSAXSource	TokenNameIdentifier	 m incremental SAX Source
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_endDocumentOccured	TokenNameIdentifier	 m end Document Occured
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clearCoRoutine	TokenNameIdentifier	 clear Co Routine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
gotMore	TokenNameIdentifier	 got More
=	TokenNameEQUAL	
m_incrementalSAXSource	TokenNameIdentifier	 m incremental SAX Source
.	TokenNameDOT	
deliverMoreNodes	TokenNameIdentifier	 deliver More Nodes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gotMore may be a Boolean (TRUE if still parsing, FALSE if 	TokenNameCOMMENT_LINE	gotMore may be a Boolean (TRUE if still parsing, FALSE if 
// EOF) or an exception if IncrementalSAXSource malfunctioned 	TokenNameCOMMENT_LINE	EOF) or an exception if IncrementalSAXSource malfunctioned 
// (code error rather than user error). 	TokenNameCOMMENT_LINE	(code error rather than user error). 
// 	TokenNameCOMMENT_LINE	 
// %REVIEW% Currently the ErrorHandlers sketched herein are 	TokenNameCOMMENT_LINE	%REVIEW% Currently the ErrorHandlers sketched herein are 
// no-ops, so I'm going to initially leave this also as a 	TokenNameCOMMENT_LINE	no-ops, so I'm going to initially leave this also as a 
// no-op. 	TokenNameCOMMENT_LINE	no-op. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
gotMore	TokenNameIdentifier	 got More
instanceof	TokenNameinstanceof	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gotMore	TokenNameIdentifier	 got More
instanceof	TokenNameinstanceof	
RuntimeException	TokenNameIdentifier	 Runtime Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
)	TokenNameRPAREN	
gotMore	TokenNameIdentifier	 got More
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
gotMore	TokenNameIdentifier	 got More
instanceof	TokenNameinstanceof	
Exception	TokenNameIdentifier	 Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
)	TokenNameRPAREN	
gotMore	TokenNameIdentifier	 got More
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for now... 	TokenNameCOMMENT_LINE	for now... 
clearCoRoutine	TokenNameIdentifier	 clear Co Routine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// %TBD% 	TokenNameCOMMENT_LINE	%TBD% 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gotMore	TokenNameIdentifier	 got More
!=	TokenNameNOT_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// EOF reached without satisfying the request 	TokenNameCOMMENT_LINE	EOF reached without satisfying the request 
clearCoRoutine	TokenNameIdentifier	 clear Co Routine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Drop connection, stop trying 	TokenNameCOMMENT_LINE	Drop connection, stop trying 
// %TBD% deregister as its listener? 	TokenNameCOMMENT_LINE	%TBD% deregister as its listener? 
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Bottleneck determination of text type. * * @param type oneof DTM.XXX_NODE. * * @return true if this is a text or cdata section. */	TokenNameCOMMENT_JAVADOC	 Bottleneck determination of text type. * @param type oneof DTM.XXX_NODE. * @return true if this is a text or cdata section. 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
isTextType	TokenNameIdentifier	 is Text Type
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Ensure that the size of the information arrays can hold another entry 	TokenNameCOMMENT_LINE	* Ensure that the size of the information arrays can hold another entry 
// * at the given index. 	TokenNameCOMMENT_LINE	* at the given index. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param on exit from this function, the information arrays sizes must be 	TokenNameCOMMENT_LINE	* @param on exit from this function, the information arrays sizes must be 
// * at least index+1. 	TokenNameCOMMENT_LINE	* at least index+1. 
// * 	TokenNameCOMMENT_LINE	* 
// * NEEDSDOC @param index 	TokenNameCOMMENT_LINE	* NEEDSDOC @param index 
// */ 	TokenNameCOMMENT_LINE	*/ 
// protected void ensureSize(int index) 	TokenNameCOMMENT_LINE	protected void ensureSize(int index) 
// { 	TokenNameCOMMENT_LINE	{ 
// // dataOrQName is an SuballocatedIntVector and hence self-sizing. 	TokenNameCOMMENT_LINE	// dataOrQName is an SuballocatedIntVector and hence self-sizing. 
// // But DTMDefaultBase may need fixup. 	TokenNameCOMMENT_LINE	// But DTMDefaultBase may need fixup. 
// super.ensureSize(index); 	TokenNameCOMMENT_LINE	super.ensureSize(index); 
// } 	TokenNameCOMMENT_LINE	} 
/** * Construct the node map from the node. * * @param type raw type ID, one of DTM.XXX_NODE. * @param expandedTypeID The expended type ID. * @param parentIndex The current parent index. * @param previousSibling The previous sibling index. * @param dataOrPrefix index into m_data table, or string handle. * @param canHaveFirstChild true if the node can have a first child, false * if it is atomic. * * @return The index identity of the node that was added. */	TokenNameCOMMENT_JAVADOC	 Construct the node map from the node. * @param type raw type ID, one of DTM.XXX_NODE. @param expandedTypeID The expended type ID. @param parentIndex The current parent index. @param previousSibling The previous sibling index. @param dataOrPrefix index into m_data table, or string handle. @param canHaveFirstChild true if the node can have a first child, false if it is atomic. * @return The index identity of the node that was added. 
protected	TokenNameprotected	
int	TokenNameint	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
,	TokenNameCOMMA	
int	TokenNameint	
parentIndex	TokenNameIdentifier	 parent Index
,	TokenNameCOMMA	
int	TokenNameint	
previousSibling	TokenNameIdentifier	 previous Sibling
,	TokenNameCOMMA	
int	TokenNameint	
dataOrPrefix	TokenNameIdentifier	 data Or Prefix
,	TokenNameCOMMA	
boolean	TokenNameboolean	
canHaveFirstChild	TokenNameIdentifier	 can Have First Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Common to all nodes: 	TokenNameCOMMENT_LINE	Common to all nodes: 
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
m_size	TokenNameIdentifier	 m size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// Have we overflowed a DTM Identity's addressing range? 	TokenNameCOMMENT_LINE	Have we overflowed a DTM Identity's addressing range? 
if	TokenNameif	
(	TokenNameLPAREN	
m_dtmIdent	TokenNameIdentifier	 m dtm Ident
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_DTM_NODE_BITS	TokenNameIdentifier	 IDENT  DTM  NODE  BITS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addNewDTMID	TokenNameIdentifier	 add New DTMID
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_firstch	TokenNameIdentifier	 m firstch
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
canHaveFirstChild	TokenNameIdentifier	 can Have First Child
?	TokenNameQUESTION	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
:	TokenNameCOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
parentIndex	TokenNameIdentifier	 parent Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_exptype	TokenNameIdentifier	 m exptype
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
dataOrPrefix	TokenNameIdentifier	 data Or Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_prevsib	TokenNameIdentifier	 m prevsib
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prevsib	TokenNameIdentifier	 m prevsib
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
previousSibling	TokenNameIdentifier	 previous Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
previousSibling	TokenNameIdentifier	 previous Sibling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
previousSibling	TokenNameIdentifier	 previous Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_locator	TokenNameIdentifier	 m locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_useSourceLocationProperty	TokenNameIdentifier	 m use Source Location Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSourceLocation	TokenNameIdentifier	 set Source Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Note that nextSibling is not processed until charactersFlush() 	TokenNameCOMMENT_LINE	Note that nextSibling is not processed until charactersFlush() 
// is called, to handle successive characters() events. 	TokenNameCOMMENT_LINE	is called, to handle successive characters() events. 
// Special handling by type: Declare namespaces, attach first child 	TokenNameCOMMENT_LINE	Special handling by type: Declare namespaces, attach first child 
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
:	TokenNameCOLON	
declareNamespaceInContext	TokenNameIdentifier	 declare Namespace In Context
(	TokenNameLPAREN	
parentIndex	TokenNameIdentifier	 parent Index
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
previousSibling	TokenNameIdentifier	 previous Sibling
&&	TokenNameAND_AND	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
parentIndex	TokenNameIdentifier	 parent Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstch	TokenNameIdentifier	 m firstch
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
parentIndex	TokenNameIdentifier	 parent Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
nodeIndex	TokenNameIdentifier	 node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a new DTM ID beginning at the specified node index. * @param nodeIndex The node identity at which the new DTM ID will begin * addressing. */	TokenNameCOMMENT_JAVADOC	 Get a new DTM ID beginning at the specified node index. @param nodeIndex The node identity at which the new DTM ID will begin addressing. 
protected	TokenNameprotected	
void	TokenNamevoid	
addNewDTMID	TokenNameIdentifier	 add New DTMID
(	TokenNameLPAREN	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_mgr	TokenNameIdentifier	 m mgr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Handle as Extended Addressing 	TokenNameCOMMENT_LINE	Handle as Extended Addressing 
DTMManagerDefault	TokenNameIdentifier	 DTM Manager Default
mgrD	TokenNameIdentifier	 mgr D
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMManagerDefault	TokenNameIdentifier	 DTM Manager Default
)	TokenNameRPAREN	
m_mgr	TokenNameIdentifier	 m mgr
;	TokenNameSEMICOLON	
int	TokenNameint	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
mgrD	TokenNameIdentifier	 mgr D
.	TokenNameDOT	
getFirstFreeDTMID	TokenNameIdentifier	 get First Free DTMID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mgrD	TokenNameIdentifier	 mgr D
.	TokenNameDOT	
addDTM	TokenNameIdentifier	 add DTM
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_dtmIdent	TokenNameIdentifier	 m dtm Ident
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
<<	TokenNameLEFT_SHIFT	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_DTM_NODE_BITS	TokenNameIdentifier	 IDENT  DTM  NODE  BITS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% Wrong error message, but I've been told we're trying 	TokenNameCOMMENT_LINE	%REVIEW% Wrong error message, but I've been told we're trying 
// not to add messages right not for I18N reasons. 	TokenNameCOMMENT_LINE	not to add messages right not for I18N reasons. 
// %REVIEW% Should this be a Fatal Error? 	TokenNameCOMMENT_LINE	%REVIEW% Should this be a Fatal Error? 
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_NO_DTMIDS_AVAIL	TokenNameIdentifier	 ER  NO  DTMIDS  AVAIL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"No more DTM IDs are available"; 	TokenNameCOMMENT_LINE	"No more DTM IDs are available"; 
}	TokenNameRBRACE	
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
super	TokenNamesuper	
.	TokenNameDOT	
migrateTo	TokenNameIdentifier	 migrate To
(	TokenNameLPAREN	
manager	TokenNameIdentifier	 manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We have to reset the information in m_dtmIdent and 	TokenNameCOMMENT_LINE	We have to reset the information in m_dtmIdent and 
// register the DTM with the new manager. 	TokenNameCOMMENT_LINE	register the DTM with the new manager. 
int	TokenNameint	
numDTMs	TokenNameIdentifier	 num DT Ms
=	TokenNameEQUAL	
m_dtmIdent	TokenNameIdentifier	 m dtm Ident
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dtmId	TokenNameIdentifier	 dtm Id
=	TokenNameEQUAL	
m_mgrDefault	TokenNameIdentifier	 m mgr Default
.	TokenNameDOT	
getFirstFreeDTMID	TokenNameIdentifier	 get First Free DTMID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
numDTMs	TokenNameIdentifier	 num DT Ms
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dtmIdent	TokenNameIdentifier	 m dtm Ident
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
dtmId	TokenNameIdentifier	 dtm Id
<<	TokenNameLEFT_SHIFT	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_DTM_NODE_BITS	TokenNameIdentifier	 IDENT  DTM  NODE  BITS
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_mgrDefault	TokenNameIdentifier	 m mgr Default
.	TokenNameDOT	
addDTM	TokenNameIdentifier	 add DTM
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
dtmId	TokenNameIdentifier	 dtm Id
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtmId	TokenNameIdentifier	 dtm Id
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
nodeIndex	TokenNameIdentifier	 node Index
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_DTM_NODE_BITS	TokenNameIdentifier	 IDENT  DTM  NODE  BITS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Store the source location of the current node. This method must be called * as every node is added to the DTM or for no node. */	TokenNameCOMMENT_JAVADOC	 Store the source location of the current node. This method must be called as every node is added to the DTM or for no node. 
protected	TokenNameprotected	
void	TokenNamevoid	
setSourceLocation	TokenNameIdentifier	 set Source Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_sourceSystemId	TokenNameIdentifier	 m source System Id
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_sourceLine	TokenNameIdentifier	 m source Line
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_sourceColumn	TokenNameIdentifier	 m source Column
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//%REVIEW% %BUG% Prevent this from arising in the first place 	TokenNameCOMMENT_LINE	%REVIEW% %BUG% Prevent this from arising in the first place 
// by not allowing the enabling conditions to change after we start 	TokenNameCOMMENT_LINE	by not allowing the enabling conditions to change after we start 
// building the document. 	TokenNameCOMMENT_LINE	building the document. 
if	TokenNameif	
(	TokenNameLPAREN	
m_sourceSystemId	TokenNameIdentifier	 m source System Id
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"CODING ERROR in Source Location: "	TokenNameStringLiteral	CODING ERROR in Source Location: 
+	TokenNamePLUS	
m_size	TokenNameIdentifier	 m size
+	TokenNamePLUS	
" != "	TokenNameStringLiteral	 != 
+	TokenNamePLUS	
m_sourceSystemId	TokenNameIdentifier	 m source System Id
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
isTextType	TokenNameIdentifier	 is Text Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
_dataOrQName	TokenNameIdentifier	 data Or Q Name
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %OPT% We should cache this, I guess. 	TokenNameCOMMENT_LINE	%OPT% We should cache this, I guess. 
return	TokenNamereturn	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
_dataOrQName	TokenNameIdentifier	 data Or Q Name
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
;	TokenNameSEMICOLON	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Given a node handle, return its XPath-style localname. * (As defined in Namespaces, this is the portion of the name after any * colon character). * * @param nodeHandle the id of the node. * @return String Local name of this node. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its XPath-style localname. (As defined in Namespaces, this is the portion of the name after any colon character). * @param nodeHandle the id of the node. @return String Local name of this node. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
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
/** * The getUnparsedEntityURI function returns the URI of the unparsed * entity with the specified name in the same document as the context * node (see [3.3 Unparsed Entities]). It returns the empty string if * there is no such entity. * <p> * XML processors may choose to use the System Identifier (if one * is provided) to resolve the entity, rather than the URI in the * Public Identifier. The details are dependent on the processor, and * we would have to support some form of plug-in resolver to handle * this properly. Currently, we simply return the System Identifier if * present, and hope that it a usable URI or that our caller can * map it to one. * TODO: Resolve Public Identifiers... or consider changing function name. * <p> * If we find a relative URI * reference, XML expects it to be resolved in terms of the base URI * of the document. The DOM doesn't do that for us, and it isn't * entirely clear whether that should be done here; currently that's * pushed up to a higher level of our application. (Note that DOM Level * 1 didn't store the document's base URI.) * TODO: Consider resolving Relative URIs. * <p> * (The DOM's statement that "An XML processor may choose to * completely expand entities before the structure model is passed * to the DOM" refers only to parsed entities, not unparsed, and hence * doesn't affect this function.) * * @param name A string containing the Entity Name of the unparsed * entity. * * @return String containing the URI of the Unparsed Entity, or an * empty string if no such entity exists. */	TokenNameCOMMENT_JAVADOC	 The getUnparsedEntityURI function returns the URI of the unparsed entity with the specified name in the same document as the context node (see [3.3 Unparsed Entities]). It returns the empty string if there is no such entity. <p> XML processors may choose to use the System Identifier (if one is provided) to resolve the entity, rather than the URI in the Public Identifier. The details are dependent on the processor, and we would have to support some form of plug-in resolver to handle this properly. Currently, we simply return the System Identifier if present, and hope that it a usable URI or that our caller can map it to one. TODO: Resolve Public Identifiers... or consider changing function name. <p> If we find a relative URI reference, XML expects it to be resolved in terms of the base URI of the document. The DOM doesn't do that for us, and it isn't entirely clear whether that should be done here; currently that's pushed up to a higher level of our application. (Note that DOM Level 1 didn't store the document's base URI.) TODO: Consider resolving Relative URIs. <p> (The DOM's statement that "An XML processor may choose to completely expand entities before the structure model is passed to the DOM" refers only to parsed entities, not unparsed, and hence doesn't affect this function.) * @param name A string containing the Entity Name of the unparsed entity. * @return String containing the URI of the Unparsed Entity, or an empty string if no such entity exists. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUnparsedEntityURI	TokenNameIdentifier	 get Unparsed Entity URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_entities	TokenNameIdentifier	 m entities
)	TokenNameRPAREN	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_entities	TokenNameIdentifier	 m entities
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
+=	TokenNamePLUS_EQUAL	
ENTITY_FIELDS_PER	TokenNameIdentifier	 ENTITY  FIELDS  PER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ename	TokenNameIdentifier	 ename
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_entities	TokenNameIdentifier	 m entities
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
ENTITY_FIELD_NAME	TokenNameIdentifier	 ENTITY  FIELD  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ename	TokenNameIdentifier	 ename
&&	TokenNameAND_AND	
ename	TokenNameIdentifier	 ename
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
nname	TokenNameIdentifier	 nname
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_entities	TokenNameIdentifier	 m entities
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
ENTITY_FIELD_NOTATIONNAME	TokenNameIdentifier	 ENTITY  FIELD  NOTATIONNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
nname	TokenNameIdentifier	 nname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The draft says: "The XSLT processor may use the public 	TokenNameCOMMENT_LINE	The draft says: "The XSLT processor may use the public 
// identifier to generate a URI for the entity instead of the URI 	TokenNameCOMMENT_LINE	identifier to generate a URI for the entity instead of the URI 
// specified in the system identifier. If the XSLT processor does 	TokenNameCOMMENT_LINE	specified in the system identifier. If the XSLT processor does 
// not use the public identifier to generate the URI, it must use 	TokenNameCOMMENT_LINE	not use the public identifier to generate the URI, it must use 
// the system identifier; if the system identifier is a relative 	TokenNameCOMMENT_LINE	the system identifier; if the system identifier is a relative 
// URI, it must be resolved into an absolute URI using the URI of 	TokenNameCOMMENT_LINE	URI, it must be resolved into an absolute URI using the URI of 
// the resource containing the entity declaration as the base 	TokenNameCOMMENT_LINE	the resource containing the entity declaration as the base 
// URI [RFC2396]." 	TokenNameCOMMENT_LINE	URI [RFC2396]." 
// So I'm falling a bit short here. 	TokenNameCOMMENT_LINE	So I'm falling a bit short here. 
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_entities	TokenNameIdentifier	 m entities
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
ENTITY_FIELD_SYSTEMID	TokenNameIdentifier	 ENTITY  FIELD  SYSTEMID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_entities	TokenNameIdentifier	 m entities
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
ENTITY_FIELD_PUBLICID	TokenNameIdentifier	 ENTITY  FIELD  PUBLICID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a namespace handle, return the prefix that the namespace decl is * mapping. * Given a node handle, return the prefix used to map to the namespace. * * <p> %REVIEW% Are you sure you want "" for no prefix? </p> * <p> %REVIEW-COMMENT% I think so... not totally sure. -sb </p> * * @param nodeHandle the id of the node. * @return String prefix of this node's name, or "" if no explicit * namespace prefix was given. */	TokenNameCOMMENT_JAVADOC	 Given a namespace handle, return the prefix that the namespace decl is mapping. Given a node handle, return the prefix used to map to the namespace. * <p> %REVIEW% Are you sure you want "" for no prefix? </p> <p> %REVIEW-COMMENT% I think so... not totally sure. -sb </p> * @param nodeHandle the id of the node. @return String prefix of this node's name, or "" if no explicit namespace prefix was given. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
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
int	TokenNameint	
prefixIndex	TokenNameIdentifier	 prefix Index
=	TokenNameEQUAL	
_dataOrQName	TokenNameIdentifier	 data Or Q Name
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
prefixIndex	TokenNameIdentifier	 prefix Index
)	TokenNameRPAREN	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
prefixIndex	TokenNameIdentifier	 prefix Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
prefixIndex	TokenNameIdentifier	 prefix Index
=	TokenNameEQUAL	
_dataOrQName	TokenNameIdentifier	 data Or Q Name
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefixIndex	TokenNameIdentifier	 prefix Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixIndex	TokenNameIdentifier	 prefix Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
prefixIndex	TokenNameIdentifier	 prefix Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
prefixIndex	TokenNameIdentifier	 prefix Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves an attribute node by by qualified name and namespace URI. * * @param nodeHandle int Handle of the node upon which to look up this attribute.. * @param namespaceURI The namespace URI of the attribute to * retrieve, or null. * @param name The local name of the attribute to * retrieve. * @return The attribute node handle with the specified name ( * <code>nodeName</code>) or <code>DTM.NULL</code> if there is no such * attribute. */	TokenNameCOMMENT_JAVADOC	 Retrieves an attribute node by by qualified name and namespace URI. * @param nodeHandle int Handle of the node upon which to look up this attribute.. @param namespaceURI The namespace URI of the attribute to retrieve, or null. @param name The local name of the attribute to retrieve. @return The attribute node handle with the specified name ( <code>nodeName</code>) or <code>DTM.NULL</code> if there is no such attribute. 
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
attrH	TokenNameIdentifier	 attr H
=	TokenNameEQUAL	
getFirstAttribute	TokenNameIdentifier	 get First Attribute
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
attrH	TokenNameIdentifier	 attr H
;	TokenNameSEMICOLON	
attrH	TokenNameIdentifier	 attr H
=	TokenNameEQUAL	
getNextAttribute	TokenNameIdentifier	 get Next Attribute
(	TokenNameLPAREN	
attrH	TokenNameIdentifier	 attr H
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
attrNS	TokenNameIdentifier	 attr NS
=	TokenNameEQUAL	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
attrH	TokenNameIdentifier	 attr H
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
=	TokenNameEQUAL	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
attrH	TokenNameIdentifier	 attr H
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
nsMatch	TokenNameIdentifier	 ns Match
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
attrNS	TokenNameIdentifier	 attr NS
||	TokenNameOR_OR	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
attrNS	TokenNameIdentifier	 attr NS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nsMatch	TokenNameIdentifier	 ns Match
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
attrH	TokenNameIdentifier	 attr H
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the public identifier of the external subset, * normalized as described in 4.2.2 External Entities [XML]. If there is * no external subset or if it has no public identifier, this property * has no value. * * @return the public identifier String object, or null if there is none. */	TokenNameCOMMENT_JAVADOC	 Return the public identifier of the external subset, normalized as described in 4.2.2 External Entities [XML]. If there is no external subset or if it has no public identifier, this property has no value. * @return the public identifier String object, or null if there is none. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentTypeDeclarationPublicIdentifier	TokenNameIdentifier	 get Document Type Declaration Public Identifier
(	TokenNameLPAREN	
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
/** * Given a node handle, return its DOM-style namespace URI * (As defined in Namespaces, this is the declared URI which this node's * prefix -- or default in lieu thereof -- was mapped to.) * * <p>%REVIEW% Null or ""? -sb</p> * * @param nodeHandle the id of the node. * @return String URI value of this node's namespace, or null if no * namespace was resolved. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its DOM-style namespace URI (As defined in Namespaces, this is the declared URI which this node's prefix -- or default in lieu thereof -- was mapped to.) * <p>%REVIEW% Null or ""? -sb</p> * @param nodeHandle the id of the node. @return String URI value of this node's namespace, or null if no namespace was resolved. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
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
/** * Get the string-value of a node as a String object * (see http://www.w3.org/TR/xpath#data-model * for the definition of a node's string-value). * * @param nodeHandle The node ID. * * @return A string object that represents the string-value of the given node. */	TokenNameCOMMENT_JAVADOC	 Get the string-value of a node as a String object (see http://www.w3.org/TR/xpath#data-model for the definition of a node's string-value). * @param nodeHandle The node ID. * @return A string object that represents the string-value of the given node. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
getStringValue	TokenNameIdentifier	 get String Value
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
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
// Separate lines because I wanted to breakpoint it 	TokenNameCOMMENT_LINE	Separate lines because I wanted to breakpoint it 
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
else	TokenNameelse	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isTextType	TokenNameIdentifier	 is Text Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
_dataOrQName	TokenNameIdentifier	 data Or Q Name
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_xstrf	TokenNameIdentifier	 m xstrf
.	TokenNameDOT	
newstr	TokenNameIdentifier	 newstr
(	TokenNameLPAREN	
m_chars	TokenNameIdentifier	 m chars
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
;	TokenNameSEMICOLON	
do	TokenNamedo	
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
isTextType	TokenNameIdentifier	 is Text Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
_dataOrQName	TokenNameIdentifier	 data Or Q Name
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
getNextNodeIdentity	TokenNameIdentifier	 get Next Node Identity
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
identity	TokenNameIdentifier	 identity
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_xstrf	TokenNameIdentifier	 m xstrf
.	TokenNameDOT	
newstr	TokenNameIdentifier	 newstr
(	TokenNameLPAREN	
m_chars	TokenNameIdentifier	 m chars
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
_dataOrQName	TokenNameIdentifier	 data Or Q Name
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
;	TokenNameSEMICOLON	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_xstrf	TokenNameIdentifier	 m xstrf
.	TokenNameDOT	
newstr	TokenNameIdentifier	 newstr
(	TokenNameLPAREN	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_xstrf	TokenNameIdentifier	 m xstrf
.	TokenNameDOT	
emptystr	TokenNameIdentifier	 emptystr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine if the string-value of a node is whitespace * * @param nodeHandle The node Handle. * * @return Return true if the given node is whitespace. */	TokenNameCOMMENT_JAVADOC	 Determine if the string-value of a node is whitespace * @param nodeHandle The node Handle. * @return Return true if the given node is whitespace. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isWhitespace	TokenNameIdentifier	 is Whitespace
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
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
// Separate lines because I wanted to breakpoint it 	TokenNameCOMMENT_LINE	Separate lines because I wanted to breakpoint it 
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
else	TokenNameelse	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isTextType	TokenNameIdentifier	 is Text Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
_dataOrQName	TokenNameIdentifier	 data Or Q Name
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
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
Integer	TokenNameIdentifier	 Integer
intObj	TokenNameIdentifier	 int Obj
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isMore	TokenNameIdentifier	 is More
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
intObj	TokenNameIdentifier	 int Obj
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
m_idAttributes	TokenNameIdentifier	 m id Attributes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
elementId	TokenNameIdentifier	 element Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
intObj	TokenNameIdentifier	 int Obj
)	TokenNameRPAREN	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
intObj	TokenNameIdentifier	 int Obj
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isMore	TokenNameIdentifier	 is More
||	TokenNameOR_OR	
m_endDocumentOccured	TokenNameIdentifier	 m end Document Occured
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
isMore	TokenNameIdentifier	 is More
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
intObj	TokenNameIdentifier	 int Obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a prefix either from the qname or from the uri mapping, or just make * one up! * * @param qname The qualified name, which may be null. * @param uri The namespace URI, which may be null. * * @return The prefix if there is one, or null. */	TokenNameCOMMENT_JAVADOC	 Get a prefix either from the qname or from the uri mapping, or just make one up! * @param qname The qualified name, which may be null. @param uri The namespace URI, which may be null. * @return The prefix if there is one, or null. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
int	TokenNameint	
uriIndex	TokenNameIdentifier	 uri Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
uri	TokenNameIdentifier	 uri
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
uriIndex	TokenNameIdentifier	 uri Index
=	TokenNameEQUAL	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
++	TokenNamePLUS_PLUS	
uriIndex	TokenNameIdentifier	 uri Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
uriIndex	TokenNameIdentifier	 uri Index
&	TokenNameAND	
0x01	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uriIndex	TokenNameIdentifier	 uri Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
uriIndex	TokenNameIdentifier	 uri Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
else	TokenNameelse	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a prefix either from the uri mapping, or just make * one up! * * @param uri The namespace URI, which may be null. * * @return The prefix if there is one, or null. */	TokenNameCOMMENT_JAVADOC	 Get a prefix either from the uri mapping, or just make one up! * @param uri The namespace URI, which may be null. * @return The prefix if there is one, or null. 
public	TokenNamepublic	
int	TokenNameint	
getIdForNamespace	TokenNameIdentifier	 get Id For Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a prefix either from the qname or from the uri mapping, or just make * one up! * * @return The prefix if there is one, or null. */	TokenNameCOMMENT_JAVADOC	 Get a prefix either from the qname or from the uri mapping, or just make one up! * @return The prefix if there is one, or null. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
int	TokenNameint	
prefixIndex	TokenNameIdentifier	 prefix Index
=	TokenNameEQUAL	
m_contextIndexes	TokenNameIdentifier	 m context Indexes
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
prefixIndex	TokenNameIdentifier	 prefix Index
=	TokenNameEQUAL	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
++	TokenNamePLUS_PLUS	
prefixIndex	TokenNameIdentifier	 prefix Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
prefixIndex	TokenNameIdentifier	 prefix Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
prefixIndex	TokenNameIdentifier	 prefix Index
&	TokenNameAND	
0x01	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0x01	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefixIndex	TokenNameIdentifier	 prefix Index
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
prefixIndex	TokenNameIdentifier	 prefix Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an ID string to node association in the ID table. * * @param id The ID string. * @param elem The associated element handle. */	TokenNameCOMMENT_JAVADOC	 Set an ID string to node association in the ID table. * @param id The ID string. @param elem The associated element handle. 
public	TokenNamepublic	
void	TokenNamevoid	
setIDAttribute	TokenNameIdentifier	 set ID Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
int	TokenNameint	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_idAttributes	TokenNameIdentifier	 m id Attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check whether accumulated text should be stripped; if not, * append the appropriate flavor of text/cdata node. */	TokenNameCOMMENT_JAVADOC	 Check whether accumulated text should be stripped; if not, append the appropriate flavor of text/cdata node. 
protected	TokenNameprotected	
void	TokenNamevoid	
charactersFlush	TokenNameIdentifier	 characters Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// -1 indicates no-text-in-progress 	TokenNameCOMMENT_LINE	-1 indicates no-text-in-progress 
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
doStrip	TokenNameIdentifier	 do Strip
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getShouldStripWhitespace	TokenNameIdentifier	 get Should Strip Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doStrip	TokenNameIdentifier	 do Strip
=	TokenNameEQUAL	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doStrip	TokenNameIdentifier	 do Strip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Discard accumulated text 	TokenNameCOMMENT_LINE	Discard accumulated text 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Guard against characters/ignorableWhitespace events that 	TokenNameCOMMENT_LINE	Guard against characters/ignorableWhitespace events that 
// contained no characters. They should not result in a node. 	TokenNameCOMMENT_LINE	contained no characters. They should not result in a node. 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
exName	TokenNameIdentifier	 ex Name
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_previous	TokenNameIdentifier	 m previous
=	TokenNameEQUAL	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
m_coalescedTextType	TokenNameIdentifier	 m coalesced Text Type
,	TokenNameCOMMA	
exName	TokenNameIdentifier	 ex Name
,	TokenNameCOMMA	
m_parents	TokenNameIdentifier	 m parents
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_previous	TokenNameIdentifier	 m previous
,	TokenNameCOMMA	
dataIndex	TokenNameIdentifier	 data Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Reset for next text block 	TokenNameCOMMENT_LINE	Reset for next text block 
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_textType	TokenNameIdentifier	 m text Type
=	TokenNameEQUAL	
m_coalescedTextType	TokenNameIdentifier	 m coalesced Text Type
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of the EntityResolver interface. 	TokenNameCOMMENT_LINE	Implementation of the EntityResolver interface. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Resolve an external entity. * * <p>Always return null, so that the parser will use the system * identifier provided in the XML document. This method implements * the SAX default behaviour: application writers can override it * in a subclass to do special translations such as catalog lookups * or URI redirection.</p> * * @param publicId The public identifer, or null if none is * available. * @param systemId The system identifier provided in the XML * document. * @return The new input source, or null to require the * default behaviour. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.EntityResolver#resolveEntity * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Resolve an external entity. * <p>Always return null, so that the parser will use the system identifier provided in the XML document. This method implements the SAX default behaviour: application writers can override it in a subclass to do special translations such as catalog lookups or URI redirection.</p> * @param publicId The public identifer, or null if none is available. @param systemId The system identifier provided in the XML document. @return The new input source, or null to require the default behaviour. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.EntityResolver#resolveEntity * @throws SAXException 
public	TokenNamepublic	
InputSource	TokenNameIdentifier	 Input Source
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of DTDHandler interface. 	TokenNameCOMMENT_LINE	Implementation of DTDHandler interface. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Receive notification of a notation declaration. * * <p>By default, do nothing. Application writers may override this * method in a subclass if they wish to keep track of the notations * declared in a document.</p> * * @param name The notation name. * @param publicId The notation public identifier, or null if not * available. * @param systemId The notation system identifier. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.DTDHandler#notationDecl * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a notation declaration. * <p>By default, do nothing. Application writers may override this method in a subclass if they wish to keep track of the notations declared in a document.</p> * @param name The notation name. @param publicId The notation public identifier, or null if not available. @param systemId The notation system identifier. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.DTDHandler#notationDecl * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
notationDecl	TokenNameIdentifier	 notation Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// no op 	TokenNameCOMMENT_LINE	no op 
}	TokenNameRBRACE	
/** * Receive notification of an unparsed entity declaration. * * <p>By default, do nothing. Application writers may override this * method in a subclass to keep track of the unparsed entities * declared in a document.</p> * * @param name The entity name. * @param publicId The entity public identifier, or null if not * available. * @param systemId The entity system identifier. * @param notationName The name of the associated notation. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.DTDHandler#unparsedEntityDecl * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of an unparsed entity declaration. * <p>By default, do nothing. Application writers may override this method in a subclass to keep track of the unparsed entities declared in a document.</p> * @param name The entity name. @param publicId The entity public identifier, or null if not available. @param systemId The entity system identifier. @param notationName The name of the associated notation. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.DTDHandler#unparsedEntityDecl * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
unparsedEntityDecl	TokenNameIdentifier	 unparsed Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
notationName	TokenNameIdentifier	 notation Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_entities	TokenNameIdentifier	 m entities
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_entities	TokenNameIdentifier	 m entities
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
.	TokenNameDOT	
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
getDocumentBaseURI	TokenNameIdentifier	 get Document Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// private static final int ENTITY_FIELD_PUBLICID = 0; 	TokenNameCOMMENT_LINE	private static final int ENTITY_FIELD_PUBLICID = 0; 
m_entities	TokenNameIdentifier	 m entities
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// private static final int ENTITY_FIELD_SYSTEMID = 1; 	TokenNameCOMMENT_LINE	private static final int ENTITY_FIELD_SYSTEMID = 1; 
m_entities	TokenNameIdentifier	 m entities
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// private static final int ENTITY_FIELD_NOTATIONNAME = 2; 	TokenNameCOMMENT_LINE	private static final int ENTITY_FIELD_NOTATIONNAME = 2; 
m_entities	TokenNameIdentifier	 m entities
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
notationName	TokenNameIdentifier	 notation Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// private static final int ENTITY_FIELD_NAME = 3; 	TokenNameCOMMENT_LINE	private static final int ENTITY_FIELD_NAME = 3; 
m_entities	TokenNameIdentifier	 m entities
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of ContentHandler interface. 	TokenNameCOMMENT_LINE	Implementation of ContentHandler interface. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Receive a Locator object for document events. * * <p>By default, do nothing. Application writers may override this * method in a subclass if they wish to store the locator for use * with other document events.</p> * * @param locator A locator for all SAX document events. * @see org.xml.sax.ContentHandler#setDocumentLocator * @see org.xml.sax.Locator */	TokenNameCOMMENT_JAVADOC	 Receive a Locator object for document events. * <p>By default, do nothing. Application writers may override this method in a subclass if they wish to store the locator for use with other document events.</p> * @param locator A locator for all SAX document events. @see org.xml.sax.ContentHandler#setDocumentLocator @see org.xml.sax.Locator 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_locator	TokenNameIdentifier	 m locator
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
;	TokenNameSEMICOLON	
m_systemId	TokenNameIdentifier	 m system Id
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the beginning of the document. * * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#startDocument */	TokenNameCOMMENT_JAVADOC	 Receive notification of the beginning of the document. * @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#startDocument 
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
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
"startDocument"	TokenNameStringLiteral	startDocument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
,	TokenNameCOMMA	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parents	TokenNameIdentifier	 m parents
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_previous	TokenNameIdentifier	 m previous
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
m_contextIndexes	TokenNameIdentifier	 m context Indexes
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for the next element. 	TokenNameCOMMENT_LINE	for the next element. 
}	TokenNameRBRACE	
/** * Receive notification of the end of the document. * * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#endDocument */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of the document. * @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#endDocument 
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
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
"endDocument"	TokenNameStringLiteral	endDocument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstch	TokenNameIdentifier	 m firstch
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
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
0	TokenNameIntegerLiteral	
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
m_endDocumentOccured	TokenNameIdentifier	 m end Document Occured
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Bugzilla 4858: throw away m_locator. we cache m_systemId 	TokenNameCOMMENT_LINE	Bugzilla 4858: throw away m_locator. we cache m_systemId 
m_locator	TokenNameIdentifier	 m locator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the start of a Namespace mapping. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions at the start of * each Namespace prefix scope (such as storing the prefix mapping).</p> * * @param prefix The Namespace prefix being declared. * @param uri The Namespace URI mapped to the prefix. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#startPrefixMapping */	TokenNameCOMMENT_JAVADOC	 Receive notification of the start of a Namespace mapping. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions at the start of each Namespace prefix scope (such as storing the prefix mapping).</p> * @param prefix The Namespace prefix being declared. @param uri The Namespace URI mapped to the prefix. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#startPrefixMapping 
public	TokenNamepublic	
void	TokenNamevoid	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
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
"startPrefixMapping: prefix: "	TokenNameStringLiteral	startPrefixMapping: prefix: 
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
", uri: "	TokenNameStringLiteral	, uri: 
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// JDK 1.1.x compat -sc 	TokenNameCOMMENT_LINE	JDK 1.1.x compat -sc 
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// JDK 1.1.x compat -sc 	TokenNameCOMMENT_LINE	JDK 1.1.x compat -sc 
}	TokenNameRBRACE	
/** * Receive notification of the end of a Namespace mapping. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions at the end of * each prefix mapping.</p> * * @param prefix The Namespace prefix being declared. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#endPrefixMapping */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of a Namespace mapping. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions at the end of each prefix mapping.</p> * @param prefix The Namespace prefix being declared. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#endPrefixMapping 
public	TokenNamepublic	
void	TokenNamevoid	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
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
"endPrefixMapping: prefix: "	TokenNameStringLiteral	endPrefixMapping: prefix: 
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_contextIndexes	TokenNameIdentifier	 m context Indexes
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
&	TokenNameAND	
0x01	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0x01	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
"%@$#^@#"	TokenNameStringLiteral	%@$#^@#
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
"%@$#^@#"	TokenNameStringLiteral	%@$#^@#
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// no op 	TokenNameCOMMENT_LINE	no op 
}	TokenNameRBRACE	
/** * Check if a declaration has already been made for a given prefix. * * @param prefix non-null prefix string. * * @return true if the declaration has already been declared in the * current context. */	TokenNameCOMMENT_JAVADOC	 Check if a declaration has already been made for a given prefix. * @param prefix non-null prefix string. * @return true if the declaration has already been declared in the current context. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
declAlreadyDeclared	TokenNameIdentifier	 decl Already Declared
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startDecls	TokenNameIdentifier	 start Decls
=	TokenNameEQUAL	
m_contextIndexes	TokenNameIdentifier	 m context Indexes
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
prefixMappings	TokenNameIdentifier	 prefix Mappings
=	TokenNameEQUAL	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
;	TokenNameSEMICOLON	
int	TokenNameint	
nDecls	TokenNameIdentifier	 n Decls
=	TokenNameEQUAL	
prefixMappings	TokenNameIdentifier	 prefix Mappings
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
startDecls	TokenNameIdentifier	 start Decls
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nDecls	TokenNameIdentifier	 n Decls
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefixDecl	TokenNameIdentifier	 prefix Decl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
prefixMappings	TokenNameIdentifier	 prefix Mappings
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefixDecl	TokenNameIdentifier	 prefix Decl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefixDecl	TokenNameIdentifier	 prefix Decl
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
m_pastFirstElement	TokenNameIdentifier	 m past First Element
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Receive notification of the start of an element. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions at the start of * each element (such as allocating a new tree node or writing * output to a file).</p> * * @param uri The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param qName The qualified name (with prefix), or the * empty string if qualified names are not available. * @param attributes The specified or defaulted attributes. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#startElement */	TokenNameCOMMENT_JAVADOC	 Receive notification of the start of an element. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions at the start of each element (such as allocating a new tree node or writing output to a file).</p> * @param uri The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param qName The qualified name (with prefix), or the empty string if qualified names are not available. @param attributes The specified or defaulted attributes. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#startElement 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"startElement: uri: "	TokenNameStringLiteral	startElement: uri: 
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
", localname: "	TokenNameStringLiteral	, localname: 
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
+	TokenNamePLUS	
", qname: "	TokenNameStringLiteral	, qname: 
+	TokenNamePLUS	
qName	TokenNameIdentifier	 q Name
+	TokenNamePLUS	
", atts: "	TokenNameStringLiteral	, atts: 
+	TokenNamePLUS	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
DEBUG_ATTRS	TokenNameIdentifier	 DEBUG  ATTRS
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ATTRS	TokenNameIdentifier	 DEBUG  ATTRS
&	TokenNameAND	
attributes	TokenNameIdentifier	 attributes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" empty attribute list"	TokenNameStringLiteral	 empty attribute list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" attr: uri: "	TokenNameStringLiteral	 attr: uri: 
+	TokenNamePLUS	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
", localname: "	TokenNameStringLiteral	, localname: 
+	TokenNamePLUS	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
", qname: "	TokenNameStringLiteral	, qname: 
+	TokenNamePLUS	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
", type: "	TokenNameStringLiteral	, type: 
+	TokenNamePLUS	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
", value: "	TokenNameStringLiteral	, value: 
+	TokenNamePLUS	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
charactersFlush	TokenNameIdentifier	 characters Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
exName	TokenNameIdentifier	 ex Name
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
prefixIndex	TokenNameIdentifier	 prefix Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
elemNode	TokenNameIdentifier	 elem Node
=	TokenNameEQUAL	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
,	TokenNameCOMMA	
exName	TokenNameIdentifier	 ex Name
,	TokenNameCOMMA	
m_parents	TokenNameIdentifier	 m parents
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_previous	TokenNameIdentifier	 m previous
,	TokenNameCOMMA	
prefixIndex	TokenNameIdentifier	 prefix Index
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_indexing	TokenNameIdentifier	 m indexing
)	TokenNameRPAREN	
indexNode	TokenNameIdentifier	 index Node
(	TokenNameLPAREN	
exName	TokenNameIdentifier	 ex Name
,	TokenNameCOMMA	
elemNode	TokenNameIdentifier	 elem Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parents	TokenNameIdentifier	 m parents
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
elemNode	TokenNameIdentifier	 elem Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
startDecls	TokenNameIdentifier	 start Decls
=	TokenNameEQUAL	
m_contextIndexes	TokenNameIdentifier	 m context Indexes
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nDecls	TokenNameIdentifier	 n Decls
=	TokenNameEQUAL	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_pastFirstElement	TokenNameIdentifier	 m past First Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// SPECIAL CASE: Implied declaration at root element 	TokenNameCOMMENT_LINE	SPECIAL CASE: Implied declaration at root element 
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
"xml"	TokenNameStringLiteral	xml
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
declURL	TokenNameIdentifier	 decl URL
=	TokenNameEQUAL	
"http://www.w3.org/XML/1998/namespace"	TokenNameStringLiteral	http://www.w3.org/XML/1998/namespace
;	TokenNameSEMICOLON	
exName	TokenNameIdentifier	 ex Name
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
declURL	TokenNameIdentifier	 decl URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
,	TokenNameCOMMA	
exName	TokenNameIdentifier	 ex Name
,	TokenNameCOMMA	
elemNode	TokenNameIdentifier	 elem Node
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pastFirstElement	TokenNameIdentifier	 m past First Element
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
startDecls	TokenNameIdentifier	 start Decls
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nDecls	TokenNameIdentifier	 n Decls
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
declURL	TokenNameIdentifier	 decl URL
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exName	TokenNameIdentifier	 ex Name
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
declURL	TokenNameIdentifier	 decl URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
,	TokenNameCOMMA	
exName	TokenNameIdentifier	 ex Name
,	TokenNameCOMMA	
elemNode	TokenNameIdentifier	 elem Node
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
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
String	TokenNameIdentifier	 String
attrUri	TokenNameIdentifier	 attr Uri
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrQName	TokenNameIdentifier	 attr Q Name
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
valString	TokenNameIdentifier	 val String
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
attrQName	TokenNameIdentifier	 attr Q Name
,	TokenNameCOMMA	
attrUri	TokenNameIdentifier	 attr Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrLocalName	TokenNameIdentifier	 attr Local Name
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
attrQName	TokenNameIdentifier	 attr Q Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
attrQName	TokenNameIdentifier	 attr Q Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
||	TokenNameOR_OR	
attrQName	TokenNameIdentifier	 attr Q Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
declAlreadyDeclared	TokenNameIdentifier	 decl Already Declared
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// go to the next attribute. 	TokenNameCOMMENT_LINE	go to the next attribute. 
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
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
setIDAttribute	TokenNameIdentifier	 set ID Attribute
(	TokenNameLPAREN	
valString	TokenNameIdentifier	 val String
,	TokenNameCOMMA	
elemNode	TokenNameIdentifier	 elem Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Bit of a hack... if somehow valString is null, stringToIndex will 	TokenNameCOMMENT_LINE	Bit of a hack... if somehow valString is null, stringToIndex will 
// return -1, which will make things very unhappy. 	TokenNameCOMMENT_LINE	return -1, which will make things very unhappy. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
valString	TokenNameIdentifier	 val String
)	TokenNameRPAREN	
valString	TokenNameIdentifier	 val String
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
valString	TokenNameIdentifier	 val String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//String attrLocalName = attributes.getLocalName(i); 	TokenNameCOMMENT_LINE	String attrLocalName = attributes.getLocalName(i); 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixIndex	TokenNameIdentifier	 prefix Index
=	TokenNameEQUAL	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
attrQName	TokenNameIdentifier	 attr Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
prefixIndex	TokenNameIdentifier	 prefix Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
exName	TokenNameIdentifier	 ex Name
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
attrUri	TokenNameIdentifier	 attr Uri
,	TokenNameCOMMA	
attrLocalName	TokenNameIdentifier	 attr Local Name
,	TokenNameCOMMA	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
,	TokenNameCOMMA	
exName	TokenNameIdentifier	 ex Name
,	TokenNameCOMMA	
elemNode	TokenNameIdentifier	 elem Node
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_wsfilter	TokenNameIdentifier	 m wsfilter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
wsv	TokenNameIdentifier	 wsv
=	TokenNameEQUAL	
m_wsfilter	TokenNameIdentifier	 m wsfilter
.	TokenNameDOT	
getShouldStripSpace	TokenNameIdentifier	 get Should Strip Space
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
elemNode	TokenNameIdentifier	 elem Node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
shouldStrip	TokenNameIdentifier	 should Strip
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
.	TokenNameDOT	
INHERIT	TokenNameIdentifier	 INHERIT
==	TokenNameEQUAL_EQUAL	
wsv	TokenNameIdentifier	 wsv
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getShouldStripWhitespace	TokenNameIdentifier	 get Should Strip Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
.	TokenNameDOT	
STRIP	TokenNameIdentifier	 STRIP
==	TokenNameEQUAL_EQUAL	
wsv	TokenNameIdentifier	 wsv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushShouldStripWhitespace	TokenNameIdentifier	 push Should Strip Whitespace
(	TokenNameLPAREN	
shouldStrip	TokenNameIdentifier	 should Strip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_previous	TokenNameIdentifier	 m previous
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
m_contextIndexes	TokenNameIdentifier	 m context Indexes
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for the children. 	TokenNameCOMMENT_LINE	for the children. 
}	TokenNameRBRACE	
/** * Receive notification of the end of an element. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions at the end of * each element (such as finalising a tree node or writing * output to a file).</p> * * @param uri The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param qName The qualified XML 1.0 name (with prefix), or the * empty string if qualified names are not available. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#endElement */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of an element. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions at the end of each element (such as finalising a tree node or writing output to a file).</p> * @param uri The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param qName The qualified XML 1.0 name (with prefix), or the empty string if qualified names are not available. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#endElement 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
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
"endElement: uri: "	TokenNameStringLiteral	endElement: uri: 
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
", localname: "	TokenNameStringLiteral	, localname: 
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
+	TokenNamePLUS	
", qname: "	TokenNameStringLiteral	, qname: 
+	TokenNamePLUS	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charactersFlush	TokenNameIdentifier	 characters Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If no one noticed, startPrefixMapping is a drag. 	TokenNameCOMMENT_LINE	If no one noticed, startPrefixMapping is a drag. 
// Pop the context for the last child (the one pushed by startElement) 	TokenNameCOMMENT_LINE	Pop the context for the last child (the one pushed by startElement) 
m_contextIndexes	TokenNameIdentifier	 m context Indexes
.	TokenNameDOT	
quickPop	TokenNameIdentifier	 quick Pop
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Do it again for this one (the one pushed by the last endElement). 	TokenNameCOMMENT_LINE	Do it again for this one (the one pushed by the last endElement). 
int	TokenNameint	
topContextIndex	TokenNameIdentifier	 top Context Index
=	TokenNameEQUAL	
m_contextIndexes	TokenNameIdentifier	 m context Indexes
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
topContextIndex	TokenNameIdentifier	 top Context Index
!=	TokenNameNOT_EQUAL	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
topContextIndex	TokenNameIdentifier	 top Context Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
lastNode	TokenNameIdentifier	 last Node
=	TokenNameEQUAL	
m_previous	TokenNameIdentifier	 m previous
;	TokenNameSEMICOLON	
m_previous	TokenNameIdentifier	 m previous
=	TokenNameEQUAL	
m_parents	TokenNameIdentifier	 m parents
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If lastNode is still DTM.NULL, this element had no children 	TokenNameCOMMENT_LINE	If lastNode is still DTM.NULL, this element had no children 
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
lastNode	TokenNameIdentifier	 last Node
)	TokenNameRPAREN	
m_firstch	TokenNameIdentifier	 m firstch
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
else	TokenNameelse	
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
lastNode	TokenNameIdentifier	 last Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
popShouldStripWhitespace	TokenNameIdentifier	 pop Should Strip Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of character data inside an element. * * <p>By default, do nothing. Application writers may override this * method to take specific actions for each chunk of character data * (such as adding the data to a node or buffer, or printing it to * a file).</p> * * @param ch The characters. * @param start The start position in the character array. * @param length The number of characters to use from the * character array. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#characters */	TokenNameCOMMENT_JAVADOC	 Receive notification of character data inside an element. * <p>By default, do nothing. Application writers may override this method to take specific actions for each chunk of character data (such as adding the data to a node or buffer, or printing it to a file).</p> * @param ch The characters. @param start The start position in the character array. @param length The number of characters to use from the character array. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#characters 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// First one in this block 	TokenNameCOMMENT_LINE	First one in this block 
{	TokenNameLBRACE	
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
=	TokenNameEQUAL	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_coalescedTextType	TokenNameIdentifier	 m coalesced Text Type
=	TokenNameEQUAL	
m_textType	TokenNameIdentifier	 m text Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Type logic: If all adjacent text is CDATASections, the 	TokenNameCOMMENT_LINE	Type logic: If all adjacent text is CDATASections, the 
// concatentated text is treated as a single CDATASection (see 	TokenNameCOMMENT_LINE	concatentated text is treated as a single CDATASection (see 
// initialization above). If any were ordinary Text, the whole 	TokenNameCOMMENT_LINE	initialization above). If any were ordinary Text, the whole 
// thing is treated as Text. This may be worth %REVIEW%ing. 	TokenNameCOMMENT_LINE	thing is treated as Text. This may be worth %REVIEW%ing. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_textType	TokenNameIdentifier	 m text Type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_coalescedTextType	TokenNameIdentifier	 m coalesced Text Type
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_chars	TokenNameIdentifier	 m chars
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
/** * Receive notification of ignorable whitespace in element content. * * <p>By default, do nothing. Application writers may override this * method to take specific actions for each chunk of ignorable * whitespace (such as adding data to a node or buffer, or printing * it to a file).</p> * * @param ch The whitespace characters. * @param start The start position in the character array. * @param length The number of characters to use from the * character array. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#ignorableWhitespace */	TokenNameCOMMENT_JAVADOC	 Receive notification of ignorable whitespace in element content. * <p>By default, do nothing. Application writers may override this method to take specific actions for each chunk of ignorable whitespace (such as adding data to a node or buffer, or printing it to a file).</p> * @param ch The whitespace characters. @param start The start position in the character array. @param length The number of characters to use from the character array. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#ignorableWhitespace 
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// %OPT% We can probably take advantage of the fact that we know this 	TokenNameCOMMENT_LINE	%OPT% We can probably take advantage of the fact that we know this 
// is whitespace. 	TokenNameCOMMENT_LINE	is whitespace. 
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a processing instruction. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions for each * processing instruction, such as setting status variables or * invoking other methods.</p> * * @param target The processing instruction target. * @param data The processing instruction data, or null if * none is supplied. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#processingInstruction */	TokenNameCOMMENT_JAVADOC	 Receive notification of a processing instruction. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions for each processing instruction, such as setting status variables or invoking other methods.</p> * @param target The processing instruction target. @param data The processing instruction data, or null if none is supplied. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#processingInstruction 
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
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
"processingInstruction: target: "	TokenNameStringLiteral	processingInstruction: target: 
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
+	TokenNamePLUS	
", data: "	TokenNameStringLiteral	, data: 
+	TokenNamePLUS	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charactersFlush	TokenNameIdentifier	 characters Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
exName	TokenNameIdentifier	 ex Name
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_previous	TokenNameIdentifier	 m previous
=	TokenNameEQUAL	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
,	TokenNameCOMMA	
exName	TokenNameIdentifier	 ex Name
,	TokenNameCOMMA	
m_parents	TokenNameIdentifier	 m parents
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_previous	TokenNameIdentifier	 m previous
,	TokenNameCOMMA	
dataIndex	TokenNameIdentifier	 data Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a skipped entity. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions for each * processing instruction, such as setting status variables or * invoking other methods.</p> * * @param name The name of the skipped entity. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#processingInstruction */	TokenNameCOMMENT_JAVADOC	 Receive notification of a skipped entity. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions for each processing instruction, such as setting status variables or invoking other methods.</p> * @param name The name of the skipped entity. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#processingInstruction 
public	TokenNamepublic	
void	TokenNamevoid	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// %REVIEW% What should be done here? 	TokenNameCOMMENT_LINE	%REVIEW% What should be done here? 
// no op 	TokenNameCOMMENT_LINE	no op 
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of the ErrorHandler interface. 	TokenNameCOMMENT_LINE	Implementation of the ErrorHandler interface. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Receive notification of a parser warning. * * <p>The default implementation does nothing. Application writers * may override this method in a subclass to take specific actions * for each warning, such as inserting the message in a log file or * printing it to the console.</p> * * @param e The warning information encoded as an exception. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ErrorHandler#warning * @see org.xml.sax.SAXParseException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a parser warning. * <p>The default implementation does nothing. Application writers may override this method in a subclass to take specific actions for each warning, such as inserting the message in a log file or printing it to the console.</p> * @param e The warning information encoded as an exception. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ErrorHandler#warning @see org.xml.sax.SAXParseException 
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// %REVIEW% Is there anyway to get the JAXP error listener here? 	TokenNameCOMMENT_LINE	%REVIEW% Is there anyway to get the JAXP error listener here? 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a recoverable parser error. * * <p>The default implementation does nothing. Application writers * may override this method in a subclass to take specific actions * for each error, such as inserting the message in a log file or * printing it to the console.</p> * * @param e The warning information encoded as an exception. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ErrorHandler#warning * @see org.xml.sax.SAXParseException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a recoverable parser error. * <p>The default implementation does nothing. Application writers may override this method in a subclass to take specific actions for each error, such as inserting the message in a log file or printing it to the console.</p> * @param e The warning information encoded as an exception. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ErrorHandler#warning @see org.xml.sax.SAXParseException 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report a fatal XML parsing error. * * <p>The default implementation throws a SAXParseException. * Application writers may override this method in a subclass if * they need to take specific actions for each fatal error (such as * collecting all of the errors into a single report): in any case, * the application must stop all regular processing when this * method is invoked, since the document is no longer reliable, and * the parser may no longer report parsing events.</p> * * @param e The error information encoded as an exception. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ErrorHandler#fatalError * @see org.xml.sax.SAXParseException */	TokenNameCOMMENT_JAVADOC	 Report a fatal XML parsing error. * <p>The default implementation throws a SAXParseException. Application writers may override this method in a subclass if they need to take specific actions for each fatal error (such as collecting all of the errors into a single report): in any case, the application must stop all regular processing when this method is invoked, since the document is no longer reliable, and the parser may no longer report parsing events.</p> * @param e The error information encoded as an exception. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ErrorHandler#fatalError @see org.xml.sax.SAXParseException 
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of the DeclHandler interface. 	TokenNameCOMMENT_LINE	Implementation of the DeclHandler interface. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Report an element type declaration. * * <p>The content model will consist of the string "EMPTY", the * string "ANY", or a parenthesised group, optionally followed * by an occurrence indicator. The model will be normalized so * that all whitespace is removed,and will include the enclosing * parentheses.</p> * * @param name The element type name. * @param model The content model as a normalized string. * @throws SAXException The application may raise an exception. */	TokenNameCOMMENT_JAVADOC	 Report an element type declaration. * <p>The content model will consist of the string "EMPTY", the string "ANY", or a parenthesised group, optionally followed by an occurrence indicator. The model will be normalized so that all whitespace is removed,and will include the enclosing parentheses.</p> * @param name The element type name. @param model The content model as a normalized string. @throws SAXException The application may raise an exception. 
public	TokenNamepublic	
void	TokenNamevoid	
elementDecl	TokenNameIdentifier	 element Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// no op 	TokenNameCOMMENT_LINE	no op 
}	TokenNameRBRACE	
/** * Report an attribute type declaration. * * <p>Only the effective (first) declaration for an attribute will * be reported. The type will be one of the strings "CDATA", * "ID", "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", * "ENTITIES", or "NOTATION", or a parenthesized token group with * the separator "|" and all whitespace removed.</p> * * @param eName The name of the associated element. * @param aName The name of the attribute. * @param type A string representing the attribute type. * @param valueDefault A string representing the attribute default * ("#IMPLIED", "#REQUIRED", or "#FIXED") or null if * none of these applies. * @param value A string representing the attribute's default value, * or null if there is none. * @throws SAXException The application may raise an exception. */	TokenNameCOMMENT_JAVADOC	 Report an attribute type declaration. * <p>Only the effective (first) declaration for an attribute will be reported. The type will be one of the strings "CDATA", "ID", "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", "ENTITIES", or "NOTATION", or a parenthesized token group with the separator "|" and all whitespace removed.</p> * @param eName The name of the associated element. @param aName The name of the attribute. @param type A string representing the attribute type. @param valueDefault A string representing the attribute default ("#IMPLIED", "#REQUIRED", or "#FIXED") or null if none of these applies. @param value A string representing the attribute's default value, or null if there is none. @throws SAXException The application may raise an exception. 
public	TokenNamepublic	
void	TokenNamevoid	
attributeDecl	TokenNameIdentifier	 attribute Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
eName	TokenNameIdentifier	 e Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aName	TokenNameIdentifier	 a Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
valueDefault	TokenNameIdentifier	 value Default
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// no op 	TokenNameCOMMENT_LINE	no op 
}	TokenNameRBRACE	
/** * Report an internal entity declaration. * * <p>Only the effective (first) declaration for each entity * will be reported.</p> * * @param name The name of the entity. If it is a parameter * entity, the name will begin with '%'. * @param value The replacement text of the entity. * @throws SAXException The application may raise an exception. * @see #externalEntityDecl * @see org.xml.sax.DTDHandler#unparsedEntityDecl */	TokenNameCOMMENT_JAVADOC	 Report an internal entity declaration. * <p>Only the effective (first) declaration for each entity will be reported.</p> * @param name The name of the entity. If it is a parameter entity, the name will begin with '%'. @param value The replacement text of the entity. @throws SAXException The application may raise an exception. @see #externalEntityDecl @see org.xml.sax.DTDHandler#unparsedEntityDecl 
public	TokenNamepublic	
void	TokenNamevoid	
internalEntityDecl	TokenNameIdentifier	 internal Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// no op 	TokenNameCOMMENT_LINE	no op 
}	TokenNameRBRACE	
/** * Report a parsed external entity declaration. * * <p>Only the effective (first) declaration for each entity * will be reported.</p> * * @param name The name of the entity. If it is a parameter * entity, the name will begin with '%'. * @param publicId The declared public identifier of the entity, or * null if none was declared. * @param systemId The declared system identifier of the entity. * @throws SAXException The application may raise an exception. * @see #internalEntityDecl * @see org.xml.sax.DTDHandler#unparsedEntityDecl */	TokenNameCOMMENT_JAVADOC	 Report a parsed external entity declaration. * <p>Only the effective (first) declaration for each entity will be reported.</p> * @param name The name of the entity. If it is a parameter entity, the name will begin with '%'. @param publicId The declared public identifier of the entity, or null if none was declared. @param systemId The declared system identifier of the entity. @throws SAXException The application may raise an exception. @see #internalEntityDecl @see org.xml.sax.DTDHandler#unparsedEntityDecl 
public	TokenNamepublic	
void	TokenNamevoid	
externalEntityDecl	TokenNameIdentifier	 external Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// no op 	TokenNameCOMMENT_LINE	no op 
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of the LexicalHandler interface. 	TokenNameCOMMENT_LINE	Implementation of the LexicalHandler interface. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Report the start of DTD declarations, if any. * * <p>Any declarations are assumed to be in the internal subset * unless otherwise indicated by a {@link #startEntity startEntity} * event.</p> * * <p>Note that the start/endDTD events will appear within * the start/endDocument events from ContentHandler and * before the first startElement event.</p> * * @param name The document type name. * @param publicId The declared public identifier for the * external DTD subset, or null if none was declared. * @param systemId The declared system identifier for the * external DTD subset, or null if none was declared. * @throws SAXException The application may raise an * exception. * @see #endDTD * @see #startEntity */	TokenNameCOMMENT_JAVADOC	 Report the start of DTD declarations, if any. * <p>Any declarations are assumed to be in the internal subset unless otherwise indicated by a {@link #startEntity startEntity} event.</p> * <p>Note that the start/endDTD events will appear within the start/endDocument events from ContentHandler and before the first startElement event.</p> * @param name The document type name. @param publicId The declared public identifier for the external DTD subset, or null if none was declared. @param systemId The declared system identifier for the external DTD subset, or null if none was declared. @throws SAXException The application may raise an exception. @see #endDTD @see #startEntity 
public	TokenNamepublic	
void	TokenNamevoid	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_insideDTD	TokenNameIdentifier	 m inside DTD
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the end of DTD declarations. * * @throws SAXException The application may raise an exception. * @see #startDTD */	TokenNameCOMMENT_JAVADOC	 Report the end of DTD declarations. * @throws SAXException The application may raise an exception. @see #startDTD 
public	TokenNamepublic	
void	TokenNamevoid	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_insideDTD	TokenNameIdentifier	 m inside DTD
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the beginning of an entity in content. * * <p><strong>NOTE:</entity> entity references in attribute * values -- and the start and end of the document entity -- * are never reported.</p> * * <p>The start and end of the external DTD subset are reported * using the pseudo-name "[dtd]". All other events must be * properly nested within start/end entity events.</p> * * <p>Note that skipped entities will be reported through the * {@link org.xml.sax.ContentHandler#skippedEntity skippedEntity} * event, which is part of the ContentHandler interface.</p> * * @param name The name of the entity. If it is a parameter * entity, the name will begin with '%'. * @throws SAXException The application may raise an exception. * @see #endEntity * @see org.xml.sax.ext.DeclHandler#internalEntityDecl * @see org.xml.sax.ext.DeclHandler#externalEntityDecl */	TokenNameCOMMENT_JAVADOC	 Report the beginning of an entity in content. * <p><strong>NOTE:</entity> entity references in attribute values -- and the start and end of the document entity -- are never reported.</p> * <p>The start and end of the external DTD subset are reported using the pseudo-name "[dtd]". All other events must be properly nested within start/end entity events.</p> * <p>Note that skipped entities will be reported through the {@link org.xml.sax.ContentHandler#skippedEntity skippedEntity} event, which is part of the ContentHandler interface.</p> * @param name The name of the entity. If it is a parameter entity, the name will begin with '%'. @throws SAXException The application may raise an exception. @see #endEntity @see org.xml.sax.ext.DeclHandler#internalEntityDecl @see org.xml.sax.ext.DeclHandler#externalEntityDecl 
public	TokenNamepublic	
void	TokenNamevoid	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// no op 	TokenNameCOMMENT_LINE	no op 
}	TokenNameRBRACE	
/** * Report the end of an entity. * * @param name The name of the entity that is ending. * @throws SAXException The application may raise an exception. * @see #startEntity */	TokenNameCOMMENT_JAVADOC	 Report the end of an entity. * @param name The name of the entity that is ending. @throws SAXException The application may raise an exception. @see #startEntity 
public	TokenNamepublic	
void	TokenNamevoid	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// no op 	TokenNameCOMMENT_LINE	no op 
}	TokenNameRBRACE	
/** * Report the start of a CDATA section. * * <p>The contents of the CDATA section will be reported through * the regular {@link org.xml.sax.ContentHandler#characters * characters} event.</p> * * @throws SAXException The application may raise an exception. * @see #endCDATA */	TokenNameCOMMENT_JAVADOC	 Report the start of a CDATA section. * <p>The contents of the CDATA section will be reported through the regular {@link org.xml.sax.ContentHandler#characters characters} event.</p> * @throws SAXException The application may raise an exception. @see #endCDATA 
public	TokenNamepublic	
void	TokenNamevoid	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_textType	TokenNameIdentifier	 m text Type
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the end of a CDATA section. * * @throws SAXException The application may raise an exception. * @see #startCDATA */	TokenNameCOMMENT_JAVADOC	 Report the end of a CDATA section. * @throws SAXException The application may raise an exception. @see #startCDATA 
public	TokenNamepublic	
void	TokenNamevoid	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_textType	TokenNameIdentifier	 m text Type
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report an XML comment anywhere in the document. * * <p>This callback will be used for comments inside or outside the * document element, including comments in the external DTD * subset (if read).</p> * * @param ch An array holding the characters in the comment. * @param start The starting position in the array. * @param length The number of characters to use from the array. * @throws SAXException The application may raise an exception. */	TokenNameCOMMENT_JAVADOC	 Report an XML comment anywhere in the document. * <p>This callback will be used for comments inside or outside the document element, including comments in the external DTD subset (if read).</p> * @param ch An array holding the characters in the comment. @param start The starting position in the array. @param length The number of characters to use from the array. @throws SAXException The application may raise an exception. 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_insideDTD	TokenNameIdentifier	 m inside DTD
)	TokenNameRPAREN	
// ignore comments if we're inside the DTD 	TokenNameCOMMENT_LINE	ignore comments if we're inside the DTD 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
charactersFlush	TokenNameIdentifier	 characters Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
exName	TokenNameIdentifier	 ex Name
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For now, treat comments as strings... I guess we should do a 	TokenNameCOMMENT_LINE	For now, treat comments as strings... I guess we should do a 
// seperate FSB buffer instead. 	TokenNameCOMMENT_LINE	seperate FSB buffer instead. 
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_previous	TokenNameIdentifier	 m previous
=	TokenNameEQUAL	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
,	TokenNameCOMMA	
exName	TokenNameIdentifier	 ex Name
,	TokenNameCOMMA	
m_parents	TokenNameIdentifier	 m parents
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_previous	TokenNameIdentifier	 m previous
,	TokenNameCOMMA	
dataIndex	TokenNameIdentifier	 data Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a run time property for this DTM instance. * * %REVIEW% Now that we no longer use this method to support * getSourceLocatorFor, can we remove it? * * @param property a <code>String</code> value * @param value an <code>Object</code> value */	TokenNameCOMMENT_JAVADOC	 Set a run time property for this DTM instance. * %REVIEW% Now that we no longer use this method to support getSourceLocatorFor, can we remove it? * @param property a <code>String</code> value @param value an <code>Object</code> value 
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
/** Retrieve the SourceLocator associated with a specific node. * This is only meaningful if the XalanProperties.SOURCE_LOCATION flag was * set True using setProperty; if it was never set, or was set false, we * will return null. * * (We _could_ return a locator with the document's base URI and bogus * line/column information. Trying that; see the else clause.) * */	TokenNameCOMMENT_JAVADOC	 Retrieve the SourceLocator associated with a specific node. This is only meaningful if the XalanProperties.SOURCE_LOCATION flag was set True using setProperty; if it was never set, or was set false, we will return null. * (We _could_ return a locator with the document's base URI and bogus line/column information. Trying that; see the else clause.) 
public	TokenNamepublic	
SourceLocator	TokenNameIdentifier	 Source Locator
getSourceLocatorFor	TokenNameIdentifier	 get Source Locator For
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_useSourceLocationProperty	TokenNameIdentifier	 m use Source Location Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
NodeLocator	TokenNameIdentifier	 Node Locator
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
m_sourceSystemId	TokenNameIdentifier	 m source System Id
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_sourceLine	TokenNameIdentifier	 m source Line
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_sourceColumn	TokenNameIdentifier	 m source Column
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_locator	TokenNameIdentifier	 m locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NodeLocator	TokenNameIdentifier	 Node Locator
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_systemId	TokenNameIdentifier	 m system Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NodeLocator	TokenNameIdentifier	 Node Locator
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
m_systemId	TokenNameIdentifier	 m system Id
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFixedNames	TokenNameIdentifier	 get Fixed Names
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_fixednames	TokenNameIdentifier	 m fixednames
[	TokenNameLBRACKET	
type	TokenNameIdentifier	 type
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
