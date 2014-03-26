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
/** * This is the main Xerces SAX parser class. It uses the abstract SAX * parser with a document scanner, a dtd scanner, and a validator, as * well as a grammar pool. * * @author Arnaud Le Hors, IBM * @author Andy Clark, IBM * * @version $Id: SAXParser.java 447239 2006-09-18 05:08:26Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This is the main Xerces SAX parser class. It uses the abstract SAX parser with a document scanner, a dtd scanner, and a validator, as well as a grammar pool. * @author Arnaud Le Hors, IBM @author Andy Clark, IBM * @version $Id: SAXParser.java 447239 2006-09-18 05:08:26Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
SAXParser	TokenNameIdentifier	 SAX Parser
extends	TokenNameextends	
AbstractSAXParser	TokenNameIdentifier	 Abstract SAX Parser
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
// features 	TokenNameCOMMENT_LINE	features 
/** Feature identifier: notify built-in refereces. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: notify built-in refereces. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NOTIFY_BUILTIN_REFS	TokenNameIdentifier	 NOTIFY  BUILTIN  REFS
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
NOTIFY_BUILTIN_REFS_FEATURE	TokenNameIdentifier	 NOTIFY  BUILTIN  REFS  FEATURE
;	TokenNameSEMICOLON	
/** Recognized features. */	TokenNameCOMMENT_JAVADOC	 Recognized features. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
RECOGNIZED_FEATURES	TokenNameIdentifier	 RECOGNIZED  FEATURES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
NOTIFY_BUILTIN_REFS	TokenNameIdentifier	 NOTIFY  BUILTIN  REFS
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// properties 	TokenNameCOMMENT_LINE	properties 
/** Property identifier: symbol table. */	TokenNameCOMMENT_JAVADOC	 Property identifier: symbol table. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SYMBOL_TABLE	TokenNameIdentifier	 SYMBOL  TABLE
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SYMBOL_TABLE_PROPERTY	TokenNameIdentifier	 SYMBOL  TABLE  PROPERTY
;	TokenNameSEMICOLON	
/** Property identifier: XML grammar pool. */	TokenNameCOMMENT_JAVADOC	 Property identifier: XML grammar pool. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLGRAMMAR_POOL	TokenNameIdentifier	 XMLGRAMMAR  POOL
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XMLGRAMMAR_POOL_PROPERTY	TokenNameIdentifier	 XMLGRAMMAR  POOL  PROPERTY
;	TokenNameSEMICOLON	
/** Recognized properties. */	TokenNameCOMMENT_JAVADOC	 Recognized properties. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
RECOGNIZED_PROPERTIES	TokenNameIdentifier	 RECOGNIZED  PROPERTIES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
SYMBOL_TABLE	TokenNameIdentifier	 SYMBOL  TABLE
,	TokenNameCOMMA	
XMLGRAMMAR_POOL	TokenNameIdentifier	 XMLGRAMMAR  POOL
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a SAX parser using the specified parser configuration. */	TokenNameCOMMENT_JAVADOC	 Constructs a SAX parser using the specified parser configuration. 
public	TokenNamepublic	
SAXParser	TokenNameIdentifier	 SAX Parser
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
// <init>(XMLParserConfiguration) 	TokenNameCOMMENT_LINE	<init>(XMLParserConfiguration) 
/** * Constructs a SAX parser using the dtd/xml schema parser configuration. */	TokenNameCOMMENT_JAVADOC	 Constructs a SAX parser using the dtd/xml schema parser configuration. 
public	TokenNamepublic	
SAXParser	TokenNameIdentifier	 SAX Parser
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
/** * Constructs a SAX parser using the specified symbol table. */	TokenNameCOMMENT_JAVADOC	 Constructs a SAX parser using the specified symbol table. 
public	TokenNamepublic	
SAXParser	TokenNameIdentifier	 SAX Parser
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
/** * Constructs a SAX parser using the specified symbol table and * grammar pool. */	TokenNameCOMMENT_JAVADOC	 Constructs a SAX parser using the specified symbol table and grammar pool. 
public	TokenNamepublic	
SAXParser	TokenNameIdentifier	 SAX Parser
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
// set features 	TokenNameCOMMENT_LINE	set features 
fConfiguration	TokenNameIdentifier	 f Configuration
.	TokenNameDOT	
addRecognizedFeatures	TokenNameIdentifier	 add Recognized Features
(	TokenNameLPAREN	
RECOGNIZED_FEATURES	TokenNameIdentifier	 RECOGNIZED  FEATURES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fConfiguration	TokenNameIdentifier	 f Configuration
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
NOTIFY_BUILTIN_REFS	TokenNameIdentifier	 NOTIFY  BUILTIN  REFS
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set properties 	TokenNameCOMMENT_LINE	set properties 
fConfiguration	TokenNameIdentifier	 f Configuration
.	TokenNameDOT	
addRecognizedProperties	TokenNameIdentifier	 add Recognized Properties
(	TokenNameLPAREN	
RECOGNIZED_PROPERTIES	TokenNameIdentifier	 RECOGNIZED  PROPERTIES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fConfiguration	TokenNameIdentifier	 f Configuration
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
SYMBOL_TABLE	TokenNameIdentifier	 SYMBOL  TABLE
,	TokenNameCOMMA	
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
grammarPool	TokenNameIdentifier	 grammar Pool
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fConfiguration	TokenNameIdentifier	 f Configuration
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
XMLGRAMMAR_POOL	TokenNameIdentifier	 XMLGRAMMAR  POOL
,	TokenNameCOMMA	
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// <init>(SymbolTable,XMLGrammarPool) 	TokenNameCOMMENT_LINE	<init>(SymbolTable,XMLGrammarPool) 
}	TokenNameRBRACE	
// class SAXParser 	TokenNameCOMMENT_LINE	class SAXParser 
