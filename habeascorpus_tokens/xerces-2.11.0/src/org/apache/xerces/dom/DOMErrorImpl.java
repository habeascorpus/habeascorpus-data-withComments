/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
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
DOMLocator	TokenNameIdentifier	 DOM Locator
;	TokenNameSEMICOLON	
/** * <code>DOMErrorImpl</code> is an implementation that describes an error. * <strong>Note:</strong> The error object that describes the error * might be reused by Xerces implementation, across multiple calls to the * handleEvent method on DOMErrorHandler interface. * * * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010913'>Document Object Model (DOM) Level 3 Core Specification</a>. * * @xerces.internal * * @author Gopal Sharma, SUN Microsystems Inc. * @author Elena Litani, IBM * * @version $Id: DOMErrorImpl.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <code>DOMErrorImpl</code> is an implementation that describes an error. <strong>Note:</strong> The error object that describes the error might be reused by Xerces implementation, across multiple calls to the handleEvent method on DOMErrorHandler interface. * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010913'>Document Object Model (DOM) Level 3 Core Specification</a>. * @xerces.internal * @author Gopal Sharma, SUN Microsystems Inc. @author Elena Litani, IBM * @version $Id: DOMErrorImpl.java 699892 2008-09-28 21:08:27Z mrglavas $ 
// REVISIT: the implementation of ErrorReporter. 	TokenNameCOMMENT_LINE	REVISIT: the implementation of ErrorReporter. 
// we probably should not pass XMLParseException 	TokenNameCOMMENT_LINE	we probably should not pass XMLParseException 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
class	TokenNameclass	
DOMErrorImpl	TokenNameIdentifier	 DOM Error Impl
implements	TokenNameimplements	
DOMError	TokenNameIdentifier	 DOM Error
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
short	TokenNameshort	
fSeverity	TokenNameIdentifier	 f Severity
=	TokenNameEQUAL	
DOMError	TokenNameIdentifier	 DOM Error
.	TokenNameDOT	
SEVERITY_WARNING	TokenNameIdentifier	 SEVERITY  WARNING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
fMessage	TokenNameIdentifier	 f Message
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
fLocator	TokenNameIdentifier	 f Locator
=	TokenNameEQUAL	
new	TokenNamenew	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Exception	TokenNameIdentifier	 Exception
fException	TokenNameIdentifier	 f Exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
fRelatedData	TokenNameIdentifier	 f Related Data
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
DOMErrorImpl	TokenNameIdentifier	 DOM Error Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Exctracts information from XMLParserException) */	TokenNameCOMMENT_JAVADOC	 Exctracts information from XMLParserException) 
public	TokenNamepublic	
DOMErrorImpl	TokenNameIdentifier	 DOM Error Impl
(	TokenNameLPAREN	
short	TokenNameshort	
severity	TokenNameIdentifier	 severity
,	TokenNameCOMMA	
XMLParseException	TokenNameIdentifier	 XML Parse Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSeverity	TokenNameIdentifier	 f Severity
=	TokenNameEQUAL	
severity	TokenNameIdentifier	 severity
;	TokenNameSEMICOLON	
fException	TokenNameIdentifier	 f Exception
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
fLocator	TokenNameIdentifier	 f Locator
=	TokenNameEQUAL	
createDOMLocator	TokenNameIdentifier	 create DOM Locator
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The severity of the error, either <code>SEVERITY_WARNING</code>, * <code>SEVERITY_ERROR</code>, or <code>SEVERITY_FATAL_ERROR</code>. */	TokenNameCOMMENT_JAVADOC	 The severity of the error, either <code>SEVERITY_WARNING</code>, <code>SEVERITY_ERROR</code>, or <code>SEVERITY_FATAL_ERROR</code>. 
public	TokenNamepublic	
short	TokenNameshort	
getSeverity	TokenNameIdentifier	 get Severity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSeverity	TokenNameIdentifier	 f Severity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An implementation specific string describing the error that occured. */	TokenNameCOMMENT_JAVADOC	 An implementation specific string describing the error that occured. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fMessage	TokenNameIdentifier	 f Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The location of the error. */	TokenNameCOMMENT_JAVADOC	 The location of the error. 
public	TokenNamepublic	
DOMLocator	TokenNameIdentifier	 DOM Locator
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fLocator	TokenNameIdentifier	 f Locator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// method to get the DOMLocator Object 	TokenNameCOMMENT_LINE	method to get the DOMLocator Object 
private	TokenNameprivate	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
createDOMLocator	TokenNameIdentifier	 create DOM Locator
(	TokenNameLPAREN	
XMLParseException	TokenNameIdentifier	 XML Parse Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// assuming DOMLocator wants the *expanded*, not the literal, URI of the doc... - neilg 	TokenNameCOMMENT_LINE	assuming DOMLocator wants the *expanded*, not the literal, URI of the doc... - neilg 
return	TokenNamereturn	
new	TokenNamenew	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
(	TokenNameLPAREN	
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
getCharacterOffset	TokenNameIdentifier	 get Character Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDOMLocator() 	TokenNameCOMMENT_LINE	createDOMLocator() 
/** * The related platform dependent exception if any.exception is a reserved * word, we need to rename it.Change to "relatedException". (F2F 26 Sep * 2001) */	TokenNameCOMMENT_JAVADOC	 The related platform dependent exception if any.exception is a reserved word, we need to rename it.Change to "relatedException". (F2F 26 Sep 2001) 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getRelatedException	TokenNameIdentifier	 get Related Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fException	TokenNameIdentifier	 f Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSeverity	TokenNameIdentifier	 f Severity
=	TokenNameEQUAL	
DOMError	TokenNameIdentifier	 DOM Error
.	TokenNameDOT	
SEVERITY_WARNING	TokenNameIdentifier	 SEVERITY  WARNING
;	TokenNameSEMICOLON	
fException	TokenNameIdentifier	 f Exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getRelatedData	TokenNameIdentifier	 get Related Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fRelatedData	TokenNameIdentifier	 f Related Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class DOMErrorImpl 	TokenNameCOMMENT_LINE	class DOMErrorImpl 
