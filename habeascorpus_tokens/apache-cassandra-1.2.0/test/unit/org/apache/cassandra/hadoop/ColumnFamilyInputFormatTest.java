package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
;	TokenNameSEMICOLON	
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
SlicePredicate	TokenNameIdentifier	 Slice Predicate
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
.	TokenNameDOT	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
Configuration	TokenNameIdentifier	 Configuration
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ColumnFamilyInputFormatTest	TokenNameIdentifier	 Column Family Input Format Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testSlicePredicate	TokenNameIdentifier	 test Slice Predicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
columnValue	TokenNameIdentifier	 column Value
=	TokenNameEQUAL	
1271253600000l	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
columnBytes	TokenNameIdentifier	 column Bytes
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
columnValue	TokenNameIdentifier	 column Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
columnNames	TokenNameIdentifier	 column Names
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columnNames	TokenNameIdentifier	 column Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
columnBytes	TokenNameIdentifier	 column Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SlicePredicate	TokenNameIdentifier	 Slice Predicate
originalPredicate	TokenNameIdentifier	 original Predicate
=	TokenNameEQUAL	
new	TokenNamenew	
SlicePredicate	TokenNameIdentifier	 Slice Predicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setColumn_names	TokenNameIdentifier	 set Column names
(	TokenNameLPAREN	
columnNames	TokenNameIdentifier	 column Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Configuration	TokenNameIdentifier	 Configuration
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
new	TokenNamenew	
Configuration	TokenNameIdentifier	 Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ConfigHelper	TokenNameIdentifier	 Config Helper
.	TokenNameDOT	
setInputSlicePredicate	TokenNameIdentifier	 set Input Slice Predicate
(	TokenNameLPAREN	
conf	TokenNameIdentifier	 conf
,	TokenNameCOMMA	
originalPredicate	TokenNameIdentifier	 original Predicate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SlicePredicate	TokenNameIdentifier	 Slice Predicate
rtPredicate	TokenNameIdentifier	 rt Predicate
=	TokenNameEQUAL	
ConfigHelper	TokenNameIdentifier	 Config Helper
.	TokenNameDOT	
getInputSlicePredicate	TokenNameIdentifier	 get Input Slice Predicate
(	TokenNameLPAREN	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
rtPredicate	TokenNameIdentifier	 rt Predicate
.	TokenNameDOT	
column_names	TokenNameIdentifier	 column names
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
originalPredicate	TokenNameIdentifier	 original Predicate
.	TokenNameDOT	
column_names	TokenNameIdentifier	 column names
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rtPredicate	TokenNameIdentifier	 rt Predicate
.	TokenNameDOT	
column_names	TokenNameIdentifier	 column names
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
