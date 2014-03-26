package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
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
Analyzer	TokenNameIdentifier	 Analyzer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
QueryParser	TokenNameIdentifier	 Query Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
builders	TokenNameIdentifier	 builders
.	TokenNameDOT	
BooleanFilterBuilder	TokenNameIdentifier	 Boolean Filter Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
builders	TokenNameIdentifier	 builders
.	TokenNameDOT	
BoostingQueryBuilder	TokenNameIdentifier	 Boosting Query Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
builders	TokenNameIdentifier	 builders
.	TokenNameDOT	
DuplicateFilterBuilder	TokenNameIdentifier	 Duplicate Filter Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
builders	TokenNameIdentifier	 builders
.	TokenNameDOT	
FuzzyLikeThisQueryBuilder	TokenNameIdentifier	 Fuzzy Like This Query Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
builders	TokenNameIdentifier	 builders
.	TokenNameDOT	
LikeThisQueryBuilder	TokenNameIdentifier	 Like This Query Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
builders	TokenNameIdentifier	 builders
.	TokenNameDOT	
TermsFilterBuilder	TokenNameIdentifier	 Terms Filter Builder
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
CorePlusExtensionsParser	TokenNameIdentifier	 Core Plus Extensions Parser
extends	TokenNameextends	
CoreParser	TokenNameIdentifier	 Core Parser
{	TokenNameLBRACE	
/** * Construct an XML parser that uses a single instance QueryParser for handling * UserQuery tags - all parse operations are synchronized on this parser * @param analyzer * @param parser A QueryParser which will be synchronized on during parse calls. */	TokenNameCOMMENT_JAVADOC	 Construct an XML parser that uses a single instance QueryParser for handling UserQuery tags - all parse operations are synchronized on this parser @param analyzer @param parser A QueryParser which will be synchronized on during parse calls. 
public	TokenNamepublic	
CorePlusExtensionsParser	TokenNameIdentifier	 Core Plus Extensions Parser
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
QueryParser	TokenNameIdentifier	 Query Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs an XML parser that creates a QueryParser for each UserQuery request. * @param defaultField The default field name used by QueryParsers constructed for UserQuery tags * @param analyzer */	TokenNameCOMMENT_JAVADOC	 Constructs an XML parser that creates a QueryParser for each UserQuery request. @param defaultField The default field name used by QueryParsers constructed for UserQuery tags @param analyzer 
public	TokenNamepublic	
CorePlusExtensionsParser	TokenNameIdentifier	 Core Plus Extensions Parser
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
defaultField	TokenNameIdentifier	 default Field
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
defaultField	TokenNameIdentifier	 default Field
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
CorePlusExtensionsParser	TokenNameIdentifier	 Core Plus Extensions Parser
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
defaultField	TokenNameIdentifier	 default Field
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
QueryParser	TokenNameIdentifier	 Query Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
defaultField	TokenNameIdentifier	 default Field
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterFactory	TokenNameIdentifier	 filter Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"TermsFilter"	TokenNameStringLiteral	TermsFilter
,	TokenNameCOMMA	
new	TokenNamenew	
TermsFilterBuilder	TokenNameIdentifier	 Terms Filter Builder
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterFactory	TokenNameIdentifier	 filter Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"BooleanFilter"	TokenNameStringLiteral	BooleanFilter
,	TokenNameCOMMA	
new	TokenNamenew	
BooleanFilterBuilder	TokenNameIdentifier	 Boolean Filter Builder
(	TokenNameLPAREN	
filterFactory	TokenNameIdentifier	 filter Factory
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterFactory	TokenNameIdentifier	 filter Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"DuplicateFilter"	TokenNameStringLiteral	DuplicateFilter
,	TokenNameCOMMA	
new	TokenNamenew	
DuplicateFilterBuilder	TokenNameIdentifier	 Duplicate Filter Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"contents"	TokenNameStringLiteral	contents
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"LikeThisQuery"	TokenNameStringLiteral	LikeThisQuery
,	TokenNameCOMMA	
new	TokenNamenew	
LikeThisQueryBuilder	TokenNameIdentifier	 Like This Query Builder
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"BoostingQuery"	TokenNameStringLiteral	BoostingQuery
,	TokenNameCOMMA	
new	TokenNamenew	
BoostingQueryBuilder	TokenNameIdentifier	 Boosting Query Builder
(	TokenNameLPAREN	
queryFactory	TokenNameIdentifier	 query Factory
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"FuzzyLikeThisQuery"	TokenNameStringLiteral	FuzzyLikeThisQuery
,	TokenNameCOMMA	
new	TokenNamenew	
FuzzyLikeThisQueryBuilder	TokenNameIdentifier	 Fuzzy Like This Query Builder
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
