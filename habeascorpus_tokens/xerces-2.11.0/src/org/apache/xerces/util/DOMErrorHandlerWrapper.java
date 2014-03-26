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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMErrorImpl	TokenNameIdentifier	 DOM Error Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMError	TokenNameIdentifier	 DOM Error
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMLocator	TokenNameIdentifier	 DOM Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * This class handles DOM errors . * * @see DOMErrorHandler * * @author Gopal Sharma, SUN Microsystems Inc. * @version $Id: DOMErrorHandlerWrapper.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class handles DOM errors . * @see DOMErrorHandler * @author Gopal Sharma, SUN Microsystems Inc. @version $Id: DOMErrorHandlerWrapper.java 699892 2008-09-28 21:08:27Z mrglavas $ 
// REVISIT: current implementations wraps error several times: 	TokenNameCOMMENT_LINE	REVISIT: current implementations wraps error several times: 
// XMLErrorReport.reportError creates XMLParserException (by wrapping all info) 	TokenNameCOMMENT_LINE	XMLErrorReport.reportError creates XMLParserException (by wrapping all info) 
// and goes via switch to send errors. 	TokenNameCOMMENT_LINE	and goes via switch to send errors. 
// DOMErrorHandlerWrapper catches calls, copies info from XMLParserException and 	TokenNameCOMMENT_LINE	DOMErrorHandlerWrapper catches calls, copies info from XMLParserException and 
// sends one call back to the application 	TokenNameCOMMENT_LINE	sends one call back to the application 
// I think we can avoid this indirection if we modify XMLErrorReporter. --el 	TokenNameCOMMENT_LINE	I think we can avoid this indirection if we modify XMLErrorReporter. --el 
public	TokenNamepublic	
class	TokenNameclass	
DOMErrorHandlerWrapper	TokenNameIdentifier	 DOM Error Handler Wrapper
implements	TokenNameimplements	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
,	TokenNameCOMMA	
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
{	TokenNameLBRACE	
// It keeps the reference of DOMErrorHandler of application 	TokenNameCOMMENT_LINE	It keeps the reference of DOMErrorHandler of application 
protected	TokenNameprotected	
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
fDomErrorHandler	TokenNameIdentifier	 f Dom Error Handler
;	TokenNameSEMICOLON	
// Error Status 	TokenNameCOMMENT_LINE	Error Status 
boolean	TokenNameboolean	
eStatus	TokenNameIdentifier	 e Status
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Print writer 	TokenNameCOMMENT_LINE	Print writer 
protected	TokenNameprotected	
PrintWriter	TokenNameIdentifier	 Print Writer
fOut	TokenNameIdentifier	 f Out
;	TokenNameSEMICOLON	
// some components may set error node 	TokenNameCOMMENT_LINE	some components may set error node 
// @see DOMNormalizer. 	TokenNameCOMMENT_LINE	@see DOMNormalizer. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
/** Error code for comparisons. **/	TokenNameCOMMENT_JAVADOC	 Error code for comparisons. *
protected	TokenNameprotected	
final	TokenNamefinal	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
fErrorCode	TokenNameIdentifier	 f Error Code
=	TokenNameEQUAL	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
DOMErrorImpl	TokenNameIdentifier	 DOM Error Impl
fDOMError	TokenNameIdentifier	 f DOM Error
=	TokenNameEQUAL	
new	TokenNamenew	
DOMErrorImpl	TokenNameIdentifier	 DOM Error Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
// Default constructor / 	TokenNameCOMMENT_LINE	Default constructor / 
public	TokenNamepublic	
DOMErrorHandlerWrapper	TokenNameIdentifier	 DOM Error Handler Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fOut	TokenNameIdentifier	 f Out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DOMErrorHandlerWrapper	TokenNameIdentifier	 DOM Error Handler Wrapper
(	TokenNameLPAREN	
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
domErrorHandler	TokenNameIdentifier	 dom Error Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDomErrorHandler	TokenNameIdentifier	 f Dom Error Handler
=	TokenNameEQUAL	
domErrorHandler	TokenNameIdentifier	 dom Error Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DOMErrorHandlerWrapper(DOMErrorHandler domErrorHandler) 	TokenNameCOMMENT_LINE	DOMErrorHandlerWrapper(DOMErrorHandler domErrorHandler) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Sets the DOM error handler. */	TokenNameCOMMENT_JAVADOC	 Sets the DOM error handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDomErrorHandler	TokenNameIdentifier	 f Dom Error Handler
=	TokenNameEQUAL	
errorHandler	TokenNameIdentifier	 error Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setErrorHandler(ErrorHandler) 	TokenNameCOMMENT_LINE	setErrorHandler(ErrorHandler) 
public	TokenNamepublic	
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fDomErrorHandler	TokenNameIdentifier	 f Dom Error Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//getErrorHandler() 	TokenNameCOMMENT_LINE	getErrorHandler() 
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
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fSeverity	TokenNameIdentifier	 f Severity
=	TokenNameEQUAL	
DOMError	TokenNameIdentifier	 DOM Error
.	TokenNameDOT	
SEVERITY_WARNING	TokenNameIdentifier	 SEVERITY  WARNING
;	TokenNameSEMICOLON	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fException	TokenNameIdentifier	 f Exception
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
// REVISIT: May need to lookup from DOMErrorTypeMap in the future. 	TokenNameCOMMENT_LINE	REVISIT: May need to lookup from DOMErrorTypeMap in the future. 
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fRelatedData	TokenNameIdentifier	 f Related Data
=	TokenNameEQUAL	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fMessage	TokenNameIdentifier	 f Message
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fLocator	TokenNameIdentifier	 f Locator
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
fColumnNumber	TokenNameIdentifier	 f Column Number
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
fLineNumber	TokenNameIdentifier	 f Line Number
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
fUtf16Offset	TokenNameIdentifier	 f Utf16 Offset
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getCharacterOffset	TokenNameIdentifier	 get Character Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
fUri	TokenNameIdentifier	 f Uri
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
fRelatedNode	TokenNameIdentifier	 f Related Node
=	TokenNameEQUAL	
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDomErrorHandler	TokenNameIdentifier	 f Dom Error Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDomErrorHandler	TokenNameIdentifier	 f Dom Error Handler
.	TokenNameDOT	
handleError	TokenNameIdentifier	 handle Error
(	TokenNameLPAREN	
fDOMError	TokenNameIdentifier	 f DOM Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fSeverity	TokenNameIdentifier	 f Severity
=	TokenNameEQUAL	
DOMError	TokenNameIdentifier	 DOM Error
.	TokenNameDOT	
SEVERITY_ERROR	TokenNameIdentifier	 SEVERITY  ERROR
;	TokenNameSEMICOLON	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fException	TokenNameIdentifier	 f Exception
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
// REVISIT: May need to lookup from DOMErrorTypeMap in the future. 	TokenNameCOMMENT_LINE	REVISIT: May need to lookup from DOMErrorTypeMap in the future. 
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fRelatedData	TokenNameIdentifier	 f Related Data
=	TokenNameEQUAL	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fMessage	TokenNameIdentifier	 f Message
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fLocator	TokenNameIdentifier	 f Locator
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
fColumnNumber	TokenNameIdentifier	 f Column Number
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
fLineNumber	TokenNameIdentifier	 f Line Number
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
fUtf16Offset	TokenNameIdentifier	 f Utf16 Offset
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getCharacterOffset	TokenNameIdentifier	 get Character Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
fUri	TokenNameIdentifier	 f Uri
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
fRelatedNode	TokenNameIdentifier	 f Related Node
=	TokenNameEQUAL	
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDomErrorHandler	TokenNameIdentifier	 f Dom Error Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDomErrorHandler	TokenNameIdentifier	 f Dom Error Handler
.	TokenNameDOT	
handleError	TokenNameIdentifier	 handle Error
(	TokenNameLPAREN	
fDOMError	TokenNameIdentifier	 f DOM Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fSeverity	TokenNameIdentifier	 f Severity
=	TokenNameEQUAL	
DOMError	TokenNameIdentifier	 DOM Error
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
;	TokenNameSEMICOLON	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fException	TokenNameIdentifier	 f Exception
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
fErrorCode	TokenNameIdentifier	 f Error Code
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
domErrorType	TokenNameIdentifier	 dom Error Type
=	TokenNameEQUAL	
DOMErrorTypeMap	TokenNameIdentifier	 DOM Error Type Map
.	TokenNameDOT	
getDOMErrorType	TokenNameIdentifier	 get DOM Error Type
(	TokenNameLPAREN	
fErrorCode	TokenNameIdentifier	 f Error Code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
domErrorType	TokenNameIdentifier	 dom Error Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
domErrorType	TokenNameIdentifier	 dom Error Type
:	TokenNameCOLON	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fRelatedData	TokenNameIdentifier	 f Related Data
=	TokenNameEQUAL	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fMessage	TokenNameIdentifier	 f Message
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fLocator	TokenNameIdentifier	 f Locator
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
fColumnNumber	TokenNameIdentifier	 f Column Number
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
fLineNumber	TokenNameIdentifier	 f Line Number
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
fUtf16Offset	TokenNameIdentifier	 f Utf16 Offset
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getCharacterOffset	TokenNameIdentifier	 get Character Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
fUri	TokenNameIdentifier	 f Uri
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
fRelatedNode	TokenNameIdentifier	 f Related Node
=	TokenNameEQUAL	
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDomErrorHandler	TokenNameIdentifier	 f Dom Error Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDomErrorHandler	TokenNameIdentifier	 f Dom Error Handler
.	TokenNameDOT	
handleError	TokenNameIdentifier	 handle Error
(	TokenNameLPAREN	
fDOMError	TokenNameIdentifier	 f DOM Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// fatalError(String,String,XMLParseException) 	TokenNameCOMMENT_LINE	fatalError(String,String,XMLParseException) 
public	TokenNamepublic	
boolean	TokenNameboolean	
handleError	TokenNameIdentifier	 handle Error
(	TokenNameLPAREN	
DOMError	TokenNameIdentifier	 DOM Error
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printError	TokenNameIdentifier	 print Error
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
eStatus	TokenNameIdentifier	 e Status
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Prints the error message. */	TokenNameCOMMENT_JAVADOC	 Prints the error message. 
private	TokenNameprivate	
void	TokenNamevoid	
printError	TokenNameIdentifier	 print Error
(	TokenNameLPAREN	
DOMError	TokenNameIdentifier	 DOM Error
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
severity	TokenNameIdentifier	 severity
=	TokenNameEQUAL	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
getSeverity	TokenNameIdentifier	 get Severity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
severity	TokenNameIdentifier	 severity
==	TokenNameEQUAL_EQUAL	
DOMError	TokenNameIdentifier	 DOM Error
.	TokenNameDOT	
SEVERITY_WARNING	TokenNameIdentifier	 SEVERITY  WARNING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Warning"	TokenNameStringLiteral	Warning
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
severity	TokenNameIdentifier	 severity
==	TokenNameEQUAL_EQUAL	
DOMError	TokenNameIdentifier	 DOM Error
.	TokenNameDOT	
SEVERITY_ERROR	TokenNameIdentifier	 SEVERITY  ERROR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Error"	TokenNameStringLiteral	Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"FatalError"	TokenNameStringLiteral	FatalError
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eStatus	TokenNameIdentifier	 e Status
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//REVISIT: Abort processing if fatal error, do we need to?? 	TokenNameCOMMENT_LINE	REVISIT: Abort processing if fatal error, do we need to?? 
}	TokenNameRBRACE	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"] "	TokenNameStringLiteral	] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMLocator	TokenNameIdentifier	 DOM Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getByteOffset	TokenNameIdentifier	 get Byte Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getUtf16Offset	TokenNameIdentifier	 get Utf16 Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getRelatedNode	TokenNameIdentifier	 get Related Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getUri	TokenNameIdentifier	 get Uri
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// printError(DOMError) 	TokenNameCOMMENT_LINE	printError(DOMError) 
/** * A convenience class for converting between internal * error codes and DOM error types. */	TokenNameCOMMENT_JAVADOC	 A convenience class for converting between internal error codes and DOM error types. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
DOMErrorTypeMap	TokenNameIdentifier	 DOM Error Type Map
{	TokenNameLBRACE	
/** Map for converting internal error codes to DOM error types. **/	TokenNameCOMMENT_JAVADOC	 Map for converting internal error codes to DOM error types. *
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
// initialize error type table: internal error codes (represented by domain and key) need to be mapped to a DOM error type. 	TokenNameCOMMENT_LINE	initialize error type table: internal error codes (represented by domain and key) need to be mapped to a DOM error type. 
// REVISIT: do well-formedness issues involving XML declaration <?xml ... ?> need to be added to hash table (no XML declaration node in DOM, but Document includes xmlEncoding, xmlStandalone, xmlVersion, etc. 	TokenNameCOMMENT_LINE	REVISIT: do well-formedness issues involving XML declaration <?xml ... ?> need to be added to hash table (no XML declaration node in DOM, but Document includes xmlEncoding, xmlStandalone, xmlVersion, etc. 
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"InvalidCharInCDSect"	TokenNameStringLiteral	InvalidCharInCDSect
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"InvalidCharInContent"	TokenNameStringLiteral	InvalidCharInContent
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"TwoColonsInQName"	TokenNameStringLiteral	TwoColonsInQName
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"ColonNotLegalWithNS"	TokenNameStringLiteral	ColonNotLegalWithNS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"InvalidCharInProlog"	TokenNameStringLiteral	InvalidCharInProlog
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// e.g. in Processing Instruction 	TokenNameCOMMENT_LINE	e.g. in Processing Instruction 
// InvalidCharInXMLDecl omitted because XML declaration is not a DOM Node 	TokenNameCOMMENT_LINE	InvalidCharInXMLDecl omitted because XML declaration is not a DOM Node 
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"CDEndInContent"	TokenNameStringLiteral	CDEndInContent
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"CDSectUnterminated"	TokenNameStringLiteral	CDSectUnterminated
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"DoctypeNotAllowed"	TokenNameStringLiteral	DoctypeNotAllowed
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"doctype-not-allowed"	TokenNameStringLiteral	doctype-not-allowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"ETagRequired"	TokenNameStringLiteral	ETagRequired
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"ElementUnterminated"	TokenNameStringLiteral	ElementUnterminated
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"EqRequiredInAttribute"	TokenNameStringLiteral	EqRequiredInAttribute
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"OpenQuoteExpected"	TokenNameStringLiteral	OpenQuoteExpected
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"CloseQuoteExpected"	TokenNameStringLiteral	CloseQuoteExpected
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"ETagUnterminated"	TokenNameStringLiteral	ETagUnterminated
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MarkupNotRecognizedInContent"	TokenNameStringLiteral	MarkupNotRecognizedInContent
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"DoctypeIllegalInContent"	TokenNameStringLiteral	DoctypeIllegalInContent
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"doctype-not-allowed"	TokenNameStringLiteral	doctype-not-allowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"InvalidCharInAttValue"	TokenNameStringLiteral	InvalidCharInAttValue
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"InvalidCharInPI"	TokenNameStringLiteral	InvalidCharInPI
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"InvalidCharInInternalSubset"	TokenNameStringLiteral	InvalidCharInInternalSubset
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"QuoteRequiredInAttValue"	TokenNameStringLiteral	QuoteRequiredInAttValue
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"LessthanInAttValue"	TokenNameStringLiteral	LessthanInAttValue
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"AttributeValueUnterminated"	TokenNameStringLiteral	AttributeValueUnterminated
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"PITargetRequired"	TokenNameStringLiteral	PITargetRequired
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"SpaceRequiredInPI"	TokenNameStringLiteral	SpaceRequiredInPI
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"PIUnterminated"	TokenNameStringLiteral	PIUnterminated
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"ReservedPITarget"	TokenNameStringLiteral	ReservedPITarget
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"PI_NOT_IN_ONE_ENTITY"	TokenNameStringLiteral	PI_NOT_IN_ONE_ENTITY
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"PINotInOneEntity"	TokenNameStringLiteral	PINotInOneEntity
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"EncodingDeclInvalid"	TokenNameStringLiteral	EncodingDeclInvalid
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"unsupported-encoding"	TokenNameStringLiteral	unsupported-encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"EncodingByteOrderUnsupported"	TokenNameStringLiteral	EncodingByteOrderUnsupported
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"unsupported-encoding"	TokenNameStringLiteral	unsupported-encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"InvalidCharInEntityValue"	TokenNameStringLiteral	InvalidCharInEntityValue
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"InvalidCharInExternalSubset"	TokenNameStringLiteral	InvalidCharInExternalSubset
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"InvalidCharInIgnoreSect"	TokenNameStringLiteral	InvalidCharInIgnoreSect
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"InvalidCharInPublicID"	TokenNameStringLiteral	InvalidCharInPublicID
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"InvalidCharInSystemID"	TokenNameStringLiteral	InvalidCharInSystemID
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"SpaceRequiredAfterSYSTEM"	TokenNameStringLiteral	SpaceRequiredAfterSYSTEM
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"QuoteRequiredInSystemID"	TokenNameStringLiteral	QuoteRequiredInSystemID
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"SystemIDUnterminated"	TokenNameStringLiteral	SystemIDUnterminated
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"SpaceRequiredAfterPUBLIC"	TokenNameStringLiteral	SpaceRequiredAfterPUBLIC
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"QuoteRequiredInPublicID"	TokenNameStringLiteral	QuoteRequiredInPublicID
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"PublicIDUnterminated"	TokenNameStringLiteral	PublicIDUnterminated
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"PubidCharIllegal"	TokenNameStringLiteral	PubidCharIllegal
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"SpaceRequiredBetweenPublicAndSystem"	TokenNameStringLiteral	SpaceRequiredBetweenPublicAndSystem
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_BEFORE_ROOT_ELEMENT_TYPE_IN_DOCTYPEDECL"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_BEFORE_ROOT_ELEMENT_TYPE_IN_DOCTYPEDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// considered error in name of node (which follows !DOCTYPE) 	TokenNameCOMMENT_LINE	considered error in name of node (which follows !DOCTYPE) 
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_ROOT_ELEMENT_TYPE_REQUIRED"	TokenNameStringLiteral	MSG_ROOT_ELEMENT_TYPE_REQUIRED
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"DoctypedeclUnterminated"	TokenNameStringLiteral	DoctypedeclUnterminated
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"PEReferenceWithinMarkup"	TokenNameStringLiteral	PEReferenceWithinMarkup
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_MARKUP_NOT_RECOGNIZED_IN_DTD"	TokenNameStringLiteral	MSG_MARKUP_NOT_RECOGNIZED_IN_DTD
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_BEFORE_ELEMENT_TYPE_IN_ELEMENTDECL"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_BEFORE_ELEMENT_TYPE_IN_ELEMENTDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_ELEMENT_TYPE_REQUIRED_IN_ELEMENTDECL"	TokenNameStringLiteral	MSG_ELEMENT_TYPE_REQUIRED_IN_ELEMENTDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_BEFORE_CONTENTSPEC_IN_ELEMENTDECL"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_BEFORE_CONTENTSPEC_IN_ELEMENTDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_CONTENTSPEC_REQUIRED_IN_ELEMENTDECL"	TokenNameStringLiteral	MSG_CONTENTSPEC_REQUIRED_IN_ELEMENTDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"ElementDeclUnterminated"	TokenNameStringLiteral	ElementDeclUnterminated
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_OPEN_PAREN_OR_ELEMENT_TYPE_REQUIRED_IN_CHILDREN"	TokenNameStringLiteral	MSG_OPEN_PAREN_OR_ELEMENT_TYPE_REQUIRED_IN_CHILDREN
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_CLOSE_PAREN_REQUIRED_IN_CHILDREN"	TokenNameStringLiteral	MSG_CLOSE_PAREN_REQUIRED_IN_CHILDREN
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_ELEMENT_TYPE_REQUIRED_IN_MIXED_CONTENT"	TokenNameStringLiteral	MSG_ELEMENT_TYPE_REQUIRED_IN_MIXED_CONTENT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_CLOSE_PAREN_REQUIRED_IN_MIXED"	TokenNameStringLiteral	MSG_CLOSE_PAREN_REQUIRED_IN_MIXED
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MixedContentUnterminated"	TokenNameStringLiteral	MixedContentUnterminated
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_BEFORE_ELEMENT_TYPE_IN_ATTLISTDECL"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_BEFORE_ELEMENT_TYPE_IN_ATTLISTDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_ELEMENT_TYPE_REQUIRED_IN_ATTLISTDECL"	TokenNameStringLiteral	MSG_ELEMENT_TYPE_REQUIRED_IN_ATTLISTDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_BEFORE_ATTRIBUTE_NAME_IN_ATTDEF"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_BEFORE_ATTRIBUTE_NAME_IN_ATTDEF
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"AttNameRequiredInAttDef"	TokenNameStringLiteral	AttNameRequiredInAttDef
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_BEFORE_ATTTYPE_IN_ATTDEF"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_BEFORE_ATTTYPE_IN_ATTDEF
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"AttTypeRequiredInAttDef"	TokenNameStringLiteral	AttTypeRequiredInAttDef
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_BEFORE_DEFAULTDECL_IN_ATTDEF"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_BEFORE_DEFAULTDECL_IN_ATTDEF
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_DUPLICATE_ATTRIBUTE_DEFINITION"	TokenNameStringLiteral	MSG_DUPLICATE_ATTRIBUTE_DEFINITION
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_AFTER_NOTATION_IN_NOTATIONTYPE"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_AFTER_NOTATION_IN_NOTATIONTYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_OPEN_PAREN_REQUIRED_IN_NOTATIONTYPE"	TokenNameStringLiteral	MSG_OPEN_PAREN_REQUIRED_IN_NOTATIONTYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_NAME_REQUIRED_IN_NOTATIONTYPE"	TokenNameStringLiteral	MSG_NAME_REQUIRED_IN_NOTATIONTYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"NotationTypeUnterminated"	TokenNameStringLiteral	NotationTypeUnterminated
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_NMTOKEN_REQUIRED_IN_ENUMERATION"	TokenNameStringLiteral	MSG_NMTOKEN_REQUIRED_IN_ENUMERATION
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"EnumerationUnterminated"	TokenNameStringLiteral	EnumerationUnterminated
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_DISTINCT_TOKENS_IN_ENUMERATION"	TokenNameStringLiteral	MSG_DISTINCT_TOKENS_IN_ENUMERATION
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_DISTINCT_NOTATION_IN_ENUMERATION"	TokenNameStringLiteral	MSG_DISTINCT_NOTATION_IN_ENUMERATION
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_AFTER_FIXED_IN_DEFAULTDECL"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_AFTER_FIXED_IN_DEFAULTDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"IncludeSectUnterminated"	TokenNameStringLiteral	IncludeSectUnterminated
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"IgnoreSectUnterminated"	TokenNameStringLiteral	IgnoreSectUnterminated
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"NameRequiredInPEReference"	TokenNameStringLiteral	NameRequiredInPEReference
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"SemicolonRequiredInPEReference"	TokenNameStringLiteral	SemicolonRequiredInPEReference
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_BEFORE_ENTITY_NAME_IN_ENTITYDECL"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_BEFORE_ENTITY_NAME_IN_ENTITYDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// considered error in name of node (which follows !ENTITY) 	TokenNameCOMMENT_LINE	considered error in name of node (which follows !ENTITY) 
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_BEFORE_PERCENT_IN_PEDECL"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_BEFORE_PERCENT_IN_PEDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// considered error in name of node (which follows !ENTITY %) 	TokenNameCOMMENT_LINE	considered error in name of node (which follows !ENTITY %) 
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_BEFORE_ENTITY_NAME_IN_PEDECL"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_BEFORE_ENTITY_NAME_IN_PEDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// considered error in name of node (which follows !ENTITY %) 	TokenNameCOMMENT_LINE	considered error in name of node (which follows !ENTITY %) 
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_ENTITY_NAME_REQUIRED_IN_ENTITYDECL"	TokenNameStringLiteral	MSG_ENTITY_NAME_REQUIRED_IN_ENTITYDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// considered error in name of node (which follows !ENTITY) 	TokenNameCOMMENT_LINE	considered error in name of node (which follows !ENTITY) 
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_AFTER_ENTITY_NAME_IN_ENTITYDECL"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_AFTER_ENTITY_NAME_IN_ENTITYDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// considered error in name of node 	TokenNameCOMMENT_LINE	considered error in name of node 
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_BEFORE_NOTATION_NAME_IN_UNPARSED_ENTITYDECL"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_BEFORE_NOTATION_NAME_IN_UNPARSED_ENTITYDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_BEFORE_NDATA_IN_UNPARSED_ENTITYDECL"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_BEFORE_NDATA_IN_UNPARSED_ENTITYDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_NOTATION_NAME_REQUIRED_FOR_UNPARSED_ENTITYDECL"	TokenNameStringLiteral	MSG_NOTATION_NAME_REQUIRED_FOR_UNPARSED_ENTITYDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"EntityDeclUnterminated"	TokenNameStringLiteral	EntityDeclUnterminated
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_DUPLICATE_ENTITY_DEFINITION"	TokenNameStringLiteral	MSG_DUPLICATE_ENTITY_DEFINITION
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"ExternalIDRequired"	TokenNameStringLiteral	ExternalIDRequired
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_BEFORE_PUBIDLITERAL_IN_EXTERNALID"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_BEFORE_PUBIDLITERAL_IN_EXTERNALID
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_AFTER_PUBIDLITERAL_IN_EXTERNALID"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_AFTER_PUBIDLITERAL_IN_EXTERNALID
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_BEFORE_SYSTEMLITERAL_IN_EXTERNALID"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_BEFORE_SYSTEMLITERAL_IN_EXTERNALID
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_URI_FRAGMENT_IN_SYSTEMID"	TokenNameStringLiteral	MSG_URI_FRAGMENT_IN_SYSTEMID
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_BEFORE_NOTATION_NAME_IN_NOTATIONDECL"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_BEFORE_NOTATION_NAME_IN_NOTATIONDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// considered error in name of node, which follows !NOTATION 	TokenNameCOMMENT_LINE	considered error in name of node, which follows !NOTATION 
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_NOTATION_NAME_REQUIRED_IN_NOTATIONDECL"	TokenNameStringLiteral	MSG_NOTATION_NAME_REQUIRED_IN_NOTATIONDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// considered error in name of node, which follows !NOTATION 	TokenNameCOMMENT_LINE	considered error in name of node, which follows !NOTATION 
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_SPACE_REQUIRED_AFTER_NOTATION_NAME_IN_NOTATIONDECL"	TokenNameStringLiteral	MSG_SPACE_REQUIRED_AFTER_NOTATION_NAME_IN_NOTATIONDECL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// considered error in name of node, which follows !NOTATION 	TokenNameCOMMENT_LINE	considered error in name of node, which follows !NOTATION 
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"ExternalIDorPublicIDRequired"	TokenNameStringLiteral	ExternalIDorPublicIDRequired
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"NotationDeclUnterminated"	TokenNameStringLiteral	NotationDeclUnterminated
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"ReferenceToExternalEntity"	TokenNameStringLiteral	ReferenceToExternalEntity
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"ReferenceToUnparsedEntity"	TokenNameStringLiteral	ReferenceToUnparsedEntity
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// REVISIT: do EntityNotDeclared, RecursiveReference, RecursiveGeneralReference, RecursivePEReference belong here? 	TokenNameCOMMENT_LINE	REVISIT: do EntityNotDeclared, RecursiveReference, RecursiveGeneralReference, RecursivePEReference belong here? 
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"EncodingNotSupported"	TokenNameStringLiteral	EncodingNotSupported
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"unsupported-encoding"	TokenNameStringLiteral	unsupported-encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"EncodingRequired"	TokenNameStringLiteral	EncodingRequired
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"unsupported-encoding"	TokenNameStringLiteral	unsupported-encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"IllegalQName"	TokenNameStringLiteral	IllegalQName
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"ElementXMLNSPrefix"	TokenNameStringLiteral	ElementXMLNSPrefix
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"ElementPrefixUnbound"	TokenNameStringLiteral	ElementPrefixUnbound
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"AttributePrefixUnbound"	TokenNameStringLiteral	AttributePrefixUnbound
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"EmptyPrefixedAttName"	TokenNameStringLiteral	EmptyPrefixedAttName
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"PrefixDeclared"	TokenNameStringLiteral	PrefixDeclared
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getDOMErrorType	TokenNameIdentifier	 get DOM Error Type
(	TokenNameLPAREN	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fgDOMErrorTypeTable	TokenNameIdentifier	 fg DOM Error Type Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
DOMErrorTypeMap	TokenNameIdentifier	 DOM Error Type Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class DOMErrorHandlerWrapper 	TokenNameCOMMENT_LINE	class DOMErrorHandlerWrapper 
