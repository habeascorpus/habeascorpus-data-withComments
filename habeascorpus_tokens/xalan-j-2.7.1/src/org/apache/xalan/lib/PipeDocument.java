/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: PipeDocument.java 468639 2006-10-28 06:52:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: PipeDocument.java 468639 2006-10-28 06:52:33Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
lib	TokenNameIdentifier	 lib
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
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
Templates	TokenNameIdentifier	 Templates
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
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
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
TransformerFactory	TokenNameIdentifier	 Transformer Factory
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
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
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
TransformerHandler	TokenNameIdentifier	 Transformer Handler
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
XSLProcessorContext	TokenNameIdentifier	 XSL Processor Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
AVT	TokenNameIdentifier	 AVT
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemExtensionCall	TokenNameIdentifier	 Elem Extension Call
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemLiteralResult	TokenNameIdentifier	 Elem Literal Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
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
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
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
NodeList	TokenNameIdentifier	 Node List
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
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
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
/** */	TokenNameCOMMENT_JAVADOC	 
// Imported Serializer classes 	TokenNameCOMMENT_LINE	Imported Serializer classes 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
Serializer	TokenNameIdentifier	 Serializer
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
SerializerFactory	TokenNameIdentifier	 Serializer Factory
;	TokenNameSEMICOLON	
/** * PipeDocument is a Xalan extension element to set stylesheet params and pipes an XML * document through a series of 1 or more stylesheets. * PipeDocument is invoked from a stylesheet as the {@link #pipeDocument pipeDocument extension element}. * * It is accessed by specifying a namespace URI as follows: * <pre> * xmlns:pipe="http://xml.apache.org/xalan/PipeDocument" * </pre> * * @author Donald Leslie */	TokenNameCOMMENT_JAVADOC	 PipeDocument is a Xalan extension element to set stylesheet params and pipes an XML document through a series of 1 or more stylesheets. PipeDocument is invoked from a stylesheet as the {@link #pipeDocument pipeDocument extension element}. * It is accessed by specifying a namespace URI as follows: <pre> xmlns:pipe="http://xml.apache.org/xalan/PipeDocument" </pre> * @author Donald Leslie 
public	TokenNamepublic	
class	TokenNameclass	
PipeDocument	TokenNameIdentifier	 Pipe Document
{	TokenNameLBRACE	
/** * Extension element for piping an XML document through a series of 1 or more transformations. * * <pre>Common usage pattern: A stylesheet transforms a listing of documents to be * transformed into a TOC. For each document in the listing calls the pipeDocument * extension element to pipe that document through a series of 1 or more stylesheets * to the desired output document. * * Syntax: * &lt;xsl:stylesheet version="1.0" * xmlns:xsl="http://www.w3.org/1999/XSL/Transform" * xmlns:pipe="http://xml.apache.org/xalan/PipeDocument" * extension-element-prefixes="pipe"&gt; * ... * &lt;pipe:pipeDocument source="source.xml" target="target.xml"&gt; * &lt;stylesheet href="ss1.xsl"&gt; * &lt;param name="param1" value="value1"/&gt; * &lt;/stylesheet&gt; * &lt;stylesheet href="ss2.xsl"&gt; * &lt;param name="param1" value="value1"/&gt; * &lt;param name="param2" value="value2"/&gt; * &lt;/stylesheet&gt; * &lt;stylesheet href="ss1.xsl"/&gt; * &lt;/pipe:pipeDocument&gt; * * Notes:</pre> * <ul> * <li>The base URI for the source attribute is the XML "listing" document.<li/> * <li>The target attribute is taken as is (base is the current user directory).<li/> * <li>The stylsheet containg the extension element is the base URI for the * stylesheet hrefs.<li/> * </ul> */	TokenNameCOMMENT_JAVADOC	 Extension element for piping an XML document through a series of 1 or more transformations. * <pre>Common usage pattern: A stylesheet transforms a listing of documents to be transformed into a TOC. For each document in the listing calls the pipeDocument extension element to pipe that document through a series of 1 or more stylesheets to the desired output document. * Syntax: &lt;xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:pipe="http://xml.apache.org/xalan/PipeDocument" extension-element-prefixes="pipe"&gt; ... &lt;pipe:pipeDocument source="source.xml" target="target.xml"&gt; &lt;stylesheet href="ss1.xsl"&gt; &lt;param name="param1" value="value1"/&gt; &lt;/stylesheet&gt; &lt;stylesheet href="ss2.xsl"&gt; &lt;param name="param1" value="value1"/&gt; &lt;param name="param2" value="value2"/&gt; &lt;/stylesheet&gt; &lt;stylesheet href="ss1.xsl"/&gt; &lt;/pipe:pipeDocument&gt; * Notes:</pre> <ul> <li>The base URI for the source attribute is the XML "listing" document.<li/> <li>The target attribute is taken as is (base is the current user directory).<li/> <li>The stylsheet containg the extension element is the base URI for the stylesheet hrefs.<li/> </ul> 
public	TokenNamepublic	
void	TokenNamevoid	
pipeDocument	TokenNameIdentifier	 pipe Document
(	TokenNameLPAREN	
XSLProcessorContext	TokenNameIdentifier	 XSL Processor Context
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
ElemExtensionCall	TokenNameIdentifier	 Elem Extension Call
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
,	TokenNameCOMMA	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
,	TokenNameCOMMA	
SAXException	TokenNameIdentifier	 SAX Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
{	TokenNameLBRACE	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
saxTFactory	TokenNameIdentifier	 sax T Factory
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
)	TokenNameRPAREN	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XML doc to transform. 	TokenNameCOMMENT_LINE	XML doc to transform. 
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"source"	TokenNameStringLiteral	source
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transImpl	TokenNameIdentifier	 trans Impl
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Base URI for input doc, so base for relative URI to XML doc to transform. 	TokenNameCOMMENT_LINE	Base URI for input doc, so base for relative URI to XML doc to transform. 
String	TokenNameIdentifier	 String
baseURLOfSource	TokenNameIdentifier	 base URL Of Source
=	TokenNameEQUAL	
transImpl	TokenNameIdentifier	 trans Impl
.	TokenNameDOT	
getBaseURLOfSource	TokenNameIdentifier	 get Base URL Of Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Absolute URI for XML doc to transform. 	TokenNameCOMMENT_LINE	Absolute URI for XML doc to transform. 
String	TokenNameIdentifier	 String
absSourceURL	TokenNameIdentifier	 abs Source URL
=	TokenNameEQUAL	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
.	TokenNameDOT	
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
baseURLOfSource	TokenNameIdentifier	 base URL Of Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Transformation target 	TokenNameCOMMENT_LINE	Transformation target 
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"target"	TokenNameStringLiteral	target
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
xt	TokenNameIdentifier	 xt
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMHandleFromNode	TokenNameIdentifier	 get DTM Handle From Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get System Id for stylesheet; to be used to resolve URIs to other stylesheets. 	TokenNameCOMMENT_LINE	Get System Id for stylesheet; to be used to resolve URIs to other stylesheets. 
String	TokenNameIdentifier	 String
sysId	TokenNameIdentifier	 sys Id
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeList	TokenNameIdentifier	 Node List
ssNodes	TokenNameIdentifier	 ss Nodes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
NodeList	TokenNameIdentifier	 Node List
paramNodes	TokenNameIdentifier	 param Nodes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
ssNode	TokenNameIdentifier	 ss Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
paramNode	TokenNameIdentifier	 param Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ssNodes	TokenNameIdentifier	 ss Nodes
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Vector to contain TransformerHandler for each stylesheet. 	TokenNameCOMMENT_LINE	Vector to contain TransformerHandler for each stylesheet. 
Vector	TokenNameIdentifier	 Vector
vTHandler	TokenNameIdentifier	 v T Handler
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
ssNodes	TokenNameIdentifier	 ss Nodes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The child nodes of an extension element node are instances of 	TokenNameCOMMENT_LINE	The child nodes of an extension element node are instances of 
// ElemLiteralResult, which requires does not fully support the standard 	TokenNameCOMMENT_LINE	ElemLiteralResult, which requires does not fully support the standard 
// Node interface. Accordingly, some special handling is required (see below) 	TokenNameCOMMENT_LINE	Node interface. Accordingly, some special handling is required (see below) 
// to get attribute values. 	TokenNameCOMMENT_LINE	to get attribute values. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ssNodes	TokenNameIdentifier	 ss Nodes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ssNode	TokenNameIdentifier	 ss Node
=	TokenNameEQUAL	
ssNodes	TokenNameIdentifier	 ss Nodes
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ssNode	TokenNameIdentifier	 ss Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
ssNode	TokenNameIdentifier	 ss Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"stylesheet"	TokenNameStringLiteral	stylesheet
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ssNode	TokenNameIdentifier	 ss Node
instanceof	TokenNameinstanceof	
ElemLiteralResult	TokenNameIdentifier	 Elem Literal Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AVT	TokenNameIdentifier	 AVT
avt	TokenNameIdentifier	 avt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElemLiteralResult	TokenNameIdentifier	 Elem Literal Result
)	TokenNameRPAREN	
ssNode	TokenNameIdentifier	 ss Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getLiteralResultAttribute	TokenNameIdentifier	 get Literal Result Attribute
(	TokenNameLPAREN	
"href"	TokenNameStringLiteral	href
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
href	TokenNameIdentifier	 href
=	TokenNameEQUAL	
avt	TokenNameIdentifier	 avt
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
xt	TokenNameIdentifier	 xt
,	TokenNameCOMMA	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
absURI	TokenNameIdentifier	 abs URI
=	TokenNameEQUAL	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
.	TokenNameDOT	
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
href	TokenNameIdentifier	 href
,	TokenNameCOMMA	
sysId	TokenNameIdentifier	 sys Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Templates	TokenNameIdentifier	 Templates
tmpl	TokenNameIdentifier	 tmpl
=	TokenNameEQUAL	
saxTFactory	TokenNameIdentifier	 sax T Factory
.	TokenNameDOT	
newTemplates	TokenNameIdentifier	 new Templates
(	TokenNameLPAREN	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
absURI	TokenNameIdentifier	 abs URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
tHandler	TokenNameIdentifier	 t Handler
=	TokenNameEQUAL	
saxTFactory	TokenNameIdentifier	 sax T Factory
.	TokenNameDOT	
newTransformerHandler	TokenNameIdentifier	 new Transformer Handler
(	TokenNameLPAREN	
tmpl	TokenNameIdentifier	 tmpl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Transformer	TokenNameIdentifier	 Transformer
trans	TokenNameIdentifier	 trans
=	TokenNameEQUAL	
tHandler	TokenNameIdentifier	 t Handler
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// AddTransformerHandler to vector 	TokenNameCOMMENT_LINE	AddTransformerHandler to vector 
vTHandler	TokenNameIdentifier	 v T Handler
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
tHandler	TokenNameIdentifier	 t Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
paramNodes	TokenNameIdentifier	 param Nodes
=	TokenNameEQUAL	
ssNode	TokenNameIdentifier	 ss Node
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
paramNodes	TokenNameIdentifier	 param Nodes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
paramNode	TokenNameIdentifier	 param Node
=	TokenNameEQUAL	
paramNodes	TokenNameIdentifier	 param Nodes
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
paramNode	TokenNameIdentifier	 param Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
paramNode	TokenNameIdentifier	 param Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"param"	TokenNameStringLiteral	param
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
paramNode	TokenNameIdentifier	 param Node
instanceof	TokenNameinstanceof	
ElemLiteralResult	TokenNameIdentifier	 Elem Literal Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
avt	TokenNameIdentifier	 avt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElemLiteralResult	TokenNameIdentifier	 Elem Literal Result
)	TokenNameRPAREN	
paramNode	TokenNameIdentifier	 param Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getLiteralResultAttribute	TokenNameIdentifier	 get Literal Result Attribute
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pName	TokenNameIdentifier	 p Name
=	TokenNameEQUAL	
avt	TokenNameIdentifier	 avt
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
xt	TokenNameIdentifier	 xt
,	TokenNameCOMMA	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
avt	TokenNameIdentifier	 avt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElemLiteralResult	TokenNameIdentifier	 Elem Literal Result
)	TokenNameRPAREN	
paramNode	TokenNameIdentifier	 param Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getLiteralResultAttribute	TokenNameIdentifier	 get Literal Result Attribute
(	TokenNameLPAREN	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pValue	TokenNameIdentifier	 p Value
=	TokenNameEQUAL	
avt	TokenNameIdentifier	 avt
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
xt	TokenNameIdentifier	 xt
,	TokenNameCOMMA	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
pName	TokenNameIdentifier	 p Name
,	TokenNameCOMMA	
pValue	TokenNameIdentifier	 p Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
usePipe	TokenNameIdentifier	 use Pipe
(	TokenNameLPAREN	
vTHandler	TokenNameIdentifier	 v T Handler
,	TokenNameCOMMA	
absSourceURL	TokenNameIdentifier	 abs Source URL
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Uses a Vector of TransformerHandlers to pipe XML input document through * a series of 1 or more transformations. Called by {@link #pipeDocument}. * * @param vTHandler Vector of Transformation Handlers (1 per stylesheet). * @param source absolute URI to XML input * @param target absolute path to transformation output. */	TokenNameCOMMENT_JAVADOC	 Uses a Vector of TransformerHandlers to pipe XML input document through a series of 1 or more transformations. Called by {@link #pipeDocument}. * @param vTHandler Vector of Transformation Handlers (1 per stylesheet). @param source absolute URI to XML input @param target absolute path to transformation output. 
public	TokenNamepublic	
void	TokenNamevoid	
usePipe	TokenNameIdentifier	 use Pipe
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
vTHandler	TokenNameIdentifier	 v T Handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
,	TokenNameCOMMA	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
,	TokenNameCOMMA	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
SAXException	TokenNameIdentifier	 SAX Exception
,	TokenNameCOMMA	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
{	TokenNameLBRACE	
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
.	TokenNameDOT	
createXMLReader	TokenNameIdentifier	 create XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
tHFirst	TokenNameIdentifier	 t H First
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
)	TokenNameRPAREN	
vTHandler	TokenNameIdentifier	 v T Handler
.	TokenNameDOT	
firstElement	TokenNameIdentifier	 first Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
tHFirst	TokenNameIdentifier	 t H First
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"http://xml.org/sax/properties/lexical-handler"	TokenNameStringLiteral	http://xml.org/sax/properties/lexical-handler
,	TokenNameCOMMA	
tHFirst	TokenNameIdentifier	 t H First
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
vTHandler	TokenNameIdentifier	 v T Handler
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
tHFrom	TokenNameIdentifier	 t H From
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
)	TokenNameRPAREN	
vTHandler	TokenNameIdentifier	 v T Handler
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
tHTo	TokenNameIdentifier	 t H To
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
)	TokenNameRPAREN	
vTHandler	TokenNameIdentifier	 v T Handler
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tHFrom	TokenNameIdentifier	 t H From
.	TokenNameDOT	
setResult	TokenNameIdentifier	 set Result
(	TokenNameLPAREN	
new	TokenNamenew	
SAXResult	TokenNameIdentifier	 SAX Result
(	TokenNameLPAREN	
tHTo	TokenNameIdentifier	 t H To
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
tHLast	TokenNameIdentifier	 t H Last
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
)	TokenNameRPAREN	
vTHandler	TokenNameIdentifier	 v T Handler
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Transformer	TokenNameIdentifier	 Transformer
trans	TokenNameIdentifier	 trans
=	TokenNameEQUAL	
tHLast	TokenNameIdentifier	 t H Last
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
outputProps	TokenNameIdentifier	 output Props
=	TokenNameEQUAL	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getOutputProperties	TokenNameIdentifier	 get Output Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Serializer	TokenNameIdentifier	 Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
.	TokenNameDOT	
getSerializer	TokenNameIdentifier	 get Serializer
(	TokenNameLPAREN	
outputProps	TokenNameIdentifier	 output Props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileOutputStream	TokenNameIdentifier	 File Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tHLast	TokenNameIdentifier	 t H Last
.	TokenNameDOT	
setResult	TokenNameIdentifier	 set Result
(	TokenNameLPAREN	
new	TokenNamenew	
SAXResult	TokenNameIdentifier	 SAX Result
(	TokenNameLPAREN	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
asContentHandler	TokenNameIdentifier	 as Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
// Always clean up the FileOutputStream, 	TokenNameCOMMENT_LINE	Always clean up the FileOutputStream, 
// even if an exception was thrown in the try block 	TokenNameCOMMENT_LINE	even if an exception was thrown in the try block 
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
