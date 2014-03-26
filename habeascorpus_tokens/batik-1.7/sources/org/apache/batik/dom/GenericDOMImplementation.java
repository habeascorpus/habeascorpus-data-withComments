/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
/** * This class implements the {@link org.w3c.dom.DOMImplementation}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: GenericDOMImplementation.java 478249 2006-11-22 17:29:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link org.w3c.dom.DOMImplementation}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: GenericDOMImplementation.java 478249 2006-11-22 17:29:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
GenericDOMImplementation	TokenNameIdentifier	 Generic DOM Implementation
extends	TokenNameextends	
AbstractDOMImplementation	TokenNameIdentifier	 Abstract DOM Implementation
{	TokenNameLBRACE	
/** * The default instance of this class. */	TokenNameCOMMENT_JAVADOC	 The default instance of this class. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
DOM_IMPLEMENTATION	TokenNameIdentifier	 DOM  IMPLEMENTATION
=	TokenNameEQUAL	
new	TokenNamenew	
GenericDOMImplementation	TokenNameIdentifier	 Generic DOM Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new GenericDOMImplementation object. */	TokenNameCOMMENT_JAVADOC	 Creates a new GenericDOMImplementation object. 
public	TokenNamepublic	
GenericDOMImplementation	TokenNameIdentifier	 Generic DOM Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns the default instance of this class. */	TokenNameCOMMENT_JAVADOC	 Returns the default instance of this class. 
public	TokenNamepublic	
static	TokenNamestatic	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
getDOMImplementation	TokenNameIdentifier	 get DOM Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DOM_IMPLEMENTATION	TokenNameIdentifier	 DOM  IMPLEMENTATION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DOMImplementation ////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	DOMImplementation ////////////////////////////////////////////////////// 
/** * <b>DOM</b>: Implements {@link * DOMImplementation#createDocumentType(String,String,String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link DOMImplementation#createDocumentType(String,String,String)}. 
public	TokenNamepublic	
DocumentType	TokenNameIdentifier	 Document Type
createDocumentType	TokenNameIdentifier	 create Document Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qualifiedName	TokenNameIdentifier	 qualified Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"Doctype not supported"	TokenNameStringLiteral	Doctype not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * DOMImplementation#createDocument(String,String,DocumentType)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link DOMImplementation#createDocument(String,String,DocumentType)}. 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
createDocument	TokenNameIdentifier	 create Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qualifiedName	TokenNameIdentifier	 qualified Name
,	TokenNameCOMMA	
DocumentType	TokenNameIdentifier	 Document Type
doctype	TokenNameIdentifier	 doctype
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
GenericDocument	TokenNameIdentifier	 Generic Document
(	TokenNameLPAREN	
doctype	TokenNameIdentifier	 doctype
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
qualifiedName	TokenNameIdentifier	 qualified Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
