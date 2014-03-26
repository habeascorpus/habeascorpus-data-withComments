/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
dom	TokenNameIdentifier	 dom
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
Text	TokenNameIdentifier	 Text
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
;	TokenNameSEMICOLON	
/** * Encapsulates a DOM parser. * * @version $Id: ParserWrapper.java 699895 2008-09-28 21:21:24Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Encapsulates a DOM parser. * @version $Id: ParserWrapper.java 699895 2008-09-28 21:21:24Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ParserWrapper	TokenNameIdentifier	 Parser Wrapper
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// ParserWrapper methods 	TokenNameCOMMENT_LINE	ParserWrapper methods 
// 	TokenNameCOMMENT_LINE	 
/** Parses the specified URI and returns the document. */	TokenNameCOMMENT_JAVADOC	 Parses the specified URI and returns the document. 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
;	TokenNameSEMICOLON	
/** * Set the state of a feature. * * Set the state of any feature in a SAX2 parser. The parser * might not recognize the feature, and if it does recognize * it, it might not be able to fulfill the request. * * @param featureId The unique identifier (URI) of the feature. * @param state The requested state of the feature (true or false). * * @exception org.xml.sax.SAXNotRecognizedException If the * requested feature is not known. * @exception org.xml.sax.SAXNotSupportedException If the * requested feature is known, but the requested * state is not supported. * @exception org.xml.sax.SAXException If there is any other * problem fulfilling the request. */	TokenNameCOMMENT_JAVADOC	 Set the state of a feature. * Set the state of any feature in a SAX2 parser. The parser might not recognize the feature, and if it does recognize it, it might not be able to fulfill the request. * @param featureId The unique identifier (URI) of the feature. @param state The requested state of the feature (true or false). * @exception org.xml.sax.SAXNotRecognizedException If the requested feature is not known. @exception org.xml.sax.SAXNotSupportedException If the requested feature is known, but the requested state is not supported. @exception org.xml.sax.SAXException If there is any other problem fulfilling the request. 
public	TokenNamepublic	
void	TokenNamevoid	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
,	TokenNameCOMMA	
boolean	TokenNameboolean	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
,	TokenNameCOMMA	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
;	TokenNameSEMICOLON	
/** Returns the document information. */	TokenNameCOMMENT_JAVADOC	 Returns the document information. 
public	TokenNamepublic	
DocumentInfo	TokenNameIdentifier	 Document Info
getDocumentInfo	TokenNameIdentifier	 get Document Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Interfaces 	TokenNameCOMMENT_LINE	Interfaces 
// 	TokenNameCOMMENT_LINE	 
/** * This interface is here to query information about the document * implementation returned by the <code>ParserWrapper#parse</code> * method. * * @author Andy Clark, IBM */	TokenNameCOMMENT_JAVADOC	 This interface is here to query information about the document implementation returned by the <code>ParserWrapper#parse</code> method. * @author Andy Clark, IBM 
public	TokenNamepublic	
interface	TokenNameinterface	
DocumentInfo	TokenNameIdentifier	 Document Info
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// DocumentInfo methods 	TokenNameCOMMENT_LINE	DocumentInfo methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns true if the specified text node is ignorable whitespace. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified text node is ignorable whitespace. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isIgnorableWhitespace	TokenNameIdentifier	 is Ignorable Whitespace
(	TokenNameLPAREN	
Text	TokenNameIdentifier	 Text
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface DocumentInfo 	TokenNameCOMMENT_LINE	interface DocumentInfo 
}	TokenNameRBRACE	
// interface ParserWrapper 	TokenNameCOMMENT_LINE	interface ParserWrapper 
