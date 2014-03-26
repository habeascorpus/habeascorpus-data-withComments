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
public	TokenNamepublic	
enum	TokenNameenum	
Stage	TokenNameIdentifier	 Stage
{	TokenNameLBRACE	
READ	TokenNameIdentifier	 READ
,	TokenNameCOMMA	
MUTATION	TokenNameIdentifier	 MUTATION
,	TokenNameCOMMA	
GOSSIP	TokenNameIdentifier	 GOSSIP
,	TokenNameCOMMA	
REQUEST_RESPONSE	TokenNameIdentifier	 REQUEST  RESPONSE
,	TokenNameCOMMA	
ANTI_ENTROPY	TokenNameIdentifier	 ANTI  ENTROPY
,	TokenNameCOMMA	
MIGRATION	TokenNameIdentifier	 MIGRATION
,	TokenNameCOMMA	
MISC	TokenNameIdentifier	 MISC
,	TokenNameCOMMA	
TRACING	TokenNameIdentifier	 TRACING
,	TokenNameCOMMA	
INTERNAL_RESPONSE	TokenNameIdentifier	 INTERNAL  RESPONSE
,	TokenNameCOMMA	
READ_REPAIR	TokenNameIdentifier	 READ  REPAIR
,	TokenNameCOMMA	
REPLICATE_ON_WRITE	TokenNameIdentifier	 REPLICATE  ON  WRITE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getJmxType	TokenNameIdentifier	 get Jmx Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ANTI_ENTROPY	TokenNameIdentifier	 ANTI  ENTROPY
:	TokenNameCOLON	
case	TokenNamecase	
GOSSIP	TokenNameIdentifier	 GOSSIP
:	TokenNameCOLON	
case	TokenNamecase	
MIGRATION	TokenNameIdentifier	 MIGRATION
:	TokenNameCOLON	
case	TokenNamecase	
MISC	TokenNameIdentifier	 MISC
:	TokenNameCOLON	
case	TokenNamecase	
TRACING	TokenNameIdentifier	 TRACING
:	TokenNameCOLON	
case	TokenNamecase	
INTERNAL_RESPONSE	TokenNameIdentifier	 INTERNAL  RESPONSE
:	TokenNameCOLON	
return	TokenNamereturn	
"internal"	TokenNameStringLiteral	internal
;	TokenNameSEMICOLON	
case	TokenNamecase	
MUTATION	TokenNameIdentifier	 MUTATION
:	TokenNameCOLON	
case	TokenNamecase	
READ	TokenNameIdentifier	 READ
:	TokenNameCOLON	
case	TokenNamecase	
REQUEST_RESPONSE	TokenNameIdentifier	 REQUEST  RESPONSE
:	TokenNameCOLON	
case	TokenNamecase	
REPLICATE_ON_WRITE	TokenNameIdentifier	 REPLICATE  ON  WRITE
:	TokenNameCOLON	
case	TokenNamecase	
READ_REPAIR	TokenNameIdentifier	 READ  REPAIR
:	TokenNameCOLON	
return	TokenNamereturn	
"request"	TokenNameStringLiteral	request
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
"Unknown stage "	TokenNameStringLiteral	Unknown stage 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getJmxName	TokenNameIdentifier	 get Jmx Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
word	TokenNameIdentifier	 word
:	TokenNameCOLON	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"_"	TokenNameStringLiteral	_
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
+=	TokenNamePLUS_EQUAL	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"Stage"	TokenNameStringLiteral	Stage
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
