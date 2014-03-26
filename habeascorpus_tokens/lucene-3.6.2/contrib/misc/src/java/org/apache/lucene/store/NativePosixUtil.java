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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileDescriptor	TokenNameIdentifier	 File Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
NativePosixUtil	TokenNameIdentifier	 Native Posix Util
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NORMAL	TokenNameIdentifier	 NORMAL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
SEQUENTIAL	TokenNameIdentifier	 SEQUENTIAL
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
RANDOM	TokenNameIdentifier	 RANDOM
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
WILLNEED	TokenNameIdentifier	 WILLNEED
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
DONTNEED	TokenNameIdentifier	 DONTNEED
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NOREUSE	TokenNameIdentifier	 NOREUSE
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
loadLibrary	TokenNameIdentifier	 load Library
(	TokenNameLPAREN	
"NativePosixUtil"	TokenNameStringLiteral	NativePosixUtil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
native	TokenNamenative	
int	TokenNameint	
posix_fadvise	TokenNameIdentifier	 posix fadvise
(	TokenNameLPAREN	
FileDescriptor	TokenNameIdentifier	 File Descriptor
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
long	TokenNamelong	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
int	TokenNameint	
advise	TokenNameIdentifier	 advise
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
native	TokenNamenative	
int	TokenNameint	
posix_madvise	TokenNameIdentifier	 posix madvise
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
advise	TokenNameIdentifier	 advise
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
native	TokenNamenative	
int	TokenNameint	
madvise	TokenNameIdentifier	 madvise
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
advise	TokenNameIdentifier	 advise
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
native	TokenNamenative	
FileDescriptor	TokenNameIdentifier	 File Descriptor
open_direct	TokenNameIdentifier	 open direct
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
boolean	TokenNameboolean	
read	TokenNameIdentifier	 read
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
native	TokenNamenative	
long	TokenNamelong	
pread	TokenNameIdentifier	 pread
(	TokenNameLPAREN	
FileDescriptor	TokenNameIdentifier	 File Descriptor
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
byteBuf	TokenNameIdentifier	 byte Buf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
advise	TokenNameIdentifier	 advise
(	TokenNameLPAREN	
FileDescriptor	TokenNameIdentifier	 File Descriptor
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
long	TokenNamelong	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
int	TokenNameint	
advise	TokenNameIdentifier	 advise
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
posix_fadvise	TokenNameIdentifier	 posix fadvise
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
advise	TokenNameIdentifier	 advise
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"posix_fadvise failed code="	TokenNameStringLiteral	posix_fadvise failed code=
+	TokenNamePLUS	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
