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
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
DTDDVFactory	TokenNameIdentifier	 DTDDV Factory
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLParserConfiguration	TokenNameIdentifier	 XML Parser Configuration
;	TokenNameSEMICOLON	
/** * @version $Id: XMLGrammarParser.java 447239 2006-09-18 05:08:26Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @version $Id: XMLGrammarParser.java 447239 2006-09-18 05:08:26Z mrglavas $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
XMLGrammarParser	TokenNameIdentifier	 XML Grammar Parser
extends	TokenNameextends	
XMLParser	TokenNameIdentifier	 XML Parser
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** fDatatypeValidatorFactory */	TokenNameCOMMENT_JAVADOC	 fDatatypeValidatorFactory 
protected	TokenNameprotected	
DTDDVFactory	TokenNameIdentifier	 DTDDV Factory
fDatatypeValidatorFactory	TokenNameIdentifier	 f Datatype Validator Factory
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Construct an XMLGrammarParser with the specified symbol table * * @param symbolTable */	TokenNameCOMMENT_JAVADOC	 Construct an XMLGrammarParser with the specified symbol table * @param symbolTable 
protected	TokenNameprotected	
XMLGrammarParser	TokenNameIdentifier	 XML Grammar Parser
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
}	TokenNameRBRACE	
// class XMLGrammarParser 	TokenNameCOMMENT_LINE	class XMLGrammarParser 
