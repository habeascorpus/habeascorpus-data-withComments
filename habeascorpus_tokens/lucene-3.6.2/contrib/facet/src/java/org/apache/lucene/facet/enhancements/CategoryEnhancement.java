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
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
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
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
TaxonomyWriter	TokenNameIdentifier	 Taxonomy Writer
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * This interface allows easy addition of enhanced category features. Usually, a * {@link CategoryEnhancement} will correspond to a {@link CategoryProperty}. * <p> * A category enhancement can contribute to the index in two possible ways: * <ol> * <li>To each category with data relevant to the enhancement, add this data to * the category's token payload, through * {@link #getCategoryTokenBytes(CategoryAttribute)}. This data will be read * during search using {@link #extractCategoryTokenData(byte[], int, int)}.</li> * <li>To each document which contains categories with data relevant to the * enhancement, add a {@link CategoryListTokenizer} through * {@link #getCategoryListTokenizer(TokenStream, EnhancementsIndexingParams, TaxonomyWriter)} * . The {@link CategoryListTokenizer} should add a single token which includes * all the enhancement relevant data from the categories. The category list * token's text is defined by {@link #getCategoryListTermText()}.</li> * </ol> * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 This interface allows easy addition of enhanced category features. Usually, a {@link CategoryEnhancement} will correspond to a {@link CategoryProperty}. <p> A category enhancement can contribute to the index in two possible ways: <ol> <li>To each category with data relevant to the enhancement, add this data to the category's token payload, through {@link #getCategoryTokenBytes(CategoryAttribute)}. This data will be read during search using {@link #extractCategoryTokenData(byte[], int, int)}.</li> <li>To each document which contains categories with data relevant to the enhancement, add a {@link CategoryListTokenizer} through {@link #getCategoryListTokenizer(TokenStream, EnhancementsIndexingParams, TaxonomyWriter)} . The {@link CategoryListTokenizer} should add a single token which includes all the enhancement relevant data from the categories. The category list token's text is defined by {@link #getCategoryListTermText()}.</li> </ol> * @lucene.experimental 
public	TokenNamepublic	
interface	TokenNameinterface	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
{	TokenNameLBRACE	
/** * Get the bytes to be added to the category token payload for this * enhancement. * <p> * <b>NOTE</b>: The returned array is copied, it is recommended to allocate a * new one each time. * <p> * The bytes generated by this method are the input of * {@link #extractCategoryTokenData(byte[], int, int)}. * * @param categoryAttribute * The attribute of the category. * @return The bytes to be added to the category token payload for this * enhancement. */	TokenNameCOMMENT_JAVADOC	 Get the bytes to be added to the category token payload for this enhancement. <p> <b>NOTE</b>: The returned array is copied, it is recommended to allocate a new one each time. <p> The bytes generated by this method are the input of {@link #extractCategoryTokenData(byte[], int, int)}. * @param categoryAttribute The attribute of the category. @return The bytes to be added to the category token payload for this enhancement. 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCategoryTokenBytes	TokenNameIdentifier	 get Category Token Bytes
(	TokenNameLPAREN	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
categoryAttribute	TokenNameIdentifier	 category Attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the data of this enhancement from a category token payload. * <p> * The input bytes for this method are generated in * {@link #getCategoryTokenBytes(CategoryAttribute)}. * * @param buffer * The payload buffer. * @param offset * The offset of this enhancement's data in the buffer. * @param length * The length of this enhancement's data (bytes). * @return An Object containing the data. */	TokenNameCOMMENT_JAVADOC	 Get the data of this enhancement from a category token payload. <p> The input bytes for this method are generated in {@link #getCategoryTokenBytes(CategoryAttribute)}. * @param buffer The payload buffer. @param offset The offset of this enhancement's data in the buffer. @param length The length of this enhancement's data (bytes). @return An Object containing the data. 
Object	TokenNameIdentifier	 Object
extractCategoryTokenData	TokenNameIdentifier	 extract Category Token Data
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Declarative method to indicate whether this enhancement generates separate * category list. * * @return {@code true} if generates category list, else {@code false}. */	TokenNameCOMMENT_JAVADOC	 Declarative method to indicate whether this enhancement generates separate category list. * @return {@code true} if generates category list, else {@code false}. 
boolean	TokenNameboolean	
generatesCategoryList	TokenNameIdentifier	 generates Category List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the text of this enhancement's category list term. * * @return The text of this enhancement's category list term. */	TokenNameCOMMENT_JAVADOC	 Returns the text of this enhancement's category list term. * @return The text of this enhancement's category list term. 
String	TokenNameIdentifier	 String
getCategoryListTermText	TokenNameIdentifier	 get Category List Term Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the {@link CategoryListTokenizer} which generates the category list for * this enhancement. If {@link #generatesCategoryList()} returns {@code false} * this method will not be called. * * @param tokenizer * The input stream containing categories. * @param indexingParams * The indexing params to use. * @param taxonomyWriter * The taxonomy to add categories and get their ordinals. * @return A {@link CategoryListTokenizer} generating the category list for * this enhancement, with {@code tokenizer} as it's input. */	TokenNameCOMMENT_JAVADOC	 Get the {@link CategoryListTokenizer} which generates the category list for this enhancement. If {@link #generatesCategoryList()} returns {@code false} this method will not be called. * @param tokenizer The input stream containing categories. @param indexingParams The indexing params to use. @param taxonomyWriter The taxonomy to add categories and get their ordinals. @return A {@link CategoryListTokenizer} generating the category list for this enhancement, with {@code tokenizer} as it's input. 
CategoryListTokenizer	TokenNameIdentifier	 Category List Tokenizer
getCategoryListTokenizer	TokenNameIdentifier	 get Category List Tokenizer
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
tokenizer	TokenNameIdentifier	 tokenizer
,	TokenNameCOMMA	
EnhancementsIndexingParams	TokenNameIdentifier	 Enhancements Indexing Params
indexingParams	TokenNameIdentifier	 indexing Params
,	TokenNameCOMMA	
TaxonomyWriter	TokenNameIdentifier	 Taxonomy Writer
taxonomyWriter	TokenNameIdentifier	 taxonomy Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get a {@link CategoryProperty} class to be retained when creating * {@link CategoryParentsStream}. * * @return the {@link CategoryProperty} class to be retained when creating * {@link CategoryParentsStream}, or {@code null} if there is no such * property. */	TokenNameCOMMENT_JAVADOC	 Get a {@link CategoryProperty} class to be retained when creating {@link CategoryParentsStream}. * @return the {@link CategoryProperty} class to be retained when creating {@link CategoryParentsStream}, or {@code null} if there is no such property. 
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CategoryProperty	TokenNameIdentifier	 Category Property
>	TokenNameGREATER	
getRetainableProperty	TokenNameIdentifier	 get Retainable Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Category enhancements must override {@link Object#equals(Object)}, as it is * used in * {@link EnhancementsPayloadIterator#getCategoryData(CategoryEnhancement)}. */	TokenNameCOMMENT_JAVADOC	 Category enhancements must override {@link Object#equals(Object)}, as it is used in {@link EnhancementsPayloadIterator#getCategoryData(CategoryEnhancement)}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
