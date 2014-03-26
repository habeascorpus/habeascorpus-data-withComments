/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
io	TokenNameIdentifier	 io
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInputStream	TokenNameIdentifier	 Data Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FilterInputStream	TokenNameIdentifier	 Filter Input Stream
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
/** * This input stream works in conjunction with the WrappedOutputStream * to introduce a protocol for reading arbitrary length data in a * uniform way. * <p> * <strong>Note:</strong> See the javadoc for WrappedOutputStream for * more information. * * @see WrappedOutputStream * * @author Andy Clark, IBM * * @version $Id: WrappedInputStream.java 699895 2008-09-28 21:21:24Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This input stream works in conjunction with the WrappedOutputStream to introduce a protocol for reading arbitrary length data in a uniform way. <p> <strong>Note:</strong> See the javadoc for WrappedOutputStream for more information. * @see WrappedOutputStream * @author Andy Clark, IBM * @version $Id: WrappedInputStream.java 699895 2008-09-28 21:21:24Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
WrappedInputStream	TokenNameIdentifier	 Wrapped Input Stream
extends	TokenNameextends	
FilterInputStream	TokenNameIdentifier	 Filter Input Stream
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Bytes left on input stream for current packet. */	TokenNameCOMMENT_JAVADOC	 Bytes left on input stream for current packet. 
protected	TokenNameprotected	
int	TokenNameint	
fPacketCount	TokenNameIdentifier	 f Packet Count
;	TokenNameSEMICOLON	
/** * Data input stream. This stream is used to input the block sizes * from the data stream that are written by the WrappedOutputStream. * <p> * <strong>Note:</strong> The data input stream is only used for * reading the byte count for performance reasons. We avoid the * method indirection for reading the byte data. */	TokenNameCOMMENT_JAVADOC	 Data input stream. This stream is used to input the block sizes from the data stream that are written by the WrappedOutputStream. <p> <strong>Note:</strong> The data input stream is only used for reading the byte count for performance reasons. We avoid the method indirection for reading the byte data. 
protected	TokenNameprotected	
DataInputStream	TokenNameIdentifier	 Data Input Stream
fDataInputStream	TokenNameIdentifier	 f Data Input Stream
;	TokenNameSEMICOLON	
/** To mark that the stream is "closed". */	TokenNameCOMMENT_JAVADOC	 To mark that the stream is "closed". 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fClosed	TokenNameIdentifier	 f Closed
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a wrapper for the given an input stream. */	TokenNameCOMMENT_JAVADOC	 Constructs a wrapper for the given an input stream. 
public	TokenNamepublic	
WrappedInputStream	TokenNameIdentifier	 Wrapped Input Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDataInputStream	TokenNameIdentifier	 f Data Input Stream
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(InputStream) 	TokenNameCOMMENT_LINE	<init>(InputStream) 
// 	TokenNameCOMMENT_LINE	 
// InputStream methods 	TokenNameCOMMENT_LINE	InputStream methods 
// 	TokenNameCOMMENT_LINE	 
/** Reads a single byte. */	TokenNameCOMMENT_JAVADOC	 Reads a single byte. 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// ignore, if already closed 	TokenNameCOMMENT_LINE	ignore, if already closed 
if	TokenNameif	
(	TokenNameLPAREN	
fClosed	TokenNameIdentifier	 f Closed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// read packet header 	TokenNameCOMMENT_LINE	read packet header 
if	TokenNameif	
(	TokenNameLPAREN	
fPacketCount	TokenNameIdentifier	 f Packet Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPacketCount	TokenNameIdentifier	 f Packet Count
=	TokenNameEQUAL	
fDataInputStream	TokenNameIdentifier	 f Data Input Stream
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fPacketCount	TokenNameIdentifier	 f Packet Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fClosed	TokenNameIdentifier	 f Closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// read a byte from the packet 	TokenNameCOMMENT_LINE	read a byte from the packet 
fPacketCount	TokenNameIdentifier	 f Packet Count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// read():int 	TokenNameCOMMENT_LINE	read():int 
/** * Reads a block of bytes and returns the total number of bytes read. */	TokenNameCOMMENT_JAVADOC	 Reads a block of bytes and returns the total number of bytes read. 
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
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// ignore, if already closed 	TokenNameCOMMENT_LINE	ignore, if already closed 
if	TokenNameif	
(	TokenNameLPAREN	
fClosed	TokenNameIdentifier	 f Closed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// read packet header 	TokenNameCOMMENT_LINE	read packet header 
if	TokenNameif	
(	TokenNameLPAREN	
fPacketCount	TokenNameIdentifier	 f Packet Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPacketCount	TokenNameIdentifier	 f Packet Count
=	TokenNameEQUAL	
fDataInputStream	TokenNameIdentifier	 f Data Input Stream
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fPacketCount	TokenNameIdentifier	 f Packet Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fClosed	TokenNameIdentifier	 f Closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// read bytes from packet 	TokenNameCOMMENT_LINE	read bytes from packet 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
fPacketCount	TokenNameIdentifier	 f Packet Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fPacketCount	TokenNameIdentifier	 f Packet Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
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
// NOTE: This condition should not happen. The end of 	TokenNameCOMMENT_LINE	NOTE: This condition should not happen. The end of 
// the stream should always be designated by a 	TokenNameCOMMENT_LINE	the stream should always be designated by a 
// byte count header of 0. -Ac 	TokenNameCOMMENT_LINE	byte count header of 0. -Ac 
fClosed	TokenNameIdentifier	 f Closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fPacketCount	TokenNameIdentifier	 f Packet Count
-=	TokenNameMINUS_EQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
// return total bytes read 	TokenNameCOMMENT_LINE	return total bytes read 
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// read(byte[],int,int):int 	TokenNameCOMMENT_LINE	read(byte[],int,int):int 
/** Skips the specified number of bytes from the input stream. */	TokenNameCOMMENT_JAVADOC	 Skips the specified number of bytes from the input stream. 
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fClosed	TokenNameIdentifier	 f Closed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NOTE: This should be rewritten to be more efficient. -Ac 	TokenNameCOMMENT_LINE	NOTE: This should be rewritten to be more efficient. -Ac 
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
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
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
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
return	TokenNamereturn	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skip(long):long 	TokenNameCOMMENT_LINE	skip(long):long 
/** * Closes the input stream. This method will search for the end of * the wrapped input, positioning the stream at after the end packet. * <p> * <strong>Note:</strong> This method does not close the underlying * input stream. */	TokenNameCOMMENT_JAVADOC	 Closes the input stream. This method will search for the end of the wrapped input, positioning the stream at after the end packet. <p> <strong>Note:</strong> This method does not close the underlying input stream. 
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
!	TokenNameNOT	
fClosed	TokenNameIdentifier	 f Closed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fClosed	TokenNameIdentifier	 f Closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
fPacketCount	TokenNameIdentifier	 f Packet Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fPacketCount	TokenNameIdentifier	 f Packet Count
=	TokenNameEQUAL	
fDataInputStream	TokenNameIdentifier	 f Data Input Stream
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fPacketCount	TokenNameIdentifier	 f Packet Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// close() 	TokenNameCOMMENT_LINE	close() 
}	TokenNameRBRACE	
// class WrappedInputStream 	TokenNameCOMMENT_LINE	class WrappedInputStream 
