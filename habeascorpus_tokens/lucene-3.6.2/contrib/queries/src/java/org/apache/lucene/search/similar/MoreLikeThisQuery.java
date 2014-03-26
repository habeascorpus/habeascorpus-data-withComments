/* * Created on 25-Jan-2006 */	TokenNameCOMMENT_BLOCK	 Created on 25-Jan-2006 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
similar	TokenNameIdentifier	 similar
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
Analyzer	TokenNameIdentifier	 Analyzer
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
BooleanClause	TokenNameIdentifier	 Boolean Clause
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
BooleanQuery	TokenNameIdentifier	 Boolean Query
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
similar	TokenNameIdentifier	 similar
.	TokenNameDOT	
MoreLikeThis	TokenNameIdentifier	 More Like This
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
/** * A simple wrapper for MoreLikeThis for use in scenarios where a Query object * is required eg in custom QueryParser extensions. At query.rewrite() time the * reader is used to construct the actual MoreLikeThis object and obtain the * real Query object. */	TokenNameCOMMENT_JAVADOC	 A simple wrapper for MoreLikeThis for use in scenarios where a Query object is required eg in custom QueryParser extensions. At query.rewrite() time the reader is used to construct the actual MoreLikeThis object and obtain the real Query object. 
public	TokenNamepublic	
class	TokenNameclass	
MoreLikeThisQuery	TokenNameIdentifier	 More Like This Query
extends	TokenNameextends	
Query	TokenNameIdentifier	 Query
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
likeText	TokenNameIdentifier	 like Text
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
moreLikeFields	TokenNameIdentifier	 more Like Fields
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
percentTermsToMatch	TokenNameIdentifier	 percent Terms To Match
=	TokenNameEQUAL	
0.3f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
minTermFrequency	TokenNameIdentifier	 min Term Frequency
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxQueryTerms	TokenNameIdentifier	 max Query Terms
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
minDocFreq	TokenNameIdentifier	 min Doc Freq
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** @deprecated use {@link #MoreLikeThisQuery(String, String[], Analyzer, String)} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated use {@link #MoreLikeThisQuery(String, String[], Analyzer, String)} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
MoreLikeThisQuery	TokenNameIdentifier	 More Like This Query
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
likeText	TokenNameIdentifier	 like Text
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
moreLikeFields	TokenNameIdentifier	 more Like Fields
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
likeText	TokenNameIdentifier	 like Text
,	TokenNameCOMMA	
moreLikeFields	TokenNameIdentifier	 more Like Fields
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
moreLikeFields	TokenNameIdentifier	 more Like Fields
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param moreLikeFields */	TokenNameCOMMENT_JAVADOC	 @param moreLikeFields 
public	TokenNamepublic	
MoreLikeThisQuery	TokenNameIdentifier	 More Like This Query
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
likeText	TokenNameIdentifier	 like Text
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
moreLikeFields	TokenNameIdentifier	 more Like Fields
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
likeText	TokenNameIdentifier	 like Text
=	TokenNameEQUAL	
likeText	TokenNameIdentifier	 like Text
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
moreLikeFields	TokenNameIdentifier	 more Like Fields
=	TokenNameEQUAL	
moreLikeFields	TokenNameIdentifier	 more Like Fields
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
=	TokenNameEQUAL	
fieldName	TokenNameIdentifier	 field Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
MoreLikeThis	TokenNameIdentifier	 More Like This
mlt	TokenNameIdentifier	 mlt
=	TokenNameEQUAL	
new	TokenNamenew	
MoreLikeThis	TokenNameIdentifier	 More Like This
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mlt	TokenNameIdentifier	 mlt
.	TokenNameDOT	
setFieldNames	TokenNameIdentifier	 set Field Names
(	TokenNameLPAREN	
moreLikeFields	TokenNameIdentifier	 more Like Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mlt	TokenNameIdentifier	 mlt
.	TokenNameDOT	
setAnalyzer	TokenNameIdentifier	 set Analyzer
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mlt	TokenNameIdentifier	 mlt
.	TokenNameDOT	
setMinTermFreq	TokenNameIdentifier	 set Min Term Freq
(	TokenNameLPAREN	
minTermFrequency	TokenNameIdentifier	 min Term Frequency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minDocFreq	TokenNameIdentifier	 min Doc Freq
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mlt	TokenNameIdentifier	 mlt
.	TokenNameDOT	
setMinDocFreq	TokenNameIdentifier	 set Min Doc Freq
(	TokenNameLPAREN	
minDocFreq	TokenNameIdentifier	 min Doc Freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mlt	TokenNameIdentifier	 mlt
.	TokenNameDOT	
setMaxQueryTerms	TokenNameIdentifier	 set Max Query Terms
(	TokenNameLPAREN	
maxQueryTerms	TokenNameIdentifier	 max Query Terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mlt	TokenNameIdentifier	 mlt
.	TokenNameDOT	
setStopWords	TokenNameIdentifier	 set Stop Words
(	TokenNameLPAREN	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
mlt	TokenNameIdentifier	 mlt
.	TokenNameDOT	
like	TokenNameIdentifier	 like
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
likeText	TokenNameIdentifier	 like Text
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanClause	TokenNameIdentifier	 Boolean Clause
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
clauses	TokenNameIdentifier	 clauses
=	TokenNameEQUAL	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
getClauses	TokenNameIdentifier	 get Clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make at least half the terms match 	TokenNameCOMMENT_LINE	make at least half the terms match 
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
percentTermsToMatch	TokenNameIdentifier	 percent Terms To Match
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bq	TokenNameIdentifier	 bq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * (non-Javadoc) * * @see org.apache.lucene.search.Query#toString(java.lang.String) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) * @see org.apache.lucene.search.Query#toString(java.lang.String) 
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
return	TokenNamereturn	
"like:"	TokenNameStringLiteral	like:
+	TokenNamePLUS	
likeText	TokenNameIdentifier	 like Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getPercentTermsToMatch	TokenNameIdentifier	 get Percent Terms To Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
percentTermsToMatch	TokenNameIdentifier	 percent Terms To Match
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPercentTermsToMatch	TokenNameIdentifier	 set Percent Terms To Match
(	TokenNameLPAREN	
float	TokenNamefloat	
percentTermsToMatch	TokenNameIdentifier	 percent Terms To Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
percentTermsToMatch	TokenNameIdentifier	 percent Terms To Match
=	TokenNameEQUAL	
percentTermsToMatch	TokenNameIdentifier	 percent Terms To Match
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Analyzer	TokenNameIdentifier	 Analyzer
getAnalyzer	TokenNameIdentifier	 get Analyzer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
analyzer	TokenNameIdentifier	 analyzer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAnalyzer	TokenNameIdentifier	 set Analyzer
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLikeText	TokenNameIdentifier	 get Like Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
likeText	TokenNameIdentifier	 like Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLikeText	TokenNameIdentifier	 set Like Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
likeText	TokenNameIdentifier	 like Text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
likeText	TokenNameIdentifier	 like Text
=	TokenNameEQUAL	
likeText	TokenNameIdentifier	 like Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMaxQueryTerms	TokenNameIdentifier	 get Max Query Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxQueryTerms	TokenNameIdentifier	 max Query Terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxQueryTerms	TokenNameIdentifier	 set Max Query Terms
(	TokenNameLPAREN	
int	TokenNameint	
maxQueryTerms	TokenNameIdentifier	 max Query Terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxQueryTerms	TokenNameIdentifier	 max Query Terms
=	TokenNameEQUAL	
maxQueryTerms	TokenNameIdentifier	 max Query Terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMinTermFrequency	TokenNameIdentifier	 get Min Term Frequency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minTermFrequency	TokenNameIdentifier	 min Term Frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMinTermFrequency	TokenNameIdentifier	 set Min Term Frequency
(	TokenNameLPAREN	
int	TokenNameint	
minTermFrequency	TokenNameIdentifier	 min Term Frequency
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minTermFrequency	TokenNameIdentifier	 min Term Frequency
=	TokenNameEQUAL	
minTermFrequency	TokenNameIdentifier	 min Term Frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getMoreLikeFields	TokenNameIdentifier	 get More Like Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
moreLikeFields	TokenNameIdentifier	 more Like Fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMoreLikeFields	TokenNameIdentifier	 set More Like Fields
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
moreLikeFields	TokenNameIdentifier	 more Like Fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
moreLikeFields	TokenNameIdentifier	 more Like Fields
=	TokenNameEQUAL	
moreLikeFields	TokenNameIdentifier	 more Like Fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getStopWords	TokenNameIdentifier	 get Stop Words
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stopWords	TokenNameIdentifier	 stop Words
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setStopWords	TokenNameIdentifier	 set Stop Words
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
stopWords	TokenNameIdentifier	 stop Words
=	TokenNameEQUAL	
stopWords	TokenNameIdentifier	 stop Words
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMinDocFreq	TokenNameIdentifier	 get Min Doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minDocFreq	TokenNameIdentifier	 min Doc Freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMinDocFreq	TokenNameIdentifier	 set Min Doc Freq
(	TokenNameLPAREN	
int	TokenNameint	
minDocFreq	TokenNameIdentifier	 min Doc Freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minDocFreq	TokenNameIdentifier	 min Doc Freq
=	TokenNameEQUAL	
minDocFreq	TokenNameIdentifier	 min Doc Freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
