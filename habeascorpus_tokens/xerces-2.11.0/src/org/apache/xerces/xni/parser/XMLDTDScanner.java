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
/** * This interface defines a generic DTD scanner. This interface * allows a scanner to be used interchangably in existing parser * configurations. * <p> * If the parser configuration uses a DTD scanner that implements * this interface, components should be able to query the scanner * instance from the component manager using the following property * identifier: * <blockquote> * "http://apache.org/xml/properties/internal/dtd-scanner" * </blockquote> * * @author Andy Clark, IBM * * @version $Id: XMLDTDScanner.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This interface defines a generic DTD scanner. This interface allows a scanner to be used interchangably in existing parser configurations. <p> If the parser configuration uses a DTD scanner that implements this interface, components should be able to query the scanner instance from the component manager using the following property identifier: <blockquote> "http://apache.org/xml/properties/internal/dtd-scanner" </blockquote> * @author Andy Clark, IBM * @version $Id: XMLDTDScanner.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLDTDScanner	TokenNameIdentifier	 XMLDTD Scanner
extends	TokenNameextends	
XMLDTDSource	TokenNameIdentifier	 XMLDTD Source
,	TokenNameCOMMA	
XMLDTDContentModelSource	TokenNameIdentifier	 XMLDTD Content Model Source
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLDTDScanner methods 	TokenNameCOMMENT_LINE	XMLDTDScanner methods 
// 	TokenNameCOMMENT_LINE	 
/** * Sets the input source. * * @param inputSource The input source or null. * * @throws IOException Thrown on i/o error. */	TokenNameCOMMENT_JAVADOC	 Sets the input source. * @param inputSource The input source or null. * @throws IOException Thrown on i/o error. 
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
/** * Scans the internal subset of the document. * * @param complete True if the scanner should scan the document * completely, pushing all events to the registered * document handler. A value of false indicates that * that the scanner should only scan the next portion * of the document and return. A scanner instance is * permitted to completely scan a document if it does * not support this "pull" scanning model. * @param standalone True if the document was specified as standalone. * This value is important for verifying certain * well-formedness constraints. * @param hasExternalSubset True if the document has an external DTD. * This allows the scanner to properly notify * the handler of the end of the DTD in the * absence of an external subset. * * @return True if there is more to scan, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Scans the internal subset of the document. * @param complete True if the scanner should scan the document completely, pushing all events to the registered document handler. A value of false indicates that that the scanner should only scan the next portion of the document and return. A scanner instance is permitted to completely scan a document if it does not support this "pull" scanning model. @param standalone True if the document was specified as standalone. This value is important for verifying certain well-formedness constraints. @param hasExternalSubset True if the document has an external DTD. This allows the scanner to properly notify the handler of the end of the DTD in the absence of an external subset. * @return True if there is more to scan, false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
scanDTDInternalSubset	TokenNameIdentifier	 scan DTD Internal Subset
(	TokenNameLPAREN	
boolean	TokenNameboolean	
complete	TokenNameIdentifier	 complete
,	TokenNameCOMMA	
boolean	TokenNameboolean	
standalone	TokenNameIdentifier	 standalone
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hasExternalSubset	TokenNameIdentifier	 has External Subset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * Scans the external subset of the document. * * @param complete True if the scanner should scan the document * completely, pushing all events to the registered * document handler. A value of false indicates that * that the scanner should only scan the next portion * of the document and return. A scanner instance is * permitted to completely scan a document if it does * not support this "pull" scanning model. * * @return True if there is more to scan, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Scans the external subset of the document. * @param complete True if the scanner should scan the document completely, pushing all events to the registered document handler. A value of false indicates that that the scanner should only scan the next portion of the document and return. A scanner instance is permitted to completely scan a document if it does not support this "pull" scanning model. * @return True if there is more to scan, false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
scanDTDExternalSubset	TokenNameIdentifier	 scan DTD External Subset
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
// interface XMLDTDScanner 	TokenNameCOMMENT_LINE	interface XMLDTDScanner 
