package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PriorityQueue	TokenNameIdentifier	 Priority Queue
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
;	TokenNameSEMICOLON	
/** * Base rewrite method for collecting only the top terms * via a priority queue. * @lucene.internal Only public to be accessible by spans package. */	TokenNameCOMMENT_JAVADOC	 Base rewrite method for collecting only the top terms via a priority queue. @lucene.internal Only public to be accessible by spans package. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TopTermsRewrite	TokenNameIdentifier	 Top Terms Rewrite
<	TokenNameLESS	
Q	TokenNameIdentifier	 Q
extends	TokenNameextends	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
extends	TokenNameextends	
TermCollectingRewrite	TokenNameIdentifier	 Term Collecting Rewrite
<	TokenNameLESS	
Q	TokenNameIdentifier	 Q
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
/** * Create a TopTermsBooleanQueryRewrite for * at most <code>size</code> terms. * <p> * NOTE: if {@link BooleanQuery#getMaxClauseCount} is smaller than * <code>size</code>, then it will be used instead. */	TokenNameCOMMENT_JAVADOC	 Create a TopTermsBooleanQueryRewrite for at most <code>size</code> terms. <p> NOTE: if {@link BooleanQuery#getMaxClauseCount} is smaller than <code>size</code>, then it will be used instead. 
public	TokenNamepublic	
TopTermsRewrite	TokenNameIdentifier	 Top Terms Rewrite
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** return the maximum priority queue size */	TokenNameCOMMENT_JAVADOC	 return the maximum priority queue size 
public	TokenNamepublic	
int	TokenNameint	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** return the maximum size of the priority queue (for boolean rewrites this is BooleanQuery#getMaxClauseCount). */	TokenNameCOMMENT_JAVADOC	 return the maximum size of the priority queue (for boolean rewrites this is BooleanQuery#getMaxClauseCount). 
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
getMaxSize	TokenNameIdentifier	 get Max Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Q	TokenNameIdentifier	 Q
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
final	TokenNamefinal	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
getMaxSize	TokenNameIdentifier	 get Max Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
ScoreTerm	TokenNameIdentifier	 Score Term
>	TokenNameGREATER	
stQueue	TokenNameIdentifier	 st Queue
=	TokenNameEQUAL	
new	TokenNamenew	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
ScoreTerm	TokenNameIdentifier	 Score Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collectTerms	TokenNameIdentifier	 collect Terms
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
new	TokenNamenew	
TermCollector	TokenNameIdentifier	 Term Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore uncompetitive hits 	TokenNameCOMMENT_LINE	ignore uncompetitive hits 
if	TokenNameif	
(	TokenNameLPAREN	
stQueue	TokenNameIdentifier	 st Queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
maxSize	TokenNameIdentifier	 max Size
&&	TokenNameAND_AND	
boost	TokenNameIdentifier	 boost
<=	TokenNameLESS_EQUAL	
stQueue	TokenNameIdentifier	 st Queue
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// add new entry in PQ 	TokenNameCOMMENT_LINE	add new entry in PQ 
st	TokenNameIdentifier	 st
.	TokenNameDOT	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
=	TokenNameEQUAL	
boost	TokenNameIdentifier	 boost
;	TokenNameSEMICOLON	
stQueue	TokenNameIdentifier	 st Queue
.	TokenNameDOT	
offer	TokenNameIdentifier	 offer
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// possibly drop entries from queue 	TokenNameCOMMENT_LINE	possibly drop entries from queue 
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
(	TokenNameLPAREN	
stQueue	TokenNameIdentifier	 st Queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
?	TokenNameQUESTION	
stQueue	TokenNameIdentifier	 st Queue
.	TokenNameDOT	
poll	TokenNameIdentifier	 poll
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
ScoreTerm	TokenNameIdentifier	 Score Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reusable instance 	TokenNameCOMMENT_LINE	reusable instance 
private	TokenNameprivate	
ScoreTerm	TokenNameIdentifier	 Score Term
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
ScoreTerm	TokenNameIdentifier	 Score Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Q	TokenNameIdentifier	 Q
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
getTopLevelQuery	TokenNameIdentifier	 get Top Level Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
ScoreTerm	TokenNameIdentifier	 Score Term
st	TokenNameIdentifier	 st
:	TokenNameCOLON	
stQueue	TokenNameIdentifier	 st Queue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addClause	TokenNameIdentifier	 add Clause
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add to query 	TokenNameCOMMENT_LINE	add to query 
}	TokenNameRBRACE	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
incTotalNumberOfTerms	TokenNameIdentifier	 inc Total Number Of Terms
(	TokenNameLPAREN	
stQueue	TokenNameIdentifier	 st Queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
,	TokenNameCOMMA	
"rawtypes"	TokenNameStringLiteral	rawtypes
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TopTermsRewrite	TokenNameIdentifier	 Top Terms Rewrite
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TopTermsRewrite	TokenNameIdentifier	 Top Terms Rewrite
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ScoreTerm	TokenNameIdentifier	 Score Term
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
ScoreTerm	TokenNameIdentifier	 Score Term
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
public	TokenNamepublic	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
ScoreTerm	TokenNameIdentifier	 Score Term
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
return	TokenNamereturn	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
