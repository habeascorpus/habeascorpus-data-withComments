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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMConfiguration	TokenNameIdentifier	 DOM Configuration
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSInput	TokenNameIdentifier	 LS Input
;	TokenNameSEMICOLON	
/** * An interface that provides a method to load XML Schema documents. This * interface uses the DOM Level 3 Core and Load and Save interfaces. */	TokenNameCOMMENT_JAVADOC	 An interface that provides a method to load XML Schema documents. This interface uses the DOM Level 3 Core and Load and Save interfaces. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSLoader	TokenNameIdentifier	 XS Loader
{	TokenNameLBRACE	
/** * The configuration of a document. It maintains a table of recognized * parameters. Using the configuration, it is possible to change the * behavior of the load methods. The configuration may support the * setting of and the retrieval of the following non-boolean parameters * defined on the <code>DOMConfiguration</code> interface: * <code>error-handler</code> (<code>DOMErrorHandler</code>) and * <code>resource-resolver</code> (<code>LSResourceResolver</code>). * <br> The following list of boolean parameters is defined: * <dl> * <dt> * <code>"validate"</code></dt> * <dd> * <dl> * <dt><code>true</code></dt> * <dd>[required] (default) Validate an XML * Schema during loading. If validation errors are found, the error * handler is notified. </dd> * <dt><code>false</code></dt> * <dd>[optional] Do not * report errors during the loading of an XML Schema document. </dd> * </dl></dd> * </dl> */	TokenNameCOMMENT_JAVADOC	 The configuration of a document. It maintains a table of recognized parameters. Using the configuration, it is possible to change the behavior of the load methods. The configuration may support the setting of and the retrieval of the following non-boolean parameters defined on the <code>DOMConfiguration</code> interface: <code>error-handler</code> (<code>DOMErrorHandler</code>) and <code>resource-resolver</code> (<code>LSResourceResolver</code>). <br> The following list of boolean parameters is defined: <dl> <dt> <code>"validate"</code></dt> <dd> <dl> <dt><code>true</code></dt> <dd>[required] (default) Validate an XML Schema during loading. If validation errors are found, the error handler is notified. </dd> <dt><code>false</code></dt> <dd>[optional] Do not report errors during the loading of an XML Schema document. </dd> </dl></dd> </dl> 
public	TokenNamepublic	
DOMConfiguration	TokenNameIdentifier	 DOM Configuration
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Parses the content of XML Schema documents specified as the list of URI * references. If the URI contains a fragment identifier, the behavior * is not defined by this specification. * @param uriList The list of URI locations. * @return An XSModel representing the schema documents. */	TokenNameCOMMENT_JAVADOC	 Parses the content of XML Schema documents specified as the list of URI references. If the URI contains a fragment identifier, the behavior is not defined by this specification. @param uriList The list of URI locations. @return An XSModel representing the schema documents. 
public	TokenNamepublic	
XSModel	TokenNameIdentifier	 XS Model
loadURIList	TokenNameIdentifier	 load URI List
(	TokenNameLPAREN	
StringList	TokenNameIdentifier	 String List
uriList	TokenNameIdentifier	 uri List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Parses the content of XML Schema documents specified as a list of * <code>LSInput</code>s. * @param is The list of <code>LSInput</code>s from which the XML * Schema documents are to be read. * @return An XSModel representing the schema documents. */	TokenNameCOMMENT_JAVADOC	 Parses the content of XML Schema documents specified as a list of <code>LSInput</code>s. @param is The list of <code>LSInput</code>s from which the XML Schema documents are to be read. @return An XSModel representing the schema documents. 
public	TokenNamepublic	
XSModel	TokenNameIdentifier	 XS Model
loadInputList	TokenNameIdentifier	 load Input List
(	TokenNameLPAREN	
LSInputList	TokenNameIdentifier	 LS Input List
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Parse an XML Schema document from a location identified by a URI * reference. If the URI contains a fragment identifier, the behavior is * not defined by this specification. * @param uri The location of the XML Schema document to be read. * @return An XSModel representing this schema. */	TokenNameCOMMENT_JAVADOC	 Parse an XML Schema document from a location identified by a URI reference. If the URI contains a fragment identifier, the behavior is not defined by this specification. @param uri The location of the XML Schema document to be read. @return An XSModel representing this schema. 
public	TokenNamepublic	
XSModel	TokenNameIdentifier	 XS Model
loadURI	TokenNameIdentifier	 load URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Parse an XML Schema document from a resource identified by a * <code>LSInput</code> . * @param is The <code>LSInput</code> from which the source * document is to be read. * @return An XSModel representing this schema. */	TokenNameCOMMENT_JAVADOC	 Parse an XML Schema document from a resource identified by a <code>LSInput</code> . @param is The <code>LSInput</code> from which the source document is to be read. @return An XSModel representing this schema. 
public	TokenNamepublic	
XSModel	TokenNameIdentifier	 XS Model
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
LSInput	TokenNameIdentifier	 LS Input
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
