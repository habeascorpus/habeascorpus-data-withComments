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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
TimeUnit	TokenNameIdentifier	 Time Unit
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
locks	TokenNameIdentifier	 locks
.	TokenNameDOT	
Condition	TokenNameIdentifier	 Condition
;	TokenNameSEMICOLON	
// fulfils the Condition interface without spurious wakeup problems 	TokenNameCOMMENT_LINE	fulfils the Condition interface without spurious wakeup problems 
// (or lost notify problems either: that is, even if you call await() 	TokenNameCOMMENT_LINE	(or lost notify problems either: that is, even if you call await() 
// _after_ signal(), it will work as desired.) 	TokenNameCOMMENT_LINE	_after_ signal(), it will work as desired.) 
public	TokenNamepublic	
class	TokenNameclass	
SimpleCondition	TokenNameIdentifier	 Simple Condition
implements	TokenNameimplements	
Condition	TokenNameIdentifier	 Condition
{	TokenNameLBRACE	
boolean	TokenNameboolean	
set	TokenNameIdentifier	 set
;	TokenNameSEMICOLON	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
await	TokenNameIdentifier	 await
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
await	TokenNameIdentifier	 await
(	TokenNameLPAREN	
long	TokenNamelong	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
// micro/nanoseconds not supported 	TokenNameCOMMENT_LINE	micro/nanoseconds not supported 
assert	TokenNameassert	
unit	TokenNameIdentifier	 unit
==	TokenNameEQUAL_EQUAL	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
DAYS	TokenNameIdentifier	 DAYS
||	TokenNameOR_OR	
unit	TokenNameIdentifier	 unit
==	TokenNameEQUAL_EQUAL	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
HOURS	TokenNameIdentifier	 HOURS
||	TokenNameOR_OR	
unit	TokenNameIdentifier	 unit
==	TokenNameEQUAL_EQUAL	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MINUTES	TokenNameIdentifier	 MINUTES
||	TokenNameOR_OR	
unit	TokenNameIdentifier	 unit
==	TokenNameEQUAL_EQUAL	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
||	TokenNameOR_OR	
unit	TokenNameIdentifier	 unit
==	TokenNameEQUAL_EQUAL	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MILLISECONDS	TokenNameIdentifier	 MILLISECONDS
;	TokenNameSEMICOLON	
long	TokenNamelong	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
unit	TokenNameIdentifier	 unit
.	TokenNameDOT	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MILLISECONDS	TokenNameIdentifier	 MILLISECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
set	TokenNameIdentifier	 set
&&	TokenNameAND_AND	
end	TokenNameIdentifier	 end
>	TokenNameGREATER	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MILLISECONDS	TokenNameIdentifier	 MILLISECONDS
.	TokenNameDOT	
timedWait	TokenNameIdentifier	 timed Wait
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
set	TokenNameIdentifier	 set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
signal	TokenNameIdentifier	 signal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
signalAll	TokenNameIdentifier	 signal All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
isSignaled	TokenNameIdentifier	 is Signaled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
set	TokenNameIdentifier	 set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
awaitUninterruptibly	TokenNameIdentifier	 await Uninterruptibly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
awaitNanos	TokenNameIdentifier	 await Nanos
(	TokenNameLPAREN	
long	TokenNamelong	
nanosTimeout	TokenNameIdentifier	 nanos Timeout
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
awaitUntil	TokenNameIdentifier	 await Until
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
deadline	TokenNameIdentifier	 deadline
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
