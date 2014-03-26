/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * This package is based on the work done by Keiron Liddle, Aftex Software * <keiron@aftexsw.com> to whom the Ant project is very grateful for his * great code. */	TokenNameCOMMENT_BLOCK	 This package is based on the work done by Keiron Liddle, Aftex Software <keiron@aftexsw.com> to whom the Ant project is very grateful for his great code. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
bzip2	TokenNameIdentifier	 bzip2
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
/** * An input stream that decompresses from the BZip2 format (without the file * header chars) to be read as any other stream. * * <p>The decompression requires large amounts of memory. Thus you * should call the {@link #close() close()} method as soon as * possible, to force <tt>CBZip2InputStream</tt> to release the * allocated memory. See {@link CBZip2OutputStream * CBZip2OutputStream} for information about memory usage.</p> * * <p><tt>CBZip2InputStream</tt> reads bytes from the compressed * source stream via the single byte {@link java.io.InputStream#read() * read()} method exclusively. Thus you should consider to use a * buffered source stream.</p> * * <p>Instances of this class are not threadsafe.</p> */	TokenNameCOMMENT_JAVADOC	 An input stream that decompresses from the BZip2 format (without the file header chars) to be read as any other stream. * <p>The decompression requires large amounts of memory. Thus you should call the {@link #close() close()} method as soon as possible, to force <tt>CBZip2InputStream</tt> to release the allocated memory. See {@link CBZip2OutputStream CBZip2OutputStream} for information about memory usage.</p> * <p><tt>CBZip2InputStream</tt> reads bytes from the compressed source stream via the single byte {@link java.io.InputStream#read() read()} method exclusively. Thus you should consider to use a buffered source stream.</p> * <p>Instances of this class are not threadsafe.</p> 
public	TokenNamepublic	
class	TokenNameclass	
CBZip2InputStream	TokenNameIdentifier	 CB Zip2 Input Stream
extends	TokenNameextends	
InputStream	TokenNameIdentifier	 Input Stream
implements	TokenNameimplements	
BZip2Constants	TokenNameIdentifier	 B Zip2 Constants
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
reportCRCError	TokenNameIdentifier	 report CRC Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// The clean way would be to throw an exception. 	TokenNameCOMMENT_LINE	The clean way would be to throw an exception. 
//throw new IOException("crc error"); 	TokenNameCOMMENT_LINE	throw new IOException("crc error"); 
// Just print a message, like the previous versions of this class did 	TokenNameCOMMENT_LINE	Just print a message, like the previous versions of this class did 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"BZip2 CRC error"	TokenNameStringLiteral	BZip2 CRC error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
makeMaps	TokenNameIdentifier	 make Maps
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inUse	TokenNameIdentifier	 in Use
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
inUse	TokenNameIdentifier	 in Use
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
seqToUnseq	TokenNameIdentifier	 seq To Unseq
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
seqToUnseq	TokenNameIdentifier	 seq To Unseq
;	TokenNameSEMICOLON	
int	TokenNameint	
nInUseShadow	TokenNameIdentifier	 n In Use Shadow
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
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inUse	TokenNameIdentifier	 in Use
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
seqToUnseq	TokenNameIdentifier	 seq To Unseq
[	TokenNameLBRACKET	
nInUseShadow	TokenNameIdentifier	 n In Use Shadow
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nInUse	TokenNameIdentifier	 n In Use
=	TokenNameEQUAL	
nInUseShadow	TokenNameIdentifier	 n In Use Shadow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Index of the last char in the block, so the block size == last + 1. */	TokenNameCOMMENT_JAVADOC	 Index of the last char in the block, so the block size == last + 1. 
private	TokenNameprivate	
int	TokenNameint	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
/** * Index in zptr[] of original string after sorting. */	TokenNameCOMMENT_JAVADOC	 Index in zptr[] of original string after sorting. 
private	TokenNameprivate	
int	TokenNameint	
origPtr	TokenNameIdentifier	 orig Ptr
;	TokenNameSEMICOLON	
/** * always: in the range 0 .. 9. * The current block size is 100000 * this number. */	TokenNameCOMMENT_JAVADOC	 always: in the range 0 .. 9. The current block size is 100000 this number. 
private	TokenNameprivate	
int	TokenNameint	
blockSize100k	TokenNameIdentifier	 block Size100k
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
blockRandomised	TokenNameIdentifier	 block Randomised
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
bsBuff	TokenNameIdentifier	 bs Buff
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
bsLive	TokenNameIdentifier	 bs Live
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CRC	TokenNameIdentifier	 CRC
crc	TokenNameIdentifier	 crc
=	TokenNameEQUAL	
new	TokenNamenew	
CRC	TokenNameIdentifier	 CRC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nInUse	TokenNameIdentifier	 n In Use
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currentChar	TokenNameIdentifier	 current Char
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EOF	TokenNameIdentifier	 EOF
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
START_BLOCK_STATE	TokenNameIdentifier	 START  BLOCK  STATE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RAND_PART_A_STATE	TokenNameIdentifier	 RAND  PART  A  STATE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RAND_PART_B_STATE	TokenNameIdentifier	 RAND  PART  B  STATE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RAND_PART_C_STATE	TokenNameIdentifier	 RAND  PART  C  STATE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NO_RAND_PART_A_STATE	TokenNameIdentifier	 NO  RAND  PART  A  STATE
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NO_RAND_PART_B_STATE	TokenNameIdentifier	 NO  RAND  PART  B  STATE
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NO_RAND_PART_C_STATE	TokenNameIdentifier	 NO  RAND  PART  C  STATE
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currentState	TokenNameIdentifier	 current State
=	TokenNameEQUAL	
START_BLOCK_STATE	TokenNameIdentifier	 START  BLOCK  STATE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
storedBlockCRC	TokenNameIdentifier	 stored Block CRC
,	TokenNameCOMMA	
storedCombinedCRC	TokenNameIdentifier	 stored Combined CRC
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
computedBlockCRC	TokenNameIdentifier	 computed Block CRC
,	TokenNameCOMMA	
computedCombinedCRC	TokenNameIdentifier	 computed Combined CRC
;	TokenNameSEMICOLON	
// Variables used by setup* methods exclusively 	TokenNameCOMMENT_LINE	Variables used by setup* methods exclusively 
private	TokenNameprivate	
int	TokenNameint	
su_count	TokenNameIdentifier	 su count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
su_ch2	TokenNameIdentifier	 su ch2
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
su_chPrev	TokenNameIdentifier	 su ch Prev
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
su_i2	TokenNameIdentifier	 su i2
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
su_j2	TokenNameIdentifier	 su j2
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
su_rNToGo	TokenNameIdentifier	 su r N To Go
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
su_rTPos	TokenNameIdentifier	 su r T Pos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
su_tPos	TokenNameIdentifier	 su t Pos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
char	TokenNamechar	
su_z	TokenNameIdentifier	 su z
;	TokenNameSEMICOLON	
/** * All memory intensive stuff. * This field is initialized by initBlock(). */	TokenNameCOMMENT_JAVADOC	 All memory intensive stuff. This field is initialized by initBlock(). 
private	TokenNameprivate	
CBZip2InputStream	TokenNameIdentifier	 CB Zip2 Input Stream
.	TokenNameDOT	
Data	TokenNameIdentifier	 Data
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
/** * Constructs a new CBZip2InputStream which decompresses bytes read from * the specified stream. * * <p>Although BZip2 headers are marked with the magic * <tt>"Bz"</tt> this constructor expects the next byte in the * stream to be the first one after the magic. Thus callers have * to skip the first two bytes. Otherwise this constructor will * throw an exception. </p> * * @throws IOException * if the stream content is malformed or an I/O error occurs. * @throws NullPointerException * if <tt>in == null</tt> */	TokenNameCOMMENT_JAVADOC	 Constructs a new CBZip2InputStream which decompresses bytes read from the specified stream. * <p>Although BZip2 headers are marked with the magic <tt>"Bz"</tt> this constructor expects the next byte in the stream to be the first one after the magic. Thus callers have to skip the first two bytes. Otherwise this constructor will throw an exception. </p> * @throws IOException if the stream content is malformed or an I/O error occurs. @throws NullPointerException if <tt>in == null</tt> 
public	TokenNamepublic	
CBZip2InputStream	TokenNameIdentifier	 CB Zip2 Input Stream
(	TokenNameLPAREN	
final	TokenNamefinal	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
read0	TokenNameIdentifier	 read0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"stream closed"	TokenNameStringLiteral	stream closed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offs	TokenNameIdentifier	 offs
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offs	TokenNameIdentifier	 offs
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"offs("	TokenNameStringLiteral	offs(
+	TokenNamePLUS	
offs	TokenNameIdentifier	 offs
+	TokenNamePLUS	
") < 0."	TokenNameStringLiteral	) < 0.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"len("	TokenNameStringLiteral	len(
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
") < 0."	TokenNameStringLiteral	) < 0.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offs	TokenNameIdentifier	 offs
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"offs("	TokenNameStringLiteral	offs(
+	TokenNamePLUS	
offs	TokenNameIdentifier	 offs
+	TokenNamePLUS	
") + len("	TokenNameStringLiteral	) + len(
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
") > dest.length("	TokenNameStringLiteral	) > dest.length(
+	TokenNamePLUS	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
")."	TokenNameStringLiteral	).
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"stream closed"	TokenNameStringLiteral	stream closed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
offs	TokenNameIdentifier	 offs
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
int	TokenNameint	
destOffs	TokenNameIdentifier	 dest Offs
=	TokenNameEQUAL	
offs	TokenNameIdentifier	 offs
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
destOffs	TokenNameIdentifier	 dest Offs
<	TokenNameLESS	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
read0	TokenNameIdentifier	 read0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
destOffs	TokenNameIdentifier	 dest Offs
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
destOffs	TokenNameIdentifier	 dest Offs
==	TokenNameEQUAL_EQUAL	
offs	TokenNameIdentifier	 offs
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
destOffs	TokenNameIdentifier	 dest Offs
-	TokenNameMINUS	
offs	TokenNameIdentifier	 offs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
read0	TokenNameIdentifier	 read0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
retChar	TokenNameIdentifier	 ret Char
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
currentChar	TokenNameIdentifier	 current Char
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
currentState	TokenNameIdentifier	 current State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
EOF	TokenNameIdentifier	 EOF
:	TokenNameCOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
START_BLOCK_STATE	TokenNameIdentifier	 START  BLOCK  STATE
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
RAND_PART_A_STATE	TokenNameIdentifier	 RAND  PART  A  STATE
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
RAND_PART_B_STATE	TokenNameIdentifier	 RAND  PART  B  STATE
:	TokenNameCOLON	
setupRandPartB	TokenNameIdentifier	 setup Rand Part B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
RAND_PART_C_STATE	TokenNameIdentifier	 RAND  PART  C  STATE
:	TokenNameCOLON	
setupRandPartC	TokenNameIdentifier	 setup Rand Part C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
NO_RAND_PART_A_STATE	TokenNameIdentifier	 NO  RAND  PART  A  STATE
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
NO_RAND_PART_B_STATE	TokenNameIdentifier	 NO  RAND  PART  B  STATE
:	TokenNameCOLON	
setupNoRandPartB	TokenNameIdentifier	 setup No Rand Part B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
NO_RAND_PART_C_STATE	TokenNameIdentifier	 NO  RAND  PART  C  STATE
:	TokenNameCOLON	
setupNoRandPartC	TokenNameIdentifier	 setup No Rand Part C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
retChar	TokenNameIdentifier	 ret Char
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"No InputStream"	TokenNameStringLiteral	No InputStream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Empty InputStream"	TokenNameStringLiteral	Empty InputStream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
magic2	TokenNameIdentifier	 magic2
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
magic2	TokenNameIdentifier	 magic2
!=	TokenNameNOT_EQUAL	
'h'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Stream is not BZip2 formatted: expected 'h'"	TokenNameStringLiteral	Stream is not BZip2 formatted: expected 'h'
+	TokenNamePLUS	
" as first byte but got '"	TokenNameStringLiteral	 as first byte but got '
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
magic2	TokenNameIdentifier	 magic2
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
<	TokenNameLESS	
'1'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
>	TokenNameGREATER	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Stream is not BZip2 formatted: illegal "	TokenNameStringLiteral	Stream is not BZip2 formatted: illegal 
+	TokenNamePLUS	
"blocksize "	TokenNameStringLiteral	blocksize 
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
blockSize100k	TokenNameIdentifier	 block Size100k
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
initBlock	TokenNameIdentifier	 init Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setupBlock	TokenNameIdentifier	 setup Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
initBlock	TokenNameIdentifier	 init Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
char	TokenNamechar	
magic0	TokenNameIdentifier	 magic0
=	TokenNameEQUAL	
bsGetUByte	TokenNameIdentifier	 bs Get U Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
magic1	TokenNameIdentifier	 magic1
=	TokenNameEQUAL	
bsGetUByte	TokenNameIdentifier	 bs Get U Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
magic2	TokenNameIdentifier	 magic2
=	TokenNameEQUAL	
bsGetUByte	TokenNameIdentifier	 bs Get U Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
magic3	TokenNameIdentifier	 magic3
=	TokenNameEQUAL	
bsGetUByte	TokenNameIdentifier	 bs Get U Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
magic4	TokenNameIdentifier	 magic4
=	TokenNameEQUAL	
bsGetUByte	TokenNameIdentifier	 bs Get U Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
magic5	TokenNameIdentifier	 magic5
=	TokenNameEQUAL	
bsGetUByte	TokenNameIdentifier	 bs Get U Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
magic0	TokenNameIdentifier	 magic0
==	TokenNameEQUAL_EQUAL	
0x17	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
magic1	TokenNameIdentifier	 magic1
==	TokenNameEQUAL_EQUAL	
0x72	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
magic2	TokenNameIdentifier	 magic2
==	TokenNameEQUAL_EQUAL	
0x45	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
magic3	TokenNameIdentifier	 magic3
==	TokenNameEQUAL_EQUAL	
0x38	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
magic4	TokenNameIdentifier	 magic4
==	TokenNameEQUAL_EQUAL	
0x50	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
magic5	TokenNameIdentifier	 magic5
==	TokenNameEQUAL_EQUAL	
0x90	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
complete	TokenNameIdentifier	 complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// end of file 	TokenNameCOMMENT_LINE	end of file 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
magic0	TokenNameIdentifier	 magic0
!=	TokenNameNOT_EQUAL	
0x31	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
// '1' 	TokenNameCOMMENT_LINE	'1' 
magic1	TokenNameIdentifier	 magic1
!=	TokenNameNOT_EQUAL	
0x41	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
// ')' 	TokenNameCOMMENT_LINE	')' 
magic2	TokenNameIdentifier	 magic2
!=	TokenNameNOT_EQUAL	
0x59	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
// 'Y' 	TokenNameCOMMENT_LINE	'Y' 
magic3	TokenNameIdentifier	 magic3
!=	TokenNameNOT_EQUAL	
0x26	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
// '&' 	TokenNameCOMMENT_LINE	'&' 
magic4	TokenNameIdentifier	 magic4
!=	TokenNameNOT_EQUAL	
0x53	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
// 'S' 	TokenNameCOMMENT_LINE	'S' 
magic5	TokenNameIdentifier	 magic5
!=	TokenNameNOT_EQUAL	
0x59	TokenNameIntegerLiteral	
// 'Y' 	TokenNameCOMMENT_LINE	'Y' 
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
currentState	TokenNameIdentifier	 current State
=	TokenNameEQUAL	
EOF	TokenNameIdentifier	 EOF
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"bad block header"	TokenNameStringLiteral	bad block header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
storedBlockCRC	TokenNameIdentifier	 stored Block CRC
=	TokenNameEQUAL	
bsGetInt	TokenNameIdentifier	 bs Get Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
blockRandomised	TokenNameIdentifier	 block Randomised
=	TokenNameEQUAL	
bsR	TokenNameIdentifier	 bs R
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Allocate data here instead in constructor, so we do not * allocate it if the input file is empty. */	TokenNameCOMMENT_JAVADOC	 Allocate data here instead in constructor, so we do not allocate it if the input file is empty. 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
Data	TokenNameIdentifier	 Data
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
blockSize100k	TokenNameIdentifier	 block Size100k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// currBlockNo++; 	TokenNameCOMMENT_LINE	currBlockNo++; 
getAndMoveToFrontDecode	TokenNameIdentifier	 get And Move To Front Decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
initialiseCRC	TokenNameIdentifier	 initialise CRC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentState	TokenNameIdentifier	 current State
=	TokenNameEQUAL	
START_BLOCK_STATE	TokenNameIdentifier	 START  BLOCK  STATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
endBlock	TokenNameIdentifier	 end Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
computedBlockCRC	TokenNameIdentifier	 computed Block CRC
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
getFinalCRC	TokenNameIdentifier	 get Final CRC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// A bad CRC is considered a fatal error. 	TokenNameCOMMENT_LINE	A bad CRC is considered a fatal error. 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
storedBlockCRC	TokenNameIdentifier	 stored Block CRC
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
computedBlockCRC	TokenNameIdentifier	 computed Block CRC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make next blocks readable without error 	TokenNameCOMMENT_LINE	make next blocks readable without error 
// (repair feature, not yet documented, not tested) 	TokenNameCOMMENT_LINE	(repair feature, not yet documented, not tested) 
this	TokenNamethis	
.	TokenNameDOT	
computedCombinedCRC	TokenNameIdentifier	 computed Combined CRC
=	TokenNameEQUAL	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
storedCombinedCRC	TokenNameIdentifier	 stored Combined CRC
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
storedCombinedCRC	TokenNameIdentifier	 stored Combined CRC
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
computedCombinedCRC	TokenNameIdentifier	 computed Combined CRC
^=	TokenNameXOR_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
storedBlockCRC	TokenNameIdentifier	 stored Block CRC
;	TokenNameSEMICOLON	
reportCRCError	TokenNameIdentifier	 report CRC Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
computedCombinedCRC	TokenNameIdentifier	 computed Combined CRC
=	TokenNameEQUAL	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
computedCombinedCRC	TokenNameIdentifier	 computed Combined CRC
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
computedCombinedCRC	TokenNameIdentifier	 computed Combined CRC
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
computedCombinedCRC	TokenNameIdentifier	 computed Combined CRC
^=	TokenNameXOR_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
computedBlockCRC	TokenNameIdentifier	 computed Block CRC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
complete	TokenNameIdentifier	 complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
storedCombinedCRC	TokenNameIdentifier	 stored Combined CRC
=	TokenNameEQUAL	
bsGetInt	TokenNameIdentifier	 bs Get Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentState	TokenNameIdentifier	 current State
=	TokenNameEQUAL	
EOF	TokenNameIdentifier	 EOF
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
storedCombinedCRC	TokenNameIdentifier	 stored Combined CRC
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
computedCombinedCRC	TokenNameIdentifier	 computed Combined CRC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCRCError	TokenNameIdentifier	 report CRC Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
inShadow	TokenNameIdentifier	 in Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inShadow	TokenNameIdentifier	 in Shadow
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inShadow	TokenNameIdentifier	 in Shadow
!=	TokenNameNOT_EQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inShadow	TokenNameIdentifier	 in Shadow
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
bsR	TokenNameIdentifier	 bs R
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
;	TokenNameSEMICOLON	
int	TokenNameint	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
<	TokenNameLESS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
InputStream	TokenNameIdentifier	 Input Stream
inShadow	TokenNameIdentifier	 in Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
thech	TokenNameIdentifier	 thech
=	TokenNameEQUAL	
inShadow	TokenNameIdentifier	 in Shadow
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
thech	TokenNameIdentifier	 thech
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"unexpected end of stream"	TokenNameStringLiteral	unexpected end of stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
thech	TokenNameIdentifier	 thech
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
<	TokenNameLESS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
=	TokenNameEQUAL	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
=	TokenNameEQUAL	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-	TokenNameMINUS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-	TokenNameMINUS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
bsGetBit	TokenNameIdentifier	 bs Get Bit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
;	TokenNameSEMICOLON	
int	TokenNameint	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
thech	TokenNameIdentifier	 thech
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
thech	TokenNameIdentifier	 thech
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"unexpected end of stream"	TokenNameStringLiteral	unexpected end of stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
thech	TokenNameIdentifier	 thech
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
=	TokenNameEQUAL	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
=	TokenNameEQUAL	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
char	TokenNamechar	
bsGetUByte	TokenNameIdentifier	 bs Get U Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
bsR	TokenNameIdentifier	 bs R
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
bsGetInt	TokenNameIdentifier	 bs Get Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bsR	TokenNameIdentifier	 bs R
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
bsR	TokenNameIdentifier	 bs R
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
bsR	TokenNameIdentifier	 bs R
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
bsR	TokenNameIdentifier	 bs R
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called by createHuffmanDecodingTables() exclusively. */	TokenNameCOMMENT_JAVADOC	 Called by createHuffmanDecodingTables() exclusively. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
hbCreateDecodeTables	TokenNameIdentifier	 hb Create Decode Tables
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
perm	TokenNameIdentifier	 perm
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
minLen	TokenNameIdentifier	 min Len
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
maxLen	TokenNameIdentifier	 max Len
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
alphaSize	TokenNameIdentifier	 alpha Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
minLen	TokenNameIdentifier	 min Len
,	TokenNameCOMMA	
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
maxLen	TokenNameIdentifier	 max Len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
perm	TokenNameIdentifier	 perm
[	TokenNameLBRACKET	
pp	TokenNameIdentifier	 pp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
MAX_CODE_LEN	TokenNameIdentifier	 MAX  CODE  LEN
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
limit	TokenNameIdentifier	 limit
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
MAX_CODE_LEN	TokenNameIdentifier	 MAX  CODE  LEN
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
+=	TokenNamePLUS_EQUAL	
base	TokenNameIdentifier	 base
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
base	TokenNameIdentifier	 base
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
minLen	TokenNameIdentifier	 min Len
,	TokenNameCOMMA	
vec	TokenNameIdentifier	 vec
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
maxLen	TokenNameIdentifier	 max Len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
nb	TokenNameIdentifier	 nb
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
vec	TokenNameIdentifier	 vec
+=	TokenNamePLUS_EQUAL	
nb	TokenNameIdentifier	 nb
-	TokenNameMINUS	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
nb	TokenNameIdentifier	 nb
;	TokenNameSEMICOLON	
limit	TokenNameIdentifier	 limit
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
vec	TokenNameIdentifier	 vec
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
vec	TokenNameIdentifier	 vec
<<=	TokenNameLEFT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
minLen	TokenNameIdentifier	 min Len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
maxLen	TokenNameIdentifier	 max Len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
limit	TokenNameIdentifier	 limit
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
base	TokenNameIdentifier	 base
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
recvDecodingTables	TokenNameIdentifier	 recv Decoding Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Data	TokenNameIdentifier	 Data
dataShadow	TokenNameIdentifier	 data Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inUse	TokenNameIdentifier	 in Use
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
inUse	TokenNameIdentifier	 in Use
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
recvDecodingTables_pos	TokenNameIdentifier	 recv Decoding Tables pos
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
selector	TokenNameIdentifier	 selector
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
selector	TokenNameIdentifier	 selector
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
selectorMtf	TokenNameIdentifier	 selector Mtf
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
selectorMtf	TokenNameIdentifier	 selector Mtf
;	TokenNameSEMICOLON	
int	TokenNameint	
inUse16	TokenNameIdentifier	 in Use16
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* Receive the mapping table */	TokenNameCOMMENT_BLOCK	 Receive the mapping table 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bsGetBit	TokenNameIdentifier	 bs Get Bit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inUse16	TokenNameIdentifier	 in Use16
|=	TokenNameOR_EQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inUse	TokenNameIdentifier	 in Use
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inUse16	TokenNameIdentifier	 in Use16
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
i16	TokenNameIdentifier	 i16
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bsGetBit	TokenNameIdentifier	 bs Get Bit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inUse	TokenNameIdentifier	 in Use
[	TokenNameLBRACKET	
i16	TokenNameIdentifier	 i16
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
makeMaps	TokenNameIdentifier	 make Maps
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
alphaSize	TokenNameIdentifier	 alpha Size
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
nInUse	TokenNameIdentifier	 n In Use
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* Now the selectors */	TokenNameCOMMENT_BLOCK	 Now the selectors 
final	TokenNamefinal	
int	TokenNameint	
nGroups	TokenNameIdentifier	 n Groups
=	TokenNameEQUAL	
bsR	TokenNameIdentifier	 bs R
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
nSelectors	TokenNameIdentifier	 n Selectors
=	TokenNameEQUAL	
bsR	TokenNameIdentifier	 bs R
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
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
nSelectors	TokenNameIdentifier	 n Selectors
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bsGetBit	TokenNameIdentifier	 bs Get Bit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
selectorMtf	TokenNameIdentifier	 selector Mtf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Undo the MTF values for the selectors. */	TokenNameCOMMENT_BLOCK	 Undo the MTF values for the selectors. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
nGroups	TokenNameIdentifier	 n Groups
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
v	TokenNameIdentifier	 v
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
[	TokenNameLBRACKET	
v	TokenNameIdentifier	 v
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nSelectors	TokenNameIdentifier	 n Selectors
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
selectorMtf	TokenNameIdentifier	 selector Mtf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
[	TokenNameLBRACKET	
v	TokenNameIdentifier	 v
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// nearly all times v is zero, 4 in most other cases 	TokenNameCOMMENT_LINE	nearly all times v is zero, 4 in most other cases 
pos	TokenNameIdentifier	 pos
[	TokenNameLBRACKET	
v	TokenNameIdentifier	 v
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
[	TokenNameLBRACKET	
v	TokenNameIdentifier	 v
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
selector	TokenNameIdentifier	 selector
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
temp_charArray2d	TokenNameIdentifier	 temp char Array2d
;	TokenNameSEMICOLON	
/* Now the coding tables */	TokenNameCOMMENT_BLOCK	 Now the coding tables 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
<	TokenNameLESS	
nGroups	TokenNameIdentifier	 n Groups
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
bsR	TokenNameIdentifier	 bs R
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len_t	TokenNameIdentifier	 len t
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
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
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
bsGetBit	TokenNameIdentifier	 bs Get Bit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curr	TokenNameIdentifier	 curr
+=	TokenNamePLUS_EQUAL	
bsGetBit	TokenNameIdentifier	 bs Get Bit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
len_t	TokenNameIdentifier	 len t
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
curr	TokenNameIdentifier	 curr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// finally create the Huffman tables 	TokenNameCOMMENT_LINE	finally create the Huffman tables 
createHuffmanDecodingTables	TokenNameIdentifier	 create Huffman Decoding Tables
(	TokenNameLPAREN	
alphaSize	TokenNameIdentifier	 alpha Size
,	TokenNameCOMMA	
nGroups	TokenNameIdentifier	 n Groups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called by recvDecodingTables() exclusively. */	TokenNameCOMMENT_JAVADOC	 Called by recvDecodingTables() exclusively. 
private	TokenNameprivate	
void	TokenNamevoid	
createHuffmanDecodingTables	TokenNameIdentifier	 create Huffman Decoding Tables
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
alphaSize	TokenNameIdentifier	 alpha Size
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
nGroups	TokenNameIdentifier	 n Groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Data	TokenNameIdentifier	 Data
dataShadow	TokenNameIdentifier	 data Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
temp_charArray2d	TokenNameIdentifier	 temp char Array2d
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minLens	TokenNameIdentifier	 min Lens
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
minLens	TokenNameIdentifier	 min Lens
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
perm	TokenNameIdentifier	 perm
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
perm	TokenNameIdentifier	 perm
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
<	TokenNameLESS	
nGroups	TokenNameIdentifier	 n Groups
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
minLen	TokenNameIdentifier	 min Len
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxLen	TokenNameIdentifier	 max Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len_t	TokenNameIdentifier	 len t
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
lent	TokenNameIdentifier	 lent
=	TokenNameEQUAL	
len_t	TokenNameIdentifier	 len t
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lent	TokenNameIdentifier	 lent
>	TokenNameGREATER	
maxLen	TokenNameIdentifier	 max Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxLen	TokenNameIdentifier	 max Len
=	TokenNameEQUAL	
lent	TokenNameIdentifier	 lent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lent	TokenNameIdentifier	 lent
<	TokenNameLESS	
minLen	TokenNameIdentifier	 min Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minLen	TokenNameIdentifier	 min Len
=	TokenNameEQUAL	
lent	TokenNameIdentifier	 lent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
hbCreateDecodeTables	TokenNameIdentifier	 hb Create Decode Tables
(	TokenNameLPAREN	
limit	TokenNameIdentifier	 limit
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
perm	TokenNameIdentifier	 perm
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
minLen	TokenNameIdentifier	 min Len
,	TokenNameCOMMA	
maxLen	TokenNameIdentifier	 max Len
,	TokenNameCOMMA	
alphaSize	TokenNameIdentifier	 alpha Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
minLens	TokenNameIdentifier	 min Lens
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
minLen	TokenNameIdentifier	 min Len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
getAndMoveToFrontDecode	TokenNameIdentifier	 get And Move To Front Decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
origPtr	TokenNameIdentifier	 orig Ptr
=	TokenNameEQUAL	
bsR	TokenNameIdentifier	 bs R
(	TokenNameLPAREN	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recvDecodingTables	TokenNameIdentifier	 recv Decoding Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
InputStream	TokenNameIdentifier	 Input Stream
inShadow	TokenNameIdentifier	 in Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Data	TokenNameIdentifier	 Data
dataShadow	TokenNameIdentifier	 data Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ll8	TokenNameIdentifier	 ll8
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
ll8	TokenNameIdentifier	 ll8
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
unzftab	TokenNameIdentifier	 unzftab
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
unzftab	TokenNameIdentifier	 unzftab
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
selector	TokenNameIdentifier	 selector
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
selector	TokenNameIdentifier	 selector
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
seqToUnseq	TokenNameIdentifier	 seq To Unseq
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
seqToUnseq	TokenNameIdentifier	 seq To Unseq
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
yy	TokenNameIdentifier	 yy
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
getAndMoveToFrontDecode_yy	TokenNameIdentifier	 get And Move To Front Decode yy
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minLens	TokenNameIdentifier	 min Lens
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
minLens	TokenNameIdentifier	 min Lens
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
perm	TokenNameIdentifier	 perm
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
perm	TokenNameIdentifier	 perm
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
limitLast	TokenNameIdentifier	 limit Last
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
blockSize100k	TokenNameIdentifier	 block Size100k
*	TokenNameMULTIPLY	
100000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* Setting up the unzftab entries here is not strictly necessary, but it does save having to do it later in a separate pass, and so saves a block's worth of cache misses. */	TokenNameCOMMENT_BLOCK	 Setting up the unzftab entries here is not strictly necessary, but it does save having to do it later in a separate pass, and so saves a block's worth of cache misses. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy	TokenNameIdentifier	 yy
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
unzftab	TokenNameIdentifier	 unzftab
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
groupNo	TokenNameIdentifier	 group No
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
groupPos	TokenNameIdentifier	 group Pos
=	TokenNameEQUAL	
G_SIZE	TokenNameIdentifier	 G  SIZE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
eob	TokenNameIdentifier	 eob
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
nInUse	TokenNameIdentifier	 n In Use
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
nextSym	TokenNameIdentifier	 next Sym
=	TokenNameEQUAL	
getAndMoveToFrontDecode0	TokenNameIdentifier	 get And Move To Front Decode0
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
;	TokenNameSEMICOLON	
int	TokenNameint	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
;	TokenNameSEMICOLON	
int	TokenNameint	
lastShadow	TokenNameIdentifier	 last Shadow
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
zt	TokenNameIdentifier	 zt
=	TokenNameEQUAL	
selector	TokenNameIdentifier	 selector
[	TokenNameLBRACKET	
groupNo	TokenNameIdentifier	 group No
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
base_zt	TokenNameIdentifier	 base zt
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
[	TokenNameLBRACKET	
zt	TokenNameIdentifier	 zt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
limit_zt	TokenNameIdentifier	 limit zt
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
[	TokenNameLBRACKET	
zt	TokenNameIdentifier	 zt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
perm_zt	TokenNameIdentifier	 perm zt
=	TokenNameEQUAL	
perm	TokenNameIdentifier	 perm
[	TokenNameLBRACKET	
zt	TokenNameIdentifier	 zt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
minLens_zt	TokenNameIdentifier	 min Lens zt
=	TokenNameEQUAL	
minLens	TokenNameIdentifier	 min Lens
[	TokenNameLBRACKET	
zt	TokenNameIdentifier	 zt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nextSym	TokenNameIdentifier	 next Sym
!=	TokenNameNOT_EQUAL	
eob	TokenNameIdentifier	 eob
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nextSym	TokenNameIdentifier	 next Sym
==	TokenNameEQUAL_EQUAL	
RUNA	TokenNameIdentifier	 RUNA
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
nextSym	TokenNameIdentifier	 next Sym
==	TokenNameEQUAL_EQUAL	
RUNB	TokenNameIdentifier	 RUNB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
true	TokenNametrue	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
<<=	TokenNameLEFT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nextSym	TokenNameIdentifier	 next Sym
==	TokenNameEQUAL_EQUAL	
RUNA	TokenNameIdentifier	 RUNA
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nextSym	TokenNameIdentifier	 next Sym
==	TokenNameEQUAL_EQUAL	
RUNB	TokenNameIdentifier	 RUNB
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
n	TokenNameIdentifier	 n
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
groupPos	TokenNameIdentifier	 group Pos
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
groupPos	TokenNameIdentifier	 group Pos
=	TokenNameEQUAL	
G_SIZE	TokenNameIdentifier	 G  SIZE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
zt	TokenNameIdentifier	 zt
=	TokenNameEQUAL	
selector	TokenNameIdentifier	 selector
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
groupNo	TokenNameIdentifier	 group No
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
base_zt	TokenNameIdentifier	 base zt
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
[	TokenNameLBRACKET	
zt	TokenNameIdentifier	 zt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
limit_zt	TokenNameIdentifier	 limit zt
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
[	TokenNameLBRACKET	
zt	TokenNameIdentifier	 zt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
perm_zt	TokenNameIdentifier	 perm zt
=	TokenNameEQUAL	
perm	TokenNameIdentifier	 perm
[	TokenNameLBRACKET	
zt	TokenNameIdentifier	 zt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
minLens_zt	TokenNameIdentifier	 min Lens zt
=	TokenNameEQUAL	
minLens	TokenNameIdentifier	 min Lens
[	TokenNameLBRACKET	
zt	TokenNameIdentifier	 zt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
groupPos	TokenNameIdentifier	 group Pos
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
zn	TokenNameIdentifier	 zn
=	TokenNameEQUAL	
minLens_zt	TokenNameIdentifier	 min Lens zt
;	TokenNameSEMICOLON	
// Inlined: 	TokenNameCOMMENT_LINE	Inlined: 
// int zvec = bsR(zn); 	TokenNameCOMMENT_LINE	int zvec = bsR(zn); 
while	TokenNamewhile	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
<	TokenNameLESS	
zn	TokenNameIdentifier	 zn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
thech	TokenNameIdentifier	 thech
=	TokenNameEQUAL	
inShadow	TokenNameIdentifier	 in Shadow
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
thech	TokenNameIdentifier	 thech
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
thech	TokenNameIdentifier	 thech
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"unexpected end of stream"	TokenNameStringLiteral	unexpected end of stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
zvec	TokenNameIdentifier	 zvec
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-	TokenNameMINUS	
zn	TokenNameIdentifier	 zn
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
zn	TokenNameIdentifier	 zn
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-=	TokenNameMINUS_EQUAL	
zn	TokenNameIdentifier	 zn
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
zvec	TokenNameIdentifier	 zvec
>	TokenNameGREATER	
limit_zt	TokenNameIdentifier	 limit zt
[	TokenNameLBRACKET	
zn	TokenNameIdentifier	 zn
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zn	TokenNameIdentifier	 zn
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
thech	TokenNameIdentifier	 thech
=	TokenNameEQUAL	
inShadow	TokenNameIdentifier	 in Shadow
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
thech	TokenNameIdentifier	 thech
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
thech	TokenNameIdentifier	 thech
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"unexpected end of stream"	TokenNameStringLiteral	unexpected end of stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
zvec	TokenNameIdentifier	 zvec
=	TokenNameEQUAL	
(	TokenNameLPAREN	
zvec	TokenNameIdentifier	 zvec
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
>>	TokenNameRIGHT_SHIFT	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
)	TokenNameRPAREN	
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextSym	TokenNameIdentifier	 next Sym
=	TokenNameEQUAL	
perm_zt	TokenNameIdentifier	 perm zt
[	TokenNameLBRACKET	
zvec	TokenNameIdentifier	 zvec
-	TokenNameMINUS	
base_zt	TokenNameIdentifier	 base zt
[	TokenNameLBRACKET	
zn	TokenNameIdentifier	 zn
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
seqToUnseq	TokenNameIdentifier	 seq To Unseq
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
unzftab	TokenNameIdentifier	 unzftab
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
--	TokenNameMINUS_MINUS	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ll8	TokenNameIdentifier	 ll8
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
lastShadow	TokenNameIdentifier	 last Shadow
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastShadow	TokenNameIdentifier	 last Shadow
>=	TokenNameGREATER_EQUAL	
limitLast	TokenNameIdentifier	 limit Last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"block overrun"	TokenNameStringLiteral	block overrun
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
lastShadow	TokenNameIdentifier	 last Shadow
>=	TokenNameGREATER_EQUAL	
limitLast	TokenNameIdentifier	 limit Last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"block overrun"	TokenNameStringLiteral	block overrun
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
char	TokenNamechar	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
yy	TokenNameIdentifier	 yy
[	TokenNameLBRACKET	
nextSym	TokenNameIdentifier	 next Sym
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
unzftab	TokenNameIdentifier	 unzftab
[	TokenNameLBRACKET	
seqToUnseq	TokenNameIdentifier	 seq To Unseq
[	TokenNameLBRACKET	
tmp	TokenNameIdentifier	 tmp
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
ll8	TokenNameIdentifier	 ll8
[	TokenNameLBRACKET	
lastShadow	TokenNameIdentifier	 last Shadow
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
seqToUnseq	TokenNameIdentifier	 seq To Unseq
[	TokenNameLBRACKET	
tmp	TokenNameIdentifier	 tmp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/* This loop is hammered during decompression, hence avoid native method call overhead of System.arraycopy for very small ranges to copy. */	TokenNameCOMMENT_BLOCK	 This loop is hammered during decompression, hence avoid native method call overhead of System.arraycopy for very small ranges to copy. 
if	TokenNameif	
(	TokenNameLPAREN	
nextSym	TokenNameIdentifier	 next Sym
<=	TokenNameLESS_EQUAL	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
nextSym	TokenNameIdentifier	 next Sym
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy	TokenNameIdentifier	 yy
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
yy	TokenNameIdentifier	 yy
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
yy	TokenNameIdentifier	 yy
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
yy	TokenNameIdentifier	 yy
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nextSym	TokenNameIdentifier	 next Sym
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
yy	TokenNameIdentifier	 yy
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
groupPos	TokenNameIdentifier	 group Pos
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
groupPos	TokenNameIdentifier	 group Pos
=	TokenNameEQUAL	
G_SIZE	TokenNameIdentifier	 G  SIZE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
zt	TokenNameIdentifier	 zt
=	TokenNameEQUAL	
selector	TokenNameIdentifier	 selector
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
groupNo	TokenNameIdentifier	 group No
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
base_zt	TokenNameIdentifier	 base zt
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
[	TokenNameLBRACKET	
zt	TokenNameIdentifier	 zt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
limit_zt	TokenNameIdentifier	 limit zt
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
[	TokenNameLBRACKET	
zt	TokenNameIdentifier	 zt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
perm_zt	TokenNameIdentifier	 perm zt
=	TokenNameEQUAL	
perm	TokenNameIdentifier	 perm
[	TokenNameLBRACKET	
zt	TokenNameIdentifier	 zt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
minLens_zt	TokenNameIdentifier	 min Lens zt
=	TokenNameEQUAL	
minLens	TokenNameIdentifier	 min Lens
[	TokenNameLBRACKET	
zt	TokenNameIdentifier	 zt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
groupPos	TokenNameIdentifier	 group Pos
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
zn	TokenNameIdentifier	 zn
=	TokenNameEQUAL	
minLens_zt	TokenNameIdentifier	 min Lens zt
;	TokenNameSEMICOLON	
// Inlined: 	TokenNameCOMMENT_LINE	Inlined: 
// int zvec = bsR(zn); 	TokenNameCOMMENT_LINE	int zvec = bsR(zn); 
while	TokenNamewhile	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
<	TokenNameLESS	
zn	TokenNameIdentifier	 zn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
thech	TokenNameIdentifier	 thech
=	TokenNameEQUAL	
inShadow	TokenNameIdentifier	 in Shadow
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
thech	TokenNameIdentifier	 thech
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
thech	TokenNameIdentifier	 thech
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"unexpected end of stream"	TokenNameStringLiteral	unexpected end of stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
zvec	TokenNameIdentifier	 zvec
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-	TokenNameMINUS	
zn	TokenNameIdentifier	 zn
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
zn	TokenNameIdentifier	 zn
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-=	TokenNameMINUS_EQUAL	
zn	TokenNameIdentifier	 zn
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
zvec	TokenNameIdentifier	 zvec
>	TokenNameGREATER	
limit_zt	TokenNameIdentifier	 limit zt
[	TokenNameLBRACKET	
zn	TokenNameIdentifier	 zn
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zn	TokenNameIdentifier	 zn
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
thech	TokenNameIdentifier	 thech
=	TokenNameEQUAL	
inShadow	TokenNameIdentifier	 in Shadow
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
thech	TokenNameIdentifier	 thech
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
thech	TokenNameIdentifier	 thech
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"unexpected end of stream"	TokenNameStringLiteral	unexpected end of stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
zvec	TokenNameIdentifier	 zvec
=	TokenNameEQUAL	
(	TokenNameLPAREN	
zvec	TokenNameIdentifier	 zvec
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
>>	TokenNameRIGHT_SHIFT	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
)	TokenNameRPAREN	
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextSym	TokenNameIdentifier	 next Sym
=	TokenNameEQUAL	
perm_zt	TokenNameIdentifier	 perm zt
[	TokenNameLBRACKET	
zvec	TokenNameIdentifier	 zvec
-	TokenNameMINUS	
base_zt	TokenNameIdentifier	 base zt
[	TokenNameLBRACKET	
zn	TokenNameIdentifier	 zn
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
lastShadow	TokenNameIdentifier	 last Shadow
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
=	TokenNameEQUAL	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
=	TokenNameEQUAL	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
getAndMoveToFrontDecode0	TokenNameIdentifier	 get And Move To Front Decode0
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
groupNo	TokenNameIdentifier	 group No
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
InputStream	TokenNameIdentifier	 Input Stream
inShadow	TokenNameIdentifier	 in Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Data	TokenNameIdentifier	 Data
dataShadow	TokenNameIdentifier	 data Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
zt	TokenNameIdentifier	 zt
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
selector	TokenNameIdentifier	 selector
[	TokenNameLBRACKET	
groupNo	TokenNameIdentifier	 group No
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
limit_zt	TokenNameIdentifier	 limit zt
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
[	TokenNameLBRACKET	
zt	TokenNameIdentifier	 zt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
zn	TokenNameIdentifier	 zn
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
minLens	TokenNameIdentifier	 min Lens
[	TokenNameLBRACKET	
zt	TokenNameIdentifier	 zt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
zvec	TokenNameIdentifier	 zvec
=	TokenNameEQUAL	
bsR	TokenNameIdentifier	 bs R
(	TokenNameLPAREN	
zn	TokenNameIdentifier	 zn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
;	TokenNameSEMICOLON	
int	TokenNameint	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
zvec	TokenNameIdentifier	 zvec
>	TokenNameGREATER	
limit_zt	TokenNameIdentifier	 limit zt
[	TokenNameLBRACKET	
zn	TokenNameIdentifier	 zn
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zn	TokenNameIdentifier	 zn
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
thech	TokenNameIdentifier	 thech
=	TokenNameEQUAL	
inShadow	TokenNameIdentifier	 in Shadow
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
thech	TokenNameIdentifier	 thech
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
thech	TokenNameIdentifier	 thech
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"unexpected end of stream"	TokenNameStringLiteral	unexpected end of stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
zvec	TokenNameIdentifier	 zvec
=	TokenNameEQUAL	
(	TokenNameLPAREN	
zvec	TokenNameIdentifier	 zvec
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
>>	TokenNameRIGHT_SHIFT	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
)	TokenNameRPAREN	
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
=	TokenNameEQUAL	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
=	TokenNameEQUAL	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
perm	TokenNameIdentifier	 perm
[	TokenNameLBRACKET	
zt	TokenNameIdentifier	 zt
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
zvec	TokenNameIdentifier	 zvec
-	TokenNameMINUS	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
base	TokenNameIdentifier	 base
[	TokenNameLBRACKET	
zt	TokenNameIdentifier	 zt
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
zn	TokenNameIdentifier	 zn
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setupBlock	TokenNameIdentifier	 setup Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cftab	TokenNameIdentifier	 cftab
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
cftab	TokenNameIdentifier	 cftab
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tt	TokenNameIdentifier	 tt
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
initTT	TokenNameIdentifier	 init TT
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
last	TokenNameIdentifier	 last
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ll8	TokenNameIdentifier	 ll8
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
ll8	TokenNameIdentifier	 ll8
;	TokenNameSEMICOLON	
cftab	TokenNameIdentifier	 cftab
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
unzftab	TokenNameIdentifier	 unzftab
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cftab	TokenNameIdentifier	 cftab
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
256	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
cftab	TokenNameIdentifier	 cftab
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
+=	TokenNamePLUS_EQUAL	
cftab	TokenNameIdentifier	 cftab
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cftab	TokenNameIdentifier	 cftab
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lastShadow	TokenNameIdentifier	 last Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
lastShadow	TokenNameIdentifier	 last Shadow
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tt	TokenNameIdentifier	 tt
[	TokenNameLBRACKET	
cftab	TokenNameIdentifier	 cftab
[	TokenNameLBRACKET	
ll8	TokenNameIdentifier	 ll8
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
origPtr	TokenNameIdentifier	 orig Ptr
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
origPtr	TokenNameIdentifier	 orig Ptr
>=	TokenNameGREATER_EQUAL	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"stream corrupted"	TokenNameStringLiteral	stream corrupted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_tPos	TokenNameIdentifier	 su t Pos
=	TokenNameEQUAL	
tt	TokenNameIdentifier	 tt
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
origPtr	TokenNameIdentifier	 orig Ptr
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_count	TokenNameIdentifier	 su count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_i2	TokenNameIdentifier	 su i2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_ch2	TokenNameIdentifier	 su ch2
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* not a char and not EOF */	TokenNameCOMMENT_BLOCK	 not a char and not EOF 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
blockRandomised	TokenNameIdentifier	 block Randomised
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_rNToGo	TokenNameIdentifier	 su r N To Go
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_rTPos	TokenNameIdentifier	 su r T Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
setupRandPartA	TokenNameIdentifier	 setup Rand Part A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setupNoRandPartA	TokenNameIdentifier	 setup No Rand Part A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setupRandPartA	TokenNameIdentifier	 setup Rand Part A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
su_i2	TokenNameIdentifier	 su i2
<=	TokenNameLESS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_chPrev	TokenNameIdentifier	 su ch Prev
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
su_ch2	TokenNameIdentifier	 su ch2
;	TokenNameSEMICOLON	
int	TokenNameint	
su_ch2Shadow	TokenNameIdentifier	 su ch2 Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
ll8	TokenNameIdentifier	 ll8
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
su_tPos	TokenNameIdentifier	 su t Pos
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_tPos	TokenNameIdentifier	 su t Pos
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
tt	TokenNameIdentifier	 tt
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
su_tPos	TokenNameIdentifier	 su t Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
su_rNToGo	TokenNameIdentifier	 su r N To Go
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_rNToGo	TokenNameIdentifier	 su r N To Go
=	TokenNameEQUAL	
BZip2Constants	TokenNameIdentifier	 B Zip2 Constants
.	TokenNameDOT	
rNums	TokenNameIdentifier	 r Nums
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
su_rTPos	TokenNameIdentifier	 su r T Pos
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
this	TokenNamethis	
.	TokenNameDOT	
su_rTPos	TokenNameIdentifier	 su r T Pos
==	TokenNameEQUAL_EQUAL	
512	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_rTPos	TokenNameIdentifier	 su r T Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_rNToGo	TokenNameIdentifier	 su r N To Go
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_ch2	TokenNameIdentifier	 su ch2
=	TokenNameEQUAL	
su_ch2Shadow	TokenNameIdentifier	 su ch2 Shadow
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
su_rNToGo	TokenNameIdentifier	 su r N To Go
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_i2	TokenNameIdentifier	 su i2
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentChar	TokenNameIdentifier	 current Char
=	TokenNameEQUAL	
su_ch2Shadow	TokenNameIdentifier	 su ch2 Shadow
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentState	TokenNameIdentifier	 current State
=	TokenNameEQUAL	
RAND_PART_B_STATE	TokenNameIdentifier	 RAND  PART  B  STATE
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
updateCRC	TokenNameIdentifier	 update CRC
(	TokenNameLPAREN	
su_ch2Shadow	TokenNameIdentifier	 su ch2 Shadow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
endBlock	TokenNameIdentifier	 end Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initBlock	TokenNameIdentifier	 init Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setupBlock	TokenNameIdentifier	 setup Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setupNoRandPartA	TokenNameIdentifier	 setup No Rand Part A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
su_i2	TokenNameIdentifier	 su i2
<=	TokenNameLESS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_chPrev	TokenNameIdentifier	 su ch Prev
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
su_ch2	TokenNameIdentifier	 su ch2
;	TokenNameSEMICOLON	
int	TokenNameint	
su_ch2Shadow	TokenNameIdentifier	 su ch2 Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
ll8	TokenNameIdentifier	 ll8
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
su_tPos	TokenNameIdentifier	 su t Pos
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_ch2	TokenNameIdentifier	 su ch2
=	TokenNameEQUAL	
su_ch2Shadow	TokenNameIdentifier	 su ch2 Shadow
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_tPos	TokenNameIdentifier	 su t Pos
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
tt	TokenNameIdentifier	 tt
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
su_tPos	TokenNameIdentifier	 su t Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_i2	TokenNameIdentifier	 su i2
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentChar	TokenNameIdentifier	 current Char
=	TokenNameEQUAL	
su_ch2Shadow	TokenNameIdentifier	 su ch2 Shadow
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentState	TokenNameIdentifier	 current State
=	TokenNameEQUAL	
NO_RAND_PART_B_STATE	TokenNameIdentifier	 NO  RAND  PART  B  STATE
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
updateCRC	TokenNameIdentifier	 update CRC
(	TokenNameLPAREN	
su_ch2Shadow	TokenNameIdentifier	 su ch2 Shadow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
currentState	TokenNameIdentifier	 current State
=	TokenNameEQUAL	
NO_RAND_PART_A_STATE	TokenNameIdentifier	 NO  RAND  PART  A  STATE
;	TokenNameSEMICOLON	
endBlock	TokenNameIdentifier	 end Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initBlock	TokenNameIdentifier	 init Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setupBlock	TokenNameIdentifier	 setup Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setupRandPartB	TokenNameIdentifier	 setup Rand Part B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
su_ch2	TokenNameIdentifier	 su ch2
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
su_chPrev	TokenNameIdentifier	 su ch Prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
currentState	TokenNameIdentifier	 current State
=	TokenNameEQUAL	
RAND_PART_A_STATE	TokenNameIdentifier	 RAND  PART  A  STATE
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_count	TokenNameIdentifier	 su count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
setupRandPartA	TokenNameIdentifier	 setup Rand Part A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
this	TokenNamethis	
.	TokenNameDOT	
su_count	TokenNameIdentifier	 su count
>=	TokenNameGREATER_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_z	TokenNameIdentifier	 su z
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
ll8	TokenNameIdentifier	 ll8
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
su_tPos	TokenNameIdentifier	 su t Pos
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_tPos	TokenNameIdentifier	 su t Pos
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
tt	TokenNameIdentifier	 tt
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
su_tPos	TokenNameIdentifier	 su t Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
su_rNToGo	TokenNameIdentifier	 su r N To Go
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_rNToGo	TokenNameIdentifier	 su r N To Go
=	TokenNameEQUAL	
BZip2Constants	TokenNameIdentifier	 B Zip2 Constants
.	TokenNameDOT	
rNums	TokenNameIdentifier	 r Nums
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
su_rTPos	TokenNameIdentifier	 su r T Pos
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
this	TokenNamethis	
.	TokenNameDOT	
su_rTPos	TokenNameIdentifier	 su r T Pos
==	TokenNameEQUAL_EQUAL	
512	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_rTPos	TokenNameIdentifier	 su r T Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_rNToGo	TokenNameIdentifier	 su r N To Go
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_j2	TokenNameIdentifier	 su j2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentState	TokenNameIdentifier	 current State
=	TokenNameEQUAL	
RAND_PART_C_STATE	TokenNameIdentifier	 RAND  PART  C  STATE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
su_rNToGo	TokenNameIdentifier	 su r N To Go
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_z	TokenNameIdentifier	 su z
^=	TokenNameXOR_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setupRandPartC	TokenNameIdentifier	 setup Rand Part C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
currentState	TokenNameIdentifier	 current State
=	TokenNameEQUAL	
RAND_PART_A_STATE	TokenNameIdentifier	 RAND  PART  A  STATE
;	TokenNameSEMICOLON	
setupRandPartA	TokenNameIdentifier	 setup Rand Part A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setupRandPartC	TokenNameIdentifier	 setup Rand Part C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
su_j2	TokenNameIdentifier	 su j2
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
su_z	TokenNameIdentifier	 su z
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
currentChar	TokenNameIdentifier	 current Char
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
su_ch2	TokenNameIdentifier	 su ch2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
updateCRC	TokenNameIdentifier	 update CRC
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
su_ch2	TokenNameIdentifier	 su ch2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_j2	TokenNameIdentifier	 su j2
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
currentState	TokenNameIdentifier	 current State
=	TokenNameEQUAL	
RAND_PART_A_STATE	TokenNameIdentifier	 RAND  PART  A  STATE
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_i2	TokenNameIdentifier	 su i2
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_count	TokenNameIdentifier	 su count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
setupRandPartA	TokenNameIdentifier	 setup Rand Part A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setupNoRandPartB	TokenNameIdentifier	 setup No Rand Part B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
su_ch2	TokenNameIdentifier	 su ch2
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
su_chPrev	TokenNameIdentifier	 su ch Prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_count	TokenNameIdentifier	 su count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
setupNoRandPartA	TokenNameIdentifier	 setup No Rand Part A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
this	TokenNamethis	
.	TokenNameDOT	
su_count	TokenNameIdentifier	 su count
>=	TokenNameGREATER_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_z	TokenNameIdentifier	 su z
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
ll8	TokenNameIdentifier	 ll8
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
su_tPos	TokenNameIdentifier	 su t Pos
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_tPos	TokenNameIdentifier	 su t Pos
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
tt	TokenNameIdentifier	 tt
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
su_tPos	TokenNameIdentifier	 su t Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_j2	TokenNameIdentifier	 su j2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
setupNoRandPartC	TokenNameIdentifier	 setup No Rand Part C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setupNoRandPartA	TokenNameIdentifier	 setup No Rand Part A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setupNoRandPartC	TokenNameIdentifier	 setup No Rand Part C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
su_j2	TokenNameIdentifier	 su j2
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
su_z	TokenNameIdentifier	 su z
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
su_ch2Shadow	TokenNameIdentifier	 su ch2 Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
su_ch2	TokenNameIdentifier	 su ch2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentChar	TokenNameIdentifier	 current Char
=	TokenNameEQUAL	
su_ch2Shadow	TokenNameIdentifier	 su ch2 Shadow
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
updateCRC	TokenNameIdentifier	 update CRC
(	TokenNameLPAREN	
su_ch2Shadow	TokenNameIdentifier	 su ch2 Shadow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_j2	TokenNameIdentifier	 su j2
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentState	TokenNameIdentifier	 current State
=	TokenNameEQUAL	
NO_RAND_PART_C_STATE	TokenNameIdentifier	 NO  RAND  PART  C  STATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
su_i2	TokenNameIdentifier	 su i2
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
su_count	TokenNameIdentifier	 su count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
setupNoRandPartA	TokenNameIdentifier	 setup No Rand Part A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Data	TokenNameIdentifier	 Data
extends	TokenNameextends	
Object	TokenNameIdentifier	 Object
{	TokenNameLBRACE	
// (with blockSize 900k) 	TokenNameCOMMENT_LINE	(with blockSize 900k) 
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inUse	TokenNameIdentifier	 in Use
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 256 byte 	TokenNameCOMMENT_LINE	256 byte 
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
seqToUnseq	TokenNameIdentifier	 seq To Unseq
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 256 byte 	TokenNameCOMMENT_LINE	256 byte 
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
selector	TokenNameIdentifier	 selector
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
MAX_SELECTORS	TokenNameIdentifier	 MAX  SELECTORS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 18002 byte 	TokenNameCOMMENT_LINE	18002 byte 
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
selectorMtf	TokenNameIdentifier	 selector Mtf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
MAX_SELECTORS	TokenNameIdentifier	 MAX  SELECTORS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 18002 byte 	TokenNameCOMMENT_LINE	18002 byte 
/** * Freq table collected to save a pass over the data during * decompression. */	TokenNameCOMMENT_JAVADOC	 Freq table collected to save a pass over the data during decompression. 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
unzftab	TokenNameIdentifier	 unzftab
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 1024 byte 	TokenNameCOMMENT_LINE	1024 byte 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
N_GROUPS	TokenNameIdentifier	 N  GROUPS
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
MAX_ALPHA_SIZE	TokenNameIdentifier	 MAX  ALPHA  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 6192 byte 	TokenNameCOMMENT_LINE	6192 byte 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
N_GROUPS	TokenNameIdentifier	 N  GROUPS
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
MAX_ALPHA_SIZE	TokenNameIdentifier	 MAX  ALPHA  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 6192 byte 	TokenNameCOMMENT_LINE	6192 byte 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
perm	TokenNameIdentifier	 perm
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
N_GROUPS	TokenNameIdentifier	 N  GROUPS
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
MAX_ALPHA_SIZE	TokenNameIdentifier	 MAX  ALPHA  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 6192 byte 	TokenNameCOMMENT_LINE	6192 byte 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minLens	TokenNameIdentifier	 min Lens
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
N_GROUPS	TokenNameIdentifier	 N  GROUPS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 24 byte 	TokenNameCOMMENT_LINE	24 byte 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cftab	TokenNameIdentifier	 cftab
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
257	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 1028 byte 	TokenNameCOMMENT_LINE	1028 byte 
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAndMoveToFrontDecode_yy	TokenNameIdentifier	 get And Move To Front Decode yy
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 512 byte 	TokenNameCOMMENT_LINE	512 byte 
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
temp_charArray2d	TokenNameIdentifier	 temp char Array2d
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
N_GROUPS	TokenNameIdentifier	 N  GROUPS
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
MAX_ALPHA_SIZE	TokenNameIdentifier	 MAX  ALPHA  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 3096 byte 	TokenNameCOMMENT_LINE	3096 byte 
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
recvDecodingTables_pos	TokenNameIdentifier	 recv Decoding Tables pos
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
N_GROUPS	TokenNameIdentifier	 N  GROUPS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 6 byte 	TokenNameCOMMENT_LINE	6 byte 
//--------------- 	TokenNameCOMMENT_LINE	--------------- 
// 60798 byte 	TokenNameCOMMENT_LINE	60798 byte 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tt	TokenNameIdentifier	 tt
;	TokenNameSEMICOLON	
// 3600000 byte 	TokenNameCOMMENT_LINE	3600000 byte 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ll8	TokenNameIdentifier	 ll8
;	TokenNameSEMICOLON	
// 900000 byte 	TokenNameCOMMENT_LINE	900000 byte 
//--------------- 	TokenNameCOMMENT_LINE	--------------- 
// 4560782 byte 	TokenNameCOMMENT_LINE	4560782 byte 
//=============== 	TokenNameCOMMENT_LINE	=============== 
Data	TokenNameIdentifier	 Data
(	TokenNameLPAREN	
int	TokenNameint	
blockSize100k	TokenNameIdentifier	 block Size100k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ll8	TokenNameIdentifier	 ll8
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
blockSize100k	TokenNameIdentifier	 block Size100k
*	TokenNameMULTIPLY	
BZip2Constants	TokenNameIdentifier	 B Zip2 Constants
.	TokenNameDOT	
baseBlockSize	TokenNameIdentifier	 base Block Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the {@link #tt} array. * * This method is called when the required length of the array * is known. I don't initialize it at construction time to * avoid unneccessary memory allocation when compressing small * files. */	TokenNameCOMMENT_JAVADOC	 Initializes the {@link #tt} array. * This method is called when the required length of the array is known. I don't initialize it at construction time to avoid unneccessary memory allocation when compressing small files. 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
initTT	TokenNameIdentifier	 init TT
(	TokenNameLPAREN	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ttShadow	TokenNameIdentifier	 tt Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
tt	TokenNameIdentifier	 tt
;	TokenNameSEMICOLON	
// tt.length should always be >= length, but theoretically 	TokenNameCOMMENT_LINE	tt.length should always be >= length, but theoretically 
// it can happen, if the compressor mixed small and large 	TokenNameCOMMENT_LINE	it can happen, if the compressor mixed small and large 
// blocks. Normally only the last block will be smaller 	TokenNameCOMMENT_LINE	blocks. Normally only the last block will be smaller 
// than others. 	TokenNameCOMMENT_LINE	than others. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ttShadow	TokenNameIdentifier	 tt Shadow
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ttShadow	TokenNameIdentifier	 tt Shadow
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tt	TokenNameIdentifier	 tt
=	TokenNameEQUAL	
ttShadow	TokenNameIdentifier	 tt Shadow
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ttShadow	TokenNameIdentifier	 tt Shadow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
