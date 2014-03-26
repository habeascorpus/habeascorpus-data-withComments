/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DefaultErrorHandler.java 524806 2007-04-02 15:51:39Z zongaro $ */	TokenNameCOMMENT_BLOCK	 $Id: DefaultErrorHandler.java 524806 2007-04-02 15:51:39Z zongaro $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
ErrorListener	TokenNameIdentifier	 Error Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SourceLocator	TokenNameIdentifier	 Source Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLMessages	TokenNameIdentifier	 XML Messages
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
/** * Implement SAX error handler for default reporting. * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 Implement SAX error handler for default reporting. @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
implements	TokenNameimplements	
ErrorHandler	TokenNameIdentifier	 Error Handler
,	TokenNameCOMMA	
ErrorListener	TokenNameIdentifier	 Error Listener
{	TokenNameLBRACE	
PrintWriter	TokenNameIdentifier	 Print Writer
m_pw	TokenNameIdentifier	 m pw
;	TokenNameSEMICOLON	
/** * if this flag is set to true, we will rethrow the exception on * the error() and fatalError() methods. If it is false, the errors * are reported to System.err. */	TokenNameCOMMENT_JAVADOC	 if this flag is set to true, we will rethrow the exception on the error() and fatalError() methods. If it is false, the errors are reported to System.err. 
boolean	TokenNameboolean	
m_throwExceptionOnError	TokenNameIdentifier	 m throw Exception On Error
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Constructor DefaultErrorHandler */	TokenNameCOMMENT_JAVADOC	 Constructor DefaultErrorHandler 
public	TokenNamepublic	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_pw	TokenNameIdentifier	 m pw
=	TokenNameEQUAL	
pw	TokenNameIdentifier	 pw
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor DefaultErrorHandler */	TokenNameCOMMENT_JAVADOC	 Constructor DefaultErrorHandler 
public	TokenNamepublic	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_pw	TokenNameIdentifier	 m pw
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
pw	TokenNameIdentifier	 pw
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor DefaultErrorHandler */	TokenNameCOMMENT_JAVADOC	 Constructor DefaultErrorHandler 
public	TokenNamepublic	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor DefaultErrorHandler */	TokenNameCOMMENT_JAVADOC	 Constructor DefaultErrorHandler 
public	TokenNamepublic	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
(	TokenNameLPAREN	
boolean	TokenNameboolean	
throwExceptionOnError	TokenNameIdentifier	 throw Exception On Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Defer creation of a PrintWriter until it's actually needed 	TokenNameCOMMENT_LINE	Defer creation of a PrintWriter until it's actually needed 
m_throwExceptionOnError	TokenNameIdentifier	 m throw Exception On Error
=	TokenNameEQUAL	
throwExceptionOnError	TokenNameIdentifier	 throw Exception On Error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve <code>java.io.PrintWriter</code> to which errors are being * directed. * @return The <code>PrintWriter</code> installed via the constructor * or the default <code>PrintWriter</code> */	TokenNameCOMMENT_JAVADOC	 Retrieve <code>java.io.PrintWriter</code> to which errors are being directed. @return The <code>PrintWriter</code> installed via the constructor or the default <code>PrintWriter</code> 
public	TokenNamepublic	
PrintWriter	TokenNameIdentifier	 Print Writer
getErrorWriter	TokenNameIdentifier	 get Error Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Defer creating the java.io.PrintWriter until an error needs to be 	TokenNameCOMMENT_LINE	Defer creating the java.io.PrintWriter until an error needs to be 
// reported. 	TokenNameCOMMENT_LINE	reported. 
if	TokenNameif	
(	TokenNameLPAREN	
m_pw	TokenNameIdentifier	 m pw
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_pw	TokenNameIdentifier	 m pw
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_pw	TokenNameIdentifier	 m pw
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a warning. * * <p>SAX parsers will use this method to report conditions that * are not errors or fatal errors as defined by the XML 1.0 * recommendation. The default behaviour is to take no action.</p> * * <p>The SAX parser must continue to provide normal parsing events * after invoking this method: it should still be possible for the * application to process the document through to the end.</p> * * @param exception The warning information encapsulated in a * SAX parse exception. * @throws SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of a warning. * <p>SAX parsers will use this method to report conditions that are not errors or fatal errors as defined by the XML 1.0 recommendation. The default behaviour is to take no action.</p> * <p>The SAX parser must continue to provide normal parsing events after invoking this method: it should still be possible for the application to process the document through to the end.</p> * @param exception The warning information encapsulated in a SAX parse exception. @throws SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
=	TokenNameEQUAL	
getErrorWriter	TokenNameIdentifier	 get Error Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printLocation	TokenNameIdentifier	 print Location
(	TokenNameLPAREN	
pw	TokenNameIdentifier	 pw
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parser warning: "	TokenNameStringLiteral	Parser warning: 
+	TokenNamePLUS	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a recoverable error. * * <p>This corresponds to the definition of "error" in section 1.2 * of the W3C XML 1.0 Recommendation. For example, a validating * parser would use this callback to report the violation of a * validity constraint. The default behaviour is to take no * action.</p> * * <p>The SAX parser must continue to provide normal parsing events * after invoking this method: it should still be possible for the * application to process the document through to the end. If the * application cannot do so, then the parser should report a fatal * error even if the XML 1.0 recommendation does not require it to * do so.</p> * * @param exception The error information encapsulated in a * SAX parse exception. * @throws SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of a recoverable error. * <p>This corresponds to the definition of "error" in section 1.2 of the W3C XML 1.0 Recommendation. For example, a validating parser would use this callback to report the violation of a validity constraint. The default behaviour is to take no action.</p> * <p>The SAX parser must continue to provide normal parsing events after invoking this method: it should still be possible for the application to process the document through to the end. If the application cannot do so, then the parser should report a fatal error even if the XML 1.0 recommendation does not require it to do so.</p> * @param exception The error information encapsulated in a SAX parse exception. @throws SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
//printLocation(exception); 	TokenNameCOMMENT_LINE	printLocation(exception); 
// getErrorWriter().println(exception.getMessage()); 	TokenNameCOMMENT_LINE	getErrorWriter().println(exception.getMessage()); 
throw	TokenNamethrow	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a non-recoverable error. * * <p>This corresponds to the definition of "fatal error" in * section 1.2 of the W3C XML 1.0 Recommendation. For example, a * parser would use this callback to report the violation of a * well-formedness constraint.</p> * * <p>The application must assume that the document is unusable * after the parser has invoked this method, and should continue * (if at all) only for the sake of collecting addition error * messages: in fact, SAX parsers are free to stop reporting any * other events once this method has been invoked.</p> * * @param exception The error information encapsulated in a * SAX parse exception. * @throws SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of a non-recoverable error. * <p>This corresponds to the definition of "fatal error" in section 1.2 of the W3C XML 1.0 Recommendation. For example, a parser would use this callback to report the violation of a well-formedness constraint.</p> * <p>The application must assume that the document is unusable after the parser has invoked this method, and should continue (if at all) only for the sake of collecting addition error messages: in fact, SAX parsers are free to stop reporting any other events once this method has been invoked.</p> * @param exception The error information encapsulated in a SAX parse exception. @throws SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// printLocation(exception); 	TokenNameCOMMENT_LINE	printLocation(exception); 
// getErrorWriter().println(exception.getMessage()); 	TokenNameCOMMENT_LINE	getErrorWriter().println(exception.getMessage()); 
throw	TokenNamethrow	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a warning. * * <p>SAX parsers will use this method to report conditions that * are not errors or fatal errors as defined by the XML 1.0 * recommendation. The default behaviour is to take no action.</p> * * <p>The SAX parser must continue to provide normal parsing events * after invoking this method: it should still be possible for the * application to process the document through to the end.</p> * * @param exception The warning information encapsulated in a * SAX parse exception. * @throws javax.xml.transform.TransformerException Any SAX exception, possibly * wrapping another exception. * @see javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a warning. * <p>SAX parsers will use this method to report conditions that are not errors or fatal errors as defined by the XML 1.0 recommendation. The default behaviour is to take no action.</p> * <p>The SAX parser must continue to provide normal parsing events after invoking this method: it should still be possible for the application to process the document through to the end.</p> * @param exception The warning information encapsulated in a SAX parse exception. @throws javax.xml.transform.TransformerException Any SAX exception, possibly wrapping another exception. @see javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
=	TokenNameEQUAL	
getErrorWriter	TokenNameIdentifier	 get Error Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printLocation	TokenNameIdentifier	 print Location
(	TokenNameLPAREN	
pw	TokenNameIdentifier	 pw
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a recoverable error. * * <p>This corresponds to the definition of "error" in section 1.2 * of the W3C XML 1.0 Recommendation. For example, a validating * parser would use this callback to report the violation of a * validity constraint. The default behaviour is to take no * action.</p> * * <p>The SAX parser must continue to provide normal parsing events * after invoking this method: it should still be possible for the * application to process the document through to the end. If the * application cannot do so, then the parser should report a fatal * error even if the XML 1.0 recommendation does not require it to * do so.</p> * * @param exception The error information encapsulated in a * SAX parse exception. * @throws javax.xml.transform.TransformerException Any SAX exception, possibly * wrapping another exception. * @see javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a recoverable error. * <p>This corresponds to the definition of "error" in section 1.2 of the W3C XML 1.0 Recommendation. For example, a validating parser would use this callback to report the violation of a validity constraint. The default behaviour is to take no action.</p> * <p>The SAX parser must continue to provide normal parsing events after invoking this method: it should still be possible for the application to process the document through to the end. If the application cannot do so, then the parser should report a fatal error even if the XML 1.0 recommendation does not require it to do so.</p> * @param exception The error information encapsulated in a SAX parse exception. @throws javax.xml.transform.TransformerException Any SAX exception, possibly wrapping another exception. @see javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// If the m_throwExceptionOnError flag is true, rethrow the exception. 	TokenNameCOMMENT_LINE	If the m_throwExceptionOnError flag is true, rethrow the exception. 
// Otherwise report the error to System.err. 	TokenNameCOMMENT_LINE	Otherwise report the error to System.err. 
if	TokenNameif	
(	TokenNameLPAREN	
m_throwExceptionOnError	TokenNameIdentifier	 m throw Exception On Error
)	TokenNameRPAREN	
throw	TokenNamethrow	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
=	TokenNameEQUAL	
getErrorWriter	TokenNameIdentifier	 get Error Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printLocation	TokenNameIdentifier	 print Location
(	TokenNameLPAREN	
pw	TokenNameIdentifier	 pw
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive notification of a non-recoverable error. * * <p>This corresponds to the definition of "fatal error" in * section 1.2 of the W3C XML 1.0 Recommendation. For example, a * parser would use this callback to report the violation of a * well-formedness constraint.</p> * * <p>The application must assume that the document is unusable * after the parser has invoked this method, and should continue * (if at all) only for the sake of collecting addition error * messages: in fact, SAX parsers are free to stop reporting any * other events once this method has been invoked.</p> * * @param exception The error information encapsulated in a * SAX parse exception. * @throws javax.xml.transform.TransformerException Any SAX exception, possibly * wrapping another exception. * @see javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a non-recoverable error. * <p>This corresponds to the definition of "fatal error" in section 1.2 of the W3C XML 1.0 Recommendation. For example, a parser would use this callback to report the violation of a well-formedness constraint.</p> * <p>The application must assume that the document is unusable after the parser has invoked this method, and should continue (if at all) only for the sake of collecting addition error messages: in fact, SAX parsers are free to stop reporting any other events once this method has been invoked.</p> * @param exception The error information encapsulated in a SAX parse exception. @throws javax.xml.transform.TransformerException Any SAX exception, possibly wrapping another exception. @see javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// If the m_throwExceptionOnError flag is true, rethrow the exception. 	TokenNameCOMMENT_LINE	If the m_throwExceptionOnError flag is true, rethrow the exception. 
// Otherwise report the error to System.err. 	TokenNameCOMMENT_LINE	Otherwise report the error to System.err. 
if	TokenNameif	
(	TokenNameLPAREN	
m_throwExceptionOnError	TokenNameIdentifier	 m throw Exception On Error
)	TokenNameRPAREN	
throw	TokenNamethrow	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
=	TokenNameEQUAL	
getErrorWriter	TokenNameIdentifier	 get Error Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printLocation	TokenNameIdentifier	 print Location
(	TokenNameLPAREN	
pw	TokenNameIdentifier	 pw
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
ensureLocationSet	TokenNameIdentifier	 ensure Location Set
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// SourceLocator locator = exception.getLocator(); 	TokenNameCOMMENT_LINE	SourceLocator locator = exception.getLocator(); 
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
// Try to find the locator closest to the cause. 	TokenNameCOMMENT_LINE	Try to find the locator closest to the cause. 
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
instanceof	TokenNameinstanceof	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
new	TokenNamenew	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
instanceof	TokenNameinstanceof	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SourceLocator	TokenNameIdentifier	 Source Locator
causeLocator	TokenNameIdentifier	 cause Locator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
.	TokenNameDOT	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
causeLocator	TokenNameIdentifier	 cause Locator
)	TokenNameRPAREN	
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
causeLocator	TokenNameIdentifier	 cause Locator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
instanceof	TokenNameinstanceof	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
instanceof	TokenNameinstanceof	
SAXException	TokenNameIdentifier	 SAX Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
cause	TokenNameIdentifier	 cause
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
setLocator	TokenNameIdentifier	 set Locator
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
printLocation	TokenNameIdentifier	 print Location
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
pw	TokenNameIdentifier	 pw
,	TokenNameCOMMA	
TransformerException	TokenNameIdentifier	 Transformer Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printLocation	TokenNameIdentifier	 print Location
(	TokenNameLPAREN	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
printLocation	TokenNameIdentifier	 print Location
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
pw	TokenNameIdentifier	 pw
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printLocation	TokenNameIdentifier	 print Location
(	TokenNameLPAREN	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
printLocation	TokenNameIdentifier	 print Location
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
// Try to find the locator closest to the cause. 	TokenNameCOMMENT_LINE	Try to find the locator closest to the cause. 
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
instanceof	TokenNameinstanceof	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
new	TokenNamenew	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
instanceof	TokenNameinstanceof	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SourceLocator	TokenNameIdentifier	 Source Locator
causeLocator	TokenNameIdentifier	 cause Locator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
.	TokenNameDOT	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
causeLocator	TokenNameIdentifier	 cause Locator
)	TokenNameRPAREN	
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
causeLocator	TokenNameIdentifier	 cause Locator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
instanceof	TokenNameinstanceof	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
instanceof	TokenNameinstanceof	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
instanceof	TokenNameinstanceof	
SAXException	TokenNameIdentifier	 SAX Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
cause	TokenNameIdentifier	 cause
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// getErrorWriter().println("Parser fatal error: "+exception.getMessage()); 	TokenNameCOMMENT_LINE	getErrorWriter().println("Parser fatal error: "+exception.getMessage()); 
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_SYSTEMID_UNKNOWN	TokenNameIdentifier	 ER  SYSTEMID  UNKNOWN
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"SystemId Unknown"; 	TokenNameCOMMENT_LINE	"SystemId Unknown"; 
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
"; "	TokenNameStringLiteral	; 
+	TokenNamePLUS	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
"line"	TokenNameStringLiteral	line
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
+	TokenNamePLUS	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"; "	TokenNameStringLiteral	; 
+	TokenNamePLUS	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
"column"	TokenNameStringLiteral	column
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
+	TokenNamePLUS	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"; "	TokenNameStringLiteral	; 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_LOCATION_UNKNOWN	TokenNameIdentifier	 ER  LOCATION  UNKNOWN
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
