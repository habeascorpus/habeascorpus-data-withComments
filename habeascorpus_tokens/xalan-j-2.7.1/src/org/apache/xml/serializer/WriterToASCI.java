/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: WriterToASCI.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: WriterToASCI.java 468654 2006-10-28 07:09:23Z minchau $ 
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
/** * This class writes ASCII to a byte stream as quickly as possible. For the * moment it does not do buffering, though I reserve the right to do some * buffering down the line if I can prove that it will be faster even if the * output stream is buffered. * * This class is only used internally within Xalan. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class writes ASCII to a byte stream as quickly as possible. For the moment it does not do buffering, though I reserve the right to do some buffering down the line if I can prove that it will be faster even if the output stream is buffered. * This class is only used internally within Xalan. * @xsl.usage internal 
class	TokenNameclass	
WriterToASCI	TokenNameIdentifier	 Writer To ASCI
extends	TokenNameextends	
Writer	TokenNameIdentifier	 Writer
implements	TokenNameimplements	
WriterChain	TokenNameIdentifier	 Writer Chain
{	TokenNameLBRACE	
/** The byte stream to write to. */	TokenNameCOMMENT_JAVADOC	 The byte stream to write to. 
private	TokenNameprivate	
final	TokenNamefinal	
OutputStream	TokenNameIdentifier	 Output Stream
m_os	TokenNameIdentifier	 m os
;	TokenNameSEMICOLON	
/** * Create an unbuffered ASCII writer. * * * @param os The byte stream to write to. */	TokenNameCOMMENT_JAVADOC	 Create an unbuffered ASCII writer. * @param os The byte stream to write to. 
public	TokenNamepublic	
WriterToASCI	TokenNameIdentifier	 Writer To ASCI
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_os	TokenNameIdentifier	 m os
=	TokenNameEQUAL	
os	TokenNameIdentifier	 os
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write a portion of an array of characters. * * @param chars Array of characters * @param start Offset from which to start writing characters * @param length Number of characters to write * * @exception IOException If an I/O error occurs * * @throws java.io.IOException */	TokenNameCOMMENT_JAVADOC	 Write a portion of an array of characters. * @param chars Array of characters @param start Offset from which to start writing characters @param length Number of characters to write * @exception IOException If an I/O error occurs * @throws java.io.IOException 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
char	TokenNamechar	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
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
m_os	TokenNameIdentifier	 m os
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Write a single character. The character to be written is contained in * the 16 low-order bits of the given integer value; the 16 high-order bits * are ignored. * * <p> Subclasses that intend to support efficient single-character output * should override this method. * * @param c int specifying a character to be written. * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Write a single character. The character to be written is contained in the 16 low-order bits of the given integer value; the 16 high-order bits are ignored. * <p> Subclasses that intend to support efficient single-character output should override this method. * @param c int specifying a character to be written. @exception IOException If an I/O error occurs 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
m_os	TokenNameIdentifier	 m os
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write a string. * * @param s String to be written * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Write a string. * @param s String to be written * @exception IOException If an I/O error occurs 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_os	TokenNameIdentifier	 m os
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Flush the stream. If the stream has saved any characters from the * various write() methods in a buffer, write them immediately to their * intended destination. Then, if that destination is another character or * byte stream, flush it. Thus one flush() invocation will flush all the * buffers in a chain of Writers and OutputStreams. * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Flush the stream. If the stream has saved any characters from the various write() methods in a buffer, write them immediately to their intended destination. Then, if that destination is another character or byte stream, flush it. Thus one flush() invocation will flush all the buffers in a chain of Writers and OutputStreams. * @exception IOException If an I/O error occurs 
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
m_os	TokenNameIdentifier	 m os
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Close the stream, flushing it first. Once a stream has been closed, * further write() or flush() invocations will cause an IOException to be * thrown. Closing a previously-closed stream, however, has no effect. * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Close the stream, flushing it first. Once a stream has been closed, further write() or flush() invocations will cause an IOException to be thrown. Closing a previously-closed stream, however, has no effect. * @exception IOException If an I/O error occurs 
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
m_os	TokenNameIdentifier	 m os
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the output stream where the events will be serialized to. * * @return reference to the result stream, or null of only a writer was * set. */	TokenNameCOMMENT_JAVADOC	 Get the output stream where the events will be serialized to. * @return reference to the result stream, or null of only a writer was set. 
public	TokenNamepublic	
OutputStream	TokenNameIdentifier	 Output Stream
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_os	TokenNameIdentifier	 m os
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the writer that this writer directly chains to. */	TokenNameCOMMENT_JAVADOC	 Get the writer that this writer directly chains to. 
public	TokenNamepublic	
Writer	TokenNameIdentifier	 Writer
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
