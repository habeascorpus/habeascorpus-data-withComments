/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
i18n	TokenNameIdentifier	 i18n
.	TokenNameDOT	
LocalizableSupport	TokenNameIdentifier	 Localizable Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
NormalizingReader	TokenNameIdentifier	 Normalizing Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StreamNormalizingReader	TokenNameIdentifier	 Stream Normalizing Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringNormalizingReader	TokenNameIdentifier	 String Normalizing Reader
;	TokenNameSEMICOLON	
/** * This class is the superclass of all parsers. It provides localization * and error handling methods. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractParser.java 502167 2007-02-01 09:26:51Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class is the superclass of all parsers. It provides localization and error handling methods. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractParser.java 502167 2007-02-01 09:26:51Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractParser	TokenNameIdentifier	 Abstract Parser
implements	TokenNameimplements	
Parser	TokenNameIdentifier	 Parser
{	TokenNameLBRACE	
/** * The default resource bundle base name. */	TokenNameCOMMENT_JAVADOC	 The default resource bundle base name. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUNDLE_CLASSNAME	TokenNameIdentifier	 BUNDLE  CLASSNAME
=	TokenNameEQUAL	
"org.apache.batik.parser.resources.Messages"	TokenNameStringLiteral	org.apache.batik.parser.resources.Messages
;	TokenNameSEMICOLON	
/** * The error handler. */	TokenNameCOMMENT_JAVADOC	 The error handler. 
protected	TokenNameprotected	
ErrorHandler	TokenNameIdentifier	 Error Handler
errorHandler	TokenNameIdentifier	 error Handler
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The localizable support. */	TokenNameCOMMENT_JAVADOC	 The localizable support. 
protected	TokenNameprotected	
LocalizableSupport	TokenNameIdentifier	 Localizable Support
localizableSupport	TokenNameIdentifier	 localizable Support
=	TokenNameEQUAL	
new	TokenNamenew	
LocalizableSupport	TokenNameIdentifier	 Localizable Support
(	TokenNameLPAREN	
BUNDLE_CLASSNAME	TokenNameIdentifier	 BUNDLE  CLASSNAME
,	TokenNameCOMMA	
AbstractParser	TokenNameIdentifier	 Abstract Parser
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The normalizing reader. */	TokenNameCOMMENT_JAVADOC	 The normalizing reader. 
protected	TokenNameprotected	
NormalizingReader	TokenNameIdentifier	 Normalizing Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
/** * The current character. */	TokenNameCOMMENT_JAVADOC	 The current character. 
protected	TokenNameprotected	
int	TokenNameint	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
/** * Returns the current character value. */	TokenNameCOMMENT_JAVADOC	 Returns the current character value. 
public	TokenNamepublic	
int	TokenNameint	
getCurrent	TokenNameIdentifier	 get Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.i18n.Localizable#setLocale(Locale)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.i18n.Localizable#setLocale(Locale)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.i18n.Localizable#getLocale()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.i18n.Localizable#getLocale()}. 
public	TokenNamepublic	
Locale	TokenNameIdentifier	 Locale
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.i18n.Localizable#formatMessage(String,Object[])}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.i18n.Localizable#formatMessage(String,Object[])}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Allow an application to register an error event handler. * * <p>If the application does not register an error event handler, * all error events reported by the parser will cause an exception * to be thrown. * * <p>Applications may register a new or different handler in the * middle of a parse, and the parser must begin using the new * handler immediately.</p> * @param handler The error handler. */	TokenNameCOMMENT_JAVADOC	 Allow an application to register an error event handler. * <p>If the application does not register an error event handler, all error events reported by the parser will cause an exception to be thrown. * <p>Applications may register a new or different handler in the middle of a parse, and the parser must begin using the new handler immediately.</p> @param handler The error handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses the given reader */	TokenNameCOMMENT_JAVADOC	 Parses the given reader 
public	TokenNamepublic	
void	TokenNamevoid	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
StreamNormalizingReader	TokenNameIdentifier	 Stream Normalizing Reader
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doParse	TokenNameIdentifier	 do Parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
createErrorMessage	TokenNameIdentifier	 create Error Message
(	TokenNameLPAREN	
"io.exception"	TokenNameStringLiteral	io.exception
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses the given input stream. If the encoding is null, * ISO-8859-1 is used. */	TokenNameCOMMENT_JAVADOC	 Parses the given input stream. If the encoding is null, ISO-8859-1 is used. 
public	TokenNamepublic	
void	TokenNamevoid	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
StreamNormalizingReader	TokenNameIdentifier	 Stream Normalizing Reader
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doParse	TokenNameIdentifier	 do Parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
createErrorMessage	TokenNameIdentifier	 create Error Message
(	TokenNameLPAREN	
"io.exception"	TokenNameStringLiteral	io.exception
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses the given string. */	TokenNameCOMMENT_JAVADOC	 Parses the given string. 
public	TokenNamepublic	
void	TokenNamevoid	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
StringNormalizingReader	TokenNameIdentifier	 String Normalizing Reader
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doParse	TokenNameIdentifier	 do Parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
createErrorMessage	TokenNameIdentifier	 create Error Message
(	TokenNameLPAREN	
"io.exception"	TokenNameStringLiteral	io.exception
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Method responsible for actually parsing data after AbstractParser * has initialized itself. */	TokenNameCOMMENT_JAVADOC	 Method responsible for actually parsing data after AbstractParser has initialized itself. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
doParse	TokenNameIdentifier	 do Parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Signals an error to the error handler. * @param key The message key in the resource bundle. * @param args The message arguments. */	TokenNameCOMMENT_JAVADOC	 Signals an error to the error handler. @param key The message key in the resource bundle. @param args The message arguments. 
protected	TokenNameprotected	
void	TokenNamevoid	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
createErrorMessage	TokenNameIdentifier	 create Error Message
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * simple api to call often reported error. * Just a wrapper for reportError(). * * @param expectedChar what caller expected * @param currentChar what caller found */	TokenNameCOMMENT_JAVADOC	 simple api to call often reported error. Just a wrapper for reportError(). * @param expectedChar what caller expected @param currentChar what caller found 
protected	TokenNameprotected	
void	TokenNamevoid	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
char	TokenNamechar	
expectedChar	TokenNameIdentifier	 expected Char
,	TokenNameCOMMA	
int	TokenNameint	
currentChar	TokenNameIdentifier	 current Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
"character.expected"	TokenNameStringLiteral	character.expected
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
expectedChar	TokenNameIdentifier	 expected Char
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
currentChar	TokenNameIdentifier	 current Char
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * simple api to call often reported error. * Just a wrapper for reportError(). * * @param currentChar what the caller found and didnt expect */	TokenNameCOMMENT_JAVADOC	 simple api to call often reported error. Just a wrapper for reportError(). * @param currentChar what the caller found and didnt expect 
protected	TokenNameprotected	
void	TokenNamevoid	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
int	TokenNameint	
currentChar	TokenNameIdentifier	 current Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
"character.unexpected"	TokenNameStringLiteral	character.unexpected
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
currentChar	TokenNameIdentifier	 current Char
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a localized error message. * @param key The message key in the resource bundle. * @param args The message arguments. */	TokenNameCOMMENT_JAVADOC	 Returns a localized error message. @param key The message key in the resource bundle. @param args The message arguments. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
createErrorMessage	TokenNameIdentifier	 create Error Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the resource bundle base name. * @return BUNDLE_CLASSNAME. */	TokenNameCOMMENT_JAVADOC	 Returns the resource bundle base name. @return BUNDLE_CLASSNAME. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getBundleClassName	TokenNameIdentifier	 get Bundle Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BUNDLE_CLASSNAME	TokenNameIdentifier	 BUNDLE  CLASSNAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Skips the whitespaces in the current reader. */	TokenNameCOMMENT_JAVADOC	 Skips the whitespaces in the current reader. 
protected	TokenNameprotected	
void	TokenNamevoid	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x09	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x0D	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x0A	TokenNameIntegerLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Skips the whitespaces and an optional comma. */	TokenNameCOMMENT_JAVADOC	 Skips the whitespaces and an optional comma. 
protected	TokenNameprotected	
void	TokenNamevoid	
skipCommaSpaces	TokenNameIdentifier	 skip Comma Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
wsp1	TokenNameIdentifier	 wsp1
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
wsp1	TokenNameIdentifier	 wsp1
;	TokenNameSEMICOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wsp2	TokenNameIdentifier	 wsp2
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
wsp2	TokenNameIdentifier	 wsp2
;	TokenNameSEMICOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
