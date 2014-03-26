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
XSModelGroup	TokenNameIdentifier	 XS Model Group
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
/** * Store schema model group declaration. * * @xerces.internal * * @author Sandy Gao, IBM * * @version $Id: XSModelGroupImpl.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Store schema model group declaration. * @xerces.internal * @author Sandy Gao, IBM * @version $Id: XSModelGroupImpl.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
implements	TokenNameimplements	
XSModelGroup	TokenNameIdentifier	 XS Model Group
{	TokenNameLBRACE	
// types of model groups 	TokenNameCOMMENT_LINE	types of model groups 
// REVISIT: can't use same constants as those for particles, because 	TokenNameCOMMENT_LINE	REVISIT: can't use same constants as those for particles, because 
// there are place where the constants are used together. For example, 	TokenNameCOMMENT_LINE	there are place where the constants are used together. For example, 
// to check whether the content is an element or a sequence. 	TokenNameCOMMENT_LINE	to check whether the content is an element or a sequence. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
MODELGROUP_CHOICE	TokenNameIdentifier	 MODELGROUP  CHOICE
=	TokenNameEQUAL	
101	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
MODELGROUP_SEQUENCE	TokenNameIdentifier	 MODELGROUP  SEQUENCE
=	TokenNameEQUAL	
102	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
MODELGROUP_ALL	TokenNameIdentifier	 MODELGROUP  ALL
=	TokenNameEQUAL	
103	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// compositor of the model group 	TokenNameCOMMENT_LINE	compositor of the model group 
public	TokenNamepublic	
short	TokenNameshort	
fCompositor	TokenNameIdentifier	 f Compositor
;	TokenNameSEMICOLON	
// particles 	TokenNameCOMMENT_LINE	particles 
public	TokenNamepublic	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fParticles	TokenNameIdentifier	 f Particles
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
fParticleCount	TokenNameIdentifier	 f Particle Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// this particle's optional annotations 	TokenNameCOMMENT_LINE	this particle's optional annotations 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// whether this model group contains nothing 	TokenNameCOMMENT_LINE	whether this model group contains nothing 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
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
fParticleCount	TokenNameIdentifier	 f Particle Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fParticles	TokenNameIdentifier	 f Particles
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
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
/** * 3.8.6 Effective Total Range (all and sequence) and * Effective Total Range (choice) * The following methods are used to return min/max range for a particle. * They are not exactly the same as it's described in the spec, but all the * values from the spec are retrievable by these methods. */	TokenNameCOMMENT_JAVADOC	 3.8.6 Effective Total Range (all and sequence) and Effective Total Range (choice) The following methods are used to return min/max range for a particle. They are not exactly the same as it's described in the spec, but all the values from the spec are retrievable by these methods. 
public	TokenNamepublic	
int	TokenNameint	
minEffectiveTotalRange	TokenNameIdentifier	 min Effective Total Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCompositor	TokenNameIdentifier	 f Compositor
==	TokenNameEQUAL_EQUAL	
MODELGROUP_CHOICE	TokenNameIdentifier	 MODELGROUP  CHOICE
)	TokenNameRPAREN	
return	TokenNamereturn	
minEffectiveTotalRangeChoice	TokenNameIdentifier	 min Effective Total Range Choice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
minEffectiveTotalRangeAllSeq	TokenNameIdentifier	 min Effective Total Range All Seq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return the sum of all min values of the particles 	TokenNameCOMMENT_LINE	return the sum of all min values of the particles 
private	TokenNameprivate	
int	TokenNameint	
minEffectiveTotalRangeAllSeq	TokenNameIdentifier	 min Effective Total Range All Seq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
total	TokenNameIdentifier	 total
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
fParticleCount	TokenNameIdentifier	 f Particle Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
total	TokenNameIdentifier	 total
+=	TokenNamePLUS_EQUAL	
fParticles	TokenNameIdentifier	 f Particles
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
minEffectiveTotalRange	TokenNameIdentifier	 min Effective Total Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return the min of all min values of the particles 	TokenNameCOMMENT_LINE	return the min of all min values of the particles 
private	TokenNameprivate	
int	TokenNameint	
minEffectiveTotalRangeChoice	TokenNameIdentifier	 min Effective Total Range Choice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
one	TokenNameIdentifier	 one
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fParticleCount	TokenNameIdentifier	 f Particle Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
fParticles	TokenNameIdentifier	 f Particles
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
minEffectiveTotalRange	TokenNameIdentifier	 min Effective Total Range
(	TokenNameLPAREN	
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
fParticleCount	TokenNameIdentifier	 f Particle Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
one	TokenNameIdentifier	 one
=	TokenNameEQUAL	
fParticles	TokenNameIdentifier	 f Particles
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
minEffectiveTotalRange	TokenNameIdentifier	 min Effective Total Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
<	TokenNameLESS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
one	TokenNameIdentifier	 one
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
min	TokenNameIdentifier	 min
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
fCompositor	TokenNameIdentifier	 f Compositor
==	TokenNameEQUAL_EQUAL	
MODELGROUP_CHOICE	TokenNameIdentifier	 MODELGROUP  CHOICE
)	TokenNameRPAREN	
return	TokenNamereturn	
maxEffectiveTotalRangeChoice	TokenNameIdentifier	 max Effective Total Range Choice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
maxEffectiveTotalRangeAllSeq	TokenNameIdentifier	 max Effective Total Range All Seq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if one of the max value of the particles is unbounded, return unbounded; 	TokenNameCOMMENT_LINE	if one of the max value of the particles is unbounded, return unbounded; 
// otherwise return the sum of all max values 	TokenNameCOMMENT_LINE	otherwise return the sum of all max values 
private	TokenNameprivate	
int	TokenNameint	
maxEffectiveTotalRangeAllSeq	TokenNameIdentifier	 max Effective Total Range All Seq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
one	TokenNameIdentifier	 one
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
fParticleCount	TokenNameIdentifier	 f Particle Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
one	TokenNameIdentifier	 one
=	TokenNameEQUAL	
fParticles	TokenNameIdentifier	 f Particles
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
maxEffectiveTotalRange	TokenNameIdentifier	 max Effective Total Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
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
total	TokenNameIdentifier	 total
+=	TokenNamePLUS_EQUAL	
one	TokenNameIdentifier	 one
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if one of the max value of the particles is unbounded, return unbounded; 	TokenNameCOMMENT_LINE	if one of the max value of the particles is unbounded, return unbounded; 
// otherwise return the max of all max values 	TokenNameCOMMENT_LINE	otherwise return the max of all max values 
private	TokenNameprivate	
int	TokenNameint	
maxEffectiveTotalRangeChoice	TokenNameIdentifier	 max Effective Total Range Choice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
one	TokenNameIdentifier	 one
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fParticleCount	TokenNameIdentifier	 f Particle Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
fParticles	TokenNameIdentifier	 f Particles
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fParticleCount	TokenNameIdentifier	 f Particle Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
one	TokenNameIdentifier	 one
=	TokenNameEQUAL	
fParticles	TokenNameIdentifier	 f Particles
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
maxEffectiveTotalRange	TokenNameIdentifier	 max Effective Total Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
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
one	TokenNameIdentifier	 one
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
one	TokenNameIdentifier	 one
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
max	TokenNameIdentifier	 max
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
// REVISIT: Commented code may help to eliminate redundant parentheses (test first before committing) 	TokenNameCOMMENT_LINE	REVISIT: Commented code may help to eliminate redundant parentheses (test first before committing) 
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
if	TokenNameif	
(	TokenNameLPAREN	
fCompositor	TokenNameIdentifier	 f Compositor
==	TokenNameEQUAL_EQUAL	
MODELGROUP_ALL	TokenNameIdentifier	 MODELGROUP  ALL
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"all("	TokenNameStringLiteral	all(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
//if (fMinOccurs != 1 || fMaxOccurs != 1) 	TokenNameCOMMENT_LINE	if (fMinOccurs != 1 || fMaxOccurs != 1) 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fParticleCount	TokenNameIdentifier	 f Particle Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fParticles	TokenNameIdentifier	 f Particles
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
fParticleCount	TokenNameIdentifier	 f Particle Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCompositor	TokenNameIdentifier	 f Compositor
==	TokenNameEQUAL_EQUAL	
MODELGROUP_CHOICE	TokenNameIdentifier	 MODELGROUP  CHOICE
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fParticles	TokenNameIdentifier	 f Particles
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//if (fCompositor == MODELGROUP_ALL || fMinOccurs != 1 || fMaxOccurs != 1) 	TokenNameCOMMENT_LINE	if (fCompositor == MODELGROUP_ALL || fMinOccurs != 1 || fMaxOccurs != 1) 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
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
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCompositor	TokenNameIdentifier	 f Compositor
=	TokenNameEQUAL	
MODELGROUP_SEQUENCE	TokenNameIdentifier	 MODELGROUP  SEQUENCE
;	TokenNameSEMICOLON	
fParticles	TokenNameIdentifier	 f Particles
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fParticleCount	TokenNameIdentifier	 f Particle Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
MODEL_GROUP	TokenNameIdentifier	 MODEL  GROUP
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
/** * {compositor} One of all, choice or sequence. The valid constants values * are: ALL, CHOICE, SEQUENCE. */	TokenNameCOMMENT_JAVADOC	 {compositor} One of all, choice or sequence. The valid constants values are: ALL, CHOICE, SEQUENCE. 
public	TokenNamepublic	
short	TokenNameshort	
getCompositor	TokenNameIdentifier	 get Compositor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCompositor	TokenNameIdentifier	 f Compositor
==	TokenNameEQUAL_EQUAL	
MODELGROUP_CHOICE	TokenNameIdentifier	 MODELGROUP  CHOICE
)	TokenNameRPAREN	
return	TokenNamereturn	
XSModelGroup	TokenNameIdentifier	 XS Model Group
.	TokenNameDOT	
COMPOSITOR_CHOICE	TokenNameIdentifier	 COMPOSITOR  CHOICE
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fCompositor	TokenNameIdentifier	 f Compositor
==	TokenNameEQUAL_EQUAL	
MODELGROUP_SEQUENCE	TokenNameIdentifier	 MODELGROUP  SEQUENCE
)	TokenNameRPAREN	
return	TokenNamereturn	
XSModelGroup	TokenNameIdentifier	 XS Model Group
.	TokenNameDOT	
COMPOSITOR_SEQUENCE	TokenNameIdentifier	 COMPOSITOR  SEQUENCE
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
XSModelGroup	TokenNameIdentifier	 XS Model Group
.	TokenNameDOT	
COMPOSITOR_ALL	TokenNameIdentifier	 COMPOSITOR  ALL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {particles} A list of particles */	TokenNameCOMMENT_JAVADOC	 {particles} A list of particles 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getParticles	TokenNameIdentifier	 get Particles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
(	TokenNameLPAREN	
fParticles	TokenNameIdentifier	 f Particles
,	TokenNameCOMMA	
fParticleCount	TokenNameIdentifier	 f Particle Count
)	TokenNameRPAREN	
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
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XSModelGroupImpl 	TokenNameCOMMENT_LINE	class XSModelGroupImpl 
