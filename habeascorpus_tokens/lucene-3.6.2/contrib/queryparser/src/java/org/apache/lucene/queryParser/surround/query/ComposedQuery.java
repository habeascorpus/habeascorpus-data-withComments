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
ArrayList	TokenNameIdentifier	 Array List
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
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ComposedQuery	TokenNameIdentifier	 Composed Query
extends	TokenNameextends	
SrndQuery	TokenNameIdentifier	 Srnd Query
{	TokenNameLBRACE	
public	TokenNamepublic	
ComposedQuery	TokenNameIdentifier	 Composed Query
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
qs	TokenNameIdentifier	 qs
,	TokenNameCOMMA	
boolean	TokenNameboolean	
operatorInfix	TokenNameIdentifier	 operator Infix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
opName	TokenNameIdentifier	 op Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recompose	TokenNameIdentifier	 recompose
(	TokenNameLPAREN	
qs	TokenNameIdentifier	 qs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
operatorInfix	TokenNameIdentifier	 operator Infix
=	TokenNameEQUAL	
operatorInfix	TokenNameIdentifier	 operator Infix
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
opName	TokenNameIdentifier	 op Name
=	TokenNameEQUAL	
opName	TokenNameIdentifier	 op Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
recompose	TokenNameIdentifier	 recompose
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
queries	TokenNameIdentifier	 queries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
"Too few subqueries"	TokenNameStringLiteral	Too few subqueries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
queries	TokenNameIdentifier	 queries
=	TokenNameEQUAL	
queries	TokenNameIdentifier	 queries
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
opName	TokenNameIdentifier	 op Name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOperatorName	TokenNameIdentifier	 get Operator Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
opName	TokenNameIdentifier	 op Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
queries	TokenNameIdentifier	 queries
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
getSubQueriesIterator	TokenNameIdentifier	 get Sub Queries Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNrSubQueries	TokenNameIdentifier	 get Nr Sub Queries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SrndQuery	TokenNameIdentifier	 Srnd Query
getSubQuery	TokenNameIdentifier	 get Sub Query
(	TokenNameLPAREN	
int	TokenNameint	
qn	TokenNameIdentifier	 qn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SrndQuery	TokenNameIdentifier	 Srnd Query
)	TokenNameRPAREN	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
qn	TokenNameIdentifier	 qn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
operatorInfix	TokenNameIdentifier	 operator Infix
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isOperatorInfix	TokenNameIdentifier	 is Operator Infix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
operatorInfix	TokenNameIdentifier	 operator Infix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* else prefix operator */	TokenNameCOMMENT_BLOCK	 else prefix operator 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
makeLuceneSubQueriesField	TokenNameIdentifier	 make Lucene Sub Queries Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
BasicQueryFactory	TokenNameIdentifier	 Basic Query Factory
qf	TokenNameIdentifier	 qf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
luceneSubQueries	TokenNameIdentifier	 lucene Sub Queries
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
luceneSubQueries	TokenNameIdentifier	 lucene Sub Queries
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SrndQuery	TokenNameIdentifier	 Srnd Query
)	TokenNameRPAREN	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
makeLuceneQueryField	TokenNameIdentifier	 make Lucene Query Field
(	TokenNameLPAREN	
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
qf	TokenNameIdentifier	 qf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
luceneSubQueries	TokenNameIdentifier	 lucene Sub Queries
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isOperatorInfix	TokenNameIdentifier	 is Operator Infix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
infixToString	TokenNameIdentifier	 infix To String
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prefixToString	TokenNameIdentifier	 prefix To String
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
weightToString	TokenNameIdentifier	 weight To String
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Override for different spacing */	TokenNameCOMMENT_BLOCK	 Override for different spacing 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getPrefixSeparator	TokenNameIdentifier	 get Prefix Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
", "	TokenNameStringLiteral	, 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getBracketOpen	TokenNameIdentifier	 get Bracket Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"("	TokenNameStringLiteral	(
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getBracketClose	TokenNameIdentifier	 get Bracket Close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
infixToString	TokenNameIdentifier	 infix To String
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* Brackets are possibly redundant in the result. */	TokenNameCOMMENT_BLOCK	 Brackets are possibly redundant in the result. 
Iterator	TokenNameIdentifier	 Iterator
sqi	TokenNameIdentifier	 sqi
=	TokenNameEQUAL	
getSubQueriesIterator	TokenNameIdentifier	 get Sub Queries Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getBracketOpen	TokenNameIdentifier	 get Bracket Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getOperatorName	TokenNameIdentifier	 get Operator Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* infix operator */	TokenNameCOMMENT_BLOCK	 infix operator 
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getBracketClose	TokenNameIdentifier	 get Bracket Close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
prefixToString	TokenNameIdentifier	 prefix To String
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
sqi	TokenNameIdentifier	 sqi
=	TokenNameEQUAL	
getSubQueriesIterator	TokenNameIdentifier	 get Sub Queries Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getOperatorName	TokenNameIdentifier	 get Operator Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* prefix operator */	TokenNameCOMMENT_BLOCK	 prefix operator 
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getBracketOpen	TokenNameIdentifier	 get Bracket Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getPrefixSeparator	TokenNameIdentifier	 get Prefix Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getBracketClose	TokenNameIdentifier	 get Bracket Close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isFieldsSubQueryAcceptable	TokenNameIdentifier	 is Fields Sub Query Acceptable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* at least one subquery should be acceptable */	TokenNameCOMMENT_BLOCK	 at least one subquery should be acceptable 
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
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SrndQuery	TokenNameIdentifier	 Srnd Query
)	TokenNameRPAREN	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isFieldsSubQueryAcceptable	TokenNameIdentifier	 is Fields Sub Query Acceptable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
