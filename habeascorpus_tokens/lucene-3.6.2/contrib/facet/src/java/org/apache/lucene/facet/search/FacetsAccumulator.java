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
params	TokenNameIdentifier	 params
.	TokenNameDOT	
FacetRequest	TokenNameIdentifier	 Facet Request
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
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Driver for Accumulating facets of faceted search requests over given * documents. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Driver for Accumulating facets of faceted search requests over given documents. * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
FacetsAccumulator	TokenNameIdentifier	 Facets Accumulator
{	TokenNameLBRACE	
/** * Default threshold for using the complements optimization. * If accumulating facets for a document set larger than this ratio of the index size than * perform the complement optimization. * @see #setComplementThreshold(double) for more info on the complements optimization. */	TokenNameCOMMENT_JAVADOC	 Default threshold for using the complements optimization. If accumulating facets for a document set larger than this ratio of the index size than perform the complement optimization. @see #setComplementThreshold(double) for more info on the complements optimization. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DEFAULT_COMPLEMENT_THRESHOLD	TokenNameIdentifier	 DEFAULT  COMPLEMENT  THRESHOLD
=	TokenNameEQUAL	
0.6	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** * Passing this to {@link #setComplementThreshold(double)} will disable using complement optimization. */	TokenNameCOMMENT_JAVADOC	 Passing this to {@link #setComplementThreshold(double)} will disable using complement optimization. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DISABLE_COMPLEMENT	TokenNameIdentifier	 DISABLE  COMPLEMENT
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
// > 1 actually 	TokenNameCOMMENT_LINE	> 1 actually 
/** * Passing this to {@link #setComplementThreshold(double)} will force using complement optimization. */	TokenNameCOMMENT_JAVADOC	 Passing this to {@link #setComplementThreshold(double)} will force using complement optimization. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
FORCE_COMPLEMENT	TokenNameIdentifier	 FORCE  COMPLEMENT
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// <=0 	TokenNameCOMMENT_LINE	<=0 
private	TokenNameprivate	
double	TokenNamedouble	
complementThreshold	TokenNameIdentifier	 complement Threshold
=	TokenNameEQUAL	
DEFAULT_COMPLEMENT_THRESHOLD	TokenNameIdentifier	 DEFAULT  COMPLEMENT  THRESHOLD
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
searchParams	TokenNameIdentifier	 search Params
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
allowLabeling	TokenNameIdentifier	 allow Labeling
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FacetsAccumulator	TokenNameIdentifier	 Facets Accumulator
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
this	TokenNamethis	
.	TokenNameDOT	
indexReader	TokenNameIdentifier	 index Reader
=	TokenNameEQUAL	
indexReader	TokenNameIdentifier	 index Reader
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
=	TokenNameEQUAL	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
searchParams	TokenNameIdentifier	 search Params
=	TokenNameEQUAL	
searchParams	TokenNameIdentifier	 search Params
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Accumulate facets over given documents, according to facet requests in effect. * @param docids documents (and their scores) for which facets are Accumulated. * @return Accumulated facets. * @throws IOException on error. */	TokenNameCOMMENT_JAVADOC	 Accumulate facets over given documents, according to facet requests in effect. @param docids documents (and their scores) for which facets are Accumulated. @return Accumulated facets. @throws IOException on error. 
// internal API note: it was considered to move the docids into the constructor as well, 	TokenNameCOMMENT_LINE	internal API note: it was considered to move the docids into the constructor as well, 
// but this prevents nice extension capabilities, especially in the way that 	TokenNameCOMMENT_LINE	but this prevents nice extension capabilities, especially in the way that 
// Sampling Accumulator works with the (any) delegated accumulator. 	TokenNameCOMMENT_LINE	Sampling Accumulator works with the (any) delegated accumulator. 
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
/** * @return the complement threshold * @see #setComplementThreshold(double) */	TokenNameCOMMENT_JAVADOC	 @return the complement threshold @see #setComplementThreshold(double) 
public	TokenNamepublic	
double	TokenNamedouble	
getComplementThreshold	TokenNameIdentifier	 get Complement Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
complementThreshold	TokenNameIdentifier	 complement Threshold
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the complement threshold. * This threshold will dictate whether the complements optimization is applied. * The optimization is to count for less documents. It is useful when the same * FacetSearchParams are used for varying sets of documents. The first time * complements is used the "total counts" are computed - counting for all the * documents in the collection. Then, only the complementing set of documents * is considered, and used to decrement from the overall counts, thereby * walking through less documents, which is faster. * <p> * Note that this optimization is only available when searching an index * whose {@link IndexReader} implements both * {@link IndexReader#directory()} and {@link IndexReader#getVersion()} * otherwise the optimization is silently disabled regardless of * the complement threshold settings. * <p> * For the default settings see {@link #DEFAULT_COMPLEMENT_THRESHOLD}. * <p> * To forcing complements in all cases pass {@link #FORCE_COMPLEMENT}. * This is mostly useful for testing purposes, as forcing complements when only * tiny fraction of available documents match the query does not make sense and * would incur performance degradations. * <p> * To disable complements pass {@link #DISABLE_COMPLEMENT}. * @param complementThreshold the complement threshold to set */	TokenNameCOMMENT_JAVADOC	 Set the complement threshold. This threshold will dictate whether the complements optimization is applied. The optimization is to count for less documents. It is useful when the same FacetSearchParams are used for varying sets of documents. The first time complements is used the "total counts" are computed - counting for all the documents in the collection. Then, only the complementing set of documents is considered, and used to decrement from the overall counts, thereby walking through less documents, which is faster. <p> Note that this optimization is only available when searching an index whose {@link IndexReader} implements both {@link IndexReader#directory()} and {@link IndexReader#getVersion()} otherwise the optimization is silently disabled regardless of the complement threshold settings. <p> For the default settings see {@link #DEFAULT_COMPLEMENT_THRESHOLD}. <p> To forcing complements in all cases pass {@link #FORCE_COMPLEMENT}. This is mostly useful for testing purposes, as forcing complements when only tiny fraction of available documents match the query does not make sense and would incur performance degradations. <p> To disable complements pass {@link #DISABLE_COMPLEMENT}. @param complementThreshold the complement threshold to set 
public	TokenNamepublic	
void	TokenNamevoid	
setComplementThreshold	TokenNameIdentifier	 set Complement Threshold
(	TokenNameLPAREN	
double	TokenNamedouble	
complementThreshold	TokenNameIdentifier	 complement Threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
complementThreshold	TokenNameIdentifier	 complement Threshold
=	TokenNameEQUAL	
complementThreshold	TokenNameIdentifier	 complement Threshold
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if labeling is allowed for this accumulator. * <p> * By default labeling is allowed. * This allows one accumulator to invoke other accumulators for accumulation * but keep to itself the responsibility of labeling. * This might br handy since labeling is a costly operation. * @return true of labeling is allowed for this accumulator * @see #setAllowLabeling(boolean) */	TokenNameCOMMENT_JAVADOC	 Check if labeling is allowed for this accumulator. <p> By default labeling is allowed. This allows one accumulator to invoke other accumulators for accumulation but keep to itself the responsibility of labeling. This might br handy since labeling is a costly operation. @return true of labeling is allowed for this accumulator @see #setAllowLabeling(boolean) 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isAllowLabeling	TokenNameIdentifier	 is Allow Labeling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
allowLabeling	TokenNameIdentifier	 allow Labeling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether labeling is allowed for this accumulator. * @param allowLabeling new setting for allow labeling * @see #isAllowLabeling() */	TokenNameCOMMENT_JAVADOC	 Set whether labeling is allowed for this accumulator. @param allowLabeling new setting for allow labeling @see #isAllowLabeling() 
protected	TokenNameprotected	
void	TokenNamevoid	
setAllowLabeling	TokenNameIdentifier	 set Allow Labeling
(	TokenNameLPAREN	
boolean	TokenNameboolean	
allowLabeling	TokenNameIdentifier	 allow Labeling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
allowLabeling	TokenNameIdentifier	 allow Labeling
=	TokenNameEQUAL	
allowLabeling	TokenNameIdentifier	 allow Labeling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** check if all requests are complementable */	TokenNameCOMMENT_JAVADOC	 check if all requests are complementable 
protected	TokenNameprotected	
boolean	TokenNameboolean	
mayComplement	TokenNameIdentifier	 may Complement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
FacetRequest	TokenNameIdentifier	 Facet Request
freq	TokenNameIdentifier	 freq
:	TokenNameCOLON	
searchParams	TokenNameIdentifier	 search Params
.	TokenNameDOT	
getFacetRequests	TokenNameIdentifier	 get Facet Requests
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
freq	TokenNameIdentifier	 freq
.	TokenNameDOT	
supportsComplements	TokenNameIdentifier	 supports Complements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
