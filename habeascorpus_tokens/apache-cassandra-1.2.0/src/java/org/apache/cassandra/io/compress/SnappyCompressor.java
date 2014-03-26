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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
LoggerFactory	TokenNameIdentifier	 Logger Factory
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xerial	TokenNameIdentifier	 xerial
.	TokenNameDOT	
snappy	TokenNameIdentifier	 snappy
.	TokenNameDOT	
SnappyError	TokenNameIdentifier	 Snappy Error
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SnappyCompressor	TokenNameIdentifier	 Snappy Compressor
implements	TokenNameimplements	
ICompressor	TokenNameIdentifier	 I Compressor
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SnappyCompressor	TokenNameIdentifier	 Snappy Compressor
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
SnappyCompressor	TokenNameIdentifier	 Snappy Compressor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
SnappyCompressor	TokenNameIdentifier	 Snappy Compressor
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAvailable	TokenNameIdentifier	 is Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Cannot initialize native Snappy library. Compression on new tables will be disabled."	TokenNameStringLiteral	Cannot initialize native Snappy library. Compression on new tables will be disabled.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
SnappyCompressor	TokenNameIdentifier	 Snappy Compressor
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
// this would throw java.lang.NoClassDefFoundError if Snappy class 	TokenNameCOMMENT_LINE	this would throw java.lang.NoClassDefFoundError if Snappy class 
// wasn't found at runtime which should be processed by calling method 	TokenNameCOMMENT_LINE	wasn't found at runtime which should be processed by calling method 
Snappy	TokenNameIdentifier	 Snappy
.	TokenNameDOT	
getNativeLibraryVersion	TokenNameIdentifier	 get Native Library Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no specific options supported so far 	TokenNameCOMMENT_LINE	no specific options supported so far 
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isAvailable	TokenNameIdentifier	 is Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoClassDefFoundError	TokenNameIdentifier	 No Class Def Found Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SnappyError	TokenNameIdentifier	 Snappy Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsatisfiedLinkError	TokenNameIdentifier	 Unsatisfied Link Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
Snappy	TokenNameIdentifier	 Snappy
.	TokenNameDOT	
maxCompressedLength	TokenNameIdentifier	 max Compressed Length
(	TokenNameLPAREN	
chunkLength	TokenNameIdentifier	 chunk Length
)	TokenNameRPAREN	
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
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
Snappy	TokenNameIdentifier	 Snappy
.	TokenNameDOT	
rawCompress	TokenNameIdentifier	 raw Compress
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
inputOffset	TokenNameIdentifier	 input Offset
,	TokenNameCOMMA	
inputLength	TokenNameIdentifier	 input Length
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
outputOffset	TokenNameIdentifier	 output Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
return	TokenNamereturn	
Snappy	TokenNameIdentifier	 Snappy
.	TokenNameDOT	
rawUncompress	TokenNameIdentifier	 raw Uncompress
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
inputOffset	TokenNameIdentifier	 input Offset
,	TokenNameCOMMA	
inputLength	TokenNameIdentifier	 input Length
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
outputOffset	TokenNameIdentifier	 output Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
