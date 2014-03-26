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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ErrorHandlerProxy	TokenNameIdentifier	 Error Handler Proxy
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
MessageFormatter	TokenNameIdentifier	 Message Formatter
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
XMLLocator	TokenNameIdentifier	 XML Locator
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
XMLComponent	TokenNameIdentifier	 XML Component
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
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
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
XMLParseException	TokenNameIdentifier	 XML Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ErrorHandler	TokenNameIdentifier	 Error Handler
;	TokenNameSEMICOLON	
/** * This class is a common element of all parser configurations and is * used to report errors that occur. This component can be queried by * parser components from the component manager using the following * property ID: * <pre> * http://apache.org/xml/properties/internal/error-reporter * </pre> * <p> * Errors are separated into domains that categorize a class of errors. * In a parser configuration, the parser would register a * <code>MessageFormatter</code> for each domain that is capable of * localizing error messages and formatting them based on information * about the error. Any parser component can invent new error domains * and register additional message formatters to localize messages in * those domains. * <p> * This component requires the following features and properties from the * component manager that uses it: * <ul> * <li>http://apache.org/xml/properties/internal/error-handler</li> * </ul> * <p> * This component can use the following features and properties but they * are not required: * <ul> * <li>http://apache.org/xml/features/continue-after-fatal-error</li> * </ul> * * @xerces.internal * * @see MessageFormatter * * @author Eric Ye, IBM * @author Andy Clark, IBM * * @version $Id: XMLErrorReporter.java 718856 2008-11-19 04:54:03Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class is a common element of all parser configurations and is used to report errors that occur. This component can be queried by parser components from the component manager using the following property ID: <pre> http://apache.org/xml/properties/internal/error-reporter </pre> <p> Errors are separated into domains that categorize a class of errors. In a parser configuration, the parser would register a <code>MessageFormatter</code> for each domain that is capable of localizing error messages and formatting them based on information about the error. Any parser component can invent new error domains and register additional message formatters to localize messages in those domains. <p> This component requires the following features and properties from the component manager that uses it: <ul> <li>http://apache.org/xml/properties/internal/error-handler</li> </ul> <p> This component can use the following features and properties but they are not required: <ul> <li>http://apache.org/xml/features/continue-after-fatal-error</li> </ul> * @xerces.internal * @see MessageFormatter * @author Eric Ye, IBM @author Andy Clark, IBM * @version $Id: XMLErrorReporter.java 718856 2008-11-19 04:54:03Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
implements	TokenNameimplements	
XMLComponent	TokenNameIdentifier	 XML Component
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
// severity 	TokenNameCOMMENT_LINE	severity 
/** * Severity: warning. Warnings represent informational messages only * that should not be considered serious enough to stop parsing or * indicate an error in the document's validity. */	TokenNameCOMMENT_JAVADOC	 Severity: warning. Warnings represent informational messages only that should not be considered serious enough to stop parsing or indicate an error in the document's validity. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
SEVERITY_WARNING	TokenNameIdentifier	 SEVERITY  WARNING
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Severity: error. Common causes of errors are document structure and/or * content that that does not conform to the grammar rules specified for * the document. These are typically validation errors. */	TokenNameCOMMENT_JAVADOC	 Severity: error. Common causes of errors are document structure and/or content that that does not conform to the grammar rules specified for the document. These are typically validation errors. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
SEVERITY_ERROR	TokenNameIdentifier	 SEVERITY  ERROR
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Severity: fatal error. Fatal errors are errors in the syntax of the * XML document or invalid byte sequences for a given encoding. The * XML 1.0 Specification mandates that errors of this type are not * recoverable. * <p> * <strong>Note:</strong> The parser does have a "continue after fatal * error" feature but it should be used with extreme caution and care. */	TokenNameCOMMENT_JAVADOC	 Severity: fatal error. Fatal errors are errors in the syntax of the XML document or invalid byte sequences for a given encoding. The XML 1.0 Specification mandates that errors of this type are not recoverable. <p> <strong>Note:</strong> The parser does have a "continue after fatal error" feature but it should be used with extreme caution and care. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// feature identifiers 	TokenNameCOMMENT_LINE	feature identifiers 
/** Feature identifier: continue after fatal error. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: continue after fatal error. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CONTINUE_AFTER_FATAL_ERROR	TokenNameIdentifier	 CONTINUE  AFTER  FATAL  ERROR
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
CONTINUE_AFTER_FATAL_ERROR_FEATURE	TokenNameIdentifier	 CONTINUE  AFTER  FATAL  ERROR  FEATURE
;	TokenNameSEMICOLON	
// property identifiers 	TokenNameCOMMENT_LINE	property identifiers 
/** Property identifier: error handler. */	TokenNameCOMMENT_JAVADOC	 Property identifier: error handler. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_HANDLER	TokenNameIdentifier	 ERROR  HANDLER
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ERROR_HANDLER_PROPERTY	TokenNameIdentifier	 ERROR  HANDLER  PROPERTY
;	TokenNameSEMICOLON	
// recognized features and properties 	TokenNameCOMMENT_LINE	recognized features and properties 
/** Recognized features. */	TokenNameCOMMENT_JAVADOC	 Recognized features. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
RECOGNIZED_FEATURES	TokenNameIdentifier	 RECOGNIZED  FEATURES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
CONTINUE_AFTER_FATAL_ERROR	TokenNameIdentifier	 CONTINUE  AFTER  FATAL  ERROR
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Feature defaults. */	TokenNameCOMMENT_JAVADOC	 Feature defaults. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Boolean	TokenNameIdentifier	 Boolean
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FEATURE_DEFAULTS	TokenNameIdentifier	 FEATURE  DEFAULTS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Recognized properties. */	TokenNameCOMMENT_JAVADOC	 Recognized properties. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
RECOGNIZED_PROPERTIES	TokenNameIdentifier	 RECOGNIZED  PROPERTIES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
ERROR_HANDLER	TokenNameIdentifier	 ERROR  HANDLER
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Property defaults. */	TokenNameCOMMENT_JAVADOC	 Property defaults. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
PROPERTY_DEFAULTS	TokenNameIdentifier	 PROPERTY  DEFAULTS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** The locale to be used to format error messages. */	TokenNameCOMMENT_JAVADOC	 The locale to be used to format error messages. 
protected	TokenNameprotected	
Locale	TokenNameIdentifier	 Locale
fLocale	TokenNameIdentifier	 f Locale
;	TokenNameSEMICOLON	
/** Mapping of Message formatters for domains. */	TokenNameCOMMENT_JAVADOC	 Mapping of Message formatters for domains. 
protected	TokenNameprotected	
Hashtable	TokenNameIdentifier	 Hashtable
fMessageFormatters	TokenNameIdentifier	 f Message Formatters
;	TokenNameSEMICOLON	
/** Error handler. */	TokenNameCOMMENT_JAVADOC	 Error handler. 
protected	TokenNameprotected	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
fErrorHandler	TokenNameIdentifier	 f Error Handler
;	TokenNameSEMICOLON	
/** Document locator. */	TokenNameCOMMENT_JAVADOC	 Document locator. 
protected	TokenNameprotected	
XMLLocator	TokenNameIdentifier	 XML Locator
fLocator	TokenNameIdentifier	 f Locator
;	TokenNameSEMICOLON	
/** Continue after fatal error feature. */	TokenNameCOMMENT_JAVADOC	 Continue after fatal error feature. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fContinueAfterFatalError	TokenNameIdentifier	 f Continue After Fatal Error
;	TokenNameSEMICOLON	
/** * Default error handler. This error handler is only used in the * absence of a registered error handler so that errors are not * "swallowed" silently. This is one of the most common "problems" * reported by users of the parser. */	TokenNameCOMMENT_JAVADOC	 Default error handler. This error handler is only used in the absence of a registered error handler so that errors are not "swallowed" silently. This is one of the most common "problems" reported by users of the parser. 
protected	TokenNameprotected	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
fDefaultErrorHandler	TokenNameIdentifier	 f Default Error Handler
;	TokenNameSEMICOLON	
/** A SAX proxy to the error handler contained in this error reporter. */	TokenNameCOMMENT_JAVADOC	 A SAX proxy to the error handler contained in this error reporter. 
private	TokenNameprivate	
ErrorHandler	TokenNameIdentifier	 Error Handler
fSaxProxy	TokenNameIdentifier	 f Sax Proxy
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs an error reporter with a locator. */	TokenNameCOMMENT_JAVADOC	 Constructs an error reporter with a locator. 
public	TokenNamepublic	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: [Q] Should the locator be passed to the reportError 	TokenNameCOMMENT_LINE	REVISIT: [Q] Should the locator be passed to the reportError 
// method? Otherwise, there is no way for a parser 	TokenNameCOMMENT_LINE	method? Otherwise, there is no way for a parser 
// component to store information about where an 	TokenNameCOMMENT_LINE	component to store information about where an 
// error occurred so as to report it later. 	TokenNameCOMMENT_LINE	error occurred so as to report it later. 
// 	TokenNameCOMMENT_LINE	 
// An example would be to record the location of 	TokenNameCOMMENT_LINE	An example would be to record the location of 
// IDREFs so that, at the end of the document, if 	TokenNameCOMMENT_LINE	IDREFs so that, at the end of the document, if 
// there is no associated ID declared, the error 	TokenNameCOMMENT_LINE	there is no associated ID declared, the error 
// could report the location information of the 	TokenNameCOMMENT_LINE	could report the location information of the 
// reference. -Ac 	TokenNameCOMMENT_LINE	reference. -Ac 
// 	TokenNameCOMMENT_LINE	 
// NOTE: I added another reportError method that allows the 	TokenNameCOMMENT_LINE	NOTE: I added another reportError method that allows the 
// caller to specify the location of the error being 	TokenNameCOMMENT_LINE	caller to specify the location of the error being 
// reported. -Ac 	TokenNameCOMMENT_LINE	reported. -Ac 
fMessageFormatters	TokenNameIdentifier	 f Message Formatters
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
// 	TokenNameCOMMENT_LINE	 
// Methods 	TokenNameCOMMENT_LINE	Methods 
// 	TokenNameCOMMENT_LINE	 
/** * Sets the current locale. * * @param locale The new locale. */	TokenNameCOMMENT_JAVADOC	 Sets the current locale. * @param locale The new locale. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fLocale	TokenNameIdentifier	 f Locale
=	TokenNameEQUAL	
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setLocale(Locale) 	TokenNameCOMMENT_LINE	setLocale(Locale) 
/** * Gets the current locale. * * @return the current Locale */	TokenNameCOMMENT_JAVADOC	 Gets the current locale. * @return the current Locale 
public	TokenNamepublic	
Locale	TokenNameIdentifier	 Locale
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fLocale	TokenNameIdentifier	 f Locale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLocale(): Locale 	TokenNameCOMMENT_LINE	getLocale(): Locale 
/** * Sets the document locator. * * @param locator The locator. */	TokenNameCOMMENT_JAVADOC	 Sets the document locator. * @param locator The locator. 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
XMLLocator	TokenNameIdentifier	 XML Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fLocator	TokenNameIdentifier	 f Locator
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setDocumentLocator(XMLLocator) 	TokenNameCOMMENT_LINE	setDocumentLocator(XMLLocator) 
/** * Registers a message formatter for the specified domain. * <p> * <strong>Note:</strong> Registering a message formatter for a domain * when there is already a formatter registered will cause the previous * formatter to be lost. This method replaces any previously registered * message formatter for the specified domain. * * @param domain * @param messageFormatter */	TokenNameCOMMENT_JAVADOC	 Registers a message formatter for the specified domain. <p> <strong>Note:</strong> Registering a message formatter for a domain when there is already a formatter registered will cause the previous formatter to be lost. This method replaces any previously registered message formatter for the specified domain. * @param domain @param messageFormatter 
public	TokenNamepublic	
void	TokenNamevoid	
putMessageFormatter	TokenNameIdentifier	 put Message Formatter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
MessageFormatter	TokenNameIdentifier	 Message Formatter
messageFormatter	TokenNameIdentifier	 message Formatter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fMessageFormatters	TokenNameIdentifier	 f Message Formatters
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
messageFormatter	TokenNameIdentifier	 message Formatter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// putMessageFormatter(String,MessageFormatter) 	TokenNameCOMMENT_LINE	putMessageFormatter(String,MessageFormatter) 
/** * Returns the message formatter associated with the specified domain, * or null if no message formatter is registered for that domain. * * @param domain The domain of the message formatter. */	TokenNameCOMMENT_JAVADOC	 Returns the message formatter associated with the specified domain, or null if no message formatter is registered for that domain. * @param domain The domain of the message formatter. 
public	TokenNamepublic	
MessageFormatter	TokenNameIdentifier	 Message Formatter
getMessageFormatter	TokenNameIdentifier	 get Message Formatter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
MessageFormatter	TokenNameIdentifier	 Message Formatter
)	TokenNameRPAREN	
fMessageFormatters	TokenNameIdentifier	 f Message Formatters
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
domain	TokenNameIdentifier	 domain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getMessageFormatter(String):MessageFormatter 	TokenNameCOMMENT_LINE	getMessageFormatter(String):MessageFormatter 
/** * Removes the message formatter for the specified domain and * returns the removed message formatter. * * @param domain The domain of the message formatter. */	TokenNameCOMMENT_JAVADOC	 Removes the message formatter for the specified domain and returns the removed message formatter. * @param domain The domain of the message formatter. 
public	TokenNamepublic	
MessageFormatter	TokenNameIdentifier	 Message Formatter
removeMessageFormatter	TokenNameIdentifier	 remove Message Formatter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
MessageFormatter	TokenNameIdentifier	 Message Formatter
)	TokenNameRPAREN	
fMessageFormatters	TokenNameIdentifier	 f Message Formatters
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
domain	TokenNameIdentifier	 domain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// removeMessageFormatter(String):MessageFormatter 	TokenNameCOMMENT_LINE	removeMessageFormatter(String):MessageFormatter 
/** * Reports an error. The error message passed to the error handler * is formatted for the locale by the message formatter installed * for the specified error domain. * * @param domain The error domain. * @param key The key of the error message. * @param arguments The replacement arguments for the error message, * if needed. * @param severity The severity of the error. * @return The formatted error message. * * @see #SEVERITY_WARNING * @see #SEVERITY_ERROR * @see #SEVERITY_FATAL_ERROR */	TokenNameCOMMENT_JAVADOC	 Reports an error. The error message passed to the error handler is formatted for the locale by the message formatter installed for the specified error domain. * @param domain The error domain. @param key The key of the error message. @param arguments The replacement arguments for the error message, if needed. @param severity The severity of the error. @return The formatted error message. * @see #SEVERITY_WARNING @see #SEVERITY_ERROR @see #SEVERITY_FATAL_ERROR 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
,	TokenNameCOMMA	
short	TokenNameshort	
severity	TokenNameIdentifier	 severity
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
fLocator	TokenNameIdentifier	 f Locator
,	TokenNameCOMMA	
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
,	TokenNameCOMMA	
severity	TokenNameIdentifier	 severity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reportError(String,String,Object[],short):String 	TokenNameCOMMENT_LINE	reportError(String,String,Object[],short):String 
/** * Reports an error. The error message passed to the error handler * is formatted for the locale by the message formatter installed * for the specified error domain. * * @param domain The error domain. * @param key The key of the error message. * @param arguments The replacement arguments for the error message, * if needed. * @param severity The severity of the error. * @param exception The exception to wrap. * @return The formatted error message. * * @see #SEVERITY_WARNING * @see #SEVERITY_ERROR * @see #SEVERITY_FATAL_ERROR */	TokenNameCOMMENT_JAVADOC	 Reports an error. The error message passed to the error handler is formatted for the locale by the message formatter installed for the specified error domain. * @param domain The error domain. @param key The key of the error message. @param arguments The replacement arguments for the error message, if needed. @param severity The severity of the error. @param exception The exception to wrap. @return The formatted error message. * @see #SEVERITY_WARNING @see #SEVERITY_ERROR @see #SEVERITY_FATAL_ERROR 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
,	TokenNameCOMMA	
short	TokenNameshort	
severity	TokenNameIdentifier	 severity
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
fLocator	TokenNameIdentifier	 f Locator
,	TokenNameCOMMA	
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
,	TokenNameCOMMA	
severity	TokenNameIdentifier	 severity
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reportError(String,String,Object[],short,Exception):String 	TokenNameCOMMENT_LINE	reportError(String,String,Object[],short,Exception):String 
/** * Reports an error at a specific location. * * @param location The error location. * @param domain The error domain. * @param key The key of the error message. * @param arguments The replacement arguments for the error message, * if needed. * @param severity The severity of the error. * @return The formatted error message. * * @see #SEVERITY_WARNING * @see #SEVERITY_ERROR * @see #SEVERITY_FATAL_ERROR */	TokenNameCOMMENT_JAVADOC	 Reports an error at a specific location. * @param location The error location. @param domain The error domain. @param key The key of the error message. @param arguments The replacement arguments for the error message, if needed. @param severity The severity of the error. @return The formatted error message. * @see #SEVERITY_WARNING @see #SEVERITY_ERROR @see #SEVERITY_FATAL_ERROR 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLLocator	TokenNameIdentifier	 XML Locator
location	TokenNameIdentifier	 location
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
,	TokenNameCOMMA	
short	TokenNameshort	
severity	TokenNameIdentifier	 severity
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
,	TokenNameCOMMA	
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
,	TokenNameCOMMA	
severity	TokenNameIdentifier	 severity
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reportError(XMLLocator,String,String,Object[],short):String 	TokenNameCOMMENT_LINE	reportError(XMLLocator,String,String,Object[],short):String 
/** * Reports an error at a specific location. * * @param location The error location. * @param domain The error domain. * @param key The key of the error message. * @param arguments The replacement arguments for the error message, * if needed. * @param severity The severity of the error. * @param exception The exception to wrap. * @return The formatted error message. * * @see #SEVERITY_WARNING * @see #SEVERITY_ERROR * @see #SEVERITY_FATAL_ERROR */	TokenNameCOMMENT_JAVADOC	 Reports an error at a specific location. * @param location The error location. @param domain The error domain. @param key The key of the error message. @param arguments The replacement arguments for the error message, if needed. @param severity The severity of the error. @param exception The exception to wrap. @return The formatted error message. * @see #SEVERITY_WARNING @see #SEVERITY_ERROR @see #SEVERITY_FATAL_ERROR 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLLocator	TokenNameIdentifier	 XML Locator
location	TokenNameIdentifier	 location
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
,	TokenNameCOMMA	
short	TokenNameshort	
severity	TokenNameIdentifier	 severity
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// REVISIT: [Q] Should we do anything about invalid severity 	TokenNameCOMMENT_LINE	REVISIT: [Q] Should we do anything about invalid severity 
// parameter? -Ac 	TokenNameCOMMENT_LINE	parameter? -Ac 
// format error message and create parse exception 	TokenNameCOMMENT_LINE	format error message and create parse exception 
MessageFormatter	TokenNameIdentifier	 Message Formatter
messageFormatter	TokenNameIdentifier	 message Formatter
=	TokenNameEQUAL	
getMessageFormatter	TokenNameIdentifier	 get Message Formatter
(	TokenNameLPAREN	
domain	TokenNameIdentifier	 domain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
messageFormatter	TokenNameIdentifier	 message Formatter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
messageFormatter	TokenNameIdentifier	 message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
fLocale	TokenNameIdentifier	 f Locale
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
domain	TokenNameIdentifier	 domain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
argCount	TokenNameIdentifier	 arg Count
=	TokenNameEQUAL	
arguments	TokenNameIdentifier	 arguments
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
argCount	TokenNameIdentifier	 arg Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
argCount	TokenNameIdentifier	 arg Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
argCount	TokenNameIdentifier	 arg Count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XMLParseException	TokenNameIdentifier	 XML Parse Exception
parseException	TokenNameIdentifier	 parse Exception
=	TokenNameEQUAL	
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
XMLParseException	TokenNameIdentifier	 XML Parse Exception
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
XMLParseException	TokenNameIdentifier	 XML Parse Exception
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get error handler 	TokenNameCOMMENT_LINE	get error handler 
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
errorHandler	TokenNameIdentifier	 error Handler
=	TokenNameEQUAL	
fErrorHandler	TokenNameIdentifier	 f Error Handler
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
errorHandler	TokenNameIdentifier	 error Handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDefaultErrorHandler	TokenNameIdentifier	 f Default Error Handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDefaultErrorHandler	TokenNameIdentifier	 f Default Error Handler
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
errorHandler	TokenNameIdentifier	 error Handler
=	TokenNameEQUAL	
fDefaultErrorHandler	TokenNameIdentifier	 f Default Error Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// call error handler 	TokenNameCOMMENT_LINE	call error handler 
switch	TokenNameswitch	
(	TokenNameLPAREN	
severity	TokenNameIdentifier	 severity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SEVERITY_WARNING	TokenNameIdentifier	 SEVERITY  WARNING
:	TokenNameCOLON	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
parseException	TokenNameIdentifier	 parse Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
SEVERITY_ERROR	TokenNameIdentifier	 SEVERITY  ERROR
:	TokenNameCOLON	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
parseException	TokenNameIdentifier	 parse Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
:	TokenNameCOLON	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
parseException	TokenNameIdentifier	 parse Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fContinueAfterFatalError	TokenNameIdentifier	 f Continue After Fatal Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
parseException	TokenNameIdentifier	 parse Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reportError(XMLLocator,String,String,Object[],short,Exception):String 	TokenNameCOMMENT_LINE	reportError(XMLLocator,String,String,Object[],short,Exception):String 
// 	TokenNameCOMMENT_LINE	 
// XMLComponent methods 	TokenNameCOMMENT_LINE	XMLComponent methods 
// 	TokenNameCOMMENT_LINE	 
/** * Resets the component. The component can query the component manager * about any features and properties that affect the operation of the * component. * * @param componentManager The component manager. * * @throws SAXException Thrown by component on initialization error. * For example, if a feature or property is * required for the operation of the component, the * component manager may throw a * SAXNotRecognizedException or a * SAXNotSupportedException. */	TokenNameCOMMENT_JAVADOC	 Resets the component. The component can query the component manager about any features and properties that affect the operation of the component. * @param componentManager The component manager. * @throws SAXException Thrown by component on initialization error. For example, if a feature or property is required for the operation of the component, the component manager may throw a SAXNotRecognizedException or a SAXNotSupportedException. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
componentManager	TokenNameIdentifier	 component Manager
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// features 	TokenNameCOMMENT_LINE	features 
try	TokenNametry	
{	TokenNameLBRACE	
fContinueAfterFatalError	TokenNameIdentifier	 f Continue After Fatal Error
=	TokenNameEQUAL	
componentManager	TokenNameIdentifier	 component Manager
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
CONTINUE_AFTER_FATAL_ERROR	TokenNameIdentifier	 CONTINUE  AFTER  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XNIException	TokenNameIdentifier	 XNI Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fContinueAfterFatalError	TokenNameIdentifier	 f Continue After Fatal Error
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// properties 	TokenNameCOMMENT_LINE	properties 
fErrorHandler	TokenNameIdentifier	 f Error Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
)	TokenNameRPAREN	
componentManager	TokenNameIdentifier	 component Manager
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
ERROR_HANDLER	TokenNameIdentifier	 ERROR  HANDLER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reset(XMLComponentManager) 	TokenNameCOMMENT_LINE	reset(XMLComponentManager) 
/** * Returns a list of feature identifiers that are recognized by * this component. This method may return null if no features * are recognized by this component. */	TokenNameCOMMENT_JAVADOC	 Returns a list of feature identifiers that are recognized by this component. This method may return null if no features are recognized by this component. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRecognizedFeatures	TokenNameIdentifier	 get Recognized Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
RECOGNIZED_FEATURES	TokenNameIdentifier	 RECOGNIZED  FEATURES
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getRecognizedFeatures():String[] 	TokenNameCOMMENT_LINE	getRecognizedFeatures():String[] 
/** * Sets the state of a feature. This method is called by the component * manager any time after reset when a feature changes state. * <p> * <strong>Note:</strong> Components should silently ignore features * that do not affect the operation of the component. * * @param featureId The feature identifier. * @param state The state of the feature. * * @throws SAXNotRecognizedException The component should not throw * this exception. * @throws SAXNotSupportedException The component should not throw * this exception. */	TokenNameCOMMENT_JAVADOC	 Sets the state of a feature. This method is called by the component manager any time after reset when a feature changes state. <p> <strong>Note:</strong> Components should silently ignore features that do not affect the operation of the component. * @param featureId The feature identifier. @param state The state of the feature. * @throws SAXNotRecognizedException The component should not throw this exception. @throws SAXNotSupportedException The component should not throw this exception. 
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
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Xerces features 	TokenNameCOMMENT_LINE	Xerces features 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
suffixLength	TokenNameIdentifier	 suffix Length
=	TokenNameEQUAL	
featureId	TokenNameIdentifier	 feature Id
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// http://apache.org/xml/features/continue-after-fatal-error 	TokenNameCOMMENT_LINE	http://apache.org/xml/features/continue-after-fatal-error 
// Allows the parser to continue after a fatal error. 	TokenNameCOMMENT_LINE	Allows the parser to continue after a fatal error. 
// Normally, a fatal error would stop the parse. 	TokenNameCOMMENT_LINE	Normally, a fatal error would stop the parse. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
suffixLength	TokenNameIdentifier	 suffix Length
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
CONTINUE_AFTER_FATAL_ERROR_FEATURE	TokenNameIdentifier	 CONTINUE  AFTER  FATAL  ERROR  FEATURE
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
featureId	TokenNameIdentifier	 feature Id
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
CONTINUE_AFTER_FATAL_ERROR_FEATURE	TokenNameIdentifier	 CONTINUE  AFTER  FATAL  ERROR  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fContinueAfterFatalError	TokenNameIdentifier	 f Continue After Fatal Error
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// setFeature(String,boolean) 	TokenNameCOMMENT_LINE	setFeature(String,boolean) 
// return state of given feature or false if unsupported. 	TokenNameCOMMENT_LINE	return state of given feature or false if unsupported. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Xerces features 	TokenNameCOMMENT_LINE	Xerces features 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
suffixLength	TokenNameIdentifier	 suffix Length
=	TokenNameEQUAL	
featureId	TokenNameIdentifier	 feature Id
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// http://apache.org/xml/features/continue-after-fatal-error 	TokenNameCOMMENT_LINE	http://apache.org/xml/features/continue-after-fatal-error 
// Allows the parser to continue after a fatal error. 	TokenNameCOMMENT_LINE	Allows the parser to continue after a fatal error. 
// Normally, a fatal error would stop the parse. 	TokenNameCOMMENT_LINE	Normally, a fatal error would stop the parse. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
suffixLength	TokenNameIdentifier	 suffix Length
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
CONTINUE_AFTER_FATAL_ERROR_FEATURE	TokenNameIdentifier	 CONTINUE  AFTER  FATAL  ERROR  FEATURE
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
featureId	TokenNameIdentifier	 feature Id
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
CONTINUE_AFTER_FATAL_ERROR_FEATURE	TokenNameIdentifier	 CONTINUE  AFTER  FATAL  ERROR  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fContinueAfterFatalError	TokenNameIdentifier	 f Continue After Fatal Error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setFeature(String,boolean) 	TokenNameCOMMENT_LINE	setFeature(String,boolean) 
/** * Returns a list of property identifiers that are recognized by * this component. This method may return null if no properties * are recognized by this component. */	TokenNameCOMMENT_JAVADOC	 Returns a list of property identifiers that are recognized by this component. This method may return null if no properties are recognized by this component. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRecognizedProperties	TokenNameIdentifier	 get Recognized Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
RECOGNIZED_PROPERTIES	TokenNameIdentifier	 RECOGNIZED  PROPERTIES
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getRecognizedProperties():String[] 	TokenNameCOMMENT_LINE	getRecognizedProperties():String[] 
/** * Sets the value of a property. This method is called by the component * manager any time after reset when a property changes value. * <p> * <strong>Note:</strong> Components should silently ignore properties * that do not affect the operation of the component. * * @param propertyId The property identifier. * @param value The value of the property. * * @throws SAXNotRecognizedException The component should not throw * this exception. * @throws SAXNotSupportedException The component should not throw * this exception. */	TokenNameCOMMENT_JAVADOC	 Sets the value of a property. This method is called by the component manager any time after reset when a property changes value. <p> <strong>Note:</strong> Components should silently ignore properties that do not affect the operation of the component. * @param propertyId The property identifier. @param value The value of the property. * @throws SAXNotRecognizedException The component should not throw this exception. @throws SAXNotSupportedException The component should not throw this exception. 
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
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Xerces properties 	TokenNameCOMMENT_LINE	Xerces properties 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
suffixLength	TokenNameIdentifier	 suffix Length
=	TokenNameEQUAL	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
suffixLength	TokenNameIdentifier	 suffix Length
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ERROR_HANDLER_PROPERTY	TokenNameIdentifier	 ERROR  HANDLER  PROPERTY
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ERROR_HANDLER_PROPERTY	TokenNameIdentifier	 ERROR  HANDLER  PROPERTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorHandler	TokenNameIdentifier	 f Error Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// setProperty(String,Object) 	TokenNameCOMMENT_LINE	setProperty(String,Object) 
/** * Returns the default state for a feature, or null if this * component does not want to report a default value for this * feature. * * @param featureId The feature identifier. * * @since Xerces 2.2.0 */	TokenNameCOMMENT_JAVADOC	 Returns the default state for a feature, or null if this component does not want to report a default value for this feature. * @param featureId The feature identifier. * @since Xerces 2.2.0 
public	TokenNamepublic	
Boolean	TokenNameIdentifier	 Boolean
getFeatureDefault	TokenNameIdentifier	 get Feature Default
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
RECOGNIZED_FEATURES	TokenNameIdentifier	 RECOGNIZED  FEATURES
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
RECOGNIZED_FEATURES	TokenNameIdentifier	 RECOGNIZED  FEATURES
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FEATURE_DEFAULTS	TokenNameIdentifier	 FEATURE  DEFAULTS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFeatureDefault(String):Boolean 	TokenNameCOMMENT_LINE	getFeatureDefault(String):Boolean 
/** * Returns the default state for a property, or null if this * component does not want to report a default value for this * property. * * @param propertyId The property identifier. * * @since Xerces 2.2.0 */	TokenNameCOMMENT_JAVADOC	 Returns the default state for a property, or null if this component does not want to report a default value for this property. * @param propertyId The property identifier. * @since Xerces 2.2.0 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getPropertyDefault	TokenNameIdentifier	 get Property Default
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
RECOGNIZED_PROPERTIES	TokenNameIdentifier	 RECOGNIZED  PROPERTIES
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
RECOGNIZED_PROPERTIES	TokenNameIdentifier	 RECOGNIZED  PROPERTIES
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
PROPERTY_DEFAULTS	TokenNameIdentifier	 PROPERTY  DEFAULTS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getPropertyDefault(String):Object 	TokenNameCOMMENT_LINE	getPropertyDefault(String):Object 
/** * Get the internal XMLErrrorHandler. */	TokenNameCOMMENT_JAVADOC	 Get the internal XMLErrrorHandler. 
public	TokenNamepublic	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fErrorHandler	TokenNameIdentifier	 f Error Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the internal XMLErrorHandler * as SAX ErrorHandler. */	TokenNameCOMMENT_JAVADOC	 Gets the internal XMLErrorHandler as SAX ErrorHandler. 
public	TokenNamepublic	
ErrorHandler	TokenNameIdentifier	 Error Handler
getSAXErrorHandler	TokenNameIdentifier	 get SAX Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fSaxProxy	TokenNameIdentifier	 f Sax Proxy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSaxProxy	TokenNameIdentifier	 f Sax Proxy
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorHandlerProxy	TokenNameIdentifier	 Error Handler Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fErrorHandler	TokenNameIdentifier	 f Error Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fSaxProxy	TokenNameIdentifier	 f Sax Proxy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XMLErrorReporter 	TokenNameCOMMENT_LINE	class XMLErrorReporter 
