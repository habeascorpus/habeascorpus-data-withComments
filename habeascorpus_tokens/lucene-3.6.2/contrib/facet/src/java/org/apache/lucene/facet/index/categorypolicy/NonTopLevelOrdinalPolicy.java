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
/** * Filter out any "top level" category ordinals. <br> {@link #shouldAdd(int)}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Filter out any "top level" category ordinals. <br> {@link #shouldAdd(int)}. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
NonTopLevelOrdinalPolicy	TokenNameIdentifier	 Non Top Level Ordinal Policy
implements	TokenNameimplements	
OrdinalPolicy	TokenNameIdentifier	 Ordinal Policy
{	TokenNameLBRACE	
/** * The taxonomyWriter with which the given ordinals' parent is determined. */	TokenNameCOMMENT_JAVADOC	 The taxonomyWriter with which the given ordinals' parent is determined. 
private	TokenNameprivate	
TaxonomyWriter	TokenNameIdentifier	 Taxonomy Writer
taxonomyWriter	TokenNameIdentifier	 taxonomy Writer
;	TokenNameSEMICOLON	
/** * Constructs a new non-top-level-ordinal-filter. With a given * taxonomyWriter. * */	TokenNameCOMMENT_JAVADOC	 Constructs a new non-top-level-ordinal-filter. With a given taxonomyWriter. 
public	TokenNamepublic	
NonTopLevelOrdinalPolicy	TokenNameIdentifier	 Non Top Level Ordinal Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
taxonomyWriter	TokenNameIdentifier	 taxonomy Writer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param taxonomyWriter * A relevant taxonomyWriter object, with which ordinals sent to * {@link #shouldAdd(int)} are examined. */	TokenNameCOMMENT_JAVADOC	 @param taxonomyWriter A relevant taxonomyWriter object, with which ordinals sent to {@link #shouldAdd(int)} are examined. 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
TaxonomyWriter	TokenNameIdentifier	 Taxonomy Writer
taxonomyWriter	TokenNameIdentifier	 taxonomy Writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
taxonomyWriter	TokenNameIdentifier	 taxonomy Writer
=	TokenNameEQUAL	
taxonomyWriter	TokenNameIdentifier	 taxonomy Writer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Filters out ordinal which are ROOT or who's parent is ROOT. In order to * determine if a parent is root, there's a need for * {@link TaxonomyWriter#getParent(int)}. */	TokenNameCOMMENT_JAVADOC	 Filters out ordinal which are ROOT or who's parent is ROOT. In order to determine if a parent is root, there's a need for {@link TaxonomyWriter#getParent(int)}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldAdd	TokenNameIdentifier	 should Add
(	TokenNameLPAREN	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
>	TokenNameGREATER	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
.	TokenNameDOT	
ROOT_ORDINAL	TokenNameIdentifier	 ROOT  ORDINAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
taxonomyWriter	TokenNameIdentifier	 taxonomy Writer
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
>	TokenNameGREATER	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
.	TokenNameDOT	
ROOT_ORDINAL	TokenNameIdentifier	 ROOT  ORDINAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
