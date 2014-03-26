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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
/** * A FacetIndexingParams that utilizes different category lists, defined by the * dimension specified CategoryPaths (see * {@link PerDimensionIndexingParams#addCategoryListParams(CategoryPath, CategoryListParams)} * <p> * A 'dimension' is defined as the first or "zero-th" component in a * CategoryPath. For example, if a CategoryPath is defined as * "/Author/American/Mark Twain", then the dimension is "Author". * <p> * This class also uses the 'default' CategoryListParams (as specified by * {@link CategoryListParams#CategoryListParams()} when * {@link #getCategoryListParams(CategoryPath)} is called for a CategoryPath * whose dimension component has not been specifically defined. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A FacetIndexingParams that utilizes different category lists, defined by the dimension specified CategoryPaths (see {@link PerDimensionIndexingParams#addCategoryListParams(CategoryPath, CategoryListParams)} <p> A 'dimension' is defined as the first or "zero-th" component in a CategoryPath. For example, if a CategoryPath is defined as "/Author/American/Mark Twain", then the dimension is "Author". <p> This class also uses the 'default' CategoryListParams (as specified by {@link CategoryListParams#CategoryListParams()} when {@link #getCategoryListParams(CategoryPath)} is called for a CategoryPath whose dimension component has not been specifically defined. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
PerDimensionIndexingParams	TokenNameIdentifier	 Per Dimension Indexing Params
extends	TokenNameextends	
DefaultFacetIndexingParams	TokenNameIdentifier	 Default Facet Indexing Params
{	TokenNameLBRACE	
// "Root" or "first component" of a Category Path maps to a 	TokenNameCOMMENT_LINE	"Root" or "first component" of a Category Path maps to a 
// CategoryListParams 	TokenNameCOMMENT_LINE	CategoryListParams 
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
CategoryListParams	TokenNameIdentifier	 Category List Params
>	TokenNameGREATER	
clParamsMap	TokenNameIdentifier	 cl Params Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
CategoryListParams	TokenNameIdentifier	 Category List Params
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Construct with the default {@link CategoryListParams} as the default * CategoryListParams for unspecified CategoryPaths. */	TokenNameCOMMENT_JAVADOC	 Construct with the default {@link CategoryListParams} as the default CategoryListParams for unspecified CategoryPaths. 
public	TokenNamepublic	
PerDimensionIndexingParams	TokenNameIdentifier	 Per Dimension Indexing Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryListParams	TokenNameIdentifier	 Category List Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct with the included categoryListParams as the default * CategoryListParams for unspecified CategoryPaths. * * @param categoryListParams * the default categoryListParams to use */	TokenNameCOMMENT_JAVADOC	 Construct with the included categoryListParams as the default CategoryListParams for unspecified CategoryPaths. * @param categoryListParams the default categoryListParams to use 
public	TokenNamepublic	
PerDimensionIndexingParams	TokenNameIdentifier	 Per Dimension Indexing Params
(	TokenNameLPAREN	
CategoryListParams	TokenNameIdentifier	 Category List Params
categoryListParams	TokenNameIdentifier	 category List Params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
categoryListParams	TokenNameIdentifier	 category List Params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get all the categoryListParams, including the default. */	TokenNameCOMMENT_JAVADOC	 Get all the categoryListParams, including the default. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
CategoryListParams	TokenNameIdentifier	 Category List Params
>	TokenNameGREATER	
getAllCategoryListParams	TokenNameIdentifier	 get All Category List Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CategoryListParams	TokenNameIdentifier	 Category List Params
>	TokenNameGREATER	
vals	TokenNameIdentifier	 vals
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CategoryListParams	TokenNameIdentifier	 Category List Params
>	TokenNameGREATER	
(	TokenNameLPAREN	
clParamsMap	TokenNameIdentifier	 cl Params Map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CategoryListParams	TokenNameIdentifier	 Category List Params
clp	TokenNameIdentifier	 clp
:	TokenNameCOLON	
super	TokenNamesuper	
.	TokenNameDOT	
getAllCategoryListParams	TokenNameIdentifier	 get All Category List Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vals	TokenNameIdentifier	 vals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
clp	TokenNameIdentifier	 clp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
vals	TokenNameIdentifier	 vals
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the CategoryListParams based on the dimension or "zero-th category" * of the specified CategoryPath. */	TokenNameCOMMENT_JAVADOC	 Get the CategoryListParams based on the dimension or "zero-th category" of the specified CategoryPath. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
CategoryListParams	TokenNameIdentifier	 Category List Params
getCategoryListParams	TokenNameIdentifier	 get Category List Params
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
category	TokenNameIdentifier	 category
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
category	TokenNameIdentifier	 category
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryListParams	TokenNameIdentifier	 Category List Params
clParams	TokenNameIdentifier	 cl Params
=	TokenNameEQUAL	
clParamsMap	TokenNameIdentifier	 cl Params Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
category	TokenNameIdentifier	 category
.	TokenNameDOT	
getComponent	TokenNameIdentifier	 get Component
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clParams	TokenNameIdentifier	 cl Params
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clParams	TokenNameIdentifier	 cl Params
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getCategoryListParams	TokenNameIdentifier	 get Category List Params
(	TokenNameLPAREN	
category	TokenNameIdentifier	 category
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a CategoryListParams for a given CategoryPath's dimension or * "zero-th" category. * * @param category * @param clParams */	TokenNameCOMMENT_JAVADOC	 Add a CategoryListParams for a given CategoryPath's dimension or "zero-th" category. * @param category @param clParams 
public	TokenNamepublic	
void	TokenNamevoid	
addCategoryListParams	TokenNameIdentifier	 add Category List Params
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
category	TokenNameIdentifier	 category
,	TokenNameCOMMA	
CategoryListParams	TokenNameIdentifier	 Category List Params
clParams	TokenNameIdentifier	 cl Params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clParamsMap	TokenNameIdentifier	 cl Params Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
category	TokenNameIdentifier	 category
.	TokenNameDOT	
getComponent	TokenNameIdentifier	 get Component
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clParams	TokenNameIdentifier	 cl Params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
