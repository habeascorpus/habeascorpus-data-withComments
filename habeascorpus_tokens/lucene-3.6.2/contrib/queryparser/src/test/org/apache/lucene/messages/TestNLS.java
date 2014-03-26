package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
TestNLS	TokenNameIdentifier	 Test NLS
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMessageLoading	TokenNameIdentifier	 test Message Loading
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Message	TokenNameIdentifier	 Message
invalidSyntax	TokenNameIdentifier	 invalid Syntax
=	TokenNameEQUAL	
new	TokenNamenew	
MessageImpl	TokenNameIdentifier	 Message Impl
(	TokenNameLPAREN	
MessagesTestBundle	TokenNameIdentifier	 Messages Test Bundle
.	TokenNameDOT	
Q0001E_INVALID_SYNTAX	TokenNameIdentifier	 Q0001 E  INVALID  SYNTAX
,	TokenNameCOMMA	
"XXX"	TokenNameStringLiteral	XXX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * if the default locale is ja, you get ja as a fallback: * see ResourceBundle.html#getBundle(java.lang.String, java.util.Locale, java.lang.ClassLoader) */	TokenNameCOMMENT_BLOCK	 if the default locale is ja, you get ja as a fallback: see ResourceBundle.html#getBundle(java.lang.String, java.util.Locale, java.lang.ClassLoader) 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"ja"	TokenNameStringLiteral	ja
)	TokenNameRPAREN	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Syntax Error: XXX"	TokenNameStringLiteral	Syntax Error: XXX
,	TokenNameCOMMA	
invalidSyntax	TokenNameIdentifier	 invalid Syntax
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMessageLoading_ja	TokenNameIdentifier	 test Message Loading ja
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Message	TokenNameIdentifier	 Message
invalidSyntax	TokenNameIdentifier	 invalid Syntax
=	TokenNameEQUAL	
new	TokenNamenew	
MessageImpl	TokenNameIdentifier	 Message Impl
(	TokenNameLPAREN	
MessagesTestBundle	TokenNameIdentifier	 Messages Test Bundle
.	TokenNameDOT	
Q0001E_INVALID_SYNTAX	TokenNameIdentifier	 Q0001 E  INVALID  SYNTAX
,	TokenNameCOMMA	
"XXX"	TokenNameStringLiteral	XXX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"構文エラー: XXX"	TokenNameStringLiteral	構文エラー: XXX
,	TokenNameCOMMA	
invalidSyntax	TokenNameIdentifier	 invalid Syntax
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
JAPANESE	TokenNameIdentifier	 JAPANESE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNLSLoading	TokenNameIdentifier	 test NLS Loading
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
NLS	TokenNameIdentifier	 NLS
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
MessagesTestBundle	TokenNameIdentifier	 Messages Test Bundle
.	TokenNameDOT	
Q0004E_INVALID_SYNTAX_ESCAPE_UNICODE_TRUNCATION	TokenNameIdentifier	 Q0004 E  INVALID  SYNTAX  ESCAPE  UNICODE  TRUNCATION
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * if the default locale is ja, you get ja as a fallback: * see ResourceBundle.html#getBundle(java.lang.String, java.util.Locale, java.lang.ClassLoader) */	TokenNameCOMMENT_BLOCK	 if the default locale is ja, you get ja as a fallback: see ResourceBundle.html#getBundle(java.lang.String, java.util.Locale, java.lang.ClassLoader) 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"ja"	TokenNameStringLiteral	ja
)	TokenNameRPAREN	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Truncated unicode escape sequence."	TokenNameStringLiteral	Truncated unicode escape sequence.
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
NLS	TokenNameIdentifier	 NLS
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
MessagesTestBundle	TokenNameIdentifier	 Messages Test Bundle
.	TokenNameDOT	
Q0001E_INVALID_SYNTAX	TokenNameIdentifier	 Q0001 E  INVALID  SYNTAX
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
,	TokenNameCOMMA	
"XXX"	TokenNameStringLiteral	XXX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * if the default locale is ja, you get ja as a fallback: * see ResourceBundle.html#getBundle(java.lang.String, java.util.Locale, java.lang.ClassLoader) */	TokenNameCOMMENT_BLOCK	 if the default locale is ja, you get ja as a fallback: see ResourceBundle.html#getBundle(java.lang.String, java.util.Locale, java.lang.ClassLoader) 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"ja"	TokenNameStringLiteral	ja
)	TokenNameRPAREN	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Syntax Error: XXX"	TokenNameStringLiteral	Syntax Error: XXX
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNLSLoading_ja	TokenNameIdentifier	 test NLS Loading ja
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
NLS	TokenNameIdentifier	 NLS
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
MessagesTestBundle	TokenNameIdentifier	 Messages Test Bundle
.	TokenNameDOT	
Q0004E_INVALID_SYNTAX_ESCAPE_UNICODE_TRUNCATION	TokenNameIdentifier	 Q0004 E  INVALID  SYNTAX  ESCAPE  UNICODE  TRUNCATION
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
JAPANESE	TokenNameIdentifier	 JAPANESE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"切り捨てられたユニコード・エスケープ・シーケンス。"	TokenNameStringLiteral	切り捨てられたユニコード・エスケープ・シーケンス。
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
NLS	TokenNameIdentifier	 NLS
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
MessagesTestBundle	TokenNameIdentifier	 Messages Test Bundle
.	TokenNameDOT	
Q0001E_INVALID_SYNTAX	TokenNameIdentifier	 Q0001 E  INVALID  SYNTAX
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
JAPANESE	TokenNameIdentifier	 JAPANESE
,	TokenNameCOMMA	
"XXX"	TokenNameStringLiteral	XXX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"構文エラー: XXX"	TokenNameStringLiteral	構文エラー: XXX
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNLSLoading_xx_XX	TokenNameIdentifier	 test NLS Loading xx  XX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
(	TokenNameLPAREN	
"xx"	TokenNameStringLiteral	xx
,	TokenNameCOMMA	
"XX"	TokenNameStringLiteral	XX
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
NLS	TokenNameIdentifier	 NLS
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
MessagesTestBundle	TokenNameIdentifier	 Messages Test Bundle
.	TokenNameDOT	
Q0004E_INVALID_SYNTAX_ESCAPE_UNICODE_TRUNCATION	TokenNameIdentifier	 Q0004 E  INVALID  SYNTAX  ESCAPE  UNICODE  TRUNCATION
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * if the default locale is ja, you get ja as a fallback: * see ResourceBundle.html#getBundle(java.lang.String, java.util.Locale, java.lang.ClassLoader) */	TokenNameCOMMENT_BLOCK	 if the default locale is ja, you get ja as a fallback: see ResourceBundle.html#getBundle(java.lang.String, java.util.Locale, java.lang.ClassLoader) 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"ja"	TokenNameStringLiteral	ja
)	TokenNameRPAREN	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Truncated unicode escape sequence."	TokenNameStringLiteral	Truncated unicode escape sequence.
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
NLS	TokenNameIdentifier	 NLS
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
MessagesTestBundle	TokenNameIdentifier	 Messages Test Bundle
.	TokenNameDOT	
Q0001E_INVALID_SYNTAX	TokenNameIdentifier	 Q0001 E  INVALID  SYNTAX
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
,	TokenNameCOMMA	
"XXX"	TokenNameStringLiteral	XXX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * if the default locale is ja, you get ja as a fallback: * see ResourceBundle.html#getBundle(java.lang.String, java.util.Locale, java.lang.ClassLoader) */	TokenNameCOMMENT_BLOCK	 if the default locale is ja, you get ja as a fallback: see ResourceBundle.html#getBundle(java.lang.String, java.util.Locale, java.lang.ClassLoader) 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"ja"	TokenNameStringLiteral	ja
)	TokenNameRPAREN	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Syntax Error: XXX"	TokenNameStringLiteral	Syntax Error: XXX
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingMessage	TokenNameIdentifier	 test Missing Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
NLS	TokenNameIdentifier	 NLS
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
MessagesTestBundle	TokenNameIdentifier	 Messages Test Bundle
.	TokenNameDOT	
Q0005E_MESSAGE_NOT_IN_BUNDLE	TokenNameIdentifier	 Q0005 E  MESSAGE  NOT  IN  BUNDLE
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Message with key:Q0005E_MESSAGE_NOT_IN_BUNDLE and locale: "	TokenNameStringLiteral	Message with key:Q0005E_MESSAGE_NOT_IN_BUNDLE and locale: 
+	TokenNamePLUS	
locale	TokenNameIdentifier	 locale
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" not found."	TokenNameStringLiteral	 not found.
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
