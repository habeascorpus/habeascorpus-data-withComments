/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ValidateXMLInput.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ValidateXMLInput.java 470245 2006-11-02 06:34:33Z minchau $ 
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
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
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
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
DefaultHandler	TokenNameIdentifier	 Default Handler
;	TokenNameSEMICOLON	
/** * Validate the XML input by using SAXParserFactory to turn on namespace awareness and * validation, and a SAX XMLReader to parse the input and report problems to an error * handler. * * This sample uses birds.xml with an internal DOCTYPE declaration. As shipped, birds.xml * contains an element that violates the declared document type. */	TokenNameCOMMENT_JAVADOC	 Validate the XML input by using SAXParserFactory to turn on namespace awareness and validation, and a SAX XMLReader to parse the input and report problems to an error handler. * This sample uses birds.xml with an internal DOCTYPE declaration. As shipped, birds.xml contains an element that violates the declared document type. 
public	TokenNamepublic	
class	TokenNameclass	
ValidateXMLInput	TokenNameIdentifier	 Validate XML Input
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
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ValidateXMLInput	TokenNameIdentifier	 Validate XML Input
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
ValidateXMLInput	TokenNameIdentifier	 Validate XML Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Since we're going to use a SAX feature, the transformer must support 	TokenNameCOMMENT_LINE	Since we're going to use a SAX feature, the transformer must support 
// input in the form of a SAXSource. 	TokenNameCOMMENT_LINE	input in the form of a SAXSource. 
TransformerFactory	TokenNameIdentifier	 Transformer Factory
tfactory	TokenNameIdentifier	 tfactory
=	TokenNameEQUAL	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tfactory	TokenNameIdentifier	 tfactory
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
SAXSource	TokenNameIdentifier	 SAX Source
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Standard way of creating an XMLReader in JAXP 1.1. 	TokenNameCOMMENT_LINE	Standard way of creating an XMLReader in JAXP 1.1. 
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
pfactory	TokenNameIdentifier	 pfactory
=	TokenNameEQUAL	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pfactory	TokenNameIdentifier	 pfactory
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Very important! 	TokenNameCOMMENT_LINE	Very important! 
// Turn on validation. 	TokenNameCOMMENT_LINE	Turn on validation. 
pfactory	TokenNameIdentifier	 pfactory
.	TokenNameDOT	
setValidating	TokenNameIdentifier	 set Validating
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get an XMLReader. 	TokenNameCOMMENT_LINE	Get an XMLReader. 
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
pfactory	TokenNameIdentifier	 pfactory
.	TokenNameDOT	
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Instantiate an error handler (see the Handler inner class below) that will report any 	TokenNameCOMMENT_LINE	Instantiate an error handler (see the Handler inner class below) that will report any 
// errors or warnings that occur as the XMLReader is parsing the XML input. 	TokenNameCOMMENT_LINE	errors or warnings that occur as the XMLReader is parsing the XML input. 
Handler	TokenNameIdentifier	 Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
new	TokenNamenew	
Handler	TokenNameIdentifier	 Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Standard way of creating a transformer from a URL. 	TokenNameCOMMENT_LINE	Standard way of creating a transformer from a URL. 
Transformer	TokenNameIdentifier	 Transformer
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
tfactory	TokenNameIdentifier	 tfactory
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
"birds.xsl"	TokenNameStringLiteral	birds.xsl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Specify a SAXSource that takes both an XMLReader and a URL. 	TokenNameCOMMENT_LINE	Specify a SAXSource that takes both an XMLReader and a URL. 
SAXSource	TokenNameIdentifier	 SAX Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
SAXSource	TokenNameIdentifier	 SAX Source
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
"birds.xml"	TokenNameStringLiteral	birds.xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Transform to a file. 	TokenNameCOMMENT_LINE	Transform to a file. 
try	TokenNametry	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
new	TokenNamenew	
StreamResult	TokenNameIdentifier	 Stream Result
(	TokenNameLPAREN	
"birds.out"	TokenNameStringLiteral	birds.out
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The TransformerException wraps someting other than a SAXParseException 	TokenNameCOMMENT_LINE	The TransformerException wraps someting other than a SAXParseException 
// warning or error, either of which should be "caught" by the Handler. 	TokenNameCOMMENT_LINE	warning or error, either of which should be "caught" by the Handler. 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Not a SAXParseException warning or error: "	TokenNameStringLiteral	Not a SAXParseException warning or error: 
+	TokenNamePLUS	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"=====Done====="	TokenNameStringLiteral	=====Done=====
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
"tfactory does not support SAX features!"	TokenNameStringLiteral	tfactory does not support SAX features!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Catch any errors or warnings from the XMLReader. 	TokenNameCOMMENT_LINE	Catch any errors or warnings from the XMLReader. 
class	TokenNameclass	
Handler	TokenNameIdentifier	 Handler
extends	TokenNameextends	
DefaultHandler	TokenNameIdentifier	 Default Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
spe	TokenNameIdentifier	 spe
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"SAXParseException warning: "	TokenNameStringLiteral	SAXParseException warning: 
+	TokenNamePLUS	
spe	TokenNameIdentifier	 spe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
spe	TokenNameIdentifier	 spe
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"SAXParseException error: "	TokenNameStringLiteral	SAXParseException error: 
+	TokenNamePLUS	
spe	TokenNameIdentifier	 spe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
