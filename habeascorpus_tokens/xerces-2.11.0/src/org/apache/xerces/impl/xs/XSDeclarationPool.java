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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
SchemaDVFactoryImpl	TokenNameIdentifier	 Schema DV Factory Impl
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
;	TokenNameSEMICOLON	
/** * This class is pool that enables caching of XML Schema declaration objects. * Before a compiled grammar object is garbage collected, * the implementation will add all XML Schema component * declarations to the pool. * Note: The cashing mechanism is not implemented yet. * * @xerces.internal * * @author Elena Litani, IBM * @version $Id: XSDeclarationPool.java 805582 2009-08-18 21:13:20Z sandygao $ */	TokenNameCOMMENT_JAVADOC	 This class is pool that enables caching of XML Schema declaration objects. Before a compiled grammar object is garbage collected, the implementation will add all XML Schema component declarations to the pool. Note: The cashing mechanism is not implemented yet. * @xerces.internal * @author Elena Litani, IBM @version $Id: XSDeclarationPool.java 805582 2009-08-18 21:13:20Z sandygao $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
XSDeclarationPool	TokenNameIdentifier	 XS Declaration Pool
{	TokenNameLBRACE	
/** Chunk shift (8). */	TokenNameCOMMENT_JAVADOC	 Chunk shift (8). 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 2^8 = 256 	TokenNameCOMMENT_LINE	2^8 = 256 
/** Chunk size (1 << CHUNK_SHIFT). */	TokenNameCOMMENT_JAVADOC	 Chunk size (1 << CHUNK_SHIFT). 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
/** Chunk mask (CHUNK_SIZE - 1). */	TokenNameCOMMENT_JAVADOC	 Chunk mask (CHUNK_SIZE - 1). 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
=	TokenNameEQUAL	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Initial chunk count (). */	TokenNameCOMMENT_JAVADOC	 Initial chunk count (). 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
-	TokenNameMINUS	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 2^10 = 1k 	TokenNameCOMMENT_LINE	2^10 = 1k 
/** Element declaration pool*/	TokenNameCOMMENT_JAVADOC	 Element declaration pool
private	TokenNameprivate	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
fElementDecl	TokenNameIdentifier	 f Element Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
[	TokenNameLBRACKET	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fElementDeclIndex	TokenNameIdentifier	 f Element Decl Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Particle declaration pool */	TokenNameCOMMENT_JAVADOC	 Particle declaration pool 
private	TokenNameprivate	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
fParticleDecl	TokenNameIdentifier	 f Particle Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
[	TokenNameLBRACKET	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fParticleDeclIndex	TokenNameIdentifier	 f Particle Decl Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Particle declaration pool */	TokenNameCOMMENT_JAVADOC	 Particle declaration pool 
private	TokenNameprivate	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
fModelGroup	TokenNameIdentifier	 f Model Group
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
[	TokenNameLBRACKET	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fModelGroupIndex	TokenNameIdentifier	 f Model Group Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Attribute declaration pool */	TokenNameCOMMENT_JAVADOC	 Attribute declaration pool 
private	TokenNameprivate	
XSAttributeDecl	TokenNameIdentifier	 XS Attribute Decl
fAttrDecl	TokenNameIdentifier	 f Attr Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSAttributeDecl	TokenNameIdentifier	 XS Attribute Decl
[	TokenNameLBRACKET	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fAttrDeclIndex	TokenNameIdentifier	 f Attr Decl Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** ComplexType declaration pool */	TokenNameCOMMENT_JAVADOC	 ComplexType declaration pool 
private	TokenNameprivate	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
fCTDecl	TokenNameIdentifier	 f CT Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
[	TokenNameLBRACKET	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fCTDeclIndex	TokenNameIdentifier	 f CT Decl Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** SimpleType declaration pool */	TokenNameCOMMENT_JAVADOC	 SimpleType declaration pool 
private	TokenNameprivate	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
fSTDecl	TokenNameIdentifier	 f ST Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
[	TokenNameLBRACKET	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fSTDeclIndex	TokenNameIdentifier	 f ST Decl Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** AttributeUse declaration pool */	TokenNameCOMMENT_JAVADOC	 AttributeUse declaration pool 
private	TokenNameprivate	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
fAttributeUse	TokenNameIdentifier	 f Attribute Use
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
[	TokenNameLBRACKET	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fAttributeUseIndex	TokenNameIdentifier	 f Attribute Use Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SchemaDVFactoryImpl	TokenNameIdentifier	 Schema DV Factory Impl
dvFactory	TokenNameIdentifier	 dv Factory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setDVFactory	TokenNameIdentifier	 set DV Factory
(	TokenNameLPAREN	
SchemaDVFactoryImpl	TokenNameIdentifier	 Schema DV Factory Impl
dvFactory	TokenNameIdentifier	 dv Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dvFactory	TokenNameIdentifier	 dv Factory
=	TokenNameEQUAL	
dvFactory	TokenNameIdentifier	 dv Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
getElementDecl	TokenNameIdentifier	 get Element Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
fElementDeclIndex	TokenNameIdentifier	 f Element Decl Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fElementDeclIndex	TokenNameIdentifier	 f Element Decl Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
ensureElementDeclCapacity	TokenNameIdentifier	 ensure Element Decl Capacity
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fElementDecl	TokenNameIdentifier	 f Element Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fElementDecl	TokenNameIdentifier	 f Element Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fElementDecl	TokenNameIdentifier	 f Element Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fElementDeclIndex	TokenNameIdentifier	 f Element Decl Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fElementDecl	TokenNameIdentifier	 f Element Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
XSAttributeDecl	TokenNameIdentifier	 XS Attribute Decl
getAttributeDecl	TokenNameIdentifier	 get Attribute Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
fAttrDeclIndex	TokenNameIdentifier	 f Attr Decl Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fAttrDeclIndex	TokenNameIdentifier	 f Attr Decl Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
ensureAttrDeclCapacity	TokenNameIdentifier	 ensure Attr Decl Capacity
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSAttributeDecl	TokenNameIdentifier	 XS Attribute Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAttrDeclIndex	TokenNameIdentifier	 f Attr Decl Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
getAttributeUse	TokenNameIdentifier	 get Attribute Use
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
fAttributeUseIndex	TokenNameIdentifier	 f Attribute Use Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fAttributeUseIndex	TokenNameIdentifier	 f Attribute Use Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
ensureAttributeUseCapacity	TokenNameIdentifier	 ensure Attribute Use Capacity
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeUse	TokenNameIdentifier	 f Attribute Use
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributeUse	TokenNameIdentifier	 f Attribute Use
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fAttributeUse	TokenNameIdentifier	 f Attribute Use
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAttributeUseIndex	TokenNameIdentifier	 f Attribute Use Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fAttributeUse	TokenNameIdentifier	 f Attribute Use
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
getComplexTypeDecl	TokenNameIdentifier	 get Complex Type Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
fCTDeclIndex	TokenNameIdentifier	 f CT Decl Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fCTDeclIndex	TokenNameIdentifier	 f CT Decl Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
ensureCTDeclCapacity	TokenNameIdentifier	 ensure CT Decl Capacity
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCTDecl	TokenNameIdentifier	 f CT Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCTDecl	TokenNameIdentifier	 f CT Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fCTDecl	TokenNameIdentifier	 f CT Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fCTDeclIndex	TokenNameIdentifier	 f CT Decl Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fCTDecl	TokenNameIdentifier	 f CT Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
getSimpleTypeDecl	TokenNameIdentifier	 get Simple Type Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
fSTDeclIndex	TokenNameIdentifier	 f ST Decl Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fSTDeclIndex	TokenNameIdentifier	 f ST Decl Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
ensureSTDeclCapacity	TokenNameIdentifier	 ensure ST Decl Capacity
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fSTDecl	TokenNameIdentifier	 f ST Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSTDecl	TokenNameIdentifier	 f ST Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
dvFactory	TokenNameIdentifier	 dv Factory
.	TokenNameDOT	
newXSSimpleTypeDecl	TokenNameIdentifier	 new XS Simple Type Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fSTDecl	TokenNameIdentifier	 f ST Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fSTDeclIndex	TokenNameIdentifier	 f ST Decl Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fSTDecl	TokenNameIdentifier	 f ST Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
getParticleDecl	TokenNameIdentifier	 get Particle Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
fParticleDeclIndex	TokenNameIdentifier	 f Particle Decl Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fParticleDeclIndex	TokenNameIdentifier	 f Particle Decl Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
ensureParticleDeclCapacity	TokenNameIdentifier	 ensure Particle Decl Capacity
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fParticleDecl	TokenNameIdentifier	 f Particle Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fParticleDecl	TokenNameIdentifier	 f Particle Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fParticleDecl	TokenNameIdentifier	 f Particle Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fParticleDeclIndex	TokenNameIdentifier	 f Particle Decl Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fParticleDecl	TokenNameIdentifier	 f Particle Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
getModelGroup	TokenNameIdentifier	 get Model Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
fModelGroupIndex	TokenNameIdentifier	 f Model Group Index
>>	TokenNameRIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fModelGroupIndex	TokenNameIdentifier	 f Model Group Index
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
ensureModelGroupCapacity	TokenNameIdentifier	 ensure Model Group Capacity
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fModelGroup	TokenNameIdentifier	 f Model Group
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fModelGroup	TokenNameIdentifier	 f Model Group
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fModelGroup	TokenNameIdentifier	 f Model Group
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fModelGroupIndex	TokenNameIdentifier	 f Model Group Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fModelGroup	TokenNameIdentifier	 f Model Group
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// REVISIT: do we need decl pool for group declarations, attribute group, 	TokenNameCOMMENT_LINE	REVISIT: do we need decl pool for group declarations, attribute group, 
// notations? 	TokenNameCOMMENT_LINE	notations? 
// it seems like each schema would use a small number of those 	TokenNameCOMMENT_LINE	it seems like each schema would use a small number of those 
// components, so it probably is not worth keeping those components 	TokenNameCOMMENT_LINE	components, so it probably is not worth keeping those components 
// in the pool. 	TokenNameCOMMENT_LINE	in the pool. 
private	TokenNameprivate	
boolean	TokenNameboolean	
ensureElementDeclCapacity	TokenNameIdentifier	 ensure Element Decl Capacity
(	TokenNameLPAREN	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
>=	TokenNameGREATER_EQUAL	
fElementDecl	TokenNameIdentifier	 f Element Decl
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fElementDecl	TokenNameIdentifier	 f Element Decl
=	TokenNameEQUAL	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
fElementDecl	TokenNameIdentifier	 f Element Decl
,	TokenNameCOMMA	
fElementDecl	TokenNameIdentifier	 f Element Decl
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fElementDecl	TokenNameIdentifier	 f Element Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fElementDecl	TokenNameIdentifier	 f Element Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
newsize	TokenNameIdentifier	 newsize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
newarray	TokenNameIdentifier	 newarray
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newarray	TokenNameIdentifier	 newarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newarray	TokenNameIdentifier	 newarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
ensureParticleDeclCapacity	TokenNameIdentifier	 ensure Particle Decl Capacity
(	TokenNameLPAREN	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
>=	TokenNameGREATER_EQUAL	
fParticleDecl	TokenNameIdentifier	 f Particle Decl
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fParticleDecl	TokenNameIdentifier	 f Particle Decl
=	TokenNameEQUAL	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
fParticleDecl	TokenNameIdentifier	 f Particle Decl
,	TokenNameCOMMA	
fParticleDecl	TokenNameIdentifier	 f Particle Decl
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fParticleDecl	TokenNameIdentifier	 f Particle Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fParticleDecl	TokenNameIdentifier	 f Particle Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
ensureModelGroupCapacity	TokenNameIdentifier	 ensure Model Group Capacity
(	TokenNameLPAREN	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
>=	TokenNameGREATER_EQUAL	
fModelGroup	TokenNameIdentifier	 f Model Group
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fModelGroup	TokenNameIdentifier	 f Model Group
=	TokenNameEQUAL	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
fModelGroup	TokenNameIdentifier	 f Model Group
,	TokenNameCOMMA	
fModelGroup	TokenNameIdentifier	 f Model Group
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fModelGroup	TokenNameIdentifier	 f Model Group
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fModelGroup	TokenNameIdentifier	 f Model Group
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
newsize	TokenNameIdentifier	 newsize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
newarray	TokenNameIdentifier	 newarray
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSParticleDecl	TokenNameIdentifier	 XS Particle Decl
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newarray	TokenNameIdentifier	 newarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newarray	TokenNameIdentifier	 newarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
newsize	TokenNameIdentifier	 newsize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
newarray	TokenNameIdentifier	 newarray
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newarray	TokenNameIdentifier	 newarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newarray	TokenNameIdentifier	 newarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
ensureAttrDeclCapacity	TokenNameIdentifier	 ensure Attr Decl Capacity
(	TokenNameLPAREN	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
>=	TokenNameGREATER_EQUAL	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
=	TokenNameEQUAL	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
,	TokenNameCOMMA	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSAttributeDecl	TokenNameIdentifier	 XS Attribute Decl
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
XSAttributeDecl	TokenNameIdentifier	 XS Attribute Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
XSAttributeDecl	TokenNameIdentifier	 XS Attribute Decl
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
newsize	TokenNameIdentifier	 newsize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSAttributeDecl	TokenNameIdentifier	 XS Attribute Decl
newarray	TokenNameIdentifier	 newarray
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSAttributeDecl	TokenNameIdentifier	 XS Attribute Decl
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newarray	TokenNameIdentifier	 newarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newarray	TokenNameIdentifier	 newarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
ensureAttributeUseCapacity	TokenNameIdentifier	 ensure Attribute Use Capacity
(	TokenNameLPAREN	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
>=	TokenNameGREATER_EQUAL	
fAttributeUse	TokenNameIdentifier	 f Attribute Use
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributeUse	TokenNameIdentifier	 f Attribute Use
=	TokenNameEQUAL	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
fAttributeUse	TokenNameIdentifier	 f Attribute Use
,	TokenNameCOMMA	
fAttributeUse	TokenNameIdentifier	 f Attribute Use
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeUse	TokenNameIdentifier	 f Attribute Use
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAttributeUse	TokenNameIdentifier	 f Attribute Use
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
newsize	TokenNameIdentifier	 newsize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
newarray	TokenNameIdentifier	 newarray
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newarray	TokenNameIdentifier	 newarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newarray	TokenNameIdentifier	 newarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
ensureSTDeclCapacity	TokenNameIdentifier	 ensure ST Decl Capacity
(	TokenNameLPAREN	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
>=	TokenNameGREATER_EQUAL	
fSTDecl	TokenNameIdentifier	 f ST Decl
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSTDecl	TokenNameIdentifier	 f ST Decl
=	TokenNameEQUAL	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
fSTDecl	TokenNameIdentifier	 f ST Decl
,	TokenNameCOMMA	
fSTDecl	TokenNameIdentifier	 f ST Decl
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fSTDecl	TokenNameIdentifier	 f ST Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fSTDecl	TokenNameIdentifier	 f ST Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
newsize	TokenNameIdentifier	 newsize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
newarray	TokenNameIdentifier	 newarray
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newarray	TokenNameIdentifier	 newarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newarray	TokenNameIdentifier	 newarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
ensureCTDeclCapacity	TokenNameIdentifier	 ensure CT Decl Capacity
(	TokenNameLPAREN	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
>=	TokenNameGREATER_EQUAL	
fCTDecl	TokenNameIdentifier	 f CT Decl
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCTDecl	TokenNameIdentifier	 f CT Decl
=	TokenNameEQUAL	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
fCTDecl	TokenNameIdentifier	 f CT Decl
,	TokenNameCOMMA	
fCTDecl	TokenNameIdentifier	 f CT Decl
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fCTDecl	TokenNameIdentifier	 f CT Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fCTDecl	TokenNameIdentifier	 f CT Decl
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
newsize	TokenNameIdentifier	 newsize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
newarray	TokenNameIdentifier	 newarray
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newarray	TokenNameIdentifier	 newarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newarray	TokenNameIdentifier	 newarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fElementDeclIndex	TokenNameIdentifier	 f Element Decl Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fParticleDeclIndex	TokenNameIdentifier	 f Particle Decl Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fModelGroupIndex	TokenNameIdentifier	 f Model Group Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fSTDeclIndex	TokenNameIdentifier	 f ST Decl Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCTDeclIndex	TokenNameIdentifier	 f CT Decl Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fAttrDeclIndex	TokenNameIdentifier	 f Attr Decl Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fAttributeUseIndex	TokenNameIdentifier	 f Attribute Use Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
