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
DocumentType	TokenNameIdentifier	 Document Type
;	TokenNameSEMICOLON	
/** * The DOMImplementation class is description of a particular * implementation of the Document Object Model. As such its data is * static, shared by all instances of this implementation. * <P> * The DOM API requires that it be a real object rather than static * methods. However, there's nothing that says it can't be a singleton, * so that's how I've implemented it. * * @xerces.internal * * @version $Id: PSVIDOMImplementationImpl.java 809736 2009-08-31 20:43:19Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 The DOMImplementation class is description of a particular implementation of the Document Object Model. As such its data is static, shared by all instances of this implementation. <P> The DOM API requires that it be a real object rather than static methods. However, there's nothing that says it can't be a singleton, so that's how I've implemented it. * @xerces.internal * @version $Id: PSVIDOMImplementationImpl.java 809736 2009-08-31 20:43:19Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
PSVIDOMImplementationImpl	TokenNameIdentifier	 PSVIDOM Implementation Impl
extends	TokenNameextends	
DOMImplementationImpl	TokenNameIdentifier	 DOM Implementation Impl
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
// static 	TokenNameCOMMENT_LINE	static 
/** Dom implementation singleton. */	TokenNameCOMMENT_JAVADOC	 Dom implementation singleton. 
static	TokenNamestatic	
final	TokenNamefinal	
PSVIDOMImplementationImpl	TokenNameIdentifier	 PSVIDOM Implementation Impl
singleton	TokenNameIdentifier	 singleton
=	TokenNameEQUAL	
new	TokenNamenew	
PSVIDOMImplementationImpl	TokenNameIdentifier	 PSVIDOM Implementation Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** NON-DOM: Obtain and return the single shared object */	TokenNameCOMMENT_JAVADOC	 NON-DOM: Obtain and return the single shared object 
public	TokenNamepublic	
static	TokenNamestatic	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
getDOMImplementation	TokenNameIdentifier	 get DOM Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
singleton	TokenNameIdentifier	 singleton
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// DOMImplementation methods 	TokenNameCOMMENT_LINE	DOMImplementation methods 
// 	TokenNameCOMMENT_LINE	 
/** * Test if the DOM implementation supports a specific "feature" -- * currently meaning language and level thereof. * * @param feature The package name of the feature to test. * In Level 1, supported values are "HTML" and "XML" (case-insensitive). * At this writing, org.apache.xerces.dom supports only XML. * * @param version The version number of the feature being tested. * This is interpreted as "Version of the DOM API supported for the * specified Feature", and in Level 1 should be "1.0" * * @return true iff this implementation is compatable with the specified * feature and version. */	TokenNameCOMMENT_JAVADOC	 Test if the DOM implementation supports a specific "feature" -- currently meaning language and level thereof. * @param feature The package name of the feature to test. In Level 1, supported values are "HTML" and "XML" (case-insensitive). At this writing, org.apache.xerces.dom supports only XML. * @param version The version number of the feature being tested. This is interpreted as "Version of the DOM API supported for the specified Feature", and in Level 1 should be "1.0" * @return true iff this implementation is compatable with the specified feature and version. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasFeature	TokenNameIdentifier	 has Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
hasFeature	TokenNameIdentifier	 has Feature
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
||	TokenNameOR_OR	
feature	TokenNameIdentifier	 feature
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"psvi"	TokenNameStringLiteral	psvi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// hasFeature(String,String):boolean 	TokenNameCOMMENT_LINE	hasFeature(String,String):boolean 
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
protected	TokenNameprotected	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
createDocument	TokenNameIdentifier	 create Document
(	TokenNameLPAREN	
DocumentType	TokenNameIdentifier	 Document Type
doctype	TokenNameIdentifier	 doctype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PSVIDocumentImpl	TokenNameIdentifier	 PSVI Document Impl
(	TokenNameLPAREN	
doctype	TokenNameIdentifier	 doctype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class PSVIDOMImplementationImpl 	TokenNameCOMMENT_LINE	class PSVIDOMImplementationImpl 
