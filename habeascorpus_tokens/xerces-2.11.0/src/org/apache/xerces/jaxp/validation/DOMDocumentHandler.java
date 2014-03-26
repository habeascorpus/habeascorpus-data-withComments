/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
jaxp	TokenNameIdentifier	 jaxp
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMResult	TokenNameIdentifier	 DOM Result
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
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
CDATASection	TokenNameIdentifier	 CDATA Section
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Comment	TokenNameIdentifier	 Comment
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ProcessingInstruction	TokenNameIdentifier	 Processing Instruction
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Text	TokenNameIdentifier	 Text
;	TokenNameSEMICOLON	
/** * <p>An extension to XMLDocumentHandler for building DOM structures.</p> * * @author Michael Glavassevich, IBM * @version $Id: DOMDocumentHandler.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>An extension to XMLDocumentHandler for building DOM structures.</p> * @author Michael Glavassevich, IBM @version $Id: DOMDocumentHandler.java 699892 2008-09-28 21:08:27Z mrglavas $ 
interface	TokenNameinterface	
DOMDocumentHandler	TokenNameIdentifier	 DOM Document Handler
extends	TokenNameextends	
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
{	TokenNameLBRACE	
/** * <p>Sets the <code>DOMResult</code> object which * receives the constructed DOM nodes.</p> * * @param result the object which receives the constructed DOM nodes */	TokenNameCOMMENT_JAVADOC	 <p>Sets the <code>DOMResult</code> object which receives the constructed DOM nodes.</p> * @param result the object which receives the constructed DOM nodes 
public	TokenNamepublic	
void	TokenNamevoid	
setDOMResult	TokenNameIdentifier	 set DOM Result
(	TokenNameLPAREN	
DOMResult	TokenNameIdentifier	 DOM Result
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A document type declaration. * * @param node a DocumentType node * * @exception XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 A document type declaration. * @param node a DocumentType node * @exception XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
doctypeDecl	TokenNameIdentifier	 doctype Decl
(	TokenNameLPAREN	
DocumentType	TokenNameIdentifier	 Document Type
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
Text	TokenNameIdentifier	 Text
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
cdata	TokenNameIdentifier	 cdata
(	TokenNameLPAREN	
CDATASection	TokenNameIdentifier	 CDATA Section
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * A comment. * * @param node a Comment node * * @exception XNIException Thrown by application to signal an error. */	TokenNameCOMMENT_JAVADOC	 A comment. * @param node a Comment node * @exception XNIException Thrown by application to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
Comment	TokenNameIdentifier	 Comment
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * A processing instruction. Processing instructions consist of a * target name and, optionally, text data. The data is only meaningful * to the application. * <p> * Typically, a processing instruction's data will contain a series * of pseudo-attributes. These pseudo-attributes follow the form of * element attributes but are <strong>not</strong> parsed or presented * to the application as anything other than text. The application is * responsible for parsing the data. * * @param node a ProcessingInstruction node * * @exception XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 A processing instruction. Processing instructions consist of a target name and, optionally, text data. The data is only meaningful to the application. <p> Typically, a processing instruction's data will contain a series of pseudo-attributes. These pseudo-attributes follow the form of element attributes but are <strong>not</strong> parsed or presented to the application as anything other than text. The application is responsible for parsing the data. * @param node a ProcessingInstruction node * @exception XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
ProcessingInstruction	TokenNameIdentifier	 Processing Instruction
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setIgnoringCharacters	TokenNameIdentifier	 set Ignoring Characters
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
