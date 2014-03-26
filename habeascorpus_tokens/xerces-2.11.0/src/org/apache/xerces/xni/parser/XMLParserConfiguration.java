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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
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
XMLDTDContentModelHandler	TokenNameIdentifier	 XMLDTD Content Model Handler
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
XMLDTDHandler	TokenNameIdentifier	 XMLDTD Handler
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
/** * Represents a parser configuration. The parser configuration maintains * a table of recognized features and properties, assembles components * for the parsing pipeline, and is responsible for initiating parsing * of an XML document. * <p> * By separating the configuration of a parser from the specific parser * instance, applications can create new configurations and re-use the * existing parser components and external API generators (e.g. the * DOMParser and SAXParser). * <p> * The internals of any specific parser configuration instance are hidden. * Therefore, each configuration may implement the parsing mechanism any * way necessary. However, the parser configuration should follow these * guidelines: * <ul> * <li> * Call the <code>reset</code> method on each component before parsing. * This is only required if the configuration is re-using existing * components that conform to the <code>XMLComponent</code> interface. * If the configuration uses all custom parts, then it is free to * implement everything as it sees fit as long as it follows the * other guidelines. * </li> * <li> * Call the <code>setFeature</code> and <code>setProperty</code> method * on each component during parsing to propagate features and properties * that have changed. This is only required if the configuration is * re-using existing components that conform to the <code>XMLComponent</code> * interface. If the configuration uses all custom parts, then it is free * to implement everything as it sees fit as long as it follows the other * guidelines. * </li> * <li> * Pass the same unique String references for all symbols that are * propagated to the registered handlers. Symbols include, but may not * be limited to, the names of elements and attributes (including their * uri, prefix, and localpart). This is suggested but not an absolute * must. However, the standard parser components may require access to * the same symbol table for creation of unique symbol references to be * propagated in the XNI pipeline. * </li> * </ul> * * @author Arnaud Le Hors, IBM * @author Andy Clark, IBM * * @version $Id: XMLParserConfiguration.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Represents a parser configuration. The parser configuration maintains a table of recognized features and properties, assembles components for the parsing pipeline, and is responsible for initiating parsing of an XML document. <p> By separating the configuration of a parser from the specific parser instance, applications can create new configurations and re-use the existing parser components and external API generators (e.g. the DOMParser and SAXParser). <p> The internals of any specific parser configuration instance are hidden. Therefore, each configuration may implement the parsing mechanism any way necessary. However, the parser configuration should follow these guidelines: <ul> <li> Call the <code>reset</code> method on each component before parsing. This is only required if the configuration is re-using existing components that conform to the <code>XMLComponent</code> interface. If the configuration uses all custom parts, then it is free to implement everything as it sees fit as long as it follows the other guidelines. </li> <li> Call the <code>setFeature</code> and <code>setProperty</code> method on each component during parsing to propagate features and properties that have changed. This is only required if the configuration is re-using existing components that conform to the <code>XMLComponent</code> interface. If the configuration uses all custom parts, then it is free to implement everything as it sees fit as long as it follows the other guidelines. </li> <li> Pass the same unique String references for all symbols that are propagated to the registered handlers. Symbols include, but may not be limited to, the names of elements and attributes (including their uri, prefix, and localpart). This is suggested but not an absolute must. However, the standard parser components may require access to the same symbol table for creation of unique symbol references to be propagated in the XNI pipeline. </li> </ul> * @author Arnaud Le Hors, IBM @author Andy Clark, IBM * @version $Id: XMLParserConfiguration.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLParserConfiguration	TokenNameIdentifier	 XML Parser Configuration
extends	TokenNameextends	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLParserConfiguration methods 	TokenNameCOMMENT_LINE	XMLParserConfiguration methods 
// 	TokenNameCOMMENT_LINE	 
// parsing 	TokenNameCOMMENT_LINE	parsing 
/** * Parse an XML document. * <p> * The parser can use this method to instruct this configuration * to begin parsing an XML document from any valid input source * (a character stream, a byte stream, or a URI). * <p> * Parsers may not invoke this method while a parse is in progress. * Once a parse is complete, the parser may then parse another XML * document. * <p> * This method is synchronous: it will not return until parsing * has ended. If a client application wants to terminate * parsing early, it should throw an exception. * <p> * When this method returns, all characters streams and byte streams * opened by the parser are closed. * * @param inputSource The input source for the top-level of the * XML document. * * @exception XNIException Any XNI exception, possibly wrapping * another exception. * @exception IOException An IO exception from the parser, possibly * from a byte stream or character stream * supplied by the parser. */	TokenNameCOMMENT_JAVADOC	 Parse an XML document. <p> The parser can use this method to instruct this configuration to begin parsing an XML document from any valid input source (a character stream, a byte stream, or a URI). <p> Parsers may not invoke this method while a parse is in progress. Once a parse is complete, the parser may then parse another XML document. <p> This method is synchronous: it will not return until parsing has ended. If a client application wants to terminate parsing early, it should throw an exception. <p> When this method returns, all characters streams and byte streams opened by the parser are closed. * @param inputSource The input source for the top-level of the XML document. * @exception XNIException Any XNI exception, possibly wrapping another exception. @exception IOException An IO exception from the parser, possibly from a byte stream or character stream supplied by the parser. 
public	TokenNamepublic	
void	TokenNamevoid	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
XMLInputSource	TokenNameIdentifier	 XML Input Source
inputSource	TokenNameIdentifier	 input Source
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
// generic configuration 	TokenNameCOMMENT_LINE	generic configuration 
/** * Allows a parser to add parser specific features to be recognized * and managed by the parser configuration. * * @param featureIds An array of the additional feature identifiers * to be recognized. */	TokenNameCOMMENT_JAVADOC	 Allows a parser to add parser specific features to be recognized and managed by the parser configuration. * @param featureIds An array of the additional feature identifiers to be recognized. 
public	TokenNamepublic	
void	TokenNamevoid	
addRecognizedFeatures	TokenNameIdentifier	 add Recognized Features
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featureIds	TokenNameIdentifier	 feature Ids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the state of a feature. This method is called by the parser * and gets propagated to components in this parser configuration. * * @param featureId The feature identifier. * @param state The state of the feature. * * @throws XMLConfigurationException Thrown if there is a configuration * error. */	TokenNameCOMMENT_JAVADOC	 Sets the state of a feature. This method is called by the parser and gets propagated to components in this parser configuration. * @param featureId The feature identifier. @param state The state of the feature. * @throws XMLConfigurationException Thrown if there is a configuration error. 
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
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
;	TokenNameSEMICOLON	
/** * Returns the state of a feature. * * @param featureId The feature identifier. * * @throws XMLConfigurationException Thrown if there is a configuration * error. */	TokenNameCOMMENT_JAVADOC	 Returns the state of a feature. * @param featureId The feature identifier. * @throws XMLConfigurationException Thrown if there is a configuration error. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
;	TokenNameSEMICOLON	
/** * Allows a parser to add parser specific properties to be recognized * and managed by the parser configuration. * * @param propertyIds An array of the additional property identifiers * to be recognized. */	TokenNameCOMMENT_JAVADOC	 Allows a parser to add parser specific properties to be recognized and managed by the parser configuration. * @param propertyIds An array of the additional property identifiers to be recognized. 
public	TokenNamepublic	
void	TokenNamevoid	
addRecognizedProperties	TokenNameIdentifier	 add Recognized Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
propertyIds	TokenNameIdentifier	 property Ids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the value of a property. This method is called by the parser * and gets propagated to components in this parser configuration. * * @param propertyId The property identifier. * @param value The value of the property. * * @throws XMLConfigurationException Thrown if there is a configuration * error. */	TokenNameCOMMENT_JAVADOC	 Sets the value of a property. This method is called by the parser and gets propagated to components in this parser configuration. * @param propertyId The property identifier. @param value The value of the property. * @throws XMLConfigurationException Thrown if there is a configuration error. 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyId	TokenNameIdentifier	 property Id
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
;	TokenNameSEMICOLON	
/** * Returns the value of a property. * * @param propertyId The property identifier. * * @throws XMLConfigurationException Thrown if there is a configuration * error. */	TokenNameCOMMENT_JAVADOC	 Returns the value of a property. * @param propertyId The property identifier. * @throws XMLConfigurationException Thrown if there is a configuration error. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
;	TokenNameSEMICOLON	
// handlers 	TokenNameCOMMENT_LINE	handlers 
/** * Sets the error handler. * * @param errorHandler The error resolver. */	TokenNameCOMMENT_JAVADOC	 Sets the error handler. * @param errorHandler The error resolver. 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the registered error handler. */	TokenNameCOMMENT_JAVADOC	 Returns the registered error handler. 
public	TokenNamepublic	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the document handler to receive information about the document. * * @param documentHandler The document handler. */	TokenNameCOMMENT_JAVADOC	 Sets the document handler to receive information about the document. * @param documentHandler The document handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
documentHandler	TokenNameIdentifier	 document Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the registered document handler. */	TokenNameCOMMENT_JAVADOC	 Returns the registered document handler. 
public	TokenNamepublic	
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
getDocumentHandler	TokenNameIdentifier	 get Document Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the DTD handler. * * @param dtdHandler The DTD handler. */	TokenNameCOMMENT_JAVADOC	 Sets the DTD handler. * @param dtdHandler The DTD handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
XMLDTDHandler	TokenNameIdentifier	 XMLDTD Handler
dtdHandler	TokenNameIdentifier	 dtd Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the registered DTD handler. */	TokenNameCOMMENT_JAVADOC	 Returns the registered DTD handler. 
public	TokenNamepublic	
XMLDTDHandler	TokenNameIdentifier	 XMLDTD Handler
getDTDHandler	TokenNameIdentifier	 get DTD Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the DTD content model handler. * * @param dtdContentModelHandler The DTD content model handler. */	TokenNameCOMMENT_JAVADOC	 Sets the DTD content model handler. * @param dtdContentModelHandler The DTD content model handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setDTDContentModelHandler	TokenNameIdentifier	 set DTD Content Model Handler
(	TokenNameLPAREN	
XMLDTDContentModelHandler	TokenNameIdentifier	 XMLDTD Content Model Handler
dtdContentModelHandler	TokenNameIdentifier	 dtd Content Model Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the registered DTD content model handler. */	TokenNameCOMMENT_JAVADOC	 Returns the registered DTD content model handler. 
public	TokenNamepublic	
XMLDTDContentModelHandler	TokenNameIdentifier	 XMLDTD Content Model Handler
getDTDContentModelHandler	TokenNameIdentifier	 get DTD Content Model Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// other settings 	TokenNameCOMMENT_LINE	other settings 
/** * Sets the entity resolver. * * @param entityResolver The new entity resolver. */	TokenNameCOMMENT_JAVADOC	 Sets the entity resolver. * @param entityResolver The new entity resolver. 
public	TokenNamepublic	
void	TokenNamevoid	
setEntityResolver	TokenNameIdentifier	 set Entity Resolver
(	TokenNameLPAREN	
XMLEntityResolver	TokenNameIdentifier	 XML Entity Resolver
entityResolver	TokenNameIdentifier	 entity Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the registered entity resolver. */	TokenNameCOMMENT_JAVADOC	 Returns the registered entity resolver. 
public	TokenNamepublic	
XMLEntityResolver	TokenNameIdentifier	 XML Entity Resolver
getEntityResolver	TokenNameIdentifier	 get Entity Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the locale to use for messages. * * @param locale The locale object to use for localization of messages. * * @exception XNIException Thrown if the parser does not support the * specified locale. */	TokenNameCOMMENT_JAVADOC	 Set the locale to use for messages. * @param locale The locale object to use for localization of messages. * @exception XNIException Thrown if the parser does not support the specified locale. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** Returns the locale. */	TokenNameCOMMENT_JAVADOC	 Returns the locale. 
public	TokenNamepublic	
Locale	TokenNameIdentifier	 Locale
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface XMLParserConfiguration 	TokenNameCOMMENT_LINE	interface XMLParserConfiguration 
