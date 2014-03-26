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
/** * <p>This DOMImplementation class is description of a particular * implementation of the Document Object Model. As such its data is * static, shared by all instances of this implementation.</p> * * <p>This implementation simply extends DOMImplementationImpl to differentiate * between the Deferred DOM Implementations and Non-Deferred DOM Implementations.</p> * * @xerces.internal * * @author Neil Delima, IBM * * @version $Id: DeferredDOMImplementationImpl.java 645327 2008-04-06 23:17:54Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>This DOMImplementation class is description of a particular implementation of the Document Object Model. As such its data is static, shared by all instances of this implementation.</p> * <p>This implementation simply extends DOMImplementationImpl to differentiate between the Deferred DOM Implementations and Non-Deferred DOM Implementations.</p> * @xerces.internal * @author Neil Delima, IBM * @version $Id: DeferredDOMImplementationImpl.java 645327 2008-04-06 23:17:54Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DeferredDOMImplementationImpl	TokenNameIdentifier	 Deferred DOM Implementation Impl
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
DeferredDOMImplementationImpl	TokenNameIdentifier	 Deferred DOM Implementation Impl
singleton	TokenNameIdentifier	 singleton
=	TokenNameEQUAL	
new	TokenNamenew	
DeferredDOMImplementationImpl	TokenNameIdentifier	 Deferred DOM Implementation Impl
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
}	TokenNameRBRACE	
