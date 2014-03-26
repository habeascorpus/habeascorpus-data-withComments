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
identity	TokenNameIdentifier	 identity
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
XSIDCDefinition	TokenNameIdentifier	 XSIDC Definition
;	TokenNameSEMICOLON	
/** * Schema key reference identity constraint. * * @xerces.internal * * @author Andy Clark, IBM * @version $Id: KeyRef.java 572110 2007-09-02 19:04:44Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Schema key reference identity constraint. * @xerces.internal * @author Andy Clark, IBM @version $Id: KeyRef.java 572110 2007-09-02 19:04:44Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
KeyRef	TokenNameIdentifier	 Key Ref
extends	TokenNameextends	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** The key (or unique) being referred to. */	TokenNameCOMMENT_JAVADOC	 The key (or unique) being referred to. 
protected	TokenNameprotected	
final	TokenNamefinal	
UniqueOrKey	TokenNameIdentifier	 Unique Or Key
fKey	TokenNameIdentifier	 f Key
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a keyref with the specified name. */	TokenNameCOMMENT_JAVADOC	 Constructs a keyref with the specified name. 
public	TokenNamepublic	
KeyRef	TokenNameIdentifier	 Key Ref
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
identityConstraintName	TokenNameIdentifier	 identity Constraint Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
,	TokenNameCOMMA	
UniqueOrKey	TokenNameIdentifier	 Unique Or Key
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
identityConstraintName	TokenNameIdentifier	 identity Constraint Name
,	TokenNameCOMMA	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fKey	TokenNameIdentifier	 f Key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
IC_KEYREF	TokenNameIdentifier	 IC  KEYREF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(String,String,String) 	TokenNameCOMMENT_LINE	<init>(String,String,String) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns the key being referred to. */	TokenNameCOMMENT_JAVADOC	 Returns the key being referred to. 
public	TokenNamepublic	
UniqueOrKey	TokenNameIdentifier	 Unique Or Key
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fKey	TokenNameIdentifier	 f Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getKey(): int 	TokenNameCOMMENT_LINE	getKey(): int 
/** * {referenced key} Required if {identity-constraint category} is keyref, * forbidden otherwise. An identity-constraint definition with * {identity-constraint category} equal to key or unique. */	TokenNameCOMMENT_JAVADOC	 {referenced key} Required if {identity-constraint category} is keyref, forbidden otherwise. An identity-constraint definition with {identity-constraint category} equal to key or unique. 
public	TokenNamepublic	
XSIDCDefinition	TokenNameIdentifier	 XSIDC Definition
getRefKey	TokenNameIdentifier	 get Ref Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fKey	TokenNameIdentifier	 f Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class KeyRef 	TokenNameCOMMENT_LINE	class KeyRef 
