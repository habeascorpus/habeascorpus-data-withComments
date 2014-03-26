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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenStream	TokenNameIdentifier	 Token Stream
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
params	TokenNameIdentifier	 params
.	TokenNameDOT	
EnhancementsIndexingParams	TokenNameIdentifier	 Enhancements Indexing Params
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
CategoryDocumentBuilder	TokenNameIdentifier	 Category Document Builder
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
streaming	TokenNameIdentifier	 streaming
.	TokenNameDOT	
CategoryAttributesStream	TokenNameIdentifier	 Category Attributes Stream
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
streaming	TokenNameIdentifier	 streaming
.	TokenNameDOT	
CategoryListTokenizer	TokenNameIdentifier	 Category List Tokenizer
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
streaming	TokenNameIdentifier	 streaming
.	TokenNameDOT	
CategoryParentsStream	TokenNameIdentifier	 Category Parents Stream
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
streaming	TokenNameIdentifier	 streaming
.	TokenNameDOT	
CategoryTokenizer	TokenNameIdentifier	 Category Tokenizer
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
TaxonomyWriter	TokenNameIdentifier	 Taxonomy Writer
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * An {@link EnhancementsDocumentBuilder} is a {@link CategoryDocumentBuilder} * which adds categories to documents according to the list of * {@link CategoryEnhancement}s from {@link EnhancementsIndexingParams}. The * additions over {@link CategoryDocumentBuilder} could be in both category * tokens, and additional category lists. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An {@link EnhancementsDocumentBuilder} is a {@link CategoryDocumentBuilder} which adds categories to documents according to the list of {@link CategoryEnhancement}s from {@link EnhancementsIndexingParams}. The additions over {@link CategoryDocumentBuilder} could be in both category tokens, and additional category lists. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
EnhancementsDocumentBuilder	TokenNameIdentifier	 Enhancements Document Builder
extends	TokenNameextends	
CategoryDocumentBuilder	TokenNameIdentifier	 Category Document Builder
{	TokenNameLBRACE	
/** * @param taxonomyWriter * @param params * Indexing params which include {@link CategoryEnhancement}s. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 @param taxonomyWriter @param params Indexing params which include {@link CategoryEnhancement}s. @throws IOException 
public	TokenNamepublic	
EnhancementsDocumentBuilder	TokenNameIdentifier	 Enhancements Document Builder
(	TokenNameLPAREN	
TaxonomyWriter	TokenNameIdentifier	 Taxonomy Writer
taxonomyWriter	TokenNameIdentifier	 taxonomy Writer
,	TokenNameCOMMA	
EnhancementsIndexingParams	TokenNameIdentifier	 Enhancements Indexing Params
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
taxonomyWriter	TokenNameIdentifier	 taxonomy Writer
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TokenStream	TokenNameIdentifier	 Token Stream
getParentsStream	TokenNameIdentifier	 get Parents Stream
(	TokenNameLPAREN	
CategoryAttributesStream	TokenNameIdentifier	 Category Attributes Stream
categoryAttributesStream	TokenNameIdentifier	 category Attributes Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CategoryProperty	TokenNameIdentifier	 Category Property
>>	TokenNameRIGHT_SHIFT	
toRetainList	TokenNameIdentifier	 to Retain List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
EnhancementsIndexingParams	TokenNameIdentifier	 Enhancements Indexing Params
)	TokenNameRPAREN	
indexingParams	TokenNameIdentifier	 indexing Params
)	TokenNameRPAREN	
.	TokenNameDOT	
getRetainableProperties	TokenNameIdentifier	 get Retainable Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
toRetainList	TokenNameIdentifier	 to Retain List
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryParentsStream	TokenNameIdentifier	 Category Parents Stream
categoryParentsStream	TokenNameIdentifier	 category Parents Stream
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryParentsStream	TokenNameIdentifier	 Category Parents Stream
(	TokenNameLPAREN	
categoryAttributesStream	TokenNameIdentifier	 category Attributes Stream
,	TokenNameCOMMA	
taxonomyWriter	TokenNameIdentifier	 taxonomy Writer
,	TokenNameCOMMA	
indexingParams	TokenNameIdentifier	 indexing Params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CategoryProperty	TokenNameIdentifier	 Category Property
>	TokenNameGREATER	
toRetain	TokenNameIdentifier	 to Retain
:	TokenNameCOLON	
toRetainList	TokenNameIdentifier	 to Retain List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
categoryParentsStream	TokenNameIdentifier	 category Parents Stream
.	TokenNameDOT	
addRetainableProperty	TokenNameIdentifier	 add Retainable Property
(	TokenNameLPAREN	
toRetain	TokenNameIdentifier	 to Retain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
categoryParentsStream	TokenNameIdentifier	 category Parents Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getParentsStream	TokenNameIdentifier	 get Parents Stream
(	TokenNameLPAREN	
categoryAttributesStream	TokenNameIdentifier	 category Attributes Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
CategoryListTokenizer	TokenNameIdentifier	 Category List Tokenizer
getCategoryListTokenizer	TokenNameIdentifier	 get Category List Tokenizer
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
categoryStream	TokenNameIdentifier	 category Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryListTokenizer	TokenNameIdentifier	 Category List Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getCategoryListTokenizer	TokenNameIdentifier	 get Category List Tokenizer
(	TokenNameLPAREN	
categoryStream	TokenNameIdentifier	 category Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add tokenizer for each enhancement that produces category list 	TokenNameCOMMENT_LINE	Add tokenizer for each enhancement that produces category list 
for	TokenNamefor	
(	TokenNameLPAREN	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
enhancement	TokenNameIdentifier	 enhancement
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
EnhancementsIndexingParams	TokenNameIdentifier	 Enhancements Indexing Params
)	TokenNameRPAREN	
indexingParams	TokenNameIdentifier	 indexing Params
)	TokenNameRPAREN	
.	TokenNameDOT	
getCategoryEnhancements	TokenNameIdentifier	 get Category Enhancements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
enhancement	TokenNameIdentifier	 enhancement
.	TokenNameDOT	
generatesCategoryList	TokenNameIdentifier	 generates Category List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
enhancement	TokenNameIdentifier	 enhancement
.	TokenNameDOT	
getCategoryListTokenizer	TokenNameIdentifier	 get Category List Tokenizer
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
,	TokenNameCOMMA	
(	TokenNameLPAREN	
EnhancementsIndexingParams	TokenNameIdentifier	 Enhancements Indexing Params
)	TokenNameRPAREN	
indexingParams	TokenNameIdentifier	 indexing Params
,	TokenNameCOMMA	
taxonomyWriter	TokenNameIdentifier	 taxonomy Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
tokenizer	TokenNameIdentifier	 tokenizer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
CategoryTokenizer	TokenNameIdentifier	 Category Tokenizer
getCategoryTokenizer	TokenNameIdentifier	 get Category Tokenizer
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
categoryStream	TokenNameIdentifier	 category Stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
EnhancementsCategoryTokenizer	TokenNameIdentifier	 Enhancements Category Tokenizer
(	TokenNameLPAREN	
categoryStream	TokenNameIdentifier	 category Stream
,	TokenNameCOMMA	
(	TokenNameLPAREN	
EnhancementsIndexingParams	TokenNameIdentifier	 Enhancements Indexing Params
)	TokenNameRPAREN	
indexingParams	TokenNameIdentifier	 indexing Params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
