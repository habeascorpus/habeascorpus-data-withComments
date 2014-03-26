package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
CategoryListParams	TokenNameIdentifier	 Category List Params
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
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Utilities for partitions - sizes and such * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Utilities for partitions - sizes and such * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
PartitionsUtils	TokenNameIdentifier	 Partitions Utils
{	TokenNameLBRACE	
/** * Get the offset for a given partition. That is, what is the minimum number an * ordinal could be for a particular partition. */	TokenNameCOMMENT_JAVADOC	 Get the offset for a given partition. That is, what is the minimum number an ordinal could be for a particular partition. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
partitionOffset	TokenNameIdentifier	 partition Offset
(	TokenNameLPAREN	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
int	TokenNameint	
partitionNumber	TokenNameIdentifier	 partition Number
,	TokenNameCOMMA	
final	TokenNamefinal	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
partitionNumber	TokenNameIdentifier	 partition Number
*	TokenNameMULTIPLY	
partitionSize	TokenNameIdentifier	 partition Size
(	TokenNameLPAREN	
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see #partitionOffset(FacetIndexingParams, int, TaxonomyReader) */	TokenNameCOMMENT_JAVADOC	 @see #partitionOffset(FacetIndexingParams, int, TaxonomyReader) 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
partitionOffset	TokenNameIdentifier	 partition Offset
(	TokenNameLPAREN	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
sParams	TokenNameIdentifier	 s Params
,	TokenNameCOMMA	
int	TokenNameint	
partitionNumber	TokenNameIdentifier	 partition Number
,	TokenNameCOMMA	
final	TokenNamefinal	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
partitionOffset	TokenNameIdentifier	 partition Offset
(	TokenNameLPAREN	
sParams	TokenNameIdentifier	 s Params
.	TokenNameDOT	
getFacetIndexingParams	TokenNameIdentifier	 get Facet Indexing Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
partitionNumber	TokenNameIdentifier	 partition Number
,	TokenNameCOMMA	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the partition size in this parameter, or return the size of the taxonomy, which * is smaller. (Guarantees usage of as little memory as possible at search time). */	TokenNameCOMMENT_JAVADOC	 Get the partition size in this parameter, or return the size of the taxonomy, which is smaller. (Guarantees usage of as little memory as possible at search time). 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
partitionSize	TokenNameIdentifier	 partition Size
(	TokenNameLPAREN	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
indexingParams	TokenNameIdentifier	 indexing Params
,	TokenNameCOMMA	
final	TokenNamefinal	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
indexingParams	TokenNameIdentifier	 indexing Params
.	TokenNameDOT	
getPartitionSize	TokenNameIdentifier	 get Partition Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see #partitionSize(FacetIndexingParams, TaxonomyReader) */	TokenNameCOMMENT_JAVADOC	 @see #partitionSize(FacetIndexingParams, TaxonomyReader) 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
partitionSize	TokenNameIdentifier	 partition Size
(	TokenNameLPAREN	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
sParams	TokenNameIdentifier	 s Params
,	TokenNameCOMMA	
final	TokenNamefinal	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
partitionSize	TokenNameIdentifier	 partition Size
(	TokenNameLPAREN	
sParams	TokenNameIdentifier	 s Params
.	TokenNameDOT	
getFacetIndexingParams	TokenNameIdentifier	 get Facet Indexing Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Partition number of an ordinal. * <p> * This allows to locate the partition containing a certain (facet) ordinal. * @see FacetIndexingParams#getPartitionSize() */	TokenNameCOMMENT_JAVADOC	 Partition number of an ordinal. <p> This allows to locate the partition containing a certain (facet) ordinal. @see FacetIndexingParams#getPartitionSize() 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
partitionNumber	TokenNameIdentifier	 partition Number
(	TokenNameLPAREN	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ordinal	TokenNameIdentifier	 ordinal
/	TokenNameDIVIDE	
iParams	TokenNameIdentifier	 i Params
.	TokenNameDOT	
getPartitionSize	TokenNameIdentifier	 get Partition Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see #partitionNumber(FacetIndexingParams, int) */	TokenNameCOMMENT_JAVADOC	 @see #partitionNumber(FacetIndexingParams, int) 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
partitionNumber	TokenNameIdentifier	 partition Number
(	TokenNameLPAREN	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
sParams	TokenNameIdentifier	 s Params
,	TokenNameCOMMA	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
partitionNumber	TokenNameIdentifier	 partition Number
(	TokenNameLPAREN	
sParams	TokenNameIdentifier	 s Params
.	TokenNameDOT	
getFacetIndexingParams	TokenNameIdentifier	 get Facet Indexing Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Partition name by category ordinal */	TokenNameCOMMENT_JAVADOC	 Partition name by category ordinal 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
partitionNameByOrdinal	TokenNameIdentifier	 partition Name By Ordinal
(	TokenNameLPAREN	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
CategoryListParams	TokenNameIdentifier	 Category List Params
clParams	TokenNameIdentifier	 cl Params
,	TokenNameCOMMA	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
partition	TokenNameIdentifier	 partition
=	TokenNameEQUAL	
partitionNumber	TokenNameIdentifier	 partition Number
(	TokenNameLPAREN	
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
partitionName	TokenNameIdentifier	 partition Name
(	TokenNameLPAREN	
clParams	TokenNameIdentifier	 cl Params
,	TokenNameCOMMA	
partition	TokenNameIdentifier	 partition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Partition name by its number */	TokenNameCOMMENT_JAVADOC	 Partition name by its number 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
partitionName	TokenNameIdentifier	 partition Name
(	TokenNameLPAREN	
CategoryListParams	TokenNameIdentifier	 Category List Params
clParams	TokenNameIdentifier	 cl Params
,	TokenNameCOMMA	
int	TokenNameint	
partition	TokenNameIdentifier	 partition
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
clParams	TokenNameIdentifier	 cl Params
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
partition	TokenNameIdentifier	 partition
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
// for backwards compatibility we do not add a partition number in this case 	TokenNameCOMMENT_LINE	for backwards compatibility we do not add a partition number in this case 
}	TokenNameRBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
+	TokenNamePLUS	
partition	TokenNameIdentifier	 partition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
