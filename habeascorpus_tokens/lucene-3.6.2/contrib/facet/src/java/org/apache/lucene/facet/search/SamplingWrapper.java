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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
Sampler	TokenNameIdentifier	 Sampler
.	TokenNameDOT	
SampleResult	TokenNameIdentifier	 Sample Result
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Wrap any Facets Accumulator with sampling. * <p> * Note: Sampling accumulation (Accumulation over a sampled-set of the results), * does not guarantee accurate values for * {@link FacetResult#getNumValidDescendants()} & * {@link FacetResultNode#getResidue()}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Wrap any Facets Accumulator with sampling. <p> Note: Sampling accumulation (Accumulation over a sampled-set of the results), does not guarantee accurate values for {@link FacetResult#getNumValidDescendants()} & {@link FacetResultNode#getResidue()}. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
SamplingWrapper	TokenNameIdentifier	 Sampling Wrapper
extends	TokenNameextends	
FacetsAccumulator	TokenNameIdentifier	 Facets Accumulator
{	TokenNameLBRACE	
private	TokenNameprivate	
FacetsAccumulator	TokenNameIdentifier	 Facets Accumulator
delegee	TokenNameIdentifier	 delegee
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Sampler	TokenNameIdentifier	 Sampler
sampler	TokenNameIdentifier	 sampler
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SamplingWrapper	TokenNameIdentifier	 Sampling Wrapper
(	TokenNameLPAREN	
FacetsAccumulator	TokenNameIdentifier	 Facets Accumulator
delegee	TokenNameIdentifier	 delegee
,	TokenNameCOMMA	
Sampler	TokenNameIdentifier	 Sampler
sampler	TokenNameIdentifier	 sampler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
searchParams	TokenNameIdentifier	 search Params
,	TokenNameCOMMA	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
delegee	TokenNameIdentifier	 delegee
=	TokenNameEQUAL	
delegee	TokenNameIdentifier	 delegee
;	TokenNameSEMICOLON	
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
// first let delegee accumulate without labeling at all (though 	TokenNameCOMMENT_LINE	first let delegee accumulate without labeling at all (though 
// currently it doesn't matter because we have to label all returned anyhow) 	TokenNameCOMMENT_LINE	currently it doesn't matter because we have to label all returned anyhow) 
boolean	TokenNameboolean	
origAllowLabeling	TokenNameIdentifier	 orig Allow Labeling
=	TokenNameEQUAL	
isAllowLabeling	TokenNameIdentifier	 is Allow Labeling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setAllowLabeling	TokenNameIdentifier	 set Allow Labeling
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Replacing the original searchParams with the over-sampled (and without statistics-compute) 	TokenNameCOMMENT_LINE	Replacing the original searchParams with the over-sampled (and without statistics-compute) 
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
original	TokenNameIdentifier	 original
=	TokenNameEQUAL	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
searchParams	TokenNameIdentifier	 search Params
;	TokenNameSEMICOLON	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
searchParams	TokenNameIdentifier	 search Params
=	TokenNameEQUAL	
sampler	TokenNameIdentifier	 sampler
.	TokenNameDOT	
overSampledSearchParams	TokenNameIdentifier	 over Sampled Search Params
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SampleResult	TokenNameIdentifier	 Sample Result
sampleSet	TokenNameIdentifier	 sample Set
=	TokenNameEQUAL	
sampler	TokenNameIdentifier	 sampler
.	TokenNameDOT	
getSampleSet	TokenNameIdentifier	 get Sample Set
(	TokenNameLPAREN	
docids	TokenNameIdentifier	 docids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
sampleRes	TokenNameIdentifier	 sample Res
=	TokenNameEQUAL	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
accumulate	TokenNameIdentifier	 accumulate
(	TokenNameLPAREN	
sampleSet	TokenNameIdentifier	 sample Set
.	TokenNameDOT	
docids	TokenNameIdentifier	 docids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setAllowLabeling	TokenNameIdentifier	 set Allow Labeling
(	TokenNameLPAREN	
origAllowLabeling	TokenNameIdentifier	 orig Allow Labeling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
fixedRes	TokenNameIdentifier	 fixed Res
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FacetResult	TokenNameIdentifier	 Facet Result
fres	TokenNameIdentifier	 fres
:	TokenNameCOLON	
sampleRes	TokenNameIdentifier	 sample Res
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for sure fres is not null because this is guaranteed by the delegee. 	TokenNameCOMMENT_LINE	for sure fres is not null because this is guaranteed by the delegee. 
FacetResultsHandler	TokenNameIdentifier	 Facet Results Handler
frh	TokenNameIdentifier	 frh
=	TokenNameEQUAL	
fres	TokenNameIdentifier	 fres
.	TokenNameDOT	
getFacetRequest	TokenNameIdentifier	 get Facet Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createFacetResultsHandler	TokenNameIdentifier	 create Facet Results Handler
(	TokenNameLPAREN	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fix the result of current request 	TokenNameCOMMENT_LINE	fix the result of current request 
sampler	TokenNameIdentifier	 sampler
.	TokenNameDOT	
getSampleFixer	TokenNameIdentifier	 get Sample Fixer
(	TokenNameLPAREN	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
,	TokenNameCOMMA	
searchParams	TokenNameIdentifier	 search Params
)	TokenNameRPAREN	
.	TokenNameDOT	
fixResult	TokenNameIdentifier	 fix Result
(	TokenNameLPAREN	
docids	TokenNameIdentifier	 docids
,	TokenNameCOMMA	
fres	TokenNameIdentifier	 fres
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fres	TokenNameIdentifier	 fres
=	TokenNameEQUAL	
frh	TokenNameIdentifier	 frh
.	TokenNameDOT	
rearrangeFacetResult	TokenNameIdentifier	 rearrange Facet Result
(	TokenNameLPAREN	
fres	TokenNameIdentifier	 fres
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// let delegee's handler do any 	TokenNameCOMMENT_LINE	let delegee's handler do any 
// Using the sampler to trim the extra (over-sampled) results 	TokenNameCOMMENT_LINE	Using the sampler to trim the extra (over-sampled) results 
fres	TokenNameIdentifier	 fres
=	TokenNameEQUAL	
sampler	TokenNameIdentifier	 sampler
.	TokenNameDOT	
trimResult	TokenNameIdentifier	 trim Result
(	TokenNameLPAREN	
fres	TokenNameIdentifier	 fres
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// final labeling if allowed (because labeling is a costly operation) 	TokenNameCOMMENT_LINE	final labeling if allowed (because labeling is a costly operation) 
if	TokenNameif	
(	TokenNameLPAREN	
isAllowLabeling	TokenNameIdentifier	 is Allow Labeling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
frh	TokenNameIdentifier	 frh
.	TokenNameDOT	
labelResult	TokenNameIdentifier	 label Result
(	TokenNameLPAREN	
fres	TokenNameIdentifier	 fres
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fixedRes	TokenNameIdentifier	 fixed Res
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fres	TokenNameIdentifier	 fres
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add to final results 	TokenNameCOMMENT_LINE	add to final results 
}	TokenNameRBRACE	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
searchParams	TokenNameIdentifier	 search Params
=	TokenNameEQUAL	
original	TokenNameIdentifier	 original
;	TokenNameSEMICOLON	
// Back to original params 	TokenNameCOMMENT_LINE	Back to original params 
return	TokenNamereturn	
fixedRes	TokenNameIdentifier	 fixed Res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see FacetsAccumulator#getComplementThreshold() */	TokenNameCOMMENT_JAVADOC	 @see FacetsAccumulator#getComplementThreshold() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
double	TokenNamedouble	
getComplementThreshold	TokenNameIdentifier	 get Complement Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
getComplementThreshold	TokenNameIdentifier	 get Complement Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param complementThreshold * @see FacetsAccumulator#setComplementThreshold(double) */	TokenNameCOMMENT_JAVADOC	 @param complementThreshold @see FacetsAccumulator#setComplementThreshold(double) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setComplementThreshold	TokenNameIdentifier	 set Complement Threshold
(	TokenNameLPAREN	
double	TokenNamedouble	
complementThreshold	TokenNameIdentifier	 complement Threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
setComplementThreshold	TokenNameIdentifier	 set Complement Threshold
(	TokenNameLPAREN	
complementThreshold	TokenNameIdentifier	 complement Threshold
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
isAllowLabeling	TokenNameIdentifier	 is Allow Labeling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
isAllowLabeling	TokenNameIdentifier	 is Allow Labeling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setAllowLabeling	TokenNameIdentifier	 set Allow Labeling
(	TokenNameLPAREN	
boolean	TokenNameboolean	
allowLabeling	TokenNameIdentifier	 allow Labeling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delegee	TokenNameIdentifier	 delegee
.	TokenNameDOT	
setAllowLabeling	TokenNameIdentifier	 set Allow Labeling
(	TokenNameLPAREN	
allowLabeling	TokenNameIdentifier	 allow Labeling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
