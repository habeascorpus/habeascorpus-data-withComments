/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SAXSVGDocumentFactory	TokenNameIdentifier	 SAXSVG Document Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGDocumentFactory	TokenNameIdentifier	 SVG Document Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DocumentDescriptor	TokenNameIdentifier	 Document Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CleanerThread	TokenNameIdentifier	 Cleaner Thread
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGDocument	TokenNameIdentifier	 SVG Document
;	TokenNameSEMICOLON	
/** * This class is responsible on loading an SVG document and * maintaining a cache. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: DocumentLoader.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class is responsible on loading an SVG document and maintaining a cache. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: DocumentLoader.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DocumentLoader	TokenNameIdentifier	 Document Loader
{	TokenNameLBRACE	
/** * The document factory used to create the document according a * DOM implementation. */	TokenNameCOMMENT_JAVADOC	 The document factory used to create the document according a DOM implementation. 
protected	TokenNameprotected	
SVGDocumentFactory	TokenNameIdentifier	 SVG Document Factory
documentFactory	TokenNameIdentifier	 document Factory
;	TokenNameSEMICOLON	
/** * The map that contains the Document indexed by the URI. * * WARNING: tagged private as no element of this Map should be * referenced outise of this class */	TokenNameCOMMENT_JAVADOC	 The map that contains the Document indexed by the URI. * WARNING: tagged private as no element of this Map should be referenced outise of this class 
protected	TokenNameprotected	
HashMap	TokenNameIdentifier	 Hash Map
cacheMap	TokenNameIdentifier	 cache Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The user agent. */	TokenNameCOMMENT_JAVADOC	 The user agent. 
protected	TokenNameprotected	
UserAgent	TokenNameIdentifier	 User Agent
userAgent	TokenNameIdentifier	 user Agent
;	TokenNameSEMICOLON	
/** * Constructs a new <tt>DocumentLoader</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>DocumentLoader</tt>. 
protected	TokenNameprotected	
DocumentLoader	TokenNameIdentifier	 Document Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructs a new <tt>DocumentLoader</tt> with the specified XML parser. * @param userAgent the user agent to use */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>DocumentLoader</tt> with the specified XML parser. @param userAgent the user agent to use 
public	TokenNamepublic	
DocumentLoader	TokenNameIdentifier	 Document Loader
(	TokenNameLPAREN	
UserAgent	TokenNameIdentifier	 User Agent
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userAgent	TokenNameIdentifier	 user Agent
=	TokenNameEQUAL	
userAgent	TokenNameIdentifier	 user Agent
;	TokenNameSEMICOLON	
documentFactory	TokenNameIdentifier	 document Factory
=	TokenNameEQUAL	
new	TokenNamenew	
SAXSVGDocumentFactory	TokenNameIdentifier	 SAXSVG Document Factory
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
.	TokenNameDOT	
getXMLParserClassName	TokenNameIdentifier	 get XML Parser Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
documentFactory	TokenNameIdentifier	 document Factory
.	TokenNameDOT	
setValidating	TokenNameIdentifier	 set Validating
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
.	TokenNameDOT	
isXMLParserValidating	TokenNameIdentifier	 is XML Parser Validating
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
checkCache	TokenNameIdentifier	 check Cache
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DocumentState	TokenNameIdentifier	 Document State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
cacheMap	TokenNameIdentifier	 cache Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocumentState	TokenNameIdentifier	 Document State
)	TokenNameRPAREN	
cacheMap	TokenNameIdentifier	 cache Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a document from the specified uri. * @param uri the uri of the document * @exception IOException if an I/O error occured while loading * the document */	TokenNameCOMMENT_JAVADOC	 Returns a document from the specified uri. @param uri the uri of the document @exception IOException if an I/O error occured while loading the document 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
checkCache	TokenNameIdentifier	 check Cache
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
SVGDocument	TokenNameIdentifier	 SVG Document
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
documentFactory	TokenNameIdentifier	 document Factory
.	TokenNameDOT	
createSVGDocument	TokenNameIdentifier	 create SVG Document
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocumentDescriptor	TokenNameIdentifier	 Document Descriptor
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
documentFactory	TokenNameIdentifier	 document Factory
.	TokenNameDOT	
getDocumentDescriptor	TokenNameIdentifier	 get Document Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocumentState	TokenNameIdentifier	 Document State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
new	TokenNamenew	
DocumentState	TokenNameIdentifier	 Document State
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
cacheMap	TokenNameIdentifier	 cache Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cacheMap	TokenNameIdentifier	 cache Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a document from the specified uri. * @param uri the uri of the document * @exception IOException if an I/O error occured while loading * the document */	TokenNameCOMMENT_JAVADOC	 Returns a document from the specified uri. @param uri the uri of the document @exception IOException if an I/O error occured while loading the document 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
checkCache	TokenNameIdentifier	 check Cache
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
SVGDocument	TokenNameIdentifier	 SVG Document
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
documentFactory	TokenNameIdentifier	 document Factory
.	TokenNameDOT	
createSVGDocument	TokenNameIdentifier	 create SVG Document
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocumentDescriptor	TokenNameIdentifier	 Document Descriptor
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
documentFactory	TokenNameIdentifier	 document Factory
.	TokenNameDOT	
getDocumentDescriptor	TokenNameIdentifier	 get Document Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocumentState	TokenNameIdentifier	 Document State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
new	TokenNamenew	
DocumentState	TokenNameIdentifier	 Document State
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
cacheMap	TokenNameIdentifier	 cache Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cacheMap	TokenNameIdentifier	 cache Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the userAgent used by this DocumentLoader */	TokenNameCOMMENT_JAVADOC	 Returns the userAgent used by this DocumentLoader 
public	TokenNamepublic	
UserAgent	TokenNameIdentifier	 User Agent
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userAgent	TokenNameIdentifier	 user Agent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Disposes and releases all resources allocated by this document loader. */	TokenNameCOMMENT_JAVADOC	 Disposes and releases all resources allocated by this document loader. 
public	TokenNamepublic	
void	TokenNamevoid	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// new Exception("purge the cache").printStackTrace(); 	TokenNameCOMMENT_LINE	new Exception("purge the cache").printStackTrace(); 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
cacheMap	TokenNameIdentifier	 cache Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cacheMap	TokenNameIdentifier	 cache Map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the line in the source code of the specified element or * -1 if not found. * * @param e the element * @return -1 the document has been removed from the cache or has not * been loaded by this document loader. */	TokenNameCOMMENT_JAVADOC	 Returns the line in the source code of the specified element or -1 if not found. * @param e the element @return -1 the document has been removed from the cache or has not been loaded by this document loader. 
public	TokenNamepublic	
int	TokenNameint	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGDocument	TokenNameIdentifier	 SVG Document
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getURL	TokenNameIdentifier	 get URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocumentState	TokenNameIdentifier	 Document State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
cacheMap	TokenNameIdentifier	 cache Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocumentState	TokenNameIdentifier	 Document State
)	TokenNameRPAREN	
cacheMap	TokenNameIdentifier	 cache Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
getLocationLine	TokenNameIdentifier	 get Location Line
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A simple class that contains a Document and its number of nodes. */	TokenNameCOMMENT_JAVADOC	 A simple class that contains a Document and its number of nodes. 
private	TokenNameprivate	
class	TokenNameclass	
DocumentState	TokenNameIdentifier	 Document State
extends	TokenNameextends	
CleanerThread	TokenNameIdentifier	 Cleaner Thread
.	TokenNameDOT	
SoftReferenceCleared	TokenNameIdentifier	 Soft Reference Cleared
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DocumentDescriptor	TokenNameIdentifier	 Document Descriptor
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DocumentState	TokenNameIdentifier	 Document State
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
DocumentDescriptor	TokenNameIdentifier	 Document Descriptor
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
cleared	TokenNameIdentifier	 cleared
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
cacheMap	TokenNameIdentifier	 cache Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cacheMap	TokenNameIdentifier	 cache Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
DocumentDescriptor	TokenNameIdentifier	 Document Descriptor
getDocumentDescriptor	TokenNameIdentifier	 get Document Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
)	TokenNameRPAREN	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
