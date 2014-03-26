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
XSImplementationImpl	TokenNameIdentifier	 XS Implementation Impl
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
/** * Allows to retrieve <code>XSImplementation</code>, DOM Level 3 Core and LS implementations * and PSVI implementation. * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#DOMImplementationSource'>Document Object Model (DOM) Level 3 Core Specification</a>. * * @xerces.internal * * @author Elena Litani, IBM * @version $Id: DOMXSImplementationSourceImpl.java 603686 2007-12-12 17:51:23Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Allows to retrieve <code>XSImplementation</code>, DOM Level 3 Core and LS implementations and PSVI implementation. <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#DOMImplementationSource'>Document Object Model (DOM) Level 3 Core Specification</a>. * @xerces.internal * @author Elena Litani, IBM @version $Id: DOMXSImplementationSourceImpl.java 603686 2007-12-12 17:51:23Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMXSImplementationSourceImpl	TokenNameIdentifier	 DOMXS Implementation Source Impl
extends	TokenNameextends	
DOMImplementationSourceImpl	TokenNameIdentifier	 DOM Implementation Source Impl
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
DOMImplementation	TokenNameIdentifier	 DOM Implementation
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getDOMImplementation	TokenNameIdentifier	 get DOM Implementation
(	TokenNameLPAREN	
features	TokenNameIdentifier	 features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
impl	TokenNameIdentifier	 impl
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
impl	TokenNameIdentifier	 impl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if not try the PSVIDOMImplementation 	TokenNameCOMMENT_LINE	if not try the PSVIDOMImplementation 
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
PSVIDOMImplementationImpl	TokenNameIdentifier	 PSVIDOM Implementation Impl
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
// if not try the XSImplementation 	TokenNameCOMMENT_LINE	if not try the XSImplementation 
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
XSImplementationImpl	TokenNameIdentifier	 XS Implementation Impl
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
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
implementations	TokenNameIdentifier	 implementations
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// first check whether the CoreDOMImplementation would do 	TokenNameCOMMENT_LINE	first check whether the CoreDOMImplementation would do 
DOMImplementationList	TokenNameIdentifier	 DOM Implementation List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getDOMImplementationList	TokenNameIdentifier	 get DOM Implementation List
(	TokenNameLPAREN	
features	TokenNameIdentifier	 features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add core DOMImplementations 	TokenNameCOMMENT_LINE	Add core DOMImplementations 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
implementations	TokenNameIdentifier	 implementations
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
PSVIDOMImplementationImpl	TokenNameIdentifier	 PSVIDOM Implementation Impl
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
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
XSImplementationImpl	TokenNameIdentifier	 XS Implementation Impl
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
}	TokenNameRBRACE	
