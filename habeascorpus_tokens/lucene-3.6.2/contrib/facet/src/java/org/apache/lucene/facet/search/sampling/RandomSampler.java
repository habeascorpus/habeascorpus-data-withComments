package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
sampling	TokenNameIdentifier	 sampling
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
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
ScoredDocIDsIterator	TokenNameIdentifier	 Scored Doc I Ds Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ScoredDocIdsUtils	TokenNameIdentifier	 Scored Doc Ids Utils
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Simple random sampler */	TokenNameCOMMENT_JAVADOC	 Simple random sampler 
public	TokenNamepublic	
class	TokenNameclass	
RandomSampler	TokenNameIdentifier	 Random Sampler
extends	TokenNameextends	
Sampler	TokenNameIdentifier	 Sampler
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RandomSampler	TokenNameIdentifier	 Random Sampler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
random	TokenNameIdentifier	 random
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RandomSampler	TokenNameIdentifier	 Random Sampler
(	TokenNameLPAREN	
SamplingParams	TokenNameIdentifier	 Sampling Params
params	TokenNameIdentifier	 params
,	TokenNameCOMMA	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
random	TokenNameIdentifier	 random
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
SampleResult	TokenNameIdentifier	 Sample Result
createSample	TokenNameIdentifier	 create Sample
(	TokenNameLPAREN	
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
docids	TokenNameIdentifier	 docids
,	TokenNameCOMMA	
int	TokenNameint	
actualSize	TokenNameIdentifier	 actual Size
,	TokenNameCOMMA	
int	TokenNameint	
sampleSetSize	TokenNameIdentifier	 sample Set Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sample	TokenNameIdentifier	 sample
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
sampleSetSize	TokenNameIdentifier	 sample Set Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
maxStep	TokenNameIdentifier	 max Step
=	TokenNameEQUAL	
(	TokenNameLPAREN	
actualSize	TokenNameIdentifier	 actual Size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
sampleSetSize	TokenNameIdentifier	 sample Set Size
;	TokenNameSEMICOLON	
//floor 	TokenNameCOMMENT_LINE	floor 
int	TokenNameint	
remaining	TokenNameIdentifier	 remaining
=	TokenNameEQUAL	
actualSize	TokenNameIdentifier	 actual Size
;	TokenNameSEMICOLON	
ScoredDocIDsIterator	TokenNameIdentifier	 Scored Doc I Ds Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
docids	TokenNameIdentifier	 docids
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// select sample docs with random skipStep, make sure to leave sufficient #docs for selection after last skip 	TokenNameCOMMENT_LINE	select sample docs with random skipStep, make sure to leave sufficient #docs for selection after last skip 
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
sample	TokenNameIdentifier	 sample
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
remaining	TokenNameIdentifier	 remaining
>	TokenNameGREATER	
(	TokenNameLPAREN	
sampleSetSize	TokenNameIdentifier	 sample Set Size
-	TokenNameMINUS	
maxStep	TokenNameIdentifier	 max Step
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
skipStep	TokenNameIdentifier	 skip Step
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
maxStep	TokenNameIdentifier	 max Step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Skip over 'skipStep' documents 	TokenNameCOMMENT_LINE	Skip over 'skipStep' documents 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
skipStep	TokenNameIdentifier	 skip Step
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
remaining	TokenNameIdentifier	 remaining
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sample	TokenNameIdentifier	 sample
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
getDocID	TokenNameIdentifier	 get Doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add leftover documents to the sample set 	TokenNameCOMMENT_LINE	Add leftover documents to the sample set 
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
sample	TokenNameIdentifier	 sample
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sample	TokenNameIdentifier	 sample
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
getDocID	TokenNameIdentifier	 get Doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
sampleRes	TokenNameIdentifier	 sample Res
=	TokenNameEQUAL	
ScoredDocIdsUtils	TokenNameIdentifier	 Scored Doc Ids Utils
.	TokenNameDOT	
createScoredDocIDsSubset	TokenNameIdentifier	 create Scored Doc I Ds Subset
(	TokenNameLPAREN	
docids	TokenNameIdentifier	 docids
,	TokenNameCOMMA	
sample	TokenNameIdentifier	 sample
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SampleResult	TokenNameIdentifier	 Sample Result
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
SampleResult	TokenNameIdentifier	 Sample Result
(	TokenNameLPAREN	
sampleRes	TokenNameIdentifier	 sample Res
,	TokenNameCOMMA	
sampleSetSize	TokenNameIdentifier	 sample Set Size
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
actualSize	TokenNameIdentifier	 actual Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
