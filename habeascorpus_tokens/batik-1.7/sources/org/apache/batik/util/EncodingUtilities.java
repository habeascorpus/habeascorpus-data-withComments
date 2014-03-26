/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * This class contains utility functions to manage encodings. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: EncodingUtilities.java 478169 2006-11-22 14:23:24Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class contains utility functions to manage encodings. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: EncodingUtilities.java 478169 2006-11-22 14:23:24Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
EncodingUtilities	TokenNameIdentifier	 Encoding Utilities
{	TokenNameLBRACE	
/** * The standard to Java encoding table. */	TokenNameCOMMENT_JAVADOC	 The standard to Java encoding table. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
ENCODINGS	TokenNameIdentifier	 ENCODINGS
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
,	TokenNameCOMMA	
"UTF8"	TokenNameStringLiteral	UTF8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"UTF-16"	TokenNameStringLiteral	UTF-16
,	TokenNameCOMMA	
"Unicode"	TokenNameStringLiteral	Unicode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"US-ASCII"	TokenNameStringLiteral	US-ASCII
,	TokenNameCOMMA	
"ASCII"	TokenNameStringLiteral	ASCII
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-1"	TokenNameStringLiteral	ISO-8859-1
,	TokenNameCOMMA	
"8859_1"	TokenNameStringLiteral	8859_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-2"	TokenNameStringLiteral	ISO-8859-2
,	TokenNameCOMMA	
"8859_2"	TokenNameStringLiteral	8859_2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-3"	TokenNameStringLiteral	ISO-8859-3
,	TokenNameCOMMA	
"8859_3"	TokenNameStringLiteral	8859_3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-4"	TokenNameStringLiteral	ISO-8859-4
,	TokenNameCOMMA	
"8859_4"	TokenNameStringLiteral	8859_4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-5"	TokenNameStringLiteral	ISO-8859-5
,	TokenNameCOMMA	
"8859_5"	TokenNameStringLiteral	8859_5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-6"	TokenNameStringLiteral	ISO-8859-6
,	TokenNameCOMMA	
"8859_6"	TokenNameStringLiteral	8859_6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-7"	TokenNameStringLiteral	ISO-8859-7
,	TokenNameCOMMA	
"8859_7"	TokenNameStringLiteral	8859_7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-8"	TokenNameStringLiteral	ISO-8859-8
,	TokenNameCOMMA	
"8859_8"	TokenNameStringLiteral	8859_8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-9"	TokenNameStringLiteral	ISO-8859-9
,	TokenNameCOMMA	
"8859_9"	TokenNameStringLiteral	8859_9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-2022-JP"	TokenNameStringLiteral	ISO-2022-JP
,	TokenNameCOMMA	
"JIS"	TokenNameStringLiteral	JIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"WINDOWS-31J"	TokenNameStringLiteral	WINDOWS-31J
,	TokenNameCOMMA	
"MS932"	TokenNameStringLiteral	MS932
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EUC-JP"	TokenNameStringLiteral	EUC-JP
,	TokenNameCOMMA	
"EUCJIS"	TokenNameStringLiteral	EUCJIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"GB2312"	TokenNameStringLiteral	GB2312
,	TokenNameCOMMA	
"GB2312"	TokenNameStringLiteral	GB2312
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"BIG5"	TokenNameStringLiteral	BIG5
,	TokenNameCOMMA	
"Big5"	TokenNameStringLiteral	Big5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EUC-KR"	TokenNameStringLiteral	EUC-KR
,	TokenNameCOMMA	
"KSC5601"	TokenNameStringLiteral	KSC5601
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-2022-KR"	TokenNameStringLiteral	ISO-2022-KR
,	TokenNameCOMMA	
"ISO2022KR"	TokenNameStringLiteral	ISO2022KR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"KOI8-R"	TokenNameStringLiteral	KOI8-R
,	TokenNameCOMMA	
"KOI8_R"	TokenNameStringLiteral	KOI8_R
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-US"	TokenNameStringLiteral	EBCDIC-CP-US
,	TokenNameCOMMA	
"Cp037"	TokenNameStringLiteral	Cp037
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-CA"	TokenNameStringLiteral	EBCDIC-CP-CA
,	TokenNameCOMMA	
"Cp037"	TokenNameStringLiteral	Cp037
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-NL"	TokenNameStringLiteral	EBCDIC-CP-NL
,	TokenNameCOMMA	
"Cp037"	TokenNameStringLiteral	Cp037
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-WT"	TokenNameStringLiteral	EBCDIC-CP-WT
,	TokenNameCOMMA	
"Cp037"	TokenNameStringLiteral	Cp037
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-DK"	TokenNameStringLiteral	EBCDIC-CP-DK
,	TokenNameCOMMA	
"Cp277"	TokenNameStringLiteral	Cp277
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-NO"	TokenNameStringLiteral	EBCDIC-CP-NO
,	TokenNameCOMMA	
"Cp277"	TokenNameStringLiteral	Cp277
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-FI"	TokenNameStringLiteral	EBCDIC-CP-FI
,	TokenNameCOMMA	
"Cp278"	TokenNameStringLiteral	Cp278
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-SE"	TokenNameStringLiteral	EBCDIC-CP-SE
,	TokenNameCOMMA	
"Cp278"	TokenNameStringLiteral	Cp278
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-IT"	TokenNameStringLiteral	EBCDIC-CP-IT
,	TokenNameCOMMA	
"Cp280"	TokenNameStringLiteral	Cp280
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-ES"	TokenNameStringLiteral	EBCDIC-CP-ES
,	TokenNameCOMMA	
"Cp284"	TokenNameStringLiteral	Cp284
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-GB"	TokenNameStringLiteral	EBCDIC-CP-GB
,	TokenNameCOMMA	
"Cp285"	TokenNameStringLiteral	Cp285
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-FR"	TokenNameStringLiteral	EBCDIC-CP-FR
,	TokenNameCOMMA	
"Cp297"	TokenNameStringLiteral	Cp297
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-AR1"	TokenNameStringLiteral	EBCDIC-CP-AR1
,	TokenNameCOMMA	
"Cp420"	TokenNameStringLiteral	Cp420
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-HE"	TokenNameStringLiteral	EBCDIC-CP-HE
,	TokenNameCOMMA	
"Cp424"	TokenNameStringLiteral	Cp424
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-BE"	TokenNameStringLiteral	EBCDIC-CP-BE
,	TokenNameCOMMA	
"Cp500"	TokenNameStringLiteral	Cp500
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-CH"	TokenNameStringLiteral	EBCDIC-CP-CH
,	TokenNameCOMMA	
"Cp500"	TokenNameStringLiteral	Cp500
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-ROECE"	TokenNameStringLiteral	EBCDIC-CP-ROECE
,	TokenNameCOMMA	
"Cp870"	TokenNameStringLiteral	Cp870
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-YU"	TokenNameStringLiteral	EBCDIC-CP-YU
,	TokenNameCOMMA	
"Cp870"	TokenNameStringLiteral	Cp870
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-IS"	TokenNameStringLiteral	EBCDIC-CP-IS
,	TokenNameCOMMA	
"Cp871"	TokenNameStringLiteral	Cp871
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-AR2"	TokenNameStringLiteral	EBCDIC-CP-AR2
,	TokenNameCOMMA	
"Cp918"	TokenNameStringLiteral	Cp918
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP1252"	TokenNameStringLiteral	CP1252
,	TokenNameCOMMA	
"Cp1252"	TokenNameStringLiteral	Cp1252
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class does not need to be instantiated. */	TokenNameCOMMENT_JAVADOC	 This class does not need to be instantiated. 
protected	TokenNameprotected	
EncodingUtilities	TokenNameIdentifier	 Encoding Utilities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns the Java encoding string mapped with the given standard * encoding string. * @return null if no mapping was found. */	TokenNameCOMMENT_JAVADOC	 Returns the Java encoding string mapped with the given standard encoding string. @return null if no mapping was found. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
javaEncoding	TokenNameIdentifier	 java Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
ENCODINGS	TokenNameIdentifier	 ENCODINGS
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
