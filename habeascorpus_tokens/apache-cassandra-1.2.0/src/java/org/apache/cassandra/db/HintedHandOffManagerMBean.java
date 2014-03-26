/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
HintedHandOffManagerMBean	TokenNameIdentifier	 Hinted Hand Off Manager M Bean
{	TokenNameLBRACE	
/** * Nuke all hints from this node to `ep`. * @param host String rep. of endpoint address to delete hints for, either ip address ("127.0.0.1") or hostname */	TokenNameCOMMENT_JAVADOC	 Nuke all hints from this node to `ep`. @param host String rep. of endpoint address to delete hints for, either ip address ("127.0.0.1") or hostname 
public	TokenNamepublic	
void	TokenNamevoid	
deleteHintsForEndpoint	TokenNameIdentifier	 delete Hints For Endpoint
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * List all the endpoints that this node has hints for. * @return set of endpoints; as Strings */	TokenNameCOMMENT_JAVADOC	 List all the endpoints that this node has hints for. @return set of endpoints; as Strings 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
listEndpointsPendingHints	TokenNameIdentifier	 list Endpoints Pending Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * List all the endpoints that this node has hints for, and * count the number of hints for each such endpoint. * * @return map of endpoint -> hint count */	TokenNameCOMMENT_JAVADOC	 List all the endpoints that this node has hints for, and count the number of hints for each such endpoint. * @return map of endpoint -> hint count 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
countPendingHints	TokenNameIdentifier	 count Pending Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** force hint delivery to an endpoint **/	TokenNameCOMMENT_JAVADOC	 force hint delivery to an endpoint *
public	TokenNamepublic	
void	TokenNamevoid	
scheduleHintDelivery	TokenNameIdentifier	 schedule Hint Delivery
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
