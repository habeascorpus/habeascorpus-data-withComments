package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
surround	TokenNameIdentifier	 surround
.	TokenNameDOT	
query	TokenNameIdentifier	 query
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
BooleanClause	TokenNameIdentifier	 Boolean Clause
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
OrQuery	TokenNameIdentifier	 Or Query
extends	TokenNameextends	
ComposedQuery	TokenNameIdentifier	 Composed Query
implements	TokenNameimplements	
DistanceSubQuery	TokenNameIdentifier	 Distance Sub Query
{	TokenNameLBRACE	
public	TokenNamepublic	
OrQuery	TokenNameIdentifier	 Or Query
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SrndQuery	TokenNameIdentifier	 Srnd Query
>	TokenNameGREATER	
queries	TokenNameIdentifier	 queries
,	TokenNameCOMMA	
boolean	TokenNameboolean	
infix	TokenNameIdentifier	 infix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
opName	TokenNameIdentifier	 op Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
queries	TokenNameIdentifier	 queries
,	TokenNameCOMMA	
infix	TokenNameIdentifier	 infix
,	TokenNameCOMMA	
opName	TokenNameIdentifier	 op Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
makeLuceneQueryFieldNoBoost	TokenNameIdentifier	 make Lucene Query Field No Boost
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
BasicQueryFactory	TokenNameIdentifier	 Basic Query Factory
qf	TokenNameIdentifier	 qf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SrndBooleanQuery	TokenNameIdentifier	 Srnd Boolean Query
.	TokenNameDOT	
makeBooleanQuery	TokenNameIdentifier	 make Boolean Query
(	TokenNameLPAREN	
/* subqueries can be individually boosted */	TokenNameCOMMENT_BLOCK	 subqueries can be individually boosted 
makeLuceneSubQueriesField	TokenNameIdentifier	 make Lucene Sub Queries Field
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
qf	TokenNameIdentifier	 qf
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
distanceSubQueryNotAllowed	TokenNameIdentifier	 distance Sub Query Not Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
sqi	TokenNameIdentifier	 sqi
=	TokenNameEQUAL	
getSubQueriesIterator	TokenNameIdentifier	 get Sub Queries Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SrndQuery	TokenNameIdentifier	 Srnd Query
leq	TokenNameIdentifier	 leq
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SrndQuery	TokenNameIdentifier	 Srnd Query
)	TokenNameRPAREN	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
leq	TokenNameIdentifier	 leq
instanceof	TokenNameinstanceof	
DistanceSubQuery	TokenNameIdentifier	 Distance Sub Query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DistanceSubQuery	TokenNameIdentifier	 Distance Sub Query
)	TokenNameRPAREN	
leq	TokenNameIdentifier	 leq
)	TokenNameRPAREN	
.	TokenNameDOT	
distanceSubQueryNotAllowed	TokenNameIdentifier	 distance Sub Query Not Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
"subquery not allowed: "	TokenNameStringLiteral	subquery not allowed: 
+	TokenNamePLUS	
leq	TokenNameIdentifier	 leq
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addSpanQueries	TokenNameIdentifier	 add Span Queries
(	TokenNameLPAREN	
SpanNearClauseFactory	TokenNameIdentifier	 Span Near Clause Factory
sncf	TokenNameIdentifier	 sncf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
sqi	TokenNameIdentifier	 sqi
=	TokenNameEQUAL	
getSubQueriesIterator	TokenNameIdentifier	 get Sub Queries Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DistanceSubQuery	TokenNameIdentifier	 Distance Sub Query
)	TokenNameRPAREN	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addSpanQueries	TokenNameIdentifier	 add Span Queries
(	TokenNameLPAREN	
sncf	TokenNameIdentifier	 sncf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
