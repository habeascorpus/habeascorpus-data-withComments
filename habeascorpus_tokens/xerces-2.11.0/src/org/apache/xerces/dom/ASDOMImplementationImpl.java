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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom3	TokenNameIdentifier	 dom3
.	TokenNameDOT	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
ASModel	TokenNameIdentifier	 AS Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom3	TokenNameIdentifier	 dom3
.	TokenNameDOT	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
DOMASBuilder	TokenNameIdentifier	 DOMAS Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom3	TokenNameIdentifier	 dom3
.	TokenNameDOT	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
DOMASWriter	TokenNameIdentifier	 DOMAS Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom3	TokenNameIdentifier	 dom3
.	TokenNameDOT	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
DOMImplementationAS	TokenNameIdentifier	 DOM Implementation AS
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DOMASBuilderImpl	TokenNameIdentifier	 DOMAS Builder Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
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
/** * The DOMImplementation class is description of a particular * implementation of the Document Object Model. As such its data is * static, shared by all instances of this implementation. * <P> * The DOM API requires that it be a real object rather than static * methods. However, there's nothing that says it can't be a singleton, * so that's how I've implemented it. * <P> * This particular class, along with DocumentImpl, supports the DOM * Core, DOM Level 2 optional mofules, and Abstract Schemas (Experimental). * @deprecated * @version $Id: ASDOMImplementationImpl.java 699892 2008-09-28 21:08:27Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 The DOMImplementation class is description of a particular implementation of the Document Object Model. As such its data is static, shared by all instances of this implementation. <P> The DOM API requires that it be a real object rather than static methods. However, there's nothing that says it can't be a singleton, so that's how I've implemented it. <P> This particular class, along with DocumentImpl, supports the DOM Core, DOM Level 2 optional mofules, and Abstract Schemas (Experimental). @deprecated @version $Id: ASDOMImplementationImpl.java 699892 2008-09-28 21:08:27Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
ASDOMImplementationImpl	TokenNameIdentifier	 ASDOM Implementation Impl
extends	TokenNameextends	
DOMImplementationImpl	TokenNameIdentifier	 DOM Implementation Impl
implements	TokenNameimplements	
DOMImplementationAS	TokenNameIdentifier	 DOM Implementation AS
{	TokenNameLBRACE	
// static 	TokenNameCOMMENT_LINE	static 
/** Dom implementation singleton. */	TokenNameCOMMENT_JAVADOC	 Dom implementation singleton. 
static	TokenNamestatic	
final	TokenNamefinal	
ASDOMImplementationImpl	TokenNameIdentifier	 ASDOM Implementation Impl
singleton	TokenNameIdentifier	 singleton
=	TokenNameEQUAL	
new	TokenNamenew	
ASDOMImplementationImpl	TokenNameIdentifier	 ASDOM Implementation Impl
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
// DOM L3 Abstract Schemas: 	TokenNameCOMMENT_LINE	DOM L3 Abstract Schemas: 
// REVISIT: implement hasFeature() 	TokenNameCOMMENT_LINE	REVISIT: implement hasFeature() 
// 	TokenNameCOMMENT_LINE	 
/** * DOM Level 3 WD - Experimental. * Creates an ASModel. * @param isNamespaceAware Allow creation of <code>ASModel</code> with * this attribute set to a specific value. * @return A <code>null</code> return indicates failure.what is a * failure? Could be a system error. */	TokenNameCOMMENT_JAVADOC	 DOM Level 3 WD - Experimental. Creates an ASModel. @param isNamespaceAware Allow creation of <code>ASModel</code> with this attribute set to a specific value. @return A <code>null</code> return indicates failure.what is a failure? Could be a system error. 
public	TokenNamepublic	
ASModel	TokenNameIdentifier	 AS Model
createAS	TokenNameIdentifier	 create AS
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isNamespaceAware	TokenNameIdentifier	 is Namespace Aware
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ASModelImpl	TokenNameIdentifier	 AS Model Impl
(	TokenNameLPAREN	
isNamespaceAware	TokenNameIdentifier	 is Namespace Aware
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM Level 3 WD - Experimental. * Creates an <code>DOMASBuilder</code>.Do we need the method since we * already have <code>DOMImplementationLS.createDOMParser</code>? * @return DOMASBuilder */	TokenNameCOMMENT_JAVADOC	 DOM Level 3 WD - Experimental. Creates an <code>DOMASBuilder</code>.Do we need the method since we already have <code>DOMImplementationLS.createDOMParser</code>? @return DOMASBuilder 
public	TokenNamepublic	
DOMASBuilder	TokenNameIdentifier	 DOMAS Builder
createDOMASBuilder	TokenNameIdentifier	 create DOMAS Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DOMASBuilderImpl	TokenNameIdentifier	 DOMAS Builder Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM Level 3 WD - Experimental. * Creates an <code>DOMASWriter</code>. * @return a DOMASWriter */	TokenNameCOMMENT_JAVADOC	 DOM Level 3 WD - Experimental. Creates an <code>DOMASWriter</code>. @return a DOMASWriter 
public	TokenNamepublic	
DOMASWriter	TokenNameIdentifier	 DOMAS Writer
createDOMASWriter	TokenNameIdentifier	 create DOMAS Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NOT_SUPPORTED_ERR"	TokenNameStringLiteral	NOT_SUPPORTED_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class DOMImplementationImpl 	TokenNameCOMMENT_LINE	class DOMImplementationImpl 
