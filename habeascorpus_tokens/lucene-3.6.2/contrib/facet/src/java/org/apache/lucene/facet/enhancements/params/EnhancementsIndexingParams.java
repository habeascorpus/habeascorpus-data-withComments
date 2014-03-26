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
enhancements	TokenNameIdentifier	 enhancements
.	TokenNameDOT	
EnhancementsDocumentBuilder	TokenNameIdentifier	 Enhancements Document Builder
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
streaming	TokenNameIdentifier	 streaming
.	TokenNameDOT	
CategoryParentsStream	TokenNameIdentifier	 Category Parents Stream
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * {@link FacetIndexingParams Facet indexing parameters} for defining * {@link CategoryEnhancement category enhancements}. It must contain at least * one enhancement, otherwise nothing is "enhanced" about it. When there are * more than one, the order matters - see {@link #getCategoryEnhancements()}. * * @see EnhancementsDocumentBuilder * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 {@link FacetIndexingParams Facet indexing parameters} for defining {@link CategoryEnhancement category enhancements}. It must contain at least one enhancement, otherwise nothing is "enhanced" about it. When there are more than one, the order matters - see {@link #getCategoryEnhancements()}. * @see EnhancementsDocumentBuilder @lucene.experimental 
public	TokenNamepublic	
interface	TokenNameinterface	
EnhancementsIndexingParams	TokenNameIdentifier	 Enhancements Indexing Params
extends	TokenNameextends	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
{	TokenNameLBRACE	
/** * Add {@link CategoryEnhancement}s to the indexing parameters * @param enhancements enhancements to add */	TokenNameCOMMENT_JAVADOC	 Add {@link CategoryEnhancement}s to the indexing parameters @param enhancements enhancements to add 
public	TokenNamepublic	
void	TokenNamevoid	
addCategoryEnhancements	TokenNameIdentifier	 add Category Enhancements
(	TokenNameLPAREN	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
...	TokenNameELLIPSIS	
enhancements	TokenNameIdentifier	 enhancements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get a list of the active category enhancements. If no enhancements exist * return {@code null}. The order of enhancements in the returned list * dictates the order in which the enhancements data appear in the category * tokens payload. * * @return A list of the active category enhancements, or {@code null} if * there are no enhancements. */	TokenNameCOMMENT_JAVADOC	 Get a list of the active category enhancements. If no enhancements exist return {@code null}. The order of enhancements in the returned list dictates the order in which the enhancements data appear in the category tokens payload. * @return A list of the active category enhancements, or {@code null} if there are no enhancements. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
>	TokenNameGREATER	
getCategoryEnhancements	TokenNameIdentifier	 get Category Enhancements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get a list of {@link CategoryProperty} classes to be retained when * creating {@link CategoryParentsStream}. * * @return the list of {@link CategoryProperty} classes to be retained when * creating {@link CategoryParentsStream}, or {@code null} if there * are no such properties. */	TokenNameCOMMENT_JAVADOC	 Get a list of {@link CategoryProperty} classes to be retained when creating {@link CategoryParentsStream}. * @return the list of {@link CategoryProperty} classes to be retained when creating {@link CategoryParentsStream}, or {@code null} if there are no such properties. 
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
