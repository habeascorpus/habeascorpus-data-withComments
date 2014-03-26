/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XSLMessages.java 468641 2006-10-28 06:54:42Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XSLMessages.java 468641 2006-10-28 06:54:42Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHMessages	TokenNameIdentifier	 XPATH Messages
;	TokenNameSEMICOLON	
/** * Sets things up for issuing error messages. This class is misnamed, and * should be called XalanMessages, or some such. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Sets things up for issuing error messages. This class is misnamed, and should be called XalanMessages, or some such. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
XSLMessages	TokenNameIdentifier	 XSL Messages
extends	TokenNameextends	
XPATHMessages	TokenNameIdentifier	 XPATH Messages
{	TokenNameLBRACE	
/** The language specific resource object for Xalan messages. */	TokenNameCOMMENT_JAVADOC	 The language specific resource object for Xalan messages. 
private	TokenNameprivate	
static	TokenNamestatic	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
XSLTBundle	TokenNameIdentifier	 XSLT Bundle
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The class name of the Xalan error message string table. */	TokenNameCOMMENT_JAVADOC	 The class name of the Xalan error message string table. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XSLT_ERROR_RESOURCES	TokenNameIdentifier	 XSLT  ERROR  RESOURCES
=	TokenNameEQUAL	
"org.apache.xalan.res.XSLTErrorResources"	TokenNameStringLiteral	org.apache.xalan.res.XSLTErrorResources
;	TokenNameSEMICOLON	
/** * Creates a message from the specified key and replacement * arguments, localized to the given locale. * * @param msgKey The key for the message text. * @param args The arguments to be used as replacement text * in the message created. * * @return The formatted message string. */	TokenNameCOMMENT_JAVADOC	 Creates a message from the specified key and replacement arguments, localized to the given locale. * @param msgKey The key for the message text. @param args The arguments to be used as replacement text in the message created. * @return The formatted message string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msgKey	TokenNameIdentifier	 msg Key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
//throws Exception 	TokenNameCOMMENT_LINE	throws Exception 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
XSLTBundle	TokenNameIdentifier	 XSLT Bundle
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
XSLTBundle	TokenNameIdentifier	 XSLT Bundle
=	TokenNameEQUAL	
loadResourceBundle	TokenNameIdentifier	 load Resource Bundle
(	TokenNameLPAREN	
XSLT_ERROR_RESOURCES	TokenNameIdentifier	 XSLT  ERROR  RESOURCES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XSLTBundle	TokenNameIdentifier	 XSLT Bundle
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createMsg	TokenNameIdentifier	 create Msg
(	TokenNameLPAREN	
XSLTBundle	TokenNameIdentifier	 XSLT Bundle
,	TokenNameCOMMA	
msgKey	TokenNameIdentifier	 msg Key
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
"Could not load any resource bundles."	TokenNameStringLiteral	Could not load any resource bundles.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a message from the specified key and replacement * arguments, localized to the given locale. * * @param msgKey The key for the message text. * @param args The arguments to be used as replacement text * in the message created. * * @return The formatted warning string. */	TokenNameCOMMENT_JAVADOC	 Creates a message from the specified key and replacement arguments, localized to the given locale. * @param msgKey The key for the message text. @param args The arguments to be used as replacement text in the message created. * @return The formatted warning string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
createWarning	TokenNameIdentifier	 create Warning
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msgKey	TokenNameIdentifier	 msg Key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
//throws Exception 	TokenNameCOMMENT_LINE	throws Exception 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
XSLTBundle	TokenNameIdentifier	 XSLT Bundle
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
XSLTBundle	TokenNameIdentifier	 XSLT Bundle
=	TokenNameEQUAL	
loadResourceBundle	TokenNameIdentifier	 load Resource Bundle
(	TokenNameLPAREN	
XSLT_ERROR_RESOURCES	TokenNameIdentifier	 XSLT  ERROR  RESOURCES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XSLTBundle	TokenNameIdentifier	 XSLT Bundle
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createMsg	TokenNameIdentifier	 create Msg
(	TokenNameLPAREN	
XSLTBundle	TokenNameIdentifier	 XSLT Bundle
,	TokenNameCOMMA	
msgKey	TokenNameIdentifier	 msg Key
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
"Could not load any resource bundles."	TokenNameStringLiteral	Could not load any resource bundles.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
