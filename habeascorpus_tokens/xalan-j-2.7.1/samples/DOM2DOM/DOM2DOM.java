/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DOM2DOM.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DOM2DOM.java 470245 2006-11-02 06:34:33Z minchau $ 
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
IOException	TokenNameIdentifier	 IO Exception
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Show how to transform a DOM tree into another DOM tree. * This uses the javax.xml.parsers to parse both an XSL file * and the XML file into a DOM, and create an output DOM. */	TokenNameCOMMENT_JAVADOC	 Show how to transform a DOM tree into another DOM tree. This uses the javax.xml.parsers to parse both an XSL file and the XML file into a DOM, and create an output DOM. 
public	TokenNamepublic	
class	TokenNameclass	
DOM2DOM	TokenNameIdentifier	 DO M2 DOM
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
,	TokenNameCOMMA	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
,	TokenNameCOMMA	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
,	TokenNameCOMMA	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
,	TokenNameCOMMA	
SAXException	TokenNameIdentifier	 SAX Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
tFactory	TokenNameIdentifier	 t Factory
=	TokenNameEQUAL	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tFactory	TokenNameIdentifier	 t Factory
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
DOMSource	TokenNameIdentifier	 DOM Source
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
tFactory	TokenNameIdentifier	 t Factory
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
DOMResult	TokenNameIdentifier	 DOM Result
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Instantiate a DocumentBuilderFactory. 	TokenNameCOMMENT_LINE	Instantiate a DocumentBuilderFactory. 
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
dFactory	TokenNameIdentifier	 d Factory
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// And setNamespaceAware, which is required when parsing xsl files 	TokenNameCOMMENT_LINE	And setNamespaceAware, which is required when parsing xsl files 
dFactory	TokenNameIdentifier	 d Factory
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Use the DocumentBuilderFactory to create a DocumentBuilder. 	TokenNameCOMMENT_LINE	Use the DocumentBuilderFactory to create a DocumentBuilder. 
DocumentBuilder	TokenNameIdentifier	 Document Builder
dBuilder	TokenNameIdentifier	 d Builder
=	TokenNameEQUAL	
dFactory	TokenNameIdentifier	 d Factory
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Use the DocumentBuilder to parse the XSL stylesheet. 	TokenNameCOMMENT_LINE	Use the DocumentBuilder to parse the XSL stylesheet. 
Document	TokenNameIdentifier	 Document
xslDoc	TokenNameIdentifier	 xsl Doc
=	TokenNameEQUAL	
dBuilder	TokenNameIdentifier	 d Builder
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"birds.xsl"	TokenNameStringLiteral	birds.xsl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use the DOM Document to define a DOMSource object. 	TokenNameCOMMENT_LINE	Use the DOM Document to define a DOMSource object. 
DOMSource	TokenNameIdentifier	 DOM Source
xslDomSource	TokenNameIdentifier	 xsl Dom Source
=	TokenNameEQUAL	
new	TokenNamenew	
DOMSource	TokenNameIdentifier	 DOM Source
(	TokenNameLPAREN	
xslDoc	TokenNameIdentifier	 xsl Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the systemId: note this is actually a URL, not a local filename 	TokenNameCOMMENT_LINE	Set the systemId: note this is actually a URL, not a local filename 
xslDomSource	TokenNameIdentifier	 xsl Dom Source
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
"birds.xsl"	TokenNameStringLiteral	birds.xsl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Process the stylesheet DOMSource and generate a Transformer. 	TokenNameCOMMENT_LINE	Process the stylesheet DOMSource and generate a Transformer. 
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
tFactory	TokenNameIdentifier	 t Factory
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
xslDomSource	TokenNameIdentifier	 xsl Dom Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Use the DocumentBuilder to parse the XML input. 	TokenNameCOMMENT_LINE	Use the DocumentBuilder to parse the XML input. 
Document	TokenNameIdentifier	 Document
xmlDoc	TokenNameIdentifier	 xml Doc
=	TokenNameEQUAL	
dBuilder	TokenNameIdentifier	 d Builder
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"birds.xml"	TokenNameStringLiteral	birds.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use the DOM Document to define a DOMSource object. 	TokenNameCOMMENT_LINE	Use the DOM Document to define a DOMSource object. 
DOMSource	TokenNameIdentifier	 DOM Source
xmlDomSource	TokenNameIdentifier	 xml Dom Source
=	TokenNameEQUAL	
new	TokenNamenew	
DOMSource	TokenNameIdentifier	 DOM Source
(	TokenNameLPAREN	
xmlDoc	TokenNameIdentifier	 xml Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the base URI for the DOMSource so any relative URIs it contains can 	TokenNameCOMMENT_LINE	Set the base URI for the DOMSource so any relative URIs it contains can 
// be resolved. 	TokenNameCOMMENT_LINE	be resolved. 
xmlDomSource	TokenNameIdentifier	 xml Dom Source
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
"birds.xml"	TokenNameStringLiteral	birds.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create an empty DOMResult for the Result. 	TokenNameCOMMENT_LINE	Create an empty DOMResult for the Result. 
DOMResult	TokenNameIdentifier	 DOM Result
domResult	TokenNameIdentifier	 dom Result
=	TokenNameEQUAL	
new	TokenNamenew	
DOMResult	TokenNameIdentifier	 DOM Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Perform the transformation, placing the output in the DOMResult. 	TokenNameCOMMENT_LINE	Perform the transformation, placing the output in the DOMResult. 
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
xmlDomSource	TokenNameIdentifier	 xml Dom Source
,	TokenNameCOMMA	
domResult	TokenNameIdentifier	 dom Result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Instantiate an Xalan XML serializer and use it to serialize the output DOM to System.out 	TokenNameCOMMENT_LINE	Instantiate an Xalan XML serializer and use it to serialize the output DOM to System.out 
// using the default output format, except for indent="yes" 	TokenNameCOMMENT_LINE	using the default output format, except for indent="yes" 
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
xmlProps	TokenNameIdentifier	 xml Props
=	TokenNameEQUAL	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
getDefaultMethodProperties	TokenNameIdentifier	 get Default Method Properties
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlProps	TokenNameIdentifier	 xml Props
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"indent"	TokenNameStringLiteral	indent
,	TokenNameCOMMA	
"yes"	TokenNameStringLiteral	yes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlProps	TokenNameIdentifier	 xml Props
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"standalone"	TokenNameStringLiteral	standalone
,	TokenNameCOMMA	
"no"	TokenNameStringLiteral	no
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Serializer	TokenNameIdentifier	 Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
.	TokenNameDOT	
getSerializer	TokenNameIdentifier	 get Serializer
(	TokenNameLPAREN	
xmlProps	TokenNameIdentifier	 xml Props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
asDOMSerializer	TokenNameIdentifier	 as DOM Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
domResult	TokenNameIdentifier	 dom Result
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
(	TokenNameLPAREN	
"DOM node processing not supported!"	TokenNameStringLiteral	DOM node processing not supported!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
