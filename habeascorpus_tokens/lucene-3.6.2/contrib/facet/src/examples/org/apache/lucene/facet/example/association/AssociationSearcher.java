package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
association	TokenNameIdentifier	 association
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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
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
example	TokenNameIdentifier	 example
.	TokenNameDOT	
simple	TokenNameIdentifier	 simple
.	TokenNameDOT	
SimpleSearcher	TokenNameIdentifier	 Simple Searcher
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
association	TokenNameIdentifier	 association
.	TokenNameDOT	
AssociationFloatSumFacetRequest	TokenNameIdentifier	 Association Float Sum Facet Request
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
association	TokenNameIdentifier	 association
.	TokenNameDOT	
AssociationIntSumFacetRequest	TokenNameIdentifier	 Association Int Sum Facet Request
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
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
DirectoryTaxonomyReader	TokenNameIdentifier	 Directory Taxonomy Reader
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * AssociationSearcher searches index with facets, evaluating the facets with * their associated $int value * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 AssociationSearcher searches index with facets, evaluating the facets with their associated $int value * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
AssociationSearcher	TokenNameIdentifier	 Association Searcher
{	TokenNameLBRACE	
/** Search an index with a sum of int-association. */	TokenNameCOMMENT_JAVADOC	 Search an index with a sum of int-association. 
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
searchSumIntAssociation	TokenNameIdentifier	 search Sum Int Association
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
indexDir	TokenNameIdentifier	 index Dir
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
taxoDir	TokenNameIdentifier	 taxo Dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// prepare index reader 	TokenNameCOMMENT_LINE	prepare index reader 
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
indexDir	TokenNameIdentifier	 index Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxo	TokenNameIdentifier	 taxo
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyReader	TokenNameIdentifier	 Directory Taxonomy Reader
(	TokenNameLPAREN	
taxoDir	TokenNameIdentifier	 taxo Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AssociationIntSumFacetRequest	TokenNameIdentifier	 Association Int Sum Facet Request
facetRequest	TokenNameIdentifier	 facet Request
=	TokenNameEQUAL	
new	TokenNamenew	
AssociationIntSumFacetRequest	TokenNameIdentifier	 Association Int Sum Facet Request
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"tags"	TokenNameStringLiteral	tags
)	TokenNameRPAREN	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
SimpleSearcher	TokenNameIdentifier	 Simple Searcher
.	TokenNameDOT	
searchWithRequest	TokenNameIdentifier	 search With Request
(	TokenNameLPAREN	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
taxo	TokenNameIdentifier	 taxo
,	TokenNameCOMMA	
AssociationUtils	TokenNameIdentifier	 Association Utils
.	TokenNameDOT	
assocIndexingParams	TokenNameIdentifier	 assoc Indexing Params
,	TokenNameCOMMA	
facetRequest	TokenNameIdentifier	 facet Request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// close readers 	TokenNameCOMMENT_LINE	close readers 
taxo	TokenNameIdentifier	 taxo
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexReader	TokenNameIdentifier	 index Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Search an index with a sum of float-association. */	TokenNameCOMMENT_JAVADOC	 Search an index with a sum of float-association. 
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
searchSumFloatAssociation	TokenNameIdentifier	 search Sum Float Association
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
indexDir	TokenNameIdentifier	 index Dir
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
taxoDir	TokenNameIdentifier	 taxo Dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// prepare index reader 	TokenNameCOMMENT_LINE	prepare index reader 
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
indexDir	TokenNameIdentifier	 index Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxo	TokenNameIdentifier	 taxo
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyReader	TokenNameIdentifier	 Directory Taxonomy Reader
(	TokenNameLPAREN	
taxoDir	TokenNameIdentifier	 taxo Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AssociationFloatSumFacetRequest	TokenNameIdentifier	 Association Float Sum Facet Request
facetRequest	TokenNameIdentifier	 facet Request
=	TokenNameEQUAL	
new	TokenNamenew	
AssociationFloatSumFacetRequest	TokenNameIdentifier	 Association Float Sum Facet Request
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"genre"	TokenNameStringLiteral	genre
)	TokenNameRPAREN	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
SimpleSearcher	TokenNameIdentifier	 Simple Searcher
.	TokenNameDOT	
searchWithRequest	TokenNameIdentifier	 search With Request
(	TokenNameLPAREN	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
taxo	TokenNameIdentifier	 taxo
,	TokenNameCOMMA	
AssociationUtils	TokenNameIdentifier	 Association Utils
.	TokenNameDOT	
assocIndexingParams	TokenNameIdentifier	 assoc Indexing Params
,	TokenNameCOMMA	
facetRequest	TokenNameIdentifier	 facet Request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// close readers 	TokenNameCOMMENT_LINE	close readers 
taxo	TokenNameIdentifier	 taxo
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexReader	TokenNameIdentifier	 index Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
