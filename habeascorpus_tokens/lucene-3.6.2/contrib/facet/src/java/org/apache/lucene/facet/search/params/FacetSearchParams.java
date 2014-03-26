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
params	TokenNameIdentifier	 params
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
DefaultFacetIndexingParams	TokenNameIdentifier	 Default Facet Indexing Params
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
params	TokenNameIdentifier	 params
.	TokenNameDOT	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
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
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
CategoryListCache	TokenNameIdentifier	 Category List Cache
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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Faceted search parameters indicate for which facets should info be gathered. * <p> * The contained facet requests define for which facets should info be gathered. * <p> * Contained faceted indexing parameters provide required info on how * to read and interpret the underlying faceted information in the search index. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Faceted search parameters indicate for which facets should info be gathered. <p> The contained facet requests define for which facets should info be gathered. <p> Contained faceted indexing parameters provide required info on how to read and interpret the underlying faceted information in the search index. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
indexingParams	TokenNameIdentifier	 indexing Params
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetRequest	TokenNameIdentifier	 Facet Request
>	TokenNameGREATER	
facetRequests	TokenNameIdentifier	 facet Requests
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CategoryListCache	TokenNameIdentifier	 Category List Cache
clCache	TokenNameIdentifier	 cl Cache
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Construct with specific faceted indexing parameters. * It is important to know the indexing parameters so as to e.g. * read facets data correctly from the index. * {@link #addFacetRequest(FacetRequest)} must be called at least once * for this faceted search to find any faceted result. * @param indexingParams Indexing faceted parameters which were used at indexing time. * @see #addFacetRequest(FacetRequest) */	TokenNameCOMMENT_JAVADOC	 Construct with specific faceted indexing parameters. It is important to know the indexing parameters so as to e.g. read facets data correctly from the index. {@link #addFacetRequest(FacetRequest)} must be called at least once for this faceted search to find any faceted result. @param indexingParams Indexing faceted parameters which were used at indexing time. @see #addFacetRequest(FacetRequest) 
public	TokenNamepublic	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
(	TokenNameLPAREN	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
indexingParams	TokenNameIdentifier	 indexing Params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
indexingParams	TokenNameIdentifier	 indexing Params
=	TokenNameEQUAL	
indexingParams	TokenNameIdentifier	 indexing Params
;	TokenNameSEMICOLON	
facetRequests	TokenNameIdentifier	 facet Requests
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FacetRequest	TokenNameIdentifier	 Facet Request
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct with default faceted indexing parameters. * Usage of this constructor is valid only if also during indexing the * default faceted indexing parameters were used. * {@link #addFacetRequest(FacetRequest)} must be called at least once * for this faceted search to find any faceted result. * @see #addFacetRequest(FacetRequest) */	TokenNameCOMMENT_JAVADOC	 Construct with default faceted indexing parameters. Usage of this constructor is valid only if also during indexing the default faceted indexing parameters were used. {@link #addFacetRequest(FacetRequest)} must be called at least once for this faceted search to find any faceted result. @see #addFacetRequest(FacetRequest) 
public	TokenNamepublic	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultFacetIndexingParams	TokenNameIdentifier	 Default Facet Indexing Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A list of {@link FacetRequest} objects, determining what to count. * If the returned collection is empty, the faceted search will return no facet results! */	TokenNameCOMMENT_JAVADOC	 A list of {@link FacetRequest} objects, determining what to count. If the returned collection is empty, the faceted search will return no facet results! 
public	TokenNamepublic	
final	TokenNamefinal	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
getFacetIndexingParams	TokenNameIdentifier	 get Facet Indexing Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
indexingParams	TokenNameIdentifier	 indexing Params
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parameters which controlled the indexing of facets, and which are also * needed during search. */	TokenNameCOMMENT_JAVADOC	 Parameters which controlled the indexing of facets, and which are also needed during search. 
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetRequest	TokenNameIdentifier	 Facet Request
>	TokenNameGREATER	
getFacetRequests	TokenNameIdentifier	 get Facet Requests
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
facetRequests	TokenNameIdentifier	 facet Requests
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a facet request to apply for this faceted search. * This method must be called at least once for faceted search * to find any faceted result. <br> * NOTE: The order of addition implies the order of the {@link FacetResult}s * @param facetRequest facet request to be added. */	TokenNameCOMMENT_JAVADOC	 Add a facet request to apply for this faceted search. This method must be called at least once for faceted search to find any faceted result. <br> NOTE: The order of addition implies the order of the {@link FacetResult}s @param facetRequest facet request to be added. 
public	TokenNamepublic	
void	TokenNamevoid	
addFacetRequest	TokenNameIdentifier	 add Facet Request
(	TokenNameLPAREN	
FacetRequest	TokenNameIdentifier	 Facet Request
facetRequest	TokenNameIdentifier	 facet Request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
facetRequest	TokenNameIdentifier	 facet Request
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Provided facetRequest must not be null"	TokenNameStringLiteral	Provided facetRequest must not be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
facetRequests	TokenNameIdentifier	 facet Requests
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
facetRequest	TokenNameIdentifier	 facet Request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
TAB	TokenNameIdentifier	 TAB
=	TokenNameEQUAL	
'\t'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
NEWLINE	TokenNameIdentifier	 NEWLINE
=	TokenNameEQUAL	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"IndexingParams: "	TokenNameStringLiteral	IndexingParams: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
NEWLINE	TokenNameIdentifier	 NEWLINE
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
TAB	TokenNameIdentifier	 TAB
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getFacetIndexingParams	TokenNameIdentifier	 get Facet Indexing Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
NEWLINE	TokenNameIdentifier	 NEWLINE
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"FacetRequests:"	TokenNameStringLiteral	FacetRequests:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FacetRequest	TokenNameIdentifier	 Facet Request
facetRequest	TokenNameIdentifier	 facet Request
:	TokenNameCOLON	
getFacetRequests	TokenNameIdentifier	 get Facet Requests
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
NEWLINE	TokenNameIdentifier	 NEWLINE
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
TAB	TokenNameIdentifier	 TAB
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
facetRequest	TokenNameIdentifier	 facet Request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the cldCache in effect */	TokenNameCOMMENT_JAVADOC	 @return the cldCache in effect 
public	TokenNamepublic	
CategoryListCache	TokenNameIdentifier	 Category List Cache
getClCache	TokenNameIdentifier	 get Cl Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clCache	TokenNameIdentifier	 cl Cache
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set Cached Category Lists data to be used in Faceted search. * @param clCache the cldCache to set */	TokenNameCOMMENT_JAVADOC	 Set Cached Category Lists data to be used in Faceted search. @param clCache the cldCache to set 
public	TokenNamepublic	
void	TokenNamevoid	
setClCache	TokenNameIdentifier	 set Cl Cache
(	TokenNameLPAREN	
CategoryListCache	TokenNameIdentifier	 Category List Cache
clCache	TokenNameIdentifier	 cl Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
clCache	TokenNameIdentifier	 cl Cache
=	TokenNameEQUAL	
clCache	TokenNameIdentifier	 cl Cache
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
