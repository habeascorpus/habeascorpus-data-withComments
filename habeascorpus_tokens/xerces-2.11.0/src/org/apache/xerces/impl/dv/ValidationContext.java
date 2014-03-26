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
dv	TokenNameIdentifier	 dv
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
/** * ValidationContext has all the information required for the * validation of: id, idref, entity, notation, qname * * @xerces.internal * * @author Sandy Gao, IBM * @version $Id: ValidationContext.java 713638 2008-11-13 04:42:18Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 ValidationContext has all the information required for the validation of: id, idref, entity, notation, qname * @xerces.internal * @author Sandy Gao, IBM @version $Id: ValidationContext.java 713638 2008-11-13 04:42:18Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ValidationContext	TokenNameIdentifier	 Validation Context
{	TokenNameLBRACE	
// whether to validate against facets 	TokenNameCOMMENT_LINE	whether to validate against facets 
public	TokenNamepublic	
boolean	TokenNameboolean	
needFacetChecking	TokenNameIdentifier	 need Facet Checking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// whether to do extra id/idref/entity checking 	TokenNameCOMMENT_LINE	whether to do extra id/idref/entity checking 
public	TokenNamepublic	
boolean	TokenNameboolean	
needExtraChecking	TokenNameIdentifier	 need Extra Checking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// whether we need to normalize the value that is passed! 	TokenNameCOMMENT_LINE	whether we need to normalize the value that is passed! 
public	TokenNamepublic	
boolean	TokenNameboolean	
needToNormalize	TokenNameIdentifier	 need To Normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// are namespaces relevant in this context? 	TokenNameCOMMENT_LINE	are namespaces relevant in this context? 
public	TokenNamepublic	
boolean	TokenNameboolean	
useNamespaces	TokenNameIdentifier	 use Namespaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// entity 	TokenNameCOMMENT_LINE	entity 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEntityDeclared	TokenNameIdentifier	 is Entity Declared
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isEntityUnparsed	TokenNameIdentifier	 is Entity Unparsed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// id 	TokenNameCOMMENT_LINE	id 
public	TokenNamepublic	
boolean	TokenNameboolean	
isIdDeclared	TokenNameIdentifier	 is Id Declared
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
addId	TokenNameIdentifier	 add Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// idref 	TokenNameCOMMENT_LINE	idref 
public	TokenNamepublic	
void	TokenNamevoid	
addIdRef	TokenNameIdentifier	 add Id Ref
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get symbol from symbol table 	TokenNameCOMMENT_LINE	get symbol from symbol table 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSymbol	TokenNameIdentifier	 get Symbol
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// qname 	TokenNameCOMMENT_LINE	qname 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Locale 	TokenNameCOMMENT_LINE	Locale 
public	TokenNamepublic	
Locale	TokenNameIdentifier	 Locale
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
