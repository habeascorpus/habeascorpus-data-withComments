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
categorypolicy	TokenNameIdentifier	 categorypolicy
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
TaxonomyWriter	TokenNameIdentifier	 Taxonomy Writer
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * This class filters our the ROOT category ID. For more information see * {@link OrdinalPolicy}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 This class filters our the ROOT category ID. For more information see {@link OrdinalPolicy}. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
DefaultOrdinalPolicy	TokenNameIdentifier	 Default Ordinal Policy
implements	TokenNameimplements	
OrdinalPolicy	TokenNameIdentifier	 Ordinal Policy
{	TokenNameLBRACE	
/** * Filters out (returns false) ordinals equal or less than * {@link TaxonomyReader#ROOT_ORDINAL}. true otherwise. */	TokenNameCOMMENT_JAVADOC	 Filters out (returns false) ordinals equal or less than {@link TaxonomyReader#ROOT_ORDINAL}. true otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldAdd	TokenNameIdentifier	 should Add
(	TokenNameLPAREN	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ordinal	TokenNameIdentifier	 ordinal
>	TokenNameGREATER	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
.	TokenNameDOT	
ROOT_ORDINAL	TokenNameIdentifier	 ROOT  ORDINAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implemented as NO-OP as the default is not taxonomy dependent */	TokenNameCOMMENT_JAVADOC	 Implemented as NO-OP as the default is not taxonomy dependent 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
TaxonomyWriter	TokenNameIdentifier	 Taxonomy Writer
taxonomyWriter	TokenNameIdentifier	 taxonomy Writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
