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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
;	TokenNameSEMICOLON	
/** * Used to format DOM error messages, using the system locale. * * @xerces.internal * * @author Sandy Gao, IBM * @version $Id: DOMMessageFormatter.java 813087 2009-09-09 19:35:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Used to format DOM error messages, using the system locale. * @xerces.internal * @author Sandy Gao, IBM @version $Id: DOMMessageFormatter.java 813087 2009-09-09 19:35:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
=	TokenNameEQUAL	
"http://www.w3.org/dom/DOMTR"	TokenNameStringLiteral	http://www.w3.org/dom/DOMTR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
=	TokenNameEQUAL	
"http://www.w3.org/TR/1998/REC-xml-19980210"	TokenNameStringLiteral	http://www.w3.org/TR/1998/REC-xml-19980210
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SERIALIZER_DOMAIN	TokenNameIdentifier	 SERIALIZER  DOMAIN
=	TokenNameEQUAL	
"http://apache.org/xml/serializer"	TokenNameStringLiteral	http://apache.org/xml/serializer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
domResourceBundle	TokenNameIdentifier	 dom Resource Bundle
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
xmlResourceBundle	TokenNameIdentifier	 xml Resource Bundle
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
serResourceBundle	TokenNameIdentifier	 ser Resource Bundle
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Formats a message with the specified arguments using the given * locale information. * * @param domain domain from which error string is to come. * @param key The message key. * @param arguments The message replacement text arguments. The order * of the arguments must match that of the placeholders * in the actual message. * * @return the formatted message. * * @throws MissingResourceException Thrown if the message with the * specified key cannot be found. */	TokenNameCOMMENT_JAVADOC	 Formats a message with the specified arguments using the given locale information. * @param domain domain from which error string is to come. @param key The message key. @param arguments The message replacement text arguments. The order of the arguments must match that of the placeholders in the actual message. * @return the formatted message. * @throws MissingResourceException Thrown if the message with the specified key cannot be found. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
{	TokenNameLBRACE	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
resourceBundle	TokenNameIdentifier	 resource Bundle
=	TokenNameEQUAL	
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
domain	TokenNameIdentifier	 domain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resourceBundle	TokenNameIdentifier	 resource Bundle
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resourceBundle	TokenNameIdentifier	 resource Bundle
=	TokenNameEQUAL	
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
domain	TokenNameIdentifier	 domain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resourceBundle	TokenNameIdentifier	 resource Bundle
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
(	TokenNameLPAREN	
"Unknown domain"	TokenNameStringLiteral	Unknown domain
+	TokenNamePLUS	
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// format message 	TokenNameCOMMENT_LINE	format message 
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
resourceBundle	TokenNameIdentifier	 resource Bundle
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
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
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
resourceBundle	TokenNameIdentifier	 resource Bundle
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"FormatFailed"	TokenNameStringLiteral	FormatFailed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
resourceBundle	TokenNameIdentifier	 resource Bundle
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// error 	TokenNameCOMMENT_LINE	error 
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
resourceBundle	TokenNameIdentifier	 resource Bundle
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"BadMessageKey"	TokenNameStringLiteral	BadMessageKey
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// no message 	TokenNameCOMMENT_LINE	no message 
if	TokenNameif	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
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
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
domain	TokenNameIdentifier	 domain
==	TokenNameEQUAL_EQUAL	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
||	TokenNameOR_OR	
domain	TokenNameIdentifier	 domain
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
domResourceBundle	TokenNameIdentifier	 dom Resource Bundle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
domain	TokenNameIdentifier	 domain
==	TokenNameEQUAL_EQUAL	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
||	TokenNameOR_OR	
domain	TokenNameIdentifier	 domain
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xmlResourceBundle	TokenNameIdentifier	 xml Resource Bundle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
domain	TokenNameIdentifier	 domain
==	TokenNameEQUAL_EQUAL	
SERIALIZER_DOMAIN	TokenNameIdentifier	 SERIALIZER  DOMAIN
||	TokenNameOR_OR	
domain	TokenNameIdentifier	 domain
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SERIALIZER_DOMAIN	TokenNameIdentifier	 SERIALIZER  DOMAIN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
serResourceBundle	TokenNameIdentifier	 ser Resource Bundle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize Message Formatter. */	TokenNameCOMMENT_JAVADOC	 Initialize Message Formatter. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Locale	TokenNameIdentifier	 Locale
_locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_locale	TokenNameIdentifier	 locale
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
domResourceBundle	TokenNameIdentifier	 dom Resource Bundle
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
"org.apache.xerces.impl.msg.DOMMessages"	TokenNameStringLiteral	org.apache.xerces.impl.msg.DOMMessages
,	TokenNameCOMMA	
_locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serResourceBundle	TokenNameIdentifier	 ser Resource Bundle
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
"org.apache.xerces.impl.msg.XMLSerializerMessages"	TokenNameStringLiteral	org.apache.xerces.impl.msg.XMLSerializerMessages
,	TokenNameCOMMA	
_locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlResourceBundle	TokenNameIdentifier	 xml Resource Bundle
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
"org.apache.xerces.impl.msg.XMLMessages"	TokenNameStringLiteral	org.apache.xerces.impl.msg.XMLMessages
,	TokenNameCOMMA	
_locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set Locale to be used by the formatter. * @param dlocale */	TokenNameCOMMENT_JAVADOC	 Set Locale to be used by the formatter. @param dlocale 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
dlocale	TokenNameIdentifier	 dlocale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
dlocale	TokenNameIdentifier	 dlocale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
