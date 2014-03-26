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
adaptive	TokenNameIdentifier	 adaptive
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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
RAMDirectory	TokenNameIdentifier	 RAM Directory
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
ExampleResult	TokenNameIdentifier	 Example Result
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
ExampleUtils	TokenNameIdentifier	 Example Utils
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
SimpleIndexer	TokenNameIdentifier	 Simple Indexer
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
AdaptiveFacetsAccumulator	TokenNameIdentifier	 Adaptive Facets Accumulator
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
/** * Driver for the adaptive sample, using the {@link AdaptiveFacetsAccumulator}. * Indexing is the same as in {@link SimpleSearcher} * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Driver for the adaptive sample, using the {@link AdaptiveFacetsAccumulator}. Indexing is the same as in {@link SimpleSearcher} * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
AdaptiveMain	TokenNameIdentifier	 Adaptive Main
{	TokenNameLBRACE	
/** * Driver for the adaptive sample. * @throws Exception on error (no detailed exception handling here for sample simplicity */	TokenNameCOMMENT_JAVADOC	 Driver for the adaptive sample. @throws Exception on error (no detailed exception handling here for sample simplicity 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
new	TokenNamenew	
AdaptiveMain	TokenNameIdentifier	 Adaptive Main
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
runSample	TokenNameIdentifier	 run Sample
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExampleUtils	TokenNameIdentifier	 Example Utils
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"DONE"	TokenNameStringLiteral	DONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ExampleResult	TokenNameIdentifier	 Example Result
runSample	TokenNameIdentifier	 run Sample
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// create Directories for the search index and for the taxonomy index 	TokenNameCOMMENT_LINE	create Directories for the search index and for the taxonomy index 
Directory	TokenNameIdentifier	 Directory
indexDir	TokenNameIdentifier	 index Dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
taxoDir	TokenNameIdentifier	 taxo Dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// index the sample documents 	TokenNameCOMMENT_LINE	index the sample documents 
ExampleUtils	TokenNameIdentifier	 Example Utils
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"index the adaptive sample documents..."	TokenNameStringLiteral	index the adaptive sample documents...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleIndexer	TokenNameIdentifier	 Simple Indexer
.	TokenNameDOT	
index	TokenNameIdentifier	 index
(	TokenNameLPAREN	
indexDir	TokenNameIdentifier	 index Dir
,	TokenNameCOMMA	
taxoDir	TokenNameIdentifier	 taxo Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExampleUtils	TokenNameIdentifier	 Example Utils
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"search the adaptive sample documents..."	TokenNameStringLiteral	search the adaptive sample documents...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
facetRes	TokenNameIdentifier	 facet Res
=	TokenNameEQUAL	
AdaptiveSearcher	TokenNameIdentifier	 Adaptive Searcher
.	TokenNameDOT	
searchWithFacets	TokenNameIdentifier	 search With Facets
(	TokenNameLPAREN	
indexDir	TokenNameIdentifier	 index Dir
,	TokenNameCOMMA	
taxoDir	TokenNameIdentifier	 taxo Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExampleResult	TokenNameIdentifier	 Example Result
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
ExampleResult	TokenNameIdentifier	 Example Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
setFacetResults	TokenNameIdentifier	 set Facet Results
(	TokenNameLPAREN	
facetRes	TokenNameIdentifier	 facet Res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
