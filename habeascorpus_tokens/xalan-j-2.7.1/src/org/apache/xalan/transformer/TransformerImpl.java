/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TransformerImpl.java 475979 2006-11-16 23:32:48Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TransformerImpl.java 475979 2006-11-16 23:32:48Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
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
StringWriter	TokenNameIdentifier	 String Writer
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
Stack	TokenNameIdentifier	 Stack
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
SourceLocator	TokenNameIdentifier	 Source Locator
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
ExtensionsTable	TokenNameIdentifier	 Extensions Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
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
Method	TokenNameIdentifier	 Method
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
Constants	TokenNameIdentifier	 Constants
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
ElemAttributeSet	TokenNameIdentifier	 Elem Attribute Set
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
ElemForEach	TokenNameIdentifier	 Elem For Each
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
ElemSort	TokenNameIdentifier	 Elem Sort
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
ElemTemplate	TokenNameIdentifier	 Elem Template
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
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
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
ElemTextLiteral	TokenNameIdentifier	 Elem Text Literal
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
ElemVariable	TokenNameIdentifier	 Elem Variable
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
OutputProperties	TokenNameIdentifier	 Output Properties
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
Stylesheet	TokenNameIdentifier	 Stylesheet
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
StylesheetComposed	TokenNameIdentifier	 Stylesheet Composed
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
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
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
XUnresolvedVariable	TokenNameIdentifier	 X Unresolved Variable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
.	TokenNameDOT	
GenerateEvent	TokenNameIdentifier	 Generate Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
.	TokenNameDOT	
TraceManager	TokenNameIdentifier	 Trace Manager
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
DTMIterator	TokenNameIdentifier	 DTM Iterator
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
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
ToSAXHandler	TokenNameIdentifier	 To SAX Handler
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
ToTextStream	TokenNameIdentifier	 To Text Stream
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
ToXMLSAXHandler	TokenNameIdentifier	 To XMLSAX Handler
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
BoolStack	TokenNameIdentifier	 Bool Stack
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
DOMBuilder	TokenNameIdentifier	 DOM Builder
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
NodeVector	TokenNameIdentifier	 Node Vector
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
ObjectPool	TokenNameIdentifier	 Object Pool
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
ObjectStack	TokenNameIdentifier	 Object Stack
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
QName	TokenNameIdentifier	 Q Name
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
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
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
ThreadControllerWrapper	TokenNameIdentifier	 Thread Controller Wrapper
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
Arg	TokenNameIdentifier	 Arg
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
ExtensionsProvider	TokenNameIdentifier	 Extensions Provider
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
VariableStack	TokenNameIdentifier	 Variable Stack
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncExtFunction	TokenNameIdentifier	 Func Ext Function
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
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
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
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
DeclHandler	TokenNameIdentifier	 Decl Handler
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
/** * This class implements the * {@link javax.xml.transform.Transformer} interface, and is the core * representation of the transformation execution.</p> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link javax.xml.transform.Transformer} interface, and is the core representation of the transformation execution.</p> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
extends	TokenNameextends	
Transformer	TokenNameIdentifier	 Transformer
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
,	TokenNameCOMMA	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
,	TokenNameCOMMA	
ExtensionsProvider	TokenNameIdentifier	 Extensions Provider
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
{	TokenNameLBRACE	
// Synch object to gaurd against setting values from the TrAX interface 	TokenNameCOMMENT_LINE	Synch object to gaurd against setting values from the TrAX interface 
// or reentry while the transform is going on. 	TokenNameCOMMENT_LINE	or reentry while the transform is going on. 
/** NEEDSDOC Field m_reentryGuard */	TokenNameCOMMENT_JAVADOC	 NEEDSDOC Field m_reentryGuard 
private	TokenNameprivate	
Boolean	TokenNameIdentifier	 Boolean
m_reentryGuard	TokenNameIdentifier	 m reentry Guard
=	TokenNameEQUAL	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This is null unless we own the stream. */	TokenNameCOMMENT_JAVADOC	 This is null unless we own the stream. 
private	TokenNameprivate	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
m_outputStream	TokenNameIdentifier	 m output Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * True if the parser events should be on the main thread, * false if not. Experemental. Can not be set right now. */	TokenNameCOMMENT_JAVADOC	 True if the parser events should be on the main thread, false if not. Experemental. Can not be set right now. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_parserEventsOnMain	TokenNameIdentifier	 m parser Events On Main
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** The thread that the transformer is running on. */	TokenNameCOMMENT_JAVADOC	 The thread that the transformer is running on. 
private	TokenNameprivate	
Thread	TokenNameIdentifier	 Thread
m_transformThread	TokenNameIdentifier	 m transform Thread
;	TokenNameSEMICOLON	
/** The base URL of the source tree. */	TokenNameCOMMENT_JAVADOC	 The base URL of the source tree. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_urlOfSource	TokenNameIdentifier	 m url Of Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The Result object at the start of the transform, if any. */	TokenNameCOMMENT_JAVADOC	 The Result object at the start of the transform, if any. 
private	TokenNameprivate	
Result	TokenNameIdentifier	 Result
m_outputTarget	TokenNameIdentifier	 m output Target
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The output format object set by the user. May be null. */	TokenNameCOMMENT_JAVADOC	 The output format object set by the user. May be null. 
private	TokenNameprivate	
OutputProperties	TokenNameIdentifier	 Output Properties
m_outputFormat	TokenNameIdentifier	 m output Format
;	TokenNameSEMICOLON	
/** * The content handler for the source input tree. */	TokenNameCOMMENT_JAVADOC	 The content handler for the source input tree. 
ContentHandler	TokenNameIdentifier	 Content Handler
m_inputContentHandler	TokenNameIdentifier	 m input Content Handler
;	TokenNameSEMICOLON	
/** * The content handler for the result tree. */	TokenNameCOMMENT_JAVADOC	 The content handler for the result tree. 
private	TokenNameprivate	
ContentHandler	TokenNameIdentifier	 Content Handler
m_outputContentHandler	TokenNameIdentifier	 m output Content Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// /* 	TokenNameCOMMENT_LINE	/* 
// * Use member variable to store param variables as they're 	TokenNameCOMMENT_LINE	* Use member variable to store param variables as they're 
// * being created, use member variable so we don't 	TokenNameCOMMENT_LINE	* being created, use member variable so we don't 
// * have to create a new vector every time. 	TokenNameCOMMENT_LINE	* have to create a new vector every time. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// private Vector m_newVars = new Vector(); 	TokenNameCOMMENT_LINE	private Vector m_newVars = new Vector(); 
/** The JAXP Document Builder, mainly to create Result Tree Fragments. */	TokenNameCOMMENT_JAVADOC	 The JAXP Document Builder, mainly to create Result Tree Fragments. 
DocumentBuilder	TokenNameIdentifier	 Document Builder
m_docBuilder	TokenNameIdentifier	 m doc Builder
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * A pool of ResultTreeHandlers, for serialization of a subtree to text. * Please note that each of these also holds onto a Text Serializer. */	TokenNameCOMMENT_JAVADOC	 A pool of ResultTreeHandlers, for serialization of a subtree to text. Please note that each of these also holds onto a Text Serializer. 
private	TokenNameprivate	
ObjectPool	TokenNameIdentifier	 Object Pool
m_textResultHandlerObjectPool	TokenNameIdentifier	 m text Result Handler Object Pool
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectPool	TokenNameIdentifier	 Object Pool
(	TokenNameLPAREN	
ToTextStream	TokenNameIdentifier	 To Text Stream
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Related to m_textResultHandlerObjectPool, this is a pool of * StringWriters, which are passed to the Text Serializers. * (I'm not sure if this is really needed any more. -sb) */	TokenNameCOMMENT_JAVADOC	 Related to m_textResultHandlerObjectPool, this is a pool of StringWriters, which are passed to the Text Serializers. (I'm not sure if this is really needed any more. -sb) 
private	TokenNameprivate	
ObjectPool	TokenNameIdentifier	 Object Pool
m_stringWriterObjectPool	TokenNameIdentifier	 m string Writer Object Pool
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectPool	TokenNameIdentifier	 Object Pool
(	TokenNameLPAREN	
StringWriter	TokenNameIdentifier	 String Writer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A static text format object, which can be used over and * over to create the text serializers. */	TokenNameCOMMENT_JAVADOC	 A static text format object, which can be used over and over to create the text serializers. 
private	TokenNameprivate	
OutputProperties	TokenNameIdentifier	 Output Properties
m_textformat	TokenNameIdentifier	 m textformat
=	TokenNameEQUAL	
new	TokenNamenew	
OutputProperties	TokenNameIdentifier	 Output Properties
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
TEXT	TokenNameIdentifier	 TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Commenteded out in response to problem reported by 	TokenNameCOMMENT_LINE	Commenteded out in response to problem reported by 
// Nicola Brown <Nicola.Brown@jacobsrimell.com> 	TokenNameCOMMENT_LINE	Nicola Brown <Nicola.Brown@jacobsrimell.com> 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Flag to let us know if an exception should be reported inside the 	TokenNameCOMMENT_LINE	* Flag to let us know if an exception should be reported inside the 
// * postExceptionFromThread method. This is needed if the transform is 	TokenNameCOMMENT_LINE	* postExceptionFromThread method. This is needed if the transform is 
// * being generated from SAX events, and thus there is no central place 	TokenNameCOMMENT_LINE	* being generated from SAX events, and thus there is no central place 
// * to report the exception from. (An exception is usually picked up in 	TokenNameCOMMENT_LINE	* to report the exception from. (An exception is usually picked up in 
// * the main thread from the transform thread in {@link #transform(Source source)} 	TokenNameCOMMENT_LINE	* the main thread from the transform thread in {@link #transform(Source source)} 
// * from {@link #getExceptionThrown()}. ) 	TokenNameCOMMENT_LINE	* from {@link #getExceptionThrown()}. ) 
// */ 	TokenNameCOMMENT_LINE	*/ 
// private boolean m_reportInPostExceptionFromThread = false; 	TokenNameCOMMENT_LINE	private boolean m_reportInPostExceptionFromThread = false; 
/** * A node vector used as a stack to track the current * ElemTemplateElement. Needed for the * org.apache.xalan.transformer.TransformState interface, * so a tool can discover the calling template. Note the use of an array * for this limits the recursion depth to 4K. */	TokenNameCOMMENT_JAVADOC	 A node vector used as a stack to track the current ElemTemplateElement. Needed for the org.apache.xalan.transformer.TransformState interface, so a tool can discover the calling template. Note the use of an array for this limits the recursion depth to 4K. 
ObjectStack	TokenNameIdentifier	 Object Stack
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectStack	TokenNameIdentifier	 Object Stack
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
.	TokenNameDOT	
RECURSIONLIMIT	TokenNameIdentifier	 RECURSIONLIMIT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The top of the currentTemplateElements stack. */	TokenNameCOMMENT_JAVADOC	 The top of the currentTemplateElements stack. 
//int m_currentTemplateElementsTop = 0; 	TokenNameCOMMENT_LINE	int m_currentTemplateElementsTop = 0; 
/** * A node vector used as a stack to track the current * ElemTemplate that was matched. * Needed for the * org.apache.xalan.transformer.TransformState interface, * so a tool can discover the matched template */	TokenNameCOMMENT_JAVADOC	 A node vector used as a stack to track the current ElemTemplate that was matched. Needed for the org.apache.xalan.transformer.TransformState interface, so a tool can discover the matched template 
Stack	TokenNameIdentifier	 Stack
m_currentMatchTemplates	TokenNameIdentifier	 m current Match Templates
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A node vector used as a stack to track the current * node that was matched. * Needed for the * org.apache.xalan.transformer.TransformState interface, * so a tool can discover the matched * node. */	TokenNameCOMMENT_JAVADOC	 A node vector used as a stack to track the current node that was matched. Needed for the org.apache.xalan.transformer.TransformState interface, so a tool can discover the matched node. 
NodeVector	TokenNameIdentifier	 Node Vector
m_currentMatchedNodes	TokenNameIdentifier	 m current Matched Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
NodeVector	TokenNameIdentifier	 Node Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The root of a linked set of stylesheets. */	TokenNameCOMMENT_JAVADOC	 The root of a linked set of stylesheets. 
private	TokenNameprivate	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * If this is set to true, do not warn about pattern * match conflicts. */	TokenNameCOMMENT_JAVADOC	 If this is set to true, do not warn about pattern match conflicts. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_quietConflictWarnings	TokenNameIdentifier	 m quiet Conflict Warnings
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * The liason to the XML parser, so the XSL processor * can handle included files, and the like, and do the * initial parse of the XSL document. */	TokenNameCOMMENT_JAVADOC	 The liason to the XML parser, so the XSL processor can handle included files, and the like, and do the initial parse of the XSL document. 
private	TokenNameprivate	
XPathContext	TokenNameIdentifier	 X Path Context
m_xcontext	TokenNameIdentifier	 m xcontext
;	TokenNameSEMICOLON	
/** * Object to guard agains infinite recursion when * doing queries. */	TokenNameCOMMENT_JAVADOC	 Object to guard agains infinite recursion when doing queries. 
private	TokenNameprivate	
StackGuard	TokenNameIdentifier	 Stack Guard
m_stackGuard	TokenNameIdentifier	 m stack Guard
;	TokenNameSEMICOLON	
/** * Output handler to bottleneck SAX events. */	TokenNameCOMMENT_JAVADOC	 Output handler to bottleneck SAX events. 
private	TokenNameprivate	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
;	TokenNameSEMICOLON	
/** The key manager, which manages xsl:keys. */	TokenNameCOMMENT_JAVADOC	 The key manager, which manages xsl:keys. 
private	TokenNameprivate	
KeyManager	TokenNameIdentifier	 Key Manager
m_keyManager	TokenNameIdentifier	 m key Manager
=	TokenNameEQUAL	
new	TokenNamenew	
KeyManager	TokenNameIdentifier	 Key Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Stack for the purposes of flagging infinite recursion with * attribute sets. */	TokenNameCOMMENT_JAVADOC	 Stack for the purposes of flagging infinite recursion with attribute sets. 
Stack	TokenNameIdentifier	 Stack
m_attrSetStack	TokenNameIdentifier	 m attr Set Stack
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The table of counters for xsl:number support. * @see ElemNumber */	TokenNameCOMMENT_JAVADOC	 The table of counters for xsl:number support. @see ElemNumber 
CountersTable	TokenNameIdentifier	 Counters Table
m_countersTable	TokenNameIdentifier	 m counters Table
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Is > 0 when we're processing a for-each. */	TokenNameCOMMENT_JAVADOC	 Is > 0 when we're processing a for-each. 
BoolStack	TokenNameIdentifier	 Bool Stack
m_currentTemplateRuleIsNull	TokenNameIdentifier	 m current Template Rule Is Null
=	TokenNameEQUAL	
new	TokenNamenew	
BoolStack	TokenNameIdentifier	 Bool Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Keeps track of the result delivered by any EXSLT <code>func:result</code> * instruction that has been executed for the currently active EXSLT * <code>func:function</code> */	TokenNameCOMMENT_JAVADOC	 Keeps track of the result delivered by any EXSLT <code>func:result</code> instruction that has been executed for the currently active EXSLT <code>func:function</code> 
ObjectStack	TokenNameIdentifier	 Object Stack
m_currentFuncResult	TokenNameIdentifier	 m current Func Result
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectStack	TokenNameIdentifier	 Object Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The message manager, which manages error messages, warning * messages, and other types of message events. */	TokenNameCOMMENT_JAVADOC	 The message manager, which manages error messages, warning messages, and other types of message events. 
private	TokenNameprivate	
MsgMgr	TokenNameIdentifier	 Msg Mgr
m_msgMgr	TokenNameIdentifier	 m msg Mgr
;	TokenNameSEMICOLON	
/** * The flag for the setting of the optimize feature; * This flag should have the same value as the FEATURE_OPTIMIZE feature * which is set by the TransformerFactory.setAttribut() method before a * Transformer is created */	TokenNameCOMMENT_JAVADOC	 The flag for the setting of the optimize feature; This flag should have the same value as the FEATURE_OPTIMIZE feature which is set by the TransformerFactory.setAttribut() method before a Transformer is created 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_optimizer	TokenNameIdentifier	 m optimizer
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * The flag for the setting of the incremental feature; * This flag should have the same value as the FEATURE_INCREMENTAL feature * which is set by the TransformerFactory.setAttribut() method before a * Transformer is created */	TokenNameCOMMENT_JAVADOC	 The flag for the setting of the incremental feature; This flag should have the same value as the FEATURE_INCREMENTAL feature which is set by the TransformerFactory.setAttribut() method before a Transformer is created 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_incremental	TokenNameIdentifier	 m incremental
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The flag for the setting of the source_location feature; * This flag should have the same value as the FEATURE_SOURCE_LOCATION feature * which is set by the TransformerFactory.setAttribut() method before a * Transformer is created */	TokenNameCOMMENT_JAVADOC	 The flag for the setting of the source_location feature; This flag should have the same value as the FEATURE_SOURCE_LOCATION feature which is set by the TransformerFactory.setAttribut() method before a Transformer is created 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_source_location	TokenNameIdentifier	 m source location
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * This is a compile-time flag to turn off calling * of trace listeners. Set this to false for optimization purposes. */	TokenNameCOMMENT_JAVADOC	 This is a compile-time flag to turn off calling of trace listeners. Set this to false for optimization purposes. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_debug	TokenNameIdentifier	 m debug
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The SAX error handler, where errors and warnings are sent. */	TokenNameCOMMENT_JAVADOC	 The SAX error handler, where errors and warnings are sent. 
private	TokenNameprivate	
ErrorListener	TokenNameIdentifier	 Error Listener
m_errorHandler	TokenNameIdentifier	 m error Handler
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The trace manager. */	TokenNameCOMMENT_JAVADOC	 The trace manager. 
private	TokenNameprivate	
TraceManager	TokenNameIdentifier	 Trace Manager
m_traceManager	TokenNameIdentifier	 m trace Manager
=	TokenNameEQUAL	
new	TokenNamenew	
TraceManager	TokenNameIdentifier	 Trace Manager
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If the transform thread throws an exception, the exception needs to * be stashed away so that the main thread can pass it on to the * client. */	TokenNameCOMMENT_JAVADOC	 If the transform thread throws an exception, the exception needs to be stashed away so that the main thread can pass it on to the client. 
private	TokenNameprivate	
Exception	TokenNameIdentifier	 Exception
m_exceptionThrown	TokenNameIdentifier	 m exception Thrown
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The InputSource for the source tree, which is needed if the * parse thread is not the main thread, in order for the parse * thread's run method to get to the input source. * (Delete this if reversing threads is outlawed. -sb) */	TokenNameCOMMENT_JAVADOC	 The InputSource for the source tree, which is needed if the parse thread is not the main thread, in order for the parse thread's run method to get to the input source. (Delete this if reversing threads is outlawed. -sb) 
private	TokenNameprivate	
Source	TokenNameIdentifier	 Source
m_xmlSource	TokenNameIdentifier	 m xml Source
;	TokenNameSEMICOLON	
/** * This is needed for support of setSourceTreeDocForThread(Node doc), * which must be called in order for the transform thread's run * method to obtain the root of the source tree to be transformed. */	TokenNameCOMMENT_JAVADOC	 This is needed for support of setSourceTreeDocForThread(Node doc), which must be called in order for the transform thread's run method to obtain the root of the source tree to be transformed. 
private	TokenNameprivate	
int	TokenNameint	
m_doc	TokenNameIdentifier	 m doc
;	TokenNameSEMICOLON	
/** * If the the transform is on the secondary thread, we * need to know when it is done, so we can return. */	TokenNameCOMMENT_JAVADOC	 If the the transform is on the secondary thread, we need to know when it is done, so we can return. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isTransformDone	TokenNameIdentifier	 m is Transform Done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Flag to to tell if the tranformer needs to be reset. */	TokenNameCOMMENT_JAVADOC	 Flag to to tell if the tranformer needs to be reset. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_hasBeenReset	TokenNameIdentifier	 m has Been Reset
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** NEEDSDOC Field m_shouldReset */	TokenNameCOMMENT_JAVADOC	 NEEDSDOC Field m_shouldReset 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_shouldReset	TokenNameIdentifier	 m should Reset
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * NEEDSDOC Method setShouldReset * * * NEEDSDOC @param shouldReset */	TokenNameCOMMENT_JAVADOC	 NEEDSDOC Method setShouldReset * NEEDSDOC @param shouldReset 
public	TokenNamepublic	
void	TokenNamevoid	
setShouldReset	TokenNameIdentifier	 set Should Reset
(	TokenNameLPAREN	
boolean	TokenNameboolean	
shouldReset	TokenNameIdentifier	 should Reset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_shouldReset	TokenNameIdentifier	 m should Reset
=	TokenNameEQUAL	
shouldReset	TokenNameIdentifier	 should Reset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A stack of current template modes. */	TokenNameCOMMENT_JAVADOC	 A stack of current template modes. 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
m_modes	TokenNameIdentifier	 m modes
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//========================================================== 	TokenNameCOMMENT_LINE	========================================================== 
// SECTION: Constructor 	TokenNameCOMMENT_LINE	SECTION: Constructor 
//========================================================== 	TokenNameCOMMENT_LINE	========================================================== 
/** * Construct a TransformerImpl. * * @param stylesheet The root of the stylesheet tree. */	TokenNameCOMMENT_JAVADOC	 Construct a TransformerImpl. * @param stylesheet The root of the stylesheet tree. 
public	TokenNamepublic	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
// throws javax.xml.transform.TransformerException 	TokenNameCOMMENT_LINE	throws javax.xml.transform.TransformerException 
{	TokenNameLBRACE	
m_optimizer	TokenNameIdentifier	 m optimizer
=	TokenNameEQUAL	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
getOptimizer	TokenNameIdentifier	 get Optimizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_incremental	TokenNameIdentifier	 m incremental
=	TokenNameEQUAL	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
getIncremental	TokenNameIdentifier	 get Incremental
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_source_location	TokenNameIdentifier	 m source location
=	TokenNameEQUAL	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
getSource_location	TokenNameIdentifier	 get Source location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setStylesheet	TokenNameIdentifier	 set Stylesheet
(	TokenNameLPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XPathContext	TokenNameIdentifier	 X Path Context
xPath	TokenNameIdentifier	 x Path
=	TokenNameEQUAL	
new	TokenNamenew	
XPathContext	TokenNameIdentifier	 X Path Context
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xPath	TokenNameIdentifier	 x Path
.	TokenNameDOT	
setIncremental	TokenNameIdentifier	 set Incremental
(	TokenNameLPAREN	
m_incremental	TokenNameIdentifier	 m incremental
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xPath	TokenNameIdentifier	 x Path
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setIncremental	TokenNameIdentifier	 set Incremental
(	TokenNameLPAREN	
m_incremental	TokenNameIdentifier	 m incremental
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xPath	TokenNameIdentifier	 x Path
.	TokenNameDOT	
setSource_location	TokenNameIdentifier	 set Source location
(	TokenNameLPAREN	
m_source_location	TokenNameIdentifier	 m source location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xPath	TokenNameIdentifier	 x Path
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setSource_location	TokenNameIdentifier	 set Source location
(	TokenNameLPAREN	
m_source_location	TokenNameIdentifier	 m source location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
isSecureProcessing	TokenNameIdentifier	 is Secure Processing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
xPath	TokenNameIdentifier	 x Path
.	TokenNameDOT	
setSecureProcessing	TokenNameIdentifier	 set Secure Processing
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setXPathContext	TokenNameIdentifier	 set X Path Context
(	TokenNameLPAREN	
xPath	TokenNameIdentifier	 x Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNamespaceContext	TokenNameIdentifier	 set Namespace Context
(	TokenNameLPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_stackGuard	TokenNameIdentifier	 m stack Guard
=	TokenNameEQUAL	
new	TokenNamenew	
StackGuard	TokenNameIdentifier	 Stack Guard
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ================ ExtensionsTable =================== 	TokenNameCOMMENT_LINE	================ ExtensionsTable =================== 
/** * The table of ExtensionHandlers. */	TokenNameCOMMENT_JAVADOC	 The table of ExtensionHandlers. 
private	TokenNameprivate	
ExtensionsTable	TokenNameIdentifier	 Extensions Table
m_extensionsTable	TokenNameIdentifier	 m extensions Table
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Get the extensions table object. * * @return The extensions table. */	TokenNameCOMMENT_JAVADOC	 Get the extensions table object. * @return The extensions table. 
public	TokenNamepublic	
ExtensionsTable	TokenNameIdentifier	 Extensions Table
getExtensionsTable	TokenNameIdentifier	 get Extensions Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_extensionsTable	TokenNameIdentifier	 m extensions Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If the stylesheet contains extensions, set the extensions table object. * * * @param sroot The stylesheet. * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 If the stylesheet contains extensions, set the extensions table object. * @param sroot The stylesheet. @throws javax.xml.transform.TransformerException 
void	TokenNamevoid	
setExtensionsTable	TokenNameIdentifier	 set Extensions Table
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getExtensions	TokenNameIdentifier	 get Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_extensionsTable	TokenNameIdentifier	 m extensions Table
=	TokenNameEQUAL	
new	TokenNamenew	
ExtensionsTable	TokenNameIdentifier	 Extensions Table
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//== Implementation of the XPath ExtensionsProvider interface. 	TokenNameCOMMENT_LINE	== Implementation of the XPath ExtensionsProvider interface. 
public	TokenNamepublic	
boolean	TokenNameboolean	
functionAvailable	TokenNameIdentifier	 function Available
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
funcName	TokenNameIdentifier	 func Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getExtensionsTable	TokenNameIdentifier	 get Extensions Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
functionAvailable	TokenNameIdentifier	 function Available
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
funcName	TokenNameIdentifier	 func Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
elementAvailable	TokenNameIdentifier	 element Available
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getExtensionsTable	TokenNameIdentifier	 get Extensions Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
elementAvailable	TokenNameIdentifier	 element Available
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
extFunction	TokenNameIdentifier	 ext Function
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
funcName	TokenNameIdentifier	 func Name
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
argVec	TokenNameIdentifier	 arg Vec
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
methodKey	TokenNameIdentifier	 method Key
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
//System.out.println("TransImpl.extFunction() " + ns + " " + funcName +" " + getExtensionsTable()); 	TokenNameCOMMENT_LINE	System.out.println("TransImpl.extFunction() " + ns + " " + funcName +" " + getExtensionsTable()); 
return	TokenNamereturn	
getExtensionsTable	TokenNameIdentifier	 get Extensions Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
extFunction	TokenNameIdentifier	 ext Function
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
funcName	TokenNameIdentifier	 func Name
,	TokenNameCOMMA	
argVec	TokenNameIdentifier	 arg Vec
,	TokenNameCOMMA	
methodKey	TokenNameIdentifier	 method Key
,	TokenNameCOMMA	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getExpressionContext	TokenNameIdentifier	 get Expression Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
extFunction	TokenNameIdentifier	 ext Function
(	TokenNameLPAREN	
FuncExtFunction	TokenNameIdentifier	 Func Ext Function
extFunction	TokenNameIdentifier	 ext Function
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
argVec	TokenNameIdentifier	 arg Vec
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getExtensionsTable	TokenNameIdentifier	 get Extensions Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
extFunction	TokenNameIdentifier	 ext Function
(	TokenNameLPAREN	
extFunction	TokenNameIdentifier	 ext Function
,	TokenNameCOMMA	
argVec	TokenNameIdentifier	 arg Vec
,	TokenNameCOMMA	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getExpressionContext	TokenNameIdentifier	 get Expression Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//========================= 	TokenNameCOMMENT_LINE	========================= 
/** * Reset the state. This needs to be called after a process() call * is invoked, if the processor is to be used again. */	TokenNameCOMMENT_JAVADOC	 Reset the state. This needs to be called after a process() call is invoked, if the processor is to be used again. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_hasBeenReset	TokenNameIdentifier	 m has Been Reset
&&	TokenNameAND_AND	
m_shouldReset	TokenNameIdentifier	 m should Reset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_hasBeenReset	TokenNameIdentifier	 m has Been Reset
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_outputStream	TokenNameIdentifier	 m output Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_outputStream	TokenNameIdentifier	 m output Stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_outputStream	TokenNameIdentifier	 m output Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// I need to look more carefully at which of these really 	TokenNameCOMMENT_LINE	I need to look more carefully at which of these really 
// needs to be reset. 	TokenNameCOMMENT_LINE	needs to be reset. 
m_countersTable	TokenNameIdentifier	 m counters Table
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
getVarStack	TokenNameIdentifier	 get Var Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resetUserParameters	TokenNameIdentifier	 reset User Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentMatchTemplates	TokenNameIdentifier	 m current Match Templates
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentMatchedNodes	TokenNameIdentifier	 m current Matched Nodes
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_outputTarget	TokenNameIdentifier	 m output Target
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_keyManager	TokenNameIdentifier	 m key Manager
=	TokenNameEQUAL	
new	TokenNamenew	
KeyManager	TokenNameIdentifier	 Key Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_attrSetStack	TokenNameIdentifier	 m attr Set Stack
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_countersTable	TokenNameIdentifier	 m counters Table
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_currentTemplateRuleIsNull	TokenNameIdentifier	 m current Template Rule Is Null
=	TokenNameEQUAL	
new	TokenNamenew	
BoolStack	TokenNameIdentifier	 Bool Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_xmlSource	TokenNameIdentifier	 m xml Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_doc	TokenNameIdentifier	 m doc
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
m_isTransformDone	TokenNameIdentifier	 m is Transform Done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_transformThread	TokenNameIdentifier	 m transform Thread
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// m_inputContentHandler = null; 	TokenNameCOMMENT_LINE	m_inputContentHandler = null; 
// For now, reset the document cache each time. 	TokenNameCOMMENT_LINE	For now, reset the document cache each time. 
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
getSourceTreeManager	TokenNameIdentifier	 get Source Tree Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// m_reportInPostExceptionFromThread = false; 	TokenNameCOMMENT_LINE	m_reportInPostExceptionFromThread = false; 
}	TokenNameRBRACE	
/** * <code>getProperty</code> returns the current setting of the * property described by the <code>property</code> argument. * * %REVIEW% Obsolete now that source_location is handled in the TransformerFactory? * * @param property a <code>String</code> value * @return a <code>boolean</code> value */	TokenNameCOMMENT_JAVADOC	 <code>getProperty</code> returns the current setting of the property described by the <code>property</code> argument. * %REVIEW% Obsolete now that source_location is handled in the TransformerFactory? * @param property a <code>String</code> value @return a <code>boolean</code> value 
public	TokenNamepublic	
boolean	TokenNameboolean	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a runtime property for this <code>TransformerImpl</code>. * * %REVIEW% Obsolete now that source_location is handled in the TransformerFactory? * * @param property a <code>String</code> value * @param value an <code>Object</code> value */	TokenNameCOMMENT_JAVADOC	 Set a runtime property for this <code>TransformerImpl</code>. * %REVIEW% Obsolete now that source_location is handled in the TransformerFactory? * @param property a <code>String</code> value @param value an <code>Object</code> value 
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
// ========= Transformer Interface Implementation ========== 	TokenNameCOMMENT_LINE	========= Transformer Interface Implementation ========== 
/** * Get true if the parser events should be on the main thread, * false if not. Experimental. Can not be set right now. * * @return true if the parser events should be on the main thread, * false if not. * @xsl.usage experimental */	TokenNameCOMMENT_JAVADOC	 Get true if the parser events should be on the main thread, false if not. Experimental. Can not be set right now. * @return true if the parser events should be on the main thread, false if not. @xsl.usage experimental 
public	TokenNamepublic	
boolean	TokenNameboolean	
isParserEventsOnMain	TokenNameIdentifier	 is Parser Events On Main
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_parserEventsOnMain	TokenNameIdentifier	 m parser Events On Main
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the thread that the transform process is on. * * @return The thread that the transform process is on, or null. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Get the thread that the transform process is on. * @return The thread that the transform process is on, or null. @xsl.usage internal 
public	TokenNamepublic	
Thread	TokenNameIdentifier	 Thread
getTransformThread	TokenNameIdentifier	 get Transform Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_transformThread	TokenNameIdentifier	 m transform Thread
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the thread that the transform process is on. * * @param t The transform thread, may be null. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Get the thread that the transform process is on. * @param t The transform thread, may be null. @xsl.usage internal 
public	TokenNamepublic	
void	TokenNamevoid	
setTransformThread	TokenNameIdentifier	 set Transform Thread
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_transformThread	TokenNameIdentifier	 m transform Thread
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** NEEDSDOC Field m_hasTransformThreadErrorCatcher */	TokenNameCOMMENT_JAVADOC	 NEEDSDOC Field m_hasTransformThreadErrorCatcher 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_hasTransformThreadErrorCatcher	TokenNameIdentifier	 m has Transform Thread Error Catcher
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Return true if the transform was initiated from the transform method, * otherwise it was probably done from a pure parse events. * * NEEDSDOC ($objectName$) @return */	TokenNameCOMMENT_JAVADOC	 Return true if the transform was initiated from the transform method, otherwise it was probably done from a pure parse events. * NEEDSDOC ($objectName$) @return 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasTransformThreadErrorCatcher	TokenNameIdentifier	 has Transform Thread Error Catcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_hasTransformThreadErrorCatcher	TokenNameIdentifier	 m has Transform Thread Error Catcher
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process the source tree to SAX parse events. * @param source The input for the source tree. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Process the source tree to SAX parse events. @param source The input for the source tree. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process the source tree to SAX parse events. * @param source The input for the source tree. * @param shouldRelease Flag indicating whether to release DTMManager. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Process the source tree to SAX parse events. @param source The input for the source tree. @param shouldRelease Flag indicating whether to release DTMManager. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldRelease	TokenNameIdentifier	 should Release
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Patch for bugzilla #13863. If we don't reset the namespaceContext 	TokenNameCOMMENT_LINE	Patch for bugzilla #13863. If we don't reset the namespaceContext 
// then we will get a NullPointerException if transformer is reused 	TokenNameCOMMENT_LINE	then we will get a NullPointerException if transformer is reused 
// (for stylesheets that use xsl:key). Not sure if this should go 	TokenNameCOMMENT_LINE	(for stylesheets that use xsl:key). Not sure if this should go 
// here or in reset(). -is 	TokenNameCOMMENT_LINE	here or in reset(). -is 
if	TokenNameif	
(	TokenNameLPAREN	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNamespaceContext	TokenNameIdentifier	 get Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNamespaceContext	TokenNameIdentifier	 set Namespace Context
(	TokenNameLPAREN	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If no systemID of the source, use the base of the stylesheet. 	TokenNameCOMMENT_LINE	If no systemID of the source, use the base of the stylesheet. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
.	TokenNameDOT	
getBaseIdentifier	TokenNameIdentifier	 get Base Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// As a last resort, use the current user dir. 	TokenNameCOMMENT_LINE	As a last resort, use the current user dir. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
currentDir	TokenNameIdentifier	 current Dir
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
currentDir	TokenNameIdentifier	 current Dir
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.dir"	TokenNameStringLiteral	user.dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// user.dir not accessible from applet 	TokenNameCOMMENT_LINE	user.dir not accessible from applet 
if	TokenNameif	
(	TokenNameLPAREN	
currentDir	TokenNameIdentifier	 current Dir
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
"file://"	TokenNameStringLiteral	file://
+	TokenNamePLUS	
currentDir	TokenNameIdentifier	 current Dir
;	TokenNameSEMICOLON	
else	TokenNameelse	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
"file:///"	TokenNameStringLiteral	file:///
+	TokenNamePLUS	
currentDir	TokenNameIdentifier	 current Dir
;	TokenNameSEMICOLON	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
+	TokenNamePLUS	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setBaseURLOfSource	TokenNameIdentifier	 set Base URL Of Source
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTMManager	TokenNameIdentifier	 DTM Manager
mgr	TokenNameIdentifier	 mgr
=	TokenNameEQUAL	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * According to JAXP1.2, new SAXSource()/StreamSource() * should create an empty input tree, with a default root node. * new DOMSource()creates an empty document using DocumentBuilder. * newDocument(); Use DocumentBuilder.newDocument() for all 3 situations, * since there is no clear spec. how to create an empty tree when * both SAXSource() and StreamSource() are used. */	TokenNameCOMMENT_BLOCK	 According to JAXP1.2, new SAXSource()/StreamSource() should create an empty input tree, with a default root node. new DOMSource()creates an empty document using DocumentBuilder. newDocument(); Use DocumentBuilder.newDocument() for all 3 situations, since there is no clear spec. how to create an empty tree when both SAXSource() and StreamSource() are used. 
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
try	TokenNametry	
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
// Copy system ID from original, empty Source to new Source 	TokenNameCOMMENT_LINE	Copy system ID from original, empty Source to new Source 
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
mgr	TokenNameIdentifier	 mgr
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
setDocumentBaseURI	TokenNameIdentifier	 set Document Base URI
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hardDelete	TokenNameIdentifier	 hard Delete
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// %REVIEW% I have to think about this. -sb 	TokenNameCOMMENT_LINE	%REVIEW% I have to think about this. -sb 
try	TokenNametry	
{	TokenNameLBRACE	
// NOTE: This will work because this is _NOT_ a shared DTM, and thus has 	TokenNameCOMMENT_LINE	NOTE: This will work because this is _NOT_ a shared DTM, and thus has 
// only a single Document node. If it could ever be an RTF or other 	TokenNameCOMMENT_LINE	only a single Document node. If it could ever be an RTF or other 
// shared DTM, look at dtm.getDocumentRoot(nodeHandle). 	TokenNameCOMMENT_LINE	shared DTM, look at dtm.getDocumentRoot(nodeHandle). 
this	TokenNamethis	
.	TokenNameDOT	
transformNode	TokenNameIdentifier	 transform Node
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shouldRelease	TokenNameIdentifier	 should Release
)	TokenNameRPAREN	
mgr	TokenNameIdentifier	 mgr
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
hardDelete	TokenNameIdentifier	 hard Delete
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Kick off the parse. When the ContentHandler gets 	TokenNameCOMMENT_LINE	Kick off the parse. When the ContentHandler gets 
// the startDocument event, it will call transformNode( node ). 	TokenNameCOMMENT_LINE	the startDocument event, it will call transformNode( node ). 
// reader.parse( xmlSource ); 	TokenNameCOMMENT_LINE	reader.parse( xmlSource ); 
// This has to be done to catch exceptions thrown from 	TokenNameCOMMENT_LINE	This has to be done to catch exceptions thrown from 
// the transform thread spawned by the STree handler. 	TokenNameCOMMENT_LINE	the transform thread spawned by the STree handler. 
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
getExceptionThrown	TokenNameIdentifier	 get Exception Thrown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
wre	TokenNameIdentifier	 wre
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
throwable	TokenNameIdentifier	 throwable
=	TokenNameEQUAL	
wre	TokenNameIdentifier	 wre
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
throwable	TokenNameIdentifier	 throwable
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwable	TokenNameIdentifier	 throwable
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
)	TokenNameRPAREN	
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Patch attributed to David Eisenberg <david@catcode.com> 	TokenNameCOMMENT_LINE	Patch attributed to David Eisenberg <david@catcode.com> 
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
spe	TokenNameIdentifier	 spe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
spe	TokenNameIdentifier	 spe
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
m_errorHandler	TokenNameIdentifier	 m error Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
m_hasTransformThreadErrorCatcher	TokenNameIdentifier	 m has Transform Thread Error Catcher
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// This looks to be redundent to the one done in TransformNode. 	TokenNameCOMMENT_LINE	This looks to be redundent to the one done in TransformNode. 
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
throwable	TokenNameIdentifier	 throwable
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
)	TokenNameRPAREN	
m_errorHandler	TokenNameIdentifier	 m error Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
throwable	TokenNameIdentifier	 throwable
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
)	TokenNameRPAREN	
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_errorHandler	TokenNameIdentifier	 m error Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the base URL of the source. * * @return The base URL of the source tree, or null. */	TokenNameCOMMENT_JAVADOC	 Get the base URL of the source. * @return The base URL of the source tree, or null. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseURLOfSource	TokenNameIdentifier	 get Base URL Of Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_urlOfSource	TokenNameIdentifier	 m url Of Source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the base URL of the source. * * * NEEDSDOC @param base * @return The base URL of the source tree, or null. */	TokenNameCOMMENT_JAVADOC	 Get the base URL of the source. * NEEDSDOC @param base @return The base URL of the source tree, or null. 
public	TokenNamepublic	
void	TokenNamevoid	
setBaseURLOfSource	TokenNameIdentifier	 set Base URL Of Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_urlOfSource	TokenNameIdentifier	 m url Of Source
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the original output target. * * @return The Result object used to kick of the transform or null. */	TokenNameCOMMENT_JAVADOC	 Get the original output target. * @return The Result object used to kick of the transform or null. 
public	TokenNamepublic	
Result	TokenNameIdentifier	 Result
getOutputTarget	TokenNameIdentifier	 get Output Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_outputTarget	TokenNameIdentifier	 m output Target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the original output target. This is useful when using a SAX transform and * supplying a ContentHandler or when the URI of the output target should * not be the same as the systemID of the original output target. * * * NEEDSDOC @param outputTarget */	TokenNameCOMMENT_JAVADOC	 Set the original output target. This is useful when using a SAX transform and supplying a ContentHandler or when the URI of the output target should not be the same as the systemID of the original output target. * NEEDSDOC @param outputTarget 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputTarget	TokenNameIdentifier	 set Output Target
(	TokenNameLPAREN	
Result	TokenNameIdentifier	 Result
outputTarget	TokenNameIdentifier	 output Target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputTarget	TokenNameIdentifier	 m output Target
=	TokenNameEQUAL	
outputTarget	TokenNameIdentifier	 output Target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an output property that is in effect for the * transformation. The property specified may be a property * that was set with setOutputProperty, or it may be a * property specified in the stylesheet. * * NEEDSDOC @param qnameString * * @return The string value of the output property, or null * if no property was found. * * @throws IllegalArgumentException If the property is not supported. * * @see javax.xml.transform.OutputKeys */	TokenNameCOMMENT_JAVADOC	 Get an output property that is in effect for the transformation. The property specified may be a property that was set with setOutputProperty, or it may be a property specified in the stylesheet. * NEEDSDOC @param qnameString * @return The string value of the output property, or null if no property was found. * @throws IllegalArgumentException If the property is not supported. * @see javax.xml.transform.OutputKeys 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOutputProperty	TokenNameIdentifier	 get Output Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qnameString	TokenNameIdentifier	 qname String
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
OutputProperties	TokenNameIdentifier	 Output Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
getOutputFormat	TokenNameIdentifier	 get Output Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
qnameString	TokenNameIdentifier	 qname String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
OutputProperties	TokenNameIdentifier	 Output Properties
.	TokenNameDOT	
isLegalPropertyKey	TokenNameIdentifier	 is Legal Property Key
(	TokenNameLPAREN	
qnameString	TokenNameIdentifier	 qname String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_OUTPUT_PROPERTY_NOT_RECOGNIZED	TokenNameIdentifier	 ER  OUTPUT  PROPERTY  NOT  RECOGNIZED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
qnameString	TokenNameIdentifier	 qname String
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"output property not recognized: " 	TokenNameCOMMENT_LINE	"output property not recognized: " 
//+ qnameString); 	TokenNameCOMMENT_LINE	+ qnameString); 
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the value of a property, without using the default properties. This * can be used to test if a property has been explicitly set by the stylesheet * or user. * * NEEDSDOC @param qnameString * * @return The value of the property, or null if not found. * * @throws IllegalArgumentException If the property is not supported, * and is not namespaced. */	TokenNameCOMMENT_JAVADOC	 Get the value of a property, without using the default properties. This can be used to test if a property has been explicitly set by the stylesheet or user. * NEEDSDOC @param qnameString * @return The value of the property, or null if not found. * @throws IllegalArgumentException If the property is not supported, and is not namespaced. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOutputPropertyNoDefault	TokenNameIdentifier	 get Output Property No Default
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qnameString	TokenNameIdentifier	 qname String
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
OutputProperties	TokenNameIdentifier	 Output Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
getOutputFormat	TokenNameIdentifier	 get Output Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
qnameString	TokenNameIdentifier	 qname String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
OutputProperties	TokenNameIdentifier	 Output Properties
.	TokenNameDOT	
isLegalPropertyKey	TokenNameIdentifier	 is Legal Property Key
(	TokenNameLPAREN	
qnameString	TokenNameIdentifier	 qname String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_OUTPUT_PROPERTY_NOT_RECOGNIZED	TokenNameIdentifier	 ER  OUTPUT  PROPERTY  NOT  RECOGNIZED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
qnameString	TokenNameIdentifier	 qname String
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"output property not recognized: " 	TokenNameCOMMENT_LINE	"output property not recognized: " 
// + qnameString); 	TokenNameCOMMENT_LINE	+ qnameString); 
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is used to set or override the value * of the effective xsl:output attribute values * specified in the stylesheet. * <p> * The recognized standard output properties are: * <ul> * <li>cdata-section-elements * <li>doctype-system * <li>doctype-public * <li>indent * <li>media-type * <li>method * <li>omit-xml-declaration * <li>standalone * <li>version * </ul> * <p> * For example: * <pre> * tran.setOutputProperty("standalone", "yes"); * </pre> * <p> * In the case of the cdata-section-elements property, * the value should be a whitespace separated list of * element names. The element name is the local name * of the element, if it is in no namespace, or, the URI * in braces followed immediately by the local name * if the element is in that namespace. For example: * <pre> * tran.setOutputProperty( * "cdata-section-elements", * "elem1 {http://example.uri}elem2 elem3"); * </pre> * <p> * The recognized Xalan extension elements are: * <ul> * <li>content-handler * <li>entities * <li>indent-amount * <li>line-separator * <li>omit-meta-tag * <li>use-url-escaping * </ul> * <p> * These must be in the extension namespace of * "http://xml.apache.org/xalan". This is accomplished * by putting the namespace URI in braces before the * property name, for example: * <pre> * tran.setOutputProperty( * "{http://xml.apache.org/xalan}line-separator" , * "\n"); * </pre> * * @param name The property name. * @param value The requested value for the property. * @throws IllegalArgumentException if the property name is not legal. */	TokenNameCOMMENT_JAVADOC	 This method is used to set or override the value of the effective xsl:output attribute values specified in the stylesheet. <p> The recognized standard output properties are: <ul> <li>cdata-section-elements <li>doctype-system <li>doctype-public <li>indent <li>media-type <li>method <li>omit-xml-declaration <li>standalone <li>version </ul> <p> For example: <pre> tran.setOutputProperty("standalone", "yes"); </pre> <p> In the case of the cdata-section-elements property, the value should be a whitespace separated list of element names. The element name is the local name of the element, if it is in no namespace, or, the URI in braces followed immediately by the local name if the element is in that namespace. For example: <pre> tran.setOutputProperty( "cdata-section-elements", "elem1 {http://example.uri}elem2 elem3"); </pre> <p> The recognized Xalan extension elements are: <ul> <li>content-handler <li>entities <li>indent-amount <li>line-separator <li>omit-meta-tag <li>use-url-escaping </ul> <p> These must be in the extension namespace of "http://xml.apache.org/xalan". This is accomplished by putting the namespace URI in braces before the property name, for example: <pre> tran.setOutputProperty( "{http://xml.apache.org/xalan}line-separator" , "\n"); </pre> * @param name The property name. @param value The requested value for the property. @throws IllegalArgumentException if the property name is not legal. 
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
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
m_reentryGuard	TokenNameIdentifier	 m reentry Guard
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the output format that was set by the user, otherwise get the 	TokenNameCOMMENT_LINE	Get the output format that was set by the user, otherwise get the 
// output format from the stylesheet. 	TokenNameCOMMENT_LINE	output format from the stylesheet. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_outputFormat	TokenNameIdentifier	 m output Format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputFormat	TokenNameIdentifier	 m output Format
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OutputProperties	TokenNameIdentifier	 Output Properties
)	TokenNameRPAREN	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getOutputComposed	TokenNameIdentifier	 get Output Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
OutputProperties	TokenNameIdentifier	 Output Properties
.	TokenNameDOT	
isLegalPropertyKey	TokenNameIdentifier	 is Legal Property Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_OUTPUT_PROPERTY_NOT_RECOGNIZED	TokenNameIdentifier	 ER  OUTPUT  PROPERTY  NOT  RECOGNIZED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"output property not recognized: " 	TokenNameCOMMENT_LINE	"output property not recognized: " 
//+ name); 	TokenNameCOMMENT_LINE	+ name); 
m_outputFormat	TokenNameIdentifier	 m output Format
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the output properties for the transformation. These * properties will override properties set in the templates * with xsl:output. * * <p>If argument to this function is null, any properties * previously set will be removed.</p> * * @param oformat A set of output properties that will be * used to override any of the same properties in effect * for the transformation. * * @see javax.xml.transform.OutputKeys * @see java.util.Properties * * @throws IllegalArgumentException if any of the argument keys are not * recognized and are not namespace qualified. */	TokenNameCOMMENT_JAVADOC	 Set the output properties for the transformation. These properties will override properties set in the templates with xsl:output. * <p>If argument to this function is null, any properties previously set will be removed.</p> * @param oformat A set of output properties that will be used to override any of the same properties in effect for the transformation. * @see javax.xml.transform.OutputKeys @see java.util.Properties * @throws IllegalArgumentException if any of the argument keys are not recognized and are not namespace qualified. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputProperties	TokenNameIdentifier	 set Output Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
oformat	TokenNameIdentifier	 oformat
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
m_reentryGuard	TokenNameIdentifier	 m reentry Guard
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
oformat	TokenNameIdentifier	 oformat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// See if an *explicit* method was set. 	TokenNameCOMMENT_LINE	See if an *explicit* method was set. 
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
oformat	TokenNameIdentifier	 oformat
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
m_outputFormat	TokenNameIdentifier	 m output Format
=	TokenNameEQUAL	
new	TokenNamenew	
OutputProperties	TokenNameIdentifier	 Output Properties
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_outputFormat	TokenNameIdentifier	 m output Format
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_outputFormat	TokenNameIdentifier	 m output Format
=	TokenNameEQUAL	
new	TokenNamenew	
OutputProperties	TokenNameIdentifier	 Output Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputFormat	TokenNameIdentifier	 m output Format
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
oformat	TokenNameIdentifier	 oformat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// copyFrom does not set properties that have been already set, so 	TokenNameCOMMENT_LINE	copyFrom does not set properties that have been already set, so 
// this must be called after, which is a bit in the reverse from 	TokenNameCOMMENT_LINE	this must be called after, which is a bit in the reverse from 
// what one might think. 	TokenNameCOMMENT_LINE	what one might think. 
m_outputFormat	TokenNameIdentifier	 m output Format
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
.	TokenNameDOT	
getOutputProperties	TokenNameIdentifier	 get Output Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// if oformat is null JAXP says that any props previously set are removed 	TokenNameCOMMENT_LINE	if oformat is null JAXP says that any props previously set are removed 
// and we are to revert back to those in the templates object (i.e. Stylesheet). 	TokenNameCOMMENT_LINE	and we are to revert back to those in the templates object (i.e. Stylesheet). 
m_outputFormat	TokenNameIdentifier	 m output Format
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get a copy of the output properties for the transformation. These * properties will override properties set in the templates * with xsl:output. * * <p>Note that mutation of the Properties object returned will not * effect the properties that the transformation contains.</p> * * @return A copy of the set of output properties in effect * for the next transformation. * * NEEDSDOC ($objectName$) @return */	TokenNameCOMMENT_JAVADOC	 Get a copy of the output properties for the transformation. These properties will override properties set in the templates with xsl:output. * <p>Note that mutation of the Properties object returned will not effect the properties that the transformation contains.</p> * @return A copy of the set of output properties in effect for the next transformation. * NEEDSDOC ($objectName$) @return 
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
getOutputFormat	TokenNameIdentifier	 get Output Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a result ContentHandler from a Result object, based * on the current OutputProperties. * * @param outputTarget Where the transform result should go, * should not be null. * * @return A valid ContentHandler that will create the * result tree when it is fed SAX events. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a result ContentHandler from a Result object, based on the current OutputProperties. * @param outputTarget Where the transform result should go, should not be null. * @return A valid ContentHandler that will create the result tree when it is fed SAX events. * @throws TransformerException 
public	TokenNamepublic	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
createSerializationHandler	TokenNameIdentifier	 create Serialization Handler
(	TokenNameLPAREN	
Result	TokenNameIdentifier	 Result
outputTarget	TokenNameIdentifier	 output Target
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
xoh	TokenNameIdentifier	 xoh
=	TokenNameEQUAL	
createSerializationHandler	TokenNameIdentifier	 create Serialization Handler
(	TokenNameLPAREN	
outputTarget	TokenNameIdentifier	 output Target
,	TokenNameCOMMA	
getOutputFormat	TokenNameIdentifier	 get Output Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
xoh	TokenNameIdentifier	 xoh
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a ContentHandler from a Result object and an OutputProperties. * * @param outputTarget Where the transform result should go, * should not be null. * @param format The OutputProperties object that will contain * instructions on how to serialize the output. * * @return A valid ContentHandler that will create the * result tree when it is fed SAX events. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a ContentHandler from a Result object and an OutputProperties. * @param outputTarget Where the transform result should go, should not be null. @param format The OutputProperties object that will contain instructions on how to serialize the output. * @return A valid ContentHandler that will create the result tree when it is fed SAX events. * @throws TransformerException 
public	TokenNamepublic	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
createSerializationHandler	TokenNameIdentifier	 create Serialization Handler
(	TokenNameLPAREN	
Result	TokenNameIdentifier	 Result
outputTarget	TokenNameIdentifier	 output Target
,	TokenNameCOMMA	
OutputProperties	TokenNameIdentifier	 Output Properties
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
xoh	TokenNameIdentifier	 xoh
;	TokenNameSEMICOLON	
// If the Result object contains a Node, then create 	TokenNameCOMMENT_LINE	If the Result object contains a Node, then create 
// a ContentHandler that will add nodes to the input node. 	TokenNameCOMMENT_LINE	a ContentHandler that will add nodes to the input node. 
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
outputNode	TokenNameIdentifier	 output Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
outputTarget	TokenNameIdentifier	 output Target
instanceof	TokenNameinstanceof	
DOMResult	TokenNameIdentifier	 DOM Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputNode	TokenNameIdentifier	 output Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DOMResult	TokenNameIdentifier	 DOM Result
)	TokenNameRPAREN	
outputTarget	TokenNameIdentifier	 output Target
)	TokenNameRPAREN	
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DOMResult	TokenNameIdentifier	 DOM Result
)	TokenNameRPAREN	
outputTarget	TokenNameIdentifier	 output Target
)	TokenNameRPAREN	
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
short	TokenNameshort	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
outputNode	TokenNameIdentifier	 output Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
outputNode	TokenNameIdentifier	 output Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
)	TokenNameRPAREN	
outputNode	TokenNameIdentifier	 output Node
:	TokenNameCOLON	
outputNode	TokenNameIdentifier	 output Node
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isSecureProcessing	TokenNameIdentifier	 is Secure Processing
=	TokenNameEQUAL	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
.	TokenNameDOT	
isSecureProcessing	TokenNameIdentifier	 is Secure Processing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
DOMHelper	TokenNameIdentifier	 DOM Helper
.	TokenNameDOT	
createDocument	TokenNameIdentifier	 create Document
(	TokenNameLPAREN	
isSecureProcessing	TokenNameIdentifier	 is Secure Processing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputNode	TokenNameIdentifier	 output Node
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
outputNode	TokenNameIdentifier	 output Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DOMResult	TokenNameIdentifier	 DOM Result
)	TokenNameRPAREN	
outputTarget	TokenNameIdentifier	 output Target
)	TokenNameRPAREN	
.	TokenNameDOT	
setNode	TokenNameIdentifier	 set Node
(	TokenNameLPAREN	
outputNode	TokenNameIdentifier	 output Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DOMBuilder	TokenNameIdentifier	 DOM Builder
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
DOMBuilder	TokenNameIdentifier	 DOM Builder
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DocumentFragment	TokenNameIdentifier	 Document Fragment
)	TokenNameRPAREN	
outputNode	TokenNameIdentifier	 output Node
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
DOMBuilder	TokenNameIdentifier	 DOM Builder
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
outputNode	TokenNameIdentifier	 output Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextSibling	TokenNameIdentifier	 next Sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
nextSibling	TokenNameIdentifier	 next Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
ENCODING	TokenNameIdentifier	 ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xoh	TokenNameIdentifier	 xoh
=	TokenNameEQUAL	
new	TokenNamenew	
ToXMLSAXHandler	TokenNameIdentifier	 To XMLSAX Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
outputTarget	TokenNameIdentifier	 output Target
instanceof	TokenNameinstanceof	
SAXResult	TokenNameIdentifier	 SAX Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXResult	TokenNameIdentifier	 SAX Result
)	TokenNameRPAREN	
outputTarget	TokenNameIdentifier	 output Target
)	TokenNameRPAREN	
.	TokenNameDOT	
getHandler	TokenNameIdentifier	 get Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"handler can not be null for a SAXResult"	TokenNameStringLiteral	handler can not be null for a SAXResult
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
lexHandler	TokenNameIdentifier	 lex Handler
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
instanceof	TokenNameinstanceof	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
lexHandler	TokenNameIdentifier	 lex Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
else	TokenNameelse	
lexHandler	TokenNameIdentifier	 lex Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
ENCODING	TokenNameIdentifier	 ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ToXMLSAXHandler	TokenNameIdentifier	 To XMLSAX Handler
toXMLSAXHandler	TokenNameIdentifier	 to XMLSAX Handler
=	TokenNameEQUAL	
new	TokenNamenew	
ToXMLSAXHandler	TokenNameIdentifier	 To XMLSAX Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
lexHandler	TokenNameIdentifier	 lex Handler
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toXMLSAXHandler	TokenNameIdentifier	 to XMLSAX Handler
.	TokenNameDOT	
setShouldOutputNSAttr	TokenNameIdentifier	 set Should Output NS Attr
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xoh	TokenNameIdentifier	 xoh
=	TokenNameEQUAL	
toXMLSAXHandler	TokenNameIdentifier	 to XMLSAX Handler
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
publicID	TokenNameIdentifier	 public ID
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_PUBLIC	TokenNameIdentifier	 DOCTYPE  PUBLIC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
systemID	TokenNameIdentifier	 system ID
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_SYSTEM	TokenNameIdentifier	 DOCTYPE  SYSTEM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
systemID	TokenNameIdentifier	 system ID
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
xoh	TokenNameIdentifier	 xoh
.	TokenNameDOT	
setDoctypeSystem	TokenNameIdentifier	 set Doctype System
(	TokenNameLPAREN	
systemID	TokenNameIdentifier	 system ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
publicID	TokenNameIdentifier	 public ID
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
xoh	TokenNameIdentifier	 xoh
.	TokenNameDOT	
setDoctypePublic	TokenNameIdentifier	 set Doctype Public
(	TokenNameLPAREN	
publicID	TokenNameIdentifier	 public ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
instanceof	TokenNameinstanceof	
TransformerClient	TokenNameIdentifier	 Transformer Client
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XalanTransformState	TokenNameIdentifier	 Xalan Transform State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
new	TokenNamenew	
XalanTransformState	TokenNameIdentifier	 Xalan Transform State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransformerClient	TokenNameIdentifier	 Transformer Client
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
.	TokenNameDOT	
setTransformState	TokenNameIdentifier	 set Transform State
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ToSAXHandler	TokenNameIdentifier	 To SAX Handler
)	TokenNameRPAREN	
xoh	TokenNameIdentifier	 xoh
)	TokenNameRPAREN	
.	TokenNameDOT	
setTransformState	TokenNameIdentifier	 set Transform State
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Otherwise, create a ContentHandler that will serialize the 	TokenNameCOMMENT_LINE	Otherwise, create a ContentHandler that will serialize the 
// result tree to either a stream or a writer. 	TokenNameCOMMENT_LINE	result tree to either a stream or a writer. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
outputTarget	TokenNameIdentifier	 output Target
instanceof	TokenNameinstanceof	
StreamResult	TokenNameIdentifier	 Stream Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StreamResult	TokenNameIdentifier	 Stream Result
sresult	TokenNameIdentifier	 sresult
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StreamResult	TokenNameIdentifier	 Stream Result
)	TokenNameRPAREN	
outputTarget	TokenNameIdentifier	 output Target
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
)	TokenNameRPAREN	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
.	TokenNameDOT	
getSerializer	TokenNameIdentifier	 get Serializer
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
sresult	TokenNameIdentifier	 sresult
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
sresult	TokenNameIdentifier	 sresult
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
sresult	TokenNameIdentifier	 sresult
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
sresult	TokenNameIdentifier	 sresult
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
sresult	TokenNameIdentifier	 sresult
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fileURL	TokenNameIdentifier	 file URL
=	TokenNameEQUAL	
sresult	TokenNameIdentifier	 sresult
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileURL	TokenNameIdentifier	 file URL
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file:///"	TokenNameStringLiteral	file:///
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileURL	TokenNameIdentifier	 file URL
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fileURL	TokenNameIdentifier	 file URL
=	TokenNameEQUAL	
fileURL	TokenNameIdentifier	 file URL
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fileURL	TokenNameIdentifier	 file URL
=	TokenNameEQUAL	
fileURL	TokenNameIdentifier	 file URL
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fileURL	TokenNameIdentifier	 file URL
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file:/"	TokenNameStringLiteral	file:/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileURL	TokenNameIdentifier	 file URL
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fileURL	TokenNameIdentifier	 file URL
=	TokenNameEQUAL	
fileURL	TokenNameIdentifier	 file URL
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fileURL	TokenNameIdentifier	 file URL
=	TokenNameEQUAL	
fileURL	TokenNameIdentifier	 file URL
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_outputStream	TokenNameIdentifier	 m output Stream
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
fileURL	TokenNameIdentifier	 file URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
m_outputStream	TokenNameIdentifier	 m output Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xoh	TokenNameIdentifier	 xoh
=	TokenNameEQUAL	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier	 ER  NO  OUTPUT  SPECIFIED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"No output specified!"); 	TokenNameCOMMENT_LINE	"No output specified!"); 
// handler = serializer.asContentHandler(); 	TokenNameCOMMENT_LINE	handler = serializer.asContentHandler(); 
// this.setSerializer(serializer); 	TokenNameCOMMENT_LINE	this.setSerializer(serializer); 
xoh	TokenNameIdentifier	 xoh
=	TokenNameEQUAL	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// catch (UnsupportedEncodingException uee) 	TokenNameCOMMENT_LINE	catch (UnsupportedEncodingException uee) 
// { 	TokenNameCOMMENT_LINE	{ 
// throw new TransformerException(uee); 	TokenNameCOMMENT_LINE	throw new TransformerException(uee); 
// } 	TokenNameCOMMENT_LINE	} 
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_CANNOT_TRANSFORM_TO_RESULT_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  TO  RESULT  TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
outputTarget	TokenNameIdentifier	 output Target
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can't transform to a Result of type " 	TokenNameCOMMENT_LINE	"Can't transform to a Result of type " 
//+ outputTarget.getClass().getName() 	TokenNameCOMMENT_LINE	+ outputTarget.getClass().getName() 
//+ "!"); 	TokenNameCOMMENT_LINE	+ "!"); 
}	TokenNameRBRACE	
// before we forget, lets make the created handler hold a reference 	TokenNameCOMMENT_LINE	before we forget, lets make the created handler hold a reference 
// to the current TransformImpl object 	TokenNameCOMMENT_LINE	to the current TransformImpl object 
xoh	TokenNameIdentifier	 xoh
.	TokenNameDOT	
setTransformer	TokenNameIdentifier	 set Transformer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SourceLocator	TokenNameIdentifier	 Source Locator
srcLocator	TokenNameIdentifier	 src Locator
=	TokenNameEQUAL	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xoh	TokenNameIdentifier	 xoh
.	TokenNameDOT	
setSourceLocator	TokenNameIdentifier	 set Source Locator
(	TokenNameLPAREN	
srcLocator	TokenNameIdentifier	 src Locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
xoh	TokenNameIdentifier	 xoh
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process the source tree to the output result. * @param xmlSource The input for the source tree. * @param outputTarget The output source target. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Process the source tree to the output result. @param xmlSource The input for the source tree. @param outputTarget The output source target. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
xmlSource	TokenNameIdentifier	 xml Source
,	TokenNameCOMMA	
Result	TokenNameIdentifier	 Result
outputTarget	TokenNameIdentifier	 output Target
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
xmlSource	TokenNameIdentifier	 xml Source
,	TokenNameCOMMA	
outputTarget	TokenNameIdentifier	 output Target
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process the source tree to the output result. * @param xmlSource The input for the source tree. * @param outputTarget The output source target. * @param shouldRelease Flag indicating whether to release DTMManager. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Process the source tree to the output result. @param xmlSource The input for the source tree. @param outputTarget The output source target. @param shouldRelease Flag indicating whether to release DTMManager. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
xmlSource	TokenNameIdentifier	 xml Source
,	TokenNameCOMMA	
Result	TokenNameIdentifier	 Result
outputTarget	TokenNameIdentifier	 output Target
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldRelease	TokenNameIdentifier	 should Release
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
m_reentryGuard	TokenNameIdentifier	 m reentry Guard
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
xoh	TokenNameIdentifier	 xoh
=	TokenNameEQUAL	
createSerializationHandler	TokenNameIdentifier	 create Serialization Handler
(	TokenNameLPAREN	
outputTarget	TokenNameIdentifier	 output Target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setSerializationHandler	TokenNameIdentifier	 set Serialization Handler
(	TokenNameLPAREN	
xoh	TokenNameIdentifier	 xoh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputTarget	TokenNameIdentifier	 m output Target
=	TokenNameEQUAL	
outputTarget	TokenNameIdentifier	 output Target
;	TokenNameSEMICOLON	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
xmlSource	TokenNameIdentifier	 xml Source
,	TokenNameCOMMA	
shouldRelease	TokenNameIdentifier	 should Release
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Process the source node to the output result, if the * processor supports the "http://xml.org/trax/features/dom/input" * feature. * %REVIEW% Do we need a Node version of this? * @param node The input source node, which can be any valid DTM node. * @param outputTarget The output source target. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Process the source node to the output result, if the processor supports the "http://xml.org/trax/features/dom/input" feature. %REVIEW% Do we need a Node version of this? @param node The input source node, which can be any valid DTM node. @param outputTarget The output source target. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
transformNode	TokenNameIdentifier	 transform Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
Result	TokenNameIdentifier	 Result
outputTarget	TokenNameIdentifier	 output Target
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
xoh	TokenNameIdentifier	 xoh
=	TokenNameEQUAL	
createSerializationHandler	TokenNameIdentifier	 create Serialization Handler
(	TokenNameLPAREN	
outputTarget	TokenNameIdentifier	 output Target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setSerializationHandler	TokenNameIdentifier	 set Serialization Handler
(	TokenNameLPAREN	
xoh	TokenNameIdentifier	 xoh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputTarget	TokenNameIdentifier	 m output Target
=	TokenNameEQUAL	
outputTarget	TokenNameIdentifier	 output Target
;	TokenNameSEMICOLON	
transformNode	TokenNameIdentifier	 transform Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process the source node to the output result, if the * processor supports the "http://xml.org/trax/features/dom/input" * feature. * %REVIEW% Do we need a Node version of this? * @param node The input source node, which can be any valid DTM node. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Process the source node to the output result, if the processor supports the "http://xml.org/trax/features/dom/input" feature. %REVIEW% Do we need a Node version of this? @param node The input source node, which can be any valid DTM node. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
transformNode	TokenNameIdentifier	 transform Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
//dml 	TokenNameCOMMENT_LINE	dml 
setExtensionsTable	TokenNameIdentifier	 set Extensions Table
(	TokenNameLPAREN	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure we're not writing to the same output content handler. 	TokenNameCOMMENT_LINE	Make sure we're not writing to the same output content handler. 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_hasBeenReset	TokenNameIdentifier	 m has Been Reset
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
pushGlobalVars	TokenNameIdentifier	 push Global Vars
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ========== 	TokenNameCOMMENT_LINE	========== 
// Give the top-level templates a chance to pass information into 	TokenNameCOMMENT_LINE	Give the top-level templates a chance to pass information into 
// the context (this is mainly for setting up tables for extensions). 	TokenNameCOMMENT_LINE	the context (this is mainly for setting up tables for extensions). 
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
stylesheet	TokenNameIdentifier	 stylesheet
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
getGlobalImportCount	TokenNameIdentifier	 get Global Import Count
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
StylesheetComposed	TokenNameIdentifier	 Stylesheet Composed
imported	TokenNameIdentifier	 imported
=	TokenNameEQUAL	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
getGlobalImport	TokenNameIdentifier	 get Global Import
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
includedCount	TokenNameIdentifier	 included Count
=	TokenNameEQUAL	
imported	TokenNameIdentifier	 imported
.	TokenNameDOT	
getIncludeCountComposed	TokenNameIdentifier	 get Include Count Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
includedCount	TokenNameIdentifier	 included Count
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stylesheet	TokenNameIdentifier	 Stylesheet
included	TokenNameIdentifier	 included
=	TokenNameEQUAL	
imported	TokenNameIdentifier	 imported
.	TokenNameDOT	
getIncludeComposed	TokenNameIdentifier	 get Include Composed
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
runtimeInit	TokenNameIdentifier	 runtime Init
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getFirstChildElem	TokenNameIdentifier	 get First Child Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSiblingElem	TokenNameIdentifier	 get Next Sibling Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
runtimeInit	TokenNameIdentifier	 runtime Init
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// =========== 	TokenNameCOMMENT_LINE	=========== 
// System.out.println("Calling applyTemplateToNode - "+Thread.currentThread().getName()); 	TokenNameCOMMENT_LINE	System.out.println("Calling applyTemplateToNode - "+Thread.currentThread().getName()); 
DTMIterator	TokenNameIdentifier	 DTM Iterator
dtmIter	TokenNameIdentifier	 dtm Iter
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
axes	TokenNameIdentifier	 axes
.	TokenNameDOT	
SelfIteratorNoPredicate	TokenNameIdentifier	 Self Iterator No Predicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtmIter	TokenNameIdentifier	 dtm Iter
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushContextNodeList	TokenNameIdentifier	 push Context Node List
(	TokenNameLPAREN	
dtmIter	TokenNameIdentifier	 dtm Iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
applyTemplateToNode	TokenNameIdentifier	 apply Template To Node
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popContextNodeList	TokenNameIdentifier	 pop Context Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// m_stylesheetRoot.getStartRule().execute(this); 	TokenNameCOMMENT_LINE	m_stylesheetRoot.getStartRule().execute(this); 
// System.out.println("Done with applyTemplateToNode - "+Thread.currentThread().getName()); 	TokenNameCOMMENT_LINE	System.out.println("Done with applyTemplateToNode - "+Thread.currentThread().getName()); 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println(Thread.currentThread().getName()+" threw an exception! " 	TokenNameCOMMENT_LINE	System.out.println(Thread.currentThread().getName()+" threw an exception! " 
// +se.getMessage()); 	TokenNameCOMMENT_LINE	+se.getMessage()); 
// If an exception was thrown, we need to make sure that any waiting 	TokenNameCOMMENT_LINE	If an exception was thrown, we need to make sure that any waiting 
// handlers can terminate, which I guess is best done by sending 	TokenNameCOMMENT_LINE	handlers can terminate, which I guess is best done by sending 
// an endDocument. 	TokenNameCOMMENT_LINE	an endDocument. 
// SAXSourceLocator 	TokenNameCOMMENT_LINE	SAXSourceLocator 
while	TokenNamewhile	
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
)	TokenNameRPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
se	TokenNameIdentifier	 se
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
)	TokenNameRPAREN	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
)	TokenNameRPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
instanceof	TokenNameinstanceof	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
sl	TokenNameIdentifier	 sl
=	TokenNameEQUAL	
new	TokenNamenew	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sl	TokenNameIdentifier	 sl
,	TokenNameCOMMA	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
instanceof	TokenNameinstanceof	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_errorHandler	TokenNameIdentifier	 m error Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_errorHandler	TokenNameIdentifier	 m error Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
)	TokenNameRPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
,	TokenNameCOMMA	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_errorHandler	TokenNameIdentifier	 m error Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get a SAX2 ContentHandler for the input. * * @return A valid ContentHandler, which should never be null, as * long as getFeature("http://xml.org/trax/features/sax/input") * returns true. */	TokenNameCOMMENT_JAVADOC	 Get a SAX2 ContentHandler for the input. * @return A valid ContentHandler, which should never be null, as long as getFeature("http://xml.org/trax/features/sax/input") returns true. 
public	TokenNamepublic	
ContentHandler	TokenNameIdentifier	 Content Handler
getInputContentHandler	TokenNameIdentifier	 get Input Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getInputContentHandler	TokenNameIdentifier	 get Input Content Handler
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a SAX2 ContentHandler for the input. * * @param doDocFrag true if a DocumentFragment should be created as * the root, rather than a Document. * * @return A valid ContentHandler, which should never be null, as * long as getFeature("http://xml.org/trax/features/sax/input") * returns true. */	TokenNameCOMMENT_JAVADOC	 Get a SAX2 ContentHandler for the input. * @param doDocFrag true if a DocumentFragment should be created as the root, rather than a Document. * @return A valid ContentHandler, which should never be null, as long as getFeature("http://xml.org/trax/features/sax/input") returns true. 
public	TokenNamepublic	
ContentHandler	TokenNameIdentifier	 Content Handler
getInputContentHandler	TokenNameIdentifier	 get Input Content Handler
(	TokenNameLPAREN	
boolean	TokenNameboolean	
doDocFrag	TokenNameIdentifier	 do Doc Frag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_inputContentHandler	TokenNameIdentifier	 m input Content Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if(null == m_urlOfSource && null != m_stylesheetRoot) 	TokenNameCOMMENT_LINE	if(null == m_urlOfSource && null != m_stylesheetRoot) 
// m_urlOfSource = m_stylesheetRoot.getBaseIdentifier(); 	TokenNameCOMMENT_LINE	m_urlOfSource = m_stylesheetRoot.getBaseIdentifier(); 
m_inputContentHandler	TokenNameIdentifier	 m input Content Handler
=	TokenNameEQUAL	
new	TokenNamenew	
TransformerHandlerImpl	TokenNameIdentifier	 Transformer Handler Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
doDocFrag	TokenNameIdentifier	 do Doc Frag
,	TokenNameCOMMA	
m_urlOfSource	TokenNameIdentifier	 m url Of Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_inputContentHandler	TokenNameIdentifier	 m input Content Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a SAX2 DeclHandler for the input. * @return A valid DeclHandler, which should never be null, as * long as getFeature("http://xml.org/trax/features/sax/input") * returns true. */	TokenNameCOMMENT_JAVADOC	 Get a SAX2 DeclHandler for the input. @return A valid DeclHandler, which should never be null, as long as getFeature("http://xml.org/trax/features/sax/input") returns true. 
public	TokenNamepublic	
DeclHandler	TokenNameIdentifier	 Decl Handler
getInputDeclHandler	TokenNameIdentifier	 get Input Decl Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_inputContentHandler	TokenNameIdentifier	 m input Content Handler
instanceof	TokenNameinstanceof	
DeclHandler	TokenNameIdentifier	 Decl Handler
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
DeclHandler	TokenNameIdentifier	 Decl Handler
)	TokenNameRPAREN	
m_inputContentHandler	TokenNameIdentifier	 m input Content Handler
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a SAX2 LexicalHandler for the input. * @return A valid LexicalHandler, which should never be null, as * long as getFeature("http://xml.org/trax/features/sax/input") * returns true. */	TokenNameCOMMENT_JAVADOC	 Get a SAX2 LexicalHandler for the input. @return A valid LexicalHandler, which should never be null, as long as getFeature("http://xml.org/trax/features/sax/input") returns true. 
public	TokenNamepublic	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
getInputLexicalHandler	TokenNameIdentifier	 get Input Lexical Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_inputContentHandler	TokenNameIdentifier	 m input Content Handler
instanceof	TokenNameinstanceof	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
m_inputContentHandler	TokenNameIdentifier	 m input Content Handler
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the output properties for the transformation. These * properties will override properties set in the templates * with xsl:output. * * @param oformat A valid OutputProperties object (which will * not be mutated), or null. */	TokenNameCOMMENT_JAVADOC	 Set the output properties for the transformation. These properties will override properties set in the templates with xsl:output. * @param oformat A valid OutputProperties object (which will not be mutated), or null. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
OutputProperties	TokenNameIdentifier	 Output Properties
oformat	TokenNameIdentifier	 oformat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputFormat	TokenNameIdentifier	 m output Format
=	TokenNameEQUAL	
oformat	TokenNameIdentifier	 oformat
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the output properties used for the transformation. * * @return the output format that was set by the user, * otherwise the output format from the stylesheet. */	TokenNameCOMMENT_JAVADOC	 Get the output properties used for the transformation. * @return the output format that was set by the user, otherwise the output format from the stylesheet. 
public	TokenNamepublic	
OutputProperties	TokenNameIdentifier	 Output Properties
getOutputFormat	TokenNameIdentifier	 get Output Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the output format that was set by the user, otherwise get the 	TokenNameCOMMENT_LINE	Get the output format that was set by the user, otherwise get the 
// output format from the stylesheet. 	TokenNameCOMMENT_LINE	output format from the stylesheet. 
OutputProperties	TokenNameIdentifier	 Output Properties
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_outputFormat	TokenNameIdentifier	 m output Format
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getOutputComposed	TokenNameIdentifier	 get Output Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
m_outputFormat	TokenNameIdentifier	 m output Format
;	TokenNameSEMICOLON	
return	TokenNamereturn	
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a parameter for the templates. * * @param name The name of the parameter. * @param namespace The namespace of the parameter. * @param value The value object. This can be any valid Java object * -- it's up to the processor to provide the proper * coersion to the object, or simply pass it on for use * in extensions. */	TokenNameCOMMENT_JAVADOC	 Set a parameter for the templates. * @param name The name of the parameter. @param namespace The namespace of the parameter. @param value The value object. This can be any valid Java object -- it's up to the processor to provide the proper coersion to the object, or simply pass it on for use in extensions. 
public	TokenNamepublic	
void	TokenNamevoid	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
VariableStack	TokenNameIdentifier	 Variable Stack
varstack	TokenNameIdentifier	 varstack
=	TokenNameEQUAL	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVarStack	TokenNameIdentifier	 get Var Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
xobject	TokenNameIdentifier	 xobject
=	TokenNameEQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
sroot	TokenNameIdentifier	 sroot
=	TokenNameEQUAL	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
vars	TokenNameIdentifier	 vars
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getVariablesAndParamsComposed	TokenNameIdentifier	 get Variables And Params Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemVariable	TokenNameIdentifier	 Elem Variable
variable	TokenNameIdentifier	 variable
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemVariable	TokenNameIdentifier	 Elem Variable
)	TokenNameRPAREN	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_PARAMVARIABLE	TokenNameIdentifier	 ELEMNAME  PARAMVARIABLE
&&	TokenNameAND_AND	
variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
varstack	TokenNameIdentifier	 varstack
.	TokenNameDOT	
setGlobalVariable	TokenNameIdentifier	 set Global Variable
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
xobject	TokenNameIdentifier	 xobject
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** NEEDSDOC Field m_userParams */	TokenNameCOMMENT_JAVADOC	 NEEDSDOC Field m_userParams 
Vector	TokenNameIdentifier	 Vector
m_userParams	TokenNameIdentifier	 m user Params
;	TokenNameSEMICOLON	
/** * Set a parameter for the transformation. * * @param name The name of the parameter, * which may have a namespace URI. * @param value The value object. This can be any valid Java object * -- it's up to the processor to provide the proper * coersion to the object, or simply pass it on for use * in extensions. */	TokenNameCOMMENT_JAVADOC	 Set a parameter for the transformation. * @param name The name of the parameter, which may have a namespace URI. @param value The value object. This can be any valid Java object -- it's up to the processor to provide the proper coersion to the object, or simply pass it on for use in extensions. 
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
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_INVALID_SET_PARAM_VALUE	TokenNameIdentifier	 ER  INVALID  SET  PARAM  VALUE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
"{}"	TokenNameStringLiteral	{}
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// The first string might be the namespace, or it might be 	TokenNameCOMMENT_LINE	The first string might be the namespace, or it might be 
// the local name, if the namespace is null. 	TokenNameCOMMENT_LINE	the local name, if the namespace is null. 
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_userParams	TokenNameIdentifier	 m user Params
)	TokenNameRPAREN	
m_userParams	TokenNameIdentifier	 m user Params
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
replaceOrPushUserParam	TokenNameIdentifier	 replace Or Push User Param
(	TokenNameLPAREN	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
replaceOrPushUserParam	TokenNameIdentifier	 replace Or Push User Param
(	TokenNameLPAREN	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
,	TokenNameCOMMA	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
nsee	TokenNameIdentifier	 nsee
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Should throw some sort of an error. 	TokenNameCOMMENT_LINE	Should throw some sort of an error. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * NEEDSDOC Method replaceOrPushUserParam * * * NEEDSDOC @param qname * NEEDSDOC @param xval */	TokenNameCOMMENT_JAVADOC	 NEEDSDOC Method replaceOrPushUserParam * NEEDSDOC @param qname NEEDSDOC @param xval 
private	TokenNameprivate	
void	TokenNamevoid	
replaceOrPushUserParam	TokenNameIdentifier	 replace Or Push User Param
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
XObject	TokenNameIdentifier	 X Object
xval	TokenNameIdentifier	 xval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_userParams	TokenNameIdentifier	 m user Params
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
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arg	TokenNameIdentifier	 Arg
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Arg	TokenNameIdentifier	 Arg
)	TokenNameRPAREN	
m_userParams	TokenNameIdentifier	 m user Params
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_userParams	TokenNameIdentifier	 m user Params
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
new	TokenNamenew	
Arg	TokenNameIdentifier	 Arg
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
xval	TokenNameIdentifier	 xval
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_userParams	TokenNameIdentifier	 m user Params
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
Arg	TokenNameIdentifier	 Arg
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
xval	TokenNameIdentifier	 xval
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a parameter that was explicitly set with setParameter * or setParameters. * * * NEEDSDOC @param name * @return A parameter that has been set with setParameter * or setParameters, * *not* all the xsl:params on the stylesheet (which require * a transformation Source to be evaluated). */	TokenNameCOMMENT_JAVADOC	 Get a parameter that was explicitly set with setParameter or setParameters. * NEEDSDOC @param name @return A parameter that has been set with setParameter or setParameters, *not* all the xsl:params on the stylesheet (which require a transformation Source to be evaluated). 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getParameter	TokenNameIdentifier	 get Parameter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// VariableStack varstack = getXPathContext().getVarStack(); 	TokenNameCOMMENT_LINE	VariableStack varstack = getXPathContext().getVarStack(); 
// The first string might be the namespace, or it might be 	TokenNameCOMMENT_LINE	The first string might be the namespace, or it might be 
// the local name, if the namespace is null. 	TokenNameCOMMENT_LINE	the local name, if the namespace is null. 
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
QName	TokenNameIdentifier	 Q Name
.	TokenNameDOT	
getQNameFromString	TokenNameIdentifier	 get Q Name From String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_userParams	TokenNameIdentifier	 m user Params
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_userParams	TokenNameIdentifier	 m user Params
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
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arg	TokenNameIdentifier	 Arg
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Arg	TokenNameIdentifier	 Arg
)	TokenNameRPAREN	
m_userParams	TokenNameIdentifier	 m user Params
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getVal	TokenNameIdentifier	 get Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
nsee	TokenNameIdentifier	 nsee
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Should throw some sort of an error. 	TokenNameCOMMENT_LINE	Should throw some sort of an error. 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reset parameters that the user specified for the transformation. * Called during transformer.reset() after we have cleared the * variable stack. We need to make sure that user params are * reset so that the transformer object can be reused. */	TokenNameCOMMENT_JAVADOC	 Reset parameters that the user specified for the transformation. Called during transformer.reset() after we have cleared the variable stack. We need to make sure that user params are reset so that the transformer object can be reused. 
private	TokenNameprivate	
void	TokenNamevoid	
resetUserParameters	TokenNameIdentifier	 reset User Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_userParams	TokenNameIdentifier	 m user Params
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_userParams	TokenNameIdentifier	 m user Params
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
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arg	TokenNameIdentifier	 Arg
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Arg	TokenNameIdentifier	 Arg
)	TokenNameRPAREN	
m_userParams	TokenNameIdentifier	 m user Params
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The first string might be the namespace, or it might be 	TokenNameCOMMENT_LINE	The first string might be the namespace, or it might be 
// the local name, if the namespace is null. 	TokenNameCOMMENT_LINE	the local name, if the namespace is null. 
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getLocalPart	TokenNameIdentifier	 get Local Part
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
,	TokenNameCOMMA	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getVal	TokenNameIdentifier	 get Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
nsee	TokenNameIdentifier	 nsee
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Should throw some sort of an error. 	TokenNameCOMMENT_LINE	Should throw some sort of an error. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set a bag of parameters for the transformation. Note that * these will not be additive, they will replace the existing * set of parameters. * * NEEDSDOC @param params */	TokenNameCOMMENT_JAVADOC	 Set a bag of parameters for the transformation. Note that these will not be additive, they will replace the existing set of parameters. * NEEDSDOC @param params 
public	TokenNamepublic	
void	TokenNamevoid	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clearParameters	TokenNameIdentifier	 clear Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
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
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
"{}"	TokenNameStringLiteral	{}
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// The first string might be the namespace, or it might be 	TokenNameCOMMENT_LINE	The first string might be the namespace, or it might be 
// the local name, if the namespace is null. 	TokenNameCOMMENT_LINE	the local name, if the namespace is null. 
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
,	TokenNameCOMMA	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
nsee	TokenNameIdentifier	 nsee
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Should throw some sort of an error. 	TokenNameCOMMENT_LINE	Should throw some sort of an error. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reset the parameters to a null list. */	TokenNameCOMMENT_JAVADOC	 Reset the parameters to a null list. 
public	TokenNamepublic	
void	TokenNamevoid	
clearParameters	TokenNameIdentifier	 clear Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
m_reentryGuard	TokenNameIdentifier	 m reentry Guard
)	TokenNameRPAREN	
{	TokenNameLBRACE	
VariableStack	TokenNameIdentifier	 Variable Stack
varstack	TokenNameIdentifier	 varstack
=	TokenNameEQUAL	
new	TokenNamenew	
VariableStack	TokenNameIdentifier	 Variable Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
setVarStack	TokenNameIdentifier	 set Var Stack
(	TokenNameLPAREN	
varstack	TokenNameIdentifier	 varstack
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_userParams	TokenNameIdentifier	 m user Params
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Internal -- push the global variables from the Stylesheet onto * the context's runtime variable stack. * <p>If we encounter a variable * that is already defined in the variable stack, we ignore it. This * is because the second variable definition will be at a lower import * precedence. Presumably, global"variables at the same import precedence * with the same name will have been caught during the recompose process. * <p>However, if we encounter a parameter that is already defined in the * variable stack, we need to see if this is a parameter whose value was * supplied by a setParameter call. If so, we need to "receive" the one * already in the stack, ignoring this one. If it is just an earlier * xsl:param or xsl:variable definition, we ignore it using the same * reasoning as explained above for the variable. * * @param contextNode The root of the source tree, can't be null. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Internal -- push the global variables from the Stylesheet onto the context's runtime variable stack. <p>If we encounter a variable that is already defined in the variable stack, we ignore it. This is because the second variable definition will be at a lower import precedence. Presumably, global"variables at the same import precedence with the same name will have been caught during the recompose process. <p>However, if we encounter a parameter that is already defined in the variable stack, we need to see if this is a parameter whose value was supplied by a setParameter call. If so, we need to "receive" the one already in the stack, ignoring this one. If it is just an earlier xsl:param or xsl:variable definition, we ignore it using the same reasoning as explained above for the variable. * @param contextNode The root of the source tree, can't be null. * @throws TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
pushGlobalVars	TokenNameIdentifier	 push Global Vars
(	TokenNameLPAREN	
int	TokenNameint	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
m_xcontext	TokenNameIdentifier	 m xcontext
;	TokenNameSEMICOLON	
VariableStack	TokenNameIdentifier	 Variable Stack
vs	TokenNameIdentifier	 vs
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getVarStack	TokenNameIdentifier	 get Var Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
vars	TokenNameIdentifier	 vars
=	TokenNameEQUAL	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
getVariablesAndParamsComposed	TokenNameIdentifier	 get Variables And Params Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vs	TokenNameIdentifier	 vs
.	TokenNameDOT	
link	TokenNameIdentifier	 link
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemVariable	TokenNameIdentifier	 Elem Variable
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemVariable	TokenNameIdentifier	 Elem Variable
)	TokenNameRPAREN	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XObject xobj = v.getValue(this, contextNode); 	TokenNameCOMMENT_LINE	XObject xobj = v.getValue(this, contextNode); 
XObject	TokenNameIdentifier	 X Object
xobj	TokenNameIdentifier	 xobj
=	TokenNameEQUAL	
new	TokenNamenew	
XUnresolvedVariable	TokenNameIdentifier	 X Unresolved Variable
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
vs	TokenNameIdentifier	 vs
.	TokenNameDOT	
getStackFrame	TokenNameIdentifier	 get Stack Frame
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
vs	TokenNameIdentifier	 vs
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
vs	TokenNameIdentifier	 vs
.	TokenNameDOT	
setGlobalVariable	TokenNameIdentifier	 set Global Variable
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
xobj	TokenNameIdentifier	 xobj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set an object that will be used to resolve URIs used in * document(), etc. * @param resolver An object that implements the URIResolver interface, * or null. */	TokenNameCOMMENT_JAVADOC	 Set an object that will be used to resolve URIs used in document(), etc. @param resolver An object that implements the URIResolver interface, or null. 
public	TokenNamepublic	
void	TokenNamevoid	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
URIResolver	TokenNameIdentifier	 URI Resolver
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
m_reentryGuard	TokenNameIdentifier	 m reentry Guard
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
getSourceTreeManager	TokenNameIdentifier	 get Source Tree Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get an object that will be used to resolve URIs used in * document(), etc. * * @return An object that implements the URIResolver interface, * or null. */	TokenNameCOMMENT_JAVADOC	 Get an object that will be used to resolve URIs used in document(), etc. * @return An object that implements the URIResolver interface, or null. 
public	TokenNamepublic	
URIResolver	TokenNameIdentifier	 URI Resolver
getURIResolver	TokenNameIdentifier	 get URI Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
getSourceTreeManager	TokenNameIdentifier	 get Source Tree Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getURIResolver	TokenNameIdentifier	 get URI Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ======== End Transformer Implementation ======== 	TokenNameCOMMENT_LINE	======== End Transformer Implementation ======== 
/** * Set the content event handler. * * NEEDSDOC @param handler * @throws java.lang.NullPointerException If the handler * is null. * @see org.xml.sax.XMLReader#setContentHandler */	TokenNameCOMMENT_JAVADOC	 Set the content event handler. * NEEDSDOC @param handler @throws java.lang.NullPointerException If the handler is null. @see org.xml.sax.XMLReader#setContentHandler 
public	TokenNamepublic	
void	TokenNamevoid	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NULL_CONTENT_HANDLER	TokenNameIdentifier	 ER  NULL  CONTENT  HANDLER
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Null content handler"); 	TokenNameCOMMENT_LINE	"Null content handler"); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_outputContentHandler	TokenNameIdentifier	 m output Content Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ToXMLSAXHandler	TokenNameIdentifier	 To XMLSAX Handler
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
ToXMLSAXHandler	TokenNameIdentifier	 To XMLSAX Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
setTransformer	TokenNameIdentifier	 set Transformer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the content event handler. * * @return The current content handler, or null if none was set. * @see org.xml.sax.XMLReader#getContentHandler */	TokenNameCOMMENT_JAVADOC	 Get the content event handler. * @return The current content handler, or null if none was set. @see org.xml.sax.XMLReader#getContentHandler 
public	TokenNamepublic	
ContentHandler	TokenNameIdentifier	 Content Handler
getContentHandler	TokenNameIdentifier	 get Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_outputContentHandler	TokenNameIdentifier	 m output Content Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a stylesheet element, create a result tree fragment from it's * contents. The fragment will be built within the shared RTF DTM system * used as a variable stack. * @param templateParent The template element that holds the fragment. * @return the NodeHandle for the root node of the resulting RTF. * * @throws TransformerException * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Given a stylesheet element, create a result tree fragment from it's contents. The fragment will be built within the shared RTF DTM system used as a variable stack. @param templateParent The template element that holds the fragment. @return the NodeHandle for the root node of the resulting RTF. * @throws TransformerException @xsl.usage advanced 
public	TokenNamepublic	
int	TokenNameint	
transformToRTF	TokenNameIdentifier	 transform To RTF
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
templateParent	TokenNameIdentifier	 template Parent
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// Retrieve a DTM to contain the RTF. At this writing, this may be a 	TokenNameCOMMENT_LINE	Retrieve a DTM to contain the RTF. At this writing, this may be a 
// multi-document DTM (SAX2RTFDTM). 	TokenNameCOMMENT_LINE	multi-document DTM (SAX2RTFDTM). 
DTM	TokenNameIdentifier	 DTM
dtmFrag	TokenNameIdentifier	 dtm Frag
=	TokenNameEQUAL	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
getRTFDTM	TokenNameIdentifier	 get RTFDTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
transformToRTF	TokenNameIdentifier	 transform To RTF
(	TokenNameLPAREN	
templateParent	TokenNameIdentifier	 template Parent
,	TokenNameCOMMA	
dtmFrag	TokenNameIdentifier	 dtm Frag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a stylesheet element, create a result tree fragment from it's * contents. The fragment will also use the shared DTM system, but will * obtain its space from the global variable pool rather than the dynamic * variable stack. This allows late binding of XUnresolvedVariables without * the risk that their content will be discarded when the variable stack * is popped. * * @param templateParent The template element that holds the fragment. * @return the NodeHandle for the root node of the resulting RTF. * * @throws TransformerException * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Given a stylesheet element, create a result tree fragment from it's contents. The fragment will also use the shared DTM system, but will obtain its space from the global variable pool rather than the dynamic variable stack. This allows late binding of XUnresolvedVariables without the risk that their content will be discarded when the variable stack is popped. * @param templateParent The template element that holds the fragment. @return the NodeHandle for the root node of the resulting RTF. * @throws TransformerException @xsl.usage advanced 
public	TokenNamepublic	
int	TokenNameint	
transformToGlobalRTF	TokenNameIdentifier	 transform To Global RTF
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
templateParent	TokenNameIdentifier	 template Parent
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// Retrieve a DTM to contain the RTF. At this writing, this may be a 	TokenNameCOMMENT_LINE	Retrieve a DTM to contain the RTF. At this writing, this may be a 
// multi-document DTM (SAX2RTFDTM). 	TokenNameCOMMENT_LINE	multi-document DTM (SAX2RTFDTM). 
DTM	TokenNameIdentifier	 DTM
dtmFrag	TokenNameIdentifier	 dtm Frag
=	TokenNameEQUAL	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
getGlobalRTFDTM	TokenNameIdentifier	 get Global RTFDTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
transformToRTF	TokenNameIdentifier	 transform To RTF
(	TokenNameLPAREN	
templateParent	TokenNameIdentifier	 template Parent
,	TokenNameCOMMA	
dtmFrag	TokenNameIdentifier	 dtm Frag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a stylesheet element, create a result tree fragment from it's * contents. * @param templateParent The template element that holds the fragment. * @param dtmFrag The DTM to write the RTF into * @return the NodeHandle for the root node of the resulting RTF. * * @throws TransformerException * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Given a stylesheet element, create a result tree fragment from it's contents. @param templateParent The template element that holds the fragment. @param dtmFrag The DTM to write the RTF into @return the NodeHandle for the root node of the resulting RTF. * @throws TransformerException @xsl.usage advanced 
private	TokenNameprivate	
int	TokenNameint	
transformToRTF	TokenNameIdentifier	 transform To RTF
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
templateParent	TokenNameIdentifier	 template Parent
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
dtmFrag	TokenNameIdentifier	 dtm Frag
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
m_xcontext	TokenNameIdentifier	 m xcontext
;	TokenNameSEMICOLON	
ContentHandler	TokenNameIdentifier	 Content Handler
rtfHandler	TokenNameIdentifier	 rtf Handler
=	TokenNameEQUAL	
dtmFrag	TokenNameIdentifier	 dtm Frag
.	TokenNameDOT	
getContentHandler	TokenNameIdentifier	 get Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Obtain the ResultTreeFrag's root node. 	TokenNameCOMMENT_LINE	Obtain the ResultTreeFrag's root node. 
// NOTE: In SAX2RTFDTM, this value isn't available until after 	TokenNameCOMMENT_LINE	NOTE: In SAX2RTFDTM, this value isn't available until after 
// the startDocument has been issued, so assignment has been moved 	TokenNameCOMMENT_LINE	the startDocument has been issued, so assignment has been moved 
// down a bit in the code. 	TokenNameCOMMENT_LINE	down a bit in the code. 
int	TokenNameint	
resultFragment	TokenNameIdentifier	 result Fragment
;	TokenNameSEMICOLON	
// not yet reliably = dtmFrag.getDocument(); 	TokenNameCOMMENT_LINE	not yet reliably = dtmFrag.getDocument(); 
// Save the current result tree handler. 	TokenNameCOMMENT_LINE	Save the current result tree handler. 
SerializationHandler	TokenNameIdentifier	 Serialization Handler
savedRTreeHandler	TokenNameIdentifier	 saved R Tree Handler
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
;	TokenNameSEMICOLON	
// And make a new handler for the RTF. 	TokenNameCOMMENT_LINE	And make a new handler for the RTF. 
ToSAXHandler	TokenNameIdentifier	 To SAX Handler
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
ToXMLSAXHandler	TokenNameIdentifier	 To XMLSAX Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
rtfHandler	TokenNameIdentifier	 rtf Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
setTransformer	TokenNameIdentifier	 set Transformer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Replace the old handler (which was already saved) 	TokenNameCOMMENT_LINE	Replace the old handler (which was already saved) 
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
// use local variable for the current handler 	TokenNameCOMMENT_LINE	use local variable for the current handler 
SerializationHandler	TokenNameIdentifier	 Serialization Handler
rth	TokenNameIdentifier	 rth
=	TokenNameEQUAL	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
rth	TokenNameIdentifier	 rth
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// startDocument is "bottlenecked" in RTH. We need it acted upon immediately, 	TokenNameCOMMENT_LINE	startDocument is "bottlenecked" in RTH. We need it acted upon immediately, 
// to set the DTM's state as in-progress, so that if the xsl:variable's body causes 	TokenNameCOMMENT_LINE	to set the DTM's state as in-progress, so that if the xsl:variable's body causes 
// further RTF activity we can keep that from bashing this DTM. 	TokenNameCOMMENT_LINE	further RTF activity we can keep that from bashing this DTM. 
rth	TokenNameIdentifier	 rth
.	TokenNameDOT	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Do the transformation of the child elements. 	TokenNameCOMMENT_LINE	Do the transformation of the child elements. 
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
templateParent	TokenNameIdentifier	 template Parent
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure everything is flushed! 	TokenNameCOMMENT_LINE	Make sure everything is flushed! 
rth	TokenNameIdentifier	 rth
.	TokenNameDOT	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the document ID. May not exist until the RTH has not only 	TokenNameCOMMENT_LINE	Get the document ID. May not exist until the RTH has not only 
// received, but flushed, the startDocument, and may be invalid 	TokenNameCOMMENT_LINE	received, but flushed, the startDocument, and may be invalid 
// again after the document has been closed (still debating that) 	TokenNameCOMMENT_LINE	again after the document has been closed (still debating that) 
// ... so waiting until just before the end seems simplest/safest. 	TokenNameCOMMENT_LINE	... so waiting until just before the end seems simplest/safest. 
resultFragment	TokenNameIdentifier	 result Fragment
=	TokenNameEQUAL	
dtmFrag	TokenNameIdentifier	 dtm Frag
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
rth	TokenNameIdentifier	 rth
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
// Restore the previous result tree handler. 	TokenNameCOMMENT_LINE	Restore the previous result tree handler. 
this	TokenNamethis	
.	TokenNameDOT	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
=	TokenNameEQUAL	
savedRTreeHandler	TokenNameIdentifier	 saved R Tree Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
resultFragment	TokenNameIdentifier	 result Fragment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the StringWriter pool, so that StringWriter * objects may be reused. * * @return The string writer pool, not null. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Get the StringWriter pool, so that StringWriter objects may be reused. * @return The string writer pool, not null. @xsl.usage internal 
public	TokenNamepublic	
ObjectPool	TokenNameIdentifier	 Object Pool
getStringWriterPool	TokenNameIdentifier	 get String Writer Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_stringWriterObjectPool	TokenNameIdentifier	 m string Writer Object Pool
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Take the contents of a template element, process it, and * convert it to a string. * * @param elem The parent element whose children will be output * as a string. * * @return The stringized result of executing the elements children. * * @throws TransformerException * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Take the contents of a template element, process it, and convert it to a string. * @param elem The parent element whose children will be output as a string. * @return The stringized result of executing the elements children. * @throws TransformerException @xsl.usage advanced 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
transformToString	TokenNameIdentifier	 transform To String
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getFirstChildElem	TokenNameIdentifier	 get First Child Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
hasTextLitOnly	TokenNameIdentifier	 has Text Lit Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
m_optimizer	TokenNameIdentifier	 m optimizer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElemTextLiteral	TokenNameIdentifier	 Elem Text Literal
)	TokenNameRPAREN	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Save the current result tree handler. 	TokenNameCOMMENT_LINE	Save the current result tree handler. 
SerializationHandler	TokenNameIdentifier	 Serialization Handler
savedRTreeHandler	TokenNameIdentifier	 saved R Tree Handler
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
;	TokenNameSEMICOLON	
// Create a Serializer object that will handle the SAX events 	TokenNameCOMMENT_LINE	Create a Serializer object that will handle the SAX events 
// and build the ResultTreeFrag nodes. 	TokenNameCOMMENT_LINE	and build the ResultTreeFrag nodes. 
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StringWriter	TokenNameIdentifier	 String Writer
)	TokenNameRPAREN	
m_stringWriterObjectPool	TokenNameIdentifier	 m string Writer Object Pool
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ToTextStream	TokenNameIdentifier	 To Text Stream
)	TokenNameRPAREN	
m_textResultHandlerObjectPool	TokenNameIdentifier	 m text Result Handler Object Pool
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we didn't get one from the pool, go make a new one 	TokenNameCOMMENT_LINE	if we didn't get one from the pool, go make a new one 
Serializer	TokenNameIdentifier	 Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
.	TokenNameDOT	
getSerializer	TokenNameIdentifier	 get Serializer
(	TokenNameLPAREN	
m_textformat	TokenNameIdentifier	 m textformat
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
)	TokenNameRPAREN	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
.	TokenNameDOT	
setTransformer	TokenNameIdentifier	 set Transformer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
.	TokenNameDOT	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
sw	TokenNameIdentifier	 sw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
/* Don't call startDocument, the SerializationHandler will * generate its own internal startDocument call anyways */	TokenNameCOMMENT_BLOCK	 Don't call startDocument, the SerializationHandler will generate its own internal startDocument call anyways 
// this.m_serializationHandler.startDocument(); 	TokenNameCOMMENT_LINE	this.m_serializationHandler.startDocument(); 
// Do the transformation of the child elements. 	TokenNameCOMMENT_LINE	Do the transformation of the child elements. 
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
sw	TokenNameIdentifier	 sw
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
m_stringWriterObjectPool	TokenNameIdentifier	 m string Writer Object Pool
.	TokenNameDOT	
freeInstance	TokenNameIdentifier	 free Instance
(	TokenNameLPAREN	
sw	TokenNameIdentifier	 sw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_textResultHandlerObjectPool	TokenNameIdentifier	 m text Result Handler Object Pool
.	TokenNameDOT	
freeInstance	TokenNameIdentifier	 free Instance
(	TokenNameLPAREN	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Restore the previous result tree handler. 	TokenNameCOMMENT_LINE	Restore the previous result tree handler. 
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
=	TokenNameEQUAL	
savedRTreeHandler	TokenNameIdentifier	 saved R Tree Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an element and mode, find the corresponding * template and process the contents. * * @param xslInstruction The calling element. * @param template The template to use if xsl:for-each, current template for apply-imports, or null. * @param child The source context node. * @throws TransformerException * @return true if applied a template, false if not. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Given an element and mode, find the corresponding template and process the contents. * @param xslInstruction The calling element. @param template The template to use if xsl:for-each, current template for apply-imports, or null. @param child The source context node. @throws TransformerException @return true if applied a template, false if not. @xsl.usage advanced 
public	TokenNamepublic	
boolean	TokenNameboolean	
applyTemplateToNode	TokenNameIdentifier	 apply Template To Node
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
xslInstruction	TokenNameIdentifier	 xsl Instruction
,	TokenNameCOMMA	
// xsl:apply-templates or xsl:for-each 	TokenNameCOMMENT_LINE	xsl:apply-templates or xsl:for-each 
ElemTemplate	TokenNameIdentifier	 Elem Template
template	TokenNameIdentifier	 template
,	TokenNameCOMMA	
int	TokenNameint	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isDefaultTextRule	TokenNameIdentifier	 is Default Text Rule
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isApplyImports	TokenNameIdentifier	 is Apply Imports
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
isApplyImports	TokenNameIdentifier	 is Apply Imports
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xslInstruction	TokenNameIdentifier	 xsl Instruction
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
false	TokenNamefalse	
:	TokenNameCOLON	
xslInstruction	TokenNameIdentifier	 xsl Instruction
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_APPLY_IMPORTS	TokenNameIdentifier	 ELEMNAME  APPLY  IMPORTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
template	TokenNameIdentifier	 template
||	TokenNameOR_OR	
isApplyImports	TokenNameIdentifier	 is Apply Imports
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
maxImportLevel	TokenNameIdentifier	 max Import Level
,	TokenNameCOMMA	
endImportLevel	TokenNameIdentifier	 end Import Level
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isApplyImports	TokenNameIdentifier	 is Apply Imports
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxImportLevel	TokenNameIdentifier	 max Import Level
=	TokenNameEQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getStylesheetComposed	TokenNameIdentifier	 get Stylesheet Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getImportCountComposed	TokenNameIdentifier	 get Import Count Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
endImportLevel	TokenNameIdentifier	 end Import Level
=	TokenNameEQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getStylesheetComposed	TokenNameIdentifier	 get Stylesheet Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getEndImportCountComposed	TokenNameIdentifier	 get End Import Count Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
maxImportLevel	TokenNameIdentifier	 max Import Level
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If we're trying an xsl:apply-imports at the top level (ie there are no 	TokenNameCOMMENT_LINE	If we're trying an xsl:apply-imports at the top level (ie there are no 
// imported stylesheets), we need to indicate that there is no matching template. 	TokenNameCOMMENT_LINE	imported stylesheets), we need to indicate that there is no matching template. 
// The above logic will calculate a maxImportLevel of -1 which indicates 	TokenNameCOMMENT_LINE	The above logic will calculate a maxImportLevel of -1 which indicates 
// that we should find any template. This is because a value of -1 for 	TokenNameCOMMENT_LINE	that we should find any template. This is because a value of -1 for 
// maxImportLevel has a special meaning. But we don't want that. 	TokenNameCOMMENT_LINE	maxImportLevel has a special meaning. But we don't want that. 
// We want to match -no- templates. See bugzilla bug 1170. 	TokenNameCOMMENT_LINE	We want to match -no- templates. See bugzilla bug 1170. 
if	TokenNameif	
(	TokenNameLPAREN	
isApplyImports	TokenNameIdentifier	 is Apply Imports
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
maxImportLevel	TokenNameIdentifier	 max Import Level
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Find the XSL template that is the best match for the 	TokenNameCOMMENT_LINE	Find the XSL template that is the best match for the 
// element. 	TokenNameCOMMENT_LINE	element. 
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
m_xcontext	TokenNameIdentifier	 m xcontext
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushNamespaceContext	TokenNameIdentifier	 push Namespace Context
(	TokenNameLPAREN	
xslInstruction	TokenNameIdentifier	 xsl Instruction
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QName	TokenNameIdentifier	 Q Name
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isApplyImports	TokenNameIdentifier	 is Apply Imports
)	TokenNameRPAREN	
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
.	TokenNameDOT	
getTemplateComposed	TokenNameIdentifier	 get Template Composed
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
mode	TokenNameIdentifier	 mode
,	TokenNameCOMMA	
maxImportLevel	TokenNameIdentifier	 max Import Level
,	TokenNameCOMMA	
endImportLevel	TokenNameIdentifier	 end Import Level
,	TokenNameCOMMA	
m_quietConflictWarnings	TokenNameIdentifier	 m quiet Conflict Warnings
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
.	TokenNameDOT	
getTemplateComposed	TokenNameIdentifier	 get Template Composed
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
mode	TokenNameIdentifier	 mode
,	TokenNameCOMMA	
m_quietConflictWarnings	TokenNameIdentifier	 m quiet Conflict Warnings
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popNamespaceContext	TokenNameIdentifier	 pop Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If that didn't locate a node, fall back to a default template rule. 	TokenNameCOMMENT_LINE	If that didn't locate a node, fall back to a default template rule. 
// See http://www.w3.org/TR/xslt#built-in-rule. 	TokenNameCOMMENT_LINE	See http://www.w3.org/TR/xslt#built-in-rule. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
.	TokenNameDOT	
getDefaultRule	TokenNameIdentifier	 get Default Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
.	TokenNameDOT	
getDefaultTextRule	TokenNameIdentifier	 get Default Text Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isDefaultTextRule	TokenNameIdentifier	 is Default Text Rule
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
.	TokenNameDOT	
getDefaultRootRule	TokenNameIdentifier	 get Default Root Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// No default rules for processing instructions and the like. 	TokenNameCOMMENT_LINE	No default rules for processing instructions and the like. 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If we are processing the default text rule, then just clone 	TokenNameCOMMENT_LINE	If we are processing the default text rule, then just clone 
// the value directly to the result tree. 	TokenNameCOMMENT_LINE	the value directly to the result tree. 
try	TokenNametry	
{	TokenNameLBRACE	
pushElemTemplateElement	TokenNameIdentifier	 push Elem Template Element
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushPairCurrentMatched	TokenNameIdentifier	 push Pair Current Matched
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fix copy copy29 test. 	TokenNameCOMMENT_LINE	Fix copy copy29 test. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isApplyImports	TokenNameIdentifier	 is Apply Imports
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTMIterator	TokenNameIdentifier	 DTM Iterator
cnl	TokenNameIdentifier	 cnl
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
pushContextNodeList	TokenNameIdentifier	 push Context Node List
(	TokenNameLPAREN	
cnl	TokenNameIdentifier	 cnl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isDefaultTextRule	TokenNameIdentifier	 is Default Text Rule
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
ClonerToResultTree	TokenNameIdentifier	 Cloner To Result Tree
.	TokenNameDOT	
cloneToResultTree	TokenNameIdentifier	 clone To Result Tree
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
nodeType	TokenNameIdentifier	 node Type
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
getResultTreeHandler	TokenNameIdentifier	 get Result Tree Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
getResultTreeHandler	TokenNameIdentifier	 get Result Tree Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Fire a trace event for the template. 	TokenNameCOMMENT_LINE	Fire a trace event for the template. 
if	TokenNameif	
(	TokenNameLPAREN	
m_debug	TokenNameIdentifier	 m debug
)	TokenNameRPAREN	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireTraceEvent	TokenNameIdentifier	 fire Trace Event
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// And execute the child templates. 	TokenNameCOMMENT_LINE	And execute the child templates. 
// 9/11/00: If template has been compiled, hand off to it 	TokenNameCOMMENT_LINE	9/11/00: If template has been compiled, hand off to it 
// since much (most? all?) of the processing has been inlined. 	TokenNameCOMMENT_LINE	since much (most? all?) of the processing has been inlined. 
// (It would be nice if there was a single entry point that 	TokenNameCOMMENT_LINE	(It would be nice if there was a single entry point that 
// worked for both... but the interpretive system works by 	TokenNameCOMMENT_LINE	worked for both... but the interpretive system works by 
// having the Tranformer execute the children, while the 	TokenNameCOMMENT_LINE	having the Tranformer execute the children, while the 
// compiled obviously has to run its own code. It's 	TokenNameCOMMENT_LINE	compiled obviously has to run its own code. It's 
// also unclear that "execute" is really the right name for 	TokenNameCOMMENT_LINE	also unclear that "execute" is really the right name for 
// that entry point.) 	TokenNameCOMMENT_LINE	that entry point.) 
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
setSAXLocator	TokenNameIdentifier	 set SAX Locator
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// m_xcontext.getVarStack().link(); 	TokenNameCOMMENT_LINE	m_xcontext.getVarStack().link(); 
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
getVarStack	TokenNameIdentifier	 get Var Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
link	TokenNameIdentifier	 link
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
m_frameSize	TokenNameIdentifier	 m frame Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_debug	TokenNameIdentifier	 m debug
)	TokenNameRPAREN	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireTraceEndEvent	TokenNameIdentifier	 fire Trace End Event
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isDefaultTextRule	TokenNameIdentifier	 is Default Text Rule
)	TokenNameRPAREN	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
getVarStack	TokenNameIdentifier	 get Var Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
unlink	TokenNameIdentifier	 unlink
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
popCurrentNode	TokenNameIdentifier	 pop Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isApplyImports	TokenNameIdentifier	 is Apply Imports
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
popContextNodeList	TokenNameIdentifier	 pop Context Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
popCurrentMatched	TokenNameIdentifier	 pop Current Matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
popElemTemplateElement	TokenNameIdentifier	 pop Elem Template Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute each of the children of a template element. This method * is only for extension use. * * @param elem The ElemTemplateElement that contains the children * that should execute. * NEEDSDOC @param context * @param mode The current mode. * @param handler The ContentHandler to where the result events * should be fed. * * @throws TransformerException * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Execute each of the children of a template element. This method is only for extension use. * @param elem The ElemTemplateElement that contains the children that should execute. NEEDSDOC @param context @param mode The current mode. @param handler The ContentHandler to where the result events should be fed. * @throws TransformerException @xsl.usage advanced 
public	TokenNamepublic	
void	TokenNamevoid	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
mode	TokenNameIdentifier	 mode
,	TokenNameCOMMA	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
m_xcontext	TokenNameIdentifier	 m xcontext
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
pushMode	TokenNameIdentifier	 push Mode
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMHandleFromNode	TokenNameIdentifier	 get DTM Handle From Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNode	TokenNameIdentifier	 pop Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// I'm not sure where or why this was here. It is clearly in 	TokenNameCOMMENT_LINE	I'm not sure where or why this was here. It is clearly in 
// error though, without a corresponding pushMode(). 	TokenNameCOMMENT_LINE	error though, without a corresponding pushMode(). 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
popMode	TokenNameIdentifier	 pop Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Execute each of the children of a template element. * * @param elem The ElemTemplateElement that contains the children * that should execute. * @param shouldAddAttrs true if xsl:attributes should be executed. * * @throws TransformerException * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Execute each of the children of a template element. * @param elem The ElemTemplateElement that contains the children that should execute. @param shouldAddAttrs true if xsl:attributes should be executed. * @throws TransformerException @xsl.usage advanced 
public	TokenNamepublic	
void	TokenNamevoid	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldAddAttrs	TokenNameIdentifier	 should Add Attrs
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// Does this element have any children? 	TokenNameCOMMENT_LINE	Does this element have any children? 
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getFirstChildElem	TokenNameIdentifier	 get First Child Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
hasTextLitOnly	TokenNameIdentifier	 has Text Lit Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
m_optimizer	TokenNameIdentifier	 m optimizer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElemTextLiteral	TokenNameIdentifier	 Elem Text Literal
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Have to push stuff on for tooling... 	TokenNameCOMMENT_LINE	Have to push stuff on for tooling... 
this	TokenNamethis	
.	TokenNameDOT	
pushElemTemplateElement	TokenNameIdentifier	 push Elem Template Element
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
popElemTemplateElement	TokenNameIdentifier	 pop Elem Template Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// // Check for infinite loops if we have to. 	TokenNameCOMMENT_LINE	// Check for infinite loops if we have to. 
// boolean check = (m_stackGuard.m_recursionLimit > -1); 	TokenNameCOMMENT_LINE	boolean check = (m_stackGuard.m_recursionLimit > -1); 
// 	TokenNameCOMMENT_LINE	 
// if (check) 	TokenNameCOMMENT_LINE	if (check) 
// getStackGuard().push(elem, xctxt.getCurrentNode()); 	TokenNameCOMMENT_LINE	getStackGuard().push(elem, xctxt.getCurrentNode()); 
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
m_xcontext	TokenNameIdentifier	 m xcontext
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushSAXLocatorNull	TokenNameIdentifier	 push SAX Locator Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
currentTemplateElementsTop	TokenNameIdentifier	 current Template Elements Top
=	TokenNameEQUAL	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Loop through the children of the template, calling execute on 	TokenNameCOMMENT_LINE	Loop through the children of the template, calling execute on 
// each of them. 	TokenNameCOMMENT_LINE	each of them. 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getNextSiblingElem	TokenNameIdentifier	 get Next Sibling Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
shouldAddAttrs	TokenNameIdentifier	 should Add Attrs
&&	TokenNameAND_AND	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_ATTRIBUTE	TokenNameIdentifier	 ELEMNAME  ATTRIBUTE
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
setSAXLocator	TokenNameIdentifier	 set SAX Locator
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
currentTemplateElementsTop	TokenNameIdentifier	 current Template Elements Top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
setLocator	TokenNameIdentifier	 set Locator
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
te	TokenNameIdentifier	 te
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popSAXLocator	TokenNameIdentifier	 pop SAX Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check for infinite loops if we have to 	TokenNameCOMMENT_LINE	Check for infinite loops if we have to 
// if (check) 	TokenNameCOMMENT_LINE	if (check) 
// getStackGuard().pop(); 	TokenNameCOMMENT_LINE	getStackGuard().pop(); 
}	TokenNameRBRACE	
/** * Execute each of the children of a template element. * * @param elem The ElemTemplateElement that contains the children * that should execute. * @param handler The ContentHandler to where the result events * should be fed. * * @throws TransformerException * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Execute each of the children of a template element. * @param elem The ElemTemplateElement that contains the children that should execute. @param handler The ContentHandler to where the result events should be fed. * @throws TransformerException @xsl.usage advanced 
public	TokenNamepublic	
void	TokenNamevoid	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
xoh	TokenNameIdentifier	 xoh
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getSerializationHandler	TokenNameIdentifier	 get Serialization Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// These may well not be the same! In this case when calling 	TokenNameCOMMENT_LINE	These may well not be the same! In this case when calling 
// the Redirect extension, it has already set the ContentHandler 	TokenNameCOMMENT_LINE	the Redirect extension, it has already set the ContentHandler 
// in the Transformer. 	TokenNameCOMMENT_LINE	in the Transformer. 
SerializationHandler	TokenNameIdentifier	 Serialization Handler
savedHandler	TokenNameIdentifier	 saved Handler
=	TokenNameEQUAL	
xoh	TokenNameIdentifier	 xoh
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
xoh	TokenNameIdentifier	 xoh
.	TokenNameDOT	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %REVIEW% Make sure current node is being pushed. 	TokenNameCOMMENT_LINE	%REVIEW% Make sure current node is being pushed. 
LexicalHandler	TokenNameIdentifier	 Lexical Handler
lex	TokenNameIdentifier	 lex
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
instanceof	TokenNameinstanceof	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lex	TokenNameIdentifier	 lex
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
=	TokenNameEQUAL	
new	TokenNamenew	
ToXMLSAXHandler	TokenNameIdentifier	 To XMLSAX Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
lex	TokenNameIdentifier	 lex
,	TokenNameCOMMA	
savedHandler	TokenNameIdentifier	 saved Handler
.	TokenNameDOT	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
.	TokenNameDOT	
setTransformer	TokenNameIdentifier	 set Transformer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
=	TokenNameEQUAL	
savedHandler	TokenNameIdentifier	 saved Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the keys for the xsl:sort elements. * Note: Should this go into ElemForEach? * * @param foreach Valid ElemForEach element, not null. * @param sourceNodeContext The current node context in the source tree, * needed to evaluate the Attribute Value Templates. * * @return A Vector of NodeSortKeys, or null. * * @throws TransformerException * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Get the keys for the xsl:sort elements. Note: Should this go into ElemForEach? * @param foreach Valid ElemForEach element, not null. @param sourceNodeContext The current node context in the source tree, needed to evaluate the Attribute Value Templates. * @return A Vector of NodeSortKeys, or null. * @throws TransformerException @xsl.usage advanced 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
processSortKeys	TokenNameIdentifier	 process Sort Keys
(	TokenNameLPAREN	
ElemForEach	TokenNameIdentifier	 Elem For Each
foreach	TokenNameIdentifier	 foreach
,	TokenNameCOMMA	
int	TokenNameint	
sourceNodeContext	TokenNameIdentifier	 source Node Context
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
m_xcontext	TokenNameIdentifier	 m xcontext
;	TokenNameSEMICOLON	
int	TokenNameint	
nElems	TokenNameIdentifier	 n Elems
=	TokenNameEQUAL	
foreach	TokenNameIdentifier	 foreach
.	TokenNameDOT	
getSortElemCount	TokenNameIdentifier	 get Sort Elem Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nElems	TokenNameIdentifier	 n Elems
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// March backwards, collecting the sort keys. 	TokenNameCOMMENT_LINE	March backwards, collecting the sort keys. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nElems	TokenNameIdentifier	 n Elems
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemSort	TokenNameIdentifier	 Elem Sort
sort	TokenNameIdentifier	 sort
=	TokenNameEQUAL	
foreach	TokenNameIdentifier	 foreach
.	TokenNameDOT	
getSortElem	TokenNameIdentifier	 get Sort Elem
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_debug	TokenNameIdentifier	 m debug
)	TokenNameRPAREN	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireTraceEvent	TokenNameIdentifier	 fire Trace Event
(	TokenNameLPAREN	
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
langString	TokenNameIdentifier	 lang String
=	TokenNameEQUAL	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
sort	TokenNameIdentifier	 sort
.	TokenNameDOT	
getLang	TokenNameIdentifier	 get Lang
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
sort	TokenNameIdentifier	 sort
.	TokenNameDOT	
getLang	TokenNameIdentifier	 get Lang
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
sourceNodeContext	TokenNameIdentifier	 source Node Context
,	TokenNameCOMMA	
foreach	TokenNameIdentifier	 foreach
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dataTypeString	TokenNameIdentifier	 data Type String
=	TokenNameEQUAL	
sort	TokenNameIdentifier	 sort
.	TokenNameDOT	
getDataType	TokenNameIdentifier	 get Data Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
sourceNodeContext	TokenNameIdentifier	 source Node Context
,	TokenNameCOMMA	
foreach	TokenNameIdentifier	 foreach
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataTypeString	TokenNameIdentifier	 data Type String
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TODO: Need to write the hooks for QNAME sort data type"	TokenNameStringLiteral	TODO: Need to write the hooks for QNAME sort data type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
dataTypeString	TokenNameIdentifier	 data Type String
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRVAL_DATATYPE_TEXT	TokenNameIdentifier	 ATTRVAL  DATATYPE  TEXT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
dataTypeString	TokenNameIdentifier	 data Type String
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRVAL_DATATYPE_NUMBER	TokenNameIdentifier	 ATTRVAL  DATATYPE  NUMBER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
foreach	TokenNameIdentifier	 foreach
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRNAME_DATATYPE	TokenNameIdentifier	 ATTRNAME  DATATYPE
,	TokenNameCOMMA	
dataTypeString	TokenNameIdentifier	 data Type String
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
treatAsNumbers	TokenNameIdentifier	 treat As Numbers
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
dataTypeString	TokenNameIdentifier	 data Type String
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
dataTypeString	TokenNameIdentifier	 data Type String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRVAL_DATATYPE_NUMBER	TokenNameIdentifier	 ATTRVAL  DATATYPE  NUMBER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
true	TokenNametrue	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
orderString	TokenNameIdentifier	 order String
=	TokenNameEQUAL	
sort	TokenNameIdentifier	 sort
.	TokenNameDOT	
getOrder	TokenNameIdentifier	 get Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
sourceNodeContext	TokenNameIdentifier	 source Node Context
,	TokenNameCOMMA	
foreach	TokenNameIdentifier	 foreach
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
orderString	TokenNameIdentifier	 order String
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRVAL_ORDER_ASCENDING	TokenNameIdentifier	 ATTRVAL  ORDER  ASCENDING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
orderString	TokenNameIdentifier	 order String
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRVAL_ORDER_DESCENDING	TokenNameIdentifier	 ATTRVAL  ORDER  DESCENDING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
foreach	TokenNameIdentifier	 foreach
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRNAME_ORDER	TokenNameIdentifier	 ATTRNAME  ORDER
,	TokenNameCOMMA	
orderString	TokenNameIdentifier	 order String
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
descending	TokenNameIdentifier	 descending
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
orderString	TokenNameIdentifier	 order String
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
orderString	TokenNameIdentifier	 order String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRVAL_ORDER_DESCENDING	TokenNameIdentifier	 ATTRVAL  ORDER  DESCENDING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
true	TokenNametrue	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
AVT	TokenNameIdentifier	 AVT
caseOrder	TokenNameIdentifier	 case Order
=	TokenNameEQUAL	
sort	TokenNameIdentifier	 sort
.	TokenNameDOT	
getCaseOrder	TokenNameIdentifier	 get Case Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
caseOrderUpper	TokenNameIdentifier	 case Order Upper
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
caseOrder	TokenNameIdentifier	 case Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
caseOrderString	TokenNameIdentifier	 case Order String
=	TokenNameEQUAL	
caseOrder	TokenNameIdentifier	 case Order
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
sourceNodeContext	TokenNameIdentifier	 source Node Context
,	TokenNameCOMMA	
foreach	TokenNameIdentifier	 foreach
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
caseOrderString	TokenNameIdentifier	 case Order String
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRVAL_CASEORDER_UPPER	TokenNameIdentifier	 ATTRVAL  CASEORDER  UPPER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
caseOrderString	TokenNameIdentifier	 case Order String
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRVAL_CASEORDER_LOWER	TokenNameIdentifier	 ATTRVAL  CASEORDER  LOWER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
foreach	TokenNameIdentifier	 foreach
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRNAME_CASEORDER	TokenNameIdentifier	 ATTRNAME  CASEORDER
,	TokenNameCOMMA	
caseOrderString	TokenNameIdentifier	 case Order String
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
caseOrderUpper	TokenNameIdentifier	 case Order Upper
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
caseOrderString	TokenNameIdentifier	 case Order String
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
caseOrderString	TokenNameIdentifier	 case Order String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRVAL_CASEORDER_UPPER	TokenNameIdentifier	 ATTRVAL  CASEORDER  UPPER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
true	TokenNametrue	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
caseOrderUpper	TokenNameIdentifier	 case Order Upper
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
NodeSortKey	TokenNameIdentifier	 Node Sort Key
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
sort	TokenNameIdentifier	 sort
.	TokenNameDOT	
getSelect	TokenNameIdentifier	 get Select
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
treatAsNumbers	TokenNameIdentifier	 treat As Numbers
,	TokenNameCOMMA	
descending	TokenNameIdentifier	 descending
,	TokenNameCOMMA	
langString	TokenNameIdentifier	 lang String
,	TokenNameCOMMA	
caseOrderUpper	TokenNameIdentifier	 case Order Upper
,	TokenNameCOMMA	
foreach	TokenNameIdentifier	 foreach
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_debug	TokenNameIdentifier	 m debug
)	TokenNameRPAREN	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireTraceEndEvent	TokenNameIdentifier	 fire Trace End Event
(	TokenNameLPAREN	
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//========================================================== 	TokenNameCOMMENT_LINE	========================================================== 
// SECTION: TransformState implementation 	TokenNameCOMMENT_LINE	SECTION: TransformState implementation 
//========================================================== 	TokenNameCOMMENT_LINE	========================================================== 
/** * Get the stack of ElemTemplateElements. * * @return A copy of stack that contains the xsl element instructions, * the earliest called in index zero, and the latest called in index size()-1. */	TokenNameCOMMENT_JAVADOC	 Get the stack of ElemTemplateElements. * @return A copy of stack that contains the xsl element instructions, the earliest called in index zero, and the latest called in index size()-1. 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getElementCallstack	TokenNameIdentifier	 get Element Callstack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
elems	TokenNameIdentifier	 elems
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nStackSize	TokenNameIdentifier	 n Stack Size
=	TokenNameEQUAL	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
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
nStackSize	TokenNameIdentifier	 n Stack Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elems	TokenNameIdentifier	 elems
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
elems	TokenNameIdentifier	 elems
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the count of how many elements are * active. * @return The number of active elements on * the currentTemplateElements stack. */	TokenNameCOMMENT_JAVADOC	 Get the count of how many elements are active. @return The number of active elements on the currentTemplateElements stack. 
public	TokenNamepublic	
int	TokenNameint	
getCurrentTemplateElementsCount	TokenNameIdentifier	 get Current Template Elements Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the count of how many elements are * active. * @return The number of active elements on * the currentTemplateElements stack. */	TokenNameCOMMENT_JAVADOC	 Get the count of how many elements are active. @return The number of active elements on the currentTemplateElements stack. 
public	TokenNamepublic	
ObjectStack	TokenNameIdentifier	 Object Stack
getCurrentTemplateElements	TokenNameIdentifier	 get Current Template Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push the current template element. * * @param elem The current ElemTemplateElement (may be null, and then * set via setCurrentElement). */	TokenNameCOMMENT_JAVADOC	 Push the current template element. * @param elem The current ElemTemplateElement (may be null, and then set via setCurrentElement). 
public	TokenNamepublic	
void	TokenNamevoid	
pushElemTemplateElement	TokenNameIdentifier	 push Elem Template Element
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the current template element. */	TokenNameCOMMENT_JAVADOC	 Pop the current template element. 
public	TokenNamepublic	
void	TokenNamevoid	
popElemTemplateElement	TokenNameIdentifier	 pop Elem Template Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the top of the current template elements * stack. * * @param e The current ElemTemplateElement about to * be executed. */	TokenNameCOMMENT_JAVADOC	 Set the top of the current template elements stack. * @param e The current ElemTemplateElement about to be executed. 
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentElement	TokenNameIdentifier	 set Current Element
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
.	TokenNameDOT	
setTop	TokenNameIdentifier	 set Top
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves the current ElemTemplateElement that is * being executed. * * @return The current ElemTemplateElement that is executing, * should not normally be null. */	TokenNameCOMMENT_JAVADOC	 Retrieves the current ElemTemplateElement that is being executed. * @return The current ElemTemplateElement that is executing, should not normally be null. 
public	TokenNamepublic	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
getCurrentElement	TokenNameIdentifier	 get Current Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method retrieves the current context node * in the source tree. * * @return The current context node (should never be null?). */	TokenNameCOMMENT_JAVADOC	 This method retrieves the current context node in the source tree. * @return The current context node (should never be null?). 
public	TokenNamepublic	
int	TokenNameint	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the call stack of xsl:template elements. * * @return A copy of stack that contains the xsl:template * (ElemTemplate) instructions, the earliest called in index * zero, and the latest called in index size()-1. */	TokenNameCOMMENT_JAVADOC	 Get the call stack of xsl:template elements. * @return A copy of stack that contains the xsl:template (ElemTemplate) instructions, the earliest called in index zero, and the latest called in index size()-1. 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getTemplateCallstack	TokenNameIdentifier	 get Template Callstack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
elems	TokenNameIdentifier	 elems
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nStackSize	TokenNameIdentifier	 n Stack Size
=	TokenNameEQUAL	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
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
nStackSize	TokenNameIdentifier	 n Stack Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
elem	TokenNameIdentifier	 elem
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEMPLATE	TokenNameIdentifier	 ELEMNAME  TEMPLATE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elems	TokenNameIdentifier	 elems
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
elems	TokenNameIdentifier	 elems
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method retrieves the xsl:template * that is in effect, which may be a matched template * or a named template. * * <p>Please note that the ElemTemplate returned may * be a default template, and thus may not have a template * defined in the stylesheet.</p> * * @return The current xsl:template, should not be null. */	TokenNameCOMMENT_JAVADOC	 This method retrieves the xsl:template that is in effect, which may be a matched template or a named template. * <p>Please note that the ElemTemplate returned may be a default template, and thus may not have a template defined in the stylesheet.</p> * @return The current xsl:template, should not be null. 
public	TokenNamepublic	
ElemTemplate	TokenNameIdentifier	 Elem Template
getCurrentTemplate	TokenNameIdentifier	 get Current Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
getCurrentElement	TokenNameIdentifier	 get Current Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEMPLATE	TokenNameIdentifier	 ELEMNAME  TEMPLATE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ElemTemplate	TokenNameIdentifier	 Elem Template
)	TokenNameRPAREN	
elem	TokenNameIdentifier	 elem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push both the current xsl:template or xsl:for-each onto the * stack, along with the child node that was matched. * (Note: should this only be used for xsl:templates?? -sb) * * @param template xsl:template or xsl:for-each. * @param child The child that was matched. */	TokenNameCOMMENT_JAVADOC	 Push both the current xsl:template or xsl:for-each onto the stack, along with the child node that was matched. (Note: should this only be used for xsl:templates?? -sb) * @param template xsl:template or xsl:for-each. @param child The child that was matched. 
public	TokenNamepublic	
void	TokenNamevoid	
pushPairCurrentMatched	TokenNameIdentifier	 push Pair Current Matched
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
template	TokenNameIdentifier	 template
,	TokenNameCOMMA	
int	TokenNameint	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentMatchTemplates	TokenNameIdentifier	 m current Match Templates
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentMatchedNodes	TokenNameIdentifier	 m current Matched Nodes
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the elements that were pushed via pushPairCurrentMatched. */	TokenNameCOMMENT_JAVADOC	 Pop the elements that were pushed via pushPairCurrentMatched. 
public	TokenNamepublic	
void	TokenNamevoid	
popCurrentMatched	TokenNameIdentifier	 pop Current Matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentMatchTemplates	TokenNameIdentifier	 m current Match Templates
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentMatchedNodes	TokenNameIdentifier	 m current Matched Nodes
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method retrieves the xsl:template * that was matched. Note that this may not be * the same thing as the current template (which * may be from getCurrentElement()), since a named * template may be in effect. * * @return The pushed template that was pushed via pushPairCurrentMatched. */	TokenNameCOMMENT_JAVADOC	 This method retrieves the xsl:template that was matched. Note that this may not be the same thing as the current template (which may be from getCurrentElement()), since a named template may be in effect. * @return The pushed template that was pushed via pushPairCurrentMatched. 
public	TokenNamepublic	
ElemTemplate	TokenNameIdentifier	 Elem Template
getMatchedTemplate	TokenNameIdentifier	 get Matched Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ElemTemplate	TokenNameIdentifier	 Elem Template
)	TokenNameRPAREN	
m_currentMatchTemplates	TokenNameIdentifier	 m current Match Templates
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves the node in the source tree that matched * the template obtained via getMatchedTemplate(). * * @return The matched node that corresponds to the * match attribute of the current xsl:template. */	TokenNameCOMMENT_JAVADOC	 Retrieves the node in the source tree that matched the template obtained via getMatchedTemplate(). * @return The matched node that corresponds to the match attribute of the current xsl:template. 
public	TokenNamepublic	
int	TokenNameint	
getMatchedNode	TokenNameIdentifier	 get Matched Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_currentMatchedNodes	TokenNameIdentifier	 m current Matched Nodes
.	TokenNameDOT	
peepTail	TokenNameIdentifier	 peep Tail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current context node list. * * @return A reset clone of the context node list. */	TokenNameCOMMENT_JAVADOC	 Get the current context node list. * @return A reset clone of the context node list. 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
getContextNodeList	TokenNameIdentifier	 get Context Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
DTMIterator	TokenNameIdentifier	 DTM Iterator
cnl	TokenNameIdentifier	 cnl
=	TokenNameEQUAL	
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
getContextNodeList	TokenNameIdentifier	 get Context Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
cnl	TokenNameIdentifier	 cnl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
cnl	TokenNameIdentifier	 cnl
.	TokenNameDOT	
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should never happen. 	TokenNameCOMMENT_LINE	should never happen. 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the TrAX Transformer object in effect. * * @return This object. */	TokenNameCOMMENT_JAVADOC	 Get the TrAX Transformer object in effect. * @return This object. 
public	TokenNamepublic	
Transformer	TokenNameIdentifier	 Transformer
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//========================================================== 	TokenNameCOMMENT_LINE	========================================================== 
// SECTION: Accessor Functions 	TokenNameCOMMENT_LINE	SECTION: Accessor Functions 
//========================================================== 	TokenNameCOMMENT_LINE	========================================================== 
/** * Set the stylesheet for this processor. If this is set, then the * process calls that take only the input .xml will use * this instead of looking for a stylesheet PI. Also, * setting the stylesheet is needed if you are going * to use the processor as a SAX ContentHandler. * * @param stylesheetRoot A non-null StylesheetRoot object, * or null if you wish to clear the stylesheet reference. */	TokenNameCOMMENT_JAVADOC	 Set the stylesheet for this processor. If this is set, then the process calls that take only the input .xml will use this instead of looking for a stylesheet PI. Also, setting the stylesheet is needed if you are going to use the processor as a SAX ContentHandler. * @param stylesheetRoot A non-null StylesheetRoot object, or null if you wish to clear the stylesheet reference. 
public	TokenNamepublic	
void	TokenNamevoid	
setStylesheet	TokenNameIdentifier	 set Stylesheet
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
stylesheetRoot	TokenNameIdentifier	 stylesheet Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
=	TokenNameEQUAL	
stylesheetRoot	TokenNameIdentifier	 stylesheet Root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current stylesheet for this processor. * * @return The stylesheet that is associated with this * transformer. */	TokenNameCOMMENT_JAVADOC	 Get the current stylesheet for this processor. * @return The stylesheet that is associated with this transformer. 
public	TokenNamepublic	
final	TokenNamefinal	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get quietConflictWarnings property. If the quietConflictWarnings * property is set to true, warnings about pattern conflicts won't be * printed to the diagnostics stream. * * @return True if this transformer should not report * template match conflicts. */	TokenNameCOMMENT_JAVADOC	 Get quietConflictWarnings property. If the quietConflictWarnings property is set to true, warnings about pattern conflicts won't be printed to the diagnostics stream. * @return True if this transformer should not report template match conflicts. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getQuietConflictWarnings	TokenNameIdentifier	 get Quiet Conflict Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_quietConflictWarnings	TokenNameIdentifier	 m quiet Conflict Warnings
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If the quietConflictWarnings property is set to * true, warnings about pattern conflicts won't be * printed to the diagnostics stream. * False by default. * (Currently setting this property will have no effect.) * * @param b true if conflict warnings should be suppressed. */	TokenNameCOMMENT_JAVADOC	 If the quietConflictWarnings property is set to true, warnings about pattern conflicts won't be printed to the diagnostics stream. False by default. (Currently setting this property will have no effect.) * @param b true if conflict warnings should be suppressed. 
public	TokenNamepublic	
void	TokenNamevoid	
setQuietConflictWarnings	TokenNameIdentifier	 set Quiet Conflict Warnings
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_quietConflictWarnings	TokenNameIdentifier	 m quiet Conflict Warnings
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the execution context for XPath. * * @param xcontext A non-null reference to the XPathContext * associated with this transformer. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Set the execution context for XPath. * @param xcontext A non-null reference to the XPathContext associated with this transformer. @xsl.usage internal 
public	TokenNamepublic	
void	TokenNamevoid	
setXPathContext	TokenNameIdentifier	 set X Path Context
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xcontext	TokenNameIdentifier	 xcontext
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_xcontext	TokenNameIdentifier	 m xcontext
=	TokenNameEQUAL	
xcontext	TokenNameIdentifier	 xcontext
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the XPath context associated with this transformer. * * @return The XPathContext reference, never null. */	TokenNameCOMMENT_JAVADOC	 Get the XPath context associated with this transformer. * @return The XPathContext reference, never null. 
public	TokenNamepublic	
final	TokenNamefinal	
XPathContext	TokenNameIdentifier	 X Path Context
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_xcontext	TokenNameIdentifier	 m xcontext
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the object used to guard the stack from * recursion. * * @return The StackGuard object, which should never be null. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Get the object used to guard the stack from recursion. * @return The StackGuard object, which should never be null. @xsl.usage internal 
public	TokenNamepublic	
StackGuard	TokenNameIdentifier	 Stack Guard
getStackGuard	TokenNameIdentifier	 get Stack Guard
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_stackGuard	TokenNameIdentifier	 m stack Guard
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the recursion limit. * Used for infinite loop check. If the value is -1, do not * check for infinite loops. Anyone who wants to enable that * check should change the value of this variable to be the * level of recursion that they want to check. Be careful setting * this variable, if the number is too low, it may report an * infinite loop situation, when there is none. * Post version 1.0.0, we'll make this a runtime feature. * * @return The limit on recursion, or -1 if no check is to be made. */	TokenNameCOMMENT_JAVADOC	 Get the recursion limit. Used for infinite loop check. If the value is -1, do not check for infinite loops. Anyone who wants to enable that check should change the value of this variable to be the level of recursion that they want to check. Be careful setting this variable, if the number is too low, it may report an infinite loop situation, when there is none. Post version 1.0.0, we'll make this a runtime feature. * @return The limit on recursion, or -1 if no check is to be made. 
public	TokenNamepublic	
int	TokenNameint	
getRecursionLimit	TokenNameIdentifier	 get Recursion Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_stackGuard	TokenNameIdentifier	 m stack Guard
.	TokenNameDOT	
getRecursionLimit	TokenNameIdentifier	 get Recursion Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the recursion limit. * Used for infinite loop check. If the value is -1, do not * check for infinite loops. Anyone who wants to enable that * check should change the value of this variable to be the * level of recursion that they want to check. Be careful setting * this variable, if the number is too low, it may report an * infinite loop situation, when there is none. * Post version 1.0.0, we'll make this a runtime feature. * * @param limit A number that represents the limit of recursion, * or -1 if no checking is to be done. */	TokenNameCOMMENT_JAVADOC	 Set the recursion limit. Used for infinite loop check. If the value is -1, do not check for infinite loops. Anyone who wants to enable that check should change the value of this variable to be the level of recursion that they want to check. Be careful setting this variable, if the number is too low, it may report an infinite loop situation, when there is none. Post version 1.0.0, we'll make this a runtime feature. * @param limit A number that represents the limit of recursion, or -1 if no checking is to be done. 
public	TokenNamepublic	
void	TokenNamevoid	
setRecursionLimit	TokenNameIdentifier	 set Recursion Limit
(	TokenNameLPAREN	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_stackGuard	TokenNameIdentifier	 m stack Guard
.	TokenNameDOT	
setRecursionLimit	TokenNameIdentifier	 set Recursion Limit
(	TokenNameLPAREN	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the SerializationHandler object. * * @return The current SerializationHandler, which may not * be the main result tree manager. */	TokenNameCOMMENT_JAVADOC	 Get the SerializationHandler object. * @return The current SerializationHandler, which may not be the main result tree manager. 
public	TokenNamepublic	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
getResultTreeHandler	TokenNameIdentifier	 get Result Tree Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the SerializationHandler object. * * @return The current SerializationHandler, which may not * be the main result tree manager. */	TokenNameCOMMENT_JAVADOC	 Get the SerializationHandler object. * @return The current SerializationHandler, which may not be the main result tree manager. 
public	TokenNamepublic	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
getSerializationHandler	TokenNameIdentifier	 get Serialization Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the KeyManager object. * * @return A reference to the KeyManager object, which should * never be null. */	TokenNameCOMMENT_JAVADOC	 Get the KeyManager object. * @return A reference to the KeyManager object, which should never be null. 
public	TokenNamepublic	
KeyManager	TokenNameIdentifier	 Key Manager
getKeyManager	TokenNameIdentifier	 get Key Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_keyManager	TokenNameIdentifier	 m key Manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check to see if this is a recursive attribute definition. * * @param attrSet A non-null ElemAttributeSet reference. * * @return true if the attribute set is recursive. */	TokenNameCOMMENT_JAVADOC	 Check to see if this is a recursive attribute definition. * @param attrSet A non-null ElemAttributeSet reference. * @return true if the attribute set is recursive. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isRecursiveAttrSet	TokenNameIdentifier	 is Recursive Attr Set
(	TokenNameLPAREN	
ElemAttributeSet	TokenNameIdentifier	 Elem Attribute Set
attrSet	TokenNameIdentifier	 attr Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_attrSetStack	TokenNameIdentifier	 m attr Set Stack
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_attrSetStack	TokenNameIdentifier	 m attr Set Stack
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_attrSetStack	TokenNameIdentifier	 m attr Set Stack
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
m_attrSetStack	TokenNameIdentifier	 m attr Set Stack
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
attrSet	TokenNameIdentifier	 attr Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push an executing attribute set, so we can check for * recursive attribute definitions. * * @param attrSet A non-null ElemAttributeSet reference. */	TokenNameCOMMENT_JAVADOC	 Push an executing attribute set, so we can check for recursive attribute definitions. * @param attrSet A non-null ElemAttributeSet reference. 
public	TokenNamepublic	
void	TokenNamevoid	
pushElemAttributeSet	TokenNameIdentifier	 push Elem Attribute Set
(	TokenNameLPAREN	
ElemAttributeSet	TokenNameIdentifier	 Elem Attribute Set
attrSet	TokenNameIdentifier	 attr Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_attrSetStack	TokenNameIdentifier	 m attr Set Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
attrSet	TokenNameIdentifier	 attr Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the current executing attribute set. */	TokenNameCOMMENT_JAVADOC	 Pop the current executing attribute set. 
public	TokenNamepublic	
void	TokenNamevoid	
popElemAttributeSet	TokenNameIdentifier	 pop Elem Attribute Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_attrSetStack	TokenNameIdentifier	 m attr Set Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the table of counters, for optimized xsl:number support. * * @return The CountersTable, never null. */	TokenNameCOMMENT_JAVADOC	 Get the table of counters, for optimized xsl:number support. * @return The CountersTable, never null. 
public	TokenNamepublic	
CountersTable	TokenNameIdentifier	 Counters Table
getCountersTable	TokenNameIdentifier	 get Counters Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_countersTable	TokenNameIdentifier	 m counters Table
)	TokenNameRPAREN	
m_countersTable	TokenNameIdentifier	 m counters Table
=	TokenNameEQUAL	
new	TokenNamenew	
CountersTable	TokenNameIdentifier	 Counters Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_countersTable	TokenNameIdentifier	 m counters Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the current template rule is null, i.e. if we are * directly within an apply-templates. Used for xsl:apply-imports. * * @return True if the current template rule is null. */	TokenNameCOMMENT_JAVADOC	 Tell if the current template rule is null, i.e. if we are directly within an apply-templates. Used for xsl:apply-imports. * @return True if the current template rule is null. 
public	TokenNamepublic	
boolean	TokenNameboolean	
currentTemplateRuleIsNull	TokenNameIdentifier	 current Template Rule Is Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_currentTemplateRuleIsNull	TokenNameIdentifier	 m current Template Rule Is Null
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
m_currentTemplateRuleIsNull	TokenNameIdentifier	 m current Template Rule Is Null
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push true if the current template rule is null, false * otherwise. * * @param b True if the we are executing an xsl:for-each * (or xsl:call-template?). */	TokenNameCOMMENT_JAVADOC	 Push true if the current template rule is null, false otherwise. * @param b True if the we are executing an xsl:for-each (or xsl:call-template?). 
public	TokenNamepublic	
void	TokenNamevoid	
pushCurrentTemplateRuleIsNull	TokenNameIdentifier	 push Current Template Rule Is Null
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentTemplateRuleIsNull	TokenNameIdentifier	 m current Template Rule Is Null
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push true if the current template rule is null, false * otherwise. */	TokenNameCOMMENT_JAVADOC	 Push true if the current template rule is null, false otherwise. 
public	TokenNamepublic	
void	TokenNamevoid	
popCurrentTemplateRuleIsNull	TokenNameIdentifier	 pop Current Template Rule Is Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentTemplateRuleIsNull	TokenNameIdentifier	 m current Template Rule Is Null
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push a funcion result for the currently active EXSLT * <code>func:function</code>. * * @param val the result of executing an EXSLT * <code>func:result</code> instruction for the current * <code>func:function</code>. */	TokenNameCOMMENT_JAVADOC	 Push a funcion result for the currently active EXSLT <code>func:function</code>. * @param val the result of executing an EXSLT <code>func:result</code> instruction for the current <code>func:function</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
pushCurrentFuncResult	TokenNameIdentifier	 push Current Func Result
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentFuncResult	TokenNameIdentifier	 m current Func Result
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pops the result of the currently active EXSLT <code>func:function</code>. * * @return the value of the <code>func:function</code> */	TokenNameCOMMENT_JAVADOC	 Pops the result of the currently active EXSLT <code>func:function</code>. * @return the value of the <code>func:function</code> 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
popCurrentFuncResult	TokenNameIdentifier	 pop Current Func Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_currentFuncResult	TokenNameIdentifier	 m current Func Result
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines whether an EXSLT <code>func:result</code> instruction has been * executed for the currently active EXSLT <code>func:function</code>. * * @return <code>true</code> if and only if a <code>func:result</code> * instruction has been executed */	TokenNameCOMMENT_JAVADOC	 Determines whether an EXSLT <code>func:result</code> instruction has been executed for the currently active EXSLT <code>func:function</code>. * @return <code>true</code> if and only if a <code>func:result</code> instruction has been executed 
public	TokenNamepublic	
boolean	TokenNameboolean	
currentFuncResultSeen	TokenNameIdentifier	 current Func Result Seen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
m_currentFuncResult	TokenNameIdentifier	 m current Func Result
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
m_currentFuncResult	TokenNameIdentifier	 m current Func Result
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the message manager. * * @return The message manager, never null. */	TokenNameCOMMENT_JAVADOC	 Return the message manager. * @return The message manager, never null. 
public	TokenNamepublic	
MsgMgr	TokenNameIdentifier	 Msg Mgr
getMsgMgr	TokenNameIdentifier	 get Msg Mgr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_msgMgr	TokenNameIdentifier	 m msg Mgr
)	TokenNameRPAREN	
m_msgMgr	TokenNameIdentifier	 m msg Mgr
=	TokenNameEQUAL	
new	TokenNamenew	
MsgMgr	TokenNameIdentifier	 Msg Mgr
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_msgMgr	TokenNameIdentifier	 m msg Mgr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the error event listener. * * @param listener The new error listener. * @throws IllegalArgumentException if */	TokenNameCOMMENT_JAVADOC	 Set the error event listener. * @param listener The new error listener. @throws IllegalArgumentException if 
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
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
m_reentryGuard	TokenNameIdentifier	 m reentry Guard
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NULL_ERROR_HANDLER	TokenNameIdentifier	 ER  NULL  ERROR  HANDLER
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Null error handler"); 	TokenNameCOMMENT_LINE	"Null error handler"); 
m_errorHandler	TokenNameIdentifier	 m error Handler
=	TokenNameEQUAL	
listener	TokenNameIdentifier	 listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the current error event handler. * * @return The current error handler, which should never be null. */	TokenNameCOMMENT_JAVADOC	 Get the current error event handler. * @return The current error handler, which should never be null. 
public	TokenNamepublic	
ErrorListener	TokenNameIdentifier	 Error Listener
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_errorHandler	TokenNameIdentifier	 m error Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an instance of the trace manager for this transformation. * This object can be used to set trace listeners on various * events during the transformation. * * @return A reference to the TraceManager, never null. */	TokenNameCOMMENT_JAVADOC	 Get an instance of the trace manager for this transformation. This object can be used to set trace listeners on various events during the transformation. * @return A reference to the TraceManager, never null. 
public	TokenNamepublic	
TraceManager	TokenNameIdentifier	 Trace Manager
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_traceManager	TokenNameIdentifier	 m trace Manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look up the value of a feature. * * <p>The feature name is any fully-qualified URI. It is * possible for an TransformerFactory to recognize a feature name but * to be unable to return its value; this is especially true * in the case of an adapter for a SAX1 Parser, which has * no way of knowing whether the underlying parser is * validating, for example.</p> * * <h3>Open issues:</h3> * <dl> * <dt><h4>Should getFeature be changed to hasFeature?</h4></dt> * <dd>Keith Visco writes: Should getFeature be changed to hasFeature? * It returns a boolean which indicated whether the "state" * of feature is "true or false". I assume this means whether * or not a feature is supported? I know SAX is using "getFeature", * but to me "hasFeature" is cleaner.</dd> * </dl> * * @param name The feature name, which is a fully-qualified * URI. * @return The current state of the feature (true or false). * @throws org.xml.sax.SAXNotRecognizedException When the * TransformerFactory does not recognize the feature name. * @throws org.xml.sax.SAXNotSupportedException When the * TransformerFactory recognizes the feature name but * cannot determine its value at this time. * * @throws SAXNotRecognizedException * @throws SAXNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Look up the value of a feature. * <p>The feature name is any fully-qualified URI. It is possible for an TransformerFactory to recognize a feature name but to be unable to return its value; this is especially true in the case of an adapter for a SAX1 Parser, which has no way of knowing whether the underlying parser is validating, for example.</p> * <h3>Open issues:</h3> <dl> <dt><h4>Should getFeature be changed to hasFeature?</h4></dt> <dd>Keith Visco writes: Should getFeature be changed to hasFeature? It returns a boolean which indicated whether the "state" of feature is "true or false". I assume this means whether or not a feature is supported? I know SAX is using "getFeature", but to me "hasFeature" is cleaner.</dd> </dl> * @param name The feature name, which is a fully-qualified URI. @return The current state of the feature (true or false). @throws org.xml.sax.SAXNotRecognizedException When the TransformerFactory does not recognize the feature name. @throws org.xml.sax.SAXNotSupportedException When the TransformerFactory recognizes the feature name but cannot determine its value at this time. * @throws SAXNotRecognizedException @throws SAXNotSupportedException 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
,	TokenNameCOMMA	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"http://xml.org/trax/features/sax/input"	TokenNameStringLiteral	http://xml.org/trax/features/sax/input
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"http://xml.org/trax/features/dom/input"	TokenNameStringLiteral	http://xml.org/trax/features/dom/input
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// %TODO% Doc 	TokenNameCOMMENT_LINE	%TODO% Doc 
/** * NEEDSDOC Method getMode * * * NEEDSDOC (getMode) @return */	TokenNameCOMMENT_JAVADOC	 NEEDSDOC Method getMode * NEEDSDOC (getMode) @return 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_modes	TokenNameIdentifier	 m modes
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
)	TokenNameRPAREN	
m_modes	TokenNameIdentifier	 m modes
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// %TODO% Doc 	TokenNameCOMMENT_LINE	%TODO% Doc 
/** * NEEDSDOC Method pushMode * * * NEEDSDOC @param mode */	TokenNameCOMMENT_JAVADOC	 NEEDSDOC Method pushMode * NEEDSDOC @param mode 
public	TokenNamepublic	
void	TokenNamevoid	
pushMode	TokenNameIdentifier	 push Mode
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_modes	TokenNameIdentifier	 m modes
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// %TODO% Doc 	TokenNameCOMMENT_LINE	%TODO% Doc 
/** * NEEDSDOC Method popMode * */	TokenNameCOMMENT_JAVADOC	 NEEDSDOC Method popMode 
public	TokenNamepublic	
void	TokenNamevoid	
popMode	TokenNameIdentifier	 pop Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_modes	TokenNameIdentifier	 m modes
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called by SourceTreeHandler to start the transformation * in a separate thread * * NEEDSDOC @param priority */	TokenNameCOMMENT_JAVADOC	 Called by SourceTreeHandler to start the transformation in a separate thread * NEEDSDOC @param priority 
public	TokenNamepublic	
void	TokenNamevoid	
runTransformThread	TokenNameIdentifier	 run Transform Thread
(	TokenNameLPAREN	
int	TokenNameint	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// used in SourceTreeHandler 	TokenNameCOMMENT_LINE	used in SourceTreeHandler 
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
ThreadControllerWrapper	TokenNameIdentifier	 Thread Controller Wrapper
.	TokenNameDOT	
runThread	TokenNameIdentifier	 run Thread
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setTransformThread	TokenNameIdentifier	 set Transform Thread
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called by this.transform() if isParserEventsOnMain()==false. * Similar with runTransformThread(), but no priority is set * and setTransformThread is not set. */	TokenNameCOMMENT_JAVADOC	 Called by this.transform() if isParserEventsOnMain()==false. Similar with runTransformThread(), but no priority is set and setTransformThread is not set. 
public	TokenNamepublic	
void	TokenNamevoid	
runTransformThread	TokenNameIdentifier	 run Transform Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ThreadControllerWrapper	TokenNameIdentifier	 Thread Controller Wrapper
.	TokenNameDOT	
runThread	TokenNameIdentifier	 run Thread
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called by CoRoutineSAXParser. Launches the CoroutineSAXParser * in a thread, and prepares it to invoke the parser from that thread * upon request. * */	TokenNameCOMMENT_JAVADOC	 Called by CoRoutineSAXParser. Launches the CoroutineSAXParser in a thread, and prepares it to invoke the parser from that thread upon request. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
runTransformThread	TokenNameIdentifier	 run Transform Thread
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
runnable	TokenNameIdentifier	 runnable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ThreadControllerWrapper	TokenNameIdentifier	 Thread Controller Wrapper
.	TokenNameDOT	
runThread	TokenNameIdentifier	 run Thread
(	TokenNameLPAREN	
runnable	TokenNameIdentifier	 runnable
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Used by SourceTreeHandler to wait until the transform * completes * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Used by SourceTreeHandler to wait until the transform completes * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
waitTransformThread	TokenNameIdentifier	 wait Transform Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// This is called to make sure the task is done. 	TokenNameCOMMENT_LINE	This is called to make sure the task is done. 
// It is possible that the thread has been reused - 	TokenNameCOMMENT_LINE	It is possible that the thread has been reused - 
// but for a different transformation. ( what if we 	TokenNameCOMMENT_LINE	but for a different transformation. ( what if we 
// recycle the transformer ? Not a problem since this is 	TokenNameCOMMENT_LINE	recycle the transformer ? Not a problem since this is 
// still in use. ) 	TokenNameCOMMENT_LINE	still in use. ) 
Thread	TokenNameIdentifier	 Thread
transformThread	TokenNameIdentifier	 transform Thread
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getTransformThread	TokenNameIdentifier	 get Transform Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
transformThread	TokenNameIdentifier	 transform Thread
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ThreadControllerWrapper	TokenNameIdentifier	 Thread Controller Wrapper
.	TokenNameDOT	
waitThread	TokenNameIdentifier	 wait Thread
(	TokenNameLPAREN	
transformThread	TokenNameIdentifier	 transform Thread
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
hasTransformThreadErrorCatcher	TokenNameIdentifier	 has Transform Thread Error Catcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getExceptionThrown	TokenNameIdentifier	 get Exception Thrown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setTransformThread	TokenNameIdentifier	 set Transform Thread
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the exception thrown by the secondary thread (normally * the transform thread). * * @return The thrown exception, or null if no exception was * thrown. */	TokenNameCOMMENT_JAVADOC	 Get the exception thrown by the secondary thread (normally the transform thread). * @return The thrown exception, or null if no exception was thrown. 
public	TokenNamepublic	
Exception	TokenNameIdentifier	 Exception
getExceptionThrown	TokenNameIdentifier	 get Exception Thrown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_exceptionThrown	TokenNameIdentifier	 m exception Thrown
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the exception thrown by the secondary thread (normally * the transform thread). * * @param e The thrown exception, or null if no exception was * thrown. */	TokenNameCOMMENT_JAVADOC	 Set the exception thrown by the secondary thread (normally the transform thread). * @param e The thrown exception, or null if no exception was thrown. 
public	TokenNamepublic	
void	TokenNamevoid	
setExceptionThrown	TokenNameIdentifier	 set Exception Thrown
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_exceptionThrown	TokenNameIdentifier	 m exception Thrown
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is just a way to set the document for run(). * * @param doc A non-null reference to the root of the * tree to be transformed. */	TokenNameCOMMENT_JAVADOC	 This is just a way to set the document for run(). * @param doc A non-null reference to the root of the tree to be transformed. 
public	TokenNamepublic	
void	TokenNamevoid	
setSourceTreeDocForThread	TokenNameIdentifier	 set Source Tree Doc For Thread
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_doc	TokenNameIdentifier	 m doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the input source for the source tree, which is needed if the * parse thread is not the main thread, in order for the parse * thread's run method to get to the input source. * * @param source The input source for the source tree. */	TokenNameCOMMENT_JAVADOC	 Set the input source for the source tree, which is needed if the parse thread is not the main thread, in order for the parse thread's run method to get to the input source. * @param source The input source for the source tree. 
public	TokenNamepublic	
void	TokenNamevoid	
setXMLSource	TokenNameIdentifier	 set XML Source
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_xmlSource	TokenNameIdentifier	 m xml Source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the transform method is completed. * * @return True if transformNode has completed, or * an exception was thrown. */	TokenNameCOMMENT_JAVADOC	 Tell if the transform method is completed. * @return True if transformNode has completed, or an exception was thrown. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isTransformDone	TokenNameIdentifier	 is Transform Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_isTransformDone	TokenNameIdentifier	 m is Transform Done
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set if the transform method is completed. * * @param done True if transformNode has completed, or * an exception was thrown. */	TokenNameCOMMENT_JAVADOC	 Set if the transform method is completed. * @param done True if transformNode has completed, or an exception was thrown. 
public	TokenNamepublic	
void	TokenNamevoid	
setIsTransformDone	TokenNameIdentifier	 set Is Transform Done
(	TokenNameLPAREN	
boolean	TokenNameboolean	
done	TokenNameIdentifier	 done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_isTransformDone	TokenNameIdentifier	 m is Transform Done
=	TokenNameEQUAL	
done	TokenNameIdentifier	 done
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * From a secondary thread, post the exception, so that * it can be picked up from the main thread. * * @param e The exception that was thrown. */	TokenNameCOMMENT_JAVADOC	 From a secondary thread, post the exception, so that it can be picked up from the main thread. * @param e The exception that was thrown. 
void	TokenNamevoid	
postExceptionFromThread	TokenNameIdentifier	 post Exception From Thread
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Commented out in response to problem reported by Nicola Brown <Nicola.Brown@jacobsrimell.com> 	TokenNameCOMMENT_LINE	Commented out in response to problem reported by Nicola Brown <Nicola.Brown@jacobsrimell.com> 
// if(m_reportInPostExceptionFromThread) 	TokenNameCOMMENT_LINE	if(m_reportInPostExceptionFromThread) 
// { 	TokenNameCOMMENT_LINE	{ 
// // Consider re-throwing the exception if this flag is set. 	TokenNameCOMMENT_LINE	// Consider re-throwing the exception if this flag is set. 
// e.printStackTrace(); 	TokenNameCOMMENT_LINE	e.printStackTrace(); 
// } 	TokenNameCOMMENT_LINE	} 
// %REVIEW Need DTM equivelent? 	TokenNameCOMMENT_LINE	%REVIEW Need DTM equivelent? 
// if (m_inputContentHandler instanceof SourceTreeHandler) 	TokenNameCOMMENT_LINE	if (m_inputContentHandler instanceof SourceTreeHandler) 
// { 	TokenNameCOMMENT_LINE	{ 
// SourceTreeHandler sth = (SourceTreeHandler) m_inputContentHandler; 	TokenNameCOMMENT_LINE	SourceTreeHandler sth = (SourceTreeHandler) m_inputContentHandler; 
// 	TokenNameCOMMENT_LINE	 
// sth.setExceptionThrown(e); 	TokenNameCOMMENT_LINE	sth.setExceptionThrown(e); 
// } 	TokenNameCOMMENT_LINE	} 
// ContentHandler ch = getContentHandler(); 	TokenNameCOMMENT_LINE	ContentHandler ch = getContentHandler(); 
// if(ch instanceof SourceTreeHandler) 	TokenNameCOMMENT_LINE	if(ch instanceof SourceTreeHandler) 
// { 	TokenNameCOMMENT_LINE	{ 
// SourceTreeHandler sth = (SourceTreeHandler) ch; 	TokenNameCOMMENT_LINE	SourceTreeHandler sth = (SourceTreeHandler) ch; 
// ((TransformerImpl)(sth.getTransformer())).postExceptionFromThread(e); 	TokenNameCOMMENT_LINE	((TransformerImpl)(sth.getTransformer())).postExceptionFromThread(e); 
// } 	TokenNameCOMMENT_LINE	} 
m_isTransformDone	TokenNameIdentifier	 m is Transform Done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_exceptionThrown	TokenNameIdentifier	 m exception Thrown
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
// should have already been reported via the error handler? 	TokenNameCOMMENT_LINE	should have already been reported via the error handler? 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// See message from me on 3/27/2001 to Patrick Moore. 	TokenNameCOMMENT_LINE	See message from me on 3/27/2001 to Patrick Moore. 
// String msg = e.getMessage(); 	TokenNameCOMMENT_LINE	String msg = e.getMessage(); 
// System.out.println(e.getMessage()); 	TokenNameCOMMENT_LINE	System.out.println(e.getMessage()); 
// Is this really needed? -sb 	TokenNameCOMMENT_LINE	Is this really needed? -sb 
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if (null == msg) 	TokenNameCOMMENT_LINE	if (null == msg) 
// { 	TokenNameCOMMENT_LINE	{ 
// 	TokenNameCOMMENT_LINE	 
// // m_throwNewError = false; 	TokenNameCOMMENT_LINE	// m_throwNewError = false; 
// e.printStackTrace(); 	TokenNameCOMMENT_LINE	e.printStackTrace(); 
// } 	TokenNameCOMMENT_LINE	} 
// throw new org.apache.xml.utils.WrappedRuntimeException(e); 	TokenNameCOMMENT_LINE	throw new org.apache.xml.utils.WrappedRuntimeException(e); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Run the transform thread. */	TokenNameCOMMENT_JAVADOC	 Run the transform thread. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_hasBeenReset	TokenNameIdentifier	 m has Been Reset
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// int n = ((SourceTreeHandler)getInputContentHandler()).getDTMRoot(); 	TokenNameCOMMENT_LINE	int n = ((SourceTreeHandler)getInputContentHandler()).getDTMRoot(); 
// transformNode(n); 	TokenNameCOMMENT_LINE	transformNode(n); 
try	TokenNametry	
{	TokenNameLBRACE	
m_isTransformDone	TokenNameIdentifier	 m is Transform Done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Should no longer be needed... 	TokenNameCOMMENT_LINE	Should no longer be needed... 
// if(m_inputContentHandler instanceof TransformerHandlerImpl) 	TokenNameCOMMENT_LINE	if(m_inputContentHandler instanceof TransformerHandlerImpl) 
// { 	TokenNameCOMMENT_LINE	{ 
// TransformerHandlerImpl thi = (TransformerHandlerImpl)m_inputContentHandler; 	TokenNameCOMMENT_LINE	TransformerHandlerImpl thi = (TransformerHandlerImpl)m_inputContentHandler; 
// thi.waitForInitialEvents(); 	TokenNameCOMMENT_LINE	thi.waitForInitialEvents(); 
// } 	TokenNameCOMMENT_LINE	} 
transformNode	TokenNameIdentifier	 transform Node
(	TokenNameLPAREN	
m_doc	TokenNameIdentifier	 m doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// e.printStackTrace(); 	TokenNameCOMMENT_LINE	e.printStackTrace(); 
// Strange that the other catch won't catch this... 	TokenNameCOMMENT_LINE	Strange that the other catch won't catch this... 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_transformThread	TokenNameIdentifier	 m transform Thread
)	TokenNameRPAREN	
postExceptionFromThread	TokenNameIdentifier	 post Exception From Thread
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Assume we're on the main thread 	TokenNameCOMMENT_LINE	Assume we're on the main thread 
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
m_isTransformDone	TokenNameIdentifier	 m is Transform Done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_inputContentHandler	TokenNameIdentifier	 m input Content Handler
instanceof	TokenNameinstanceof	
TransformerHandlerImpl	TokenNameIdentifier	 Transformer Handler Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransformerHandlerImpl	TokenNameIdentifier	 Transformer Handler Impl
)	TokenNameRPAREN	
m_inputContentHandler	TokenNameIdentifier	 m input Content Handler
)	TokenNameRPAREN	
.	TokenNameDOT	
clearCoRoutine	TokenNameIdentifier	 clear Co Routine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// synchronized (this) 	TokenNameCOMMENT_LINE	synchronized (this) 
// { 	TokenNameCOMMENT_LINE	{ 
// notifyAll(); 	TokenNameCOMMENT_LINE	notifyAll(); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// e.printStackTrace(); 	TokenNameCOMMENT_LINE	e.printStackTrace(); 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_transformThread	TokenNameIdentifier	 m transform Thread
)	TokenNameRPAREN	
postExceptionFromThread	TokenNameIdentifier	 post Exception From Thread
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Assume we're on the main thread. 	TokenNameCOMMENT_LINE	Assume we're on the main thread. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Fragment re-execution interfaces for a tool. 	TokenNameCOMMENT_LINE	Fragment re-execution interfaces for a tool. 
/** * This will get a snapshot of the current executing context * * * @return TransformSnapshot object, snapshot of executing context * @deprecated This is an internal tooling API that nobody seems to be using */	TokenNameCOMMENT_JAVADOC	 This will get a snapshot of the current executing context * @return TransformSnapshot object, snapshot of executing context @deprecated This is an internal tooling API that nobody seems to be using 
public	TokenNamepublic	
TransformSnapshot	TokenNameIdentifier	 Transform Snapshot
getSnapshot	TokenNameIdentifier	 get Snapshot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TransformSnapshotImpl	TokenNameIdentifier	 Transform Snapshot Impl
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This will execute the following XSLT instructions * from the snapshot point, after the stylesheet execution * context has been reset from the snapshot point. * * @param ts The snapshot of where to start execution * * @throws TransformerException * @deprecated This is an internal tooling API that nobody seems to be using */	TokenNameCOMMENT_JAVADOC	 This will execute the following XSLT instructions from the snapshot point, after the stylesheet execution context has been reset from the snapshot point. * @param ts The snapshot of where to start execution * @throws TransformerException @deprecated This is an internal tooling API that nobody seems to be using 
public	TokenNamepublic	
void	TokenNamevoid	
executeFromSnapshot	TokenNameIdentifier	 execute From Snapshot
(	TokenNameLPAREN	
TransformSnapshot	TokenNameIdentifier	 Transform Snapshot
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
getMatchedTemplate	TokenNameIdentifier	 get Matched Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
getMatchedNode	TokenNameIdentifier	 get Matched Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushElemTemplateElement	TokenNameIdentifier	 push Elem Template Element
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//needed?? 	TokenNameCOMMENT_LINE	needed?? 
m_xcontext	TokenNameIdentifier	 m xcontext
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//needed?? 	TokenNameCOMMENT_LINE	needed?? 
this	TokenNamethis	
.	TokenNameDOT	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// getResultTreeHandler()); 	TokenNameCOMMENT_LINE	getResultTreeHandler()); 
}	TokenNameRBRACE	
/** * This will reset the stylesheet execution context * from the snapshot point. * * @param ts The snapshot of where to start execution * @deprecated This is an internal tooling API that nobody seems to be using */	TokenNameCOMMENT_JAVADOC	 This will reset the stylesheet execution context from the snapshot point. * @param ts The snapshot of where to start execution @deprecated This is an internal tooling API that nobody seems to be using 
public	TokenNamepublic	
void	TokenNamevoid	
resetToStylesheet	TokenNameIdentifier	 reset To Stylesheet
(	TokenNameLPAREN	
TransformSnapshot	TokenNameIdentifier	 Transform Snapshot
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransformSnapshotImpl	TokenNameIdentifier	 Transform Snapshot Impl
)	TokenNameRPAREN	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NEEDSDOC Method stopTransformation * */	TokenNameCOMMENT_JAVADOC	 NEEDSDOC Method stopTransformation 
public	TokenNamepublic	
void	TokenNamevoid	
stopTransformation	TokenNameIdentifier	 stop Transformation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Test whether whitespace-only text nodes are visible in the logical * view of <code>DTM</code>. Normally, this function * will be called by the implementation of <code>DTM</code>; * it is not normally called directly from * user code. * * @param elementHandle int Handle of the element. * @return one of NOTSTRIP, STRIP, or INHERIT. */	TokenNameCOMMENT_JAVADOC	 Test whether whitespace-only text nodes are visible in the logical view of <code>DTM</code>. Normally, this function will be called by the implementation of <code>DTM</code>; it is not normally called directly from user code. * @param elementHandle int Handle of the element. @return one of NOTSTRIP, STRIP, or INHERIT. 
public	TokenNamepublic	
short	TokenNameshort	
getShouldStripSpace	TokenNameIdentifier	 get Should Strip Space
(	TokenNameLPAREN	
int	TokenNameint	
elementHandle	TokenNameIdentifier	 element Handle
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
WhiteSpaceInfo	TokenNameIdentifier	 White Space Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
.	TokenNameDOT	
getWhiteSpaceInfo	TokenNameIdentifier	 get White Space Info
(	TokenNameLPAREN	
m_xcontext	TokenNameIdentifier	 m xcontext
,	TokenNameCOMMA	
elementHandle	TokenNameIdentifier	 element Handle
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
.	TokenNameDOT	
INHERIT	TokenNameIdentifier	 INHERIT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// System.out.println("getShouldStripSpace: "+info.getShouldStripSpace()); 	TokenNameCOMMENT_LINE	System.out.println("getShouldStripSpace: "+info.getShouldStripSpace()); 
return	TokenNamereturn	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
getShouldStripSpace	TokenNameIdentifier	 get Should Strip Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
.	TokenNameDOT	
STRIP	TokenNameIdentifier	 STRIP
:	TokenNameCOLON	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
.	TokenNameDOT	
NOTSTRIP	TokenNameIdentifier	 NOTSTRIP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
.	TokenNameDOT	
INHERIT	TokenNameIdentifier	 INHERIT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Initializer method. * * @param transformer non-null transformer instance * @param realHandler Content Handler instance */	TokenNameCOMMENT_JAVADOC	 Initializer method. * @param transformer non-null transformer instance @param realHandler Content Handler instance 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
ToXMLSAXHandler	TokenNameIdentifier	 To XMLSAX Handler
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
ContentHandler	TokenNameIdentifier	 Content Handler
realHandler	TokenNameIdentifier	 real Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
setTransformer	TokenNameIdentifier	 set Transformer
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
realHandler	TokenNameIdentifier	 real Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSerializationHandler	TokenNameIdentifier	 set Serialization Handler
(	TokenNameLPAREN	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
xoh	TokenNameIdentifier	 xoh
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_serializationHandler	TokenNameIdentifier	 m serialization Handler
=	TokenNameEQUAL	
xoh	TokenNameIdentifier	 xoh
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fire off characters, cdate events. * @see org.apache.xml.serializer.SerializerTrace#fireGenerateEvent(int, char[], int, int) */	TokenNameCOMMENT_JAVADOC	 Fire off characters, cdate events. @see org.apache.xml.serializer.SerializerTrace#fireGenerateEvent(int, char[], int, int) 
public	TokenNamepublic	
void	TokenNamevoid	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
int	TokenNameint	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
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
{	TokenNameLBRACE	
GenerateEvent	TokenNameIdentifier	 Generate Event
ge	TokenNameIdentifier	 ge
=	TokenNameEQUAL	
new	TokenNamenew	
GenerateEvent	TokenNameIdentifier	 Generate Event
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_traceManager	TokenNameIdentifier	 m trace Manager
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
ge	TokenNameIdentifier	 ge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fire off startElement, endElement events. * @see org.apache.xml.serializer.SerializerTrace#fireGenerateEvent(int, String, Attributes) */	TokenNameCOMMENT_JAVADOC	 Fire off startElement, endElement events. @see org.apache.xml.serializer.SerializerTrace#fireGenerateEvent(int, String, Attributes) 
public	TokenNamepublic	
void	TokenNamevoid	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
int	TokenNameint	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GenerateEvent	TokenNameIdentifier	 Generate Event
ge	TokenNameIdentifier	 ge
=	TokenNameEQUAL	
new	TokenNamenew	
GenerateEvent	TokenNameIdentifier	 Generate Event
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_traceManager	TokenNameIdentifier	 m trace Manager
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
ge	TokenNameIdentifier	 ge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fire off processingInstruction events. * @see org.apache.xml.serializer.SerializerTrace#fireGenerateEvent(int, String, String) */	TokenNameCOMMENT_JAVADOC	 Fire off processingInstruction events. @see org.apache.xml.serializer.SerializerTrace#fireGenerateEvent(int, String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
int	TokenNameint	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GenerateEvent	TokenNameIdentifier	 Generate Event
ge	TokenNameIdentifier	 ge
=	TokenNameEQUAL	
new	TokenNamenew	
GenerateEvent	TokenNameIdentifier	 Generate Event
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_traceManager	TokenNameIdentifier	 m trace Manager
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
ge	TokenNameIdentifier	 ge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fire off comment and entity ref events. * @see org.apache.xml.serializer.SerializerTrace#fireGenerateEvent(int, String) */	TokenNameCOMMENT_JAVADOC	 Fire off comment and entity ref events. @see org.apache.xml.serializer.SerializerTrace#fireGenerateEvent(int, String) 
public	TokenNamepublic	
void	TokenNamevoid	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
int	TokenNameint	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GenerateEvent	TokenNameIdentifier	 Generate Event
ge	TokenNameIdentifier	 ge
=	TokenNameEQUAL	
new	TokenNamenew	
GenerateEvent	TokenNameIdentifier	 Generate Event
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_traceManager	TokenNameIdentifier	 m trace Manager
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
ge	TokenNameIdentifier	 ge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fire off startDocument, endDocument events. * @see org.apache.xml.serializer.SerializerTrace#fireGenerateEvent(int) */	TokenNameCOMMENT_JAVADOC	 Fire off startDocument, endDocument events. @see org.apache.xml.serializer.SerializerTrace#fireGenerateEvent(int) 
public	TokenNamepublic	
void	TokenNamevoid	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
int	TokenNameint	
eventType	TokenNameIdentifier	 event Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GenerateEvent	TokenNameIdentifier	 Generate Event
ge	TokenNameIdentifier	 ge
=	TokenNameEQUAL	
new	TokenNamenew	
GenerateEvent	TokenNameIdentifier	 Generate Event
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
eventType	TokenNameIdentifier	 event Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_traceManager	TokenNameIdentifier	 m trace Manager
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
ge	TokenNameIdentifier	 ge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xml.serializer.SerializerTrace#hasTraceListeners() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xml.serializer.SerializerTrace#hasTraceListeners() 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_traceManager	TokenNameIdentifier	 m trace Manager
.	TokenNameDOT	
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_debug	TokenNameIdentifier	 m debug
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDebug	TokenNameIdentifier	 set Debug
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_debug	TokenNameIdentifier	 m debug
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Incremental flag */	TokenNameCOMMENT_JAVADOC	 @return Incremental flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIncremental	TokenNameIdentifier	 get Incremental
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_incremental	TokenNameIdentifier	 m incremental
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Optimization flag */	TokenNameCOMMENT_JAVADOC	 @return Optimization flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getOptimize	TokenNameIdentifier	 get Optimize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_optimizer	TokenNameIdentifier	 m optimizer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Source location flag */	TokenNameCOMMENT_JAVADOC	 @return Source location flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getSource_location	TokenNameIdentifier	 get Source location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_source_location	TokenNameIdentifier	 m source location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end TransformerImpl class 	TokenNameCOMMENT_LINE	end TransformerImpl class 
