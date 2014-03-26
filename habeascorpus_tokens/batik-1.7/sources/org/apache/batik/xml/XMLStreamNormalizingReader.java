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
PushbackInputStream	TokenNameIdentifier	 Pushback Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
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
UTF16Decoder	TokenNameIdentifier	 UT F16 Decoder
;	TokenNameSEMICOLON	
/** * This class represents a normalizing reader with encoding detection * management. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: XMLStreamNormalizingReader.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a normalizing reader with encoding detection management. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: XMLStreamNormalizingReader.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLStreamNormalizingReader	TokenNameIdentifier	 XML Stream Normalizing Reader
extends	TokenNameextends	
StreamNormalizingReader	TokenNameIdentifier	 Stream Normalizing Reader
{	TokenNameLBRACE	
/** * Creates a new XMLStreamNormalizingReader. * @param is The input stream to read. * @param encod The character encoding to use if the auto-detection fail. */	TokenNameCOMMENT_JAVADOC	 Creates a new XMLStreamNormalizingReader. @param is The input stream to read. @param encod The character encoding to use if the auto-detection fail. 
public	TokenNamepublic	
XMLStreamNormalizingReader	TokenNameIdentifier	 XML Stream Normalizing Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encod	TokenNameIdentifier	 encod
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
PushbackInputStream	TokenNameIdentifier	 Pushback Input Stream
pbis	TokenNameIdentifier	 pbis
=	TokenNameEQUAL	
new	TokenNamenew	
PushbackInputStream	TokenNameIdentifier	 Pushback Input Stream
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
pbis	TokenNameIdentifier	 pbis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pbis	TokenNameIdentifier	 pbis
.	TokenNameDOT	
unread	TokenNameIdentifier	 unread
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0x003c	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0x0000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0x003f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charDecoder	TokenNameIdentifier	 char Decoder
=	TokenNameEQUAL	
new	TokenNamenew	
UTF16Decoder	TokenNameIdentifier	 UT F16 Decoder
(	TokenNameLPAREN	
pbis	TokenNameIdentifier	 pbis
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0x003f	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0x0000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charDecoder	TokenNameIdentifier	 char Decoder
=	TokenNameEQUAL	
new	TokenNamenew	
UTF16Decoder	TokenNameIdentifier	 UT F16 Decoder
(	TokenNameLPAREN	
pbis	TokenNameIdentifier	 pbis
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'x'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'm'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
createXMLDeclarationReader	TokenNameIdentifier	 create XML Declaration Reader
(	TokenNameLPAREN	
pbis	TokenNameIdentifier	 pbis
,	TokenNameCOMMA	
"UTF8"	TokenNameStringLiteral	UTF8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
enc	TokenNameIdentifier	 enc
=	TokenNameEQUAL	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
getXMLDeclarationEncoding	TokenNameIdentifier	 get XML Declaration Encoding
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charDecoder	TokenNameIdentifier	 char Decoder
=	TokenNameEQUAL	
createCharDecoder	TokenNameIdentifier	 create Char Decoder
(	TokenNameLPAREN	
pbis	TokenNameIdentifier	 pbis
,	TokenNameCOMMA	
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
0x004C	TokenNameIntegerLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0x006f	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0x00a7	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0x0094	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
createXMLDeclarationReader	TokenNameIdentifier	 create XML Declaration Reader
(	TokenNameLPAREN	
pbis	TokenNameIdentifier	 pbis
,	TokenNameCOMMA	
"CP037"	TokenNameStringLiteral	CP037
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
enc	TokenNameIdentifier	 enc
=	TokenNameEQUAL	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
getXMLDeclarationEncoding	TokenNameIdentifier	 get XML Declaration Encoding
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
"EBCDIC-CP-US"	TokenNameStringLiteral	EBCDIC-CP-US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charDecoder	TokenNameIdentifier	 char Decoder
=	TokenNameEQUAL	
createCharDecoder	TokenNameIdentifier	 create Char Decoder
(	TokenNameLPAREN	
pbis	TokenNameIdentifier	 pbis
,	TokenNameCOMMA	
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
0x00FE	TokenNameIntegerLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0x00FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charDecoder	TokenNameIdentifier	 char Decoder
=	TokenNameEQUAL	
createCharDecoder	TokenNameIdentifier	 create Char Decoder
(	TokenNameLPAREN	
pbis	TokenNameIdentifier	 pbis
,	TokenNameCOMMA	
"UTF-16"	TokenNameStringLiteral	UTF-16
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
0x00FF	TokenNameIntegerLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0x00FE	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charDecoder	TokenNameIdentifier	 char Decoder
=	TokenNameEQUAL	
createCharDecoder	TokenNameIdentifier	 create Char Decoder
(	TokenNameLPAREN	
pbis	TokenNameIdentifier	 pbis
,	TokenNameCOMMA	
"UTF-16"	TokenNameStringLiteral	UTF-16
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
encod	TokenNameIdentifier	 encod
=	TokenNameEQUAL	
(	TokenNameLPAREN	
encod	TokenNameIdentifier	 encod
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"UTF-8"	TokenNameStringLiteral	UTF-8
:	TokenNameCOLON	
encod	TokenNameIdentifier	 encod
;	TokenNameSEMICOLON	
charDecoder	TokenNameIdentifier	 char Decoder
=	TokenNameEQUAL	
createCharDecoder	TokenNameIdentifier	 create Char Decoder
(	TokenNameLPAREN	
pbis	TokenNameIdentifier	 pbis
,	TokenNameCOMMA	
encod	TokenNameIdentifier	 encod
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
