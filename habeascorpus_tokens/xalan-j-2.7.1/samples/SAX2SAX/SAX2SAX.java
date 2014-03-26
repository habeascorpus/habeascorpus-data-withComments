/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SAX2SAX.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SAX2SAX.java 470245 2006-11-02 06:34:33Z minchau $ 
/** * Replicate the SimpleTransform sample, explicitly using the SAX model to handle the * stylesheet, the XML input, and the transformation. */	TokenNameCOMMENT_JAVADOC	 Replicate the SimpleTransform sample, explicitly using the SAX model to handle the stylesheet, the XML input, and the transformation. 
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
Templates	TokenNameIdentifier	 Templates
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
TemplatesHandler	TokenNameIdentifier	 Templates Handler
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
public	TokenNamepublic	
class	TokenNameclass	
SAX2SAX	TokenNameIdentifier	 SA X2 SAX
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
// Determine whether the TransformerFactory supports The use of SAXSource 	TokenNameCOMMENT_LINE	Determine whether the TransformerFactory supports The use of SAXSource 
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
// Cast the TransformerFactory. 	TokenNameCOMMENT_LINE	Cast the TransformerFactory. 
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
// Create a ContentHandler to handle parsing of the stylesheet. 	TokenNameCOMMENT_LINE	Create a ContentHandler to handle parsing of the stylesheet. 
TemplatesHandler	TokenNameIdentifier	 Templates Handler
templatesHandler	TokenNameIdentifier	 templates Handler
=	TokenNameEQUAL	
saxTFactory	TokenNameIdentifier	 sax T Factory
.	TokenNameDOT	
newTemplatesHandler	TokenNameIdentifier	 new Templates Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create an XMLReader and set its ContentHandler. 	TokenNameCOMMENT_LINE	Create an XMLReader and set its ContentHandler. 
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
templatesHandler	TokenNameIdentifier	 templates Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Parse the stylesheet. 	TokenNameCOMMENT_LINE	Parse the stylesheet. 
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"birds.xsl"	TokenNameStringLiteral	birds.xsl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Get the Templates object from the ContentHandler. 	TokenNameCOMMENT_LINE	Get the Templates object from the ContentHandler. 
Templates	TokenNameIdentifier	 Templates
templates	TokenNameIdentifier	 templates
=	TokenNameEQUAL	
templatesHandler	TokenNameIdentifier	 templates Handler
.	TokenNameDOT	
getTemplates	TokenNameIdentifier	 get Templates
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a ContentHandler to handle parsing of the XML source. 	TokenNameCOMMENT_LINE	Create a ContentHandler to handle parsing of the XML source. 
TransformerHandler	TokenNameIdentifier	 Transformer Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
saxTFactory	TokenNameIdentifier	 sax T Factory
.	TokenNameDOT	
newTransformerHandler	TokenNameIdentifier	 new Transformer Handler
(	TokenNameLPAREN	
templates	TokenNameIdentifier	 templates
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Reset the XMLReader's ContentHandler. 	TokenNameCOMMENT_LINE	Reset the XMLReader's ContentHandler. 
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the ContentHandler to also function as a LexicalHandler, which 	TokenNameCOMMENT_LINE	Set the ContentHandler to also function as a LexicalHandler, which 
// includes "lexical" events (e.g., comments and CDATA). 	TokenNameCOMMENT_LINE	includes "lexical" events (e.g., comments and CDATA). 
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"http://xml.org/sax/properties/lexical-handler"	TokenNameStringLiteral	http://xml.org/sax/properties/lexical-handler
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileOutputStream	TokenNameIdentifier	 File Output Stream
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
"birds.out"	TokenNameStringLiteral	birds.out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
fos	TokenNameIdentifier	 fos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the result handling to be a serialization to the file output stream. 	TokenNameCOMMENT_LINE	Set the result handling to be a serialization to the file output stream. 
Result	TokenNameIdentifier	 Result
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
SAXResult	TokenNameIdentifier	 SAX Result
(	TokenNameLPAREN	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
asContentHandler	TokenNameIdentifier	 as Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
setResult	TokenNameIdentifier	 set Result
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Parse the XML input document. 	TokenNameCOMMENT_LINE	Parse the XML input document. 
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"birds.xml"	TokenNameStringLiteral	birds.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"************* The result is in birds.out *************"	TokenNameStringLiteral	************* The result is in birds.out *************
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"The TransformerFactory does not support SAX input and SAX output"	TokenNameStringLiteral	The TransformerFactory does not support SAX input and SAX output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
