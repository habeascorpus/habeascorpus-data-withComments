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
List	TokenNameIdentifier	 List
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
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
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
results	TokenNameIdentifier	 results
.	TokenNameDOT	
FacetResult	TokenNameIdentifier	 Facet Result
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
results	TokenNameIdentifier	 results
.	TokenNameDOT	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
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
sampling	TokenNameIdentifier	 sampling
.	TokenNameDOT	
RandomSampler	TokenNameIdentifier	 Random Sampler
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
sampling	TokenNameIdentifier	 sampling
.	TokenNameDOT	
RepeatableSampler	TokenNameIdentifier	 Repeatable Sampler
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
sampling	TokenNameIdentifier	 sampling
.	TokenNameDOT	
Sampler	TokenNameIdentifier	 Sampler
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
sampling	TokenNameIdentifier	 sampling
.	TokenNameDOT	
SamplingAccumulator	TokenNameIdentifier	 Sampling Accumulator
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
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * {@link FacetsAccumulator} whose behavior regarding complements, sampling, * etc. is not set up front but rather is determined at accumulation time * according to the statistics of the accumulated set of documents and the * index. * <p> * Note: Sampling accumulation (Accumulation over a sampled-set of the results), * does not guarantee accurate values for * {@link FacetResult#getNumValidDescendants()} & * {@link FacetResultNode#getResidue()}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 {@link FacetsAccumulator} whose behavior regarding complements, sampling, etc. is not set up front but rather is determined at accumulation time according to the statistics of the accumulated set of documents and the index. <p> Note: Sampling accumulation (Accumulation over a sampled-set of the results), does not guarantee accurate values for {@link FacetResult#getNumValidDescendants()} & {@link FacetResultNode#getResidue()}. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
AdaptiveFacetsAccumulator	TokenNameIdentifier	 Adaptive Facets Accumulator
extends	TokenNameextends	
StandardFacetsAccumulator	TokenNameIdentifier	 Standard Facets Accumulator
{	TokenNameLBRACE	
private	TokenNameprivate	
Sampler	TokenNameIdentifier	 Sampler
sampler	TokenNameIdentifier	 sampler
=	TokenNameEQUAL	
new	TokenNamenew	
RandomSampler	TokenNameIdentifier	 Random Sampler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create an {@link AdaptiveFacetsAccumulator} * @see StandardFacetsAccumulator#StandardFacetsAccumulator(FacetSearchParams, IndexReader, TaxonomyReader) */	TokenNameCOMMENT_JAVADOC	 Create an {@link AdaptiveFacetsAccumulator} @see StandardFacetsAccumulator#StandardFacetsAccumulator(FacetSearchParams, IndexReader, TaxonomyReader) 
public	TokenNamepublic	
AdaptiveFacetsAccumulator	TokenNameIdentifier	 Adaptive Facets Accumulator
(	TokenNameLPAREN	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
searchParams	TokenNameIdentifier	 search Params
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
searchParams	TokenNameIdentifier	 search Params
,	TokenNameCOMMA	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an {@link AdaptiveFacetsAccumulator} * @see StandardFacetsAccumulator#StandardFacetsAccumulator(FacetSearchParams, IndexReader, TaxonomyReader, * IntArrayAllocator, FloatArrayAllocator) */	TokenNameCOMMENT_JAVADOC	 Create an {@link AdaptiveFacetsAccumulator} @see StandardFacetsAccumulator#StandardFacetsAccumulator(FacetSearchParams, IndexReader, TaxonomyReader, IntArrayAllocator, FloatArrayAllocator) 
public	TokenNamepublic	
AdaptiveFacetsAccumulator	TokenNameIdentifier	 Adaptive Facets Accumulator
(	TokenNameLPAREN	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
searchParams	TokenNameIdentifier	 search Params
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
,	TokenNameCOMMA	
IntArrayAllocator	TokenNameIdentifier	 Int Array Allocator
intArrayAllocator	TokenNameIdentifier	 int Array Allocator
,	TokenNameCOMMA	
FloatArrayAllocator	TokenNameIdentifier	 Float Array Allocator
floatArrayAllocator	TokenNameIdentifier	 float Array Allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
searchParams	TokenNameIdentifier	 search Params
,	TokenNameCOMMA	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
,	TokenNameCOMMA	
intArrayAllocator	TokenNameIdentifier	 int Array Allocator
,	TokenNameCOMMA	
floatArrayAllocator	TokenNameIdentifier	 float Array Allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the sampler. * @param sampler sampler to set */	TokenNameCOMMENT_JAVADOC	 Set the sampler. @param sampler sampler to set 
public	TokenNamepublic	
void	TokenNamevoid	
setSampler	TokenNameIdentifier	 set Sampler
(	TokenNameLPAREN	
Sampler	TokenNameIdentifier	 Sampler
sampler	TokenNameIdentifier	 sampler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sampler	TokenNameIdentifier	 sampler
=	TokenNameEQUAL	
sampler	TokenNameIdentifier	 sampler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
accumulate	TokenNameIdentifier	 accumulate
(	TokenNameLPAREN	
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
docids	TokenNameIdentifier	 docids
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FacetsAccumulator	TokenNameIdentifier	 Facets Accumulator
delegee	TokenNameIdentifier	 delegee
=	TokenNameEQUAL	
appropriateFacetCountingAccumulator	TokenNameIdentifier	 appropriate Facet Counting Accumulator
(	TokenNameLPAREN	
docids	TokenNameIdentifier	 docids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
delegee	TokenNameIdentifier	 delegee
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
accumulate	TokenNameIdentifier	 accumulate
(	TokenNameLPAREN	
docids	TokenNameIdentifier	 docids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
accumulate	TokenNameIdentifier	 accumulate
(	TokenNameLPAREN	
docids	TokenNameIdentifier	 docids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compute the appropriate facet accumulator to use. * If no special/clever adaptation is possible/needed return this (self). */	TokenNameCOMMENT_JAVADOC	 Compute the appropriate facet accumulator to use. If no special/clever adaptation is possible/needed return this (self). 
private	TokenNameprivate	
FacetsAccumulator	TokenNameIdentifier	 Facets Accumulator
appropriateFacetCountingAccumulator	TokenNameIdentifier	 appropriate Facet Counting Accumulator
(	TokenNameLPAREN	
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
docids	TokenNameIdentifier	 docids
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Verify that searchPareams permit sampling/complement/etc... otherwise do default 	TokenNameCOMMENT_LINE	Verify that searchPareams permit sampling/complement/etc... otherwise do default 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
mayComplement	TokenNameIdentifier	 may Complement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now we're sure we can use the sampling methods as we're in a counting only mode 	TokenNameCOMMENT_LINE	Now we're sure we can use the sampling methods as we're in a counting only mode 
// Verify that sampling is enabled and required ... otherwise do default 	TokenNameCOMMENT_LINE	Verify that sampling is enabled and required ... otherwise do default 
if	TokenNameif	
(	TokenNameLPAREN	
sampler	TokenNameIdentifier	 sampler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
sampler	TokenNameIdentifier	 sampler
.	TokenNameDOT	
shouldSample	TokenNameIdentifier	 should Sample
(	TokenNameLPAREN	
docids	TokenNameIdentifier	 docids
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SamplingAccumulator	TokenNameIdentifier	 Sampling Accumulator
samplingAccumulator	TokenNameIdentifier	 sampling Accumulator
=	TokenNameEQUAL	
new	TokenNamenew	
SamplingAccumulator	TokenNameIdentifier	 Sampling Accumulator
(	TokenNameLPAREN	
sampler	TokenNameIdentifier	 sampler
,	TokenNameCOMMA	
searchParams	TokenNameIdentifier	 search Params
,	TokenNameCOMMA	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
samplingAccumulator	TokenNameIdentifier	 sampling Accumulator
.	TokenNameDOT	
setComplementThreshold	TokenNameIdentifier	 set Complement Threshold
(	TokenNameLPAREN	
getComplementThreshold	TokenNameIdentifier	 get Complement Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
samplingAccumulator	TokenNameIdentifier	 sampling Accumulator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the sampler in effect */	TokenNameCOMMENT_JAVADOC	 @return the sampler in effect 
public	TokenNamepublic	
final	TokenNamefinal	
Sampler	TokenNameIdentifier	 Sampler
getSampler	TokenNameIdentifier	 get Sampler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sampler	TokenNameIdentifier	 sampler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
