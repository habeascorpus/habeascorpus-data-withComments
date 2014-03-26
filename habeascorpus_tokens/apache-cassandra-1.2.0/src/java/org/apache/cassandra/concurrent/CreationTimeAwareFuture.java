/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ExecutionException	TokenNameIdentifier	 Execution Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
Future	TokenNameIdentifier	 Future
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
FutureTask	TokenNameIdentifier	 Future Task
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
TimeoutException	TokenNameIdentifier	 Timeout Exception
;	TokenNameSEMICOLON	
/** * Decorates {@link FutureTask} * </p> * This Future implementation makes the future.get(long timeout, TimeUnit unit) * wait the amount of time specified in the .get(...) call based on the object creation * by keeping an internal timestamp of when this object was constructed * * @param <V> */	TokenNameCOMMENT_JAVADOC	 Decorates {@link FutureTask} </p> This Future implementation makes the future.get(long timeout, TimeUnit unit) wait the amount of time specified in the .get(...) call based on the object creation by keeping an internal timestamp of when this object was constructed * @param <V> 
public	TokenNamepublic	
class	TokenNameclass	
CreationTimeAwareFuture	TokenNameIdentifier	 Creation Time Aware Future
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
implements	TokenNameimplements	
Future	TokenNameIdentifier	 Future
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
creationTime	TokenNameIdentifier	 creation Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Future	TokenNameIdentifier	 Future
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
future	TokenNameIdentifier	 future
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CreationTimeAwareFuture	TokenNameIdentifier	 Creation Time Aware Future
(	TokenNameLPAREN	
Future	TokenNameIdentifier	 Future
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
future	TokenNameIdentifier	 future
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
future	TokenNameIdentifier	 future
=	TokenNameEQUAL	
future	TokenNameIdentifier	 future
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
V	TokenNameIdentifier	 V
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
long	TokenNamelong	
timeout	TokenNameIdentifier	 timeout
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
,	TokenNameCOMMA	
ExecutionException	TokenNameIdentifier	 Execution Exception
,	TokenNameCOMMA	
TimeoutException	TokenNameIdentifier	 Timeout Exception
{	TokenNameLBRACE	
timeout	TokenNameIdentifier	 timeout
=	TokenNameEQUAL	
unit	TokenNameIdentifier	 unit
.	TokenNameDOT	
toMillis	TokenNameIdentifier	 to Millis
(	TokenNameLPAREN	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
overallTimeout	TokenNameIdentifier	 overall Timeout
=	TokenNameEQUAL	
timeout	TokenNameIdentifier	 timeout
-	TokenNameMINUS	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
creationTime	TokenNameIdentifier	 creation Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
future	TokenNameIdentifier	 future
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
overallTimeout	TokenNameIdentifier	 overall Timeout
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MILLISECONDS	TokenNameIdentifier	 MILLISECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
cancel	TokenNameIdentifier	 cancel
(	TokenNameLPAREN	
boolean	TokenNameboolean	
mayInterruptIfRunning	TokenNameIdentifier	 may Interrupt If Running
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
future	TokenNameIdentifier	 future
.	TokenNameDOT	
cancel	TokenNameIdentifier	 cancel
(	TokenNameLPAREN	
mayInterruptIfRunning	TokenNameIdentifier	 may Interrupt If Running
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCancelled	TokenNameIdentifier	 is Cancelled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
future	TokenNameIdentifier	 future
.	TokenNameDOT	
isCancelled	TokenNameIdentifier	 is Cancelled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
future	TokenNameIdentifier	 future
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
V	TokenNameIdentifier	 V
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
,	TokenNameCOMMA	
ExecutionException	TokenNameIdentifier	 Execution Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
future	TokenNameIdentifier	 future
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
