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
validation	TokenNameIdentifier	 validation
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
/** * ValidationManager is a coordinator property for validators in the * pipeline. Each validator must know how to interact with * this property. Validators are not required to know what kind of * other validators present in the pipeline, but should understand * that there are others and that some coordination is required. * * @xerces.internal * * @author Elena Litani, IBM * @version $Id: ValidationManager.java 606491 2007-12-22 21:00:53Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 ValidationManager is a coordinator property for validators in the pipeline. Each validator must know how to interact with this property. Validators are not required to know what kind of other validators present in the pipeline, but should understand that there are others and that some coordination is required. * @xerces.internal * @author Elena Litani, IBM @version $Id: ValidationManager.java 606491 2007-12-22 21:00:53Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
ValidationManager	TokenNameIdentifier	 Validation Manager
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
fVSs	TokenNameIdentifier	 f V Ss
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
fGrammarFound	TokenNameIdentifier	 f Grammar Found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// used by the DTD validator to tell other components that it has a 	TokenNameCOMMENT_LINE	used by the DTD validator to tell other components that it has a 
// cached DTD in hand so there's no reason to 	TokenNameCOMMENT_LINE	cached DTD in hand so there's no reason to 
// scan external subset or entity decls. 	TokenNameCOMMENT_LINE	scan external subset or entity decls. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fCachedDTD	TokenNameIdentifier	 f Cached DTD
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Each validator should call this method to add its ValidationState into * the validation manager. */	TokenNameCOMMENT_JAVADOC	 Each validator should call this method to add its ValidationState into the validation manager. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
addValidationState	TokenNameIdentifier	 add Validation State
(	TokenNameLPAREN	
ValidationState	TokenNameIdentifier	 Validation State
vs	TokenNameIdentifier	 vs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fVSs	TokenNameIdentifier	 f V Ss
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
vs	TokenNameIdentifier	 vs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the information required to validate entity values. */	TokenNameCOMMENT_JAVADOC	 Set the information required to validate entity values. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setEntityState	TokenNameIdentifier	 set Entity State
(	TokenNameLPAREN	
EntityState	TokenNameIdentifier	 Entity State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fVSs	TokenNameIdentifier	 f V Ss
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ValidationState	TokenNameIdentifier	 Validation State
)	TokenNameRPAREN	
fVSs	TokenNameIdentifier	 f V Ss
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setEntityState	TokenNameIdentifier	 set Entity State
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setGrammarFound	TokenNameIdentifier	 set Grammar Found
(	TokenNameLPAREN	
boolean	TokenNameboolean	
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGrammarFound	TokenNameIdentifier	 f Grammar Found
=	TokenNameEQUAL	
grammar	TokenNameIdentifier	 grammar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isGrammarFound	TokenNameIdentifier	 is Grammar Found
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fGrammarFound	TokenNameIdentifier	 f Grammar Found
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setCachedDTD	TokenNameIdentifier	 set Cached DTD
(	TokenNameLPAREN	
boolean	TokenNameboolean	
cachedDTD	TokenNameIdentifier	 cached DTD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCachedDTD	TokenNameIdentifier	 f Cached DTD
=	TokenNameEQUAL	
cachedDTD	TokenNameIdentifier	 cached DTD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setCachedDTD(boolean) 	TokenNameCOMMENT_LINE	setCachedDTD(boolean) 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isCachedDTD	TokenNameIdentifier	 is Cached DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCachedDTD	TokenNameIdentifier	 f Cached DTD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isCachedDTD(): boolean 	TokenNameCOMMENT_LINE	isCachedDTD(): boolean 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fVSs	TokenNameIdentifier	 f V Ss
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fGrammarFound	TokenNameIdentifier	 f Grammar Found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fCachedDTD	TokenNameIdentifier	 f Cached DTD
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
