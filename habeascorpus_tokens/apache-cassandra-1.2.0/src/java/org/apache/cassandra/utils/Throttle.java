/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
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
/** * Encapsulates the timing/state required to throttle a caller to a target throughput in * bytes per millisecond, when periodically passed an absolute count of bytes. */	TokenNameCOMMENT_JAVADOC	 Encapsulates the timing/state required to throttle a caller to a target throughput in bytes per millisecond, when periodically passed an absolute count of bytes. 
public	TokenNamepublic	
class	TokenNameclass	
Throttle	TokenNameIdentifier	 Throttle
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
Throttle	TokenNameIdentifier	 Throttle
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ThroughputFunction	TokenNameIdentifier	 Throughput Function
fun	TokenNameIdentifier	 fun
;	TokenNameSEMICOLON	
// the bytes that had been handled the last time we delayed to throttle, 	TokenNameCOMMENT_LINE	the bytes that had been handled the last time we delayed to throttle, 
// and the time in milliseconds when we last throttled 	TokenNameCOMMENT_LINE	and the time in milliseconds when we last throttled 
private	TokenNameprivate	
long	TokenNamelong	
bytesAtLastDelay	TokenNameIdentifier	 bytes At Last Delay
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
timeAtLastDelay	TokenNameIdentifier	 time At Last Delay
;	TokenNameSEMICOLON	
// current target bytes of throughput per millisecond 	TokenNameCOMMENT_LINE	current target bytes of throughput per millisecond 
private	TokenNameprivate	
int	TokenNameint	
targetBytesPerMS	TokenNameIdentifier	 target Bytes Per MS
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Throttle	TokenNameIdentifier	 Throttle
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ThroughputFunction	TokenNameIdentifier	 Throughput Function
fun	TokenNameIdentifier	 fun
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fun	TokenNameIdentifier	 fun
=	TokenNameEQUAL	
fun	TokenNameIdentifier	 fun
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @param currentBytes Bytes of throughput since the beginning of the task. */	TokenNameCOMMENT_JAVADOC	 @param currentBytes Bytes of throughput since the beginning of the task. 
public	TokenNamepublic	
void	TokenNamevoid	
throttle	TokenNameIdentifier	 throttle
(	TokenNameLPAREN	
long	TokenNamelong	
currentBytes	TokenNameIdentifier	 current Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throttleDelta	TokenNameIdentifier	 throttle Delta
(	TokenNameLPAREN	
currentBytes	TokenNameIdentifier	 current Bytes
-	TokenNameMINUS	
bytesAtLastDelay	TokenNameIdentifier	 bytes At Last Delay
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @param bytesDelta Bytes of throughput since the last call to throttle*(). */	TokenNameCOMMENT_JAVADOC	 @param bytesDelta Bytes of throughput since the last call to throttle*(). 
public	TokenNamepublic	
void	TokenNamevoid	
throttleDelta	TokenNameIdentifier	 throttle Delta
(	TokenNameLPAREN	
long	TokenNamelong	
bytesDelta	TokenNameIdentifier	 bytes Delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newTargetBytesPerMS	TokenNameIdentifier	 new Target Bytes Per MS
=	TokenNameEQUAL	
fun	TokenNameIdentifier	 fun
.	TokenNameDOT	
targetThroughput	TokenNameIdentifier	 target Throughput
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newTargetBytesPerMS	TokenNameIdentifier	 new Target Bytes Per MS
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// throttling disabled 	TokenNameCOMMENT_LINE	throttling disabled 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// if the target changed, log 	TokenNameCOMMENT_LINE	if the target changed, log 
if	TokenNameif	
(	TokenNameLPAREN	
newTargetBytesPerMS	TokenNameIdentifier	 new Target Bytes Per MS
!=	TokenNameNOT_EQUAL	
targetBytesPerMS	TokenNameIdentifier	 target Bytes Per MS
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"{} target throughput now {} bytes/ms."	TokenNameStringLiteral	{} target throughput now {} bytes/ms.
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
newTargetBytesPerMS	TokenNameIdentifier	 new Target Bytes Per MS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targetBytesPerMS	TokenNameIdentifier	 target Bytes Per MS
=	TokenNameEQUAL	
newTargetBytesPerMS	TokenNameIdentifier	 new Target Bytes Per MS
;	TokenNameSEMICOLON	
// time passed since last delay 	TokenNameCOMMENT_LINE	time passed since last delay 
long	TokenNamelong	
msSinceLast	TokenNameIdentifier	 ms Since Last
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
timeAtLastDelay	TokenNameIdentifier	 time At Last Delay
;	TokenNameSEMICOLON	
// the excess bytes in this period 	TokenNameCOMMENT_LINE	the excess bytes in this period 
long	TokenNamelong	
excessBytes	TokenNameIdentifier	 excess Bytes
=	TokenNameEQUAL	
bytesDelta	TokenNameIdentifier	 bytes Delta
-	TokenNameMINUS	
msSinceLast	TokenNameIdentifier	 ms Since Last
*	TokenNameMULTIPLY	
targetBytesPerMS	TokenNameIdentifier	 target Bytes Per MS
;	TokenNameSEMICOLON	
// the time to delay to recap the deficit 	TokenNameCOMMENT_LINE	the time to delay to recap the deficit 
long	TokenNamelong	
timeToDelay	TokenNameIdentifier	 time To Delay
=	TokenNameEQUAL	
excessBytes	TokenNameIdentifier	 excess Bytes
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
targetBytesPerMS	TokenNameIdentifier	 target Bytes Per MS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
timeToDelay	TokenNameIdentifier	 time To Delay
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isTraceEnabled	TokenNameIdentifier	 is Trace Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s actual throughput was %d bytes in %d ms: throttling for %d ms"	TokenNameStringLiteral	%s actual throughput was %d bytes in %d ms: throttling for %d ms
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
bytesDelta	TokenNameIdentifier	 bytes Delta
,	TokenNameCOMMA	
msSinceLast	TokenNameIdentifier	 ms Since Last
,	TokenNameCOMMA	
timeToDelay	TokenNameIdentifier	 time To Delay
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
timeToDelay	TokenNameIdentifier	 time To Delay
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
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
bytesAtLastDelay	TokenNameIdentifier	 bytes At Last Delay
+=	TokenNamePLUS_EQUAL	
bytesDelta	TokenNameIdentifier	 bytes Delta
;	TokenNameSEMICOLON	
timeAtLastDelay	TokenNameIdentifier	 time At Last Delay
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Throttle(for="	TokenNameStringLiteral	Throttle(for=
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
interface	TokenNameinterface	
ThroughputFunction	TokenNameIdentifier	 Throughput Function
{	TokenNameLBRACE	
/** * @return The instantaneous target throughput in bytes per millisecond. Targets less * than or equal to zero will disable throttling. */	TokenNameCOMMENT_JAVADOC	 @return The instantaneous target throughput in bytes per millisecond. Targets less than or equal to zero will disable throttling. 
public	TokenNamepublic	
int	TokenNameint	
targetThroughput	TokenNameIdentifier	 target Throughput
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
