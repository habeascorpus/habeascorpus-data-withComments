/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
misc	TokenNameIdentifier	 misc
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
DefaultSimilarity	TokenNameIdentifier	 Default Similarity
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Similarity	TokenNameIdentifier	 Similarity
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
FieldInvertState	TokenNameIdentifier	 Field Invert State
;	TokenNameSEMICOLON	
/** * Test of the SweetSpotSimilarity */	TokenNameCOMMENT_JAVADOC	 Test of the SweetSpotSimilarity 
public	TokenNamepublic	
class	TokenNameclass	
SweetSpotSimilarityTest	TokenNameIdentifier	 Sweet Spot Similarity Test
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSweetSpotComputeNorm	TokenNameIdentifier	 test Sweet Spot Compute Norm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SweetSpotSimilarity	TokenNameIdentifier	 Sweet Spot Similarity
ss	TokenNameIdentifier	 ss
=	TokenNameEQUAL	
new	TokenNamenew	
SweetSpotSimilarity	TokenNameIdentifier	 Sweet Spot Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
setLengthNormFactors	TokenNameIdentifier	 set Length Norm Factors
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Similarity	TokenNameIdentifier	 Similarity
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultSimilarity	TokenNameIdentifier	 Default Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Similarity	TokenNameIdentifier	 Similarity
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
;	TokenNameSEMICOLON	
// base case, should degrade 	TokenNameCOMMENT_LINE	base case, should degrade 
final	TokenNamefinal	
FieldInvertState	TokenNameIdentifier	 Field Invert State
invertState	TokenNameIdentifier	 invert State
=	TokenNameEQUAL	
new	TokenNamenew	
FieldInvertState	TokenNameIdentifier	 Field Invert State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invertState	TokenNameIdentifier	 invert State
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invertState	TokenNameIdentifier	 invert State
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"base case: i="	TokenNameStringLiteral	base case: i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
invertState	TokenNameIdentifier	 invert State
)	TokenNameRPAREN	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
invertState	TokenNameIdentifier	 invert State
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// make a sweet spot 	TokenNameCOMMENT_LINE	make a sweet spot 
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
setLengthNormFactors	TokenNameIdentifier	 set Length Norm Factors
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invertState	TokenNameIdentifier	 invert State
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"3,10: spot i="	TokenNameStringLiteral	3,10: spot i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
invertState	TokenNameIdentifier	 invert State
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invertState	TokenNameIdentifier	 invert State
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
normD	TokenNameIdentifier	 norm D
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
invertState	TokenNameIdentifier	 invert State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invertState	TokenNameIdentifier	 invert State
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
normS	TokenNameIdentifier	 norm S
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
invertState	TokenNameIdentifier	 invert State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"3,10: 10<x : i="	TokenNameStringLiteral	3,10: 10<x : i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
normD	TokenNameIdentifier	 norm D
,	TokenNameCOMMA	
normS	TokenNameIdentifier	 norm S
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// seperate sweet spot for certain fields 	TokenNameCOMMENT_LINE	seperate sweet spot for certain fields 
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
setLengthNormFactors	TokenNameIdentifier	 set Length Norm Factors
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.5f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
setLengthNormFactors	TokenNameIdentifier	 set Length Norm Factors
(	TokenNameLPAREN	
"yak"	TokenNameStringLiteral	yak
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.5f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invertState	TokenNameIdentifier	 invert State
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"f: 3,10: spot i="	TokenNameStringLiteral	f: 3,10: spot i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
invertState	TokenNameIdentifier	 invert State
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invertState	TokenNameIdentifier	 invert State
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
normD	TokenNameIdentifier	 norm D
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
invertState	TokenNameIdentifier	 invert State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invertState	TokenNameIdentifier	 invert State
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
normS	TokenNameIdentifier	 norm S
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
invertState	TokenNameIdentifier	 invert State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"f: 3,10: 10<x : i="	TokenNameStringLiteral	f: 3,10: 10<x : i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
normD	TokenNameIdentifier	 norm D
,	TokenNameCOMMA	
normS	TokenNameIdentifier	 norm S
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invertState	TokenNameIdentifier	 invert State
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"f: 8,13: spot i="	TokenNameStringLiteral	f: 8,13: spot i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
invertState	TokenNameIdentifier	 invert State
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invertState	TokenNameIdentifier	 invert State
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"f: 6,9: spot i="	TokenNameStringLiteral	f: 6,9: spot i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
"yak"	TokenNameStringLiteral	yak
,	TokenNameCOMMA	
invertState	TokenNameIdentifier	 invert State
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invertState	TokenNameIdentifier	 invert State
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
normD	TokenNameIdentifier	 norm D
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
invertState	TokenNameIdentifier	 invert State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invertState	TokenNameIdentifier	 invert State
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
normS	TokenNameIdentifier	 norm S
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
invertState	TokenNameIdentifier	 invert State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"f: 8,13: 13<x : i="	TokenNameStringLiteral	f: 8,13: 13<x : i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
normD	TokenNameIdentifier	 norm D
,	TokenNameCOMMA	
normS	TokenNameIdentifier	 norm S
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invertState	TokenNameIdentifier	 invert State
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
normD	TokenNameIdentifier	 norm D
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
invertState	TokenNameIdentifier	 invert State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invertState	TokenNameIdentifier	 invert State
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
normS	TokenNameIdentifier	 norm S
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
"yak"	TokenNameStringLiteral	yak
,	TokenNameCOMMA	
invertState	TokenNameIdentifier	 invert State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"f: 6,9: 9<x : i="	TokenNameStringLiteral	f: 6,9: 9<x : i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
normD	TokenNameIdentifier	 norm D
,	TokenNameCOMMA	
normS	TokenNameIdentifier	 norm S
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// steepness 	TokenNameCOMMENT_LINE	steepness 
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
setLengthNormFactors	TokenNameIdentifier	 set Length Norm Factors
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.5f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
setLengthNormFactors	TokenNameIdentifier	 set Length Norm Factors
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.1f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invertState	TokenNameIdentifier	 invert State
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
normSS	TokenNameIdentifier	 norm SS
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
invertState	TokenNameIdentifier	 invert State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
normS	TokenNameIdentifier	 norm S
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
invertState	TokenNameIdentifier	 invert State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"s: i="	TokenNameStringLiteral	s: i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" : a="	TokenNameStringLiteral	 : a=
+	TokenNamePLUS	
normSS	TokenNameIdentifier	 norm SS
+	TokenNamePLUS	
" < b="	TokenNameStringLiteral	 < b=
+	TokenNamePLUS	
normS	TokenNameIdentifier	 norm S
,	TokenNameCOMMA	
normSS	TokenNameIdentifier	 norm SS
<	TokenNameLESS	
normS	TokenNameIdentifier	 norm S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSweetSpotTf	TokenNameIdentifier	 test Sweet Spot Tf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SweetSpotSimilarity	TokenNameIdentifier	 Sweet Spot Similarity
ss	TokenNameIdentifier	 ss
=	TokenNameEQUAL	
new	TokenNamenew	
SweetSpotSimilarity	TokenNameIdentifier	 Sweet Spot Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Similarity	TokenNameIdentifier	 Similarity
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultSimilarity	TokenNameIdentifier	 Default Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Similarity	TokenNameIdentifier	 Similarity
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
;	TokenNameSEMICOLON	
// tf equal 	TokenNameCOMMENT_LINE	tf equal 
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
setBaselineTfFactors	TokenNameIdentifier	 set Baseline Tf Factors
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"tf: i="	TokenNameStringLiteral	tf: i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// tf higher 	TokenNameCOMMENT_LINE	tf higher 
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
setBaselineTfFactors	TokenNameIdentifier	 set Baseline Tf Factors
(	TokenNameLPAREN	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tf: i="	TokenNameStringLiteral	tf: i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" : d="	TokenNameStringLiteral	 : d=
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
" < s="	TokenNameStringLiteral	 < s=
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
<	TokenNameLESS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// tf flat 	TokenNameCOMMENT_LINE	tf flat 
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
setBaselineTfFactors	TokenNameIdentifier	 set Baseline Tf Factors
(	TokenNameLPAREN	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
6.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"tf flat1: i="	TokenNameStringLiteral	tf flat1: i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
setBaselineTfFactors	TokenNameIdentifier	 set Baseline Tf Factors
(	TokenNameLPAREN	
2.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
6.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"tf flat2: i="	TokenNameStringLiteral	tf flat2: i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
2.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tf: i="	TokenNameStringLiteral	tf: i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" : s="	TokenNameStringLiteral	 : s=
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
" < d="	TokenNameStringLiteral	 < d=
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
<	TokenNameLESS	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// stupidity 	TokenNameCOMMENT_LINE	stupidity 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"tf zero"	TokenNameStringLiteral	tf zero
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHyperbolicSweetSpot	TokenNameIdentifier	 test Hyperbolic Sweet Spot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SweetSpotSimilarity	TokenNameIdentifier	 Sweet Spot Similarity
ss	TokenNameIdentifier	 ss
=	TokenNameEQUAL	
new	TokenNamenew	
SweetSpotSimilarity	TokenNameIdentifier	 Sweet Spot Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
int	TokenNameint	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hyperbolicTf	TokenNameIdentifier	 hyperbolic Tf
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
setHyperbolicTfFactors	TokenNameIdentifier	 set Hyperbolic Tf Factors
(	TokenNameLPAREN	
3.3f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
7.7f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
5.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Similarity	TokenNameIdentifier	 Similarity
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"MIN tf: i="	TokenNameStringLiteral	MIN tf: i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" : s="	TokenNameStringLiteral	 : s=
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3.3f	TokenNameFloatingPointLiteral	
<=	TokenNameLESS_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"MAX tf: i="	TokenNameStringLiteral	MAX tf: i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" : s="	TokenNameStringLiteral	 : s=
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
7.7f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"MID tf"	TokenNameStringLiteral	MID tf
,	TokenNameCOMMA	
3.3f	TokenNameFloatingPointLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
7.7f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
3.3f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.00001f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// stupidity 	TokenNameCOMMENT_LINE	stupidity 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"tf zero"	TokenNameStringLiteral	tf zero
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
