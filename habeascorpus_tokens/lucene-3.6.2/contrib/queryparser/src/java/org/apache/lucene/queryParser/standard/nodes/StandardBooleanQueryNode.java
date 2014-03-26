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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
BooleanQueryNode	TokenNameIdentifier	 Boolean Query Node
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
BooleanQuery	TokenNameIdentifier	 Boolean Query
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
Similarity	TokenNameIdentifier	 Similarity
;	TokenNameSEMICOLON	
/** * A {@link StandardBooleanQueryNode} has the same behavior as * {@link BooleanQueryNode}. It only indicates if the coord should be enabled or * not for this boolean query. <br/> * * @see Similarity#coord(int, int) * @see BooleanQuery */	TokenNameCOMMENT_JAVADOC	 A {@link StandardBooleanQueryNode} has the same behavior as {@link BooleanQueryNode}. It only indicates if the coord should be enabled or not for this boolean query. <br/> * @see Similarity#coord(int, int) @see BooleanQuery 
public	TokenNamepublic	
class	TokenNameclass	
StandardBooleanQueryNode	TokenNameIdentifier	 Standard Boolean Query Node
extends	TokenNameextends	
BooleanQueryNode	TokenNameIdentifier	 Boolean Query Node
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1938287817191138787L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
disableCoord	TokenNameIdentifier	 disable Coord
;	TokenNameSEMICOLON	
/** * @param clauses */	TokenNameCOMMENT_JAVADOC	 @param clauses 
public	TokenNamepublic	
StandardBooleanQueryNode	TokenNameIdentifier	 Standard Boolean Query Node
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
clauses	TokenNameIdentifier	 clauses
,	TokenNameCOMMA	
boolean	TokenNameboolean	
disableCoord	TokenNameIdentifier	 disable Coord
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
disableCoord	TokenNameIdentifier	 disable Coord
=	TokenNameEQUAL	
disableCoord	TokenNameIdentifier	 disable Coord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isDisableCoord	TokenNameIdentifier	 is Disable Coord
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
disableCoord	TokenNameIdentifier	 disable Coord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
