/* * Licensed to the Apache Software Foundation (ASF) under one or more contributor license * agreements. See the NOTICE file distributed with this work for additional information regarding * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance with the License. You may obtain a * copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software distributed under the License * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express * or implied. See the License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
stub	TokenNameIdentifier	 stub
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
ProjectSegment	TokenNameIdentifier	 Project Segment
;	TokenNameSEMICOLON	
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
Callable	TokenNameIdentifier	 Callable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
CompletionService	TokenNameIdentifier	 Completion Service
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
/** * @author Kristian Rosenvold */	TokenNameCOMMENT_JAVADOC	 @author Kristian Rosenvold 
public	TokenNamepublic	
class	TokenNameclass	
CompletionServiceStub	TokenNameIdentifier	 Completion Service Stub
implements	TokenNameimplements	
CompletionService	TokenNameIdentifier	 Completion Service
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FutureTask	TokenNameIdentifier	 Future Task
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>>	TokenNameRIGHT_SHIFT	
projectBuildFutureTasks	TokenNameIdentifier	 project Build Future Tasks
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedList	TokenNameIdentifier	 synchronized List
(	TokenNameLPAREN	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FutureTask	TokenNameIdentifier	 Future Task
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
finishImmediately	TokenNameIdentifier	 finish Immediately
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
projectBuildFutureTasks	TokenNameIdentifier	 project Build Future Tasks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CompletionServiceStub	TokenNameIdentifier	 Completion Service Stub
(	TokenNameLPAREN	
boolean	TokenNameboolean	
finishImmediately	TokenNameIdentifier	 finish Immediately
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
finishImmediately	TokenNameIdentifier	 finish Immediately
=	TokenNameEQUAL	
finishImmediately	TokenNameIdentifier	 finish Immediately
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Future	TokenNameIdentifier	 Future
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
submit	TokenNameIdentifier	 submit
(	TokenNameLPAREN	
Callable	TokenNameIdentifier	 Callable
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FutureTask	TokenNameIdentifier	 Future Task
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
projectBuildFutureTask	TokenNameIdentifier	 project Build Future Task
=	TokenNameEQUAL	
new	TokenNamenew	
FutureTask	TokenNameIdentifier	 Future Task
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projectBuildFutureTasks	TokenNameIdentifier	 project Build Future Tasks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
projectBuildFutureTask	TokenNameIdentifier	 project Build Future Task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
finishImmediately	TokenNameIdentifier	 finish Immediately
)	TokenNameRPAREN	
{	TokenNameLBRACE	
projectBuildFutureTask	TokenNameIdentifier	 project Build Future Task
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
projectBuildFutureTask	TokenNameIdentifier	 project Build Future Task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Future	TokenNameIdentifier	 Future
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
submit	TokenNameIdentifier	 submit
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
ProjectSegment	TokenNameIdentifier	 Project Segment
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FutureTask	TokenNameIdentifier	 Future Task
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
projectBuildFutureTask	TokenNameIdentifier	 project Build Future Task
=	TokenNameEQUAL	
new	TokenNamenew	
FutureTask	TokenNameIdentifier	 Future Task
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projectBuildFutureTasks	TokenNameIdentifier	 project Build Future Tasks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
projectBuildFutureTask	TokenNameIdentifier	 project Build Future Task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
finishImmediately	TokenNameIdentifier	 finish Immediately
)	TokenNameRPAREN	
{	TokenNameLBRACE	
projectBuildFutureTask	TokenNameIdentifier	 project Build Future Task
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
projectBuildFutureTask	TokenNameIdentifier	 project Build Future Task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Future	TokenNameIdentifier	 Future
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
take	TokenNameIdentifier	 take
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Future	TokenNameIdentifier	 Future
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
poll	TokenNameIdentifier	 poll
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Future	TokenNameIdentifier	 Future
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
poll	TokenNameIdentifier	 poll
(	TokenNameLPAREN	
long	TokenNamelong	
timeout	TokenNameIdentifier	 timeout
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
