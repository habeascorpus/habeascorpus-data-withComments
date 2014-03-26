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
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSConstraints	TokenNameIdentifier	 XS Constraints
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
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
/** * XSAllCM implements XSCMValidator and handles &lt;all&gt;. * * @xerces.internal * * @author Pavani Mukthipudi, Sun Microsystems Inc. * @version $Id: XSAllCM.java 806363 2009-08-20 21:18:48Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 XSAllCM implements XSCMValidator and handles &lt;all&gt;. * @xerces.internal * @author Pavani Mukthipudi, Sun Microsystems Inc. @version $Id: XSAllCM.java 806363 2009-08-20 21:18:48Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XSAllCM	TokenNameIdentifier	 XS All CM
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
short	TokenNameshort	
STATE_VALID	TokenNameIdentifier	 STATE  VALID
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
STATE_CHILD	TokenNameIdentifier	 STATE  CHILD
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
final	TokenNamefinal	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
fAllElements	TokenNameIdentifier	 f All Elements
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
fIsOptionalElement	TokenNameIdentifier	 f Is Optional Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
fHasOptionalContent	TokenNameIdentifier	 f Has Optional Content
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fNumElements	TokenNameIdentifier	 f Num Elements
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
XSAllCM	TokenNameIdentifier	 XS All CM
(	TokenNameLPAREN	
boolean	TokenNameboolean	
hasOptionalContent	TokenNameIdentifier	 has Optional Content
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fHasOptionalContent	TokenNameIdentifier	 f Has Optional Content
=	TokenNameEQUAL	
hasOptionalContent	TokenNameIdentifier	 has Optional Content
;	TokenNameSEMICOLON	
fAllElements	TokenNameIdentifier	 f All Elements
=	TokenNameEQUAL	
new	TokenNamenew	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fIsOptionalElement	TokenNameIdentifier	 f Is Optional Element
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isOptional	TokenNameIdentifier	 is Optional
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAllElements	TokenNameIdentifier	 f All Elements
[	TokenNameLBRACKET	
fNumElements	TokenNameIdentifier	 f Num Elements
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
fIsOptionalElement	TokenNameIdentifier	 f Is Optional Element
[	TokenNameLBRACKET	
fNumElements	TokenNameIdentifier	 f Num Elements
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
isOptional	TokenNameIdentifier	 is Optional
;	TokenNameSEMICOLON	
fNumElements	TokenNameIdentifier	 f Num Elements
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// XSCMValidator methods 	TokenNameCOMMENT_LINE	XSCMValidator methods 
// 	TokenNameCOMMENT_LINE	 
/** * This methods to be called on entering a first element whose type * has this content model. It will return the initial state of the * content model * * @return Start state of the content model */	TokenNameCOMMENT_JAVADOC	 This methods to be called on entering a first element whose type has this content model. It will return the initial state of the content model * @return Start state of the content model 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
startContentModel	TokenNameIdentifier	 start Content Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fNumElements	TokenNameIdentifier	 f Num Elements
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
<=	TokenNameLESS_EQUAL	
fNumElements	TokenNameIdentifier	 f Num Elements
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
STATE_START	TokenNameIdentifier	 STATE  START
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// convinient method: when error occurs, to find a matching decl 	TokenNameCOMMENT_LINE	convinient method: when error occurs, to find a matching decl 
// from the candidate elements. 	TokenNameCOMMENT_LINE	from the candidate elements. 
Object	TokenNameIdentifier	 Object
findMatchingDecl	TokenNameIdentifier	 find Matching Decl
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
SubstitutionGroupHandler	TokenNameIdentifier	 Substitution Group Handler
subGroupHandler	TokenNameIdentifier	 sub Group Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
matchingDecl	TokenNameIdentifier	 matching Decl
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
fNumElements	TokenNameIdentifier	 f Num Elements
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchingDecl	TokenNameIdentifier	 matching Decl
=	TokenNameEQUAL	
subGroupHandler	TokenNameIdentifier	 sub Group Handler
.	TokenNameDOT	
getMatchingElemDecl	TokenNameIdentifier	 get Matching Elem Decl
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
fAllElements	TokenNameIdentifier	 f All Elements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchingDecl	TokenNameIdentifier	 matching Decl
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
matchingDecl	TokenNameIdentifier	 matching Decl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The method corresponds to one transition in the content model. * * @param elementName * @param currentState Current state * @return an element decl object */	TokenNameCOMMENT_JAVADOC	 The method corresponds to one transition in the content model. * @param elementName @param currentState Current state @return an element decl object 
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
findMatchingDecl	TokenNameIdentifier	 find Matching Decl
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
subGroupHandler	TokenNameIdentifier	 sub Group Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// seen child 	TokenNameCOMMENT_LINE	seen child 
currentState	TokenNameIdentifier	 current State
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
STATE_CHILD	TokenNameIdentifier	 STATE  CHILD
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
matchingDecl	TokenNameIdentifier	 matching Decl
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
fNumElements	TokenNameIdentifier	 f Num Elements
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we only try to look for a matching decl if we have not seen 	TokenNameCOMMENT_LINE	we only try to look for a matching decl if we have not seen 
// this element yet. 	TokenNameCOMMENT_LINE	this element yet. 
if	TokenNameif	
(	TokenNameLPAREN	
currentState	TokenNameIdentifier	 current State
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
STATE_START	TokenNameIdentifier	 STATE  START
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
matchingDecl	TokenNameIdentifier	 matching Decl
=	TokenNameEQUAL	
subGroupHandler	TokenNameIdentifier	 sub Group Handler
.	TokenNameDOT	
getMatchingElemDecl	TokenNameIdentifier	 get Matching Elem Decl
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
fAllElements	TokenNameIdentifier	 f All Elements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchingDecl	TokenNameIdentifier	 matching Decl
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// found the decl, mark this element as "seen". 	TokenNameCOMMENT_LINE	found the decl, mark this element as "seen". 
currentState	TokenNameIdentifier	 current State
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
STATE_VALID	TokenNameIdentifier	 STATE  VALID
;	TokenNameSEMICOLON	
return	TokenNamereturn	
matchingDecl	TokenNameIdentifier	 matching Decl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// couldn't find the decl, change to error state. 	TokenNameCOMMENT_LINE	couldn't find the decl, change to error state. 
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
findMatchingDecl	TokenNameIdentifier	 find Matching Decl
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
subGroupHandler	TokenNameIdentifier	 sub Group Handler
)	TokenNameRPAREN	
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
int	TokenNameint	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
currentState	TokenNameIdentifier	 current State
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
XSCMValidator	TokenNameIdentifier	 XSCM Validator
.	TokenNameDOT	
FIRST_ERROR	TokenNameIdentifier	 FIRST  ERROR
||	TokenNameOR_OR	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
XSCMValidator	TokenNameIdentifier	 XSCM Validator
.	TokenNameDOT	
SUBSEQUENT_ERROR	TokenNameIdentifier	 SUBSEQUENT  ERROR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If <all> has minOccurs of zero and there are 	TokenNameCOMMENT_LINE	If <all> has minOccurs of zero and there are 
// no children to validate, it is trivially valid 	TokenNameCOMMENT_LINE	no children to validate, it is trivially valid 
if	TokenNameif	
(	TokenNameLPAREN	
fHasOptionalContent	TokenNameIdentifier	 f Has Optional Content
&&	TokenNameAND_AND	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
STATE_START	TokenNameIdentifier	 STATE  START
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
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
fNumElements	TokenNameIdentifier	 f Num Elements
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if one element is required, but not present, then error 	TokenNameCOMMENT_LINE	if one element is required, but not present, then error 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fIsOptionalElement	TokenNameIdentifier	 f Is Optional Element
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&&	TokenNameAND_AND	
currentState	TokenNameIdentifier	 current State
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
STATE_START	TokenNameIdentifier	 STATE  START
)	TokenNameRPAREN	
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
// check whether there is conflict between any two leaves 	TokenNameCOMMENT_LINE	check whether there is conflict between any two leaves 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fNumElements	TokenNameIdentifier	 f Num Elements
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
fNumElements	TokenNameIdentifier	 f Num Elements
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
XSConstraints	TokenNameIdentifier	 XS Constraints
.	TokenNameDOT	
overlapUPA	TokenNameIdentifier	 overlap UPA
(	TokenNameLPAREN	
fAllElements	TokenNameIdentifier	 f All Elements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
fAllElements	TokenNameIdentifier	 f All Elements
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
subGroupHandler	TokenNameIdentifier	 sub Group Handler
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: do we want to report all errors? or just one? 	TokenNameCOMMENT_LINE	REVISIT: do we want to report all errors? or just one? 
throw	TokenNamethrow	
new	TokenNamenew	
XMLSchemaException	TokenNameIdentifier	 XML Schema Exception
(	TokenNameLPAREN	
"cos-nonambig"	TokenNameStringLiteral	cos-nonambig
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fAllElements	TokenNameIdentifier	 f All Elements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fAllElements	TokenNameIdentifier	 f All Elements
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
Vector	TokenNameIdentifier	 Vector
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
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
fNumElements	TokenNameIdentifier	 f Num Elements
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we only try to look for a matching decl if we have not seen 	TokenNameCOMMENT_LINE	we only try to look for a matching decl if we have not seen 
// this element yet. 	TokenNameCOMMENT_LINE	this element yet. 
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
STATE_START	TokenNameIdentifier	 STATE  START
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
fAllElements	TokenNameIdentifier	 f All Elements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
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
// class XSAllCM 	TokenNameCOMMENT_LINE	class XSAllCM 
