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
XMLDocumentScannerImpl	TokenNameIdentifier	 XML Document Scanner Impl
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
XMLNSDocumentScannerImpl	TokenNameIdentifier	 XMLNS Document Scanner Impl
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
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
XMLDTDValidator	TokenNameIdentifier	 XMLDTD Validator
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
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
XMLNSDTDValidator	TokenNameIdentifier	 XMLNSDTD Validator
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XMLSchemaValidator	TokenNameIdentifier	 XML Schema Validator
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSMessageFormatter	TokenNameIdentifier	 XS Message Formatter
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
XMLComponent	TokenNameIdentifier	 XML Component
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
XMLDocumentScanner	TokenNameIdentifier	 XML Document Scanner
;	TokenNameSEMICOLON	
/** * This is configuration uses a scanner that integrates both scanning of the document * and binding namespaces. * * If namespace feature is turned on, the pipeline is constructured with the * following components: * XMLNSDocumentScannerImpl -> XMLNSDTDValidator -> (optional) XMLSchemaValidator * * If the namespace feature is turned off the default document scanner implementation * is used (XMLDocumentScannerImpl). * <p> * In addition to the features and properties recognized by the base * parser configuration, this class recognizes these additional * features and properties: * <ul> * <li>Features * <ul> * <li>http://apache.org/xml/features/validation/schema</li> * <li>http://apache.org/xml/features/validation/schema-full-checking</li> * <li>http://apache.org/xml/features/validation/schema/normalized-value</li> * <li>http://apache.org/xml/features/validation/schema/element-default</li> * </ul> * <li>Properties * <ul> * <li>http://apache.org/xml/properties/internal/error-reporter</li> * <li>http://apache.org/xml/properties/internal/entity-manager</li> * <li>http://apache.org/xml/properties/internal/document-scanner</li> * <li>http://apache.org/xml/properties/internal/dtd-scanner</li> * <li>http://apache.org/xml/properties/internal/grammar-pool</li> * <li>http://apache.org/xml/properties/internal/validator/dtd</li> * <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li> * </ul> * </ul> * * @author Elena Litani, IBM * * @version $Id: IntegratedParserConfiguration.java 447239 2006-09-18 05:08:26Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This is configuration uses a scanner that integrates both scanning of the document and binding namespaces. * If namespace feature is turned on, the pipeline is constructured with the following components: XMLNSDocumentScannerImpl -> XMLNSDTDValidator -> (optional) XMLSchemaValidator * If the namespace feature is turned off the default document scanner implementation is used (XMLDocumentScannerImpl). <p> In addition to the features and properties recognized by the base parser configuration, this class recognizes these additional features and properties: <ul> <li>Features <ul> <li>http://apache.org/xml/features/validation/schema</li> <li>http://apache.org/xml/features/validation/schema-full-checking</li> <li>http://apache.org/xml/features/validation/schema/normalized-value</li> <li>http://apache.org/xml/features/validation/schema/element-default</li> </ul> <li>Properties <ul> <li>http://apache.org/xml/properties/internal/error-reporter</li> <li>http://apache.org/xml/properties/internal/entity-manager</li> <li>http://apache.org/xml/properties/internal/document-scanner</li> <li>http://apache.org/xml/properties/internal/dtd-scanner</li> <li>http://apache.org/xml/properties/internal/grammar-pool</li> <li>http://apache.org/xml/properties/internal/validator/dtd</li> <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li> </ul> </ul> * @author Elena Litani, IBM * @version $Id: IntegratedParserConfiguration.java 447239 2006-09-18 05:08:26Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
IntegratedParserConfiguration	TokenNameIdentifier	 Integrated Parser Configuration
extends	TokenNameextends	
StandardParserConfiguration	TokenNameIdentifier	 Standard Parser Configuration
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// REVISIT: should this configuration depend on the others 	TokenNameCOMMENT_LINE	REVISIT: should this configuration depend on the others 
// like DTD/Standard one? 	TokenNameCOMMENT_LINE	like DTD/Standard one? 
// 	TokenNameCOMMENT_LINE	 
/** Document scanner that does namespace binding. */	TokenNameCOMMENT_JAVADOC	 Document scanner that does namespace binding. 
protected	TokenNameprotected	
XMLNSDocumentScannerImpl	TokenNameIdentifier	 XMLNS Document Scanner Impl
fNamespaceScanner	TokenNameIdentifier	 f Namespace Scanner
;	TokenNameSEMICOLON	
/** Default Xerces implementation of scanner */	TokenNameCOMMENT_JAVADOC	 Default Xerces implementation of scanner 
protected	TokenNameprotected	
XMLDocumentScannerImpl	TokenNameIdentifier	 XML Document Scanner Impl
fNonNSScanner	TokenNameIdentifier	 f Non NS Scanner
;	TokenNameSEMICOLON	
/** DTD Validator that does not bind namespaces */	TokenNameCOMMENT_JAVADOC	 DTD Validator that does not bind namespaces 
protected	TokenNameprotected	
XMLDTDValidator	TokenNameIdentifier	 XMLDTD Validator
fNonNSDTDValidator	TokenNameIdentifier	 f Non NSDTD Validator
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
IntegratedParserConfiguration	TokenNameIdentifier	 Integrated Parser Configuration
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
IntegratedParserConfiguration	TokenNameIdentifier	 Integrated Parser Configuration
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
/** * Constructs a parser configuration using the specified symbol table and * grammar pool. * <p> * <strong>REVISIT:</strong> * Grammar pool will be updated when the new validation engine is * implemented. * * @param symbolTable The symbol table to use. * @param grammarPool The grammar pool to use. */	TokenNameCOMMENT_JAVADOC	 Constructs a parser configuration using the specified symbol table and grammar pool. <p> <strong>REVISIT:</strong> Grammar pool will be updated when the new validation engine is implemented. * @param symbolTable The symbol table to use. @param grammarPool The grammar pool to use. 
public	TokenNamepublic	
IntegratedParserConfiguration	TokenNameIdentifier	 Integrated Parser Configuration
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
/** * Constructs a parser configuration using the specified symbol table, * grammar pool, and parent settings. * <p> * <strong>REVISIT:</strong> * Grammar pool will be updated when the new validation engine is * implemented. * * @param symbolTable The symbol table to use. * @param grammarPool The grammar pool to use. * @param parentSettings The parent settings. */	TokenNameCOMMENT_JAVADOC	 Constructs a parser configuration using the specified symbol table, grammar pool, and parent settings. <p> <strong>REVISIT:</strong> Grammar pool will be updated when the new validation engine is implemented. * @param symbolTable The symbol table to use. @param grammarPool The grammar pool to use. @param parentSettings The parent settings. 
public	TokenNamepublic	
IntegratedParserConfiguration	TokenNameIdentifier	 Integrated Parser Configuration
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
// create components 	TokenNameCOMMENT_LINE	create components 
fNonNSScanner	TokenNameIdentifier	 f Non NS Scanner
=	TokenNameEQUAL	
new	TokenNamenew	
XMLDocumentScannerImpl	TokenNameIdentifier	 XML Document Scanner Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNonNSDTDValidator	TokenNameIdentifier	 f Non NSDTD Validator
=	TokenNameEQUAL	
new	TokenNamenew	
XMLDTDValidator	TokenNameIdentifier	 XMLDTD Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add components 	TokenNameCOMMENT_LINE	add components 
addComponent	TokenNameIdentifier	 add Component
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XMLComponent	TokenNameIdentifier	 XML Component
)	TokenNameRPAREN	
fNonNSScanner	TokenNameIdentifier	 f Non NS Scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addComponent	TokenNameIdentifier	 add Component
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XMLComponent	TokenNameIdentifier	 XML Component
)	TokenNameRPAREN	
fNonNSDTDValidator	TokenNameIdentifier	 f Non NSDTD Validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(SymbolTable,XMLGrammarPool) 	TokenNameCOMMENT_LINE	<init>(SymbolTable,XMLGrammarPool) 
/** Configures the pipeline. */	TokenNameCOMMENT_JAVADOC	 Configures the pipeline. 
protected	TokenNameprotected	
void	TokenNamevoid	
configurePipeline	TokenNameIdentifier	 configure Pipeline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// use XML 1.0 datatype library 	TokenNameCOMMENT_LINE	use XML 1.0 datatype library 
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
DATATYPE_VALIDATOR_FACTORY	TokenNameIdentifier	 DATATYPE  VALIDATOR  FACTORY
,	TokenNameCOMMA	
fDatatypeValidatorFactory	TokenNameIdentifier	 f Datatype Validator Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// setup DTD pipeline 	TokenNameCOMMENT_LINE	setup DTD pipeline 
configureDTDPipeline	TokenNameIdentifier	 configure DTD Pipeline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// setup document pipeline 	TokenNameCOMMENT_LINE	setup document pipeline 
if	TokenNameif	
(	TokenNameLPAREN	
fFeatures	TokenNameIdentifier	 f Features
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
NAMESPACES	TokenNameIdentifier	 NAMESPACES
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fProperties	TokenNameIdentifier	 f Properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NAMESPACE_BINDER	TokenNameIdentifier	 NAMESPACE  BINDER
,	TokenNameCOMMA	
fNamespaceBinder	TokenNameIdentifier	 f Namespace Binder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fScanner	TokenNameIdentifier	 f Scanner
=	TokenNameEQUAL	
fNamespaceScanner	TokenNameIdentifier	 f Namespace Scanner
;	TokenNameSEMICOLON	
fProperties	TokenNameIdentifier	 f Properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DOCUMENT_SCANNER	TokenNameIdentifier	 DOCUMENT  SCANNER
,	TokenNameCOMMA	
fNamespaceScanner	TokenNameIdentifier	 f Namespace Scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDValidator	TokenNameIdentifier	 f DTD Validator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fProperties	TokenNameIdentifier	 f Properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DTD_VALIDATOR	TokenNameIdentifier	 DTD  VALIDATOR
,	TokenNameCOMMA	
fDTDValidator	TokenNameIdentifier	 f DTD Validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNamespaceScanner	TokenNameIdentifier	 f Namespace Scanner
.	TokenNameDOT	
setDTDValidator	TokenNameIdentifier	 set DTD Validator
(	TokenNameLPAREN	
fDTDValidator	TokenNameIdentifier	 f DTD Validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNamespaceScanner	TokenNameIdentifier	 f Namespace Scanner
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
fDTDValidator	TokenNameIdentifier	 f DTD Validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDValidator	TokenNameIdentifier	 f DTD Validator
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
fNamespaceScanner	TokenNameIdentifier	 f Namespace Scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDValidator	TokenNameIdentifier	 f DTD Validator
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
fDTDValidator	TokenNameIdentifier	 f DTD Validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fLastComponent	TokenNameIdentifier	 f Last Component
=	TokenNameEQUAL	
fDTDValidator	TokenNameIdentifier	 f DTD Validator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fNamespaceScanner	TokenNameIdentifier	 f Namespace Scanner
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNamespaceScanner	TokenNameIdentifier	 f Namespace Scanner
.	TokenNameDOT	
setDTDValidator	TokenNameIdentifier	 set DTD Validator
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
fNamespaceScanner	TokenNameIdentifier	 f Namespace Scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fLastComponent	TokenNameIdentifier	 f Last Component
=	TokenNameEQUAL	
fNamespaceScanner	TokenNameIdentifier	 f Namespace Scanner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fScanner	TokenNameIdentifier	 f Scanner
=	TokenNameEQUAL	
fNonNSScanner	TokenNameIdentifier	 f Non NS Scanner
;	TokenNameSEMICOLON	
fProperties	TokenNameIdentifier	 f Properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DOCUMENT_SCANNER	TokenNameIdentifier	 DOCUMENT  SCANNER
,	TokenNameCOMMA	
fNonNSScanner	TokenNameIdentifier	 f Non NS Scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNonNSDTDValidator	TokenNameIdentifier	 f Non NSDTD Validator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fProperties	TokenNameIdentifier	 f Properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DTD_VALIDATOR	TokenNameIdentifier	 DTD  VALIDATOR
,	TokenNameCOMMA	
fNonNSDTDValidator	TokenNameIdentifier	 f Non NSDTD Validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNonNSScanner	TokenNameIdentifier	 f Non NS Scanner
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
fNonNSDTDValidator	TokenNameIdentifier	 f Non NSDTD Validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNonNSDTDValidator	TokenNameIdentifier	 f Non NSDTD Validator
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
fNonNSScanner	TokenNameIdentifier	 f Non NS Scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNonNSDTDValidator	TokenNameIdentifier	 f Non NSDTD Validator
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
fNonNSDTDValidator	TokenNameIdentifier	 f Non NSDTD Validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fLastComponent	TokenNameIdentifier	 f Last Component
=	TokenNameEQUAL	
fNonNSDTDValidator	TokenNameIdentifier	 f Non NSDTD Validator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fScanner	TokenNameIdentifier	 f Scanner
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
fScanner	TokenNameIdentifier	 f Scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fLastComponent	TokenNameIdentifier	 f Last Component
=	TokenNameEQUAL	
fScanner	TokenNameIdentifier	 f Scanner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// setup document pipeline 	TokenNameCOMMENT_LINE	setup document pipeline 
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
// If schema validator was not in the pipeline insert it. 	TokenNameCOMMENT_LINE	If schema validator was not in the pipeline insert it. 
if	TokenNameif	
(	TokenNameLPAREN	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
=	TokenNameEQUAL	
new	TokenNamenew	
XMLSchemaValidator	TokenNameIdentifier	 XML Schema Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add schema component 	TokenNameCOMMENT_LINE	add schema component 
fProperties	TokenNameIdentifier	 f Properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SCHEMA_VALIDATOR	TokenNameIdentifier	 SCHEMA  VALIDATOR
,	TokenNameCOMMA	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addComponent	TokenNameIdentifier	 add Component
(	TokenNameLPAREN	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add schema message formatter 	TokenNameCOMMENT_LINE	add schema message formatter 
if	TokenNameif	
(	TokenNameLPAREN	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
getMessageFormatter	TokenNameIdentifier	 get Message Formatter
(	TokenNameLPAREN	
XSMessageFormatter	TokenNameIdentifier	 XS Message Formatter
.	TokenNameDOT	
SCHEMA_DOMAIN	TokenNameIdentifier	 SCHEMA  DOMAIN
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSMessageFormatter	TokenNameIdentifier	 XS Message Formatter
xmft	TokenNameIdentifier	 xmft
=	TokenNameEQUAL	
new	TokenNamenew	
XSMessageFormatter	TokenNameIdentifier	 XS Message Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
putMessageFormatter	TokenNameIdentifier	 put Message Formatter
(	TokenNameLPAREN	
XSMessageFormatter	TokenNameIdentifier	 XS Message Formatter
.	TokenNameDOT	
SCHEMA_DOMAIN	TokenNameIdentifier	 SCHEMA  DOMAIN
,	TokenNameCOMMA	
xmft	TokenNameIdentifier	 xmft
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fLastComponent	TokenNameIdentifier	 f Last Component
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
fLastComponent	TokenNameIdentifier	 f Last Component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fLastComponent	TokenNameIdentifier	 f Last Component
=	TokenNameEQUAL	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// configurePipeline() 	TokenNameCOMMENT_LINE	configurePipeline() 
/** Create a document scanner: this scanner performs namespace binding */	TokenNameCOMMENT_JAVADOC	 Create a document scanner: this scanner performs namespace binding 
protected	TokenNameprotected	
XMLDocumentScanner	TokenNameIdentifier	 XML Document Scanner
createDocumentScanner	TokenNameIdentifier	 create Document Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaceScanner	TokenNameIdentifier	 f Namespace Scanner
=	TokenNameEQUAL	
new	TokenNamenew	
XMLNSDocumentScannerImpl	TokenNameIdentifier	 XMLNS Document Scanner Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fNamespaceScanner	TokenNameIdentifier	 f Namespace Scanner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDocumentScanner():XMLDocumentScanner 	TokenNameCOMMENT_LINE	createDocumentScanner():XMLDocumentScanner 
/** Create a DTD validator: this validator performs namespace binding. */	TokenNameCOMMENT_JAVADOC	 Create a DTD validator: this validator performs namespace binding. 
protected	TokenNameprotected	
XMLDTDValidator	TokenNameIdentifier	 XMLDTD Validator
createDTDValidator	TokenNameIdentifier	 create DTD Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLNSDTDValidator	TokenNameIdentifier	 XMLNSDTD Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDTDValidator():XMLDTDValidator 	TokenNameCOMMENT_LINE	createDTDValidator():XMLDTDValidator 
}	TokenNameRBRACE	
// class IntegratedParserConfiguration 	TokenNameCOMMENT_LINE	class IntegratedParserConfiguration 
