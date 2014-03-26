/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ListingErrorHandler.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ListingErrorHandler.java 468655 2006-10-28 07:12:06Z minchau $ 
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
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URLConnection	TokenNameIdentifier	 URL Connection
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
/** * Sample implementation of similar SAX ErrorHandler and JAXP ErrorListener. * * <p>This implementation is suitable for various use cases, and * provides some basic configuration API's as well to control * when we re-throw errors, etc.</p> * * @author shane_curcuru@us.ibm.com * @version $Id: ListingErrorHandler.java 468655 2006-10-28 07:12:06Z minchau $ * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 Sample implementation of similar SAX ErrorHandler and JAXP ErrorListener. * <p>This implementation is suitable for various use cases, and provides some basic configuration API's as well to control when we re-throw errors, etc.</p> * @author shane_curcuru@us.ibm.com @version $Id: ListingErrorHandler.java 468655 2006-10-28 07:12:06Z minchau $ @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
ListingErrorHandler	TokenNameIdentifier	 Listing Error Handler
implements	TokenNameimplements	
ErrorHandler	TokenNameIdentifier	 Error Handler
,	TokenNameCOMMA	
ErrorListener	TokenNameIdentifier	 Error Listener
{	TokenNameLBRACE	
protected	TokenNameprotected	
PrintWriter	TokenNameIdentifier	 Print Writer
m_pw	TokenNameIdentifier	 m pw
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructor ListingErrorHandler; user-supplied PrintWriter. */	TokenNameCOMMENT_JAVADOC	 Constructor ListingErrorHandler; user-supplied PrintWriter. 
public	TokenNamepublic	
ListingErrorHandler	TokenNameIdentifier	 Listing Error Handler
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_ERRORHANDLER_CREATED_WITH_NULL_PRINTWRITER	TokenNameIdentifier	 ER  ERRORHANDLER  CREATED  WITH  NULL  PRINTWRITER
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "ListingErrorHandler created with null PrintWriter!"); 	TokenNameCOMMENT_LINE	"ListingErrorHandler created with null PrintWriter!"); 
m_pw	TokenNameIdentifier	 m pw
=	TokenNameEQUAL	
pw	TokenNameIdentifier	 pw
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor ListingErrorHandler; uses System.err. */	TokenNameCOMMENT_JAVADOC	 Constructor ListingErrorHandler; uses System.err. 
public	TokenNamepublic	
ListingErrorHandler	TokenNameIdentifier	 Listing Error Handler
(	TokenNameLPAREN	
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
/* ======== Implement org.xml.sax.ErrorHandler ======== */	TokenNameCOMMENT_BLOCK	 ======== Implement org.xml.sax.ErrorHandler ======== 
/** * Receive notification of a warning. * * <p>SAX parsers will use this method to report conditions that * are not errors or fatal errors as defined by the XML 1.0 * recommendation. The default behaviour is to take no action.</p> * * <p>The SAX parser must continue to provide normal parsing events * after invoking this method: it should still be possible for the * application to process the document through to the end.</p> * * <p>Filters may use this method to report other, non-XML warnings * as well.</p> * * @param exception The warning information encapsulated in a * SAX parse exception. * @exception org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception; only if setThrowOnWarning is true. * @see org.xml.sax.SAXParseException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a warning. * <p>SAX parsers will use this method to report conditions that are not errors or fatal errors as defined by the XML 1.0 recommendation. The default behaviour is to take no action.</p> * <p>The SAX parser must continue to provide normal parsing events after invoking this method: it should still be possible for the application to process the document through to the end.</p> * <p>Filters may use this method to report other, non-XML warnings as well.</p> * @param exception The warning information encapsulated in a SAX parse exception. @exception org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception; only if setThrowOnWarning is true. @see org.xml.sax.SAXParseException 
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
logExceptionLocation	TokenNameIdentifier	 log Exception Location
(	TokenNameLPAREN	
m_pw	TokenNameIdentifier	 m pw
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Note: should we really call .toString() below, since 	TokenNameCOMMENT_LINE	Note: should we really call .toString() below, since 
// sometimes the message is not properly set? 	TokenNameCOMMENT_LINE	sometimes the message is not properly set? 
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: "	TokenNameStringLiteral	warning: 
+	TokenNamePLUS	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getThrowOnWarning	TokenNameIdentifier	 get Throw On Warning
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a recoverable error. * * <p>This corresponds to the definition of "error" in section 1.2 * of the W3C XML 1.0 Recommendation. For example, a validating * parser would use this callback to report the violation of a * validity constraint. The default behaviour is to take no * action.</p> * * <p>The SAX parser must continue to provide normal parsing events * after invoking this method: it should still be possible for the * application to process the document through to the end. If the * application cannot do so, then the parser should report a fatal * error even if the XML 1.0 recommendation does not require it to * do so.</p> * * <p>Filters may use this method to report other, non-XML errors * as well.</p> * * @param exception The error information encapsulated in a * SAX parse exception. * @exception org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception; only if setThrowOnErroris true. * @see org.xml.sax.SAXParseException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a recoverable error. * <p>This corresponds to the definition of "error" in section 1.2 of the W3C XML 1.0 Recommendation. For example, a validating parser would use this callback to report the violation of a validity constraint. The default behaviour is to take no action.</p> * <p>The SAX parser must continue to provide normal parsing events after invoking this method: it should still be possible for the application to process the document through to the end. If the application cannot do so, then the parser should report a fatal error even if the XML 1.0 recommendation does not require it to do so.</p> * <p>Filters may use this method to report other, non-XML errors as well.</p> * @param exception The error information encapsulated in a SAX parse exception. @exception org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception; only if setThrowOnErroris true. @see org.xml.sax.SAXParseException 
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
logExceptionLocation	TokenNameIdentifier	 log Exception Location
(	TokenNameLPAREN	
m_pw	TokenNameIdentifier	 m pw
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: "	TokenNameStringLiteral	error: 
+	TokenNamePLUS	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getThrowOnError	TokenNameIdentifier	 get Throw On Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a non-recoverable error. * * <p>This corresponds to the definition of "fatal error" in * section 1.2 of the W3C XML 1.0 Recommendation. For example, a * parser would use this callback to report the violation of a * well-formedness constraint.</p> * * <p>The application must assume that the document is unusable * after the parser has invoked this method, and should continue * (if at all) only for the sake of collecting addition error * messages: in fact, SAX parsers are free to stop reporting any * other events once this method has been invoked.</p> * * @param exception The error information encapsulated in a * SAX parse exception. * @exception org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception; only if setThrowOnFatalError is true. * @see org.xml.sax.SAXParseException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a non-recoverable error. * <p>This corresponds to the definition of "fatal error" in section 1.2 of the W3C XML 1.0 Recommendation. For example, a parser would use this callback to report the violation of a well-formedness constraint.</p> * <p>The application must assume that the document is unusable after the parser has invoked this method, and should continue (if at all) only for the sake of collecting addition error messages: in fact, SAX parsers are free to stop reporting any other events once this method has been invoked.</p> * @param exception The error information encapsulated in a SAX parse exception. @exception org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception; only if setThrowOnFatalError is true. @see org.xml.sax.SAXParseException 
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
logExceptionLocation	TokenNameIdentifier	 log Exception Location
(	TokenNameLPAREN	
m_pw	TokenNameIdentifier	 m pw
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"fatalError: "	TokenNameStringLiteral	fatalError: 
+	TokenNamePLUS	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getThrowOnFatalError	TokenNameIdentifier	 get Throw On Fatal Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* ======== Implement javax.xml.transform.ErrorListener ======== */	TokenNameCOMMENT_BLOCK	 ======== Implement javax.xml.transform.ErrorListener ======== 
/** * Receive notification of a warning. * * <p>{@link javax.xml.transform.Transformer} can use this method to report * conditions that are not errors or fatal errors. The default behaviour * is to take no action.</p> * * <p>After invoking this method, the Transformer must continue with * the transformation. It should still be possible for the * application to process the document through to the end.</p> * * @param exception The warning information encapsulated in a * transformer exception. * * @throws javax.xml.transform.TransformerException only if * setThrowOnWarning is true. * * @see javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a warning. * <p>{@link javax.xml.transform.Transformer} can use this method to report conditions that are not errors or fatal errors. The default behaviour is to take no action.</p> * <p>After invoking this method, the Transformer must continue with the transformation. It should still be possible for the application to process the document through to the end.</p> * @param exception The warning information encapsulated in a transformer exception. * @throws javax.xml.transform.TransformerException only if setThrowOnWarning is true. * @see javax.xml.transform.TransformerException 
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
logExceptionLocation	TokenNameIdentifier	 log Exception Location
(	TokenNameLPAREN	
m_pw	TokenNameIdentifier	 m pw
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: "	TokenNameStringLiteral	warning: 
+	TokenNamePLUS	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getThrowOnWarning	TokenNameIdentifier	 get Throw On Warning
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a recoverable error. * * <p>The transformer must continue to try and provide normal transformation * after invoking this method. It should still be possible for the * application to process the document through to the end if no other errors * are encountered.</p> * * @param exception The error information encapsulated in a * transformer exception. * * @throws javax.xml.transform.TransformerException only if * setThrowOnError is true. * * @see javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a recoverable error. * <p>The transformer must continue to try and provide normal transformation after invoking this method. It should still be possible for the application to process the document through to the end if no other errors are encountered.</p> * @param exception The error information encapsulated in a transformer exception. * @throws javax.xml.transform.TransformerException only if setThrowOnError is true. * @see javax.xml.transform.TransformerException 
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
logExceptionLocation	TokenNameIdentifier	 log Exception Location
(	TokenNameLPAREN	
m_pw	TokenNameIdentifier	 m pw
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: "	TokenNameStringLiteral	error: 
+	TokenNamePLUS	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getThrowOnError	TokenNameIdentifier	 get Throw On Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a non-recoverable error. * * <p>The transformer must continue to try and provide normal transformation * after invoking this method. It should still be possible for the * application to process the document through to the end if no other errors * are encountered, but there is no guarantee that the output will be * useable.</p> * * @param exception The error information encapsulated in a * transformer exception. * * @throws javax.xml.transform.TransformerException only if * setThrowOnError is true. * * @see javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a non-recoverable error. * <p>The transformer must continue to try and provide normal transformation after invoking this method. It should still be possible for the application to process the document through to the end if no other errors are encountered, but there is no guarantee that the output will be useable.</p> * @param exception The error information encapsulated in a transformer exception. * @throws javax.xml.transform.TransformerException only if setThrowOnError is true. * @see javax.xml.transform.TransformerException 
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
logExceptionLocation	TokenNameIdentifier	 log Exception Location
(	TokenNameLPAREN	
m_pw	TokenNameIdentifier	 m pw
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: "	TokenNameStringLiteral	error: 
+	TokenNamePLUS	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getThrowOnError	TokenNameIdentifier	 get Throw On Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* ======== Implement worker methods ======== */	TokenNameCOMMENT_BLOCK	 ======== Implement worker methods ======== 
/** * Print out location information about the exception. * * Cribbed from DefaultErrorHandler.printLocation() * @param pw PrintWriter to send output to * @param exception TransformerException or SAXParseException * to log information about */	TokenNameCOMMENT_JAVADOC	 Print out location information about the exception. * Cribbed from DefaultErrorHandler.printLocation() @param pw PrintWriter to send output to @param exception TransformerException or SAXParseException to log information about 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logExceptionLocation	TokenNameIdentifier	 log Exception Location
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
pw	TokenNameIdentifier	 pw
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
// Find the current locator, if one present 	TokenNameCOMMENT_LINE	Find the current locator, if one present 
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
instanceof	TokenNameinstanceof	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// A SAXSourceLocator is a Xalan helper class 	TokenNameCOMMENT_LINE	A SAXSourceLocator is a Xalan helper class 
// that implements both a SourceLocator and a SAX Locator 	TokenNameCOMMENT_LINE	that implements both a SourceLocator and a SAX Locator 
//@todo check that the new locator actually has 	TokenNameCOMMENT_LINE	@todo check that the new locator actually has 
// as much or more information as the 	TokenNameCOMMENT_LINE	as much or more information as the 
// current one already does 	TokenNameCOMMENT_LINE	current one already does 
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
{	TokenNameLBRACE	
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
causeLocator	TokenNameIdentifier	 cause Locator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Then walk back down the chain of exceptions 	TokenNameCOMMENT_LINE	Then walk back down the chain of exceptions 
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
// Formatting note: mimic javac-like errors: 	TokenNameCOMMENT_LINE	Formatting note: mimic javac-like errors: 
// path\filename:123: message-here 	TokenNameCOMMENT_LINE	path\filename:123: message-here 
// systemId:L=1;C=2: message-here 	TokenNameCOMMENT_LINE	systemId:L=1;C=2: message-here 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
"SystemId-Unknown"	TokenNameStringLiteral	SystemId-Unknown
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
":Line="	TokenNameStringLiteral	:Line=
+	TokenNamePLUS	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
";Column="	TokenNameStringLiteral	;Column=
+	TokenNamePLUS	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"exception:"	TokenNameStringLiteral	exception:
+	TokenNamePLUS	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"root-cause:"	TokenNameStringLiteral	root-cause:
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
?	TokenNameQUESTION	
cause	TokenNameIdentifier	 cause
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"null"	TokenNameStringLiteral	null
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logSourceLine	TokenNameIdentifier	 log Source Line
(	TokenNameLPAREN	
pw	TokenNameIdentifier	 pw
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"SystemId-Unknown:locator-unavailable: "	TokenNameStringLiteral	SystemId-Unknown:locator-unavailable: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"exception:"	TokenNameStringLiteral	exception:
+	TokenNamePLUS	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"root-cause:"	TokenNameStringLiteral	root-cause:
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
?	TokenNameQUESTION	
cause	TokenNameIdentifier	 cause
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"null"	TokenNameStringLiteral	null
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Print out the specific source line that caused the exception, * if possible to load it. * * @param pw PrintWriter to send output to * @param locator Xalan wrapper for either a JAXP or a SAX * source location object */	TokenNameCOMMENT_JAVADOC	 Print out the specific source line that caused the exception, if possible to load it. * @param pw PrintWriter to send output to @param locator Xalan wrapper for either a JAXP or a SAX source location object 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logSourceLine	TokenNameIdentifier	 log Source Line
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
,	TokenNameCOMMA	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
pw	TokenNameIdentifier	 pw
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
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Bail immediately if we get SystemId-Unknown 	TokenNameCOMMENT_LINE	Bail immediately if we get SystemId-Unknown 
//@todo future improvement: attempt to get resource 	TokenNameCOMMENT_LINE	@todo future improvement: attempt to get resource 
// from a publicId if possible 	TokenNameCOMMENT_LINE	from a publicId if possible 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"line: (No systemId; cannot read file)"	TokenNameStringLiteral	line: (No systemId; cannot read file)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@todo attempt to get DOM backpointer or other ids 	TokenNameCOMMENT_LINE	@todo attempt to get DOM backpointer or other ids 
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"line: "	TokenNameStringLiteral	line: 
+	TokenNamePLUS	
getSourceLine	TokenNameIdentifier	 get Source Line
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"line: "	TokenNameStringLiteral	line: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'^'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"line: logSourceLine unavailable due to: "	TokenNameStringLiteral	line: logSourceLine unavailable due to: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return the specific source line that caused the exception, * if possible to load it; allow exceptions to be thrown. * * @author shane_curcuru@us.ibm.com */	TokenNameCOMMENT_JAVADOC	 Return the specific source line that caused the exception, if possible to load it; allow exceptions to be thrown. * @author shane_curcuru@us.ibm.com 
protected	TokenNameprotected	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getSourceLine	TokenNameIdentifier	 get Source Line
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sourceUrl	TokenNameIdentifier	 source Url
,	TokenNameCOMMA	
int	TokenNameint	
lineNum	TokenNameIdentifier	 line Num
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Get a URL from the sourceUrl 	TokenNameCOMMENT_LINE	Get a URL from the sourceUrl 
try	TokenNametry	
{	TokenNameLBRACE	
// Try to get a URL from it as-is 	TokenNameCOMMENT_LINE	Try to get a URL from it as-is 
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
sourceUrl	TokenNameIdentifier	 source Url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
mue	TokenNameIdentifier	 mue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
indexOfColon	TokenNameIdentifier	 index Of Colon
=	TokenNameEQUAL	
sourceUrl	TokenNameIdentifier	 source Url
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
indexOfSlash	TokenNameIdentifier	 index Of Slash
=	TokenNameEQUAL	
sourceUrl	TokenNameIdentifier	 source Url
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
indexOfColon	TokenNameIdentifier	 index Of Colon
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
indexOfSlash	TokenNameIdentifier	 index Of Slash
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
indexOfColon	TokenNameIdentifier	 index Of Colon
<	TokenNameLESS	
indexOfSlash	TokenNameIdentifier	 index Of Slash
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The url is already absolute, but we could not get 	TokenNameCOMMENT_LINE	The url is already absolute, but we could not get 
// the system to form it, so bail 	TokenNameCOMMENT_LINE	the system to form it, so bail 
throw	TokenNamethrow	
mue	TokenNameIdentifier	 mue
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// The url is relative, so attempt to get absolute 	TokenNameCOMMENT_LINE	The url is relative, so attempt to get absolute 
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
.	TokenNameDOT	
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
sourceUrl	TokenNameIdentifier	 source Url
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If this fails, allow the exception to propagate 	TokenNameCOMMENT_LINE	If this fails, allow the exception to propagate 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Open the URL and read to our specified line 	TokenNameCOMMENT_LINE	Open the URL and read to our specified line 
URLConnection	TokenNameIdentifier	 URL Connection
uc	TokenNameIdentifier	 uc
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
openConnection	TokenNameIdentifier	 open Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
uc	TokenNameIdentifier	 uc
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Not the most efficient way, but it works 	TokenNameCOMMENT_LINE	Not the most efficient way, but it works 
// (Feel free to patch to seek to the appropriate line) 	TokenNameCOMMENT_LINE	(Feel free to patch to seek to the appropriate line) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
lineNum	TokenNameIdentifier	 line Num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
br	TokenNameIdentifier	 br
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Allow exceptions to propagate from here, but ensure 	TokenNameCOMMENT_LINE	Allow exceptions to propagate from here, but ensure 
// streams are closed! 	TokenNameCOMMENT_LINE	streams are closed! 
finally	TokenNamefinally	
{	TokenNameLBRACE	
br	TokenNameIdentifier	 br
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Return whatever we found 	TokenNameCOMMENT_LINE	Return whatever we found 
return	TokenNamereturn	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* ======== Implement settable properties ======== */	TokenNameCOMMENT_BLOCK	 ======== Implement settable properties ======== 
/** * User-settable behavior: when to re-throw exceptions. * * <p>This allows per-instance configuration of * ListingErrorHandlers. You can ask us to either throw * an exception when we're called for various warning / * error / fatalErrors, or simply log them and continue.</p> * * @param b if we should throw an exception on warnings */	TokenNameCOMMENT_JAVADOC	 User-settable behavior: when to re-throw exceptions. * <p>This allows per-instance configuration of ListingErrorHandlers. You can ask us to either throw an exception when we're called for various warning / error / fatalErrors, or simply log them and continue.</p> * @param b if we should throw an exception on warnings 
public	TokenNamepublic	
void	TokenNamevoid	
setThrowOnWarning	TokenNameIdentifier	 set Throw On Warning
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwOnWarning	TokenNameIdentifier	 throw On Warning
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * User-settable behavior: when to re-throw exceptions. * * @return if we throw an exception on warnings */	TokenNameCOMMENT_JAVADOC	 User-settable behavior: when to re-throw exceptions. * @return if we throw an exception on warnings 
public	TokenNamepublic	
boolean	TokenNameboolean	
getThrowOnWarning	TokenNameIdentifier	 get Throw On Warning
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
throwOnWarning	TokenNameIdentifier	 throw On Warning
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If we should throw exception on warnings; default:false. */	TokenNameCOMMENT_JAVADOC	 If we should throw exception on warnings; default:false. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
throwOnWarning	TokenNameIdentifier	 throw On Warning
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * User-settable behavior: when to re-throw exceptions. * * <p>This allows per-instance configuration of * ListingErrorHandlers. You can ask us to either throw * an exception when we're called for various warning / * error / fatalErrors, or simply log them and continue.</p> * * <p>Note that the behavior of many parsers/transformers * after an error is not necessarily defined!</p> * * @param b if we should throw an exception on errors */	TokenNameCOMMENT_JAVADOC	 User-settable behavior: when to re-throw exceptions. * <p>This allows per-instance configuration of ListingErrorHandlers. You can ask us to either throw an exception when we're called for various warning / error / fatalErrors, or simply log them and continue.</p> * <p>Note that the behavior of many parsers/transformers after an error is not necessarily defined!</p> * @param b if we should throw an exception on errors 
public	TokenNamepublic	
void	TokenNamevoid	
setThrowOnError	TokenNameIdentifier	 set Throw On Error
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwOnError	TokenNameIdentifier	 throw On Error
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * User-settable behavior: when to re-throw exceptions. * * @return if we throw an exception on errors */	TokenNameCOMMENT_JAVADOC	 User-settable behavior: when to re-throw exceptions. * @return if we throw an exception on errors 
public	TokenNamepublic	
boolean	TokenNameboolean	
getThrowOnError	TokenNameIdentifier	 get Throw On Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
throwOnError	TokenNameIdentifier	 throw On Error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If we should throw exception on errors; default:true. */	TokenNameCOMMENT_JAVADOC	 If we should throw exception on errors; default:true. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
throwOnError	TokenNameIdentifier	 throw On Error
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * User-settable behavior: when to re-throw exceptions. * * <p>This allows per-instance configuration of * ListingErrorHandlers. You can ask us to either throw * an exception when we're called for various warning / * error / fatalErrors, or simply log them and continue.</p> * * <p>Note that the behavior of many parsers/transformers * after a fatalError is not necessarily defined, most * products will probably barf if you continue.</p> * * @param b if we should throw an exception on fatalErrors */	TokenNameCOMMENT_JAVADOC	 User-settable behavior: when to re-throw exceptions. * <p>This allows per-instance configuration of ListingErrorHandlers. You can ask us to either throw an exception when we're called for various warning / error / fatalErrors, or simply log them and continue.</p> * <p>Note that the behavior of many parsers/transformers after a fatalError is not necessarily defined, most products will probably barf if you continue.</p> * @param b if we should throw an exception on fatalErrors 
public	TokenNamepublic	
void	TokenNamevoid	
setThrowOnFatalError	TokenNameIdentifier	 set Throw On Fatal Error
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwOnFatalError	TokenNameIdentifier	 throw On Fatal Error
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * User-settable behavior: when to re-throw exceptions. * * @return if we throw an exception on fatalErrors */	TokenNameCOMMENT_JAVADOC	 User-settable behavior: when to re-throw exceptions. * @return if we throw an exception on fatalErrors 
public	TokenNamepublic	
boolean	TokenNameboolean	
getThrowOnFatalError	TokenNameIdentifier	 get Throw On Fatal Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
throwOnFatalError	TokenNameIdentifier	 throw On Fatal Error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If we should throw exception on fatalErrors; default:true. */	TokenNameCOMMENT_JAVADOC	 If we should throw exception on fatalErrors; default:true. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
throwOnFatalError	TokenNameIdentifier	 throw On Fatal Error
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
