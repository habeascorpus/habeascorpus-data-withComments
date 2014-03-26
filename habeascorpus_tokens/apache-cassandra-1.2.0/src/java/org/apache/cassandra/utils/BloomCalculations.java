/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * The following calculations are taken from: * http://www.cs.wisc.edu/~cao/papers/summary-cache/node8.html * "Bloom Filters - the math" * * This class's static methods are meant to facilitate the use of the Bloom * Filter class by helping to choose correct values of 'bits per element' and * 'number of hash functions, k'. */	TokenNameCOMMENT_JAVADOC	 The following calculations are taken from: http://www.cs.wisc.edu/~cao/papers/summary-cache/node8.html "Bloom Filters - the math" * This class's static methods are meant to facilitate the use of the Bloom Filter class by helping to choose correct values of 'bits per element' and 'number of hash functions, k'. 
class	TokenNameclass	
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
minBuckets	TokenNameIdentifier	 min Buckets
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
minK	TokenNameIdentifier	 min K
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EXCESS	TokenNameIdentifier	 EXCESS
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * In the following table, the row 'i' shows false positive rates if i buckets * per element are used. Column 'j' shows false positive rates if j hash * functions are used. The first row is 'i=0', the first column is 'j=0'. * Each cell (i,j) the false positive rate determined by using i buckets per * element and j hash functions. */	TokenNameCOMMENT_JAVADOC	 In the following table, the row 'i' shows false positive rates if i buckets per element are used. Column 'j' shows false positive rates if j hash functions are used. The first row is 'i=0', the first column is 'j=0'. Each cell (i,j) the false positive rate determined by using i buckets per element and j hash functions. 
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
probs	TokenNameIdentifier	 probs
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// dummy row representing 0 buckets per element 	TokenNameCOMMENT_LINE	dummy row representing 0 buckets per element 
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// dummy row representing 1 buckets per element 	TokenNameCOMMENT_LINE	dummy row representing 1 buckets per element 
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.393	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.400	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.283	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.237	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.253	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.221	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.155	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.147	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.160	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.181	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.109	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.092	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.092	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.101	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 5 	TokenNameCOMMENT_LINE	5 
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.154	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0804	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0609	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0561	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0578	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0638	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.133	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0618	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0423	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0359	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0347	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0364	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.118	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0489	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0306	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.024	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0217	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0216	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0229	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.105	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0397	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0228	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0166	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0141	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0133	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0135	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0145	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0952	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0329	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0174	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0118	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00943	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00844	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00819	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00846	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 10 	TokenNameCOMMENT_LINE	10 
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0869	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0276	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0136	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00864	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0065	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00552	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00513	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00509	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.08	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0236	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0108	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00646	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00459	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00371	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00329	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00314	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.074	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0203	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00875	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00492	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00332	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00255	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00217	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00199	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00194	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0689	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0177	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00718	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00381	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00244	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00179	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00146	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00129	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00121	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0012	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0645	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0156	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00596	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.003	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00183	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00128	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000852	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000775	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000744	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 15 	TokenNameCOMMENT_LINE	15 
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0606	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0138	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.005	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00239	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00139	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000935	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000702	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000574	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000505	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00047	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000459	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0571	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0123	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00423	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00193	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00107	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000692	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000499	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000394	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000335	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000302	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000287	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000284	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.054	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0111	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00362	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00158	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000839	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000519	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00036	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000275	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000226	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000198	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000183	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000176	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0513	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00998	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00312	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0013	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000663	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000394	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000264	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000194	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000155	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000132	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000118	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000111	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000109	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0488	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00906	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.0027	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00108	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00053	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000303	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000196	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00014	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.000108	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.89e-05	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
7.77e-05	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
7.12e-05	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
6.79e-05	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
6.71e-05	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
// 20 	TokenNameCOMMENT_LINE	20 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// the first column is a dummy column representing K=0. 	TokenNameCOMMENT_LINE	the first column is a dummy column representing K=0. 
/** * The optimal number of hashes for a given number of bits per element. * These values are automatically calculated from the data above. */	TokenNameCOMMENT_JAVADOC	 The optimal number of hashes for a given number of bits per element. These values are automatically calculated from the data above. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
optKPerBuckets	TokenNameIdentifier	 opt K Per Buckets
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
probs	TokenNameIdentifier	 probs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
probs	TokenNameIdentifier	 probs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prob	TokenNameIdentifier	 prob
=	TokenNameEQUAL	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
prob	TokenNameIdentifier	 prob
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prob	TokenNameIdentifier	 prob
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
<	TokenNameLESS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
prob	TokenNameIdentifier	 prob
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
optKPerBuckets	TokenNameIdentifier	 opt K Per Buckets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
minK	TokenNameIdentifier	 min K
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Given the number of buckets that can be used per element, return a * specification that minimizes the false positive rate. * * @param bucketsPerElement The number of buckets per element for the filter. * @return A spec that minimizes the false positive rate. */	TokenNameCOMMENT_JAVADOC	 Given the number of buckets that can be used per element, return a specification that minimizes the false positive rate. * @param bucketsPerElement The number of buckets per element for the filter. @return A spec that minimizes the false positive rate. 
public	TokenNamepublic	
static	TokenNamestatic	
BloomSpecification	TokenNameIdentifier	 Bloom Specification
computeBloomSpec	TokenNameIdentifier	 compute Bloom Spec
(	TokenNameLPAREN	
int	TokenNameint	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
<=	TokenNameLESS_EQUAL	
probs	TokenNameIdentifier	 probs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
BloomSpecification	TokenNameIdentifier	 Bloom Specification
(	TokenNameLPAREN	
optKPerBuckets	TokenNameIdentifier	 opt K Per Buckets
[	TokenNameLBRACKET	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A wrapper class that holds two key parameters for a Bloom Filter: the * number of hash functions used, and the number of buckets per element used. */	TokenNameCOMMENT_JAVADOC	 A wrapper class that holds two key parameters for a Bloom Filter: the number of hash functions used, and the number of buckets per element used. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
BloomSpecification	TokenNameIdentifier	 Bloom Specification
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
K	TokenNameIdentifier	 K
;	TokenNameSEMICOLON	
// number of hash functions. 	TokenNameCOMMENT_LINE	number of hash functions. 
final	TokenNamefinal	
int	TokenNameint	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BloomSpecification	TokenNameIdentifier	 Bloom Specification
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
int	TokenNameint	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
K	TokenNameIdentifier	 K
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
=	TokenNameEQUAL	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"BloomSpecification(K=%d, bucketsPerElement=%d)"	TokenNameStringLiteral	BloomSpecification(K=%d, bucketsPerElement=%d)
,	TokenNameCOMMA	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Given a maximum tolerable false positive probability, compute a Bloom * specification which will give less than the specified false positive rate, * but minimize the number of buckets per element and the number of hash * functions used. Because bandwidth (and therefore total bitvector size) * is considered more expensive than computing power, preference is given * to minimizing buckets per element rather than number of hash functions. * * @param maxBucketsPerElement The maximum number of buckets available for the filter. * @param maxFalsePosProb The maximum tolerable false positive rate. * @return A Bloom Specification which would result in a false positive rate * less than specified by the function call * @throws UnsupportedOperationException if a filter satisfying the parameters cannot be met */	TokenNameCOMMENT_JAVADOC	 Given a maximum tolerable false positive probability, compute a Bloom specification which will give less than the specified false positive rate, but minimize the number of buckets per element and the number of hash functions used. Because bandwidth (and therefore total bitvector size) is considered more expensive than computing power, preference is given to minimizing buckets per element rather than number of hash functions. * @param maxBucketsPerElement The maximum number of buckets available for the filter. @param maxFalsePosProb The maximum tolerable false positive rate. @return A Bloom Specification which would result in a false positive rate less than specified by the function call @throws UnsupportedOperationException if a filter satisfying the parameters cannot be met 
public	TokenNamepublic	
static	TokenNamestatic	
BloomSpecification	TokenNameIdentifier	 Bloom Specification
computeBloomSpec	TokenNameIdentifier	 compute Bloom Spec
(	TokenNameLPAREN	
int	TokenNameint	
maxBucketsPerElement	TokenNameIdentifier	 max Buckets Per Element
,	TokenNameCOMMA	
double	TokenNamedouble	
maxFalsePosProb	TokenNameIdentifier	 max False Pos Prob
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
maxBucketsPerElement	TokenNameIdentifier	 max Buckets Per Element
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
maxBucketsPerElement	TokenNameIdentifier	 max Buckets Per Element
<=	TokenNameLESS_EQUAL	
probs	TokenNameIdentifier	 probs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxK	TokenNameIdentifier	 max K
=	TokenNameEQUAL	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
maxBucketsPerElement	TokenNameIdentifier	 max Buckets Per Element
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Handle the trivial cases 	TokenNameCOMMENT_LINE	Handle the trivial cases 
if	TokenNameif	
(	TokenNameLPAREN	
maxFalsePosProb	TokenNameIdentifier	 max False Pos Prob
>=	TokenNameGREATER_EQUAL	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
minBuckets	TokenNameIdentifier	 min Buckets
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
minK	TokenNameIdentifier	 min K
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BloomSpecification	TokenNameIdentifier	 Bloom Specification
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
optKPerBuckets	TokenNameIdentifier	 opt K Per Buckets
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxFalsePosProb	TokenNameIdentifier	 max False Pos Prob
<	TokenNameLESS	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
maxBucketsPerElement	TokenNameIdentifier	 max Buckets Per Element
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
maxK	TokenNameIdentifier	 max K
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Unable to satisfy %s with %s buckets per element"	TokenNameStringLiteral	Unable to satisfy %s with %s buckets per element
,	TokenNameCOMMA	
maxFalsePosProb	TokenNameIdentifier	 max False Pos Prob
,	TokenNameCOMMA	
maxBucketsPerElement	TokenNameIdentifier	 max Buckets Per Element
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// First find the minimal required number of buckets: 	TokenNameCOMMENT_LINE	First find the minimal required number of buckets: 
int	TokenNameint	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
K	TokenNameIdentifier	 K
=	TokenNameEQUAL	
optKPerBuckets	TokenNameIdentifier	 opt K Per Buckets
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
K	TokenNameIdentifier	 K
]	TokenNameRBRACKET	
>	TokenNameGREATER	
maxFalsePosProb	TokenNameIdentifier	 max False Pos Prob
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
K	TokenNameIdentifier	 K
=	TokenNameEQUAL	
optKPerBuckets	TokenNameIdentifier	 opt K Per Buckets
[	TokenNameLBRACKET	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now that the number of buckets is sufficient, see if we can relax K 	TokenNameCOMMENT_LINE	Now that the number of buckets is sufficient, see if we can relax K 
// without losing too much precision. 	TokenNameCOMMENT_LINE	without losing too much precision. 
while	TokenNamewhile	
(	TokenNameLPAREN	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
K	TokenNameIdentifier	 K
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
maxFalsePosProb	TokenNameIdentifier	 max False Pos Prob
)	TokenNameRPAREN	
{	TokenNameLBRACE	
K	TokenNameIdentifier	 K
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BloomSpecification	TokenNameIdentifier	 Bloom Specification
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculates the maximum number of buckets per element that this implementation * can support. Crucially, it will lower the bucket count if necessary to meet * BitSet's size restrictions. */	TokenNameCOMMENT_JAVADOC	 Calculates the maximum number of buckets per element that this implementation can support. Crucially, it will lower the bucket count if necessary to meet BitSet's size restrictions. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
maxBucketsPerElement	TokenNameIdentifier	 max Buckets Per Element
(	TokenNameLPAREN	
long	TokenNamelong	
numElements	TokenNameIdentifier	 num Elements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numElements	TokenNameIdentifier	 num Elements
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numElements	TokenNameIdentifier	 num Elements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
-	TokenNameMINUS	
EXCESS	TokenNameIdentifier	 EXCESS
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
numElements	TokenNameIdentifier	 num Elements
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<	TokenNameLESS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Cannot compute probabilities for "	TokenNameStringLiteral	Cannot compute probabilities for 
+	TokenNamePLUS	
numElements	TokenNameIdentifier	 num Elements
+	TokenNamePLUS	
" elements."	TokenNameStringLiteral	 elements.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
.	TokenNameDOT	
probs	TokenNameIdentifier	 probs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
