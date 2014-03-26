/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TransformerImpl.java 486494 2006-12-13 04:58:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TransformerImpl.java 486494 2006-12-13 04:58:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
trax	TokenNameIdentifier	 trax
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URLConnection	TokenNameIdentifier	 URL Connection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
UnknownServiceException	TokenNameIdentifier	 Unknown Service Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilder	TokenNameIdentifier	 Document Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
ErrorListener	TokenNameIdentifier	 Error Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
OutputKeys	TokenNameIdentifier	 Output Keys
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Result	TokenNameIdentifier	 Result
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
Transformer	TokenNameIdentifier	 Transformer
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
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMResult	TokenNameIdentifier	 DOM Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMSource	TokenNameIdentifier	 DOM Source
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
SAXResult	TokenNameIdentifier	 SAX Result
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
StreamResult	TokenNameIdentifier	 Stream Result
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
DOM	TokenNameIdentifier	 DOM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
DOMCache	TokenNameIdentifier	 DOM Cache
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
DOMEnhancedForDTM	TokenNameIdentifier	 DOM Enhanced For DTM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
StripFilter	TokenNameIdentifier	 Strip Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
Translet	TokenNameIdentifier	 Translet
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
TransletException	TokenNameIdentifier	 Translet Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ErrorMsg	TokenNameIdentifier	 Error Msg
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMWSFilter	TokenNameIdentifier	 DOMWS Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
SAXImpl	TokenNameIdentifier	 SAX Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
TransletOutputHandlerFactory	TokenNameIdentifier	 Translet Output Handler Factory
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
XMLReaderManager	TokenNameIdentifier	 XML Reader Manager
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
InputSource	TokenNameIdentifier	 Input Source
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
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
;	TokenNameSEMICOLON	
/** * @author Morten Jorgensen * @author G. Todd Miller * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Morten Jorgensen @author G. Todd Miller @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
extends	TokenNameextends	
Transformer	TokenNameIdentifier	 Transformer
implements	TokenNameimplements	
DOMCache	TokenNameIdentifier	 DOM Cache
,	TokenNameCOMMA	
ErrorListener	TokenNameIdentifier	 Error Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
NO_STRING	TokenNameIdentifier	 NO  STRING
=	TokenNameEQUAL	
"no"	TokenNameStringLiteral	no
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
YES_STRING	TokenNameIdentifier	 YES  STRING
=	TokenNameEQUAL	
"yes"	TokenNameStringLiteral	yes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
XML_STRING	TokenNameIdentifier	 XML  STRING
=	TokenNameEQUAL	
"xml"	TokenNameStringLiteral	xml
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
LEXICAL_HANDLER_PROPERTY	TokenNameIdentifier	 LEXICAL  HANDLER  PROPERTY
=	TokenNameEQUAL	
"http://xml.org/sax/properties/lexical-handler"	TokenNameStringLiteral	http://xml.org/sax/properties/lexical-handler
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACE_FEATURE	TokenNameIdentifier	 NAMESPACE  FEATURE
=	TokenNameEQUAL	
"http://xml.org/sax/features/namespaces"	TokenNameStringLiteral	http://xml.org/sax/features/namespaces
;	TokenNameSEMICOLON	
/** * A reference to the translet or null if the identity transform. */	TokenNameCOMMENT_JAVADOC	 A reference to the translet or null if the identity transform. 
private	TokenNameprivate	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
_translet	TokenNameIdentifier	 translet
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The output method of this transformation. */	TokenNameCOMMENT_JAVADOC	 The output method of this transformation. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The output encoding of this transformation. */	TokenNameCOMMENT_JAVADOC	 The output encoding of this transformation. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The systemId set in input source. */	TokenNameCOMMENT_JAVADOC	 The systemId set in input source. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_sourceSystemId	TokenNameIdentifier	 source System Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * An error listener for runtime errors. */	TokenNameCOMMENT_JAVADOC	 An error listener for runtime errors. 
private	TokenNameprivate	
ErrorListener	TokenNameIdentifier	 Error Listener
_errorListener	TokenNameIdentifier	 error Listener
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
/** * A reference to a URI resolver for calls to document(). */	TokenNameCOMMENT_JAVADOC	 A reference to a URI resolver for calls to document(). 
private	TokenNameprivate	
URIResolver	TokenNameIdentifier	 URI Resolver
_uriResolver	TokenNameIdentifier	 uri Resolver
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Output properties of this transformer instance. */	TokenNameCOMMENT_JAVADOC	 Output properties of this transformer instance. 
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
_properties	TokenNameIdentifier	 properties
,	TokenNameCOMMA	
_propertiesClone	TokenNameIdentifier	 properties Clone
;	TokenNameSEMICOLON	
/** * A reference to an output handler factory. */	TokenNameCOMMENT_JAVADOC	 A reference to an output handler factory. 
private	TokenNameprivate	
TransletOutputHandlerFactory	TokenNameIdentifier	 Translet Output Handler Factory
_tohFactory	TokenNameIdentifier	 toh Factory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * A reference to a internal DOM represenation of the input. */	TokenNameCOMMENT_JAVADOC	 A reference to a internal DOM represenation of the input. 
private	TokenNameprivate	
DOM	TokenNameIdentifier	 DOM
_dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Number of indent spaces to add when indentation is on. */	TokenNameCOMMENT_JAVADOC	 Number of indent spaces to add when indentation is on. 
private	TokenNameprivate	
int	TokenNameint	
_indentNumber	TokenNameIdentifier	 indent Number
;	TokenNameSEMICOLON	
/** * A reference to the transformer factory that this templates * object belongs to. */	TokenNameCOMMENT_JAVADOC	 A reference to the transformer factory that this templates object belongs to. 
private	TokenNameprivate	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
_tfactory	TokenNameIdentifier	 tfactory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * A reference to the output stream, if we create one in our code. */	TokenNameCOMMENT_JAVADOC	 A reference to the output stream, if we create one in our code. 
private	TokenNameprivate	
OutputStream	TokenNameIdentifier	 Output Stream
_ostream	TokenNameIdentifier	 ostream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * A reference to the XSLTCDTMManager which is used to build the DOM/DTM * for this transformer. */	TokenNameCOMMENT_JAVADOC	 A reference to the XSLTCDTMManager which is used to build the DOM/DTM for this transformer. 
private	TokenNameprivate	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
_dtmManager	TokenNameIdentifier	 dtm Manager
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * A reference to an object that creates and caches XMLReader objects. */	TokenNameCOMMENT_JAVADOC	 A reference to an object that creates and caches XMLReader objects. 
private	TokenNameprivate	
XMLReaderManager	TokenNameIdentifier	 XML Reader Manager
_readerManager	TokenNameIdentifier	 reader Manager
=	TokenNameEQUAL	
XMLReaderManager	TokenNameIdentifier	 XML Reader Manager
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A flag indicating whether we use incremental building of the DTM. */	TokenNameCOMMENT_JAVADOC	 A flag indicating whether we use incremental building of the DTM. 
//private boolean _isIncremental = false; 	TokenNameCOMMENT_LINE	private boolean _isIncremental = false; 
/** * A flag indicating whether this transformer implements the identity * transform. */	TokenNameCOMMENT_JAVADOC	 A flag indicating whether this transformer implements the identity transform. 
private	TokenNameprivate	
boolean	TokenNameboolean	
_isIdentity	TokenNameIdentifier	 is Identity
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * State of the secure processing feature. */	TokenNameCOMMENT_JAVADOC	 State of the secure processing feature. 
private	TokenNameprivate	
boolean	TokenNameboolean	
_isSecureProcessing	TokenNameIdentifier	 is Secure Processing
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * A hashtable to store parameters for the identity transform. These * are not needed during the transformation, but we must keep track of * them to be fully complaint with the JAXP API. */	TokenNameCOMMENT_JAVADOC	 A hashtable to store parameters for the identity transform. These are not needed during the transformation, but we must keep track of them to be fully complaint with the JAXP API. 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
_parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * This class wraps an ErrorListener into a MessageHandler in order to * capture messages reported via xsl:message. */	TokenNameCOMMENT_JAVADOC	 This class wraps an ErrorListener into a MessageHandler in order to capture messages reported via xsl:message. 
static	TokenNamestatic	
class	TokenNameclass	
MessageHandler	TokenNameIdentifier	 Message Handler
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
MessageHandler	TokenNameIdentifier	 Message Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
ErrorListener	TokenNameIdentifier	 Error Listener
_errorListener	TokenNameIdentifier	 error Listener
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MessageHandler	TokenNameIdentifier	 Message Handler
(	TokenNameLPAREN	
ErrorListener	TokenNameIdentifier	 Error Listener
errorListener	TokenNameIdentifier	 error Listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_errorListener	TokenNameIdentifier	 error Listener
=	TokenNameEQUAL	
errorListener	TokenNameIdentifier	 error Listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
displayMessage	TokenNameIdentifier	 display Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_errorListener	TokenNameIdentifier	 error Listener
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
_errorListener	TokenNameIdentifier	 error Listener
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignored 	TokenNameCOMMENT_LINE	ignored 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
outputProperties	TokenNameIdentifier	 output Properties
,	TokenNameCOMMA	
int	TokenNameint	
indentNumber	TokenNameIdentifier	 indent Number
,	TokenNameCOMMA	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
tfactory	TokenNameIdentifier	 tfactory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
outputProperties	TokenNameIdentifier	 output Properties
,	TokenNameCOMMA	
indentNumber	TokenNameIdentifier	 indent Number
,	TokenNameCOMMA	
tfactory	TokenNameIdentifier	 tfactory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_isIdentity	TokenNameIdentifier	 is Identity
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// _properties.put(OutputKeys.METHOD, "xml"); 	TokenNameCOMMENT_LINE	_properties.put(OutputKeys.METHOD, "xml"); 
}	TokenNameRBRACE	
protected	TokenNameprotected	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
(	TokenNameLPAREN	
Translet	TokenNameIdentifier	 Translet
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
outputProperties	TokenNameIdentifier	 output Properties
,	TokenNameCOMMA	
int	TokenNameint	
indentNumber	TokenNameIdentifier	 indent Number
,	TokenNameCOMMA	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
tfactory	TokenNameIdentifier	 tfactory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_translet	TokenNameIdentifier	 translet
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
)	TokenNameRPAREN	
translet	TokenNameIdentifier	 translet
;	TokenNameSEMICOLON	
_properties	TokenNameIdentifier	 properties
=	TokenNameEQUAL	
createOutputProperties	TokenNameIdentifier	 create Output Properties
(	TokenNameLPAREN	
outputProperties	TokenNameIdentifier	 output Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_propertiesClone	TokenNameIdentifier	 properties Clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
)	TokenNameRPAREN	
_properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_indentNumber	TokenNameIdentifier	 indent Number
=	TokenNameEQUAL	
indentNumber	TokenNameIdentifier	 indent Number
;	TokenNameSEMICOLON	
_tfactory	TokenNameIdentifier	 tfactory
=	TokenNameEQUAL	
tfactory	TokenNameIdentifier	 tfactory
;	TokenNameSEMICOLON	
//_isIncremental = tfactory._incremental; 	TokenNameCOMMENT_LINE	_isIncremental = tfactory._incremental; 
}	TokenNameRBRACE	
/** * Return the state of the secure processing feature. */	TokenNameCOMMENT_JAVADOC	 Return the state of the secure processing feature. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSecureProcessing	TokenNameIdentifier	 is Secure Processing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_isSecureProcessing	TokenNameIdentifier	 is Secure Processing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the state of the secure processing feature. */	TokenNameCOMMENT_JAVADOC	 Set the state of the secure processing feature. 
public	TokenNamepublic	
void	TokenNamevoid	
setSecureProcessing	TokenNameIdentifier	 set Secure Processing
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_isSecureProcessing	TokenNameIdentifier	 is Secure Processing
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the translet wrapped inside this Transformer or * null if this is the identity transform. */	TokenNameCOMMENT_JAVADOC	 Returns the translet wrapped inside this Transformer or null if this is the identity transform. 
protected	TokenNameprotected	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
getTranslet	TokenNameIdentifier	 get Translet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_translet	TokenNameIdentifier	 translet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_isIdentity	TokenNameIdentifier	 is Identity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements JAXP's Transformer.transform() * * @param source Contains the input XML document * @param result Will contain the output from the transformation * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Implements JAXP's Transformer.transform() * @param source Contains the input XML document @param result Will contain the output from the transformation @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Result	TokenNameIdentifier	 Result
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_isIdentity	TokenNameIdentifier	 is Identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_translet	TokenNameIdentifier	 translet
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_TRANSLET_ERR	TokenNameIdentifier	 JAXP  NO  TRANSLET  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Pass output properties to the translet 	TokenNameCOMMENT_LINE	Pass output properties to the translet 
transferOutputProperties	TokenNameIdentifier	 transfer Output Properties
(	TokenNameLPAREN	
_translet	TokenNameIdentifier	 translet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
toHandler	TokenNameIdentifier	 to Handler
=	TokenNameEQUAL	
getOutputHandler	TokenNameIdentifier	 get Output Handler
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
toHandler	TokenNameIdentifier	 to Handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_HANDLER_ERR	TokenNameIdentifier	 JAXP  NO  HANDLER  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
_isIdentity	TokenNameIdentifier	 is Identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
setDOMCache	TokenNameIdentifier	 set DOM Cache
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Pass output properties to handler if identity 	TokenNameCOMMENT_LINE	Pass output properties to handler if identity 
if	TokenNameif	
(	TokenNameLPAREN	
_isIdentity	TokenNameIdentifier	 is Identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transferOutputProperties	TokenNameIdentifier	 transfer Output Properties
(	TokenNameLPAREN	
toHandler	TokenNameIdentifier	 to Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
toHandler	TokenNameIdentifier	 to Handler
,	TokenNameCOMMA	
_encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
instanceof	TokenNameinstanceof	
DOMResult	TokenNameIdentifier	 DOM Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DOMResult	TokenNameIdentifier	 DOM Result
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
.	TokenNameDOT	
setNode	TokenNameIdentifier	 set Node
(	TokenNameLPAREN	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create an output handler for the transformation output based on * the type and contents of the TrAX Result object passed to the * transform() method. */	TokenNameCOMMENT_JAVADOC	 Create an output handler for the transformation output based on the type and contents of the TrAX Result object passed to the transform() method. 
public	TokenNamepublic	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
getOutputHandler	TokenNameIdentifier	 get Output Handler
(	TokenNameLPAREN	
Result	TokenNameIdentifier	 Result
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// Get output method using get() to ignore defaults 	TokenNameCOMMENT_LINE	Get output method using get() to ignore defaults 
_method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
_properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get encoding using getProperty() to use defaults 	TokenNameCOMMENT_LINE	Get encoding using getProperty() to use defaults 
_encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
_properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
ENCODING	TokenNameIdentifier	 ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_tohFactory	TokenNameIdentifier	 toh Factory
=	TokenNameEQUAL	
TransletOutputHandlerFactory	TokenNameIdentifier	 Translet Output Handler Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
_encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_method	TokenNameIdentifier	 method
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
setOutputMethod	TokenNameIdentifier	 set Output Method
(	TokenNameLPAREN	
_method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Set indentation number in the factory 	TokenNameCOMMENT_LINE	Set indentation number in the factory 
if	TokenNameif	
(	TokenNameLPAREN	
_indentNumber	TokenNameIdentifier	 indent Number
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
setIndentNumber	TokenNameIdentifier	 set Indent Number
(	TokenNameLPAREN	
_indentNumber	TokenNameIdentifier	 indent Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Return the content handler for this Result object 	TokenNameCOMMENT_LINE	Return the content handler for this Result object 
try	TokenNametry	
{	TokenNameLBRACE	
// Result object could be SAXResult, DOMResult, or StreamResult 	TokenNameCOMMENT_LINE	Result object could be SAXResult, DOMResult, or StreamResult 
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
instanceof	TokenNameinstanceof	
SAXResult	TokenNameIdentifier	 SAX Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SAXResult	TokenNameIdentifier	 SAX Result
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SAXResult	TokenNameIdentifier	 SAX Result
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getHandler	TokenNameIdentifier	 get Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
setHandler	TokenNameIdentifier	 set Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Fix for bug 24414 * If the lexicalHandler is set then we need to get that * for obtaining the lexical information */	TokenNameCOMMENT_JAVADOC	 Fix for bug 24414 If the lexicalHandler is set then we need to get that for obtaining the lexical information 
LexicalHandler	TokenNameIdentifier	 Lexical Handler
lexicalHandler	TokenNameIdentifier	 lexical Handler
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getLexicalHandler	TokenNameIdentifier	 get Lexical Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lexicalHandler	TokenNameIdentifier	 lexical Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
setLexicalHandler	TokenNameIdentifier	 set Lexical Handler
(	TokenNameLPAREN	
lexicalHandler	TokenNameIdentifier	 lexical Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
setOutputType	TokenNameIdentifier	 set Output Type
(	TokenNameLPAREN	
TransletOutputHandlerFactory	TokenNameIdentifier	 Translet Output Handler Factory
.	TokenNameDOT	
SAX	TokenNameIdentifier	 SAX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
getSerializationHandler	TokenNameIdentifier	 get Serialization Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
instanceof	TokenNameinstanceof	
DOMResult	TokenNameIdentifier	 DOM Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
setNode	TokenNameIdentifier	 set Node
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DOMResult	TokenNameIdentifier	 DOM Result
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DOMResult	TokenNameIdentifier	 DOM Result
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
setOutputType	TokenNameIdentifier	 set Output Type
(	TokenNameLPAREN	
TransletOutputHandlerFactory	TokenNameIdentifier	 Translet Output Handler Factory
.	TokenNameDOT	
DOM	TokenNameIdentifier	 DOM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
getSerializationHandler	TokenNameIdentifier	 get Serialization Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
instanceof	TokenNameinstanceof	
StreamResult	TokenNameIdentifier	 Stream Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get StreamResult 	TokenNameCOMMENT_LINE	Get StreamResult 
final	TokenNamefinal	
StreamResult	TokenNameIdentifier	 Stream Result
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StreamResult	TokenNameIdentifier	 Stream Result
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
// StreamResult may have been created with a java.io.File, 	TokenNameCOMMENT_LINE	StreamResult may have been created with a java.io.File, 
// java.io.Writer, java.io.OutputStream or just a String 	TokenNameCOMMENT_LINE	java.io.Writer, java.io.OutputStream or just a String 
// systemId. 	TokenNameCOMMENT_LINE	systemId. 
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
setOutputType	TokenNameIdentifier	 set Output Type
(	TokenNameLPAREN	
TransletOutputHandlerFactory	TokenNameIdentifier	 Translet Output Handler Factory
.	TokenNameDOT	
STREAM	TokenNameIdentifier	 STREAM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// try to get a Writer from Result object 	TokenNameCOMMENT_LINE	try to get a Writer from Result object 
final	TokenNamefinal	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
getSerializationHandler	TokenNameIdentifier	 get Serialization Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// or try to get an OutputStream from Result object 	TokenNameCOMMENT_LINE	or try to get an OutputStream from Result object 
final	TokenNamefinal	
OutputStream	TokenNameIdentifier	 Output Stream
ostream	TokenNameIdentifier	 ostream
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ostream	TokenNameIdentifier	 ostream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
ostream	TokenNameIdentifier	 ostream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
getSerializationHandler	TokenNameIdentifier	 get Serialization Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// or try to get just a systemId string from Result object 	TokenNameCOMMENT_LINE	or try to get just a systemId string from Result object 
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_RESULT_ERR	TokenNameIdentifier	 JAXP  NO  RESULT  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System Id may be in one of several forms, (1) a uri 	TokenNameCOMMENT_LINE	System Id may be in one of several forms, (1) a uri 
// that starts with 'file:', (2) uri that starts with 'http:' 	TokenNameCOMMENT_LINE	that starts with 'file:', (2) uri that starts with 'http:' 
// or (3) just a filename on the local system. 	TokenNameCOMMENT_LINE	or (3) just a filename on the local system. 
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file:"	TokenNameStringLiteral	file:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
_ostream	TokenNameIdentifier	 ostream
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
getSerializationHandler	TokenNameIdentifier	 get Serialization Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"http:"	TokenNameStringLiteral	http:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
URLConnection	TokenNameIdentifier	 URL Connection
connection	TokenNameIdentifier	 connection
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
openConnection	TokenNameIdentifier	 open Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
_ostream	TokenNameIdentifier	 ostream
=	TokenNameEQUAL	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
getSerializationHandler	TokenNameIdentifier	 get Serialization Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// system id is just a filename 	TokenNameCOMMENT_LINE	system id is just a filename 
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
.	TokenNameDOT	
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
_ostream	TokenNameIdentifier	 ostream
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_tohFactory	TokenNameIdentifier	 toh Factory
.	TokenNameDOT	
getSerializationHandler	TokenNameIdentifier	 get Serialization Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If we cannot write to the location specified by the SystemId 	TokenNameCOMMENT_LINE	If we cannot write to the location specified by the SystemId 
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnknownServiceException	TokenNameIdentifier	 Unknown Service Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If we cannot create the file specified by the SystemId 	TokenNameCOMMENT_LINE	If we cannot create the file specified by the SystemId 
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the internal DOM that will be used for the next transformation */	TokenNameCOMMENT_JAVADOC	 Set the internal DOM that will be used for the next transformation 
protected	TokenNameprotected	
void	TokenNamevoid	
setDOM	TokenNameIdentifier	 set DOM
(	TokenNameLPAREN	
DOM	TokenNameIdentifier	 DOM
dom	TokenNameIdentifier	 dom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds an internal DOM from a TrAX Source object */	TokenNameCOMMENT_JAVADOC	 Builds an internal DOM from a TrAX Source object 
private	TokenNameprivate	
DOM	TokenNameIdentifier	 DOM
getDOM	TokenNameIdentifier	 get DOM
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
DOM	TokenNameIdentifier	 DOM
dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
wsfilter	TokenNameIdentifier	 wsfilter
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_translet	TokenNameIdentifier	 translet
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_translet	TokenNameIdentifier	 translet
instanceof	TokenNameinstanceof	
StripFilter	TokenNameIdentifier	 Strip Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wsfilter	TokenNameIdentifier	 wsfilter
=	TokenNameEQUAL	
new	TokenNamenew	
DOMWSFilter	TokenNameIdentifier	 DOMWS Filter
(	TokenNameLPAREN	
_translet	TokenNameIdentifier	 translet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
wsfilter	TokenNameIdentifier	 wsfilter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
hasIdCall	TokenNameIdentifier	 has Id Call
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_translet	TokenNameIdentifier	 translet
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
_translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
hasIdCall	TokenNameIdentifier	 has Id Call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_dtmManager	TokenNameIdentifier	 dtm Manager
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_dtmManager	TokenNameIdentifier	 dtm Manager
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
)	TokenNameRPAREN	
_tfactory	TokenNameIdentifier	 tfactory
.	TokenNameDOT	
getDTMManagerClass	TokenNameIdentifier	 get DTM Manager Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOM	TokenNameIdentifier	 DOM
)	TokenNameRPAREN	
_dtmManager	TokenNameIdentifier	 dtm Manager
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
wsfilter	TokenNameIdentifier	 wsfilter
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hasIdCall	TokenNameIdentifier	 has Id Call
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_dom	TokenNameIdentifier	 dom
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
_dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
_dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// use only once, so reset to 'null' 	TokenNameCOMMENT_LINE	use only once, so reset to 'null' 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_isIdentity	TokenNameIdentifier	 is Identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Give the translet the opportunity to make a prepass of 	TokenNameCOMMENT_LINE	Give the translet the opportunity to make a prepass of 
// the document, in case it can extract useful information early 	TokenNameCOMMENT_LINE	the document, in case it can extract useful information early 
_translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
prepassDocument	TokenNameIdentifier	 prepass Document
(	TokenNameLPAREN	
dom	TokenNameIdentifier	 dom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_errorListener	TokenNameIdentifier	 error Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
postErrorToListener	TokenNameIdentifier	 post Error To Listener
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the {@link org.apache.xalan.xsltc.trax.TransformerFactoryImpl} * object that create this <code>Transformer</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link org.apache.xalan.xsltc.trax.TransformerFactoryImpl} object that create this <code>Transformer</code>. 
protected	TokenNameprotected	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
getTransformerFactory	TokenNameIdentifier	 get Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_tfactory	TokenNameIdentifier	 tfactory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link org.apache.xalan.xsltc.runtime.output.TransletOutputHandlerFactory} * object that create the <code>TransletOutputHandler</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link org.apache.xalan.xsltc.runtime.output.TransletOutputHandlerFactory} object that create the <code>TransletOutputHandler</code>. 
protected	TokenNameprotected	
TransletOutputHandlerFactory	TokenNameIdentifier	 Translet Output Handler Factory
getTransletOutputHandlerFactory	TokenNameIdentifier	 get Translet Output Handler Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_tohFactory	TokenNameIdentifier	 toh Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
transformIdentity	TokenNameIdentifier	 transform Identity
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Get systemId from source 	TokenNameCOMMENT_LINE	Get systemId from source 
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_sourceSystemId	TokenNameIdentifier	 source System Id
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
StreamSource	TokenNameIdentifier	 Stream Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StreamSource	TokenNameIdentifier	 Stream Source
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StreamSource	TokenNameIdentifier	 Stream Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
final	TokenNamefinal	
InputStream	TokenNameIdentifier	 Input Stream
streamInput	TokenNameIdentifier	 stream Input
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
streamReader	TokenNameIdentifier	 stream Reader
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
_readerManager	TokenNameIdentifier	 reader Manager
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Hook up reader and output handler 	TokenNameCOMMENT_LINE	Hook up reader and output handler 
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
LEXICAL_HANDLER_PROPERTY	TokenNameIdentifier	 LEXICAL  HANDLER  PROPERTY
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Falls through 	TokenNameCOMMENT_LINE	Falls through 
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create input source from source 	TokenNameCOMMENT_LINE	Create input source from source 
InputSource	TokenNameIdentifier	 Input Source
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
streamInput	TokenNameIdentifier	 stream Input
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
streamInput	TokenNameIdentifier	 stream Input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
_sourceSystemId	TokenNameIdentifier	 source System Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
streamReader	TokenNameIdentifier	 stream Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
streamReader	TokenNameIdentifier	 stream Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
_sourceSystemId	TokenNameIdentifier	 source System Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_sourceSystemId	TokenNameIdentifier	 source System Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
_sourceSystemId	TokenNameIdentifier	 source System Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_SOURCE_ERR	TokenNameIdentifier	 JAXP  NO  SOURCE  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Start pushing SAX events 	TokenNameCOMMENT_LINE	Start pushing SAX events 
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
_readerManager	TokenNameIdentifier	 reader Manager
.	TokenNameDOT	
releaseXMLReader	TokenNameIdentifier	 release XML Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
SAXSource	TokenNameIdentifier	 SAX Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SAXSource	TokenNameIdentifier	 SAX Source
sax	TokenNameIdentifier	 sax
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SAXSource	TokenNameIdentifier	 SAX Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
InputSource	TokenNameIdentifier	 Input Source
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
getInputSource	TokenNameIdentifier	 get Input Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
userReader	TokenNameIdentifier	 user Reader
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Create a reader if not set by user 	TokenNameCOMMENT_LINE	Create a reader if not set by user 
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
_readerManager	TokenNameIdentifier	 reader Manager
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
userReader	TokenNameIdentifier	 user Reader
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Hook up reader and output handler 	TokenNameCOMMENT_LINE	Hook up reader and output handler 
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
LEXICAL_HANDLER_PROPERTY	TokenNameIdentifier	 LEXICAL  HANDLER  PROPERTY
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Falls through 	TokenNameCOMMENT_LINE	Falls through 
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Start pushing SAX events 	TokenNameCOMMENT_LINE	Start pushing SAX events 
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
userReader	TokenNameIdentifier	 user Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_readerManager	TokenNameIdentifier	 reader Manager
.	TokenNameDOT	
releaseXMLReader	TokenNameIdentifier	 release XML Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
DOMSource	TokenNameIdentifier	 DOM Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
DOMSource	TokenNameIdentifier	 DOM Source
domsrc	TokenNameIdentifier	 domsrc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMSource	TokenNameIdentifier	 DOM Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
new	TokenNamenew	
DOM2TO	TokenNameIdentifier	 DO M2 TO
(	TokenNameLPAREN	
domsrc	TokenNameIdentifier	 domsrc
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
XSLTCSource	TokenNameIdentifier	 XSLTC Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
DOM	TokenNameIdentifier	 DOM
dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSLTCSource	TokenNameIdentifier	 XSLTC Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
.	TokenNameDOT	
getDOM	TokenNameIdentifier	 get DOM
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
_translet	TokenNameIdentifier	 translet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXImpl	TokenNameIdentifier	 SAX Impl
)	TokenNameRPAREN	
dom	TokenNameIdentifier	 dom
)	TokenNameRPAREN	
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_SOURCE_ERR	TokenNameIdentifier	 JAXP  NO  SOURCE  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Internal transformation method - uses the internal APIs of XSLTC */	TokenNameCOMMENT_JAVADOC	 Internal transformation method - uses the internal APIs of XSLTC 
private	TokenNameprivate	
void	TokenNamevoid	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
/* * According to JAXP1.2, new SAXSource()/StreamSource() * should create an empty input tree, with a default root node. * new DOMSource()creates an empty document using DocumentBuilder. * newDocument(); Use DocumentBuilder.newDocument() for all 3 * situations, since there is no clear spec. how to create * an empty tree when both SAXSource() and StreamSource() are used. */	TokenNameCOMMENT_BLOCK	 According to JAXP1.2, new SAXSource()/StreamSource() should create an empty input tree, with a default root node. new DOMSource()creates an empty document using DocumentBuilder. newDocument(); Use DocumentBuilder.newDocument() for all 3 situations, since there is no clear spec. how to create an empty tree when both SAXSource() and StreamSource() are used. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
StreamSource	TokenNameIdentifier	 Stream Source
&&	TokenNameAND_AND	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
StreamSource	TokenNameIdentifier	 Stream Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
StreamSource	TokenNameIdentifier	 Stream Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
SAXSource	TokenNameIdentifier	 SAX Source
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXSource	TokenNameIdentifier	 SAX Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
.	TokenNameDOT	
getInputSource	TokenNameIdentifier	 get Input Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXSource	TokenNameIdentifier	 SAX Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
DOMSource	TokenNameIdentifier	 DOM Source
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DOMSource	TokenNameIdentifier	 DOM Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
builderF	TokenNameIdentifier	 builder F
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocumentBuilder	TokenNameIdentifier	 Document Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
builderF	TokenNameIdentifier	 builder F
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
systemID	TokenNameIdentifier	 system ID
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
DOMSource	TokenNameIdentifier	 DOM Source
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Copy system ID from original, empty Source to new 	TokenNameCOMMENT_LINE	Copy system ID from original, empty Source to new 
if	TokenNameif	
(	TokenNameLPAREN	
systemID	TokenNameIdentifier	 system ID
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
systemID	TokenNameIdentifier	 system ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_isIdentity	TokenNameIdentifier	 is Identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformIdentity	TokenNameIdentifier	 transform Identity
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
getDOM	TokenNameIdentifier	 get DOM
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransletException	TokenNameIdentifier	 Translet Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_errorListener	TokenNameIdentifier	 error Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
postErrorToListener	TokenNameIdentifier	 post Error To Listener
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_errorListener	TokenNameIdentifier	 error Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
postErrorToListener	TokenNameIdentifier	 post Error To Listener
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_errorListener	TokenNameIdentifier	 error Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
postErrorToListener	TokenNameIdentifier	 post Error To Listener
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
_dtmManager	TokenNameIdentifier	 dtm Manager
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If we create an output stream for the Result, we need to close it after the transformation. 	TokenNameCOMMENT_LINE	If we create an output stream for the Result, we need to close it after the transformation. 
if	TokenNameif	
(	TokenNameLPAREN	
_ostream	TokenNameIdentifier	 ostream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
_ostream	TokenNameIdentifier	 ostream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
_ostream	TokenNameIdentifier	 ostream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements JAXP's Transformer.getErrorListener() * Get the error event handler in effect for the transformation. * * @return The error event handler currently in effect */	TokenNameCOMMENT_JAVADOC	 Implements JAXP's Transformer.getErrorListener() Get the error event handler in effect for the transformation. * @return The error event handler currently in effect 
public	TokenNamepublic	
ErrorListener	TokenNameIdentifier	 Error Listener
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_errorListener	TokenNameIdentifier	 error Listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements JAXP's Transformer.setErrorListener() * Set the error event listener in effect for the transformation. * Register a message handler in the translet in order to forward * xsl:messages to error listener. * * @param listener The error event listener to use * @throws IllegalArgumentException */	TokenNameCOMMENT_JAVADOC	 Implements JAXP's Transformer.setErrorListener() Set the error event listener in effect for the transformation. Register a message handler in the translet in order to forward xsl:messages to error listener. * @param listener The error event listener to use @throws IllegalArgumentException 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorListener	TokenNameIdentifier	 set Error Listener
(	TokenNameLPAREN	
ErrorListener	TokenNameIdentifier	 Error Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ERROR_LISTENER_NULL_ERR	TokenNameIdentifier	 ERROR  LISTENER  NULL  ERR
,	TokenNameCOMMA	
"Transformer"	TokenNameStringLiteral	Transformer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_errorListener	TokenNameIdentifier	 error Listener
=	TokenNameEQUAL	
listener	TokenNameIdentifier	 listener
;	TokenNameSEMICOLON	
// Register a message handler to report xsl:messages 	TokenNameCOMMENT_LINE	Register a message handler to report xsl:messages 
if	TokenNameif	
(	TokenNameLPAREN	
_translet	TokenNameIdentifier	 translet
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
setMessageHandler	TokenNameIdentifier	 set Message Handler
(	TokenNameLPAREN	
new	TokenNamenew	
MessageHandler	TokenNameIdentifier	 Message Handler
(	TokenNameLPAREN	
_errorListener	TokenNameIdentifier	 error Listener
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inform TrAX error listener of an error */	TokenNameCOMMENT_JAVADOC	 Inform TrAX error listener of an error 
private	TokenNameprivate	
void	TokenNamevoid	
postErrorToListener	TokenNameIdentifier	 post Error To Listener
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
_errorListener	TokenNameIdentifier	 error Listener
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignored - transformation cannot be continued 	TokenNameCOMMENT_LINE	ignored - transformation cannot be continued 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Inform TrAX error listener of a warning */	TokenNameCOMMENT_JAVADOC	 Inform TrAX error listener of a warning 
private	TokenNameprivate	
void	TokenNamevoid	
postWarningToListener	TokenNameIdentifier	 post Warning To Listener
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
_errorListener	TokenNameIdentifier	 error Listener
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignored - transformation cannot be continued 	TokenNameCOMMENT_LINE	ignored - transformation cannot be continued 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The translet stores all CDATA sections set in the <xsl:output> element * in a Hashtable. This method will re-construct the whitespace separated * list of elements given in the <xsl:output> element. */	TokenNameCOMMENT_JAVADOC	 The translet stores all CDATA sections set in the <xsl:output> element in a Hashtable. This method will re-construct the whitespace separated list of elements given in the <xsl:output> element. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
makeCDATAString	TokenNameIdentifier	 make CDATA String
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
cdata	TokenNameIdentifier	 cdata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Return a 'null' string if no CDATA section elements were specified 	TokenNameCOMMENT_LINE	Return a 'null' string if no CDATA section elements were specified 
if	TokenNameif	
(	TokenNameLPAREN	
cdata	TokenNameIdentifier	 cdata
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get an enumeration of all the elements in the hashtable 	TokenNameCOMMENT_LINE	Get an enumeration of all the elements in the hashtable 
Enumeration	TokenNameIdentifier	 Enumeration
elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
cdata	TokenNameIdentifier	 cdata
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements JAXP's Transformer.getOutputProperties(). * Returns a copy of the output properties for the transformation. This is * a set of layered properties. The first layer contains properties set by * calls to setOutputProperty() and setOutputProperties() on this class, * and the output settings defined in the stylesheet's <xsl:output> * element makes up the second level, while the default XSLT output * settings are returned on the third level. * * @return Properties in effect for this Transformer */	TokenNameCOMMENT_JAVADOC	 Implements JAXP's Transformer.getOutputProperties(). Returns a copy of the output properties for the transformation. This is a set of layered properties. The first layer contains properties set by calls to setOutputProperty() and setOutputProperties() on this class, and the output settings defined in the stylesheet's <xsl:output> element makes up the second level, while the default XSLT output settings are returned on the third level. * @return Properties in effect for this Transformer 
public	TokenNamepublic	
Properties	TokenNameIdentifier	 Properties
getOutputProperties	TokenNameIdentifier	 get Output Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
)	TokenNameRPAREN	
_properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements JAXP's Transformer.getOutputProperty(). * Get an output property that is in effect for the transformation. The * property specified may be a property that was set with setOutputProperty, * or it may be a property specified in the stylesheet. * * @param name A non-null string that contains the name of the property * @throws IllegalArgumentException if the property name is not known */	TokenNameCOMMENT_JAVADOC	 Implements JAXP's Transformer.getOutputProperty(). Get an output property that is in effect for the transformation. The property specified may be a property that was set with setOutputProperty, or it may be a property specified in the stylesheet. * @param name A non-null string that contains the name of the property @throws IllegalArgumentException if the property name is not known 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOutputProperty	TokenNameIdentifier	 get Output Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
validOutputProperty	TokenNameIdentifier	 valid Output Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_UNKNOWN_PROP_ERR	TokenNameIdentifier	 JAXP  UNKNOWN  PROP  ERR
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements JAXP's Transformer.setOutputProperties(). * Set the output properties for the transformation. These properties * will override properties set in the Templates with xsl:output. * Unrecognised properties will be quitely ignored. * * @param properties The properties to use for the Transformer * @throws IllegalArgumentException Never, errors are ignored */	TokenNameCOMMENT_JAVADOC	 Implements JAXP's Transformer.setOutputProperties(). Set the output properties for the transformation. These properties will override properties set in the Templates with xsl:output. Unrecognised properties will be quitely ignored. * @param properties The properties to use for the Transformer @throws IllegalArgumentException Never, errors are ignored 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputProperties	TokenNameIdentifier	 set Output Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Enumeration	TokenNameIdentifier	 Enumeration
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
propertyNames	TokenNameIdentifier	 property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Ignore lower layer properties 	TokenNameCOMMENT_LINE	Ignore lower layer properties 
if	TokenNameif	
(	TokenNameLPAREN	
isDefaultProperty	TokenNameIdentifier	 is Default Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
validOutputProperty	TokenNameIdentifier	 valid Output Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_UNKNOWN_PROP_ERR	TokenNameIdentifier	 JAXP  UNKNOWN  PROP  ERR
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_properties	TokenNameIdentifier	 properties
=	TokenNameEQUAL	
_propertiesClone	TokenNameIdentifier	 properties Clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements JAXP's Transformer.setOutputProperty(). * Get an output property that is in effect for the transformation. The * property specified may be a property that was set with * setOutputProperty(), or it may be a property specified in the stylesheet. * * @param name The name of the property to set * @param value The value to assign to the property * @throws IllegalArgumentException Never, errors are ignored */	TokenNameCOMMENT_JAVADOC	 Implements JAXP's Transformer.setOutputProperty(). Get an output property that is in effect for the transformation. The property specified may be a property that was set with setOutputProperty(), or it may be a property specified in the stylesheet. * @param name The name of the property to set @param value The value to assign to the property @throws IllegalArgumentException Never, errors are ignored 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
validOutputProperty	TokenNameIdentifier	 valid Output Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_UNKNOWN_PROP_ERR	TokenNameIdentifier	 JAXP  UNKNOWN  PROP  ERR
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Internal method to pass any properties to the translet prior to * initiating the transformation */	TokenNameCOMMENT_JAVADOC	 Internal method to pass any properties to the translet prior to initiating the transformation 
private	TokenNameprivate	
void	TokenNamevoid	
transferOutputProperties	TokenNameIdentifier	 transfer Output Properties
(	TokenNameLPAREN	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
translet	TokenNameIdentifier	 translet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Return right now if no properties are set 	TokenNameCOMMENT_LINE	Return right now if no properties are set 
if	TokenNameif	
(	TokenNameLPAREN	
_properties	TokenNameIdentifier	 properties
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// Get a list of all the defined properties 	TokenNameCOMMENT_LINE	Get a list of all the defined properties 
Enumeration	TokenNameIdentifier	 Enumeration
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
_properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
propertyNames	TokenNameIdentifier	 property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Note the use of get() instead of getProperty() 	TokenNameCOMMENT_LINE	Note the use of get() instead of getProperty() 
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
_properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Ignore default properties 	TokenNameCOMMENT_LINE	Ignore default properties 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// Pass property value to translet - override previous setting 	TokenNameCOMMENT_LINE	Pass property value to translet - override previous setting 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
ENCODING	TokenNameIdentifier	 ENCODING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
_encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
_method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_PUBLIC	TokenNameIdentifier	 DOCTYPE  PUBLIC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
_doctypePublic	TokenNameIdentifier	 doctype Public
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_SYSTEM	TokenNameIdentifier	 DOCTYPE  SYSTEM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
_doctypeSystem	TokenNameIdentifier	 doctype System
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
MEDIA_TYPE	TokenNameIdentifier	 MEDIA  TYPE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
_mediaType	TokenNameIdentifier	 media Type
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
STANDALONE	TokenNameIdentifier	 STANDALONE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
_standalone	TokenNameIdentifier	 standalone
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
VERSION	TokenNameIdentifier	 VERSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
_version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
OMIT_XML_DECLARATION	TokenNameIdentifier	 OMIT  XML  DECLARATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
_omitHeader	TokenNameIdentifier	 omit Header
=	TokenNameEQUAL	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"yes"	TokenNameStringLiteral	yes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
INDENT	TokenNameIdentifier	 INDENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
_indent	TokenNameIdentifier	 indent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"yes"	TokenNameStringLiteral	yes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
CDATA_SECTION_ELEMENTS	TokenNameIdentifier	 CDATA  SECTION  ELEMENTS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
_cdata	TokenNameIdentifier	 cdata
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// clear previous setting 	TokenNameCOMMENT_LINE	clear previous setting 
StringTokenizer	TokenNameIdentifier	 String Tokenizer
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
addCdataElement	TokenNameIdentifier	 add Cdata Element
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method is used to pass any properties to the output handler * when running the identity transform. */	TokenNameCOMMENT_JAVADOC	 This method is used to pass any properties to the output handler when running the identity transform. 
public	TokenNamepublic	
void	TokenNamevoid	
transferOutputProperties	TokenNameIdentifier	 transfer Output Properties
(	TokenNameLPAREN	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Return right now if no properties are set 	TokenNameCOMMENT_LINE	Return right now if no properties are set 
if	TokenNameif	
(	TokenNameLPAREN	
_properties	TokenNameIdentifier	 properties
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
doctypePublic	TokenNameIdentifier	 doctype Public
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
doctypeSystem	TokenNameIdentifier	 doctype System
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Get a list of all the defined properties 	TokenNameCOMMENT_LINE	Get a list of all the defined properties 
Enumeration	TokenNameIdentifier	 Enumeration
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
_properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
propertyNames	TokenNameIdentifier	 property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Note the use of get() instead of getProperty() 	TokenNameCOMMENT_LINE	Note the use of get() instead of getProperty() 
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
_properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Ignore default properties 	TokenNameCOMMENT_LINE	Ignore default properties 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// Pass property value to translet - override previous setting 	TokenNameCOMMENT_LINE	Pass property value to translet - override previous setting 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_PUBLIC	TokenNameIdentifier	 DOCTYPE  PUBLIC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doctypePublic	TokenNameIdentifier	 doctype Public
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_SYSTEM	TokenNameIdentifier	 DOCTYPE  SYSTEM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doctypeSystem	TokenNameIdentifier	 doctype System
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
MEDIA_TYPE	TokenNameIdentifier	 MEDIA  TYPE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
setMediaType	TokenNameIdentifier	 set Media Type
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
STANDALONE	TokenNameIdentifier	 STANDALONE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
setStandalone	TokenNameIdentifier	 set Standalone
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
VERSION	TokenNameIdentifier	 VERSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
OMIT_XML_DECLARATION	TokenNameIdentifier	 OMIT  XML  DECLARATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
setOmitXMLDeclaration	TokenNameIdentifier	 set Omit XML Declaration
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"yes"	TokenNameStringLiteral	yes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
INDENT	TokenNameIdentifier	 INDENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
setIndent	TokenNameIdentifier	 set Indent
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"yes"	TokenNameStringLiteral	yes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
CDATA_SECTION_ELEMENTS	TokenNameIdentifier	 CDATA  SECTION  ELEMENTS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
uriAndLocalNames	TokenNameIdentifier	 uri And Local Names
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// look for the last colon, as the String may be 	TokenNameCOMMENT_LINE	look for the last colon, as the String may be 
// something like "http://abc.com:local" 	TokenNameCOMMENT_LINE	something like "http://abc.com:local" 
int	TokenNameint	
lastcolon	TokenNameIdentifier	 lastcolon
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastcolon	TokenNameIdentifier	 lastcolon
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lastcolon	TokenNameIdentifier	 lastcolon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
lastcolon	TokenNameIdentifier	 lastcolon
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// no colon at all, lets hope this is the 	TokenNameCOMMENT_LINE	no colon at all, lets hope this is the 
// local name itself then 	TokenNameCOMMENT_LINE	local name itself then 
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uriAndLocalNames	TokenNameIdentifier	 uri And Local Names
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uriAndLocalNames	TokenNameIdentifier	 uri And Local Names
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// add the uri/localName as a pair, in that order 	TokenNameCOMMENT_LINE	add the uri/localName as a pair, in that order 
uriAndLocalNames	TokenNameIdentifier	 uri And Local Names
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uriAndLocalNames	TokenNameIdentifier	 uri And Local Names
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
setCdataSectionElements	TokenNameIdentifier	 set Cdata Section Elements
(	TokenNameLPAREN	
uriAndLocalNames	TokenNameIdentifier	 uri And Local Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Call setDoctype() if needed 	TokenNameCOMMENT_LINE	Call setDoctype() if needed 
if	TokenNameif	
(	TokenNameLPAREN	
doctypePublic	TokenNameIdentifier	 doctype Public
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
doctypeSystem	TokenNameIdentifier	 doctype System
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
setDoctype	TokenNameIdentifier	 set Doctype
(	TokenNameLPAREN	
doctypeSystem	TokenNameIdentifier	 doctype System
,	TokenNameCOMMA	
doctypePublic	TokenNameIdentifier	 doctype Public
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Internal method to create the initial set of properties. There * are two layers of properties: the default layer and the base layer. * The latter contains properties defined in the stylesheet or by * the user using this API. */	TokenNameCOMMENT_JAVADOC	 Internal method to create the initial set of properties. There are two layers of properties: the default layer and the base layer. The latter contains properties defined in the stylesheet or by the user using this API. 
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
createOutputProperties	TokenNameIdentifier	 create Output Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
outputProperties	TokenNameIdentifier	 output Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Properties	TokenNameIdentifier	 Properties
defaults	TokenNameIdentifier	 defaults
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setDefaults	TokenNameIdentifier	 set Defaults
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
,	TokenNameCOMMA	
"xml"	TokenNameStringLiteral	xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Copy propeties set in stylesheet to base 	TokenNameCOMMENT_LINE	Copy propeties set in stylesheet to base 
final	TokenNamefinal	
Properties	TokenNameIdentifier	 Properties
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
outputProperties	TokenNameIdentifier	 output Properties
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Enumeration	TokenNameIdentifier	 Enumeration
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
outputProperties	TokenNameIdentifier	 output Properties
.	TokenNameDOT	
propertyNames	TokenNameIdentifier	 property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
outputProperties	TokenNameIdentifier	 output Properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
ENCODING	TokenNameIdentifier	 ENCODING
,	TokenNameCOMMA	
_translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
_encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
_method	TokenNameIdentifier	 method
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
,	TokenNameCOMMA	
_translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
_method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Update defaults based on output method 	TokenNameCOMMENT_LINE	Update defaults based on output method 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"html"	TokenNameStringLiteral	html
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setDefaults	TokenNameIdentifier	 set Defaults
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
,	TokenNameCOMMA	
"html"	TokenNameStringLiteral	html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"text"	TokenNameStringLiteral	text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setDefaults	TokenNameIdentifier	 set Defaults
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
,	TokenNameCOMMA	
"text"	TokenNameStringLiteral	text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Internal method to get the default properties from the * serializer factory and set them on the property object. * @param props a java.util.Property object on which the properties are set. * @param method The output method type, one of "xml", "text", "html" ... */	TokenNameCOMMENT_JAVADOC	 Internal method to get the default properties from the serializer factory and set them on the property object. @param props a java.util.Property object on which the properties are set. @param method The output method type, one of "xml", "text", "html" ... 
private	TokenNameprivate	
void	TokenNamevoid	
setDefaults	TokenNameIdentifier	 set Defaults
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Properties	TokenNameIdentifier	 Properties
method_props	TokenNameIdentifier	 method props
=	TokenNameEQUAL	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
getDefaultMethodProperties	TokenNameIdentifier	 get Default Method Properties
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
final	TokenNamefinal	
Enumeration	TokenNameIdentifier	 Enumeration
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
method_props	TokenNameIdentifier	 method props
.	TokenNameDOT	
propertyNames	TokenNameIdentifier	 property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
method_props	TokenNameIdentifier	 method props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Verifies if a given output property name is a property defined in * the JAXP 1.1 / TrAX spec */	TokenNameCOMMENT_JAVADOC	 Verifies if a given output property name is a property defined in the JAXP 1.1 / TrAX spec 
private	TokenNameprivate	
boolean	TokenNameboolean	
validOutputProperty	TokenNameIdentifier	 valid Output Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
ENCODING	TokenNameIdentifier	 ENCODING
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
INDENT	TokenNameIdentifier	 INDENT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_PUBLIC	TokenNameIdentifier	 DOCTYPE  PUBLIC
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_SYSTEM	TokenNameIdentifier	 DOCTYPE  SYSTEM
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
CDATA_SECTION_ELEMENTS	TokenNameIdentifier	 CDATA  SECTION  ELEMENTS
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
MEDIA_TYPE	TokenNameIdentifier	 MEDIA  TYPE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
OMIT_XML_DECLARATION	TokenNameIdentifier	 OMIT  XML  DECLARATION
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
STANDALONE	TokenNameIdentifier	 STANDALONE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
VERSION	TokenNameIdentifier	 VERSION
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if a given output property is default (2nd layer only) */	TokenNameCOMMENT_JAVADOC	 Checks if a given output property is default (2nd layer only) 
private	TokenNameprivate	
boolean	TokenNameboolean	
isDefaultProperty	TokenNameIdentifier	 is Default Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements JAXP's Transformer.setParameter() * Add a parameter for the transformation. The parameter is simply passed * on to the translet - no validation is performed - so any unused * parameters are quitely ignored by the translet. * * @param name The name of the parameter * @param value The value to assign to the parameter */	TokenNameCOMMENT_JAVADOC	 Implements JAXP's Transformer.setParameter() Add a parameter for the transformation. The parameter is simply passed on to the translet - no validation is performed - so any unused parameters are quitely ignored by the translet. * @param name The name of the parameter @param value The value to assign to the parameter 
public	TokenNamepublic	
void	TokenNamevoid	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_INVALID_SET_PARAM_VALUE	TokenNameIdentifier	 JAXP  INVALID  SET  PARAM  VALUE
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_isIdentity	TokenNameIdentifier	 is Identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_parameters	TokenNameIdentifier	 parameters
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
addParameter	TokenNameIdentifier	 add Parameter
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements JAXP's Transformer.clearParameters() * Clear all parameters set with setParameter. Clears the translet's * parameter stack. */	TokenNameCOMMENT_JAVADOC	 Implements JAXP's Transformer.clearParameters() Clear all parameters set with setParameter. Clears the translet's parameter stack. 
public	TokenNamepublic	
void	TokenNamevoid	
clearParameters	TokenNameIdentifier	 clear Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_isIdentity	TokenNameIdentifier	 is Identity
&&	TokenNameAND_AND	
_parameters	TokenNameIdentifier	 parameters
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
clearParameters	TokenNameIdentifier	 clear Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements JAXP's Transformer.getParameter() * Returns the value of a given parameter. Note that the translet will not * keep values for parameters that were not defined in the stylesheet. * * @param name The name of the parameter * @return An object that contains the value assigned to the parameter */	TokenNameCOMMENT_JAVADOC	 Implements JAXP's Transformer.getParameter() Returns the value of a given parameter. Note that the translet will not keep values for parameters that were not defined in the stylesheet. * @param name The name of the parameter @return An object that contains the value assigned to the parameter 
public	TokenNamepublic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
getParameter	TokenNameIdentifier	 get Parameter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_isIdentity	TokenNameIdentifier	 is Identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_parameters	TokenNameIdentifier	 parameters
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
_parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
_translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
getParameter	TokenNameIdentifier	 get Parameter
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements JAXP's Transformer.getURIResolver() * Set the object currently used to resolve URIs used in document(). * * @return The URLResolver object currently in use */	TokenNameCOMMENT_JAVADOC	 Implements JAXP's Transformer.getURIResolver() Set the object currently used to resolve URIs used in document(). * @return The URLResolver object currently in use 
public	TokenNamepublic	
URIResolver	TokenNameIdentifier	 URI Resolver
getURIResolver	TokenNameIdentifier	 get URI Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_uriResolver	TokenNameIdentifier	 uri Resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements JAXP's Transformer.setURIResolver() * Set an object that will be used to resolve URIs used in document(). * * @param resolver The URIResolver to use in document() */	TokenNameCOMMENT_JAVADOC	 Implements JAXP's Transformer.setURIResolver() Set an object that will be used to resolve URIs used in document(). * @param resolver The URIResolver to use in document() 
public	TokenNamepublic	
void	TokenNamevoid	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
URIResolver	TokenNameIdentifier	 URI Resolver
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_uriResolver	TokenNameIdentifier	 uri Resolver
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class should only be used as a DOMCache for the translet if the * URIResolver has been set. * * The method implements XSLTC's DOMCache interface, which is used to * plug in an external document loader into a translet. This method acts * as an adapter between TrAX's URIResolver interface and XSLTC's * DOMCache interface. This approach is simple, but removes the * possibility of using external document caches with XSLTC. * * @param baseURI The base URI used by the document call. * @param href The href argument passed to the document function. * @param translet A reference to the translet requesting the document */	TokenNameCOMMENT_JAVADOC	 This class should only be used as a DOMCache for the translet if the URIResolver has been set. * The method implements XSLTC's DOMCache interface, which is used to plug in an external document loader into a translet. This method acts as an adapter between TrAX's URIResolver interface and XSLTC's DOMCache interface. This approach is simple, but removes the possibility of using external document caches with XSLTC. * @param baseURI The base URI used by the document call. @param href The href argument passed to the document function. @param translet A reference to the translet requesting the document 
public	TokenNamepublic	
DOM	TokenNameIdentifier	 DOM
retrieveDocument	TokenNameIdentifier	 retrieve Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
href	TokenNameIdentifier	 href
,	TokenNameCOMMA	
Translet	TokenNameIdentifier	 Translet
translet	TokenNameIdentifier	 translet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Argument to document function was: document(''); 	TokenNameCOMMENT_LINE	Argument to document function was: document(''); 
if	TokenNameif	
(	TokenNameLPAREN	
href	TokenNameIdentifier	 href
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
href	TokenNameIdentifier	 href
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Fix for bug 24188 * Incase the _uriResolver.resolve(href,base) is null * try to still retrieve the document before returning null * and throwing the FileNotFoundException in * org.apache.xalan.xsltc.dom.LoadDocument * */	TokenNameCOMMENT_BLOCK	 Fix for bug 24188 Incase the _uriResolver.resolve(href,base) is null try to still retrieve the document before returning null and throwing the FileNotFoundException in org.apache.xalan.xsltc.dom.LoadDocument 
Source	TokenNameIdentifier	 Source
resolvedSource	TokenNameIdentifier	 resolved Source
=	TokenNameEQUAL	
_uriResolver	TokenNameIdentifier	 uri Resolver
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
href	TokenNameIdentifier	 href
,	TokenNameCOMMA	
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resolvedSource	TokenNameIdentifier	 resolved Source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StreamSource	TokenNameIdentifier	 Stream Source
streamSource	TokenNameIdentifier	 stream Source
=	TokenNameEQUAL	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
.	TokenNameDOT	
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
href	TokenNameIdentifier	 href
,	TokenNameCOMMA	
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getDOM	TokenNameIdentifier	 get DOM
(	TokenNameLPAREN	
streamSource	TokenNameIdentifier	 stream Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getDOM	TokenNameIdentifier	 get DOM
(	TokenNameLPAREN	
resolvedSource	TokenNameIdentifier	 resolved Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_errorListener	TokenNameIdentifier	 error Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
postErrorToListener	TokenNameIdentifier	 post Error To Listener
(	TokenNameLPAREN	
"File not found: "	TokenNameStringLiteral	File not found: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive notification of a recoverable error. * The transformer must continue to provide normal parsing events after * invoking this method. It should still be possible for the application * to process the document through to the end. * * @param e The warning information encapsulated in a transformer * exception. * @throws TransformerException if the application chooses to discontinue * the transformation (always does in our case). */	TokenNameCOMMENT_JAVADOC	 Receive notification of a recoverable error. The transformer must continue to provide normal parsing events after invoking this method. It should still be possible for the application to process the document through to the end. * @param e The warning information encapsulated in a transformer exception. @throws TransformerException if the application chooses to discontinue the transformation (always does in our case). 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
wrapped	TokenNameIdentifier	 wrapped
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wrapped	TokenNameIdentifier	 wrapped
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ERROR_PLUS_WRAPPED_MSG	TokenNameIdentifier	 ERROR  PLUS  WRAPPED  MSG
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wrapped	TokenNameIdentifier	 wrapped
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ERROR_MSG	TokenNameIdentifier	 ERROR  MSG
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a non-recoverable error. * The application must assume that the transformation cannot continue * after the Transformer has invoked this method, and should continue * (if at all) only to collect addition error messages. In fact, * Transformers are free to stop reporting events once this method has * been invoked. * * @param e The warning information encapsulated in a transformer * exception. * @throws TransformerException if the application chooses to discontinue * the transformation (always does in our case). */	TokenNameCOMMENT_JAVADOC	 Receive notification of a non-recoverable error. The application must assume that the transformation cannot continue after the Transformer has invoked this method, and should continue (if at all) only to collect addition error messages. In fact, Transformers are free to stop reporting events once this method has been invoked. * @param e The warning information encapsulated in a transformer exception. @throws TransformerException if the application chooses to discontinue the transformation (always does in our case). 
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
wrapped	TokenNameIdentifier	 wrapped
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wrapped	TokenNameIdentifier	 wrapped
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FATAL_ERR_PLUS_WRAPPED_MSG	TokenNameIdentifier	 FATAL  ERR  PLUS  WRAPPED  MSG
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wrapped	TokenNameIdentifier	 wrapped
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FATAL_ERR_MSG	TokenNameIdentifier	 FATAL  ERR  MSG
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a warning. * Transformers can use this method to report conditions that are not * errors or fatal errors. The default behaviour is to take no action. * After invoking this method, the Transformer must continue with the * transformation. It should still be possible for the application to * process the document through to the end. * * @param e The warning information encapsulated in a transformer * exception. * @throws TransformerException if the application chooses to discontinue * the transformation (never does in our case). */	TokenNameCOMMENT_JAVADOC	 Receive notification of a warning. Transformers can use this method to report conditions that are not errors or fatal errors. The default behaviour is to take no action. After invoking this method, the Transformer must continue with the transformation. It should still be possible for the application to process the document through to the end. * @param e The warning information encapsulated in a transformer exception. @throws TransformerException if the application chooses to discontinue the transformation (never does in our case). 
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
wrapped	TokenNameIdentifier	 wrapped
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wrapped	TokenNameIdentifier	 wrapped
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
WARNING_PLUS_WRAPPED_MSG	TokenNameIdentifier	 WARNING  PLUS  WRAPPED  MSG
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wrapped	TokenNameIdentifier	 wrapped
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
WARNING_MSG	TokenNameIdentifier	 WARNING  MSG
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method resets the Transformer to its original configuration * Transformer code is reset to the same state it was when it was * created * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 This method resets the Transformer to its original configuration Transformer code is reset to the same state it was when it was created @since 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_sourceSystemId	TokenNameIdentifier	 source System Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_errorListener	TokenNameIdentifier	 error Listener
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
_uriResolver	TokenNameIdentifier	 uri Resolver
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_indentNumber	TokenNameIdentifier	 indent Number
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
setOutputProperties	TokenNameIdentifier	 set Output Properties
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
