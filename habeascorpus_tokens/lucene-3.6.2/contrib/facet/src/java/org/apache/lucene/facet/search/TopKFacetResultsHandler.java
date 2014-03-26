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
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
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
.	TokenNameDOT	
ChildrenArrays	TokenNameIdentifier	 Children Arrays
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
ResultSortUtils	TokenNameIdentifier	 Result Sort Utils
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Generate Top-K results for a particular FacetRequest. * <p> * K is global (among all results) and is defined by {@link FacetRequest#getNumResults()}. * <p> * Note: Values of 0 (Zero) are ignored by this results handler. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Generate Top-K results for a particular FacetRequest. <p> K is global (among all results) and is defined by {@link FacetRequest#getNumResults()}. <p> Note: Values of 0 (Zero) are ignored by this results handler. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
TopKFacetResultsHandler	TokenNameIdentifier	 Top K Facet Results Handler
extends	TokenNameextends	
FacetResultsHandler	TokenNameIdentifier	 Facet Results Handler
{	TokenNameLBRACE	
/** * Construct top-K results handler. * @param taxonomyReader taxonomy reader * @param facetRequest facet request being served */	TokenNameCOMMENT_JAVADOC	 Construct top-K results handler. @param taxonomyReader taxonomy reader @param facetRequest facet request being served 
public	TokenNamepublic	
TopKFacetResultsHandler	TokenNameIdentifier	 Top K Facet Results Handler
(	TokenNameLPAREN	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
,	TokenNameCOMMA	
FacetRequest	TokenNameIdentifier	 Facet Request
facetRequest	TokenNameIdentifier	 facet Request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
,	TokenNameCOMMA	
facetRequest	TokenNameIdentifier	 facet Request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// fetch top K for specific partition. 	TokenNameCOMMENT_LINE	fetch top K for specific partition. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
IntermediateFacetResult	TokenNameIdentifier	 Intermediate Facet Result
fetchPartitionResult	TokenNameIdentifier	 fetch Partition Result
(	TokenNameLPAREN	
FacetArrays	TokenNameIdentifier	 Facet Arrays
facetArrays	TokenNameIdentifier	 facet Arrays
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TopKFacetResult	TokenNameIdentifier	 Top K Facet Result
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
=	TokenNameEQUAL	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
facetRequest	TokenNameIdentifier	 facet Request
.	TokenNameDOT	
getCategoryPath	TokenNameIdentifier	 get Category Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
!=	TokenNameNOT_EQUAL	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
.	TokenNameDOT	
INVALID_ORDINAL	TokenNameIdentifier	 INVALID  ORDINAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isSelfPartition	TokenNameIdentifier	 is Self Partition
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
,	TokenNameCOMMA	
facetArrays	TokenNameIdentifier	 facet Arrays
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
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
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
facetRequest	TokenNameIdentifier	 facet Request
.	TokenNameDOT	
getValueOf	TokenNameIdentifier	 get Value Of
(	TokenNameLPAREN	
facetArrays	TokenNameIdentifier	 facet Arrays
,	TokenNameCOMMA	
ordinal	TokenNameIdentifier	 ordinal
%	TokenNameREMAINDER	
partitionSize	TokenNameIdentifier	 partition Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO (Facet): should initial value of "residue" depend on aggregator if not sum? 	TokenNameCOMMENT_LINE	TODO (Facet): should initial value of "residue" depend on aggregator if not sum? 
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
parentResultNode	TokenNameIdentifier	 parent Result Node
=	TokenNameEQUAL	
new	TokenNamenew	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Heap	TokenNameIdentifier	 Heap
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
heap	TokenNameIdentifier	 heap
=	TokenNameEQUAL	
ResultSortUtils	TokenNameIdentifier	 Result Sort Utils
.	TokenNameDOT	
createSuitableHeap	TokenNameIdentifier	 create Suitable Heap
(	TokenNameLPAREN	
facetRequest	TokenNameIdentifier	 facet Request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
totalFacets	TokenNameIdentifier	 total Facets
=	TokenNameEQUAL	
heapDescendants	TokenNameIdentifier	 heap Descendants
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
,	TokenNameCOMMA	
heap	TokenNameIdentifier	 heap
,	TokenNameCOMMA	
parentResultNode	TokenNameIdentifier	 parent Result Node
,	TokenNameCOMMA	
facetArrays	TokenNameIdentifier	 facet Arrays
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
TopKFacetResult	TokenNameIdentifier	 Top K Facet Result
(	TokenNameLPAREN	
facetRequest	TokenNameIdentifier	 facet Request
,	TokenNameCOMMA	
parentResultNode	TokenNameIdentifier	 parent Result Node
,	TokenNameCOMMA	
totalFacets	TokenNameIdentifier	 total Facets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
setHeap	TokenNameIdentifier	 set Heap
(	TokenNameLPAREN	
heap	TokenNameIdentifier	 heap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// merge given top K results into current 	TokenNameCOMMENT_LINE	merge given top K results into current 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
IntermediateFacetResult	TokenNameIdentifier	 Intermediate Facet Result
mergeResults	TokenNameIdentifier	 merge Results
(	TokenNameLPAREN	
IntermediateFacetResult	TokenNameIdentifier	 Intermediate Facet Result
...	TokenNameELLIPSIS	
tmpResults	TokenNameIdentifier	 tmp Results
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
=	TokenNameEQUAL	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
facetRequest	TokenNameIdentifier	 facet Request
.	TokenNameDOT	
getCategoryPath	TokenNameIdentifier	 get Category Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
resNode	TokenNameIdentifier	 res Node
=	TokenNameEQUAL	
new	TokenNamenew	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
totalFacets	TokenNameIdentifier	 total Facets
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Heap	TokenNameIdentifier	 Heap
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
heap	TokenNameIdentifier	 heap
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// merge other results in queue 	TokenNameCOMMENT_LINE	merge other results in queue 
for	TokenNamefor	
(	TokenNameLPAREN	
IntermediateFacetResult	TokenNameIdentifier	 Intermediate Facet Result
tmpFres	TokenNameIdentifier	 tmp Fres
:	TokenNameCOLON	
tmpResults	TokenNameIdentifier	 tmp Results
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// cast should succeed 	TokenNameCOMMENT_LINE	cast should succeed 
TopKFacetResult	TokenNameIdentifier	 Top K Facet Result
fres	TokenNameIdentifier	 fres
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TopKFacetResult	TokenNameIdentifier	 Top K Facet Result
)	TokenNameRPAREN	
tmpFres	TokenNameIdentifier	 tmp Fres
;	TokenNameSEMICOLON	
totalFacets	TokenNameIdentifier	 total Facets
+=	TokenNamePLUS_EQUAL	
fres	TokenNameIdentifier	 fres
.	TokenNameDOT	
getNumValidDescendants	TokenNameIdentifier	 get Num Valid Descendants
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the value for the result node representing the facet request 	TokenNameCOMMENT_LINE	set the value for the result node representing the facet request 
resNode	TokenNameIdentifier	 res Node
.	TokenNameDOT	
increaseValue	TokenNameIdentifier	 increase Value
(	TokenNameLPAREN	
fres	TokenNameIdentifier	 fres
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Heap	TokenNameIdentifier	 Heap
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
tmpHeap	TokenNameIdentifier	 tmp Heap
=	TokenNameEQUAL	
fres	TokenNameIdentifier	 fres
.	TokenNameDOT	
getHeap	TokenNameIdentifier	 get Heap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
heap	TokenNameIdentifier	 heap
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heap	TokenNameIdentifier	 heap
=	TokenNameEQUAL	
tmpHeap	TokenNameIdentifier	 tmp Heap
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bring sub results from heap of tmp res into result heap 	TokenNameCOMMENT_LINE	bring sub results from heap of tmp res into result heap 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
tmpHeap	TokenNameIdentifier	 tmp Heap
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
tmpHeap	TokenNameIdentifier	 tmp Heap
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resNode	TokenNameIdentifier	 res Node
.	TokenNameDOT	
increaseResidue	TokenNameIdentifier	 increase Residue
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getResidue	TokenNameIdentifier	 get Residue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
TopKFacetResult	TokenNameIdentifier	 Top K Facet Result
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
TopKFacetResult	TokenNameIdentifier	 Top K Facet Result
(	TokenNameLPAREN	
facetRequest	TokenNameIdentifier	 facet Request
,	TokenNameCOMMA	
resNode	TokenNameIdentifier	 res Node
,	TokenNameCOMMA	
totalFacets	TokenNameIdentifier	 total Facets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
setHeap	TokenNameIdentifier	 set Heap
(	TokenNameLPAREN	
heap	TokenNameIdentifier	 heap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Finds the top K descendants of ordinal, which are at most facetRequest.getDepth() * deeper than facetRequest.getCategoryPath (whose ordinal is input parameter ordinal). * Candidates are restricted to current "counting list" and current "partition", * they join the overall priority queue pq of size K. * @return total number of descendants considered here by pq, excluding ordinal itself. */	TokenNameCOMMENT_JAVADOC	 Finds the top K descendants of ordinal, which are at most facetRequest.getDepth() deeper than facetRequest.getCategoryPath (whose ordinal is input parameter ordinal). Candidates are restricted to current "counting list" and current "partition", they join the overall priority queue pq of size K. @return total number of descendants considered here by pq, excluding ordinal itself. 
private	TokenNameprivate	
int	TokenNameint	
heapDescendants	TokenNameIdentifier	 heap Descendants
(	TokenNameLPAREN	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
,	TokenNameCOMMA	
Heap	TokenNameIdentifier	 Heap
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
pq	TokenNameIdentifier	 pq
,	TokenNameCOMMA	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
parentResultNode	TokenNameIdentifier	 parent Result Node
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
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
partitionSize	TokenNameIdentifier	 partition Size
;	TokenNameSEMICOLON	
ChildrenArrays	TokenNameIdentifier	 Children Arrays
childrenArray	TokenNameIdentifier	 children Array
=	TokenNameEQUAL	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
.	TokenNameDOT	
getChildrenArrays	TokenNameIdentifier	 get Children Arrays
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
youngestChild	TokenNameIdentifier	 youngest Child
=	TokenNameEQUAL	
childrenArray	TokenNameIdentifier	 children Array
.	TokenNameDOT	
getYoungestChildArray	TokenNameIdentifier	 get Youngest Child Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
olderSibling	TokenNameIdentifier	 older Sibling
=	TokenNameEQUAL	
childrenArray	TokenNameIdentifier	 children Array
.	TokenNameDOT	
getOlderSiblingArray	TokenNameIdentifier	 get Older Sibling Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
reusable	TokenNameIdentifier	 reusable
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
localDepth	TokenNameIdentifier	 local Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
=	TokenNameEQUAL	
facetRequest	TokenNameIdentifier	 facet Request
.	TokenNameDOT	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ordinalStack	TokenNameIdentifier	 ordinal Stack
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
childrenCounter	TokenNameIdentifier	 children Counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
tosOrdinal	TokenNameIdentifier	 tos Ordinal
;	TokenNameSEMICOLON	
// top of stack element 	TokenNameCOMMENT_LINE	top of stack element 
int	TokenNameint	
yc	TokenNameIdentifier	 yc
=	TokenNameEQUAL	
youngestChild	TokenNameIdentifier	 youngest Child
[	TokenNameLBRACKET	
ordinal	TokenNameIdentifier	 ordinal
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
yc	TokenNameIdentifier	 yc
>=	TokenNameGREATER_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yc	TokenNameIdentifier	 yc
=	TokenNameEQUAL	
olderSibling	TokenNameIdentifier	 older Sibling
[	TokenNameLBRACKET	
yc	TokenNameIdentifier	 yc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// make use of the fact that TaxonomyReader.INVALID_ORDINAL == -1, < endOffset 	TokenNameCOMMENT_LINE	make use of the fact that TaxonomyReader.INVALID_ORDINAL == -1, < endOffset 
// and it, too, can stop the loop. 	TokenNameCOMMENT_LINE	and it, too, can stop the loop. 
ordinalStack	TokenNameIdentifier	 ordinal Stack
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
localDepth	TokenNameIdentifier	 local Depth
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
yc	TokenNameIdentifier	 yc
;	TokenNameSEMICOLON	
/* * stack holds input parameter ordinal in position 0. * Other elements are < endoffset. * Only top of stack can be TaxonomyReader.INVALID_ORDINAL, and this if and only if * the element below it exhausted all its children: has them all processed. * * stack elements are processed (counted and accumulated) only if they * belong to current partition (between offset and endoffset) and first time * they are on top of stack * * loop as long as stack is not empty of elements other than input ordinal, or for a little while -- it sibling */	TokenNameCOMMENT_BLOCK	 stack holds input parameter ordinal in position 0. Other elements are < endoffset. Only top of stack can be TaxonomyReader.INVALID_ORDINAL, and this if and only if the element below it exhausted all its children: has them all processed. * stack elements are processed (counted and accumulated) only if they belong to current partition (between offset and endoffset) and first time they are on top of stack * loop as long as stack is not empty of elements other than input ordinal, or for a little while -- it sibling 
while	TokenNamewhile	
(	TokenNameLPAREN	
localDepth	TokenNameIdentifier	 local Depth
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tosOrdinal	TokenNameIdentifier	 tos Ordinal
=	TokenNameEQUAL	
ordinalStack	TokenNameIdentifier	 ordinal Stack
[	TokenNameLBRACKET	
localDepth	TokenNameIdentifier	 local Depth
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tosOrdinal	TokenNameIdentifier	 tos Ordinal
==	TokenNameEQUAL_EQUAL	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
.	TokenNameDOT	
INVALID_ORDINAL	TokenNameIdentifier	 INVALID  ORDINAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// element below tos has all its children, and itself, all processed 	TokenNameCOMMENT_LINE	element below tos has all its children, and itself, all processed 
// need to proceed to its sibling 	TokenNameCOMMENT_LINE	need to proceed to its sibling 
localDepth	TokenNameIdentifier	 local Depth
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// change element now on top of stack to its sibling. 	TokenNameCOMMENT_LINE	change element now on top of stack to its sibling. 
ordinalStack	TokenNameIdentifier	 ordinal Stack
[	TokenNameLBRACKET	
localDepth	TokenNameIdentifier	 local Depth
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
olderSibling	TokenNameIdentifier	 older Sibling
[	TokenNameLBRACKET	
ordinalStack	TokenNameIdentifier	 ordinal Stack
[	TokenNameLBRACKET	
localDepth	TokenNameIdentifier	 local Depth
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// top of stack is not invalid, this is the first time we see it on top of stack. 	TokenNameCOMMENT_LINE	top of stack is not invalid, this is the first time we see it on top of stack. 
// collect it, if belongs to current partition, and then push its kids on itself, if applicable 	TokenNameCOMMENT_LINE	collect it, if belongs to current partition, and then push its kids on itself, if applicable 
if	TokenNameif	
(	TokenNameLPAREN	
tosOrdinal	TokenNameIdentifier	 tos Ordinal
>=	TokenNameGREATER_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// tosOrdinal resides in current partition 	TokenNameCOMMENT_LINE	tosOrdinal resides in current partition 
int	TokenNameint	
relativeOrdinal	TokenNameIdentifier	 relative Ordinal
=	TokenNameEQUAL	
tosOrdinal	TokenNameIdentifier	 tos Ordinal
%	TokenNameREMAINDER	
partitionSize	TokenNameIdentifier	 partition Size
;	TokenNameSEMICOLON	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
facetRequest	TokenNameIdentifier	 facet Request
.	TokenNameDOT	
getValueOf	TokenNameIdentifier	 get Value Of
(	TokenNameLPAREN	
facetArrays	TokenNameIdentifier	 facet Arrays
,	TokenNameCOMMA	
relativeOrdinal	TokenNameIdentifier	 relative Ordinal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Count current ordinal -- the TOS 	TokenNameCOMMENT_LINE	Count current ordinal -- the TOS 
if	TokenNameif	
(	TokenNameLPAREN	
reusable	TokenNameIdentifier	 reusable
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reusable	TokenNameIdentifier	 reusable
=	TokenNameEQUAL	
new	TokenNamenew	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
(	TokenNameLPAREN	
tosOrdinal	TokenNameIdentifier	 tos Ordinal
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// it is safe to cast since reusable was created here. 	TokenNameCOMMENT_LINE	it is safe to cast since reusable was created here. 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
)	TokenNameRPAREN	
reusable	TokenNameIdentifier	 reusable
)	TokenNameRPAREN	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
tosOrdinal	TokenNameIdentifier	 tos Ordinal
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
childrenCounter	TokenNameIdentifier	 children Counter
;	TokenNameSEMICOLON	
reusable	TokenNameIdentifier	 reusable
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
reusable	TokenNameIdentifier	 reusable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reusable	TokenNameIdentifier	 reusable
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO (Facet): is other logic (not add) needed, per aggregator? 	TokenNameCOMMENT_LINE	TODO (Facet): is other logic (not add) needed, per aggregator? 
parentResultNode	TokenNameIdentifier	 parent Result Node
.	TokenNameDOT	
increaseResidue	TokenNameIdentifier	 increase Residue
(	TokenNameLPAREN	
reusable	TokenNameIdentifier	 reusable
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localDepth	TokenNameIdentifier	 local Depth
<	TokenNameLESS	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// push kid of current tos 	TokenNameCOMMENT_LINE	push kid of current tos 
yc	TokenNameIdentifier	 yc
=	TokenNameEQUAL	
youngestChild	TokenNameIdentifier	 youngest Child
[	TokenNameLBRACKET	
tosOrdinal	TokenNameIdentifier	 tos Ordinal
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
yc	TokenNameIdentifier	 yc
>=	TokenNameGREATER_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yc	TokenNameIdentifier	 yc
=	TokenNameEQUAL	
olderSibling	TokenNameIdentifier	 older Sibling
[	TokenNameLBRACKET	
yc	TokenNameIdentifier	 yc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ordinalStack	TokenNameIdentifier	 ordinal Stack
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
localDepth	TokenNameIdentifier	 local Depth
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
yc	TokenNameIdentifier	 yc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// localDepth == depth; current tos exhausted its possible children, mark this by pushing INVALID_ORDINAL 	TokenNameCOMMENT_LINE	localDepth == depth; current tos exhausted its possible children, mark this by pushing INVALID_ORDINAL 
ordinalStack	TokenNameIdentifier	 ordinal Stack
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
localDepth	TokenNameIdentifier	 local Depth
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
.	TokenNameDOT	
INVALID_ORDINAL	TokenNameIdentifier	 INVALID  ORDINAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// endof while stack is not empty 	TokenNameCOMMENT_LINE	endof while stack is not empty 
return	TokenNamereturn	
childrenCounter	TokenNameIdentifier	 children Counter
;	TokenNameSEMICOLON	
// we're done 	TokenNameCOMMENT_LINE	we're done 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
FacetResult	TokenNameIdentifier	 Facet Result
renderFacetResult	TokenNameIdentifier	 render Facet Result
(	TokenNameLPAREN	
IntermediateFacetResult	TokenNameIdentifier	 Intermediate Facet Result
tmpResult	TokenNameIdentifier	 tmp Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TopKFacetResult	TokenNameIdentifier	 Top K Facet Result
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TopKFacetResult	TokenNameIdentifier	 Top K Facet Result
)	TokenNameRPAREN	
tmpResult	TokenNameIdentifier	 tmp Result
;	TokenNameSEMICOLON	
// cast is safe by contract of this class 	TokenNameCOMMENT_LINE	cast is safe by contract of this class 
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Heap	TokenNameIdentifier	 Heap
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
heap	TokenNameIdentifier	 heap
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getHeap	TokenNameIdentifier	 get Heap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
resNode	TokenNameIdentifier	 res Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
)	TokenNameRPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// cast safe too 	TokenNameCOMMENT_LINE	cast safe too 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resNode	TokenNameIdentifier	 res Node
.	TokenNameDOT	
insertSubResult	TokenNameIdentifier	 insert Sub Result
(	TokenNameLPAREN	
heap	TokenNameIdentifier	 heap
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
FacetResult	TokenNameIdentifier	 Facet Result
rearrangeFacetResult	TokenNameIdentifier	 rearrange Facet Result
(	TokenNameLPAREN	
FacetResult	TokenNameIdentifier	 Facet Result
facetResult	TokenNameIdentifier	 facet Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TopKFacetResult	TokenNameIdentifier	 Top K Facet Result
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TopKFacetResult	TokenNameIdentifier	 Top K Facet Result
)	TokenNameRPAREN	
facetResult	TokenNameIdentifier	 facet Result
;	TokenNameSEMICOLON	
// cast is safe by contract of this class 	TokenNameCOMMENT_LINE	cast is safe by contract of this class 
Heap	TokenNameIdentifier	 Heap
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
heap	TokenNameIdentifier	 heap
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getHeap	TokenNameIdentifier	 get Heap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
heap	TokenNameIdentifier	 heap
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// just to be safe 	TokenNameCOMMENT_LINE	just to be safe 
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
topFrn	TokenNameIdentifier	 top Frn
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
)	TokenNameRPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// safe cast 	TokenNameCOMMENT_LINE	safe cast 
for	TokenNamefor	
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
frn	TokenNameIdentifier	 frn
:	TokenNameCOLON	
topFrn	TokenNameIdentifier	 top Frn
.	TokenNameDOT	
getSubResults	TokenNameIdentifier	 get Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heap	TokenNameIdentifier	 heap
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
frn	TokenNameIdentifier	 frn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
subResults	TokenNameIdentifier	 sub Results
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subResults	TokenNameIdentifier	 sub Results
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
heap	TokenNameIdentifier	 heap
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
topFrn	TokenNameIdentifier	 top Frn
.	TokenNameDOT	
setSubResults	TokenNameIdentifier	 set Sub Results
(	TokenNameLPAREN	
subResults	TokenNameIdentifier	 sub Results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
// label top K sub results 	TokenNameCOMMENT_LINE	label top K sub results 
public	TokenNamepublic	
void	TokenNamevoid	
labelResult	TokenNameIdentifier	 label Result
(	TokenNameLPAREN	
FacetResult	TokenNameIdentifier	 Facet Result
facetResult	TokenNameIdentifier	 facet Result
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
facetResult	TokenNameIdentifier	 facet Result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// any result to label? 	TokenNameCOMMENT_LINE	any result to label? 
FacetResultNode	TokenNameIdentifier	 Facet Result Node
facetResultNode	TokenNameIdentifier	 facet Result Node
=	TokenNameEQUAL	
facetResult	TokenNameIdentifier	 facet Result
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
facetResultNode	TokenNameIdentifier	 facet Result Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// any result to label? 	TokenNameCOMMENT_LINE	any result to label? 
facetResultNode	TokenNameIdentifier	 facet Result Node
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
num2label	TokenNameIdentifier	 num2label
=	TokenNameEQUAL	
facetRequest	TokenNameIdentifier	 facet Request
.	TokenNameDOT	
getNumLabel	TokenNameIdentifier	 get Num Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
frn	TokenNameIdentifier	 frn
:	TokenNameCOLON	
facetResultNode	TokenNameIdentifier	 facet Result Node
.	TokenNameDOT	
getSubResults	TokenNameIdentifier	 get Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
num2label	TokenNameIdentifier	 num2label
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
frn	TokenNameIdentifier	 frn
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////////////////////// 
//////////////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////////////////////// 
/** * Private Mutable implementation of result of faceted search. */	TokenNameCOMMENT_JAVADOC	 Private Mutable implementation of result of faceted search. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
TopKFacetResult	TokenNameIdentifier	 Top K Facet Result
extends	TokenNameextends	
FacetResult	TokenNameIdentifier	 Facet Result
implements	TokenNameimplements	
IntermediateFacetResult	TokenNameIdentifier	 Intermediate Facet Result
{	TokenNameLBRACE	
// TODO (Facet): is it worth to override PriorityQueue.getSentinelObject() 	TokenNameCOMMENT_LINE	TODO (Facet): is it worth to override PriorityQueue.getSentinelObject() 
// for any of our PQs? 	TokenNameCOMMENT_LINE	for any of our PQs? 
private	TokenNameprivate	
Heap	TokenNameIdentifier	 Heap
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
heap	TokenNameIdentifier	 heap
;	TokenNameSEMICOLON	
/** * Create a Facet Result. * @param facetRequest Request for which this result was obtained. * @param facetResultNode top result node for this facet result. * @param totalFacets - number of children of the targetFacet, up till the requested depth. */	TokenNameCOMMENT_JAVADOC	 Create a Facet Result. @param facetRequest Request for which this result was obtained. @param facetResultNode top result node for this facet result. @param totalFacets - number of children of the targetFacet, up till the requested depth. 
TopKFacetResult	TokenNameIdentifier	 Top K Facet Result
(	TokenNameLPAREN	
FacetRequest	TokenNameIdentifier	 Facet Request
facetRequest	TokenNameIdentifier	 facet Request
,	TokenNameCOMMA	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
facetResultNode	TokenNameIdentifier	 facet Result Node
,	TokenNameCOMMA	
int	TokenNameint	
totalFacets	TokenNameIdentifier	 total Facets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
facetRequest	TokenNameIdentifier	 facet Request
,	TokenNameCOMMA	
facetResultNode	TokenNameIdentifier	 facet Result Node
,	TokenNameCOMMA	
totalFacets	TokenNameIdentifier	 total Facets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the heap */	TokenNameCOMMENT_JAVADOC	 @return the heap 
public	TokenNamepublic	
Heap	TokenNameIdentifier	 Heap
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
getHeap	TokenNameIdentifier	 get Heap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
heap	TokenNameIdentifier	 heap
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the heap for this result. * @param heap heap top be set. */	TokenNameCOMMENT_JAVADOC	 Set the heap for this result. @param heap heap top be set. 
public	TokenNamepublic	
void	TokenNamevoid	
setHeap	TokenNameIdentifier	 set Heap
(	TokenNameLPAREN	
Heap	TokenNameIdentifier	 Heap
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
heap	TokenNameIdentifier	 heap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
heap	TokenNameIdentifier	 heap
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	//////////////////////////////////////////////////// 
}	TokenNameRBRACE	
