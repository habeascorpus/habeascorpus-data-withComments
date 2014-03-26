/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
jboss	TokenNameIdentifier	 jboss
.	TokenNameDOT	
netty	TokenNameIdentifier	 netty
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xerial	TokenNameIdentifier	 xerial
.	TokenNameDOT	
snappy	TokenNameIdentifier	 snappy
.	TokenNameDOT	
Snappy	TokenNameIdentifier	 Snappy
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
FrameCompressor	TokenNameIdentifier	 Frame Compressor
{	TokenNameLBRACE	
public	TokenNamepublic	
Frame	TokenNameIdentifier	 Frame
compress	TokenNameIdentifier	 compress
(	TokenNameLPAREN	
Frame	TokenNameIdentifier	 Frame
frame	TokenNameIdentifier	 frame
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Frame	TokenNameIdentifier	 Frame
decompress	TokenNameIdentifier	 decompress
(	TokenNameLPAREN	
Frame	TokenNameIdentifier	 Frame
frame	TokenNameIdentifier	 frame
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/* * TODO: We can probably do more efficient, like by avoiding copy. * Also, we don't reuse ICompressor because the API doesn't expose enough. */	TokenNameCOMMENT_BLOCK	 TODO: We can probably do more efficient, like by avoiding copy. Also, we don't reuse ICompressor because the API doesn't expose enough. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
SnappyCompressor	TokenNameIdentifier	 Snappy Compressor
implements	TokenNameimplements	
FrameCompressor	TokenNameIdentifier	 Frame Compressor
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SnappyCompressor	TokenNameIdentifier	 Snappy Compressor
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
SnappyCompressor	TokenNameIdentifier	 Snappy Compressor
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
new	TokenNamenew	
SnappyCompressor	TokenNameIdentifier	 Snappy Compressor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoClassDefFoundError	TokenNameIdentifier	 No Class Def Found Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
SnappyCompressor	TokenNameIdentifier	 Snappy Compressor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this would throw java.lang.NoClassDefFoundError if Snappy class 	TokenNameCOMMENT_LINE	this would throw java.lang.NoClassDefFoundError if Snappy class 
// wasn't found at runtime which should be processed by the calling method 	TokenNameCOMMENT_LINE	wasn't found at runtime which should be processed by the calling method 
Snappy	TokenNameIdentifier	 Snappy
.	TokenNameDOT	
getNativeLibraryVersion	TokenNameIdentifier	 get Native Library Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Frame	TokenNameIdentifier	 Frame
compress	TokenNameIdentifier	 compress
(	TokenNameLPAREN	
Frame	TokenNameIdentifier	 Frame
frame	TokenNameIdentifier	 frame
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
readableBytes	TokenNameIdentifier	 readable Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
Snappy	TokenNameIdentifier	 Snappy
.	TokenNameDOT	
maxCompressedLength	TokenNameIdentifier	 max Compressed Length
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
written	TokenNameIdentifier	 written
=	TokenNameEQUAL	
Snappy	TokenNameIdentifier	 Snappy
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
with	TokenNameIdentifier	 with
(	TokenNameLPAREN	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
written	TokenNameIdentifier	 written
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Frame	TokenNameIdentifier	 Frame
decompress	TokenNameIdentifier	 decompress
(	TokenNameLPAREN	
Frame	TokenNameIdentifier	 Frame
frame	TokenNameIdentifier	 frame
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
readableBytes	TokenNameIdentifier	 readable Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Snappy	TokenNameIdentifier	 Snappy
.	TokenNameDOT	
isValidCompressedBuffer	TokenNameIdentifier	 is Valid Compressed Buffer
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
"Provided frame does not appear to be Snappy compressed"	TokenNameStringLiteral	Provided frame does not appear to be Snappy compressed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
Snappy	TokenNameIdentifier	 Snappy
.	TokenNameDOT	
uncompressedLength	TokenNameIdentifier	 uncompressed Length
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
Snappy	TokenNameIdentifier	 Snappy
.	TokenNameDOT	
uncompress	TokenNameIdentifier	 uncompress
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
with	TokenNameIdentifier	 with
(	TokenNameLPAREN	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
