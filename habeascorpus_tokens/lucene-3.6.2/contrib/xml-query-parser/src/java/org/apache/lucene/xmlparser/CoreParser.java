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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilder	TokenNameIdentifier	 Document Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Query	TokenNameIdentifier	 Query
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Assembles a QueryBuilder which uses only core Lucene Query objects * */	TokenNameCOMMENT_JAVADOC	 Assembles a QueryBuilder which uses only core Lucene Query objects 
public	TokenNamepublic	
class	TokenNameclass	
CoreParser	TokenNameIdentifier	 Core Parser
implements	TokenNameimplements	
QueryBuilder	TokenNameIdentifier	 Query Builder
{	TokenNameLBRACE	
protected	TokenNameprotected	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
QueryParser	TokenNameIdentifier	 Query Parser
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
QueryBuilderFactory	TokenNameIdentifier	 Query Builder Factory
queryFactory	TokenNameIdentifier	 query Factory
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
FilterBuilderFactory	TokenNameIdentifier	 Filter Builder Factory
filterFactory	TokenNameIdentifier	 filter Factory
;	TokenNameSEMICOLON	
//Controls the max size of the LRU cache used for QueryFilter objects parsed. 	TokenNameCOMMENT_LINE	Controls the max size of the LRU cache used for QueryFilter objects parsed. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
maxNumCachedFilters	TokenNameIdentifier	 max Num Cached Filters
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Construct an XML parser that uses a single instance QueryParser for handling * UserQuery tags - all parse operations are synchronised on this parser * @param analyzer * @param parser A QueryParser which will be synchronized on during parse calls. */	TokenNameCOMMENT_JAVADOC	 Construct an XML parser that uses a single instance QueryParser for handling UserQuery tags - all parse operations are synchronised on this parser @param analyzer @param parser A QueryParser which will be synchronized on during parse calls. 
public	TokenNamepublic	
CoreParser	TokenNameIdentifier	 Core Parser
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
CoreParser	TokenNameIdentifier	 Core Parser
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
protected	TokenNameprotected	
CoreParser	TokenNameIdentifier	 Core Parser
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
this	TokenNamethis	
.	TokenNameDOT	
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
filterFactory	TokenNameIdentifier	 filter Factory
=	TokenNameEQUAL	
new	TokenNamenew	
FilterBuilderFactory	TokenNameIdentifier	 Filter Builder Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterFactory	TokenNameIdentifier	 filter Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"RangeFilter"	TokenNameStringLiteral	RangeFilter
,	TokenNameCOMMA	
new	TokenNamenew	
RangeFilterBuilder	TokenNameIdentifier	 Range Filter Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterFactory	TokenNameIdentifier	 filter Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"NumericRangeFilter"	TokenNameStringLiteral	NumericRangeFilter
,	TokenNameCOMMA	
new	TokenNamenew	
NumericRangeFilterBuilder	TokenNameIdentifier	 Numeric Range Filter Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
=	TokenNameEQUAL	
new	TokenNamenew	
QueryBuilderFactory	TokenNameIdentifier	 Query Builder Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"TermQuery"	TokenNameStringLiteral	TermQuery
,	TokenNameCOMMA	
new	TokenNamenew	
TermQueryBuilder	TokenNameIdentifier	 Term Query Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"TermsQuery"	TokenNameStringLiteral	TermsQuery
,	TokenNameCOMMA	
new	TokenNamenew	
TermsQueryBuilder	TokenNameIdentifier	 Terms Query Builder
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"MatchAllDocsQuery"	TokenNameStringLiteral	MatchAllDocsQuery
,	TokenNameCOMMA	
new	TokenNamenew	
MatchAllDocsQueryBuilder	TokenNameIdentifier	 Match All Docs Query Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"BooleanQuery"	TokenNameStringLiteral	BooleanQuery
,	TokenNameCOMMA	
new	TokenNamenew	
BooleanQueryBuilder	TokenNameIdentifier	 Boolean Query Builder
(	TokenNameLPAREN	
queryFactory	TokenNameIdentifier	 query Factory
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"NumericRangeQuery"	TokenNameStringLiteral	NumericRangeQuery
,	TokenNameCOMMA	
new	TokenNamenew	
NumericRangeQueryBuilder	TokenNameIdentifier	 Numeric Range Query Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"UserQuery"	TokenNameStringLiteral	UserQuery
,	TokenNameCOMMA	
new	TokenNamenew	
UserInputQueryBuilder	TokenNameIdentifier	 User Input Query Builder
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"UserQuery"	TokenNameStringLiteral	UserQuery
,	TokenNameCOMMA	
new	TokenNamenew	
UserInputQueryBuilder	TokenNameIdentifier	 User Input Query Builder
(	TokenNameLPAREN	
defaultField	TokenNameIdentifier	 default Field
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"FilteredQuery"	TokenNameStringLiteral	FilteredQuery
,	TokenNameCOMMA	
new	TokenNamenew	
FilteredQueryBuilder	TokenNameIdentifier	 Filtered Query Builder
(	TokenNameLPAREN	
filterFactory	TokenNameIdentifier	 filter Factory
,	TokenNameCOMMA	
queryFactory	TokenNameIdentifier	 query Factory
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"ConstantScoreQuery"	TokenNameStringLiteral	ConstantScoreQuery
,	TokenNameCOMMA	
new	TokenNamenew	
ConstantScoreQueryBuilder	TokenNameIdentifier	 Constant Score Query Builder
(	TokenNameLPAREN	
filterFactory	TokenNameIdentifier	 filter Factory
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterFactory	TokenNameIdentifier	 filter Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"CachedFilter"	TokenNameStringLiteral	CachedFilter
,	TokenNameCOMMA	
new	TokenNamenew	
CachedFilterBuilder	TokenNameIdentifier	 Cached Filter Builder
(	TokenNameLPAREN	
queryFactory	TokenNameIdentifier	 query Factory
,	TokenNameCOMMA	
filterFactory	TokenNameIdentifier	 filter Factory
,	TokenNameCOMMA	
maxNumCachedFilters	TokenNameIdentifier	 max Num Cached Filters
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanQueryBuilderFactory	TokenNameIdentifier	 Span Query Builder Factory
sqof	TokenNameIdentifier	 sqof
=	TokenNameEQUAL	
new	TokenNamenew	
SpanQueryBuilderFactory	TokenNameIdentifier	 Span Query Builder Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanNearBuilder	TokenNameIdentifier	 Span Near Builder
snb	TokenNameIdentifier	 snb
=	TokenNameEQUAL	
new	TokenNamenew	
SpanNearBuilder	TokenNameIdentifier	 Span Near Builder
(	TokenNameLPAREN	
sqof	TokenNameIdentifier	 sqof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sqof	TokenNameIdentifier	 sqof
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"SpanNear"	TokenNameStringLiteral	SpanNear
,	TokenNameCOMMA	
snb	TokenNameIdentifier	 snb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"SpanNear"	TokenNameStringLiteral	SpanNear
,	TokenNameCOMMA	
snb	TokenNameIdentifier	 snb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BoostingTermBuilder	TokenNameIdentifier	 Boosting Term Builder
btb	TokenNameIdentifier	 btb
=	TokenNameEQUAL	
new	TokenNamenew	
BoostingTermBuilder	TokenNameIdentifier	 Boosting Term Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sqof	TokenNameIdentifier	 sqof
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"BoostingTermQuery"	TokenNameStringLiteral	BoostingTermQuery
,	TokenNameCOMMA	
btb	TokenNameIdentifier	 btb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"BoostingTermQuery"	TokenNameStringLiteral	BoostingTermQuery
,	TokenNameCOMMA	
btb	TokenNameIdentifier	 btb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanTermBuilder	TokenNameIdentifier	 Span Term Builder
snt	TokenNameIdentifier	 snt
=	TokenNameEQUAL	
new	TokenNamenew	
SpanTermBuilder	TokenNameIdentifier	 Span Term Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sqof	TokenNameIdentifier	 sqof
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"SpanTerm"	TokenNameStringLiteral	SpanTerm
,	TokenNameCOMMA	
snt	TokenNameIdentifier	 snt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"SpanTerm"	TokenNameStringLiteral	SpanTerm
,	TokenNameCOMMA	
snt	TokenNameIdentifier	 snt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanOrBuilder	TokenNameIdentifier	 Span Or Builder
sot	TokenNameIdentifier	 sot
=	TokenNameEQUAL	
new	TokenNamenew	
SpanOrBuilder	TokenNameIdentifier	 Span Or Builder
(	TokenNameLPAREN	
sqof	TokenNameIdentifier	 sqof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sqof	TokenNameIdentifier	 sqof
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"SpanOr"	TokenNameStringLiteral	SpanOr
,	TokenNameCOMMA	
sot	TokenNameIdentifier	 sot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"SpanOr"	TokenNameStringLiteral	SpanOr
,	TokenNameCOMMA	
sot	TokenNameIdentifier	 sot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanOrTermsBuilder	TokenNameIdentifier	 Span Or Terms Builder
sots	TokenNameIdentifier	 sots
=	TokenNameEQUAL	
new	TokenNamenew	
SpanOrTermsBuilder	TokenNameIdentifier	 Span Or Terms Builder
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sqof	TokenNameIdentifier	 sqof
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"SpanOrTerms"	TokenNameStringLiteral	SpanOrTerms
,	TokenNameCOMMA	
sots	TokenNameIdentifier	 sots
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"SpanOrTerms"	TokenNameStringLiteral	SpanOrTerms
,	TokenNameCOMMA	
sots	TokenNameIdentifier	 sots
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanFirstBuilder	TokenNameIdentifier	 Span First Builder
sft	TokenNameIdentifier	 sft
=	TokenNameEQUAL	
new	TokenNamenew	
SpanFirstBuilder	TokenNameIdentifier	 Span First Builder
(	TokenNameLPAREN	
sqof	TokenNameIdentifier	 sqof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sqof	TokenNameIdentifier	 sqof
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"SpanFirst"	TokenNameStringLiteral	SpanFirst
,	TokenNameCOMMA	
sft	TokenNameIdentifier	 sft
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"SpanFirst"	TokenNameStringLiteral	SpanFirst
,	TokenNameCOMMA	
sft	TokenNameIdentifier	 sft
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanNotBuilder	TokenNameIdentifier	 Span Not Builder
snot	TokenNameIdentifier	 snot
=	TokenNameEQUAL	
new	TokenNamenew	
SpanNotBuilder	TokenNameIdentifier	 Span Not Builder
(	TokenNameLPAREN	
sqof	TokenNameIdentifier	 sqof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sqof	TokenNameIdentifier	 sqof
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"SpanNot"	TokenNameStringLiteral	SpanNot
,	TokenNameCOMMA	
snot	TokenNameIdentifier	 snot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
"SpanNot"	TokenNameStringLiteral	SpanNot
,	TokenNameCOMMA	
snot	TokenNameIdentifier	 snot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
xmlStream	TokenNameIdentifier	 xml Stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserException	TokenNameIdentifier	 Parser Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
parseXML	TokenNameIdentifier	 parse XML
(	TokenNameLPAREN	
xmlStream	TokenNameIdentifier	 xml Stream
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addQueryBuilder	TokenNameIdentifier	 add Query Builder
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nodeName	TokenNameIdentifier	 node Name
,	TokenNameCOMMA	
QueryBuilder	TokenNameIdentifier	 Query Builder
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addFilterBuilder	TokenNameIdentifier	 add Filter Builder
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nodeName	TokenNameIdentifier	 node Name
,	TokenNameCOMMA	
FilterBuilder	TokenNameIdentifier	 Filter Builder
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filterFactory	TokenNameIdentifier	 filter Factory
.	TokenNameDOT	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Document	TokenNameIdentifier	 Document
parseXML	TokenNameIdentifier	 parse XML
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
pXmlFile	TokenNameIdentifier	 p Xml File
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserException	TokenNameIdentifier	 Parser Exception
{	TokenNameLBRACE	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
dbf	TokenNameIdentifier	 dbf
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocumentBuilder	TokenNameIdentifier	 Document Builder
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParserException	TokenNameIdentifier	 Parser Exception
(	TokenNameLPAREN	
"XML Parser configuration error"	TokenNameStringLiteral	XML Parser configuration error
,	TokenNameCOMMA	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
pXmlFile	TokenNameIdentifier	 p Xml File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParserException	TokenNameIdentifier	 Parser Exception
(	TokenNameLPAREN	
"Error parsing XML stream:"	TokenNameStringLiteral	Error parsing XML stream:
+	TokenNamePLUS	
se	TokenNameIdentifier	 se
,	TokenNameCOMMA	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserException	TokenNameIdentifier	 Parser Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
