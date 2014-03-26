/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SourceTreeManager.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SourceTreeManager.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
URIResolver	TokenNameIdentifier	 URI Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXSource	TokenNameIdentifier	 SAX Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamSource	TokenNameIdentifier	 Stream Source
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
XMLReader	TokenNameIdentifier	 XML Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
;	TokenNameSEMICOLON	
/** * This class bottlenecks all management of source trees. The methods * in this class should allow easy garbage collection of source * trees (not yet!), and should centralize parsing for those source trees. */	TokenNameCOMMENT_JAVADOC	 This class bottlenecks all management of source trees. The methods in this class should allow easy garbage collection of source trees (not yet!), and should centralize parsing for those source trees. 
public	TokenNamepublic	
class	TokenNameclass	
SourceTreeManager	TokenNameIdentifier	 Source Tree Manager
{	TokenNameLBRACE	
/** Vector of SourceTree objects that this manager manages. */	TokenNameCOMMENT_JAVADOC	 Vector of SourceTree objects that this manager manages. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_sourceTree	TokenNameIdentifier	 m source Tree
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Reset the list of SourceTree objects that this manager manages. * */	TokenNameCOMMENT_JAVADOC	 Reset the list of SourceTree objects that this manager manages. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_sourceTree	TokenNameIdentifier	 m source Tree
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The TrAX URI resolver used to obtain source trees. */	TokenNameCOMMENT_JAVADOC	 The TrAX URI resolver used to obtain source trees. 
URIResolver	TokenNameIdentifier	 URI Resolver
m_uriResolver	TokenNameIdentifier	 m uri Resolver
;	TokenNameSEMICOLON	
/** * Set an object that will be used to resolve URIs used in * document(), etc. * @param resolver An object that implements the URIResolver interface, * or null. */	TokenNameCOMMENT_JAVADOC	 Set an object that will be used to resolve URIs used in document(), etc. @param resolver An object that implements the URIResolver interface, or null. 
public	TokenNamepublic	
void	TokenNamevoid	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
URIResolver	TokenNameIdentifier	 URI Resolver
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_uriResolver	TokenNameIdentifier	 m uri Resolver
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the object that will be used to resolve URIs used in * document(), etc. * @return An object that implements the URIResolver interface, * or null. */	TokenNameCOMMENT_JAVADOC	 Get the object that will be used to resolve URIs used in document(), etc. @return An object that implements the URIResolver interface, or null. 
public	TokenNamepublic	
URIResolver	TokenNameIdentifier	 URI Resolver
getURIResolver	TokenNameIdentifier	 get URI Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_uriResolver	TokenNameIdentifier	 m uri Resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a document, find the URL associated with that document. * @param owner Document that was previously processed by this liaison. * * @return The base URI of the owner argument. */	TokenNameCOMMENT_JAVADOC	 Given a document, find the URL associated with that document. @param owner Document that was previously processed by this liaison. * @return The base URI of the owner argument. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
findURIFromDoc	TokenNameIdentifier	 find URI From Doc
(	TokenNameLPAREN	
int	TokenNameint	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_sourceTree	TokenNameIdentifier	 m source Tree
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
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SourceTree	TokenNameIdentifier	 Source Tree
sTree	TokenNameIdentifier	 s Tree
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SourceTree	TokenNameIdentifier	 Source Tree
)	TokenNameRPAREN	
m_sourceTree	TokenNameIdentifier	 m source Tree
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
==	TokenNameEQUAL_EQUAL	
sTree	TokenNameIdentifier	 s Tree
.	TokenNameDOT	
m_root	TokenNameIdentifier	 m root
)	TokenNameRPAREN	
return	TokenNamereturn	
sTree	TokenNameIdentifier	 s Tree
.	TokenNameDOT	
m_url	TokenNameIdentifier	 m url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This will be called by the processor when it encounters * an xsl:include, xsl:import, or document() function. * * @param base The base URI that should be used. * @param urlString Value from an xsl:import or xsl:include's href attribute, * or a URI specified in the document() function. * * @return a Source that can be used to process the resource. * * @throws IOException * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 This will be called by the processor when it encounters an xsl:include, xsl:import, or document() function. * @param base The base URI that should be used. @param urlString Value from an xsl:import or xsl:include's href attribute, or a URI specified in the document() function. * @return a Source that can be used to process the resource. * @throws IOException @throws TransformerException 
public	TokenNamepublic	
Source	TokenNameIdentifier	 Source
resolveURI	TokenNameIdentifier	 resolve URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
urlString	TokenNameIdentifier	 url String
,	TokenNameCOMMA	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_uriResolver	TokenNameIdentifier	 m uri Resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
m_uriResolver	TokenNameIdentifier	 m uri Resolver
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
urlString	TokenNameIdentifier	 url String
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
.	TokenNameDOT	
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
urlString	TokenNameIdentifier	 url String
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** JJK: Support <?xalan:doc_cache_off?> kluge in ElemForEach. * TODO: This function is highly dangerous. Cache management must be improved. * * @param n The node to remove. */	TokenNameCOMMENT_JAVADOC	 JJK: Support <?xalan:doc_cache_off?> kluge in ElemForEach. TODO: This function is highly dangerous. Cache management must be improved. * @param n The node to remove. 
public	TokenNamepublic	
void	TokenNamevoid	
removeDocumentFromCache	TokenNameIdentifier	 remove Document From Cache
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_sourceTree	TokenNameIdentifier	 m source Tree
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
SourceTree	TokenNameIdentifier	 Source Tree
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SourceTree	TokenNameIdentifier	 Source Tree
)	TokenNameRPAREN	
m_sourceTree	TokenNameIdentifier	 m source Tree
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
m_root	TokenNameIdentifier	 m root
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_sourceTree	TokenNameIdentifier	 m source Tree
.	TokenNameDOT	
removeElementAt	TokenNameIdentifier	 remove Element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Put the source tree root node in the document cache. * TODO: This function needs to be a LOT more sophisticated. * * @param n The node to cache. * @param source The Source object to cache. */	TokenNameCOMMENT_JAVADOC	 Put the source tree root node in the document cache. TODO: This function needs to be a LOT more sophisticated. * @param n The node to cache. @param source The Source object to cache. 
public	TokenNamepublic	
void	TokenNamevoid	
putDocumentInCache	TokenNameIdentifier	 put Document In Cache
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
cachedNode	TokenNameIdentifier	 cached Node
=	TokenNameEQUAL	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
cachedNode	TokenNameIdentifier	 cached Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
cachedNode	TokenNameIdentifier	 cached Node
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Programmer's Error! "	TokenNameStringLiteral	Programmer's Error! 
+	TokenNamePLUS	
"putDocumentInCache found reparse of doc: "	TokenNameStringLiteral	putDocumentInCache found reparse of doc: 
+	TokenNamePLUS	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_sourceTree	TokenNameIdentifier	 m source Tree
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
SourceTree	TokenNameIdentifier	 Source Tree
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Given a Source object, find the node associated with it. * * @param source The Source object to act as the key. * * @return The node that is associated with the Source, or null if not found. */	TokenNameCOMMENT_JAVADOC	 Given a Source object, find the node associated with it. * @param source The Source object to act as the key. * @return The node that is associated with the Source, or null if not found. 
public	TokenNamepublic	
int	TokenNameint	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if (source instanceof DOMSource) 	TokenNameCOMMENT_LINE	if (source instanceof DOMSource) 
// return ((DOMSource) source).getNode(); 	TokenNameCOMMENT_LINE	return ((DOMSource) source).getNode(); 
// TODO: Not sure if the BaseID is really the same thing as the ID. 	TokenNameCOMMENT_LINE	TODO: Not sure if the BaseID is really the same thing as the ID. 
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_sourceTree	TokenNameIdentifier	 m source Tree
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("getNode: "+n); 	TokenNameCOMMENT_LINE	System.out.println("getNode: "+n); 
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
SourceTree	TokenNameIdentifier	 Source Tree
sTree	TokenNameIdentifier	 s Tree
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SourceTree	TokenNameIdentifier	 Source Tree
)	TokenNameRPAREN	
m_sourceTree	TokenNameIdentifier	 m source Tree
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("getNode - url: "+url); 	TokenNameCOMMENT_LINE	System.out.println("getNode - url: "+url); 
// System.out.println("getNode - sTree.m_url: "+sTree.m_url); 	TokenNameCOMMENT_LINE	System.out.println("getNode - sTree.m_url: "+sTree.m_url); 
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
sTree	TokenNameIdentifier	 s Tree
.	TokenNameDOT	
m_url	TokenNameIdentifier	 m url
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
sTree	TokenNameIdentifier	 s Tree
.	TokenNameDOT	
m_root	TokenNameIdentifier	 m root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println("getNode - returning: "+node); 	TokenNameCOMMENT_LINE	System.out.println("getNode - returning: "+node); 
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the source tree from the a base URL and a URL string. * * @param base The base URI to use if the urlString is relative. * @param urlString An absolute or relative URL string. * @param locator The location of the caller, for diagnostic purposes. * * @return should be a non-null reference to the node identified by the * base and urlString. * * @throws TransformerException If the URL can not resolve to a node. */	TokenNameCOMMENT_JAVADOC	 Get the source tree from the a base URL and a URL string. * @param base The base URI to use if the urlString is relative. @param urlString An absolute or relative URL string. @param locator The location of the caller, for diagnostic purposes. * @return should be a non-null reference to the node identified by the base and urlString. * @throws TransformerException If the URL can not resolve to a node. 
public	TokenNamepublic	
int	TokenNameint	
getSourceTree	TokenNameIdentifier	 get Source Tree
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
urlString	TokenNameIdentifier	 url String
,	TokenNameCOMMA	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// System.out.println("getSourceTree"); 	TokenNameCOMMENT_LINE	System.out.println("getSourceTree"); 
try	TokenNametry	
{	TokenNameLBRACE	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
resolveURI	TokenNameIdentifier	 resolve URI
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
urlString	TokenNameIdentifier	 url String
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("getSourceTree - base: "+base+", urlString: "+urlString+", source: "+source.getSystemId()); 	TokenNameCOMMENT_LINE	System.out.println("getSourceTree - base: "+base+", urlString: "+urlString+", source: "+source.getSystemId()); 
return	TokenNamereturn	
getSourceTree	TokenNameIdentifier	 get Source Tree
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* catch (TransformerException te) { throw new TransformerException(te.getMessage(), locator, te); }*/	TokenNameCOMMENT_BLOCK	 catch (TransformerException te) { throw new TransformerException(te.getMessage(), locator, te); }
}	TokenNameRBRACE	
/** * Get the source tree from the input source. * * @param source The Source object that should identify the desired node. * @param locator The location of the caller, for diagnostic purposes. * * @return non-null reference to a node. * * @throws TransformerException if the Source argument can't be resolved to * a node. */	TokenNameCOMMENT_JAVADOC	 Get the source tree from the input source. * @param source The Source object that should identify the desired node. @param locator The location of the caller, for diagnostic purposes. * @return non-null reference to a node. * @throws TransformerException if the Source argument can't be resolved to a node. 
public	TokenNamepublic	
int	TokenNameint	
getSourceTree	TokenNameIdentifier	 get Source Tree
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
parseToNode	TokenNameIdentifier	 parse To Node
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
putDocumentInCache	TokenNameIdentifier	 put Document In Cache
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Try to create a DOM source tree from the input source. * * @param source The Source object that identifies the source node. * @param locator The location of the caller, for diagnostic purposes. * * @return non-null reference to node identified by the source argument. * * @throws TransformerException if the source argument can not be resolved * to a source node. */	TokenNameCOMMENT_JAVADOC	 Try to create a DOM source tree from the input source. * @param source The Source object that identifies the source node. @param locator The location of the caller, for diagnostic purposes. * @return non-null reference to node identified by the source argument. * @throws TransformerException if the source argument can not be resolved to a source node. 
public	TokenNamepublic	
int	TokenNameint	
parseToNode	TokenNameIdentifier	 parse To Node
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
xowner	TokenNameIdentifier	 xowner
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getOwnerObject	TokenNameIdentifier	 get Owner Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
xowner	TokenNameIdentifier	 xowner
&&	TokenNameAND_AND	
xowner	TokenNameIdentifier	 xowner
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
)	TokenNameRPAREN	
xowner	TokenNameIdentifier	 xowner
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//e.printStackTrace(); 	TokenNameCOMMENT_LINE	e.printStackTrace(); 
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method returns the SAX2 parser to use with the InputSource * obtained from this URI. * It may return null if any SAX2-conformant XML parser can be used, * or if getInputSource() will also return null. The parser must * be free for use (i.e. * not currently in use for another parse(). * * @param inputSource The value returned from the URIResolver. * @return a SAX2 XMLReader to use to resolve the inputSource argument. * @param locator The location of the original caller, for diagnostic purposes. * * @throws TransformerException if the reader can not be created. */	TokenNameCOMMENT_JAVADOC	 This method returns the SAX2 parser to use with the InputSource obtained from this URI. It may return null if any SAX2-conformant XML parser can be used, or if getInputSource() will also return null. The parser must be free for use (i.e. not currently in use for another parse(). * @param inputSource The value returned from the URIResolver. @return a SAX2 XMLReader to use to resolve the inputSource argument. @param locator The location of the original caller, for diagnostic purposes. * @throws TransformerException if the reader can not be created. 
public	TokenNamepublic	
static	TokenNamestatic	
XMLReader	TokenNameIdentifier	 XML Reader
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
inputSource	TokenNameIdentifier	 input Source
,	TokenNameCOMMA	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
instanceof	TokenNameinstanceof	
SAXSource	TokenNameIdentifier	 SAX Source
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXSource	TokenNameIdentifier	 SAX Source
)	TokenNameRPAREN	
inputSource	TokenNameIdentifier	 input Source
)	TokenNameRPAREN	
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParser	TokenNameIdentifier	 SAX Parser
jaxpParser	TokenNameIdentifier	 jaxp Parser
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
jaxpParser	TokenNameIdentifier	 jaxp Parser
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
ex	TokenNameIdentifier	 ex
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
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
FactoryConfigurationError	TokenNameIdentifier	 Factory Configuration Error
ex1	TokenNameIdentifier	 ex1
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
ex1	TokenNameIdentifier	 ex1
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodError	TokenNameIdentifier	 No Such Method Error
ex2	TokenNameIdentifier	 ex2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
AbstractMethodError	TokenNameIdentifier	 Abstract Method Error
ame	TokenNameIdentifier	 ame
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
.	TokenNameDOT	
createXMLReader	TokenNameIdentifier	 create XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
"http://xml.org/sax/features/namespace-prefixes"	TokenNameStringLiteral	http://xml.org/sax/features/namespace-prefixes
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// What can we do? 	TokenNameCOMMENT_LINE	What can we do? 
// TODO: User diagnostics. 	TokenNameCOMMENT_LINE	TODO: User diagnostics. 
}	TokenNameRBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
