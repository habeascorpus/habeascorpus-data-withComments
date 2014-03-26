/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TemplatesHandlerImpl.java 577935 2007-09-20 21:35:20Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TemplatesHandlerImpl.java 577935 2007-09-20 21:35:20Z minchau $ 
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
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
TemplatesHandler	TokenNameIdentifier	 Templates Handler
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
CompilerException	TokenNameIdentifier	 Compiler Exception
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
Parser	TokenNameIdentifier	 Parser
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
SourceLoader	TokenNameIdentifier	 Source Loader
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
Stylesheet	TokenNameIdentifier	 Stylesheet
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
SyntaxTreeNode	TokenNameIdentifier	 Syntax Tree Node
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
XSLTC	TokenNameIdentifier	 XSLTC
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
Locator	TokenNameIdentifier	 Locator
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
Attributes	TokenNameIdentifier	 Attributes
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * Implementation of a JAXP1.1 TemplatesHandler * @author Morten Jorgensen * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 Implementation of a JAXP1.1 TemplatesHandler @author Morten Jorgensen @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
class	TokenNameclass	
TemplatesHandlerImpl	TokenNameIdentifier	 Templates Handler Impl
implements	TokenNameimplements	
ContentHandler	TokenNameIdentifier	 Content Handler
,	TokenNameCOMMA	
TemplatesHandler	TokenNameIdentifier	 Templates Handler
,	TokenNameCOMMA	
SourceLoader	TokenNameIdentifier	 Source Loader
{	TokenNameLBRACE	
/** * System ID for this stylesheet. */	TokenNameCOMMENT_JAVADOC	 System ID for this stylesheet. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
/** * Number of spaces to add for output indentation. */	TokenNameCOMMENT_JAVADOC	 Number of spaces to add for output indentation. 
private	TokenNameprivate	
int	TokenNameint	
_indentNumber	TokenNameIdentifier	 indent Number
;	TokenNameSEMICOLON	
/** * This URIResolver is passed to all Transformers. */	TokenNameCOMMENT_JAVADOC	 This URIResolver is passed to all Transformers. 
private	TokenNameprivate	
URIResolver	TokenNameIdentifier	 URI Resolver
_uriResolver	TokenNameIdentifier	 uri Resolver
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * A reference to the transformer factory that this templates * object belongs to. */	TokenNameCOMMENT_JAVADOC	 A reference to the transformer factory that this templates object belongs to. 
private	TokenNameprivate	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
_tfactory	TokenNameIdentifier	 tfactory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * A reference to XSLTC's parser object. */	TokenNameCOMMENT_JAVADOC	 A reference to XSLTC's parser object. 
private	TokenNameprivate	
Parser	TokenNameIdentifier	 Parser
_parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The created Templates object. */	TokenNameCOMMENT_JAVADOC	 The created Templates object. 
private	TokenNameprivate	
TemplatesImpl	TokenNameIdentifier	 Templates Impl
_templates	TokenNameIdentifier	 templates
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Default constructor */	TokenNameCOMMENT_JAVADOC	 Default constructor 
protected	TokenNameprotected	
TemplatesHandlerImpl	TokenNameIdentifier	 Templates Handler Impl
(	TokenNameLPAREN	
int	TokenNameint	
indentNumber	TokenNameIdentifier	 indent Number
,	TokenNameCOMMA	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
tfactory	TokenNameIdentifier	 tfactory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_indentNumber	TokenNameIdentifier	 indent Number
=	TokenNameEQUAL	
indentNumber	TokenNameIdentifier	 indent Number
;	TokenNameSEMICOLON	
_tfactory	TokenNameIdentifier	 tfactory
=	TokenNameEQUAL	
tfactory	TokenNameIdentifier	 tfactory
;	TokenNameSEMICOLON	
// Instantiate XSLTC and get reference to parser object 	TokenNameCOMMENT_LINE	Instantiate XSLTC and get reference to parser object 
XSLTC	TokenNameIdentifier	 XSLTC
xsltc	TokenNameIdentifier	 xsltc
=	TokenNameEQUAL	
new	TokenNamenew	
XSLTC	TokenNameIdentifier	 XSLTC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tfactory	TokenNameIdentifier	 tfactory
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
FEATURE_SECURE_PROCESSING	TokenNameIdentifier	 FEATURE  SECURE  PROCESSING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setSecureProcessing	TokenNameIdentifier	 set Secure Processing
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tfactory	TokenNameIdentifier	 tfactory
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
.	TokenNameDOT	
ENABLE_INLINING	TokenNameIdentifier	 ENABLE  INLINING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setTemplateInlining	TokenNameIdentifier	 set Template Inlining
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setTemplateInlining	TokenNameIdentifier	 set Template Inlining
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements javax.xml.transform.sax.TemplatesHandler.getSystemId() * Get the base ID (URI or system ID) from where relative URLs will be * resolved. * @return The systemID that was set with setSystemId(String id) */	TokenNameCOMMENT_JAVADOC	 Implements javax.xml.transform.sax.TemplatesHandler.getSystemId() Get the base ID (URI or system ID) from where relative URLs will be resolved. @return The systemID that was set with setSystemId(String id) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements javax.xml.transform.sax.TemplatesHandler.setSystemId() * Get the base ID (URI or system ID) from where relative URLs will be * resolved. * @param id Base URI for this stylesheet */	TokenNameCOMMENT_JAVADOC	 Implements javax.xml.transform.sax.TemplatesHandler.setSystemId() Get the base ID (URI or system ID) from where relative URLs will be resolved. @param id Base URI for this stylesheet 
public	TokenNamepublic	
void	TokenNamevoid	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Store URIResolver needed for Transformers. */	TokenNameCOMMENT_JAVADOC	 Store URIResolver needed for Transformers. 
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
/** * Implements javax.xml.transform.sax.TemplatesHandler.getTemplates() * When a TemplatesHandler object is used as a ContentHandler or * DocumentHandler for the parsing of transformation instructions, it * creates a Templates object, which the caller can get once the SAX * events have been completed. * @return The Templates object that was created during the SAX event * process, or null if no Templates object has been created. */	TokenNameCOMMENT_JAVADOC	 Implements javax.xml.transform.sax.TemplatesHandler.getTemplates() When a TemplatesHandler object is used as a ContentHandler or DocumentHandler for the parsing of transformation instructions, it creates a Templates object, which the caller can get once the SAX events have been completed. @return The Templates object that was created during the SAX event process, or null if no Templates object has been created. 
public	TokenNamepublic	
Templates	TokenNameIdentifier	 Templates
getTemplates	TokenNameIdentifier	 get Templates
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_templates	TokenNameIdentifier	 templates
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method implements XSLTC's SourceLoader interface. It is used to * glue a TrAX URIResolver to the XSLTC compiler's Input and Import classes. * * @param href The URI of the document to load * @param context The URI of the currently loaded document * @param xsltc The compiler that resuests the document * @return An InputSource with the loaded document */	TokenNameCOMMENT_JAVADOC	 This method implements XSLTC's SourceLoader interface. It is used to glue a TrAX URIResolver to the XSLTC compiler's Input and Import classes. * @param href The URI of the document to load @param context The URI of the currently loaded document @param xsltc The compiler that resuests the document @return An InputSource with the loaded document 
public	TokenNamepublic	
InputSource	TokenNameIdentifier	 Input Source
loadSource	TokenNameIdentifier	 load Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
href	TokenNameIdentifier	 href
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
XSLTC	TokenNameIdentifier	 XSLTC
xsltc	TokenNameIdentifier	 xsltc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// A _uriResolver must be set if this method is called 	TokenNameCOMMENT_LINE	A _uriResolver must be set if this method is called 
final	TokenNamefinal	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
_uriResolver	TokenNameIdentifier	 uri Resolver
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
href	TokenNameIdentifier	 href
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
getInputSource	TokenNameIdentifier	 get Input Source
(	TokenNameLPAREN	
xsltc	TokenNameIdentifier	 xsltc
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Falls through 	TokenNameCOMMENT_LINE	Falls through 
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -- ContentHandler -------------------------------------------------- 	TokenNameCOMMENT_LINE	-- ContentHandler -------------------------------------------------- 
/** * Re-initialize parser and forward SAX2 event. */	TokenNameCOMMENT_JAVADOC	 Re-initialize parser and forward SAX2 event. 
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSLTC	TokenNameIdentifier	 XSLTC
xsltc	TokenNameIdentifier	 xsltc
=	TokenNameEQUAL	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getXSLTC	TokenNameIdentifier	 get XSLTC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// calls _parser.init() 	TokenNameCOMMENT_LINE	calls _parser.init() 
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setOutputType	TokenNameIdentifier	 set Output Type
(	TokenNameLPAREN	
XSLTC	TokenNameIdentifier	 XSLTC
.	TokenNameDOT	
BYTEARRAY_OUTPUT	TokenNameIdentifier	 BYTEARRAY  OUTPUT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Just forward SAX2 event to parser object. */	TokenNameCOMMENT_JAVADOC	 Just forward SAX2 event to parser object. 
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create the templates 	TokenNameCOMMENT_LINE	create the templates 
try	TokenNametry	
{	TokenNameLBRACE	
XSLTC	TokenNameIdentifier	 XSLTC
xsltc	TokenNameIdentifier	 xsltc
=	TokenNameEQUAL	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getXSLTC	TokenNameIdentifier	 get XSLTC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the translet class name if not already set 	TokenNameCOMMENT_LINE	Set the translet class name if not already set 
String	TokenNameIdentifier	 String
transletName	TokenNameIdentifier	 translet Name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_systemId	TokenNameIdentifier	 system Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transletName	TokenNameIdentifier	 translet Name
=	TokenNameEQUAL	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
baseName	TokenNameIdentifier	 base Name
(	TokenNameLPAREN	
_systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
transletName	TokenNameIdentifier	 translet Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
_tfactory	TokenNameIdentifier	 tfactory
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"translet-name"	TokenNameStringLiteral	translet-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setClassName	TokenNameIdentifier	 set Class Name
(	TokenNameLPAREN	
transletName	TokenNameIdentifier	 translet Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get java-legal class name from XSLTC module 	TokenNameCOMMENT_LINE	Get java-legal class name from XSLTC module 
transletName	TokenNameIdentifier	 translet Name
=	TokenNameEQUAL	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Stylesheet	TokenNameIdentifier	 Stylesheet
stylesheet	TokenNameIdentifier	 stylesheet
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
SyntaxTreeNode	TokenNameIdentifier	 Syntax Tree Node
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getDocumentRoot	TokenNameIdentifier	 get Document Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Compile the translet - this is where the work is done! 	TokenNameCOMMENT_LINE	Compile the translet - this is where the work is done! 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
errorsFound	TokenNameIdentifier	 errors Found
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
root	TokenNameIdentifier	 root
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Create a Stylesheet element from the root node 	TokenNameCOMMENT_LINE	Create a Stylesheet element from the root node 
stylesheet	TokenNameIdentifier	 stylesheet
=	TokenNameEQUAL	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
makeStylesheet	TokenNameIdentifier	 make Stylesheet
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
_systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
setParentStylesheet	TokenNameIdentifier	 set Parent Stylesheet
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
getTemplateInlining	TokenNameIdentifier	 get Template Inlining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
setTemplateInlining	TokenNameIdentifier	 set Template Inlining
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
setTemplateInlining	TokenNameIdentifier	 set Template Inlining
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set a document loader (for xsl:include/import) if defined 	TokenNameCOMMENT_LINE	Set a document loader (for xsl:include/import) if defined 
if	TokenNameif	
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
setSourceLoader	TokenNameIdentifier	 set Source Loader
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setCurrentStylesheet	TokenNameIdentifier	 set Current Stylesheet
(	TokenNameLPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set it as top-level in the XSLTC object 	TokenNameCOMMENT_LINE	Set it as top-level in the XSLTC object 
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setStylesheet	TokenNameIdentifier	 set Stylesheet
(	TokenNameLPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create AST under the Stylesheet element 	TokenNameCOMMENT_LINE	Create AST under the Stylesheet element 
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
createAST	TokenNameIdentifier	 create AST
(	TokenNameLPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Generate the bytecodes and output the translet class(es) 	TokenNameCOMMENT_LINE	Generate the bytecodes and output the translet class(es) 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
errorsFound	TokenNameIdentifier	 errors Found
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
stylesheet	TokenNameIdentifier	 stylesheet
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
setMultiDocument	TokenNameIdentifier	 set Multi Document
(	TokenNameLPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
isMultiDocument	TokenNameIdentifier	 is Multi Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
setHasIdCall	TokenNameIdentifier	 set Has Id Call
(	TokenNameLPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
hasIdCall	TokenNameIdentifier	 has Id Call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Class synchronization is needed for BCEL 	TokenNameCOMMENT_LINE	Class synchronization is needed for BCEL 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
errorsFound	TokenNameIdentifier	 errors Found
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check that the transformation went well before returning 	TokenNameCOMMENT_LINE	Check that the transformation went well before returning 
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytecodes	TokenNameIdentifier	 bytecodes
=	TokenNameEQUAL	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
getBytecodes	TokenNameIdentifier	 get Bytecodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytecodes	TokenNameIdentifier	 bytecodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_templates	TokenNameIdentifier	 templates
=	TokenNameEQUAL	
new	TokenNamenew	
TemplatesImpl	TokenNameIdentifier	 Templates Impl
(	TokenNameLPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
getBytecodes	TokenNameIdentifier	 get Bytecodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
transletName	TokenNameIdentifier	 translet Name
,	TokenNameCOMMA	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getOutputProperties	TokenNameIdentifier	 get Output Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
_indentNumber	TokenNameIdentifier	 indent Number
,	TokenNameCOMMA	
_tfactory	TokenNameIdentifier	 tfactory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set URIResolver on templates object 	TokenNameCOMMENT_LINE	Set URIResolver on templates object 
if	TokenNameif	
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
errorMessage	TokenNameIdentifier	 error Message
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
errors	TokenNameIdentifier	 errors
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
errorMessage	TokenNameIdentifier	 error Message
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
errorMessage	TokenNameIdentifier	 error Message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errorMessage	TokenNameIdentifier	 error Message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
errors	TokenNameIdentifier	 errors
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_COMPILE_ERR	TokenNameIdentifier	 JAXP  COMPILE  ERR
,	TokenNameCOMMA	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
errorMessage	TokenNameIdentifier	 error Message
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CompilerException	TokenNameIdentifier	 Compiler Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_COMPILE_ERR	TokenNameIdentifier	 JAXP  COMPILE  ERR
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Just forward SAX2 event to parser object. */	TokenNameCOMMENT_JAVADOC	 Just forward SAX2 event to parser object. 
public	TokenNamepublic	
void	TokenNamevoid	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Just forward SAX2 event to parser object. */	TokenNameCOMMENT_JAVADOC	 Just forward SAX2 event to parser object. 
public	TokenNamepublic	
void	TokenNamevoid	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Just forward SAX2 event to parser object. */	TokenNameCOMMENT_JAVADOC	 Just forward SAX2 event to parser object. 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localname	TokenNameIdentifier	 localname
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localname	TokenNameIdentifier	 localname
,	TokenNameCOMMA	
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Just forward SAX2 event to parser object. */	TokenNameCOMMENT_JAVADOC	 Just forward SAX2 event to parser object. 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localname	TokenNameIdentifier	 localname
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localname	TokenNameIdentifier	 localname
,	TokenNameCOMMA	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Just forward SAX2 event to parser object. */	TokenNameCOMMENT_JAVADOC	 Just forward SAX2 event to parser object. 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
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
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Just forward SAX2 event to parser object. */	TokenNameCOMMENT_JAVADOC	 Just forward SAX2 event to parser object. 
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Just forward SAX2 event to parser object. */	TokenNameCOMMENT_JAVADOC	 Just forward SAX2 event to parser object. 
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
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
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Just forward SAX2 event to parser object. */	TokenNameCOMMENT_JAVADOC	 Just forward SAX2 event to parser object. 
public	TokenNamepublic	
void	TokenNamevoid	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set internal system Id and forward SAX2 event to parser object. */	TokenNameCOMMENT_JAVADOC	 Set internal system Id and forward SAX2 event to parser object. 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
