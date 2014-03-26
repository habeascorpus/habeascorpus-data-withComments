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
models	TokenNameIdentifier	 models
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
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
models	TokenNameIdentifier	 models
.	TokenNameDOT	
CMNode	TokenNameIdentifier	 CM Node
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
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
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
XSDeclarationPool	TokenNameIdentifier	 XS Declaration Pool
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
XSElementDecl	TokenNameIdentifier	 XS Element Decl
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
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
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
/** * This class constructs content models for a given grammar. * * @xerces.internal * * @author Elena Litani, IBM * @author Sandy Gao, IBM * * @version $Id: CMBuilder.java 573322 2007-09-06 16:48:47Z peterjm $ */	TokenNameCOMMENT_JAVADOC	 This class constructs content models for a given grammar. * @xerces.internal * @author Elena Litani, IBM @author Sandy Gao, IBM * @version $Id: CMBuilder.java 573322 2007-09-06 16:48:47Z peterjm $ 
public	TokenNamepublic	
class	TokenNameclass	
CMBuilder	TokenNameIdentifier	 CM Builder
{	TokenNameLBRACE	
// REVISIT: should update the decl pool to cache XSCM objects too 	TokenNameCOMMENT_LINE	REVISIT: should update the decl pool to cache XSCM objects too 
private	TokenNameprivate	
XSDeclarationPool	TokenNameIdentifier	 XS Declaration Pool
fDeclPool	TokenNameIdentifier	 f Decl Pool
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// It never changes, so a static member is good enough 	TokenNameCOMMENT_LINE	It never changes, so a static member is good enough 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
XSEmptyCM	TokenNameIdentifier	 XS Empty CM
fEmptyCM	TokenNameIdentifier	 f Empty CM
=	TokenNameEQUAL	
new	TokenNamenew	
XSEmptyCM	TokenNameIdentifier	 XS Empty CM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// needed for DFA construction 	TokenNameCOMMENT_LINE	needed for DFA construction 
private	TokenNameprivate	
int	TokenNameint	
fLeafCount	TokenNameIdentifier	 f Leaf Count
;	TokenNameSEMICOLON	
// needed for UPA 	TokenNameCOMMENT_LINE	needed for UPA 
private	TokenNameprivate	
int	TokenNameint	
fParticleCount	TokenNameIdentifier	 f Particle Count
;	TokenNameSEMICOLON	
//Factory to create Bin, Uni, Leaf nodes 	TokenNameCOMMENT_LINE	Factory to create Bin, Uni, Leaf nodes 
private	TokenNameprivate	
final	TokenNamefinal	
CMNodeFactory	TokenNameIdentifier	 CM Node Factory
fNodeFactory	TokenNameIdentifier	 f Node Factory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CMBuilder	TokenNameIdentifier	 CM Builder
(	TokenNameLPAREN	
CMNodeFactory	TokenNameIdentifier	 CM Node Factory
nodeFactory	TokenNameIdentifier	 node Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDeclPool	TokenNameIdentifier	 f Decl Pool
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fNodeFactory	TokenNameIdentifier	 f Node Factory
=	TokenNameEQUAL	
nodeFactory	TokenNameIdentifier	 node Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDeclPool	TokenNameIdentifier	 set Decl Pool
(	TokenNameLPAREN	
XSDeclarationPool	TokenNameIdentifier	 XS Declaration Pool
declPool	TokenNameIdentifier	 decl Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDeclPool	TokenNameIdentifier	 f Decl Pool
=	TokenNameEQUAL	
declPool	TokenNameIdentifier	 decl Pool
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get content model for the a given type * * @param typeDecl get content model for which complex type * @return a content model validator */	TokenNameCOMMENT_JAVADOC	 Get content model for the a given type * @param typeDecl get content model for which complex type @return a content model validator 
public	TokenNamepublic	
XSCMValidator	TokenNameIdentifier	 XSCM Validator
getContentModel	TokenNameIdentifier	 get Content Model
(	TokenNameLPAREN	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
typeDecl	TokenNameIdentifier	 type Decl
,	TokenNameCOMMA	
boolean	TokenNameboolean	
forUPA	TokenNameIdentifier	 for UPA
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for complex type with empty or simple content, 	TokenNameCOMMENT_LINE	for complex type with empty or simple content, 
// there is no content model validator 	TokenNameCOMMENT_LINE	there is no content model validator 
short	TokenNameshort	
contentType	TokenNameIdentifier	 content Type
=	TokenNameEQUAL	
typeDecl	TokenNameIdentifier	 type Decl
.	TokenNameDOT	
getContentType	TokenNameIdentifier	 get Content Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
==	TokenNameEQUAL_EQUAL	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
.	TokenNameDOT	
CONTENTTYPE_SIMPLE	TokenNameIdentifier	 CONTENTTYPE  SIMPLE
||	TokenNameOR_OR	
contentType	TokenNameIdentifier	 content Type
==	TokenNameEQUAL_EQUAL	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
.	TokenNameDOT	
CONTENTTYPE_EMPTY	TokenNameIdentifier	 CONTENTTYPE  EMPTY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
particle	TokenNameIdentifier	 particle
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
)	TokenNameRPAREN	
typeDecl	TokenNameIdentifier	 type Decl
.	TokenNameDOT	
getParticle	TokenNameIdentifier	 get Particle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if the content is element only or mixed, but no particle 	TokenNameCOMMENT_LINE	if the content is element only or mixed, but no particle 
// is defined, return the empty content model 	TokenNameCOMMENT_LINE	is defined, return the empty content model 
if	TokenNameif	
(	TokenNameLPAREN	
particle	TokenNameIdentifier	 particle
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
fEmptyCM	TokenNameIdentifier	 f Empty CM
;	TokenNameSEMICOLON	
// if the content model contains "all" model group, 	TokenNameCOMMENT_LINE	if the content model contains "all" model group, 
// we create an "all" content model, otherwise a DFA content model 	TokenNameCOMMENT_LINE	we create an "all" content model, otherwise a DFA content model 
XSCMValidator	TokenNameIdentifier	 XSCM Validator
cmValidator	TokenNameIdentifier	 cm Validator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_MODELGROUP	TokenNameIdentifier	 PARTICLE  MODELGROUP
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
)	TokenNameRPAREN	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fValue	TokenNameIdentifier	 f Value
)	TokenNameRPAREN	
.	TokenNameDOT	
fCompositor	TokenNameIdentifier	 f Compositor
==	TokenNameEQUAL_EQUAL	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
.	TokenNameDOT	
MODELGROUP_ALL	TokenNameIdentifier	 MODELGROUP  ALL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmValidator	TokenNameIdentifier	 cm Validator
=	TokenNameEQUAL	
createAllCM	TokenNameIdentifier	 create All CM
(	TokenNameLPAREN	
particle	TokenNameIdentifier	 particle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cmValidator	TokenNameIdentifier	 cm Validator
=	TokenNameEQUAL	
createDFACM	TokenNameIdentifier	 create DFACM
(	TokenNameLPAREN	
particle	TokenNameIdentifier	 particle
,	TokenNameCOMMA	
forUPA	TokenNameIdentifier	 for UPA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//now we are throught building content model and have passed sucessfully of the nodecount check 	TokenNameCOMMENT_LINE	now we are throught building content model and have passed sucessfully of the nodecount check 
//if set by the application 	TokenNameCOMMENT_LINE	if set by the application 
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
resetNodeCount	TokenNameIdentifier	 reset Node Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if the validator returned is null, it means there is nothing in 	TokenNameCOMMENT_LINE	if the validator returned is null, it means there is nothing in 
// the content model, so we return the empty content model. 	TokenNameCOMMENT_LINE	the content model, so we return the empty content model. 
if	TokenNameif	
(	TokenNameLPAREN	
cmValidator	TokenNameIdentifier	 cm Validator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
cmValidator	TokenNameIdentifier	 cm Validator
=	TokenNameEQUAL	
fEmptyCM	TokenNameIdentifier	 f Empty CM
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cmValidator	TokenNameIdentifier	 cm Validator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XSCMValidator	TokenNameIdentifier	 XSCM Validator
createAllCM	TokenNameIdentifier	 create All CM
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
particle	TokenNameIdentifier	 particle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// get the model group, and add all children of it to the content model 	TokenNameCOMMENT_LINE	get the model group, and add all children of it to the content model 
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
)	TokenNameRPAREN	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fValue	TokenNameIdentifier	 f Value
;	TokenNameSEMICOLON	
// create an all content model. the parameter indicates whether 	TokenNameCOMMENT_LINE	create an all content model. the parameter indicates whether 
// the <all> itself is optional 	TokenNameCOMMENT_LINE	the <all> itself is optional 
XSAllCM	TokenNameIdentifier	 XS All CM
allContent	TokenNameIdentifier	 all Content
=	TokenNameEQUAL	
new	TokenNamenew	
XSAllCM	TokenNameIdentifier	 XS All CM
(	TokenNameLPAREN	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticleCount	TokenNameIdentifier	 f Particle Count
)	TokenNameRPAREN	
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
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticleCount	TokenNameIdentifier	 f Particle Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// add the element decl to the all content model 	TokenNameCOMMENT_LINE	add the element decl to the all content model 
allContent	TokenNameIdentifier	 all Content
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
)	TokenNameRPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticles	TokenNameIdentifier	 f Particles
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
fValue	TokenNameIdentifier	 f Value
,	TokenNameCOMMA	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticles	TokenNameIdentifier	 f Particles
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
allContent	TokenNameIdentifier	 all Content
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XSCMValidator	TokenNameIdentifier	 XSCM Validator
createDFACM	TokenNameIdentifier	 create DFACM
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
particle	TokenNameIdentifier	 particle
,	TokenNameCOMMA	
boolean	TokenNameboolean	
forUPA	TokenNameIdentifier	 for UPA
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fLeafCount	TokenNameIdentifier	 f Leaf Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fParticleCount	TokenNameIdentifier	 f Particle Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// convert particle tree to CM tree 	TokenNameCOMMENT_LINE	convert particle tree to CM tree 
CMNode	TokenNameIdentifier	 CM Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
useRepeatingLeafNodes	TokenNameIdentifier	 use Repeating Leaf Nodes
(	TokenNameLPAREN	
particle	TokenNameIdentifier	 particle
)	TokenNameRPAREN	
?	TokenNameQUESTION	
buildCompactSyntaxTree	TokenNameIdentifier	 build Compact Syntax Tree
(	TokenNameLPAREN	
particle	TokenNameIdentifier	 particle
)	TokenNameRPAREN	
:	TokenNameCOLON	
buildSyntaxTree	TokenNameIdentifier	 build Syntax Tree
(	TokenNameLPAREN	
particle	TokenNameIdentifier	 particle
,	TokenNameCOMMA	
forUPA	TokenNameIdentifier	 for UPA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// build DFA content model from the CM tree 	TokenNameCOMMENT_LINE	build DFA content model from the CM tree 
return	TokenNamereturn	
new	TokenNamenew	
XSDFACM	TokenNameIdentifier	 XSDFACM
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
fLeafCount	TokenNameIdentifier	 f Leaf Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 1. convert particle tree to CM tree: 	TokenNameCOMMENT_LINE	1. convert particle tree to CM tree: 
// 2. expand all occurrence values: a{n, unbounded} -> a, a, ..., a+ 	TokenNameCOMMENT_LINE	2. expand all occurrence values: a{n, unbounded} -> a, a, ..., a+ 
// a{n, m} -> a, a, ..., a?, a?, ... 	TokenNameCOMMENT_LINE	a{n, m} -> a, a, ..., a?, a?, ... 
// 3. convert model groups (a, b, c, ...) or (a | b | c | ...) to 	TokenNameCOMMENT_LINE	3. convert model groups (a, b, c, ...) or (a | b | c | ...) to 
// binary tree: (((a,b),c),...) or (((a|b)|c)|...) 	TokenNameCOMMENT_LINE	binary tree: (((a,b),c),...) or (((a|b)|c)|...) 
// 4. make sure each leaf node (XSCMLeaf) has a distinct position 	TokenNameCOMMENT_LINE	4. make sure each leaf node (XSCMLeaf) has a distinct position 
private	TokenNameprivate	
CMNode	TokenNameIdentifier	 CM Node
buildSyntaxTree	TokenNameIdentifier	 build Syntax Tree
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
particle	TokenNameIdentifier	 particle
,	TokenNameCOMMA	
boolean	TokenNameboolean	
forUPA	TokenNameIdentifier	 for UPA
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
maxOccurs	TokenNameIdentifier	 max Occurs
=	TokenNameEQUAL	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
;	TokenNameSEMICOLON	
int	TokenNameint	
minOccurs	TokenNameIdentifier	 min Occurs
=	TokenNameEQUAL	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
compactedForUPA	TokenNameIdentifier	 compacted For UPA
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
forUPA	TokenNameIdentifier	 for UPA
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// When doing UPA, we reduce the size of the minOccurs/maxOccurs values to make 	TokenNameCOMMENT_LINE	When doing UPA, we reduce the size of the minOccurs/maxOccurs values to make 
// processing the DFA faster. For UPA the exact values don't matter. 	TokenNameCOMMENT_LINE	processing the DFA faster. For UPA the exact values don't matter. 
if	TokenNameif	
(	TokenNameLPAREN	
minOccurs	TokenNameIdentifier	 min Occurs
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxOccurs	TokenNameIdentifier	 max Occurs
>	TokenNameGREATER	
minOccurs	TokenNameIdentifier	 min Occurs
||	TokenNameOR_OR	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
getMaxOccursUnbounded	TokenNameIdentifier	 get Max Occurs Unbounded
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minOccurs	TokenNameIdentifier	 min Occurs
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
compactedForUPA	TokenNameIdentifier	 compacted For UPA
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// maxOccurs == minOccurs 	TokenNameCOMMENT_LINE	maxOccurs == minOccurs 
minOccurs	TokenNameIdentifier	 min Occurs
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
compactedForUPA	TokenNameIdentifier	 compacted For UPA
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxOccurs	TokenNameIdentifier	 max Occurs
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxOccurs	TokenNameIdentifier	 max Occurs
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
compactedForUPA	TokenNameIdentifier	 compacted For UPA
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
CMNode	TokenNameIdentifier	 CM Node
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_WILDCARD	TokenNameIdentifier	 PARTICLE  WILDCARD
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ELEMENT	TokenNameIdentifier	 PARTICLE  ELEMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// (task 1) element and wildcard particles should be converted to 	TokenNameCOMMENT_LINE	(task 1) element and wildcard particles should be converted to 
// leaf nodes 	TokenNameCOMMENT_LINE	leaf nodes 
// REVISIT: Make a clone of the leaf particle, so that if there 	TokenNameCOMMENT_LINE	REVISIT: Make a clone of the leaf particle, so that if there 
// are two references to the same group, we have two different 	TokenNameCOMMENT_LINE	are two references to the same group, we have two different 
// leaf particles for the same element or wildcard decl. 	TokenNameCOMMENT_LINE	leaf particles for the same element or wildcard decl. 
// This is useful for checking UPA. 	TokenNameCOMMENT_LINE	This is useful for checking UPA. 
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMLeafNode	TokenNameIdentifier	 get CM Leaf Node
(	TokenNameLPAREN	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
,	TokenNameCOMMA	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fValue	TokenNameIdentifier	 f Value
,	TokenNameCOMMA	
fParticleCount	TokenNameIdentifier	 f Particle Count
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
fLeafCount	TokenNameIdentifier	 f Leaf Count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// (task 2) expand occurrence values 	TokenNameCOMMENT_LINE	(task 2) expand occurrence values 
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
expandContentModel	TokenNameIdentifier	 expand Content Model
(	TokenNameLPAREN	
nodeRet	TokenNameIdentifier	 node Ret
,	TokenNameCOMMA	
minOccurs	TokenNameIdentifier	 min Occurs
,	TokenNameCOMMA	
maxOccurs	TokenNameIdentifier	 max Occurs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeRet	TokenNameIdentifier	 node Ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeRet	TokenNameIdentifier	 node Ret
.	TokenNameDOT	
setIsCompactUPAModel	TokenNameIdentifier	 set Is Compact UPA Model
(	TokenNameLPAREN	
compactedForUPA	TokenNameIdentifier	 compacted For UPA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_MODELGROUP	TokenNameIdentifier	 PARTICLE  MODELGROUP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// (task 1,3) convert model groups to binary trees 	TokenNameCOMMENT_LINE	(task 1,3) convert model groups to binary trees 
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
)	TokenNameRPAREN	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fValue	TokenNameIdentifier	 f Value
;	TokenNameSEMICOLON	
CMNode	TokenNameIdentifier	 CM Node
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// when the model group is a choice of more than one particles, but 	TokenNameCOMMENT_LINE	when the model group is a choice of more than one particles, but 
// only one of the particle is not empty, (for example 	TokenNameCOMMENT_LINE	only one of the particle is not empty, (for example 
// <choice> 	TokenNameCOMMENT_LINE	<choice> 
// <sequence/> 	TokenNameCOMMENT_LINE	<sequence/> 
// <element name="e"/> 	TokenNameCOMMENT_LINE	<element name="e"/> 
// </choice> 	TokenNameCOMMENT_LINE	</choice> 
// ) we can't not return that one particle ("e"). instead, we should 	TokenNameCOMMENT_LINE	) we can't not return that one particle ("e"). instead, we should 
// treat such particle as optional ("e?"). 	TokenNameCOMMENT_LINE	treat such particle as optional ("e?"). 
// the following int variable keeps track of the number of non-empty children 	TokenNameCOMMENT_LINE	the following int variable keeps track of the number of non-empty children 
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
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticleCount	TokenNameIdentifier	 f Particle Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first convert each child to a CM tree 	TokenNameCOMMENT_LINE	first convert each child to a CM tree 
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
buildSyntaxTree	TokenNameIdentifier	 build Syntax Tree
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticles	TokenNameIdentifier	 f Particles
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
forUPA	TokenNameIdentifier	 for UPA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// then combine them using binary operation 	TokenNameCOMMENT_LINE	then combine them using binary operation 
if	TokenNameif	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
compactedForUPA	TokenNameIdentifier	 compacted For UPA
|=	TokenNameOR_EQUAL	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
isCompactedForUPA	TokenNameIdentifier	 is Compacted For UPA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeRet	TokenNameIdentifier	 node Ret
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMBinOpNode	TokenNameIdentifier	 get CM Bin Op Node
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fCompositor	TokenNameIdentifier	 f Compositor
,	TokenNameCOMMA	
nodeRet	TokenNameIdentifier	 node Ret
,	TokenNameCOMMA	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// (task 2) expand occurrence values 	TokenNameCOMMENT_LINE	(task 2) expand occurrence values 
if	TokenNameif	
(	TokenNameLPAREN	
nodeRet	TokenNameIdentifier	 node Ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// when the group is "choice" and the group has one or more empty children, 	TokenNameCOMMENT_LINE	when the group is "choice" and the group has one or more empty children, 
// we need to create a zero-or-one (optional) node for the non-empty particles. 	TokenNameCOMMENT_LINE	we need to create a zero-or-one (optional) node for the non-empty particles. 
if	TokenNameif	
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fCompositor	TokenNameIdentifier	 f Compositor
==	TokenNameEQUAL_EQUAL	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
.	TokenNameDOT	
MODELGROUP_CHOICE	TokenNameIdentifier	 MODELGROUP  CHOICE
&&	TokenNameAND_AND	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticleCount	TokenNameIdentifier	 f Particle Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMUniOpNode	TokenNameIdentifier	 get CM Uni Op Node
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ZERO_OR_ONE	TokenNameIdentifier	 PARTICLE  ZERO  OR  ONE
,	TokenNameCOMMA	
nodeRet	TokenNameIdentifier	 node Ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
expandContentModel	TokenNameIdentifier	 expand Content Model
(	TokenNameLPAREN	
nodeRet	TokenNameIdentifier	 node Ret
,	TokenNameCOMMA	
minOccurs	TokenNameIdentifier	 min Occurs
,	TokenNameCOMMA	
maxOccurs	TokenNameIdentifier	 max Occurs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeRet	TokenNameIdentifier	 node Ret
.	TokenNameDOT	
setIsCompactUPAModel	TokenNameIdentifier	 set Is Compact UPA Model
(	TokenNameLPAREN	
compactedForUPA	TokenNameIdentifier	 compacted For UPA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
nodeRet	TokenNameIdentifier	 node Ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 2. expand all occurrence values: a{n, unbounded} -> a, a, ..., a+ 	TokenNameCOMMENT_LINE	2. expand all occurrence values: a{n, unbounded} -> a, a, ..., a+ 
// a{n, m} -> a, a, ..., a?, a?, ... 	TokenNameCOMMENT_LINE	a{n, m} -> a, a, ..., a?, a?, ... 
// 4. make sure each leaf node (XSCMLeaf) has a distinct position 	TokenNameCOMMENT_LINE	4. make sure each leaf node (XSCMLeaf) has a distinct position 
private	TokenNameprivate	
CMNode	TokenNameIdentifier	 CM Node
expandContentModel	TokenNameIdentifier	 expand Content Model
(	TokenNameLPAREN	
CMNode	TokenNameIdentifier	 CM Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
minOccurs	TokenNameIdentifier	 min Occurs
,	TokenNameCOMMA	
int	TokenNameint	
maxOccurs	TokenNameIdentifier	 max Occurs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CMNode	TokenNameIdentifier	 CM Node
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minOccurs	TokenNameIdentifier	 min Occurs
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
maxOccurs	TokenNameIdentifier	 max Occurs
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
minOccurs	TokenNameIdentifier	 min Occurs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
maxOccurs	TokenNameIdentifier	 max Occurs
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//zero or one 	TokenNameCOMMENT_LINE	zero or one 
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMUniOpNode	TokenNameIdentifier	 get CM Uni Op Node
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ZERO_OR_ONE	TokenNameIdentifier	 PARTICLE  ZERO  OR  ONE
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
minOccurs	TokenNameIdentifier	 min Occurs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
maxOccurs	TokenNameIdentifier	 max Occurs
==	TokenNameEQUAL_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
OCCURRENCE_UNBOUNDED	TokenNameIdentifier	 OCCURRENCE  UNBOUNDED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//zero or more 	TokenNameCOMMENT_LINE	zero or more 
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMUniOpNode	TokenNameIdentifier	 get CM Uni Op Node
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ZERO_OR_MORE	TokenNameIdentifier	 PARTICLE  ZERO  OR  MORE
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
minOccurs	TokenNameIdentifier	 min Occurs
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
maxOccurs	TokenNameIdentifier	 max Occurs
==	TokenNameEQUAL_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
OCCURRENCE_UNBOUNDED	TokenNameIdentifier	 OCCURRENCE  UNBOUNDED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//one or more 	TokenNameCOMMENT_LINE	one or more 
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMUniOpNode	TokenNameIdentifier	 get CM Uni Op Node
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ONE_OR_MORE	TokenNameIdentifier	 PARTICLE  ONE  OR  MORE
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
maxOccurs	TokenNameIdentifier	 max Occurs
==	TokenNameEQUAL_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
OCCURRENCE_UNBOUNDED	TokenNameIdentifier	 OCCURRENCE  UNBOUNDED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// => a,a,..,a+ 	TokenNameCOMMENT_LINE	=> a,a,..,a+ 
// create a+ node first, then put minOccurs-1 a's in front of it 	TokenNameCOMMENT_LINE	create a+ node first, then put minOccurs-1 a's in front of it 
// for the first time "node" is used, we don't need to make a copy 	TokenNameCOMMENT_LINE	for the first time "node" is used, we don't need to make a copy 
// and for other references to node, we make copies 	TokenNameCOMMENT_LINE	and for other references to node, we make copies 
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMUniOpNode	TokenNameIdentifier	 get CM Uni Op Node
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ONE_OR_MORE	TokenNameIdentifier	 PARTICLE  ONE  OR  MORE
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// (task 4) we need to call copyNode here, so that we append 	TokenNameCOMMENT_LINE	(task 4) we need to call copyNode here, so that we append 
// an entire new copy of the node (a subtree). this is to ensure 	TokenNameCOMMENT_LINE	an entire new copy of the node (a subtree). this is to ensure 
// all leaf nodes have distinct position 	TokenNameCOMMENT_LINE	all leaf nodes have distinct position 
// we know that minOccurs > 1 	TokenNameCOMMENT_LINE	we know that minOccurs > 1 
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMBinOpNode	TokenNameIdentifier	 get CM Bin Op Node
(	TokenNameLPAREN	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
.	TokenNameDOT	
MODELGROUP_SEQUENCE	TokenNameIdentifier	 MODELGROUP  SEQUENCE
,	TokenNameCOMMA	
multiNodes	TokenNameIdentifier	 multi Nodes
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
minOccurs	TokenNameIdentifier	 min Occurs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
nodeRet	TokenNameIdentifier	 node Ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// {n,m} => a,a,a,...(a),(a),... 	TokenNameCOMMENT_LINE	{n,m} => a,a,a,...(a),(a),... 
// first n a's, then m-n a?'s. 	TokenNameCOMMENT_LINE	first n a's, then m-n a?'s. 
// copyNode is called, for the same reason as above 	TokenNameCOMMENT_LINE	copyNode is called, for the same reason as above 
if	TokenNameif	
(	TokenNameLPAREN	
minOccurs	TokenNameIdentifier	 min Occurs
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
multiNodes	TokenNameIdentifier	 multi Nodes
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
minOccurs	TokenNameIdentifier	 min Occurs
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxOccurs	TokenNameIdentifier	 max Occurs
>	TokenNameGREATER	
minOccurs	TokenNameIdentifier	 min Occurs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMUniOpNode	TokenNameIdentifier	 get CM Uni Op Node
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ZERO_OR_ONE	TokenNameIdentifier	 PARTICLE  ZERO  OR  ONE
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeRet	TokenNameIdentifier	 node Ret
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
multiNodes	TokenNameIdentifier	 multi Nodes
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
maxOccurs	TokenNameIdentifier	 max Occurs
-	TokenNameMINUS	
minOccurs	TokenNameIdentifier	 min Occurs
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMBinOpNode	TokenNameIdentifier	 get CM Bin Op Node
(	TokenNameLPAREN	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
.	TokenNameDOT	
MODELGROUP_SEQUENCE	TokenNameIdentifier	 MODELGROUP  SEQUENCE
,	TokenNameCOMMA	
nodeRet	TokenNameIdentifier	 node Ret
,	TokenNameCOMMA	
multiNodes	TokenNameIdentifier	 multi Nodes
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
maxOccurs	TokenNameIdentifier	 max Occurs
-	TokenNameMINUS	
minOccurs	TokenNameIdentifier	 min Occurs
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
nodeRet	TokenNameIdentifier	 node Ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
CMNode	TokenNameIdentifier	 CM Node
multiNodes	TokenNameIdentifier	 multi Nodes
(	TokenNameLPAREN	
CMNode	TokenNameIdentifier	 CM Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
num	TokenNameIdentifier	 num
,	TokenNameCOMMA	
boolean	TokenNameboolean	
copyFirst	TokenNameIdentifier	 copy First
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
copyFirst	TokenNameIdentifier	 copy First
?	TokenNameQUESTION	
copyNode	TokenNameIdentifier	 copy Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
:	TokenNameCOLON	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
num1	TokenNameIdentifier	 num1
=	TokenNameEQUAL	
num	TokenNameIdentifier	 num
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMBinOpNode	TokenNameIdentifier	 get CM Bin Op Node
(	TokenNameLPAREN	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
.	TokenNameDOT	
MODELGROUP_SEQUENCE	TokenNameIdentifier	 MODELGROUP  SEQUENCE
,	TokenNameCOMMA	
multiNodes	TokenNameIdentifier	 multi Nodes
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
num1	TokenNameIdentifier	 num1
,	TokenNameCOMMA	
copyFirst	TokenNameIdentifier	 copy First
)	TokenNameRPAREN	
,	TokenNameCOMMA	
multiNodes	TokenNameIdentifier	 multi Nodes
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
num	TokenNameIdentifier	 num
-	TokenNameMINUS	
num1	TokenNameIdentifier	 num1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 4. make sure each leaf node (XSCMLeaf) has a distinct position 	TokenNameCOMMENT_LINE	4. make sure each leaf node (XSCMLeaf) has a distinct position 
private	TokenNameprivate	
CMNode	TokenNameIdentifier	 CM Node
copyNode	TokenNameIdentifier	 copy Node
(	TokenNameLPAREN	
CMNode	TokenNameIdentifier	 CM Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for choice or sequence, copy the two subtrees, and combine them 	TokenNameCOMMENT_LINE	for choice or sequence, copy the two subtrees, and combine them 
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
.	TokenNameDOT	
MODELGROUP_CHOICE	TokenNameIdentifier	 MODELGROUP  CHOICE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
.	TokenNameDOT	
MODELGROUP_SEQUENCE	TokenNameIdentifier	 MODELGROUP  SEQUENCE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSCMBinOp	TokenNameIdentifier	 XSCM Bin Op
bin	TokenNameIdentifier	 bin
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSCMBinOp	TokenNameIdentifier	 XSCM Bin Op
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMBinOpNode	TokenNameIdentifier	 get CM Bin Op Node
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
copyNode	TokenNameIdentifier	 copy Node
(	TokenNameLPAREN	
bin	TokenNameIdentifier	 bin
.	TokenNameDOT	
getLeft	TokenNameIdentifier	 get Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
copyNode	TokenNameIdentifier	 copy Node
(	TokenNameLPAREN	
bin	TokenNameIdentifier	 bin
.	TokenNameDOT	
getRight	TokenNameIdentifier	 get Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for ?+*, copy the subtree, and put it in a new ?+* node 	TokenNameCOMMENT_LINE	for ?+*, copy the subtree, and put it in a new ?+* node 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ZERO_OR_MORE	TokenNameIdentifier	 PARTICLE  ZERO  OR  MORE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ONE_OR_MORE	TokenNameIdentifier	 PARTICLE  ONE  OR  MORE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ZERO_OR_ONE	TokenNameIdentifier	 PARTICLE  ZERO  OR  ONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSCMUniOp	TokenNameIdentifier	 XSCM Uni Op
uni	TokenNameIdentifier	 uni
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSCMUniOp	TokenNameIdentifier	 XSCM Uni Op
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMUniOpNode	TokenNameIdentifier	 get CM Uni Op Node
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
copyNode	TokenNameIdentifier	 copy Node
(	TokenNameLPAREN	
uni	TokenNameIdentifier	 uni
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for element/wildcard (leaf), make a new leaf node, 	TokenNameCOMMENT_LINE	for element/wildcard (leaf), make a new leaf node, 
// with a distinct position 	TokenNameCOMMENT_LINE	with a distinct position 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ELEMENT	TokenNameIdentifier	 PARTICLE  ELEMENT
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_WILDCARD	TokenNameIdentifier	 PARTICLE  WILDCARD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSCMLeaf	TokenNameIdentifier	 XSCM Leaf
leaf	TokenNameIdentifier	 leaf
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSCMLeaf	TokenNameIdentifier	 XSCM Leaf
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMLeafNode	TokenNameIdentifier	 get CM Leaf Node
(	TokenNameLPAREN	
leaf	TokenNameIdentifier	 leaf
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
leaf	TokenNameIdentifier	 leaf
.	TokenNameDOT	
getLeaf	TokenNameIdentifier	 get Leaf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
leaf	TokenNameIdentifier	 leaf
.	TokenNameDOT	
getParticleId	TokenNameIdentifier	 get Particle Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fLeafCount	TokenNameIdentifier	 f Leaf Count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// A special version of buildSyntaxTree() which builds a compact syntax tree 	TokenNameCOMMENT_LINE	A special version of buildSyntaxTree() which builds a compact syntax tree 
// containing compound leaf nodes which carry occurence information. This method 	TokenNameCOMMENT_LINE	containing compound leaf nodes which carry occurence information. This method 
// for building the syntax tree is chosen over buildSyntaxTree() when 	TokenNameCOMMENT_LINE	for building the syntax tree is chosen over buildSyntaxTree() when 
// useRepeatingLeafNodes() returns true. 	TokenNameCOMMENT_LINE	useRepeatingLeafNodes() returns true. 
private	TokenNameprivate	
CMNode	TokenNameIdentifier	 CM Node
buildCompactSyntaxTree	TokenNameIdentifier	 build Compact Syntax Tree
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
particle	TokenNameIdentifier	 particle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
maxOccurs	TokenNameIdentifier	 max Occurs
=	TokenNameEQUAL	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
;	TokenNameSEMICOLON	
int	TokenNameint	
minOccurs	TokenNameIdentifier	 min Occurs
=	TokenNameEQUAL	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
;	TokenNameSEMICOLON	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
CMNode	TokenNameIdentifier	 CM Node
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_WILDCARD	TokenNameIdentifier	 PARTICLE  WILDCARD
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ELEMENT	TokenNameIdentifier	 PARTICLE  ELEMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buildCompactSyntaxTree2	TokenNameIdentifier	 build Compact Syntax Tree2
(	TokenNameLPAREN	
particle	TokenNameIdentifier	 particle
,	TokenNameCOMMA	
minOccurs	TokenNameIdentifier	 min Occurs
,	TokenNameCOMMA	
maxOccurs	TokenNameIdentifier	 max Occurs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_MODELGROUP	TokenNameIdentifier	 PARTICLE  MODELGROUP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
)	TokenNameRPAREN	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fValue	TokenNameIdentifier	 f Value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticleCount	TokenNameIdentifier	 f Particle Count
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
minOccurs	TokenNameIdentifier	 min Occurs
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
maxOccurs	TokenNameIdentifier	 max Occurs
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buildCompactSyntaxTree2	TokenNameIdentifier	 build Compact Syntax Tree2
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticles	TokenNameIdentifier	 f Particles
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
minOccurs	TokenNameIdentifier	 min Occurs
,	TokenNameCOMMA	
maxOccurs	TokenNameIdentifier	 max Occurs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
CMNode	TokenNameIdentifier	 CM Node
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// when the model group is a choice of more than one particles, but 	TokenNameCOMMENT_LINE	when the model group is a choice of more than one particles, but 
// only one of the particle is not empty, (for example 	TokenNameCOMMENT_LINE	only one of the particle is not empty, (for example 
// <choice> 	TokenNameCOMMENT_LINE	<choice> 
// <sequence/> 	TokenNameCOMMENT_LINE	<sequence/> 
// <element name="e"/> 	TokenNameCOMMENT_LINE	<element name="e"/> 
// </choice> 	TokenNameCOMMENT_LINE	</choice> 
// ) we can't not return that one particle ("e"). instead, we should 	TokenNameCOMMENT_LINE	) we can't not return that one particle ("e"). instead, we should 
// treat such particle as optional ("e?"). 	TokenNameCOMMENT_LINE	treat such particle as optional ("e?"). 
// the following int variable keeps track of the number of non-empty children 	TokenNameCOMMENT_LINE	the following int variable keeps track of the number of non-empty children 
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
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticleCount	TokenNameIdentifier	 f Particle Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first convert each child to a CM tree 	TokenNameCOMMENT_LINE	first convert each child to a CM tree 
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
buildCompactSyntaxTree	TokenNameIdentifier	 build Compact Syntax Tree
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticles	TokenNameIdentifier	 f Particles
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// then combine them using binary operation 	TokenNameCOMMENT_LINE	then combine them using binary operation 
if	TokenNameif	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeRet	TokenNameIdentifier	 node Ret
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMBinOpNode	TokenNameIdentifier	 get CM Bin Op Node
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fCompositor	TokenNameIdentifier	 f Compositor
,	TokenNameCOMMA	
nodeRet	TokenNameIdentifier	 node Ret
,	TokenNameCOMMA	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeRet	TokenNameIdentifier	 node Ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// when the group is "choice" and the group has one or more empty children, 	TokenNameCOMMENT_LINE	when the group is "choice" and the group has one or more empty children, 
// we need to create a zero-or-one (optional) node for the non-empty particles. 	TokenNameCOMMENT_LINE	we need to create a zero-or-one (optional) node for the non-empty particles. 
if	TokenNameif	
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fCompositor	TokenNameIdentifier	 f Compositor
==	TokenNameEQUAL_EQUAL	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
.	TokenNameDOT	
MODELGROUP_CHOICE	TokenNameIdentifier	 MODELGROUP  CHOICE
&&	TokenNameAND_AND	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticleCount	TokenNameIdentifier	 f Particle Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMUniOpNode	TokenNameIdentifier	 get CM Uni Op Node
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ZERO_OR_ONE	TokenNameIdentifier	 PARTICLE  ZERO  OR  ONE
,	TokenNameCOMMA	
nodeRet	TokenNameIdentifier	 node Ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
nodeRet	TokenNameIdentifier	 node Ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
CMNode	TokenNameIdentifier	 CM Node
buildCompactSyntaxTree2	TokenNameIdentifier	 build Compact Syntax Tree2
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
particle	TokenNameIdentifier	 particle
,	TokenNameCOMMA	
int	TokenNameint	
minOccurs	TokenNameIdentifier	 min Occurs
,	TokenNameCOMMA	
int	TokenNameint	
maxOccurs	TokenNameIdentifier	 max Occurs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Convert element and wildcard particles to leaf nodes. Wrap repeating particles in a CMUniOpNode. 	TokenNameCOMMENT_LINE	Convert element and wildcard particles to leaf nodes. Wrap repeating particles in a CMUniOpNode. 
CMNode	TokenNameIdentifier	 CM Node
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minOccurs	TokenNameIdentifier	 min Occurs
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
maxOccurs	TokenNameIdentifier	 max Occurs
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMLeafNode	TokenNameIdentifier	 get CM Leaf Node
(	TokenNameLPAREN	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
,	TokenNameCOMMA	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fValue	TokenNameIdentifier	 f Value
,	TokenNameCOMMA	
fParticleCount	TokenNameIdentifier	 f Particle Count
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
fLeafCount	TokenNameIdentifier	 f Leaf Count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
minOccurs	TokenNameIdentifier	 min Occurs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
maxOccurs	TokenNameIdentifier	 max Occurs
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// zero or one 	TokenNameCOMMENT_LINE	zero or one 
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMLeafNode	TokenNameIdentifier	 get CM Leaf Node
(	TokenNameLPAREN	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
,	TokenNameCOMMA	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fValue	TokenNameIdentifier	 f Value
,	TokenNameCOMMA	
fParticleCount	TokenNameIdentifier	 f Particle Count
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
fLeafCount	TokenNameIdentifier	 f Leaf Count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMUniOpNode	TokenNameIdentifier	 get CM Uni Op Node
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ZERO_OR_ONE	TokenNameIdentifier	 PARTICLE  ZERO  OR  ONE
,	TokenNameCOMMA	
nodeRet	TokenNameIdentifier	 node Ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
minOccurs	TokenNameIdentifier	 min Occurs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
maxOccurs	TokenNameIdentifier	 max Occurs
==	TokenNameEQUAL_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
OCCURRENCE_UNBOUNDED	TokenNameIdentifier	 OCCURRENCE  UNBOUNDED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// zero or more 	TokenNameCOMMENT_LINE	zero or more 
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMLeafNode	TokenNameIdentifier	 get CM Leaf Node
(	TokenNameLPAREN	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
,	TokenNameCOMMA	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fValue	TokenNameIdentifier	 f Value
,	TokenNameCOMMA	
fParticleCount	TokenNameIdentifier	 f Particle Count
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
fLeafCount	TokenNameIdentifier	 f Leaf Count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMUniOpNode	TokenNameIdentifier	 get CM Uni Op Node
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ZERO_OR_MORE	TokenNameIdentifier	 PARTICLE  ZERO  OR  MORE
,	TokenNameCOMMA	
nodeRet	TokenNameIdentifier	 node Ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
minOccurs	TokenNameIdentifier	 min Occurs
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
maxOccurs	TokenNameIdentifier	 max Occurs
==	TokenNameEQUAL_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
OCCURRENCE_UNBOUNDED	TokenNameIdentifier	 OCCURRENCE  UNBOUNDED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// one or more 	TokenNameCOMMENT_LINE	one or more 
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMLeafNode	TokenNameIdentifier	 get CM Leaf Node
(	TokenNameLPAREN	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
,	TokenNameCOMMA	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fValue	TokenNameIdentifier	 f Value
,	TokenNameCOMMA	
fParticleCount	TokenNameIdentifier	 f Particle Count
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
fLeafCount	TokenNameIdentifier	 f Leaf Count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMUniOpNode	TokenNameIdentifier	 get CM Uni Op Node
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ONE_OR_MORE	TokenNameIdentifier	 PARTICLE  ONE  OR  MORE
,	TokenNameCOMMA	
nodeRet	TokenNameIdentifier	 node Ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// {n,m}: Instead of expanding this out, create a compound leaf node which carries the 	TokenNameCOMMENT_LINE	{n,m}: Instead of expanding this out, create a compound leaf node which carries the 
// occurence information and wrap it in the appropriate CMUniOpNode. 	TokenNameCOMMENT_LINE	occurence information and wrap it in the appropriate CMUniOpNode. 
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMRepeatingLeafNode	TokenNameIdentifier	 get CM Repeating Leaf Node
(	TokenNameLPAREN	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
,	TokenNameCOMMA	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fValue	TokenNameIdentifier	 f Value
,	TokenNameCOMMA	
minOccurs	TokenNameIdentifier	 min Occurs
,	TokenNameCOMMA	
maxOccurs	TokenNameIdentifier	 max Occurs
,	TokenNameCOMMA	
fParticleCount	TokenNameIdentifier	 f Particle Count
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
fLeafCount	TokenNameIdentifier	 f Leaf Count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minOccurs	TokenNameIdentifier	 min Occurs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMUniOpNode	TokenNameIdentifier	 get CM Uni Op Node
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ZERO_OR_MORE	TokenNameIdentifier	 PARTICLE  ZERO  OR  MORE
,	TokenNameCOMMA	
nodeRet	TokenNameIdentifier	 node Ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nodeRet	TokenNameIdentifier	 node Ret
=	TokenNameEQUAL	
fNodeFactory	TokenNameIdentifier	 f Node Factory
.	TokenNameDOT	
getCMUniOpNode	TokenNameIdentifier	 get CM Uni Op Node
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ONE_OR_MORE	TokenNameIdentifier	 PARTICLE  ONE  OR  MORE
,	TokenNameCOMMA	
nodeRet	TokenNameIdentifier	 node Ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
nodeRet	TokenNameIdentifier	 node Ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This method checks if this particle can be transformed into a compact syntax 	TokenNameCOMMENT_LINE	This method checks if this particle can be transformed into a compact syntax 
// tree containing compound leaf nodes which carry occurence information. Currently 	TokenNameCOMMENT_LINE	tree containing compound leaf nodes which carry occurence information. Currently 
// it returns true if each model group has minOccurs/maxOccurs == 1 or 	TokenNameCOMMENT_LINE	it returns true if each model group has minOccurs/maxOccurs == 1 or 
// contains only one element/wildcard particle with minOccurs/maxOccurs == 1. 	TokenNameCOMMENT_LINE	contains only one element/wildcard particle with minOccurs/maxOccurs == 1. 
private	TokenNameprivate	
boolean	TokenNameboolean	
useRepeatingLeafNodes	TokenNameIdentifier	 use Repeating Leaf Nodes
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
particle	TokenNameIdentifier	 particle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
maxOccurs	TokenNameIdentifier	 max Occurs
=	TokenNameEQUAL	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
;	TokenNameSEMICOLON	
int	TokenNameint	
minOccurs	TokenNameIdentifier	 min Occurs
=	TokenNameEQUAL	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
;	TokenNameSEMICOLON	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_MODELGROUP	TokenNameIdentifier	 PARTICLE  MODELGROUP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
)	TokenNameRPAREN	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fValue	TokenNameIdentifier	 f Value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minOccurs	TokenNameIdentifier	 min Occurs
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
maxOccurs	TokenNameIdentifier	 max Occurs
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticleCount	TokenNameIdentifier	 f Particle Count
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
particle2	TokenNameIdentifier	 particle2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
)	TokenNameRPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticles	TokenNameIdentifier	 f Particles
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
short	TokenNameshort	
type2	TokenNameIdentifier	 type2
=	TokenNameEQUAL	
particle2	TokenNameIdentifier	 particle2
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
type2	TokenNameIdentifier	 type2
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_ELEMENT	TokenNameIdentifier	 PARTICLE  ELEMENT
||	TokenNameOR_OR	
type2	TokenNameIdentifier	 type2
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_WILDCARD	TokenNameIdentifier	 PARTICLE  WILDCARD
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
particle2	TokenNameIdentifier	 particle2
.	TokenNameDOT	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
particle2	TokenNameIdentifier	 particle2
.	TokenNameDOT	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticleCount	TokenNameIdentifier	 f Particle Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticleCount	TokenNameIdentifier	 f Particle Count
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
useRepeatingLeafNodes	TokenNameIdentifier	 use Repeating Leaf Nodes
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
fParticles	TokenNameIdentifier	 f Particles
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
