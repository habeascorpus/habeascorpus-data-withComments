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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
SubstitutionGroupHandler	TokenNameIdentifier	 Substitution Group Handler
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
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
/** * XSEmptyCM is a derivative of the abstract content model base class that * handles a content model with no children (elements). * * This model validated on the way in. * * @xerces.internal * * @author Elena Litani, IBM * @author Lisa Martin, IBM * @version $Id: XSEmptyCM.java 806363 2009-08-20 21:18:48Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 XSEmptyCM is a derivative of the abstract content model base class that handles a content model with no children (elements). * This model validated on the way in. * @xerces.internal * @author Elena Litani, IBM @author Lisa Martin, IBM @version $Id: XSEmptyCM.java 806363 2009-08-20 21:18:48Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XSEmptyCM	TokenNameIdentifier	 XS Empty CM
implements	TokenNameimplements	
XSCMValidator	TokenNameIdentifier	 XSCM Validator
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
// start the content model: did not see any children 	TokenNameCOMMENT_LINE	start the content model: did not see any children 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
STATE_START	TokenNameIdentifier	 STATE  START
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Vector	TokenNameIdentifier	 Vector
EMPTY	TokenNameIdentifier	 EMPTY
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
// 	TokenNameCOMMENT_LINE	 
// XSCMValidator methods 	TokenNameCOMMENT_LINE	XSCMValidator methods 
// 	TokenNameCOMMENT_LINE	 
/** * This methods to be called on entering a first element whose type * has this content model. It will return the initial state of the content model * * @return Start state of the content model */	TokenNameCOMMENT_JAVADOC	 This methods to be called on entering a first element whose type has this content model. It will return the initial state of the content model * @return Start state of the content model 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
startContentModel	TokenNameIdentifier	 start Content Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
STATE_START	TokenNameIdentifier	 STATE  START
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The method corresponds to one transaction in the content model. * * @param elementName the qualified name of the element * @param currentState Current state * @param subGroupHandler the substitution group handler * @return element index corresponding to the element from the Schema grammar */	TokenNameCOMMENT_JAVADOC	 The method corresponds to one transaction in the content model. * @param elementName the qualified name of the element @param currentState Current state @param subGroupHandler the substitution group handler @return element index corresponding to the element from the Schema grammar 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
oneTransition	TokenNameIdentifier	 one Transition
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentState	TokenNameIdentifier	 current State
,	TokenNameCOMMA	
SubstitutionGroupHandler	TokenNameIdentifier	 Substitution Group Handler
subGroupHandler	TokenNameIdentifier	 sub Group Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// error state 	TokenNameCOMMENT_LINE	error state 
if	TokenNameif	
(	TokenNameLPAREN	
currentState	TokenNameIdentifier	 current State
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentState	TokenNameIdentifier	 current State
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
XSCMValidator	TokenNameIdentifier	 XSCM Validator
.	TokenNameDOT	
SUBSEQUENT_ERROR	TokenNameIdentifier	 SUBSEQUENT  ERROR
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentState	TokenNameIdentifier	 current State
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
XSCMValidator	TokenNameIdentifier	 XSCM Validator
.	TokenNameDOT	
FIRST_ERROR	TokenNameIdentifier	 FIRST  ERROR
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The method indicates the end of list of children * * @param currentState Current state of the content model * @return true if the last state was a valid final state */	TokenNameCOMMENT_JAVADOC	 The method indicates the end of list of children * @param currentState Current state of the content model @return true if the last state was a valid final state 
public	TokenNamepublic	
boolean	TokenNameboolean	
endContentModel	TokenNameIdentifier	 end Content Model
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentState	TokenNameIdentifier	 current State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isFinal	TokenNameIdentifier	 is Final
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
currentState	TokenNameIdentifier	 current State
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// restore content model state: 	TokenNameCOMMENT_LINE	restore content model state: 
// error 	TokenNameCOMMENT_LINE	error 
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * check whether this content violates UPA constraint. * * @param subGroupHandler the substitution group handler * @return true if this content model contains other or list wildcard */	TokenNameCOMMENT_JAVADOC	 check whether this content violates UPA constraint. * @param subGroupHandler the substitution group handler @return true if this content model contains other or list wildcard 
public	TokenNamepublic	
boolean	TokenNameboolean	
checkUniqueParticleAttribution	TokenNameIdentifier	 check Unique Particle Attribution
(	TokenNameLPAREN	
SubstitutionGroupHandler	TokenNameIdentifier	 Substitution Group Handler
subGroupHandler	TokenNameIdentifier	 sub Group Handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLSchemaException	TokenNameIdentifier	 XML Schema Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check which elements are valid to appear at this point. This method also * works if the state is in error, in which case it returns what should * have been seen. * * @param state the current state * @return a Vector whose entries are instances of * either XSWildcardDecl or XSElementDecl. */	TokenNameCOMMENT_JAVADOC	 Check which elements are valid to appear at this point. This method also works if the state is in error, in which case it returns what should have been seen. * @param state the current state @return a Vector whose entries are instances of either XSWildcardDecl or XSElementDecl. 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
whatCanGoHere	TokenNameIdentifier	 what Can Go Here
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
EMPTY	TokenNameIdentifier	 EMPTY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
occurenceInfo	TokenNameIdentifier	 occurence Info
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTermName	TokenNameIdentifier	 get Term Name
(	TokenNameLPAREN	
int	TokenNameint	
termId	TokenNameIdentifier	 term Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompactedForUPA	TokenNameIdentifier	 is Compacted For UPA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XSEmptyCM 	TokenNameCOMMENT_LINE	class XSEmptyCM 
