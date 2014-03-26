/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
wml	TokenNameIdentifier	 wml
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
wml	TokenNameIdentifier	 wml
.	TokenNameDOT	
WMLDOMImplementation	TokenNameIdentifier	 WMLDOM Implementation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMImplementationImpl	TokenNameIdentifier	 DOM Implementation Impl
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
/** * @xerces.internal * @version $Id: WMLDOMImplementationImpl.java 809736 2009-08-31 20:43:19Z mrglavas $ * @author <a href="mailto:david@topware.com.tw">David Li</a> */	TokenNameCOMMENT_JAVADOC	 @xerces.internal @version $Id: WMLDOMImplementationImpl.java 809736 2009-08-31 20:43:19Z mrglavas $ @author <a href="mailto:david@topware.com.tw">David Li</a> 
public	TokenNamepublic	
class	TokenNameclass	
WMLDOMImplementationImpl	TokenNameIdentifier	 WMLDOM Implementation Impl
extends	TokenNameextends	
DOMImplementationImpl	TokenNameIdentifier	 DOM Implementation Impl
implements	TokenNameimplements	
WMLDOMImplementation	TokenNameIdentifier	 WMLDOM Implementation
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
DOMImplementationImpl	TokenNameIdentifier	 DOM Implementation Impl
singleton	TokenNameIdentifier	 singleton
=	TokenNameEQUAL	
new	TokenNamenew	
WMLDOMImplementationImpl	TokenNameIdentifier	 WMLDOM Implementation Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
WMLDocumentImpl	TokenNameIdentifier	 WML Document Impl
(	TokenNameLPAREN	
doctype	TokenNameIdentifier	 doctype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
