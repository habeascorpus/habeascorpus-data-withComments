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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
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
/** * Wraps {@link XMLErrorHandler} and make it look like a SAX {@link ErrorHandler}. * * <p> * The derived class should override the {@link #getErrorHandler()} method * so that it will return the correct {@link XMLErrorHandler} instance. * This method will be called whenever an error/warning is found. * * <p> * Experience shows that it is better to store the actual * {@link XMLErrorHandler} in one place and looks up that variable, * rather than copying it into every component that needs an error handler * and update all of them whenever it is changed, IMO. * * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com) * * @version $Id: ErrorHandlerProxy.java 447241 2006-09-18 05:12:57Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Wraps {@link XMLErrorHandler} and make it look like a SAX {@link ErrorHandler}. * <p> The derived class should override the {@link #getErrorHandler()} method so that it will return the correct {@link XMLErrorHandler} instance. This method will be called whenever an error/warning is found. * <p> Experience shows that it is better to store the actual {@link XMLErrorHandler} in one place and looks up that variable, rather than copying it into every component that needs an error handler and update all of them whenever it is changed, IMO. * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com) * @version $Id: ErrorHandlerProxy.java 447241 2006-09-18 05:12:57Z mrglavas $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ErrorHandlerProxy	TokenNameIdentifier	 Error Handler Proxy
implements	TokenNameimplements	
ErrorHandler	TokenNameIdentifier	 Error Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
eh	TokenNameIdentifier	 eh
=	TokenNameEQUAL	
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eh	TokenNameIdentifier	 eh
instanceof	TokenNameinstanceof	
ErrorHandlerWrapper	TokenNameIdentifier	 Error Handler Wrapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ErrorHandlerWrapper	TokenNameIdentifier	 Error Handler Wrapper
)	TokenNameRPAREN	
eh	TokenNameIdentifier	 eh
)	TokenNameRPAREN	
.	TokenNameDOT	
fErrorHandler	TokenNameIdentifier	 f Error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
eh	TokenNameIdentifier	 eh
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
ErrorHandlerWrapper	TokenNameIdentifier	 Error Handler Wrapper
.	TokenNameDOT	
createXMLParseException	TokenNameIdentifier	 create XML Parse Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if an XNIException is thrown, just let it go. 	TokenNameCOMMENT_LINE	if an XNIException is thrown, just let it go. 
// REVISIT: is this OK? or should we try to wrap it into SAXException? 	TokenNameCOMMENT_LINE	REVISIT: is this OK? or should we try to wrap it into SAXException? 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
eh	TokenNameIdentifier	 eh
=	TokenNameEQUAL	
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eh	TokenNameIdentifier	 eh
instanceof	TokenNameinstanceof	
ErrorHandlerWrapper	TokenNameIdentifier	 Error Handler Wrapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ErrorHandlerWrapper	TokenNameIdentifier	 Error Handler Wrapper
)	TokenNameRPAREN	
eh	TokenNameIdentifier	 eh
)	TokenNameRPAREN	
.	TokenNameDOT	
fErrorHandler	TokenNameIdentifier	 f Error Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
eh	TokenNameIdentifier	 eh
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
ErrorHandlerWrapper	TokenNameIdentifier	 Error Handler Wrapper
.	TokenNameDOT	
createXMLParseException	TokenNameIdentifier	 create XML Parse Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
eh	TokenNameIdentifier	 eh
=	TokenNameEQUAL	
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eh	TokenNameIdentifier	 eh
instanceof	TokenNameinstanceof	
ErrorHandlerWrapper	TokenNameIdentifier	 Error Handler Wrapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ErrorHandlerWrapper	TokenNameIdentifier	 Error Handler Wrapper
)	TokenNameRPAREN	
eh	TokenNameIdentifier	 eh
)	TokenNameRPAREN	
.	TokenNameDOT	
fErrorHandler	TokenNameIdentifier	 f Error Handler
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
eh	TokenNameIdentifier	 eh
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
ErrorHandlerWrapper	TokenNameIdentifier	 Error Handler Wrapper
.	TokenNameDOT	
createXMLParseException	TokenNameIdentifier	 create XML Parse Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
