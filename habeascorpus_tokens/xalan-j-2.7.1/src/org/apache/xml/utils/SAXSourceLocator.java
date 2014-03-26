/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SAXSourceLocator.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SAXSourceLocator.java 468655 2006-10-28 07:12:06Z minchau $ 
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
Serializable	TokenNameIdentifier	 Serializable
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Locator	TokenNameIdentifier	 Locator
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LocatorImpl	TokenNameIdentifier	 Locator Impl
;	TokenNameSEMICOLON	
/** * Class SAXSourceLocator extends org.xml.sax.helpers.LocatorImpl * for the purpose of implementing the SourceLocator interface, * and thus can be both a SourceLocator and a SAX Locator. */	TokenNameCOMMENT_JAVADOC	 Class SAXSourceLocator extends org.xml.sax.helpers.LocatorImpl for the purpose of implementing the SourceLocator interface, and thus can be both a SourceLocator and a SAX Locator. 
public	TokenNamepublic	
class	TokenNameclass	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
extends	TokenNameextends	
LocatorImpl	TokenNameIdentifier	 Locator Impl
implements	TokenNameimplements	
SourceLocator	TokenNameIdentifier	 Source Locator
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3181680946321164112L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** The SAX Locator object. * @serial */	TokenNameCOMMENT_JAVADOC	 The SAX Locator object. @serial 
Locator	TokenNameIdentifier	 Locator
m_locator	TokenNameIdentifier	 m locator
;	TokenNameSEMICOLON	
/** * Constructor SAXSourceLocator * */	TokenNameCOMMENT_JAVADOC	 Constructor SAXSourceLocator 
public	TokenNamepublic	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructor SAXSourceLocator * * * @param locator Source locator */	TokenNameCOMMENT_JAVADOC	 Constructor SAXSourceLocator * @param locator Source locator 
public	TokenNamepublic	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_locator	TokenNameIdentifier	 m locator
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setColumnNumber	TokenNameIdentifier	 set Column Number
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setLineNumber	TokenNameIdentifier	 set Line Number
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor SAXSourceLocator * * * @param locator Source locator */	TokenNameCOMMENT_JAVADOC	 Constructor SAXSourceLocator * @param locator Source locator 
public	TokenNamepublic	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_locator	TokenNameIdentifier	 m locator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setColumnNumber	TokenNameIdentifier	 set Column Number
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setLineNumber	TokenNameIdentifier	 set Line Number
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor SAXSourceLocator * * * @param spe SAXParseException exception. */	TokenNameCOMMENT_JAVADOC	 Constructor SAXSourceLocator * @param spe SAXParseException exception. 
public	TokenNamepublic	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
spe	TokenNameIdentifier	 spe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setLineNumber	TokenNameIdentifier	 set Line Number
(	TokenNameLPAREN	
spe	TokenNameIdentifier	 spe
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setColumnNumber	TokenNameIdentifier	 set Column Number
(	TokenNameLPAREN	
spe	TokenNameIdentifier	 spe
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
spe	TokenNameIdentifier	 spe
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
spe	TokenNameIdentifier	 spe
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the public identifier for the current document event. * * <p>The return value is the public identifier of the document * entity or of the external parsed entity in which the markup * triggering the event appears.</p> * * @return A string containing the public identifier, or * null if none is available. * @see #getSystemId */	TokenNameCOMMENT_JAVADOC	 Return the public identifier for the current document event. * <p>The return value is the public identifier of the document entity or of the external parsed entity in which the markup triggering the event appears.</p> * @return A string containing the public identifier, or null if none is available. @see #getSystemId 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_locator	TokenNameIdentifier	 m locator
)	TokenNameRPAREN	
?	TokenNameQUESTION	
super	TokenNamesuper	
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the system identifier for the current document event. * * <p>The return value is the system identifier of the document * entity or of the external parsed entity in which the markup * triggering the event appears.</p> * * <p>If the system identifier is a URL, the parser must resolve it * fully before passing it to the application.</p> * * @return A string containing the system identifier, or null * if none is available. * @see #getPublicId */	TokenNameCOMMENT_JAVADOC	 Return the system identifier for the current document event. * <p>The return value is the system identifier of the document entity or of the external parsed entity in which the markup triggering the event appears.</p> * <p>If the system identifier is a URL, the parser must resolve it fully before passing it to the application.</p> * @return A string containing the system identifier, or null if none is available. @see #getPublicId 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_locator	TokenNameIdentifier	 m locator
)	TokenNameRPAREN	
?	TokenNameQUESTION	
super	TokenNamesuper	
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the line number where the current document event ends. * * <p><strong>Warning:</strong> The return value from the method * is intended only as an approximation for the sake of error * reporting; it is not intended to provide sufficient information * to edit the character content of the original XML document.</p> * * <p>The return value is an approximation of the line number * in the document entity or external parsed entity where the * markup triggering the event appears.</p> * * @return The line number, or -1 if none is available. * @see #getColumnNumber */	TokenNameCOMMENT_JAVADOC	 Return the line number where the current document event ends. * <p><strong>Warning:</strong> The return value from the method is intended only as an approximation for the sake of error reporting; it is not intended to provide sufficient information to edit the character content of the original XML document.</p> * <p>The return value is an approximation of the line number in the document entity or external parsed entity where the markup triggering the event appears.</p> * @return The line number, or -1 if none is available. @see #getColumnNumber 
public	TokenNamepublic	
int	TokenNameint	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_locator	TokenNameIdentifier	 m locator
)	TokenNameRPAREN	
?	TokenNameQUESTION	
super	TokenNamesuper	
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the column number where the current document event ends. * * <p><strong>Warning:</strong> The return value from the method * is intended only as an approximation for the sake of error * reporting; it is not intended to provide sufficient information * to edit the character content of the original XML document.</p> * * <p>The return value is an approximation of the column number * in the document entity or external parsed entity where the * markup triggering the event appears.</p> * * @return The column number, or -1 if none is available. * @see #getLineNumber */	TokenNameCOMMENT_JAVADOC	 Return the column number where the current document event ends. * <p><strong>Warning:</strong> The return value from the method is intended only as an approximation for the sake of error reporting; it is not intended to provide sufficient information to edit the character content of the original XML document.</p> * <p>The return value is an approximation of the column number in the document entity or external parsed entity where the markup triggering the event appears.</p> * @return The column number, or -1 if none is available. @see #getLineNumber 
public	TokenNamepublic	
int	TokenNameint	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_locator	TokenNameIdentifier	 m locator
)	TokenNameRPAREN	
?	TokenNameQUESTION	
super	TokenNamesuper	
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
