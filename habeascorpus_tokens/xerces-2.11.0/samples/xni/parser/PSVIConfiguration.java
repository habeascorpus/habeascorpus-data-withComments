/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
XIncludeAwareParserConfiguration	TokenNameIdentifier	 X Include Aware Parser Configuration
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
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
PSVIWriter	TokenNameIdentifier	 PSVI Writer
;	TokenNameSEMICOLON	
/** * This is the DTD/ XML Schema parser configuration that includes PSVIWriter component. * The document will be fully assessed and will produce PSVI as required by XML Schema specification * configuration including XML Schema Validator in the pipeline. * * @author Elena Litani, IBM * @version $Id: PSVIConfiguration.java 447690 2006-09-19 02:41:53Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This is the DTD/ XML Schema parser configuration that includes PSVIWriter component. The document will be fully assessed and will produce PSVI as required by XML Schema specification configuration including XML Schema Validator in the pipeline. * @author Elena Litani, IBM @version $Id: PSVIConfiguration.java 447690 2006-09-19 02:41:53Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
PSVIConfiguration	TokenNameIdentifier	 PSVI Configuration
extends	TokenNameextends	
XIncludeAwareParserConfiguration	TokenNameIdentifier	 X Include Aware Parser Configuration
{	TokenNameLBRACE	
/** PSVI Writer */	TokenNameCOMMENT_JAVADOC	 PSVI Writer 
protected	TokenNameprotected	
PSVIWriter	TokenNameIdentifier	 PSVI Writer
fPSVIWriter	TokenNameIdentifier	 f PSVI Writer
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a document parser using the default symbol table and grammar * pool or the ones specified by the application (through the properties). */	TokenNameCOMMENT_JAVADOC	 Constructs a document parser using the default symbol table and grammar pool or the ones specified by the application (through the properties). 
public	TokenNamepublic	
PSVIConfiguration	TokenNameIdentifier	 PSVI Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
/** * Constructs a document parser using the specified symbol table. * * @param symbolTable The symbol table to use. */	TokenNameCOMMENT_JAVADOC	 Constructs a document parser using the specified symbol table. * @param symbolTable The symbol table to use. 
public	TokenNamepublic	
PSVIConfiguration	TokenNameIdentifier	 PSVI Configuration
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(SymbolTable) 	TokenNameCOMMENT_LINE	<init>(SymbolTable) 
/** * Constructs a document parser using the specified symbol table and * grammar pool. * <p> * <strong>REVISIT:</strong> * Grammar pool will be updated when the new validation engine is * implemented. * * @param symbolTable The symbol table to use. * @param grammarPool The grammar pool to use. */	TokenNameCOMMENT_JAVADOC	 Constructs a document parser using the specified symbol table and grammar pool. <p> <strong>REVISIT:</strong> Grammar pool will be updated when the new validation engine is implemented. * @param symbolTable The symbol table to use. @param grammarPool The grammar pool to use. 
public	TokenNamepublic	
PSVIConfiguration	TokenNameIdentifier	 PSVI Configuration
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
PSVIConfiguration	TokenNameIdentifier	 PSVI Configuration
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
fPSVIWriter	TokenNameIdentifier	 f PSVI Writer
=	TokenNameEQUAL	
createPSVIWriter	TokenNameIdentifier	 create PSVI Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fPSVIWriter	TokenNameIdentifier	 f PSVI Writer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addCommonComponent	TokenNameIdentifier	 add Common Component
(	TokenNameLPAREN	
fPSVIWriter	TokenNameIdentifier	 f PSVI Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// <init>(SymbolTable,XMLGrammarPool) 	TokenNameCOMMENT_LINE	<init>(SymbolTable,XMLGrammarPool) 
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
addPSVIWriterToPipeline	TokenNameIdentifier	 add PSVI Writer To Pipeline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// configurePipeline() 	TokenNameCOMMENT_LINE	configurePipeline() 
/** Configures the XML 1.1 pipeline. */	TokenNameCOMMENT_JAVADOC	 Configures the XML 1.1 pipeline. 
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
addPSVIWriterToPipeline	TokenNameIdentifier	 add PSVI Writer To Pipeline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// configureXML11Pipeline() 	TokenNameCOMMENT_LINE	configureXML11Pipeline() 
/** Adds PSVI writer to the pipeline. */	TokenNameCOMMENT_JAVADOC	 Adds PSVI writer to the pipeline. 
protected	TokenNameprotected	
void	TokenNamevoid	
addPSVIWriterToPipeline	TokenNameIdentifier	 add PSVI Writer To Pipeline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
fPSVIWriter	TokenNameIdentifier	 f PSVI Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fPSVIWriter	TokenNameIdentifier	 f PSVI Writer
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fPSVIWriter	TokenNameIdentifier	 f PSVI Writer
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
fPSVIWriter	TokenNameIdentifier	 f PSVI Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// addPSVIWriterToPipeline() 	TokenNameCOMMENT_LINE	addPSVIWriterToPipeline() 
/** Create a PSVIWriter */	TokenNameCOMMENT_JAVADOC	 Create a PSVIWriter 
protected	TokenNameprotected	
PSVIWriter	TokenNameIdentifier	 PSVI Writer
createPSVIWriter	TokenNameIdentifier	 create PSVI Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PSVIWriter	TokenNameIdentifier	 PSVI Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class PSVIConfiguration 	TokenNameCOMMENT_LINE	class PSVIConfiguration 
