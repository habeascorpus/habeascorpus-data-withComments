package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
example	TokenNameIdentifier	 example
;	TokenNameSEMICOLON	
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
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
ExampleResult	TokenNameIdentifier	 Example Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
association	TokenNameIdentifier	 association
.	TokenNameDOT	
AssociationMain	TokenNameIdentifier	 Association Main
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Test that the association example works as expected. This test helps to * verify that examples code is alive! */	TokenNameCOMMENT_JAVADOC	 Test that the association example works as expected. This test helps to verify that examples code is alive! 
public	TokenNamepublic	
class	TokenNameclass	
TestAssociationExample	TokenNameIdentifier	 Test Association Example
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EXPECTED_INT_SUM_RESULTS	TokenNameIdentifier	 EXPECTED  INT  SUM  RESULTS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EXPECTED_FLOAT_SUM_RESULTS	TokenNameIdentifier	 EXPECTED  FLOAT  SUM  RESULTS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
1.62	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.34	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testAssociationExamples	TokenNameIdentifier	 test Association Examples
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertExampleResult	TokenNameIdentifier	 assert Example Result
(	TokenNameLPAREN	
new	TokenNamenew	
AssociationMain	TokenNameIdentifier	 Association Main
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
runSumIntAssociationSample	TokenNameIdentifier	 run Sum Int Association Sample
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
EXPECTED_INT_SUM_RESULTS	TokenNameIdentifier	 EXPECTED  INT  SUM  RESULTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExampleResult	TokenNameIdentifier	 assert Example Result
(	TokenNameLPAREN	
new	TokenNamenew	
AssociationMain	TokenNameIdentifier	 Association Main
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
runSumFloatAssociationSample	TokenNameIdentifier	 run Sum Float Association Sample
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
EXPECTED_FLOAT_SUM_RESULTS	TokenNameIdentifier	 EXPECTED  FLOAT  SUM  RESULTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertExampleResult	TokenNameIdentifier	 assert Example Result
(	TokenNameLPAREN	
ExampleResult	TokenNameIdentifier	 Example Result
res	TokenNameIdentifier	 res
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectedResults	TokenNameIdentifier	 expected Results
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Null result!"	TokenNameStringLiteral	Null result!
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Null facet result!"	TokenNameStringLiteral	Null facet result!
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getFacetResults	TokenNameIdentifier	 get Facet Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong number of results!"	TokenNameStringLiteral	Wrong number of results!
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getFacetResults	TokenNameIdentifier	 get Facet Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong number of facets!"	TokenNameStringLiteral	Wrong number of facets!
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getFacetResults	TokenNameIdentifier	 get Facet Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNumValidDescendants	TokenNameIdentifier	 get Num Valid Descendants
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getFacetResults	TokenNameIdentifier	 get Facet Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSubResults	TokenNameIdentifier	 get Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
fResNode	TokenNameIdentifier	 f Res Node
:	TokenNameCOLON	
it	TokenNameIdentifier	 it
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong result for facet "	TokenNameStringLiteral	Wrong result for facet 
+	TokenNamePLUS	
fResNode	TokenNameIdentifier	 f Res Node
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
expectedResults	TokenNameIdentifier	 expected Results
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
fResNode	TokenNameIdentifier	 f Res Node
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1E-5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
