/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
msg	TokenNameIdentifier	 msg
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
MessageFormatter	TokenNameIdentifier	 Message Formatter
;	TokenNameSEMICOLON	
/** * XMLMessageFormatter provides error messages for the XML 1.0 Recommendation and for * the Namespaces Recommendation * * @xerces.internal * * @author Eric Ye, IBM * @version $Id: XMLMessageFormatter.java 813087 2009-09-09 19:35:27Z mrglavas $ * */	TokenNameCOMMENT_JAVADOC	 XMLMessageFormatter provides error messages for the XML 1.0 Recommendation and for the Namespaces Recommendation * @xerces.internal * @author Eric Ye, IBM @version $Id: XMLMessageFormatter.java 813087 2009-09-09 19:35:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
implements	TokenNameimplements	
MessageFormatter	TokenNameIdentifier	 Message Formatter
{	TokenNameLBRACE	
/** * The domain of messages concerning the XML 1.0 specification. */	TokenNameCOMMENT_JAVADOC	 The domain of messages concerning the XML 1.0 specification. 
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
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
=	TokenNameEQUAL	
"http://www.w3.org/TR/1999/REC-xml-names-19990114"	TokenNameStringLiteral	http://www.w3.org/TR/1999/REC-xml-names-19990114
;	TokenNameSEMICOLON	
// private objects to cache the locale and resource bundle 	TokenNameCOMMENT_LINE	private objects to cache the locale and resource bundle 
private	TokenNameprivate	
Locale	TokenNameIdentifier	 Locale
fLocale	TokenNameIdentifier	 f Locale
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
fResourceBundle	TokenNameIdentifier	 f Resource Bundle
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// MessageFormatter methods 	TokenNameCOMMENT_LINE	MessageFormatter methods 
// 	TokenNameCOMMENT_LINE	 
/** * Formats a message with the specified arguments using the given * locale information. * * @param locale The locale of the message. * @param key The message key. * @param arguments The message replacement text arguments. The order * of the arguments must match that of the placeholders * in the actual message. * * @return Returns the formatted message. * * @throws MissingResourceException Thrown if the message with the * specified key cannot be found. */	TokenNameCOMMENT_JAVADOC	 Formats a message with the specified arguments using the given locale information. * @param locale The locale of the message. @param key The message key. @param arguments The message replacement text arguments. The order of the arguments must match that of the placeholders in the actual message. * @return Returns the formatted message. * @throws MissingResourceException Thrown if the message with the specified key cannot be found. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
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
if	TokenNameif	
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
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
if	TokenNameif	
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
!=	TokenNameNOT_EQUAL	
fLocale	TokenNameIdentifier	 f Locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fResourceBundle	TokenNameIdentifier	 f Resource Bundle
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
"org.apache.xerces.impl.msg.XMLMessages"	TokenNameStringLiteral	org.apache.xerces.impl.msg.XMLMessages
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// memorize the most-recent locale 	TokenNameCOMMENT_LINE	memorize the most-recent locale 
fLocale	TokenNameIdentifier	 f Locale
=	TokenNameEQUAL	
locale	TokenNameIdentifier	 locale
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
fResourceBundle	TokenNameIdentifier	 f Resource Bundle
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
fResourceBundle	TokenNameIdentifier	 f Resource Bundle
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
fResourceBundle	TokenNameIdentifier	 f Resource Bundle
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
fResourceBundle	TokenNameIdentifier	 f Resource Bundle
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
}	TokenNameRBRACE	
