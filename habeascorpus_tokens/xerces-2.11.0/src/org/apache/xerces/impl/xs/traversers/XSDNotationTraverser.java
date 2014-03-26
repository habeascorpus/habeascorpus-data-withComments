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
XSNotationDecl	TokenNameIdentifier	 XS Notation Decl
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
/** * The notation declaration schema component traverser. * * <notation * id = ID * name = NCName * public = anyURI * system = anyURI * {any attributes with non-schema namespace . . .}> * Content: (annotation?) * </notation> * * @xerces.internal * * @author Rahul Srivastava, Sun Microsystems Inc. * @author Elena Litani, IBM * @version $Id: XSDNotationTraverser.java 819653 2009-09-28 17:29:56Z knoaman $ */	TokenNameCOMMENT_JAVADOC	 The notation declaration schema component traverser. * <notation id = ID name = NCName public = anyURI system = anyURI {any attributes with non-schema namespace . . .}> Content: (annotation?) </notation> * @xerces.internal * @author Rahul Srivastava, Sun Microsystems Inc. @author Elena Litani, IBM @version $Id: XSDNotationTraverser.java 819653 2009-09-28 17:29:56Z knoaman $ 
class	TokenNameclass	
XSDNotationTraverser	TokenNameIdentifier	 XSD Notation Traverser
extends	TokenNameextends	
XSDAbstractTraverser	TokenNameIdentifier	 XSD Abstract Traverser
{	TokenNameLBRACE	
XSDNotationTraverser	TokenNameIdentifier	 XSD Notation Traverser
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
XSNotationDecl	TokenNameIdentifier	 XS Notation Decl
traverse	TokenNameIdentifier	 traverse
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
true	TokenNametrue	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//get attributes 	TokenNameCOMMENT_LINE	get attributes 
String	TokenNameIdentifier	 String
nameAttr	TokenNameIdentifier	 name Attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
attrValues	TokenNameIdentifier	 attr Values
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_NAME	TokenNameIdentifier	 ATTIDX  NAME
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
publicAttr	TokenNameIdentifier	 public Attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
attrValues	TokenNameIdentifier	 attr Values
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_PUBLIC	TokenNameIdentifier	 ATTIDX  PUBLIC
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
systemAttr	TokenNameIdentifier	 system Attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
attrValues	TokenNameIdentifier	 attr Values
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_SYSTEM	TokenNameIdentifier	 ATTIDX  SYSTEM
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nameAttr	TokenNameIdentifier	 name Attr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
"s4s-att-must-appear"	TokenNameStringLiteral	s4s-att-must-appear
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ELT_NOTATION	TokenNameIdentifier	 ELT  NOTATION
,	TokenNameCOMMA	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ATT_NAME	TokenNameIdentifier	 ATT  NAME
}	TokenNameRBRACE	
,	TokenNameCOMMA	
elmNode	TokenNameIdentifier	 elm Node
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
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
systemAttr	TokenNameIdentifier	 system Attr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
publicAttr	TokenNameIdentifier	 public Attr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
"PublicSystemOnNotation"	TokenNameStringLiteral	PublicSystemOnNotation
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
elmNode	TokenNameIdentifier	 elm Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
publicAttr	TokenNameIdentifier	 public Attr
=	TokenNameEQUAL	
"missing"	TokenNameStringLiteral	missing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XSNotationDecl	TokenNameIdentifier	 XS Notation Decl
notation	TokenNameIdentifier	 notation
=	TokenNameEQUAL	
new	TokenNamenew	
XSNotationDecl	TokenNameIdentifier	 XS Notation Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
notation	TokenNameIdentifier	 notation
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
=	TokenNameEQUAL	
nameAttr	TokenNameIdentifier	 name Attr
;	TokenNameSEMICOLON	
notation	TokenNameIdentifier	 notation
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
=	TokenNameEQUAL	
schemaDoc	TokenNameIdentifier	 schema Doc
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
;	TokenNameSEMICOLON	
notation	TokenNameIdentifier	 notation
.	TokenNameDOT	
fPublicId	TokenNameIdentifier	 f Public Id
=	TokenNameEQUAL	
publicAttr	TokenNameIdentifier	 public Attr
;	TokenNameSEMICOLON	
notation	TokenNameIdentifier	 notation
.	TokenNameDOT	
fSystemId	TokenNameIdentifier	 f System Id
=	TokenNameEQUAL	
systemAttr	TokenNameIdentifier	 system Attr
;	TokenNameSEMICOLON	
//check content 	TokenNameCOMMENT_LINE	check content 
Element	TokenNameIdentifier	 Element
content	TokenNameIdentifier	 content
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
content	TokenNameIdentifier	 content
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
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
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getNextSiblingElement	TokenNameIdentifier	 get Next Sibling Element
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
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
notation	TokenNameIdentifier	 notation
.	TokenNameDOT	
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
annotations	TokenNameIdentifier	 annotations
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ELT_NOTATION	TokenNameIdentifier	 ELT  NOTATION
,	TokenNameCOMMA	
"(annotation?)"	TokenNameStringLiteral	(annotation?)
,	TokenNameCOMMA	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
"s4s-elt-must-match.1"	TokenNameStringLiteral	s4s-elt-must-match.1
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
getGlobalNotationDecl	TokenNameIdentifier	 get Global Notation Decl
(	TokenNameLPAREN	
notation	TokenNameIdentifier	 notation
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
addGlobalNotationDecl	TokenNameIdentifier	 add Global Notation Decl
(	TokenNameLPAREN	
notation	TokenNameIdentifier	 notation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// also add it to extended map 	TokenNameCOMMENT_LINE	also add it to extended map 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
fSchemaHandler	TokenNameIdentifier	 f Schema Handler
.	TokenNameDOT	
schemaDocument2SystemId	TokenNameIdentifier	 schema Document2 System Id
(	TokenNameLPAREN	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
XSNotationDecl	TokenNameIdentifier	 XS Notation Decl
notation2	TokenNameIdentifier	 notation2
=	TokenNameEQUAL	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
getGlobalNotationDecl	TokenNameIdentifier	 get Global Notation Decl
(	TokenNameLPAREN	
notation	TokenNameIdentifier	 notation
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
,	TokenNameCOMMA	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
notation2	TokenNameIdentifier	 notation2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
addGlobalNotationDecl	TokenNameIdentifier	 add Global Notation Decl
(	TokenNameLPAREN	
notation	TokenNameIdentifier	 notation
,	TokenNameCOMMA	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// handle duplicates 	TokenNameCOMMENT_LINE	handle duplicates 
if	TokenNameif	
(	TokenNameLPAREN	
fSchemaHandler	TokenNameIdentifier	 f Schema Handler
.	TokenNameDOT	
fTolerateDuplicates	TokenNameIdentifier	 f Tolerate Duplicates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
notation2	TokenNameIdentifier	 notation2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
notation	TokenNameIdentifier	 notation
=	TokenNameEQUAL	
notation2	TokenNameIdentifier	 notation2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fSchemaHandler	TokenNameIdentifier	 f Schema Handler
.	TokenNameDOT	
addGlobalNotationDecl	TokenNameIdentifier	 add Global Notation Decl
(	TokenNameLPAREN	
notation	TokenNameIdentifier	 notation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
notation	TokenNameIdentifier	 notation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
