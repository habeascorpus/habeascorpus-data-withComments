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
results	TokenNameIdentifier	 results
.	TokenNameDOT	
IntermediateFacetResult	TokenNameIdentifier	 Intermediate Facet Result
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
/** * Handler for facet results. * <p> * The facet results handler provided by the {@link FacetRequest} to * a {@link FacetsAccumulator}. * <p> * First it is used by {@link FacetsAccumulator} to obtain a temporary * facet result for each partition and to merge results of several partitions. * <p> * Later the accumulator invokes the handler to render the results, creating * {@link FacetResult} objects. * <p> * Last the accumulator invokes the handler to label final results. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Handler for facet results. <p> The facet results handler provided by the {@link FacetRequest} to a {@link FacetsAccumulator}. <p> First it is used by {@link FacetsAccumulator} to obtain a temporary facet result for each partition and to merge results of several partitions. <p> Later the accumulator invokes the handler to render the results, creating {@link FacetResult} objects. <p> Last the accumulator invokes the handler to label final results. * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
FacetResultsHandler	TokenNameIdentifier	 Facet Results Handler
{	TokenNameLBRACE	
/** Taxonomy for which facets are handled */	TokenNameCOMMENT_JAVADOC	 Taxonomy for which facets are handled 
protected	TokenNameprotected	
final	TokenNamefinal	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
;	TokenNameSEMICOLON	
/** * Facet request served by this handler. */	TokenNameCOMMENT_JAVADOC	 Facet request served by this handler. 
protected	TokenNameprotected	
final	TokenNamefinal	
FacetRequest	TokenNameIdentifier	 Facet Request
facetRequest	TokenNameIdentifier	 facet Request
;	TokenNameSEMICOLON	
/** * Create a faceted search handler. * @param taxonomyReader See {@link #getTaxonomyReader()}. * @param facetRequest See {@link #getFacetRequest()}. */	TokenNameCOMMENT_JAVADOC	 Create a faceted search handler. @param taxonomyReader See {@link #getTaxonomyReader()}. @param facetRequest See {@link #getFacetRequest()}. 
public	TokenNamepublic	
FacetResultsHandler	TokenNameIdentifier	 Facet Results Handler
(	TokenNameLPAREN	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
,	TokenNameCOMMA	
FacetRequest	TokenNameIdentifier	 Facet Request
facetRequest	TokenNameIdentifier	 facet Request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
=	TokenNameEQUAL	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
facetRequest	TokenNameIdentifier	 facet Request
=	TokenNameEQUAL	
facetRequest	TokenNameIdentifier	 facet Request
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fetch results of a single partition, given facet arrays for that partition, * and based on the matching documents and faceted search parameters. * * @param arrays * facet arrays for the certain partition * @param offset * offset in input arrays where partition starts * @return temporary facet result, potentially, to be passed back to * <b>this</b> result handler for merging, or <b>null</b> in case that * constructor parameter, <code>facetRequest</code>, requests an * illegal FacetResult, like, e.g., a root node category path that * does not exist in constructor parameter <code>taxonomyReader</code> * . * @throws IOException * on error */	TokenNameCOMMENT_JAVADOC	 Fetch results of a single partition, given facet arrays for that partition, and based on the matching documents and faceted search parameters. * @param arrays facet arrays for the certain partition @param offset offset in input arrays where partition starts @return temporary facet result, potentially, to be passed back to <b>this</b> result handler for merging, or <b>null</b> in case that constructor parameter, <code>facetRequest</code>, requests an illegal FacetResult, like, e.g., a root node category path that does not exist in constructor parameter <code>taxonomyReader</code> . @throws IOException on error 
public	TokenNamepublic	
abstract	TokenNameabstract	
IntermediateFacetResult	TokenNameIdentifier	 Intermediate Facet Result
fetchPartitionResult	TokenNameIdentifier	 fetch Partition Result
(	TokenNameLPAREN	
FacetArrays	TokenNameIdentifier	 Facet Arrays
arrays	TokenNameIdentifier	 arrays
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Merge results of several facet partitions. Logic of the merge is undefined * and open for interpretations. For example, a merge implementation could * keep top K results. Passed {@link IntermediateFacetResult} must be ones * that were created by this handler otherwise a {@link ClassCastException} is * thrown. In addition, all passed {@link IntermediateFacetResult} must have * the same {@link FacetRequest} otherwise an {@link IllegalArgumentException} * is thrown. * * @param tmpResults one or more temporary results created by <b>this</b> * handler. * @return temporary facet result that represents to union, as specified by * <b>this</b> handler, of the input temporary facet results. * @throws IOException on error. * @throws ClassCastException if the temporary result passed was not created * by this handler * @throws IllegalArgumentException if passed <code>facetResults</code> do not * have the same {@link FacetRequest} * @see IntermediateFacetResult#getFacetRequest() */	TokenNameCOMMENT_JAVADOC	 Merge results of several facet partitions. Logic of the merge is undefined and open for interpretations. For example, a merge implementation could keep top K results. Passed {@link IntermediateFacetResult} must be ones that were created by this handler otherwise a {@link ClassCastException} is thrown. In addition, all passed {@link IntermediateFacetResult} must have the same {@link FacetRequest} otherwise an {@link IllegalArgumentException} is thrown. * @param tmpResults one or more temporary results created by <b>this</b> handler. @return temporary facet result that represents to union, as specified by <b>this</b> handler, of the input temporary facet results. @throws IOException on error. @throws ClassCastException if the temporary result passed was not created by this handler @throws IllegalArgumentException if passed <code>facetResults</code> do not have the same {@link FacetRequest} @see IntermediateFacetResult#getFacetRequest() 
public	TokenNamepublic	
abstract	TokenNameabstract	
IntermediateFacetResult	TokenNameIdentifier	 Intermediate Facet Result
mergeResults	TokenNameIdentifier	 merge Results
(	TokenNameLPAREN	
IntermediateFacetResult	TokenNameIdentifier	 Intermediate Facet Result
...	TokenNameELLIPSIS	
tmpResults	TokenNameIdentifier	 tmp Results
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
,	TokenNameCOMMA	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
;	TokenNameSEMICOLON	
/** * Create a facet result from the temporary result. * @param tmpResult temporary result to be rendered as a {@link FacetResult} * @throws IOException on error. */	TokenNameCOMMENT_JAVADOC	 Create a facet result from the temporary result. @param tmpResult temporary result to be rendered as a {@link FacetResult} @throws IOException on error. 
public	TokenNamepublic	
abstract	TokenNameabstract	
FacetResult	TokenNameIdentifier	 Facet Result
renderFacetResult	TokenNameIdentifier	 render Facet Result
(	TokenNameLPAREN	
IntermediateFacetResult	TokenNameIdentifier	 Intermediate Facet Result
tmpResult	TokenNameIdentifier	 tmp Result
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Perform any rearrangement as required on a facet result that has changed after * it was rendered. * <P> * Possible use case: a sampling facets accumulator invoked another * other facets accumulator on a sample set of documents, obtained * rendered facet results, fixed their counts, and now it is needed * to sort the results differently according to the fixed counts. * @param facetResult result to be rearranged. * @see FacetResultNode#setValue(double) */	TokenNameCOMMENT_JAVADOC	 Perform any rearrangement as required on a facet result that has changed after it was rendered. <P> Possible use case: a sampling facets accumulator invoked another other facets accumulator on a sample set of documents, obtained rendered facet results, fixed their counts, and now it is needed to sort the results differently according to the fixed counts. @param facetResult result to be rearranged. @see FacetResultNode#setValue(double) 
public	TokenNamepublic	
abstract	TokenNameabstract	
FacetResult	TokenNameIdentifier	 Facet Result
rearrangeFacetResult	TokenNameIdentifier	 rearrange Facet Result
(	TokenNameLPAREN	
FacetResult	TokenNameIdentifier	 Facet Result
facetResult	TokenNameIdentifier	 facet Result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Label results according to settings in {@link FacetRequest}, * such as {@link FacetRequest#getNumLabel()}. * Usually invoked by {@link FacetsAccumulator#accumulate(ScoredDocIDs)} * @param facetResult facet result to be labeled. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Label results according to settings in {@link FacetRequest}, such as {@link FacetRequest#getNumLabel()}. Usually invoked by {@link FacetsAccumulator#accumulate(ScoredDocIDs)} @param facetResult facet result to be labeled. @throws IOException on error 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
labelResult	TokenNameIdentifier	 label Result
(	TokenNameLPAREN	
FacetResult	TokenNameIdentifier	 Facet Result
facetResult	TokenNameIdentifier	 facet Result
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Return taxonomy reader used for current facets accumulation operation. */	TokenNameCOMMENT_JAVADOC	 Return taxonomy reader used for current facets accumulation operation. 
public	TokenNamepublic	
final	TokenNamefinal	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
getTaxonomyReader	TokenNameIdentifier	 get Taxonomy Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the facet request served by this handler. */	TokenNameCOMMENT_JAVADOC	 Return the facet request served by this handler. 
public	TokenNamepublic	
final	TokenNamefinal	
FacetRequest	TokenNameIdentifier	 Facet Request
getFacetRequest	TokenNameIdentifier	 get Facet Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
facetRequest	TokenNameIdentifier	 facet Request
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if an array contains the partition which contains ordinal * * @param ordinal * checked facet * @param facetArrays * facet arrays for the certain partition * @param offset * offset in input arrays where partition starts */	TokenNameCOMMENT_JAVADOC	 Check if an array contains the partition which contains ordinal * @param ordinal checked facet @param facetArrays facet arrays for the certain partition @param offset offset in input arrays where partition starts 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isSelfPartition	TokenNameIdentifier	 is Self Partition
(	TokenNameLPAREN	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
,	TokenNameCOMMA	
FacetArrays	TokenNameIdentifier	 Facet Arrays
facetArrays	TokenNameIdentifier	 facet Arrays
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
partitionSize	TokenNameIdentifier	 partition Size
=	TokenNameEQUAL	
facetArrays	TokenNameIdentifier	 facet Arrays
.	TokenNameDOT	
getArraysLength	TokenNameIdentifier	 get Arrays Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ordinal	TokenNameIdentifier	 ordinal
/	TokenNameDIVIDE	
partitionSize	TokenNameIdentifier	 partition Size
==	TokenNameEQUAL_EQUAL	
offset	TokenNameIdentifier	 offset
/	TokenNameDIVIDE	
partitionSize	TokenNameIdentifier	 partition Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
