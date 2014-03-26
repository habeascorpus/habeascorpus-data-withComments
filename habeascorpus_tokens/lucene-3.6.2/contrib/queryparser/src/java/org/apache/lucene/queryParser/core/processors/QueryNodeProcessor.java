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
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
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
QueryNodeException	TokenNameIdentifier	 Query Node Exception
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
/** * <p> * A {@link QueryNodeProcessor} is an interface for classes that process a * {@link QueryNode} tree. * <p> * </p> * The implementor of this class should perform some operation on a query node * tree and return the same or another query node tree. * <p> * </p> * It also may carry a {@link QueryConfigHandler} object that contains * configuration about the query represented by the query tree or the * collection/index where it's intended to be executed. * <p> * </p> * In case there is any {@link QueryConfigHandler} associated to the query tree * to be processed, it should be set using * {@link QueryNodeProcessor#setQueryConfigHandler(QueryConfigHandler)} before * {@link QueryNodeProcessor#process(QueryNode)} is invoked. * * @see QueryNode * @see QueryNodeProcessor * @see QueryConfigHandler */	TokenNameCOMMENT_JAVADOC	 <p> A {@link QueryNodeProcessor} is an interface for classes that process a {@link QueryNode} tree. <p> </p> The implementor of this class should perform some operation on a query node tree and return the same or another query node tree. <p> </p> It also may carry a {@link QueryConfigHandler} object that contains configuration about the query represented by the query tree or the collection/index where it's intended to be executed. <p> </p> In case there is any {@link QueryConfigHandler} associated to the query tree to be processed, it should be set using {@link QueryNodeProcessor#setQueryConfigHandler(QueryConfigHandler)} before {@link QueryNodeProcessor#process(QueryNode)} is invoked. * @see QueryNode @see QueryNodeProcessor @see QueryConfigHandler 
public	TokenNamepublic	
interface	TokenNameinterface	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
{	TokenNameLBRACE	
/** * Processes a query node tree. It may return the same or another query tree. * I should never return <code>null</code>. * * @param queryTree * tree root node * * @return the processed query tree * * @throws QueryNodeException */	TokenNameCOMMENT_JAVADOC	 Processes a query node tree. It may return the same or another query tree. I should never return <code>null</code>. * @param queryTree tree root node * @return the processed query tree * @throws QueryNodeException 
public	TokenNamepublic	
QueryNode	TokenNameIdentifier	 Query Node
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
;	TokenNameSEMICOLON	
/** * Sets the {@link QueryConfigHandler} associated to the query tree. * * @param queryConfigHandler */	TokenNameCOMMENT_JAVADOC	 Sets the {@link QueryConfigHandler} associated to the query tree. * @param queryConfigHandler 
public	TokenNamepublic	
void	TokenNamevoid	
setQueryConfigHandler	TokenNameIdentifier	 set Query Config Handler
(	TokenNameLPAREN	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
queryConfigHandler	TokenNameIdentifier	 query Config Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the {@link QueryConfigHandler} associated to the query tree if any, * otherwise it returns <code>null</code> * * @return the {@link QueryConfigHandler} associated to the query tree if any, * otherwise it returns <code>null</code> */	TokenNameCOMMENT_JAVADOC	 Returns the {@link QueryConfigHandler} associated to the query tree if any, otherwise it returns <code>null</code> * @return the {@link QueryConfigHandler} associated to the query tree if any, otherwise it returns <code>null</code> 
public	TokenNamepublic	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
getQueryConfigHandler	TokenNameIdentifier	 get Query Config Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
