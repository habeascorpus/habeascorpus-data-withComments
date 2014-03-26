/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
;	TokenNameSEMICOLON	
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
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessageIn	TokenNameIdentifier	 Message In
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
IResponseResolver	TokenNameIdentifier	 I Response Resolver
<	TokenNameLESS	
TMessage	TokenNameIdentifier	 T Message
,	TokenNameCOMMA	
TResolved	TokenNameIdentifier	 T Resolved
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * This Method resolves the responses that are passed in . for example : if * its write response then all we get is true or false return values which * implies if the writes were successful but for reads its more complicated * you need to look at the responses and then based on differences schedule * repairs . Hence you need to derive a response resolver based on your * needs from this interface. */	TokenNameCOMMENT_JAVADOC	 This Method resolves the responses that are passed in . for example : if its write response then all we get is true or false return values which implies if the writes were successful but for reads its more complicated you need to look at the responses and then based on differences schedule repairs . Hence you need to derive a response resolver based on your needs from this interface. 
public	TokenNamepublic	
TResolved	TokenNameIdentifier	 T Resolved
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DigestMismatchException	TokenNameIdentifier	 Digest Mismatch Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isDataPresent	TokenNameIdentifier	 is Data Present
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * returns the data response without comparing with any digests */	TokenNameCOMMENT_JAVADOC	 returns the data response without comparing with any digests 
public	TokenNamepublic	
TResolved	TokenNameIdentifier	 T Resolved
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
preprocess	TokenNameIdentifier	 preprocess
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
TMessage	TokenNameIdentifier	 T Message
>	TokenNameGREATER	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
TMessage	TokenNameIdentifier	 T Message
>>	TokenNameRIGHT_SHIFT	
getMessages	TokenNameIdentifier	 get Messages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
