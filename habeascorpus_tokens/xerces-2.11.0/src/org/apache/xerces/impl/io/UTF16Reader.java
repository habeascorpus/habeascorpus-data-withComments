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
/** * <p>A UTF-16 reader. Can also be used for UCS-2 (i.e. ISO-10646-UCS-2).</p> * * @xerces.internal * * @author Michael Glavassevich, IBM * * @version $Id: UTF16Reader.java 718095 2008-11-16 20:00:14Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>A UTF-16 reader. Can also be used for UCS-2 (i.e. ISO-10646-UCS-2).</p> * @xerces.internal * @author Michael Glavassevich, IBM * @version $Id: UTF16Reader.java 718095 2008-11-16 20:00:14Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
UTF16Reader	TokenNameIdentifier	 UT F16 Reader
extends	TokenNameextends	
Reader	TokenNameIdentifier	 Reader
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Default byte buffer size (4096). */	TokenNameCOMMENT_JAVADOC	 Default byte buffer size (4096). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
=	TokenNameEQUAL	
4096	TokenNameIntegerLiteral	
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
/** Endianness. */	TokenNameCOMMENT_JAVADOC	 Endianness. 
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
fIsBigEndian	TokenNameIdentifier	 f Is Big Endian
;	TokenNameSEMICOLON	
// message formatter; used to produce localized exception messages 	TokenNameCOMMENT_LINE	message formatter; used to produce localized exception messages 
private	TokenNameprivate	
final	TokenNamefinal	
MessageFormatter	TokenNameIdentifier	 Message Formatter
fFormatter	TokenNameIdentifier	 f Formatter
;	TokenNameSEMICOLON	
// Locale to use for messages 	TokenNameCOMMENT_LINE	Locale to use for messages 
private	TokenNameprivate	
final	TokenNamefinal	
Locale	TokenNameIdentifier	 Locale
fLocale	TokenNameIdentifier	 f Locale
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a UTF-16 reader from the specified input stream * using the default buffer size. Primarily for testing. * * @param inputStream The input stream. * @param isBigEndian The byte order. */	TokenNameCOMMENT_JAVADOC	 Constructs a UTF-16 reader from the specified input stream using the default buffer size. Primarily for testing. * @param inputStream The input stream. @param isBigEndian The byte order. 
public	TokenNamepublic	
UTF16Reader	TokenNameIdentifier	 UT F16 Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBigEndian	TokenNameIdentifier	 is Big Endian
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
,	TokenNameCOMMA	
isBigEndian	TokenNameIdentifier	 is Big Endian
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
// <init>(InputStream, boolean) 	TokenNameCOMMENT_LINE	<init>(InputStream, boolean) 
/** * Constructs a UTF-16 reader from the specified input stream * using the default buffer size and the given MessageFormatter. * * @param inputStream The input stream. * @param isBigEndian The byte order. */	TokenNameCOMMENT_JAVADOC	 Constructs a UTF-16 reader from the specified input stream using the default buffer size and the given MessageFormatter. * @param inputStream The input stream. @param isBigEndian The byte order. 
public	TokenNamepublic	
UTF16Reader	TokenNameIdentifier	 UT F16 Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBigEndian	TokenNameIdentifier	 is Big Endian
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
isBigEndian	TokenNameIdentifier	 is Big Endian
,	TokenNameCOMMA	
messageFormatter	TokenNameIdentifier	 message Formatter
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(InputStream, boolean, MessageFormatter, Locale) 	TokenNameCOMMENT_LINE	<init>(InputStream, boolean, MessageFormatter, Locale) 
/** * Constructs a UTF-16 reader from the specified input stream * and buffer size and given MessageFormatter. * * @param inputStream The input stream. * @param size The initial buffer size. * @param isBigEndian The byte order. * @param messageFormatter Given MessageFormatter * @param locale Locale to use for messages */	TokenNameCOMMENT_JAVADOC	 Constructs a UTF-16 reader from the specified input stream and buffer size and given MessageFormatter. * @param inputStream The input stream. @param size The initial buffer size. @param isBigEndian The byte order. @param messageFormatter Given MessageFormatter @param locale Locale to use for messages 
public	TokenNamepublic	
UTF16Reader	TokenNameIdentifier	 UT F16 Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBigEndian	TokenNameIdentifier	 is Big Endian
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
isBigEndian	TokenNameIdentifier	 is Big Endian
,	TokenNameCOMMA	
messageFormatter	TokenNameIdentifier	 message Formatter
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(InputStream, int, boolean, MessageFormatter, Locale) 	TokenNameCOMMENT_LINE	<init>(InputStream, int, boolean, MessageFormatter, Locale) 
/** * Constructs a UTF-16 reader from the specified input stream, * buffer and MessageFormatter. * * @param inputStream The input stream. * @param buffer The byte buffer. * @param isBigEndian The byte order. * @param messageFormatter Given MessageFormatter * @param locale Locale to use for messages */	TokenNameCOMMENT_JAVADOC	 Constructs a UTF-16 reader from the specified input stream, buffer and MessageFormatter. * @param inputStream The input stream. @param buffer The byte buffer. @param isBigEndian The byte order. @param messageFormatter Given MessageFormatter @param locale Locale to use for messages 
public	TokenNamepublic	
UTF16Reader	TokenNameIdentifier	 UT F16 Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBigEndian	TokenNameIdentifier	 is Big Endian
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
fIsBigEndian	TokenNameIdentifier	 f Is Big Endian
=	TokenNameEQUAL	
isBigEndian	TokenNameIdentifier	 is Big Endian
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
// <init>(InputStream, byte[], boolean, MessageFormatter, Locale) 	TokenNameCOMMENT_LINE	<init>(InputStream, byte[], boolean, MessageFormatter, Locale) 
// 	TokenNameCOMMENT_LINE	 
// Reader methods 	TokenNameCOMMENT_LINE	Reader methods 
// 	TokenNameCOMMENT_LINE	 
/** * Read a single character. This method will block until a character is * available, an I/O error occurs, or the end of the stream is reached. * * <p> Subclasses that intend to support efficient single-character input * should override this method. * * @return The character read, as an integer in the range 0 to 65535 * (<tt>0x00-0xffff</tt>), or -1 if the end of the stream has * been reached * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Read a single character. This method will block until a character is available, an I/O error occurs, or the end of the stream is reached. * <p> Subclasses that intend to support efficient single-character input should override this method. * @return The character read, as an integer in the range 0 to 65535 (<tt>0x00-0xffff</tt>), or -1 if the end of the stream has been reached * @exception IOException If an I/O error occurs 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
final	TokenNamefinal	
int	TokenNameint	
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
expectedTwoBytes	TokenNameIdentifier	 expected Two Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// UTF-16BE 	TokenNameCOMMENT_LINE	UTF-16BE 
if	TokenNameif	
(	TokenNameLPAREN	
fIsBigEndian	TokenNameIdentifier	 f Is Big Endian
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
b1	TokenNameIdentifier	 b1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// UTF-16LE 	TokenNameCOMMENT_LINE	UTF-16LE 
return	TokenNamereturn	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
b0	TokenNameIdentifier	 b0
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
int	TokenNameint	
byteLength	TokenNameIdentifier	 byte Length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
byteLength	TokenNameIdentifier	 byte Length
>	TokenNameGREATER	
fBuffer	TokenNameIdentifier	 f Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byteLength	TokenNameIdentifier	 byte Length
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
byteCount	TokenNameIdentifier	 byte Count
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
fBuffer	TokenNameIdentifier	 f Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
byteLength	TokenNameIdentifier	 byte Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
byteCount	TokenNameIdentifier	 byte Count
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
// If an odd number of bytes were read, we still need to read one more. 	TokenNameCOMMENT_LINE	If an odd number of bytes were read, we still need to read one more. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byteCount	TokenNameIdentifier	 byte Count
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectedTwoBytes	TokenNameIdentifier	 expected Two Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
byteCount	TokenNameIdentifier	 byte Count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
charCount	TokenNameIdentifier	 char Count
=	TokenNameEQUAL	
byteCount	TokenNameIdentifier	 byte Count
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fIsBigEndian	TokenNameIdentifier	 f Is Big Endian
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processBE	TokenNameIdentifier	 process BE
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
charCount	TokenNameIdentifier	 char Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
processLE	TokenNameIdentifier	 process LE
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
charCount	TokenNameIdentifier	 char Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
charCount	TokenNameIdentifier	 char Count
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
bytesSkipped	TokenNameIdentifier	 bytes Skipped
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytesSkipped	TokenNameIdentifier	 bytes Skipped
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectedTwoBytes	TokenNameIdentifier	 expected Two Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
bytesSkipped	TokenNameIdentifier	 bytes Skipped
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bytesSkipped	TokenNameIdentifier	 bytes Skipped
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
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
"UTF-16"	TokenNameStringLiteral	UTF-16
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
/** Decodes UTF-16BE **/	TokenNameCOMMENT_JAVADOC	 Decodes UTF-16BE *
private	TokenNameprivate	
void	TokenNamevoid	
processBE	TokenNameIdentifier	 process BE
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
curPos	TokenNameIdentifier	 cur Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
curPos	TokenNameIdentifier	 cur Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
curPos	TokenNameIdentifier	 cur Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// processBE(char[],int,int) 	TokenNameCOMMENT_LINE	processBE(char[],int,int) 
/** Decodes UTF-16LE **/	TokenNameCOMMENT_JAVADOC	 Decodes UTF-16LE *
private	TokenNameprivate	
void	TokenNamevoid	
processLE	TokenNameIdentifier	 process LE
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
curPos	TokenNameIdentifier	 cur Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
curPos	TokenNameIdentifier	 cur Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
curPos	TokenNameIdentifier	 cur Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// processLE(char[],int,int) 	TokenNameCOMMENT_LINE	processLE(char[],int,int) 
/** Throws an exception for expected byte. */	TokenNameCOMMENT_JAVADOC	 Throws an exception for expected byte. 
private	TokenNameprivate	
void	TokenNamevoid	
expectedTwoBytes	TokenNameIdentifier	 expected Two Bytes
(	TokenNameLPAREN	
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
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// expectedTwoBytes() 	TokenNameCOMMENT_LINE	expectedTwoBytes() 
}	TokenNameRBRACE	
// class UTF16Reader 	TokenNameCOMMENT_LINE	class UTF16Reader 
