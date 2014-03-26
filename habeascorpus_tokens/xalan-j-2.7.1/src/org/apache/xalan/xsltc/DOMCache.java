/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DOMCache.java 468648 2006-10-28 07:00:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DOMCache.java 468648 2006-10-28 07:00:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
;	TokenNameSEMICOLON	
/** * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Morten Jorgensen 
public	TokenNamepublic	
interface	TokenNameinterface	
DOMCache	TokenNameIdentifier	 DOM Cache
{	TokenNameLBRACE	
/** * This method is responsible for: * * (1) building the DOMImpl tree * * Parser _parser = new Parser(); * DOMImpl _dom = new DOMImpl(); * _parser.setDocumentHandler(_dom.getBuilder()); * _parser.setDTDHandler(_dom.getBuilder()); * _parser.parse(uri); * * (2) giving the translet an early opportunity to extract anything from * the DOMImpl that it would like * * translet.documentPrepass(_dom); * * (3) setting the document URI: * * _dom.setDocumentURI(uri); * * @param baseURI The base URI used by the document call. * @param href The href argument passed to the document function. * @param translet A reference to the translet requesting the document */	TokenNameCOMMENT_JAVADOC	 This method is responsible for: * (1) building the DOMImpl tree * Parser _parser = new Parser(); DOMImpl _dom = new DOMImpl(); _parser.setDocumentHandler(_dom.getBuilder()); _parser.setDTDHandler(_dom.getBuilder()); _parser.parse(uri); * (2) giving the translet an early opportunity to extract anything from the DOMImpl that it would like * translet.documentPrepass(_dom); * (3) setting the document URI: * _dom.setDocumentURI(uri); * @param baseURI The base URI used by the document call. @param href The href argument passed to the document function. @param translet A reference to the translet requesting the document 
public	TokenNamepublic	
DOM	TokenNameIdentifier	 DOM
retrieveDocument	TokenNameIdentifier	 retrieve Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
href	TokenNameIdentifier	 href
,	TokenNameCOMMA	
Translet	TokenNameIdentifier	 Translet
translet	TokenNameIdentifier	 translet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	