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
/** * This interface represents an XML Schema. */	TokenNameCOMMENT_JAVADOC	 This interface represents an XML Schema. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSModel	TokenNameIdentifier	 XS Model
{	TokenNameLBRACE	
/** * Convenience method. Returns a list of all namespaces that belong to * this schema. The value <code>null</code> is not a valid namespace * name, but if there are components that do not have a target namespace * , <code>null</code> is included in this list. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns a list of all namespaces that belong to this schema. The value <code>null</code> is not a valid namespace name, but if there are components that do not have a target namespace , <code>null</code> is included in this list. 
public	TokenNamepublic	
StringList	TokenNameIdentifier	 String List
getNamespaces	TokenNameIdentifier	 get Namespaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A set of namespace schema information information items (of type * <code>XSNamespaceItem</code>), one for each namespace name which * appears as the target namespace of any schema component in the schema * used for that assessment, and one for absent if any schema component * in the schema had no target namespace. For more information see * schema information. */	TokenNameCOMMENT_JAVADOC	 A set of namespace schema information information items (of type <code>XSNamespaceItem</code>), one for each namespace name which appears as the target namespace of any schema component in the schema used for that assessment, and one for absent if any schema component in the schema had no target namespace. For more information see schema information. 
public	TokenNamepublic	
XSNamespaceItemList	TokenNameIdentifier	 XS Namespace Item List
getNamespaceItems	TokenNameIdentifier	 get Namespace Items
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a list of top-level components, i.e. element declarations, * attribute declarations, etc. Identity-constraint definitions are also * considered top-level. * * @param objectType The type of the declaration, i.e. * <code>ELEMENT_DECLARATION</code>. Note that * <code>XSTypeDefinition.SIMPLE_TYPE</code> and * <code>XSTypeDefinition.COMPLEX_TYPE</code> can also be used as the * <code>objectType</code> to retrieve only complex types or simple * types, instead of all types. * @return A list of top-level definitions of the specified type in * <code>objectType</code> or an empty <code>XSNamedMap</code> if no * such definitions exist. */	TokenNameCOMMENT_JAVADOC	 Returns a list of top-level components, i.e. element declarations, attribute declarations, etc. Identity-constraint definitions are also considered top-level. * @param objectType The type of the declaration, i.e. <code>ELEMENT_DECLARATION</code>. Note that <code>XSTypeDefinition.SIMPLE_TYPE</code> and <code>XSTypeDefinition.COMPLEX_TYPE</code> can also be used as the <code>objectType</code> to retrieve only complex types or simple types, instead of all types. @return A list of top-level definitions of the specified type in <code>objectType</code> or an empty <code>XSNamedMap</code> if no such definitions exist. 
public	TokenNamepublic	
XSNamedMap	TokenNameIdentifier	 XS Named Map
getComponents	TokenNameIdentifier	 get Components
(	TokenNameLPAREN	
short	TokenNameshort	
objectType	TokenNameIdentifier	 object Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns a list of top-level component declarations * that are defined within the specified namespace, i.e. element * declarations, attribute declarations, etc. Identity-constraint * definitions are also considered top-level. * * @param objectType The type of the declaration, i.e. * <code>ELEMENT_DECLARATION</code>. * @param namespace The namespace to which the declaration belongs or * <code>null</code> (for components with no target namespace). * @return A list of top-level definitions of the specified type in * <code>objectType</code> and defined in the specified * <code>namespace</code> or an empty <code>XSNamedMap</code>. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns a list of top-level component declarations that are defined within the specified namespace, i.e. element declarations, attribute declarations, etc. Identity-constraint definitions are also considered top-level. * @param objectType The type of the declaration, i.e. <code>ELEMENT_DECLARATION</code>. @param namespace The namespace to which the declaration belongs or <code>null</code> (for components with no target namespace). @return A list of top-level definitions of the specified type in <code>objectType</code> and defined in the specified <code>namespace</code> or an empty <code>XSNamedMap</code>. 
public	TokenNamepublic	
XSNamedMap	TokenNameIdentifier	 XS Named Map
getComponentsByNamespace	TokenNameIdentifier	 get Components By Namespace
(	TokenNameLPAREN	
short	TokenNameshort	
objectType	TokenNameIdentifier	 object Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [annotations]: a set of annotations if it exists, otherwise an empty * <code>XSObjectList</code>. */	TokenNameCOMMENT_JAVADOC	 [annotations]: a set of annotations if it exists, otherwise an empty <code>XSObjectList</code>. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getAnnotations	TokenNameIdentifier	 get Annotations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns a top-level element declaration. * @param name The name of the declaration. * @param namespace The namespace of the declaration, otherwise * <code>null</code>. * @return A top-level element declaration or <code>null</code> if such a * declaration does not exist. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns a top-level element declaration. @param name The name of the declaration. @param namespace The namespace of the declaration, otherwise <code>null</code>. @return A top-level element declaration or <code>null</code> if such a declaration does not exist. 
public	TokenNamepublic	
XSElementDeclaration	TokenNameIdentifier	 XS Element Declaration
getElementDeclaration	TokenNameIdentifier	 get Element Declaration
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns a top-level attribute declaration. * @param name The name of the declaration. * @param namespace The namespace of the declaration, otherwise * <code>null</code>. * @return A top-level attribute declaration or <code>null</code> if such * a declaration does not exist. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns a top-level attribute declaration. @param name The name of the declaration. @param namespace The namespace of the declaration, otherwise <code>null</code>. @return A top-level attribute declaration or <code>null</code> if such a declaration does not exist. 
public	TokenNamepublic	
XSAttributeDeclaration	TokenNameIdentifier	 XS Attribute Declaration
getAttributeDeclaration	TokenNameIdentifier	 get Attribute Declaration
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns a top-level simple or complex type * definition. * @param name The name of the definition. * @param namespace The namespace of the declaration, otherwise * <code>null</code>. * @return An <code>XSTypeDefinition</code> or <code>null</code> if such * a definition does not exist. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns a top-level simple or complex type definition. @param name The name of the definition. @param namespace The namespace of the declaration, otherwise <code>null</code>. @return An <code>XSTypeDefinition</code> or <code>null</code> if such a definition does not exist. 
public	TokenNamepublic	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
getTypeDefinition	TokenNameIdentifier	 get Type Definition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns a top-level attribute group definition. * @param name The name of the definition. * @param namespace The namespace of the definition, otherwise * <code>null</code>. * @return A top-level attribute group definition or <code>null</code> if * such a definition does not exist. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns a top-level attribute group definition. @param name The name of the definition. @param namespace The namespace of the definition, otherwise <code>null</code>. @return A top-level attribute group definition or <code>null</code> if such a definition does not exist. 
public	TokenNamepublic	
XSAttributeGroupDefinition	TokenNameIdentifier	 XS Attribute Group Definition
getAttributeGroup	TokenNameIdentifier	 get Attribute Group
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns a top-level model group definition. * @param name The name of the definition. * @param namespace The namespace of the definition, otherwise * <code>null</code>. * @return A top-level model group definition or <code>null</code> if * such a definition does not exist. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns a top-level model group definition. @param name The name of the definition. @param namespace The namespace of the definition, otherwise <code>null</code>. @return A top-level model group definition or <code>null</code> if such a definition does not exist. 
public	TokenNamepublic	
XSModelGroupDefinition	TokenNameIdentifier	 XS Model Group Definition
getModelGroupDefinition	TokenNameIdentifier	 get Model Group Definition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns a top-level notation declaration. * @param name The name of the declaration. * @param namespace The namespace of the declaration, otherwise * <code>null</code>. * @return A top-level notation declaration or <code>null</code> if such * a declaration does not exist. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns a top-level notation declaration. @param name The name of the declaration. @param namespace The namespace of the declaration, otherwise <code>null</code>. @return A top-level notation declaration or <code>null</code> if such a declaration does not exist. 
public	TokenNamepublic	
XSNotationDeclaration	TokenNameIdentifier	 XS Notation Declaration
getNotationDeclaration	TokenNameIdentifier	 get Notation Declaration
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns an identity-constraint definition. * @param name The name of the definition. * @param namespace The namespace of the definition, otherwise * <code>null</code>. * @return An identity-constraint definition or <code>null</code> if such * a declaration does not exist. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns an identity-constraint definition. @param name The name of the definition. @param namespace The namespace of the definition, otherwise <code>null</code>. @return An identity-constraint definition or <code>null</code> if such a declaration does not exist. 
public	TokenNamepublic	
XSIDCDefinition	TokenNameIdentifier	 XSIDC Definition
getIDCDefinition	TokenNameIdentifier	 get IDC Definition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns a list containing the members of the * substitution group for the given <code>XSElementDeclaration</code> * or an empty <code>XSObjectList</code> if the substitution group * contains no members. * @param head The substitution group head. * @return A list containing the members of the substitution group * for the given <code>XSElementDeclaration</code> or an empty * <code>XSObjectList</code> if the substitution group contains * no members. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns a list containing the members of the substitution group for the given <code>XSElementDeclaration</code> or an empty <code>XSObjectList</code> if the substitution group contains no members. @param head The substitution group head. @return A list containing the members of the substitution group for the given <code>XSElementDeclaration</code> or an empty <code>XSObjectList</code> if the substitution group contains no members. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getSubstitutionGroup	TokenNameIdentifier	 get Substitution Group
(	TokenNameLPAREN	
XSElementDeclaration	TokenNameIdentifier	 XS Element Declaration
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
