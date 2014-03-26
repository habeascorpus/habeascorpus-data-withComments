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
/** * An interface for handling errors. If the application is interested * in error notifications, then it can register an error handler object * that implements this interface with the parser configuration. * * @see XMLParserConfiguration * * @author Andy Clark, IBM * * @version $Id: XMLErrorHandler.java 570137 2007-08-27 14:17:57Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 An interface for handling errors. If the application is interested in error notifications, then it can register an error handler object that implements this interface with the parser configuration. * @see XMLParserConfiguration * @author Andy Clark, IBM * @version $Id: XMLErrorHandler.java 570137 2007-08-27 14:17:57Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLErrorHandler methods 	TokenNameCOMMENT_LINE	XMLErrorHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** * Reports a warning. Warnings are non-fatal and can be safely ignored * by most applications. * * @param domain The domain of the warning. The domain can be any * string but is suggested to be a valid URI. The * domain can be used to conveniently specify a web * site location of the relevant specification or * document pertaining to this warning. * @param key The warning key. This key can be any string and * is implementation dependent. * @param exception Exception. * * @throws XNIException Thrown to signal that the parser should stop * parsing the document. */	TokenNameCOMMENT_JAVADOC	 Reports a warning. Warnings are non-fatal and can be safely ignored by most applications. * @param domain The domain of the warning. The domain can be any string but is suggested to be a valid URI. The domain can be used to conveniently specify a web site location of the relevant specification or document pertaining to this warning. @param key The warning key. This key can be any string and is implementation dependent. @param exception Exception. * @throws XNIException Thrown to signal that the parser should stop parsing the document. 
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
;	TokenNameSEMICOLON	
/** * Reports an error. Errors are non-fatal and usually signify that the * document is invalid with respect to its grammar(s). * * @param domain The domain of the error. The domain can be any * string but is suggested to be a valid URI. The * domain can be used to conveniently specify a web * site location of the relevant specification or * document pertaining to this error. * @param key The error key. This key can be any string and * is implementation dependent. * @param exception Exception. * * @throws XNIException Thrown to signal that the parser should stop * parsing the document. */	TokenNameCOMMENT_JAVADOC	 Reports an error. Errors are non-fatal and usually signify that the document is invalid with respect to its grammar(s). * @param domain The domain of the error. The domain can be any string but is suggested to be a valid URI. The domain can be used to conveniently specify a web site location of the relevant specification or document pertaining to this error. @param key The error key. This key can be any string and is implementation dependent. @param exception Exception. * @throws XNIException Thrown to signal that the parser should stop parsing the document. 
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
;	TokenNameSEMICOLON	
/** * Report a fatal error. Fatal errors usually occur when the document * is not well-formed and signifies that the parser cannot continue * normal operation. * <p> * <strong>Note:</strong> The error handler should <em>always</em> * throw an <code>XNIException</code> from this method. This exception * can either be the same exception that is passed as a parameter to * the method or a new XNI exception object. If the registered error * handler fails to throw an exception, the continuing operation of * the parser is undetermined. * * @param domain The domain of the fatal error. The domain can be * any string but is suggested to be a valid URI. The * domain can be used to conveniently specify a web * site location of the relevant specification or * document pertaining to this fatal error. * @param key The fatal error key. This key can be any string * and is implementation dependent. * @param exception Exception. * * @throws XNIException Thrown to signal that the parser should stop * parsing the document. */	TokenNameCOMMENT_JAVADOC	 Report a fatal error. Fatal errors usually occur when the document is not well-formed and signifies that the parser cannot continue normal operation. <p> <strong>Note:</strong> The error handler should <em>always</em> throw an <code>XNIException</code> from this method. This exception can either be the same exception that is passed as a parameter to the method or a new XNI exception object. If the registered error handler fails to throw an exception, the continuing operation of the parser is undetermined. * @param domain The domain of the fatal error. The domain can be any string but is suggested to be a valid URI. The domain can be used to conveniently specify a web site location of the relevant specification or document pertaining to this fatal error. @param key The fatal error key. This key can be any string and is implementation dependent. @param exception Exception. * @throws XNIException Thrown to signal that the parser should stop parsing the document. 
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface XMLErrorHandler 	TokenNameCOMMENT_LINE	interface XMLErrorHandler 
