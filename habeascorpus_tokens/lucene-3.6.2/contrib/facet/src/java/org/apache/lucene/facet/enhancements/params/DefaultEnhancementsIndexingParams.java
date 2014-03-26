package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
enhancements	TokenNameIdentifier	 enhancements
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
enhancements	TokenNameIdentifier	 enhancements
.	TokenNameDOT	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
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
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
CategoryProperty	TokenNameIdentifier	 Category Property
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
PerDimensionIndexingParams	TokenNameIdentifier	 Per Dimension Indexing Params
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Default implementation of {@link EnhancementsIndexingParams} * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Default implementation of {@link EnhancementsIndexingParams} * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
DefaultEnhancementsIndexingParams	TokenNameIdentifier	 Default Enhancements Indexing Params
extends	TokenNameextends	
PerDimensionIndexingParams	TokenNameIdentifier	 Per Dimension Indexing Params
implements	TokenNameimplements	
EnhancementsIndexingParams	TokenNameIdentifier	 Enhancements Indexing Params
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
>	TokenNameGREATER	
enhancedCategories	TokenNameIdentifier	 enhanced Categories
;	TokenNameSEMICOLON	
/** * Construct with a certain {@link CategoryEnhancement enhancement} * @throws IllegalArgumentException if no enhancements are provided */	TokenNameCOMMENT_JAVADOC	 Construct with a certain {@link CategoryEnhancement enhancement} @throws IllegalArgumentException if no enhancements are provided 
public	TokenNamepublic	
DefaultEnhancementsIndexingParams	TokenNameIdentifier	 Default Enhancements Indexing Params
(	TokenNameLPAREN	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
...	TokenNameELLIPSIS	
enhancements	TokenNameIdentifier	 enhancements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateparams	TokenNameIdentifier	 validateparams
(	TokenNameLPAREN	
enhancements	TokenNameIdentifier	 enhancements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addCategoryEnhancements	TokenNameIdentifier	 add Category Enhancements
(	TokenNameLPAREN	
enhancements	TokenNameIdentifier	 enhancements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
validateparams	TokenNameIdentifier	 validateparams
(	TokenNameLPAREN	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
...	TokenNameELLIPSIS	
enhancements	TokenNameIdentifier	 enhancements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
enhancements	TokenNameIdentifier	 enhancements
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
enhancements	TokenNameIdentifier	 enhancements
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"at least one enhancement is required"	TokenNameStringLiteral	at least one enhancement is required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Construct with certain {@link CategoryEnhancement enhancements} * and {@link CategoryListParams} * @throws IllegalArgumentException if no enhancements are provided */	TokenNameCOMMENT_JAVADOC	 Construct with certain {@link CategoryEnhancement enhancements} and {@link CategoryListParams} @throws IllegalArgumentException if no enhancements are provided 
public	TokenNamepublic	
DefaultEnhancementsIndexingParams	TokenNameIdentifier	 Default Enhancements Indexing Params
(	TokenNameLPAREN	
CategoryListParams	TokenNameIdentifier	 Category List Params
categoryListParams	TokenNameIdentifier	 category List Params
,	TokenNameCOMMA	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
...	TokenNameELLIPSIS	
enhancements	TokenNameIdentifier	 enhancements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
categoryListParams	TokenNameIdentifier	 category List Params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateparams	TokenNameIdentifier	 validateparams
(	TokenNameLPAREN	
enhancements	TokenNameIdentifier	 enhancements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addCategoryEnhancements	TokenNameIdentifier	 add Category Enhancements
(	TokenNameLPAREN	
enhancements	TokenNameIdentifier	 enhancements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addCategoryEnhancements	TokenNameIdentifier	 add Category Enhancements
(	TokenNameLPAREN	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
...	TokenNameELLIPSIS	
enhancements	TokenNameIdentifier	 enhancements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
enhancedCategories	TokenNameIdentifier	 enhanced Categories
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
enhancedCategories	TokenNameIdentifier	 enhanced Categories
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
categoryEnhancement	TokenNameIdentifier	 category Enhancement
:	TokenNameCOLON	
enhancements	TokenNameIdentifier	 enhancements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
enhancedCategories	TokenNameIdentifier	 enhanced Categories
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
categoryEnhancement	TokenNameIdentifier	 category Enhancement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
>	TokenNameGREATER	
getCategoryEnhancements	TokenNameIdentifier	 get Category Enhancements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
enhancedCategories	TokenNameIdentifier	 enhanced Categories
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
enhancedCategories	TokenNameIdentifier	 enhanced Categories
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
enhancedCategories	TokenNameIdentifier	 enhanced Categories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CategoryProperty	TokenNameIdentifier	 Category Property
>>	TokenNameRIGHT_SHIFT	
getRetainableProperties	TokenNameIdentifier	 get Retainable Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
enhancedCategories	TokenNameIdentifier	 enhanced Categories
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CategoryProperty	TokenNameIdentifier	 Category Property
>>	TokenNameRIGHT_SHIFT	
retainableProperties	TokenNameIdentifier	 retainable Properties
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CategoryProperty	TokenNameIdentifier	 Category Property
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
enhancement	TokenNameIdentifier	 enhancement
:	TokenNameCOLON	
enhancedCategories	TokenNameIdentifier	 enhanced Categories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
enhancement	TokenNameIdentifier	 enhancement
.	TokenNameDOT	
getRetainableProperty	TokenNameIdentifier	 get Retainable Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retainableProperties	TokenNameIdentifier	 retainable Properties
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
enhancement	TokenNameIdentifier	 enhancement
.	TokenNameDOT	
getRetainableProperty	TokenNameIdentifier	 get Retainable Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
retainableProperties	TokenNameIdentifier	 retainable Properties
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
retainableProperties	TokenNameIdentifier	 retainable Properties
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
