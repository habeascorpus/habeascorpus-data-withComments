/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
jboss	TokenNameIdentifier	 jboss
.	TokenNameDOT	
netty	TokenNameIdentifier	 netty
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
jboss	TokenNameIdentifier	 jboss
.	TokenNameDOT	
netty	TokenNameIdentifier	 netty
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
CBUtil	TokenNameIdentifier	 CB Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
Message	TokenNameIdentifier	 Message
;	TokenNameSEMICOLON	
/** * Message to indicate that the server is ready to receive requests. */	TokenNameCOMMENT_JAVADOC	 Message to indicate that the server is ready to receive requests. 
public	TokenNamepublic	
class	TokenNameclass	
SupportedMessage	TokenNameIdentifier	 Supported Message
extends	TokenNameextends	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Response	TokenNameIdentifier	 Response
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Codec	TokenNameIdentifier	 Codec
<	TokenNameLESS	
SupportedMessage	TokenNameIdentifier	 Supported Message
>	TokenNameGREATER	
codec	TokenNameIdentifier	 codec
=	TokenNameEQUAL	
new	TokenNamenew	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Codec	TokenNameIdentifier	 Codec
<	TokenNameLESS	
SupportedMessage	TokenNameIdentifier	 Supported Message
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
SupportedMessage	TokenNameIdentifier	 Supported Message
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SupportedMessage	TokenNameIdentifier	 Supported Message
(	TokenNameLPAREN	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readStringToStringListMap	TokenNameIdentifier	 read String To String List Map
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
SupportedMessage	TokenNameIdentifier	 Supported Message
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
=	TokenNameEQUAL	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
dynamicBuffer	TokenNameIdentifier	 dynamic Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
writeStringToStringListMap	TokenNameIdentifier	 write String To String List Map
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
supported	TokenNameIdentifier	 supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cb	TokenNameIdentifier	 cb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
supported	TokenNameIdentifier	 supported
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SupportedMessage	TokenNameIdentifier	 Supported Message
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
supported	TokenNameIdentifier	 supported
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SUPPORTED	TokenNameIdentifier	 SUPPORTED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
supported	TokenNameIdentifier	 supported
=	TokenNameEQUAL	
supported	TokenNameIdentifier	 supported
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"SUPPORTED "	TokenNameStringLiteral	SUPPORTED 
+	TokenNamePLUS	
supported	TokenNameIdentifier	 supported
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
