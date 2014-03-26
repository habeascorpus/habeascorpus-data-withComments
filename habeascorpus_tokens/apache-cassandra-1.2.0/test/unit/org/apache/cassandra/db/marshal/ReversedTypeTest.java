/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
marshal	TokenNameIdentifier	 marshal
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ReversedTypeTest	TokenNameIdentifier	 Reversed Type Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testReverseComparison	TokenNameIdentifier	 test Reverse Comparison
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ReversedType	TokenNameIdentifier	 Reversed Type
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
ReversedType	TokenNameIdentifier	 Reversed Type
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
LongType	TokenNameIdentifier	 Long Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
4L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
4L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// the empty byte buffer is always the smaller 	TokenNameCOMMENT_LINE	the empty byte buffer is always the smaller 
assert	TokenNameassert	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
