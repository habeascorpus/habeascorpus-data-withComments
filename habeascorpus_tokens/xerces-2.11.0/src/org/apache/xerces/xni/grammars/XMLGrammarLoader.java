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
grammars	TokenNameIdentifier	 grammars
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
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
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
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
/** * The intention of this interface is to provide a generic means * by which Grammar objects may be created without parsing instance * documents. Implementations of this interface will know how to load * specific types of grammars (e.g., DTD's or schemas); a wrapper * will be provided for user applications to interact with these implementations. * * @author Neil Graham, IBM * @version $Id: XMLGrammarLoader.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The intention of this interface is to provide a generic means by which Grammar objects may be created without parsing instance documents. Implementations of this interface will know how to load specific types of grammars (e.g., DTD's or schemas); a wrapper will be provided for user applications to interact with these implementations. * @author Neil Graham, IBM @version $Id: XMLGrammarLoader.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLGrammarLoader	TokenNameIdentifier	 XML Grammar Loader
{	TokenNameLBRACE	
/** * Returns a list of feature identifiers that are recognized by * this XMLGrammarLoader. This method may return null if no features * are recognized. */	TokenNameCOMMENT_JAVADOC	 Returns a list of feature identifiers that are recognized by this XMLGrammarLoader. This method may return null if no features are recognized. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRecognizedFeatures	TokenNameIdentifier	 get Recognized Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the state of a feature. * * @param featureId The feature identifier. * * @throws XMLConfigurationException Thrown on configuration error. */	TokenNameCOMMENT_JAVADOC	 Returns the state of a feature. * @param featureId The feature identifier. * @throws XMLConfigurationException Thrown on configuration error. 
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
/** * Sets the state of a feature. * * @param featureId The feature identifier. * @param state The state of the feature. * * @throws XMLConfigurationException Thrown when a feature is not * recognized or cannot be set. */	TokenNameCOMMENT_JAVADOC	 Sets the state of a feature. * @param featureId The feature identifier. @param state The state of the feature. * @throws XMLConfigurationException Thrown when a feature is not recognized or cannot be set. 
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
/** * Returns a list of property identifiers that are recognized by * this XMLGrammarLoader. This method may return null if no properties * are recognized. */	TokenNameCOMMENT_JAVADOC	 Returns a list of property identifiers that are recognized by this XMLGrammarLoader. This method may return null if no properties are recognized. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRecognizedProperties	TokenNameIdentifier	 get Recognized Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the state of a property. * * @param propertyId The property identifier. * * @throws XMLConfigurationException Thrown on configuration error. */	TokenNameCOMMENT_JAVADOC	 Returns the state of a property. * @param propertyId The property identifier. * @throws XMLConfigurationException Thrown on configuration error. 
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
/** * Sets the state of a property. * * @param propertyId The property identifier. * @param state The state of the property. * * @throws XMLConfigurationException Thrown when a property is not * recognized or cannot be set. */	TokenNameCOMMENT_JAVADOC	 Sets the state of a property. * @param propertyId The property identifier. @param state The state of the property. * @throws XMLConfigurationException Thrown when a property is not recognized or cannot be set. 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyId	TokenNameIdentifier	 property Id
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
;	TokenNameSEMICOLON	
/** * Set the locale to use for messages. * * @param locale The locale object to use for localization of messages. * * @exception XNIException Thrown if the parser does not support the * specified locale. */	TokenNameCOMMENT_JAVADOC	 Set the locale to use for messages. * @param locale The locale object to use for localization of messages. * @exception XNIException Thrown if the parser does not support the specified locale. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the Locale the XMLGrammarLoader is using. */	TokenNameCOMMENT_JAVADOC	 Return the Locale the XMLGrammarLoader is using. 
public	TokenNamepublic	
Locale	TokenNameIdentifier	 Locale
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the error handler. * * @param errorHandler The error handler. */	TokenNameCOMMENT_JAVADOC	 Sets the error handler. * @param errorHandler The error handler. 
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
/** * Returns a Grammar object by parsing the contents of the * entity pointed to by source. * * @param source the location of the entity which forms * the starting point of the grammar to be constructed. * @throws IOException When a problem is encountered reading the entity * XNIException When a condition arises (such as a FatalError) that requires parsing * of the entity be terminated. */	TokenNameCOMMENT_JAVADOC	 Returns a Grammar object by parsing the contents of the entity pointed to by source. * @param source the location of the entity which forms the starting point of the grammar to be constructed. @throws IOException When a problem is encountered reading the entity XNIException When a condition arises (such as a FatalError) that requires parsing of the entity be terminated. 
public	TokenNamepublic	
Grammar	TokenNameIdentifier	 Grammar
loadGrammar	TokenNameIdentifier	 load Grammar
(	TokenNameLPAREN	
XMLInputSource	TokenNameIdentifier	 XML Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XMLGrammarLoader 	TokenNameCOMMENT_LINE	XMLGrammarLoader 
