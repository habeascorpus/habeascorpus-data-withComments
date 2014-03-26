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
XMLParserConfiguration	TokenNameIdentifier	 XML Parser Configuration
;	TokenNameSEMICOLON	
/** * This is a concrete vanilla XML parser class. It uses the abstract parser * with either a BasicConfiguration object or the one specified by the * application. * * @author Arnaud Le Hors, IBM * @author Andy Clark, IBM * * @version $Id: XMLDocumentParser.java 447239 2006-09-18 05:08:26Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This is a concrete vanilla XML parser class. It uses the abstract parser with either a BasicConfiguration object or the one specified by the application. * @author Arnaud Le Hors, IBM @author Andy Clark, IBM * @version $Id: XMLDocumentParser.java 447239 2006-09-18 05:08:26Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLDocumentParser	TokenNameIdentifier	 XML Document Parser
extends	TokenNameextends	
AbstractXMLDocumentParser	TokenNameIdentifier	 Abstract XML Document Parser
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a document parser using the default basic parser * configuration. */	TokenNameCOMMENT_JAVADOC	 Constructs a document parser using the default basic parser configuration. 
public	TokenNamepublic	
XMLDocumentParser	TokenNameIdentifier	 XML Document Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XMLParserConfiguration	TokenNameIdentifier	 XML Parser Configuration
)	TokenNameRPAREN	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
createObject	TokenNameIdentifier	 create Object
(	TokenNameLPAREN	
"org.apache.xerces.xni.parser.XMLParserConfiguration"	TokenNameStringLiteral	org.apache.xerces.xni.parser.XMLParserConfiguration
,	TokenNameCOMMA	
"org.apache.xerces.parsers.XIncludeAwareParserConfiguration"	TokenNameStringLiteral	org.apache.xerces.parsers.XIncludeAwareParserConfiguration
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
/** * Constructs a document parser using the specified parser configuration. */	TokenNameCOMMENT_JAVADOC	 Constructs a document parser using the specified parser configuration. 
public	TokenNamepublic	
XMLDocumentParser	TokenNameIdentifier	 XML Document Parser
(	TokenNameLPAREN	
XMLParserConfiguration	TokenNameIdentifier	 XML Parser Configuration
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(ParserConfiguration) 	TokenNameCOMMENT_LINE	<init>(ParserConfiguration) 
/** * Constructs a document parser using the specified symbol table. */	TokenNameCOMMENT_JAVADOC	 Constructs a document parser using the specified symbol table. 
public	TokenNamepublic	
XMLDocumentParser	TokenNameIdentifier	 XML Document Parser
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XMLParserConfiguration	TokenNameIdentifier	 XML Parser Configuration
)	TokenNameRPAREN	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
createObject	TokenNameIdentifier	 create Object
(	TokenNameLPAREN	
"org.apache.xerces.xni.parser.XMLParserConfiguration"	TokenNameStringLiteral	org.apache.xerces.xni.parser.XMLParserConfiguration
,	TokenNameCOMMA	
"org.apache.xerces.parsers.XIncludeAwareParserConfiguration"	TokenNameStringLiteral	org.apache.xerces.parsers.XIncludeAwareParserConfiguration
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fConfiguration	TokenNameIdentifier	 f Configuration
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SYMBOL_TABLE_PROPERTY	TokenNameIdentifier	 SYMBOL  TABLE  PROPERTY
,	TokenNameCOMMA	
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(SymbolTable) 	TokenNameCOMMENT_LINE	<init>(SymbolTable) 
/** * Constructs a document parser using the specified symbol table and * grammar pool. */	TokenNameCOMMENT_JAVADOC	 Constructs a document parser using the specified symbol table and grammar pool. 
public	TokenNamepublic	
XMLDocumentParser	TokenNameIdentifier	 XML Document Parser
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
(	TokenNameLPAREN	
XMLParserConfiguration	TokenNameIdentifier	 XML Parser Configuration
)	TokenNameRPAREN	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
createObject	TokenNameIdentifier	 create Object
(	TokenNameLPAREN	
"org.apache.xerces.xni.parser.XMLParserConfiguration"	TokenNameStringLiteral	org.apache.xerces.xni.parser.XMLParserConfiguration
,	TokenNameCOMMA	
"org.apache.xerces.parsers.XIncludeAwareParserConfiguration"	TokenNameStringLiteral	org.apache.xerces.parsers.XIncludeAwareParserConfiguration
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fConfiguration	TokenNameIdentifier	 f Configuration
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SYMBOL_TABLE_PROPERTY	TokenNameIdentifier	 SYMBOL  TABLE  PROPERTY
,	TokenNameCOMMA	
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fConfiguration	TokenNameIdentifier	 f Configuration
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XMLGRAMMAR_POOL_PROPERTY	TokenNameIdentifier	 XMLGRAMMAR  POOL  PROPERTY
,	TokenNameCOMMA	
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XMLDocumentParser 	TokenNameCOMMENT_LINE	class XMLDocumentParser 
