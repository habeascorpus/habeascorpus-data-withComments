/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
;	TokenNameSEMICOLON	
/** * This interface represents the Wildcard schema component. */	TokenNameCOMMENT_JAVADOC	 This interface represents the Wildcard schema component. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSWildcard	TokenNameIdentifier	 XS Wildcard
extends	TokenNameextends	
XSTerm	TokenNameIdentifier	 XS Term
{	TokenNameLBRACE	
// Namespace Constraint 	TokenNameCOMMENT_LINE	Namespace Constraint 
/** * Namespace Constraint: any namespace is allowed. */	TokenNameCOMMENT_JAVADOC	 Namespace Constraint: any namespace is allowed. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NSCONSTRAINT_ANY	TokenNameIdentifier	 NSCONSTRAINT  ANY
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Namespace Constraint: namespaces in the list are not allowed. */	TokenNameCOMMENT_JAVADOC	 Namespace Constraint: namespaces in the list are not allowed. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NSCONSTRAINT_NOT	TokenNameIdentifier	 NSCONSTRAINT  NOT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Namespace Constraint: namespaces in the list are allowed. */	TokenNameCOMMENT_JAVADOC	 Namespace Constraint: namespaces in the list are allowed. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NSCONSTRAINT_LIST	TokenNameIdentifier	 NSCONSTRAINT  LIST
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Process contents 	TokenNameCOMMENT_LINE	Process contents 
/** * There must be a top-level declaration for the item available, or the * item must have an xsi:type, and the item must be valid as appropriate. */	TokenNameCOMMENT_JAVADOC	 There must be a top-level declaration for the item available, or the item must have an xsi:type, and the item must be valid as appropriate. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PC_STRICT	TokenNameIdentifier	 PC  STRICT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * No constraints at all: the item must simply be well-formed XML. */	TokenNameCOMMENT_JAVADOC	 No constraints at all: the item must simply be well-formed XML. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PC_SKIP	TokenNameIdentifier	 PC  SKIP
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * If the item, or any items among its [children] is an element * information item, has a uniquely determined declaration available, it * must be valid with respect to that definition, that is, validate * where you can and do not worry when you cannot. */	TokenNameCOMMENT_JAVADOC	 If the item, or any items among its [children] is an element information item, has a uniquely determined declaration available, it must be valid with respect to that definition, that is, validate where you can and do not worry when you cannot. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PC_LAX	TokenNameIdentifier	 PC  LAX
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Namespace constraint: A constraint type: any, not, list. */	TokenNameCOMMENT_JAVADOC	 Namespace constraint: A constraint type: any, not, list. 
public	TokenNamepublic	
short	TokenNameshort	
getConstraintType	TokenNameIdentifier	 get Constraint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Namespace constraint: For <code>constraintType</code> * <code>NSCONSTRAINT_LIST</code>, the list contains allowed namespaces. * For <code>constraintType</code> <code>NSCONSTRAINT_NOT</code>, the * list contains disallowed namespaces. For <code>constraintType</code> * <code>NSCONSTRAINT_ANY</code>, the <code>StringList</code> is empty. */	TokenNameCOMMENT_JAVADOC	 Namespace constraint: For <code>constraintType</code> <code>NSCONSTRAINT_LIST</code>, the list contains allowed namespaces. For <code>constraintType</code> <code>NSCONSTRAINT_NOT</code>, the list contains disallowed namespaces. For <code>constraintType</code> <code>NSCONSTRAINT_ANY</code>, the <code>StringList</code> is empty. 
public	TokenNamepublic	
StringList	TokenNameIdentifier	 String List
getNsConstraintList	TokenNameIdentifier	 get Ns Constraint List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [process contents]: one of skip, lax or strict. Valid constants values * are: <code>PC_LAX</code>, <code>PC_SKIP</code> and * <code>PC_STRICT</code>. */	TokenNameCOMMENT_JAVADOC	 [process contents]: one of skip, lax or strict. Valid constants values are: <code>PC_LAX</code>, <code>PC_SKIP</code> and <code>PC_STRICT</code>. 
public	TokenNamepublic	
short	TokenNameshort	
getProcessContents	TokenNameIdentifier	 get Process Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * An annotation if it exists, otherwise <code>null</code>. If not null * then the first [annotation] from the sequence of annotations. */	TokenNameCOMMENT_JAVADOC	 An annotation if it exists, otherwise <code>null</code>. If not null then the first [annotation] from the sequence of annotations. 
public	TokenNamepublic	
XSAnnotation	TokenNameIdentifier	 XS Annotation
getAnnotation	TokenNameIdentifier	 get Annotation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A sequence of [annotations] or an empty <code>XSObjectList</code>. */	TokenNameCOMMENT_JAVADOC	 A sequence of [annotations] or an empty <code>XSObjectList</code>. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getAnnotations	TokenNameIdentifier	 get Annotations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
