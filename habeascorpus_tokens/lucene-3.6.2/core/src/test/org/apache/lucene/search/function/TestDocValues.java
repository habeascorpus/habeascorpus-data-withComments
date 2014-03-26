package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
function	TokenNameIdentifier	 function
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
/** * DocValues TestCase */	TokenNameCOMMENT_JAVADOC	 DocValues TestCase 
public	TokenNamepublic	
class	TokenNameclass	
TestDocValues	TokenNameIdentifier	 Test Doc Values
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testGetMinValue	TokenNameIdentifier	 test Get Min Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
innerArray	TokenNameIdentifier	 inner Array
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
2.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
100.0f	TokenNameFloatingPointLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
DocValuesTestImpl	TokenNameIdentifier	 Doc Values Test Impl
docValues	TokenNameIdentifier	 doc Values
=	TokenNameEQUAL	
new	TokenNamenew	
DocValuesTestImpl	TokenNameIdentifier	 Doc Values Test Impl
(	TokenNameLPAREN	
innerArray	TokenNameIdentifier	 inner Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"-1.0f is the min value in the source array"	TokenNameStringLiteral	-1.0f is the min value in the source array
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
docValues	TokenNameIdentifier	 doc Values
.	TokenNameDOT	
getMinValue	TokenNameIdentifier	 get Min Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test with without values - NaN 	TokenNameCOMMENT_LINE	test with without values - NaN 
innerArray	TokenNameIdentifier	 inner Array
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
docValues	TokenNameIdentifier	 doc Values
=	TokenNameEQUAL	
new	TokenNamenew	
DocValuesTestImpl	TokenNameIdentifier	 Doc Values Test Impl
(	TokenNameLPAREN	
innerArray	TokenNameIdentifier	 inner Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"max is NaN - no values in inner array"	TokenNameStringLiteral	max is NaN - no values in inner array
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
docValues	TokenNameIdentifier	 doc Values
.	TokenNameDOT	
getMinValue	TokenNameIdentifier	 get Min Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testGetMaxValue	TokenNameIdentifier	 test Get Max Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
innerArray	TokenNameIdentifier	 inner Array
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
2.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
10.0f	TokenNameFloatingPointLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
DocValuesTestImpl	TokenNameIdentifier	 Doc Values Test Impl
docValues	TokenNameIdentifier	 doc Values
=	TokenNameEQUAL	
new	TokenNamenew	
DocValuesTestImpl	TokenNameIdentifier	 Doc Values Test Impl
(	TokenNameLPAREN	
innerArray	TokenNameIdentifier	 inner Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"10.0f is the max value in the source array"	TokenNameStringLiteral	10.0f is the max value in the source array
,	TokenNameCOMMA	
10.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
docValues	TokenNameIdentifier	 doc Values
.	TokenNameDOT	
getMaxValue	TokenNameIdentifier	 get Max Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
innerArray	TokenNameIdentifier	 inner Array
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
-	TokenNameMINUS	
3.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
100.0f	TokenNameFloatingPointLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
docValues	TokenNameIdentifier	 doc Values
=	TokenNameEQUAL	
new	TokenNamenew	
DocValuesTestImpl	TokenNameIdentifier	 Doc Values Test Impl
(	TokenNameLPAREN	
innerArray	TokenNameIdentifier	 inner Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"-1.0f is the max value in the source array"	TokenNameStringLiteral	-1.0f is the max value in the source array
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
docValues	TokenNameIdentifier	 doc Values
.	TokenNameDOT	
getMaxValue	TokenNameIdentifier	 get Max Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
innerArray	TokenNameIdentifier	 inner Array
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
-	TokenNameMINUS	
3.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
100.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
docValues	TokenNameIdentifier	 doc Values
=	TokenNameEQUAL	
new	TokenNamenew	
DocValuesTestImpl	TokenNameIdentifier	 Doc Values Test Impl
(	TokenNameLPAREN	
innerArray	TokenNameIdentifier	 inner Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
+	TokenNamePLUS	
" is the max value in the source array"	TokenNameStringLiteral	 is the max value in the source array
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
docValues	TokenNameIdentifier	 doc Values
.	TokenNameDOT	
getMaxValue	TokenNameIdentifier	 get Max Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test with without values - NaN 	TokenNameCOMMENT_LINE	test with without values - NaN 
innerArray	TokenNameIdentifier	 inner Array
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
docValues	TokenNameIdentifier	 doc Values
=	TokenNameEQUAL	
new	TokenNamenew	
DocValuesTestImpl	TokenNameIdentifier	 Doc Values Test Impl
(	TokenNameLPAREN	
innerArray	TokenNameIdentifier	 inner Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"max is NaN - no values in inner array"	TokenNameStringLiteral	max is NaN - no values in inner array
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
docValues	TokenNameIdentifier	 doc Values
.	TokenNameDOT	
getMaxValue	TokenNameIdentifier	 get Max Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testGetAverageValue	TokenNameIdentifier	 test Get Average Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
innerArray	TokenNameIdentifier	 inner Array
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
DocValuesTestImpl	TokenNameIdentifier	 Doc Values Test Impl
docValues	TokenNameIdentifier	 doc Values
=	TokenNameEQUAL	
new	TokenNamenew	
DocValuesTestImpl	TokenNameIdentifier	 Doc Values Test Impl
(	TokenNameLPAREN	
innerArray	TokenNameIdentifier	 inner Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"the average is 1.0f"	TokenNameStringLiteral	the average is 1.0f
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
docValues	TokenNameIdentifier	 doc Values
.	TokenNameDOT	
getAverageValue	TokenNameIdentifier	 get Average Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
innerArray	TokenNameIdentifier	 inner Array
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
2.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
3.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
4.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
5.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
6.0f	TokenNameFloatingPointLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
docValues	TokenNameIdentifier	 doc Values
=	TokenNameEQUAL	
new	TokenNamenew	
DocValuesTestImpl	TokenNameIdentifier	 Doc Values Test Impl
(	TokenNameLPAREN	
innerArray	TokenNameIdentifier	 inner Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"the average is 3.5f"	TokenNameStringLiteral	the average is 3.5f
,	TokenNameCOMMA	
3.5f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
docValues	TokenNameIdentifier	 doc Values
.	TokenNameDOT	
getAverageValue	TokenNameIdentifier	 get Average Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test with negative values 	TokenNameCOMMENT_LINE	test with negative values 
innerArray	TokenNameIdentifier	 inner Array
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
-	TokenNameMINUS	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
2.0f	TokenNameFloatingPointLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
docValues	TokenNameIdentifier	 doc Values
=	TokenNameEQUAL	
new	TokenNamenew	
DocValuesTestImpl	TokenNameIdentifier	 Doc Values Test Impl
(	TokenNameLPAREN	
innerArray	TokenNameIdentifier	 inner Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"the average is 0.5f"	TokenNameStringLiteral	the average is 0.5f
,	TokenNameCOMMA	
0.5f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
docValues	TokenNameIdentifier	 doc Values
.	TokenNameDOT	
getAverageValue	TokenNameIdentifier	 get Average Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test with without values - NaN 	TokenNameCOMMENT_LINE	test with without values - NaN 
innerArray	TokenNameIdentifier	 inner Array
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
docValues	TokenNameIdentifier	 doc Values
=	TokenNameEQUAL	
new	TokenNamenew	
DocValuesTestImpl	TokenNameIdentifier	 Doc Values Test Impl
(	TokenNameLPAREN	
innerArray	TokenNameIdentifier	 inner Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"the average is NaN - no values in inner array"	TokenNameStringLiteral	the average is NaN - no values in inner array
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
docValues	TokenNameIdentifier	 doc Values
.	TokenNameDOT	
getAverageValue	TokenNameIdentifier	 get Average Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
DocValuesTestImpl	TokenNameIdentifier	 Doc Values Test Impl
extends	TokenNameextends	
DocValues	TokenNameIdentifier	 Doc Values
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
innerArray	TokenNameIdentifier	 inner Array
;	TokenNameSEMICOLON	
DocValuesTestImpl	TokenNameIdentifier	 Doc Values Test Impl
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
innerArray	TokenNameIdentifier	 inner Array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
innerArray	TokenNameIdentifier	 inner Array
=	TokenNameEQUAL	
innerArray	TokenNameIdentifier	 inner Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.lucene.search.function.DocValues#floatVal(int) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.lucene.search.function.DocValues#floatVal(int) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
floatVal	TokenNameIdentifier	 float Val
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
innerArray	TokenNameIdentifier	 inner Array
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.lucene.search.function.DocValues#toString(int) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.lucene.search.function.DocValues#toString(int) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
