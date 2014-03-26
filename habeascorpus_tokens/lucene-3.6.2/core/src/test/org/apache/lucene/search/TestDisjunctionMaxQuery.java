package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
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
FieldInvertState	TokenNameIdentifier	 Field Invert State
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
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormat	TokenNameIdentifier	 Decimal Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Test of the DisjunctionMaxQuery. * */	TokenNameCOMMENT_JAVADOC	 Test of the DisjunctionMaxQuery. 
public	TokenNamepublic	
class	TokenNameclass	
TestDisjunctionMaxQuery	TokenNameIdentifier	 Test Disjunction Max Query
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
/** threshold for comparing floats */	TokenNameCOMMENT_JAVADOC	 threshold for comparing floats 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
SCORE_COMP_THRESH	TokenNameIdentifier	 SCORE  COMP  THRESH
=	TokenNameEQUAL	
0.0000f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
/** * Similarity to eliminate tf, idf and lengthNorm effects to isolate test * case. * * <p> * same as TestRankingSimilarity in TestRanking.zip from * http://issues.apache.org/jira/browse/LUCENE-323 * </p> */	TokenNameCOMMENT_JAVADOC	 Similarity to eliminate tf, idf and lengthNorm effects to isolate test case. * <p> same as TestRankingSimilarity in TestRanking.zip from http://issues.apache.org/jira/browse/LUCENE-323 </p> 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
TestSimilarity	TokenNameIdentifier	 Test Similarity
extends	TokenNameextends	
DefaultSimilarity	TokenNameIdentifier	 Default Similarity
{	TokenNameLBRACE	
public	TokenNamepublic	
TestSimilarity	TokenNameIdentifier	 Test Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
>	TokenNameGREATER	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
FieldInvertState	TokenNameIdentifier	 Field Invert State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Disable length norm 	TokenNameCOMMENT_LINE	Disable length norm 
return	TokenNamereturn	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
idf	TokenNameIdentifier	 idf
(	TokenNameLPAREN	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
,	TokenNameCOMMA	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Similarity	TokenNameIdentifier	 Similarity
sim	TokenNameIdentifier	 sim
=	TokenNameEQUAL	
new	TokenNamenew	
TestSimilarity	TokenNameIdentifier	 Test Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Directory	TokenNameIdentifier	 Directory
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
public	TokenNamepublic	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
public	TokenNamepublic	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setSimilarity	TokenNameIdentifier	 set Similarity
(	TokenNameLPAREN	
sim	TokenNameIdentifier	 sim
)	TokenNameRPAREN	
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
newLogMergePolicy	TokenNameIdentifier	 new Log Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hed is the most important field, dek is secondary 	TokenNameCOMMENT_LINE	hed is the most important field, dek is secondary 
// d1 is an "ok" match for: albino elephant 	TokenNameCOMMENT_LINE	d1 is an "ok" match for: albino elephant 
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d1	TokenNameIdentifier	 d1
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d1	TokenNameIdentifier	 d1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"d1"	TokenNameStringLiteral	d1
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Field.Keyword("id", 	TokenNameCOMMENT_LINE	Field.Keyword("id", 
// "d1")); 	TokenNameCOMMENT_LINE	"d1")); 
d1	TokenNameIdentifier	 d1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Field.Text("hed", "elephant")); 	TokenNameCOMMENT_LINE	Field.Text("hed", "elephant")); 
d1	TokenNameIdentifier	 d1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Field.Text("dek", "elephant")); 	TokenNameCOMMENT_LINE	Field.Text("dek", "elephant")); 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
d1	TokenNameIdentifier	 d1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// d2 is a "good" match for: albino elephant 	TokenNameCOMMENT_LINE	d2 is a "good" match for: albino elephant 
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d2	TokenNameIdentifier	 d2
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d2	TokenNameIdentifier	 d2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"d2"	TokenNameStringLiteral	d2
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Field.Keyword("id", 	TokenNameCOMMENT_LINE	Field.Keyword("id", 
// "d2")); 	TokenNameCOMMENT_LINE	"d2")); 
d2	TokenNameIdentifier	 d2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Field.Text("hed", "elephant")); 	TokenNameCOMMENT_LINE	Field.Text("hed", "elephant")); 
d2	TokenNameIdentifier	 d2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Field.Text("dek", 	TokenNameCOMMENT_LINE	Field.Text("dek", 
// "albino")); 	TokenNameCOMMENT_LINE	"albino")); 
d2	TokenNameIdentifier	 d2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Field.Text("dek", "elephant")); 	TokenNameCOMMENT_LINE	Field.Text("dek", "elephant")); 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
d2	TokenNameIdentifier	 d2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// d3 is a "better" match for: albino elephant 	TokenNameCOMMENT_LINE	d3 is a "better" match for: albino elephant 
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d3	TokenNameIdentifier	 d3
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d3	TokenNameIdentifier	 d3
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"d3"	TokenNameStringLiteral	d3
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Field.Keyword("id", 	TokenNameCOMMENT_LINE	Field.Keyword("id", 
// "d3")); 	TokenNameCOMMENT_LINE	"d3")); 
d3	TokenNameIdentifier	 d3
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Field.Text("hed", 	TokenNameCOMMENT_LINE	Field.Text("hed", 
// "albino")); 	TokenNameCOMMENT_LINE	"albino")); 
d3	TokenNameIdentifier	 d3
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Field.Text("hed", "elephant")); 	TokenNameCOMMENT_LINE	Field.Text("hed", "elephant")); 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
d3	TokenNameIdentifier	 d3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// d4 is the "best" match for: albino elephant 	TokenNameCOMMENT_LINE	d4 is the "best" match for: albino elephant 
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d4	TokenNameIdentifier	 d4
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d4	TokenNameIdentifier	 d4
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"d4"	TokenNameStringLiteral	d4
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Field.Keyword("id", 	TokenNameCOMMENT_LINE	Field.Keyword("id", 
// "d4")); 	TokenNameCOMMENT_LINE	"d4")); 
d4	TokenNameIdentifier	 d4
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Field.Text("hed", 	TokenNameCOMMENT_LINE	Field.Text("hed", 
// "albino")); 	TokenNameCOMMENT_LINE	"albino")); 
d4	TokenNameIdentifier	 d4
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Field.Text("hed", "elephant")); 	TokenNameCOMMENT_LINE	Field.Text("hed", "elephant")); 
d4	TokenNameIdentifier	 d4
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Field.Text("dek", 	TokenNameCOMMENT_LINE	Field.Text("dek", 
// "albino")); 	TokenNameCOMMENT_LINE	"albino")); 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
d4	TokenNameIdentifier	 d4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setSimilarity	TokenNameIdentifier	 set Similarity
(	TokenNameLPAREN	
sim	TokenNameIdentifier	 sim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSkipToFirsttimeMiss	TokenNameIdentifier	 test Skip To Firsttime Miss
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
dq	TokenNameIdentifier	 dq
=	TokenNameEQUAL	
new	TokenNamenew	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dq	TokenNameIdentifier	 dq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"d1"	TokenNameStringLiteral	d1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dq	TokenNameIdentifier	 dq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"DOES_NOT_EXIST"	TokenNameStringLiteral	DOES_NOT_EXIST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dq	TokenNameIdentifier	 dq
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Weight	TokenNameIdentifier	 Weight
dw	TokenNameIdentifier	 dw
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
createNormalizedWeight	TokenNameIdentifier	 create Normalized Weight
(	TokenNameLPAREN	
dq	TokenNameIdentifier	 dq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Scorer	TokenNameIdentifier	 Scorer
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
dw	TokenNameIdentifier	 dw
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
(	TokenNameLPAREN	
sub	TokenNameIdentifier	 sub
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
skipOk	TokenNameIdentifier	 skip Ok
=	TokenNameEQUAL	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
skipOk	TokenNameIdentifier	 skip Ok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"firsttime skipTo found a match? ... "	TokenNameStringLiteral	firsttime skipTo found a match? ... 
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSkipToFirsttimeHit	TokenNameIdentifier	 test Skip To Firsttime Hit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
dq	TokenNameIdentifier	 dq
=	TokenNameEQUAL	
new	TokenNamenew	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dq	TokenNameIdentifier	 dq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dq	TokenNameIdentifier	 dq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"DOES_NOT_EXIST"	TokenNameStringLiteral	DOES_NOT_EXIST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dq	TokenNameIdentifier	 dq
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Weight	TokenNameIdentifier	 Weight
dw	TokenNameIdentifier	 dw
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
createNormalizedWeight	TokenNameIdentifier	 create Normalized Weight
(	TokenNameLPAREN	
dq	TokenNameIdentifier	 dq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Scorer	TokenNameIdentifier	 Scorer
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
dw	TokenNameIdentifier	 dw
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
(	TokenNameLPAREN	
sub	TokenNameIdentifier	 sub
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"firsttime skipTo found no match"	TokenNameStringLiteral	firsttime skipTo found no match
,	TokenNameCOMMA	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"found wrong docid"	TokenNameStringLiteral	found wrong docid
,	TokenNameCOMMA	
"d4"	TokenNameStringLiteral	d4
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimpleEqualScores1	TokenNameIdentifier	 test Simple Equal Scores1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all docs should match "	TokenNameStringLiteral	all docs should match 
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
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
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"score #"	TokenNameStringLiteral	score #
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" is not the same"	TokenNameStringLiteral	 is not the same
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
SCORE_COMP_THRESH	TokenNameIdentifier	 SCORE  COMP  THRESH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printHits	TokenNameIdentifier	 print Hits
(	TokenNameLPAREN	
"testSimpleEqualScores1"	TokenNameStringLiteral	testSimpleEqualScores1
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimpleEqualScores2	TokenNameIdentifier	 test Simple Equal Scores2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"3 docs should match "	TokenNameStringLiteral	3 docs should match 
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
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
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"score #"	TokenNameStringLiteral	score #
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" is not the same"	TokenNameStringLiteral	 is not the same
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
SCORE_COMP_THRESH	TokenNameIdentifier	 SCORE  COMP  THRESH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printHits	TokenNameIdentifier	 print Hits
(	TokenNameLPAREN	
"testSimpleEqualScores2"	TokenNameStringLiteral	testSimpleEqualScores2
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimpleEqualScores3	TokenNameIdentifier	 test Simple Equal Scores3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all docs should match "	TokenNameStringLiteral	all docs should match 
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
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
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"score #"	TokenNameStringLiteral	score #
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" is not the same"	TokenNameStringLiteral	 is not the same
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
SCORE_COMP_THRESH	TokenNameIdentifier	 SCORE  COMP  THRESH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printHits	TokenNameIdentifier	 print Hits
(	TokenNameLPAREN	
"testSimpleEqualScores3"	TokenNameStringLiteral	testSimpleEqualScores3
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimpleTiebreaker	TokenNameIdentifier	 test Simple Tiebreaker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
0.01f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"3 docs should match "	TokenNameStringLiteral	3 docs should match 
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong first"	TokenNameStringLiteral	wrong first
,	TokenNameCOMMA	
"d2"	TokenNameStringLiteral	d2
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score0	TokenNameIdentifier	 score0
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score1	TokenNameIdentifier	 score1
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score2	TokenNameIdentifier	 score2
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"d2 does not have better score then others: "	TokenNameStringLiteral	d2 does not have better score then others: 
+	TokenNamePLUS	
score0	TokenNameIdentifier	 score0
+	TokenNamePLUS	
" >? "	TokenNameStringLiteral	 >? 
+	TokenNamePLUS	
score1	TokenNameIdentifier	 score1
,	TokenNameCOMMA	
score0	TokenNameIdentifier	 score0
>	TokenNameGREATER	
score1	TokenNameIdentifier	 score1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"d4 and d1 don't have equal scores"	TokenNameStringLiteral	d4 and d1 don't have equal scores
,	TokenNameCOMMA	
score1	TokenNameIdentifier	 score1
,	TokenNameCOMMA	
score2	TokenNameIdentifier	 score2
,	TokenNameCOMMA	
SCORE_COMP_THRESH	TokenNameIdentifier	 SCORE  COMP  THRESH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printHits	TokenNameIdentifier	 print Hits
(	TokenNameLPAREN	
"testSimpleTiebreaker"	TokenNameStringLiteral	testSimpleTiebreaker
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBooleanRequiredEqualScores	TokenNameIdentifier	 test Boolean Required Equal Scores
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// true,false); 	TokenNameCOMMENT_LINE	true,false); 
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
new	TokenNamenew	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// true,false); 	TokenNameCOMMENT_LINE	true,false); 
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"3 docs should match "	TokenNameStringLiteral	3 docs should match 
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
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
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"score #"	TokenNameStringLiteral	score #
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" is not the same"	TokenNameStringLiteral	 is not the same
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
SCORE_COMP_THRESH	TokenNameIdentifier	 SCORE  COMP  THRESH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printHits	TokenNameIdentifier	 print Hits
(	TokenNameLPAREN	
"testBooleanRequiredEqualScores1"	TokenNameStringLiteral	testBooleanRequiredEqualScores1
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBooleanOptionalNoTiebreaker	TokenNameIdentifier	 test Boolean Optional No Tiebreaker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// false,false); 	TokenNameCOMMENT_LINE	false,false); 
}	TokenNameRBRACE	
{	TokenNameLBRACE	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
new	TokenNamenew	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// false,false); 	TokenNameCOMMENT_LINE	false,false); 
}	TokenNameRBRACE	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"4 docs should match "	TokenNameStringLiteral	4 docs should match 
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
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
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* note: -1 */	TokenNameCOMMENT_BLOCK	 note: -1 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"score #"	TokenNameStringLiteral	score #
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" is not the same"	TokenNameStringLiteral	 is not the same
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
SCORE_COMP_THRESH	TokenNameIdentifier	 SCORE  COMP  THRESH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong last"	TokenNameStringLiteral	wrong last
,	TokenNameCOMMA	
"d1"	TokenNameStringLiteral	d1
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score1	TokenNameIdentifier	 score1
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"d1 does not have worse score then others: "	TokenNameStringLiteral	d1 does not have worse score then others: 
+	TokenNamePLUS	
score	TokenNameIdentifier	 score
+	TokenNamePLUS	
" >? "	TokenNameStringLiteral	 >? 
+	TokenNamePLUS	
score1	TokenNameIdentifier	 score1
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
>	TokenNameGREATER	
score1	TokenNameIdentifier	 score1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printHits	TokenNameIdentifier	 print Hits
(	TokenNameLPAREN	
"testBooleanOptionalNoTiebreaker"	TokenNameStringLiteral	testBooleanOptionalNoTiebreaker
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBooleanOptionalWithTiebreaker	TokenNameIdentifier	 test Boolean Optional With Tiebreaker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
0.01f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// false,false); 	TokenNameCOMMENT_LINE	false,false); 
}	TokenNameRBRACE	
{	TokenNameLBRACE	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
new	TokenNamenew	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
0.01f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// false,false); 	TokenNameCOMMENT_LINE	false,false); 
}	TokenNameRBRACE	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"4 docs should match "	TokenNameStringLiteral	4 docs should match 
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score0	TokenNameIdentifier	 score0
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score1	TokenNameIdentifier	 score1
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score2	TokenNameIdentifier	 score2
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score3	TokenNameIdentifier	 score3
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
doc0	TokenNameIdentifier	 doc0
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
doc1	TokenNameIdentifier	 doc1
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
doc3	TokenNameIdentifier	 doc3
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"doc0 should be d2 or d4: "	TokenNameStringLiteral	doc0 should be d2 or d4: 
+	TokenNamePLUS	
doc0	TokenNameIdentifier	 doc0
,	TokenNameCOMMA	
doc0	TokenNameIdentifier	 doc0
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"d2"	TokenNameStringLiteral	d2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
doc0	TokenNameIdentifier	 doc0
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"d4"	TokenNameStringLiteral	d4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"doc1 should be d2 or d4: "	TokenNameStringLiteral	doc1 should be d2 or d4: 
+	TokenNamePLUS	
doc0	TokenNameIdentifier	 doc0
,	TokenNameCOMMA	
doc1	TokenNameIdentifier	 doc1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"d2"	TokenNameStringLiteral	d2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
doc1	TokenNameIdentifier	 doc1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"d4"	TokenNameStringLiteral	d4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"score0 and score1 should match"	TokenNameStringLiteral	score0 and score1 should match
,	TokenNameCOMMA	
score0	TokenNameIdentifier	 score0
,	TokenNameCOMMA	
score1	TokenNameIdentifier	 score1
,	TokenNameCOMMA	
SCORE_COMP_THRESH	TokenNameIdentifier	 SCORE  COMP  THRESH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong third"	TokenNameStringLiteral	wrong third
,	TokenNameCOMMA	
"d3"	TokenNameStringLiteral	d3
,	TokenNameCOMMA	
doc2	TokenNameIdentifier	 doc2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"d3 does not have worse score then d2 and d4: "	TokenNameStringLiteral	d3 does not have worse score then d2 and d4: 
+	TokenNamePLUS	
score1	TokenNameIdentifier	 score1
+	TokenNamePLUS	
" >? "	TokenNameStringLiteral	 >? 
+	TokenNamePLUS	
score2	TokenNameIdentifier	 score2
,	TokenNameCOMMA	
score1	TokenNameIdentifier	 score1
>	TokenNameGREATER	
score2	TokenNameIdentifier	 score2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong fourth"	TokenNameStringLiteral	wrong fourth
,	TokenNameCOMMA	
"d1"	TokenNameStringLiteral	d1
,	TokenNameCOMMA	
doc3	TokenNameIdentifier	 doc3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"d1 does not have worse score then d3: "	TokenNameStringLiteral	d1 does not have worse score then d3: 
+	TokenNamePLUS	
score2	TokenNameIdentifier	 score2
+	TokenNamePLUS	
" >? "	TokenNameStringLiteral	 >? 
+	TokenNamePLUS	
score3	TokenNameIdentifier	 score3
,	TokenNameCOMMA	
score2	TokenNameIdentifier	 score2
>	TokenNameGREATER	
score3	TokenNameIdentifier	 score3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printHits	TokenNameIdentifier	 print Hits
(	TokenNameLPAREN	
"testBooleanOptionalWithTiebreaker"	TokenNameStringLiteral	testBooleanOptionalWithTiebreaker
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBooleanOptionalWithTiebreakerAndBoost	TokenNameIdentifier	 test Boolean Optional With Tiebreaker And Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
0.01f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
,	TokenNameCOMMA	
1.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"albino"	TokenNameStringLiteral	albino
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// false,false); 	TokenNameCOMMENT_LINE	false,false); 
}	TokenNameRBRACE	
{	TokenNameLBRACE	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
new	TokenNamenew	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
0.01f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"hed"	TokenNameStringLiteral	hed
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
,	TokenNameCOMMA	
1.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"dek"	TokenNameStringLiteral	dek
,	TokenNameCOMMA	
"elephant"	TokenNameStringLiteral	elephant
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// false,false); 	TokenNameCOMMENT_LINE	false,false); 
}	TokenNameRBRACE	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"4 docs should match "	TokenNameStringLiteral	4 docs should match 
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score0	TokenNameIdentifier	 score0
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score1	TokenNameIdentifier	 score1
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score2	TokenNameIdentifier	 score2
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score3	TokenNameIdentifier	 score3
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
doc0	TokenNameIdentifier	 doc0
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
doc1	TokenNameIdentifier	 doc1
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
doc3	TokenNameIdentifier	 doc3
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"doc0 should be d4: "	TokenNameStringLiteral	doc0 should be d4: 
,	TokenNameCOMMA	
"d4"	TokenNameStringLiteral	d4
,	TokenNameCOMMA	
doc0	TokenNameIdentifier	 doc0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"doc1 should be d3: "	TokenNameStringLiteral	doc1 should be d3: 
,	TokenNameCOMMA	
"d3"	TokenNameStringLiteral	d3
,	TokenNameCOMMA	
doc1	TokenNameIdentifier	 doc1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"doc2 should be d2: "	TokenNameStringLiteral	doc2 should be d2: 
,	TokenNameCOMMA	
"d2"	TokenNameStringLiteral	d2
,	TokenNameCOMMA	
doc2	TokenNameIdentifier	 doc2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"doc3 should be d1: "	TokenNameStringLiteral	doc3 should be d1: 
,	TokenNameCOMMA	
"d1"	TokenNameStringLiteral	d1
,	TokenNameCOMMA	
doc3	TokenNameIdentifier	 doc3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"d4 does not have a better score then d3: "	TokenNameStringLiteral	d4 does not have a better score then d3: 
+	TokenNamePLUS	
score0	TokenNameIdentifier	 score0
+	TokenNamePLUS	
" >? "	TokenNameStringLiteral	 >? 
+	TokenNamePLUS	
score1	TokenNameIdentifier	 score1
,	TokenNameCOMMA	
score0	TokenNameIdentifier	 score0
>	TokenNameGREATER	
score1	TokenNameIdentifier	 score1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"d3 does not have a better score then d2: "	TokenNameStringLiteral	d3 does not have a better score then d2: 
+	TokenNamePLUS	
score1	TokenNameIdentifier	 score1
+	TokenNamePLUS	
" >? "	TokenNameStringLiteral	 >? 
+	TokenNamePLUS	
score2	TokenNameIdentifier	 score2
,	TokenNameCOMMA	
score1	TokenNameIdentifier	 score1
>	TokenNameGREATER	
score2	TokenNameIdentifier	 score2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"d3 does not have a better score then d1: "	TokenNameStringLiteral	d3 does not have a better score then d1: 
+	TokenNamePLUS	
score2	TokenNameIdentifier	 score2
+	TokenNamePLUS	
" >? "	TokenNameStringLiteral	 >? 
+	TokenNamePLUS	
score3	TokenNameIdentifier	 score3
,	TokenNameCOMMA	
score2	TokenNameIdentifier	 score2
>	TokenNameGREATER	
score3	TokenNameIdentifier	 score3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printHits	TokenNameIdentifier	 print Hits
(	TokenNameLPAREN	
"testBooleanOptionalWithTiebreakerAndBoost"	TokenNameStringLiteral	testBooleanOptionalWithTiebreakerAndBoost
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** macro */	TokenNameCOMMENT_JAVADOC	 macro 
protected	TokenNameprotected	
Query	TokenNameIdentifier	 Query
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** macro */	TokenNameCOMMENT_JAVADOC	 macro 
protected	TokenNameprotected	
Query	TokenNameIdentifier	 Query
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
float	TokenNamefloat	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
printHits	TokenNameIdentifier	 print Hits
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"------- "	TokenNameStringLiteral	------- 
+	TokenNamePLUS	
test	TokenNameIdentifier	 test
+	TokenNamePLUS	
" -------"	TokenNameStringLiteral	 -------
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DecimalFormat	TokenNameIdentifier	 Decimal Format
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
DecimalFormat	TokenNameIdentifier	 Decimal Format
(	TokenNameLPAREN	
"0.000000000"	TokenNameStringLiteral	0.000000000
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
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
+	TokenNamePLUS	
" - "	TokenNameStringLiteral	 - 
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
