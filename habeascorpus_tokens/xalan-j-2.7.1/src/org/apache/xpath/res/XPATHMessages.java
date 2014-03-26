/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XPATHMessages.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XPATHMessages.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLMessages	TokenNameIdentifier	 XML Messages
;	TokenNameSEMICOLON	
/** * A utility class for issuing XPath error messages. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 A utility class for issuing XPath error messages. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
XPATHMessages	TokenNameIdentifier	 XPATH Messages
extends	TokenNameextends	
XMLMessages	TokenNameIdentifier	 XML Messages
{	TokenNameLBRACE	
/** The language specific resource object for XPath messages. */	TokenNameCOMMENT_JAVADOC	 The language specific resource object for XPath messages. 
private	TokenNameprivate	
static	TokenNamestatic	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
XPATHBundle	TokenNameIdentifier	 XPATH Bundle
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The class name of the XPath error message string table. */	TokenNameCOMMENT_JAVADOC	 The class name of the XPath error message string table. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XPATH_ERROR_RESOURCES	TokenNameIdentifier	 XPATH  ERROR  RESOURCES
=	TokenNameEQUAL	
"org.apache.xpath.res.XPATHErrorResources"	TokenNameStringLiteral	org.apache.xpath.res.XPATHErrorResources
;	TokenNameSEMICOLON	
/** * Creates a message from the specified key and replacement * arguments, localized to the given locale. * * @param msgKey The key for the message text. * @param args The arguments to be used as replacement text * in the message created. * * @return The formatted message string. */	TokenNameCOMMENT_JAVADOC	 Creates a message from the specified key and replacement arguments, localized to the given locale. * @param msgKey The key for the message text. @param args The arguments to be used as replacement text in the message created. * @return The formatted message string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
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
XPATHBundle	TokenNameIdentifier	 XPATH Bundle
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
XPATHBundle	TokenNameIdentifier	 XPATH Bundle
=	TokenNameEQUAL	
loadResourceBundle	TokenNameIdentifier	 load Resource Bundle
(	TokenNameLPAREN	
XPATH_ERROR_RESOURCES	TokenNameIdentifier	 XPATH  ERROR  RESOURCES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XPATHBundle	TokenNameIdentifier	 XPATH Bundle
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createXPATHMsg	TokenNameIdentifier	 create XPATH Msg
(	TokenNameLPAREN	
XPATHBundle	TokenNameIdentifier	 XPATH Bundle
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
createXPATHWarning	TokenNameIdentifier	 create XPATH Warning
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
XPATHBundle	TokenNameIdentifier	 XPATH Bundle
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
XPATHBundle	TokenNameIdentifier	 XPATH Bundle
=	TokenNameEQUAL	
loadResourceBundle	TokenNameIdentifier	 load Resource Bundle
(	TokenNameLPAREN	
XPATH_ERROR_RESOURCES	TokenNameIdentifier	 XPATH  ERROR  RESOURCES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XPATHBundle	TokenNameIdentifier	 XPATH Bundle
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createXPATHMsg	TokenNameIdentifier	 create XPATH Msg
(	TokenNameLPAREN	
XPATHBundle	TokenNameIdentifier	 XPATH Bundle
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
/** * Creates a message from the specified key and replacement * arguments, localized to the given locale. * * @param fResourceBundle The resource bundle to use. * @param msgKey The message key to use. * @param args The arguments to be used as replacement text * in the message created. * * @return The formatted message string. */	TokenNameCOMMENT_JAVADOC	 Creates a message from the specified key and replacement arguments, localized to the given locale. * @param fResourceBundle The resource bundle to use. @param msgKey The message key to use. @param args The arguments to be used as replacement text in the message created. * @return The formatted message string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
createXPATHMsg	TokenNameIdentifier	 create XPATH Msg
(	TokenNameLPAREN	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
fResourceBundle	TokenNameIdentifier	 f Resource Bundle
,	TokenNameCOMMA	
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
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
throwex	TokenNameIdentifier	 throwex
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
msgKey	TokenNameIdentifier	 msg Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
fResourceBundle	TokenNameIdentifier	 f Resource Bundle
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
msgKey	TokenNameIdentifier	 msg Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
fResourceBundle	TokenNameIdentifier	 f Resource Bundle
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
BAD_CODE	TokenNameIdentifier	 BAD  CODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throwex	TokenNameIdentifier	 throwex
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Do this to keep format from crying. 	TokenNameCOMMENT_LINE	Do this to keep format from crying. 
// This is better than making a bunch of conditional 	TokenNameCOMMENT_LINE	This is better than making a bunch of conditional 
// code all over the place. 	TokenNameCOMMENT_LINE	code all over the place. 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
MessageFormat	TokenNameIdentifier	 Message Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
fResourceBundle	TokenNameIdentifier	 f Resource Bundle
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
FORMAT_FAILED	TokenNameIdentifier	 FORMAT  FAILED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fmsg	TokenNameIdentifier	 fmsg
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
throwex	TokenNameIdentifier	 throwex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fmsg	TokenNameIdentifier	 fmsg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
