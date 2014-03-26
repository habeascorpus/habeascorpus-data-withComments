/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMConfigurationException.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMConfigurationException.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
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
/** * Indicates a serious configuration error. */	TokenNameCOMMENT_JAVADOC	 Indicates a serious configuration error. 
public	TokenNamepublic	
class	TokenNameclass	
DTMConfigurationException	TokenNameIdentifier	 DTM Configuration Exception
extends	TokenNameextends	
DTMException	TokenNameIdentifier	 DTM Exception
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
4607874078818418046L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Create a new <code>DTMConfigurationException</code> with no * detail mesage. */	TokenNameCOMMENT_JAVADOC	 Create a new <code>DTMConfigurationException</code> with no detail mesage. 
public	TokenNamepublic	
DTMConfigurationException	TokenNameIdentifier	 DTM Configuration Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"Configuration Error"	TokenNameStringLiteral	Configuration Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new <code>DTMConfigurationException</code> with * the <code>String </code> specified as an error message. * * @param msg The error message for the exception. */	TokenNameCOMMENT_JAVADOC	 Create a new <code>DTMConfigurationException</code> with the <code>String </code> specified as an error message. * @param msg The error message for the exception. 
public	TokenNamepublic	
DTMConfigurationException	TokenNameIdentifier	 DTM Configuration Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new <code>DTMConfigurationException</code> with a * given <code>Exception</code> base cause of the error. * * @param e The exception to be encapsulated in a * DTMConfigurationException. */	TokenNameCOMMENT_JAVADOC	 Create a new <code>DTMConfigurationException</code> with a given <code>Exception</code> base cause of the error. * @param e The exception to be encapsulated in a DTMConfigurationException. 
public	TokenNamepublic	
DTMConfigurationException	TokenNameIdentifier	 DTM Configuration Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new <code>DTMConfigurationException</code> with the * given <code>Exception</code> base cause and detail message. * * @param msg The detail message. * @param e The exception to be wrapped in a DTMConfigurationException */	TokenNameCOMMENT_JAVADOC	 Create a new <code>DTMConfigurationException</code> with the given <code>Exception</code> base cause and detail message. * @param msg The detail message. @param e The exception to be wrapped in a DTMConfigurationException 
public	TokenNamepublic	
DTMConfigurationException	TokenNameIdentifier	 DTM Configuration Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new DTMConfigurationException from a message and a Locator. * * <p>This constructor is especially useful when an application is * creating its own exception from within a DocumentHandler * callback.</p> * * @param message The error or warning message. * @param locator The locator object for the error or warning. */	TokenNameCOMMENT_JAVADOC	 Create a new DTMConfigurationException from a message and a Locator. * <p>This constructor is especially useful when an application is creating its own exception from within a DocumentHandler callback.</p> * @param message The error or warning message. @param locator The locator object for the error or warning. 
public	TokenNamepublic	
DTMConfigurationException	TokenNameIdentifier	 DTM Configuration Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wrap an existing exception in a DTMConfigurationException. * * @param message The error or warning message, or null to * use the message from the embedded exception. * @param locator The locator object for the error or warning. * @param e Any exception. */	TokenNameCOMMENT_JAVADOC	 Wrap an existing exception in a DTMConfigurationException. * @param message The error or warning message, or null to use the message from the embedded exception. @param locator The locator object for the error or warning. @param e Any exception. 
public	TokenNamepublic	
DTMConfigurationException	TokenNameIdentifier	 DTM Configuration Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
