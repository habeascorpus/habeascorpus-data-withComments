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
Set	TokenNameIdentifier	 Set
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
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
Explanation	TokenNameIdentifier	 Explanation
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
Query	TokenNameIdentifier	 Query
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
Weight	TokenNameIdentifier	 Weight
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
Scorer	TokenNameIdentifier	 Scorer
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
Searcher	TokenNameIdentifier	 Searcher
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
ToStringUtils	TokenNameIdentifier	 To String Utils
;	TokenNameSEMICOLON	
/** * Query that sets document score as a programmatic function of several (sub) scores: * <ol> * <li>the score of its subQuery (any query)</li> * <li>(optional) the score of its ValueSourceQuery (or queries). * For most simple/convenient use cases this query is likely to be a * {@link org.apache.lucene.search.function.FieldScoreQuery FieldScoreQuery}</li> * </ol> * Subclasses can modify the computation by overriding {@link #getCustomScoreProvider}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Query that sets document score as a programmatic function of several (sub) scores: <ol> <li>the score of its subQuery (any query)</li> <li>(optional) the score of its ValueSourceQuery (or queries). For most simple/convenient use cases this query is likely to be a {@link org.apache.lucene.search.function.FieldScoreQuery FieldScoreQuery}</li> </ol> Subclasses can modify the computation by overriding {@link #getCustomScoreProvider}. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
extends	TokenNameextends	
Query	TokenNameIdentifier	 Query
{	TokenNameLBRACE	
private	TokenNameprivate	
Query	TokenNameIdentifier	 Query
subQuery	TokenNameIdentifier	 sub Query
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
valSrcQueries	TokenNameIdentifier	 val Src Queries
;	TokenNameSEMICOLON	
// never null (empty array if there are no valSrcQueries). 	TokenNameCOMMENT_LINE	never null (empty array if there are no valSrcQueries). 
private	TokenNameprivate	
boolean	TokenNameboolean	
strict	TokenNameIdentifier	 strict
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// if true, valueSource part of query does not take part in weights normalization. 	TokenNameCOMMENT_LINE	if true, valueSource part of query does not take part in weights normalization. 
/** * Create a CustomScoreQuery over input subQuery. * @param subQuery the sub query whose scored is being customized. Must not be null. */	TokenNameCOMMENT_JAVADOC	 Create a CustomScoreQuery over input subQuery. @param subQuery the sub query whose scored is being customized. Must not be null. 
public	TokenNamepublic	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
subQuery	TokenNameIdentifier	 sub Query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
subQuery	TokenNameIdentifier	 sub Query
,	TokenNameCOMMA	
new	TokenNamenew	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a CustomScoreQuery over input subQuery and a {@link ValueSourceQuery}. * @param subQuery the sub query whose score is being customized. Must not be null. * @param valSrcQuery a value source query whose scores are used in the custom score * computation. For most simple/convenient use case this would be a * {@link org.apache.lucene.search.function.FieldScoreQuery FieldScoreQuery}. * This parameter is optional - it can be null. */	TokenNameCOMMENT_JAVADOC	 Create a CustomScoreQuery over input subQuery and a {@link ValueSourceQuery}. @param subQuery the sub query whose score is being customized. Must not be null. @param valSrcQuery a value source query whose scores are used in the custom score computation. For most simple/convenient use case this would be a {@link org.apache.lucene.search.function.FieldScoreQuery FieldScoreQuery}. This parameter is optional - it can be null. 
public	TokenNamepublic	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
subQuery	TokenNameIdentifier	 sub Query
,	TokenNameCOMMA	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
valSrcQuery	TokenNameIdentifier	 val Src Query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
subQuery	TokenNameIdentifier	 sub Query
,	TokenNameCOMMA	
valSrcQuery	TokenNameIdentifier	 val Src Query
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
// don't want an array that contains a single null.. 	TokenNameCOMMENT_LINE	don't want an array that contains a single null.. 
new	TokenNamenew	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
valSrcQuery	TokenNameIdentifier	 val Src Query
}	TokenNameRBRACE	
:	TokenNameCOLON	
new	TokenNamenew	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a CustomScoreQuery over input subQuery and a {@link ValueSourceQuery}. * @param subQuery the sub query whose score is being customized. Must not be null. * @param valSrcQueries value source queries whose scores are used in the custom score * computation. For most simple/convenient use case these would be * {@link org.apache.lucene.search.function.FieldScoreQuery FieldScoreQueries}. * This parameter is optional - it can be null or even an empty array. */	TokenNameCOMMENT_JAVADOC	 Create a CustomScoreQuery over input subQuery and a {@link ValueSourceQuery}. @param subQuery the sub query whose score is being customized. Must not be null. @param valSrcQueries value source queries whose scores are used in the custom score computation. For most simple/convenient use case these would be {@link org.apache.lucene.search.function.FieldScoreQuery FieldScoreQueries}. This parameter is optional - it can be null or even an empty array. 
public	TokenNamepublic	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
subQuery	TokenNameIdentifier	 sub Query
,	TokenNameCOMMA	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
...	TokenNameELLIPSIS	
valSrcQueries	TokenNameIdentifier	 val Src Queries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
subQuery	TokenNameIdentifier	 sub Query
=	TokenNameEQUAL	
subQuery	TokenNameIdentifier	 sub Query
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
valSrcQueries	TokenNameIdentifier	 val Src Queries
=	TokenNameEQUAL	
valSrcQueries	TokenNameIdentifier	 val Src Queries
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
valSrcQueries	TokenNameIdentifier	 val Src Queries
:	TokenNameCOLON	
new	TokenNamenew	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subQuery	TokenNameIdentifier	 sub Query
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"<subquery> must not be null!"	TokenNameStringLiteral	<subquery> must not be null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.Query#rewrite(org.apache.lucene.index.IndexReader) */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.Query#rewrite(org.apache.lucene.index.IndexReader) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
sq	TokenNameIdentifier	 sq
=	TokenNameEQUAL	
subQuery	TokenNameIdentifier	 sub Query
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sq	TokenNameIdentifier	 sq
!=	TokenNameNOT_EQUAL	
subQuery	TokenNameIdentifier	 sub Query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
subQuery	TokenNameIdentifier	 sub Query
=	TokenNameEQUAL	
sq	TokenNameIdentifier	 sq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
valSrcQueries	TokenNameIdentifier	 val Src Queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
)	TokenNameRPAREN	
valSrcQueries	TokenNameIdentifier	 val Src Queries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
!=	TokenNameNOT_EQUAL	
valSrcQueries	TokenNameIdentifier	 val Src Queries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
valSrcQueries	TokenNameIdentifier	 val Src Queries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
this	TokenNamethis	
:	TokenNameCOLON	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.Query#extractTerms(java.util.Set) */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.Query#extractTerms(java.util.Set) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
extractTerms	TokenNameIdentifier	 extract Terms
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subQuery	TokenNameIdentifier	 sub Query
.	TokenNameDOT	
extractTerms	TokenNameIdentifier	 extract Terms
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
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
valSrcQueries	TokenNameIdentifier	 val Src Queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valSrcQueries	TokenNameIdentifier	 val Src Queries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
extractTerms	TokenNameIdentifier	 extract Terms
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.Query#clone() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.Query#clone() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
subQuery	TokenNameIdentifier	 sub Query
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
)	TokenNameRPAREN	
subQuery	TokenNameIdentifier	 sub Query
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
valSrcQueries	TokenNameIdentifier	 val Src Queries
=	TokenNameEQUAL	
new	TokenNamenew	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
[	TokenNameLBRACKET	
valSrcQueries	TokenNameIdentifier	 val Src Queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
valSrcQueries	TokenNameIdentifier	 val Src Queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
valSrcQueries	TokenNameIdentifier	 val Src Queries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
)	TokenNameRPAREN	
valSrcQueries	TokenNameIdentifier	 val Src Queries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) @see org.apache.lucene.search.Query#toString(java.lang.String) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.search.Query#toString(java.lang.String) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
subQuery	TokenNameIdentifier	 sub Query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
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
valSrcQueries	TokenNameIdentifier	 val Src Queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
valSrcQueries	TokenNameIdentifier	 val Src Queries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
strict	TokenNameIdentifier	 strict
?	TokenNameQUESTION	
" STRICT"	TokenNameStringLiteral	 STRICT
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ToStringUtils	TokenNameIdentifier	 To String Utils
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true if <code>o</code> is equal to this. */	TokenNameCOMMENT_JAVADOC	 Returns true if <code>o</code> is equal to this. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
super	TokenNamesuper	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
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
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
subQuery	TokenNameIdentifier	 sub Query
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
subQuery	TokenNameIdentifier	 sub Query
)	TokenNameRPAREN	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
strict	TokenNameIdentifier	 strict
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
strict	TokenNameIdentifier	 strict
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
valSrcQueries	TokenNameIdentifier	 val Src Queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
valSrcQueries	TokenNameIdentifier	 val Src Queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
valSrcQueries	TokenNameIdentifier	 val Src Queries
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
valSrcQueries	TokenNameIdentifier	 val Src Queries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a hash code value for this object. */	TokenNameCOMMENT_JAVADOC	 Returns a hash code value for this object. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
subQuery	TokenNameIdentifier	 sub Query
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
valSrcQueries	TokenNameIdentifier	 val Src Queries
)	TokenNameRPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
strict	TokenNameIdentifier	 strict
?	TokenNameQUESTION	
1234	TokenNameIntegerLiteral	
:	TokenNameCOLON	
4321	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a {@link CustomScoreProvider} that calculates the custom scores * for the given {@link IndexReader}. The default implementation returns a default * implementation as specified in the docs of {@link CustomScoreProvider}. * @since 2.9.2 */	TokenNameCOMMENT_JAVADOC	 Returns a {@link CustomScoreProvider} that calculates the custom scores for the given {@link IndexReader}. The default implementation returns a default implementation as specified in the docs of {@link CustomScoreProvider}. @since 2.9.2 
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
return	TokenNamereturn	
new	TokenNamenew	
CustomScoreProvider	TokenNameIdentifier	 Custom Score Provider
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//=========================== W E I G H T ============================ 	TokenNameCOMMENT_LINE	=========================== W E I G H T ============================ 
private	TokenNameprivate	
class	TokenNameclass	
CustomWeight	TokenNameIdentifier	 Custom Weight
extends	TokenNameextends	
Weight	TokenNameIdentifier	 Weight
{	TokenNameLBRACE	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
Weight	TokenNameIdentifier	 Weight
subQueryWeight	TokenNameIdentifier	 sub Query Weight
;	TokenNameSEMICOLON	
Weight	TokenNameIdentifier	 Weight
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
valSrcWeights	TokenNameIdentifier	 val Src Weights
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
qStrict	TokenNameIdentifier	 q Strict
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CustomWeight	TokenNameIdentifier	 Custom Weight
(	TokenNameLPAREN	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
similarity	TokenNameIdentifier	 similarity
=	TokenNameEQUAL	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
subQueryWeight	TokenNameIdentifier	 sub Query Weight
=	TokenNameEQUAL	
subQuery	TokenNameIdentifier	 sub Query
.	TokenNameDOT	
createWeight	TokenNameIdentifier	 create Weight
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
valSrcWeights	TokenNameIdentifier	 val Src Weights
=	TokenNameEQUAL	
new	TokenNamenew	
Weight	TokenNameIdentifier	 Weight
[	TokenNameLBRACKET	
valSrcQueries	TokenNameIdentifier	 val Src Queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
valSrcQueries	TokenNameIdentifier	 val Src Queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
valSrcWeights	TokenNameIdentifier	 val Src Weights
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
valSrcQueries	TokenNameIdentifier	 val Src Queries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
createWeight	TokenNameIdentifier	 create Weight
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
qStrict	TokenNameIdentifier	 q Strict
=	TokenNameEQUAL	
strict	TokenNameIdentifier	 strict
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.Weight#getQuery() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.Weight#getQuery() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
.	TokenNameDOT	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.Weight#getValue() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.Weight#getValue() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.Weight#sumOfSquaredWeights() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.Weight#sumOfSquaredWeights() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
sumOfSquaredWeights	TokenNameIdentifier	 sum Of Squared Weights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
float	TokenNamefloat	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
subQueryWeight	TokenNameIdentifier	 sub Query Weight
.	TokenNameDOT	
sumOfSquaredWeights	TokenNameIdentifier	 sum Of Squared Weights
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
valSrcWeights	TokenNameIdentifier	 val Src Weights
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
qStrict	TokenNameIdentifier	 q Strict
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valSrcWeights	TokenNameIdentifier	 val Src Weights
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
sumOfSquaredWeights	TokenNameIdentifier	 sum Of Squared Weights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// do not include ValueSource part in the query normalization 	TokenNameCOMMENT_LINE	do not include ValueSource part in the query normalization 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
valSrcWeights	TokenNameIdentifier	 val Src Weights
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
sumOfSquaredWeights	TokenNameIdentifier	 sum Of Squared Weights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sum	TokenNameIdentifier	 sum
*=	TokenNameMULTIPLY_EQUAL	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// boost each sub-weight 	TokenNameCOMMENT_LINE	boost each sub-weight 
return	TokenNamereturn	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.Weight#normalize(float) */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.Weight#normalize(float) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
float	TokenNamefloat	
norm	TokenNameIdentifier	 norm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
norm	TokenNameIdentifier	 norm
*=	TokenNameMULTIPLY_EQUAL	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// incorporate boost 	TokenNameCOMMENT_LINE	incorporate boost 
subQueryWeight	TokenNameIdentifier	 sub Query Weight
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
norm	TokenNameIdentifier	 norm
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
valSrcWeights	TokenNameIdentifier	 val Src Weights
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
qStrict	TokenNameIdentifier	 q Strict
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valSrcWeights	TokenNameIdentifier	 val Src Weights
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// do not normalize the ValueSource part 	TokenNameCOMMENT_LINE	do not normalize the ValueSource part 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
valSrcWeights	TokenNameIdentifier	 val Src Weights
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
norm	TokenNameIdentifier	 norm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
boolean	TokenNameboolean	
scoreDocsInOrder	TokenNameIdentifier	 score Docs In Order
,	TokenNameCOMMA	
boolean	TokenNameboolean	
topScorer	TokenNameIdentifier	 top Scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Pass true for "scoresDocsInOrder", because we 	TokenNameCOMMENT_LINE	Pass true for "scoresDocsInOrder", because we 
// require in-order scoring, even if caller does not, 	TokenNameCOMMENT_LINE	require in-order scoring, even if caller does not, 
// since we call advance on the valSrcScorers. Pass 	TokenNameCOMMENT_LINE	since we call advance on the valSrcScorers. Pass 
// false for "topScorer" because we will not invoke 	TokenNameCOMMENT_LINE	false for "topScorer" because we will not invoke 
// score(Collector) on these scorers: 	TokenNameCOMMENT_LINE	score(Collector) on these scorers: 
Scorer	TokenNameIdentifier	 Scorer
subQueryScorer	TokenNameIdentifier	 sub Query Scorer
=	TokenNameEQUAL	
subQueryWeight	TokenNameIdentifier	 sub Query Weight
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subQueryScorer	TokenNameIdentifier	 sub Query Scorer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Scorer	TokenNameIdentifier	 Scorer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
valSrcScorers	TokenNameIdentifier	 val Src Scorers
=	TokenNameEQUAL	
new	TokenNamenew	
Scorer	TokenNameIdentifier	 Scorer
[	TokenNameLBRACKET	
valSrcWeights	TokenNameIdentifier	 val Src Weights
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
valSrcScorers	TokenNameIdentifier	 val Src Scorers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valSrcScorers	TokenNameIdentifier	 val Src Scorers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
valSrcWeights	TokenNameIdentifier	 val Src Weights
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
topScorer	TokenNameIdentifier	 top Scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CustomScorer	TokenNameIdentifier	 Custom Scorer
(	TokenNameLPAREN	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
subQueryScorer	TokenNameIdentifier	 sub Query Scorer
,	TokenNameCOMMA	
valSrcScorers	TokenNameIdentifier	 val Src Scorers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
explain	TokenNameIdentifier	 explain
=	TokenNameEQUAL	
doExplain	TokenNameIdentifier	 do Explain
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
explain	TokenNameIdentifier	 explain
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
"no matching docs"	TokenNameStringLiteral	no matching docs
)	TokenNameRPAREN	
:	TokenNameCOLON	
explain	TokenNameIdentifier	 explain
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Explanation	TokenNameIdentifier	 Explanation
doExplain	TokenNameIdentifier	 do Explain
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
subQueryExpl	TokenNameIdentifier	 sub Query Expl
=	TokenNameEQUAL	
subQueryWeight	TokenNameIdentifier	 sub Query Weight
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
subQueryExpl	TokenNameIdentifier	 sub Query Expl
.	TokenNameDOT	
isMatch	TokenNameIdentifier	 is Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subQueryExpl	TokenNameIdentifier	 sub Query Expl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// match 	TokenNameCOMMENT_LINE	match 
Explanation	TokenNameIdentifier	 Explanation
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
valSrcExpls	TokenNameIdentifier	 val Src Expls
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
[	TokenNameLBRACKET	
valSrcWeights	TokenNameIdentifier	 val Src Weights
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
valSrcWeights	TokenNameIdentifier	 val Src Weights
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valSrcExpls	TokenNameIdentifier	 val Src Expls
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
valSrcWeights	TokenNameIdentifier	 val Src Weights
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Explanation	TokenNameIdentifier	 Explanation
customExp	TokenNameIdentifier	 custom Exp
=	TokenNameEQUAL	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
getCustomScoreProvider	TokenNameIdentifier	 get Custom Score Provider
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
.	TokenNameDOT	
customExplain	TokenNameIdentifier	 custom Explain
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
subQueryExpl	TokenNameIdentifier	 sub Query Expl
,	TokenNameCOMMA	
valSrcExpls	TokenNameIdentifier	 val Src Expls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
sc	TokenNameIdentifier	 sc
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
customExp	TokenNameIdentifier	 custom Exp
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
sc	TokenNameIdentifier	 sc
,	TokenNameCOMMA	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", product of:"	TokenNameStringLiteral	, product of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
customExp	TokenNameIdentifier	 custom Exp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"queryBoost"	TokenNameStringLiteral	queryBoost
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// actually using the q boost as q weight (== weight value) 	TokenNameCOMMENT_LINE	actually using the q boost as q weight (== weight value) 
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
scoresDocsOutOfOrder	TokenNameIdentifier	 scores Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//=========================== S C O R E R ============================ 	TokenNameCOMMENT_LINE	=========================== S C O R E R ============================ 
/** * A scorer that applies a (callback) function on scores of the subQuery. */	TokenNameCOMMENT_JAVADOC	 A scorer that applies a (callback) function on scores of the subQuery. 
private	TokenNameprivate	
class	TokenNameclass	
CustomScorer	TokenNameIdentifier	 Custom Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
float	TokenNamefloat	
qWeight	TokenNameIdentifier	 q Weight
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
subQueryScorer	TokenNameIdentifier	 sub Query Scorer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
valSrcScorers	TokenNameIdentifier	 val Src Scorers
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CustomScoreProvider	TokenNameIdentifier	 Custom Score Provider
provider	TokenNameIdentifier	 provider
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
vScores	TokenNameIdentifier	 v Scores
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// reused in score() to avoid allocating this array for each doc 	TokenNameCOMMENT_LINE	reused in score() to avoid allocating this array for each doc 
// constructor 	TokenNameCOMMENT_LINE	constructor 
private	TokenNameprivate	
CustomScorer	TokenNameIdentifier	 Custom Scorer
(	TokenNameLPAREN	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
CustomWeight	TokenNameIdentifier	 Custom Weight
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
subQueryScorer	TokenNameIdentifier	 sub Query Scorer
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
valSrcScorers	TokenNameIdentifier	 val Src Scorers
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
qWeight	TokenNameIdentifier	 q Weight
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
subQueryScorer	TokenNameIdentifier	 sub Query Scorer
=	TokenNameEQUAL	
subQueryScorer	TokenNameIdentifier	 sub Query Scorer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
valSrcScorers	TokenNameIdentifier	 val Src Scorers
=	TokenNameEQUAL	
valSrcScorers	TokenNameIdentifier	 val Src Scorers
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
vScores	TokenNameIdentifier	 v Scores
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
valSrcScorers	TokenNameIdentifier	 val Src Scorers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
provider	TokenNameIdentifier	 provider
=	TokenNameEQUAL	
CustomScoreQuery	TokenNameIdentifier	 Custom Score Query
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
getCustomScoreProvider	TokenNameIdentifier	 get Custom Score Provider
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
subQueryScorer	TokenNameIdentifier	 sub Query Scorer
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
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
valSrcScorers	TokenNameIdentifier	 val Src Scorers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valSrcScorers	TokenNameIdentifier	 val Src Scorers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subQueryScorer	TokenNameIdentifier	 sub Query Scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.Scorer#score() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.Scorer#score() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
valSrcScorers	TokenNameIdentifier	 val Src Scorers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vScores	TokenNameIdentifier	 v Scores
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
valSrcScorers	TokenNameIdentifier	 val Src Scorers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
qWeight	TokenNameIdentifier	 q Weight
*	TokenNameMULTIPLY	
provider	TokenNameIdentifier	 provider
.	TokenNameDOT	
customScore	TokenNameIdentifier	 custom Score
(	TokenNameLPAREN	
subQueryScorer	TokenNameIdentifier	 sub Query Scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
subQueryScorer	TokenNameIdentifier	 sub Query Scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
vScores	TokenNameIdentifier	 v Scores
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
subQueryScorer	TokenNameIdentifier	 sub Query Scorer
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
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
valSrcScorers	TokenNameIdentifier	 val Src Scorers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valSrcScorers	TokenNameIdentifier	 val Src Scorers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Weight	TokenNameIdentifier	 Weight
createWeight	TokenNameIdentifier	 create Weight
(	TokenNameLPAREN	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CustomWeight	TokenNameIdentifier	 Custom Weight
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if this is strict custom scoring. * In strict custom scoring, the ValueSource part does not participate in weight normalization. * This may be useful when one wants full control over how scores are modified, and does * not care about normalizing by the ValueSource part. * One particular case where this is useful if for testing this query. * <P> * Note: only has effect when the ValueSource part is not null. */	TokenNameCOMMENT_JAVADOC	 Checks if this is strict custom scoring. In strict custom scoring, the ValueSource part does not participate in weight normalization. This may be useful when one wants full control over how scores are modified, and does not care about normalizing by the ValueSource part. One particular case where this is useful if for testing this query. <P> Note: only has effect when the ValueSource part is not null. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isStrict	TokenNameIdentifier	 is Strict
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
strict	TokenNameIdentifier	 strict
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the strict mode of this query. * @param strict The strict mode to set. * @see #isStrict() */	TokenNameCOMMENT_JAVADOC	 Set the strict mode of this query. @param strict The strict mode to set. @see #isStrict() 
public	TokenNamepublic	
void	TokenNamevoid	
setStrict	TokenNameIdentifier	 set Strict
(	TokenNameLPAREN	
boolean	TokenNameboolean	
strict	TokenNameIdentifier	 strict
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
strict	TokenNameIdentifier	 strict
=	TokenNameEQUAL	
strict	TokenNameIdentifier	 strict
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A short name of this query, used in {@link #toString(String)}. */	TokenNameCOMMENT_JAVADOC	 A short name of this query, used in {@link #toString(String)}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"custom"	TokenNameStringLiteral	custom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
