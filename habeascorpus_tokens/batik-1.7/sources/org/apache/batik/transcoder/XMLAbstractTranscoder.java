/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
DocumentFactory	TokenNameIdentifier	 Document Factory
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
SAXDocumentFactory	TokenNameIdentifier	 SAX Document Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
BooleanKey	TokenNameIdentifier	 Boolean Key
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
DOMImplementationKey	TokenNameIdentifier	 DOM Implementation Key
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
StringKey	TokenNameIdentifier	 String Key
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
XMLResourceDescriptor	TokenNameIdentifier	 XML Resource Descriptor
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
DOMImplementation	TokenNameIdentifier	 DOM Implementation
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
/** * This class may be the base class of all transcoders which take an * XML document as input and which need to build a DOM tree. In order * to take advantage of this class, you have to specify the following * transcoding hints: * * <ul> * <li><tt>KEY_DOM_IMPLEMENTATION</tt>: the DOM Implementation to use * * <li><tt>KEY_DOCUMENT_ELEMENT_NAMESPACE_URI</tt>: the namespace URI of the * document to create * * <li><tt>KEY_DOCUMENT_ELEMENT</tt>: the qualified name of the document type * to create * </ul> * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: XMLAbstractTranscoder.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class may be the base class of all transcoders which take an XML document as input and which need to build a DOM tree. In order to take advantage of this class, you have to specify the following transcoding hints: * <ul> <li><tt>KEY_DOM_IMPLEMENTATION</tt>: the DOM Implementation to use * <li><tt>KEY_DOCUMENT_ELEMENT_NAMESPACE_URI</tt>: the namespace URI of the document to create * <li><tt>KEY_DOCUMENT_ELEMENT</tt>: the qualified name of the document type to create </ul> * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: XMLAbstractTranscoder.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
XMLAbstractTranscoder	TokenNameIdentifier	 XML Abstract Transcoder
extends	TokenNameextends	
AbstractTranscoder	TokenNameIdentifier	 Abstract Transcoder
{	TokenNameLBRACE	
/** * Constructs a new <tt>XMLAbstractTranscoder</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>XMLAbstractTranscoder</tt>. 
protected	TokenNameprotected	
XMLAbstractTranscoder	TokenNameIdentifier	 XML Abstract Transcoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
KEY_XML_PARSER_VALIDATING	TokenNameIdentifier	 KEY  XML  PARSER  VALIDATING
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Transcodes the specified XML input in the specified output. All * <tt>TranscoderException</tt> exceptions not catched previously * are tagged as fatal errors (ie. call the <tt>fatalError</tt> * method of the <tt>ErrorHandler</tt>). * * @param input the XML input to transcode * @param output the ouput where to transcode * @exception TranscoderException if an error occured while transcoding */	TokenNameCOMMENT_JAVADOC	 Transcodes the specified XML input in the specified output. All <tt>TranscoderException</tt> exceptions not catched previously are tagged as fatal errors (ie. call the <tt>fatalError</tt> method of the <tt>ErrorHandler</tt>). * @param input the XML input to transcode @param output the ouput where to transcode @exception TranscoderException if an error occured while transcoding 
public	TokenNamepublic	
void	TokenNamevoid	
transcode	TokenNameIdentifier	 transcode
(	TokenNameLPAREN	
TranscoderInput	TokenNameIdentifier	 Transcoder Input
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
parserClassname	TokenNameIdentifier	 parser Classname
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_XML_PARSER_CLASSNAME	TokenNameIdentifier	 KEY  XML  PARSER  CLASSNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_DOCUMENT_ELEMENT_NAMESPACE_URI	TokenNameIdentifier	 KEY  DOCUMENT  ELEMENT  NAMESPACE  URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
documentElement	TokenNameIdentifier	 document Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_DOCUMENT_ELEMENT	TokenNameIdentifier	 KEY  DOCUMENT  ELEMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
domImpl	TokenNameIdentifier	 dom Impl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
)	TokenNameRPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_DOM_IMPLEMENTATION	TokenNameIdentifier	 KEY  DOM  IMPLEMENTATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parserClassname	TokenNameIdentifier	 parser Classname
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parserClassname	TokenNameIdentifier	 parser Classname
=	TokenNameEQUAL	
XMLResourceDescriptor	TokenNameIdentifier	 XML Resource Descriptor
.	TokenNameDOT	
getXMLParserClassName	TokenNameIdentifier	 get XML Parser Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
domImpl	TokenNameIdentifier	 dom Impl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
"Unspecified transcoding hints: KEY_DOM_IMPLEMENTATION"	TokenNameStringLiteral	Unspecified transcoding hints: KEY_DOM_IMPLEMENTATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
"Unspecified transcoding hints: KEY_DOCUMENT_ELEMENT_NAMESPACE_URI"	TokenNameStringLiteral	Unspecified transcoding hints: KEY_DOCUMENT_ELEMENT_NAMESPACE_URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
documentElement	TokenNameIdentifier	 document Element
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
"Unspecified transcoding hints: KEY_DOCUMENT_ELEMENT"	TokenNameStringLiteral	Unspecified transcoding hints: KEY_DOCUMENT_ELEMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// parse the XML document 	TokenNameCOMMENT_LINE	parse the XML document 
DocumentFactory	TokenNameIdentifier	 Document Factory
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
createDocumentFactory	TokenNameIdentifier	 create Document Factory
(	TokenNameLPAREN	
domImpl	TokenNameIdentifier	 dom Impl
,	TokenNameCOMMA	
parserClassname	TokenNameIdentifier	 parser Classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_XML_PARSER_VALIDATING	TokenNameIdentifier	 KEY  XML  PARSER  VALIDATING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setValidating	TokenNameIdentifier	 set Validating
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
createDocument	TokenNameIdentifier	 create Document
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
documentElement	TokenNameIdentifier	 document Element
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
createDocument	TokenNameIdentifier	 create Document
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
documentElement	TokenNameIdentifier	 document Element
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
createDocument	TokenNameIdentifier	 create Document
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
documentElement	TokenNameIdentifier	 document Element
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
createDocument	TokenNameIdentifier	 create Document
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
documentElement	TokenNameIdentifier	 document Element
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// call the dedicated transcode method 	TokenNameCOMMENT_LINE	call the dedicated transcode method 
if	TokenNameif	
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
transcode	TokenNameIdentifier	 transcode
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// at this time, all TranscoderExceptions are fatal errors 	TokenNameCOMMENT_LINE	at this time, all TranscoderExceptions are fatal errors 
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates the <tt>DocumentFactory</tt> used to create the DOM * tree. Override this method if you have to use another * implementation of the <tt>DocumentFactory</tt> (ie. for SVG, * you have to use the <tt>SAXSVGDocumentFactory</tt>). * * @param domImpl the DOM Implementation to use * @param parserClassname the XML parser classname */	TokenNameCOMMENT_JAVADOC	 Creates the <tt>DocumentFactory</tt> used to create the DOM tree. Override this method if you have to use another implementation of the <tt>DocumentFactory</tt> (ie. for SVG, you have to use the <tt>SAXSVGDocumentFactory</tt>). * @param domImpl the DOM Implementation to use @param parserClassname the XML parser classname 
protected	TokenNameprotected	
DocumentFactory	TokenNameIdentifier	 Document Factory
createDocumentFactory	TokenNameIdentifier	 create Document Factory
(	TokenNameLPAREN	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
domImpl	TokenNameIdentifier	 dom Impl
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
parserClassname	TokenNameIdentifier	 parser Classname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SAXDocumentFactory	TokenNameIdentifier	 SAX Document Factory
(	TokenNameLPAREN	
domImpl	TokenNameIdentifier	 dom Impl
,	TokenNameCOMMA	
parserClassname	TokenNameIdentifier	 parser Classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Transcodes the specified Document in the specified output. * * @param document the document to transcode * @param uri the uri of the document or null if any * @param output the ouput where to transcode * @exception TranscoderException if an error occured while transcoding */	TokenNameCOMMENT_JAVADOC	 Transcodes the specified Document in the specified output. * @param document the document to transcode @param uri the uri of the document or null if any @param output the ouput where to transcode @exception TranscoderException if an error occured while transcoding 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
transcode	TokenNameIdentifier	 transcode
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
;	TokenNameSEMICOLON	
// -------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------- 
// Keys definition 	TokenNameCOMMENT_LINE	Keys definition 
// -------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------- 
/** * XML parser classname key. * <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1"> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Key: </TH> * <TD VALIGN="TOP">KEY_XML_PARSER_CLASSNAME</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Value: </TH> * <TD VALIGN="TOP">String</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Default: </TH> * <TD VALIGN="TOP">null</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Required: </TH> * <TD VALIGN="TOP">Yes</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Description: </TH> * <TD VALIGN="TOP">Specify the XML parser classname to use.</TD></TR> * </TABLE> */	TokenNameCOMMENT_JAVADOC	 XML parser classname key. <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1"> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Key: </TH> <TD VALIGN="TOP">KEY_XML_PARSER_CLASSNAME</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Value: </TH> <TD VALIGN="TOP">String</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Default: </TH> <TD VALIGN="TOP">null</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Required: </TH> <TD VALIGN="TOP">Yes</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Description: </TH> <TD VALIGN="TOP">Specify the XML parser classname to use.</TD></TR> </TABLE> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
KEY_XML_PARSER_CLASSNAME	TokenNameIdentifier	 KEY  XML  PARSER  CLASSNAME
=	TokenNameEQUAL	
new	TokenNamenew	
StringKey	TokenNameIdentifier	 String Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The validation mode of the XML parser. * <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1"> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Key: </TH> * <TD VALIGN="TOP">KEY_XML_PARSER_VALIDATING</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Value: </TH> * <TD VALIGN="TOP">Boolean</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Default: </TH> * <TD VALIGN="TOP">false</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Required: </TH> * <TD VALIGN="TOP">No</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Description: </TH> * <TD VALIGN="TOP">Specify the validation mode of the XML parser.</TD></TR> * </TABLE> */	TokenNameCOMMENT_JAVADOC	 The validation mode of the XML parser. <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1"> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Key: </TH> <TD VALIGN="TOP">KEY_XML_PARSER_VALIDATING</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Value: </TH> <TD VALIGN="TOP">Boolean</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Default: </TH> <TD VALIGN="TOP">false</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Required: </TH> <TD VALIGN="TOP">No</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Description: </TH> <TD VALIGN="TOP">Specify the validation mode of the XML parser.</TD></TR> </TABLE> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
KEY_XML_PARSER_VALIDATING	TokenNameIdentifier	 KEY  XML  PARSER  VALIDATING
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanKey	TokenNameIdentifier	 Boolean Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Document element key. * <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1"> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Key: </TH> * <TD VALIGN="TOP">KEY_DOCUMENT_ELEMENT</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Value: </TH> * <TD VALIGN="TOP">String</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Default: </TH> * <TD VALIGN="TOP">null</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Required: </TH> * <TD VALIGN="TOP">Yes</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Description: </TH> * <TD VALIGN="TOP">Specify the qualified name of the document * type to be created.</TD></TR> * </TABLE> */	TokenNameCOMMENT_JAVADOC	 Document element key. <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1"> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Key: </TH> <TD VALIGN="TOP">KEY_DOCUMENT_ELEMENT</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Value: </TH> <TD VALIGN="TOP">String</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Default: </TH> <TD VALIGN="TOP">null</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Required: </TH> <TD VALIGN="TOP">Yes</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Description: </TH> <TD VALIGN="TOP">Specify the qualified name of the document type to be created.</TD></TR> </TABLE> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
KEY_DOCUMENT_ELEMENT	TokenNameIdentifier	 KEY  DOCUMENT  ELEMENT
=	TokenNameEQUAL	
new	TokenNamenew	
StringKey	TokenNameIdentifier	 String Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Document element namespace URI key. * <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1"> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Key: </TH> * <TD VALIGN="TOP">KEY_DOCUMENT_ELEMENT_NAMESPACE_URI</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Value: </TH> * <TD VALIGN="TOP">String</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Default: </TH> * <TD VALIGN="TOP">null</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Required: </TH> * <TD VALIGN="TOP">Yes</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Description: </TH> * * <TD VALIGN="TOP">Specify the namespace URI of the document * element.</TD></TR> * </TABLE> */	TokenNameCOMMENT_JAVADOC	 Document element namespace URI key. <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1"> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Key: </TH> <TD VALIGN="TOP">KEY_DOCUMENT_ELEMENT_NAMESPACE_URI</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Value: </TH> <TD VALIGN="TOP">String</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Default: </TH> <TD VALIGN="TOP">null</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Required: </TH> <TD VALIGN="TOP">Yes</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Description: </TH> * <TD VALIGN="TOP">Specify the namespace URI of the document element.</TD></TR> </TABLE> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
KEY_DOCUMENT_ELEMENT_NAMESPACE_URI	TokenNameIdentifier	 KEY  DOCUMENT  ELEMENT  NAMESPACE  URI
=	TokenNameEQUAL	
new	TokenNamenew	
StringKey	TokenNameIdentifier	 String Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * DOM Implementation key. * <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1"> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Key: </TH> * <TD VALIGN="TOP">KEY_DOM_IMPLEMENTATION</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Value: </TH> * <TD VALIGN="TOP">String</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Default: </TH> * <TD VALIGN="TOP">null</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Required: </TH> * <TD VALIGN="TOP">Yes</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Description: </TH> * * <TD VALIGN="TOP">Specify the DOM Implementation to use.</TD></TR> * </TABLE> */	TokenNameCOMMENT_JAVADOC	 DOM Implementation key. <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1"> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Key: </TH> <TD VALIGN="TOP">KEY_DOM_IMPLEMENTATION</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Value: </TH> <TD VALIGN="TOP">String</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Default: </TH> <TD VALIGN="TOP">null</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Required: </TH> <TD VALIGN="TOP">Yes</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Description: </TH> * <TD VALIGN="TOP">Specify the DOM Implementation to use.</TD></TR> </TABLE> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
KEY_DOM_IMPLEMENTATION	TokenNameIdentifier	 KEY  DOM  IMPLEMENTATION
=	TokenNameEQUAL	
new	TokenNamenew	
DOMImplementationKey	TokenNameIdentifier	 DOM Implementation Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
