/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
TException	TokenNameIdentifier	 T Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
.	TokenNameDOT	
TProtocol	TokenNameIdentifier	 T Protocol
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
TTransport	TokenNameIdentifier	 T Transport
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
/** * TODO * This was added to support writeBinary on direct buffers for CASSANDRA-1714; * we can remove it once we upgrade to Thrift 0.7, which incorporates the patch (THRIFT-883). */	TokenNameCOMMENT_JAVADOC	 TODO This was added to support writeBinary on direct buffers for CASSANDRA-1714; we can remove it once we upgrade to Thrift 0.7, which incorporates the patch (THRIFT-883). 
public	TokenNamepublic	
class	TokenNameclass	
TBinaryProtocol	TokenNameIdentifier	 T Binary Protocol
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
.	TokenNameDOT	
TBinaryProtocol	TokenNameIdentifier	 T Binary Protocol
{	TokenNameLBRACE	
public	TokenNamepublic	
TBinaryProtocol	TokenNameIdentifier	 T Binary Protocol
(	TokenNameLPAREN	
TTransport	TokenNameIdentifier	 T Transport
trans	TokenNameIdentifier	 trans
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
trans	TokenNameIdentifier	 trans
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TBinaryProtocol	TokenNameIdentifier	 T Binary Protocol
(	TokenNameLPAREN	
TTransport	TokenNameIdentifier	 T Transport
trans	TokenNameIdentifier	 trans
,	TokenNameCOMMA	
boolean	TokenNameboolean	
strictRead	TokenNameIdentifier	 strict Read
,	TokenNameCOMMA	
boolean	TokenNameboolean	
strictWrite	TokenNameIdentifier	 strict Write
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
trans	TokenNameIdentifier	 trans
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
strictRead_	TokenNameIdentifier	 strict Read
=	TokenNameEQUAL	
strictRead	TokenNameIdentifier	 strict Read
;	TokenNameSEMICOLON	
strictWrite_	TokenNameIdentifier	 strict Write
=	TokenNameEQUAL	
strictWrite	TokenNameIdentifier	 strict Write
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Factory	TokenNameIdentifier	 Factory
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
.	TokenNameDOT	
TBinaryProtocol	TokenNameIdentifier	 T Binary Protocol
.	TokenNameDOT	
Factory	TokenNameIdentifier	 Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
Factory	TokenNameIdentifier	 Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Factory	TokenNameIdentifier	 Factory
(	TokenNameLPAREN	
boolean	TokenNameboolean	
strictRead	TokenNameIdentifier	 strict Read
,	TokenNameCOMMA	
boolean	TokenNameboolean	
strictWrite	TokenNameIdentifier	 strict Write
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
strictRead	TokenNameIdentifier	 strict Read
,	TokenNameCOMMA	
strictWrite	TokenNameIdentifier	 strict Write
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Factory	TokenNameIdentifier	 Factory
(	TokenNameLPAREN	
boolean	TokenNameboolean	
strictRead	TokenNameIdentifier	 strict Read
,	TokenNameCOMMA	
boolean	TokenNameboolean	
strictWrite	TokenNameIdentifier	 strict Write
,	TokenNameCOMMA	
int	TokenNameint	
readLength	TokenNameIdentifier	 read Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
strictRead	TokenNameIdentifier	 strict Read
,	TokenNameCOMMA	
strictWrite	TokenNameIdentifier	 strict Write
,	TokenNameCOMMA	
readLength	TokenNameIdentifier	 read Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TProtocol	TokenNameIdentifier	 T Protocol
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
TTransport	TokenNameIdentifier	 T Transport
trans	TokenNameIdentifier	 trans
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TBinaryProtocol	TokenNameIdentifier	 T Binary Protocol
protocol	TokenNameIdentifier	 protocol
=	TokenNameEQUAL	
new	TokenNamenew	
TBinaryProtocol	TokenNameIdentifier	 T Binary Protocol
(	TokenNameLPAREN	
trans	TokenNameIdentifier	 trans
,	TokenNameCOMMA	
strictRead_	TokenNameIdentifier	 strict Read
,	TokenNameCOMMA	
strictWrite_	TokenNameIdentifier	 strict Write
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
readLength_	TokenNameIdentifier	 read Length
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protocol	TokenNameIdentifier	 protocol
.	TokenNameDOT	
setReadLength	TokenNameIdentifier	 set Read Length
(	TokenNameLPAREN	
readLength_	TokenNameIdentifier	 read Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
protocol	TokenNameIdentifier	 protocol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
writeBinary	TokenNameIdentifier	 write Binary
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
throws	TokenNamethrows	
TException	TokenNameIdentifier	 T Exception
{	TokenNameLBRACE	
writeI32	TokenNameIdentifier	 write I32
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
hasArray	TokenNameIdentifier	 has Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trans_	TokenNameIdentifier	 trans
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
trans_	TokenNameIdentifier	 trans
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
