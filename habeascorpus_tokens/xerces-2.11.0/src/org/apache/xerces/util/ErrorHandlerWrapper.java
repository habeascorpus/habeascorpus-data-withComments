/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
;	TokenNameSEMICOLON	
/** * This class wraps a SAX error handler in an XNI error handler. * * @see ErrorHandler * * @author Andy Clark, IBM * * @version $Id: ErrorHandlerWrapper.java 447241 2006-09-18 05:12:57Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class wraps a SAX error handler in an XNI error handler. * @see ErrorHandler * @author Andy Clark, IBM * @version $Id: ErrorHandlerWrapper.java 447241 2006-09-18 05:12:57Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
ErrorHandlerWrapper	TokenNameIdentifier	 Error Handler Wrapper
implements	TokenNameimplements	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** The SAX error handler. */	TokenNameCOMMENT_JAVADOC	 The SAX error handler. 
protected	TokenNameprotected	
ErrorHandler	TokenNameIdentifier	 Error Handler
fErrorHandler	TokenNameIdentifier	 f Error Handler
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
ErrorHandlerWrapper	TokenNameIdentifier	 Error Handler Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Wraps the specified SAX error handler. */	TokenNameCOMMENT_JAVADOC	 Wraps the specified SAX error handler. 
public	TokenNamepublic	
ErrorHandlerWrapper	TokenNameIdentifier	 Error Handler Wrapper
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(ErrorHandler) 	TokenNameCOMMENT_LINE	<init>(ErrorHandler) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Sets the SAX error handler. */	TokenNameCOMMENT_JAVADOC	 Sets the SAX error handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorHandler	TokenNameIdentifier	 f Error Handler
=	TokenNameEQUAL	
errorHandler	TokenNameIdentifier	 error Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setErrorHandler(ErrorHandler) 	TokenNameCOMMENT_LINE	setErrorHandler(ErrorHandler) 
/** Returns the SAX error handler. */	TokenNameCOMMENT_JAVADOC	 Returns the SAX error handler. 
public	TokenNamepublic	
ErrorHandler	TokenNameIdentifier	 Error Handler
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fErrorHandler	TokenNameIdentifier	 f Error Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getErrorHandler():ErrorHandler 	TokenNameCOMMENT_LINE	getErrorHandler():ErrorHandler 
// 	TokenNameCOMMENT_LINE	 
// XMLErrorHandler methods 	TokenNameCOMMENT_LINE	XMLErrorHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** * Reports a warning. Warnings are non-fatal and can be safely ignored * by most applications. * * @param domain The domain of the warning. The domain can be any * string but is suggested to be a valid URI. The * domain can be used to conveniently specify a web * site location of the relevent specification or * document pertaining to this warning. * @param key The warning key. This key can be any string and * is implementation dependent. * @param exception Exception. * * @throws XNIException Thrown to signal that the parser should stop * parsing the document. */	TokenNameCOMMENT_JAVADOC	 Reports a warning. Warnings are non-fatal and can be safely ignored by most applications. * @param domain The domain of the warning. The domain can be any string but is suggested to be a valid URI. The domain can be used to conveniently specify a web site location of the relevent specification or document pertaining to this warning. @param key The warning key. This key can be any string and is implementation dependent. @param exception Exception. * @throws XNIException Thrown to signal that the parser should stop parsing the document. 
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
XMLParseException	TokenNameIdentifier	 XML Parse Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fErrorHandler	TokenNameIdentifier	 f Error Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
saxException	TokenNameIdentifier	 sax Exception
=	TokenNameEQUAL	
createSAXParseException	TokenNameIdentifier	 create SAX Parse Exception
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fErrorHandler	TokenNameIdentifier	 f Error Handler
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
saxException	TokenNameIdentifier	 sax Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLParseException	TokenNameIdentifier	 create XML Parse Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXNIException	TokenNameIdentifier	 create XNI Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// warning(String,String,XMLParseException) 	TokenNameCOMMENT_LINE	warning(String,String,XMLParseException) 
/** * Reports an error. Errors are non-fatal and usually signify that the * document is invalid with respect to its grammar(s). * * @param domain The domain of the error. The domain can be any * string but is suggested to be a valid URI. The * domain can be used to conveniently specify a web * site location of the relevent specification or * document pertaining to this error. * @param key The error key. This key can be any string and * is implementation dependent. * @param exception Exception. * * @throws XNIException Thrown to signal that the parser should stop * parsing the document. */	TokenNameCOMMENT_JAVADOC	 Reports an error. Errors are non-fatal and usually signify that the document is invalid with respect to its grammar(s). * @param domain The domain of the error. The domain can be any string but is suggested to be a valid URI. The domain can be used to conveniently specify a web site location of the relevent specification or document pertaining to this error. @param key The error key. This key can be any string and is implementation dependent. @param exception Exception. * @throws XNIException Thrown to signal that the parser should stop parsing the document. 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
XMLParseException	TokenNameIdentifier	 XML Parse Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fErrorHandler	TokenNameIdentifier	 f Error Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
saxException	TokenNameIdentifier	 sax Exception
=	TokenNameEQUAL	
createSAXParseException	TokenNameIdentifier	 create SAX Parse Exception
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fErrorHandler	TokenNameIdentifier	 f Error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
saxException	TokenNameIdentifier	 sax Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLParseException	TokenNameIdentifier	 create XML Parse Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXNIException	TokenNameIdentifier	 create XNI Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// error(String,String,XMLParseException) 	TokenNameCOMMENT_LINE	error(String,String,XMLParseException) 
/** * Report a fatal error. Fatal errors usually occur when the document * is not well-formed and signifies that the parser cannot continue * normal operation. * <p> * <strong>Note:</strong> The error handler should <em>always</em> * throw an <code>XNIException</code> from this method. This exception * can either be the same exception that is passed as a parameter to * the method or a new XNI exception object. If the registered error * handler fails to throw an exception, the continuing operation of * the parser is undetermined. * * @param domain The domain of the fatal error. The domain can be * any string but is suggested to be a valid URI. The * domain can be used to conveniently specify a web * site location of the relevent specification or * document pertaining to this fatal error. * @param key The fatal error key. This key can be any string * and is implementation dependent. * @param exception Exception. * * @throws XNIException Thrown to signal that the parser should stop * parsing the document. */	TokenNameCOMMENT_JAVADOC	 Report a fatal error. Fatal errors usually occur when the document is not well-formed and signifies that the parser cannot continue normal operation. <p> <strong>Note:</strong> The error handler should <em>always</em> throw an <code>XNIException</code> from this method. This exception can either be the same exception that is passed as a parameter to the method or a new XNI exception object. If the registered error handler fails to throw an exception, the continuing operation of the parser is undetermined. * @param domain The domain of the fatal error. The domain can be any string but is suggested to be a valid URI. The domain can be used to conveniently specify a web site location of the relevent specification or document pertaining to this fatal error. @param key The fatal error key. This key can be any string and is implementation dependent. @param exception Exception. * @throws XNIException Thrown to signal that the parser should stop parsing the document. 
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
XMLParseException	TokenNameIdentifier	 XML Parse Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fErrorHandler	TokenNameIdentifier	 f Error Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
saxException	TokenNameIdentifier	 sax Exception
=	TokenNameEQUAL	
createSAXParseException	TokenNameIdentifier	 create SAX Parse Exception
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fErrorHandler	TokenNameIdentifier	 f Error Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
saxException	TokenNameIdentifier	 sax Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLParseException	TokenNameIdentifier	 create XML Parse Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXNIException	TokenNameIdentifier	 create XNI Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// fatalError(String,String,XMLParseException) 	TokenNameCOMMENT_LINE	fatalError(String,String,XMLParseException) 
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
/** Creates a SAXParseException from an XMLParseException. */	TokenNameCOMMENT_JAVADOC	 Creates a SAXParseException from an XMLParseException. 
protected	TokenNameprotected	
static	TokenNamestatic	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
createSAXParseException	TokenNameIdentifier	 create SAX Parse Exception
(	TokenNameLPAREN	
XMLParseException	TokenNameIdentifier	 XML Parse Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createSAXParseException(XMLParseException):SAXParseException 	TokenNameCOMMENT_LINE	createSAXParseException(XMLParseException):SAXParseException 
/** Creates an XMLParseException from a SAXParseException. */	TokenNameCOMMENT_JAVADOC	 Creates an XMLParseException from a SAXParseException. 
protected	TokenNameprotected	
static	TokenNamestatic	
XMLParseException	TokenNameIdentifier	 XML Parse Exception
createXMLParseException	TokenNameIdentifier	 create XML Parse Exception
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fPublicId	TokenNameIdentifier	 f Public Id
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
fLineNumber	TokenNameIdentifier	 f Line Number
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
fColumnNumber	TokenNameIdentifier	 f Column Number
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLLocator	TokenNameIdentifier	 XML Locator
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
new	TokenNamenew	
XMLLocator	TokenNameIdentifier	 XML Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fPublicId	TokenNameIdentifier	 f Public Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseSystemId	TokenNameIdentifier	 get Base System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLiteralSystemId	TokenNameIdentifier	 get Literal System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fColumnNumber	TokenNameIdentifier	 f Column Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fLineNumber	TokenNameIdentifier	 f Line Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getCharacterOffset	TokenNameIdentifier	 get Character Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getXMLVersion	TokenNameIdentifier	 get XML Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
XMLParseException	TokenNameIdentifier	 XML Parse Exception
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createXMLParseException(SAXParseException):XMLParseException 	TokenNameCOMMENT_LINE	createXMLParseException(SAXParseException):XMLParseException 
/** Creates an XNIException from a SAXException. NOTE: care should be taken *not* to call this with a SAXParseException; this will lose information!!! */	TokenNameCOMMENT_JAVADOC	 Creates an XNIException from a SAXException. NOTE: care should be taken *not* to call this with a SAXParseException; this will lose information!!! 
protected	TokenNameprotected	
static	TokenNamestatic	
XNIException	TokenNameIdentifier	 XNI Exception
createXNIException	TokenNameIdentifier	 create XNI Exception
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XNIException	TokenNameIdentifier	 XNI Exception
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createXNIException(SAXException):XMLParseException 	TokenNameCOMMENT_LINE	createXNIException(SAXException):XMLParseException 
}	TokenNameRBRACE	
// class ErrorHandlerWrapper 	TokenNameCOMMENT_LINE	class ErrorHandlerWrapper 
