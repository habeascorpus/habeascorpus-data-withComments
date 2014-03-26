/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SerializerTraceWriter.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SerializerTraceWriter.java 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
/** * This class wraps the real writer, it only purpose is to send * CHARACTERTOSTREAM events to the trace listener. * Each method immediately sends the call to the wrapped writer unchanged, but * in addition it collects characters to be issued to a trace listener. * * In this way the trace * listener knows what characters have been written to the output Writer. * * There may still be differences in what the trace events say is going to the * output writer and what is really going there. These differences will be due * to the fact that this class is UTF-8 encoding before emiting the trace event * and the underlying writer may not be UTF-8 encoding. There may also be * encoding differences. So the main pupose of this class is to provide a * resonable facsimile of the true output. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class wraps the real writer, it only purpose is to send CHARACTERTOSTREAM events to the trace listener. Each method immediately sends the call to the wrapped writer unchanged, but in addition it collects characters to be issued to a trace listener. * In this way the trace listener knows what characters have been written to the output Writer. * There may still be differences in what the trace events say is going to the output writer and what is really going there. These differences will be due to the fact that this class is UTF-8 encoding before emiting the trace event and the underlying writer may not be UTF-8 encoding. There may also be encoding differences. So the main pupose of this class is to provide a resonable facsimile of the true output. * @xsl.usage internal 
final	TokenNamefinal	
class	TokenNameclass	
SerializerTraceWriter	TokenNameIdentifier	 Serializer Trace Writer
extends	TokenNameextends	
Writer	TokenNameIdentifier	 Writer
implements	TokenNameimplements	
WriterChain	TokenNameIdentifier	 Writer Chain
{	TokenNameLBRACE	
/** The real writer to immediately write to. * This reference may be null, in which case nothing is written out, but * only the trace events are fired for output. */	TokenNameCOMMENT_JAVADOC	 The real writer to immediately write to. This reference may be null, in which case nothing is written out, but only the trace events are fired for output. 
private	TokenNameprivate	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
/** The tracer to send events to */	TokenNameCOMMENT_JAVADOC	 The tracer to send events to 
private	TokenNameprivate	
final	TokenNamefinal	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
m_tracer	TokenNameIdentifier	 m tracer
;	TokenNameSEMICOLON	
/** The size of the internal buffer, just to keep too many * events from being sent to the tracer */	TokenNameCOMMENT_JAVADOC	 The size of the internal buffer, just to keep too many events from being sent to the tracer 
private	TokenNameprivate	
int	TokenNameint	
buf_length	TokenNameIdentifier	 buf length
;	TokenNameSEMICOLON	
/** * Internal buffer to collect the characters to go to the trace listener. * */	TokenNameCOMMENT_JAVADOC	 Internal buffer to collect the characters to go to the trace listener. 
private	TokenNameprivate	
byte	TokenNamebyte	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * How many bytes have been collected and still need to go to trace * listener. */	TokenNameCOMMENT_JAVADOC	 How many bytes have been collected and still need to go to trace listener. 
private	TokenNameprivate	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
/** * Creates or replaces the internal buffer, and makes sure it has a few * extra bytes slight overflow of the last UTF8 encoded character. * @param size */	TokenNameCOMMENT_JAVADOC	 Creates or replaces the internal buffer, and makes sure it has a few extra bytes slight overflow of the last UTF8 encoded character. @param size 
private	TokenNameprivate	
void	TokenNamevoid	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
buf_length	TokenNameIdentifier	 buf length
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor. * If the writer passed in is null, then this SerializerTraceWriter will * only signal trace events of what would have been written to that writer. * If the writer passed in is not null then the trace events will mirror * what is going to that writer. In this way tools, such as a debugger, can * gather information on what is being written out. * * @param out the Writer to write to (possibly null) * @param tracer the tracer to inform that characters are being written */	TokenNameCOMMENT_JAVADOC	 Constructor. If the writer passed in is null, then this SerializerTraceWriter will only signal trace events of what would have been written to that writer. If the writer passed in is not null then the trace events will mirror what is going to that writer. In this way tools, such as a debugger, can gather information on what is being written out. * @param out the Writer to write to (possibly null) @param tracer the tracer to inform that characters are being written 
public	TokenNamepublic	
SerializerTraceWriter	TokenNameIdentifier	 Serializer Trace Writer
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
tracer	TokenNameIdentifier	 tracer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_writer	TokenNameIdentifier	 m writer
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
m_tracer	TokenNameIdentifier	 m tracer
=	TokenNameEQUAL	
tracer	TokenNameIdentifier	 tracer
;	TokenNameSEMICOLON	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Flush out the collected characters by sending them to the trace * listener. These characters are never written to the real writer * (m_writer) because that has already happened with every method * call. This method simple informs the listener of what has already * happened. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Flush out the collected characters by sending them to the trace listener. These characters are never written to the real writer (m_writer) because that has already happened with every method call. This method simple informs the listener of what has already happened. @throws IOException 
private	TokenNameprivate	
void	TokenNamevoid	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Just for tracing purposes 	TokenNameCOMMENT_LINE	Just for tracing purposes 
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_tracer	TokenNameIdentifier	 m tracer
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_OUTPUT_CHARACTERS	TokenNameIdentifier	 EVENTTYPE  OUTPUT  CHARACTERS
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Flush the internal buffer and flush the Writer * @see java.io.Writer#flush() */	TokenNameCOMMENT_JAVADOC	 Flush the internal buffer and flush the Writer @see java.io.Writer#flush() 
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// send to the real writer 	TokenNameCOMMENT_LINE	send to the real writer 
if	TokenNameif	
(	TokenNameLPAREN	
m_writer	TokenNameIdentifier	 m writer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// from here on just for tracing purposes 	TokenNameCOMMENT_LINE	from here on just for tracing purposes 
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Flush the internal buffer and close the Writer * @see java.io.Writer#close() */	TokenNameCOMMENT_JAVADOC	 Flush the internal buffer and close the Writer @see java.io.Writer#close() 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// send to the real writer 	TokenNameCOMMENT_LINE	send to the real writer 
if	TokenNameif	
(	TokenNameLPAREN	
m_writer	TokenNameIdentifier	 m writer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// from here on just for tracing purposes 	TokenNameCOMMENT_LINE	from here on just for tracing purposes 
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write a single character. The character to be written is contained in * the 16 low-order bits of the given integer value; the 16 high-order bits * are ignored. * * <p> Subclasses that intend to support efficient single-character output * should override this method. * * @param c int specifying a character to be written. * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Write a single character. The character to be written is contained in the 16 low-order bits of the given integer value; the 16 high-order bits are ignored. * <p> Subclasses that intend to support efficient single-character output should override this method. * @param c int specifying a character to be written. @exception IOException If an I/O error occurs 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// send to the real writer 	TokenNameCOMMENT_LINE	send to the real writer 
if	TokenNameif	
(	TokenNameLPAREN	
m_writer	TokenNameIdentifier	 m writer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------- from here on just collect for tracing purposes 	TokenNameCOMMENT_LINE	---------- from here on just collect for tracing purposes 
/* If we are close to the end of the buffer then flush it. * Remember the buffer can hold a few more characters than buf_length */	TokenNameCOMMENT_BLOCK	 If we are close to the end of the buffer then flush it. Remember the buffer can hold a few more characters than buf_length 
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>=	TokenNameGREATER_EQUAL	
buf_length	TokenNameIdentifier	 buf length
)	TokenNameRPAREN	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xc0	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xe0	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Write a portion of an array of characters. * * @param chars Array of characters * @param start Offset from which to start writing characters * @param length Number of characters to write * * @exception IOException If an I/O error occurs * * @throws java.io.IOException */	TokenNameCOMMENT_JAVADOC	 Write a portion of an array of characters. * @param chars Array of characters @param start Offset from which to start writing characters @param length Number of characters to write * @exception IOException If an I/O error occurs * @throws java.io.IOException 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// send to the real writer 	TokenNameCOMMENT_LINE	send to the real writer 
if	TokenNameif	
(	TokenNameLPAREN	
m_writer	TokenNameIdentifier	 m writer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// from here on just collect for tracing purposes 	TokenNameCOMMENT_LINE	from here on just collect for tracing purposes 
int	TokenNameint	
lengthx3	TokenNameIdentifier	 lengthx3
=	TokenNameEQUAL	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lengthx3	TokenNameIdentifier	 lengthx3
>=	TokenNameGREATER_EQUAL	
buf_length	TokenNameIdentifier	 buf length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* If the request length exceeds the size of the output buffer, * flush the output buffer and make the buffer bigger to handle. */	TokenNameCOMMENT_BLOCK	 If the request length exceeds the size of the output buffer, flush the output buffer and make the buffer bigger to handle. 
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
lengthx3	TokenNameIdentifier	 lengthx3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lengthx3	TokenNameIdentifier	 lengthx3
>	TokenNameGREATER	
buf_length	TokenNameIdentifier	 buf length
-	TokenNameMINUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xc0	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xe0	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Write a string. * * @param s String to be written * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Write a string. * @param s String to be written * @exception IOException If an I/O error occurs 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// send to the real writer 	TokenNameCOMMENT_LINE	send to the real writer 
if	TokenNameif	
(	TokenNameLPAREN	
m_writer	TokenNameIdentifier	 m writer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// from here on just collect for tracing purposes 	TokenNameCOMMENT_LINE	from here on just collect for tracing purposes 
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We multiply the length by three since this is the maximum length 	TokenNameCOMMENT_LINE	We multiply the length by three since this is the maximum length 
// of the characters that we can put into the buffer. It is possible 	TokenNameCOMMENT_LINE	of the characters that we can put into the buffer. It is possible 
// for each Unicode character to expand to three bytes. 	TokenNameCOMMENT_LINE	for each Unicode character to expand to three bytes. 
int	TokenNameint	
lengthx3	TokenNameIdentifier	 lengthx3
=	TokenNameEQUAL	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lengthx3	TokenNameIdentifier	 lengthx3
>=	TokenNameGREATER_EQUAL	
buf_length	TokenNameIdentifier	 buf length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* If the request length exceeds the size of the output buffer, * flush the output buffer and make the buffer bigger to handle. */	TokenNameCOMMENT_BLOCK	 If the request length exceeds the size of the output buffer, flush the output buffer and make the buffer bigger to handle. 
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
lengthx3	TokenNameIdentifier	 lengthx3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lengthx3	TokenNameIdentifier	 lengthx3
>	TokenNameGREATER	
buf_length	TokenNameIdentifier	 buf length
-	TokenNameMINUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xc0	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xe0	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the writer that this one directly wraps. */	TokenNameCOMMENT_JAVADOC	 Get the writer that this one directly wraps. 
public	TokenNamepublic	
Writer	TokenNameIdentifier	 Writer
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the OutputStream that is the at the end of the * chain of writers. */	TokenNameCOMMENT_JAVADOC	 Get the OutputStream that is the at the end of the chain of writers. 
public	TokenNamepublic	
OutputStream	TokenNameIdentifier	 Output Stream
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OutputStream	TokenNameIdentifier	 Output Stream
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_writer	TokenNameIdentifier	 m writer
instanceof	TokenNameinstanceof	
WriterChain	TokenNameIdentifier	 Writer Chain
)	TokenNameRPAREN	
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
WriterChain	TokenNameIdentifier	 Writer Chain
)	TokenNameRPAREN	
m_writer	TokenNameIdentifier	 m writer
)	TokenNameRPAREN	
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
retval	TokenNameIdentifier	 retval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
