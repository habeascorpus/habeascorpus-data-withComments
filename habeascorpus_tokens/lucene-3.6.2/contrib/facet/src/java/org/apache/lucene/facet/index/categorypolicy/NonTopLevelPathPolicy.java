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
CategoryPath	TokenNameIdentifier	 Category Path
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
/** * This class filters our the ROOT category, and it's direct descendants. For * more information see {@link PathPolicy}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 This class filters our the ROOT category, and it's direct descendants. For more information see {@link PathPolicy}. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
NonTopLevelPathPolicy	TokenNameIdentifier	 Non Top Level Path Policy
implements	TokenNameimplements	
PathPolicy	TokenNameIdentifier	 Path Policy
{	TokenNameLBRACE	
/** * The shortest path length delivered is two components (root + one child). */	TokenNameCOMMENT_JAVADOC	 The shortest path length delivered is two components (root + one child). 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MINIMAL_SUBPATH_LENGTH	TokenNameIdentifier	 DEFAULT  MINIMAL  SUBPATH  LENGTH
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Filters out (returns false) CategoryPaths equal or less than * {@link TaxonomyReader#ROOT_ORDINAL}. true otherwise. */	TokenNameCOMMENT_JAVADOC	 Filters out (returns false) CategoryPaths equal or less than {@link TaxonomyReader#ROOT_ORDINAL}. true otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldAdd	TokenNameIdentifier	 should Add
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
categoryPath	TokenNameIdentifier	 category Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
categoryPath	TokenNameIdentifier	 category Path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
DEFAULT_MINIMAL_SUBPATH_LENGTH	TokenNameIdentifier	 DEFAULT  MINIMAL  SUBPATH  LENGTH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
