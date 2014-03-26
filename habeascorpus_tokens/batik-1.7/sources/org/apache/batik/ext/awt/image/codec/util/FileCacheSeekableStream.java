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
File	TokenNameIdentifier	 File
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
RandomAccessFile	TokenNameIdentifier	 Random Access File
;	TokenNameSEMICOLON	
/** * A subclass of <code>SeekableStream</code> that may be used to wrap * a regular <code>InputStream</code>. Seeking backwards is supported * by means of a file cache. In circumstances that do not allow the * creation of a temporary file (for example, due to security * consideration or the absence of local disk), the * <code>MemoryCacheSeekableStream</code> class may be used instead. * * <p> The <code>mark()</code> and <code>reset()</code> methods are * supported. * * <p><b> This class is not a committed part of the JAI API. It may * be removed or changed in future releases of JAI.</b> * * @version $Id: FileCacheSeekableStream.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A subclass of <code>SeekableStream</code> that may be used to wrap a regular <code>InputStream</code>. Seeking backwards is supported by means of a file cache. In circumstances that do not allow the creation of a temporary file (for example, due to security consideration or the absence of local disk), the <code>MemoryCacheSeekableStream</code> class may be used instead. * <p> The <code>mark()</code> and <code>reset()</code> methods are supported. * <p><b> This class is not a committed part of the JAI API. It may be removed or changed in future releases of JAI.</b> * @version $Id: FileCacheSeekableStream.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
FileCacheSeekableStream	TokenNameIdentifier	 File Cache Seekable Stream
extends	TokenNameextends	
SeekableStream	TokenNameIdentifier	 Seekable Stream
{	TokenNameLBRACE	
/** The source stream. */	TokenNameCOMMENT_JAVADOC	 The source stream. 
private	TokenNameprivate	
InputStream	TokenNameIdentifier	 Input Stream
stream	TokenNameIdentifier	 stream
;	TokenNameSEMICOLON	
/** The cache File. */	TokenNameCOMMENT_JAVADOC	 The cache File. 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
cacheFile	TokenNameIdentifier	 cache File
;	TokenNameSEMICOLON	
/** The cache as a RandomAcessFile. */	TokenNameCOMMENT_JAVADOC	 The cache as a RandomAcessFile. 
private	TokenNameprivate	
RandomAccessFile	TokenNameIdentifier	 Random Access File
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
/** The length of the read buffer. */	TokenNameCOMMENT_JAVADOC	 The length of the read buffer. 
private	TokenNameprivate	
int	TokenNameint	
bufLen	TokenNameIdentifier	 buf Len
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The read buffer. */	TokenNameCOMMENT_JAVADOC	 The read buffer. 
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
bufLen	TokenNameIdentifier	 buf Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Number of bytes in the cache. */	TokenNameCOMMENT_JAVADOC	 Number of bytes in the cache. 
private	TokenNameprivate	
long	TokenNamelong	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Next byte to be read. */	TokenNameCOMMENT_JAVADOC	 Next byte to be read. 
private	TokenNameprivate	
long	TokenNamelong	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** True if we've encountered the end of the source stream. */	TokenNameCOMMENT_JAVADOC	 True if we've encountered the end of the source stream. 
private	TokenNameprivate	
boolean	TokenNameboolean	
foundEOF	TokenNameIdentifier	 found EOF
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Constructs a <code>MemoryCacheSeekableStream</code> that takes * its source data from a regular <code>InputStream</code>. * Seeking backwards is supported by means of an file cache. * * <p> An <code>IOException</code> will be thrown if the * attempt to create the cache file fails for any reason. */	TokenNameCOMMENT_JAVADOC	 Constructs a <code>MemoryCacheSeekableStream</code> that takes its source data from a regular <code>InputStream</code>. Seeking backwards is supported by means of an file cache. * <p> An <code>IOException</code> will be thrown if the attempt to create the cache file fails for any reason. 
public	TokenNamepublic	
FileCacheSeekableStream	TokenNameIdentifier	 File Cache Seekable Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cacheFile	TokenNameIdentifier	 cache File
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"jai-FCSS-"	TokenNameStringLiteral	jai-FCSS-
,	TokenNameCOMMA	
".tmp"	TokenNameStringLiteral	.tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cacheFile	TokenNameIdentifier	 cache File
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
RandomAccessFile	TokenNameIdentifier	 Random Access File
(	TokenNameLPAREN	
cacheFile	TokenNameIdentifier	 cache File
,	TokenNameCOMMA	
"rw"	TokenNameStringLiteral	rw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ensures that at least <code>pos</code> bytes are cached, * or the end of the source is reached. The return value * is equal to the smaller of <code>pos</code> and the * length of the source file. */	TokenNameCOMMENT_JAVADOC	 Ensures that at least <code>pos</code> bytes are cached, or the end of the source is reached. The return value is equal to the smaller of <code>pos</code> and the length of the source file. 
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
foundEOF	TokenNameIdentifier	 found EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Copy a buffer's worth of data from the source to the cache 	TokenNameCOMMENT_LINE	Copy a buffer's worth of data from the source to the cache 
// bufLen will always fit into an int so this is safe 	TokenNameCOMMENT_LINE	bufLen will always fit into an int so this is safe 
int	TokenNameint	
nbytes	TokenNameIdentifier	 nbytes
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
bufLen	TokenNameIdentifier	 buf Len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nbytes	TokenNameIdentifier	 nbytes
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundEOF	TokenNameIdentifier	 found EOF
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
nbytes	TokenNameIdentifier	 nbytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nbytes	TokenNameIdentifier	 nbytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
-=	TokenNameMINUS_EQUAL	
nbytes	TokenNameIdentifier	 nbytes
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
nbytes	TokenNameIdentifier	 nbytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>true</code> since all * <code>FileCacheSeekableStream</code> instances support seeking * backwards. */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> since all <code>FileCacheSeekableStream</code> instances support seeking backwards. 
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
"FileCacheSeekableStream0"	TokenNameStringLiteral	FileCacheSeekableStream0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads the next byte of data from the input stream. The value byte is * returned as an <code>int</code> in the range <code>0</code> to * <code>255</code>. If no byte is available because the end of the stream * has been reached, the value <code>-1</code> is returned. This method * blocks until input data is available, the end of the stream is detected, * or an exception is thrown. * * @return the next byte of data, or <code>-1</code> if the end of the * stream is reached. * @exception IOException if an I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Reads the next byte of data from the input stream. The value byte is returned as an <code>int</code> in the range <code>0</code> to <code>255</code>. If no byte is available because the end of the stream has been reached, the value <code>-1</code> is returned. This method blocks until input data is available, the end of the stream is detected, or an exception is thrown. * @return the next byte of data, or <code>-1</code> if the end of the stream is reached. @exception IOException if an I/O error occurs. 
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
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
/** * Reads up to <code>len</code> bytes of data from the input stream into * an array of bytes. An attempt is made to read as many as * <code>len</code> bytes, but a smaller number may be read, possibly * zero. The number of bytes actually read is returned as an integer. * * <p> This method blocks until input data is available, end of file is * detected, or an exception is thrown. * * <p> If <code>b</code> is <code>null</code>, a * <code>NullPointerException</code> is thrown. * * <p> If <code>off</code> is negative, or <code>len</code> is negative, or * <code>off+len</code> is greater than the length of the array * <code>b</code>, then an <code>IndexOutOfBoundsException</code> is * thrown. * * <p> If <code>len</code> is zero, then no bytes are read and * <code>0</code> is returned; otherwise, there is an attempt to read at * least one byte. If no byte is available because the stream is at end of * file, the value <code>-1</code> is returned; otherwise, at least one * byte is read and stored into <code>b</code>. * * <p> The first byte read is stored into element <code>b[off]</code>, the * next one into <code>b[off+1]</code>, and so on. The number of bytes read * is, at most, equal to <code>len</code>. Let <i>k</i> be the number of * bytes actually read; these bytes will be stored in elements * <code>b[off]</code> through <code>b[off+</code><i>k</i><code>-1]</code>, * leaving elements <code>b[off+</code><i>k</i><code>]</code> through * <code>b[off+len-1]</code> unaffected. * * <p> In every case, elements <code>b[0]</code> through * <code>b[off]</code> and elements <code>b[off+len]</code> through * <code>b[b.length-1]</code> are unaffected. * * <p> If the first byte cannot be read for any reason other than end of * file, then an <code>IOException</code> is thrown. In particular, an * <code>IOException</code> is thrown if the input stream has been closed. * * @param b the buffer into which the data is read. * @param off the start offset in array <code>b</code> * at which the data is written. * @param len the maximum number of bytes to read. * @return the total number of bytes read into the buffer, or * <code>-1</code> if there is no more data because the end of * the stream has been reached. * @exception IOException if an I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Reads up to <code>len</code> bytes of data from the input stream into an array of bytes. An attempt is made to read as many as <code>len</code> bytes, but a smaller number may be read, possibly zero. The number of bytes actually read is returned as an integer. * <p> This method blocks until input data is available, end of file is detected, or an exception is thrown. * <p> If <code>b</code> is <code>null</code>, a <code>NullPointerException</code> is thrown. * <p> If <code>off</code> is negative, or <code>len</code> is negative, or <code>off+len</code> is greater than the length of the array <code>b</code>, then an <code>IndexOutOfBoundsException</code> is thrown. * <p> If <code>len</code> is zero, then no bytes are read and <code>0</code> is returned; otherwise, there is an attempt to read at least one byte. If no byte is available because the stream is at end of file, the value <code>-1</code> is returned; otherwise, at least one byte is read and stored into <code>b</code>. * <p> The first byte read is stored into element <code>b[off]</code>, the next one into <code>b[off+1]</code>, and so on. The number of bytes read is, at most, equal to <code>len</code>. Let <i>k</i> be the number of bytes actually read; these bytes will be stored in elements <code>b[off]</code> through <code>b[off+</code><i>k</i><code>-1]</code>, leaving elements <code>b[off+</code><i>k</i><code>]</code> through <code>b[off+len-1]</code> unaffected. * <p> In every case, elements <code>b[0]</code> through <code>b[off]</code> and elements <code>b[off+len]</code> through <code>b[b.length-1]</code> are unaffected. * <p> If the first byte cannot be read for any reason other than end of file, then an <code>IOException</code> is thrown. In particular, an <code>IOException</code> is thrown if the input stream has been closed. * @param b the buffer into which the data is read. @param off the start offset in array <code>b</code> at which the data is written. @param len the maximum number of bytes to read. @return the total number of bytes read into the buffer, or <code>-1</code> if there is no more data because the end of the stream has been reached. @exception IOException if an I/O error occurs. 
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
// len will always fit into an int so this is safe 	TokenNameCOMMENT_LINE	len will always fit into an int so this is safe 
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
pointer	TokenNameIdentifier	 pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pointer	TokenNameIdentifier	 pointer
+=	TokenNamePLUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
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
/** * Closes this stream and releases any system resources * associated with the stream. * * @throws IOException if an I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Closes this stream and releases any system resources associated with the stream. * @throws IOException if an I/O error occurs. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cacheFile	TokenNameIdentifier	 cache File
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
