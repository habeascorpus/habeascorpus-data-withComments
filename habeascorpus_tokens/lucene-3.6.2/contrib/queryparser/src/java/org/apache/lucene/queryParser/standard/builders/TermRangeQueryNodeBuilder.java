package	TokenNamepackage	
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
builders	TokenNameIdentifier	 builders
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
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
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
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
TermRangeQueryNode	TokenNameIdentifier	 Term Range Query Node
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
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
MultiTermRewriteMethodProcessor	TokenNameIdentifier	 Multi Term Rewrite Method Processor
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
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
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
TermRangeQuery	TokenNameIdentifier	 Term Range Query
;	TokenNameSEMICOLON	
/** * Builds a {@link TermRangeQuery} object from a {@link TermRangeQueryNode} * object. */	TokenNameCOMMENT_JAVADOC	 Builds a {@link TermRangeQuery} object from a {@link TermRangeQueryNode} object. 
public	TokenNamepublic	
class	TokenNameclass	
TermRangeQueryNodeBuilder	TokenNameIdentifier	 Term Range Query Node Builder
implements	TokenNameimplements	
StandardQueryBuilder	TokenNameIdentifier	 Standard Query Builder
{	TokenNameLBRACE	
public	TokenNamepublic	
TermRangeQueryNodeBuilder	TokenNameIdentifier	 Term Range Query Node Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty constructor 	TokenNameCOMMENT_LINE	empty constructor 
}	TokenNameRBRACE	
public	TokenNamepublic	
TermRangeQuery	TokenNameIdentifier	 Term Range Query
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
queryNode	TokenNameIdentifier	 query Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
{	TokenNameLBRACE	
TermRangeQueryNode	TokenNameIdentifier	 Term Range Query Node
rangeNode	TokenNameIdentifier	 range Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermRangeQueryNode	TokenNameIdentifier	 Term Range Query Node
)	TokenNameRPAREN	
queryNode	TokenNameIdentifier	 query Node
;	TokenNameSEMICOLON	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
rangeNode	TokenNameIdentifier	 range Node
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
rangeNode	TokenNameIdentifier	 range Node
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
rangeNode	TokenNameIdentifier	 range Node
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermRangeQuery	TokenNameIdentifier	 Term Range Query
rangeQuery	TokenNameIdentifier	 range Query
=	TokenNameEQUAL	
new	TokenNamenew	
TermRangeQuery	TokenNameIdentifier	 Term Range Query
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
getTextAsString	TokenNameIdentifier	 get Text As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
upper	TokenNameIdentifier	 upper
.	TokenNameDOT	
getTextAsString	TokenNameIdentifier	 get Text As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rangeNode	TokenNameIdentifier	 range Node
.	TokenNameDOT	
isLowerInclusive	TokenNameIdentifier	 is Lower Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rangeNode	TokenNameIdentifier	 range Node
.	TokenNameDOT	
isUpperInclusive	TokenNameIdentifier	 is Upper Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
.	TokenNameDOT	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
.	TokenNameDOT	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
)	TokenNameRPAREN	
queryNode	TokenNameIdentifier	 query Node
.	TokenNameDOT	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
MultiTermRewriteMethodProcessor	TokenNameIdentifier	 Multi Term Rewrite Method Processor
.	TokenNameDOT	
TAG_ID	TokenNameIdentifier	 TAG  ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rangeQuery	TokenNameIdentifier	 range Query
.	TokenNameDOT	
setRewriteMethod	TokenNameIdentifier	 set Rewrite Method
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
rangeQuery	TokenNameIdentifier	 range Query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
