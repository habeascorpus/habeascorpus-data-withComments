/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
/** * A subclass of <code>SeekableStream</code> that may be used to wrap * a regular <code>InputStream</code>. Seeking backwards is supported * by means of an in-memory cache. For greater efficiency, * <code>FileCacheSeekableStream</code> should be used in * circumstances that allow the creation of a temporary file. * * <p> The <code>mark()</code> and <code>reset()</code> methods are * supported. * * <p><b> This class is not a committed part of the JAI API. It may * be removed or changed in future releases of JAI.</b> * * @version $Id: MemoryCacheSeekableStream.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A subclass of <code>SeekableStream</code> that may be used to wrap a regular <code>InputStream</code>. Seeking backwards is supported by means of an in-memory cache. For greater efficiency, <code>FileCacheSeekableStream</code> should be used in circumstances that allow the creation of a temporary file. * <p> The <code>mark()</code> and <code>reset()</code> methods are supported. * <p><b> This class is not a committed part of the JAI API. It may be removed or changed in future releases of JAI.</b> * @version $Id: MemoryCacheSeekableStream.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
MemoryCacheSeekableStream	TokenNameIdentifier	 Memory Cache Seekable Stream
extends	TokenNameextends	
SeekableStream	TokenNameIdentifier	 Seekable Stream
{	TokenNameLBRACE	
/** The source input stream. */	TokenNameCOMMENT_JAVADOC	 The source input stream. 
private	TokenNameprivate	
InputStream	TokenNameIdentifier	 Input Stream
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
/** Position of first unread byte. */	TokenNameCOMMENT_JAVADOC	 Position of first unread byte. 
private	TokenNameprivate	
long	TokenNamelong	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Log_2 of the sector size. */	TokenNameCOMMENT_JAVADOC	 Log_2 of the sector size. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SECTOR_SHIFT	TokenNameIdentifier	 SECTOR  SHIFT
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The sector size. */	TokenNameCOMMENT_JAVADOC	 The sector size. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SECTOR_SIZE	TokenNameIdentifier	 SECTOR  SIZE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
SECTOR_SHIFT	TokenNameIdentifier	 SECTOR  SHIFT
;	TokenNameSEMICOLON	
/** A mask to determine the offset within a sector. */	TokenNameCOMMENT_JAVADOC	 A mask to determine the offset within a sector. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SECTOR_MASK	TokenNameIdentifier	 SECTOR  MASK
=	TokenNameEQUAL	
SECTOR_SIZE	TokenNameIdentifier	 SECTOR  SIZE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** A Vector of source sectors. */	TokenNameCOMMENT_JAVADOC	 A Vector of source sectors. 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Number of sectors stored. */	TokenNameCOMMENT_JAVADOC	 Number of sectors stored. 
int	TokenNameint	
sectors	TokenNameIdentifier	 sectors
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Number of bytes read. */	TokenNameCOMMENT_JAVADOC	 Number of bytes read. 
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** True if we've previously reached the end of the source stream */	TokenNameCOMMENT_JAVADOC	 True if we've previously reached the end of the source stream 
boolean	TokenNameboolean	
foundEOS	TokenNameIdentifier	 found EOS
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Constructs a <code>MemoryCacheSeekableStream</code> that takes * its source data from a regular <code>InputStream</code>. * Seeking backwards is supported by means of an in-memory cache. */	TokenNameCOMMENT_JAVADOC	 Constructs a <code>MemoryCacheSeekableStream</code> that takes its source data from a regular <code>InputStream</code>. Seeking backwards is supported by means of an in-memory cache. 
public	TokenNamepublic	
MemoryCacheSeekableStream	TokenNameIdentifier	 Memory Cache Seekable Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ensures that at least <code>pos</code> bytes are cached, * or the end of the source is reached. The return value * is equal to the smaller of <code>pos</code> and the * length of the source stream. */	TokenNameCOMMENT_JAVADOC	 Ensures that at least <code>pos</code> bytes are cached, or the end of the source is reached. The return value is equal to the smaller of <code>pos</code> and the length of the source stream. 
private	TokenNameprivate	
long	TokenNamelong	
readUntil	TokenNameIdentifier	 read Until
(	TokenNameLPAREN	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// We've already got enough data cached 	TokenNameCOMMENT_LINE	We've already got enough data cached 
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// pos >= length but length isn't getting any bigger, so return it 	TokenNameCOMMENT_LINE	pos >= length but length isn't getting any bigger, so return it 
if	TokenNameif	
(	TokenNameLPAREN	
foundEOS	TokenNameIdentifier	 found EOS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
sector	TokenNameIdentifier	 sector
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>>	TokenNameRIGHT_SHIFT	
SECTOR_SHIFT	TokenNameIdentifier	 SECTOR  SHIFT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// First unread sector 	TokenNameCOMMENT_LINE	First unread sector 
int	TokenNameint	
startSector	TokenNameIdentifier	 start Sector
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
>>	TokenNameRIGHT_SHIFT	
SECTOR_SHIFT	TokenNameIdentifier	 SECTOR  SHIFT
;	TokenNameSEMICOLON	
// Read sectors until the desired sector 	TokenNameCOMMENT_LINE	Read sectors until the desired sector 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
startSector	TokenNameIdentifier	 start Sector
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
sector	TokenNameIdentifier	 sector
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
SECTOR_SIZE	TokenNameIdentifier	 SECTOR  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Read up to SECTOR_SIZE bytes 	TokenNameCOMMENT_LINE	Read up to SECTOR_SIZE bytes 
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
SECTOR_SIZE	TokenNameIdentifier	 SECTOR  SIZE
;	TokenNameSEMICOLON	
int	TokenNameint	
off	TokenNameIdentifier	 off
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nbytes	TokenNameIdentifier	 nbytes
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Found the end-of-stream 	TokenNameCOMMENT_LINE	Found the end-of-stream 
if	TokenNameif	
(	TokenNameLPAREN	
nbytes	TokenNameIdentifier	 nbytes
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundEOS	TokenNameIdentifier	 found EOS
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
nbytes	TokenNameIdentifier	 nbytes
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
-=	TokenNameMINUS_EQUAL	
nbytes	TokenNameIdentifier	 nbytes
;	TokenNameSEMICOLON	
// Record new data length 	TokenNameCOMMENT_LINE	Record new data length 
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
nbytes	TokenNameIdentifier	 nbytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>true</code> since all * <code>MemoryCacheSeekableStream</code> instances support seeking * backwards. */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> since all <code>MemoryCacheSeekableStream</code> instances support seeking backwards. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canSeekBackwards	TokenNameIdentifier	 can Seek Backwards
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current offset in this file. * * @return the offset from the beginning of the file, in bytes, * at which the next read occurs. */	TokenNameCOMMENT_JAVADOC	 Returns the current offset in this file. * @return the offset from the beginning of the file, in bytes, at which the next read occurs. 
public	TokenNamepublic	
long	TokenNamelong	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pointer	TokenNameIdentifier	 pointer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the file-pointer offset, measured from the beginning of this * file, at which the next read occurs. * * @param pos the offset position, measured in bytes from the * beginning of the file, at which to set the file * pointer. * @exception IOException if <code>pos</code> is less than * <code>0</code> or if an I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Sets the file-pointer offset, measured from the beginning of this file, at which the next read occurs. * @param pos the offset position, measured in bytes from the beginning of the file, at which to set the file pointer. @exception IOException if <code>pos</code> is less than <code>0</code> or if an I/O error occurs. 
public	TokenNamepublic	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"MemoryCacheSeekableStream0"	TokenNameStringLiteral	MemoryCacheSeekableStream0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads the next byte of data from the input stream. The value byte is * returned as an <code>int</code> in the range <code>0</code> to * <code>255</code>. If no byte is available because the end of the stream * has been reached, the value <code>-1</code> is returned. This method * blocks until input data is available, the end of the stream is detected, * or an exception is thrown. * * @return the next byte of data, or <code>-1</code> if the end of the * stream is reached. */	TokenNameCOMMENT_JAVADOC	 Reads the next byte of data from the input stream. The value byte is returned as an <code>int</code> in the range <code>0</code> to <code>255</code>. If no byte is available because the end of the stream has been reached, the value <code>-1</code> is returned. This method blocks until input data is available, the end of the stream is detected, or an exception is thrown. * @return the next byte of data, or <code>-1</code> if the end of the stream is reached. 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
pointer	TokenNameIdentifier	 pointer
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
readUntil	TokenNameIdentifier	 read Until
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
>>	TokenNameRIGHT_SHIFT	
SECTOR_SHIFT	TokenNameIdentifier	 SECTOR  SHIFT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
++	TokenNamePLUS_PLUS	
&	TokenNameAND	
SECTOR_MASK	TokenNameIdentifier	 SECTOR  MASK
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reads up to <code>len</code> bytes of data from the input stream into * an array of bytes. An attempt is made to read as many as * <code>len</code> bytes, but a smaller number may be read, possibly * zero. The number of bytes actually read is returned as an integer. * * <p> This method blocks until input data is available, end of file is * detected, or an exception is thrown. * * <p> If <code>b</code> is <code>null</code>, a * <code>NullPointerException</code> is thrown. * * <p> If <code>off</code> is negative, or <code>len</code> is negative, or * <code>off+len</code> is greater than the length of the array * <code>b</code>, then an <code>IndexOutOfBoundsException</code> is * thrown. * * <p> If <code>len</code> is zero, then no bytes are read and * <code>0</code> is returned; otherwise, there is an attempt to read at * least one byte. If no byte is available because the stream is at end of * file, the value <code>-1</code> is returned; otherwise, at least one * byte is read and stored into <code>b</code>. * * <p> The first byte read is stored into element <code>b[off]</code>, the * next one into <code>b[off+1]</code>, and so on. The number of bytes read * is, at most, equal to <code>len</code>. Let <i>k</i> be the number of * bytes actually read; these bytes will be stored in elements * <code>b[off]</code> through <code>b[off+</code><i>k</i><code>-1]</code>, * leaving elements <code>b[off+</code><i>k</i><code>]</code> through * <code>b[off+len-1]</code> unaffected. * * <p> In every case, elements <code>b[0]</code> through * <code>b[off]</code> and elements <code>b[off+len]</code> through * <code>b[b.length-1]</code> are unaffected. * * <p> If the first byte cannot be read for any reason other than end of * file, then an <code>IOException</code> is thrown. In particular, an * <code>IOException</code> is thrown if the input stream has been closed. * * @param b the buffer into which the data is read. * @param off the start offset in array <code>b</code> * at which the data is written. * @param len the maximum number of bytes to read. * @return the total number of bytes read into the buffer, or * <code>-1</code> if there is no more data because the end of * the stream has been reached. */	TokenNameCOMMENT_JAVADOC	 Reads up to <code>len</code> bytes of data from the input stream into an array of bytes. An attempt is made to read as many as <code>len</code> bytes, but a smaller number may be read, possibly zero. The number of bytes actually read is returned as an integer. * <p> This method blocks until input data is available, end of file is detected, or an exception is thrown. * <p> If <code>b</code> is <code>null</code>, a <code>NullPointerException</code> is thrown. * <p> If <code>off</code> is negative, or <code>len</code> is negative, or <code>off+len</code> is greater than the length of the array <code>b</code>, then an <code>IndexOutOfBoundsException</code> is thrown. * <p> If <code>len</code> is zero, then no bytes are read and <code>0</code> is returned; otherwise, there is an attempt to read at least one byte. If no byte is available because the stream is at end of file, the value <code>-1</code> is returned; otherwise, at least one byte is read and stored into <code>b</code>. * <p> The first byte read is stored into element <code>b[off]</code>, the next one into <code>b[off+1]</code>, and so on. The number of bytes read is, at most, equal to <code>len</code>. Let <i>k</i> be the number of bytes actually read; these bytes will be stored in elements <code>b[off]</code> through <code>b[off+</code><i>k</i><code>-1]</code>, leaving elements <code>b[off+</code><i>k</i><code>]</code> through <code>b[off+len-1]</code> unaffected. * <p> In every case, elements <code>b[0]</code> through <code>b[off]</code> and elements <code>b[off+len]</code> through <code>b[b.length-1]</code> are unaffected. * <p> If the first byte cannot be read for any reason other than end of file, then an <code>IOException</code> is thrown. In particular, an <code>IOException</code> is thrown if the input stream has been closed. * @param b the buffer into which the data is read. @param off the start offset in array <code>b</code> at which the data is written. @param len the maximum number of bytes to read. @return the total number of bytes read into the buffer, or <code>-1</code> if there is no more data because the end of the stream has been reached. 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
readUntil	TokenNameIdentifier	 read Until
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// End-of-stream 	TokenNameCOMMENT_LINE	End-of-stream 
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<=	TokenNameLESS_EQUAL	
pointer	TokenNameIdentifier	 pointer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
>>	TokenNameRIGHT_SHIFT	
SECTOR_SHIFT	TokenNameIdentifier	 SECTOR  SHIFT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nbytes	TokenNameIdentifier	 nbytes
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
SECTOR_SIZE	TokenNameIdentifier	 SECTOR  SIZE
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
&	TokenNameAND	
SECTOR_MASK	TokenNameIdentifier	 SECTOR  MASK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
&	TokenNameAND	
SECTOR_MASK	TokenNameIdentifier	 SECTOR  MASK
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
nbytes	TokenNameIdentifier	 nbytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pointer	TokenNameIdentifier	 pointer
+=	TokenNamePLUS_EQUAL	
nbytes	TokenNameIdentifier	 nbytes
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nbytes	TokenNameIdentifier	 nbytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
