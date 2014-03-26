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
/** * This interface represents the Complex Type Definition schema component. */	TokenNameCOMMENT_JAVADOC	 This interface represents the Complex Type Definition schema component. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSComplexTypeDefinition	TokenNameIdentifier	 XS Complex Type Definition
extends	TokenNameextends	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
{	TokenNameLBRACE	
// Content Model Types 	TokenNameCOMMENT_LINE	Content Model Types 
/** * Represents an empty content type. A content type with the distinguished * value empty validates elements with no character or element * information item children. */	TokenNameCOMMENT_JAVADOC	 Represents an empty content type. A content type with the distinguished value empty validates elements with no character or element information item children. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTTYPE_EMPTY	TokenNameIdentifier	 CONTENTTYPE  EMPTY
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a simple content type. A content type which is simple * validates elements with character-only children. */	TokenNameCOMMENT_JAVADOC	 Represents a simple content type. A content type which is simple validates elements with character-only children. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTTYPE_SIMPLE	TokenNameIdentifier	 CONTENTTYPE  SIMPLE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents an element-only content type. An element-only content type * validates elements with children that conform to the supplied content * model. */	TokenNameCOMMENT_JAVADOC	 Represents an element-only content type. An element-only content type validates elements with children that conform to the supplied content model. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTTYPE_ELEMENT	TokenNameIdentifier	 CONTENTTYPE  ELEMENT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a mixed content type. */	TokenNameCOMMENT_JAVADOC	 Represents a mixed content type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTTYPE_MIXED	TokenNameIdentifier	 CONTENTTYPE  MIXED
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [derivation method]: either <code>DERIVATION_EXTENSION</code>, * <code>DERIVATION_RESTRICTION</code>, or <code>DERIVATION_NONE</code> * (see <code>XSConstants</code>). */	TokenNameCOMMENT_JAVADOC	 [derivation method]: either <code>DERIVATION_EXTENSION</code>, <code>DERIVATION_RESTRICTION</code>, or <code>DERIVATION_NONE</code> (see <code>XSConstants</code>). 
public	TokenNamepublic	
short	TokenNameshort	
getDerivationMethod	TokenNameIdentifier	 get Derivation Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [abstract]: a boolean. Complex types for which <code>abstract</code> is * true must not be used as the type definition for the validation of * element information items. */	TokenNameCOMMENT_JAVADOC	 [abstract]: a boolean. Complex types for which <code>abstract</code> is true must not be used as the type definition for the validation of element information items. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getAbstract	TokenNameIdentifier	 get Abstract
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A set of attribute uses if it exists, otherwise an empty * <code>XSObjectList</code>. */	TokenNameCOMMENT_JAVADOC	 A set of attribute uses if it exists, otherwise an empty <code>XSObjectList</code>. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getAttributeUses	TokenNameIdentifier	 get Attribute Uses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * An attribute wildcard if it exists, otherwise <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 An attribute wildcard if it exists, otherwise <code>null</code>. 
public	TokenNamepublic	
XSWildcard	TokenNameIdentifier	 XS Wildcard
getAttributeWildcard	TokenNameIdentifier	 get Attribute Wildcard
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [content type]: one of empty (<code>CONTENTTYPE_EMPTY</code>), a simple * type definition (<code>CONTENTTYPE_SIMPLE</code>), mixed ( * <code>CONTENTTYPE_MIXED</code>), or element-only ( * <code>CONTENTTYPE_ELEMENT</code>). */	TokenNameCOMMENT_JAVADOC	 [content type]: one of empty (<code>CONTENTTYPE_EMPTY</code>), a simple type definition (<code>CONTENTTYPE_SIMPLE</code>), mixed ( <code>CONTENTTYPE_MIXED</code>), or element-only ( <code>CONTENTTYPE_ELEMENT</code>). 
public	TokenNamepublic	
short	TokenNameshort	
getContentType	TokenNameIdentifier	 get Content Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A simple type definition corresponding to a simple content model, * otherwise <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 A simple type definition corresponding to a simple content model, otherwise <code>null</code>. 
public	TokenNamepublic	
XSSimpleTypeDefinition	TokenNameIdentifier	 XS Simple Type Definition
getSimpleType	TokenNameIdentifier	 get Simple Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A particle for a mixed or element-only content model, otherwise * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 A particle for a mixed or element-only content model, otherwise <code>null</code>. 
public	TokenNamepublic	
XSParticle	TokenNameIdentifier	 XS Particle
getParticle	TokenNameIdentifier	 get Particle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [prohibited substitutions]: a subset of {extension, restriction} * @param restriction Extension or restriction constants (see * <code>XSConstants</code>). * @return True if <code>restriction</code> is a prohibited substitution, * otherwise false. */	TokenNameCOMMENT_JAVADOC	 [prohibited substitutions]: a subset of {extension, restriction} @param restriction Extension or restriction constants (see <code>XSConstants</code>). @return True if <code>restriction</code> is a prohibited substitution, otherwise false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isProhibitedSubstitution	TokenNameIdentifier	 is Prohibited Substitution
(	TokenNameLPAREN	
short	TokenNameshort	
restriction	TokenNameIdentifier	 restriction
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [prohibited substitutions]: A subset of {extension, restriction} or * <code>DERIVATION_NONE</code> represented as a bit flag (see * <code>XSConstants</code>). */	TokenNameCOMMENT_JAVADOC	 [prohibited substitutions]: A subset of {extension, restriction} or <code>DERIVATION_NONE</code> represented as a bit flag (see <code>XSConstants</code>). 
public	TokenNamepublic	
short	TokenNameshort	
getProhibitedSubstitutions	TokenNameIdentifier	 get Prohibited Substitutions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A sequence of [annotations] or an empty <code>XSObjectList</code>. */	TokenNameCOMMENT_JAVADOC	 A sequence of [annotations] or an empty <code>XSObjectList</code>. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getAnnotations	TokenNameIdentifier	 get Annotations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
