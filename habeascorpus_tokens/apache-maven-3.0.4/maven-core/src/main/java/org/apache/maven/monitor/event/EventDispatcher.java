package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
monitor	TokenNameIdentifier	 monitor
.	TokenNameDOT	
event	TokenNameIdentifier	 event
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * @author jdcasey */	TokenNameCOMMENT_JAVADOC	 @author jdcasey 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
EventDispatcher	TokenNameIdentifier	 Event Dispatcher
{	TokenNameLBRACE	
void	TokenNamevoid	
addEventMonitor	TokenNameIdentifier	 add Event Monitor
(	TokenNameLPAREN	
EventMonitor	TokenNameIdentifier	 Event Monitor
monitor	TokenNameIdentifier	 monitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
dispatchStart	TokenNameIdentifier	 dispatch Start
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
event	TokenNameIdentifier	 event
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
dispatchEnd	TokenNameIdentifier	 dispatch End
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
event	TokenNameIdentifier	 event
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
dispatchError	TokenNameIdentifier	 dispatch Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
event	TokenNameIdentifier	 event
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
