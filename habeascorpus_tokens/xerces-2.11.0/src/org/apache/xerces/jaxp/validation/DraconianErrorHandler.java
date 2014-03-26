/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
jaxp	TokenNameIdentifier	 jaxp
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
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
/** * {@link ErrorHandler} that throws all errors and fatal errors. * * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com) * @version $Id: DraconianErrorHandler.java 447235 2006-09-18 05:01:44Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 {@link ErrorHandler} that throws all errors and fatal errors. * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com) @version $Id: DraconianErrorHandler.java 447235 2006-09-18 05:01:44Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
DraconianErrorHandler	TokenNameIdentifier	 Draconian Error Handler
implements	TokenNameimplements	
ErrorHandler	TokenNameIdentifier	 Error Handler
{	TokenNameLBRACE	
/** * Singleton instance. */	TokenNameCOMMENT_JAVADOC	 Singleton instance. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
DraconianErrorHandler	TokenNameIdentifier	 Draconian Error Handler
ERROR_HANDLER_INSTANCE	TokenNameIdentifier	 ERROR  HANDLER  INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
DraconianErrorHandler	TokenNameIdentifier	 Draconian Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DraconianErrorHandler	TokenNameIdentifier	 Draconian Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Returns the one and only instance of this error handler. */	TokenNameCOMMENT_JAVADOC	 Returns the one and only instance of this error handler. 
public	TokenNamepublic	
static	TokenNamestatic	
DraconianErrorHandler	TokenNameIdentifier	 Draconian Error Handler
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ERROR_HANDLER_INSTANCE	TokenNameIdentifier	 ERROR  HANDLER  INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Warning: Ignore. */	TokenNameCOMMENT_JAVADOC	 Warning: Ignore. 
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
// noop 	TokenNameCOMMENT_LINE	noop 
}	TokenNameRBRACE	
/** Error: Throws back SAXParseException. */	TokenNameCOMMENT_JAVADOC	 Error: Throws back SAXParseException. 
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
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Fatal Error: Throws back SAXParseException. */	TokenNameCOMMENT_JAVADOC	 Fatal Error: Throws back SAXParseException. 
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
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// DraconianErrorHandler 	TokenNameCOMMENT_LINE	DraconianErrorHandler 
