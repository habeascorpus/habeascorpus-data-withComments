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
dv	TokenNameIdentifier	 dv
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
XSSimpleType	TokenNameIdentifier	 XS Simple Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SymbolHash	TokenNameIdentifier	 Symbol Hash
;	TokenNameSEMICOLON	
/** * A special factory to create/return built-in schema DVs and create user-defined DVs * that includes anyAtomicType, yearMonthDuration and dayTimeDuration * * @xerces.internal * * @author Khaled Noaman, IBM * * @version $Id: ExtendedSchemaDVFactoryImpl.java 710089 2008-11-03 16:01:16Z knoaman $ */	TokenNameCOMMENT_JAVADOC	 A special factory to create/return built-in schema DVs and create user-defined DVs that includes anyAtomicType, yearMonthDuration and dayTimeDuration * @xerces.internal * @author Khaled Noaman, IBM * @version $Id: ExtendedSchemaDVFactoryImpl.java 710089 2008-11-03 16:01:16Z knoaman $ 
public	TokenNamepublic	
class	TokenNameclass	
ExtendedSchemaDVFactoryImpl	TokenNameIdentifier	 Extended Schema DV Factory Impl
extends	TokenNameextends	
BaseSchemaDVFactory	TokenNameIdentifier	 Base Schema DV Factory
{	TokenNameLBRACE	
static	TokenNamestatic	
SymbolHash	TokenNameIdentifier	 Symbol Hash
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
=	TokenNameEQUAL	
new	TokenNamenew	
SymbolHash	TokenNameIdentifier	 Symbol Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
createBuiltInTypes	TokenNameIdentifier	 create Built In Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create all built-in types 	TokenNameCOMMENT_LINE	create all built-in types 
static	TokenNamestatic	
void	TokenNamevoid	
createBuiltInTypes	TokenNameIdentifier	 create Built In Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANYATOMICTYPE	TokenNameIdentifier	 ANYATOMICTYPE
=	TokenNameEQUAL	
"anyAtomicType"	TokenNameStringLiteral	anyAtomicType
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DURATION	TokenNameIdentifier	 DURATION
=	TokenNameEQUAL	
"duration"	TokenNameStringLiteral	duration
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
YEARMONTHDURATION	TokenNameIdentifier	 YEARMONTHDURATION
=	TokenNameEQUAL	
"yearMonthDuration"	TokenNameStringLiteral	yearMonthDuration
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DAYTIMEDURATION	TokenNameIdentifier	 DAYTIMEDURATION
=	TokenNameEQUAL	
"dayTimeDuration"	TokenNameStringLiteral	dayTimeDuration
;	TokenNameSEMICOLON	
createBuiltInTypes	TokenNameIdentifier	 create Built In Types
(	TokenNameLPAREN	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
fAnyAtomicType	TokenNameIdentifier	 f Any Atomic Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add anyAtomicType 	TokenNameCOMMENT_LINE	add anyAtomicType 
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ANYATOMICTYPE	TokenNameIdentifier	 ANYATOMICTYPE
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
fAnyAtomicType	TokenNameIdentifier	 f Any Atomic Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add 2 duration types 	TokenNameCOMMENT_LINE	add 2 duration types 
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
durationDV	TokenNameIdentifier	 duration DV
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
)	TokenNameRPAREN	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
DURATION	TokenNameIdentifier	 DURATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
YEARMONTHDURATION	TokenNameIdentifier	 YEARMONTHDURATION
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
durationDV	TokenNameIdentifier	 duration DV
,	TokenNameCOMMA	
YEARMONTHDURATION	TokenNameIdentifier	 YEARMONTHDURATION
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_YEARMONTHDURATION	TokenNameIdentifier	 DV  YEARMONTHDURATION
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_PARTIAL	TokenNameIdentifier	 ORDERED  PARTIAL
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
YEARMONTHDURATION_DT	TokenNameIdentifier	 YEARMONTHDURATION  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DAYTIMEDURATION	TokenNameIdentifier	 DAYTIMEDURATION
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
durationDV	TokenNameIdentifier	 duration DV
,	TokenNameCOMMA	
DAYTIMEDURATION	TokenNameIdentifier	 DAYTIMEDURATION
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_DAYTIMEDURATION	TokenNameIdentifier	 DV  DAYTIMEDURATION
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_PARTIAL	TokenNameIdentifier	 ORDERED  PARTIAL
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DAYTIMEDURATION_DT	TokenNameIdentifier	 DAYTIMEDURATION  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//createBuiltInTypes() 	TokenNameCOMMENT_LINE	createBuiltInTypes() 
/** * Get a built-in simple type of the given name * REVISIT: its still not decided within the Schema WG how to define the * ur-types and if all simple types should be derived from a * complex type, so as of now we ignore the fact that anySimpleType * is derived from anyType, and pass 'null' as the base of * anySimpleType. It needs to be changed as per the decision taken. * * @param name the name of the datatype * @return the datatype validator of the given name */	TokenNameCOMMENT_JAVADOC	 Get a built-in simple type of the given name REVISIT: its still not decided within the Schema WG how to define the ur-types and if all simple types should be derived from a complex type, so as of now we ignore the fact that anySimpleType is derived from anyType, and pass 'null' as the base of anySimpleType. It needs to be changed as per the decision taken. * @param name the name of the datatype @return the datatype validator of the given name 
public	TokenNamepublic	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
getBuiltInType	TokenNameIdentifier	 get Built In Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
)	TokenNameRPAREN	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get all built-in simple types, which are stored in a hashtable keyed by * the name * * @return a hashtable which contains all built-in simple types */	TokenNameCOMMENT_JAVADOC	 get all built-in simple types, which are stored in a hashtable keyed by the name * @return a hashtable which contains all built-in simple types 
public	TokenNamepublic	
SymbolHash	TokenNameIdentifier	 Symbol Hash
getBuiltInTypes	TokenNameIdentifier	 get Built In Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SymbolHash	TokenNameIdentifier	 Symbol Hash
)	TokenNameRPAREN	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
makeClone	TokenNameIdentifier	 make Clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
