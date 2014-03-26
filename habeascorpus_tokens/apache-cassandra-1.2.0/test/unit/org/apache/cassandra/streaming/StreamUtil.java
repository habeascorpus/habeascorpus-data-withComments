/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
streaming	TokenNameIdentifier	 streaming
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOError	TokenNameIdentifier	 IO Error
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessageIn	TokenNameIdentifier	 Message In
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
StreamUtil	TokenNameIdentifier	 Stream Util
{	TokenNameLBRACE	
/** * Takes an stream request message and creates an empty status response. Exists here because StreamRequestMessage * is package protected. */	TokenNameCOMMENT_JAVADOC	 Takes an stream request message and creates an empty status response. Exists here because StreamRequestMessage is package protected. 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
finishStreamRequest	TokenNameIdentifier	 finish Stream Request
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
StreamRequest	TokenNameIdentifier	 Stream Request
>	TokenNameGREATER	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StreamInSession	TokenNameIdentifier	 Stream In Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
StreamInSession	TokenNameIdentifier	 Stream In Session
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
sessionId	TokenNameIdentifier	 session Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
closeIfFinished	TokenNameIdentifier	 close If Finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOError	TokenNameIdentifier	 IO Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
