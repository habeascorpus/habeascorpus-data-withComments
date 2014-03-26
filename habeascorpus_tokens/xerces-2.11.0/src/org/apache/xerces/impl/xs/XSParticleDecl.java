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
XSParticle	TokenNameIdentifier	 XS Particle
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
XSTerm	TokenNameIdentifier	 XS Term
;	TokenNameSEMICOLON	
/** * Store schema particle declaration. * * @xerces.internal * * @author Sandy Gao, IBM * * @version $Id: XSParticleDecl.java 965250 2010-07-18 16:04:58Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Store schema particle declaration. * @xerces.internal * @author Sandy Gao, IBM * @version $Id: XSParticleDecl.java 965250 2010-07-18 16:04:58Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
implements	TokenNameimplements	
XSParticle	TokenNameIdentifier	 XS Particle
{	TokenNameLBRACE	
// types of particles 	TokenNameCOMMENT_LINE	types of particles 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PARTICLE_EMPTY	TokenNameIdentifier	 PARTICLE  EMPTY
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PARTICLE_ELEMENT	TokenNameIdentifier	 PARTICLE  ELEMENT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PARTICLE_WILDCARD	TokenNameIdentifier	 PARTICLE  WILDCARD
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PARTICLE_MODELGROUP	TokenNameIdentifier	 PARTICLE  MODELGROUP
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PARTICLE_ZERO_OR_MORE	TokenNameIdentifier	 PARTICLE  ZERO  OR  MORE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PARTICLE_ZERO_OR_ONE	TokenNameIdentifier	 PARTICLE  ZERO  OR  ONE
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PARTICLE_ONE_OR_MORE	TokenNameIdentifier	 PARTICLE  ONE  OR  MORE
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// type of the particle 	TokenNameCOMMENT_LINE	type of the particle 
public	TokenNamepublic	
short	TokenNameshort	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
PARTICLE_EMPTY	TokenNameIdentifier	 PARTICLE  EMPTY
;	TokenNameSEMICOLON	
// term of the particle 	TokenNameCOMMENT_LINE	term of the particle 
// for PARTICLE_ELEMENT : the element decl 	TokenNameCOMMENT_LINE	for PARTICLE_ELEMENT : the element decl 
// for PARTICLE_WILDCARD: the wildcard decl 	TokenNameCOMMENT_LINE	for PARTICLE_WILDCARD: the wildcard decl 
// for PARTICLE_MODELGROUP: the model group 	TokenNameCOMMENT_LINE	for PARTICLE_MODELGROUP: the model group 
public	TokenNamepublic	
XSTerm	TokenNameIdentifier	 XS Term
fValue	TokenNameIdentifier	 f Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// minimum occurrence of this particle 	TokenNameCOMMENT_LINE	minimum occurrence of this particle 
public	TokenNamepublic	
int	TokenNameint	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// maximum occurrence of this particle 	TokenNameCOMMENT_LINE	maximum occurrence of this particle 
public	TokenNamepublic	
int	TokenNameint	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// optional annotation 	TokenNameCOMMENT_LINE	optional annotation 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// clone this decl 	TokenNameCOMMENT_LINE	clone this decl 
public	TokenNamepublic	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
makeClone	TokenNameIdentifier	 make Clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
particle	TokenNameIdentifier	 particle
=	TokenNameEQUAL	
new	TokenNamenew	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
=	TokenNameEQUAL	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
;	TokenNameSEMICOLON	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
=	TokenNameEQUAL	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
;	TokenNameSEMICOLON	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fDescription	TokenNameIdentifier	 f Description
=	TokenNameEQUAL	
fDescription	TokenNameIdentifier	 f Description
;	TokenNameSEMICOLON	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fValue	TokenNameIdentifier	 f Value
=	TokenNameEQUAL	
fValue	TokenNameIdentifier	 f Value
;	TokenNameSEMICOLON	
particle	TokenNameIdentifier	 particle
.	TokenNameDOT	
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
fAnnotations	TokenNameIdentifier	 f Annotations
;	TokenNameSEMICOLON	
return	TokenNamereturn	
particle	TokenNameIdentifier	 particle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * 3.9.6 Schema Component Constraint: Particle Emptiable * whether this particle is emptible */	TokenNameCOMMENT_JAVADOC	 3.9.6 Schema Component Constraint: Particle Emptiable whether this particle is emptible 
public	TokenNamepublic	
boolean	TokenNameboolean	
emptiable	TokenNameIdentifier	 emptiable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minEffectiveTotalRange	TokenNameIdentifier	 min Effective Total Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// whether this particle contains nothing 	TokenNameCOMMENT_LINE	whether this particle contains nothing 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
PARTICLE_EMPTY	TokenNameIdentifier	 PARTICLE  EMPTY
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
PARTICLE_ELEMENT	TokenNameIdentifier	 PARTICLE  ELEMENT
||	TokenNameOR_OR	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
PARTICLE_WILDCARD	TokenNameIdentifier	 PARTICLE  WILDCARD
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
)	TokenNameRPAREN	
fValue	TokenNameIdentifier	 f Value
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * 3.8.6 Effective Total Range (all and sequence) and * Effective Total Range (choice) * The following methods are used to return min/max range for a particle. * They are not exactly the same as it's described in the spec, but all the * values from the spec are retrievable by these methods. */	TokenNameCOMMENT_JAVADOC	 3.8.6 Effective Total Range (all and sequence) and Effective Total Range (choice) The following methods are used to return min/max range for a particle. They are not exactly the same as it's described in the spec, but all the values from the spec are retrievable by these methods. 
public	TokenNamepublic	
int	TokenNameint	
minEffectiveTotalRange	TokenNameIdentifier	 min Effective Total Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_EMPTY	TokenNameIdentifier	 PARTICLE  EMPTY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
PARTICLE_MODELGROUP	TokenNameIdentifier	 PARTICLE  MODELGROUP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
)	TokenNameRPAREN	
fValue	TokenNameIdentifier	 f Value
)	TokenNameRPAREN	
.	TokenNameDOT	
minEffectiveTotalRange	TokenNameIdentifier	 min Effective Total Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
maxEffectiveTotalRange	TokenNameIdentifier	 max Effective Total Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
.	TokenNameDOT	
PARTICLE_EMPTY	TokenNameIdentifier	 PARTICLE  EMPTY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
==	TokenNameEQUAL_EQUAL	
PARTICLE_MODELGROUP	TokenNameIdentifier	 PARTICLE  MODELGROUP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
)	TokenNameRPAREN	
fValue	TokenNameIdentifier	 f Value
)	TokenNameRPAREN	
.	TokenNameDOT	
maxEffectiveTotalRange	TokenNameIdentifier	 max Effective Total Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
==	TokenNameEQUAL_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
OCCURRENCE_UNBOUNDED	TokenNameIdentifier	 OCCURRENCE  UNBOUNDED
)	TokenNameRPAREN	
return	TokenNamereturn	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
OCCURRENCE_UNBOUNDED	TokenNameIdentifier	 OCCURRENCE  UNBOUNDED
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
==	TokenNameEQUAL_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
OCCURRENCE_UNBOUNDED	TokenNameIdentifier	 OCCURRENCE  UNBOUNDED
)	TokenNameRPAREN	
return	TokenNamereturn	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
OCCURRENCE_UNBOUNDED	TokenNameIdentifier	 OCCURRENCE  UNBOUNDED
;	TokenNameSEMICOLON	
return	TokenNamereturn	
max	TokenNameIdentifier	 max
*	TokenNameMULTIPLY	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the string description of this particle */	TokenNameCOMMENT_JAVADOC	 get the string description of this particle 
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
appendParticle	TokenNameIdentifier	 append Particle
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
==	TokenNameEQUAL_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
OCCURRENCE_UNBOUNDED	TokenNameIdentifier	 OCCURRENCE  UNBOUNDED
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-UNBOUNDED"	TokenNameStringLiteral	-UNBOUNDED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
!=	TokenNameNOT_EQUAL	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** * append the string description of this particle to the string buffer * this is for error message. */	TokenNameCOMMENT_JAVADOC	 append the string description of this particle to the string buffer this is for error message. 
void	TokenNamevoid	
appendParticle	TokenNameIdentifier	 append Particle
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
fType	TokenNameIdentifier	 f Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
PARTICLE_EMPTY	TokenNameIdentifier	 PARTICLE  EMPTY
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"EMPTY"	TokenNameStringLiteral	EMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PARTICLE_ELEMENT	TokenNameIdentifier	 PARTICLE  ELEMENT
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fValue	TokenNameIdentifier	 f Value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PARTICLE_WILDCARD	TokenNameIdentifier	 PARTICLE  WILDCARD
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fValue	TokenNameIdentifier	 f Value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PARTICLE_MODELGROUP	TokenNameIdentifier	 PARTICLE  MODELGROUP
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fValue	TokenNameIdentifier	 f Value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
PARTICLE_EMPTY	TokenNameIdentifier	 PARTICLE  EMPTY
;	TokenNameSEMICOLON	
fValue	TokenNameIdentifier	 f Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fDescription	TokenNameIdentifier	 f Description
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fAnnotations	TokenNameIdentifier	 f Annotations
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
PARTICLE	TokenNameIdentifier	 PARTICLE
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
/** * {min occurs} determines the minimum number of terms that can occur. */	TokenNameCOMMENT_JAVADOC	 {min occurs} determines the minimum number of terms that can occur. 
public	TokenNamepublic	
int	TokenNameint	
getMinOccurs	TokenNameIdentifier	 get Min Occurs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {max occurs} whether the maxOccurs value is unbounded. */	TokenNameCOMMENT_JAVADOC	 {max occurs} whether the maxOccurs value is unbounded. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getMaxOccursUnbounded	TokenNameIdentifier	 get Max Occurs Unbounded
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
==	TokenNameEQUAL_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
OCCURRENCE_UNBOUNDED	TokenNameIdentifier	 OCCURRENCE  UNBOUNDED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {max occurs} determines the maximum number of terms that can occur. */	TokenNameCOMMENT_JAVADOC	 {max occurs} determines the maximum number of terms that can occur. 
public	TokenNamepublic	
int	TokenNameint	
getMaxOccurs	TokenNameIdentifier	 get Max Occurs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {term} One of a model group, a wildcard, or an element declaration. */	TokenNameCOMMENT_JAVADOC	 {term} One of a model group, a wildcard, or an element declaration. 
public	TokenNamepublic	
XSTerm	TokenNameIdentifier	 XS Term
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fValue	TokenNameIdentifier	 f Value
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
}	TokenNameRBRACE	
// class XSParticleDecl 	TokenNameCOMMENT_LINE	class XSParticleDecl 
