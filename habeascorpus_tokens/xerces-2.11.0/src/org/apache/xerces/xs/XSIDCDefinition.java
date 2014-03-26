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
/** * This interface represents the Identity-constraint Definition schema * component. */	TokenNameCOMMENT_JAVADOC	 This interface represents the Identity-constraint Definition schema component. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSIDCDefinition	TokenNameIdentifier	 XSIDC Definition
extends	TokenNameextends	
XSObject	TokenNameIdentifier	 XS Object
{	TokenNameLBRACE	
// Identity Constraints 	TokenNameCOMMENT_LINE	Identity Constraints 
/** * See the definition of <code>key</code> in the identity-constraint * category. */	TokenNameCOMMENT_JAVADOC	 See the definition of <code>key</code> in the identity-constraint category. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
IC_KEY	TokenNameIdentifier	 IC  KEY
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * See the definition of <code>keyref</code> in the identity-constraint * category. */	TokenNameCOMMENT_JAVADOC	 See the definition of <code>keyref</code> in the identity-constraint category. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
IC_KEYREF	TokenNameIdentifier	 IC  KEYREF
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * See the definition of <code>unique</code> in the identity-constraint * category. */	TokenNameCOMMENT_JAVADOC	 See the definition of <code>unique</code> in the identity-constraint category. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
IC_UNIQUE	TokenNameIdentifier	 IC  UNIQUE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [identity-constraint category]: one of key, keyref or unique. */	TokenNameCOMMENT_JAVADOC	 [identity-constraint category]: one of key, keyref or unique. 
public	TokenNamepublic	
short	TokenNameshort	
getCategory	TokenNameIdentifier	 get Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [selector]: a restricted XPath 1.0 expression. */	TokenNameCOMMENT_JAVADOC	 [selector]: a restricted XPath 1.0 expression. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSelectorStr	TokenNameIdentifier	 get Selector Str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [fields]: a non-empty list of restricted XPath 1.0 expressions. */	TokenNameCOMMENT_JAVADOC	 [fields]: a non-empty list of restricted XPath 1.0 expressions. 
public	TokenNamepublic	
StringList	TokenNameIdentifier	 String List
getFieldStrs	TokenNameIdentifier	 get Field Strs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [referenced key]: required if [identity-constraint category] is keyref, * <code>null</code> otherwise. An identity-constraint definition with [ * identity-constraint category] equal to key or unique. */	TokenNameCOMMENT_JAVADOC	 [referenced key]: required if [identity-constraint category] is keyref, <code>null</code> otherwise. An identity-constraint definition with [ identity-constraint category] equal to key or unique. 
public	TokenNamepublic	
XSIDCDefinition	TokenNameIdentifier	 XSIDC Definition
getRefKey	TokenNameIdentifier	 get Ref Key
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
