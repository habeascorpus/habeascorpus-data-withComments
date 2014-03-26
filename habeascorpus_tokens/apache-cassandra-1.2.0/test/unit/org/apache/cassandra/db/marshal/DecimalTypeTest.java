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
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
math	TokenNameIdentifier	 math
.	TokenNameDOT	
BigDecimal	TokenNameIdentifier	 Big Decimal
;	TokenNameSEMICOLON	
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
Arrays	TokenNameIdentifier	 Arrays
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
DecimalType	TokenNameIdentifier	 Decimal Type
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
DecimalTypeTest	TokenNameIdentifier	 Decimal Type Test
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOW	TokenNameIdentifier	 LOW
=	TokenNameEQUAL	
"12.34"	TokenNameStringLiteral	12.34
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HIGH	TokenNameIdentifier	 HIGH
=	TokenNameEQUAL	
"34.5678"	TokenNameStringLiteral	34.5678
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
BigDecimal	TokenNameIdentifier	 Big Decimal
zero	TokenNameIdentifier	 zero
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
"0.0"	TokenNameStringLiteral	0.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
BigDecimal	TokenNameIdentifier	 Big Decimal
minus	TokenNameIdentifier	 minus
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
"-1.000001"	TokenNameStringLiteral	-1.000001
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
BigDecimal	TokenNameIdentifier	 Big Decimal
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
LOW	TokenNameIdentifier	 LOW
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
BigDecimal	TokenNameIdentifier	 Big Decimal
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
HIGH	TokenNameIdentifier	 HIGH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
test1Decompose_compose	TokenNameIdentifier	 test1 Decompose compose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
.	TokenNameDOT	
toPlainString	TokenNameIdentifier	 to Plain String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check that the decomposed buffer when re-composed is equal to the initial string. 	TokenNameCOMMENT_LINE	check that the decomposed buffer when re-composed is equal to the initial string. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
LOW	TokenNameIdentifier	 LOW
,	TokenNameCOMMA	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check that a null argument yields an empty byte buffer 	TokenNameCOMMENT_LINE	check that a null argument yields an empty byte buffer 
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
test2Compare	TokenNameIdentifier	 test2 Compare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
lowBB	TokenNameIdentifier	 low BB
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
low2BB	TokenNameIdentifier	 low2 BB
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
highBB	TokenNameIdentifier	 high BB
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
lowBB	TokenNameIdentifier	 low BB
,	TokenNameCOMMA	
highBB	TokenNameIdentifier	 high BB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lowBB	TokenNameIdentifier	 low BB
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
highBB	TokenNameIdentifier	 high BB
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
highBB	TokenNameIdentifier	 high BB
,	TokenNameCOMMA	
lowBB	TokenNameIdentifier	 low BB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lowBB	TokenNameIdentifier	 low BB
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
low2BB	TokenNameIdentifier	 low2 BB
,	TokenNameCOMMA	
lowBB	TokenNameIdentifier	 low BB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lowBB	TokenNameIdentifier	 low BB
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
,	TokenNameCOMMA	
lowBB	TokenNameIdentifier	 low BB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lowBB	TokenNameIdentifier	 low BB
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
lowBB	TokenNameIdentifier	 low BB
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
test3Sort	TokenNameIdentifier	 test3 Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
zeroBB	TokenNameIdentifier	 zero BB
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
zero	TokenNameIdentifier	 zero
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
minusBB	TokenNameIdentifier	 minus BB
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
minus	TokenNameIdentifier	 minus
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
lowBB	TokenNameIdentifier	 low BB
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
highBB	TokenNameIdentifier	 high BB
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
{	TokenNameLBRACE	
highBB	TokenNameIdentifier	 high BB
,	TokenNameCOMMA	
minusBB	TokenNameIdentifier	 minus BB
,	TokenNameCOMMA	
lowBB	TokenNameIdentifier	 low BB
,	TokenNameCOMMA	
lowBB	TokenNameIdentifier	 low BB
,	TokenNameCOMMA	
zeroBB	TokenNameIdentifier	 zero BB
,	TokenNameCOMMA	
minusBB	TokenNameIdentifier	 minus BB
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Sort the array of ByteBuffer using a DecimalType comparator 	TokenNameCOMMENT_LINE	Sort the array of ByteBuffer using a DecimalType comparator 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check that the array is in order 	TokenNameCOMMENT_LINE	Check that the array is in order 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BigDecimal	TokenNameIdentifier	 Big Decimal
i0	TokenNameIdentifier	 i0
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigDecimal	TokenNameIdentifier	 Big Decimal
i1	TokenNameIdentifier	 i1
=	TokenNameEQUAL	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i0	TokenNameIdentifier	 i0
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
