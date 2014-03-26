/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMImplementationList	TokenNameIdentifier	 DOM Implementation List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMImplementationSource	TokenNameIdentifier	 DOM Implementation Source
;	TokenNameSEMICOLON	
/** * Supply one the right implementation, based upon requested features. Each * implemented <code>DOMImplementationSource</code> object is listed in the * binding-specific list of available sources so that its * <code>DOMImplementation</code> objects are made available. * * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#DOMImplementationSource'>Document Object Model (DOM) Level 3 Core Specification</a>. * * @xerces.internal * * @version $Id: DOMImplementationSourceImpl.java 603686 2007-12-12 17:51:23Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Supply one the right implementation, based upon requested features. Each implemented <code>DOMImplementationSource</code> object is listed in the binding-specific list of available sources so that its <code>DOMImplementation</code> objects are made available. * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#DOMImplementationSource'>Document Object Model (DOM) Level 3 Core Specification</a>. * @xerces.internal * @version $Id: DOMImplementationSourceImpl.java 603686 2007-12-12 17:51:23Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMImplementationSourceImpl	TokenNameIdentifier	 DOM Implementation Source Impl
implements	TokenNameimplements	
DOMImplementationSource	TokenNameIdentifier	 DOM Implementation Source
{	TokenNameLBRACE	
/** * A method to request a DOM implementation. * @param features A string that specifies which features are required. * This is a space separated list in which each feature is specified * by its name optionally followed by a space and a version number. * This is something like: "XML 1.0 Traversal Events 2.0" * @return An implementation that has the desired features, or * <code>null</code> if this source has none. */	TokenNameCOMMENT_JAVADOC	 A method to request a DOM implementation. @param features A string that specifies which features are required. This is a space separated list in which each feature is specified by its name optionally followed by a space and a version number. This is something like: "XML 1.0 Traversal Events 2.0" @return An implementation that has the desired features, or <code>null</code> if this source has none. 
public	TokenNamepublic	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
getDOMImplementation	TokenNameIdentifier	 get DOM Implementation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
features	TokenNameIdentifier	 features
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first check whether the CoreDOMImplementation would do 	TokenNameCOMMENT_LINE	first check whether the CoreDOMImplementation would do 
DOMImplementation	TokenNameIdentifier	 DOM Implementation
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
CoreDOMImplementationImpl	TokenNameIdentifier	 Core DOM Implementation Impl
.	TokenNameDOT	
getDOMImplementation	TokenNameIdentifier	 get DOM Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testImpl	TokenNameIdentifier	 test Impl
(	TokenNameLPAREN	
impl	TokenNameIdentifier	 impl
,	TokenNameCOMMA	
features	TokenNameIdentifier	 features
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
impl	TokenNameIdentifier	 impl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if not try the DOMImplementation 	TokenNameCOMMENT_LINE	if not try the DOMImplementation 
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
DOMImplementationImpl	TokenNameIdentifier	 DOM Implementation Impl
.	TokenNameDOT	
getDOMImplementation	TokenNameIdentifier	 get DOM Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testImpl	TokenNameIdentifier	 test Impl
(	TokenNameLPAREN	
impl	TokenNameIdentifier	 impl
,	TokenNameCOMMA	
features	TokenNameIdentifier	 features
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
impl	TokenNameIdentifier	 impl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A method to request a list of DOM implementations that support the * specified features and versions, as specified in . * @param features A string that specifies which features and versions * are required. This is a space separated list in which each feature * is specified by its name optionally followed by a space and a * version number. This is something like: "XML 3.0 Traversal +Events * 2.0" * @return A list of DOM implementations that support the desired * features. */	TokenNameCOMMENT_JAVADOC	 A method to request a list of DOM implementations that support the specified features and versions, as specified in . @param features A string that specifies which features and versions are required. This is a space separated list in which each feature is specified by its name optionally followed by a space and a version number. This is something like: "XML 3.0 Traversal +Events 2.0" @return A list of DOM implementations that support the desired features. 
public	TokenNamepublic	
DOMImplementationList	TokenNameIdentifier	 DOM Implementation List
getDOMImplementationList	TokenNameIdentifier	 get DOM Implementation List
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
features	TokenNameIdentifier	 features
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first check whether the CoreDOMImplementation would do 	TokenNameCOMMENT_LINE	first check whether the CoreDOMImplementation would do 
DOMImplementation	TokenNameIdentifier	 DOM Implementation
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
CoreDOMImplementationImpl	TokenNameIdentifier	 Core DOM Implementation Impl
.	TokenNameDOT	
getDOMImplementation	TokenNameIdentifier	 get DOM Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
implementations	TokenNameIdentifier	 implementations
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testImpl	TokenNameIdentifier	 test Impl
(	TokenNameLPAREN	
impl	TokenNameIdentifier	 impl
,	TokenNameCOMMA	
features	TokenNameIdentifier	 features
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
implementations	TokenNameIdentifier	 implementations
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
impl	TokenNameIdentifier	 impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
DOMImplementationImpl	TokenNameIdentifier	 DOM Implementation Impl
.	TokenNameDOT	
getDOMImplementation	TokenNameIdentifier	 get DOM Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testImpl	TokenNameIdentifier	 test Impl
(	TokenNameLPAREN	
impl	TokenNameIdentifier	 impl
,	TokenNameCOMMA	
features	TokenNameIdentifier	 features
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
implementations	TokenNameIdentifier	 implementations
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
impl	TokenNameIdentifier	 impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DOMImplementationListImpl	TokenNameIdentifier	 DOM Implementation List Impl
(	TokenNameLPAREN	
implementations	TokenNameIdentifier	 implementations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
testImpl	TokenNameIdentifier	 test Impl
(	TokenNameLPAREN	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
impl	TokenNameIdentifier	 impl
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
features	TokenNameIdentifier	 features
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
features	TokenNameIdentifier	 features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
feature	TokenNameIdentifier	 feature
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
feature	TokenNameIdentifier	 feature
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isVersion	TokenNameIdentifier	 is Version
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
isVersion	TokenNameIdentifier	 is Version
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isVersion	TokenNameIdentifier	 is Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
hasFeature	TokenNameIdentifier	 has Feature
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
feature	TokenNameIdentifier	 feature
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
feature	TokenNameIdentifier	 feature
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
hasFeature	TokenNameIdentifier	 has Feature
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
feature	TokenNameIdentifier	 feature
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
