/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: $ */	TokenNameCOMMENT_BLOCK	 $Id: $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
dom3	TokenNameIdentifier	 dom3
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
/** * Implementation of the DOM Level 3 DOMError interface. * * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#ERROR-Interfaces-DOMError'>DOMError Interface definition from Document Object Model (DOM) Level 3 Core Specification</a>. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Implementation of the DOM Level 3 DOMError interface. * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#ERROR-Interfaces-DOMError'>DOMError Interface definition from Document Object Model (DOM) Level 3 Core Specification</a>. * @xsl.usage internal 
final	TokenNamefinal	
class	TokenNameclass	
DOMErrorImpl	TokenNameIdentifier	 DOM Error Impl
implements	TokenNameimplements	
DOMError	TokenNameIdentifier	 DOM Error
{	TokenNameLBRACE	
/** private data members */	TokenNameCOMMENT_JAVADOC	 private data members 
// The DOMError Severity 	TokenNameCOMMENT_LINE	The DOMError Severity 
private	TokenNameprivate	
short	TokenNameshort	
fSeverity	TokenNameIdentifier	 f Severity
=	TokenNameEQUAL	
DOMError	TokenNameIdentifier	 DOM Error
.	TokenNameDOT	
SEVERITY_WARNING	TokenNameIdentifier	 SEVERITY  WARNING
;	TokenNameSEMICOLON	
// The Error message 	TokenNameCOMMENT_LINE	The Error message 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fMessage	TokenNameIdentifier	 f Message
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// A String indicating which related data is expected in relatedData. 	TokenNameCOMMENT_LINE	A String indicating which related data is expected in relatedData. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
// The platform related exception 	TokenNameCOMMENT_LINE	The platform related exception 
private	TokenNameprivate	
Exception	TokenNameIdentifier	 Exception
fException	TokenNameIdentifier	 f Exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
fRelatedData	TokenNameIdentifier	 f Related Data
;	TokenNameSEMICOLON	
// The location of the exception 	TokenNameCOMMENT_LINE	The location of the exception 
private	TokenNameprivate	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
fLocation	TokenNameIdentifier	 f Location
=	TokenNameEQUAL	
new	TokenNamenew	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
DOMErrorImpl	TokenNameIdentifier	 DOM Error Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @param severity * @param message * @param type */	TokenNameCOMMENT_JAVADOC	 @param severity @param message @param type 
DOMErrorImpl	TokenNameIdentifier	 DOM Error Impl
(	TokenNameLPAREN	
short	TokenNameshort	
severity	TokenNameIdentifier	 severity
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSeverity	TokenNameIdentifier	 f Severity
=	TokenNameEQUAL	
severity	TokenNameIdentifier	 severity
;	TokenNameSEMICOLON	
fMessage	TokenNameIdentifier	 f Message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param severity * @param message * @param type * @param exception */	TokenNameCOMMENT_JAVADOC	 @param severity @param message @param type @param exception 
DOMErrorImpl	TokenNameIdentifier	 DOM Error Impl
(	TokenNameLPAREN	
short	TokenNameshort	
severity	TokenNameIdentifier	 severity
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSeverity	TokenNameIdentifier	 f Severity
=	TokenNameEQUAL	
severity	TokenNameIdentifier	 severity
;	TokenNameSEMICOLON	
fMessage	TokenNameIdentifier	 f Message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
fException	TokenNameIdentifier	 f Exception
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param severity * @param message * @param type * @param exception * @param relatedData * @param location */	TokenNameCOMMENT_JAVADOC	 @param severity @param message @param type @param exception @param relatedData @param location 
DOMErrorImpl	TokenNameIdentifier	 DOM Error Impl
(	TokenNameLPAREN	
short	TokenNameshort	
severity	TokenNameIdentifier	 severity
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
relatedData	TokenNameIdentifier	 related Data
,	TokenNameCOMMA	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSeverity	TokenNameIdentifier	 f Severity
=	TokenNameEQUAL	
severity	TokenNameIdentifier	 severity
;	TokenNameSEMICOLON	
fMessage	TokenNameIdentifier	 f Message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
fException	TokenNameIdentifier	 f Exception
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
fRelatedData	TokenNameIdentifier	 f Related Data
=	TokenNameEQUAL	
relatedData	TokenNameIdentifier	 related Data
;	TokenNameSEMICOLON	
fLocation	TokenNameIdentifier	 f Location
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The severity of the error, either <code>SEVERITY_WARNING</code>, * <code>SEVERITY_ERROR</code>, or <code>SEVERITY_FATAL_ERROR</code>. * * @return A short containing the DOMError severity */	TokenNameCOMMENT_JAVADOC	 The severity of the error, either <code>SEVERITY_WARNING</code>, <code>SEVERITY_ERROR</code>, or <code>SEVERITY_FATAL_ERROR</code>. * @return A short containing the DOMError severity 
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
/** * The DOMError message string. * * @return String */	TokenNameCOMMENT_JAVADOC	 The DOMError message string. * @return String 
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
/** * The location of the DOMError. * * @return A DOMLocator object containing the DOMError location. */	TokenNameCOMMENT_JAVADOC	 The location of the DOMError. * @return A DOMLocator object containing the DOMError location. 
public	TokenNamepublic	
DOMLocator	TokenNameIdentifier	 DOM Locator
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fLocation	TokenNameIdentifier	 f Location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The related platform dependent exception if any. * * @return A java.lang.Exception */	TokenNameCOMMENT_JAVADOC	 The related platform dependent exception if any. * @return A java.lang.Exception 
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
/** * Returns a String indicating which related data is expected in relatedData. * * @return A String */	TokenNameCOMMENT_JAVADOC	 Returns a String indicating which related data is expected in relatedData. * @return A String 
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
/** * The related DOMError.type dependent data if any. * * @return java.lang.Object */	TokenNameCOMMENT_JAVADOC	 The related DOMError.type dependent data if any. * @return java.lang.Object 
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
fMessage	TokenNameIdentifier	 f Message
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fRelatedData	TokenNameIdentifier	 f Related Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fLocation	TokenNameIdentifier	 f Location
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class DOMErrorImpl 	TokenNameCOMMENT_LINE	class DOMErrorImpl 
