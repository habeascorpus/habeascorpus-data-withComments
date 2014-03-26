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
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
QueryParser	TokenNameIdentifier	 Query Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
BeforeClass	TokenNameIdentifier	 Before Class
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
IndexReader	TokenNameIdentifier	 Index Reader
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
Term	TokenNameIdentifier	 Term
;	TokenNameSEMICOLON	
/** * Test CustomScoreQuery search. */	TokenNameCOMMENT_JAVADOC	 Test CustomScoreQuery search. 
public	TokenNamepublic	
class	TokenNameclass	
TestCustomScoreQuery	TokenNameIdentifier	 Test Custom Score Query
extends	TokenNameextends	
FunctionTestSetup	TokenNameIdentifier	 Function Test Setup
{	TokenNameLBRACE	
@	TokenNameAT	
BeforeClass	TokenNameIdentifier	 Before Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
beforeClass	TokenNameIdentifier	 before Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that CustomScoreQuery of Type.BYTE returns the expected scores. */	TokenNameCOMMENT_JAVADOC	 Test that CustomScoreQuery of Type.BYTE returns the expected scores. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCustomScoreByte	TokenNameIdentifier	 test Custom Score Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
// INT field values are small enough to be parsed as byte 	TokenNameCOMMENT_LINE	INT field values are small enough to be parsed as byte 
doTestCustomScore	TokenNameIdentifier	 do Test Custom Score
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
BYTE	TokenNameIdentifier	 BYTE
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doTestCustomScore	TokenNameIdentifier	 do Test Custom Score
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
BYTE	TokenNameIdentifier	 BYTE
,	TokenNameCOMMA	
2.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that CustomScoreQuery of Type.SHORT returns the expected scores. */	TokenNameCOMMENT_JAVADOC	 Test that CustomScoreQuery of Type.SHORT returns the expected scores. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCustomScoreShort	TokenNameIdentifier	 test Custom Score Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
// INT field values are small enough to be parsed as short 	TokenNameCOMMENT_LINE	INT field values are small enough to be parsed as short 
doTestCustomScore	TokenNameIdentifier	 do Test Custom Score
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SHORT	TokenNameIdentifier	 SHORT
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doTestCustomScore	TokenNameIdentifier	 do Test Custom Score
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SHORT	TokenNameIdentifier	 SHORT
,	TokenNameCOMMA	
3.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that CustomScoreQuery of Type.INT returns the expected scores. */	TokenNameCOMMENT_JAVADOC	 Test that CustomScoreQuery of Type.INT returns the expected scores. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCustomScoreInt	TokenNameIdentifier	 test Custom Score Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
doTestCustomScore	TokenNameIdentifier	 do Test Custom Score
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doTestCustomScore	TokenNameIdentifier	 do Test Custom Score
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
,	TokenNameCOMMA	
4.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that CustomScoreQuery of Type.FLOAT returns the expected scores. */	TokenNameCOMMENT_JAVADOC	 Test that CustomScoreQuery of Type.FLOAT returns the expected scores. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCustomScoreFloat	TokenNameIdentifier	 test Custom Score Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
// INT field can be parsed as float 	TokenNameCOMMENT_LINE	INT field can be parsed as float 
doTestCustomScore	TokenNameIdentifier	 do Test Custom Score
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doTestCustomScore	TokenNameIdentifier	 do Test Custom Score
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
,	TokenNameCOMMA	
5.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same values, but in float format 	TokenNameCOMMENT_LINE	same values, but in float format 
doTestCustomScore	TokenNameIdentifier	 do Test Custom Score
(	TokenNameLPAREN	
FLOAT_FIELD	TokenNameIdentifier	 FLOAT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doTestCustomScore	TokenNameIdentifier	 do Test Custom Score
(	TokenNameLPAREN	
FLOAT_FIELD	TokenNameIdentifier	 FLOAT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
,	TokenNameCOMMA	
6.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// must have static class otherwise serialization tests fail 	TokenNameCOMMENT_LINE	must have static class otherwise serialization tests fail 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
CustomAddQuery	TokenNameIdentifier	 Custom Add Query
extends	TokenNameextends	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
{	TokenNameLBRACE	
// constructor 	TokenNameCOMMENT_LINE	constructor 
CustomAddQuery	TokenNameIdentifier	 Custom Add Query
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
qValSrc	TokenNameIdentifier	 q Val Src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
qValSrc	TokenNameIdentifier	 q Val Src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.function.CustomScoreQuery#name() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.function.CustomScoreQuery#name() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"customAdd"	TokenNameStringLiteral	customAdd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
CustomScoreProvider	TokenNameIdentifier	 Custom Score Provider
getCustomScoreProvider	TokenNameIdentifier	 get Custom Score Provider
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CustomScoreProvider	TokenNameIdentifier	 Custom Score Provider
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
customScore	TokenNameIdentifier	 custom Score
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
subQueryScore	TokenNameIdentifier	 sub Query Score
,	TokenNameCOMMA	
float	TokenNamefloat	
valSrcScore	TokenNameIdentifier	 val Src Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subQueryScore	TokenNameIdentifier	 sub Query Score
+	TokenNamePLUS	
valSrcScore	TokenNameIdentifier	 val Src Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
customExplain	TokenNameIdentifier	 custom Explain
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
Explanation	TokenNameIdentifier	 Explanation
subQueryExpl	TokenNameIdentifier	 sub Query Expl
,	TokenNameCOMMA	
Explanation	TokenNameIdentifier	 Explanation
valSrcExpl	TokenNameIdentifier	 val Src Expl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
valSrcScore	TokenNameIdentifier	 val Src Score
=	TokenNameEQUAL	
valSrcExpl	TokenNameIdentifier	 val Src Expl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
valSrcExpl	TokenNameIdentifier	 val Src Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
valSrcScore	TokenNameIdentifier	 val Src Score
+	TokenNamePLUS	
subQueryExpl	TokenNameIdentifier	 sub Query Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"custom score: sum of:"	TokenNameStringLiteral	custom score: sum of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
subQueryExpl	TokenNameIdentifier	 sub Query Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
valSrcExpl	TokenNameIdentifier	 val Src Expl
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
valSrcExpl	TokenNameIdentifier	 val Src Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// must have static class otherwise serialization tests fail 	TokenNameCOMMENT_LINE	must have static class otherwise serialization tests fail 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
CustomMulAddQuery	TokenNameIdentifier	 Custom Mul Add Query
extends	TokenNameextends	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
{	TokenNameLBRACE	
// constructor 	TokenNameCOMMENT_LINE	constructor 
CustomMulAddQuery	TokenNameIdentifier	 Custom Mul Add Query
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
qValSrc1	TokenNameIdentifier	 q Val Src1
,	TokenNameCOMMA	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
qValSrc2	TokenNameIdentifier	 q Val Src2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
qValSrc1	TokenNameIdentifier	 q Val Src1
,	TokenNameCOMMA	
qValSrc2	TokenNameIdentifier	 q Val Src2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.function.CustomScoreQuery#name() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.function.CustomScoreQuery#name() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"customMulAdd"	TokenNameStringLiteral	customMulAdd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
CustomScoreProvider	TokenNameIdentifier	 Custom Score Provider
getCustomScoreProvider	TokenNameIdentifier	 get Custom Score Provider
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CustomScoreProvider	TokenNameIdentifier	 Custom Score Provider
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
customScore	TokenNameIdentifier	 custom Score
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
subQueryScore	TokenNameIdentifier	 sub Query Score
,	TokenNameCOMMA	
float	TokenNamefloat	
valSrcScores	TokenNameIdentifier	 val Src Scores
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
valSrcScores	TokenNameIdentifier	 val Src Scores
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subQueryScore	TokenNameIdentifier	 sub Query Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
valSrcScores	TokenNameIdentifier	 val Src Scores
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subQueryScore	TokenNameIdentifier	 sub Query Score
+	TokenNamePLUS	
valSrcScores	TokenNameIdentifier	 val Src Scores
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// confirm that skipping beyond the last doc, on the 	TokenNameCOMMENT_LINE	confirm that skipping beyond the last doc, on the 
// previous reader, hits NO_MORE_DOCS 	TokenNameCOMMENT_LINE	previous reader, hits NO_MORE_DOCS 
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
subQueryScore	TokenNameIdentifier	 sub Query Score
+	TokenNamePLUS	
valSrcScores	TokenNameIdentifier	 val Src Scores
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
valSrcScores	TokenNameIdentifier	 val Src Scores
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// we know there are two 	TokenNameCOMMENT_LINE	we know there are two 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
customExplain	TokenNameIdentifier	 custom Explain
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
Explanation	TokenNameIdentifier	 Explanation
subQueryExpl	TokenNameIdentifier	 sub Query Expl
,	TokenNameCOMMA	
Explanation	TokenNameIdentifier	 Explanation
valSrcExpls	TokenNameIdentifier	 val Src Expls
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
valSrcExpls	TokenNameIdentifier	 val Src Expls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subQueryExpl	TokenNameIdentifier	 sub Query Expl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Explanation	TokenNameIdentifier	 Explanation
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
valSrcExpls	TokenNameIdentifier	 val Src Expls
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
subQueryExpl	TokenNameIdentifier	 sub Query Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"sum of:"	TokenNameStringLiteral	sum of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
subQueryExpl	TokenNameIdentifier	 sub Query Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
valSrcExpls	TokenNameIdentifier	 val Src Expls
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
valSrcExpls	TokenNameIdentifier	 val Src Expls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
"CustomMulAdd, sum of:"	TokenNameStringLiteral	CustomMulAdd, sum of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Explanation	TokenNameIdentifier	 Explanation
exp2	TokenNameIdentifier	 exp2
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
valSrcExpls	TokenNameIdentifier	 val Src Expls
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"custom score: product of:"	TokenNameStringLiteral	custom score: product of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exp2	TokenNameIdentifier	 exp2
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
valSrcExpls	TokenNameIdentifier	 val Src Expls
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exp2	TokenNameIdentifier	 exp2
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
exp2	TokenNameIdentifier	 exp2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
class	TokenNameclass	
CustomExternalQuery	TokenNameIdentifier	 Custom External Query
extends	TokenNameextends	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
CustomScoreProvider	TokenNameIdentifier	 Custom Score Provider
getCustomScoreProvider	TokenNameIdentifier	 get Custom Score Provider
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getInts	TokenNameIdentifier	 get Ints
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CustomScoreProvider	TokenNameIdentifier	 Custom Score Provider
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
customScore	TokenNameIdentifier	 custom Score
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
subScore	TokenNameIdentifier	 sub Score
,	TokenNameCOMMA	
float	TokenNamefloat	
valSrcScore	TokenNameIdentifier	 val Src Score
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
<=	TokenNameLESS_EQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CustomExternalQuery	TokenNameIdentifier	 Custom External Query
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCustomExternalQuery	TokenNameIdentifier	 test Custom External Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
QueryParser	TokenNameIdentifier	 Query Parser
qp	TokenNameIdentifier	 qp
=	TokenNameEQUAL	
new	TokenNamenew	
QueryParser	TokenNameIdentifier	 Query Parser
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
TEXT_FIELD	TokenNameIdentifier	 TEXT  FIELD
,	TokenNameCOMMA	
anlzr	TokenNameIdentifier	 anlzr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
qtxt	TokenNameIdentifier	 qtxt
=	TokenNameEQUAL	
"first aid text"	TokenNameStringLiteral	first aid text
;	TokenNameSEMICOLON	
// from the doc texts in FunctionQuerySetup. 	TokenNameCOMMENT_LINE	from the doc texts in FunctionQuerySetup. 
Query	TokenNameIdentifier	 Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
qtxt	TokenNameIdentifier	 qtxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
CustomExternalQuery	TokenNameIdentifier	 Custom External Query
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TopDocs	TokenNameIdentifier	 Top Docs
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
N_DOCS	TokenNameIdentifier	 N  DOCS
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
N_DOCS	TokenNameIdentifier	 N  DOCS
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"doc="	TokenNameStringLiteral	doc=
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
N_DOCS	TokenNameIdentifier	 N  DOCS
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
0.0001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRewrite	TokenNameIdentifier	 test Rewrite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
TEXT_FIELD	TokenNameIdentifier	 TEXT  FIELD
,	TokenNameCOMMA	
"first"	TokenNameStringLiteral	first
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
original	TokenNameIdentifier	 original
=	TokenNameEQUAL	
new	TokenNamenew	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
rewritten	TokenNameIdentifier	 rewritten
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
)	TokenNameRPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"rewritten query should be identical, as TermQuery does not rewrite"	TokenNameStringLiteral	rewritten query should be identical, as TermQuery does not rewrite
,	TokenNameCOMMA	
original	TokenNameIdentifier	 original
==	TokenNameEQUAL_EQUAL	
rewritten	TokenNameIdentifier	 rewritten
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"no hits for query"	TokenNameStringLiteral	no hits for query
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
rewritten	TokenNameIdentifier	 rewritten
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
rewritten	TokenNameIdentifier	 rewritten
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
TermRangeQuery	TokenNameIdentifier	 Term Range Query
(	TokenNameLPAREN	
TEXT_FIELD	TokenNameIdentifier	 TEXT  FIELD
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// everything 	TokenNameCOMMENT_LINE	everything 
original	TokenNameIdentifier	 original
=	TokenNameEQUAL	
new	TokenNamenew	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rewritten	TokenNameIdentifier	 rewritten
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
)	TokenNameRPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"rewritten query should not be identical, as TermRangeQuery rewrites"	TokenNameStringLiteral	rewritten query should not be identical, as TermRangeQuery rewrites
,	TokenNameCOMMA	
original	TokenNameIdentifier	 original
!=	TokenNameNOT_EQUAL	
rewritten	TokenNameIdentifier	 rewritten
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"no hits for query"	TokenNameStringLiteral	no hits for query
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
rewritten	TokenNameIdentifier	 rewritten
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
rewritten	TokenNameIdentifier	 rewritten
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Test that FieldScoreQuery returns docs with expected score. 	TokenNameCOMMENT_LINE	Test that FieldScoreQuery returns docs with expected score. 
private	TokenNameprivate	
void	TokenNamevoid	
doTestCustomScore	TokenNameIdentifier	 do Test Custom Score
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
tp	TokenNameIdentifier	 tp
,	TokenNameCOMMA	
double	TokenNamedouble	
dboost	TokenNameIdentifier	 dboost
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
dboost	TokenNameIdentifier	 dboost
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
qValSrc	TokenNameIdentifier	 q Val Src
=	TokenNameEQUAL	
new	TokenNamenew	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
tp	TokenNameIdentifier	 tp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a query that would score by the field 	TokenNameCOMMENT_LINE	a query that would score by the field 
QueryParser	TokenNameIdentifier	 Query Parser
qp	TokenNameIdentifier	 qp
=	TokenNameEQUAL	
new	TokenNamenew	
QueryParser	TokenNameIdentifier	 Query Parser
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
TEXT_FIELD	TokenNameIdentifier	 TEXT  FIELD
,	TokenNameCOMMA	
anlzr	TokenNameIdentifier	 anlzr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
qtxt	TokenNameIdentifier	 qtxt
=	TokenNameEQUAL	
"first aid text"	TokenNameStringLiteral	first aid text
;	TokenNameSEMICOLON	
// from the doc texts in FunctionQuerySetup. 	TokenNameCOMMENT_LINE	from the doc texts in FunctionQuerySetup. 
// regular (boolean) query. 	TokenNameCOMMENT_LINE	regular (boolean) query. 
Query	TokenNameIdentifier	 Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
qtxt	TokenNameIdentifier	 qtxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// custom query, that should score the same as q1. 	TokenNameCOMMENT_LINE	custom query, that should score the same as q1. 
Query	TokenNameIdentifier	 Query
q2CustomNeutral	TokenNameIdentifier	 q2 Custom Neutral
=	TokenNameEQUAL	
new	TokenNamenew	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2CustomNeutral	TokenNameIdentifier	 q2 Custom Neutral
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
q2CustomNeutral	TokenNameIdentifier	 q2 Custom Neutral
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// custom query, that should (by default) multiply the scores of q1 by that of the field 	TokenNameCOMMENT_LINE	custom query, that should (by default) multiply the scores of q1 by that of the field 
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
q3CustomMul	TokenNameIdentifier	 q3 Custom Mul
=	TokenNameEQUAL	
new	TokenNamenew	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
qValSrc	TokenNameIdentifier	 q Val Src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q3CustomMul	TokenNameIdentifier	 q3 Custom Mul
.	TokenNameDOT	
setStrict	TokenNameIdentifier	 set Strict
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q3CustomMul	TokenNameIdentifier	 q3 Custom Mul
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
q3CustomMul	TokenNameIdentifier	 q3 Custom Mul
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// custom query, that should add the scores of q1 to that of the field 	TokenNameCOMMENT_LINE	custom query, that should add the scores of q1 to that of the field 
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
q4CustomAdd	TokenNameIdentifier	 q4 Custom Add
=	TokenNameEQUAL	
new	TokenNamenew	
CustomAddQuery	TokenNameIdentifier	 Custom Add Query
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
qValSrc	TokenNameIdentifier	 q Val Src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q4CustomAdd	TokenNameIdentifier	 q4 Custom Add
.	TokenNameDOT	
setStrict	TokenNameIdentifier	 set Strict
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q4CustomAdd	TokenNameIdentifier	 q4 Custom Add
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
q4CustomAdd	TokenNameIdentifier	 q4 Custom Add
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// custom query, that multiplies and adds the field score to that of q1 	TokenNameCOMMENT_LINE	custom query, that multiplies and adds the field score to that of q1 
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
q5CustomMulAdd	TokenNameIdentifier	 q5 Custom Mul Add
=	TokenNameEQUAL	
new	TokenNamenew	
CustomMulAddQuery	TokenNameIdentifier	 Custom Mul Add Query
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
qValSrc	TokenNameIdentifier	 q Val Src
,	TokenNameCOMMA	
qValSrc	TokenNameIdentifier	 q Val Src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q5CustomMulAdd	TokenNameIdentifier	 q5 Custom Mul Add
.	TokenNameDOT	
setStrict	TokenNameIdentifier	 set Strict
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q5CustomMulAdd	TokenNameIdentifier	 q5 Custom Mul Add
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
q5CustomMulAdd	TokenNameIdentifier	 q5 Custom Mul Add
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// do al the searches 	TokenNameCOMMENT_LINE	do al the searches 
TopDocs	TokenNameIdentifier	 Top Docs
td1	TokenNameIdentifier	 td1
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TopDocs	TokenNameIdentifier	 Top Docs
td2CustomNeutral	TokenNameIdentifier	 td2 Custom Neutral
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q2CustomNeutral	TokenNameIdentifier	 q2 Custom Neutral
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TopDocs	TokenNameIdentifier	 Top Docs
td3CustomMul	TokenNameIdentifier	 td3 Custom Mul
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q3CustomMul	TokenNameIdentifier	 q3 Custom Mul
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TopDocs	TokenNameIdentifier	 Top Docs
td4CustomAdd	TokenNameIdentifier	 td4 Custom Add
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q4CustomAdd	TokenNameIdentifier	 q4 Custom Add
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TopDocs	TokenNameIdentifier	 Top Docs
td5CustomMulAdd	TokenNameIdentifier	 td5 Custom Mul Add
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q5CustomMulAdd	TokenNameIdentifier	 q5 Custom Mul Add
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// put results in map so we can verify the scores although they have changed 	TokenNameCOMMENT_LINE	put results in map so we can verify the scores although they have changed 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
h1	TokenNameIdentifier	 h1
=	TokenNameEQUAL	
topDocsToMap	TokenNameIdentifier	 top Docs To Map
(	TokenNameLPAREN	
td1	TokenNameIdentifier	 td1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
h2CustomNeutral	TokenNameIdentifier	 h2 Custom Neutral
=	TokenNameEQUAL	
topDocsToMap	TokenNameIdentifier	 top Docs To Map
(	TokenNameLPAREN	
td2CustomNeutral	TokenNameIdentifier	 td2 Custom Neutral
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
h3CustomMul	TokenNameIdentifier	 h3 Custom Mul
=	TokenNameEQUAL	
topDocsToMap	TokenNameIdentifier	 top Docs To Map
(	TokenNameLPAREN	
td3CustomMul	TokenNameIdentifier	 td3 Custom Mul
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
h4CustomAdd	TokenNameIdentifier	 h4 Custom Add
=	TokenNameEQUAL	
topDocsToMap	TokenNameIdentifier	 top Docs To Map
(	TokenNameLPAREN	
td4CustomAdd	TokenNameIdentifier	 td4 Custom Add
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
h5CustomMulAdd	TokenNameIdentifier	 h5 Custom Mul Add
=	TokenNameEQUAL	
topDocsToMap	TokenNameIdentifier	 top Docs To Map
(	TokenNameLPAREN	
td5CustomMulAdd	TokenNameIdentifier	 td5 Custom Mul Add
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
verifyResults	TokenNameIdentifier	 verify Results
(	TokenNameLPAREN	
boost	TokenNameIdentifier	 boost
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
h1	TokenNameIdentifier	 h1
,	TokenNameCOMMA	
h2CustomNeutral	TokenNameIdentifier	 h2 Custom Neutral
,	TokenNameCOMMA	
h3CustomMul	TokenNameIdentifier	 h3 Custom Mul
,	TokenNameCOMMA	
h4CustomAdd	TokenNameIdentifier	 h4 Custom Add
,	TokenNameCOMMA	
h5CustomMulAdd	TokenNameIdentifier	 h5 Custom Mul Add
,	TokenNameCOMMA	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
q2CustomNeutral	TokenNameIdentifier	 q2 Custom Neutral
,	TokenNameCOMMA	
q3CustomMul	TokenNameIdentifier	 q3 Custom Mul
,	TokenNameCOMMA	
q4CustomAdd	TokenNameIdentifier	 q4 Custom Add
,	TokenNameCOMMA	
q5CustomMulAdd	TokenNameIdentifier	 q5 Custom Mul Add
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// verify results are as expected. 	TokenNameCOMMENT_LINE	verify results are as expected. 
private	TokenNameprivate	
void	TokenNamevoid	
verifyResults	TokenNameIdentifier	 verify Results
(	TokenNameLPAREN	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
,	TokenNameCOMMA	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
h1	TokenNameIdentifier	 h1
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
h2customNeutral	TokenNameIdentifier	 h2custom Neutral
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
h3CustomMul	TokenNameIdentifier	 h3 Custom Mul
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
h4CustomAdd	TokenNameIdentifier	 h4 Custom Add
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
h5CustomMulAdd	TokenNameIdentifier	 h5 Custom Mul Add
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
q2	TokenNameIdentifier	 q2
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
q3	TokenNameIdentifier	 q3
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
q4	TokenNameIdentifier	 q4
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
q5	TokenNameIdentifier	 q5
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// verify numbers of matches 	TokenNameCOMMENT_LINE	verify numbers of matches 
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"#hits = "	TokenNameStringLiteral	#hits = 
+	TokenNamePLUS	
h1	TokenNameIdentifier	 h1
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"queries should have same #hits"	TokenNameStringLiteral	queries should have same #hits
,	TokenNameCOMMA	
h1	TokenNameIdentifier	 h1
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
h2customNeutral	TokenNameIdentifier	 h2custom Neutral
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"queries should have same #hits"	TokenNameStringLiteral	queries should have same #hits
,	TokenNameCOMMA	
h1	TokenNameIdentifier	 h1
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
h3CustomMul	TokenNameIdentifier	 h3 Custom Mul
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"queries should have same #hits"	TokenNameStringLiteral	queries should have same #hits
,	TokenNameCOMMA	
h1	TokenNameIdentifier	 h1
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
h4CustomAdd	TokenNameIdentifier	 h4 Custom Add
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"queries should have same #hits"	TokenNameStringLiteral	queries should have same #hits
,	TokenNameCOMMA	
h1	TokenNameIdentifier	 h1
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
h5CustomMulAdd	TokenNameIdentifier	 h5 Custom Mul Add
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
rarely	TokenNameIdentifier	 rarely
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
rarely	TokenNameIdentifier	 rarely
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q3	TokenNameIdentifier	 q3
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
rarely	TokenNameIdentifier	 rarely
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q4	TokenNameIdentifier	 q4
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
rarely	TokenNameIdentifier	 rarely
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q5	TokenNameIdentifier	 q5
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
rarely	TokenNameIdentifier	 rarely
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// verify scores ratios 	TokenNameCOMMENT_LINE	verify scores ratios 
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
doc	TokenNameIdentifier	 doc
:	TokenNameCOLON	
h1	TokenNameIdentifier	 h1
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"doc = "	TokenNameStringLiteral	doc = 
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
fieldScore	TokenNameIdentifier	 field Score
=	TokenNameEQUAL	
expectedFieldScore	TokenNameIdentifier	 expected Field Score
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ID_FIELD	TokenNameIdentifier	 ID  FIELD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"fieldScore = "	TokenNameStringLiteral	fieldScore = 
+	TokenNamePLUS	
fieldScore	TokenNameIdentifier	 field Score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"fieldScore should not be 0"	TokenNameStringLiteral	fieldScore should not be 0
,	TokenNameCOMMA	
fieldScore	TokenNameIdentifier	 field Score
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score1	TokenNameIdentifier	 score1
=	TokenNameEQUAL	
h1	TokenNameIdentifier	 h1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logResult	TokenNameIdentifier	 log Result
(	TokenNameLPAREN	
"score1="	TokenNameStringLiteral	score1=
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score1	TokenNameIdentifier	 score1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score2	TokenNameIdentifier	 score2
=	TokenNameEQUAL	
h2customNeutral	TokenNameIdentifier	 h2custom Neutral
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logResult	TokenNameIdentifier	 log Result
(	TokenNameLPAREN	
"score2="	TokenNameStringLiteral	score2=
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score2	TokenNameIdentifier	 score2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"same score (just boosted) for neutral"	TokenNameStringLiteral	same score (just boosted) for neutral
,	TokenNameCOMMA	
boost	TokenNameIdentifier	 boost
*	TokenNameMULTIPLY	
score1	TokenNameIdentifier	 score1
,	TokenNameCOMMA	
score2	TokenNameIdentifier	 score2
,	TokenNameCOMMA	
TEST_SCORE_TOLERANCE_DELTA	TokenNameIdentifier	 TEST  SCORE  TOLERANCE  DELTA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score3	TokenNameIdentifier	 score3
=	TokenNameEQUAL	
h3CustomMul	TokenNameIdentifier	 h3 Custom Mul
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logResult	TokenNameIdentifier	 log Result
(	TokenNameLPAREN	
"score3="	TokenNameStringLiteral	score3=
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
q3	TokenNameIdentifier	 q3
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score3	TokenNameIdentifier	 score3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"new score for custom mul"	TokenNameStringLiteral	new score for custom mul
,	TokenNameCOMMA	
boost	TokenNameIdentifier	 boost
*	TokenNameMULTIPLY	
fieldScore	TokenNameIdentifier	 field Score
*	TokenNameMULTIPLY	
score1	TokenNameIdentifier	 score1
,	TokenNameCOMMA	
score3	TokenNameIdentifier	 score3
,	TokenNameCOMMA	
TEST_SCORE_TOLERANCE_DELTA	TokenNameIdentifier	 TEST  SCORE  TOLERANCE  DELTA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score4	TokenNameIdentifier	 score4
=	TokenNameEQUAL	
h4CustomAdd	TokenNameIdentifier	 h4 Custom Add
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logResult	TokenNameIdentifier	 log Result
(	TokenNameLPAREN	
"score4="	TokenNameStringLiteral	score4=
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
q4	TokenNameIdentifier	 q4
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score4	TokenNameIdentifier	 score4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"new score for custom add"	TokenNameStringLiteral	new score for custom add
,	TokenNameCOMMA	
boost	TokenNameIdentifier	 boost
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
fieldScore	TokenNameIdentifier	 field Score
+	TokenNamePLUS	
score1	TokenNameIdentifier	 score1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
score4	TokenNameIdentifier	 score4
,	TokenNameCOMMA	
TEST_SCORE_TOLERANCE_DELTA	TokenNameIdentifier	 TEST  SCORE  TOLERANCE  DELTA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score5	TokenNameIdentifier	 score5
=	TokenNameEQUAL	
h5CustomMulAdd	TokenNameIdentifier	 h5 Custom Mul Add
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logResult	TokenNameIdentifier	 log Result
(	TokenNameLPAREN	
"score5="	TokenNameStringLiteral	score5=
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
q5	TokenNameIdentifier	 q5
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score5	TokenNameIdentifier	 score5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"new score for custom mul add"	TokenNameStringLiteral	new score for custom mul add
,	TokenNameCOMMA	
boost	TokenNameIdentifier	 boost
*	TokenNameMULTIPLY	
fieldScore	TokenNameIdentifier	 field Score
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
score1	TokenNameIdentifier	 score1
+	TokenNamePLUS	
fieldScore	TokenNameIdentifier	 field Score
)	TokenNameRPAREN	
,	TokenNameCOMMA	
score5	TokenNameIdentifier	 score5
,	TokenNameCOMMA	
TEST_SCORE_TOLERANCE_DELTA	TokenNameIdentifier	 TEST  SCORE  TOLERANCE  DELTA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
logResult	TokenNameIdentifier	 log Result
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Searcher	TokenNameIdentifier	 Searcher
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
score1	TokenNameIdentifier	 score1
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
score1	TokenNameIdentifier	 score1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Explain by: "	TokenNameStringLiteral	Explain by: 
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// since custom scoring modifies the order of docs, map results 	TokenNameCOMMENT_LINE	since custom scoring modifies the order of docs, map results 
// by doc ids so that we can later compare/verify them 	TokenNameCOMMENT_LINE	by doc ids so that we can later compare/verify them 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
topDocsToMap	TokenNameIdentifier	 top Docs To Map
(	TokenNameLPAREN	
TopDocs	TokenNameIdentifier	 Top Docs
td	TokenNameIdentifier	 td
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
