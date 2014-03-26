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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
/** * Used by MockRAMDirectory to create an output stream that * will throw an IOException on fake disk full, track max * disk space actually used, and maybe throw random * IOExceptions. */	TokenNameCOMMENT_JAVADOC	 Used by MockRAMDirectory to create an output stream that will throw an IOException on fake disk full, track max disk space actually used, and maybe throw random IOExceptions. 
public	TokenNamepublic	
class	TokenNameclass	
MockIndexOutputWrapper	TokenNameIdentifier	 Mock Index Output Wrapper
extends	TokenNameextends	
IndexOutput	TokenNameIdentifier	 Index Output
{	TokenNameLBRACE	
private	TokenNameprivate	
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
IndexOutput	TokenNameIdentifier	 Index Output
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
singleByte	TokenNameIdentifier	 single Byte
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Construct an empty output buffer. */	TokenNameCOMMENT_JAVADOC	 Construct an empty output buffer. 
public	TokenNamepublic	
MockIndexOutputWrapper	TokenNameIdentifier	 Mock Index Output Wrapper
(	TokenNameLPAREN	
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
IndexOutput	TokenNameIdentifier	 Index Output
delegate	TokenNameIdentifier	 delegate
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
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
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
maybeThrowDeterministicException	TokenNameIdentifier	 maybe Throw Deterministic Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
trackDiskUsage	TokenNameIdentifier	 track Disk Usage
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Now compute actual disk usage & track the maxUsedSize 	TokenNameCOMMENT_LINE	Now compute actual disk usage & track the maxUsedSize 
// in the MockDirectoryWrapper: 	TokenNameCOMMENT_LINE	in the MockDirectoryWrapper: 
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
getRecomputedActualSizeInBytes	TokenNameIdentifier	 get Recomputed Actual Size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
maxUsedSize	TokenNameIdentifier	 max Used Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
maxUsedSize	TokenNameIdentifier	 max Used Size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
removeIndexOutput	TokenNameIdentifier	 remove Index Output
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
maybeThrowDeterministicException	TokenNameIdentifier	 maybe Throw Deterministic Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
singleByte	TokenNameIdentifier	 single Byte
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
singleByte	TokenNameIdentifier	 single Byte
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
writeBytes	TokenNameIdentifier	 write Bytes
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
long	TokenNamelong	
freeSpace	TokenNameIdentifier	 free Space
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
maxSize	TokenNameIdentifier	 max Size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
maxSize	TokenNameIdentifier	 max Size
-	TokenNameMINUS	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
realUsage	TokenNameIdentifier	 real Usage
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// If MockRAMDir crashed since we were opened, then 	TokenNameCOMMENT_LINE	If MockRAMDir crashed since we were opened, then 
// don't write anything: 	TokenNameCOMMENT_LINE	don't write anything: 
if	TokenNameif	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
crashed	TokenNameIdentifier	 crashed
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"MockRAMDirectory was crashed; cannot write to "	TokenNameStringLiteral	MockRAMDirectory was crashed; cannot write to 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Enforce disk full: 	TokenNameCOMMENT_LINE	Enforce disk full: 
if	TokenNameif	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
maxSize	TokenNameIdentifier	 max Size
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
freeSpace	TokenNameIdentifier	 free Space
<=	TokenNameLESS_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Compute the real disk free. This will greatly slow 	TokenNameCOMMENT_LINE	Compute the real disk free. This will greatly slow 
// down our test but makes it more accurate: 	TokenNameCOMMENT_LINE	down our test but makes it more accurate: 
realUsage	TokenNameIdentifier	 real Usage
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
getRecomputedActualSizeInBytes	TokenNameIdentifier	 get Recomputed Actual Size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
freeSpace	TokenNameIdentifier	 free Space
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
maxSize	TokenNameIdentifier	 max Size
-	TokenNameMINUS	
realUsage	TokenNameIdentifier	 real Usage
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
maxSize	TokenNameIdentifier	 max Size
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
freeSpace	TokenNameIdentifier	 free Space
<=	TokenNameLESS_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
freeSpace	TokenNameIdentifier	 free Space
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
realUsage	TokenNameIdentifier	 real Usage
+=	TokenNamePLUS_EQUAL	
freeSpace	TokenNameIdentifier	 free Space
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
freeSpace	TokenNameIdentifier	 free Space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
realUsage	TokenNameIdentifier	 real Usage
>	TokenNameGREATER	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
maxUsedSize	TokenNameIdentifier	 max Used Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
maxUsedSize	TokenNameIdentifier	 max Used Size
=	TokenNameEQUAL	
realUsage	TokenNameIdentifier	 real Usage
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"fake disk full at "	TokenNameStringLiteral	fake disk full at 
+	TokenNamePLUS	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
getRecomputedActualSizeInBytes	TokenNameIdentifier	 get Recomputed Actual Size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" bytes when writing "	TokenNameStringLiteral	 bytes when writing 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" (file length="	TokenNameStringLiteral	 (file length=
+	TokenNamePLUS	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
freeSpace	TokenNameIdentifier	 free Space
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
+=	TokenNamePLUS_EQUAL	
"; wrote "	TokenNameStringLiteral	; wrote 
+	TokenNamePLUS	
freeSpace	TokenNameIdentifier	 free Space
+	TokenNamePLUS	
" of "	TokenNameStringLiteral	 of 
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
" bytes"	TokenNameStringLiteral	 bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
message	TokenNameIdentifier	 message
+=	TokenNamePLUS_EQUAL	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
.	TokenNameDOT	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": MDW: now throw fake disk full"	TokenNameStringLiteral	: MDW: now throw fake disk full
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
Throwable	TokenNameIdentifier	 Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
randomState	TokenNameIdentifier	 random State
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
half	TokenNameIdentifier	 half
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
half	TokenNameIdentifier	 half
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
yield	TokenNameIdentifier	 yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
half	TokenNameIdentifier	 half
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
half	TokenNameIdentifier	 half
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
maybeThrowDeterministicException	TokenNameIdentifier	 maybe Throw Deterministic Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Maybe throw random exception; only do this on first 	TokenNameCOMMENT_LINE	Maybe throw random exception; only do this on first 
// write to a new file: 	TokenNameCOMMENT_LINE	write to a new file: 
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
maybeThrowIOException	TokenNameIdentifier	 maybe Throw IO Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
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
void	TokenNamevoid	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
long	TokenNamelong	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
long	TokenNamelong	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: we may need to check disk full here as well 	TokenNameCOMMENT_LINE	TODO: we may need to check disk full here as well 
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
maybeThrowDeterministicException	TokenNameIdentifier	 maybe Throw Deterministic Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
