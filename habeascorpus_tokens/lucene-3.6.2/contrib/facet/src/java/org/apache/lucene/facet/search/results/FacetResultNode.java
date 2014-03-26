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
results	TokenNameIdentifier	 results
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
FacetResultsHandler	TokenNameIdentifier	 Facet Results Handler
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
sampling	TokenNameIdentifier	 sampling
.	TokenNameDOT	
SampleFixer	TokenNameIdentifier	 Sample Fixer
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
CategoryPath	TokenNameIdentifier	 Category Path
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
/** * Result of faceted search for a certain taxonomy node. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Result of faceted search for a certain taxonomy node. * @lucene.experimental 
public	TokenNamepublic	
interface	TokenNameinterface	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
{	TokenNameLBRACE	
/** * String representation of this facet result node. * Use with caution: might return a very long string. * @param prefix prefix for each result line */	TokenNameCOMMENT_JAVADOC	 String representation of this facet result node. Use with caution: might return a very long string. @param prefix prefix for each result line 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Ordinal of the category of this result. */	TokenNameCOMMENT_JAVADOC	 Ordinal of the category of this result. 
public	TokenNamepublic	
int	TokenNameint	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Category path of the category of this result, or null if not computed, * because the application did not request to compute it. * To force computing the label in case not yet computed use * {@link #getLabel(TaxonomyReader)}. * @see FacetRequest#getNumLabel() * @see #getLabel(TaxonomyReader) */	TokenNameCOMMENT_JAVADOC	 Category path of the category of this result, or null if not computed, because the application did not request to compute it. To force computing the label in case not yet computed use {@link #getLabel(TaxonomyReader)}. @see FacetRequest#getNumLabel() @see #getLabel(TaxonomyReader) 
public	TokenNamepublic	
CategoryPath	TokenNameIdentifier	 Category Path
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Category path of the category of this result. * If not already computed, will be computed now. * <p> * Use with <b>caution</b>: loading a label for results is costly, performance wise. * Therefore force labels loading only when really needed. * @param taxonomyReader taxonomy reader for forcing (lazy) labeling of this result. * @throws IOException on error * @see FacetRequest#getNumLabel() */	TokenNameCOMMENT_JAVADOC	 Category path of the category of this result. If not already computed, will be computed now. <p> Use with <b>caution</b>: loading a label for results is costly, performance wise. Therefore force labels loading only when really needed. @param taxonomyReader taxonomy reader for forcing (lazy) labeling of this result. @throws IOException on error @see FacetRequest#getNumLabel() 
public	TokenNamepublic	
CategoryPath	TokenNameIdentifier	 Category Path
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Value of this result - usually either count or a value derived from some * computing on the association of it. */	TokenNameCOMMENT_JAVADOC	 Value of this result - usually either count or a value derived from some computing on the association of it. 
public	TokenNamepublic	
double	TokenNamedouble	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Value of screened out sub results. * <p> * If only part of valid results are returned, e.g. because top K were requested, * provide info on "what else is there under this result node". */	TokenNameCOMMENT_JAVADOC	 Value of screened out sub results. <p> If only part of valid results are returned, e.g. because top K were requested, provide info on "what else is there under this result node". 
public	TokenNamepublic	
double	TokenNamedouble	
getResidue	TokenNameIdentifier	 get Residue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Contained sub results. * These are either child facets, if a tree result was requested, or simply descendants, in case * tree result was not requested. In the first case, all returned are both descendants of * this node in the taxonomy and siblings of each other in the taxonomy. * In the latter case they are only guaranteed to be descendants of * this node in the taxonomy. */	TokenNameCOMMENT_JAVADOC	 Contained sub results. These are either child facets, if a tree result was requested, or simply descendants, in case tree result was not requested. In the first case, all returned are both descendants of this node in the taxonomy and siblings of each other in the taxonomy. In the latter case they are only guaranteed to be descendants of this node in the taxonomy. 
public	TokenNamepublic	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
getSubResults	TokenNameIdentifier	 get Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Number of sub results */	TokenNameCOMMENT_JAVADOC	 Number of sub results 
public	TokenNamepublic	
int	TokenNameint	
getNumSubResults	TokenNameIdentifier	 get Num Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Expert: Set a new value for this result node. * <p> * Allows to modify the value of this facet node. * Used for example to tune a sampled value, e.g. by * {@link SampleFixer#fixResult(org.apache.lucene.facet.search.ScoredDocIDs, FacetResult)} * @param value the new value to set * @see #getValue() * @see FacetResultsHandler#rearrangeFacetResult(FacetResult) */	TokenNameCOMMENT_JAVADOC	 Expert: Set a new value for this result node. <p> Allows to modify the value of this facet node. Used for example to tune a sampled value, e.g. by {@link SampleFixer#fixResult(org.apache.lucene.facet.search.ScoredDocIDs, FacetResult)} @param value the new value to set @see #getValue() @see FacetResultsHandler#rearrangeFacetResult(FacetResult) 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
