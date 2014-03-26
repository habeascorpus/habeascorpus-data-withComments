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
/** * Reader for UCS-2 and UCS-4 encodings. * (i.e., encodings from ISO-10646-UCS-(2|4)). * * @xerces.internal * * @author Neil Graham, IBM * * @version $Id: UCSReader.java 718095 2008-11-16 20:00:14Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Reader for UCS-2 and UCS-4 encodings. (i.e., encodings from ISO-10646-UCS-(2|4)). * @xerces.internal * @author Neil Graham, IBM * @version $Id: UCSReader.java 718095 2008-11-16 20:00:14Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
UCSReader	TokenNameIdentifier	 UCS Reader
extends	TokenNameextends	
Reader	TokenNameIdentifier	 Reader
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** * Default byte buffer size (8192, larger than that of ASCIIReader * since it's reasonable to surmise that the average UCS-4-encoded * file should be 4 times as large as the average ASCII-encoded file). */	TokenNameCOMMENT_JAVADOC	 Default byte buffer size (8192, larger than that of ASCIIReader since it's reasonable to surmise that the average UCS-4-encoded file should be 4 times as large as the average ASCII-encoded file). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
=	TokenNameEQUAL	
8192	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
UCS2LE	TokenNameIdentifier	 UC S2 LE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
UCS2BE	TokenNameIdentifier	 UC S2 BE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
UCS4LE	TokenNameIdentifier	 UC S4 LE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
UCS4BE	TokenNameIdentifier	 UC S4 BE
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
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
// what kind of data we're dealing with 	TokenNameCOMMENT_LINE	what kind of data we're dealing with 
protected	TokenNameprotected	
final	TokenNamefinal	
short	TokenNameshort	
fEncoding	TokenNameIdentifier	 f Encoding
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a UCS reader from the specified input stream * using the default buffer size. The Endian-ness and whether this is * UCS-2 or UCS-4 needs also to be known in advance. * * @param inputStream The input stream. * @param encoding One of UCS2LE, UCS2BE, UCS4LE or UCS4BE. */	TokenNameCOMMENT_JAVADOC	 Constructs a UCS reader from the specified input stream using the default buffer size. The Endian-ness and whether this is UCS-2 or UCS-4 needs also to be known in advance. * @param inputStream The input stream. @param encoding One of UCS2LE, UCS2BE, UCS4LE or UCS4BE. 
public	TokenNamepublic	
UCSReader	TokenNameIdentifier	 UCS Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
short	TokenNameshort	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(InputStream, short) 	TokenNameCOMMENT_LINE	<init>(InputStream, short) 
/** * Constructs a UCS reader from the specified input stream * and buffer size. The Endian-ness and whether this is * UCS-2 or UCS-4 needs also to be known in advance. * * @param inputStream The input stream. * @param size The initial buffer size. * @param encoding One of UCS2LE, UCS2BE, UCS4LE or UCS4BE. */	TokenNameCOMMENT_JAVADOC	 Constructs a UCS reader from the specified input stream and buffer size. The Endian-ness and whether this is UCS-2 or UCS-4 needs also to be known in advance. * @param inputStream The input stream. @param size The initial buffer size. @param encoding One of UCS2LE, UCS2BE, UCS4LE or UCS4BE. 
public	TokenNamepublic	
UCSReader	TokenNameIdentifier	 UCS Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
short	TokenNameshort	
encoding	TokenNameIdentifier	 encoding
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
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(InputStream,int,short) 	TokenNameCOMMENT_LINE	<init>(InputStream,int,short) 
/** * Constructs a UCS reader from the specified input stream * and buffer. The Endian-ness and whether this is * UCS-2 or UCS-4 needs also to be known in advance. * * @param inputStream The input stream. * @param buffer The byte buffer. * @param encoding One of UCS2LE, UCS2BE, UCS4LE or UCS4BE. */	TokenNameCOMMENT_JAVADOC	 Constructs a UCS reader from the specified input stream and buffer. The Endian-ness and whether this is UCS-2 or UCS-4 needs also to be known in advance. * @param inputStream The input stream. @param buffer The byte buffer. @param encoding One of UCS2LE, UCS2BE, UCS4LE or UCS4BE. 
public	TokenNamepublic	
UCSReader	TokenNameIdentifier	 UCS Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
short	TokenNameshort	
encoding	TokenNameIdentifier	 encoding
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
fEncoding	TokenNameIdentifier	 f Encoding
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(InputStream,int,short) 	TokenNameCOMMENT_LINE	<init>(InputStream,int,short) 
// 	TokenNameCOMMENT_LINE	 
// Reader methods 	TokenNameCOMMENT_LINE	Reader methods 
// 	TokenNameCOMMENT_LINE	 
/** * Read a single character. This method will block until a character is * available, an I/O error occurs, or the end of the stream is reached. * * <p> Subclasses that intend to support efficient single-character input * should override this method. * * @return The character read, as an integer in the range 0 to 127 * (<tt>0x00-0x7f</tt>), or -1 if the end of the stream has * been reached * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Read a single character. This method will block until a character is available, an I/O error occurs, or the end of the stream is reached. * <p> Subclasses that intend to support efficient single-character input should override this method. * @return The character read, as an integer in the range 0 to 127 (<tt>0x00-0x7f</tt>), or -1 if the end of the stream has been reached * @exception IOException If an I/O error occurs 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
==	TokenNameEQUAL_EQUAL	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
==	TokenNameEQUAL_EQUAL	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// UCS-4 	TokenNameCOMMENT_LINE	UCS-4 
if	TokenNameif	
(	TokenNameLPAREN	
fEncoding	TokenNameIdentifier	 f Encoding
>=	TokenNameGREATER_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
==	TokenNameEQUAL_EQUAL	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
b3	TokenNameIdentifier	 b3
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
==	TokenNameEQUAL_EQUAL	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fEncoding	TokenNameIdentifier	 f Encoding
==	TokenNameEQUAL_EQUAL	
UCS4BE	TokenNameIdentifier	 UC S4 BE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
b3	TokenNameIdentifier	 b3
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
b0	TokenNameIdentifier	 b0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// UCS-2 	TokenNameCOMMENT_LINE	UCS-2 
if	TokenNameif	
(	TokenNameLPAREN	
fEncoding	TokenNameIdentifier	 f Encoding
==	TokenNameEQUAL_EQUAL	
UCS2BE	TokenNameIdentifier	 UC S2 BE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
b1	TokenNameIdentifier	 b1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
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
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fEncoding	TokenNameIdentifier	 f Encoding
>=	TokenNameGREATER_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
byteLength	TokenNameIdentifier	 byte Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// try and make count be a multiple of the number of bytes we're looking for 	TokenNameCOMMENT_LINE	try and make count be a multiple of the number of bytes we're looking for 
if	TokenNameif	
(	TokenNameLPAREN	
fEncoding	TokenNameIdentifier	 f Encoding
>=	TokenNameGREATER_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// BigEndian 	TokenNameCOMMENT_LINE	BigEndian 
// this looks ugly, but it avoids an if at any rate... 	TokenNameCOMMENT_LINE	this looks ugly, but it avoids an if at any rate... 
int	TokenNameint	
numToRead	TokenNameIdentifier	 num To Read
=	TokenNameEQUAL	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
&	TokenNameAND	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
3	TokenNameIntegerLiteral	
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
numToRead	TokenNameIdentifier	 num To Read
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
charRead	TokenNameIdentifier	 char Read
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charRead	TokenNameIdentifier	 char Read
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// end of input; something likely went wrong!A Pad buffer with nulls. 	TokenNameCOMMENT_LINE	end of input; something likely went wrong!A Pad buffer with nulls. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
numToRead	TokenNameIdentifier	 num To Read
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
charRead	TokenNameIdentifier	 char Read
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
numToRead	TokenNameIdentifier	 num To Read
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
numToRead	TokenNameIdentifier	 num To Read
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
&	TokenNameAND	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numToRead	TokenNameIdentifier	 num To Read
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
charRead	TokenNameIdentifier	 char Read
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charRead	TokenNameIdentifier	 char Read
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// end of input; something likely went wrong!A Pad buffer with nulls. 	TokenNameCOMMENT_LINE	end of input; something likely went wrong!A Pad buffer with nulls. 
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
charRead	TokenNameIdentifier	 char Read
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// now count is a multiple of the right number of bytes 	TokenNameCOMMENT_LINE	now count is a multiple of the right number of bytes 
int	TokenNameint	
numChars	TokenNameIdentifier	 num Chars
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fEncoding	TokenNameIdentifier	 f Encoding
>=	TokenNameGREATER_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
numChars	TokenNameIdentifier	 num Chars
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
// UCS-4 	TokenNameCOMMENT_LINE	UCS-4 
if	TokenNameif	
(	TokenNameLPAREN	
fEncoding	TokenNameIdentifier	 f Encoding
>=	TokenNameGREATER_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
curPos	TokenNameIdentifier	 cur Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
b3	TokenNameIdentifier	 b3
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
curPos	TokenNameIdentifier	 cur Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fEncoding	TokenNameIdentifier	 f Encoding
==	TokenNameEQUAL_EQUAL	
UCS4BE	TokenNameIdentifier	 UC S4 BE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
b3	TokenNameIdentifier	 b3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// UCS-2 	TokenNameCOMMENT_LINE	UCS-2 
if	TokenNameif	
(	TokenNameLPAREN	
fEncoding	TokenNameIdentifier	 f Encoding
==	TokenNameEQUAL_EQUAL	
UCS2BE	TokenNameIdentifier	 UC S2 BE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
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
+	TokenNamePLUS	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
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
+	TokenNamePLUS	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
numChars	TokenNameIdentifier	 num Chars
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
// charWidth will represent the number of bits to move 	TokenNameCOMMENT_LINE	charWidth will represent the number of bits to move 
// n leftward to get num of bytes to skip, and then move the result rightward 	TokenNameCOMMENT_LINE	n leftward to get num of bytes to skip, and then move the result rightward 
// to get num of chars effectively skipped. 	TokenNameCOMMENT_LINE	to get num of chars effectively skipped. 
// The trick with &'ing, as with elsewhere in this dcode, is 	TokenNameCOMMENT_LINE	The trick with &'ing, as with elsewhere in this dcode, is 
// intended to avoid an expensive use of / that might not be optimized 	TokenNameCOMMENT_LINE	intended to avoid an expensive use of / that might not be optimized 
// away. 	TokenNameCOMMENT_LINE	away. 
int	TokenNameint	
charWidth	TokenNameIdentifier	 char Width
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fEncoding	TokenNameIdentifier	 f Encoding
>=	TokenNameGREATER_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
bytesSkipped	TokenNameIdentifier	 bytes Skipped
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<<	TokenNameLEFT_SHIFT	
charWidth	TokenNameIdentifier	 char Width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytesSkipped	TokenNameIdentifier	 bytes Skipped
&	TokenNameAND	
(	TokenNameLPAREN	
charWidth	TokenNameIdentifier	 char Width
|	TokenNameOR	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
bytesSkipped	TokenNameIdentifier	 bytes Skipped
>>	TokenNameRIGHT_SHIFT	
charWidth	TokenNameIdentifier	 char Width
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
bytesSkipped	TokenNameIdentifier	 bytes Skipped
>>	TokenNameRIGHT_SHIFT	
charWidth	TokenNameIdentifier	 char Width
)	TokenNameRPAREN	
+	TokenNamePLUS	
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
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
readAheadLimit	TokenNameIdentifier	 read Ahead Limit
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
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
// class UCSReader 	TokenNameCOMMENT_LINE	class UCSReader 
