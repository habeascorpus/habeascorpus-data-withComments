/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Pipe.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Pipe.java 470245 2006-11-02 06:34:33Z minchau $ 
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
SAXSource	TokenNameIdentifier	 SAX Source
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
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
;	TokenNameSEMICOLON	
/** * This example shows how to chain a series of transformations by * piping SAX events from one Transformer to another. Each Transformer * operates as a SAX2 XMLFilter/XMLReader. */	TokenNameCOMMENT_JAVADOC	 This example shows how to chain a series of transformations by piping SAX events from one Transformer to another. Each Transformer operates as a SAX2 XMLFilter/XMLReader. 
public	TokenNamepublic	
class	TokenNameclass	
Pipe	TokenNameIdentifier	 Pipe
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
SAXException	TokenNameIdentifier	 SAX Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Instantiate a TransformerFactory. 	TokenNameCOMMENT_LINE	Instantiate a TransformerFactory. 
TransformerFactory	TokenNameIdentifier	 Transformer Factory
tFactory	TokenNameIdentifier	 t Factory
=	TokenNameEQUAL	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Determine whether the TransformerFactory supports The use uf SAXSource 	TokenNameCOMMENT_LINE	Determine whether the TransformerFactory supports The use uf SAXSource 
// and SAXResult 	TokenNameCOMMENT_LINE	and SAXResult 
if	TokenNameif	
(	TokenNameLPAREN	
tFactory	TokenNameIdentifier	 t Factory
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
SAXSource	TokenNameIdentifier	 SAX Source
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
tFactory	TokenNameIdentifier	 t Factory
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
SAXResult	TokenNameIdentifier	 SAX Result
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Cast the TransformerFactory to SAXTransformerFactory. 	TokenNameCOMMENT_LINE	Cast the TransformerFactory to SAXTransformerFactory. 
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
saxTFactory	TokenNameIdentifier	 sax T Factory
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
)	TokenNameRPAREN	
tFactory	TokenNameIdentifier	 t Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a TransformerHandler for each stylesheet. 	TokenNameCOMMENT_LINE	Create a TransformerHandler for each stylesheet. 
TransformerHandler	TokenNameIdentifier	 Transformer Handler
tHandler1	TokenNameIdentifier	 t Handler1
=	TokenNameEQUAL	
saxTFactory	TokenNameIdentifier	 sax T Factory
.	TokenNameDOT	
newTransformerHandler	TokenNameIdentifier	 new Transformer Handler
(	TokenNameLPAREN	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
"foo1.xsl"	TokenNameStringLiteral	foo1.xsl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
tHandler2	TokenNameIdentifier	 t Handler2
=	TokenNameEQUAL	
saxTFactory	TokenNameIdentifier	 sax T Factory
.	TokenNameDOT	
newTransformerHandler	TokenNameIdentifier	 new Transformer Handler
(	TokenNameLPAREN	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
"foo2.xsl"	TokenNameStringLiteral	foo2.xsl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
tHandler3	TokenNameIdentifier	 t Handler3
=	TokenNameEQUAL	
saxTFactory	TokenNameIdentifier	 sax T Factory
.	TokenNameDOT	
newTransformerHandler	TokenNameIdentifier	 new Transformer Handler
(	TokenNameLPAREN	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
"foo3.xsl"	TokenNameStringLiteral	foo3.xsl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create an XMLReader. 	TokenNameCOMMENT_LINE	Create an XMLReader. 
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
.	TokenNameDOT	
createXMLReader	TokenNameIdentifier	 create XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
tHandler1	TokenNameIdentifier	 t Handler1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"http://xml.org/sax/properties/lexical-handler"	TokenNameStringLiteral	http://xml.org/sax/properties/lexical-handler
,	TokenNameCOMMA	
tHandler1	TokenNameIdentifier	 t Handler1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tHandler1	TokenNameIdentifier	 t Handler1
.	TokenNameDOT	
setResult	TokenNameIdentifier	 set Result
(	TokenNameLPAREN	
new	TokenNamenew	
SAXResult	TokenNameIdentifier	 SAX Result
(	TokenNameLPAREN	
tHandler2	TokenNameIdentifier	 t Handler2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tHandler2	TokenNameIdentifier	 t Handler2
.	TokenNameDOT	
setResult	TokenNameIdentifier	 set Result
(	TokenNameLPAREN	
new	TokenNamenew	
SAXResult	TokenNameIdentifier	 SAX Result
(	TokenNameLPAREN	
tHandler3	TokenNameIdentifier	 t Handler3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// transformer3 outputs SAX events to the serializer. 	TokenNameCOMMENT_LINE	transformer3 outputs SAX events to the serializer. 
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
tHandler3	TokenNameIdentifier	 t Handler3
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
// Parse the XML input document. The input ContentHandler and output ContentHandler 	TokenNameCOMMENT_LINE	Parse the XML input document. The input ContentHandler and output ContentHandler 
// work in separate threads to optimize performance. 	TokenNameCOMMENT_LINE	work in separate threads to optimize performance. 
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"foo.xml"	TokenNameStringLiteral	foo.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
