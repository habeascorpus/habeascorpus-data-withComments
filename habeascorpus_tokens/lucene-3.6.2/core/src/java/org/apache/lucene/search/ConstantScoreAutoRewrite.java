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
ArrayList	TokenNameIdentifier	 Array List
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
class	TokenNameclass	
ConstantScoreAutoRewrite	TokenNameIdentifier	 Constant Score Auto Rewrite
extends	TokenNameextends	
TermCollectingRewrite	TokenNameIdentifier	 Term Collecting Rewrite
<	TokenNameLESS	
BooleanQuery	TokenNameIdentifier	 Boolean Query
>	TokenNameGREATER	
{	TokenNameLBRACE	
// Defaults derived from rough tests with a 20.0 million 	TokenNameCOMMENT_LINE	Defaults derived from rough tests with a 20.0 million 
// doc Wikipedia index. With more than 350 terms in the 	TokenNameCOMMENT_LINE	doc Wikipedia index. With more than 350 terms in the 
// query, the filter method is fastest: 	TokenNameCOMMENT_LINE	query, the filter method is fastest: 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
DEFAULT_TERM_COUNT_CUTOFF	TokenNameIdentifier	 DEFAULT  TERM  COUNT  CUTOFF
=	TokenNameEQUAL	
350	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// If the query will hit more than 1 in 1000 of the docs 	TokenNameCOMMENT_LINE	If the query will hit more than 1 in 1000 of the docs 
// in the index (0.1%), the filter method is fastest: 	TokenNameCOMMENT_LINE	in the index (0.1%), the filter method is fastest: 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
DEFAULT_DOC_COUNT_PERCENT	TokenNameIdentifier	 DEFAULT  DOC  COUNT  PERCENT
=	TokenNameEQUAL	
0.1	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
termCountCutoff	TokenNameIdentifier	 term Count Cutoff
=	TokenNameEQUAL	
DEFAULT_TERM_COUNT_CUTOFF	TokenNameIdentifier	 DEFAULT  TERM  COUNT  CUTOFF
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
docCountPercent	TokenNameIdentifier	 doc Count Percent
=	TokenNameEQUAL	
DEFAULT_DOC_COUNT_PERCENT	TokenNameIdentifier	 DEFAULT  DOC  COUNT  PERCENT
;	TokenNameSEMICOLON	
/** If the number of terms in this query is equal to or * larger than this setting then {@link * #CONSTANT_SCORE_FILTER_REWRITE} is used. */	TokenNameCOMMENT_JAVADOC	 If the number of terms in this query is equal to or larger than this setting then {@link #CONSTANT_SCORE_FILTER_REWRITE} is used. 
public	TokenNamepublic	
void	TokenNamevoid	
setTermCountCutoff	TokenNameIdentifier	 set Term Count Cutoff
(	TokenNameLPAREN	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termCountCutoff	TokenNameIdentifier	 term Count Cutoff
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #setTermCountCutoff */	TokenNameCOMMENT_JAVADOC	 @see #setTermCountCutoff 
public	TokenNamepublic	
int	TokenNameint	
getTermCountCutoff	TokenNameIdentifier	 get Term Count Cutoff
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termCountCutoff	TokenNameIdentifier	 term Count Cutoff
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If the number of documents to be visited in the * postings exceeds this specified percentage of the * maxDoc() for the index, then {@link * #CONSTANT_SCORE_FILTER_REWRITE} is used. * @param percent 0.0 to 100.0 */	TokenNameCOMMENT_JAVADOC	 If the number of documents to be visited in the postings exceeds this specified percentage of the maxDoc() for the index, then {@link #CONSTANT_SCORE_FILTER_REWRITE} is used. @param percent 0.0 to 100.0 
public	TokenNamepublic	
void	TokenNamevoid	
setDocCountPercent	TokenNameIdentifier	 set Doc Count Percent
(	TokenNameLPAREN	
double	TokenNamedouble	
percent	TokenNameIdentifier	 percent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docCountPercent	TokenNameIdentifier	 doc Count Percent
=	TokenNameEQUAL	
percent	TokenNameIdentifier	 percent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #setDocCountPercent */	TokenNameCOMMENT_JAVADOC	 @see #setDocCountPercent 
public	TokenNamepublic	
double	TokenNamedouble	
getDocCountPercent	TokenNameIdentifier	 get Doc Count Percent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
docCountPercent	TokenNameIdentifier	 doc Count Percent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
BooleanQuery	TokenNameIdentifier	 Boolean Query
getTopLevelQuery	TokenNameIdentifier	 get Top Level Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
addClause	TokenNameIdentifier	 add Clause
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
topLevel	TokenNameIdentifier	 top Level
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
/*ignored*/	TokenNameCOMMENT_BLOCK	ignored
)	TokenNameRPAREN	
{	TokenNameLBRACE	
topLevel	TokenNameIdentifier	 top Level
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
final	TokenNamefinal	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Get the enum and start visiting terms. If we 	TokenNameCOMMENT_LINE	Get the enum and start visiting terms. If we 
// exhaust the enum before hitting either of the 	TokenNameCOMMENT_LINE	exhaust the enum before hitting either of the 
// cutoffs, we use ConstantBooleanQueryRewrite; else, 	TokenNameCOMMENT_LINE	cutoffs, we use ConstantBooleanQueryRewrite; else, 
// ConstantFilterRewrite: 	TokenNameCOMMENT_LINE	ConstantFilterRewrite: 
final	TokenNamefinal	
int	TokenNameint	
docCountCutoff	TokenNameIdentifier	 doc Count Cutoff
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
docCountPercent	TokenNameIdentifier	 doc Count Percent
/	TokenNameDIVIDE	
100.	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
termCountLimit	TokenNameIdentifier	 term Count Limit
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
.	TokenNameDOT	
getMaxClauseCount	TokenNameIdentifier	 get Max Clause Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
termCountCutoff	TokenNameIdentifier	 term Count Cutoff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
CutOffTermCollector	TokenNameIdentifier	 Cut Off Term Collector
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
new	TokenNamenew	
CutOffTermCollector	TokenNameIdentifier	 Cut Off Term Collector
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docCountCutoff	TokenNameIdentifier	 doc Count Cutoff
,	TokenNameCOMMA	
termCountLimit	TokenNameIdentifier	 term Count Limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collectTerms	TokenNameIdentifier	 collect Terms
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
hasCutOff	TokenNameIdentifier	 has Cut Off
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
.	TokenNameDOT	
CONSTANT_SCORE_FILTER_REWRITE	TokenNameIdentifier	 CONSTANT  SCORE  FILTER  REWRITE
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
pendingTerms	TokenNameIdentifier	 pending Terms
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getTopLevelQuery	TokenNameIdentifier	 get Top Level Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
getTopLevelQuery	TokenNameIdentifier	 get Top Level Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
:	TokenNameCOLON	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
pendingTerms	TokenNameIdentifier	 pending Terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addClause	TokenNameIdentifier	 add Clause
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Strip scores 	TokenNameCOMMENT_LINE	Strip scores 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
incTotalNumberOfTerms	TokenNameIdentifier	 inc Total Number Of Terms
(	TokenNameLPAREN	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
pendingTerms	TokenNameIdentifier	 pending Terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
CutOffTermCollector	TokenNameIdentifier	 Cut Off Term Collector
implements	TokenNameimplements	
TermCollector	TokenNameIdentifier	 Term Collector
{	TokenNameLBRACE	
CutOffTermCollector	TokenNameIdentifier	 Cut Off Term Collector
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docCountCutoff	TokenNameIdentifier	 doc Count Cutoff
,	TokenNameCOMMA	
int	TokenNameint	
termCountLimit	TokenNameIdentifier	 term Count Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
docCountCutoff	TokenNameIdentifier	 doc Count Cutoff
=	TokenNameEQUAL	
docCountCutoff	TokenNameIdentifier	 doc Count Cutoff
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termCountLimit	TokenNameIdentifier	 term Count Limit
=	TokenNameEQUAL	
termCountLimit	TokenNameIdentifier	 term Count Limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
pendingTerms	TokenNameIdentifier	 pending Terms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Loading the TermInfo from the terms dict here 	TokenNameCOMMENT_LINE	Loading the TermInfo from the terms dict here 
// should not be costly, because 1) the 	TokenNameCOMMENT_LINE	should not be costly, because 1) the 
// query/filter will load the TermInfo when it 	TokenNameCOMMENT_LINE	query/filter will load the TermInfo when it 
// runs, and 2) the terms dict has a cache: 	TokenNameCOMMENT_LINE	runs, and 2) the terms dict has a cache: 
docVisitCount	TokenNameIdentifier	 doc Visit Count
+=	TokenNamePLUS_EQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pendingTerms	TokenNameIdentifier	 pending Terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
termCountLimit	TokenNameIdentifier	 term Count Limit
||	TokenNameOR_OR	
docVisitCount	TokenNameIdentifier	 doc Visit Count
>=	TokenNameGREATER_EQUAL	
docCountCutoff	TokenNameIdentifier	 doc Count Cutoff
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasCutOff	TokenNameIdentifier	 has Cut Off
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
docVisitCount	TokenNameIdentifier	 doc Visit Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasCutOff	TokenNameIdentifier	 has Cut Off
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
docCountCutoff	TokenNameIdentifier	 doc Count Cutoff
,	TokenNameCOMMA	
termCountLimit	TokenNameIdentifier	 term Count Limit
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
pendingTerms	TokenNameIdentifier	 pending Terms
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
1279	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
termCountCutoff	TokenNameIdentifier	 term Count Cutoff
+	TokenNamePLUS	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
doubleToLongBits	TokenNameIdentifier	 double To Long Bits
(	TokenNameLPAREN	
docCountPercent	TokenNameIdentifier	 doc Count Percent
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ConstantScoreAutoRewrite	TokenNameIdentifier	 Constant Score Auto Rewrite
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ConstantScoreAutoRewrite	TokenNameIdentifier	 Constant Score Auto Rewrite
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
termCountCutoff	TokenNameIdentifier	 term Count Cutoff
!=	TokenNameNOT_EQUAL	
termCountCutoff	TokenNameIdentifier	 term Count Cutoff
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
doubleToLongBits	TokenNameIdentifier	 double To Long Bits
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
docCountPercent	TokenNameIdentifier	 doc Count Percent
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
doubleToLongBits	TokenNameIdentifier	 double To Long Bits
(	TokenNameLPAREN	
docCountPercent	TokenNameIdentifier	 doc Count Percent
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
