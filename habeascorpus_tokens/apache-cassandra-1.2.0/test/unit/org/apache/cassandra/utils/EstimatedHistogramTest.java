/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
EstimatedHistogramTest	TokenNameIdentifier	 Estimated Histogram Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testSimple	TokenNameIdentifier	 test Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 0 and 1 map to the same, first bucket 	TokenNameCOMMENT_LINE	0 and 1 map to the same, first bucket 
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
histogram	TokenNameIdentifier	 histogram
=	TokenNameEQUAL	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testOverflow	TokenNameIdentifier	 test Overflow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
histogram	TokenNameIdentifier	 histogram
=	TokenNameEQUAL	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
isOverflowed	TokenNameIdentifier	 is Overflowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testMinMax	TokenNameIdentifier	 test Min Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
histogram	TokenNameIdentifier	 histogram
=	TokenNameEQUAL	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFindingCorrectBuckets	TokenNameIdentifier	 test Finding Correct Buckets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
histogram	TokenNameIdentifier	 histogram
=	TokenNameEQUAL	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
23282687	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
isOverflowed	TokenNameIdentifier	 is Overflowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
getBuckets	TokenNameIdentifier	 get Buckets
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
getBuckets	TokenNameIdentifier	 get Buckets
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
21	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
22	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
getBuckets	TokenNameIdentifier	 get Buckets
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
13	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5021848	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
mean	TokenNameIdentifier	 mean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testPercentile	TokenNameIdentifier	 test Percentile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
histogram	TokenNameIdentifier	 histogram
=	TokenNameEQUAL	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// percentile of empty histogram is 0 	TokenNameCOMMENT_LINE	percentile of empty histogram is 0 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
percentile	TokenNameIdentifier	 percentile
(	TokenNameLPAREN	
0.99	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// percentile of histogram with just one value will return 0 except 100th 	TokenNameCOMMENT_LINE	percentile of histogram with just one value will return 0 except 100th 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
percentile	TokenNameIdentifier	 percentile
(	TokenNameLPAREN	
0.99	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
percentile	TokenNameIdentifier	 percentile
(	TokenNameLPAREN	
1.00	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
percentile	TokenNameIdentifier	 percentile
(	TokenNameLPAREN	
0.99	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
percentile	TokenNameIdentifier	 percentile
(	TokenNameLPAREN	
1.00	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
