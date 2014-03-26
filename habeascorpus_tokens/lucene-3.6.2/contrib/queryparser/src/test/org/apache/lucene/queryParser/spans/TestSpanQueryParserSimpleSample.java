package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
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
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
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
core	TokenNameIdentifier	 core
.	TokenNameDOT	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
OrQueryNode	TokenNameIdentifier	 Or Query Node
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
core	TokenNameIdentifier	 core
.	TokenNameDOT	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
QueryNode	TokenNameIdentifier	 Query Node
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
core	TokenNameIdentifier	 core
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
SyntaxParser	TokenNameIdentifier	 Syntax Parser
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
core	TokenNameIdentifier	 core
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
QueryNodeProcessorPipeline	TokenNameIdentifier	 Query Node Processor Pipeline
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
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
StandardSyntaxParser	TokenNameIdentifier	 Standard Syntax Parser
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
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
SpanQuery	TokenNameIdentifier	 Span Query
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
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
/** * This test case demonstrates how the new query parser can be used.<br/> * <br/> * * It tests queries likes "term", "field:term" "term1 term2" "term1 OR term2", * which are all already supported by the current syntax parser ( * {@link StandardSyntaxParser}).<br/> * <br/> * * The goals is to create a new query parser that supports only the pair * "field:term" or a list of pairs separated or not by an OR operator, and from * this query generate {@link SpanQuery} objects instead of the regular * {@link Query} objects. Basically, every pair will be converted to a * {@link SpanTermQuery} object and if there are more than one pair they will be * grouped by an {@link OrQueryNode}.<br/> * <br/> * * Another functionality that will be added is the ability to convert every * field defined in the query to an unique specific field.<br/> * <br/> * * The query generation is divided in three different steps: parsing (syntax), * processing (semantic) and building.<br/> * <br/> * * The parsing phase, as already mentioned will be performed by the current * query parser: {@link StandardSyntaxParser}.<br/> * <br/> * * The processing phase will be performed by a processor pipeline which is * compound by 2 processors: {@link SpansValidatorQueryNodeProcessor} and * {@link UniqueFieldQueryNodeProcessor}. * * <pre> * * {@link SpansValidatorQueryNodeProcessor}: as it's going to use the current * query parser to parse the syntax, it will support more features than we want, * this processor basically validates the query node tree generated by the parser * and just let got through the elements we want, all the other elements as * wildcards, range queries, etc...if found, an exception is thrown. * * {@link UniqueFieldQueryNodeProcessor}: this processor will take care of reading * what is the &quot;unique field&quot; from the configuration and convert every field defined * in every pair to this &quot;unique field&quot;. For that, a {@link SpansQueryConfigHandler} is * used, which has the {@link UniqueFieldAttribute} defined in it. * </pre> * * The building phase is performed by the {@link SpansQueryTreeBuilder}, which * basically contains a map that defines which builder will be used to generate * {@link SpanQuery} objects from {@link QueryNode} objects.<br/> * <br/> * * @see TestSpanQueryParser for a more advanced example * * @see SpansQueryConfigHandler * @see SpansQueryTreeBuilder * @see SpansValidatorQueryNodeProcessor * @see SpanOrQueryNodeBuilder * @see SpanTermQueryNodeBuilder * @see StandardSyntaxParser * @see UniqueFieldQueryNodeProcessor * @see UniqueFieldAttribute * */	TokenNameCOMMENT_JAVADOC	 This test case demonstrates how the new query parser can be used.<br/> <br/> * It tests queries likes "term", "field:term" "term1 term2" "term1 OR term2", which are all already supported by the current syntax parser ( {@link StandardSyntaxParser}).<br/> <br/> * The goals is to create a new query parser that supports only the pair "field:term" or a list of pairs separated or not by an OR operator, and from this query generate {@link SpanQuery} objects instead of the regular {@link Query} objects. Basically, every pair will be converted to a {@link SpanTermQuery} object and if there are more than one pair they will be grouped by an {@link OrQueryNode}.<br/> <br/> * Another functionality that will be added is the ability to convert every field defined in the query to an unique specific field.<br/> <br/> * The query generation is divided in three different steps: parsing (syntax), processing (semantic) and building.<br/> <br/> * The parsing phase, as already mentioned will be performed by the current query parser: {@link StandardSyntaxParser}.<br/> <br/> * The processing phase will be performed by a processor pipeline which is compound by 2 processors: {@link SpansValidatorQueryNodeProcessor} and {@link UniqueFieldQueryNodeProcessor}. * <pre> * {@link SpansValidatorQueryNodeProcessor}: as it's going to use the current query parser to parse the syntax, it will support more features than we want, this processor basically validates the query node tree generated by the parser and just let got through the elements we want, all the other elements as wildcards, range queries, etc...if found, an exception is thrown. * {@link UniqueFieldQueryNodeProcessor}: this processor will take care of reading what is the &quot;unique field&quot; from the configuration and convert every field defined in every pair to this &quot;unique field&quot;. For that, a {@link SpansQueryConfigHandler} is used, which has the {@link UniqueFieldAttribute} defined in it. </pre> * The building phase is performed by the {@link SpansQueryTreeBuilder}, which basically contains a map that defines which builder will be used to generate {@link SpanQuery} objects from {@link QueryNode} objects.<br/> <br/> * @see TestSpanQueryParser for a more advanced example * @see SpansQueryConfigHandler @see SpansQueryTreeBuilder @see SpansValidatorQueryNodeProcessor @see SpanOrQueryNodeBuilder @see SpanTermQueryNodeBuilder @see StandardSyntaxParser @see UniqueFieldQueryNodeProcessor @see UniqueFieldAttribute 
public	TokenNamepublic	
class	TokenNameclass	
TestSpanQueryParserSimpleSample	TokenNameIdentifier	 Test Span Query Parser Simple Sample
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBasicDemo	TokenNameIdentifier	 test Basic Demo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SyntaxParser	TokenNameIdentifier	 Syntax Parser
queryParser	TokenNameIdentifier	 query Parser
=	TokenNameEQUAL	
new	TokenNamenew	
StandardSyntaxParser	TokenNameIdentifier	 Standard Syntax Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// convert the CharSequence into a QueryNode tree 	TokenNameCOMMENT_LINE	convert the CharSequence into a QueryNode tree 
QueryNode	TokenNameIdentifier	 Query Node
queryTree	TokenNameIdentifier	 query Tree
=	TokenNameEQUAL	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"body:text"	TokenNameStringLiteral	body:text
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create a config handler with a attribute used in 	TokenNameCOMMENT_LINE	create a config handler with a attribute used in 
// UniqueFieldQueryNodeProcessor 	TokenNameCOMMENT_LINE	UniqueFieldQueryNodeProcessor 
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
spanQueryConfigHandler	TokenNameIdentifier	 span Query Config Handler
=	TokenNameEQUAL	
new	TokenNamenew	
SpansQueryConfigHandler	TokenNameIdentifier	 Spans Query Config Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spanQueryConfigHandler	TokenNameIdentifier	 span Query Config Handler
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
SpansQueryConfigHandler	TokenNameIdentifier	 Spans Query Config Handler
.	TokenNameDOT	
UNIQUE_FIELD	TokenNameIdentifier	 UNIQUE  FIELD
,	TokenNameCOMMA	
"index"	TokenNameStringLiteral	index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set up the processor pipeline with the ConfigHandler 	TokenNameCOMMENT_LINE	set up the processor pipeline with the ConfigHandler 
// and create the pipeline for this simple demo 	TokenNameCOMMENT_LINE	and create the pipeline for this simple demo 
QueryNodeProcessorPipeline	TokenNameIdentifier	 Query Node Processor Pipeline
spanProcessorPipeline	TokenNameIdentifier	 span Processor Pipeline
=	TokenNameEQUAL	
new	TokenNamenew	
QueryNodeProcessorPipeline	TokenNameIdentifier	 Query Node Processor Pipeline
(	TokenNameLPAREN	
spanQueryConfigHandler	TokenNameIdentifier	 span Query Config Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// @see SpansValidatorQueryNodeProcessor 	TokenNameCOMMENT_LINE	@see SpansValidatorQueryNodeProcessor 
spanProcessorPipeline	TokenNameIdentifier	 span Processor Pipeline
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
SpansValidatorQueryNodeProcessor	TokenNameIdentifier	 Spans Validator Query Node Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// @see UniqueFieldQueryNodeProcessor 	TokenNameCOMMENT_LINE	@see UniqueFieldQueryNodeProcessor 
spanProcessorPipeline	TokenNameIdentifier	 span Processor Pipeline
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
UniqueFieldQueryNodeProcessor	TokenNameIdentifier	 Unique Field Query Node Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// print to show out the QueryNode tree before being processed 	TokenNameCOMMENT_LINE	print to show out the QueryNode tree before being processed 
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Process the QueryTree using our new Processors 	TokenNameCOMMENT_LINE	Process the QueryTree using our new Processors 
queryTree	TokenNameIdentifier	 query Tree
=	TokenNameEQUAL	
spanProcessorPipeline	TokenNameIdentifier	 span Processor Pipeline
.	TokenNameDOT	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// print to show out the QueryNode tree after being processed 	TokenNameCOMMENT_LINE	print to show out the QueryNode tree after being processed 
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create a instance off the Builder 	TokenNameCOMMENT_LINE	create a instance off the Builder 
SpansQueryTreeBuilder	TokenNameIdentifier	 Spans Query Tree Builder
spansQueryTreeBuilder	TokenNameIdentifier	 spans Query Tree Builder
=	TokenNameEQUAL	
new	TokenNamenew	
SpansQueryTreeBuilder	TokenNameIdentifier	 Spans Query Tree Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// convert QueryNode tree to span query Objects 	TokenNameCOMMENT_LINE	convert QueryNode tree to span query Objects 
SpanQuery	TokenNameIdentifier	 Span Query
spanquery	TokenNameIdentifier	 spanquery
=	TokenNameEQUAL	
spansQueryTreeBuilder	TokenNameIdentifier	 spans Query Tree Builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
spanquery	TokenNameIdentifier	 spanquery
instanceof	TokenNameinstanceof	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
spanquery	TokenNameIdentifier	 spanquery
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"index:text"	TokenNameStringLiteral	index:text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
