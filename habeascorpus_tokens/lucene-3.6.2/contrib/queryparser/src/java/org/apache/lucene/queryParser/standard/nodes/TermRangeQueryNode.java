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
nodes	TokenNameIdentifier	 nodes
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
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
;	TokenNameSEMICOLON	
/** * This query node represents a range query composed by {@link FieldQueryNode} * bounds, which means the bound values are strings. * * @see FieldQueryNode * @see AbstractRangeQueryNode */	TokenNameCOMMENT_JAVADOC	 This query node represents a range query composed by {@link FieldQueryNode} bounds, which means the bound values are strings. * @see FieldQueryNode @see AbstractRangeQueryNode 
public	TokenNamepublic	
class	TokenNameclass	
TermRangeQueryNode	TokenNameIdentifier	 Term Range Query Node
extends	TokenNameextends	
AbstractRangeQueryNode	TokenNameIdentifier	 Abstract Range Query Node
<	TokenNameLESS	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
5470829448078569869L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Constructs a {@link TermRangeQueryNode} object using the given * {@link FieldQueryNode} as its bounds. * * @param lower * the lower bound * @param upper * the upper bound * @param lowerInclusive * <code>true</code> if the lower bound is inclusive, otherwise, * <code>false</code> * @param upperInclusive * <code>true</code> if the upper bound is inclusive, otherwise, * <code>false</code> */	TokenNameCOMMENT_JAVADOC	 Constructs a {@link TermRangeQueryNode} object using the given {@link FieldQueryNode} as its bounds. * @param lower the lower bound @param upper the upper bound @param lowerInclusive <code>true</code> if the lower bound is inclusive, otherwise, <code>false</code> @param upperInclusive <code>true</code> if the upper bound is inclusive, otherwise, <code>false</code> 
public	TokenNamepublic	
TermRangeQueryNode	TokenNameIdentifier	 Term Range Query Node
(	TokenNameLPAREN	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
upper	TokenNameIdentifier	 upper
,	TokenNameCOMMA	
boolean	TokenNameboolean	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
,	TokenNameCOMMA	
boolean	TokenNameboolean	
upperInclusive	TokenNameIdentifier	 upper Inclusive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setBounds	TokenNameIdentifier	 set Bounds
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
upper	TokenNameIdentifier	 upper
,	TokenNameCOMMA	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
,	TokenNameCOMMA	
upperInclusive	TokenNameIdentifier	 upper Inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
