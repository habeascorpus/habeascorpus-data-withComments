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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
traversers	TokenNameIdentifier	 traversers
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSAnnotationImpl	TokenNameIdentifier	 XS Annotation Impl
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XInt	TokenNameIdentifier	 X Int
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
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
DOMUtil	TokenNameIdentifier	 DOM Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSObjectList	TokenNameIdentifier	 XS Object List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * The wildcard schema component traverser. * * &lt;any * id = ID * maxOccurs = (nonNegativeInteger | unbounded) : 1 * minOccurs = nonNegativeInteger : 1 * namespace = ((##any | ##other) | List of (anyURI | (##targetNamespace | ##local)) ) : ##any * processContents = (lax | skip | strict) : strict * {any attributes with non-schema namespace . . .}&gt; * Content: (annotation?) * &lt;/any&gt; * * &lt;anyAttribute * id = ID * namespace = ((##any | ##other) | List of (anyURI | (##targetNamespace | ##local)) ) : ##any * processContents = (lax | skip | strict) : strict * {any attributes with non-schema namespace . . .}&gt; * Content: (annotation?) * &lt;/anyAttribute&gt; * * @xerces.internal * * @author Rahul Srivastava, Sun Microsystems Inc. * @author Sandy Gao, IBM * * @version $Id: XSDWildcardTraverser.java 725840 2008-12-11 22:19:06Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The wildcard schema component traverser. * &lt;any id = ID maxOccurs = (nonNegativeInteger | unbounded) : 1 minOccurs = nonNegativeInteger : 1 namespace = ((##any | ##other) | List of (anyURI | (##targetNamespace | ##local)) ) : ##any processContents = (lax | skip | strict) : strict {any attributes with non-schema namespace . . .}&gt; Content: (annotation?) &lt;/any&gt; * &lt;anyAttribute id = ID namespace = ((##any | ##other) | List of (anyURI | (##targetNamespace | ##local)) ) : ##any processContents = (lax | skip | strict) : strict {any attributes with non-schema namespace . . .}&gt; Content: (annotation?) &lt;/anyAttribute&gt; * @xerces.internal * @author Rahul Srivastava, Sun Microsystems Inc. @author Sandy Gao, IBM * @version $Id: XSDWildcardTraverser.java 725840 2008-12-11 22:19:06Z mrglavas $ 
class	TokenNameclass	
XSDWildcardTraverser	TokenNameIdentifier	 XSD Wildcard Traverser
extends	TokenNameextends	
XSDAbstractTraverser	TokenNameIdentifier	 XSD Abstract Traverser
{	TokenNameLBRACE	
/** * constructor * * @param handler * @param errorReporter * @param gAttrCheck */	TokenNameCOMMENT_JAVADOC	 constructor * @param handler @param errorReporter @param gAttrCheck 
XSDWildcardTraverser	TokenNameIdentifier	 XSD Wildcard Traverser
(	TokenNameLPAREN	
XSDHandler	TokenNameIdentifier	 XSD Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
gAttrCheck	TokenNameIdentifier	 g Attr Check
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
gAttrCheck	TokenNameIdentifier	 g Attr Check
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse &lt;any&gt; * * @param elmNode * @param schemaDoc * @param grammar * @return the wildcard node index */	TokenNameCOMMENT_JAVADOC	 Traverse &lt;any&gt; * @param elmNode @param schemaDoc @param grammar @return the wildcard node index 
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
traverseAny	TokenNameIdentifier	 traverse Any
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elmNode	TokenNameIdentifier	 elm Node
,	TokenNameCOMMA	
XSDocumentInfo	TokenNameIdentifier	 XS Document Info
schemaDoc	TokenNameIdentifier	 schema Doc
,	TokenNameCOMMA	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// General Attribute Checking for elmNode 	TokenNameCOMMENT_LINE	General Attribute Checking for elmNode 
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attrValues	TokenNameIdentifier	 attr Values
=	TokenNameEQUAL	
fAttrChecker	TokenNameIdentifier	 f Attr Checker
.	TokenNameDOT	
checkAttributes	TokenNameIdentifier	 check Attributes
(	TokenNameLPAREN	
elmNode	TokenNameIdentifier	 elm Node
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
wildcard	TokenNameIdentifier	 wildcard
=	TokenNameEQUAL	
traverseWildcardDecl	TokenNameIdentifier	 traverse Wildcard Decl
(	TokenNameLPAREN	
elmNode	TokenNameIdentifier	 elm Node
,	TokenNameCOMMA	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
,	TokenNameCOMMA	
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for <any>, need to create a new particle to reflect the min/max values 	TokenNameCOMMENT_LINE	for <any>, need to create a new particle to reflect the min/max values 
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
particle	TokenNameIdentifier	 particle
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wildcard	TokenNameIdentifier	 wildcard
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XInt	TokenNameIdentifier	 X Int
)	TokenNameRPAREN	
attrValues	TokenNameIdentifier	 attr Values
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_MINOCCURS	TokenNameIdentifier	 ATTIDX  MINOCCURS
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XInt	TokenNameIdentifier	 X Int
)	TokenNameRPAREN	
attrValues	TokenNameIdentifier	 attr Values
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_MAXOCCURS	TokenNameIdentifier	 ATTIDX  MAXOCCURS
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fSchemaHandler	TokenNameIdentifier	 f Schema Handler
.	TokenNameDOT	
fDeclPool	TokenNameIdentifier	 f Decl Pool
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
particle	TokenNameIdentifier	 particle
=	TokenNameEQUAL	
fSchemaHandler	TokenNameIdentifier	 f Schema Handler
.	TokenNameDOT	
fDeclPool	TokenNameIdentifier	 f Decl Pool
.	TokenNameDOT	
getParticleDecl	TokenNameIdentifier	 get Particle Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
particle	TokenNameIdentifier	 particle
=	TokenNameEQUAL	
new	TokenNamenew	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_WILDCARD	TokenNameIdentifier	 PARTICLE  WILDCARD
;	TokenNameSEMICOLON	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fValue	TokenNameIdentifier	 f Value
=	TokenNameEQUAL	
wildcard	TokenNameIdentifier	 wildcard
;	TokenNameSEMICOLON	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fAnnotations	TokenNameIdentifier	 f Annotations
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fAttrChecker	TokenNameIdentifier	 f Attr Checker
.	TokenNameDOT	
returnAttrArray	TokenNameIdentifier	 return Attr Array
(	TokenNameLPAREN	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
particle	TokenNameIdentifier	 particle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse &lt;anyAttribute&gt; * * @param elmNode * @param schemaDoc * @param grammar * @return the wildcard node index */	TokenNameCOMMENT_JAVADOC	 Traverse &lt;anyAttribute&gt; * @param elmNode @param schemaDoc @param grammar @return the wildcard node index 
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
traverseAnyAttribute	TokenNameIdentifier	 traverse Any Attribute
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elmNode	TokenNameIdentifier	 elm Node
,	TokenNameCOMMA	
XSDocumentInfo	TokenNameIdentifier	 XS Document Info
schemaDoc	TokenNameIdentifier	 schema Doc
,	TokenNameCOMMA	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// General Attribute Checking for elmNode 	TokenNameCOMMENT_LINE	General Attribute Checking for elmNode 
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attrValues	TokenNameIdentifier	 attr Values
=	TokenNameEQUAL	
fAttrChecker	TokenNameIdentifier	 f Attr Checker
.	TokenNameDOT	
checkAttributes	TokenNameIdentifier	 check Attributes
(	TokenNameLPAREN	
elmNode	TokenNameIdentifier	 elm Node
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
wildcard	TokenNameIdentifier	 wildcard
=	TokenNameEQUAL	
traverseWildcardDecl	TokenNameIdentifier	 traverse Wildcard Decl
(	TokenNameLPAREN	
elmNode	TokenNameIdentifier	 elm Node
,	TokenNameCOMMA	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
,	TokenNameCOMMA	
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fAttrChecker	TokenNameIdentifier	 f Attr Checker
.	TokenNameDOT	
returnAttrArray	TokenNameIdentifier	 return Attr Array
(	TokenNameLPAREN	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
wildcard	TokenNameIdentifier	 wildcard
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @param elmNode * @param attrValues * @param schemaDoc * @param grammar * @return the wildcard node index */	TokenNameCOMMENT_JAVADOC	 * @param elmNode @param attrValues @param schemaDoc @param grammar @return the wildcard node index 
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
traverseWildcardDecl	TokenNameIdentifier	 traverse Wildcard Decl
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elmNode	TokenNameIdentifier	 elm Node
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
XSDocumentInfo	TokenNameIdentifier	 XS Document Info
schemaDoc	TokenNameIdentifier	 schema Doc
,	TokenNameCOMMA	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//get all attributes 	TokenNameCOMMENT_LINE	get all attributes 
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
wildcard	TokenNameIdentifier	 wildcard
=	TokenNameEQUAL	
new	TokenNamenew	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// namespace type 	TokenNameCOMMENT_LINE	namespace type 
XInt	TokenNameIdentifier	 X Int
namespaceTypeAttr	TokenNameIdentifier	 namespace Type Attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XInt	TokenNameIdentifier	 X Int
)	TokenNameRPAREN	
attrValues	TokenNameIdentifier	 attr Values
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_NAMESPACE	TokenNameIdentifier	 ATTIDX  NAMESPACE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
namespaceTypeAttr	TokenNameIdentifier	 namespace Type Attr
.	TokenNameDOT	
shortValue	TokenNameIdentifier	 short Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// namespace list 	TokenNameCOMMENT_LINE	namespace list 
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
attrValues	TokenNameIdentifier	 attr Values
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_NAMESPACE_LIST	TokenNameIdentifier	 ATTIDX  NAMESPACE  LIST
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// process contents 	TokenNameCOMMENT_LINE	process contents 
XInt	TokenNameIdentifier	 X Int
processContentsAttr	TokenNameIdentifier	 process Contents Attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XInt	TokenNameIdentifier	 X Int
)	TokenNameRPAREN	
attrValues	TokenNameIdentifier	 attr Values
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_PROCESSCONTENTS	TokenNameIdentifier	 ATTIDX  PROCESSCONTENTS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fProcessContents	TokenNameIdentifier	 f Process Contents
=	TokenNameEQUAL	
processContentsAttr	TokenNameIdentifier	 process Contents Attr
.	TokenNameDOT	
shortValue	TokenNameIdentifier	 short Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//check content 	TokenNameCOMMENT_LINE	check content 
Element	TokenNameIdentifier	 Element
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getFirstChildElement	TokenNameIdentifier	 get First Child Element
(	TokenNameLPAREN	
elmNode	TokenNameIdentifier	 elm Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSAnnotationImpl	TokenNameIdentifier	 XS Annotation Impl
annotation	TokenNameIdentifier	 annotation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ELT_ANNOTATION	TokenNameIdentifier	 ELT  ANNOTATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
annotation	TokenNameIdentifier	 annotation
=	TokenNameEQUAL	
traverseAnnotationDecl	TokenNameIdentifier	 traverse Annotation Decl
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getNextSiblingElement	TokenNameIdentifier	 get Next Sibling Element
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getSyntheticAnnotation	TokenNameIdentifier	 get Synthetic Annotation
(	TokenNameLPAREN	
elmNode	TokenNameIdentifier	 elm Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
annotation	TokenNameIdentifier	 annotation
=	TokenNameEQUAL	
traverseSyntheticAnnotation	TokenNameIdentifier	 traverse Synthetic Annotation
(	TokenNameLPAREN	
elmNode	TokenNameIdentifier	 elm Node
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
"s4s-elt-must-match.1"	TokenNameStringLiteral	s4s-elt-must-match.1
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"wildcard"	TokenNameStringLiteral	wildcard
,	TokenNameCOMMA	
"(annotation?)"	TokenNameStringLiteral	(annotation?)
,	TokenNameCOMMA	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
elmNode	TokenNameIdentifier	 elm Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getSyntheticAnnotation	TokenNameIdentifier	 get Synthetic Annotation
(	TokenNameLPAREN	
elmNode	TokenNameIdentifier	 elm Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
annotation	TokenNameIdentifier	 annotation
=	TokenNameEQUAL	
traverseSyntheticAnnotation	TokenNameIdentifier	 traverse Synthetic Annotation
(	TokenNameLPAREN	
elmNode	TokenNameIdentifier	 elm Node
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
XSObjectList	TokenNameIdentifier	 XS Object List
annotations	TokenNameIdentifier	 annotations
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
annotation	TokenNameIdentifier	 annotation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
annotations	TokenNameIdentifier	 annotations
=	TokenNameEQUAL	
new	TokenNamenew	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
)	TokenNameRPAREN	
annotations	TokenNameIdentifier	 annotations
)	TokenNameRPAREN	
.	TokenNameDOT	
addXSObject	TokenNameIdentifier	 add XS Object
(	TokenNameLPAREN	
annotation	TokenNameIdentifier	 annotation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
annotations	TokenNameIdentifier	 annotations
=	TokenNameEQUAL	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
annotations	TokenNameIdentifier	 annotations
;	TokenNameSEMICOLON	
return	TokenNamereturn	
wildcard	TokenNameIdentifier	 wildcard
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// traverseWildcardDecl 	TokenNameCOMMENT_LINE	traverseWildcardDecl 
}	TokenNameRBRACE	
// XSDWildcardTraverser 	TokenNameCOMMENT_LINE	XSDWildcardTraverser 
