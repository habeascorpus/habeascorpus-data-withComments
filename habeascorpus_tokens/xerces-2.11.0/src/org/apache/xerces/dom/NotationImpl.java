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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
URI	TokenNameIdentifier	 URI
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
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
Notation	TokenNameIdentifier	 Notation
;	TokenNameSEMICOLON	
/** * Notations are how the Document Type Description (DTD) records hints * about the format of an XML "unparsed entity" -- in other words, * non-XML data bound to this document type, which some applications * may wish to consult when manipulating the document. A Notation * represents a name-value pair, with its nodeName being set to the * declared name of the notation. * <P> * Notations are also used to formally declare the "targets" of * Processing Instructions. * <P> * Note that the Notation's data is non-DOM information; the DOM only * records what and where it is. * <P> * See the XML 1.0 spec, sections 4.7 and 2.6, for more info. * <P> * Level 1 of the DOM does not support editing Notation contents. * * @xerces.internal * * @version $Id: NotationImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 Notations are how the Document Type Description (DTD) records hints about the format of an XML "unparsed entity" -- in other words, non-XML data bound to this document type, which some applications may wish to consult when manipulating the document. A Notation represents a name-value pair, with its nodeName being set to the declared name of the notation. <P> Notations are also used to formally declare the "targets" of Processing Instructions. <P> Note that the Notation's data is non-DOM information; the DOM only records what and where it is. <P> See the XML 1.0 spec, sections 4.7 and 2.6, for more info. <P> Level 1 of the DOM does not support editing Notation contents. * @xerces.internal * @version $Id: NotationImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
NotationImpl	TokenNameIdentifier	 Notation Impl
extends	TokenNameextends	
NodeImpl	TokenNameIdentifier	 Node Impl
implements	TokenNameimplements	
Notation	TokenNameIdentifier	 Notation
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
-	TokenNameMINUS	
764632195890658402L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Notation name. */	TokenNameCOMMENT_JAVADOC	 Notation name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** Public identifier. */	TokenNameCOMMENT_JAVADOC	 Public identifier. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
/** System identifier. */	TokenNameCOMMENT_JAVADOC	 System identifier. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
/** Base URI*/	TokenNameCOMMENT_JAVADOC	 Base URI
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Factory constructor. */	TokenNameCOMMENT_JAVADOC	 Factory constructor. 
public	TokenNamepublic	
NotationImpl	TokenNameIdentifier	 Notation Impl
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDoc	TokenNameIdentifier	 owner Doc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDoc	TokenNameIdentifier	 owner Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Node methods 	TokenNameCOMMENT_LINE	Node methods 
// 	TokenNameCOMMENT_LINE	 
/** * A short integer indicating what type of node this is. The named * constants for this value are defined in the org.w3c.dom.Node interface. */	TokenNameCOMMENT_JAVADOC	 A short integer indicating what type of node this is. The named constants for this value are defined in the org.w3c.dom.Node interface. 
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the notation name */	TokenNameCOMMENT_JAVADOC	 Returns the notation name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
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
}	TokenNameRBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Notation methods 	TokenNameCOMMENT_LINE	Notation methods 
// 	TokenNameCOMMENT_LINE	 
/** * The Public Identifier for this Notation. If no public identifier * was specified, this will be null. */	TokenNameCOMMENT_JAVADOC	 The Public Identifier for this Notation. If no public identifier was specified, this will be null. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
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
}	TokenNameRBRACE	
return	TokenNamereturn	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getPublicId():String 	TokenNameCOMMENT_LINE	getPublicId():String 
/** * The System Identifier for this Notation. If no system identifier * was specified, this will be null. */	TokenNameCOMMENT_JAVADOC	 The System Identifier for this Notation. If no system identifier was specified, this will be null. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
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
}	TokenNameRBRACE	
return	TokenNamereturn	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getSystemId():String 	TokenNameCOMMENT_LINE	getSystemId():String 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * NON-DOM: The Public Identifier for this Notation. If no public * identifier was specified, this will be null. */	TokenNameCOMMENT_JAVADOC	 NON-DOM: The Public Identifier for this Notation. If no public identifier was specified, this will be null. 
public	TokenNamepublic	
void	TokenNamevoid	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setPublicId(String) 	TokenNameCOMMENT_LINE	setPublicId(String) 
/** * NON-DOM: The System Identifier for this Notation. If no system * identifier was specified, this will be null. */	TokenNameCOMMENT_JAVADOC	 NON-DOM: The System Identifier for this Notation. If no system identifier was specified, this will be null. 
public	TokenNamepublic	
void	TokenNamevoid	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setSystemId(String) 	TokenNameCOMMENT_LINE	setSystemId(String) 
/** * Returns the absolute base URI of this node or null if the implementation * wasn't able to obtain an absolute URI. Note: If the URI is malformed, a * null is returned. * * @return The absolute base URI of this node or null. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 Returns the absolute base URI of this node or null if the implementation wasn't able to obtain an absolute URI. Note: If the URI is malformed, a null is returned. * @return The absolute base URI of this node or null. @since DOM Level 3 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseURI	TokenNameIdentifier	 get Base URI
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
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
baseURI	TokenNameIdentifier	 base URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
baseURI	TokenNameIdentifier	 base URI
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// attribute value is always empty string 	TokenNameCOMMENT_LINE	attribute value is always empty string 
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
URI	TokenNameIdentifier	 URI
(	TokenNameLPAREN	
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
URI	TokenNameIdentifier	 URI
.	TokenNameDOT	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: what should happen in this case? 	TokenNameCOMMENT_LINE	REVISIT: what should happen in this case? 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
baseURI	TokenNameIdentifier	 base URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** NON-DOM: set base uri*/	TokenNameCOMMENT_JAVADOC	 NON-DOM: set base uri
public	TokenNamepublic	
void	TokenNamevoid	
setBaseURI	TokenNameIdentifier	 set Base URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
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
}	TokenNameRBRACE	
baseURI	TokenNameIdentifier	 base URI
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class NotationImpl 	TokenNameCOMMENT_LINE	class NotationImpl 
