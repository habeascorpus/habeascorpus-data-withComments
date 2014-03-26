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
/** * A {@link Scorer} which wraps another scorer and caches the score of the * current document. Successive calls to {@link #score()} will return the same * result and will not invoke the wrapped Scorer's score() method, unless the * current document has changed.<br> * This class might be useful due to the changes done to the {@link Collector} * interface, in which the score is not computed for a document by default, only * if the collector requests it. Some collectors may need to use the score in * several places, however all they have in hand is a {@link Scorer} object, and * might end up computing the score of a document more than once. */	TokenNameCOMMENT_JAVADOC	 A {@link Scorer} which wraps another scorer and caches the score of the current document. Successive calls to {@link #score()} will return the same result and will not invoke the wrapped Scorer's score() method, unless the current document has changed.<br> This class might be useful due to the changes done to the {@link Collector} interface, in which the score is not computed for a document by default, only if the collector requests it. Some collectors may need to use the score in several places, however all they have in hand is a {@link Scorer} object, and might end up computing the score of a document more than once. 
public	TokenNamepublic	
class	TokenNameclass	
ScoreCachingWrappingScorer	TokenNameIdentifier	 Score Caching Wrapping Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
curDoc	TokenNameIdentifier	 cur Doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
curScore	TokenNameIdentifier	 cur Score
;	TokenNameSEMICOLON	
/** Creates a new instance by wrapping the given scorer. */	TokenNameCOMMENT_JAVADOC	 Creates a new instance by wrapping the given scorer. 
public	TokenNamepublic	
ScoreCachingWrappingScorer	TokenNameIdentifier	 Score Caching Wrapping Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
collector	TokenNameIdentifier	 collector
,	TokenNameCOMMA	
int	TokenNameint	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
int	TokenNameint	
firstDocID	TokenNameIdentifier	 first Doc ID
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
collector	TokenNameIdentifier	 collector
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
firstDocID	TokenNameIdentifier	 first Doc ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Similarity	TokenNameIdentifier	 Similarity
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
!=	TokenNameNOT_EQUAL	
curDoc	TokenNameIdentifier	 cur Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curScore	TokenNameIdentifier	 cur Score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curDoc	TokenNameIdentifier	 cur Doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
curScore	TokenNameIdentifier	 cur Score
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
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
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
return	TokenNamereturn	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
collector	TokenNameIdentifier	 collector
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
collector	TokenNameIdentifier	 collector
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
return	TokenNamereturn	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
