package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
builders	TokenNameIdentifier	 builders
.	TokenNameDOT	
QueryBuilder	TokenNameIdentifier	 Query Builder
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
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
;	TokenNameSEMICOLON	
/** * <p> * This class is a helper for the query parser framework, it does all the three * query parser phrases at once: text parsing, query processing and query * building. * </p> * <p> * It contains methods that allows the user to change the implementation used on * the three phases. * </p> * * @see QueryNodeProcessor * @see SyntaxParser * @see QueryBuilder * @see QueryConfigHandler */	TokenNameCOMMENT_JAVADOC	 <p> This class is a helper for the query parser framework, it does all the three query parser phrases at once: text parsing, query processing and query building. </p> <p> It contains methods that allows the user to change the implementation used on the three phases. </p> * @see QueryNodeProcessor @see SyntaxParser @see QueryBuilder @see QueryConfigHandler 
public	TokenNamepublic	
class	TokenNameclass	
QueryParserHelper	TokenNameIdentifier	 Query Parser Helper
{	TokenNameLBRACE	
private	TokenNameprivate	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
processor	TokenNameIdentifier	 processor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SyntaxParser	TokenNameIdentifier	 Syntax Parser
syntaxParser	TokenNameIdentifier	 syntax Parser
;	TokenNameSEMICOLON	
private	TokenNameprivate	
QueryBuilder	TokenNameIdentifier	 Query Builder
builder	TokenNameIdentifier	 builder
;	TokenNameSEMICOLON	
private	TokenNameprivate	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
/** * Creates a query parser helper object using the specified configuration, * text parser, processor and builder. * * @param queryConfigHandler * the query configuration handler that will be initially set to this * helper * @param syntaxParser * the text parser that will be initially set to this helper * @param processor * the query processor that will be initially set to this helper * @param builder * the query builder that will be initially set to this helper * * @see QueryNodeProcessor * @see SyntaxParser * @see QueryBuilder * @see QueryConfigHandler */	TokenNameCOMMENT_JAVADOC	 Creates a query parser helper object using the specified configuration, text parser, processor and builder. * @param queryConfigHandler the query configuration handler that will be initially set to this helper @param syntaxParser the text parser that will be initially set to this helper @param processor the query processor that will be initially set to this helper @param builder the query builder that will be initially set to this helper * @see QueryNodeProcessor @see SyntaxParser @see QueryBuilder @see QueryConfigHandler 
public	TokenNamepublic	
QueryParserHelper	TokenNameIdentifier	 Query Parser Helper
(	TokenNameLPAREN	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
queryConfigHandler	TokenNameIdentifier	 query Config Handler
,	TokenNameCOMMA	
SyntaxParser	TokenNameIdentifier	 Syntax Parser
syntaxParser	TokenNameIdentifier	 syntax Parser
,	TokenNameCOMMA	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
processor	TokenNameIdentifier	 processor
,	TokenNameCOMMA	
QueryBuilder	TokenNameIdentifier	 Query Builder
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
syntaxParser	TokenNameIdentifier	 syntax Parser
=	TokenNameEQUAL	
syntaxParser	TokenNameIdentifier	 syntax Parser
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
queryConfigHandler	TokenNameIdentifier	 query Config Handler
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
=	TokenNameEQUAL	
processor	TokenNameIdentifier	 processor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
processor	TokenNameIdentifier	 processor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
setQueryConfigHandler	TokenNameIdentifier	 set Query Config Handler
(	TokenNameLPAREN	
queryConfigHandler	TokenNameIdentifier	 query Config Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the processor object used to process the query node tree, it * returns <code>null</code> if no processor is used. * * @return the actual processor used to process the query node tree, * <code>null</code> if no processor is used * * @see QueryNodeProcessor * @see #setQueryNodeProcessor(QueryNodeProcessor) */	TokenNameCOMMENT_JAVADOC	 Returns the processor object used to process the query node tree, it returns <code>null</code> if no processor is used. * @return the actual processor used to process the query node tree, <code>null</code> if no processor is used * @see QueryNodeProcessor @see #setQueryNodeProcessor(QueryNodeProcessor) 
public	TokenNamepublic	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
getQueryNodeProcessor	TokenNameIdentifier	 get Query Node Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
processor	TokenNameIdentifier	 processor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the processor that will be used to process the query node tree. If * there is any {@link QueryConfigHandler} returned by * {@link #getQueryConfigHandler()}, it will be set on the processor. The * argument can be <code>null</code>, which means that no processor will be * used to process the query node tree. * * @param processor * the processor that will be used to process the query node tree, * this argument can be <code>null</code> * * @see #getQueryNodeProcessor() * @see QueryNodeProcessor */	TokenNameCOMMENT_JAVADOC	 Sets the processor that will be used to process the query node tree. If there is any {@link QueryConfigHandler} returned by {@link #getQueryConfigHandler()}, it will be set on the processor. The argument can be <code>null</code>, which means that no processor will be used to process the query node tree. * @param processor the processor that will be used to process the query node tree, this argument can be <code>null</code> * @see #getQueryNodeProcessor() @see QueryNodeProcessor 
public	TokenNamepublic	
void	TokenNamevoid	
setQueryNodeProcessor	TokenNameIdentifier	 set Query Node Processor
(	TokenNameLPAREN	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
=	TokenNameEQUAL	
processor	TokenNameIdentifier	 processor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
setQueryConfigHandler	TokenNameIdentifier	 set Query Config Handler
(	TokenNameLPAREN	
getQueryConfigHandler	TokenNameIdentifier	 get Query Config Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the text parser that will be used to parse the query string, it cannot * be <code>null</code>. * * @param syntaxParser * the text parser that will be used to parse the query string * * @see #getSyntaxParser() * @see SyntaxParser */	TokenNameCOMMENT_JAVADOC	 Sets the text parser that will be used to parse the query string, it cannot be <code>null</code>. * @param syntaxParser the text parser that will be used to parse the query string * @see #getSyntaxParser() @see SyntaxParser 
public	TokenNamepublic	
void	TokenNamevoid	
setSyntaxParser	TokenNameIdentifier	 set Syntax Parser
(	TokenNameLPAREN	
SyntaxParser	TokenNameIdentifier	 Syntax Parser
syntaxParser	TokenNameIdentifier	 syntax Parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
syntaxParser	TokenNameIdentifier	 syntax Parser
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"textParser should not be null!"	TokenNameStringLiteral	textParser should not be null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
syntaxParser	TokenNameIdentifier	 syntax Parser
=	TokenNameEQUAL	
syntaxParser	TokenNameIdentifier	 syntax Parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The query builder that will be used to build an object from the query node * tree. It cannot be <code>null</code>. * * @param queryBuilder * the query builder used to build something from the query node tree * * @see #getQueryBuilder() * @see QueryBuilder */	TokenNameCOMMENT_JAVADOC	 The query builder that will be used to build an object from the query node tree. It cannot be <code>null</code>. * @param queryBuilder the query builder used to build something from the query node tree * @see #getQueryBuilder() @see QueryBuilder 
public	TokenNamepublic	
void	TokenNamevoid	
setQueryBuilder	TokenNameIdentifier	 set Query Builder
(	TokenNameLPAREN	
QueryBuilder	TokenNameIdentifier	 Query Builder
queryBuilder	TokenNameIdentifier	 query Builder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
queryBuilder	TokenNameIdentifier	 query Builder
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"queryBuilder should not be null!"	TokenNameStringLiteral	queryBuilder should not be null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
queryBuilder	TokenNameIdentifier	 query Builder
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the query configuration handler, which is used during the query * node tree processing. It can be <code>null</code>. * * @return the query configuration handler used on the query processing, * <code>null</code> if not query configuration handler is defined * * @see QueryConfigHandler * @see #setQueryConfigHandler(QueryConfigHandler) */	TokenNameCOMMENT_JAVADOC	 Returns the query configuration handler, which is used during the query node tree processing. It can be <code>null</code>. * @return the query configuration handler used on the query processing, <code>null</code> if not query configuration handler is defined * @see QueryConfigHandler @see #setQueryConfigHandler(QueryConfigHandler) 
public	TokenNamepublic	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
getQueryConfigHandler	TokenNameIdentifier	 get Query Config Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the query builder used to build a object from the query node tree. * The object produced by this builder is returned by * {@link #parse(String, String)}. * * @return the query builder * * @see #setQueryBuilder(QueryBuilder) * @see QueryBuilder */	TokenNameCOMMENT_JAVADOC	 Returns the query builder used to build a object from the query node tree. The object produced by this builder is returned by {@link #parse(String, String)}. * @return the query builder * @see #setQueryBuilder(QueryBuilder) @see QueryBuilder 
public	TokenNamepublic	
QueryBuilder	TokenNameIdentifier	 Query Builder
getQueryBuilder	TokenNameIdentifier	 get Query Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
builder	TokenNameIdentifier	 builder
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the text parser used to build a query node tree from a query * string. The default text parser instance returned by this method is a * {@link SyntaxParser}. * * @return the text parse used to build query node trees. * * @see SyntaxParser * @see #setSyntaxParser(SyntaxParser) */	TokenNameCOMMENT_JAVADOC	 Returns the text parser used to build a query node tree from a query string. The default text parser instance returned by this method is a {@link SyntaxParser}. * @return the text parse used to build query node trees. * @see SyntaxParser @see #setSyntaxParser(SyntaxParser) 
public	TokenNamepublic	
SyntaxParser	TokenNameIdentifier	 Syntax Parser
getSyntaxParser	TokenNameIdentifier	 get Syntax Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
syntaxParser	TokenNameIdentifier	 syntax Parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the query configuration handler that will be used during query * processing. It can be <code>null</code>. It's also set to the processor * returned by {@link #getQueryNodeProcessor()}. * * @param config * the query configuration handler used during query processing, it * can be <code>null</code> * * @see #getQueryConfigHandler() * @see QueryConfigHandler */	TokenNameCOMMENT_JAVADOC	 Sets the query configuration handler that will be used during query processing. It can be <code>null</code>. It's also set to the processor returned by {@link #getQueryNodeProcessor()}. * @param config the query configuration handler used during query processing, it can be <code>null</code> * @see #getQueryConfigHandler() @see QueryConfigHandler 
public	TokenNamepublic	
void	TokenNamevoid	
setQueryConfigHandler	TokenNameIdentifier	 set Query Config Handler
(	TokenNameLPAREN	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
processor	TokenNameIdentifier	 processor
=	TokenNameEQUAL	
getQueryNodeProcessor	TokenNameIdentifier	 get Query Node Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
processor	TokenNameIdentifier	 processor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
setQueryConfigHandler	TokenNameIdentifier	 set Query Config Handler
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a query string to an object, usually some query object. <br/> * <br/> * In this method the three phases are executed: <br/> * <br/> * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1st - the query string is parsed using the * text parser returned by {@link #getSyntaxParser()}, the result is a query * node tree <br/> * <br/> * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2nd - the query node tree is processed by the * processor returned by {@link #getQueryNodeProcessor()} <br/> * <br/> * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3th - a object is built from the query node * tree using the builder returned by {@link #getQueryBuilder()} * * @param query * the query string * @param defaultField * the default field used by the text parser * * @return the object built from the query * * @throws QueryNodeException * if something wrong happens along the three phases */	TokenNameCOMMENT_JAVADOC	 Parses a query string to an object, usually some query object. <br/> <br/> In this method the three phases are executed: <br/> <br/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1st - the query string is parsed using the text parser returned by {@link #getSyntaxParser()}, the result is a query node tree <br/> <br/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2nd - the query node tree is processed by the processor returned by {@link #getQueryNodeProcessor()} <br/> <br/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3th - a object is built from the query node tree using the builder returned by {@link #getQueryBuilder()} * @param query the query string @param defaultField the default field used by the text parser * @return the object built from the query * @throws QueryNodeException if something wrong happens along the three phases 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultField	TokenNameIdentifier	 default Field
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
{	TokenNameLBRACE	
QueryNode	TokenNameIdentifier	 Query Node
queryTree	TokenNameIdentifier	 query Tree
=	TokenNameEQUAL	
getSyntaxParser	TokenNameIdentifier	 get Syntax Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
defaultField	TokenNameIdentifier	 default Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
processor	TokenNameIdentifier	 processor
=	TokenNameEQUAL	
getQueryNodeProcessor	TokenNameIdentifier	 get Query Node Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
processor	TokenNameIdentifier	 processor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queryTree	TokenNameIdentifier	 query Tree
=	TokenNameEQUAL	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getQueryBuilder	TokenNameIdentifier	 get Query Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
