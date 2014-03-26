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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
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
AbstractNode	TokenNameIdentifier	 Abstract Node
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
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
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
ParsedURL	TokenNameIdentifier	 Parsed URL
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
Node	TokenNameIdentifier	 Node
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
/** * This class is used to resolve the URI that can be found in a SVG document. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: URIResolver.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class is used to resolve the URI that can be found in a SVG document. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: URIResolver.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
URIResolver	TokenNameIdentifier	 URI Resolver
{	TokenNameLBRACE	
/** * The reference document. */	TokenNameCOMMENT_JAVADOC	 The reference document. 
protected	TokenNameprotected	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
/** * The document URI. */	TokenNameCOMMENT_JAVADOC	 The document URI. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
documentURI	TokenNameIdentifier	 document URI
;	TokenNameSEMICOLON	
/** * The document loader. */	TokenNameCOMMENT_JAVADOC	 The document loader. 
protected	TokenNameprotected	
DocumentLoader	TokenNameIdentifier	 Document Loader
documentLoader	TokenNameIdentifier	 document Loader
;	TokenNameSEMICOLON	
/** * Creates a new URI resolver object. * @param doc The reference document. * @param dl The document loader. */	TokenNameCOMMENT_JAVADOC	 Creates a new URI resolver object. @param doc The reference document. @param dl The document loader. 
public	TokenNamepublic	
URIResolver	TokenNameIdentifier	 URI Resolver
(	TokenNameLPAREN	
SVGDocument	TokenNameIdentifier	 SVG Document
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
DocumentLoader	TokenNameIdentifier	 Document Loader
dl	TokenNameIdentifier	 dl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
documentLoader	TokenNameIdentifier	 document Loader
=	TokenNameEQUAL	
dl	TokenNameIdentifier	 dl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Imports the Element referenced by the given URI on Element * <tt>ref</tt>. * @param uri The element URI. * @param ref The Element in the DOM tree to evaluate <tt>uri</tt> * from. * @return The referenced element or null if element can't be found. */	TokenNameCOMMENT_JAVADOC	 Imports the Element referenced by the given URI on Element <tt>ref</tt>. @param uri The element URI. @param ref The Element in the DOM tree to evaluate <tt>uri</tt> from. @return The referenced element or null if element can't be found. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Imports the Node referenced by the given URI on Element * <tt>ref</tt>. * @param uri The element URI. * @param ref The Element in the DOM tree to evaluate <tt>uri</tt> * from. * @return The referenced Node/Document or null if element can't be found. */	TokenNameCOMMENT_JAVADOC	 Imports the Node referenced by the given URI on Element <tt>ref</tt>. @param uri The element URI. @param ref The Element in the DOM tree to evaluate <tt>uri</tt> from. @return The referenced Node/Document or null if element can't be found. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
SecurityException	TokenNameIdentifier	 Security Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
=	TokenNameEQUAL	
getRefererBaseURI	TokenNameIdentifier	 get Referer Base URI
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.err.println("baseURI: " + baseURI); 	TokenNameCOMMENT_LINE	System.err.println("baseURI: " + baseURI); 
// System.err.println("URI: " + uri); 	TokenNameCOMMENT_LINE	System.err.println("URI: " + uri); 
if	TokenNameif	
(	TokenNameLPAREN	
baseURI	TokenNameIdentifier	 base URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNodeByFragment	TokenNameIdentifier	 get Node By Fragment
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
=	TokenNameEQUAL	
new	TokenNamenew	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
baseURI	TokenNameIdentifier	 base URI
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.err.println("PURL: " + purl); 	TokenNameCOMMENT_LINE	System.err.println("PURL: " + purl); 
if	TokenNameif	
(	TokenNameLPAREN	
documentURI	TokenNameIdentifier	 document URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
documentURI	TokenNameIdentifier	 document URI
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getURL	TokenNameIdentifier	 get URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
purl	TokenNameIdentifier	 purl
.	TokenNameDOT	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
documentURI	TokenNameIdentifier	 document URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ParsedURL	TokenNameIdentifier	 Parsed URL
pDocURL	TokenNameIdentifier	 p Doc URL
=	TokenNameEQUAL	
new	TokenNamenew	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
documentURI	TokenNameIdentifier	 document URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("doc: " + pDocURL); 	TokenNameCOMMENT_LINE	System.out.println("doc: " + pDocURL); 
// System.out.println("Purl: " + purl); 	TokenNameCOMMENT_LINE	System.out.println("Purl: " + purl); 
if	TokenNameif	
(	TokenNameLPAREN	
pDocURL	TokenNameIdentifier	 p Doc URL
.	TokenNameDOT	
sameFile	TokenNameIdentifier	 same File
(	TokenNameLPAREN	
purl	TokenNameIdentifier	 purl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("match"); 	TokenNameCOMMENT_LINE	System.out.println("match"); 
return	TokenNamereturn	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// uri is not a reference into this document, so load the 	TokenNameCOMMENT_LINE	uri is not a reference into this document, so load the 
// document it does reference after doing a security 	TokenNameCOMMENT_LINE	document it does reference after doing a security 
// check with the UserAgent 	TokenNameCOMMENT_LINE	check with the UserAgent 
ParsedURL	TokenNameIdentifier	 Parsed URL
pDocURL	TokenNameIdentifier	 p Doc URL
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
documentURI	TokenNameIdentifier	 document URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pDocURL	TokenNameIdentifier	 p Doc URL
=	TokenNameEQUAL	
new	TokenNamenew	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
documentURI	TokenNameIdentifier	 document URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
UserAgent	TokenNameIdentifier	 User Agent
userAgent	TokenNameIdentifier	 user Agent
=	TokenNameEQUAL	
documentLoader	TokenNameIdentifier	 document Loader
.	TokenNameDOT	
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
userAgent	TokenNameIdentifier	 user Agent
.	TokenNameDOT	
checkLoadExternalResource	TokenNameIdentifier	 check Load External Resource
(	TokenNameLPAREN	
purl	TokenNameIdentifier	 purl
,	TokenNameCOMMA	
pDocURL	TokenNameIdentifier	 p Doc URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
purlStr	TokenNameIdentifier	 purl Str
=	TokenNameEQUAL	
purl	TokenNameIdentifier	 purl
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
purlStr	TokenNameIdentifier	 purl Str
=	TokenNameEQUAL	
purlStr	TokenNameIdentifier	 purl Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
purlStr	TokenNameIdentifier	 purl Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
documentLoader	TokenNameIdentifier	 document Loader
.	TokenNameDOT	
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
purlStr	TokenNameIdentifier	 purl Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the base URI of the referer element. */	TokenNameCOMMENT_JAVADOC	 Returns the base URI of the referer element. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getRefererBaseURI	TokenNameIdentifier	 get Referer Base URI
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
)	TokenNameRPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseURI	TokenNameIdentifier	 get Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the node referenced by the given fragment identifier. * This is called when the whole URI just contains a fragment identifier * and there is no XML Base URI in effect. * @param frag the URI fragment * @param ref the context element from which to resolve the URI fragment */	TokenNameCOMMENT_JAVADOC	 Returns the node referenced by the given fragment identifier. This is called when the whole URI just contains a fragment identifier and there is no XML Base URI in effect. @param frag the URI fragment @param ref the context element from which to resolve the URI fragment 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
getNodeByFragment	TokenNameIdentifier	 get Node By Fragment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
frag	TokenNameIdentifier	 frag
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
