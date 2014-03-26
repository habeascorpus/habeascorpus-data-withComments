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
/** * A content model node. * * @xerces.internal * * @version $Id: CMNode.java 573322 2007-09-06 16:48:47Z peterjm $ */	TokenNameCOMMENT_JAVADOC	 A content model node. * @xerces.internal * @version $Id: CMNode.java 573322 2007-09-06 16:48:47Z peterjm $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
CMNode	TokenNameIdentifier	 CM Node
{	TokenNameLBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
public	TokenNamepublic	
CMNode	TokenNameIdentifier	 CM Node
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Package, abstract methods 	TokenNameCOMMENT_LINE	Package, abstract methods 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// made this public so it could be implemented and used outside this package -neilg. 	TokenNameCOMMENT_LINE	made this public so it could be implemented and used outside this package -neilg. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Package final methods 	TokenNameCOMMENT_LINE	Package final methods 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// made this public so it could be implemented and used outside this package -neilg. 	TokenNameCOMMENT_LINE	made this public so it could be implemented and used outside this package -neilg. 
public	TokenNamepublic	
final	TokenNamefinal	
CMStateSet	TokenNameIdentifier	 CM State Set
firstPos	TokenNameIdentifier	 first Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fFirstPos	TokenNameIdentifier	 f First Pos
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fFirstPos	TokenNameIdentifier	 f First Pos
=	TokenNameEQUAL	
new	TokenNamenew	
CMStateSet	TokenNameIdentifier	 CM State Set
(	TokenNameLPAREN	
fMaxStates	TokenNameIdentifier	 f Max States
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calcFirstPos	TokenNameIdentifier	 calc First Pos
(	TokenNameLPAREN	
fFirstPos	TokenNameIdentifier	 f First Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fFirstPos	TokenNameIdentifier	 f First Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// made this public so it could be implemented and used outside this package -neilg. 	TokenNameCOMMENT_LINE	made this public so it could be implemented and used outside this package -neilg. 
public	TokenNamepublic	
final	TokenNamefinal	
CMStateSet	TokenNameIdentifier	 CM State Set
lastPos	TokenNameIdentifier	 last Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fLastPos	TokenNameIdentifier	 f Last Pos
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fLastPos	TokenNameIdentifier	 f Last Pos
=	TokenNameEQUAL	
new	TokenNamenew	
CMStateSet	TokenNameIdentifier	 CM State Set
(	TokenNameLPAREN	
fMaxStates	TokenNameIdentifier	 f Max States
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calcLastPos	TokenNameIdentifier	 calc Last Pos
(	TokenNameLPAREN	
fLastPos	TokenNameIdentifier	 f Last Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fLastPos	TokenNameIdentifier	 f Last Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
setFollowPos	TokenNameIdentifier	 set Follow Pos
(	TokenNameLPAREN	
CMStateSet	TokenNameIdentifier	 CM State Set
setToAdopt	TokenNameIdentifier	 set To Adopt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fFollowPos	TokenNameIdentifier	 f Follow Pos
=	TokenNameEQUAL	
setToAdopt	TokenNameIdentifier	 set To Adopt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setMaxStates	TokenNameIdentifier	 set Max States
(	TokenNameLPAREN	
int	TokenNameint	
maxStates	TokenNameIdentifier	 max States
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fMaxStates	TokenNameIdentifier	 f Max States
=	TokenNameEQUAL	
maxStates	TokenNameIdentifier	 max States
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompactedForUPA	TokenNameIdentifier	 is Compacted For UPA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCompactedForUPA	TokenNameIdentifier	 f Compacted For UPA
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setIsCompactUPAModel	TokenNameIdentifier	 set Is Compact UPA Model
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCompactedForUPA	TokenNameIdentifier	 f Compacted For UPA
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Protected, abstract methods 	TokenNameCOMMENT_LINE	Protected, abstract methods 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
calcFirstPos	TokenNameIdentifier	 calc First Pos
(	TokenNameLPAREN	
CMStateSet	TokenNameIdentifier	 CM State Set
toSet	TokenNameIdentifier	 to Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
calcLastPos	TokenNameIdentifier	 calc Last Pos
(	TokenNameLPAREN	
CMStateSet	TokenNameIdentifier	 CM State Set
toSet	TokenNameIdentifier	 to Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Private data members 	TokenNameCOMMENT_LINE	Private data members 
// 	TokenNameCOMMENT_LINE	 
// fType 	TokenNameCOMMENT_LINE	fType 
// The type of node. This indicates whether its a leaf or an 	TokenNameCOMMENT_LINE	The type of node. This indicates whether its a leaf or an 
// operation. Though we also do derived classes for these types, 	TokenNameCOMMENT_LINE	operation. Though we also do derived classes for these types, 
// it is too expensive to use runtime typing to find this out. 	TokenNameCOMMENT_LINE	it is too expensive to use runtime typing to find this out. 
// This is one of the ContentSpecNode.NODE_XXX types. 	TokenNameCOMMENT_LINE	This is one of the ContentSpecNode.NODE_XXX types. 
// 	TokenNameCOMMENT_LINE	 
// fFirstPos 	TokenNameCOMMENT_LINE	fFirstPos 
// The set of NFA states that represent the entry states of this 	TokenNameCOMMENT_LINE	The set of NFA states that represent the entry states of this 
// node in the DFA. 	TokenNameCOMMENT_LINE	node in the DFA. 
// 	TokenNameCOMMENT_LINE	 
// fFollowPos 	TokenNameCOMMENT_LINE	fFollowPos 
// The set of NFA states that can be gotten to from from this 	TokenNameCOMMENT_LINE	The set of NFA states that can be gotten to from from this 
// node in the DFA. 	TokenNameCOMMENT_LINE	node in the DFA. 
// 	TokenNameCOMMENT_LINE	 
// fLastPos 	TokenNameCOMMENT_LINE	fLastPos 
// The set of NFA states that represent the final states of this 	TokenNameCOMMENT_LINE	The set of NFA states that represent the final states of this 
// node in the DFA. 	TokenNameCOMMENT_LINE	node in the DFA. 
// 	TokenNameCOMMENT_LINE	 
// fMaxStates 	TokenNameCOMMENT_LINE	fMaxStates 
// The maximum number of states that the NFA has, which means the 	TokenNameCOMMENT_LINE	The maximum number of states that the NFA has, which means the 
// max number of NFA states that have to be traced in the state 	TokenNameCOMMENT_LINE	max number of NFA states that have to be traced in the state 
// sets during the building of the DFA. Its unfortunate that it 	TokenNameCOMMENT_LINE	sets during the building of the DFA. Its unfortunate that it 
// has to be stored redundantly, but we need to fault in the 	TokenNameCOMMENT_LINE	has to be stored redundantly, but we need to fault in the 
// state set members and they have to be sized to this size. We 	TokenNameCOMMENT_LINE	state set members and they have to be sized to this size. We 
// init to to -1 so it will cause an error if its used without 	TokenNameCOMMENT_LINE	init to to -1 so it will cause an error if its used without 
// being initialized. 	TokenNameCOMMENT_LINE	being initialized. 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CMStateSet	TokenNameIdentifier	 CM State Set
fFirstPos	TokenNameIdentifier	 f First Pos
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CMStateSet	TokenNameIdentifier	 CM State Set
fFollowPos	TokenNameIdentifier	 f Follow Pos
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CMStateSet	TokenNameIdentifier	 CM State Set
fLastPos	TokenNameIdentifier	 f Last Pos
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fMaxStates	TokenNameIdentifier	 f Max States
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* * This boolean is true if the model represented by the CMNode does not represent * the true model from the schema, but has had its min/maxOccurs modified for a * more compact representation (for purposes of UPA). */	TokenNameCOMMENT_BLOCK	 This boolean is true if the model represented by the CMNode does not represent the true model from the schema, but has had its min/maxOccurs modified for a more compact representation (for purposes of UPA). 
private	TokenNameprivate	
boolean	TokenNameboolean	
fCompactedForUPA	TokenNameIdentifier	 f Compacted For UPA
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
