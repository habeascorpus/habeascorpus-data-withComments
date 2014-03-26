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
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
ValidatedInfo	TokenNameIdentifier	 Validated Info
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSAnnotation	TokenNameIdentifier	 XS Annotation
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
XSAttributeGroupDefinition	TokenNameIdentifier	 XS Attribute Group Definition
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
XSAttributeUse	TokenNameIdentifier	 XS Attribute Use
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
XSConstants	TokenNameIdentifier	 XS Constants
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
XSNamespaceItem	TokenNameIdentifier	 XS Namespace Item
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSWildcard	TokenNameIdentifier	 XS Wildcard
;	TokenNameSEMICOLON	
/** * The XML representation for an attribute group declaration * schema component is a global &lt;attributeGroup&gt; element information item * * @xerces.internal * * @author Sandy Gao, IBM * @author Rahul Srivastava, Sun Microsystems Inc. * * @version $Id: XSAttributeGroupDecl.java 834253 2009-11-09 22:07:23Z sandygao $ */	TokenNameCOMMENT_JAVADOC	 The XML representation for an attribute group declaration schema component is a global &lt;attributeGroup&gt; element information item * @xerces.internal * @author Sandy Gao, IBM @author Rahul Srivastava, Sun Microsystems Inc. * @version $Id: XSAttributeGroupDecl.java 834253 2009-11-09 22:07:23Z sandygao $ 
public	TokenNamepublic	
class	TokenNameclass	
XSAttributeGroupDecl	TokenNameIdentifier	 XS Attribute Group Decl
implements	TokenNameimplements	
XSAttributeGroupDefinition	TokenNameIdentifier	 XS Attribute Group Definition
{	TokenNameLBRACE	
// name of the attribute group 	TokenNameCOMMENT_LINE	name of the attribute group 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
fName	TokenNameIdentifier	 f Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// target namespace of the attribute group 	TokenNameCOMMENT_LINE	target namespace of the attribute group 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// number of attribute uses included by this attribute group 	TokenNameCOMMENT_LINE	number of attribute uses included by this attribute group 
int	TokenNameint	
fAttrUseNum	TokenNameIdentifier	 f Attr Use Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// attribute uses included by this attribute group 	TokenNameCOMMENT_LINE	attribute uses included by this attribute group 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INITIAL_SIZE	TokenNameIdentifier	 INITIAL  SIZE
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
=	TokenNameEQUAL	
new	TokenNamenew	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
[	TokenNameLBRACKET	
INITIAL_SIZE	TokenNameIdentifier	 INITIAL  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// attribute wildcard included by this attribute group 	TokenNameCOMMENT_LINE	attribute wildcard included by this attribute group 
public	TokenNamepublic	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
fAttributeWC	TokenNameIdentifier	 f Attribute WC
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// whether there is an attribute use whose type is or is derived from ID. 	TokenNameCOMMENT_LINE	whether there is an attribute use whose type is or is derived from ID. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
fIDAttrName	TokenNameIdentifier	 f ID Attr Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// optional annotation 	TokenNameCOMMENT_LINE	optional annotation 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
fAnnotations	TokenNameIdentifier	 f Annotations
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
fAttrUses	TokenNameIdentifier	 f Attr Uses
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// The namespace schema information item corresponding to the target namespace 	TokenNameCOMMENT_LINE	The namespace schema information item corresponding to the target namespace 
// of the attribute group definition, if it is globally declared; or null otherwise. 	TokenNameCOMMENT_LINE	of the attribute group definition, if it is globally declared; or null otherwise. 
private	TokenNameprivate	
XSNamespaceItem	TokenNameIdentifier	 XS Namespace Item
fNamespaceItem	TokenNameIdentifier	 f Namespace Item
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// add an attribute use 	TokenNameCOMMENT_LINE	add an attribute use 
// if the type is derived from ID, but there is already another attribute 	TokenNameCOMMENT_LINE	if the type is derived from ID, but there is already another attribute 
// use of type ID, then return the name of the other attribute use; 	TokenNameCOMMENT_LINE	use of type ID, then return the name of the other attribute use; 
// otherwise, return null 	TokenNameCOMMENT_LINE	otherwise, return null 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
addAttributeUse	TokenNameIdentifier	 add Attribute Use
(	TokenNameLPAREN	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
attrUse	TokenNameIdentifier	 attr Use
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if this attribute use is prohibited, then don't check whether it's 	TokenNameCOMMENT_LINE	if this attribute use is prohibited, then don't check whether it's 
// of type ID 	TokenNameCOMMENT_LINE	of type ID 
if	TokenNameif	
(	TokenNameLPAREN	
attrUse	TokenNameIdentifier	 attr Use
.	TokenNameDOT	
fUse	TokenNameIdentifier	 f Use
!=	TokenNameNOT_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
USE_PROHIBITED	TokenNameIdentifier	 USE  PROHIBITED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attrUse	TokenNameIdentifier	 attr Use
.	TokenNameDOT	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
.	TokenNameDOT	
isIDType	TokenNameIdentifier	 is ID Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if there is already an attribute use of type ID, 	TokenNameCOMMENT_LINE	if there is already an attribute use of type ID, 
// return its name (and don't add it to the list, to avoid 	TokenNameCOMMENT_LINE	return its name (and don't add it to the list, to avoid 
// interruption to instance validation. 	TokenNameCOMMENT_LINE	interruption to instance validation. 
if	TokenNameif	
(	TokenNameLPAREN	
fIDAttrName	TokenNameIdentifier	 f ID Attr Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fIDAttrName	TokenNameIdentifier	 f ID Attr Name
=	TokenNameEQUAL	
attrUse	TokenNameIdentifier	 attr Use
.	TokenNameDOT	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
fIDAttrName	TokenNameIdentifier	 f ID Attr Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fAttrUseNum	TokenNameIdentifier	 f Attr Use Num
==	TokenNameEQUAL_EQUAL	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
=	TokenNameEQUAL	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
,	TokenNameCOMMA	
fAttrUseNum	TokenNameIdentifier	 f Attr Use Num
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
[	TokenNameLBRACKET	
fAttrUseNum	TokenNameIdentifier	 f Attr Use Num
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
attrUse	TokenNameIdentifier	 attr Use
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
replaceAttributeUse	TokenNameIdentifier	 replace Attribute Use
(	TokenNameLPAREN	
XSAttributeUse	TokenNameIdentifier	 XS Attribute Use
oldUse	TokenNameIdentifier	 old Use
,	TokenNameCOMMA	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
newUse	TokenNameIdentifier	 new Use
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fAttrUseNum	TokenNameIdentifier	 f Attr Use Num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
oldUse	TokenNameIdentifier	 old Use
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newUse	TokenNameIdentifier	 new Use
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
XSAttributeUse	TokenNameIdentifier	 XS Attribute Use
getAttributeUse	TokenNameIdentifier	 get Attribute Use
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fAttrUseNum	TokenNameIdentifier	 f Attr Use Num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
==	TokenNameEQUAL_EQUAL	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XSAttributeUse	TokenNameIdentifier	 XS Attribute Use
getAttributeUseNoProhibited	TokenNameIdentifier	 get Attribute Use No Prohibited
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fAttrUseNum	TokenNameIdentifier	 f Attr Use Num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
==	TokenNameEQUAL_EQUAL	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
fUse	TokenNameIdentifier	 f Use
!=	TokenNameNOT_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
USE_PROHIBITED	TokenNameIdentifier	 USE  PROHIBITED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
removeProhibitedAttrs	TokenNameIdentifier	 remove Prohibited Attrs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fAttrUseNum	TokenNameIdentifier	 f Attr Use Num
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// Remove all prohibited attributes. 	TokenNameCOMMENT_LINE	Remove all prohibited attributes. 
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
uses	TokenNameIdentifier	 uses
=	TokenNameEQUAL	
new	TokenNamenew	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
[	TokenNameLBRACKET	
fAttrUseNum	TokenNameIdentifier	 f Attr Use Num
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fAttrUseNum	TokenNameIdentifier	 f Attr Use Num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
fUse	TokenNameIdentifier	 f Use
!=	TokenNameNOT_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
USE_PROHIBITED	TokenNameIdentifier	 USE  PROHIBITED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uses	TokenNameIdentifier	 uses
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
=	TokenNameEQUAL	
uses	TokenNameIdentifier	 uses
;	TokenNameSEMICOLON	
fAttrUseNum	TokenNameIdentifier	 f Attr Use Num
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
// Do not remove attributes that have the same name as the prohibited 	TokenNameCOMMENT_LINE	Do not remove attributes that have the same name as the prohibited 
// ones, because they are specified at the same level. Prohibited 	TokenNameCOMMENT_LINE	ones, because they are specified at the same level. Prohibited 
// attributes are only to remove attributes from the base type in a 	TokenNameCOMMENT_LINE	attributes are only to remove attributes from the base type in a 
// restriction. 	TokenNameCOMMENT_LINE	restriction. 
// int newCount = 0; 	TokenNameCOMMENT_LINE	int newCount = 0; 
// if (pCount > 0) { 	TokenNameCOMMENT_LINE	if (pCount > 0) { 
// OUTER: for (int i = 0; i < fAttrUseNum; i++) { 	TokenNameCOMMENT_LINE	OUTER: for (int i = 0; i < fAttrUseNum; i++) { 
// if (fAttributeUses[i].fUse == SchemaSymbols.USE_PROHIBITED) 	TokenNameCOMMENT_LINE	if (fAttributeUses[i].fUse == SchemaSymbols.USE_PROHIBITED) 
// continue; 	TokenNameCOMMENT_LINE	continue; 
// for (int j = 1; j <= pCount; j++) { 	TokenNameCOMMENT_LINE	for (int j = 1; j <= pCount; j++) { 
// if (fAttributeUses[i].fAttrDecl.fName == pUses[fAttrUseNum-pCount].fAttrDecl.fName && 	TokenNameCOMMENT_LINE	if (fAttributeUses[i].fAttrDecl.fName == pUses[fAttrUseNum-pCount].fAttrDecl.fName && 
// fAttributeUses[i].fAttrDecl.fTargetNamespace == pUses[fAttrUseNum-pCount].fAttrDecl.fTargetNamespace) { 	TokenNameCOMMENT_LINE	fAttributeUses[i].fAttrDecl.fTargetNamespace == pUses[fAttrUseNum-pCount].fAttrDecl.fTargetNamespace) { 
// continue OUTER; 	TokenNameCOMMENT_LINE	continue OUTER; 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// pUses[newCount++] = fAttributeUses[i]; 	TokenNameCOMMENT_LINE	pUses[newCount++] = fAttributeUses[i]; 
// } 	TokenNameCOMMENT_LINE	} 
// fAttributeUses = pUses; 	TokenNameCOMMENT_LINE	fAttributeUses = pUses; 
// fAttrUseNum = newCount; 	TokenNameCOMMENT_LINE	fAttrUseNum = newCount; 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
/** * Check that the attributes in this group validly restrict those from a base group. * If an error is found, an Object[] is returned. This contains the arguments for the error message * describing the error. The last element in the array (at index arr.length - 1) is the the error code. * Returns null if there is no error. * * REVISIT: is there a better way of returning the appropriate information for the error? * * @param typeName the name of the type containing this attribute group, used for error reporting purposes * @param baseGroup the XSAttributeGroupDecl that is the base we are checking against */	TokenNameCOMMENT_JAVADOC	 Check that the attributes in this group validly restrict those from a base group. If an error is found, an Object[] is returned. This contains the arguments for the error message describing the error. The last element in the array (at index arr.length - 1) is the the error code. Returns null if there is no error. * REVISIT: is there a better way of returning the appropriate information for the error? * @param typeName the name of the type containing this attribute group, used for error reporting purposes @param baseGroup the XSAttributeGroupDecl that is the base we are checking against 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
validRestrictionOf	TokenNameIdentifier	 valid Restriction Of
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
typeName	TokenNameIdentifier	 type Name
,	TokenNameCOMMA	
XSAttributeGroupDecl	TokenNameIdentifier	 XS Attribute Group Decl
baseGroup	TokenNameIdentifier	 base Group
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
errorArgs	TokenNameIdentifier	 error Args
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
attrUse	TokenNameIdentifier	 attr Use
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
XSAttributeDecl	TokenNameIdentifier	 XS Attribute Decl
attrDecl	TokenNameIdentifier	 attr Decl
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
baseAttrUse	TokenNameIdentifier	 base Attr Use
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
XSAttributeDecl	TokenNameIdentifier	 XS Attribute Decl
baseAttrDecl	TokenNameIdentifier	 base Attr Decl
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fAttrUseNum	TokenNameIdentifier	 f Attr Use Num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attrUse	TokenNameIdentifier	 attr Use
=	TokenNameEQUAL	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
attrDecl	TokenNameIdentifier	 attr Decl
=	TokenNameEQUAL	
attrUse	TokenNameIdentifier	 attr Use
.	TokenNameDOT	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
;	TokenNameSEMICOLON	
// Look for a match in the base 	TokenNameCOMMENT_LINE	Look for a match in the base 
baseAttrUse	TokenNameIdentifier	 base Attr Use
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
)	TokenNameRPAREN	
baseGroup	TokenNameIdentifier	 base Group
.	TokenNameDOT	
getAttributeUse	TokenNameIdentifier	 get Attribute Use
(	TokenNameLPAREN	
attrDecl	TokenNameIdentifier	 attr Decl
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
,	TokenNameCOMMA	
attrDecl	TokenNameIdentifier	 attr Decl
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseAttrUse	TokenNameIdentifier	 base Attr Use
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// derivation-ok-restriction. Constraint 2.1.1 	TokenNameCOMMENT_LINE	derivation-ok-restriction. Constraint 2.1.1 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
baseAttrUse	TokenNameIdentifier	 base Attr Use
.	TokenNameDOT	
getRequired	TokenNameIdentifier	 get Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
attrUse	TokenNameIdentifier	 attr Use
.	TokenNameDOT	
getRequired	TokenNameIdentifier	 get Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArgs	TokenNameIdentifier	 error Args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
typeName	TokenNameIdentifier	 type Name
,	TokenNameCOMMA	
attrDecl	TokenNameIdentifier	 attr Decl
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
,	TokenNameCOMMA	
attrUse	TokenNameIdentifier	 attr Use
.	TokenNameDOT	
fUse	TokenNameIdentifier	 f Use
==	TokenNameEQUAL_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
USE_OPTIONAL	TokenNameIdentifier	 USE  OPTIONAL
?	TokenNameQUESTION	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ATTVAL_OPTIONAL	TokenNameIdentifier	 ATTVAL  OPTIONAL
:	TokenNameCOLON	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ATTVAL_PROHIBITED	TokenNameIdentifier	 ATTVAL  PROHIBITED
,	TokenNameCOMMA	
"derivation-ok-restriction.2.1.1"	TokenNameStringLiteral	derivation-ok-restriction.2.1.1
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
errorArgs	TokenNameIdentifier	 error Args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if this attribute is prohibited in the derived type, don't 	TokenNameCOMMENT_LINE	if this attribute is prohibited in the derived type, don't 
// need to check any of the following constraints. 	TokenNameCOMMENT_LINE	need to check any of the following constraints. 
if	TokenNameif	
(	TokenNameLPAREN	
attrUse	TokenNameIdentifier	 attr Use
.	TokenNameDOT	
fUse	TokenNameIdentifier	 f Use
==	TokenNameEQUAL_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
USE_PROHIBITED	TokenNameIdentifier	 USE  PROHIBITED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
baseAttrDecl	TokenNameIdentifier	 base Attr Decl
=	TokenNameEQUAL	
baseAttrUse	TokenNameIdentifier	 base Attr Use
.	TokenNameDOT	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// derivation-ok-restriction. Constraint 2.1.1 	TokenNameCOMMENT_LINE	derivation-ok-restriction. Constraint 2.1.1 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XSConstraints	TokenNameIdentifier	 XS Constraints
.	TokenNameDOT	
checkSimpleDerivationOk	TokenNameIdentifier	 check Simple Derivation Ok
(	TokenNameLPAREN	
attrDecl	TokenNameIdentifier	 attr Decl
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
,	TokenNameCOMMA	
baseAttrDecl	TokenNameIdentifier	 base Attr Decl
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
,	TokenNameCOMMA	
baseAttrDecl	TokenNameIdentifier	 base Attr Decl
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
.	TokenNameDOT	
getFinal	TokenNameIdentifier	 get Final
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArgs	TokenNameIdentifier	 error Args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
typeName	TokenNameIdentifier	 type Name
,	TokenNameCOMMA	
attrDecl	TokenNameIdentifier	 attr Decl
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
,	TokenNameCOMMA	
attrDecl	TokenNameIdentifier	 attr Decl
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
baseAttrDecl	TokenNameIdentifier	 base Attr Decl
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"derivation-ok-restriction.2.1.2"	TokenNameStringLiteral	derivation-ok-restriction.2.1.2
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
errorArgs	TokenNameIdentifier	 error Args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// derivation-ok-restriction. Constraint 2.1.3 	TokenNameCOMMENT_LINE	derivation-ok-restriction. Constraint 2.1.3 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
baseConsType	TokenNameIdentifier	 base Cons Type
=	TokenNameEQUAL	
baseAttrUse	TokenNameIdentifier	 base Attr Use
.	TokenNameDOT	
fConstraintType	TokenNameIdentifier	 f Constraint Type
!=	TokenNameNOT_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
VC_NONE	TokenNameIdentifier	 VC  NONE
?	TokenNameQUESTION	
baseAttrUse	TokenNameIdentifier	 base Attr Use
.	TokenNameDOT	
fConstraintType	TokenNameIdentifier	 f Constraint Type
:	TokenNameCOLON	
baseAttrDecl	TokenNameIdentifier	 base Attr Decl
.	TokenNameDOT	
getConstraintType	TokenNameIdentifier	 get Constraint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
thisConstType	TokenNameIdentifier	 this Const Type
=	TokenNameEQUAL	
attrUse	TokenNameIdentifier	 attr Use
.	TokenNameDOT	
fConstraintType	TokenNameIdentifier	 f Constraint Type
!=	TokenNameNOT_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
VC_NONE	TokenNameIdentifier	 VC  NONE
?	TokenNameQUESTION	
attrUse	TokenNameIdentifier	 attr Use
.	TokenNameDOT	
fConstraintType	TokenNameIdentifier	 f Constraint Type
:	TokenNameCOLON	
attrDecl	TokenNameIdentifier	 attr Decl
.	TokenNameDOT	
getConstraintType	TokenNameIdentifier	 get Constraint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseConsType	TokenNameIdentifier	 base Cons Type
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
VC_FIXED	TokenNameIdentifier	 VC  FIXED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
thisConstType	TokenNameIdentifier	 this Const Type
!=	TokenNameNOT_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
VC_FIXED	TokenNameIdentifier	 VC  FIXED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArgs	TokenNameIdentifier	 error Args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
typeName	TokenNameIdentifier	 type Name
,	TokenNameCOMMA	
attrDecl	TokenNameIdentifier	 attr Decl
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
,	TokenNameCOMMA	
"derivation-ok-restriction.2.1.3.a"	TokenNameStringLiteral	derivation-ok-restriction.2.1.3.a
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
errorArgs	TokenNameIdentifier	 error Args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// check the values are the same. 	TokenNameCOMMENT_LINE	check the values are the same. 
ValidatedInfo	TokenNameIdentifier	 Validated Info
baseFixedValue	TokenNameIdentifier	 base Fixed Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
baseAttrUse	TokenNameIdentifier	 base Attr Use
.	TokenNameDOT	
fDefault	TokenNameIdentifier	 f Default
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
baseAttrUse	TokenNameIdentifier	 base Attr Use
.	TokenNameDOT	
fDefault	TokenNameIdentifier	 f Default
:	TokenNameCOLON	
baseAttrDecl	TokenNameIdentifier	 base Attr Decl
.	TokenNameDOT	
fDefault	TokenNameIdentifier	 f Default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ValidatedInfo	TokenNameIdentifier	 Validated Info
thisFixedValue	TokenNameIdentifier	 this Fixed Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
attrUse	TokenNameIdentifier	 attr Use
.	TokenNameDOT	
fDefault	TokenNameIdentifier	 f Default
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
attrUse	TokenNameIdentifier	 attr Use
.	TokenNameDOT	
fDefault	TokenNameIdentifier	 f Default
:	TokenNameCOLON	
attrDecl	TokenNameIdentifier	 attr Decl
.	TokenNameDOT	
fDefault	TokenNameIdentifier	 f Default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
baseFixedValue	TokenNameIdentifier	 base Fixed Value
.	TokenNameDOT	
actualValue	TokenNameIdentifier	 actual Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
thisFixedValue	TokenNameIdentifier	 this Fixed Value
.	TokenNameDOT	
actualValue	TokenNameIdentifier	 actual Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArgs	TokenNameIdentifier	 error Args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
typeName	TokenNameIdentifier	 type Name
,	TokenNameCOMMA	
attrDecl	TokenNameIdentifier	 attr Decl
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
,	TokenNameCOMMA	
thisFixedValue	TokenNameIdentifier	 this Fixed Value
.	TokenNameDOT	
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
baseFixedValue	TokenNameIdentifier	 base Fixed Value
.	TokenNameDOT	
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"derivation-ok-restriction.2.1.3.b"	TokenNameStringLiteral	derivation-ok-restriction.2.1.3.b
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
errorArgs	TokenNameIdentifier	 error Args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// No matching attribute in base - there should be a matching wildcard 	TokenNameCOMMENT_LINE	No matching attribute in base - there should be a matching wildcard 
// 	TokenNameCOMMENT_LINE	 
// derivation-ok-restriction. Constraint 2.2 	TokenNameCOMMENT_LINE	derivation-ok-restriction. Constraint 2.2 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
baseGroup	TokenNameIdentifier	 base Group
.	TokenNameDOT	
fAttributeWC	TokenNameIdentifier	 f Attribute WC
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArgs	TokenNameIdentifier	 error Args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
typeName	TokenNameIdentifier	 type Name
,	TokenNameCOMMA	
attrDecl	TokenNameIdentifier	 attr Decl
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
,	TokenNameCOMMA	
"derivation-ok-restriction.2.2.a"	TokenNameStringLiteral	derivation-ok-restriction.2.2.a
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
errorArgs	TokenNameIdentifier	 error Args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
baseGroup	TokenNameIdentifier	 base Group
.	TokenNameDOT	
fAttributeWC	TokenNameIdentifier	 f Attribute WC
.	TokenNameDOT	
allowNamespace	TokenNameIdentifier	 allow Namespace
(	TokenNameLPAREN	
attrDecl	TokenNameIdentifier	 attr Decl
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArgs	TokenNameIdentifier	 error Args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
typeName	TokenNameIdentifier	 type Name
,	TokenNameCOMMA	
attrDecl	TokenNameIdentifier	 attr Decl
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
,	TokenNameCOMMA	
attrDecl	TokenNameIdentifier	 attr Decl
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
attrDecl	TokenNameIdentifier	 attr Decl
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
,	TokenNameCOMMA	
"derivation-ok-restriction.2.2.b"	TokenNameStringLiteral	derivation-ok-restriction.2.2.b
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
errorArgs	TokenNameIdentifier	 error Args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Check that any REQUIRED attributes in the base have matching attributes 	TokenNameCOMMENT_LINE	Check that any REQUIRED attributes in the base have matching attributes 
// in this group 	TokenNameCOMMENT_LINE	in this group 
// derivation-ok-restriction. Constraint 3 	TokenNameCOMMENT_LINE	derivation-ok-restriction. Constraint 3 
// 	TokenNameCOMMENT_LINE	 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
baseGroup	TokenNameIdentifier	 base Group
.	TokenNameDOT	
fAttrUseNum	TokenNameIdentifier	 f Attr Use Num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseAttrUse	TokenNameIdentifier	 base Attr Use
=	TokenNameEQUAL	
baseGroup	TokenNameIdentifier	 base Group
.	TokenNameDOT	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseAttrUse	TokenNameIdentifier	 base Attr Use
.	TokenNameDOT	
fUse	TokenNameIdentifier	 f Use
==	TokenNameEQUAL_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
USE_REQUIRED	TokenNameIdentifier	 USE  REQUIRED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseAttrDecl	TokenNameIdentifier	 base Attr Decl
=	TokenNameEQUAL	
baseAttrUse	TokenNameIdentifier	 base Attr Use
.	TokenNameDOT	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
;	TokenNameSEMICOLON	
// Look for a match in this group 	TokenNameCOMMENT_LINE	Look for a match in this group 
if	TokenNameif	
(	TokenNameLPAREN	
getAttributeUse	TokenNameIdentifier	 get Attribute Use
(	TokenNameLPAREN	
baseAttrDecl	TokenNameIdentifier	 base Attr Decl
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
,	TokenNameCOMMA	
baseAttrDecl	TokenNameIdentifier	 base Attr Decl
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArgs	TokenNameIdentifier	 error Args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
typeName	TokenNameIdentifier	 type Name
,	TokenNameCOMMA	
baseAttrUse	TokenNameIdentifier	 base Attr Use
.	TokenNameDOT	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
,	TokenNameCOMMA	
"derivation-ok-restriction.3"	TokenNameStringLiteral	derivation-ok-restriction.3
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
errorArgs	TokenNameIdentifier	 error Args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Now, check wildcards 	TokenNameCOMMENT_LINE	Now, check wildcards 
// 	TokenNameCOMMENT_LINE	 
// derivation-ok-restriction. Constraint 4 	TokenNameCOMMENT_LINE	derivation-ok-restriction. Constraint 4 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeWC	TokenNameIdentifier	 f Attribute WC
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
baseGroup	TokenNameIdentifier	 base Group
.	TokenNameDOT	
fAttributeWC	TokenNameIdentifier	 f Attribute WC
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArgs	TokenNameIdentifier	 error Args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
typeName	TokenNameIdentifier	 type Name
,	TokenNameCOMMA	
"derivation-ok-restriction.4.1"	TokenNameStringLiteral	derivation-ok-restriction.4.1
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
errorArgs	TokenNameIdentifier	 error Args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fAttributeWC	TokenNameIdentifier	 f Attribute WC
.	TokenNameDOT	
isSubsetOf	TokenNameIdentifier	 is Subset Of
(	TokenNameLPAREN	
baseGroup	TokenNameIdentifier	 base Group
.	TokenNameDOT	
fAttributeWC	TokenNameIdentifier	 f Attribute WC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArgs	TokenNameIdentifier	 error Args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
typeName	TokenNameIdentifier	 type Name
,	TokenNameCOMMA	
"derivation-ok-restriction.4.2"	TokenNameStringLiteral	derivation-ok-restriction.4.2
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
errorArgs	TokenNameIdentifier	 error Args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeWC	TokenNameIdentifier	 f Attribute WC
.	TokenNameDOT	
weakerProcessContents	TokenNameIdentifier	 weaker Process Contents
(	TokenNameLPAREN	
baseGroup	TokenNameIdentifier	 base Group
.	TokenNameDOT	
fAttributeWC	TokenNameIdentifier	 f Attribute WC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArgs	TokenNameIdentifier	 error Args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
typeName	TokenNameIdentifier	 type Name
,	TokenNameCOMMA	
fAttributeWC	TokenNameIdentifier	 f Attribute WC
.	TokenNameDOT	
getProcessContentsAsString	TokenNameIdentifier	 get Process Contents As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
baseGroup	TokenNameIdentifier	 base Group
.	TokenNameDOT	
fAttributeWC	TokenNameIdentifier	 f Attribute WC
.	TokenNameDOT	
getProcessContentsAsString	TokenNameIdentifier	 get Process Contents As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"derivation-ok-restriction.4.3"	TokenNameStringLiteral	derivation-ok-restriction.4.3
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
errorArgs	TokenNameIdentifier	 error Args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldArray	TokenNameIdentifier	 old Array
,	TokenNameCOMMA	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
oldArray	TokenNameIdentifier	 old Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
oldArray	TokenNameIdentifier	 old Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reset the attribute group declaration 	TokenNameCOMMENT_LINE	reset the attribute group declaration 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fName	TokenNameIdentifier	 f Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// reset attribute uses 	TokenNameCOMMENT_LINE	reset attribute uses 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fAttrUseNum	TokenNameIdentifier	 f Attr Use Num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAttrUseNum	TokenNameIdentifier	 f Attr Use Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fAttributeWC	TokenNameIdentifier	 f Attribute WC
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fIDAttrName	TokenNameIdentifier	 f ID Attr Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the type of the object, i.e ELEMENT_DECLARATION. */	TokenNameCOMMENT_JAVADOC	 Get the type of the object, i.e ELEMENT_DECLARATION. 
public	TokenNamepublic	
short	TokenNameshort	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
ATTRIBUTE_GROUP	TokenNameIdentifier	 ATTRIBUTE  GROUP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The <code>name</code> of this <code>XSObject</code> depending on the * <code>XSObject</code> type. */	TokenNameCOMMENT_JAVADOC	 The <code>name</code> of this <code>XSObject</code> depending on the <code>XSObject</code> type. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fName	TokenNameIdentifier	 f Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The namespace URI of this node, or <code>null</code> if it is * unspecified. defines how a namespace URI is attached to schema * components. */	TokenNameCOMMENT_JAVADOC	 The namespace URI of this node, or <code>null</code> if it is unspecified. defines how a namespace URI is attached to schema components. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {attribute uses} A set of attribute uses. */	TokenNameCOMMENT_JAVADOC	 {attribute uses} A set of attribute uses. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getAttributeUses	TokenNameIdentifier	 get Attribute Uses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fAttrUses	TokenNameIdentifier	 f Attr Uses
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttrUses	TokenNameIdentifier	 f Attr Uses
=	TokenNameEQUAL	
new	TokenNamenew	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
(	TokenNameLPAREN	
fAttributeUses	TokenNameIdentifier	 f Attribute Uses
,	TokenNameCOMMA	
fAttrUseNum	TokenNameIdentifier	 f Attr Use Num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fAttrUses	TokenNameIdentifier	 f Attr Uses
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {attribute wildcard} Optional. A wildcard. */	TokenNameCOMMENT_JAVADOC	 {attribute wildcard} Optional. A wildcard. 
public	TokenNamepublic	
XSWildcard	TokenNameIdentifier	 XS Wildcard
getAttributeWildcard	TokenNameIdentifier	 get Attribute Wildcard
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fAttributeWC	TokenNameIdentifier	 f Attribute WC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Optional. Annotation. */	TokenNameCOMMENT_JAVADOC	 Optional. Annotation. 
public	TokenNamepublic	
XSAnnotation	TokenNameIdentifier	 XS Annotation
getAnnotation	TokenNameIdentifier	 get Annotation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fAnnotations	TokenNameIdentifier	 f Annotations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
XSAnnotation	TokenNameIdentifier	 XS Annotation
)	TokenNameRPAREN	
fAnnotations	TokenNameIdentifier	 f Annotations
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Optional. Annotations. */	TokenNameCOMMENT_JAVADOC	 Optional. Annotations. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getAnnotations	TokenNameIdentifier	 get Annotations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fAnnotations	TokenNameIdentifier	 f Annotations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fAnnotations	TokenNameIdentifier	 f Annotations
:	TokenNameCOLON	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xerces.xs.XSObject#getNamespaceItem() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xs.XSObject#getNamespaceItem() 
public	TokenNamepublic	
XSNamespaceItem	TokenNameIdentifier	 XS Namespace Item
getNamespaceItem	TokenNameIdentifier	 get Namespace Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNamespaceItem	TokenNameIdentifier	 f Namespace Item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setNamespaceItem	TokenNameIdentifier	 set Namespace Item
(	TokenNameLPAREN	
XSNamespaceItem	TokenNameIdentifier	 XS Namespace Item
namespaceItem	TokenNameIdentifier	 namespace Item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaceItem	TokenNameIdentifier	 f Namespace Item
=	TokenNameEQUAL	
namespaceItem	TokenNameIdentifier	 namespace Item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XSAttributeGroupDecl 	TokenNameCOMMENT_LINE	class XSAttributeGroupDecl 
