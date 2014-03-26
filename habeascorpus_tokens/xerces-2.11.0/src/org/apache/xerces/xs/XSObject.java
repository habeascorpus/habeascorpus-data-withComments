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
/** * The <code>XSObject</code> is a base object for the XML Schema component * model. */	TokenNameCOMMENT_JAVADOC	 The <code>XSObject</code> is a base object for the XML Schema component model. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSObject	TokenNameIdentifier	 XS Object
{	TokenNameLBRACE	
/** * The <code>type</code> of this object, i.e. * <code>ELEMENT_DECLARATION</code>. */	TokenNameCOMMENT_JAVADOC	 The <code>type</code> of this object, i.e. <code>ELEMENT_DECLARATION</code>. 
public	TokenNamepublic	
short	TokenNameshort	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The name of type <code>NCName</code>, as defined in XML Namespaces, of * this declaration specified in the <code>{name}</code> property of the * component or <code>null</code> if the definition of this component * does not have a <code>{name}</code> property. For anonymous types, * the processor must construct and expose an anonymous type name that * is distinct from the name of every named type and the name of every * other anonymous type. */	TokenNameCOMMENT_JAVADOC	 The name of type <code>NCName</code>, as defined in XML Namespaces, of this declaration specified in the <code>{name}</code> property of the component or <code>null</code> if the definition of this component does not have a <code>{name}</code> property. For anonymous types, the processor must construct and expose an anonymous type name that is distinct from the name of every named type and the name of every other anonymous type. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The [target namespace] of this object, or <code>null</code> if it is * unspecified. */	TokenNameCOMMENT_JAVADOC	 The [target namespace] of this object, or <code>null</code> if it is unspecified. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A namespace schema information item corresponding to the target * namespace of the component, if it is globally declared; or * <code>null</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 A namespace schema information item corresponding to the target namespace of the component, if it is globally declared; or <code>null</code> otherwise. 
public	TokenNamepublic	
XSNamespaceItem	TokenNameIdentifier	 XS Namespace Item
getNamespaceItem	TokenNameIdentifier	 get Namespace Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
