/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
DataFormatException	TokenNameIdentifier	 Data Format Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
Deflater	TokenNameIdentifier	 Deflater
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
Inflater	TokenNameIdentifier	 Inflater
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
DeflateCompressor	TokenNameIdentifier	 Deflate Compressor
implements	TokenNameimplements	
ICompressor	TokenNameIdentifier	 I Compressor
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
DeflateCompressor	TokenNameIdentifier	 Deflate Compressor
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
DeflateCompressor	TokenNameIdentifier	 Deflate Compressor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
Deflater	TokenNameIdentifier	 Deflater
>	TokenNameGREATER	
deflater	TokenNameIdentifier	 deflater
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
Inflater	TokenNameIdentifier	 Inflater
>	TokenNameGREATER	
inflater	TokenNameIdentifier	 inflater
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
DeflateCompressor	TokenNameIdentifier	 Deflate Compressor
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
compressionOptions	TokenNameIdentifier	 compression Options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no specific options supported so far 	TokenNameCOMMENT_LINE	no specific options supported so far 
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
DeflateCompressor	TokenNameIdentifier	 Deflate Compressor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deflater	TokenNameIdentifier	 deflater
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
Deflater	TokenNameIdentifier	 Deflater
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
Deflater	TokenNameIdentifier	 Deflater
initialValue	TokenNameIdentifier	 initial Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Deflater	TokenNameIdentifier	 Deflater
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
inflater	TokenNameIdentifier	 inflater
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
Inflater	TokenNameIdentifier	 Inflater
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
Inflater	TokenNameIdentifier	 Inflater
initialValue	TokenNameIdentifier	 initial Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Inflater	TokenNameIdentifier	 Inflater
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
supportedOptions	TokenNameIdentifier	 supported Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
initialCompressedBufferLength	TokenNameIdentifier	 initial Compressed Buffer Length
(	TokenNameLPAREN	
int	TokenNameint	
chunkLength	TokenNameIdentifier	 chunk Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
chunkLength	TokenNameIdentifier	 chunk Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compress	TokenNameIdentifier	 compress
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
inputOffset	TokenNameIdentifier	 input Offset
,	TokenNameCOMMA	
int	TokenNameint	
inputLength	TokenNameIdentifier	 input Length
,	TokenNameCOMMA	
ICompressor	TokenNameIdentifier	 I Compressor
.	TokenNameDOT	
WrappedArray	TokenNameIdentifier	 Wrapped Array
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
outputOffset	TokenNameIdentifier	 output Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Deflater	TokenNameIdentifier	 Deflater
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
deflater	TokenNameIdentifier	 deflater
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
setInput	TokenNameIdentifier	 set Input
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
inputOffset	TokenNameIdentifier	 input Offset
,	TokenNameCOMMA	
inputLength	TokenNameIdentifier	 input Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
needsInput	TokenNameIdentifier	 needs Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
offs	TokenNameIdentifier	 offs
=	TokenNameEQUAL	
outputOffset	TokenNameIdentifier	 output Offset
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offs	TokenNameIdentifier	 offs
+=	TokenNamePLUS_EQUAL	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
deflate	TokenNameIdentifier	 deflate
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offs	TokenNameIdentifier	 offs
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
offs	TokenNameIdentifier	 offs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
offs	TokenNameIdentifier	 offs
-	TokenNameMINUS	
outputOffset	TokenNameIdentifier	 output Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// We're not done, output was too small. Increase it and continue 	TokenNameCOMMENT_LINE	We're not done, output was too small. Increase it and continue 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBuffer	TokenNameIdentifier	 new Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newBuffer	TokenNameIdentifier	 new Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
offs	TokenNameIdentifier	 offs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
newBuffer	TokenNameIdentifier	 new Buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
uncompress	TokenNameIdentifier	 uncompress
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
inputOffset	TokenNameIdentifier	 input Offset
,	TokenNameCOMMA	
int	TokenNameint	
inputLength	TokenNameIdentifier	 input Length
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
outputOffset	TokenNameIdentifier	 output Offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Inflater	TokenNameIdentifier	 Inflater
inf	TokenNameIdentifier	 inf
=	TokenNameEQUAL	
inflater	TokenNameIdentifier	 inflater
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inf	TokenNameIdentifier	 inf
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inf	TokenNameIdentifier	 inf
.	TokenNameDOT	
setInput	TokenNameIdentifier	 set Input
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
inputOffset	TokenNameIdentifier	 input Offset
,	TokenNameCOMMA	
inputLength	TokenNameIdentifier	 input Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inf	TokenNameIdentifier	 inf
.	TokenNameDOT	
needsInput	TokenNameIdentifier	 needs Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// We assume output is big enough 	TokenNameCOMMENT_LINE	We assume output is big enough 
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
inf	TokenNameIdentifier	 inf
.	TokenNameDOT	
inflate	TokenNameIdentifier	 inflate
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
outputOffset	TokenNameIdentifier	 output Offset
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
outputOffset	TokenNameIdentifier	 output Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
DataFormatException	TokenNameIdentifier	 Data Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
