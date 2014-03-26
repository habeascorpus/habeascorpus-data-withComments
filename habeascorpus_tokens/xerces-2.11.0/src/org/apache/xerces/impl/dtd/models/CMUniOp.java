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
dtd	TokenNameIdentifier	 dtd
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
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
;	TokenNameSEMICOLON	
/** * Content model Uni-Op node. * * @xerces.internal * * @version $Id: CMUniOp.java 572057 2007-09-02 18:03:20Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Content model Uni-Op node. * @xerces.internal * @version $Id: CMUniOp.java 572057 2007-09-02 18:03:20Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
CMUniOp	TokenNameIdentifier	 CM Uni Op
extends	TokenNameextends	
CMNode	TokenNameIdentifier	 CM Node
{	TokenNameLBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
public	TokenNamepublic	
CMUniOp	TokenNameIdentifier	 CM Uni Op
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
CMNode	TokenNameIdentifier	 CM Node
childNode	TokenNameIdentifier	 child Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Insure that its one of the types we require 	TokenNameCOMMENT_LINE	Insure that its one of the types we require 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ZERO_OR_ONE	TokenNameIdentifier	 CONTENTSPECNODE  ZERO  OR  ONE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ZERO_OR_MORE	TokenNameIdentifier	 CONTENTSPECNODE  ZERO  OR  MORE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ONE_OR_MORE	TokenNameIdentifier	 CONTENTSPECNODE  ONE  OR  MORE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"ImplementationMessages.VAL_UST"	TokenNameStringLiteral	ImplementationMessages.VAL_UST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Store the node and init any data that needs it 	TokenNameCOMMENT_LINE	Store the node and init any data that needs it 
fChild	TokenNameIdentifier	 f Child
=	TokenNameEQUAL	
childNode	TokenNameIdentifier	 child Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Package, final methods 	TokenNameCOMMENT_LINE	Package, final methods 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
final	TokenNamefinal	
CMNode	TokenNameIdentifier	 CM Node
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fChild	TokenNameIdentifier	 f Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Package, inherited methods 	TokenNameCOMMENT_LINE	Package, inherited methods 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// For debugging purposes, make sure we got rid of all non '*' 	TokenNameCOMMENT_LINE	For debugging purposes, make sure we got rid of all non '*' 
// repetitions. Otherwise, '*' style nodes are always nullable. 	TokenNameCOMMENT_LINE	repetitions. Otherwise, '*' style nodes are always nullable. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ONE_OR_MORE	TokenNameIdentifier	 CONTENTSPECNODE  ONE  OR  MORE
)	TokenNameRPAREN	
return	TokenNamereturn	
fChild	TokenNameIdentifier	 f Child
.	TokenNameDOT	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Protected, inherited methods 	TokenNameCOMMENT_LINE	Protected, inherited methods 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
protected	TokenNameprotected	
void	TokenNamevoid	
calcFirstPos	TokenNameIdentifier	 calc First Pos
(	TokenNameLPAREN	
CMStateSet	TokenNameIdentifier	 CM State Set
toSet	TokenNameIdentifier	 to Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Its just based on our child node's first pos 	TokenNameCOMMENT_LINE	Its just based on our child node's first pos 
toSet	TokenNameIdentifier	 to Set
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
fChild	TokenNameIdentifier	 f Child
.	TokenNameDOT	
firstPos	TokenNameIdentifier	 first Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
calcLastPos	TokenNameIdentifier	 calc Last Pos
(	TokenNameLPAREN	
CMStateSet	TokenNameIdentifier	 CM State Set
toSet	TokenNameIdentifier	 to Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Its just based on our child node's last pos 	TokenNameCOMMENT_LINE	Its just based on our child node's last pos 
toSet	TokenNameIdentifier	 to Set
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
fChild	TokenNameIdentifier	 f Child
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Private data members 	TokenNameCOMMENT_LINE	Private data members 
// 	TokenNameCOMMENT_LINE	 
// fChild 	TokenNameCOMMENT_LINE	fChild 
// This is the reference to the one child that we have for this 	TokenNameCOMMENT_LINE	This is the reference to the one child that we have for this 
// unary operation. 	TokenNameCOMMENT_LINE	unary operation. 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
private	TokenNameprivate	
final	TokenNamefinal	
CMNode	TokenNameIdentifier	 CM Node
fChild	TokenNameIdentifier	 f Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
