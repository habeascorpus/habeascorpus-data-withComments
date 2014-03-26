package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** A TermInfo is the record of information stored for a term.*/	TokenNameCOMMENT_JAVADOC	 A TermInfo is the record of information stored for a term.
class	TokenNameclass	
TermInfo	TokenNameIdentifier	 Term Info
{	TokenNameLBRACE	
/** The number of documents which contain the term. */	TokenNameCOMMENT_JAVADOC	 The number of documents which contain the term. 
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
freqPointer	TokenNameIdentifier	 freq Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
proxPointer	TokenNameIdentifier	 prox Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
skipOffset	TokenNameIdentifier	 skip Offset
;	TokenNameSEMICOLON	
TermInfo	TokenNameIdentifier	 Term Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
TermInfo	TokenNameIdentifier	 Term Info
(	TokenNameLPAREN	
int	TokenNameint	
df	TokenNameIdentifier	 df
,	TokenNameCOMMA	
long	TokenNamelong	
fp	TokenNameIdentifier	 fp
,	TokenNameCOMMA	
long	TokenNamelong	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docFreq	TokenNameIdentifier	 doc Freq
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
;	TokenNameSEMICOLON	
freqPointer	TokenNameIdentifier	 freq Pointer
=	TokenNameEQUAL	
fp	TokenNameIdentifier	 fp
;	TokenNameSEMICOLON	
proxPointer	TokenNameIdentifier	 prox Pointer
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TermInfo	TokenNameIdentifier	 Term Info
(	TokenNameLPAREN	
TermInfo	TokenNameIdentifier	 Term Info
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docFreq	TokenNameIdentifier	 doc Freq
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
freqPointer	TokenNameIdentifier	 freq Pointer
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
freqPointer	TokenNameIdentifier	 freq Pointer
;	TokenNameSEMICOLON	
proxPointer	TokenNameIdentifier	 prox Pointer
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
;	TokenNameSEMICOLON	
skipOffset	TokenNameIdentifier	 skip Offset
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
skipOffset	TokenNameIdentifier	 skip Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
,	TokenNameCOMMA	
long	TokenNamelong	
freqPointer	TokenNameIdentifier	 freq Pointer
,	TokenNameCOMMA	
long	TokenNamelong	
proxPointer	TokenNameIdentifier	 prox Pointer
,	TokenNameCOMMA	
int	TokenNameint	
skipOffset	TokenNameIdentifier	 skip Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
=	TokenNameEQUAL	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
freqPointer	TokenNameIdentifier	 freq Pointer
=	TokenNameEQUAL	
freqPointer	TokenNameIdentifier	 freq Pointer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
=	TokenNameEQUAL	
proxPointer	TokenNameIdentifier	 prox Pointer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
skipOffset	TokenNameIdentifier	 skip Offset
=	TokenNameEQUAL	
skipOffset	TokenNameIdentifier	 skip Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
TermInfo	TokenNameIdentifier	 Term Info
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docFreq	TokenNameIdentifier	 doc Freq
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
freqPointer	TokenNameIdentifier	 freq Pointer
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
freqPointer	TokenNameIdentifier	 freq Pointer
;	TokenNameSEMICOLON	
proxPointer	TokenNameIdentifier	 prox Pointer
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
;	TokenNameSEMICOLON	
skipOffset	TokenNameIdentifier	 skip Offset
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
skipOffset	TokenNameIdentifier	 skip Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
