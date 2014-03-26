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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
StorageProxy	TokenNameIdentifier	 Storage Proxy
;	TokenNameSEMICOLON	
/** * Encapsulates the callback information. * The ability to set the message is useful in cases for when a hint needs * to be written due to a timeout in the response from a replica. */	TokenNameCOMMENT_JAVADOC	 Encapsulates the callback information. The ability to set the message is useful in cases for when a hint needs to be written due to a timeout in the response from a replica. 
public	TokenNamepublic	
class	TokenNameclass	
CallbackInfo	TokenNameIdentifier	 Callback Info
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
InetAddress	TokenNameIdentifier	 Inet Address
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
IMessageCallback	TokenNameIdentifier	 I Message Callback
callback	TokenNameIdentifier	 callback
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
sentMessage	TokenNameIdentifier	 sent Message
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
/** * Create CallbackInfo without sent message * * @param target target to send message * @param callback * @param serializer serializer to deserialize response message */	TokenNameCOMMENT_JAVADOC	 Create CallbackInfo without sent message * @param target target to send message @param callback @param serializer serializer to deserialize response message 
public	TokenNamepublic	
CallbackInfo	TokenNameIdentifier	 Callback Info
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
IMessageCallback	TokenNameIdentifier	 I Message Callback
callback	TokenNameIdentifier	 callback
,	TokenNameCOMMA	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
callback	TokenNameIdentifier	 callback
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CallbackInfo	TokenNameIdentifier	 Callback Info
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
IMessageCallback	TokenNameIdentifier	 I Message Callback
callback	TokenNameIdentifier	 callback
,	TokenNameCOMMA	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
sentMessage	TokenNameIdentifier	 sent Message
,	TokenNameCOMMA	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
callback	TokenNameIdentifier	 callback
=	TokenNameEQUAL	
callback	TokenNameIdentifier	 callback
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sentMessage	TokenNameIdentifier	 sent Message
=	TokenNameEQUAL	
sentMessage	TokenNameIdentifier	 sent Message
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return TRUE if a hint should be written for this target and if the CL was achieved. FALSE otherwise. * * NOTE: * Assumes it is only called after the write of "message" to "target" has timed out. */	TokenNameCOMMENT_JAVADOC	 @return TRUE if a hint should be written for this target and if the CL was achieved. FALSE otherwise. * NOTE: Assumes it is only called after the write of "message" to "target" has timed out. 
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldHint	TokenNameIdentifier	 should Hint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sentMessage	TokenNameIdentifier	 sent Message
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
StorageProxy	TokenNameIdentifier	 Storage Proxy
.	TokenNameDOT	
shouldHint	TokenNameIdentifier	 should Hint
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
