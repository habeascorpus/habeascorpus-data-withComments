/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TransformerFactoryImpl.java 468640 2006-10-28 06:53:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TransformerFactoryImpl.java 468640 2006-10-28 06:53:53Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XMLConstants	TokenNameIdentifier	 XML Constants
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
Source	TokenNameIdentifier	 Source
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
TrAXFilter	TokenNameIdentifier	 Tr AX Filter
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
TransformerIdentityImpl	TokenNameIdentifier	 Transformer Identity Impl
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
XalanProperties	TokenNameIdentifier	 Xalan Properties
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
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
sax2dtm	TokenNameIdentifier	 sax2dtm
.	TokenNameDOT	
SAX2DTM	TokenNameIdentifier	 SA X2 DTM
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
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
TreeWalker	TokenNameIdentifier	 Tree Walker
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
StylesheetPIHandler	TokenNameIdentifier	 Stylesheet PI Handler
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
StopParseException	TokenNameIdentifier	 Stop Parse Exception
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
XMLFilter	TokenNameIdentifier	 XML Filter
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
/** * The TransformerFactoryImpl, which implements the TRaX TransformerFactory * interface, processes XSLT stylesheets into a Templates object * (a StylesheetRoot). */	TokenNameCOMMENT_JAVADOC	 The TransformerFactoryImpl, which implements the TRaX TransformerFactory interface, processes XSLT stylesheets into a Templates object (a StylesheetRoot). 
public	TokenNamepublic	
class	TokenNameclass	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
extends	TokenNameextends	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
{	TokenNameLBRACE	
/** * The path/filename of the property file: XSLTInfo.properties * Maintenance note: see also * <code>org.apache.xpath.functions.FuncSystemProperty.XSLT_PROPERTIES</code> */	TokenNameCOMMENT_JAVADOC	 The path/filename of the property file: XSLTInfo.properties Maintenance note: see also <code>org.apache.xpath.functions.FuncSystemProperty.XSLT_PROPERTIES</code> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XSLT_PROPERTIES	TokenNameIdentifier	 XSLT  PROPERTIES
=	TokenNameEQUAL	
"org/apache/xalan/res/XSLTInfo.properties"	TokenNameStringLiteral	org/apache/xalan/res/XSLTInfo.properties
;	TokenNameSEMICOLON	
/** * <p>State of secure processing feature.</p> */	TokenNameCOMMENT_JAVADOC	 <p>State of secure processing feature.</p> 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isSecureProcessing	TokenNameIdentifier	 m is Secure Processing
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Constructor TransformerFactoryImpl * */	TokenNameCOMMENT_JAVADOC	 Constructor TransformerFactoryImpl 
public	TokenNamepublic	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Static string to be used for incremental feature */	TokenNameCOMMENT_JAVADOC	 Static string to be used for incremental feature 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FEATURE_INCREMENTAL	TokenNameIdentifier	 FEATURE  INCREMENTAL
=	TokenNameEQUAL	
"http://xml.apache.org/xalan/features/incremental"	TokenNameStringLiteral	http://xml.apache.org/xalan/features/incremental
;	TokenNameSEMICOLON	
/** Static string to be used for optimize feature */	TokenNameCOMMENT_JAVADOC	 Static string to be used for optimize feature 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FEATURE_OPTIMIZE	TokenNameIdentifier	 FEATURE  OPTIMIZE
=	TokenNameEQUAL	
"http://xml.apache.org/xalan/features/optimize"	TokenNameStringLiteral	http://xml.apache.org/xalan/features/optimize
;	TokenNameSEMICOLON	
/** Static string to be used for source_location feature */	TokenNameCOMMENT_JAVADOC	 Static string to be used for source_location feature 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FEATURE_SOURCE_LOCATION	TokenNameIdentifier	 FEATURE  SOURCE  LOCATION
=	TokenNameEQUAL	
XalanProperties	TokenNameIdentifier	 Xalan Properties
.	TokenNameDOT	
SOURCE_LOCATION	TokenNameIdentifier	 SOURCE  LOCATION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Templates	TokenNameIdentifier	 Templates
processFromNode	TokenNameIdentifier	 process From Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
TemplatesHandler	TokenNameIdentifier	 Templates Handler
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
newTemplatesHandler	TokenNameIdentifier	 new Templates Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TreeWalker	TokenNameIdentifier	 Tree Walker
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
new	TokenNamenew	
TreeWalker	TokenNameIdentifier	 Tree Walker
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
DOM2Helper	TokenNameIdentifier	 DO M2 Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
traverse	TokenNameIdentifier	 traverse
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
getTemplates	TokenNameIdentifier	 get Templates
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
if	TokenNameif	
(	TokenNameLPAREN	
m_errorListener	TokenNameIdentifier	 m error Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_errorListener	TokenNameIdentifier	 m error Listener
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Should remove this later... but right now diagnostics from 	TokenNameCOMMENT_LINE	Should remove this later... but right now diagnostics from 
// TransformerConfigurationException are not good. 	TokenNameCOMMENT_LINE	TransformerConfigurationException are not good. 
// se.printStackTrace(); 	TokenNameCOMMENT_LINE	se.printStackTrace(); 
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_PROCESSFROMNODE_FAILED	TokenNameIdentifier	 ER  PROCESSFROMNODE  FAILED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"processFromNode failed", se); 	TokenNameCOMMENT_LINE	"processFromNode failed", se); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
tce	TokenNameIdentifier	 tce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assume it's already been reported to the error listener. 	TokenNameCOMMENT_LINE	Assume it's already been reported to the error listener. 
throw	TokenNamethrow	
tce	TokenNameIdentifier	 tce
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* catch (TransformerException tce) { // Assume it's already been reported to the error listener. throw new TransformerConfigurationException(tce.getMessage(), tce); }*/	TokenNameCOMMENT_BLOCK	 catch (TransformerException tce) { // Assume it's already been reported to the error listener. throw new TransformerConfigurationException(tce.getMessage(), tce); }
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_errorListener	TokenNameIdentifier	 m error Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_errorListener	TokenNameIdentifier	 m error Listener
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Should remove this later... but right now diagnostics from 	TokenNameCOMMENT_LINE	Should remove this later... but right now diagnostics from 
// TransformerConfigurationException are not good. 	TokenNameCOMMENT_LINE	TransformerConfigurationException are not good. 
// se.printStackTrace(); 	TokenNameCOMMENT_LINE	se.printStackTrace(); 
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_PROCESSFROMNODE_FAILED	TokenNameIdentifier	 ER  PROCESSFROMNODE  FAILED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"processFromNode failed", 	TokenNameCOMMENT_LINE	"processFromNode failed", 
//e); 	TokenNameCOMMENT_LINE	e); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The systemID that was specified in * processFromNode(Node node, String systemID). */	TokenNameCOMMENT_JAVADOC	 The systemID that was specified in processFromNode(Node node, String systemID). 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_DOMsystemID	TokenNameIdentifier	 m  DO Msystem ID
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The systemID that was specified in * processFromNode(Node node, String systemID). * * @return The systemID, or null. */	TokenNameCOMMENT_JAVADOC	 The systemID that was specified in processFromNode(Node node, String systemID). * @return The systemID, or null. 
String	TokenNameIdentifier	 String
getDOMsystemID	TokenNameIdentifier	 get DO Msystem ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_DOMsystemID	TokenNameIdentifier	 m  DO Msystem ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process the stylesheet from a DOM tree, if the * processor supports the "http://xml.org/trax/features/dom/input" * feature. * * @param node A DOM tree which must contain * valid transform instructions that this processor understands. * @param systemID The systemID from where xsl:includes and xsl:imports * should be resolved from. * * @return A Templates object capable of being used for transformation purposes. * * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 Process the stylesheet from a DOM tree, if the processor supports the "http://xml.org/trax/features/dom/input" feature. * @param node A DOM tree which must contain valid transform instructions that this processor understands. @param systemID The systemID from where xsl:includes and xsl:imports should be resolved from. * @return A Templates object capable of being used for transformation purposes. * @throws TransformerConfigurationException 
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Templates	TokenNameIdentifier	 Templates
processFromNode	TokenNameIdentifier	 process From Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemID	TokenNameIdentifier	 system ID
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
m_DOMsystemID	TokenNameIdentifier	 m  DO Msystem ID
=	TokenNameEQUAL	
systemID	TokenNameIdentifier	 system ID
;	TokenNameSEMICOLON	
return	TokenNamereturn	
processFromNode	TokenNameIdentifier	 process From Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get InputSource specification(s) that are associated with the * given document specified in the source param, * via the xml-stylesheet processing instruction * (see http://www.w3.org/TR/xml-stylesheet/), and that matches * the given criteria. Note that it is possible to return several stylesheets * that match the criteria, in which case they are applied as if they were * a list of imports or cascades. * * <p>Note that DOM2 has it's own mechanism for discovering stylesheets. * Therefore, there isn't a DOM version of this method.</p> * * * @param source The XML source that is to be searched. * @param media The media attribute to be matched. May be null, in which * case the prefered templates will be used (i.e. alternate = no). * @param title The value of the title attribute to match. May be null. * @param charset The value of the charset attribute to match. May be null. * * @return A Source object capable of being used to create a Templates object. * * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 Get InputSource specification(s) that are associated with the given document specified in the source param, via the xml-stylesheet processing instruction (see http://www.w3.org/TR/xml-stylesheet/), and that matches the given criteria. Note that it is possible to return several stylesheets that match the criteria, in which case they are applied as if they were a list of imports or cascades. * <p>Note that DOM2 has it's own mechanism for discovering stylesheets. Therefore, there isn't a DOM version of this method.</p> * @param source The XML source that is to be searched. @param media The media attribute to be matched. May be null, in which case the prefered templates will be used (i.e. alternate = no). @param title The value of the title attribute to match. May be null. @param charset The value of the charset attribute to match. May be null. * @return A Source object capable of being used to create a Templates object. * @throws TransformerConfigurationException 
public	TokenNamepublic	
Source	TokenNameIdentifier	 Source
getAssociatedStylesheet	TokenNameIdentifier	 get Associated Stylesheet
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
media	TokenNameIdentifier	 media
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
baseID	TokenNameIdentifier	 base ID
;	TokenNameSEMICOLON	
InputSource	TokenNameIdentifier	 Input Source
isource	TokenNameIdentifier	 isource
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
DOMSource	TokenNameIdentifier	 DOM Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DOMSource	TokenNameIdentifier	 DOM Source
dsource	TokenNameIdentifier	 dsource
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMSource	TokenNameIdentifier	 DOM Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
dsource	TokenNameIdentifier	 dsource
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
baseID	TokenNameIdentifier	 base ID
=	TokenNameEQUAL	
dsource	TokenNameIdentifier	 dsource
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
isource	TokenNameIdentifier	 isource
=	TokenNameEQUAL	
SAXSource	TokenNameIdentifier	 SAX Source
.	TokenNameDOT	
sourceToInputSource	TokenNameIdentifier	 source To Input Source
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
baseID	TokenNameIdentifier	 base ID
=	TokenNameEQUAL	
isource	TokenNameIdentifier	 isource
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// What I try to do here is parse until the first startElement 	TokenNameCOMMENT_LINE	What I try to do here is parse until the first startElement 
// is found, then throw a special exception in order to terminate 	TokenNameCOMMENT_LINE	is found, then throw a special exception in order to terminate 
// the parse. 	TokenNameCOMMENT_LINE	the parse. 
StylesheetPIHandler	TokenNameIdentifier	 Stylesheet PI Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
new	TokenNamenew	
StylesheetPIHandler	TokenNameIdentifier	 Stylesheet PI Handler
(	TokenNameLPAREN	
baseID	TokenNameIdentifier	 base ID
,	TokenNameCOMMA	
media	TokenNameIdentifier	 media
,	TokenNameCOMMA	
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use URIResolver. Patch from Dmitri Ilyin 	TokenNameCOMMENT_LINE	Use URIResolver. Patch from Dmitri Ilyin 
if	TokenNameif	
(	TokenNameLPAREN	
m_uriResolver	TokenNameIdentifier	 m uri Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
m_uriResolver	TokenNameIdentifier	 m uri Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TreeWalker	TokenNameIdentifier	 Tree Walker
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
new	TokenNamenew	
TreeWalker	TokenNameIdentifier	 Tree Walker
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
DOM2Helper	TokenNameIdentifier	 DO M2 Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
baseID	TokenNameIdentifier	 base ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
traverse	TokenNameIdentifier	 traverse
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Use JAXP1.1 ( if possible ) 	TokenNameCOMMENT_LINE	Use JAXP1.1 ( if possible ) 
try	TokenNametry	
{	TokenNameLBRACE	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_isSecureProcessing	TokenNameIdentifier	 m is Secure Processing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
FEATURE_SECURE_PROCESSING	TokenNameIdentifier	 FEATURE  SECURE  PROCESSING
,	TokenNameCOMMA	
true	TokenNametrue	
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
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParser	TokenNameIdentifier	 SAX Parser
jaxpParser	TokenNameIdentifier	 jaxp Parser
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
jaxpParser	TokenNameIdentifier	 jaxp Parser
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
FactoryConfigurationError	TokenNameIdentifier	 Factory Configuration Error
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
ex1	TokenNameIdentifier	 ex1
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodError	TokenNameIdentifier	 No Such Method Error
ex2	TokenNameIdentifier	 ex2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
AbstractMethodError	TokenNameIdentifier	 Abstract Method Error
ame	TokenNameIdentifier	 ame
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
.	TokenNameDOT	
createXMLReader	TokenNameIdentifier	 create XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Need to set options! 	TokenNameCOMMENT_LINE	Need to set options! 
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
isource	TokenNameIdentifier	 isource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
StopParseException	TokenNameIdentifier	 Stop Parse Exception
spe	TokenNameIdentifier	 spe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// OK, good. 	TokenNameCOMMENT_LINE	OK, good. 
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
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
"getAssociatedStylesheets failed"	TokenNameStringLiteral	getAssociatedStylesheets failed
,	TokenNameCOMMA	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
"getAssociatedStylesheets failed"	TokenNameStringLiteral	getAssociatedStylesheets failed
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getAssociatedStylesheet	TokenNameIdentifier	 get Associated Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new Transformer object that performs a copy * of the source to the result. * * @return A Transformer object that may be used to perform a transformation * in a single thread, never null. * * @throws TransformerConfigurationException May throw this during * the parse when it is constructing the * Templates object and fails. */	TokenNameCOMMENT_JAVADOC	 Create a new Transformer object that performs a copy of the source to the result. * @return A Transformer object that may be used to perform a transformation in a single thread, never null. * @throws TransformerConfigurationException May throw this during the parse when it is constructing the Templates object and fails. 
public	TokenNamepublic	
TemplatesHandler	TokenNameIdentifier	 Templates Handler
newTemplatesHandler	TokenNameIdentifier	 new Templates Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Set a feature for this <code>TransformerFactory</code> and <code>Transformer</code>s * or <code>Template</code>s created by this factory.</p> * * <p> * Feature names are fully qualified {@link java.net.URI}s. * Implementations may define their own features. * An {@link TransformerConfigurationException} is thrown if this <code>TransformerFactory</code> or the * <code>Transformer</code>s or <code>Template</code>s it creates cannot support the feature. * It is possible for an <code>TransformerFactory</code> to expose a feature value but be unable to change its state. * </p> * * <p>See {@link javax.xml.transform.TransformerFactory} for full documentation of specific features.</p> * * @param name Feature name. * @param value Is feature state <code>true</code> or <code>false</code>. * * @throws TransformerConfigurationException if this <code>TransformerFactory</code> * or the <code>Transformer</code>s or <code>Template</code>s it creates cannot support this feature. * @throws NullPointerException If the <code>name</code> parameter is null. */	TokenNameCOMMENT_JAVADOC	 <p>Set a feature for this <code>TransformerFactory</code> and <code>Transformer</code>s or <code>Template</code>s created by this factory.</p> * <p> Feature names are fully qualified {@link java.net.URI}s. Implementations may define their own features. An {@link TransformerConfigurationException} is thrown if this <code>TransformerFactory</code> or the <code>Transformer</code>s or <code>Template</code>s it creates cannot support the feature. It is possible for an <code>TransformerFactory</code> to expose a feature value but be unable to change its state. </p> * <p>See {@link javax.xml.transform.TransformerFactory} for full documentation of specific features.</p> * @param name Feature name. @param value Is feature state <code>true</code> or <code>false</code>. * @throws TransformerConfigurationException if this <code>TransformerFactory</code> or the <code>Transformer</code>s or <code>Template</code>s it creates cannot support this feature. @throws NullPointerException If the <code>name</code> parameter is null. 
public	TokenNamepublic	
void	TokenNamevoid	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
// feature name cannot be null 	TokenNameCOMMENT_LINE	feature name cannot be null 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
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
ER_SET_FEATURE_NULL_NAME	TokenNameIdentifier	 ER  SET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// secure processing? 	TokenNameCOMMENT_LINE	secure processing? 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
FEATURE_SECURE_PROCESSING	TokenNameIdentifier	 FEATURE  SECURE  PROCESSING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_isSecureProcessing	TokenNameIdentifier	 m is Secure Processing
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This implementation does not support the setting of a feature other than 	TokenNameCOMMENT_LINE	This implementation does not support the setting of a feature other than 
// the secure processing feature. 	TokenNameCOMMENT_LINE	the secure processing feature. 
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_UNSUPPORTED_FEATURE	TokenNameIdentifier	 ER  UNSUPPORTED  FEATURE
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
}	TokenNameRBRACE	
/** * Look up the value of a feature. * <p>The feature name is any fully-qualified URI. It is * possible for an TransformerFactory to recognize a feature name but * to be unable to return its value; this is especially true * in the case of an adapter for a SAX1 Parser, which has * no way of knowing whether the underlying parser is * validating, for example.</p> * * @param name The feature name, which is a fully-qualified URI. * @return The current state of the feature (true or false). */	TokenNameCOMMENT_JAVADOC	 Look up the value of a feature. <p>The feature name is any fully-qualified URI. It is possible for an TransformerFactory to recognize a feature name but to be unable to return its value; this is especially true in the case of an adapter for a SAX1 Parser, which has no way of knowing whether the underlying parser is validating, for example.</p> * @param name The feature name, which is a fully-qualified URI. @return The current state of the feature (true or false). 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// feature name cannot be null 	TokenNameCOMMENT_LINE	feature name cannot be null 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
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
ER_GET_FEATURE_NULL_NAME	TokenNameIdentifier	 ER  GET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Try first with identity comparison, which 	TokenNameCOMMENT_LINE	Try first with identity comparison, which 
// will be faster. 	TokenNameCOMMENT_LINE	will be faster. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DOMResult	TokenNameIdentifier	 DOM Result
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
DOMSource	TokenNameIdentifier	 DOM Source
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
SAXResult	TokenNameIdentifier	 SAX Result
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
SAXSource	TokenNameIdentifier	 SAX Source
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
StreamResult	TokenNameIdentifier	 Stream Result
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
StreamSource	TokenNameIdentifier	 Stream Source
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
.	TokenNameDOT	
FEATURE_XMLFILTER	TokenNameIdentifier	 FEATURE  XMLFILTER
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DOMResult	TokenNameIdentifier	 DOM Result
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
DOMSource	TokenNameIdentifier	 DOM Source
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
SAXResult	TokenNameIdentifier	 SAX Result
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
SAXSource	TokenNameIdentifier	 SAX Source
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
StreamResult	TokenNameIdentifier	 Stream Result
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
StreamSource	TokenNameIdentifier	 Stream Source
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
.	TokenNameDOT	
FEATURE_XMLFILTER	TokenNameIdentifier	 FEATURE  XMLFILTER
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// secure processing? 	TokenNameCOMMENT_LINE	secure processing? 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
FEATURE_SECURE_PROCESSING	TokenNameIdentifier	 FEATURE  SECURE  PROCESSING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
m_isSecureProcessing	TokenNameIdentifier	 m is Secure Processing
;	TokenNameSEMICOLON	
else	TokenNameelse	
// unknown feature 	TokenNameCOMMENT_LINE	unknown feature 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Flag set by FEATURE_OPTIMIZE. * This feature specifies whether to Optimize stylesheet processing. By * default it is set to true. */	TokenNameCOMMENT_JAVADOC	 Flag set by FEATURE_OPTIMIZE. This feature specifies whether to Optimize stylesheet processing. By default it is set to true. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_optimize	TokenNameIdentifier	 m optimize
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** Flag set by FEATURE_SOURCE_LOCATION. * This feature specifies whether the transformation phase should * keep track of line and column numbers for the input source * document. Note that this works only when that * information is available from the source -- in other words, if you * pass in a DOM, there's little we can do for you. * * The default is false. Setting it true may significantly * increase storage cost per node. */	TokenNameCOMMENT_JAVADOC	 Flag set by FEATURE_SOURCE_LOCATION. This feature specifies whether the transformation phase should keep track of line and column numbers for the input source document. Note that this works only when that information is available from the source -- in other words, if you pass in a DOM, there's little we can do for you. * The default is false. Setting it true may significantly increase storage cost per node. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_source_location	TokenNameIdentifier	 m source location
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Flag set by FEATURE_INCREMENTAL. * This feature specifies whether to produce output incrementally, rather than * waiting to finish parsing the input before generating any output. By * default this attribute is set to false. */	TokenNameCOMMENT_JAVADOC	 Flag set by FEATURE_INCREMENTAL. This feature specifies whether to produce output incrementally, rather than waiting to finish parsing the input before generating any output. By default this attribute is set to false. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_incremental	TokenNameIdentifier	 m incremental
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Allows the user to set specific attributes on the underlying * implementation. * * @param name The name of the attribute. * @param value The value of the attribute; Boolean or String="true"|"false" * * @throws IllegalArgumentException thrown if the underlying * implementation doesn't recognize the attribute. */	TokenNameCOMMENT_JAVADOC	 Allows the user to set specific attributes on the underlying implementation. * @param name The name of the attribute. @param value The value of the attribute; Boolean or String="true"|"false" * @throws IllegalArgumentException thrown if the underlying implementation doesn't recognize the attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FEATURE_INCREMENTAL	TokenNameIdentifier	 FEATURE  INCREMENTAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Accept a Boolean object.. 	TokenNameCOMMENT_LINE	Accept a Boolean object.. 
m_incremental	TokenNameIdentifier	 m incremental
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// .. or a String object 	TokenNameCOMMENT_LINE	.. or a String object 
m_incremental	TokenNameIdentifier	 m incremental
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Give a more meaningful error message 	TokenNameCOMMENT_LINE	Give a more meaningful error message 
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
ER_BAD_VALUE	TokenNameIdentifier	 ER  BAD  VALUE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//name + " bad value " + value); 	TokenNameCOMMENT_LINE	name + " bad value " + value); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FEATURE_OPTIMIZE	TokenNameIdentifier	 FEATURE  OPTIMIZE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Accept a Boolean object.. 	TokenNameCOMMENT_LINE	Accept a Boolean object.. 
m_optimize	TokenNameIdentifier	 m optimize
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// .. or a String object 	TokenNameCOMMENT_LINE	.. or a String object 
m_optimize	TokenNameIdentifier	 m optimize
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Give a more meaningful error message 	TokenNameCOMMENT_LINE	Give a more meaningful error message 
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
ER_BAD_VALUE	TokenNameIdentifier	 ER  BAD  VALUE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//name + " bad value " + value); 	TokenNameCOMMENT_LINE	name + " bad value " + value); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Custom Xalan feature: annotate DTM with SAX source locator fields. 	TokenNameCOMMENT_LINE	Custom Xalan feature: annotate DTM with SAX source locator fields. 
// This gets used during SAX2DTM instantiation. 	TokenNameCOMMENT_LINE	This gets used during SAX2DTM instantiation. 
// 	TokenNameCOMMENT_LINE	 
// %REVIEW% Should the name of this field really be in XalanProperties? 	TokenNameCOMMENT_LINE	%REVIEW% Should the name of this field really be in XalanProperties? 
// %REVIEW% I hate that it's a global static, but didn't want to change APIs yet. 	TokenNameCOMMENT_LINE	%REVIEW% I hate that it's a global static, but didn't want to change APIs yet. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FEATURE_SOURCE_LOCATION	TokenNameIdentifier	 FEATURE  SOURCE  LOCATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Accept a Boolean object.. 	TokenNameCOMMENT_LINE	Accept a Boolean object.. 
m_source_location	TokenNameIdentifier	 m source location
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// .. or a String object 	TokenNameCOMMENT_LINE	.. or a String object 
m_source_location	TokenNameIdentifier	 m source location
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Give a more meaningful error message 	TokenNameCOMMENT_LINE	Give a more meaningful error message 
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
ER_BAD_VALUE	TokenNameIdentifier	 ER  BAD  VALUE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//name + " bad value " + value); 	TokenNameCOMMENT_LINE	name + " bad value " + value); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
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
ER_NOT_SUPPORTED	TokenNameIdentifier	 ER  NOT  SUPPORTED
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
//name + "not supported"); 	TokenNameCOMMENT_LINE	name + "not supported"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Allows the user to retrieve specific attributes on the underlying * implementation. * * @param name The name of the attribute. * @return value The value of the attribute. * * @throws IllegalArgumentException thrown if the underlying * implementation doesn't recognize the attribute. */	TokenNameCOMMENT_JAVADOC	 Allows the user to retrieve specific attributes on the underlying implementation. * @param name The name of the attribute. @return value The value of the attribute. * @throws IllegalArgumentException thrown if the underlying implementation doesn't recognize the attribute. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FEATURE_INCREMENTAL	TokenNameIdentifier	 FEATURE  INCREMENTAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
m_incremental	TokenNameIdentifier	 m incremental
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
FEATURE_OPTIMIZE	TokenNameIdentifier	 FEATURE  OPTIMIZE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
m_optimize	TokenNameIdentifier	 m optimize
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
FEATURE_SOURCE_LOCATION	TokenNameIdentifier	 FEATURE  SOURCE  LOCATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
m_source_location	TokenNameIdentifier	 m source location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
ER_ATTRIB_VALUE_NOT_RECOGNIZED	TokenNameIdentifier	 ER  ATTRIB  VALUE  NOT  RECOGNIZED
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
//name + " attribute not recognized"); 	TokenNameCOMMENT_LINE	name + " attribute not recognized"); 
}	TokenNameRBRACE	
/** * Create an XMLFilter that uses the given source as the * transformation instructions. * * @param src The source of the transformation instructions. * * @return An XMLFilter object, or null if this feature is not supported. * * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 Create an XMLFilter that uses the given source as the transformation instructions. * @param src The source of the transformation instructions. * @return An XMLFilter object, or null if this feature is not supported. * @throws TransformerConfigurationException 
public	TokenNamepublic	
XMLFilter	TokenNameIdentifier	 XML Filter
newXMLFilter	TokenNameIdentifier	 new XML Filter
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
Templates	TokenNameIdentifier	 Templates
templates	TokenNameIdentifier	 templates
=	TokenNameEQUAL	
newTemplates	TokenNameIdentifier	 new Templates
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
templates	TokenNameIdentifier	 templates
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newXMLFilter	TokenNameIdentifier	 new XML Filter
(	TokenNameLPAREN	
templates	TokenNameIdentifier	 templates
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an XMLFilter that uses the given source as the * transformation instructions. * * @param templates non-null reference to Templates object. * * @return An XMLFilter object, or null if this feature is not supported. * * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 Create an XMLFilter that uses the given source as the transformation instructions. * @param templates non-null reference to Templates object. * @return An XMLFilter object, or null if this feature is not supported. * @throws TransformerConfigurationException 
public	TokenNamepublic	
XMLFilter	TokenNameIdentifier	 XML Filter
newXMLFilter	TokenNameIdentifier	 new XML Filter
(	TokenNameLPAREN	
Templates	TokenNameIdentifier	 Templates
templates	TokenNameIdentifier	 templates
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TrAXFilter	TokenNameIdentifier	 Tr AX Filter
(	TokenNameLPAREN	
templates	TokenNameIdentifier	 templates
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_errorListener	TokenNameIdentifier	 m error Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_errorListener	TokenNameIdentifier	 m error Listener
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex1	TokenNameIdentifier	 ex1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get a TransformerHandler object that can process SAX * ContentHandler events into a Result, based on the transformation * instructions specified by the argument. * * @param src The source of the transformation instructions. * * @return TransformerHandler ready to transform SAX events. * * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 Get a TransformerHandler object that can process SAX ContentHandler events into a Result, based on the transformation instructions specified by the argument. * @param src The source of the transformation instructions. * @return TransformerHandler ready to transform SAX events. * @throws TransformerConfigurationException 
public	TokenNamepublic	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
newTransformerHandler	TokenNameIdentifier	 new Transformer Handler
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
Templates	TokenNameIdentifier	 Templates
templates	TokenNameIdentifier	 templates
=	TokenNameEQUAL	
newTemplates	TokenNameIdentifier	 new Templates
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
templates	TokenNameIdentifier	 templates
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newTransformerHandler	TokenNameIdentifier	 new Transformer Handler
(	TokenNameLPAREN	
templates	TokenNameIdentifier	 templates
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a TransformerHandler object that can process SAX * ContentHandler events into a Result, based on the Templates argument. * * @param templates The source of the transformation instructions. * * @return TransformerHandler ready to transform SAX events. * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 Get a TransformerHandler object that can process SAX ContentHandler events into a Result, based on the Templates argument. * @param templates The source of the transformation instructions. * @return TransformerHandler ready to transform SAX events. @throws TransformerConfigurationException 
public	TokenNamepublic	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
newTransformerHandler	TokenNameIdentifier	 new Transformer Handler
(	TokenNameLPAREN	
Templates	TokenNameIdentifier	 Templates
templates	TokenNameIdentifier	 templates
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
)	TokenNameRPAREN	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
m_uriResolver	TokenNameIdentifier	 m uri Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getInputContentHandler	TokenNameIdentifier	 get Input Content Handler
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_errorListener	TokenNameIdentifier	 m error Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_errorListener	TokenNameIdentifier	 m error Listener
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex1	TokenNameIdentifier	 ex1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// /** The identity transform string, for support of newTransformerHandler() 	TokenNameCOMMENT_LINE	/** The identity transform string, for support of newTransformerHandler() 
// * and newTransformer(). */ 	TokenNameCOMMENT_LINE	* and newTransformer(). */ 
// private static final String identityTransform = 	TokenNameCOMMENT_LINE	private static final String identityTransform = 
// "<xsl:stylesheet " + "xmlns:xsl='http://www.w3.org/1999/XSL/Transform' " 	TokenNameCOMMENT_LINE	"<xsl:stylesheet " + "xmlns:xsl='http://www.w3.org/1999/XSL/Transform' " 
// + "version='1.0'>" + "<xsl:template match='/|node()'>" 	TokenNameCOMMENT_LINE	+ "version='1.0'>" + "<xsl:template match='/|node()'>" 
// + "<xsl:copy-of select='.'/>" + "</xsl:template>" + "</xsl:stylesheet>"; 	TokenNameCOMMENT_LINE	+ "<xsl:copy-of select='.'/>" + "</xsl:template>" + "</xsl:stylesheet>"; 
// 	TokenNameCOMMENT_LINE	 
// /** The identity transform Templates, built from identityTransform, 	TokenNameCOMMENT_LINE	/** The identity transform Templates, built from identityTransform, 
// * for support of newTransformerHandler() and newTransformer(). */ 	TokenNameCOMMENT_LINE	* for support of newTransformerHandler() and newTransformer(). */ 
// private static Templates m_identityTemplate = null; 	TokenNameCOMMENT_LINE	private static Templates m_identityTemplate = null; 
/** * Get a TransformerHandler object that can process SAX * ContentHandler events into a Result. * * @return TransformerHandler ready to transform SAX events. * * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 Get a TransformerHandler object that can process SAX ContentHandler events into a Result. * @return TransformerHandler ready to transform SAX events. * @throws TransformerConfigurationException 
public	TokenNamepublic	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
newTransformerHandler	TokenNameIdentifier	 new Transformer Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TransformerIdentityImpl	TokenNameIdentifier	 Transformer Identity Impl
(	TokenNameLPAREN	
m_isSecureProcessing	TokenNameIdentifier	 m is Secure Processing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process the source into a Transformer object. Care must * be given to know that this object can not be used concurrently * in multiple threads. * * @param source An object that holds a URL, input stream, etc. * * @return A Transformer object capable of * being used for transformation purposes in a single thread. * * @throws TransformerConfigurationException May throw this during the parse when it * is constructing the Templates object and fails. */	TokenNameCOMMENT_JAVADOC	 Process the source into a Transformer object. Care must be given to know that this object can not be used concurrently in multiple threads. * @param source An object that holds a URL, input stream, etc. * @return A Transformer object capable of being used for transformation purposes in a single thread. * @throws TransformerConfigurationException May throw this during the parse when it is constructing the Templates object and fails. 
public	TokenNamepublic	
Transformer	TokenNameIdentifier	 Transformer
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Templates	TokenNameIdentifier	 Templates
tmpl	TokenNameIdentifier	 tmpl
=	TokenNameEQUAL	
newTemplates	TokenNameIdentifier	 new Templates
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* this can happen if an ErrorListener is present and it doesn't throw any exception in fatalError. The spec says: "a Transformer must use this interface instead of throwing an exception" - the newTemplates() does that, and returns null. */	TokenNameCOMMENT_BLOCK	 this can happen if an ErrorListener is present and it doesn't throw any exception in fatalError. The spec says: "a Transformer must use this interface instead of throwing an exception" - the newTemplates() does that, and returns null. 
if	TokenNameif	
(	TokenNameLPAREN	
tmpl	TokenNameIdentifier	 tmpl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
tmpl	TokenNameIdentifier	 tmpl
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
m_uriResolver	TokenNameIdentifier	 m uri Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_errorListener	TokenNameIdentifier	 m error Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_errorListener	TokenNameIdentifier	 m error Listener
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex1	TokenNameIdentifier	 ex1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a new Transformer object that performs a copy * of the source to the result. * * @return A Transformer object capable of * being used for transformation purposes in a single thread. * * @throws TransformerConfigurationException May throw this during * the parse when it is constructing the * Templates object and it fails. */	TokenNameCOMMENT_JAVADOC	 Create a new Transformer object that performs a copy of the source to the result. * @return A Transformer object capable of being used for transformation purposes in a single thread. * @throws TransformerConfigurationException May throw this during the parse when it is constructing the Templates object and it fails. 
public	TokenNamepublic	
Transformer	TokenNameIdentifier	 Transformer
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TransformerIdentityImpl	TokenNameIdentifier	 Transformer Identity Impl
(	TokenNameLPAREN	
m_isSecureProcessing	TokenNameIdentifier	 m is Secure Processing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process the source into a Templates object, which is likely * a compiled representation of the source. This Templates object * may then be used concurrently across multiple threads. Creating * a Templates object allows the TransformerFactory to do detailed * performance optimization of transformation instructions, without * penalizing runtime transformation. * * @param source An object that holds a URL, input stream, etc. * @return A Templates object capable of being used for transformation purposes. * * @throws TransformerConfigurationException May throw this during the parse when it * is constructing the Templates object and fails. */	TokenNameCOMMENT_JAVADOC	 Process the source into a Templates object, which is likely a compiled representation of the source. This Templates object may then be used concurrently across multiple threads. Creating a Templates object allows the TransformerFactory to do detailed performance optimization of transformation instructions, without penalizing runtime transformation. * @param source An object that holds a URL, input stream, etc. @return A Templates object capable of being used for transformation purposes. * @throws TransformerConfigurationException May throw this during the parse when it is constructing the Templates object and fails. 
public	TokenNamepublic	
Templates	TokenNameIdentifier	 Templates
newTemplates	TokenNameIdentifier	 new Templates
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
baseID	TokenNameIdentifier	 base ID
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
baseID	TokenNameIdentifier	 base ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseID	TokenNameIdentifier	 base ID
=	TokenNameEQUAL	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
.	TokenNameDOT	
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
baseID	TokenNameIdentifier	 base ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
DOMSource	TokenNameIdentifier	 DOM Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DOMSource	TokenNameIdentifier	 DOM Source
dsource	TokenNameIdentifier	 dsource
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMSource	TokenNameIdentifier	 DOM Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
dsource	TokenNameIdentifier	 dsource
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
return	TokenNamereturn	
processFromNode	TokenNameIdentifier	 process From Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
baseID	TokenNameIdentifier	 base ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
messageStr	TokenNameIdentifier	 message Str
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_ILLEGAL_DOMSOURCE_INPUT	TokenNameIdentifier	 ER  ILLEGAL  DOMSOURCE  INPUT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
messageStr	TokenNameIdentifier	 message Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
TemplatesHandler	TokenNameIdentifier	 Templates Handler
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
newTemplatesHandler	TokenNameIdentifier	 new Templates Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
baseID	TokenNameIdentifier	 base ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
InputSource	TokenNameIdentifier	 Input Source
isource	TokenNameIdentifier	 isource
=	TokenNameEQUAL	
SAXSource	TokenNameIdentifier	 SAX Source
.	TokenNameDOT	
sourceToInputSource	TokenNameIdentifier	 source To Input Source
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isource	TokenNameIdentifier	 isource
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
baseID	TokenNameIdentifier	 base ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
SAXSource	TokenNameIdentifier	 SAX Source
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
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
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Use JAXP1.1 ( if possible ) 	TokenNameCOMMENT_LINE	Use JAXP1.1 ( if possible ) 
try	TokenNametry	
{	TokenNameLBRACE	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_isSecureProcessing	TokenNameIdentifier	 m is Secure Processing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
FEATURE_SECURE_PROCESSING	TokenNameIdentifier	 FEATURE  SECURE  PROCESSING
,	TokenNameCOMMA	
true	TokenNametrue	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParser	TokenNameIdentifier	 SAX Parser
jaxpParser	TokenNameIdentifier	 jaxp Parser
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
jaxpParser	TokenNameIdentifier	 jaxp Parser
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
FactoryConfigurationError	TokenNameIdentifier	 Factory Configuration Error
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
ex1	TokenNameIdentifier	 ex1
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodError	TokenNameIdentifier	 No Such Method Error
ex2	TokenNameIdentifier	 ex2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
AbstractMethodError	TokenNameIdentifier	 Abstract Method Error
ame	TokenNameIdentifier	 ame
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
.	TokenNameDOT	
createXMLReader	TokenNameIdentifier	 create XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If you set the namespaces to true, we'll end up getting double 	TokenNameCOMMENT_LINE	If you set the namespaces to true, we'll end up getting double 
// xmlns attributes. Needs to be fixed. -sb 	TokenNameCOMMENT_LINE	xmlns attributes. Needs to be fixed. -sb 
// reader.setFeature("http://xml.org/sax/features/namespace-prefixes", true); 	TokenNameCOMMENT_LINE	reader.setFeature("http://xml.org/sax/features/namespace-prefixes", true); 
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
isource	TokenNameIdentifier	 isource
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
if	TokenNameif	
(	TokenNameLPAREN	
m_errorListener	TokenNameIdentifier	 m error Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_errorListener	TokenNameIdentifier	 m error Listener
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex1	TokenNameIdentifier	 ex1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
se	TokenNameIdentifier	 se
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
if	TokenNameif	
(	TokenNameLPAREN	
m_errorListener	TokenNameIdentifier	 m error Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_errorListener	TokenNameIdentifier	 m error Listener
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex1	TokenNameIdentifier	 ex1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
getTemplates	TokenNameIdentifier	 get Templates
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The object that implements the URIResolver interface, * or null. */	TokenNameCOMMENT_JAVADOC	 The object that implements the URIResolver interface, or null. 
URIResolver	TokenNameIdentifier	 URI Resolver
m_uriResolver	TokenNameIdentifier	 m uri Resolver
;	TokenNameSEMICOLON	
/** * Set an object that will be used to resolve URIs used in * xsl:import, etc. This will be used as the default for the * transformation. * @param resolver An object that implements the URIResolver interface, * or null. */	TokenNameCOMMENT_JAVADOC	 Set an object that will be used to resolve URIs used in xsl:import, etc. This will be used as the default for the transformation. @param resolver An object that implements the URIResolver interface, or null. 
public	TokenNamepublic	
void	TokenNamevoid	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
URIResolver	TokenNameIdentifier	 URI Resolver
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_uriResolver	TokenNameIdentifier	 m uri Resolver
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the object that will be used to resolve URIs used in * xsl:import, etc. This will be used as the default for the * transformation. * * @return The URIResolver that was set with setURIResolver. */	TokenNameCOMMENT_JAVADOC	 Get the object that will be used to resolve URIs used in xsl:import, etc. This will be used as the default for the transformation. * @return The URIResolver that was set with setURIResolver. 
public	TokenNamepublic	
URIResolver	TokenNameIdentifier	 URI Resolver
getURIResolver	TokenNameIdentifier	 get URI Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_uriResolver	TokenNameIdentifier	 m uri Resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The error listener. */	TokenNameCOMMENT_JAVADOC	 The error listener. 
private	TokenNameprivate	
ErrorListener	TokenNameIdentifier	 Error Listener
m_errorListener	TokenNameIdentifier	 m error Listener
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
/** * Get the error listener in effect for the TransformerFactory. * * @return A non-null reference to an error listener. */	TokenNameCOMMENT_JAVADOC	 Get the error listener in effect for the TransformerFactory. * @return A non-null reference to an error listener. 
public	TokenNamepublic	
ErrorListener	TokenNameIdentifier	 Error Listener
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_errorListener	TokenNameIdentifier	 m error Listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an error listener for the TransformerFactory. * * @param listener Must be a non-null reference to an ErrorListener. * * @throws IllegalArgumentException if the listener argument is null. */	TokenNameCOMMENT_JAVADOC	 Set an error listener for the TransformerFactory. * @param listener Must be a non-null reference to an ErrorListener. * @throws IllegalArgumentException if the listener argument is null. 
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
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
listener	TokenNameIdentifier	 listener
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
ER_ERRORLISTENER	TokenNameIdentifier	 ER  ERRORLISTENER
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "ErrorListener"); 	TokenNameCOMMENT_LINE	"ErrorListener"); 
m_errorListener	TokenNameIdentifier	 m error Listener
=	TokenNameEQUAL	
listener	TokenNameIdentifier	 listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the state of the secure processing feature. * * @return state of the secure processing feature. */	TokenNameCOMMENT_JAVADOC	 Return the state of the secure processing feature. * @return state of the secure processing feature. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSecureProcessing	TokenNameIdentifier	 is Secure Processing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_isSecureProcessing	TokenNameIdentifier	 m is Secure Processing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
