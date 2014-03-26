package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** @lucene.internal */	TokenNameCOMMENT_JAVADOC	 @lucene.internal 
public	TokenNamepublic	
class	TokenNameclass	
RAMFile	TokenNameIdentifier	 RAM File
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1l	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
buffers	TokenNameIdentifier	 buffers
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
RAMDirectory	TokenNameIdentifier	 RAM Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
long	TokenNamelong	
sizeInBytes	TokenNameIdentifier	 size In Bytes
;	TokenNameSEMICOLON	
// This is publicly modifiable via Directory.touchFile(), so direct access not supported 	TokenNameCOMMENT_LINE	This is publicly modifiable via Directory.touchFile(), so direct access not supported 
private	TokenNameprivate	
long	TokenNamelong	
lastModified	TokenNameIdentifier	 last Modified
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// File used as buffer, in no RAMDirectory 	TokenNameCOMMENT_LINE	File used as buffer, in no RAMDirectory 
public	TokenNamepublic	
RAMFile	TokenNameIdentifier	 RAM File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
RAMFile	TokenNameIdentifier	 RAM File
(	TokenNameLPAREN	
RAMDirectory	TokenNameIdentifier	 RAM Directory
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// For non-stream access from thread that might be concurrent with writing 	TokenNameCOMMENT_LINE	For non-stream access from thread that might be concurrent with writing 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
long	TokenNamelong	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
long	TokenNamelong	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// For non-stream access from thread that might be concurrent with writing 	TokenNameCOMMENT_LINE	For non-stream access from thread that might be concurrent with writing 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
long	TokenNamelong	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastModified	TokenNameIdentifier	 last Modified
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setLastModified	TokenNameIdentifier	 set Last Modified
(	TokenNameLPAREN	
long	TokenNamelong	
lastModified	TokenNameIdentifier	 last Modified
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
=	TokenNameEQUAL	
lastModified	TokenNameIdentifier	 last Modified
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
addBuffer	TokenNameIdentifier	 add Buffer
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
newBuffer	TokenNameIdentifier	 new Buffer
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sizeInBytes	TokenNameIdentifier	 size In Bytes
+=	TokenNamePLUS_EQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
sizeInBytes	TokenNameIdentifier	 size In Bytes
.	TokenNameDOT	
getAndAdd	TokenNameIdentifier	 get And Add
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
int	TokenNameint	
numBuffers	TokenNameIdentifier	 num Buffers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: allocate a new buffer. * Subclasses can allocate differently. * @param size size of allocated buffer. * @return allocated buffer. */	TokenNameCOMMENT_JAVADOC	 Expert: allocate a new buffer. Subclasses can allocate differently. @param size size of allocated buffer. @return allocated buffer. 
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBuffer	TokenNameIdentifier	 new Buffer
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
long	TokenNamelong	
getSizeInBytes	TokenNameIdentifier	 get Size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sizeInBytes	TokenNameIdentifier	 size In Bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
