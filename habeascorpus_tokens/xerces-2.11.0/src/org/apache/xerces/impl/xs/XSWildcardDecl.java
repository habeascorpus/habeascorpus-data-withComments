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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringListImpl	TokenNameIdentifier	 String List Impl
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
StringList	TokenNameIdentifier	 String List
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
/** * The XML representation for a wildcard declaration * schema component is an &lt;any&gt; or &lt;anyAttribute&gt; element information item * * @xerces.internal * * @author Sandy Gao, IBM * @author Rahul Srivastava, Sun Microsystems Inc. * * @version $Id: XSWildcardDecl.java 965250 2010-07-18 16:04:58Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The XML representation for a wildcard declaration schema component is an &lt;any&gt; or &lt;anyAttribute&gt; element information item * @xerces.internal * @author Sandy Gao, IBM @author Rahul Srivastava, Sun Microsystems Inc. * @version $Id: XSWildcardDecl.java 965250 2010-07-18 16:04:58Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
implements	TokenNameimplements	
XSWildcard	TokenNameIdentifier	 XS Wildcard
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ABSENT	TokenNameIdentifier	 ABSENT
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// the type of wildcard: any, other, or list 	TokenNameCOMMENT_LINE	the type of wildcard: any, other, or list 
public	TokenNamepublic	
short	TokenNameshort	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
NSCONSTRAINT_ANY	TokenNameIdentifier	 NSCONSTRAINT  ANY
;	TokenNameSEMICOLON	
// the type of process contents: strict, lax, or skip 	TokenNameCOMMENT_LINE	the type of process contents: strict, lax, or skip 
public	TokenNamepublic	
short	TokenNameshort	
fProcessContents	TokenNameIdentifier	 f Process Contents
=	TokenNameEQUAL	
PC_STRICT	TokenNameIdentifier	 PC  STRICT
;	TokenNameSEMICOLON	
// the namespace list: 	TokenNameCOMMENT_LINE	the namespace list: 
// for NSCONSTRAINT_LIST, it means one of the namespaces in the list 	TokenNameCOMMENT_LINE	for NSCONSTRAINT_LIST, it means one of the namespaces in the list 
// for NSCONSTRAINT_NOT, it means not any of the namespaces in the list 	TokenNameCOMMENT_LINE	for NSCONSTRAINT_NOT, it means not any of the namespaces in the list 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fNamespaceList	TokenNameIdentifier	 f Namespace List
;	TokenNameSEMICOLON	
// optional annotation 	TokenNameCOMMENT_LINE	optional annotation 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// I'm trying to implement the following constraint exactly as what the 	TokenNameCOMMENT_LINE	I'm trying to implement the following constraint exactly as what the 
// spec describes. Sometimes it seems redundant, and sometimes there seems 	TokenNameCOMMENT_LINE	spec describes. Sometimes it seems redundant, and sometimes there seems 
// to be much easier solutions. But it makes it easy to understand, 	TokenNameCOMMENT_LINE	to be much easier solutions. But it makes it easy to understand, 
// easy to maintain, and easy to find a bug (either in the code, or in the 	TokenNameCOMMENT_LINE	easy to maintain, and easy to find a bug (either in the code, or in the 
// spec). -SG 	TokenNameCOMMENT_LINE	spec). -SG 
// 	TokenNameCOMMENT_LINE	 
// NOTE: Schema spec only requires that ##other not(tNS,absent). 	TokenNameCOMMENT_LINE	NOTE: Schema spec only requires that ##other not(tNS,absent). 
// The way we store ##other is not(NS1,NS2,...,NSN), which covers 	TokenNameCOMMENT_LINE	The way we store ##other is not(NS1,NS2,...,NSN), which covers 
// what's required by Schema, and allows future enhanced features. 	TokenNameCOMMENT_LINE	what's required by Schema, and allows future enhanced features. 
// 	TokenNameCOMMENT_LINE	 
// In the following in-line comments: 	TokenNameCOMMENT_LINE	In the following in-line comments: 
// - Bullet removed from w3c specification. 	TokenNameCOMMENT_LINE	- Bullet removed from w3c specification. 
// + Bullet added as proposed by Sandy Gao, IBM. 	TokenNameCOMMENT_LINE	+ Bullet added as proposed by Sandy Gao, IBM. 
// / Since we store ##other as not(NS1,NS2,...,NSN), we need to put some 	TokenNameCOMMENT_LINE	/ Since we store ##other as not(NS1,NS2,...,NSN), we need to put some 
// comments on where we didn't follow the spec exactly. 	TokenNameCOMMENT_LINE	comments on where we didn't follow the spec exactly. 
// * When we really support not(NS1,NS2,...,NSN), we need to revisit these items. 	TokenNameCOMMENT_LINE	* When we really support not(NS1,NS2,...,NSN), we need to revisit these items. 
/** * Validation Rule: Wildcard allows Namespace Name */	TokenNameCOMMENT_JAVADOC	 Validation Rule: Wildcard allows Namespace Name 
public	TokenNamepublic	
boolean	TokenNameboolean	
allowNamespace	TokenNameIdentifier	 allow Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For a value which is either a namespace name or absent to be valid with respect to a wildcard constraint (the value of a {namespace constraint}) one of the following must be true: 	TokenNameCOMMENT_LINE	For a value which is either a namespace name or absent to be valid with respect to a wildcard constraint (the value of a {namespace constraint}) one of the following must be true: 
// 1 The constraint must be any. 	TokenNameCOMMENT_LINE	1 The constraint must be any. 
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_ANY	TokenNameIdentifier	 NSCONSTRAINT  ANY
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// 2 All of the following must be true: 	TokenNameCOMMENT_LINE	2 All of the following must be true: 
// 2.1 The constraint is a pair of not and a namespace name or absent ([Definition:] call this the namespace test). 	TokenNameCOMMENT_LINE	2.1 The constraint is a pair of not and a namespace name or absent ([Definition:] call this the namespace test). 
// 2.2 The value must not be identical to the namespace test. 	TokenNameCOMMENT_LINE	2.2 The value must not be identical to the namespace test. 
// 2.3 The value must not be absent. 	TokenNameCOMMENT_LINE	2.3 The value must not be absent. 
// / we store ##other as not(list), so our actual rule is 	TokenNameCOMMENT_LINE	/ we store ##other as not(list), so our actual rule is 
// / 2 The constraint is a pair of not and a set, and the value is not in such set. 	TokenNameCOMMENT_LINE	/ 2 The constraint is a pair of not and a set, and the value is not in such set. 
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
listNum	TokenNameIdentifier	 list Num
=	TokenNameEQUAL	
fNamespaceList	TokenNameIdentifier	 f Namespace List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
listNum	TokenNameIdentifier	 list Num
&&	TokenNameAND_AND	
!	TokenNameNOT	
found	TokenNameIdentifier	 found
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
==	TokenNameEQUAL_EQUAL	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 3 The constraint is a set, and the value is identical to one of the members of the set. 	TokenNameCOMMENT_LINE	3 The constraint is a set, and the value is identical to one of the members of the set. 
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_LIST	TokenNameIdentifier	 NSCONSTRAINT  LIST
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
listNum	TokenNameIdentifier	 list Num
=	TokenNameEQUAL	
fNamespaceList	TokenNameIdentifier	 f Namespace List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
listNum	TokenNameIdentifier	 list Num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
==	TokenNameEQUAL_EQUAL	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// none of the above conditions applied, so return false. 	TokenNameCOMMENT_LINE	none of the above conditions applied, so return false. 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Schema Component Constraint: Wildcard Subset */	TokenNameCOMMENT_JAVADOC	 Schema Component Constraint: Wildcard Subset 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSubsetOf	TokenNameIdentifier	 is Subset Of
(	TokenNameLPAREN	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
superWildcard	TokenNameIdentifier	 super Wildcard
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if the super is null (not expressible), return false 	TokenNameCOMMENT_LINE	if the super is null (not expressible), return false 
if	TokenNameif	
(	TokenNameLPAREN	
superWildcard	TokenNameIdentifier	 super Wildcard
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// For a namespace constraint (call it sub) to be an intensional subset of another 	TokenNameCOMMENT_LINE	For a namespace constraint (call it sub) to be an intensional subset of another 
// namespace constraint (call it super) one of the following must be true: 	TokenNameCOMMENT_LINE	namespace constraint (call it super) one of the following must be true: 
// 1 super must be any. 	TokenNameCOMMENT_LINE	1 super must be any. 
if	TokenNameif	
(	TokenNameLPAREN	
superWildcard	TokenNameIdentifier	 super Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_ANY	TokenNameIdentifier	 NSCONSTRAINT  ANY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 2 All of the following must be true: 	TokenNameCOMMENT_LINE	2 All of the following must be true: 
// 2.1 sub must be a pair of not and a namespace name or absent. 	TokenNameCOMMENT_LINE	2.1 sub must be a pair of not and a namespace name or absent. 
// 2.2 super must be a pair of not and the same value. 	TokenNameCOMMENT_LINE	2.2 super must be a pair of not and the same value. 
// * we can't just compare whether the namespace are the same value 	TokenNameCOMMENT_LINE	* we can't just compare whether the namespace are the same value 
// since we store other as not(list) 	TokenNameCOMMENT_LINE	since we store other as not(list) 
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
superWildcard	TokenNameIdentifier	 super Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
&&	TokenNameAND_AND	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
superWildcard	TokenNameIdentifier	 super Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 3 All of the following must be true: 	TokenNameCOMMENT_LINE	3 All of the following must be true: 
// 3.1 sub must be a set whose members are either namespace names or absent. 	TokenNameCOMMENT_LINE	3.1 sub must be a set whose members are either namespace names or absent. 
// 3.2 One of the following must be true: 	TokenNameCOMMENT_LINE	3.2 One of the following must be true: 
// 3.2.1 super must be the same set or a superset thereof. 	TokenNameCOMMENT_LINE	3.2.1 super must be the same set or a superset thereof. 
// -3.2.2 super must be a pair of not and a namespace name or absent and 	TokenNameCOMMENT_LINE	-3.2.2 super must be a pair of not and a namespace name or absent and 
// that value must not be in sub's set. 	TokenNameCOMMENT_LINE	that value must not be in sub's set. 
// +3.2.2 super must be a pair of not and a namespace name or absent and 	TokenNameCOMMENT_LINE	+3.2.2 super must be a pair of not and a namespace name or absent and 
// either that value or absent must not be in sub's set. 	TokenNameCOMMENT_LINE	either that value or absent must not be in sub's set. 
// * since we store ##other as not(list), we acturally need to make sure 	TokenNameCOMMENT_LINE	* since we store ##other as not(list), we acturally need to make sure 
// that none of the namespaces in super.list is in sub.list. 	TokenNameCOMMENT_LINE	that none of the namespaces in super.list is in sub.list. 
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_LIST	TokenNameIdentifier	 NSCONSTRAINT  LIST
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
superWildcard	TokenNameIdentifier	 super Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_LIST	TokenNameIdentifier	 NSCONSTRAINT  LIST
&&	TokenNameAND_AND	
subset2sets	TokenNameIdentifier	 subset2sets
(	TokenNameLPAREN	
fNamespaceList	TokenNameIdentifier	 f Namespace List
,	TokenNameCOMMA	
superWildcard	TokenNameIdentifier	 super Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
superWildcard	TokenNameIdentifier	 super Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
&&	TokenNameAND_AND	
!	TokenNameNOT	
elementInSet	TokenNameIdentifier	 element In Set
(	TokenNameLPAREN	
superWildcard	TokenNameIdentifier	 super Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
fNamespaceList	TokenNameIdentifier	 f Namespace List
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
elementInSet	TokenNameIdentifier	 element In Set
(	TokenNameLPAREN	
ABSENT	TokenNameIdentifier	 ABSENT
,	TokenNameCOMMA	
fNamespaceList	TokenNameIdentifier	 f Namespace List
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// none of the above conditions applied, so return false. 	TokenNameCOMMENT_LINE	none of the above conditions applied, so return false. 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isSubsetOf 	TokenNameCOMMENT_LINE	isSubsetOf 
/** * Check whether this wildcard has a weaker process contents than the super. */	TokenNameCOMMENT_JAVADOC	 Check whether this wildcard has a weaker process contents than the super. 
public	TokenNamepublic	
boolean	TokenNameboolean	
weakerProcessContents	TokenNameIdentifier	 weaker Process Contents
(	TokenNameLPAREN	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
superWildcard	TokenNameIdentifier	 super Wildcard
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fProcessContents	TokenNameIdentifier	 f Process Contents
==	TokenNameEQUAL_EQUAL	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
.	TokenNameDOT	
PC_LAX	TokenNameIdentifier	 PC  LAX
&&	TokenNameAND_AND	
superWildcard	TokenNameIdentifier	 super Wildcard
.	TokenNameDOT	
fProcessContents	TokenNameIdentifier	 f Process Contents
==	TokenNameEQUAL_EQUAL	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
.	TokenNameDOT	
PC_STRICT	TokenNameIdentifier	 PC  STRICT
||	TokenNameOR_OR	
fProcessContents	TokenNameIdentifier	 f Process Contents
==	TokenNameEQUAL_EQUAL	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
.	TokenNameDOT	
PC_SKIP	TokenNameIdentifier	 PC  SKIP
&&	TokenNameAND_AND	
superWildcard	TokenNameIdentifier	 super Wildcard
.	TokenNameDOT	
fProcessContents	TokenNameIdentifier	 f Process Contents
!=	TokenNameNOT_EQUAL	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
.	TokenNameDOT	
PC_SKIP	TokenNameIdentifier	 PC  SKIP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Schema Component Constraint: Attribute Wildcard Union */	TokenNameCOMMENT_JAVADOC	 Schema Component Constraint: Attribute Wildcard Union 
public	TokenNamepublic	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
performUnionWith	TokenNameIdentifier	 perform Union With
(	TokenNameLPAREN	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
wildcard	TokenNameIdentifier	 wildcard
,	TokenNameCOMMA	
short	TokenNameshort	
processContents	TokenNameIdentifier	 process Contents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if the other wildcard is not expressible, the result is still not expressible 	TokenNameCOMMENT_LINE	if the other wildcard is not expressible, the result is still not expressible 
if	TokenNameif	
(	TokenNameLPAREN	
wildcard	TokenNameIdentifier	 wildcard
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// For a wildcard's {namespace constraint} value to be the intensional union of two 	TokenNameCOMMENT_LINE	For a wildcard's {namespace constraint} value to be the intensional union of two 
// other such values (call them O1 and O2): the appropriate case among the following 	TokenNameCOMMENT_LINE	other such values (call them O1 and O2): the appropriate case among the following 
// must be true: 	TokenNameCOMMENT_LINE	must be true: 
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
unionWildcard	TokenNameIdentifier	 union Wildcard
=	TokenNameEQUAL	
new	TokenNamenew	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fProcessContents	TokenNameIdentifier	 f Process Contents
=	TokenNameEQUAL	
processContents	TokenNameIdentifier	 process Contents
;	TokenNameSEMICOLON	
// 1 If O1 and O2 are the same value, then that value must be the value. 	TokenNameCOMMENT_LINE	1 If O1 and O2 are the same value, then that value must be the value. 
if	TokenNameif	
(	TokenNameLPAREN	
areSame	TokenNameIdentifier	 are Same
(	TokenNameLPAREN	
wildcard	TokenNameIdentifier	 wildcard
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
=	TokenNameEQUAL	
fNamespaceList	TokenNameIdentifier	 f Namespace List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 2 If either O1 or O2 is any, then any must be the value. 	TokenNameCOMMENT_LINE	2 If either O1 or O2 is any, then any must be the value. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_ANY	TokenNameIdentifier	 NSCONSTRAINT  ANY
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_ANY	TokenNameIdentifier	 NSCONSTRAINT  ANY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
NSCONSTRAINT_ANY	TokenNameIdentifier	 NSCONSTRAINT  ANY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 3 If both O1 and O2 are sets of (namespace names or absent), then the union of 	TokenNameCOMMENT_LINE	3 If both O1 and O2 are sets of (namespace names or absent), then the union of 
// those sets must be the value. 	TokenNameCOMMENT_LINE	those sets must be the value. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_LIST	TokenNameIdentifier	 NSCONSTRAINT  LIST
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_LIST	TokenNameIdentifier	 NSCONSTRAINT  LIST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
NSCONSTRAINT_LIST	TokenNameIdentifier	 NSCONSTRAINT  LIST
;	TokenNameSEMICOLON	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
=	TokenNameEQUAL	
union2sets	TokenNameIdentifier	 union2sets
(	TokenNameLPAREN	
fNamespaceList	TokenNameIdentifier	 f Namespace List
,	TokenNameCOMMA	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -4 If the two are negations of different namespace names, then the intersection 	TokenNameCOMMENT_LINE	-4 If the two are negations of different namespace names, then the intersection 
// is not expressible. 	TokenNameCOMMENT_LINE	is not expressible. 
// +4 If the two are negations of different namespace names or absent, then 	TokenNameCOMMENT_LINE	+4 If the two are negations of different namespace names or absent, then 
// a pair of not and absent must be the value. 	TokenNameCOMMENT_LINE	a pair of not and absent must be the value. 
// * now we store ##other as not(list), the result should be 	TokenNameCOMMENT_LINE	* now we store ##other as not(list), the result should be 
// not(intersection of two lists). 	TokenNameCOMMENT_LINE	not(intersection of two lists). 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
&&	TokenNameAND_AND	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
;	TokenNameSEMICOLON	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ABSENT	TokenNameIdentifier	 ABSENT
;	TokenNameSEMICOLON	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ABSENT	TokenNameIdentifier	 ABSENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 5 If either O1 or O2 is a pair of not and a namespace name and the other is a set of 	TokenNameCOMMENT_LINE	5 If either O1 or O2 is a pair of not and a namespace name and the other is a set of 
// (namespace names or absent), then The appropriate case among the following must be true: 	TokenNameCOMMENT_LINE	(namespace names or absent), then The appropriate case among the following must be true: 
// -5.1 If the set includes the negated namespace name, then any must be the value. 	TokenNameCOMMENT_LINE	-5.1 If the set includes the negated namespace name, then any must be the value. 
// -5.2 If the set does not include the negated namespace name, then whichever of O1 or O2 	TokenNameCOMMENT_LINE	-5.2 If the set does not include the negated namespace name, then whichever of O1 or O2 
// is a pair of not and a namespace name must be the value. 	TokenNameCOMMENT_LINE	is a pair of not and a namespace name must be the value. 
// +5.1 If the negated value is a namespace name, then The appropriate case 	TokenNameCOMMENT_LINE	+5.1 If the negated value is a namespace name, then The appropriate case 
// among the following must be true: 	TokenNameCOMMENT_LINE	among the following must be true: 
// +5.1.1 If the set includes both the namespace name and absent, then any 	TokenNameCOMMENT_LINE	+5.1.1 If the set includes both the namespace name and absent, then any 
// must be the value. 	TokenNameCOMMENT_LINE	must be the value. 
// +5.1.2 If the set includes the namespace name but does not include 	TokenNameCOMMENT_LINE	+5.1.2 If the set includes the namespace name but does not include 
// absent, then a pair of not and absent must be the value. 	TokenNameCOMMENT_LINE	absent, then a pair of not and absent must be the value. 
// +5.1.3 If the set does not include the namespace name but includes 	TokenNameCOMMENT_LINE	+5.1.3 If the set does not include the namespace name but includes 
// absent, then the union is not expressible. 	TokenNameCOMMENT_LINE	absent, then the union is not expressible. 
// +5.1.4 If the set does not include either the namespace name or absent, 	TokenNameCOMMENT_LINE	+5.1.4 If the set does not include either the namespace name or absent, 
// then whichever of O1 or O2 is a pair of not and a namespace name must be 	TokenNameCOMMENT_LINE	then whichever of O1 or O2 is a pair of not and a namespace name must be 
// the value. 	TokenNameCOMMENT_LINE	the value. 
// +5.2 If the negated value is absent, then The appropriate case among the 	TokenNameCOMMENT_LINE	+5.2 If the negated value is absent, then The appropriate case among the 
// following must be true: 	TokenNameCOMMENT_LINE	following must be true: 
// +5.2.1 If the set includes absent, then any must be the value. 	TokenNameCOMMENT_LINE	+5.2.1 If the set includes absent, then any must be the value. 
// +5.2.2 If the set does not include absent, then whichever of O1 or O2 is 	TokenNameCOMMENT_LINE	+5.2.2 If the set does not include absent, then whichever of O1 or O2 is 
// a pair of not and a namespace name must be the value. 	TokenNameCOMMENT_LINE	a pair of not and a namespace name must be the value. 
// * when we have not(list), the operation is just not(otherlist-list) 	TokenNameCOMMENT_LINE	* when we have not(list), the operation is just not(otherlist-list) 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_LIST	TokenNameIdentifier	 NSCONSTRAINT  LIST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_LIST	TokenNameIdentifier	 NSCONSTRAINT  LIST
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
fNamespaceList	TokenNameIdentifier	 f Namespace List
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
fNamespaceList	TokenNameIdentifier	 f Namespace List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
foundAbsent	TokenNameIdentifier	 found Absent
=	TokenNameEQUAL	
elementInSet	TokenNameIdentifier	 element In Set
(	TokenNameLPAREN	
ABSENT	TokenNameIdentifier	 ABSENT
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
ABSENT	TokenNameIdentifier	 ABSENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
foundNS	TokenNameIdentifier	 found NS
=	TokenNameEQUAL	
elementInSet	TokenNameIdentifier	 element In Set
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
foundNS	TokenNameIdentifier	 found NS
&&	TokenNameAND_AND	
foundAbsent	TokenNameIdentifier	 found Absent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
NSCONSTRAINT_ANY	TokenNameIdentifier	 NSCONSTRAINT  ANY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
foundNS	TokenNameIdentifier	 found NS
&&	TokenNameAND_AND	
!	TokenNameNOT	
foundAbsent	TokenNameIdentifier	 found Absent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
;	TokenNameSEMICOLON	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ABSENT	TokenNameIdentifier	 ABSENT
;	TokenNameSEMICOLON	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ABSENT	TokenNameIdentifier	 ABSENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
foundNS	TokenNameIdentifier	 found NS
&&	TokenNameAND_AND	
foundAbsent	TokenNameIdentifier	 found Absent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// !foundNS && !foundAbsent 	TokenNameCOMMENT_LINE	!foundNS && !foundAbsent 
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
;	TokenNameSEMICOLON	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// other[0] == ABSENT 	TokenNameCOMMENT_LINE	other[0] == ABSENT 
if	TokenNameif	
(	TokenNameLPAREN	
foundAbsent	TokenNameIdentifier	 found Absent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
NSCONSTRAINT_ANY	TokenNameIdentifier	 NSCONSTRAINT  ANY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// !foundAbsent 	TokenNameCOMMENT_LINE	!foundAbsent 
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
;	TokenNameSEMICOLON	
unionWildcard	TokenNameIdentifier	 union Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
unionWildcard	TokenNameIdentifier	 union Wildcard
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// performUnionWith 	TokenNameCOMMENT_LINE	performUnionWith 
/** * Schema Component Constraint: Attribute Wildcard Intersection */	TokenNameCOMMENT_JAVADOC	 Schema Component Constraint: Attribute Wildcard Intersection 
public	TokenNamepublic	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
performIntersectionWith	TokenNameIdentifier	 perform Intersection With
(	TokenNameLPAREN	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
wildcard	TokenNameIdentifier	 wildcard
,	TokenNameCOMMA	
short	TokenNameshort	
processContents	TokenNameIdentifier	 process Contents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if the other wildcard is not expressible, the result is still not expressible 	TokenNameCOMMENT_LINE	if the other wildcard is not expressible, the result is still not expressible 
if	TokenNameif	
(	TokenNameLPAREN	
wildcard	TokenNameIdentifier	 wildcard
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// For a wildcard's {namespace constraint} value to be the intensional intersection of 	TokenNameCOMMENT_LINE	For a wildcard's {namespace constraint} value to be the intensional intersection of 
// two other such values (call them O1 and O2): the appropriate case among the following 	TokenNameCOMMENT_LINE	two other such values (call them O1 and O2): the appropriate case among the following 
// must be true: 	TokenNameCOMMENT_LINE	must be true: 
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
intersectWildcard	TokenNameIdentifier	 intersect Wildcard
=	TokenNameEQUAL	
new	TokenNamenew	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intersectWildcard	TokenNameIdentifier	 intersect Wildcard
.	TokenNameDOT	
fProcessContents	TokenNameIdentifier	 f Process Contents
=	TokenNameEQUAL	
processContents	TokenNameIdentifier	 process Contents
;	TokenNameSEMICOLON	
// 1 If O1 and O2 are the same value, then that value must be the value. 	TokenNameCOMMENT_LINE	1 If O1 and O2 are the same value, then that value must be the value. 
if	TokenNameif	
(	TokenNameLPAREN	
areSame	TokenNameIdentifier	 are Same
(	TokenNameLPAREN	
wildcard	TokenNameIdentifier	 wildcard
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
intersectWildcard	TokenNameIdentifier	 intersect Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
intersectWildcard	TokenNameIdentifier	 intersect Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
=	TokenNameEQUAL	
fNamespaceList	TokenNameIdentifier	 f Namespace List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 2 If either O1 or O2 is any, then the other must be the value. 	TokenNameCOMMENT_LINE	2 If either O1 or O2 is any, then the other must be the value. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_ANY	TokenNameIdentifier	 NSCONSTRAINT  ANY
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_ANY	TokenNameIdentifier	 NSCONSTRAINT  ANY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// both cannot be ANY, if we have reached here. 	TokenNameCOMMENT_LINE	both cannot be ANY, if we have reached here. 
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_ANY	TokenNameIdentifier	 NSCONSTRAINT  ANY
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
wildcard	TokenNameIdentifier	 wildcard
;	TokenNameSEMICOLON	
intersectWildcard	TokenNameIdentifier	 intersect Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
intersectWildcard	TokenNameIdentifier	 intersect Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -3 If either O1 or O2 is a pair of not and a namespace name and the other is a set of 	TokenNameCOMMENT_LINE	-3 If either O1 or O2 is a pair of not and a namespace name and the other is a set of 
// (namespace names or absent), then that set, minus the negated namespace name if 	TokenNameCOMMENT_LINE	(namespace names or absent), then that set, minus the negated namespace name if 
// it was in the set, must be the value. 	TokenNameCOMMENT_LINE	it was in the set, must be the value. 
// +3 If either O1 or O2 is a pair of not and a namespace name and the other 	TokenNameCOMMENT_LINE	+3 If either O1 or O2 is a pair of not and a namespace name and the other 
// is a set of (namespace names or absent), then that set, minus the negated 	TokenNameCOMMENT_LINE	is a set of (namespace names or absent), then that set, minus the negated 
// namespace name if it was in the set, then minus absent if it was in the 	TokenNameCOMMENT_LINE	namespace name if it was in the set, then minus absent if it was in the 
// set, must be the value. 	TokenNameCOMMENT_LINE	set, must be the value. 
// * when we have not(list), the operation is just list-otherlist 	TokenNameCOMMENT_LINE	* when we have not(list), the operation is just list-otherlist 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_LIST	TokenNameIdentifier	 NSCONSTRAINT  LIST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_LIST	TokenNameIdentifier	 NSCONSTRAINT  LIST
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
fNamespaceList	TokenNameIdentifier	 f Namespace List
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
fNamespaceList	TokenNameIdentifier	 f Namespace List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
listSize	TokenNameIdentifier	 list Size
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
intersect	TokenNameIdentifier	 intersect
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
listSize	TokenNameIdentifier	 list Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
listSize	TokenNameIdentifier	 list Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&&	TokenNameAND_AND	
list	TokenNameIdentifier	 list
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
ABSENT	TokenNameIdentifier	 ABSENT
)	TokenNameRPAREN	
intersect	TokenNameIdentifier	 intersect
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
intersectWildcard	TokenNameIdentifier	 intersect Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
NSCONSTRAINT_LIST	TokenNameIdentifier	 NSCONSTRAINT  LIST
;	TokenNameSEMICOLON	
intersectWildcard	TokenNameIdentifier	 intersect Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
intersect	TokenNameIdentifier	 intersect
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
intersectWildcard	TokenNameIdentifier	 intersect Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 4 If both O1 and O2 are sets of (namespace names or absent), then the intersection of those 	TokenNameCOMMENT_LINE	4 If both O1 and O2 are sets of (namespace names or absent), then the intersection of those 
// sets must be the value. 	TokenNameCOMMENT_LINE	sets must be the value. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_LIST	TokenNameIdentifier	 NSCONSTRAINT  LIST
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_LIST	TokenNameIdentifier	 NSCONSTRAINT  LIST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
intersectWildcard	TokenNameIdentifier	 intersect Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
NSCONSTRAINT_LIST	TokenNameIdentifier	 NSCONSTRAINT  LIST
;	TokenNameSEMICOLON	
intersectWildcard	TokenNameIdentifier	 intersect Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
=	TokenNameEQUAL	
intersect2sets	TokenNameIdentifier	 intersect2sets
(	TokenNameLPAREN	
fNamespaceList	TokenNameIdentifier	 f Namespace List
,	TokenNameCOMMA	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -5 If the two are negations of different namespace names, then the intersection is not expressible. 	TokenNameCOMMENT_LINE	-5 If the two are negations of different namespace names, then the intersection is not expressible. 
// +5 If the two are negations of namespace names or absent, then The 	TokenNameCOMMENT_LINE	+5 If the two are negations of namespace names or absent, then The 
// appropriate case among the following must be true: 	TokenNameCOMMENT_LINE	appropriate case among the following must be true: 
// +5.1 If the two are negations of different namespace names, then the 	TokenNameCOMMENT_LINE	+5.1 If the two are negations of different namespace names, then the 
// intersection is not expressible. 	TokenNameCOMMENT_LINE	intersection is not expressible. 
// +5.2 If one of the two is a pair of not and absent, the other must be 	TokenNameCOMMENT_LINE	+5.2 If one of the two is a pair of not and absent, the other must be 
// the value. 	TokenNameCOMMENT_LINE	the value. 
// * when we have not(list), the operation is just not(onelist+otherlist) 	TokenNameCOMMENT_LINE	* when we have not(list), the operation is just not(onelist+otherlist) 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
&&	TokenNameAND_AND	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
ABSENT	TokenNameIdentifier	 ABSENT
&&	TokenNameAND_AND	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
ABSENT	TokenNameIdentifier	 ABSENT
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
ABSENT	TokenNameIdentifier	 ABSENT
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
wildcard	TokenNameIdentifier	 wildcard
;	TokenNameSEMICOLON	
intersectWildcard	TokenNameIdentifier	 intersect Wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
intersectWildcard	TokenNameIdentifier	 intersect Wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
intersectWildcard	TokenNameIdentifier	 intersect Wildcard
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// performIntersectionWith 	TokenNameCOMMENT_LINE	performIntersectionWith 
private	TokenNameprivate	
boolean	TokenNameboolean	
areSame	TokenNameIdentifier	 are Same
(	TokenNameLPAREN	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
wildcard	TokenNameIdentifier	 wildcard
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ##any, true 	TokenNameCOMMENT_LINE	##any, true 
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_ANY	TokenNameIdentifier	 NSCONSTRAINT  ANY
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// ##other, only check the negated value 	TokenNameCOMMENT_LINE	##other, only check the negated value 
// * when we support not(list), we need to check in the same way 	TokenNameCOMMENT_LINE	* when we support not(list), we need to check in the same way 
// as for NSCONSTRAINT_LIST. 	TokenNameCOMMENT_LINE	as for NSCONSTRAINT_LIST. 
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
)	TokenNameRPAREN	
return	TokenNamereturn	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// ## list, must have the same length, 	TokenNameCOMMENT_LINE	## list, must have the same length, 
// and each item in one list must appear in the other one 	TokenNameCOMMENT_LINE	and each item in one list must appear in the other one 
// (we are assuming that there are no duplicate items in a list) 	TokenNameCOMMENT_LINE	(we are assuming that there are no duplicate items in a list) 
if	TokenNameif	
(	TokenNameLPAREN	
fNamespaceList	TokenNameIdentifier	 f Namespace List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
fNamespaceList	TokenNameIdentifier	 f Namespace List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
elementInSet	TokenNameIdentifier	 element In Set
(	TokenNameLPAREN	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
wildcard	TokenNameIdentifier	 wildcard
.	TokenNameDOT	
fNamespaceList	TokenNameIdentifier	 f Namespace List
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// areSame 	TokenNameCOMMENT_LINE	areSame 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
intersect2sets	TokenNameIdentifier	 intersect2sets
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
one	TokenNameIdentifier	 one
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
theOther	TokenNameIdentifier	 the Other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
theOther	TokenNameIdentifier	 the Other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// simple implemention, 	TokenNameCOMMENT_LINE	simple implemention, 
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
one	TokenNameIdentifier	 one
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
elementInSet	TokenNameIdentifier	 element In Set
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
theOther	TokenNameIdentifier	 the Other
)	TokenNameRPAREN	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
one	TokenNameIdentifier	 one
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result2	TokenNameIdentifier	 result2
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result2	TokenNameIdentifier	 result2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result2	TokenNameIdentifier	 result2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
union2sets	TokenNameIdentifier	 union2sets
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
one	TokenNameIdentifier	 one
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
theOther	TokenNameIdentifier	 the Other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result1	TokenNameIdentifier	 result1
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// simple implemention, 	TokenNameCOMMENT_LINE	simple implemention, 
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
one	TokenNameIdentifier	 one
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
elementInSet	TokenNameIdentifier	 element In Set
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
theOther	TokenNameIdentifier	 the Other
)	TokenNameRPAREN	
)	TokenNameRPAREN	
result1	TokenNameIdentifier	 result1
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
one	TokenNameIdentifier	 one
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result2	TokenNameIdentifier	 result2
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
theOther	TokenNameIdentifier	 the Other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
result1	TokenNameIdentifier	 result1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result2	TokenNameIdentifier	 result2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
theOther	TokenNameIdentifier	 the Other
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result2	TokenNameIdentifier	 result2
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
theOther	TokenNameIdentifier	 the Other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result2	TokenNameIdentifier	 result2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
subset2sets	TokenNameIdentifier	 subset2sets
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subSet	TokenNameIdentifier	 sub Set
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
superSet	TokenNameIdentifier	 super Set
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
subSet	TokenNameIdentifier	 sub Set
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
elementInSet	TokenNameIdentifier	 element In Set
(	TokenNameLPAREN	
subSet	TokenNameIdentifier	 sub Set
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
superSet	TokenNameIdentifier	 super Set
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
elementInSet	TokenNameIdentifier	 element In Set
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ele	TokenNameIdentifier	 ele
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
false	TokenNamefalse	
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
set	TokenNameIdentifier	 set
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
!	TokenNameNOT	
found	TokenNameIdentifier	 found
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ele	TokenNameIdentifier	 ele
==	TokenNameEQUAL_EQUAL	
set	TokenNameIdentifier	 set
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
found	TokenNameIdentifier	 found
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the string description of this wildcard */	TokenNameCOMMENT_JAVADOC	 get the string description of this wildcard 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fDescription	TokenNameIdentifier	 f Description
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDescription	TokenNameIdentifier	 f Description
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"WC["	TokenNameStringLiteral	WC[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
NSCONSTRAINT_ANY	TokenNameIdentifier	 NSCONSTRAINT  ANY
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ATTVAL_TWOPOUNDANY	TokenNameIdentifier	 ATTVAL  TWOPOUNDANY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ATTVAL_TWOPOUNDOTHER	TokenNameIdentifier	 ATTVAL  TWOPOUNDOTHER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":""	TokenNameStringLiteral	:"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
NSCONSTRAINT_LIST	TokenNameIdentifier	 NSCONSTRAINT  LIST
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespaceList	TokenNameIdentifier	 f Namespace List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fNamespaceList	TokenNameIdentifier	 f Namespace List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
",""	TokenNameStringLiteral	,"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fNamespaceList	TokenNameIdentifier	 f Namespace List
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDescription	TokenNameIdentifier	 f Description
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fDescription	TokenNameIdentifier	 f Description
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
WILDCARD	TokenNameIdentifier	 WILDCARD
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
null	TokenNamenull	
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
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Namespace constraint: A constraint type: any, not, list. */	TokenNameCOMMENT_JAVADOC	 Namespace constraint: A constraint type: any, not, list. 
public	TokenNamepublic	
short	TokenNameshort	
getConstraintType	TokenNameIdentifier	 get Constraint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Namespace constraint. For <code>constraintType</code> * LIST_NSCONSTRAINT, the list contains allowed namespaces. For * <code>constraintType</code> NOT_NSCONSTRAINT, the list contains * disallowed namespaces. */	TokenNameCOMMENT_JAVADOC	 Namespace constraint. For <code>constraintType</code> LIST_NSCONSTRAINT, the list contains allowed namespaces. For <code>constraintType</code> NOT_NSCONSTRAINT, the list contains disallowed namespaces. 
public	TokenNamepublic	
StringList	TokenNameIdentifier	 String List
getNsConstraintList	TokenNameIdentifier	 get Ns Constraint List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StringListImpl	TokenNameIdentifier	 String List Impl
(	TokenNameLPAREN	
fNamespaceList	TokenNameIdentifier	 f Namespace List
,	TokenNameCOMMA	
fNamespaceList	TokenNameIdentifier	 f Namespace List
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
fNamespaceList	TokenNameIdentifier	 f Namespace List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {process contents} One of skip, lax or strict. Valid constants values * are: PC_SKIP, PC_LAX, PC_STRICT. */	TokenNameCOMMENT_JAVADOC	 {process contents} One of skip, lax or strict. Valid constants values are: PC_SKIP, PC_LAX, PC_STRICT. 
public	TokenNamepublic	
short	TokenNameshort	
getProcessContents	TokenNameIdentifier	 get Process Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fProcessContents	TokenNameIdentifier	 f Process Contents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * String valid of {process contents}. One of "skip", "lax" or "strict". */	TokenNameCOMMENT_JAVADOC	 String valid of {process contents}. One of "skip", "lax" or "strict". 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getProcessContentsAsString	TokenNameIdentifier	 get Process Contents As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
fProcessContents	TokenNameIdentifier	 f Process Contents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
.	TokenNameDOT	
PC_SKIP	TokenNameIdentifier	 PC  SKIP
:	TokenNameCOLON	
return	TokenNamereturn	
"skip"	TokenNameStringLiteral	skip
;	TokenNameSEMICOLON	
case	TokenNamecase	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
.	TokenNameDOT	
PC_LAX	TokenNameIdentifier	 PC  LAX
:	TokenNameCOLON	
return	TokenNamereturn	
"lax"	TokenNameStringLiteral	lax
;	TokenNameSEMICOLON	
case	TokenNamecase	
XSWildcardDecl	TokenNameIdentifier	 XS Wildcard Decl
.	TokenNameDOT	
PC_STRICT	TokenNameIdentifier	 PC  STRICT
:	TokenNameCOLON	
return	TokenNamereturn	
"strict"	TokenNameStringLiteral	strict
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
"invalid value"	TokenNameStringLiteral	invalid value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XSWildcardDecl 	TokenNameCOMMENT_LINE	class XSWildcardDecl 
