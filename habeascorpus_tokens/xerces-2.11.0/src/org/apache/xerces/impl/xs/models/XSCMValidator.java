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
/** * Note: State of the content model is stored in the validator * * @xerces.internal * * @author Sandy Gao, IBM * @author Elena Litani, IBM * @version $Id: XSCMValidator.java 806363 2009-08-20 21:18:48Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Note: State of the content model is stored in the validator * @xerces.internal * @author Sandy Gao, IBM @author Elena Litani, IBM @version $Id: XSCMValidator.java 806363 2009-08-20 21:18:48Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XSCMValidator	TokenNameIdentifier	 XSCM Validator
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FIRST_ERROR	TokenNameIdentifier	 FIRST  ERROR
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// on subsequent errors the validator should not report 	TokenNameCOMMENT_LINE	on subsequent errors the validator should not report 
// an error 	TokenNameCOMMENT_LINE	an error 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
SUBSEQUENT_ERROR	TokenNameIdentifier	 SUBSEQUENT  ERROR
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This methods to be called on entering a first element whose type * has this content model. It will return the initial state of the content model * * @return Start state of the content model */	TokenNameCOMMENT_JAVADOC	 This methods to be called on entering a first element whose type has this content model. It will return the initial state of the content model * @return Start state of the content model 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
startContentModel	TokenNameIdentifier	 start Content Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The method corresponds to one transaction in the content model. * * @param elementName * @param state Current state * @return element decl or wildcard decl that * corresponds to the element from the Schema grammar */	TokenNameCOMMENT_JAVADOC	 The method corresponds to one transaction in the content model. * @param elementName @param state Current state @return element decl or wildcard decl that corresponds to the element from the Schema grammar 
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
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
SubstitutionGroupHandler	TokenNameIdentifier	 Substitution Group Handler
subGroupHandler	TokenNameIdentifier	 sub Group Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The method indicates the end of list of children * * @param state Current state of the content model * @return true if the last state was a valid final state */	TokenNameCOMMENT_JAVADOC	 The method indicates the end of list of children * @param state Current state of the content model @return true if the last state was a valid final state 
public	TokenNamepublic	
boolean	TokenNameboolean	
endContentModel	TokenNameIdentifier	 end Content Model
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
;	TokenNameSEMICOLON	
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
;	TokenNameSEMICOLON	
/** * <p>Returns an array containing information about the current repeating term * or <code>null</code> if no occurrence counting was being performed at the * current state.</p> * * <p>If an array is returned it will have a length == 4 and will contain: * <ul> * <li>a[0] :: min occurs</li> * <li>a[1] :: max occurs</li> * <li>a[2] :: current value of the counter</li> * <li>a[3] :: identifier for the repeating term</li> * </ul> * </p> * * @param state the current state * @return an array containing information about the current repeating term */	TokenNameCOMMENT_JAVADOC	 <p>Returns an array containing information about the current repeating term or <code>null</code> if no occurrence counting was being performed at the current state.</p> * <p>If an array is returned it will have a length == 4 and will contain: <ul> <li>a[0] :: min occurs</li> <li>a[1] :: max occurs</li> <li>a[2] :: current value of the counter</li> <li>a[3] :: identifier for the repeating term</li> </ul> </p> * @param state the current state @return an array containing information about the current repeating term 
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
;	TokenNameSEMICOLON	
/** * Returns the name of the term (element or wildcard) for the given identifier. * * @param termId identifier for the element declaration or wildcard * @return the name of the element declaration or wildcard */	TokenNameCOMMENT_JAVADOC	 Returns the name of the term (element or wildcard) for the given identifier. * @param termId identifier for the element declaration or wildcard @return the name of the element declaration or wildcard 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTermName	TokenNameIdentifier	 get Term Name
(	TokenNameLPAREN	
int	TokenNameint	
termId	TokenNameIdentifier	 term Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Checks if this content model has had its min/maxOccurs values reduced for * purposes of speeding up UPA. If so, this content model should not be used * for any purpose other than checking unique particle attribution * * @return a boolean that says whether this content has been compacted for UPA */	TokenNameCOMMENT_JAVADOC	 Checks if this content model has had its min/maxOccurs values reduced for purposes of speeding up UPA. If so, this content model should not be used for any purpose other than checking unique particle attribution * @return a boolean that says whether this content has been compacted for UPA 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompactedForUPA	TokenNameIdentifier	 is Compacted For UPA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XSCMValidator 	TokenNameCOMMENT_LINE	XSCMValidator 
