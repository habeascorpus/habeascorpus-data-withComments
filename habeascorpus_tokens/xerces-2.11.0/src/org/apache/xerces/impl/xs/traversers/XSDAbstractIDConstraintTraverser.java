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
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathException	TokenNameIdentifier	 X Path Exception
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
identity	TokenNameIdentifier	 identity
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
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
identity	TokenNameIdentifier	 identity
.	TokenNameDOT	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
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
identity	TokenNameIdentifier	 identity
.	TokenNameDOT	
Selector	TokenNameIdentifier	 Selector
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLChar	TokenNameIdentifier	 XML Char
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
/** * This class contains code that all three IdentityConstraint * traversers (the XSDUniqueTraverser, XSDKeyTraverser and * XSDKeyrefTraverser) rely upon. * * @xerces.internal * * @version $Id: XSDAbstractIDConstraintTraverser.java 774786 2009-05-14 14:31:10Z sandygao $ */	TokenNameCOMMENT_JAVADOC	 This class contains code that all three IdentityConstraint traversers (the XSDUniqueTraverser, XSDKeyTraverser and XSDKeyrefTraverser) rely upon. * @xerces.internal * @version $Id: XSDAbstractIDConstraintTraverser.java 774786 2009-05-14 14:31:10Z sandygao $ 
class	TokenNameclass	
XSDAbstractIDConstraintTraverser	TokenNameIdentifier	 XSD Abstract ID Constraint Traverser
extends	TokenNameextends	
XSDAbstractTraverser	TokenNameIdentifier	 XSD Abstract Traverser
{	TokenNameLBRACE	
public	TokenNamepublic	
XSDAbstractIDConstraintTraverser	TokenNameIdentifier	 XSD Abstract ID Constraint Traverser
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
boolean	TokenNameboolean	
traverseIdentityConstraint	TokenNameIdentifier	 traverse Identity Constraint
(	TokenNameLPAREN	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
ic	TokenNameIdentifier	 ic
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
icElem	TokenNameIdentifier	 ic Elem
,	TokenNameCOMMA	
XSDocumentInfo	TokenNameIdentifier	 XS Document Info
schemaDoc	TokenNameIdentifier	 schema Doc
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
icElemAttrs	TokenNameIdentifier	 ic Elem Attrs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// General Attribute Checking will have been done on icElem by caller 	TokenNameCOMMENT_LINE	General Attribute Checking will have been done on icElem by caller 
// check for <annotation> and get selector 	TokenNameCOMMENT_LINE	check for <annotation> and get selector 
Element	TokenNameIdentifier	 Element
sElem	TokenNameIdentifier	 s Elem
=	TokenNameEQUAL	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getFirstChildElement	TokenNameIdentifier	 get First Child Element
(	TokenNameLPAREN	
icElem	TokenNameIdentifier	 ic Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sElem	TokenNameIdentifier	 s Elem
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
"s4s-elt-must-match.2"	TokenNameStringLiteral	s4s-elt-must-match.2
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"identity constraint"	TokenNameStringLiteral	identity constraint
,	TokenNameCOMMA	
"(annotation?, selector, field+)"	TokenNameStringLiteral	(annotation?, selector, field+)
}	TokenNameRBRACE	
,	TokenNameCOMMA	
icElem	TokenNameIdentifier	 ic Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// General Attribute Checking on sElem 	TokenNameCOMMENT_LINE	General Attribute Checking on sElem 
// first child could be an annotation 	TokenNameCOMMENT_LINE	first child could be an annotation 
if	TokenNameif	
(	TokenNameLPAREN	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
sElem	TokenNameIdentifier	 s Elem
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
ic	TokenNameIdentifier	 ic
.	TokenNameDOT	
addAnnotation	TokenNameIdentifier	 add Annotation
(	TokenNameLPAREN	
traverseAnnotationDecl	TokenNameIdentifier	 traverse Annotation Decl
(	TokenNameLPAREN	
sElem	TokenNameIdentifier	 s Elem
,	TokenNameCOMMA	
icElemAttrs	TokenNameIdentifier	 ic Elem Attrs
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sElem	TokenNameIdentifier	 s Elem
=	TokenNameEQUAL	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getNextSiblingElement	TokenNameIdentifier	 get Next Sibling Element
(	TokenNameLPAREN	
sElem	TokenNameIdentifier	 s Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if no more children report an error 	TokenNameCOMMENT_LINE	if no more children report an error 
if	TokenNameif	
(	TokenNameLPAREN	
sElem	TokenNameIdentifier	 s Elem
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
"s4s-elt-must-match.2"	TokenNameStringLiteral	s4s-elt-must-match.2
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"identity constraint"	TokenNameStringLiteral	identity constraint
,	TokenNameCOMMA	
"(annotation?, selector, field+)"	TokenNameStringLiteral	(annotation?, selector, field+)
}	TokenNameRBRACE	
,	TokenNameCOMMA	
icElem	TokenNameIdentifier	 ic Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
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
icElem	TokenNameIdentifier	 ic Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ic	TokenNameIdentifier	 ic
.	TokenNameDOT	
addAnnotation	TokenNameIdentifier	 add Annotation
(	TokenNameLPAREN	
traverseSyntheticAnnotation	TokenNameIdentifier	 traverse Synthetic Annotation
(	TokenNameLPAREN	
icElem	TokenNameIdentifier	 ic Elem
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
icElemAttrs	TokenNameIdentifier	 ic Elem Attrs
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// must be <selector> 	TokenNameCOMMENT_LINE	must be <selector> 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
sElem	TokenNameIdentifier	 s Elem
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ELT_SELECTOR	TokenNameIdentifier	 ELT  SELECTOR
)	TokenNameRPAREN	
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
"identity constraint"	TokenNameStringLiteral	identity constraint
,	TokenNameCOMMA	
"(annotation?, selector, field+)"	TokenNameStringLiteral	(annotation?, selector, field+)
,	TokenNameCOMMA	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ELT_SELECTOR	TokenNameIdentifier	 ELT  SELECTOR
}	TokenNameRBRACE	
,	TokenNameCOMMA	
sElem	TokenNameIdentifier	 s Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attrValues	TokenNameIdentifier	 attr Values
=	TokenNameEQUAL	
fAttrChecker	TokenNameIdentifier	 f Attr Checker
.	TokenNameDOT	
checkAttributes	TokenNameIdentifier	 check Attributes
(	TokenNameLPAREN	
sElem	TokenNameIdentifier	 s Elem
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make sure <selector>'s content is fine: 	TokenNameCOMMENT_LINE	make sure <selector>'s content is fine: 
Element	TokenNameIdentifier	 Element
selChild	TokenNameIdentifier	 sel Child
=	TokenNameEQUAL	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getFirstChildElement	TokenNameIdentifier	 get First Child Element
(	TokenNameLPAREN	
sElem	TokenNameIdentifier	 s Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
selChild	TokenNameIdentifier	 sel Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// traverse annotation if any 	TokenNameCOMMENT_LINE	traverse annotation if any 
if	TokenNameif	
(	TokenNameLPAREN	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
selChild	TokenNameIdentifier	 sel Child
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
ic	TokenNameIdentifier	 ic
.	TokenNameDOT	
addAnnotation	TokenNameIdentifier	 add Annotation
(	TokenNameLPAREN	
traverseAnnotationDecl	TokenNameIdentifier	 traverse Annotation Decl
(	TokenNameLPAREN	
selChild	TokenNameIdentifier	 sel Child
,	TokenNameCOMMA	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selChild	TokenNameIdentifier	 sel Child
=	TokenNameEQUAL	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getNextSiblingElement	TokenNameIdentifier	 get Next Sibling Element
(	TokenNameLPAREN	
selChild	TokenNameIdentifier	 sel Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ELT_SELECTOR	TokenNameIdentifier	 ELT  SELECTOR
,	TokenNameCOMMA	
"(annotation?)"	TokenNameStringLiteral	(annotation?)
,	TokenNameCOMMA	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
selChild	TokenNameIdentifier	 sel Child
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
selChild	TokenNameIdentifier	 sel Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
selChild	TokenNameIdentifier	 sel Child
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
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ELT_SELECTOR	TokenNameIdentifier	 ELT  SELECTOR
,	TokenNameCOMMA	
"(annotation?)"	TokenNameStringLiteral	(annotation?)
,	TokenNameCOMMA	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
selChild	TokenNameIdentifier	 sel Child
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
selChild	TokenNameIdentifier	 sel Child
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
sElem	TokenNameIdentifier	 s Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ic	TokenNameIdentifier	 ic
.	TokenNameDOT	
addAnnotation	TokenNameIdentifier	 add Annotation
(	TokenNameLPAREN	
traverseSyntheticAnnotation	TokenNameIdentifier	 traverse Synthetic Annotation
(	TokenNameLPAREN	
icElem	TokenNameIdentifier	 ic Elem
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
sText	TokenNameIdentifier	 s Text
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
attrValues	TokenNameIdentifier	 attr Values
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_XPATH	TokenNameIdentifier	 ATTIDX  XPATH
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sText	TokenNameIdentifier	 s Text
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
ELT_SELECTOR	TokenNameIdentifier	 ELT  SELECTOR
,	TokenNameCOMMA	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ATT_XPATH	TokenNameIdentifier	 ATT  XPATH
}	TokenNameRBRACE	
,	TokenNameCOMMA	
sElem	TokenNameIdentifier	 s Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sText	TokenNameIdentifier	 s Text
=	TokenNameEQUAL	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
sText	TokenNameIdentifier	 s Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Selector	TokenNameIdentifier	 Selector
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
sXpath	TokenNameIdentifier	 s Xpath
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
sXpath	TokenNameIdentifier	 s Xpath
=	TokenNameEQUAL	
new	TokenNamenew	
Selector	TokenNameIdentifier	 Selector
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
sText	TokenNameIdentifier	 s Text
,	TokenNameCOMMA	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
.	TokenNameDOT	
fNamespaceSupport	TokenNameIdentifier	 f Namespace Support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Selector	TokenNameIdentifier	 Selector
selector	TokenNameIdentifier	 selector
=	TokenNameEQUAL	
new	TokenNamenew	
Selector	TokenNameIdentifier	 Selector
(	TokenNameLPAREN	
sXpath	TokenNameIdentifier	 s Xpath
,	TokenNameCOMMA	
ic	TokenNameIdentifier	 ic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ic	TokenNameIdentifier	 ic
.	TokenNameDOT	
setSelector	TokenNameIdentifier	 set Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XPathException	TokenNameIdentifier	 X Path Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
sText	TokenNameIdentifier	 s Text
}	TokenNameRBRACE	
,	TokenNameCOMMA	
sElem	TokenNameIdentifier	 s Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// put back attr values... 	TokenNameCOMMENT_LINE	put back attr values... 
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
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// put back attr values... 	TokenNameCOMMENT_LINE	put back attr values... 
fAttrChecker	TokenNameIdentifier	 f Attr Checker
.	TokenNameDOT	
returnAttrArray	TokenNameIdentifier	 return Attr Array
(	TokenNameLPAREN	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get fields 	TokenNameCOMMENT_LINE	get fields 
Element	TokenNameIdentifier	 Element
fElem	TokenNameIdentifier	 f Elem
=	TokenNameEQUAL	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getNextSiblingElement	TokenNameIdentifier	 get Next Sibling Element
(	TokenNameLPAREN	
sElem	TokenNameIdentifier	 s Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fElem	TokenNameIdentifier	 f Elem
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
"s4s-elt-must-match.2"	TokenNameStringLiteral	s4s-elt-must-match.2
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"identity constraint"	TokenNameStringLiteral	identity constraint
,	TokenNameCOMMA	
"(annotation?, selector, field+)"	TokenNameStringLiteral	(annotation?, selector, field+)
}	TokenNameRBRACE	
,	TokenNameCOMMA	
sElem	TokenNameIdentifier	 s Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fElem	TokenNameIdentifier	 f Elem
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
fElem	TokenNameIdentifier	 f Elem
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ELT_FIELD	TokenNameIdentifier	 ELT  FIELD
)	TokenNameRPAREN	
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
"identity constraint"	TokenNameStringLiteral	identity constraint
,	TokenNameCOMMA	
"(annotation?, selector, field+)"	TokenNameStringLiteral	(annotation?, selector, field+)
,	TokenNameCOMMA	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ELT_FIELD	TokenNameIdentifier	 ELT  FIELD
}	TokenNameRBRACE	
,	TokenNameCOMMA	
fElem	TokenNameIdentifier	 f Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fElem	TokenNameIdentifier	 f Elem
=	TokenNameEQUAL	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getNextSiblingElement	TokenNameIdentifier	 get Next Sibling Element
(	TokenNameLPAREN	
fElem	TokenNameIdentifier	 f Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// General Attribute Checking 	TokenNameCOMMENT_LINE	General Attribute Checking 
attrValues	TokenNameIdentifier	 attr Values
=	TokenNameEQUAL	
fAttrChecker	TokenNameIdentifier	 f Attr Checker
.	TokenNameDOT	
checkAttributes	TokenNameIdentifier	 check Attributes
(	TokenNameLPAREN	
fElem	TokenNameIdentifier	 f Elem
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// and make sure <field>'s content is fine: 	TokenNameCOMMENT_LINE	and make sure <field>'s content is fine: 
Element	TokenNameIdentifier	 Element
fieldChild	TokenNameIdentifier	 field Child
=	TokenNameEQUAL	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getFirstChildElement	TokenNameIdentifier	 get First Child Element
(	TokenNameLPAREN	
fElem	TokenNameIdentifier	 f Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fieldChild	TokenNameIdentifier	 field Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// traverse annotation 	TokenNameCOMMENT_LINE	traverse annotation 
if	TokenNameif	
(	TokenNameLPAREN	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
fieldChild	TokenNameIdentifier	 field Child
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
ic	TokenNameIdentifier	 ic
.	TokenNameDOT	
addAnnotation	TokenNameIdentifier	 add Annotation
(	TokenNameLPAREN	
traverseAnnotationDecl	TokenNameIdentifier	 traverse Annotation Decl
(	TokenNameLPAREN	
fieldChild	TokenNameIdentifier	 field Child
,	TokenNameCOMMA	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldChild	TokenNameIdentifier	 field Child
=	TokenNameEQUAL	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getNextSiblingElement	TokenNameIdentifier	 get Next Sibling Element
(	TokenNameLPAREN	
fieldChild	TokenNameIdentifier	 field Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldChild	TokenNameIdentifier	 field Child
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
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ELT_FIELD	TokenNameIdentifier	 ELT  FIELD
,	TokenNameCOMMA	
"(annotation?)"	TokenNameStringLiteral	(annotation?)
,	TokenNameCOMMA	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
fieldChild	TokenNameIdentifier	 field Child
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
fieldChild	TokenNameIdentifier	 field Child
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
fElem	TokenNameIdentifier	 f Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ic	TokenNameIdentifier	 ic
.	TokenNameDOT	
addAnnotation	TokenNameIdentifier	 add Annotation
(	TokenNameLPAREN	
traverseSyntheticAnnotation	TokenNameIdentifier	 traverse Synthetic Annotation
(	TokenNameLPAREN	
icElem	TokenNameIdentifier	 ic Elem
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
fText	TokenNameIdentifier	 f Text
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
attrValues	TokenNameIdentifier	 attr Values
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_XPATH	TokenNameIdentifier	 ATTIDX  XPATH
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fText	TokenNameIdentifier	 f Text
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
ELT_FIELD	TokenNameIdentifier	 ELT  FIELD
,	TokenNameCOMMA	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ATT_XPATH	TokenNameIdentifier	 ATT  XPATH
}	TokenNameRBRACE	
,	TokenNameCOMMA	
fElem	TokenNameIdentifier	 f Elem
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
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fText	TokenNameIdentifier	 f Text
=	TokenNameEQUAL	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
fText	TokenNameIdentifier	 f Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
fXpath	TokenNameIdentifier	 f Xpath
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
fText	TokenNameIdentifier	 f Text
,	TokenNameCOMMA	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
.	TokenNameDOT	
fNamespaceSupport	TokenNameIdentifier	 f Namespace Support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
fXpath	TokenNameIdentifier	 f Xpath
,	TokenNameCOMMA	
ic	TokenNameIdentifier	 ic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ic	TokenNameIdentifier	 ic
.	TokenNameDOT	
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XPathException	TokenNameIdentifier	 X Path Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fText	TokenNameIdentifier	 f Text
}	TokenNameRBRACE	
,	TokenNameCOMMA	
fElem	TokenNameIdentifier	 f Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// put back attr values... 	TokenNameCOMMENT_LINE	put back attr values... 
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
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fElem	TokenNameIdentifier	 f Elem
=	TokenNameEQUAL	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getNextSiblingElement	TokenNameIdentifier	 get Next Sibling Element
(	TokenNameLPAREN	
fElem	TokenNameIdentifier	 f Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// put back attr values... 	TokenNameCOMMENT_LINE	put back attr values... 
fAttrChecker	TokenNameIdentifier	 f Attr Checker
.	TokenNameDOT	
returnAttrArray	TokenNameIdentifier	 return Attr Array
(	TokenNameLPAREN	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ic	TokenNameIdentifier	 ic
.	TokenNameDOT	
getFieldCount	TokenNameIdentifier	 get Field Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// traverseIdentityConstraint(IdentityConstraint,Element, XSDocumentInfo) 	TokenNameCOMMENT_LINE	traverseIdentityConstraint(IdentityConstraint,Element, XSDocumentInfo) 
}	TokenNameRBRACE	
// XSDAbstractIDConstraintTraverser 	TokenNameCOMMENT_LINE	XSDAbstractIDConstraintTraverser 
