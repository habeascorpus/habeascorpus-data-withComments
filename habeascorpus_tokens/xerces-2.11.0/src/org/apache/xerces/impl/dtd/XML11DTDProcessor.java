/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dtd	TokenNameIdentifier	 dtd
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
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
XML11DTDScannerImpl	TokenNameIdentifier	 XM L11 DTD Scanner Impl
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
XMLDTDScannerImpl	TokenNameIdentifier	 XMLDTD Scanner Impl
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
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
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
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
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
XMLEntityResolver	TokenNameIdentifier	 XML Entity Resolver
;	TokenNameSEMICOLON	
/** * This class extends XMLDTDProcessor by giving it * the ability to parse XML 1.1 documents correctly. It can also be used * as a DTD loader, so that XML 1.1 external subsets can * be processed correctly (hence it's rather anomalous-appearing * derivation from XMLDTDLoader). * * @xerces.internal * * @author Neil Graham, IBM * * @version $Id: XML11DTDProcessor.java 446755 2006-09-15 21:56:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class extends XMLDTDProcessor by giving it the ability to parse XML 1.1 documents correctly. It can also be used as a DTD loader, so that XML 1.1 external subsets can be processed correctly (hence it's rather anomalous-appearing derivation from XMLDTDLoader). * @xerces.internal * @author Neil Graham, IBM * @version $Id: XML11DTDProcessor.java 446755 2006-09-15 21:56:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XML11DTDProcessor	TokenNameIdentifier	 XM L11 DTD Processor
extends	TokenNameextends	
XMLDTDLoader	TokenNameIdentifier	 XMLDTD Loader
{	TokenNameLBRACE	
// constructors 	TokenNameCOMMENT_LINE	constructors 
public	TokenNamepublic	
XML11DTDProcessor	TokenNameIdentifier	 XM L11 DTD Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
public	TokenNamepublic	
XML11DTDProcessor	TokenNameIdentifier	 XM L11 DTD Processor
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// init(SymbolTable) 	TokenNameCOMMENT_LINE	init(SymbolTable) 
public	TokenNamepublic	
XML11DTDProcessor	TokenNameIdentifier	 XM L11 DTD Processor
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// init(SymbolTable, XMLGrammarPool) 	TokenNameCOMMENT_LINE	init(SymbolTable, XMLGrammarPool) 
XML11DTDProcessor	TokenNameIdentifier	 XM L11 DTD Processor
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
grammarPool	TokenNameIdentifier	 grammar Pool
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
errorReporter	TokenNameIdentifier	 error Reporter
,	TokenNameCOMMA	
XMLEntityResolver	TokenNameIdentifier	 XML Entity Resolver
entityResolver	TokenNameIdentifier	 entity Resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
grammarPool	TokenNameIdentifier	 grammar Pool
,	TokenNameCOMMA	
errorReporter	TokenNameIdentifier	 error Reporter
,	TokenNameCOMMA	
entityResolver	TokenNameIdentifier	 entity Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// init(SymbolTable, XMLGrammarPool, XMLErrorReporter, XMLEntityResolver) 	TokenNameCOMMENT_LINE	init(SymbolTable, XMLGrammarPool, XMLErrorReporter, XMLEntityResolver) 
// overridden methods 	TokenNameCOMMENT_LINE	overridden methods 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isValidNmtoken	TokenNameIdentifier	 is Valid Nmtoken
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nmtoken	TokenNameIdentifier	 nmtoken
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidNmtoken	TokenNameIdentifier	 is XM L11 Valid Nmtoken
(	TokenNameLPAREN	
nmtoken	TokenNameIdentifier	 nmtoken
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isValidNmtoken(String): boolean 	TokenNameCOMMENT_LINE	isValidNmtoken(String): boolean 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isValidName	TokenNameIdentifier	 is Valid Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidName	TokenNameIdentifier	 is XM L11 Valid Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isValidNmtoken(String): boolean 	TokenNameCOMMENT_LINE	isValidNmtoken(String): boolean 
protected	TokenNameprotected	
XMLDTDScannerImpl	TokenNameIdentifier	 XMLDTD Scanner Impl
createDTDScanner	TokenNameIdentifier	 create DTD Scanner
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
errorReporter	TokenNameIdentifier	 error Reporter
,	TokenNameCOMMA	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
entityManager	TokenNameIdentifier	 entity Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XML11DTDScannerImpl	TokenNameIdentifier	 XM L11 DTD Scanner Impl
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
errorReporter	TokenNameIdentifier	 error Reporter
,	TokenNameCOMMA	
entityManager	TokenNameIdentifier	 entity Manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDTDScanner(SymbolTable, XMLErrorReporter, XMLEntityManager) : XMLDTDScannerImpl 	TokenNameCOMMENT_LINE	createDTDScanner(SymbolTable, XMLErrorReporter, XMLEntityManager) : XMLDTDScannerImpl 
protected	TokenNameprotected	
short	TokenNameshort	
getScannerVersion	TokenNameIdentifier	 get Scanner Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XML_VERSION_1_1	TokenNameIdentifier	 XML  VERSION 1 1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getScannerVersion() : short 	TokenNameCOMMENT_LINE	getScannerVersion() : short 
}	TokenNameRBRACE	
// class XML11DTDProcessor 	TokenNameCOMMENT_LINE	class XML11DTDProcessor 
