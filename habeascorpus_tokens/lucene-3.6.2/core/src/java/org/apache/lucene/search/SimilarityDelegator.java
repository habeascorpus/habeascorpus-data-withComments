package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** Expert: Delegating scoring implementation. Useful in {@link * Query#getSimilarity(Searcher)} implementations, to override only certain * methods of a Searcher's Similarity implementation.. * @deprecated this class will be removed in 4.0. Please * subclass {@link Similarity} or {@link DefaultSimilarity} instead. */	TokenNameCOMMENT_JAVADOC	 Expert: Delegating scoring implementation. Useful in {@link Query#getSimilarity(Searcher)} implementations, to override only certain methods of a Searcher's Similarity implementation.. @deprecated this class will be removed in 4.0. Please subclass {@link Similarity} or {@link DefaultSimilarity} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
SimilarityDelegator	TokenNameIdentifier	 Similarity Delegator
extends	TokenNameextends	
Similarity	TokenNameIdentifier	 Similarity
{	TokenNameLBRACE	
private	TokenNameprivate	
Similarity	TokenNameIdentifier	 Similarity
delegee	TokenNameIdentifier	 delegee
;	TokenNameSEMICOLON	
/** Construct a {@link Similarity} that delegates all methods to another. * * @param delegee the Similarity implementation to delegate to */	TokenNameCOMMENT_JAVADOC	 Construct a {@link Similarity} that delegates all methods to another. * @param delegee the Similarity implementation to delegate to 
public	TokenNamepublic	
SimilarityDelegator	TokenNameIdentifier	 Similarity Delegator
(	TokenNameLPAREN	
Similarity	TokenNameIdentifier	 Similarity
delegee	TokenNameIdentifier	 delegee
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delegee	TokenNameIdentifier	 delegee
=	TokenNameEQUAL	
delegee	TokenNameIdentifier	 delegee
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
return	TokenNamereturn	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
queryNorm	TokenNameIdentifier	 query Norm
(	TokenNameLPAREN	
float	TokenNamefloat	
sumOfSquaredWeights	TokenNameIdentifier	 sum Of Squared Weights
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
queryNorm	TokenNameIdentifier	 query Norm
(	TokenNameLPAREN	
sumOfSquaredWeights	TokenNameIdentifier	 sum Of Squared Weights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
return	TokenNamereturn	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
sloppyFreq	TokenNameIdentifier	 sloppy Freq
(	TokenNameLPAREN	
int	TokenNameint	
distance	TokenNameIdentifier	 distance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
sloppyFreq	TokenNameIdentifier	 sloppy Freq
(	TokenNameLPAREN	
distance	TokenNameIdentifier	 distance
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
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
idf	TokenNameIdentifier	 idf
(	TokenNameLPAREN	
docFreq	TokenNameIdentifier	 doc Freq
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
coord	TokenNameIdentifier	 coord
(	TokenNameLPAREN	
int	TokenNameint	
overlap	TokenNameIdentifier	 overlap
,	TokenNameCOMMA	
int	TokenNameint	
maxOverlap	TokenNameIdentifier	 max Overlap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
coord	TokenNameIdentifier	 coord
(	TokenNameLPAREN	
overlap	TokenNameIdentifier	 overlap
,	TokenNameCOMMA	
maxOverlap	TokenNameIdentifier	 max Overlap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
scorePayload	TokenNameIdentifier	 score Payload
(	TokenNameLPAREN	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
payload	TokenNameIdentifier	 payload
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
scorePayload	TokenNameIdentifier	 score Payload
(	TokenNameLPAREN	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
payload	TokenNameIdentifier	 payload
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
