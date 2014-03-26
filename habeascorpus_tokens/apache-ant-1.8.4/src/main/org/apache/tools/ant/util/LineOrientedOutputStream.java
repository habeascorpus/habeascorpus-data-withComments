/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
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
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
/** * Invokes {@link #processLine processLine} whenever a full line has * been written to this stream. * * <p>Tries to be smart about line separators.</p> */	TokenNameCOMMENT_JAVADOC	 Invokes {@link #processLine processLine} whenever a full line has been written to this stream. * <p>Tries to be smart about line separators.</p> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
LineOrientedOutputStream	TokenNameIdentifier	 Line Oriented Output Stream
extends	TokenNameextends	
OutputStream	TokenNameIdentifier	 Output Stream
{	TokenNameLBRACE	
/** Initial buffer size. */	TokenNameCOMMENT_JAVADOC	 Initial buffer size. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INTIAL_SIZE	TokenNameIdentifier	 INTIAL  SIZE
=	TokenNameEQUAL	
132	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Carriage return */	TokenNameCOMMENT_JAVADOC	 Carriage return 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CR	TokenNameIdentifier	 CR
=	TokenNameEQUAL	
0x0d	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Linefeed */	TokenNameCOMMENT_JAVADOC	 Linefeed 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LF	TokenNameIdentifier	 LF
=	TokenNameEQUAL	
0x0a	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
INTIAL_SIZE	TokenNameIdentifier	 INTIAL  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
skip	TokenNameIdentifier	 skip
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Write the data to the buffer and flush the buffer, if a line * separator is detected. * * @param cc data to log (byte). * @throws IOException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Write the data to the buffer and flush the buffer, if a line separator is detected. * @param cc data to log (byte). @throws IOException if there is an error. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
cc	TokenNameIdentifier	 cc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
cc	TokenNameIdentifier	 cc
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
LF	TokenNameIdentifier	 LF
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
CR	TokenNameIdentifier	 CR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processBuffer	TokenNameIdentifier	 process Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
skip	TokenNameIdentifier	 skip
=	TokenNameEQUAL	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
CR	TokenNameIdentifier	 CR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Flush this log stream * @throws IOException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Flush this log stream @throws IOException if there is an error. 
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Converts the buffer to a byte[] and sends it to * <code>processLine</code> * @throws IOException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Converts the buffer to a byte[] and sends it to <code>processLine</code> @throws IOException if there is an error. 
protected	TokenNameprotected	
void	TokenNamevoid	
processBuffer	TokenNameIdentifier	 process Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
processLine	TokenNameIdentifier	 process Line
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Processes a line. * * @param line the line to log. * @throws IOException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Processes a line. * @param line the line to log. @throws IOException if there is an error. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
processLine	TokenNameIdentifier	 process Line
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Processes a line. * * <p>This implementations invokes the string-arg version * converting the byte array using the default encoding. * Subclasses are encouraged to override this method (and provide * a dummy implementation of the String-arg version) so they don't * interfere with the encoding of the underlying stream.</p> * * @param line the line to log. * @throws IOException if there is an error. * @since Ant 1.8.3 */	TokenNameCOMMENT_JAVADOC	 Processes a line. * <p>This implementations invokes the string-arg version converting the byte array using the default encoding. Subclasses are encouraged to override this method (and provide a dummy implementation of the String-arg version) so they don't interfere with the encoding of the underlying stream.</p> * @param line the line to log. @throws IOException if there is an error. @since Ant 1.8.3 
protected	TokenNameprotected	
void	TokenNamevoid	
processLine	TokenNameIdentifier	 process Line
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
processLine	TokenNameIdentifier	 process Line
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes all remaining * @throws IOException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Writes all remaining @throws IOException if there is an error. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processBuffer	TokenNameIdentifier	 process Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write a block of characters to the output stream * * @param b the array containing the data * @param off the offset into the array where data starts * @param len the length of block * * @throws IOException if the data cannot be written into the stream. */	TokenNameCOMMENT_JAVADOC	 Write a block of characters to the output stream * @param b the array containing the data @param off the offset into the array where data starts @param len the length of block * @throws IOException if the data cannot be written into the stream. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
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
// find the line breaks and pass other chars through in blocks 	TokenNameCOMMENT_LINE	find the line breaks and pass other chars through in blocks 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
;	TokenNameSEMICOLON	
int	TokenNameint	
blockStartOffset	TokenNameIdentifier	 block Start Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
int	TokenNameint	
remaining	TokenNameIdentifier	 remaining
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
remaining	TokenNameIdentifier	 remaining
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
remaining	TokenNameIdentifier	 remaining
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
LF	TokenNameIdentifier	 LF
&&	TokenNameAND_AND	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
CR	TokenNameIdentifier	 CR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
remaining	TokenNameIdentifier	 remaining
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// either end of buffer or a line separator char 	TokenNameCOMMENT_LINE	either end of buffer or a line separator char 
int	TokenNameint	
blockLength	TokenNameIdentifier	 block Length
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
blockStartOffset	TokenNameIdentifier	 block Start Offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
blockLength	TokenNameIdentifier	 block Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
blockStartOffset	TokenNameIdentifier	 block Start Offset
,	TokenNameCOMMA	
blockLength	TokenNameIdentifier	 block Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
remaining	TokenNameIdentifier	 remaining
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
LF	TokenNameIdentifier	 LF
||	TokenNameOR_OR	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
CR	TokenNameIdentifier	 CR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
remaining	TokenNameIdentifier	 remaining
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
blockStartOffset	TokenNameIdentifier	 block Start Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
