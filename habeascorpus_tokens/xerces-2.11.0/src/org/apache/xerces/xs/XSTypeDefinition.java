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
/** * This interface represents a complex or simple type definition. */	TokenNameCOMMENT_JAVADOC	 This interface represents a complex or simple type definition. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
extends	TokenNameextends	
XSObject	TokenNameIdentifier	 XS Object
{	TokenNameLBRACE	
/** * The object describes a complex type. */	TokenNameCOMMENT_JAVADOC	 The object describes a complex type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
COMPLEX_TYPE	TokenNameIdentifier	 COMPLEX  TYPE
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The object describes a simple type. */	TokenNameCOMMENT_JAVADOC	 The object describes a simple type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
SIMPLE_TYPE	TokenNameIdentifier	 SIMPLE  TYPE
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Return whether this type definition is a simple type or complex type. */	TokenNameCOMMENT_JAVADOC	 Return whether this type definition is a simple type or complex type. 
public	TokenNamepublic	
short	TokenNameshort	
getTypeCategory	TokenNameIdentifier	 get Type Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * {base type definition}: either a simple type definition or a complex * type definition. */	TokenNameCOMMENT_JAVADOC	 {base type definition}: either a simple type definition or a complex type definition. 
public	TokenNamepublic	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
getBaseType	TokenNameIdentifier	 get Base Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * {final}. For a complex type definition it is a subset of {extension, * restriction}. For a simple type definition it is a subset of * {extension, list, restriction, union}. * @param restriction Extension, restriction, list, union constants * (defined in <code>XSConstants</code>). * @return True if <code>restriction</code> is in the final set, * otherwise false. */	TokenNameCOMMENT_JAVADOC	 {final}. For a complex type definition it is a subset of {extension, restriction}. For a simple type definition it is a subset of {extension, list, restriction, union}. @param restriction Extension, restriction, list, union constants (defined in <code>XSConstants</code>). @return True if <code>restriction</code> is in the final set, otherwise false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFinal	TokenNameIdentifier	 is Final
(	TokenNameLPAREN	
short	TokenNameshort	
restriction	TokenNameIdentifier	 restriction
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * For complex types the returned value is a bit combination of the subset * of {<code>DERIVATION_EXTENSION, DERIVATION_RESTRICTION</code>} * corresponding to <code>final</code> set of this type or * <code>DERIVATION_NONE</code>. For simple types the returned value is * a bit combination of the subset of { * <code>DERIVATION_RESTRICTION, DERIVATION_EXTENSION, DERIVATION_UNION, DERIVATION_LIST</code> * } corresponding to <code>final</code> set of this type or * <code>DERIVATION_NONE</code>. */	TokenNameCOMMENT_JAVADOC	 For complex types the returned value is a bit combination of the subset of {<code>DERIVATION_EXTENSION, DERIVATION_RESTRICTION</code>} corresponding to <code>final</code> set of this type or <code>DERIVATION_NONE</code>. For simple types the returned value is a bit combination of the subset of { <code>DERIVATION_RESTRICTION, DERIVATION_EXTENSION, DERIVATION_UNION, DERIVATION_LIST</code> } corresponding to <code>final</code> set of this type or <code>DERIVATION_NONE</code>. 
public	TokenNamepublic	
short	TokenNameshort	
getFinal	TokenNameIdentifier	 get Final
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience attribute. A boolean that specifies if the type definition * is anonymous. */	TokenNameCOMMENT_JAVADOC	 Convenience attribute. A boolean that specifies if the type definition is anonymous. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getAnonymous	TokenNameIdentifier	 get Anonymous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method which checks if this type is derived from the given * <code>ancestorType</code>. * @param ancestorType An ancestor type definition. * @param derivationMethod A bit combination representing a subset of { * <code>DERIVATION_RESTRICTION, DERIVATION_EXTENSION, DERIVATION_UNION, DERIVATION_LIST</code> * }. * @return True if this type is derived from <code>ancestorType</code> * using only derivation methods from the <code>derivationMethod</code> * . */	TokenNameCOMMENT_JAVADOC	 Convenience method which checks if this type is derived from the given <code>ancestorType</code>. @param ancestorType An ancestor type definition. @param derivationMethod A bit combination representing a subset of { <code>DERIVATION_RESTRICTION, DERIVATION_EXTENSION, DERIVATION_UNION, DERIVATION_LIST</code> }. @return True if this type is derived from <code>ancestorType</code> using only derivation methods from the <code>derivationMethod</code> . 
public	TokenNamepublic	
boolean	TokenNameboolean	
derivedFromType	TokenNameIdentifier	 derived From Type
(	TokenNameLPAREN	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
ancestorType	TokenNameIdentifier	 ancestor Type
,	TokenNameCOMMA	
short	TokenNameshort	
derivationMethod	TokenNameIdentifier	 derivation Method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method which checks if this type is derived from the given * ancestor type. * @param namespace An ancestor type namespace. * @param name An ancestor type name. * @param derivationMethod A bit combination representing a subset of { * <code>DERIVATION_RESTRICTION, DERIVATION_EXTENSION, DERIVATION_UNION, DERIVATION_LIST</code> * }. * @return True if this type is derived from <code>ancestorType</code> * using only derivation methods from the <code>derivationMethod</code> * . */	TokenNameCOMMENT_JAVADOC	 Convenience method which checks if this type is derived from the given ancestor type. @param namespace An ancestor type namespace. @param name An ancestor type name. @param derivationMethod A bit combination representing a subset of { <code>DERIVATION_RESTRICTION, DERIVATION_EXTENSION, DERIVATION_UNION, DERIVATION_LIST</code> }. @return True if this type is derived from <code>ancestorType</code> using only derivation methods from the <code>derivationMethod</code> . 
public	TokenNamepublic	
boolean	TokenNameboolean	
derivedFrom	TokenNameIdentifier	 derived From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
short	TokenNameshort	
derivationMethod	TokenNameIdentifier	 derivation Method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
