/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
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
Localizable	TokenNameIdentifier	 Localizable
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
/** * This class represents a scanner for XML documents. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: XMLScanner.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a scanner for XML documents. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: XMLScanner.java 489226 2006-12-21 00:05:36Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLScanner	TokenNameIdentifier	 XML Scanner
implements	TokenNameimplements	
Localizable	TokenNameIdentifier	 Localizable
{	TokenNameLBRACE	
/** * The document start context. */	TokenNameCOMMENT_JAVADOC	 The document start context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOCUMENT_START_CONTEXT	TokenNameIdentifier	 DOCUMENT  START  CONTEXT
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The top level context. */	TokenNameCOMMENT_JAVADOC	 The top level context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TOP_LEVEL_CONTEXT	TokenNameIdentifier	 TOP  LEVEL  CONTEXT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The processing instruction context. */	TokenNameCOMMENT_JAVADOC	 The processing instruction context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PI_CONTEXT	TokenNameIdentifier	 PI  CONTEXT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The XML declaration context. */	TokenNameCOMMENT_JAVADOC	 The XML declaration context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
XML_DECL_CONTEXT	TokenNameIdentifier	 XML  DECL  CONTEXT
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The doctype context. */	TokenNameCOMMENT_JAVADOC	 The doctype context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOCTYPE_CONTEXT	TokenNameIdentifier	 DOCTYPE  CONTEXT
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The start tag context. */	TokenNameCOMMENT_JAVADOC	 The start tag context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
START_TAG_CONTEXT	TokenNameIdentifier	 START  TAG  CONTEXT
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The content context. */	TokenNameCOMMENT_JAVADOC	 The content context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONTENT_CONTEXT	TokenNameIdentifier	 CONTENT  CONTEXT
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The DTD declarations context. */	TokenNameCOMMENT_JAVADOC	 The DTD declarations context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DTD_DECLARATIONS_CONTEXT	TokenNameIdentifier	 DTD  DECLARATIONS  CONTEXT
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The CDATA section context. */	TokenNameCOMMENT_JAVADOC	 The CDATA section context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CDATA_SECTION_CONTEXT	TokenNameIdentifier	 CDATA  SECTION  CONTEXT
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The end tag context. */	TokenNameCOMMENT_JAVADOC	 The end tag context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
END_TAG_CONTEXT	TokenNameIdentifier	 END  TAG  CONTEXT
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The attribute value context. */	TokenNameCOMMENT_JAVADOC	 The attribute value context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ATTRIBUTE_VALUE_CONTEXT	TokenNameIdentifier	 ATTRIBUTE  VALUE  CONTEXT
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The ATTLIST context. */	TokenNameCOMMENT_JAVADOC	 The ATTLIST context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ATTLIST_CONTEXT	TokenNameIdentifier	 ATTLIST  CONTEXT
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The element declaration context. */	TokenNameCOMMENT_JAVADOC	 The element declaration context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ELEMENT_DECLARATION_CONTEXT	TokenNameIdentifier	 ELEMENT  DECLARATION  CONTEXT
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The entity context. */	TokenNameCOMMENT_JAVADOC	 The entity context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ENTITY_CONTEXT	TokenNameIdentifier	 ENTITY  CONTEXT
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The notation context. */	TokenNameCOMMENT_JAVADOC	 The notation context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NOTATION_CONTEXT	TokenNameIdentifier	 NOTATION  CONTEXT
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The notation type context. */	TokenNameCOMMENT_JAVADOC	 The notation type context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NOTATION_TYPE_CONTEXT	TokenNameIdentifier	 NOTATION  TYPE  CONTEXT
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The enumeration context. */	TokenNameCOMMENT_JAVADOC	 The enumeration context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ENUMERATION_CONTEXT	TokenNameIdentifier	 ENUMERATION  CONTEXT
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The entity value context. */	TokenNameCOMMENT_JAVADOC	 The entity value context. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ENTITY_VALUE_CONTEXT	TokenNameIdentifier	 ENTITY  VALUE  CONTEXT
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The default resource bundle base name. */	TokenNameCOMMENT_JAVADOC	 The default resource bundle base name. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUNDLE_CLASSNAME	TokenNameIdentifier	 BUNDLE  CLASSNAME
=	TokenNameEQUAL	
"org.apache.batik.xml.resources.Messages"	TokenNameStringLiteral	org.apache.batik.xml.resources.Messages
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
XMLScanner	TokenNameIdentifier	 XML Scanner
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The reader. */	TokenNameCOMMENT_JAVADOC	 The reader. 
protected	TokenNameprotected	
NormalizingReader	TokenNameIdentifier	 Normalizing Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
/** * The current char. */	TokenNameCOMMENT_JAVADOC	 The current char. 
protected	TokenNameprotected	
int	TokenNameint	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
/** * The type of the current lexical unit. */	TokenNameCOMMENT_JAVADOC	 The type of the current lexical unit. 
protected	TokenNameprotected	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** * The recording buffer. */	TokenNameCOMMENT_JAVADOC	 The recording buffer. 
protected	TokenNameprotected	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
1024	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * The current position in the buffer. */	TokenNameCOMMENT_JAVADOC	 The current position in the buffer. 
protected	TokenNameprotected	
int	TokenNameint	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
/** * The start offset of the last lexical unit. */	TokenNameCOMMENT_JAVADOC	 The start offset of the last lexical unit. 
protected	TokenNameprotected	
int	TokenNameint	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
/** * The end offset of the last lexical unit. */	TokenNameCOMMENT_JAVADOC	 The end offset of the last lexical unit. 
protected	TokenNameprotected	
int	TokenNameint	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
/** * The current scanning context. */	TokenNameCOMMENT_JAVADOC	 The current scanning context. 
protected	TokenNameprotected	
int	TokenNameint	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
/** * The depth in the xml tree. */	TokenNameCOMMENT_JAVADOC	 The depth in the xml tree. 
protected	TokenNameprotected	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
/** * A PI end has been previously read. */	TokenNameCOMMENT_JAVADOC	 A PI end has been previously read. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
piEndRead	TokenNameIdentifier	 pi End Read
;	TokenNameSEMICOLON	
/** * The scanner is in the internal DTD. */	TokenNameCOMMENT_JAVADOC	 The scanner is in the internal DTD. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
inDTD	TokenNameIdentifier	 in DTD
;	TokenNameSEMICOLON	
/** * The last attribute delimiter encountered. */	TokenNameCOMMENT_JAVADOC	 The last attribute delimiter encountered. 
protected	TokenNameprotected	
char	TokenNamechar	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
;	TokenNameSEMICOLON	
/** * A CDATA section end is the next token */	TokenNameCOMMENT_JAVADOC	 A CDATA section end is the next token 
protected	TokenNameprotected	
boolean	TokenNameboolean	
cdataEndRead	TokenNameIdentifier	 cdata End Read
;	TokenNameSEMICOLON	
/** * Creates a new XML scanner. * @param r The reader to scan. */	TokenNameCOMMENT_JAVADOC	 Creates a new XML scanner. @param r The reader to scan. 
public	TokenNamepublic	
XMLScanner	TokenNameIdentifier	 XML Scanner
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
DOCUMENT_START_CONTEXT	TokenNameIdentifier	 DOCUMENT  START  CONTEXT
;	TokenNameSEMICOLON	
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
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
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
throw	TokenNamethrow	
new	TokenNamenew	
XMLException	TokenNameIdentifier	 XML Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a new XML scanner. * @param is The input stream to scan. * @param enc The character encoding to use. */	TokenNameCOMMENT_JAVADOC	 Creates a new XML scanner. @param is The input stream to scan. @param enc The character encoding to use. 
public	TokenNamepublic	
XMLScanner	TokenNameIdentifier	 XML Scanner
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
DOCUMENT_START_CONTEXT	TokenNameIdentifier	 DOCUMENT  START  CONTEXT
;	TokenNameSEMICOLON	
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
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
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
throw	TokenNamethrow	
new	TokenNamenew	
XMLException	TokenNameIdentifier	 XML Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a new XML scanner. * @param s The string to parse. */	TokenNameCOMMENT_JAVADOC	 Creates a new XML scanner. @param s The string to parse. 
public	TokenNamepublic	
XMLScanner	TokenNameIdentifier	 XML Scanner
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
DOCUMENT_START_CONTEXT	TokenNameIdentifier	 DOCUMENT  START  CONTEXT
;	TokenNameSEMICOLON	
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
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
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
throw	TokenNamethrow	
new	TokenNamenew	
XMLException	TokenNameIdentifier	 XML Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** * Sets the current depth in the XML tree. */	TokenNameCOMMENT_JAVADOC	 Sets the current depth in the XML tree. 
public	TokenNamepublic	
void	TokenNamevoid	
setDepth	TokenNameIdentifier	 set Depth
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
depth	TokenNameIdentifier	 depth
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current depth in the XML tree. */	TokenNameCOMMENT_JAVADOC	 Returns the current depth in the XML tree. 
public	TokenNamepublic	
int	TokenNameint	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the current context. */	TokenNameCOMMENT_JAVADOC	 Sets the current context. 
public	TokenNamepublic	
void	TokenNamevoid	
setContext	TokenNameIdentifier	 set Context
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current context. */	TokenNameCOMMENT_JAVADOC	 Returns the current context. 
public	TokenNamepublic	
int	TokenNameint	
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The current lexical unit type like defined in LexicalUnits. */	TokenNameCOMMENT_JAVADOC	 The current lexical unit type like defined in LexicalUnits. 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current line. */	TokenNameCOMMENT_JAVADOC	 Returns the current line. 
public	TokenNamepublic	
int	TokenNameint	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current column. */	TokenNameCOMMENT_JAVADOC	 Returns the current column. 
public	TokenNamepublic	
int	TokenNameint	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the buffer used to store the chars. */	TokenNameCOMMENT_JAVADOC	 Returns the buffer used to store the chars. 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the start offset of the last lexical unit. */	TokenNameCOMMENT_JAVADOC	 Returns the start offset of the last lexical unit. 
public	TokenNamepublic	
int	TokenNameint	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the end offset of the last lexical unit. */	TokenNameCOMMENT_JAVADOC	 Returns the end offset of the last lexical unit. 
public	TokenNamepublic	
int	TokenNameint	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the last encountered string delimiter. */	TokenNameCOMMENT_JAVADOC	 Returns the last encountered string delimiter. 
public	TokenNamepublic	
char	TokenNamechar	
getStringDelimiter	TokenNameIdentifier	 get String Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the start offset of the current lexical unit. */	TokenNameCOMMENT_JAVADOC	 Returns the start offset of the current lexical unit. 
public	TokenNamepublic	
int	TokenNameint	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
SECTION_END	TokenNameIdentifier	 SECTION  END
:	TokenNameCOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_END	TokenNameIdentifier	 PI  END
:	TokenNameCOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ENTITY_REFERENCE	TokenNameIdentifier	 ENTITY  REFERENCE
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PARAMETER_ENTITY_REFERENCE	TokenNameIdentifier	 PARAMETER  ENTITY  REFERENCE
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
START_TAG	TokenNameIdentifier	 START  TAG
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIRST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 FIRST  ATTRIBUTE  FRAGMENT
:	TokenNameCOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_START	TokenNameIdentifier	 PI  START
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_TAG	TokenNameIdentifier	 END  TAG
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CHARACTER_REFERENCE	TokenNameIdentifier	 CHARACTER  REFERENCE
:	TokenNameCOLON	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
COMMENT	TokenNameIdentifier	 COMMENT
:	TokenNameCOLON	
return	TokenNamereturn	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the end offset of the current lexical unit. */	TokenNameCOMMENT_JAVADOC	 Returns the end offset of the current lexical unit. 
public	TokenNamepublic	
int	TokenNameint	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ENTITY_REFERENCE	TokenNameIdentifier	 ENTITY  REFERENCE
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CHARACTER_REFERENCE	TokenNameIdentifier	 CHARACTER  REFERENCE
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PARAMETER_ENTITY_REFERENCE	TokenNameIdentifier	 PARAMETER  ENTITY  REFERENCE
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LAST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 LAST  ATTRIBUTE  FRAGMENT
:	TokenNameCOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_DATA	TokenNameIdentifier	 PI  DATA
:	TokenNameCOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
COMMENT	TokenNameIdentifier	 COMMENT
:	TokenNameCOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CHARACTER_DATA	TokenNameIdentifier	 CHARACTER  DATA
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cdataEndRead	TokenNameIdentifier	 cdata End Read
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Clears the buffer. */	TokenNameCOMMENT_JAVADOC	 Clears the buffer. 
public	TokenNamepublic	
void	TokenNamevoid	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Advances to the next lexical unit. * @return The type of the lexical unit like defined in LexicalUnits. */	TokenNameCOMMENT_JAVADOC	 Advances to the next lexical unit. @return The type of the lexical unit like defined in LexicalUnits. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Advances to the next lexical unit. * @param ctx The context to use for scanning. * @return The type of the lexical unit like defined in LexicalUnits. */	TokenNameCOMMENT_JAVADOC	 Advances to the next lexical unit. @param ctx The context to use for scanning. @return The type of the lexical unit like defined in LexicalUnits. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DOCUMENT_START_CONTEXT	TokenNameIdentifier	 DOCUMENT  START  CONTEXT
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nextInDocumentStart	TokenNameIdentifier	 next In Document Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TOP_LEVEL_CONTEXT	TokenNameIdentifier	 TOP  LEVEL  CONTEXT
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nextInTopLevel	TokenNameIdentifier	 next In Top Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PI_CONTEXT	TokenNameIdentifier	 PI  CONTEXT
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nextInPI	TokenNameIdentifier	 next In PI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
START_TAG_CONTEXT	TokenNameIdentifier	 START  TAG  CONTEXT
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nextInStartTag	TokenNameIdentifier	 next In Start Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ATTRIBUTE_VALUE_CONTEXT	TokenNameIdentifier	 ATTRIBUTE  VALUE  CONTEXT
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nextInAttributeValue	TokenNameIdentifier	 next In Attribute Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONTENT_CONTEXT	TokenNameIdentifier	 CONTENT  CONTEXT
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nextInContent	TokenNameIdentifier	 next In Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
END_TAG_CONTEXT	TokenNameIdentifier	 END  TAG  CONTEXT
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nextInEndTag	TokenNameIdentifier	 next In End Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CDATA_SECTION_CONTEXT	TokenNameIdentifier	 CDATA  SECTION  CONTEXT
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nextInCDATASection	TokenNameIdentifier	 next In CDATA Section
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XML_DECL_CONTEXT	TokenNameIdentifier	 XML  DECL  CONTEXT
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nextInXMLDecl	TokenNameIdentifier	 next In XML Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DOCTYPE_CONTEXT	TokenNameIdentifier	 DOCTYPE  CONTEXT
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nextInDoctype	TokenNameIdentifier	 next In Doctype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTD_DECLARATIONS_CONTEXT	TokenNameIdentifier	 DTD  DECLARATIONS  CONTEXT
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nextInDTDDeclarations	TokenNameIdentifier	 next In DTD Declarations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ELEMENT_DECLARATION_CONTEXT	TokenNameIdentifier	 ELEMENT  DECLARATION  CONTEXT
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nextInElementDeclaration	TokenNameIdentifier	 next In Element Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ATTLIST_CONTEXT	TokenNameIdentifier	 ATTLIST  CONTEXT
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nextInAttList	TokenNameIdentifier	 next In Att List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
NOTATION_CONTEXT	TokenNameIdentifier	 NOTATION  CONTEXT
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nextInNotation	TokenNameIdentifier	 next In Notation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ENTITY_CONTEXT	TokenNameIdentifier	 ENTITY  CONTEXT
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nextInEntity	TokenNameIdentifier	 next In Entity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ENTITY_VALUE_CONTEXT	TokenNameIdentifier	 ENTITY  VALUE  CONTEXT
:	TokenNameCOLON	
return	TokenNamereturn	
nextInEntityValue	TokenNameIdentifier	 next In Entity Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
NOTATION_TYPE_CONTEXT	TokenNameIdentifier	 NOTATION  TYPE  CONTEXT
:	TokenNameCOLON	
return	TokenNamereturn	
nextInNotationType	TokenNameIdentifier	 next In Notation Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ENUMERATION_CONTEXT	TokenNameIdentifier	 ENUMERATION  CONTEXT
:	TokenNameCOLON	
return	TokenNamereturn	
nextInEnumeration	TokenNameIdentifier	 next In Enumeration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"unexpected ctx:"	TokenNameStringLiteral	unexpected ctx:
+	TokenNamePLUS	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XMLException	TokenNameIdentifier	 XML Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads the first token in the stream. */	TokenNameCOMMENT_JAVADOC	 Reads the first token in the stream. 
protected	TokenNameprotected	
int	TokenNameint	
nextInDocumentStart	TokenNameIdentifier	 next In Document Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
TOP_LEVEL_CONTEXT	TokenNameIdentifier	 TOP  LEVEL  CONTEXT
:	TokenNameCOLON	
CONTENT_CONTEXT	TokenNameIdentifier	 CONTENT  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
;	TokenNameSEMICOLON	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
int	TokenNameint	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameFirstCharacter	TokenNameIdentifier	 is XML Name First Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.pi.target"	TokenNameStringLiteral	invalid.pi.target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
PI_CONTEXT	TokenNameIdentifier	 PI  CONTEXT
;	TokenNameSEMICOLON	
int	TokenNameint	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_START	TokenNameIdentifier	 PI  START
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
c3	TokenNameIdentifier	 c3
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c3	TokenNameIdentifier	 c3
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c3	TokenNameIdentifier	 c3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_START	TokenNameIdentifier	 PI  START
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
c4	TokenNameIdentifier	 c4
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c4	TokenNameIdentifier	 c4
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c4	TokenNameIdentifier	 c4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_START	TokenNameIdentifier	 PI  START
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
==	TokenNameEQUAL_EQUAL	
'x'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c2	TokenNameIdentifier	 c2
==	TokenNameEQUAL_EQUAL	
'm'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c3	TokenNameIdentifier	 c3
==	TokenNameEQUAL_EQUAL	
'l'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
XML_DECL_CONTEXT	TokenNameIdentifier	 XML  DECL  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
XML_DECL_START	TokenNameIdentifier	 XML  DECL  START
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
==	TokenNameEQUAL_EQUAL	
'x'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c1	TokenNameIdentifier	 c1
==	TokenNameEQUAL_EQUAL	
'X'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
==	TokenNameEQUAL_EQUAL	
'm'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c2	TokenNameIdentifier	 c2
==	TokenNameEQUAL_EQUAL	
'M'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c3	TokenNameIdentifier	 c3
==	TokenNameEQUAL_EQUAL	
'l'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c3	TokenNameIdentifier	 c3
==	TokenNameEQUAL_EQUAL	
'L'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"xml.reserved"	TokenNameStringLiteral	xml.reserved
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_START	TokenNameIdentifier	 PI  START
;	TokenNameSEMICOLON	
case	TokenNamecase	
'!'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readComment	TokenNameIdentifier	 read Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'D'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
DOCTYPE_CONTEXT	TokenNameIdentifier	 DOCTYPE  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"OCTYPE"	TokenNameStringLiteral	OCTYPE
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DOCTYPE_START	TokenNameIdentifier	 DOCTYPE  START
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.doctype"	TokenNameStringLiteral	invalid.doctype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
START_TAG_CONTEXT	TokenNameIdentifier	 START  TAG  CONTEXT
;	TokenNameSEMICOLON	
depth	TokenNameIdentifier	 depth
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
START_TAG	TokenNameIdentifier	 START  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EOF	TokenNameIdentifier	 EOF
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
nextInContent	TokenNameIdentifier	 next In Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Advances to the next lexical unit in the top level context. * @return The type of the lexical unit like defined in LexicalUnits. */	TokenNameCOMMENT_JAVADOC	 Advances to the next lexical unit in the top level context. @return The type of the lexical unit like defined in LexicalUnits. 
protected	TokenNameprotected	
int	TokenNameint	
nextInTopLevel	TokenNameIdentifier	 next In Top Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
;	TokenNameSEMICOLON	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
PI_CONTEXT	TokenNameIdentifier	 PI  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readPIStart	TokenNameIdentifier	 read PI Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'!'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readComment	TokenNameIdentifier	 read Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'D'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
DOCTYPE_CONTEXT	TokenNameIdentifier	 DOCTYPE  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"OCTYPE"	TokenNameStringLiteral	OCTYPE
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DOCTYPE_START	TokenNameIdentifier	 DOCTYPE  START
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
START_TAG_CONTEXT	TokenNameIdentifier	 START  TAG  CONTEXT
;	TokenNameSEMICOLON	
depth	TokenNameIdentifier	 depth
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
START_TAG	TokenNameIdentifier	 START  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EOF	TokenNameIdentifier	 EOF
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next lexical unit in the context of a processing * instruction. */	TokenNameCOMMENT_JAVADOC	 Returns the next lexical unit in the context of a processing instruction. 
protected	TokenNameprotected	
int	TokenNameint	
nextInPI	TokenNameIdentifier	 next In PI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
piEndRead	TokenNameIdentifier	 pi End Read
)	TokenNameRPAREN	
{	TokenNameLBRACE	
piEndRead	TokenNameIdentifier	 pi End Read
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
TOP_LEVEL_CONTEXT	TokenNameIdentifier	 TOP  LEVEL  CONTEXT
:	TokenNameCOLON	
CONTENT_CONTEXT	TokenNameIdentifier	 CONTENT  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_END	TokenNameIdentifier	 PI  END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"pi.end.expected"	TokenNameStringLiteral	pi.end.expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inDTD	TokenNameIdentifier	 in DTD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
DTD_DECLARATIONS_CONTEXT	TokenNameIdentifier	 DTD  DECLARATIONS  CONTEXT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
TOP_LEVEL_CONTEXT	TokenNameIdentifier	 TOP  LEVEL  CONTEXT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
CONTENT_CONTEXT	TokenNameIdentifier	 CONTENT  CONTEXT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_END	TokenNameIdentifier	 PI  END
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
piEndRead	TokenNameIdentifier	 pi End Read
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_DATA	TokenNameIdentifier	 PI  DATA
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next lexical unit in the context of a start tag. */	TokenNameCOMMENT_JAVADOC	 Returns the next lexical unit in the context of a start tag. 
protected	TokenNameprotected	
int	TokenNameint	
nextInStartTag	TokenNameIdentifier	 next In Start Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
;	TokenNameSEMICOLON	
case	TokenNamecase	
'/'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"malformed.tag.end"	TokenNameStringLiteral	malformed.tag.end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
depth	TokenNameIdentifier	 depth
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
TOP_LEVEL_CONTEXT	TokenNameIdentifier	 TOP  LEVEL  CONTEXT
:	TokenNameCOLON	
CONTENT_CONTEXT	TokenNameIdentifier	 CONTENT  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EMPTY_ELEMENT_END	TokenNameIdentifier	 EMPTY  ELEMENT  END
;	TokenNameSEMICOLON	
case	TokenNamecase	
'>'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
CONTENT_CONTEXT	TokenNameIdentifier	 CONTENT  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_CHAR	TokenNameIdentifier	 END  CHAR
;	TokenNameSEMICOLON	
case	TokenNamecase	
'='	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
=	TokenNameEQUAL	
'"'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
;	TokenNameSEMICOLON	
case	TokenNamecase	
'&'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
ATTRIBUTE_VALUE_CONTEXT	TokenNameIdentifier	 ATTRIBUTE  VALUE  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIRST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 FIRST  ATTRIBUTE  FRAGMENT
;	TokenNameSEMICOLON	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"unexpected.eof"	TokenNameStringLiteral	unexpected.eof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
=	TokenNameEQUAL	
'\''	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
;	TokenNameSEMICOLON	
case	TokenNamecase	
'&'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
ATTRIBUTE_VALUE_CONTEXT	TokenNameIdentifier	 ATTRIBUTE  VALUE  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIRST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 FIRST  ATTRIBUTE  FRAGMENT
;	TokenNameSEMICOLON	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"unexpected.eof"	TokenNameStringLiteral	unexpected.eof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next lexical unit in the context of an attribute value. */	TokenNameCOMMENT_JAVADOC	 Returns the next lexical unit in the context of an attribute value. 
protected	TokenNameprotected	
int	TokenNameint	
nextInAttributeValue	TokenNameIdentifier	 next In Attribute Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EOF	TokenNameIdentifier	 EOF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
readReference	TokenNameIdentifier	 read Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
loop	TokenNameIdentifier	 loop
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
case	TokenNamecase	
'&'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'&'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 ATTRIBUTE  FRAGMENT
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inDTD	TokenNameIdentifier	 in DTD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
ATTLIST_CONTEXT	TokenNameIdentifier	 ATTLIST  CONTEXT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
START_TAG_CONTEXT	TokenNameIdentifier	 START  TAG  CONTEXT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LAST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 LAST  ATTRIBUTE  FRAGMENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next lexical unit in the context of an element content. */	TokenNameCOMMENT_JAVADOC	 Returns the next lexical unit in the context of an element content. 
protected	TokenNameprotected	
int	TokenNameint	
nextInContent	TokenNameIdentifier	 next In Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EOF	TokenNameIdentifier	 EOF
;	TokenNameSEMICOLON	
case	TokenNamecase	
'&'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readReference	TokenNameIdentifier	 read Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
PI_CONTEXT	TokenNameIdentifier	 PI  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readPIStart	TokenNameIdentifier	 read PI Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'!'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readComment	TokenNameIdentifier	 read Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'['	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
CDATA_SECTION_CONTEXT	TokenNameIdentifier	 CDATA  SECTION  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"CDATA["	TokenNameStringLiteral	CDATA[
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CDATA_START	TokenNameIdentifier	 CDATA  START
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'/'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
END_TAG_CONTEXT	TokenNameIdentifier	 END  TAG  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_TAG	TokenNameIdentifier	 END  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
depth	TokenNameIdentifier	 depth
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
START_TAG_CONTEXT	TokenNameIdentifier	 START  TAG  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
START_TAG	TokenNameIdentifier	 START  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
loop	TokenNameIdentifier	 loop
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
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'&'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CHARACTER_DATA	TokenNameIdentifier	 CHARACTER  DATA
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next lexical unit in the context of a end tag. */	TokenNameCOMMENT_JAVADOC	 Returns the next lexical unit in the context of a end tag. 
protected	TokenNameprotected	
int	TokenNameint	
nextInEndTag	TokenNameIdentifier	 next In End Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
;	TokenNameSEMICOLON	
case	TokenNamecase	
'>'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
depth	TokenNameIdentifier	 depth
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"unexpected.end.tag"	TokenNameStringLiteral	unexpected.end.tag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
TOP_LEVEL_CONTEXT	TokenNameIdentifier	 TOP  LEVEL  CONTEXT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
CONTENT_CONTEXT	TokenNameIdentifier	 CONTENT  CONTEXT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_CHAR	TokenNameIdentifier	 END  CHAR
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next lexical unit in the context of a CDATA section. */	TokenNameCOMMENT_JAVADOC	 Returns the next lexical unit in the context of a CDATA section. 
protected	TokenNameprotected	
int	TokenNameint	
nextInCDATASection	TokenNameIdentifier	 next In CDATA Section
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cdataEndRead	TokenNameIdentifier	 cdata End Read
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cdataEndRead	TokenNameIdentifier	 cdata End Read
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
CONTENT_CONTEXT	TokenNameIdentifier	 CONTENT  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
SECTION_END	TokenNameIdentifier	 SECTION  END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
']'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"unexpected.eof"	TokenNameStringLiteral	unexpected.eof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cdataEndRead	TokenNameIdentifier	 cdata End Read
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CHARACTER_DATA	TokenNameIdentifier	 CHARACTER  DATA
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next lexical unit in the context of an XML declaration. */	TokenNameCOMMENT_JAVADOC	 Returns the next lexical unit in the context of an XML declaration. 
protected	TokenNameprotected	
int	TokenNameint	
nextInXMLDecl	TokenNameIdentifier	 next In XML Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
;	TokenNameSEMICOLON	
case	TokenNamecase	
'v'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"ersion"	TokenNameStringLiteral	ersion
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
VERSION_IDENTIFIER	TokenNameIdentifier	 VERSION  IDENTIFIER
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"ncoding"	TokenNameStringLiteral	ncoding
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ENCODING_IDENTIFIER	TokenNameIdentifier	 ENCODING  IDENTIFIER
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"tandalone"	TokenNameStringLiteral	tandalone
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STANDALONE_IDENTIFIER	TokenNameIdentifier	 STANDALONE  IDENTIFIER
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'='	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"pi.end.expected"	TokenNameStringLiteral	pi.end.expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
TOP_LEVEL_CONTEXT	TokenNameIdentifier	 TOP  LEVEL  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_END	TokenNameIdentifier	 PI  END
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
=	TokenNameEQUAL	
'"'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
=	TokenNameEQUAL	
'\''	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next lexical unit in the context of a doctype. */	TokenNameCOMMENT_JAVADOC	 Returns the next lexical unit in the context of a doctype. 
protected	TokenNameprotected	
int	TokenNameint	
nextInDoctype	TokenNameIdentifier	 next In Doctype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
;	TokenNameSEMICOLON	
case	TokenNamecase	
'>'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
TOP_LEVEL_CONTEXT	TokenNameIdentifier	 TOP  LEVEL  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_CHAR	TokenNameIdentifier	 END  CHAR
;	TokenNameSEMICOLON	
case	TokenNamecase	
'S'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"YSTEM"	TokenNameStringLiteral	YSTEM
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
SYSTEM_IDENTIFIER	TokenNameIdentifier	 SYSTEM  IDENTIFIER
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'P'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"UBLIC"	TokenNameStringLiteral	UBLIC
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PUBLIC_IDENTIFIER	TokenNameIdentifier	 PUBLIC  IDENTIFIER
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
=	TokenNameEQUAL	
'"'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
=	TokenNameEQUAL	
'\''	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'['	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
DTD_DECLARATIONS_CONTEXT	TokenNameIdentifier	 DTD  DECLARATIONS  CONTEXT
;	TokenNameSEMICOLON	
inDTD	TokenNameIdentifier	 in DTD
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LSQUARE_BRACKET	TokenNameIdentifier	 LSQUARE  BRACKET
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next lexical unit in the context dtd declarations. */	TokenNameCOMMENT_JAVADOC	 Returns the next lexical unit in the context dtd declarations. 
protected	TokenNameprotected	
int	TokenNameint	
nextInDTDDeclarations	TokenNameIdentifier	 next In DTD Declarations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
;	TokenNameSEMICOLON	
case	TokenNamecase	
']'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
DOCTYPE_CONTEXT	TokenNameIdentifier	 DOCTYPE  CONTEXT
;	TokenNameSEMICOLON	
inDTD	TokenNameIdentifier	 in DTD
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RSQUARE_BRACKET	TokenNameIdentifier	 RSQUARE  BRACKET
;	TokenNameSEMICOLON	
case	TokenNamecase	
'%'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readPEReference	TokenNameIdentifier	 read PE Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
PI_CONTEXT	TokenNameIdentifier	 PI  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readPIStart	TokenNameIdentifier	 read PI Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'!'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readComment	TokenNameIdentifier	 read Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'E'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'L'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
ELEMENT_DECLARATION_CONTEXT	TokenNameIdentifier	 ELEMENT  DECLARATION  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"EMENT"	TokenNameStringLiteral	EMENT
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ELEMENT_DECLARATION_START	TokenNameIdentifier	 ELEMENT  DECLARATION  START
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'N'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
ENTITY_CONTEXT	TokenNameIdentifier	 ENTITY  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"TITY"	TokenNameStringLiteral	TITY
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ENTITY_START	TokenNameIdentifier	 ENTITY  START
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'A'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
ATTLIST_CONTEXT	TokenNameIdentifier	 ATTLIST  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"TTLIST"	TokenNameStringLiteral	TTLIST
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ATTLIST_START	TokenNameIdentifier	 ATTLIST  START
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'N'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
NOTATION_CONTEXT	TokenNameIdentifier	 NOTATION  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"OTATION"	TokenNameStringLiteral	OTATION
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NOTATION_START	TokenNameIdentifier	 NOTATION  START
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reads a simple string, like the ones used for version, encoding, * public/system identifiers... * The current character must be the string delimiter. * @return type. */	TokenNameCOMMENT_JAVADOC	 Reads a simple string, like the ones used for version, encoding, public/system identifiers... The current character must be the string delimiter. @return type. 
protected	TokenNameprotected	
int	TokenNameint	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"unexpected.eof"	TokenNameStringLiteral	unexpected.eof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads a comment. '&lt;!-' must have been read. */	TokenNameCOMMENT_JAVADOC	 Reads a comment. '&lt;!-' must have been read. 
protected	TokenNameprotected	
int	TokenNameint	
readComment	TokenNameIdentifier	 read Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"malformed.comment"	TokenNameStringLiteral	malformed.comment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"unexpected.eof"	TokenNameStringLiteral	unexpected.eof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"malformed.comment"	TokenNameStringLiteral	malformed.comment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
COMMENT	TokenNameIdentifier	 COMMENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads the given identifier. * @param s The portion of the identifier to read. * @param type The lexical unit type of the identifier. * @param ntype The lexical unit type to set if the identifier do not * match or -1 if an error must be signaled. */	TokenNameCOMMENT_JAVADOC	 Reads the given identifier. @param s The portion of the identifier to read. @param type The lexical unit type of the identifier. @param ntype The lexical unit type to set if the identifier do not match or -1 if an error must be signaled. 
protected	TokenNameprotected	
int	TokenNameint	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
ntype	TokenNameIdentifier	 ntype
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ntype	TokenNameIdentifier	 ntype
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ntype	TokenNameIdentifier	 ntype
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads a name. The current character must be the first character. * @param type The lexical unit type to set. * @return type. */	TokenNameCOMMENT_JAVADOC	 Reads a name. The current character must be the first character. @param type The lexical unit type to set. @return type. 
protected	TokenNameprotected	
int	TokenNameint	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"unexpected.eof"	TokenNameStringLiteral	unexpected.eof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameFirstCharacter	TokenNameIdentifier	 is XML Name First Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.name"	TokenNameStringLiteral	invalid.name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads a processing instruction start. * @return type. */	TokenNameCOMMENT_JAVADOC	 Reads a processing instruction start. @return type. 
protected	TokenNameprotected	
int	TokenNameint	
readPIStart	TokenNameIdentifier	 read PI Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
int	TokenNameint	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"unexpected.eof"	TokenNameStringLiteral	unexpected.eof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameFirstCharacter	TokenNameIdentifier	 is XML Name First Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"malformed.pi.target"	TokenNameStringLiteral	malformed.pi.target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_START	TokenNameIdentifier	 PI  START
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
c3	TokenNameIdentifier	 c3
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c3	TokenNameIdentifier	 c3
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c3	TokenNameIdentifier	 c3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_START	TokenNameIdentifier	 PI  START
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
c4	TokenNameIdentifier	 c4
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c4	TokenNameIdentifier	 c4
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c4	TokenNameIdentifier	 c4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_START	TokenNameIdentifier	 PI  START
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
==	TokenNameEQUAL_EQUAL	
'x'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c1	TokenNameIdentifier	 c1
==	TokenNameEQUAL_EQUAL	
'X'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
==	TokenNameEQUAL_EQUAL	
'm'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c2	TokenNameIdentifier	 c2
==	TokenNameEQUAL_EQUAL	
'M'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c3	TokenNameIdentifier	 c3
==	TokenNameEQUAL_EQUAL	
'l'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c3	TokenNameIdentifier	 c3
==	TokenNameEQUAL_EQUAL	
'L'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"xml.reserved"	TokenNameStringLiteral	xml.reserved
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_START	TokenNameIdentifier	 PI  START
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next lexical unit in the context of a element declaration. */	TokenNameCOMMENT_JAVADOC	 Returns the next lexical unit in the context of a element declaration. 
protected	TokenNameprotected	
int	TokenNameint	
nextInElementDeclaration	TokenNameIdentifier	 next In Element Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
;	TokenNameSEMICOLON	
case	TokenNamecase	
'>'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
DTD_DECLARATIONS_CONTEXT	TokenNameIdentifier	 DTD  DECLARATIONS  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_CHAR	TokenNameIdentifier	 END  CHAR
;	TokenNameSEMICOLON	
case	TokenNamecase	
'%'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PARAMETER_ENTITY_REFERENCE	TokenNameIdentifier	 PARAMETER  ENTITY  REFERENCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"malformed.parameter.entity"	TokenNameStringLiteral	malformed.parameter.entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
case	TokenNamecase	
'E'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"MPTY"	TokenNameStringLiteral	MPTY
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EMPTY_IDENTIFIER	TokenNameIdentifier	 EMPTY  IDENTIFIER
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'A'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"NY"	TokenNameStringLiteral	NY
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ANY_IDENTIFIER	TokenNameIdentifier	 ANY  IDENTIFIER
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
QUESTION	TokenNameIdentifier	 QUESTION
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PLUS	TokenNameIdentifier	 PLUS
;	TokenNameSEMICOLON	
case	TokenNamecase	
'*'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STAR	TokenNameIdentifier	 STAR
;	TokenNameSEMICOLON	
case	TokenNamecase	
'('	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LEFT_BRACE	TokenNameIdentifier	 LEFT  BRACE
;	TokenNameSEMICOLON	
case	TokenNamecase	
')'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RIGHT_BRACE	TokenNameIdentifier	 RIGHT  BRACE
;	TokenNameSEMICOLON	
case	TokenNamecase	
'|'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PIPE	TokenNameIdentifier	 PIPE
;	TokenNameSEMICOLON	
case	TokenNamecase	
','	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
COMMA	TokenNameIdentifier	 COMMA
;	TokenNameSEMICOLON	
case	TokenNamecase	
'#'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"PCDATA"	TokenNameStringLiteral	PCDATA
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PCDATA_IDENTIFIER	TokenNameIdentifier	 PCDATA  IDENTIFIER
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next lexical unit in the context of an attribute list. */	TokenNameCOMMENT_JAVADOC	 Returns the next lexical unit in the context of an attribute list. 
protected	TokenNameprotected	
int	TokenNameint	
nextInAttList	TokenNameIdentifier	 next In Att List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
;	TokenNameSEMICOLON	
case	TokenNamecase	
'>'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
DTD_DECLARATIONS_CONTEXT	TokenNameIdentifier	 DTD  DECLARATIONS  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_CHAR	TokenNameIdentifier	 END  CHAR
;	TokenNameSEMICOLON	
case	TokenNamecase	
'%'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PARAMETER_ENTITY_REFERENCE	TokenNameIdentifier	 PARAMETER  ENTITY  REFERENCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"malformed.parameter.entity"	TokenNameStringLiteral	malformed.parameter.entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
case	TokenNamecase	
'C'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"DATA"	TokenNameStringLiteral	DATA
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CDATA_IDENTIFIER	TokenNameIdentifier	 CDATA  IDENTIFIER
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'I'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'D'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ID_IDENTIFIER	TokenNameIdentifier	 ID  IDENTIFIER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'R'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'E'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'F'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
IDREF_IDENTIFIER	TokenNameIdentifier	 IDREF  IDENTIFIER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'S'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
IDREFS_IDENTIFIER	TokenNameIdentifier	 IDREFS  IDENTIFIER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
case	TokenNamecase	
'N'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
case	TokenNamecase	
'O'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
NOTATION_TYPE_CONTEXT	TokenNameIdentifier	 NOTATION  TYPE  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"TATION"	TokenNameStringLiteral	TATION
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NOTATION_IDENTIFIER	TokenNameIdentifier	 NOTATION  IDENTIFIER
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'M'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'T'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'O'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'K'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'E'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'N'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NMTOKEN_IDENTIFIER	TokenNameIdentifier	 NMTOKEN  IDENTIFIER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'S'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NMTOKENS_IDENTIFIER	TokenNameIdentifier	 NMTOKENS  IDENTIFIER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'E'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'N'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'T'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'I'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'T'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'Y'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ENTITY_IDENTIFIER	TokenNameIdentifier	 ENTITY  IDENTIFIER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
case	TokenNamecase	
'I'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'E'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'S'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ENTITIES_IDENTIFIER	TokenNameIdentifier	 ENTITIES  IDENTIFIER
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
=	TokenNameEQUAL	
'"'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"unexpected.eof"	TokenNameStringLiteral	unexpected.eof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'"'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'"'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'&'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
ATTRIBUTE_VALUE_CONTEXT	TokenNameIdentifier	 ATTRIBUTE  VALUE  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIRST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 FIRST  ATTRIBUTE  FRAGMENT
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
=	TokenNameEQUAL	
'\''	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"unexpected.eof"	TokenNameStringLiteral	unexpected.eof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'\''	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'\''	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'&'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
ATTRIBUTE_VALUE_CONTEXT	TokenNameIdentifier	 ATTRIBUTE  VALUE  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIRST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 FIRST  ATTRIBUTE  FRAGMENT
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'#'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'R'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"EQUIRED"	TokenNameStringLiteral	EQUIRED
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
REQUIRED_IDENTIFIER	TokenNameIdentifier	 REQUIRED  IDENTIFIER
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'I'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"MPLIED"	TokenNameStringLiteral	MPLIED
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
IMPLIED_IDENTIFIER	TokenNameIdentifier	 IMPLIED  IDENTIFIER
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'F'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"IXED"	TokenNameStringLiteral	IXED
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIXED_IDENTIFIER	TokenNameIdentifier	 FIXED  IDENTIFIER
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'('	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
ENUMERATION_CONTEXT	TokenNameIdentifier	 ENUMERATION  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LEFT_BRACE	TokenNameIdentifier	 LEFT  BRACE
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next lexical unit in the context of a notation. */	TokenNameCOMMENT_JAVADOC	 Returns the next lexical unit in the context of a notation. 
protected	TokenNameprotected	
int	TokenNameint	
nextInNotation	TokenNameIdentifier	 next In Notation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
;	TokenNameSEMICOLON	
case	TokenNamecase	
'>'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
DTD_DECLARATIONS_CONTEXT	TokenNameIdentifier	 DTD  DECLARATIONS  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_CHAR	TokenNameIdentifier	 END  CHAR
;	TokenNameSEMICOLON	
case	TokenNamecase	
'%'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PARAMETER_ENTITY_REFERENCE	TokenNameIdentifier	 PARAMETER  ENTITY  REFERENCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"malformed.parameter.entity"	TokenNameStringLiteral	malformed.parameter.entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
case	TokenNamecase	
'S'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"YSTEM"	TokenNameStringLiteral	YSTEM
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
SYSTEM_IDENTIFIER	TokenNameIdentifier	 SYSTEM  IDENTIFIER
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'P'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"UBLIC"	TokenNameStringLiteral	UBLIC
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PUBLIC_IDENTIFIER	TokenNameIdentifier	 PUBLIC  IDENTIFIER
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
=	TokenNameEQUAL	
'"'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
=	TokenNameEQUAL	
'\''	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next lexical unit in the context of an entity. */	TokenNameCOMMENT_JAVADOC	 Returns the next lexical unit in the context of an entity. 
protected	TokenNameprotected	
int	TokenNameint	
nextInEntity	TokenNameIdentifier	 next In Entity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
;	TokenNameSEMICOLON	
case	TokenNamecase	
'>'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
DTD_DECLARATIONS_CONTEXT	TokenNameIdentifier	 DTD  DECLARATIONS  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_CHAR	TokenNameIdentifier	 END  CHAR
;	TokenNameSEMICOLON	
case	TokenNamecase	
'%'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PERCENT	TokenNameIdentifier	 PERCENT
;	TokenNameSEMICOLON	
case	TokenNamecase	
'S'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"YSTEM"	TokenNameStringLiteral	YSTEM
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
SYSTEM_IDENTIFIER	TokenNameIdentifier	 SYSTEM  IDENTIFIER
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'P'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"UBLIC"	TokenNameStringLiteral	UBLIC
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PUBLIC_IDENTIFIER	TokenNameIdentifier	 PUBLIC  IDENTIFIER
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'N'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readIdentifier	TokenNameIdentifier	 read Identifier
(	TokenNameLPAREN	
"DATA"	TokenNameStringLiteral	DATA
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NDATA_IDENTIFIER	TokenNameIdentifier	 NDATA  IDENTIFIER
,	TokenNameCOMMA	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
=	TokenNameEQUAL	
'"'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"unexpected.eof"	TokenNameStringLiteral	unexpected.eof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'"'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'&'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'"'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'&'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'&'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'%'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
ENTITY_VALUE_CONTEXT	TokenNameIdentifier	 ENTITY  VALUE  CONTEXT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIRST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 FIRST  ATTRIBUTE  FRAGMENT
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
=	TokenNameEQUAL	
'\''	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"unexpected.eof"	TokenNameStringLiteral	unexpected.eof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'\''	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'&'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'\''	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'&'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.character"	TokenNameStringLiteral	invalid.character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'&'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'%'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
ENTITY_VALUE_CONTEXT	TokenNameIdentifier	 ENTITY  VALUE  CONTEXT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIRST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 FIRST  ATTRIBUTE  FRAGMENT
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next lexical unit in the context of an entity value. */	TokenNameCOMMENT_JAVADOC	 Returns the next lexical unit in the context of an entity value. 
protected	TokenNameprotected	
int	TokenNameint	
nextInEntityValue	TokenNameIdentifier	 next In Entity Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'&'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
readReference	TokenNameIdentifier	 read Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'%'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PARAMETER_ENTITY_REFERENCE	TokenNameIdentifier	 PARAMETER  ENTITY  REFERENCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.parameter.entity"	TokenNameStringLiteral	invalid.parameter.entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
attrDelimiter	TokenNameIdentifier	 attr Delimiter
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'&'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"unexpected.eof"	TokenNameStringLiteral	unexpected.eof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
ENTITY_CONTEXT	TokenNameIdentifier	 ENTITY  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIRST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 FIRST  ATTRIBUTE  FRAGMENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next lexical unit in the context of a notation type. */	TokenNameCOMMENT_JAVADOC	 Returns the next lexical unit in the context of a notation type. 
protected	TokenNameprotected	
int	TokenNameint	
nextInNotationType	TokenNameIdentifier	 next In Notation Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
;	TokenNameSEMICOLON	
case	TokenNamecase	
'|'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PIPE	TokenNameIdentifier	 PIPE
;	TokenNameSEMICOLON	
case	TokenNamecase	
'('	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LEFT_BRACE	TokenNameIdentifier	 LEFT  BRACE
;	TokenNameSEMICOLON	
case	TokenNamecase	
')'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
ATTLIST_CONTEXT	TokenNameIdentifier	 ATTLIST  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RIGHT_BRACE	TokenNameIdentifier	 RIGHT  BRACE
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next lexical unit in the context of an enumeration. */	TokenNameCOMMENT_JAVADOC	 Returns the next lexical unit in the context of an enumeration. 
protected	TokenNameprotected	
int	TokenNameint	
nextInEnumeration	TokenNameIdentifier	 next In Enumeration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
;	TokenNameSEMICOLON	
case	TokenNamecase	
'|'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PIPE	TokenNameIdentifier	 PIPE
;	TokenNameSEMICOLON	
case	TokenNamecase	
')'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
ATTLIST_CONTEXT	TokenNameIdentifier	 ATTLIST  CONTEXT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RIGHT_BRACE	TokenNameIdentifier	 RIGHT  BRACE
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
readNmtoken	TokenNameIdentifier	 read Nmtoken
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reads an entity or character reference. The current character * must be '&amp;'. * @return type. */	TokenNameCOMMENT_JAVADOC	 Reads an entity or character reference. The current character must be '&amp;'. @return type. 
protected	TokenNameprotected	
int	TokenNameint	
readReference	TokenNameIdentifier	 read Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'x'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
<=	TokenNameLESS_EQUAL	
'f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
<=	TokenNameLESS_EQUAL	
'F'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"unexpected.eof"	TokenNameStringLiteral	unexpected.eof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"character.reference"	TokenNameStringLiteral	character.reference
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CHARACTER_REFERENCE	TokenNameIdentifier	 CHARACTER  REFERENCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
readName	TokenNameIdentifier	 read Name
(	TokenNameLPAREN	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ENTITY_REFERENCE	TokenNameIdentifier	 ENTITY  REFERENCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"character.reference"	TokenNameStringLiteral	character.reference
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reads a parameter entity reference. The current character must be '%'. * @return type. */	TokenNameCOMMENT_JAVADOC	 Reads a parameter entity reference. The current character must be '%'. @return type. 
protected	TokenNameprotected	
int	TokenNameint	
readPEReference	TokenNameIdentifier	 read PE Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"unexpected.eof"	TokenNameStringLiteral	unexpected.eof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameFirstCharacter	TokenNameIdentifier	 is XML Name First Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.parameter.entity"	TokenNameStringLiteral	invalid.parameter.entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"invalid.parameter.entity"	TokenNameStringLiteral	invalid.parameter.entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PARAMETER_ENTITY_REFERENCE	TokenNameIdentifier	 PARAMETER  ENTITY  REFERENCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads a Nmtoken. The current character must be the first character. * @return LexicalUnits.NMTOKEN. */	TokenNameCOMMENT_JAVADOC	 Reads a Nmtoken. The current character must be the first character. @return LexicalUnits.NMTOKEN. 
protected	TokenNameprotected	
int	TokenNameint	
readNmtoken	TokenNameIdentifier	 read Nmtoken
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
"unexpected.eof"	TokenNameStringLiteral	unexpected.eof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NMTOKEN	TokenNameIdentifier	 NMTOKEN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value of the current char to the next character or -1 if the * end of stream has been reached. */	TokenNameCOMMENT_JAVADOC	 Sets the value of the current char to the next character or -1 if the end of stream has been reached. 
protected	TokenNameprotected	
int	TokenNameint	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
position	TokenNameIdentifier	 position
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an XMLException initialized with the given message key. */	TokenNameCOMMENT_JAVADOC	 Returns an XMLException initialized with the given message key. 
protected	TokenNameprotected	
XMLException	TokenNameIdentifier	 XML Exception
createXMLException	TokenNameIdentifier	 create XML Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLException	TokenNameIdentifier	 XML Exception
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
