package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
params	TokenNameIdentifier	 params
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
categorypolicy	TokenNameIdentifier	 categorypolicy
.	TokenNameDOT	
OrdinalPolicy	TokenNameIdentifier	 Ordinal Policy
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
categorypolicy	TokenNameIdentifier	 categorypolicy
.	TokenNameDOT	
PathPolicy	TokenNameIdentifier	 Path Policy
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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Parameters on how facets are to be written to the index. * For example, which fields and terms are used to refer to the indexed posting list. * <P> * If non-default parameters were used during indexing, the same parameters * must also be passed during faceted search. This requirement is analogous * to the requirement during search to know which fields were indexed, and which * Analyzer was used on the text. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Parameters on how facets are to be written to the index. For example, which fields and terms are used to refer to the indexed posting list. <P> If non-default parameters were used during indexing, the same parameters must also be passed during faceted search. This requirement is analogous to the requirement during search to know which fields were indexed, and which Analyzer was used on the text. * @lucene.experimental 
public	TokenNamepublic	
interface	TokenNameinterface	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
extends	TokenNameextends	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** * The name of the category-list to put this category in, or null if this * category should not be aggregatable. * <P> * By default, all categories are written to the same category list, but * applications which know in advance that in some situations only parts * of the category hierarchy needs to be counted can divide the categories * into two or more different category lists. * <P> * If null is returned for a category, it means that this category should * not appear in any category list, and thus counts for it cannot be * aggregated. This category can still be used for drill-down, even though * the count for it is not known. */	TokenNameCOMMENT_JAVADOC	 The name of the category-list to put this category in, or null if this category should not be aggregatable. <P> By default, all categories are written to the same category list, but applications which know in advance that in some situations only parts of the category hierarchy needs to be counted can divide the categories into two or more different category lists. <P> If null is returned for a category, it means that this category should not appear in any category list, and thus counts for it cannot be aggregated. This category can still be used for drill-down, even though the count for it is not known. 
public	TokenNamepublic	
CategoryListParams	TokenNameIdentifier	 Category List Params
getCategoryListParams	TokenNameIdentifier	 get Category List Params
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
category	TokenNameIdentifier	 category
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return info about all category lists in the index. * * @see #getCategoryListParams(CategoryPath) */	TokenNameCOMMENT_JAVADOC	 Return info about all category lists in the index. * @see #getCategoryListParams(CategoryPath) 
public	TokenNamepublic	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
CategoryListParams	TokenNameIdentifier	 Category List Params
>	TokenNameGREATER	
getAllCategoryListParams	TokenNameIdentifier	 get All Category List Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO (Facet): Add special cases of exact/non-exact category term-text 	TokenNameCOMMENT_LINE	TODO (Facet): Add special cases of exact/non-exact category term-text 
/** * Return the drilldown Term-Text which does not need to do any allocations. * The number of chars set is returned. * <p> * Note: Make sure <code>buffer</code> is large enough. * @see CategoryPath#charsNeededForFullPath() */	TokenNameCOMMENT_JAVADOC	 Return the drilldown Term-Text which does not need to do any allocations. The number of chars set is returned. <p> Note: Make sure <code>buffer</code> is large enough. @see CategoryPath#charsNeededForFullPath() 
public	TokenNamepublic	
int	TokenNameint	
drillDownTermText	TokenNameIdentifier	 drill Down Term Text
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the partition size. * Same value should be used during the life time of an index. * At search time this value is compared with actual taxonomy size and their minimum is used. */	TokenNameCOMMENT_JAVADOC	 Get the partition size. Same value should be used during the life time of an index. At search time this value is compared with actual taxonomy size and their minimum is used. 
public	TokenNamepublic	
int	TokenNameint	
getPartitionSize	TokenNameIdentifier	 get Partition Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the policy for indexing category <b>paths</b>, * used for deciding how "high" to climb in taxonomy * from a category when ingesting its category paths. */	TokenNameCOMMENT_JAVADOC	 Get the policy for indexing category <b>paths</b>, used for deciding how "high" to climb in taxonomy from a category when ingesting its category paths. 
public	TokenNamepublic	
PathPolicy	TokenNameIdentifier	 Path Policy
getPathPolicy	TokenNameIdentifier	 get Path Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the policy for indexing category <b>ordinals</b>, * used for deciding how "high" to climb in taxonomy * from a category when ingesting its ordinals */	TokenNameCOMMENT_JAVADOC	 Get the policy for indexing category <b>ordinals</b>, used for deciding how "high" to climb in taxonomy from a category when ingesting its ordinals 
public	TokenNamepublic	
OrdinalPolicy	TokenNameIdentifier	 Ordinal Policy
getOrdinalPolicy	TokenNameIdentifier	 get Ordinal Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the delimiter character used internally for drill-down terms */	TokenNameCOMMENT_JAVADOC	 Get the delimiter character used internally for drill-down terms 
public	TokenNamepublic	
char	TokenNamechar	
getFacetDelimChar	TokenNameIdentifier	 get Facet Delim Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
