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
/** A Scorer for queries with a required part and an optional part. * Delays skipTo() on the optional part until a score() is needed. * <br> * This <code>Scorer</code> implements {@link Scorer#skipTo(int)}. */	TokenNameCOMMENT_JAVADOC	 A Scorer for queries with a required part and an optional part. Delays skipTo() on the optional part until a score() is needed. <br> This <code>Scorer</code> implements {@link Scorer#skipTo(int)}. 
class	TokenNameclass	
ReqOptSumScorer	TokenNameIdentifier	 Req Opt Sum Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
/** The scorers passed from the constructor. * These are set to null as soon as their next() or skipTo() returns false. */	TokenNameCOMMENT_JAVADOC	 The scorers passed from the constructor. These are set to null as soon as their next() or skipTo() returns false. 
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
reqScorer	TokenNameIdentifier	 req Scorer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
optScorer	TokenNameIdentifier	 opt Scorer
;	TokenNameSEMICOLON	
/** Construct a <code>ReqOptScorer</code>. * @param reqScorer The required scorer. This must match. * @param optScorer The optional scorer. This is used for scoring only. */	TokenNameCOMMENT_JAVADOC	 Construct a <code>ReqOptScorer</code>. @param reqScorer The required scorer. This must match. @param optScorer The optional scorer. This is used for scoring only. 
public	TokenNamepublic	
ReqOptSumScorer	TokenNameIdentifier	 Req Opt Sum Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
reqScorer	TokenNameIdentifier	 req Scorer
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
optScorer	TokenNameIdentifier	 opt Scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
reqScorer	TokenNameIdentifier	 req Scorer
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reqScorer	TokenNameIdentifier	 req Scorer
=	TokenNameEQUAL	
reqScorer	TokenNameIdentifier	 req Scorer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
optScorer	TokenNameIdentifier	 opt Scorer
=	TokenNameEQUAL	
optScorer	TokenNameIdentifier	 opt Scorer
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
reqScorer	TokenNameIdentifier	 req Scorer
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
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
reqScorer	TokenNameIdentifier	 req Scorer
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
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
reqScorer	TokenNameIdentifier	 req Scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the score of the current document matching the query. * Initially invalid, until {@link #nextDoc()} is called the first time. * @return The score of the required scorer, eventually increased by the score * of the optional scorer when it also matches the current document. */	TokenNameCOMMENT_JAVADOC	 Returns the score of the current document matching the query. Initially invalid, until {@link #nextDoc()} is called the first time. @return The score of the required scorer, eventually increased by the score of the optional scorer when it also matches the current document. 
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
curDoc	TokenNameIdentifier	 cur Doc
=	TokenNameEQUAL	
reqScorer	TokenNameIdentifier	 req Scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
reqScore	TokenNameIdentifier	 req Score
=	TokenNameEQUAL	
reqScorer	TokenNameIdentifier	 req Scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
optScorer	TokenNameIdentifier	 opt Scorer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reqScore	TokenNameIdentifier	 req Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
optScorerDoc	TokenNameIdentifier	 opt Scorer Doc
=	TokenNameEQUAL	
optScorer	TokenNameIdentifier	 opt Scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
optScorerDoc	TokenNameIdentifier	 opt Scorer Doc
<	TokenNameLESS	
curDoc	TokenNameIdentifier	 cur Doc
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
optScorerDoc	TokenNameIdentifier	 opt Scorer Doc
=	TokenNameEQUAL	
optScorer	TokenNameIdentifier	 opt Scorer
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
curDoc	TokenNameIdentifier	 cur Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optScorer	TokenNameIdentifier	 opt Scorer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
reqScore	TokenNameIdentifier	 req Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
optScorerDoc	TokenNameIdentifier	 opt Scorer Doc
==	TokenNameEQUAL_EQUAL	
curDoc	TokenNameIdentifier	 cur Doc
?	TokenNameQUESTION	
reqScore	TokenNameIdentifier	 req Score
+	TokenNamePLUS	
optScorer	TokenNameIdentifier	 opt Scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
reqScore	TokenNameIdentifier	 req Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// we might have deferred advance() 	TokenNameCOMMENT_LINE	we might have deferred advance() 
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
optScorer	TokenNameIdentifier	 opt Scorer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
optScorer	TokenNameIdentifier	 opt Scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
reqScorer	TokenNameIdentifier	 req Scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
