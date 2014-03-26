/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
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
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EncodingMap	TokenNameIdentifier	 Encoding Map
;	TokenNameSEMICOLON	
/** * Provides information about encodings. Depends on the Java runtime * to provides writers for the different encodings, but can be used * to override encoding names and provide the last printable character * for each encoding. * * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended * that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation * API for XML (TrAX) for serializing XML. See the Xerces documentation for more * information. * @version $Id: Encodings.java 476047 2006-11-17 04:27:45Z mrglavas $ * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> */	TokenNameCOMMENT_JAVADOC	 Provides information about encodings. Depends on the Java runtime to provides writers for the different encodings, but can be used to override encoding names and provide the last printable character for each encoding. * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation API for XML (TrAX) for serializing XML. See the Xerces documentation for more information. @version $Id: Encodings.java 476047 2006-11-17 04:27:45Z mrglavas $ @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> 
public	TokenNamepublic	
class	TokenNameclass	
Encodings	TokenNameIdentifier	 Encodings
{	TokenNameLBRACE	
/** * The last printable character for unknown encodings. */	TokenNameCOMMENT_JAVADOC	 The last printable character for unknown encodings. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_LAST_PRINTABLE	TokenNameIdentifier	 DEFAULT  LAST  PRINTABLE
=	TokenNameEQUAL	
0x7F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// last printable character for Unicode-compatible encodings 	TokenNameCOMMENT_LINE	last printable character for Unicode-compatible encodings 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LAST_PRINTABLE_UNICODE	TokenNameIdentifier	 LAST  PRINTABLE  UNICODE
=	TokenNameEQUAL	
0xffff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// unicode-compliant encodings; can express plane 0 	TokenNameCOMMENT_LINE	unicode-compliant encodings; can express plane 0 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
UNICODE_ENCODINGS	TokenNameIdentifier	 UNICODE  ENCODINGS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"Unicode"	TokenNameStringLiteral	Unicode
,	TokenNameCOMMA	
"UnicodeBig"	TokenNameStringLiteral	UnicodeBig
,	TokenNameCOMMA	
"UnicodeLittle"	TokenNameStringLiteral	UnicodeLittle
,	TokenNameCOMMA	
"GB2312"	TokenNameStringLiteral	GB2312
,	TokenNameCOMMA	
"UTF8"	TokenNameStringLiteral	UTF8
,	TokenNameCOMMA	
"UTF-16"	TokenNameStringLiteral	UTF-16
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// default (Java) encoding if none supplied: 	TokenNameCOMMENT_LINE	default (Java) encoding if none supplied: 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_ENCODING	TokenNameIdentifier	 DEFAULT  ENCODING
=	TokenNameEQUAL	
"UTF8"	TokenNameStringLiteral	UTF8
;	TokenNameSEMICOLON	
// note that the size of this Hashtable 	TokenNameCOMMENT_LINE	note that the size of this Hashtable 
// is bounded by the number of encodings recognized by EncodingMap; 	TokenNameCOMMENT_LINE	is bounded by the number of encodings recognized by EncodingMap; 
// therefore it poses no static mutability risk. 	TokenNameCOMMENT_LINE	therefore it poses no static mutability risk. 
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
_encodings	TokenNameIdentifier	 encodings
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @param encoding a MIME charset name, or null. */	TokenNameCOMMENT_JAVADOC	 @param encoding a MIME charset name, or null. 
static	TokenNamestatic	
EncodingInfo	TokenNameIdentifier	 Encoding Info
getEncodingInfo	TokenNameIdentifier	 get Encoding Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
boolean	TokenNameboolean	
allowJavaNames	TokenNameIdentifier	 allow Java Names
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
{	TokenNameLBRACE	
EncodingInfo	TokenNameIdentifier	 Encoding Info
eInfo	TokenNameIdentifier	 e Info
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
eInfo	TokenNameIdentifier	 e Info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EncodingInfo	TokenNameIdentifier	 Encoding Info
)	TokenNameRPAREN	
_encodings	TokenNameIdentifier	 encodings
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
DEFAULT_ENCODING	TokenNameIdentifier	 DEFAULT  ENCODING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
eInfo	TokenNameIdentifier	 e Info
;	TokenNameSEMICOLON	
eInfo	TokenNameIdentifier	 e Info
=	TokenNameEQUAL	
new	TokenNamenew	
EncodingInfo	TokenNameIdentifier	 Encoding Info
(	TokenNameLPAREN	
EncodingMap	TokenNameIdentifier	 Encoding Map
.	TokenNameDOT	
getJava2IANAMapping	TokenNameIdentifier	 get Java2 IANA Mapping
(	TokenNameLPAREN	
DEFAULT_ENCODING	TokenNameIdentifier	 DEFAULT  ENCODING
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DEFAULT_ENCODING	TokenNameIdentifier	 DEFAULT  ENCODING
,	TokenNameCOMMA	
LAST_PRINTABLE_UNICODE	TokenNameIdentifier	 LAST  PRINTABLE  UNICODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_encodings	TokenNameIdentifier	 encodings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DEFAULT_ENCODING	TokenNameIdentifier	 DEFAULT  ENCODING
,	TokenNameCOMMA	
eInfo	TokenNameIdentifier	 e Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
eInfo	TokenNameIdentifier	 e Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// need to convert it to upper case: 	TokenNameCOMMENT_LINE	need to convert it to upper case: 
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
jName	TokenNameIdentifier	 j Name
=	TokenNameEQUAL	
EncodingMap	TokenNameIdentifier	 Encoding Map
.	TokenNameDOT	
getIANA2JavaMapping	TokenNameIdentifier	 get IAN A2 Java Mapping
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
jName	TokenNameIdentifier	 j Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// see if the encoding passed in is a Java encoding name. 	TokenNameCOMMENT_LINE	see if the encoding passed in is a Java encoding name. 
if	TokenNameif	
(	TokenNameLPAREN	
allowJavaNames	TokenNameIdentifier	 allow Java Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EncodingInfo	TokenNameIdentifier	 Encoding Info
.	TokenNameDOT	
testJavaEncodingName	TokenNameIdentifier	 test Java Encoding Name
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
eInfo	TokenNameIdentifier	 e Info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EncodingInfo	TokenNameIdentifier	 Encoding Info
)	TokenNameRPAREN	
_encodings	TokenNameIdentifier	 encodings
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
eInfo	TokenNameIdentifier	 e Info
;	TokenNameSEMICOLON	
// is it known to be unicode-compliant? 	TokenNameCOMMENT_LINE	is it known to be unicode-compliant? 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
UNICODE_ENCODINGS	TokenNameIdentifier	 UNICODE  ENCODINGS
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
UNICODE_ENCODINGS	TokenNameIdentifier	 UNICODE  ENCODINGS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eInfo	TokenNameIdentifier	 e Info
=	TokenNameEQUAL	
new	TokenNamenew	
EncodingInfo	TokenNameIdentifier	 Encoding Info
(	TokenNameLPAREN	
EncodingMap	TokenNameIdentifier	 Encoding Map
.	TokenNameDOT	
getJava2IANAMapping	TokenNameIdentifier	 get Java2 IANA Mapping
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
LAST_PRINTABLE_UNICODE	TokenNameIdentifier	 LAST  PRINTABLE  UNICODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
UNICODE_ENCODINGS	TokenNameIdentifier	 UNICODE  ENCODINGS
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eInfo	TokenNameIdentifier	 e Info
=	TokenNameEQUAL	
new	TokenNamenew	
EncodingInfo	TokenNameIdentifier	 Encoding Info
(	TokenNameLPAREN	
EncodingMap	TokenNameIdentifier	 Encoding Map
.	TokenNameDOT	
getJava2IANAMapping	TokenNameIdentifier	 get Java2 IANA Mapping
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
DEFAULT_LAST_PRINTABLE	TokenNameIdentifier	 DEFAULT  LAST  PRINTABLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_encodings	TokenNameIdentifier	 encodings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
eInfo	TokenNameIdentifier	 e Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
eInfo	TokenNameIdentifier	 e Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
eInfo	TokenNameIdentifier	 e Info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EncodingInfo	TokenNameIdentifier	 Encoding Info
)	TokenNameRPAREN	
_encodings	TokenNameIdentifier	 encodings
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
jName	TokenNameIdentifier	 j Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
eInfo	TokenNameIdentifier	 e Info
;	TokenNameSEMICOLON	
// have to create one... 	TokenNameCOMMENT_LINE	have to create one... 
// is it known to be unicode-compliant? 	TokenNameCOMMENT_LINE	is it known to be unicode-compliant? 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
UNICODE_ENCODINGS	TokenNameIdentifier	 UNICODE  ENCODINGS
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
UNICODE_ENCODINGS	TokenNameIdentifier	 UNICODE  ENCODINGS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
jName	TokenNameIdentifier	 j Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eInfo	TokenNameIdentifier	 e Info
=	TokenNameEQUAL	
new	TokenNamenew	
EncodingInfo	TokenNameIdentifier	 Encoding Info
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
jName	TokenNameIdentifier	 j Name
,	TokenNameCOMMA	
LAST_PRINTABLE_UNICODE	TokenNameIdentifier	 LAST  PRINTABLE  UNICODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
UNICODE_ENCODINGS	TokenNameIdentifier	 UNICODE  ENCODINGS
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eInfo	TokenNameIdentifier	 e Info
=	TokenNameEQUAL	
new	TokenNamenew	
EncodingInfo	TokenNameIdentifier	 Encoding Info
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
jName	TokenNameIdentifier	 j Name
,	TokenNameCOMMA	
DEFAULT_LAST_PRINTABLE	TokenNameIdentifier	 DEFAULT  LAST  PRINTABLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_encodings	TokenNameIdentifier	 encodings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
jName	TokenNameIdentifier	 j Name
,	TokenNameCOMMA	
eInfo	TokenNameIdentifier	 e Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
eInfo	TokenNameIdentifier	 e Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JIS_DANGER_CHARS	TokenNameIdentifier	 JIS  DANGER  CHARS
=	TokenNameEQUAL	
"\~ขฃดย"	TokenNameStringLiteral	\~ขฃดย
+	TokenNamePLUS	
"ั??ษ?????"	TokenNameStringLiteral	ั??ษ?????
+	TokenNamePLUS	
"??????"	TokenNameStringLiteral	??????
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
