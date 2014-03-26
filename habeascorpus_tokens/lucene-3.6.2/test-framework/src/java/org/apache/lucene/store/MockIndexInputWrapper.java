package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Used by MockDirectoryWrapper to create an input stream that * keeps track of when it's been closed. */	TokenNameCOMMENT_JAVADOC	 Used by MockDirectoryWrapper to create an input stream that keeps track of when it's been closed. 
public	TokenNamepublic	
class	TokenNameclass	
MockIndexInputWrapper	TokenNameIdentifier	 Mock Index Input Wrapper
extends	TokenNameextends	
IndexInput	TokenNameIdentifier	 Index Input
{	TokenNameLBRACE	
private	TokenNameprivate	
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexInput	TokenNameIdentifier	 Index Input
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
isClone	TokenNameIdentifier	 is Clone
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
closed	TokenNameIdentifier	 closed
;	TokenNameSEMICOLON	
/** Construct an empty output buffer. */	TokenNameCOMMENT_JAVADOC	 Construct an empty output buffer. 
public	TokenNamepublic	
MockIndexInputWrapper	TokenNameIdentifier	 Mock Index Input Wrapper
(	TokenNameLPAREN	
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexInput	TokenNameIdentifier	 Index Input
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"MockIndexInputWrapper(name="	TokenNameStringLiteral	MockIndexInputWrapper(name=
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" delegate="	TokenNameStringLiteral	 delegate=
+	TokenNamePLUS	
delegate	TokenNameIdentifier	 delegate
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
=	TokenNameEQUAL	
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// turn on the following to look for leaks closing inputs, 	TokenNameCOMMENT_LINE	turn on the following to look for leaks closing inputs, 
// after fixing TestTransactions 	TokenNameCOMMENT_LINE	after fixing TestTransactions 
// dir.maybeThrowDeterministicException(); 	TokenNameCOMMENT_LINE	dir.maybeThrowDeterministicException(); 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Pending resolution on LUCENE-686 we may want to 	TokenNameCOMMENT_LINE	Pending resolution on LUCENE-686 we may want to 
// remove the conditional check so we also track that 	TokenNameCOMMENT_LINE	remove the conditional check so we also track that 
// all clones get closed: 	TokenNameCOMMENT_LINE	all clones get closed: 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isClone	TokenNameIdentifier	 is Clone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
removeIndexInput	TokenNameIdentifier	 remove Index Input
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
closed	TokenNameIdentifier	 closed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Abusing closed IndexInput!"	TokenNameStringLiteral	Abusing closed IndexInput!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
inputCloneCount	TokenNameIdentifier	 input Clone Count
.	TokenNameDOT	
incrementAndGet	TokenNameIdentifier	 increment And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
iiclone	TokenNameIdentifier	 iiclone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
)	TokenNameRPAREN	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MockIndexInputWrapper	TokenNameIdentifier	 Mock Index Input Wrapper
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
new	TokenNamenew	
MockIndexInputWrapper	TokenNameIdentifier	 Mock Index Input Wrapper
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
iiclone	TokenNameIdentifier	 iiclone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
isClone	TokenNameIdentifier	 is Clone
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Pending resolution on LUCENE-686 we may want to 	TokenNameCOMMENT_LINE	Pending resolution on LUCENE-686 we may want to 
// uncomment this code so that we also track that all 	TokenNameCOMMENT_LINE	uncomment this code so that we also track that all 
// clones get closed: 	TokenNameCOMMENT_LINE	clones get closed: 
/* synchronized(dir.openFiles) { if (dir.openFiles.containsKey(name)) { Integer v = (Integer) dir.openFiles.get(name); v = Integer.valueOf(v.intValue()+1); dir.openFiles.put(name, v); } else { throw new RuntimeException("BUG: cloned file was not open?"); } } */	TokenNameCOMMENT_BLOCK	 synchronized(dir.openFiles) { if (dir.openFiles.containsKey(name)) { Integer v = (Integer) dir.openFiles.get(name); v = Integer.valueOf(v.intValue()+1); dir.openFiles.put(name, v); } else { throw new RuntimeException("BUG: cloned file was not open?"); } } 
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
byte	TokenNamebyte	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
readBytes	TokenNameIdentifier	 read Bytes
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
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
IndexOutput	TokenNameIdentifier	 Index Output
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
long	TokenNamelong	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
readBytes	TokenNameIdentifier	 read Bytes
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
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useBuffer	TokenNameIdentifier	 use Buffer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
useBuffer	TokenNameIdentifier	 use Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
readStringStringMap	TokenNameIdentifier	 read String String Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
readStringStringMap	TokenNameIdentifier	 read String String Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setModifiedUTF8StringsMode	TokenNameIdentifier	 set Modified UT F8 Strings Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
setModifiedUTF8StringsMode	TokenNameIdentifier	 set Modified UT F8 Strings Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
readChars	TokenNameIdentifier	 read Chars
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
readChars	TokenNameIdentifier	 read Chars
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
skipChars	TokenNameIdentifier	 skip Chars
(	TokenNameLPAREN	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
skipChars	TokenNameIdentifier	 skip Chars
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
