/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * An OutputStream that flushes out to a Category.<p> * * Note that no data is written out to the Category until the stream is * flushed or closed.<p> * * Example:<pre> * // make sure everything sent to System.err is logged * System.setErr(new PrintStream(new LoggingOutputStream(Category.getRoot(), Priority.WARN), true)); * * // make sure everything sent to System.out is also logged * System.setOut(new PrintStream(new LoggingOutputStream(Category.getRoot(), Priority.INFO), true)); * </pre> * * @author <a href="mailto://Jim.Moore@rocketmail.com">Jim Moore</a> * @see Category */	TokenNameCOMMENT_JAVADOC	 An OutputStream that flushes out to a Category.<p> * Note that no data is written out to the Category until the stream is flushed or closed.<p> * Example:<pre> // make sure everything sent to System.err is logged System.setErr(new PrintStream(new LoggingOutputStream(Category.getRoot(), Priority.WARN), true)); * // make sure everything sent to System.out is also logged System.setOut(new PrintStream(new LoggingOutputStream(Category.getRoot(), Priority.INFO), true)); </pre> * @author <a href="mailto://Jim.Moore@rocketmail.com">Jim Moore</a> @see Category 
public	TokenNamepublic	
class	TokenNameclass	
LoggingOutputStream	TokenNameIdentifier	 Logging Output Stream
extends	TokenNameextends	
OutputStream	TokenNameIdentifier	 Output Stream
{	TokenNameLBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LINE_SEPERATOR	TokenNameIdentifier	 LINE  SEPERATOR
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Used to maintain the contract of {@link #close()}. */	TokenNameCOMMENT_JAVADOC	 Used to maintain the contract of {@link #close()}. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
hasBeenClosed	TokenNameIdentifier	 has Been Closed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The internal buffer where data is stored. */	TokenNameCOMMENT_JAVADOC	 The internal buffer where data is stored. 
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
;	TokenNameSEMICOLON	
/** * The number of valid bytes in the buffer. This value is always * in the range <tt>0</tt> through <tt>buf.length</tt>; elements * <tt>buf[0]</tt> through <tt>buf[count-1]</tt> contain valid * byte data. */	TokenNameCOMMENT_JAVADOC	 The number of valid bytes in the buffer. This value is always in the range <tt>0</tt> through <tt>buf.length</tt>; elements <tt>buf[0]</tt> through <tt>buf[count-1]</tt> contain valid byte data. 
protected	TokenNameprotected	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
/** * Remembers the size of the buffer for speed. */	TokenNameCOMMENT_JAVADOC	 Remembers the size of the buffer for speed. 
private	TokenNameprivate	
int	TokenNameint	
bufLength	TokenNameIdentifier	 buf Length
;	TokenNameSEMICOLON	
/** * The default number of bytes in the buffer. =2048 */	TokenNameCOMMENT_JAVADOC	 The default number of bytes in the buffer. =2048 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_BUFFER_LENGTH	TokenNameIdentifier	 DEFAULT  BUFFER  LENGTH
=	TokenNameEQUAL	
2048	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The category to write to. */	TokenNameCOMMENT_JAVADOC	 The category to write to. 
protected	TokenNameprotected	
Category	TokenNameIdentifier	 Category
category	TokenNameIdentifier	 category
;	TokenNameSEMICOLON	
/** * The priority to use when writing to the Category. */	TokenNameCOMMENT_JAVADOC	 The priority to use when writing to the Category. 
protected	TokenNameprotected	
Priority	TokenNameIdentifier	 Priority
priority	TokenNameIdentifier	 priority
;	TokenNameSEMICOLON	
private	TokenNameprivate	
LoggingOutputStream	TokenNameIdentifier	 Logging Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// illegal 	TokenNameCOMMENT_LINE	illegal 
}	TokenNameRBRACE	
/** * Creates the LoggingOutputStream to flush to the given Category. * * @param cat the Category to write to * * @param priority the Priority to use when writing to the Category * * @exception IllegalArgumentException * if cat == null or priority == null */	TokenNameCOMMENT_JAVADOC	 Creates the LoggingOutputStream to flush to the given Category. * @param cat the Category to write to * @param priority the Priority to use when writing to the Category * @exception IllegalArgumentException if cat == null or priority == null 
public	TokenNamepublic	
LoggingOutputStream	TokenNameIdentifier	 Logging Output Stream
(	TokenNameLPAREN	
Category	TokenNameIdentifier	 Category
cat	TokenNameIdentifier	 cat
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cat	TokenNameIdentifier	 cat
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"cat == null"	TokenNameStringLiteral	cat == null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
priority	TokenNameIdentifier	 priority
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"priority == null"	TokenNameStringLiteral	priority == null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
priority	TokenNameIdentifier	 priority
=	TokenNameEQUAL	
priority	TokenNameIdentifier	 priority
;	TokenNameSEMICOLON	
category	TokenNameIdentifier	 category
=	TokenNameEQUAL	
cat	TokenNameIdentifier	 cat
;	TokenNameSEMICOLON	
bufLength	TokenNameIdentifier	 buf Length
=	TokenNameEQUAL	
DEFAULT_BUFFER_LENGTH	TokenNameIdentifier	 DEFAULT  BUFFER  LENGTH
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
DEFAULT_BUFFER_LENGTH	TokenNameIdentifier	 DEFAULT  BUFFER  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Closes this output stream and releases any system resources * associated with this stream. The general contract of <code>close</code> * is that it closes the output stream. A closed stream cannot perform * output operations and cannot be reopened. */	TokenNameCOMMENT_JAVADOC	 Closes this output stream and releases any system resources associated with this stream. The general contract of <code>close</code> is that it closes the output stream. A closed stream cannot perform output operations and cannot be reopened. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasBeenClosed	TokenNameIdentifier	 has Been Closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes the specified byte to this output stream. The general * contract for <code>write</code> is that one byte is written * to the output stream. The byte to be written is the eight * low-order bits of the argument <code>b</code>. The 24 * high-order bits of <code>b</code> are ignored. * * @param b the <code>byte</code> to write * * @exception IOException * if an I/O error occurs. In particular, * an <code>IOException</code> may be thrown if the * output stream has been closed. */	TokenNameCOMMENT_JAVADOC	 Writes the specified byte to this output stream. The general contract for <code>write</code> is that one byte is written to the output stream. The byte to be written is the eight low-order bits of the argument <code>b</code>. The 24 high-order bits of <code>b</code> are ignored. * @param b the <code>byte</code> to write * @exception IOException if an I/O error occurs. In particular, an <code>IOException</code> may be thrown if the output stream has been closed. 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasBeenClosed	TokenNameIdentifier	 has Been Closed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"The stream has been closed."	TokenNameStringLiteral	The stream has been closed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// don't log nulls 	TokenNameCOMMENT_LINE	don't log nulls 
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// would this be writing past the buffer? 	TokenNameCOMMENT_LINE	would this be writing past the buffer? 
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
bufLength	TokenNameIdentifier	 buf Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// grow the buffer 	TokenNameCOMMENT_LINE	grow the buffer 
final	TokenNamefinal	
int	TokenNameint	
newBufLength	TokenNameIdentifier	 new Buf Length
=	TokenNameEQUAL	
bufLength	TokenNameIdentifier	 buf Length
+	TokenNamePLUS	
DEFAULT_BUFFER_LENGTH	TokenNameIdentifier	 DEFAULT  BUFFER  LENGTH
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBuf	TokenNameIdentifier	 new Buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
newBufLength	TokenNameIdentifier	 new Buf Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newBuf	TokenNameIdentifier	 new Buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bufLength	TokenNameIdentifier	 buf Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
newBuf	TokenNameIdentifier	 new Buf
;	TokenNameSEMICOLON	
bufLength	TokenNameIdentifier	 buf Length
=	TokenNameEQUAL	
newBufLength	TokenNameIdentifier	 new Buf Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Flushes this output stream and forces any buffered output bytes * to be written out. The general contract of <code>flush</code> is * that calling it is an indication that, if any bytes previously * written have been buffered by the implementation of the output * stream, such bytes should immediately be written to their * intended destination. */	TokenNameCOMMENT_JAVADOC	 Flushes this output stream and forces any buffered output bytes to be written out. The general contract of <code>flush</code> is that calling it is an indication that, if any bytes previously written have been buffered by the implementation of the output stream, such bytes should immediately be written to their intended destination. 
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// don't print out blank lines; flushing from PrintStream puts out these 	TokenNameCOMMENT_LINE	don't print out blank lines; flushing from PrintStream puts out these 
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
LINE_SEPERATOR	TokenNameIdentifier	 LINE  SEPERATOR
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
LINE_SEPERATOR	TokenNameIdentifier	 LINE  SEPERATOR
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
// <- Unix & Mac, -> Windows 	TokenNameCOMMENT_LINE	<- Unix & Mac, -> Windows 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
LINE_SEPERATOR	TokenNameIdentifier	 LINE  SEPERATOR
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
theBytes	TokenNameIdentifier	 the Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
theBytes	TokenNameIdentifier	 the Bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
category	TokenNameIdentifier	 category
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
priority	TokenNameIdentifier	 priority
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
theBytes	TokenNameIdentifier	 the Bytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not resetting the buffer -- assuming that if it grew that it 	TokenNameCOMMENT_LINE	not resetting the buffer -- assuming that if it grew that it 
// will likely grow similarly again 	TokenNameCOMMENT_LINE	will likely grow similarly again 
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
