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
io	TokenNameIdentifier	 io
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
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
/** * <p>A UTF-8 reader.</p> * * @xerces.internal * * @author Andy Clark, IBM * * @version $Id: UTF8Reader.java 718095 2008-11-16 20:00:14Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>A UTF-8 reader.</p> * @xerces.internal * @author Andy Clark, IBM * @version $Id: UTF8Reader.java 718095 2008-11-16 20:00:14Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
UTF8Reader	TokenNameIdentifier	 UT F8 Reader
extends	TokenNameextends	
Reader	TokenNameIdentifier	 Reader
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Default byte buffer size (2048). */	TokenNameCOMMENT_JAVADOC	 Default byte buffer size (2048). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
=	TokenNameEQUAL	
2048	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// debugging 	TokenNameCOMMENT_LINE	debugging 
/** Debug read. */	TokenNameCOMMENT_JAVADOC	 Debug read. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_READ	TokenNameIdentifier	 DEBUG  READ
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Input stream. */	TokenNameCOMMENT_JAVADOC	 Input stream. 
protected	TokenNameprotected	
final	TokenNamefinal	
InputStream	TokenNameIdentifier	 Input Stream
fInputStream	TokenNameIdentifier	 f Input Stream
;	TokenNameSEMICOLON	
/** Byte buffer. */	TokenNameCOMMENT_JAVADOC	 Byte buffer. 
protected	TokenNameprotected	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fBuffer	TokenNameIdentifier	 f Buffer
;	TokenNameSEMICOLON	
/** Offset into buffer. */	TokenNameCOMMENT_JAVADOC	 Offset into buffer. 
protected	TokenNameprotected	
int	TokenNameint	
fOffset	TokenNameIdentifier	 f Offset
;	TokenNameSEMICOLON	
/** Surrogate character. */	TokenNameCOMMENT_JAVADOC	 Surrogate character. 
private	TokenNameprivate	
int	TokenNameint	
fSurrogate	TokenNameIdentifier	 f Surrogate
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// message formatter; used to produce localized 	TokenNameCOMMENT_LINE	message formatter; used to produce localized 
// exception messages 	TokenNameCOMMENT_LINE	exception messages 
private	TokenNameprivate	
final	TokenNamefinal	
MessageFormatter	TokenNameIdentifier	 Message Formatter
fFormatter	TokenNameIdentifier	 f Formatter
;	TokenNameSEMICOLON	
//Locale to use for messages 	TokenNameCOMMENT_LINE	Locale to use for messages 
private	TokenNameprivate	
final	TokenNamefinal	
Locale	TokenNameIdentifier	 Locale
fLocale	TokenNameIdentifier	 f Locale
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a UTF-8 reader from the specified input stream * using the default buffer size. Primarily for testing. * * @param inputStream The input stream. */	TokenNameCOMMENT_JAVADOC	 Constructs a UTF-8 reader from the specified input stream using the default buffer size. Primarily for testing. * @param inputStream The input stream. 
public	TokenNamepublic	
UTF8Reader	TokenNameIdentifier	 UT F8 Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
,	TokenNameCOMMA	
new	TokenNamenew	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(InputStream, MessageFormatter) 	TokenNameCOMMENT_LINE	<init>(InputStream, MessageFormatter) 
/** * Constructs a UTF-8 reader from the specified input stream * using the default buffer size and the given MessageFormatter. * * @param inputStream The input stream. * @param messageFormatter given MessageFormatter * @param locale Locale to use for messages */	TokenNameCOMMENT_JAVADOC	 Constructs a UTF-8 reader from the specified input stream using the default buffer size and the given MessageFormatter. * @param inputStream The input stream. @param messageFormatter given MessageFormatter @param locale Locale to use for messages 
public	TokenNamepublic	
UTF8Reader	TokenNameIdentifier	 UT F8 Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
MessageFormatter	TokenNameIdentifier	 Message Formatter
messageFormatter	TokenNameIdentifier	 message Formatter
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
,	TokenNameCOMMA	
messageFormatter	TokenNameIdentifier	 message Formatter
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(InputStream, MessageFormatter, Locale) 	TokenNameCOMMENT_LINE	<init>(InputStream, MessageFormatter, Locale) 
/** * Constructs a UTF-8 reader from the specified input stream, * buffer size and MessageFormatter. * * @param inputStream The input stream. * @param size The initial buffer size. * @param messageFormatter the formatter for localizing/formatting errors. * @param locale the Locale to use for messages */	TokenNameCOMMENT_JAVADOC	 Constructs a UTF-8 reader from the specified input stream, buffer size and MessageFormatter. * @param inputStream The input stream. @param size The initial buffer size. @param messageFormatter the formatter for localizing/formatting errors. @param locale the Locale to use for messages 
public	TokenNamepublic	
UTF8Reader	TokenNameIdentifier	 UT F8 Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
MessageFormatter	TokenNameIdentifier	 Message Formatter
messageFormatter	TokenNameIdentifier	 message Formatter
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
messageFormatter	TokenNameIdentifier	 message Formatter
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(InputStream, int, MessageFormatter, Locale) 	TokenNameCOMMENT_LINE	<init>(InputStream, int, MessageFormatter, Locale) 
/** * Constructs a UTF-8 reader from the specified input stream, * buffer and MessageFormatter. * * @param inputStream The input stream. * @param buffer The byte buffer. * @param messageFormatter the formatter for localizing/formatting errors. * @param locale the Locale to use for messages */	TokenNameCOMMENT_JAVADOC	 Constructs a UTF-8 reader from the specified input stream, buffer and MessageFormatter. * @param inputStream The input stream. @param buffer The byte buffer. @param messageFormatter the formatter for localizing/formatting errors. @param locale the Locale to use for messages 
public	TokenNamepublic	
UTF8Reader	TokenNameIdentifier	 UT F8 Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
MessageFormatter	TokenNameIdentifier	 Message Formatter
messageFormatter	TokenNameIdentifier	 message Formatter
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fInputStream	TokenNameIdentifier	 f Input Stream
=	TokenNameEQUAL	
inputStream	TokenNameIdentifier	 input Stream
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
fFormatter	TokenNameIdentifier	 f Formatter
=	TokenNameEQUAL	
messageFormatter	TokenNameIdentifier	 message Formatter
;	TokenNameSEMICOLON	
fLocale	TokenNameIdentifier	 f Locale
=	TokenNameEQUAL	
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(InputStream, byte[], MessageFormatter, Locale) 	TokenNameCOMMENT_LINE	<init>(InputStream, byte[], MessageFormatter, Locale) 
// 	TokenNameCOMMENT_LINE	 
// Reader methods 	TokenNameCOMMENT_LINE	Reader methods 
// 	TokenNameCOMMENT_LINE	 
/** * Read a single character. This method will block until a character is * available, an I/O error occurs, or the end of the stream is reached. * * <p> Subclasses that intend to support efficient single-character input * should override this method. * * @return The character read, as an integer in the range 0 to 16383 * (<tt>0x00-0xffff</tt>), or -1 if the end of the stream has * been reached * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Read a single character. This method will block until a character is available, an I/O error occurs, or the end of the stream is reached. * <p> Subclasses that intend to support efficient single-character input should override this method. * @return The character read, as an integer in the range 0 to 16383 (<tt>0x00-0xffff</tt>), or -1 if the end of the stream has been reached * @exception IOException If an I/O error occurs 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// decode character 	TokenNameCOMMENT_LINE	decode character 
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fSurrogate	TokenNameIdentifier	 f Surrogate
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fSurrogate	TokenNameIdentifier	 f Surrogate
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NOTE: We use the index into the buffer if there are remaining 	TokenNameCOMMENT_LINE	NOTE: We use the index into the buffer if there are remaining 
// bytes from the last block read. -Ac 	TokenNameCOMMENT_LINE	bytes from the last block read. -Ac 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// get first byte 	TokenNameCOMMENT_LINE	get first byte 
int	TokenNameint	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
fOffset	TokenNameIdentifier	 f Offset
?	TokenNameQUESTION	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// UTF-8: [0xxx xxxx] 	TokenNameCOMMENT_LINE	UTF-8: [0xxx xxxx] 
// Unicode: [0000 0000] [0xxx xxxx] 	TokenNameCOMMENT_LINE	Unicode: [0000 0000] [0xxx xxxx] 
if	TokenNameif	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
b0	TokenNameIdentifier	 b0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// UTF-8: [110y yyyy] [10xx xxxx] 	TokenNameCOMMENT_LINE	UTF-8: [110y yyyy] [10xx xxxx] 
// Unicode: [0000 0yyy] [yyxx xxxx] 	TokenNameCOMMENT_LINE	Unicode: [0000 0yyy] [yyxx xxxx] 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
&	TokenNameAND	
0xE0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0xC0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
&	TokenNameAND	
0x1E	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
fOffset	TokenNameIdentifier	 f Offset
?	TokenNameQUESTION	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectedByte	TokenNameIdentifier	 expected Byte
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
0xC0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invalidByte	TokenNameIdentifier	 invalid Byte
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x07C0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
0x003F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// UTF-8: [1110 zzzz] [10yy yyyy] [10xx xxxx] 	TokenNameCOMMENT_LINE	UTF-8: [1110 zzzz] [10yy yyyy] [10xx xxxx] 
// Unicode: [zzzz yyyy] [yyxx xxxx] 	TokenNameCOMMENT_LINE	Unicode: [zzzz yyyy] [yyxx xxxx] 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
&	TokenNameAND	
0xF0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0xE0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
fOffset	TokenNameIdentifier	 f Offset
?	TokenNameQUESTION	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectedByte	TokenNameIdentifier	 expected Byte
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
0xC0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x80	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
==	TokenNameEQUAL_EQUAL	
0xED	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
b1	TokenNameIdentifier	 b1
>=	TokenNameGREATER_EQUAL	
0xA0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
&	TokenNameAND	
0x0F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
0x20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invalidByte	TokenNameIdentifier	 invalid Byte
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
fOffset	TokenNameIdentifier	 f Offset
?	TokenNameQUESTION	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectedByte	TokenNameIdentifier	 expected Byte
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
&	TokenNameAND	
0xC0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invalidByte	TokenNameIdentifier	 invalid Byte
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
<<	TokenNameLEFT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xF000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0FC0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
&	TokenNameAND	
0x003F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// UTF-8: [1111 0uuu] [10uu zzzz] [10yy yyyy] [10xx xxxx]* 	TokenNameCOMMENT_LINE	UTF-8: [1111 0uuu] [10uu zzzz] [10yy yyyy] [10xx xxxx]* 
// Unicode: [1101 10ww] [wwzz zzyy] (high surrogate) 	TokenNameCOMMENT_LINE	Unicode: [1101 10ww] [wwzz zzyy] (high surrogate) 
// [1101 11yy] [yyxx xxxx] (low surrogate) 	TokenNameCOMMENT_LINE	[1101 11yy] [yyxx xxxx] (low surrogate) 
// * uuuuu = wwww + 1 	TokenNameCOMMENT_LINE	* uuuuu = wwww + 1 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
&	TokenNameAND	
0xF8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0xF0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
fOffset	TokenNameIdentifier	 f Offset
?	TokenNameQUESTION	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectedByte	TokenNameIdentifier	 expected Byte
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
0xC0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x80	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
0x30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
&	TokenNameAND	
0x07	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invalidByte	TokenNameIdentifier	 invalid Byte
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
fOffset	TokenNameIdentifier	 f Offset
?	TokenNameQUESTION	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectedByte	TokenNameIdentifier	 expected Byte
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
&	TokenNameAND	
0xC0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invalidByte	TokenNameIdentifier	 invalid Byte
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
b3	TokenNameIdentifier	 b3
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
fOffset	TokenNameIdentifier	 f Offset
?	TokenNameQUESTION	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectedByte	TokenNameIdentifier	 expected Byte
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
&	TokenNameAND	
0xC0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invalidByte	TokenNameIdentifier	 invalid Byte
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b3	TokenNameIdentifier	 b3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
uuuuu	TokenNameIdentifier	 uuuuu
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x001C	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0003	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uuuuu	TokenNameIdentifier	 uuuuu
>	TokenNameGREATER	
0x10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invalidSurrogate	TokenNameIdentifier	 invalid Surrogate
(	TokenNameLPAREN	
uuuuu	TokenNameIdentifier	 uuuuu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
wwww	TokenNameIdentifier	 wwww
=	TokenNameEQUAL	
uuuuu	TokenNameIdentifier	 uuuuu
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
hs	TokenNameIdentifier	 hs
=	TokenNameEQUAL	
0xD800	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
wwww	TokenNameIdentifier	 wwww
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x03C0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x003C	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0003	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ls	TokenNameIdentifier	 ls
=	TokenNameEQUAL	
0xDC00	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x03C0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
&	TokenNameAND	
0x003F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
hs	TokenNameIdentifier	 hs
;	TokenNameSEMICOLON	
fSurrogate	TokenNameIdentifier	 f Surrogate
=	TokenNameEQUAL	
ls	TokenNameIdentifier	 ls
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// error 	TokenNameCOMMENT_LINE	error 
else	TokenNameelse	
{	TokenNameLBRACE	
invalidByte	TokenNameIdentifier	 invalid Byte
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// use surrogate 	TokenNameCOMMENT_LINE	use surrogate 
else	TokenNameelse	
{	TokenNameLBRACE	
fSurrogate	TokenNameIdentifier	 f Surrogate
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return character 	TokenNameCOMMENT_LINE	return character 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_READ	TokenNameIdentifier	 DEBUG  READ
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"read(): 0x"	TokenNameStringLiteral	read(): 0x
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// read():int 	TokenNameCOMMENT_LINE	read():int 
/** * Read characters into a portion of an array. This method will block * until some input is available, an I/O error occurs, or the end of the * stream is reached. * * @param ch Destination buffer * @param offset Offset at which to start storing characters * @param length Maximum number of characters to read * * @return The number of characters read, or -1 if the end of the * stream has been reached * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Read characters into a portion of an array. This method will block until some input is available, an I/O error occurs, or the end of the stream is reached. * @param ch Destination buffer @param offset Offset at which to start storing characters @param length Maximum number of characters to read * @return The number of characters read, or -1 if the end of the stream has been reached * @exception IOException If an I/O error occurs 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// read bytes 	TokenNameCOMMENT_LINE	read bytes 
int	TokenNameint	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fOffset	TokenNameIdentifier	 f Offset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// adjust length to read 	TokenNameCOMMENT_LINE	adjust length to read 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
fBuffer	TokenNameIdentifier	 f Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// handle surrogate 	TokenNameCOMMENT_LINE	handle surrogate 
if	TokenNameif	
(	TokenNameLPAREN	
fSurrogate	TokenNameIdentifier	 f Surrogate
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
out	TokenNameIdentifier	 out
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
fSurrogate	TokenNameIdentifier	 f Surrogate
;	TokenNameSEMICOLON	
fSurrogate	TokenNameIdentifier	 f Surrogate
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// perform read operation 	TokenNameCOMMENT_LINE	perform read operation 
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
fBuffer	TokenNameIdentifier	 f Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
out	TokenNameIdentifier	 out
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skip read; last character was in error 	TokenNameCOMMENT_LINE	skip read; last character was in error 
// NOTE: Having an offset value other than zero means that there was 	TokenNameCOMMENT_LINE	NOTE: Having an offset value other than zero means that there was 
// an error in the last character read. In this case, we have 	TokenNameCOMMENT_LINE	an error in the last character read. In this case, we have 
// skipped the read so we don't consume any bytes past the 	TokenNameCOMMENT_LINE	skipped the read so we don't consume any bytes past the 
// error. By signalling the error on the next block read we 	TokenNameCOMMENT_LINE	error. By signalling the error on the next block read we 
// allow the method to return the most valid characters that 	TokenNameCOMMENT_LINE	allow the method to return the most valid characters that 
// it can on the previous block read. -Ac 	TokenNameCOMMENT_LINE	it can on the previous block read. -Ac 
else	TokenNameelse	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
fOffset	TokenNameIdentifier	 f Offset
;	TokenNameSEMICOLON	
fOffset	TokenNameIdentifier	 f Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// convert bytes to characters 	TokenNameCOMMENT_LINE	convert bytes to characters 
final	TokenNamefinal	
int	TokenNameint	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
int	TokenNameint	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
byte1	TokenNameIdentifier	 byte1
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
byte0	TokenNameIdentifier	 byte0
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
<	TokenNameLESS	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte1	TokenNameIdentifier	 byte1
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
in	TokenNameIdentifier	 in
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
byte1	TokenNameIdentifier	 byte1
>=	TokenNameGREATER_EQUAL	
byte0	TokenNameIdentifier	 byte0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
out	TokenNameIdentifier	 out
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
byte1	TokenNameIdentifier	 byte1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
<	TokenNameLESS	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte1	TokenNameIdentifier	 byte1
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
in	TokenNameIdentifier	 in
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// UTF-8: [0xxx xxxx] 	TokenNameCOMMENT_LINE	UTF-8: [0xxx xxxx] 
// Unicode: [0000 0000] [0xxx xxxx] 	TokenNameCOMMENT_LINE	Unicode: [0000 0000] [0xxx xxxx] 
if	TokenNameif	
(	TokenNameLPAREN	
byte1	TokenNameIdentifier	 byte1
>=	TokenNameGREATER_EQUAL	
byte0	TokenNameIdentifier	 byte0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
out	TokenNameIdentifier	 out
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
byte1	TokenNameIdentifier	 byte1
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// UTF-8: [110y yyyy] [10xx xxxx] 	TokenNameCOMMENT_LINE	UTF-8: [110y yyyy] [10xx xxxx] 
// Unicode: [0000 0yyy] [yyxx xxxx] 	TokenNameCOMMENT_LINE	Unicode: [0000 0yyy] [yyxx xxxx] 
int	TokenNameint	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
byte1	TokenNameIdentifier	 byte1
&	TokenNameAND	
0x0FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
&	TokenNameAND	
0xE0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0xC0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
&	TokenNameAND	
0x1E	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
in	TokenNameIdentifier	 in
<	TokenNameLESS	
total	TokenNameIdentifier	 total
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
in	TokenNameIdentifier	 in
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b0	TokenNameIdentifier	 b0
;	TokenNameSEMICOLON	
fOffset	TokenNameIdentifier	 f Offset
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
expectedByte	TokenNameIdentifier	 expected Byte
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
0xC0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b0	TokenNameIdentifier	 b0
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b1	TokenNameIdentifier	 b1
;	TokenNameSEMICOLON	
fOffset	TokenNameIdentifier	 f Offset
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
invalidByte	TokenNameIdentifier	 invalid Byte
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x07C0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
0x003F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
out	TokenNameIdentifier	 out
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
-=	TokenNameMINUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// UTF-8: [1110 zzzz] [10yy yyyy] [10xx xxxx] 	TokenNameCOMMENT_LINE	UTF-8: [1110 zzzz] [10yy yyyy] [10xx xxxx] 
// Unicode: [zzzz yyyy] [yyxx xxxx] 	TokenNameCOMMENT_LINE	Unicode: [zzzz yyyy] [yyxx xxxx] 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
&	TokenNameAND	
0xF0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0xE0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
in	TokenNameIdentifier	 in
<	TokenNameLESS	
total	TokenNameIdentifier	 total
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
in	TokenNameIdentifier	 in
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b0	TokenNameIdentifier	 b0
;	TokenNameSEMICOLON	
fOffset	TokenNameIdentifier	 f Offset
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
expectedByte	TokenNameIdentifier	 expected Byte
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
0xC0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x80	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
==	TokenNameEQUAL_EQUAL	
0xED	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
b1	TokenNameIdentifier	 b1
>=	TokenNameGREATER_EQUAL	
0xA0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
&	TokenNameAND	
0x0F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
0x20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b0	TokenNameIdentifier	 b0
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b1	TokenNameIdentifier	 b1
;	TokenNameSEMICOLON	
fOffset	TokenNameIdentifier	 f Offset
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
invalidByte	TokenNameIdentifier	 invalid Byte
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
in	TokenNameIdentifier	 in
<	TokenNameLESS	
total	TokenNameIdentifier	 total
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
in	TokenNameIdentifier	 in
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b0	TokenNameIdentifier	 b0
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b1	TokenNameIdentifier	 b1
;	TokenNameSEMICOLON	
fOffset	TokenNameIdentifier	 f Offset
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
expectedByte	TokenNameIdentifier	 expected Byte
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
&	TokenNameAND	
0xC0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b0	TokenNameIdentifier	 b0
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b1	TokenNameIdentifier	 b1
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b2	TokenNameIdentifier	 b2
;	TokenNameSEMICOLON	
fOffset	TokenNameIdentifier	 f Offset
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
invalidByte	TokenNameIdentifier	 invalid Byte
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
<<	TokenNameLEFT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xF000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0FC0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
&	TokenNameAND	
0x003F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
out	TokenNameIdentifier	 out
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
-=	TokenNameMINUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// UTF-8: [1111 0uuu] [10uu zzzz] [10yy yyyy] [10xx xxxx]* 	TokenNameCOMMENT_LINE	UTF-8: [1111 0uuu] [10uu zzzz] [10yy yyyy] [10xx xxxx]* 
// Unicode: [1101 10ww] [wwzz zzyy] (high surrogate) 	TokenNameCOMMENT_LINE	Unicode: [1101 10ww] [wwzz zzyy] (high surrogate) 
// [1101 11yy] [yyxx xxxx] (low surrogate) 	TokenNameCOMMENT_LINE	[1101 11yy] [yyxx xxxx] (low surrogate) 
// * uuuuu = wwww + 1 	TokenNameCOMMENT_LINE	* uuuuu = wwww + 1 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
&	TokenNameAND	
0xF8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0xF0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
in	TokenNameIdentifier	 in
<	TokenNameLESS	
total	TokenNameIdentifier	 total
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
in	TokenNameIdentifier	 in
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b0	TokenNameIdentifier	 b0
;	TokenNameSEMICOLON	
fOffset	TokenNameIdentifier	 f Offset
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
expectedByte	TokenNameIdentifier	 expected Byte
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
0xC0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x80	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
0x30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
&	TokenNameAND	
0x07	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b0	TokenNameIdentifier	 b0
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b1	TokenNameIdentifier	 b1
;	TokenNameSEMICOLON	
fOffset	TokenNameIdentifier	 f Offset
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
invalidByte	TokenNameIdentifier	 invalid Byte
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
in	TokenNameIdentifier	 in
<	TokenNameLESS	
total	TokenNameIdentifier	 total
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
in	TokenNameIdentifier	 in
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b0	TokenNameIdentifier	 b0
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b1	TokenNameIdentifier	 b1
;	TokenNameSEMICOLON	
fOffset	TokenNameIdentifier	 f Offset
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
expectedByte	TokenNameIdentifier	 expected Byte
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
&	TokenNameAND	
0xC0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b0	TokenNameIdentifier	 b0
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b1	TokenNameIdentifier	 b1
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b2	TokenNameIdentifier	 b2
;	TokenNameSEMICOLON	
fOffset	TokenNameIdentifier	 f Offset
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
invalidByte	TokenNameIdentifier	 invalid Byte
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
b3	TokenNameIdentifier	 b3
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
in	TokenNameIdentifier	 in
<	TokenNameLESS	
total	TokenNameIdentifier	 total
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b3	TokenNameIdentifier	 b3
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
in	TokenNameIdentifier	 in
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
b3	TokenNameIdentifier	 b3
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b0	TokenNameIdentifier	 b0
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b1	TokenNameIdentifier	 b1
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b2	TokenNameIdentifier	 b2
;	TokenNameSEMICOLON	
fOffset	TokenNameIdentifier	 f Offset
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
expectedByte	TokenNameIdentifier	 expected Byte
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
&	TokenNameAND	
0xC0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b0	TokenNameIdentifier	 b0
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b1	TokenNameIdentifier	 b1
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b2	TokenNameIdentifier	 b2
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b3	TokenNameIdentifier	 b3
;	TokenNameSEMICOLON	
fOffset	TokenNameIdentifier	 f Offset
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
invalidByte	TokenNameIdentifier	 invalid Byte
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// decode bytes into surrogate characters 	TokenNameCOMMENT_LINE	decode bytes into surrogate characters 
int	TokenNameint	
uuuuu	TokenNameIdentifier	 uuuuu
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x001C	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0003	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uuuuu	TokenNameIdentifier	 uuuuu
>	TokenNameGREATER	
0x10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invalidSurrogate	TokenNameIdentifier	 invalid Surrogate
(	TokenNameLPAREN	
uuuuu	TokenNameIdentifier	 uuuuu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
wwww	TokenNameIdentifier	 wwww
=	TokenNameEQUAL	
uuuuu	TokenNameIdentifier	 uuuuu
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
zzzz	TokenNameIdentifier	 zzzz
=	TokenNameEQUAL	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
0x000F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
yyyyyy	TokenNameIdentifier	 yyyyyy
=	TokenNameEQUAL	
b2	TokenNameIdentifier	 b2
&	TokenNameAND	
0x003F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
xxxxxx	TokenNameIdentifier	 xxxxxx
=	TokenNameEQUAL	
b3	TokenNameIdentifier	 b3
&	TokenNameAND	
0x003F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
hs	TokenNameIdentifier	 hs
=	TokenNameEQUAL	
0xD800	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
wwww	TokenNameIdentifier	 wwww
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x03C0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
zzzz	TokenNameIdentifier	 zzzz
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
yyyyyy	TokenNameIdentifier	 yyyyyy
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ls	TokenNameIdentifier	 ls
=	TokenNameEQUAL	
0xDC00	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
yyyyyy	TokenNameIdentifier	 yyyyyy
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x03C0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
xxxxxx	TokenNameIdentifier	 xxxxxx
;	TokenNameSEMICOLON	
// set characters 	TokenNameCOMMENT_LINE	set characters 
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
out	TokenNameIdentifier	 out
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
hs	TokenNameIdentifier	 hs
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
-=	TokenNameMINUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
out	TokenNameIdentifier	 out
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ls	TokenNameIdentifier	 ls
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reached the end of the char buffer; save low surrogate for the next read 	TokenNameCOMMENT_LINE	reached the end of the char buffer; save low surrogate for the next read 
else	TokenNameelse	
{	TokenNameLBRACE	
fSurrogate	TokenNameIdentifier	 f Surrogate
=	TokenNameEQUAL	
ls	TokenNameIdentifier	 ls
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// error 	TokenNameCOMMENT_LINE	error 
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b0	TokenNameIdentifier	 b0
;	TokenNameSEMICOLON	
fOffset	TokenNameIdentifier	 f Offset
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
invalidByte	TokenNameIdentifier	 invalid Byte
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return number of characters converted 	TokenNameCOMMENT_LINE	return number of characters converted 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_READ	TokenNameIdentifier	 DEBUG  READ
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"read(char[],"	TokenNameStringLiteral	read(char[],
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
','	TokenNameCharacterLiteral	
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
"): count="	TokenNameStringLiteral	): count=
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// read(char[],int,int) 	TokenNameCOMMENT_LINE	read(char[],int,int) 
/** * Skip characters. This method will block until some characters are * available, an I/O error occurs, or the end of the stream is reached. * * @param n The number of characters to skip * * @return The number of characters actually skipped * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Skip characters. This method will block until some characters are available, an I/O error occurs, or the end of the stream is reached. * @param n The number of characters to skip * @return The number of characters actually skipped * @exception IOException If an I/O error occurs 
public	TokenNamepublic	
long	TokenNamelong	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
long	TokenNamelong	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
remaining	TokenNameIdentifier	 remaining
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fBuffer	TokenNameIdentifier	 f Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
remaining	TokenNameIdentifier	 remaining
?	TokenNameQUESTION	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
remaining	TokenNameIdentifier	 remaining
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
remaining	TokenNameIdentifier	 remaining
-=	TokenNameMINUS_EQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
remaining	TokenNameIdentifier	 remaining
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
skipped	TokenNameIdentifier	 skipped
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
remaining	TokenNameIdentifier	 remaining
;	TokenNameSEMICOLON	
return	TokenNamereturn	
skipped	TokenNameIdentifier	 skipped
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skip(long):long 	TokenNameCOMMENT_LINE	skip(long):long 
/** * Tell whether this stream is ready to be read. * * @return True if the next read() is guaranteed not to block for input, * false otherwise. Note that returning false does not guarantee that the * next read will block. * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Tell whether this stream is ready to be read. * @return True if the next read() is guaranteed not to block for input, false otherwise. Note that returning false does not guarantee that the next read will block. * @exception IOException If an I/O error occurs 
public	TokenNamepublic	
boolean	TokenNameboolean	
ready	TokenNameIdentifier	 ready
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ready() 	TokenNameCOMMENT_LINE	ready() 
/** * Tell whether this stream supports the mark() operation. */	TokenNameCOMMENT_JAVADOC	 Tell whether this stream supports the mark() operation. 
public	TokenNamepublic	
boolean	TokenNameboolean	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// markSupported() 	TokenNameCOMMENT_LINE	markSupported() 
/** * Mark the present position in the stream. Subsequent calls to reset() * will attempt to reposition the stream to this point. Not all * character-input streams support the mark() operation. * * @param readAheadLimit Limit on the number of characters that may be * read while still preserving the mark. After * reading this many characters, attempting to * reset the stream may fail. * * @exception IOException If the stream does not support mark(), * or if some other I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Mark the present position in the stream. Subsequent calls to reset() will attempt to reposition the stream to this point. Not all character-input streams support the mark() operation. * @param readAheadLimit Limit on the number of characters that may be read while still preserving the mark. After reading this many characters, attempting to reset the stream may fail. * @exception IOException If the stream does not support mark(), or if some other I/O error occurs 
public	TokenNamepublic	
void	TokenNamevoid	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
int	TokenNameint	
readAheadLimit	TokenNameIdentifier	 read Ahead Limit
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
fFormatter	TokenNameIdentifier	 f Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
fLocale	TokenNameIdentifier	 f Locale
,	TokenNameCOMMA	
"OperationNotSupported"	TokenNameStringLiteral	OperationNotSupported
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mark()"	TokenNameStringLiteral	mark()
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// mark(int) 	TokenNameCOMMENT_LINE	mark(int) 
/** * Reset the stream. If the stream has been marked, then attempt to * reposition it at the mark. If the stream has not been marked, then * attempt to reset it in some way appropriate to the particular stream, * for example by repositioning it to its starting point. Not all * character-input streams support the reset() operation, and some support * reset() without supporting mark(). * * @exception IOException If the stream has not been marked, * or if the mark has been invalidated, * or if the stream does not support reset(), * or if some other I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Reset the stream. If the stream has been marked, then attempt to reposition it at the mark. If the stream has not been marked, then attempt to reset it in some way appropriate to the particular stream, for example by repositioning it to its starting point. Not all character-input streams support the reset() operation, and some support reset() without supporting mark(). * @exception IOException If the stream has not been marked, or if the mark has been invalidated, or if the stream does not support reset(), or if some other I/O error occurs 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
fOffset	TokenNameIdentifier	 f Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fSurrogate	TokenNameIdentifier	 f Surrogate
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reset() 	TokenNameCOMMENT_LINE	reset() 
/** * Close the stream. Once a stream has been closed, further read(), * ready(), mark(), or reset() invocations will throw an IOException. * Closing a previously-closed stream, however, has no effect. * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Close the stream. Once a stream has been closed, further read(), ready(), mark(), or reset() invocations will throw an IOException. Closing a previously-closed stream, however, has no effect. * @exception IOException If an I/O error occurs 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// close() 	TokenNameCOMMENT_LINE	close() 
// 	TokenNameCOMMENT_LINE	 
// Private methods 	TokenNameCOMMENT_LINE	Private methods 
// 	TokenNameCOMMENT_LINE	 
/** Throws an exception for expected byte. */	TokenNameCOMMENT_JAVADOC	 Throws an exception for expected byte. 
private	TokenNameprivate	
void	TokenNamevoid	
expectedByte	TokenNameIdentifier	 expected Byte
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedByteSequenceException	TokenNameIdentifier	 Malformed Byte Sequence Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedByteSequenceException	TokenNameIdentifier	 Malformed Byte Sequence Exception
(	TokenNameLPAREN	
fFormatter	TokenNameIdentifier	 f Formatter
,	TokenNameCOMMA	
fLocale	TokenNameIdentifier	 f Locale
,	TokenNameCOMMA	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"ExpectedByte"	TokenNameStringLiteral	ExpectedByte
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// expectedByte(int,int) 	TokenNameCOMMENT_LINE	expectedByte(int,int) 
/** Throws an exception for invalid byte. */	TokenNameCOMMENT_JAVADOC	 Throws an exception for invalid byte. 
private	TokenNameprivate	
void	TokenNamevoid	
invalidByte	TokenNameIdentifier	 invalid Byte
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedByteSequenceException	TokenNameIdentifier	 Malformed Byte Sequence Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedByteSequenceException	TokenNameIdentifier	 Malformed Byte Sequence Exception
(	TokenNameLPAREN	
fFormatter	TokenNameIdentifier	 f Formatter
,	TokenNameCOMMA	
fLocale	TokenNameIdentifier	 f Locale
,	TokenNameCOMMA	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"InvalidByte"	TokenNameStringLiteral	InvalidByte
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// invalidByte(int,int,int) 	TokenNameCOMMENT_LINE	invalidByte(int,int,int) 
/** Throws an exception for invalid surrogate bits. */	TokenNameCOMMENT_JAVADOC	 Throws an exception for invalid surrogate bits. 
private	TokenNameprivate	
void	TokenNamevoid	
invalidSurrogate	TokenNameIdentifier	 invalid Surrogate
(	TokenNameLPAREN	
int	TokenNameint	
uuuuu	TokenNameIdentifier	 uuuuu
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedByteSequenceException	TokenNameIdentifier	 Malformed Byte Sequence Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedByteSequenceException	TokenNameIdentifier	 Malformed Byte Sequence Exception
(	TokenNameLPAREN	
fFormatter	TokenNameIdentifier	 f Formatter
,	TokenNameCOMMA	
fLocale	TokenNameIdentifier	 f Locale
,	TokenNameCOMMA	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"InvalidHighSurrogate"	TokenNameStringLiteral	InvalidHighSurrogate
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
uuuuu	TokenNameIdentifier	 uuuuu
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// invalidSurrogate(int) 	TokenNameCOMMENT_LINE	invalidSurrogate(int) 
}	TokenNameRBRACE	
// class UTF8Reader 	TokenNameCOMMENT_LINE	class UTF8Reader 
