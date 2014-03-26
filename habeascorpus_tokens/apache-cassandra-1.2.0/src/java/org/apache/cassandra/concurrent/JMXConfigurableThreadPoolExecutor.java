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
BlockingQueue	TokenNameIdentifier	 Blocking Queue
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
public	TokenNamepublic	
class	TokenNameclass	
JMXConfigurableThreadPoolExecutor	TokenNameIdentifier	 JMX Configurable Thread Pool Executor
extends	TokenNameextends	
JMXEnabledThreadPoolExecutor	TokenNameIdentifier	 JMX Enabled Thread Pool Executor
implements	TokenNameimplements	
JMXConfigurableThreadPoolExecutorMBean	TokenNameIdentifier	 JMX Configurable Thread Pool Executor M Bean
{	TokenNameLBRACE	
public	TokenNamepublic	
JMXConfigurableThreadPoolExecutor	TokenNameIdentifier	 JMX Configurable Thread Pool Executor
(	TokenNameLPAREN	
int	TokenNameint	
corePoolSize	TokenNameIdentifier	 core Pool Size
,	TokenNameCOMMA	
long	TokenNamelong	
keepAliveTime	TokenNameIdentifier	 keep Alive Time
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
BlockingQueue	TokenNameIdentifier	 Blocking Queue
<	TokenNameLESS	
Runnable	TokenNameIdentifier	 Runnable
>	TokenNameGREATER	
workQueue	TokenNameIdentifier	 work Queue
,	TokenNameCOMMA	
NamedThreadFactory	TokenNameIdentifier	 Named Thread Factory
threadFactory	TokenNameIdentifier	 thread Factory
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
jmxPath	TokenNameIdentifier	 jmx Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
corePoolSize	TokenNameIdentifier	 core Pool Size
,	TokenNameCOMMA	
keepAliveTime	TokenNameIdentifier	 keep Alive Time
,	TokenNameCOMMA	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
workQueue	TokenNameIdentifier	 work Queue
,	TokenNameCOMMA	
threadFactory	TokenNameIdentifier	 thread Factory
,	TokenNameCOMMA	
jmxPath	TokenNameIdentifier	 jmx Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
