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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
validation	TokenNameIdentifier	 validation
.	TokenNameDOT	
ValidationState	TokenNameIdentifier	 Validation State
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
SchemaNamespaceSupport	TokenNameIdentifier	 Schema Namespace Support
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
XMLSchemaException	TokenNameIdentifier	 XML Schema Exception
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SymbolTable	TokenNameIdentifier	 Symbol Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
/** * Objects of this class hold all information pecular to a * particular XML Schema document. This is needed because * namespace bindings and other settings on the <schema/> element * affect the contents of that schema document alone. * * @xerces.internal * * @author Neil Graham, IBM * @version $Id: XSDocumentInfo.java 705370 2008-10-16 21:43:38Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Objects of this class hold all information pecular to a particular XML Schema document. This is needed because namespace bindings and other settings on the <schema/> element affect the contents of that schema document alone. * @xerces.internal * @author Neil Graham, IBM @version $Id: XSDocumentInfo.java 705370 2008-10-16 21:43:38Z mrglavas $ 
class	TokenNameclass	
XSDocumentInfo	TokenNameIdentifier	 XS Document Info
{	TokenNameLBRACE	
// Data 	TokenNameCOMMENT_LINE	Data 
protected	TokenNameprotected	
SchemaNamespaceSupport	TokenNameIdentifier	 Schema Namespace Support
fNamespaceSupport	TokenNameIdentifier	 f Namespace Support
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SchemaNamespaceSupport	TokenNameIdentifier	 Schema Namespace Support
fNamespaceSupportRoot	TokenNameIdentifier	 f Namespace Support Root
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Stack	TokenNameIdentifier	 Stack
SchemaNamespaceSupportStack	TokenNameIdentifier	 Schema Namespace Support Stack
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// schema's attributeFormDefault 	TokenNameCOMMENT_LINE	schema's attributeFormDefault 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fAreLocalAttributesQualified	TokenNameIdentifier	 f Are Local Attributes Qualified
;	TokenNameSEMICOLON	
// elementFormDefault 	TokenNameCOMMENT_LINE	elementFormDefault 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fAreLocalElementsQualified	TokenNameIdentifier	 f Are Local Elements Qualified
;	TokenNameSEMICOLON	
// [block | final]Default 	TokenNameCOMMENT_LINE	[block | final]Default 
protected	TokenNameprotected	
short	TokenNameshort	
fBlockDefault	TokenNameIdentifier	 f Block Default
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
short	TokenNameshort	
fFinalDefault	TokenNameIdentifier	 f Final Default
;	TokenNameSEMICOLON	
// targetNamespace 	TokenNameCOMMENT_LINE	targetNamespace 
String	TokenNameIdentifier	 String
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
;	TokenNameSEMICOLON	
// represents whether this is a chameleon schema (i.e., whether its TNS is natural or comes from without) 	TokenNameCOMMENT_LINE	represents whether this is a chameleon schema (i.e., whether its TNS is natural or comes from without) 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fIsChameleonSchema	TokenNameIdentifier	 f Is Chameleon Schema
;	TokenNameSEMICOLON	
// the root of the schema Document tree itself 	TokenNameCOMMENT_LINE	the root of the schema Document tree itself 
protected	TokenNameprotected	
Element	TokenNameIdentifier	 Element
fSchemaElement	TokenNameIdentifier	 f Schema Element
;	TokenNameSEMICOLON	
// all namespaces that this document can refer to 	TokenNameCOMMENT_LINE	all namespaces that this document can refer to 
Vector	TokenNameIdentifier	 Vector
fImportedNS	TokenNameIdentifier	 f Imported NS
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ValidationState	TokenNameIdentifier	 Validation State
fValidationContext	TokenNameIdentifier	 f Validation Context
=	TokenNameEQUAL	
new	TokenNamenew	
ValidationState	TokenNameIdentifier	 Validation State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SymbolTable	TokenNameIdentifier	 Symbol Table
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// attribute checker to which we'll return the attributes 	TokenNameCOMMENT_LINE	attribute checker to which we'll return the attributes 
// once we've been told that we're done with them 	TokenNameCOMMENT_LINE	once we've been told that we're done with them 
protected	TokenNameprotected	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
fAttrChecker	TokenNameIdentifier	 f Attr Checker
;	TokenNameSEMICOLON	
// array of objects on the schema's root element. This is null 	TokenNameCOMMENT_LINE	array of objects on the schema's root element. This is null 
// once returnSchemaAttrs has been called. 	TokenNameCOMMENT_LINE	once returnSchemaAttrs has been called. 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fSchemaAttrs	TokenNameIdentifier	 f Schema Attrs
;	TokenNameSEMICOLON	
// list of annotations contained in the schema document. This is null 	TokenNameCOMMENT_LINE	list of annotations contained in the schema document. This is null 
// once removeAnnotations has been called. 	TokenNameCOMMENT_LINE	once removeAnnotations has been called. 
protected	TokenNameprotected	
XSAnnotationInfo	TokenNameIdentifier	 XS Annotation Info
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// note that the caller must ensure to call returnSchemaAttrs() 	TokenNameCOMMENT_LINE	note that the caller must ensure to call returnSchemaAttrs() 
// to avoid memory leaks! 	TokenNameCOMMENT_LINE	to avoid memory leaks! 
XSDocumentInfo	TokenNameIdentifier	 XS Document Info
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
schemaRoot	TokenNameIdentifier	 schema Root
,	TokenNameCOMMA	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
attrChecker	TokenNameIdentifier	 attr Checker
,	TokenNameCOMMA	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLSchemaException	TokenNameIdentifier	 XML Schema Exception
{	TokenNameLBRACE	
fSchemaElement	TokenNameIdentifier	 f Schema Element
=	TokenNameEQUAL	
schemaRoot	TokenNameIdentifier	 schema Root
;	TokenNameSEMICOLON	
fNamespaceSupport	TokenNameIdentifier	 f Namespace Support
=	TokenNameEQUAL	
new	TokenNamenew	
SchemaNamespaceSupport	TokenNameIdentifier	 Schema Namespace Support
(	TokenNameLPAREN	
schemaRoot	TokenNameIdentifier	 schema Root
,	TokenNameCOMMA	
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNamespaceSupport	TokenNameIdentifier	 f Namespace Support
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIsChameleonSchema	TokenNameIdentifier	 f Is Chameleon Schema
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
;	TokenNameSEMICOLON	
fAttrChecker	TokenNameIdentifier	 f Attr Checker
=	TokenNameEQUAL	
attrChecker	TokenNameIdentifier	 attr Checker
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
schemaRoot	TokenNameIdentifier	 schema Root
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
schemaRoot	TokenNameIdentifier	 schema Root
;	TokenNameSEMICOLON	
fSchemaAttrs	TokenNameIdentifier	 f Schema Attrs
=	TokenNameEQUAL	
attrChecker	TokenNameIdentifier	 attr Checker
.	TokenNameDOT	
checkAttributes	TokenNameIdentifier	 check Attributes
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// schemaAttrs == null means it's not an <xsd:schema> element 	TokenNameCOMMENT_LINE	schemaAttrs == null means it's not an <xsd:schema> element 
// throw an exception, but we don't know the document systemId, 	TokenNameCOMMENT_LINE	throw an exception, but we don't know the document systemId, 
// so we leave that to the caller. 	TokenNameCOMMENT_LINE	so we leave that to the caller. 
if	TokenNameif	
(	TokenNameLPAREN	
fSchemaAttrs	TokenNameIdentifier	 f Schema Attrs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XMLSchemaException	TokenNameIdentifier	 XML Schema Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAreLocalAttributesQualified	TokenNameIdentifier	 f Are Local Attributes Qualified
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XInt	TokenNameIdentifier	 X Int
)	TokenNameRPAREN	
fSchemaAttrs	TokenNameIdentifier	 f Schema Attrs
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_AFORMDEFAULT	TokenNameIdentifier	 ATTIDX  AFORMDEFAULT
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
FORM_QUALIFIED	TokenNameIdentifier	 FORM  QUALIFIED
;	TokenNameSEMICOLON	
fAreLocalElementsQualified	TokenNameIdentifier	 f Are Local Elements Qualified
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XInt	TokenNameIdentifier	 X Int
)	TokenNameRPAREN	
fSchemaAttrs	TokenNameIdentifier	 f Schema Attrs
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_EFORMDEFAULT	TokenNameIdentifier	 ATTIDX  EFORMDEFAULT
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
FORM_QUALIFIED	TokenNameIdentifier	 FORM  QUALIFIED
;	TokenNameSEMICOLON	
fBlockDefault	TokenNameIdentifier	 f Block Default
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XInt	TokenNameIdentifier	 X Int
)	TokenNameRPAREN	
fSchemaAttrs	TokenNameIdentifier	 f Schema Attrs
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_BLOCKDEFAULT	TokenNameIdentifier	 ATTIDX  BLOCKDEFAULT
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
shortValue	TokenNameIdentifier	 short Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fFinalDefault	TokenNameIdentifier	 f Final Default
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XInt	TokenNameIdentifier	 X Int
)	TokenNameRPAREN	
fSchemaAttrs	TokenNameIdentifier	 f Schema Attrs
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_FINALDEFAULT	TokenNameIdentifier	 ATTIDX  FINALDEFAULT
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
shortValue	TokenNameIdentifier	 short Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fSchemaAttrs	TokenNameIdentifier	 f Schema Attrs
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_TARGETNAMESPACE	TokenNameIdentifier	 ATTIDX  TARGETNAMESPACE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNamespaceSupportRoot	TokenNameIdentifier	 f Namespace Support Root
=	TokenNameEQUAL	
new	TokenNamenew	
SchemaNamespaceSupport	TokenNameIdentifier	 Schema Namespace Support
(	TokenNameLPAREN	
fNamespaceSupport	TokenNameIdentifier	 f Namespace Support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//set namespace support 	TokenNameCOMMENT_LINE	set namespace support 
fValidationContext	TokenNameIdentifier	 f Validation Context
.	TokenNameDOT	
setNamespaceSupport	TokenNameIdentifier	 set Namespace Support
(	TokenNameLPAREN	
fNamespaceSupport	TokenNameIdentifier	 f Namespace Support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fValidationContext	TokenNameIdentifier	 f Validation Context
.	TokenNameDOT	
setSymbolTable	TokenNameIdentifier	 set Symbol Table
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// pass null as the schema document, so that the namespace 	TokenNameCOMMENT_LINE	pass null as the schema document, so that the namespace 
// context is not popped. 	TokenNameCOMMENT_LINE	context is not popped. 
// don't return the attribute array yet! 	TokenNameCOMMENT_LINE	don't return the attribute array yet! 
//attrChecker.returnAttrArray(schemaAttrs, null); 	TokenNameCOMMENT_LINE	attrChecker.returnAttrArray(schemaAttrs, null); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// backup the current ns support, and use the one passed-in. 	TokenNameCOMMENT_LINE	backup the current ns support, and use the one passed-in. 
// if no ns support is passed-in, use the one for <schema> element 	TokenNameCOMMENT_LINE	if no ns support is passed-in, use the one for <schema> element 
void	TokenNamevoid	
backupNSSupport	TokenNameIdentifier	 backup NS Support
(	TokenNameLPAREN	
SchemaNamespaceSupport	TokenNameIdentifier	 Schema Namespace Support
nsSupport	TokenNameIdentifier	 ns Support
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SchemaNamespaceSupportStack	TokenNameIdentifier	 Schema Namespace Support Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
fNamespaceSupport	TokenNameIdentifier	 f Namespace Support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nsSupport	TokenNameIdentifier	 ns Support
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nsSupport	TokenNameIdentifier	 ns Support
=	TokenNameEQUAL	
fNamespaceSupportRoot	TokenNameIdentifier	 f Namespace Support Root
;	TokenNameSEMICOLON	
fNamespaceSupport	TokenNameIdentifier	 f Namespace Support
=	TokenNameEQUAL	
new	TokenNamenew	
SchemaNamespaceSupport	TokenNameIdentifier	 Schema Namespace Support
(	TokenNameLPAREN	
nsSupport	TokenNameIdentifier	 ns Support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fValidationContext	TokenNameIdentifier	 f Validation Context
.	TokenNameDOT	
setNamespaceSupport	TokenNameIdentifier	 set Namespace Support
(	TokenNameLPAREN	
fNamespaceSupport	TokenNameIdentifier	 f Namespace Support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
restoreNSSupport	TokenNameIdentifier	 restore NS Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaceSupport	TokenNameIdentifier	 f Namespace Support
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SchemaNamespaceSupport	TokenNameIdentifier	 Schema Namespace Support
)	TokenNameRPAREN	
SchemaNamespaceSupportStack	TokenNameIdentifier	 Schema Namespace Support Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fValidationContext	TokenNameIdentifier	 f Validation Context
.	TokenNameDOT	
setNamespaceSupport	TokenNameIdentifier	 set Namespace Support
(	TokenNameLPAREN	
fNamespaceSupport	TokenNameIdentifier	 f Namespace Support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// some Object methods 	TokenNameCOMMENT_LINE	some Object methods 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"no targetNamspace"	TokenNameStringLiteral	no targetNamspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"targetNamespace is "	TokenNameStringLiteral	targetNamespace is 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fSchemaElement	TokenNameIdentifier	 f Schema Element
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fSchemaElement	TokenNameIdentifier	 f Schema Element
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
instanceof	TokenNameinstanceof	
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
opti	TokenNameIdentifier	 opti
.	TokenNameDOT	
SchemaDOM	TokenNameIdentifier	 Schema DOM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
documentURI	TokenNameIdentifier	 document URI
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDocumentURI	TokenNameIdentifier	 get Document URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
documentURI	TokenNameIdentifier	 document URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
documentURI	TokenNameIdentifier	 document URI
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" :: schemaLocation is "	TokenNameStringLiteral	 :: schemaLocation is 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
documentURI	TokenNameIdentifier	 document URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addAllowedNS	TokenNameIdentifier	 add Allowed NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fImportedNS	TokenNameIdentifier	 f Imported NS
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isAllowedNS	TokenNameIdentifier	 is Allowed NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fImportedNS	TokenNameIdentifier	 f Imported NS
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// store whether we have reported an error about that this document 	TokenNameCOMMENT_LINE	store whether we have reported an error about that this document 
// can't access components from the given namespace 	TokenNameCOMMENT_LINE	can't access components from the given namespace 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
fReportedTNS	TokenNameIdentifier	 f Reported TNS
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// check whether we need to report an error against the given uri. 	TokenNameCOMMENT_LINE	check whether we need to report an error against the given uri. 
// if we have reported an error, then we don't need to report again; 	TokenNameCOMMENT_LINE	if we have reported an error, then we don't need to report again; 
// otherwise we reported the error, and remember this fact. 	TokenNameCOMMENT_LINE	otherwise we reported the error, and remember this fact. 
final	TokenNamefinal	
boolean	TokenNameboolean	
needReportTNSError	TokenNameIdentifier	 need Report TNS Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fReportedTNS	TokenNameIdentifier	 f Reported TNS
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fReportedTNS	TokenNameIdentifier	 f Reported TNS
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fReportedTNS	TokenNameIdentifier	 f Reported TNS
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fReportedTNS	TokenNameIdentifier	 f Reported TNS
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return the attributes on the schema element itself: 	TokenNameCOMMENT_LINE	return the attributes on the schema element itself: 
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSchemaAttrs	TokenNameIdentifier	 get Schema Attrs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSchemaAttrs	TokenNameIdentifier	 f Schema Attrs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// deallocate the storage set aside for the schema element's 	TokenNameCOMMENT_LINE	deallocate the storage set aside for the schema element's 
// attributes 	TokenNameCOMMENT_LINE	attributes 
void	TokenNamevoid	
returnSchemaAttrs	TokenNameIdentifier	 return Schema Attrs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttrChecker	TokenNameIdentifier	 f Attr Checker
.	TokenNameDOT	
returnAttrArray	TokenNameIdentifier	 return Attr Array
(	TokenNameLPAREN	
fSchemaAttrs	TokenNameIdentifier	 f Schema Attrs
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fSchemaAttrs	TokenNameIdentifier	 f Schema Attrs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// adds an annotation to the list of annotations 	TokenNameCOMMENT_LINE	adds an annotation to the list of annotations 
void	TokenNamevoid	
addAnnotation	TokenNameIdentifier	 add Annotation
(	TokenNameLPAREN	
XSAnnotationInfo	TokenNameIdentifier	 XS Annotation Info
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
fAnnotations	TokenNameIdentifier	 f Annotations
;	TokenNameSEMICOLON	
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// returns the list of annotations conatined in the 	TokenNameCOMMENT_LINE	returns the list of annotations conatined in the 
// schema document or null if the document contained no annotations. 	TokenNameCOMMENT_LINE	schema document or null if the document contained no annotations. 
XSAnnotationInfo	TokenNameIdentifier	 XS Annotation Info
getAnnotations	TokenNameIdentifier	 get Annotations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fAnnotations	TokenNameIdentifier	 f Annotations
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// removes reference to annotation list 	TokenNameCOMMENT_LINE	removes reference to annotation list 
void	TokenNamevoid	
removeAnnotations	TokenNameIdentifier	 remove Annotations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// XSDocumentInfo 	TokenNameCOMMENT_LINE	XSDocumentInfo 
