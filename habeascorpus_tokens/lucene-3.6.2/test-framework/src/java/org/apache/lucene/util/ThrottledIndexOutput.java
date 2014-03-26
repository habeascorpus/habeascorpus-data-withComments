package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
IndexOutput	TokenNameIdentifier	 Index Output
;	TokenNameSEMICOLON	
/** * Intentionally slow IndexOutput for testing. */	TokenNameCOMMENT_JAVADOC	 Intentionally slow IndexOutput for testing. 
public	TokenNamepublic	
class	TokenNameclass	
ThrottledIndexOutput	TokenNameIdentifier	 Throttled Index Output
extends	TokenNameextends	
IndexOutput	TokenNameIdentifier	 Index Output
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MIN_WRITTEN_BYTES	TokenNameIdentifier	 DEFAULT  MIN  WRITTEN  BYTES
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
bytesPerSecond	TokenNameIdentifier	 bytes Per Second
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexOutput	TokenNameIdentifier	 Index Output
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
flushDelayMillis	TokenNameIdentifier	 flush Delay Millis
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
closeDelayMillis	TokenNameIdentifier	 close Delay Millis
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
seekDelayMillis	TokenNameIdentifier	 seek Delay Millis
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
pendingBytes	TokenNameIdentifier	 pending Bytes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
minBytesWritten	TokenNameIdentifier	 min Bytes Written
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
timeElapsed	TokenNameIdentifier	 time Elapsed
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ThrottledIndexOutput	TokenNameIdentifier	 Throttled Index Output
newFromDelegate	TokenNameIdentifier	 new From Delegate
(	TokenNameLPAREN	
IndexOutput	TokenNameIdentifier	 Index Output
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ThrottledIndexOutput	TokenNameIdentifier	 Throttled Index Output
(	TokenNameLPAREN	
bytesPerSecond	TokenNameIdentifier	 bytes Per Second
,	TokenNameCOMMA	
flushDelayMillis	TokenNameIdentifier	 flush Delay Millis
,	TokenNameCOMMA	
closeDelayMillis	TokenNameIdentifier	 close Delay Millis
,	TokenNameCOMMA	
seekDelayMillis	TokenNameIdentifier	 seek Delay Millis
,	TokenNameCOMMA	
minBytesWritten	TokenNameIdentifier	 min Bytes Written
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ThrottledIndexOutput	TokenNameIdentifier	 Throttled Index Output
(	TokenNameLPAREN	
int	TokenNameint	
bytesPerSecond	TokenNameIdentifier	 bytes Per Second
,	TokenNameCOMMA	
long	TokenNamelong	
delayInMillis	TokenNameIdentifier	 delay In Millis
,	TokenNameCOMMA	
IndexOutput	TokenNameIdentifier	 Index Output
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
bytesPerSecond	TokenNameIdentifier	 bytes Per Second
,	TokenNameCOMMA	
delayInMillis	TokenNameIdentifier	 delay In Millis
,	TokenNameCOMMA	
delayInMillis	TokenNameIdentifier	 delay In Millis
,	TokenNameCOMMA	
delayInMillis	TokenNameIdentifier	 delay In Millis
,	TokenNameCOMMA	
DEFAULT_MIN_WRITTEN_BYTES	TokenNameIdentifier	 DEFAULT  MIN  WRITTEN  BYTES
,	TokenNameCOMMA	
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ThrottledIndexOutput	TokenNameIdentifier	 Throttled Index Output
(	TokenNameLPAREN	
int	TokenNameint	
bytesPerSecond	TokenNameIdentifier	 bytes Per Second
,	TokenNameCOMMA	
long	TokenNamelong	
delays	TokenNameIdentifier	 delays
,	TokenNameCOMMA	
int	TokenNameint	
minBytesWritten	TokenNameIdentifier	 min Bytes Written
,	TokenNameCOMMA	
IndexOutput	TokenNameIdentifier	 Index Output
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
bytesPerSecond	TokenNameIdentifier	 bytes Per Second
,	TokenNameCOMMA	
delays	TokenNameIdentifier	 delays
,	TokenNameCOMMA	
delays	TokenNameIdentifier	 delays
,	TokenNameCOMMA	
delays	TokenNameIdentifier	 delays
,	TokenNameCOMMA	
minBytesWritten	TokenNameIdentifier	 min Bytes Written
,	TokenNameCOMMA	
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
mBitsToBytes	TokenNameIdentifier	 m Bits To Bytes
(	TokenNameLPAREN	
int	TokenNameint	
mbits	TokenNameIdentifier	 mbits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mbits	TokenNameIdentifier	 mbits
*	TokenNameMULTIPLY	
125000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ThrottledIndexOutput	TokenNameIdentifier	 Throttled Index Output
(	TokenNameLPAREN	
int	TokenNameint	
bytesPerSecond	TokenNameIdentifier	 bytes Per Second
,	TokenNameCOMMA	
long	TokenNamelong	
flushDelayMillis	TokenNameIdentifier	 flush Delay Millis
,	TokenNameCOMMA	
long	TokenNamelong	
closeDelayMillis	TokenNameIdentifier	 close Delay Millis
,	TokenNameCOMMA	
long	TokenNamelong	
seekDelayMillis	TokenNameIdentifier	 seek Delay Millis
,	TokenNameCOMMA	
long	TokenNamelong	
minBytesWritten	TokenNameIdentifier	 min Bytes Written
,	TokenNameCOMMA	
IndexOutput	TokenNameIdentifier	 Index Output
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
bytesPerSecond	TokenNameIdentifier	 bytes Per Second
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
=	TokenNameEQUAL	
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bytesPerSecond	TokenNameIdentifier	 bytes Per Second
=	TokenNameEQUAL	
bytesPerSecond	TokenNameIdentifier	 bytes Per Second
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
flushDelayMillis	TokenNameIdentifier	 flush Delay Millis
=	TokenNameEQUAL	
flushDelayMillis	TokenNameIdentifier	 flush Delay Millis
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
closeDelayMillis	TokenNameIdentifier	 close Delay Millis
=	TokenNameEQUAL	
closeDelayMillis	TokenNameIdentifier	 close Delay Millis
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
seekDelayMillis	TokenNameIdentifier	 seek Delay Millis
=	TokenNameEQUAL	
seekDelayMillis	TokenNameIdentifier	 seek Delay Millis
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minBytesWritten	TokenNameIdentifier	 min Bytes Written
=	TokenNameEQUAL	
minBytesWritten	TokenNameIdentifier	 min Bytes Written
;	TokenNameSEMICOLON	
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
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
flushDelayMillis	TokenNameIdentifier	 flush Delay Millis
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
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
closeDelayMillis	TokenNameIdentifier	 close Delay Millis
+	TokenNamePLUS	
getDelay	TokenNameIdentifier	 get Delay
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
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
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
seekDelayMillis	TokenNameIdentifier	 seek Delay Millis
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
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
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
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
before	TokenNameIdentifier	 before
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
nanoTime	TokenNameIdentifier	 nano Time
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
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeElapsed	TokenNameIdentifier	 time Elapsed
+=	TokenNamePLUS_EQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
nanoTime	TokenNameIdentifier	 nano Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
before	TokenNameIdentifier	 before
;	TokenNameSEMICOLON	
pendingBytes	TokenNameIdentifier	 pending Bytes
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
getDelay	TokenNameIdentifier	 get Delay
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
long	TokenNamelong	
getDelay	TokenNameIdentifier	 get Delay
(	TokenNameLPAREN	
boolean	TokenNameboolean	
closing	TokenNameIdentifier	 closing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pendingBytes	TokenNameIdentifier	 pending Bytes
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
closing	TokenNameIdentifier	 closing
||	TokenNameOR_OR	
pendingBytes	TokenNameIdentifier	 pending Bytes
>	TokenNameGREATER	
minBytesWritten	TokenNameIdentifier	 min Bytes Written
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
actualBps	TokenNameIdentifier	 actual Bps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
timeElapsed	TokenNameIdentifier	 time Elapsed
/	TokenNameDIVIDE	
pendingBytes	TokenNameIdentifier	 pending Bytes
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000000000l	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// nano to sec 	TokenNameCOMMENT_LINE	nano to sec 
if	TokenNameif	
(	TokenNameLPAREN	
actualBps	TokenNameIdentifier	 actual Bps
>	TokenNameGREATER	
bytesPerSecond	TokenNameIdentifier	 bytes Per Second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pendingBytes	TokenNameIdentifier	 pending Bytes
*	TokenNameMULTIPLY	
1000l	TokenNameLongLiteral	
/	TokenNameDIVIDE	
bytesPerSecond	TokenNameIdentifier	 bytes Per Second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
delay	TokenNameIdentifier	 delay
=	TokenNameEQUAL	
expected	TokenNameIdentifier	 expected
-	TokenNameMINUS	
(	TokenNameLPAREN	
timeElapsed	TokenNameIdentifier	 time Elapsed
/	TokenNameDIVIDE	
1000000l	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pendingBytes	TokenNameIdentifier	 pending Bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
timeElapsed	TokenNameIdentifier	 time Elapsed
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delay	TokenNameIdentifier	 delay
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
void	TokenNamevoid	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
long	TokenNamelong	
ms	TokenNameIdentifier	 ms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ms	TokenNameIdentifier	 ms
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
ms	TokenNameIdentifier	 ms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ThreadInterruptedException	TokenNameIdentifier	 Thread Interrupted Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
