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
/** * The interface represents the namespace schema information information item. * Each namespace schema information information item corresponds to an XML * Schema with a unique namespace name. */	TokenNameCOMMENT_JAVADOC	 The interface represents the namespace schema information information item. Each namespace schema information information item corresponds to an XML Schema with a unique namespace name. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSNamespaceItem	TokenNameIdentifier	 XS Namespace Item
{	TokenNameLBRACE	
/** * [schema namespace]: A namespace name or <code>null</code> if absent. */	TokenNameCOMMENT_JAVADOC	 [schema namespace]: A namespace name or <code>null</code> if absent. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSchemaNamespace	TokenNameIdentifier	 get Schema Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [schema components]: a list of top-level components, i.e. element * declarations, attribute declarations, etc. Identity-constraint * definitions are also considered top-level. * * @param objectType The type of the declaration, i.e. * <code>ELEMENT_DECLARATION</code>. Note that * <code>XSTypeDefinition.SIMPLE_TYPE</code> and * <code>XSTypeDefinition.COMPLEX_TYPE</code> can also be used as the * <code>objectType</code> to retrieve only complex types or simple * types, instead of all types. * @return A list of top-level definition of the specified type in * <code>objectType</code> or an empty <code>XSNamedMap</code> if no * such definitions exist. */	TokenNameCOMMENT_JAVADOC	 [schema components]: a list of top-level components, i.e. element declarations, attribute declarations, etc. Identity-constraint definitions are also considered top-level. * @param objectType The type of the declaration, i.e. <code>ELEMENT_DECLARATION</code>. Note that <code>XSTypeDefinition.SIMPLE_TYPE</code> and <code>XSTypeDefinition.COMPLEX_TYPE</code> can also be used as the <code>objectType</code> to retrieve only complex types or simple types, instead of all types. @return A list of top-level definition of the specified type in <code>objectType</code> or an empty <code>XSNamedMap</code> if no such definitions exist. 
public	TokenNamepublic	
XSNamedMap	TokenNameIdentifier	 XS Named Map
getComponents	TokenNameIdentifier	 get Components
(	TokenNameLPAREN	
short	TokenNameshort	
objectType	TokenNameIdentifier	 object Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [annotations]: a set of annotations if it exists, otherwise an empty * <code>XSObjectList</code>. */	TokenNameCOMMENT_JAVADOC	 [annotations]: a set of annotations if it exists, otherwise an empty <code>XSObjectList</code>. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getAnnotations	TokenNameIdentifier	 get Annotations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns a top-level element declaration. * @param name The name of the declaration. * @return A top-level element declaration or <code>null</code> if such a * declaration does not exist. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns a top-level element declaration. @param name The name of the declaration. @return A top-level element declaration or <code>null</code> if such a declaration does not exist. 
public	TokenNamepublic	
XSElementDeclaration	TokenNameIdentifier	 XS Element Declaration
getElementDeclaration	TokenNameIdentifier	 get Element Declaration
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns a top-level attribute declaration. * @param name The name of the declaration. * @return A top-level attribute declaration or <code>null</code> if such * a declaration does not exist. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns a top-level attribute declaration. @param name The name of the declaration. @return A top-level attribute declaration or <code>null</code> if such a declaration does not exist. 
public	TokenNamepublic	
XSAttributeDeclaration	TokenNameIdentifier	 XS Attribute Declaration
getAttributeDeclaration	TokenNameIdentifier	 get Attribute Declaration
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns a top-level simple or complex type * definition. * @param name The name of the definition. * @return An <code>XSTypeDefinition</code> or <code>null</code> if such * a definition does not exist. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns a top-level simple or complex type definition. @param name The name of the definition. @return An <code>XSTypeDefinition</code> or <code>null</code> if such a definition does not exist. 
public	TokenNamepublic	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
getTypeDefinition	TokenNameIdentifier	 get Type Definition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns a top-level attribute group definition. * @param name The name of the definition. * @return A top-level attribute group definition or <code>null</code> if * such a definition does not exist. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns a top-level attribute group definition. @param name The name of the definition. @return A top-level attribute group definition or <code>null</code> if such a definition does not exist. 
public	TokenNamepublic	
XSAttributeGroupDefinition	TokenNameIdentifier	 XS Attribute Group Definition
getAttributeGroup	TokenNameIdentifier	 get Attribute Group
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns a top-level model group definition. * @param name The name of the definition. * @return A top-level model group definition definition or * <code>null</code> if such a definition does not exist. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns a top-level model group definition. @param name The name of the definition. @return A top-level model group definition definition or <code>null</code> if such a definition does not exist. 
public	TokenNamepublic	
XSModelGroupDefinition	TokenNameIdentifier	 XS Model Group Definition
getModelGroupDefinition	TokenNameIdentifier	 get Model Group Definition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns a top-level notation declaration. * @param name The name of the declaration. * @return A top-level notation declaration or <code>null</code> if such * a declaration does not exist. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns a top-level notation declaration. @param name The name of the declaration. @return A top-level notation declaration or <code>null</code> if such a declaration does not exist. 
public	TokenNamepublic	
XSNotationDeclaration	TokenNameIdentifier	 XS Notation Declaration
getNotationDeclaration	TokenNameIdentifier	 get Notation Declaration
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns an identity-constraint definition. * @param name The name of the definition. * @return An identity-constraint definition or <code>null</code> if such * a declaration does not exist. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns an identity-constraint definition. @param name The name of the definition. @return An identity-constraint definition or <code>null</code> if such a declaration does not exist. 
public	TokenNamepublic	
XSIDCDefinition	TokenNameIdentifier	 XSIDC Definition
getIDCDefinition	TokenNameIdentifier	 get IDC Definition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [document location] - a list of location URIs for the documents that * contributed to the <code>XSModel</code>. */	TokenNameCOMMENT_JAVADOC	 [document location] - a list of location URIs for the documents that contributed to the <code>XSModel</code>. 
public	TokenNamepublic	
StringList	TokenNameIdentifier	 String List
getDocumentLocations	TokenNameIdentifier	 get Document Locations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
