package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
BytesType	TokenNameIdentifier	 Bytes Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
LongType	TokenNameIdentifier	 Long Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
IndexType	TokenNameIdentifier	 Index Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ColumnDefinitionTest	TokenNameIdentifier	 Column Definition Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testSerializeDeserialize	TokenNameIdentifier	 test Serialize Deserialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ColumnDefinition	TokenNameIdentifier	 Column Definition
cd0	TokenNameIdentifier	 cd0
=	TokenNameEQUAL	
new	TokenNamenew	
ColumnDefinition	TokenNameIdentifier	 Column Definition
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"TestColumnDefinitionName0"	TokenNameStringLiteral	TestColumnDefinitionName0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BytesType	TokenNameIdentifier	 Bytes Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
IndexType	TokenNameIdentifier	 Index Type
.	TokenNameDOT	
KEYS	TokenNameIdentifier	 KEYS
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"random index name 0"	TokenNameStringLiteral	random index name 0
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnDefinition	TokenNameIdentifier	 Column Definition
cd1	TokenNameIdentifier	 cd1
=	TokenNameEQUAL	
new	TokenNamenew	
ColumnDefinition	TokenNameIdentifier	 Column Definition
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"TestColumnDefinition1"	TokenNameStringLiteral	TestColumnDefinition1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
LongType	TokenNameIdentifier	 Long Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSerializeDeserialize	TokenNameIdentifier	 test Serialize Deserialize
(	TokenNameLPAREN	
cd0	TokenNameIdentifier	 cd0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSerializeDeserialize	TokenNameIdentifier	 test Serialize Deserialize
(	TokenNameLPAREN	
cd1	TokenNameIdentifier	 cd1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
testSerializeDeserialize	TokenNameIdentifier	 test Serialize Deserialize
(	TokenNameLPAREN	
ColumnDefinition	TokenNameIdentifier	 Column Definition
cd	TokenNameIdentifier	 cd
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ColumnDefinition	TokenNameIdentifier	 Column Definition
newCd	TokenNameIdentifier	 new Cd
=	TokenNameEQUAL	
ColumnDefinition	TokenNameIdentifier	 Column Definition
.	TokenNameDOT	
fromThrift	TokenNameIdentifier	 from Thrift
(	TokenNameLPAREN	
cd	TokenNameIdentifier	 cd
.	TokenNameDOT	
toThrift	TokenNameIdentifier	 to Thrift
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cd	TokenNameIdentifier	 cd
!=	TokenNameNOT_EQUAL	
newCd	TokenNameIdentifier	 new Cd
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cd	TokenNameIdentifier	 cd
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
newCd	TokenNameIdentifier	 new Cd
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cd	TokenNameIdentifier	 cd
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
newCd	TokenNameIdentifier	 new Cd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
