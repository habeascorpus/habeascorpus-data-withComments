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
cache	TokenNameIdentifier	 cache
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
HashMap	TokenNameIdentifier	 Hash Map
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
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Cache for {@link CategoryListData}, per {@link CategoryListParams}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Cache for {@link CategoryListData}, per {@link CategoryListParams}. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
CategoryListCache	TokenNameIdentifier	 Category List Cache
{	TokenNameLBRACE	
private	TokenNameprivate	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
CategoryListParams	TokenNameIdentifier	 Category List Params
,	TokenNameCOMMA	
CategoryListData	TokenNameIdentifier	 Category List Data
>	TokenNameGREATER	
cldMap	TokenNameIdentifier	 cld Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
CategoryListParams	TokenNameIdentifier	 Category List Params
,	TokenNameCOMMA	
CategoryListData	TokenNameIdentifier	 Category List Data
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Fetch the cached {@link CategoryListData} for a given {@link CategoryListParams}. */	TokenNameCOMMENT_JAVADOC	 Fetch the cached {@link CategoryListData} for a given {@link CategoryListParams}. 
public	TokenNamepublic	
CategoryListData	TokenNameIdentifier	 Category List Data
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
CategoryListParams	TokenNameIdentifier	 Category List Params
clp	TokenNameIdentifier	 clp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cldMap	TokenNameIdentifier	 cld Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
clp	TokenNameIdentifier	 clp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Register a pre-computed {@link CategoryListData}. */	TokenNameCOMMENT_JAVADOC	 Register a pre-computed {@link CategoryListData}. 
public	TokenNamepublic	
void	TokenNamevoid	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
CategoryListParams	TokenNameIdentifier	 Category List Params
clp	TokenNameIdentifier	 clp
,	TokenNameCOMMA	
CategoryListData	TokenNameIdentifier	 Category List Data
clData	TokenNameIdentifier	 cl Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cldMap	TokenNameIdentifier	 cld Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
clp	TokenNameIdentifier	 clp
,	TokenNameCOMMA	
clData	TokenNameIdentifier	 cl Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Load and register {@link CategoryListData}. */	TokenNameCOMMENT_JAVADOC	 Load and register {@link CategoryListData}. 
public	TokenNamepublic	
void	TokenNamevoid	
loadAndRegister	TokenNameIdentifier	 load And Register
(	TokenNameLPAREN	
CategoryListParams	TokenNameIdentifier	 Category List Params
clp	TokenNameIdentifier	 clp
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxo	TokenNameIdentifier	 taxo
,	TokenNameCOMMA	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
iparams	TokenNameIdentifier	 iparams
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
CategoryListData	TokenNameIdentifier	 Category List Data
clData	TokenNameIdentifier	 cl Data
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryListData	TokenNameIdentifier	 Category List Data
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
taxo	TokenNameIdentifier	 taxo
,	TokenNameCOMMA	
iparams	TokenNameIdentifier	 iparams
,	TokenNameCOMMA	
clp	TokenNameIdentifier	 clp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
clp	TokenNameIdentifier	 clp
,	TokenNameCOMMA	
clData	TokenNameIdentifier	 cl Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
