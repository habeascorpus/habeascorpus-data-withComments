/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLEntityResolver	TokenNameIdentifier	 XML Entity Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLInputSource	TokenNameIdentifier	 XML Input Source
;	TokenNameSEMICOLON	
/** * <p>This interface extends <code>XMLEntityResolver</code> providing * a method to resolve external subsets for documents which do not * explicitly provide one. The application can register an object that * implements this interface with the parser configuration. If registered, * it will be queried to locate an external subset when none is provided, * even for documents that do not contain DOCTYPE declarations. If the * registered external subset resolver does not provide an external subset * for a given document, it should return <code>null</code>.</p> * * @xerces.internal * * @author Michael Glavassevich, IBM * * @version $Id: ExternalSubsetResolver.java 446761 2006-09-15 21:59:29Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>This interface extends <code>XMLEntityResolver</code> providing a method to resolve external subsets for documents which do not explicitly provide one. The application can register an object that implements this interface with the parser configuration. If registered, it will be queried to locate an external subset when none is provided, even for documents that do not contain DOCTYPE declarations. If the registered external subset resolver does not provide an external subset for a given document, it should return <code>null</code>.</p> * @xerces.internal * @author Michael Glavassevich, IBM * @version $Id: ExternalSubsetResolver.java 446761 2006-09-15 21:59:29Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ExternalSubsetResolver	TokenNameIdentifier	 External Subset Resolver
extends	TokenNameextends	
XMLEntityResolver	TokenNameIdentifier	 XML Entity Resolver
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// ExternalSubsetResolver methods 	TokenNameCOMMENT_LINE	ExternalSubsetResolver methods 
// 	TokenNameCOMMENT_LINE	 
/** * <p>Locates an external subset for documents which do not explicitly * provide one. If no external subset is provided, this method should * return <code>null</code>.</p> * * @param grammarDescription a description of the DTD * * @throws XNIException Thrown on general error. * @throws IOException Thrown if resolved entity stream cannot be * opened or some other i/o error occurs. */	TokenNameCOMMENT_JAVADOC	 <p>Locates an external subset for documents which do not explicitly provide one. If no external subset is provided, this method should return <code>null</code>.</p> * @param grammarDescription a description of the DTD * @throws XNIException Thrown on general error. @throws IOException Thrown if resolved entity stream cannot be opened or some other i/o error occurs. 
public	TokenNamepublic	
XMLInputSource	TokenNameIdentifier	 XML Input Source
getExternalSubset	TokenNameIdentifier	 get External Subset
(	TokenNameLPAREN	
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
grammarDescription	TokenNameIdentifier	 grammar Description
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface ExternalSubsetResolver 	TokenNameCOMMENT_LINE	interface ExternalSubsetResolver 
