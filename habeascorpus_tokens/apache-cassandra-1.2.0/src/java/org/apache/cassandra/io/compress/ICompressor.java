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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
ICompressor	TokenNameIdentifier	 I Compressor
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
initialCompressedBufferLength	TokenNameIdentifier	 initial Compressed Buffer Length
(	TokenNameLPAREN	
int	TokenNameint	
chunkLength	TokenNameIdentifier	 chunk Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
WrappedArray	TokenNameIdentifier	 Wrapped Array
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
outputOffset	TokenNameIdentifier	 output Offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
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
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
supportedOptions	TokenNameIdentifier	 supported Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A simple wrapper of a byte array. * Not all implementation allows to know what is the maximum size after * compression. This make it hard to size the ouput buffer for compress * (and we want to reuse the buffer). Instead we use this wrapped buffer * so that compress can have the liberty to resize underlying array if * need be. */	TokenNameCOMMENT_JAVADOC	 A simple wrapper of a byte array. Not all implementation allows to know what is the maximum size after compression. This make it hard to size the ouput buffer for compress (and we want to reuse the buffer). Instead we use this wrapped buffer so that compress can have the liberty to resize underlying array if need be. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
WrappedArray	TokenNameIdentifier	 Wrapped Array
{	TokenNameLBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WrappedArray	TokenNameIdentifier	 Wrapped Array
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
