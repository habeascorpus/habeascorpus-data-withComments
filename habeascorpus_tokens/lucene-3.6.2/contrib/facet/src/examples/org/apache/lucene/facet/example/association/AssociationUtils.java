package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
association	TokenNameIdentifier	 association
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
association	TokenNameIdentifier	 association
.	TokenNameDOT	
AssociationEnhancement	TokenNameIdentifier	 Association Enhancement
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
association	TokenNameIdentifier	 association
.	TokenNameDOT	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
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
association	TokenNameIdentifier	 association
.	TokenNameDOT	
AssociationIntProperty	TokenNameIdentifier	 Association Int Property
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
association	TokenNameIdentifier	 association
.	TokenNameDOT	
AssociationProperty	TokenNameIdentifier	 Association Property
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
DefaultEnhancementsIndexingParams	TokenNameIdentifier	 Default Enhancements Indexing Params
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
/** * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
AssociationUtils	TokenNameIdentifier	 Association Utils
{	TokenNameLBRACE	
/** * Categories: categories[D][N] == category-path with association no. N for * document no. D. */	TokenNameCOMMENT_JAVADOC	 Categories: categories[D][N] == category-path with association no. N for document no. D. 
public	TokenNamepublic	
static	TokenNamestatic	
CategoryPath	TokenNameIdentifier	 Category Path
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
categories	TokenNameIdentifier	 categories
=	TokenNameEQUAL	
{	TokenNameLBRACE	
// Doc #1 	TokenNameCOMMENT_LINE	Doc #1 
{	TokenNameLBRACE	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"tags"	TokenNameStringLiteral	tags
,	TokenNameCOMMA	
"lucene"	TokenNameStringLiteral	lucene
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"genre"	TokenNameStringLiteral	genre
,	TokenNameCOMMA	
"computing"	TokenNameStringLiteral	computing
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Doc #2 	TokenNameCOMMENT_LINE	Doc #2 
{	TokenNameLBRACE	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"tags"	TokenNameStringLiteral	tags
,	TokenNameCOMMA	
"lucene"	TokenNameStringLiteral	lucene
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"tags"	TokenNameStringLiteral	tags
,	TokenNameCOMMA	
"solr"	TokenNameStringLiteral	solr
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"genre"	TokenNameStringLiteral	genre
,	TokenNameCOMMA	
"computing"	TokenNameStringLiteral	computing
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"genre"	TokenNameStringLiteral	genre
,	TokenNameCOMMA	
"software"	TokenNameStringLiteral	software
)	TokenNameRPAREN	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
AssociationProperty	TokenNameIdentifier	 Association Property
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
associations	TokenNameIdentifier	 associations
=	TokenNameEQUAL	
{	TokenNameLBRACE	
// Doc #1 associations 	TokenNameCOMMENT_LINE	Doc #1 associations 
{	TokenNameLBRACE	
/* 3 occurrences for tag 'lucene' */	TokenNameCOMMENT_BLOCK	 3 occurrences for tag 'lucene' 
new	TokenNamenew	
AssociationIntProperty	TokenNameIdentifier	 Association Int Property
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
/* 87% confidence level of genre 'computing' */	TokenNameCOMMENT_BLOCK	 87% confidence level of genre 'computing' 
new	TokenNamenew	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
(	TokenNameLPAREN	
0.87f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Doc #2 associations 	TokenNameCOMMENT_LINE	Doc #2 associations 
{	TokenNameLBRACE	
/* 1 occurrence for tag 'lucene' */	TokenNameCOMMENT_BLOCK	 1 occurrence for tag 'lucene' 
new	TokenNamenew	
AssociationIntProperty	TokenNameIdentifier	 Association Int Property
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
/* 2 occurrences for tag 'solr' */	TokenNameCOMMENT_BLOCK	 2 occurrences for tag 'solr' 
new	TokenNamenew	
AssociationIntProperty	TokenNameIdentifier	 Association Int Property
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
/* 75% confidence level of genre 'computing' */	TokenNameCOMMENT_BLOCK	 75% confidence level of genre 'computing' 
new	TokenNamenew	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
(	TokenNameLPAREN	
0.75f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
/* 34% confidence level of genre 'software' */	TokenNameCOMMENT_BLOCK	 34% confidence level of genre 'software' 
new	TokenNamenew	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
(	TokenNameLPAREN	
0.34f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Indexing Params: the indexing params to use when dealing with * associations. */	TokenNameCOMMENT_JAVADOC	 Indexing Params: the indexing params to use when dealing with associations. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
DefaultEnhancementsIndexingParams	TokenNameIdentifier	 Default Enhancements Indexing Params
assocIndexingParams	TokenNameIdentifier	 assoc Indexing Params
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultEnhancementsIndexingParams	TokenNameIdentifier	 Default Enhancements Indexing Params
(	TokenNameLPAREN	
new	TokenNamenew	
AssociationEnhancement	TokenNameIdentifier	 Association Enhancement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
