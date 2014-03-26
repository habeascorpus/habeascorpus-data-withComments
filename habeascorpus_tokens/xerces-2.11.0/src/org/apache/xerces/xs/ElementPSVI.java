/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
;	TokenNameSEMICOLON	
/** * Represents a PSVI item for one element information item. */	TokenNameCOMMENT_JAVADOC	 Represents a PSVI item for one element information item. 
public	TokenNamepublic	
interface	TokenNameinterface	
ElementPSVI	TokenNameIdentifier	 Element PSVI
extends	TokenNameextends	
ItemPSVI	TokenNameIdentifier	 Item PSVI
{	TokenNameLBRACE	
/** * [element declaration]: an item isomorphic to the element declaration * used to validate this element. */	TokenNameCOMMENT_JAVADOC	 [element declaration]: an item isomorphic to the element declaration used to validate this element. 
public	TokenNamepublic	
XSElementDeclaration	TokenNameIdentifier	 XS Element Declaration
getElementDeclaration	TokenNameIdentifier	 get Element Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [notation]: the notation declaration. */	TokenNameCOMMENT_JAVADOC	 [notation]: the notation declaration. 
public	TokenNamepublic	
XSNotationDeclaration	TokenNameIdentifier	 XS Notation Declaration
getNotation	TokenNameIdentifier	 get Notation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [nil]: true if clause 3.2 of Element Locally Valid (Element) (3.3.4) is * satisfied, otherwise false. */	TokenNameCOMMENT_JAVADOC	 [nil]: true if clause 3.2 of Element Locally Valid (Element) (3.3.4) is satisfied, otherwise false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getNil	TokenNameIdentifier	 get Nil
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * schema information: the schema information property if it is the * validation root, <code>null</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 schema information: the schema information property if it is the validation root, <code>null</code> otherwise. 
public	TokenNamepublic	
XSModel	TokenNameIdentifier	 XS Model
getSchemaInformation	TokenNameIdentifier	 get Schema Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
