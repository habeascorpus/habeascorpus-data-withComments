/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SymbolTable	TokenNameIdentifier	 Symbol Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xinclude	TokenNameIdentifier	 xinclude
.	TokenNameDOT	
XIncludeHandler	TokenNameIdentifier	 X Include Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xinclude	TokenNameIdentifier	 xinclude
.	TokenNameDOT	
XIncludeNamespaceSupport	TokenNameIdentifier	 X Include Namespace Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
NamespaceContext	TokenNameIdentifier	 Namespace Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLDocumentSource	TokenNameIdentifier	 XML Document Source
;	TokenNameSEMICOLON	
/** * This class is the configuration used to parse XML 1.0 and XML 1.1 documents * and provides support for XInclude. This is the default Xerces configuration. * * @author Michael Glavassevich, IBM * * @version $Id: XIncludeAwareParserConfiguration.java 987475 2010-08-20 12:27:44Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class is the configuration used to parse XML 1.0 and XML 1.1 documents and provides support for XInclude. This is the default Xerces configuration. * @author Michael Glavassevich, IBM * @version $Id: XIncludeAwareParserConfiguration.java 987475 2010-08-20 12:27:44Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XIncludeAwareParserConfiguration	TokenNameIdentifier	 X Include Aware Parser Configuration
extends	TokenNameextends	
XML11Configuration	TokenNameIdentifier	 XM L11 Configuration
{	TokenNameLBRACE	
/** Feature identifier: allow notation and unparsed entity events to be sent out of order. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: allow notation and unparsed entity events to be sent out of order. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ALLOW_UE_AND_NOTATION_EVENTS	TokenNameIdentifier	 ALLOW  UE  AND  NOTATION  EVENTS
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SAX_FEATURE_PREFIX	TokenNameIdentifier	 SAX  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ALLOW_DTD_EVENTS_AFTER_ENDDTD_FEATURE	TokenNameIdentifier	 ALLOW  DTD  EVENTS  AFTER  ENDDTD  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: fixup base URIs. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: fixup base URIs. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XINCLUDE_FIXUP_BASE_URIS	TokenNameIdentifier	 XINCLUDE  FIXUP  BASE  URIS
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XINCLUDE_FIXUP_BASE_URIS_FEATURE	TokenNameIdentifier	 XINCLUDE  FIXUP  BASE  URIS  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: fixup language. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: fixup language. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XINCLUDE_FIXUP_LANGUAGE	TokenNameIdentifier	 XINCLUDE  FIXUP  LANGUAGE
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XINCLUDE_FIXUP_LANGUAGE_FEATURE	TokenNameIdentifier	 XINCLUDE  FIXUP  LANGUAGE  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: XInclude processing */	TokenNameCOMMENT_JAVADOC	 Feature identifier: XInclude processing 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XINCLUDE_FEATURE	TokenNameIdentifier	 XINCLUDE  FEATURE
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XINCLUDE_FEATURE	TokenNameIdentifier	 XINCLUDE  FEATURE
;	TokenNameSEMICOLON	
/** Property identifier: XInclude handler. */	TokenNameCOMMENT_JAVADOC	 Property identifier: XInclude handler. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XINCLUDE_HANDLER	TokenNameIdentifier	 XINCLUDE  HANDLER
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XINCLUDE_HANDLER_PROPERTY	TokenNameIdentifier	 XINCLUDE  HANDLER  PROPERTY
;	TokenNameSEMICOLON	
/** Property identifier: error reporter. */	TokenNameCOMMENT_JAVADOC	 Property identifier: error reporter. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACE_CONTEXT	TokenNameIdentifier	 NAMESPACE  CONTEXT
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
NAMESPACE_CONTEXT_PROPERTY	TokenNameIdentifier	 NAMESPACE  CONTEXT  PROPERTY
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Components 	TokenNameCOMMENT_LINE	Components 
// 	TokenNameCOMMENT_LINE	 
/** XInclude handler. */	TokenNameCOMMENT_JAVADOC	 XInclude handler. 
protected	TokenNameprotected	
XIncludeHandler	TokenNameIdentifier	 X Include Handler
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
;	TokenNameSEMICOLON	
/** Non-XInclude NamespaceContext. */	TokenNameCOMMENT_JAVADOC	 Non-XInclude NamespaceContext. 
protected	TokenNameprotected	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
fNonXIncludeNSContext	TokenNameIdentifier	 f Non X Include NS Context
;	TokenNameSEMICOLON	
/** XInclude NamespaceContext. */	TokenNameCOMMENT_JAVADOC	 XInclude NamespaceContext. 
protected	TokenNameprotected	
XIncludeNamespaceSupport	TokenNameIdentifier	 X Include Namespace Support
fXIncludeNSContext	TokenNameIdentifier	 f X Include NS Context
;	TokenNameSEMICOLON	
/** Current NamespaceContext. */	TokenNameCOMMENT_JAVADOC	 Current NamespaceContext. 
protected	TokenNameprotected	
NamespaceContext	TokenNameIdentifier	 Namespace Context
fCurrentNSContext	TokenNameIdentifier	 f Current NS Context
;	TokenNameSEMICOLON	
/** Flag indicating whether XInclude processsing is enabled. */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether XInclude processsing is enabled. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fXIncludeEnabled	TokenNameIdentifier	 f X Include Enabled
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
XIncludeAwareParserConfiguration	TokenNameIdentifier	 X Include Aware Parser Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
/** * Constructs a parser configuration using the specified symbol table. * * @param symbolTable The symbol table to use. */	TokenNameCOMMENT_JAVADOC	 Constructs a parser configuration using the specified symbol table. * @param symbolTable The symbol table to use. 
public	TokenNamepublic	
XIncludeAwareParserConfiguration	TokenNameIdentifier	 X Include Aware Parser Configuration
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(SymbolTable) 	TokenNameCOMMENT_LINE	<init>(SymbolTable) 
/** * Constructs a parser configuration using the specified symbol table and * grammar pool. * <p> * * @param symbolTable The symbol table to use. * @param grammarPool The grammar pool to use. */	TokenNameCOMMENT_JAVADOC	 Constructs a parser configuration using the specified symbol table and grammar pool. <p> * @param symbolTable The symbol table to use. @param grammarPool The grammar pool to use. 
public	TokenNamepublic	
XIncludeAwareParserConfiguration	TokenNameIdentifier	 X Include Aware Parser Configuration
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
grammarPool	TokenNameIdentifier	 grammar Pool
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(SymbolTable,XMLGrammarPool) 	TokenNameCOMMENT_LINE	<init>(SymbolTable,XMLGrammarPool) 
/** * Constructs a parser configuration using the specified symbol table, * grammar pool, and parent settings. * <p> * * @param symbolTable The symbol table to use. * @param grammarPool The grammar pool to use. * @param parentSettings The parent settings. */	TokenNameCOMMENT_JAVADOC	 Constructs a parser configuration using the specified symbol table, grammar pool, and parent settings. <p> * @param symbolTable The symbol table to use. @param grammarPool The grammar pool to use. @param parentSettings The parent settings. 
public	TokenNamepublic	
XIncludeAwareParserConfiguration	TokenNameIdentifier	 X Include Aware Parser Configuration
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
grammarPool	TokenNameIdentifier	 grammar Pool
,	TokenNameCOMMA	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
parentSettings	TokenNameIdentifier	 parent Settings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
grammarPool	TokenNameIdentifier	 grammar Pool
,	TokenNameCOMMA	
parentSettings	TokenNameIdentifier	 parent Settings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
recognizedFeatures	TokenNameIdentifier	 recognized Features
=	TokenNameEQUAL	
{	TokenNameLBRACE	
ALLOW_UE_AND_NOTATION_EVENTS	TokenNameIdentifier	 ALLOW  UE  AND  NOTATION  EVENTS
,	TokenNameCOMMA	
XINCLUDE_FIXUP_BASE_URIS	TokenNameIdentifier	 XINCLUDE  FIXUP  BASE  URIS
,	TokenNameCOMMA	
XINCLUDE_FIXUP_LANGUAGE	TokenNameIdentifier	 XINCLUDE  FIXUP  LANGUAGE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
addRecognizedFeatures	TokenNameIdentifier	 add Recognized Features
(	TokenNameLPAREN	
recognizedFeatures	TokenNameIdentifier	 recognized Features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add default recognized properties 	TokenNameCOMMENT_LINE	add default recognized properties 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
recognizedProperties	TokenNameIdentifier	 recognized Properties
=	TokenNameEQUAL	
{	TokenNameLBRACE	
XINCLUDE_HANDLER	TokenNameIdentifier	 XINCLUDE  HANDLER
,	TokenNameCOMMA	
NAMESPACE_CONTEXT	TokenNameIdentifier	 NAMESPACE  CONTEXT
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
addRecognizedProperties	TokenNameIdentifier	 add Recognized Properties
(	TokenNameLPAREN	
recognizedProperties	TokenNameIdentifier	 recognized Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
ALLOW_UE_AND_NOTATION_EVENTS	TokenNameIdentifier	 ALLOW  UE  AND  NOTATION  EVENTS
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
XINCLUDE_FIXUP_BASE_URIS	TokenNameIdentifier	 XINCLUDE  FIXUP  BASE  URIS
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
XINCLUDE_FIXUP_LANGUAGE	TokenNameIdentifier	 XINCLUDE  FIXUP  LANGUAGE
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNonXIncludeNSContext	TokenNameIdentifier	 f Non X Include NS Context
=	TokenNameEQUAL	
new	TokenNamenew	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentNSContext	TokenNameIdentifier	 f Current NS Context
=	TokenNameEQUAL	
fNonXIncludeNSContext	TokenNameIdentifier	 f Non X Include NS Context
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
NAMESPACE_CONTEXT	TokenNameIdentifier	 NAMESPACE  CONTEXT
,	TokenNameCOMMA	
fNonXIncludeNSContext	TokenNameIdentifier	 f Non X Include NS Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Configures the pipeline. */	TokenNameCOMMENT_JAVADOC	 Configures the pipeline. 
protected	TokenNameprotected	
void	TokenNamevoid	
configurePipeline	TokenNameIdentifier	 configure Pipeline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
configurePipeline	TokenNameIdentifier	 configure Pipeline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fXIncludeEnabled	TokenNameIdentifier	 f X Include Enabled
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the XInclude handler was not in the pipeline insert it. 	TokenNameCOMMENT_LINE	If the XInclude handler was not in the pipeline insert it. 
if	TokenNameif	
(	TokenNameLPAREN	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
=	TokenNameEQUAL	
new	TokenNamenew	
XIncludeHandler	TokenNameIdentifier	 X Include Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add XInclude component 	TokenNameCOMMENT_LINE	add XInclude component 
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
XINCLUDE_HANDLER	TokenNameIdentifier	 XINCLUDE  HANDLER
,	TokenNameCOMMA	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addCommonComponent	TokenNameIdentifier	 add Common Component
(	TokenNameLPAREN	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Setup NamespaceContext 	TokenNameCOMMENT_LINE	Setup NamespaceContext 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentNSContext	TokenNameIdentifier	 f Current NS Context
!=	TokenNameNOT_EQUAL	
fXIncludeNSContext	TokenNameIdentifier	 f X Include NS Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fXIncludeNSContext	TokenNameIdentifier	 f X Include NS Context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fXIncludeNSContext	TokenNameIdentifier	 f X Include NS Context
=	TokenNameEQUAL	
new	TokenNamenew	
XIncludeNamespaceSupport	TokenNameIdentifier	 X Include Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fCurrentNSContext	TokenNameIdentifier	 f Current NS Context
=	TokenNameEQUAL	
fXIncludeNSContext	TokenNameIdentifier	 f X Include NS Context
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
NAMESPACE_CONTEXT	TokenNameIdentifier	 NAMESPACE  CONTEXT
,	TokenNameCOMMA	
fXIncludeNSContext	TokenNameIdentifier	 f X Include NS Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//configure DTD pipeline 	TokenNameCOMMENT_LINE	configure DTD pipeline 
fDTDScanner	TokenNameIdentifier	 f DTD Scanner
.	TokenNameDOT	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
fDTDProcessor	TokenNameIdentifier	 f DTD Processor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDProcessor	TokenNameIdentifier	 f DTD Processor
.	TokenNameDOT	
setDTDSource	TokenNameIdentifier	 set DTD Source
(	TokenNameLPAREN	
fDTDScanner	TokenNameIdentifier	 f DTD Scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDProcessor	TokenNameIdentifier	 f DTD Processor
.	TokenNameDOT	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
.	TokenNameDOT	
setDTDSource	TokenNameIdentifier	 set DTD Source
(	TokenNameLPAREN	
fDTDProcessor	TokenNameIdentifier	 f DTD Processor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
.	TokenNameDOT	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
setDTDSource	TokenNameIdentifier	 set DTD Source
(	TokenNameLPAREN	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// configure XML document pipeline: insert after DTDValidator and 	TokenNameCOMMENT_LINE	configure XML document pipeline: insert after DTDValidator and 
// before XML Schema validator 	TokenNameCOMMENT_LINE	before XML Schema validator 
XMLDocumentSource	TokenNameIdentifier	 XML Document Source
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fFeatures	TokenNameIdentifier	 f Features
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
XMLSCHEMA_VALIDATION	TokenNameIdentifier	 XMLSCHEMA  VALIDATION
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we don't have to worry about fSchemaValidator being null, since 	TokenNameCOMMENT_LINE	we don't have to worry about fSchemaValidator being null, since 
// super.configurePipeline() instantiated it if the feature was set 	TokenNameCOMMENT_LINE	super.configurePipeline() instantiated it if the feature was set 
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
.	TokenNameDOT	
getDocumentSource	TokenNameIdentifier	 get Document Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Otherwise, insert after the last component in the pipeline 	TokenNameCOMMENT_LINE	Otherwise, insert after the last component in the pipeline 
else	TokenNameelse	
{	TokenNameLBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
fLastComponent	TokenNameIdentifier	 f Last Component
;	TokenNameSEMICOLON	
fLastComponent	TokenNameIdentifier	 f Last Component
=	TokenNameEQUAL	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getDocumentHandler	TokenNameIdentifier	 get Document Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Setup NamespaceContext 	TokenNameCOMMENT_LINE	Setup NamespaceContext 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentNSContext	TokenNameIdentifier	 f Current NS Context
!=	TokenNameNOT_EQUAL	
fNonXIncludeNSContext	TokenNameIdentifier	 f Non X Include NS Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentNSContext	TokenNameIdentifier	 f Current NS Context
=	TokenNameEQUAL	
fNonXIncludeNSContext	TokenNameIdentifier	 f Non X Include NS Context
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
NAMESPACE_CONTEXT	TokenNameIdentifier	 NAMESPACE  CONTEXT
,	TokenNameCOMMA	
fNonXIncludeNSContext	TokenNameIdentifier	 f Non X Include NS Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// configurePipeline() 	TokenNameCOMMENT_LINE	configurePipeline() 
protected	TokenNameprotected	
void	TokenNamevoid	
configureXML11Pipeline	TokenNameIdentifier	 configure XM L11 Pipeline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
configureXML11Pipeline	TokenNameIdentifier	 configure XM L11 Pipeline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fXIncludeEnabled	TokenNameIdentifier	 f X Include Enabled
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the XInclude handler was not in the pipeline insert it. 	TokenNameCOMMENT_LINE	If the XInclude handler was not in the pipeline insert it. 
if	TokenNameif	
(	TokenNameLPAREN	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
=	TokenNameEQUAL	
new	TokenNamenew	
XIncludeHandler	TokenNameIdentifier	 X Include Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add XInclude component 	TokenNameCOMMENT_LINE	add XInclude component 
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
XINCLUDE_HANDLER	TokenNameIdentifier	 XINCLUDE  HANDLER
,	TokenNameCOMMA	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addCommonComponent	TokenNameIdentifier	 add Common Component
(	TokenNameLPAREN	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Setup NamespaceContext 	TokenNameCOMMENT_LINE	Setup NamespaceContext 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentNSContext	TokenNameIdentifier	 f Current NS Context
!=	TokenNameNOT_EQUAL	
fXIncludeNSContext	TokenNameIdentifier	 f X Include NS Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fXIncludeNSContext	TokenNameIdentifier	 f X Include NS Context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fXIncludeNSContext	TokenNameIdentifier	 f X Include NS Context
=	TokenNameEQUAL	
new	TokenNamenew	
XIncludeNamespaceSupport	TokenNameIdentifier	 X Include Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fCurrentNSContext	TokenNameIdentifier	 f Current NS Context
=	TokenNameEQUAL	
fXIncludeNSContext	TokenNameIdentifier	 f X Include NS Context
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
NAMESPACE_CONTEXT	TokenNameIdentifier	 NAMESPACE  CONTEXT
,	TokenNameCOMMA	
fXIncludeNSContext	TokenNameIdentifier	 f X Include NS Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// configure XML 1.1. DTD pipeline 	TokenNameCOMMENT_LINE	configure XML 1.1. DTD pipeline 
fXML11DTDScanner	TokenNameIdentifier	 f XM L11 DTD Scanner
.	TokenNameDOT	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
fXML11DTDProcessor	TokenNameIdentifier	 f XM L11 DTD Processor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fXML11DTDProcessor	TokenNameIdentifier	 f XM L11 DTD Processor
.	TokenNameDOT	
setDTDSource	TokenNameIdentifier	 set DTD Source
(	TokenNameLPAREN	
fXML11DTDScanner	TokenNameIdentifier	 f XM L11 DTD Scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fXML11DTDProcessor	TokenNameIdentifier	 f XM L11 DTD Processor
.	TokenNameDOT	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
.	TokenNameDOT	
setDTDSource	TokenNameIdentifier	 set DTD Source
(	TokenNameLPAREN	
fXML11DTDProcessor	TokenNameIdentifier	 f XM L11 DTD Processor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
.	TokenNameDOT	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
setDTDSource	TokenNameIdentifier	 set DTD Source
(	TokenNameLPAREN	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// configure XML document pipeline: insert after DTDValidator and 	TokenNameCOMMENT_LINE	configure XML document pipeline: insert after DTDValidator and 
// before XML Schema validator 	TokenNameCOMMENT_LINE	before XML Schema validator 
XMLDocumentSource	TokenNameIdentifier	 XML Document Source
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fFeatures	TokenNameIdentifier	 f Features
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
XMLSCHEMA_VALIDATION	TokenNameIdentifier	 XMLSCHEMA  VALIDATION
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we don't have to worry about fSchemaValidator being null, since 	TokenNameCOMMENT_LINE	we don't have to worry about fSchemaValidator being null, since 
// super.configurePipeline() instantiated it if the feature was set 	TokenNameCOMMENT_LINE	super.configurePipeline() instantiated it if the feature was set 
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
.	TokenNameDOT	
getDocumentSource	TokenNameIdentifier	 get Document Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Otherwise, insert after the last component in the pipeline 	TokenNameCOMMENT_LINE	Otherwise, insert after the last component in the pipeline 
else	TokenNameelse	
{	TokenNameLBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
fLastComponent	TokenNameIdentifier	 f Last Component
;	TokenNameSEMICOLON	
fLastComponent	TokenNameIdentifier	 f Last Component
=	TokenNameEQUAL	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getDocumentHandler	TokenNameIdentifier	 get Document Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
fXIncludeHandler	TokenNameIdentifier	 f X Include Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Setup NamespaceContext 	TokenNameCOMMENT_LINE	Setup NamespaceContext 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentNSContext	TokenNameIdentifier	 f Current NS Context
!=	TokenNameNOT_EQUAL	
fNonXIncludeNSContext	TokenNameIdentifier	 f Non X Include NS Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentNSContext	TokenNameIdentifier	 f Current NS Context
=	TokenNameEQUAL	
fNonXIncludeNSContext	TokenNameIdentifier	 f Non X Include NS Context
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
NAMESPACE_CONTEXT	TokenNameIdentifier	 NAMESPACE  CONTEXT
,	TokenNameCOMMA	
fNonXIncludeNSContext	TokenNameIdentifier	 f Non X Include NS Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// configureXML11Pipeline() 	TokenNameCOMMENT_LINE	configureXML11Pipeline() 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
PARSER_SETTINGS	TokenNameIdentifier	 PARSER  SETTINGS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fConfigUpdated	TokenNameIdentifier	 f Config Updated
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XINCLUDE_FEATURE	TokenNameIdentifier	 XINCLUDE  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fXIncludeEnabled	TokenNameIdentifier	 f X Include Enabled
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getFeature0	TokenNameIdentifier	 get Feature0
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFeature(String):boolean 	TokenNameCOMMENT_LINE	getFeature(String):boolean 
public	TokenNamepublic	
void	TokenNamevoid	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
,	TokenNameCOMMA	
boolean	TokenNameboolean	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XINCLUDE_FEATURE	TokenNameIdentifier	 XINCLUDE  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fXIncludeEnabled	TokenNameIdentifier	 f X Include Enabled
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
fConfigUpdated	TokenNameIdentifier	 f Config Updated
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
