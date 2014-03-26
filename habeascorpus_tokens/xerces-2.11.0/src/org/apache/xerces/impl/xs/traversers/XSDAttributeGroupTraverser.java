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
XSAttributeGroupDecl	TokenNameIdentifier	 XS Attribute Group Decl
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLSymbols	TokenNameIdentifier	 XML Symbols
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
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
/** * The attribute group definition schema component traverser. * * &lt;attributeGroup * id = ID * name = NCName * ref = QName * {any attributes with non-schema namespace . . .}&gt; * Content: (annotation?, ((attribute | attributeGroup)*, anyAttribute?)) * &lt;/attributeGroup&gt; * * @xerces.internal * * @author Rahul Srivastava, Sun Microsystems Inc. * @author Sandy Gao, IBM * * @version $Id: XSDAttributeGroupTraverser.java 819653 2009-09-28 17:29:56Z knoaman $ */	TokenNameCOMMENT_JAVADOC	 The attribute group definition schema component traverser. * &lt;attributeGroup id = ID name = NCName ref = QName {any attributes with non-schema namespace . . .}&gt; Content: (annotation?, ((attribute | attributeGroup)*, anyAttribute?)) &lt;/attributeGroup&gt; * @xerces.internal * @author Rahul Srivastava, Sun Microsystems Inc. @author Sandy Gao, IBM * @version $Id: XSDAttributeGroupTraverser.java 819653 2009-09-28 17:29:56Z knoaman $ 
class	TokenNameclass	
XSDAttributeGroupTraverser	TokenNameIdentifier	 XSD Attribute Group Traverser
extends	TokenNameextends	
XSDAbstractTraverser	TokenNameIdentifier	 XSD Abstract Traverser
{	TokenNameLBRACE	
XSDAttributeGroupTraverser	TokenNameIdentifier	 XSD Attribute Group Traverser
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
XSAttributeGroupDecl	TokenNameIdentifier	 XS Attribute Group Decl
traverseLocal	TokenNameIdentifier	 traverse Local
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
// General Attribute Checking for elmNode declared locally 	TokenNameCOMMENT_LINE	General Attribute Checking for elmNode declared locally 
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
// get attribute 	TokenNameCOMMENT_LINE	get attribute 
QName	TokenNameIdentifier	 Q Name
refAttr	TokenNameIdentifier	 ref Attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
)	TokenNameRPAREN	
attrValues	TokenNameIdentifier	 attr Values
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_REF	TokenNameIdentifier	 ATTIDX  REF
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
XSAttributeGroupDecl	TokenNameIdentifier	 XS Attribute Group Decl
attrGrp	TokenNameIdentifier	 attr Grp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// ref should be here. 	TokenNameCOMMENT_LINE	ref should be here. 
if	TokenNameif	
(	TokenNameLPAREN	
refAttr	TokenNameIdentifier	 ref Attr
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
"attributeGroup (local)"	TokenNameStringLiteral	attributeGroup (local)
,	TokenNameCOMMA	
"ref"	TokenNameStringLiteral	ref
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
// get global decl 	TokenNameCOMMENT_LINE	get global decl 
attrGrp	TokenNameIdentifier	 attr Grp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSAttributeGroupDecl	TokenNameIdentifier	 XS Attribute Group Decl
)	TokenNameRPAREN	
fSchemaHandler	TokenNameIdentifier	 f Schema Handler
.	TokenNameDOT	
getGlobalDecl	TokenNameIdentifier	 get Global Decl
(	TokenNameLPAREN	
schemaDoc	TokenNameIdentifier	 schema Doc
,	TokenNameCOMMA	
XSDHandler	TokenNameIdentifier	 XSD Handler
.	TokenNameDOT	
ATTRIBUTEGROUP_TYPE	TokenNameIdentifier	 ATTRIBUTEGROUP  TYPE
,	TokenNameCOMMA	
refAttr	TokenNameIdentifier	 ref Attr
,	TokenNameCOMMA	
elmNode	TokenNameIdentifier	 elm Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no children are allowed here except annotation, which is optional. 	TokenNameCOMMENT_LINE	no children are allowed here except annotation, which is optional. 
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
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
childName	TokenNameIdentifier	 child Name
=	TokenNameEQUAL	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
childName	TokenNameIdentifier	 child Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ELT_ANNOTATION	TokenNameIdentifier	 ELT  ANNOTATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
traverseSyntheticAnnotation	TokenNameIdentifier	 traverse Synthetic Annotation
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
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
refAttr	TokenNameIdentifier	 ref Attr
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
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
;	TokenNameSEMICOLON	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
"s4s-elt-must-match.1"	TokenNameStringLiteral	s4s-elt-must-match.1
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if 	TokenNameCOMMENT_LINE	if 
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
attrGrp	TokenNameIdentifier	 attr Grp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// traverseLocal 	TokenNameCOMMENT_LINE	traverseLocal 
XSAttributeGroupDecl	TokenNameIdentifier	 XS Attribute Group Decl
traverseGlobal	TokenNameIdentifier	 traverse Global
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
XSAttributeGroupDecl	TokenNameIdentifier	 XS Attribute Group Decl
attrGrp	TokenNameIdentifier	 attr Grp
=	TokenNameEQUAL	
new	TokenNamenew	
XSAttributeGroupDecl	TokenNameIdentifier	 XS Attribute Group Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// General Attribute Checking for elmNode declared globally 	TokenNameCOMMENT_LINE	General Attribute Checking for elmNode declared globally 
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
// global declaration must have a name 	TokenNameCOMMENT_LINE	global declaration must have a name 
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
"attributeGroup (global)"	TokenNameStringLiteral	attributeGroup (global)
,	TokenNameCOMMA	
"name"	TokenNameStringLiteral	name
}	TokenNameRBRACE	
,	TokenNameCOMMA	
elmNode	TokenNameIdentifier	 elm Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nameAttr	TokenNameIdentifier	 name Attr
=	TokenNameEQUAL	
NO_NAME	TokenNameIdentifier	 NO  NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attrGrp	TokenNameIdentifier	 attr Grp
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
=	TokenNameEQUAL	
nameAttr	TokenNameIdentifier	 name Attr
;	TokenNameSEMICOLON	
attrGrp	TokenNameIdentifier	 attr Grp
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
=	TokenNameEQUAL	
schemaDoc	TokenNameIdentifier	 schema Doc
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
;	TokenNameSEMICOLON	
// check the content 	TokenNameCOMMENT_LINE	check the content 
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
&&	TokenNameAND_AND	
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
// Traverse the attribute and attribute group elements and fill in the 	TokenNameCOMMENT_LINE	Traverse the attribute and attribute group elements and fill in the 
// attributeGroup structure 	TokenNameCOMMENT_LINE	attributeGroup structure 
Element	TokenNameIdentifier	 Element
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
traverseAttrsAndAttrGrps	TokenNameIdentifier	 traverse Attrs And Attr Grps
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
attrGrp	TokenNameIdentifier	 attr Grp
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
,	TokenNameCOMMA	
grammar	TokenNameIdentifier	 grammar
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextNode	TokenNameIdentifier	 next Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// An invalid element was found... 	TokenNameCOMMENT_LINE	An invalid element was found... 
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
nameAttr	TokenNameIdentifier	 name Attr
,	TokenNameCOMMA	
"(annotation?, ((attribute | attributeGroup)*, anyAttribute?))"	TokenNameStringLiteral	(annotation?, ((attribute | attributeGroup)*, anyAttribute?))
,	TokenNameCOMMA	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
"s4s-elt-must-match.1"	TokenNameStringLiteral	s4s-elt-must-match.1
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nameAttr	TokenNameIdentifier	 name Attr
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
NO_NAME	TokenNameIdentifier	 NO  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if a global group doesn't have a name, then don't add it. 	TokenNameCOMMENT_LINE	if a global group doesn't have a name, then don't add it. 
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
// Remove prohibited attributes from the set 	TokenNameCOMMENT_LINE	Remove prohibited attributes from the set 
attrGrp	TokenNameIdentifier	 attr Grp
.	TokenNameDOT	
removeProhibitedAttrs	TokenNameIdentifier	 remove Prohibited Attrs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check for restricted redefine: 	TokenNameCOMMENT_LINE	check for restricted redefine: 
XSAttributeGroupDecl	TokenNameIdentifier	 XS Attribute Group Decl
redefinedAttrGrp	TokenNameIdentifier	 redefined Attr Grp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSAttributeGroupDecl	TokenNameIdentifier	 XS Attribute Group Decl
)	TokenNameRPAREN	
fSchemaHandler	TokenNameIdentifier	 f Schema Handler
.	TokenNameDOT	
getGrpOrAttrGrpRedefinedByRestriction	TokenNameIdentifier	 get Grp Or Attr Grp Redefined By Restriction
(	TokenNameLPAREN	
XSDHandler	TokenNameIdentifier	 XSD Handler
.	TokenNameDOT	
ATTRIBUTEGROUP_TYPE	TokenNameIdentifier	 ATTRIBUTEGROUP  TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
,	TokenNameCOMMA	
nameAttr	TokenNameIdentifier	 name Attr
,	TokenNameCOMMA	
nameAttr	TokenNameIdentifier	 name Attr
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
)	TokenNameRPAREN	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
,	TokenNameCOMMA	
elmNode	TokenNameIdentifier	 elm Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
redefinedAttrGrp	TokenNameIdentifier	 redefined Attr Grp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
errArgs	TokenNameIdentifier	 err Args
=	TokenNameEQUAL	
attrGrp	TokenNameIdentifier	 attr Grp
.	TokenNameDOT	
validRestrictionOf	TokenNameIdentifier	 valid Restriction Of
(	TokenNameLPAREN	
nameAttr	TokenNameIdentifier	 name Attr
,	TokenNameCOMMA	
redefinedAttrGrp	TokenNameIdentifier	 redefined Attr Grp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
errArgs	TokenNameIdentifier	 err Args
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
errArgs	TokenNameIdentifier	 err Args
[	TokenNameLBRACKET	
errArgs	TokenNameIdentifier	 err Args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
errArgs	TokenNameIdentifier	 err Args
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
"src-redefine.7.2.2"	TokenNameStringLiteral	src-redefine.7.2.2
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
nameAttr	TokenNameIdentifier	 name Attr
,	TokenNameCOMMA	
errArgs	TokenNameIdentifier	 err Args
[	TokenNameLBRACKET	
errArgs	TokenNameIdentifier	 err Args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
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
attrGrp	TokenNameIdentifier	 attr Grp
.	TokenNameDOT	
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
annotations	TokenNameIdentifier	 annotations
;	TokenNameSEMICOLON	
// make an entry in global declarations. 	TokenNameCOMMENT_LINE	make an entry in global declarations. 
if	TokenNameif	
(	TokenNameLPAREN	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
getGlobalAttributeGroupDecl	TokenNameIdentifier	 get Global Attribute Group Decl
(	TokenNameLPAREN	
attrGrp	TokenNameIdentifier	 attr Grp
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
addGlobalAttributeGroupDecl	TokenNameIdentifier	 add Global Attribute Group Decl
(	TokenNameLPAREN	
attrGrp	TokenNameIdentifier	 attr Grp
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
XSAttributeGroupDecl	TokenNameIdentifier	 XS Attribute Group Decl
attrGrp2	TokenNameIdentifier	 attr Grp2
=	TokenNameEQUAL	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
getGlobalAttributeGroupDecl	TokenNameIdentifier	 get Global Attribute Group Decl
(	TokenNameLPAREN	
attrGrp	TokenNameIdentifier	 attr Grp
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
,	TokenNameCOMMA	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attrGrp2	TokenNameIdentifier	 attr Grp2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
addGlobalAttributeGroupDecl	TokenNameIdentifier	 add Global Attribute Group Decl
(	TokenNameLPAREN	
attrGrp	TokenNameIdentifier	 attr Grp
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
attrGrp2	TokenNameIdentifier	 attr Grp2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attrGrp	TokenNameIdentifier	 attr Grp
=	TokenNameEQUAL	
attrGrp2	TokenNameIdentifier	 attr Grp2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fSchemaHandler	TokenNameIdentifier	 f Schema Handler
.	TokenNameDOT	
addGlobalAttributeGroupDecl	TokenNameIdentifier	 add Global Attribute Group Decl
(	TokenNameLPAREN	
attrGrp	TokenNameIdentifier	 attr Grp
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
attrGrp	TokenNameIdentifier	 attr Grp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// traverseGlobal 	TokenNameCOMMENT_LINE	traverseGlobal 
}	TokenNameRBRACE	
// XSDAttributeGroupTraverser 	TokenNameCOMMENT_LINE	XSDAttributeGroupTraverser 
