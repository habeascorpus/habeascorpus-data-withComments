/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
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
/** * This interface defines a generic document scanner. This interface * allows a scanner to be used interchangably in existing parser * configurations. * <p> * If the parser configuration uses a document scanner that implements * this interface, components should be able to query the scanner * instance from the component manager using the following property * identifier: * <blockquote> * "http://apache.org/xml/properties/internal/document-scanner" * </blockquote> * * @author Andy Clark, IBM * * @version $Id: XMLDocumentScanner.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This interface defines a generic document scanner. This interface allows a scanner to be used interchangably in existing parser configurations. <p> If the parser configuration uses a document scanner that implements this interface, components should be able to query the scanner instance from the component manager using the following property identifier: <blockquote> "http://apache.org/xml/properties/internal/document-scanner" </blockquote> * @author Andy Clark, IBM * @version $Id: XMLDocumentScanner.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLDocumentScanner	TokenNameIdentifier	 XML Document Scanner
extends	TokenNameextends	
XMLDocumentSource	TokenNameIdentifier	 XML Document Source
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLDocumentScanner methods 	TokenNameCOMMENT_LINE	XMLDocumentScanner methods 
// 	TokenNameCOMMENT_LINE	 
/** * Sets the input source. * * @param inputSource The input source. * * @throws IOException Thrown on i/o error. */	TokenNameCOMMENT_JAVADOC	 Sets the input source. * @param inputSource The input source. * @throws IOException Thrown on i/o error. 
public	TokenNamepublic	
void	TokenNamevoid	
setInputSource	TokenNameIdentifier	 set Input Source
(	TokenNameLPAREN	
XMLInputSource	TokenNameIdentifier	 XML Input Source
inputSource	TokenNameIdentifier	 input Source
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Scans a document. * * @param complete True if the scanner should scan the document * completely, pushing all events to the registered * document handler. A value of false indicates that * that the scanner should only scan the next portion * of the document and return. A scanner instance is * permitted to completely scan a document if it does * not support this "pull" scanning model. * * @return True if there is more to scan, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Scans a document. * @param complete True if the scanner should scan the document completely, pushing all events to the registered document handler. A value of false indicates that that the scanner should only scan the next portion of the document and return. A scanner instance is permitted to completely scan a document if it does not support this "pull" scanning model. * @return True if there is more to scan, false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
scanDocument	TokenNameIdentifier	 scan Document
(	TokenNameLPAREN	
boolean	TokenNameboolean	
complete	TokenNameIdentifier	 complete
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface XMLDocumentScanner 	TokenNameCOMMENT_LINE	interface XMLDocumentScanner 
