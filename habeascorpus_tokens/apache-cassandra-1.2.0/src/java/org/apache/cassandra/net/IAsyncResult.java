/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
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
public	TokenNamepublic	
interface	TokenNameinterface	
IAsyncResult	TokenNameIdentifier	 I Async Result
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
extends	TokenNameextends	
IMessageCallback	TokenNameIdentifier	 I Message Callback
{	TokenNameLBRACE	
/** * Same operation as the above get() but allows the calling * thread to specify a timeout. * @param timeout the maximum time to wait * @param tu the time unit of the timeout argument * @return the result wrapped in an Object[] */	TokenNameCOMMENT_JAVADOC	 Same operation as the above get() but allows the calling thread to specify a timeout. @param timeout the maximum time to wait @param tu the time unit of the timeout argument @return the result wrapped in an Object[] 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
long	TokenNamelong	
timeout	TokenNameIdentifier	 timeout
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
tu	TokenNameIdentifier	 tu
)	TokenNameRPAREN	
throws	TokenNamethrows	
TimeoutException	TokenNameIdentifier	 Timeout Exception
;	TokenNameSEMICOLON	
/** * Store the result obtained for the submitted task. * @param result the response message */	TokenNameCOMMENT_JAVADOC	 Store the result obtained for the submitted task. @param result the response message 
public	TokenNamepublic	
void	TokenNamevoid	
result	TokenNameIdentifier	 result
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
InetAddress	TokenNameIdentifier	 Inet Address
getFrom	TokenNameIdentifier	 get From
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
